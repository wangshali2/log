package day10.coll;

/**
 * 重写hashCode()和equals(Object o方法
 */
public class Person implements Comparable<Person> {
    private int id;
    private String name;
    private String phone;

    public Person(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return phone != null ? phone.equals(person.phone) : person.phone == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Person o) {
        //比较差值，相等表明是同一元素，直接覆盖。二叉树比较原则
        //1.按照姓名长度排序return this.getAge()-o.getAge();
        int result = this.getName().length() - o.getName().length();
        //2.只输出一个元素return 0;
        //3.如果姓名长度一样，再按照id排序
        if (result == 0) {
            return this.getId() - o.getId();
        }
        return result;
    }
}
