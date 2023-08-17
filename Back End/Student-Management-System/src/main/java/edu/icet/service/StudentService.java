package edu.icet.service;

import edu.icet.dto.Student;

import java.util.ArrayList;
import java.util.List;

public interface StudentService {
    public ArrayList<Student> getStudent(String name);
}
