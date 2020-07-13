package com.qf.dao;

import com.qf.pojo.Sheet;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SheetMapper {
    List<Sheet> findAll();
    void insertSheet(String sheetName);
}
