package edu.icet.repository;

import edu.icet.dto.StudentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentInfoRepository extends JpaRepository<StudentInfo,Integer> {
}
