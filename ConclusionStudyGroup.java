public class ConclusionStudyGroup {
    public void сonclusion(StudyGroup studyGroup) {
        System.out.println("Преподаватель: " + studyGroup.getTeacher().getId());
        System.out.println("Студенты:");
            for (Student student : studyGroup.getStudents()) {
            System.out.println(student.getId());
            }
    }
}
