package edu.icet.repository;

import edu.icet.dto.StudentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentInfoRepository extends JpaRepository<StudentInfo,Integer> {
    List<StudentInfo> findByName(String name);
}
