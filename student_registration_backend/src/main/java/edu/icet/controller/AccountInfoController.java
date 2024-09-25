package edu.icet.controller;

import edu.icet.dto.AccontInfo;
import edu.icet.service.AccountInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/AccountInfo")
public class AccountInfoController {

    @Autowired
    AccountInfoService service;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addInfo(@RequestBody AccontInfo accontInfo){
        service.addAccInfo(accontInfo);
    }
}
