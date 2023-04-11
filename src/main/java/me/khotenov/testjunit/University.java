package me.khotenov.testjunit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class University {

    private Map<Integer, Student> allStudent = new HashMap<Integer, Student>();
    private int countId = 1;

    public void addStudent(Student student) {
        if (allStudent == null) {
            allStudent = new HashMap<Integer, Student>();
        }
        student.setId(countId);
        allStudent.put(countId, student);
        countId++;
    }

    public List<Student> getAllStudents() {
        return new ArrayList<Student>(allStudent.values());
    }

    public List<Student> getAllStudents(boolean isMale) {
        List<Student> listAllStudent = new ArrayList<Student>();
        for (Student student : allStudent.values()) {
            if (student.isMale() == isMale) {
                listAllStudent.add(student);
            }
        }
        return listAllStudent;
    }

}
