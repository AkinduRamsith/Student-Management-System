package edu.icet.service;

import edu.icet.dto.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j

public class StudentServiceImpl implements StudentService{
    ArrayList<Student> listStudent=new ArrayList<>();
    @Override
    public ArrayList<Student> getStudent(String name) {
        listStudent.add(new Student("S001", "Akindu", 21, "Panadura", "5"));
        listStudent.add(new Student("S002", "Havindu", 20, "Colombo", "6"));
        listStudent.add(new Student("S003", "Sharada", 22, "Kalutara", "7"));
        listStudent.add(new Student("S004", "Chamudi", 20, "Panadura", "7"));
        listStudent.add(new Student("S005", "Thamali", 20, "Gampha", "8"));
        listStudent.add(new Student("S006", "Sethum", 20, "Galle", "5"));
        ArrayList<Student> list = new ArrayList<>();
//        list.add(new Student("S001", "Akindu", 21, "Panadura", "5"));
//        list.add(new Student("S002", "Chamudi", 20, "Colombo", "6"));
//        list.add(new Student("S003", "Sharada", 22, "Kalutara", "7"));
//        list.add(new Student("S004", "Thamali", 20, "Gampha", "8"));
//        list.add(new Student("S005", "Sethum", 20, "Galle", "5"));
        for (Student student:listStudent) {

            if(student.getName().equals(name)) {
                list.add(student);
                log.debug(String.valueOf(student));
            }
        }
        return list;

    }

    public void addStudent(){
        listStudent.add(new Student("S001", "Akindu", 21, "Panadura", "5"));

    }
}
