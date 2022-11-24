package com.example.homework.service;

import com.example.homework.model.DataDto;
import com.example.homework.model.DataInfo;
import com.example.homework.repository.DataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DataServiceImpl implements DataService{

    private final DataRepository dataRepository;

    @Override
    public DataInfo saveData(DataDto dataDto) {
        System.out.println("Save Data");
        DataInfo dataInfo = DataInfo.builder()
                .writer(dataDto.getWriter())
                .title(dataDto.getTitle())
                .content(dataDto.getContent())
                .build();

        DataInfo newData = dataRepository.save(dataInfo);
        return newData;
    }

    @Override
    public List<DataInfo> getDataList() {
        List<DataInfo> dataList = dataRepository.findAll();

        if(dataList.isEmpty()) {
            return null;
        }else{
            return dataList;
        }
    }

}
