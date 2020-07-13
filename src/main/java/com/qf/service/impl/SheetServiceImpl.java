package com.qf.service.impl;


import com.qf.dao.SheetMapper;
import com.qf.pojo.Sheet;
import com.qf.service.SheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SheetServiceImpl implements SheetService {
    @Autowired
    SheetMapper sheetMapper;
    @Override
    public List<Sheet> findAll() {
        return sheetMapper.findAll();
    }

    @Override
    public void insertSheet(String sheetName) {
        sheetMapper.insertSheet(sheetName);
    }


}
