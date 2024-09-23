package edu.icet.service;

import edu.icet.dto.StudentInfo;

import java.util.List;

public interface StudentInfoService {
    void addInfo(StudentInfo studentinfo);

    List<StudentInfo> findByName(String name);

    List<StudentInfo> getStudentInfo();

    void deleteInfoById(Integer id);

    void updateInfo(StudentInfo studentInfo);
}
