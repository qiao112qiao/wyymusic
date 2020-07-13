package com.qf.dao;

import com.qf.pojo.Music;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MusicMapper {
    //查询所有的音乐

    List<Music> findAll();
    //根据id查询音乐
    Music findById(String id);
    //根据名称模糊查询音乐
    List<Music> search(String keyword);
}
