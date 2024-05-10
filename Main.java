import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args, Teacher teachers) {
        @SuppressWarnings("unused")
        Teacher teacher = new Teacher("1");
        List<Student> students = new ArrayList<>();
        students.add(new Student("2"));
        students.add(new Student("3"));
        students.add(new Student("4"));
        students.add(new Student("5"));

        Controller controller = new Controller();
        StudyGroup studyGroup = controller.createStudyGroup(teachers, students);
        ConclusionStudyGroup conclusionStudyGroup = new ConclusionStudyGroup();
        conclusionStudyGroup.сonclusion(studyGroup);
    }
}
