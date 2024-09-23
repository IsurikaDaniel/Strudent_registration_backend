package edu.icet.controller;

import edu.icet.dto.StudentInfo;
import edu.icet.service.StudentInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/StudentInfo")
public class StudentInfoController {

    @Autowired
    private StudentInfoService service;

    @GetMapping("/get")
    public List<StudentInfo> getStudentInfo(){
        return service.getStudentInfo();
    }

    @PostMapping("/add")
    public void addInfo(@RequestBody StudentInfo studentInfo){
        service.addInfo(studentInfo);
    }

    @DeleteMapping("/{id}")
    public void deleteInfoById(@PathVariable Integer id){
        service.deleteInfoById(id);
    }

    @PutMapping
    public  void updateInfo(@RequestBody StudentInfo studentinfo){
        service.updateInfo(studentinfo);
    }

    @GetMapping("/{name}")
    public List<StudentInfo> findByName(@PathVariable("name") String name) {
        return service.findByName(name);
    }

}
