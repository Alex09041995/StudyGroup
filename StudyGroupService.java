// класс УчебнаяГруппаСервис, в котором реализована функция(входные параметры - (Teacher, List<Student>)) формирования из Студентов и Преподавателя УчебнойГруппы и возвращения его.

import java.util.List;

public class StudyGroupService {  
    
    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        StudyGroup studyGroup = new StudyGroup(teacher, students);
        return studyGroup;
    }              
}



































