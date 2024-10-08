package edu.icet.service.impl;

import edu.icet.dto.StudentInfo;
import edu.icet.repository.StudentInfoRepository;
import edu.icet.service.StudentInfoService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentInfoServiceImpl implements StudentInfoService {

    @Autowired
     StudentInfoRepository repository;

    ModelMapper mapper;

    @Bean
    public void studentSetup(){
        this.mapper = new ModelMapper();
    }
    @Override
    public void addInfo(StudentInfo studentinfo) {
        StudentInfo entity = mapper.map(studentinfo, StudentInfo.class);
        repository.save(studentinfo);
    }

    @Override
    public List<StudentInfo> findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public List<StudentInfo> getStudentInfo() {
        List<StudentInfo>all = repository.findAll();
        return all;
    }

    @Override
    public void deleteInfoById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void updateInfo(StudentInfo studentInfo) {
        repository.save(studentInfo);
    }
}
