package day10.coll;

import java.util.Comparator;

/**
 * 重写hashCode()和equals(Object o方法
 */
public class Person2 implements Comparator<Person2> {
    private int id;
    private String name;
    private String phone;

    public Person2(int id, String name, String phone) {
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

        Person2 person = (Person2) o;

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
    public int compare(Person2 o1, Person2 o2) {
        return o1.getId()-o2.getId();
    }

}
