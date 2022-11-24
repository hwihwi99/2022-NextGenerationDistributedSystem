package com.example.homework.service;

import com.example.homework.model.DataDto;
import com.example.homework.model.DataInfo;

import java.util.List;

public interface DataService {
    DataInfo saveData(DataDto dataDto);
    List<DataInfo> getDataList();
}
