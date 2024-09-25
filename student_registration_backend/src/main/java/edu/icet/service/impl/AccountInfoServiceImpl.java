package edu.icet.service.impl;

import edu.icet.dto.AccontInfo;
import edu.icet.repository.AccountInfoRepository;
import edu.icet.service.AccountInfoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class AccountInfoServiceImpl implements AccountInfoService {

    @Autowired
    AccountInfoRepository repository;

    ModelMapper modelMapper;

    @Bean
    public void accountSetup(){
        this.modelMapper = new ModelMapper();
    }
    @Override
    public void addAccInfo(AccontInfo accontInfo) {
        AccontInfo entity = modelMapper.map(accontInfo, AccontInfo.class);
        repository.save(entity);
    }


}
