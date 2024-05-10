//УчебнаяГруппа содержащая в себе поля Преподаватель и список Студентов.

import java.util.List;

public class StudyGroup {  /** Коллекции позволяют создавать что-то типа массива данных но для более широкого масштаба используя встроенные в JAVA интерфейсы */

    private List<Student> students;
    private Teacher teacher;

    public StudyGroup (Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}



































