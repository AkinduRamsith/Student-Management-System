package edu.icet.service;

import edu.icet.dto.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service

public class StudentServiceImpl implements StudentService{
    @Override
    public ArrayList<Student> getStudent(String name) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("S001", "Akindu", 21, "Panadura", "5"));
//        list.add(new Student("S002", "Chamudi", 20, "Colombo", "6"));
//        list.add(new Student("S003", "Sharada", 22, "Kalutara", "7"));
//        list.add(new Student("S004", "Thamali", 20, "Gampha", "8"));
//        list.add(new Student("S005", "Sethum", 20, "Galle", "5"));
        return list;

    }
}
