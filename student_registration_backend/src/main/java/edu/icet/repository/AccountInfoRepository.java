package edu.icet.repository;

import edu.icet.dto.AccontInfo;
import edu.icet.dto.StudentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountInfoRepository extends JpaRepository<AccontInfo,Integer> {
}
