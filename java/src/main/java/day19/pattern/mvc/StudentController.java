package day19.pattern.mvc;

/**
 * @Author wsl
 * @Description 控制器作用于模型和视图上。它控制数据流向模型对象（setStudentName），并在数据变化时更新视图（updateView）。
 */
public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentRollNo(String rollNo) {
        model.setRollNo(rollNo);
    }

    public String getStudentRollNo() {
        return model.getRollNo();
    }

    //填充数据
    public void setStudentName(String name) {
        model.setName(name);
    }

    //更新数据
    public void updateView() {
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}
