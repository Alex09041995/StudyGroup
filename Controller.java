// Создать метод в Контроллере, в котором агрегируются функции получения списка студентов (их id) и преподавателя (его id) и формирования учебной группы, путем вызова метода из сервиса.

import java.util.List;

public class Controller {
    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
    StudyGroupService studyGroupService = new StudyGroupService();
    StudyGroup studyGroup = studyGroupService.createStudyGroup(teacher, students);
    return studyGroup;
    }
}

































