package com.qf.service.impl;

import com.qf.dao.MusicMapper;
import com.qf.pojo.Music;
import com.qf.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImpl implements MusicService {
    @Autowired
    //TbMusicMapper musicDao
    MusicMapper musicDao;

    @Override
    public List<Music> findAll() {
        return musicDao.findAll();
    }



    @Override
    public Music findById(String musicId) {
        return musicDao.findById(musicId);
    }

    @Override
    public List<Music> search(String keyword) {
        System.out.println("service");
        return musicDao.search(keyword);
    }

    @Override
    public Music prevSong(String musicId) {
        //获取数据库中所有的音乐
        int currIndex = 0;
        List<Music> musics = musicDao.findAll();
        //匹配当前歌曲
        for (int i = 0; i < musics.size(); i++){
            Music music = musics.get(i);
            if (music.getMusicId().equals(musicId)){
                currIndex = i;
                break;
            }
        }
        int preIndex = currIndex == 0 ? musics.size()-1 : currIndex-1;
        return musics.get(preIndex);
    }

    @Override
    public Music nextSong(String musicId) {
        //获取数据库中所有的音乐
        int currIndex = 0;

        List<Music> musics = musicDao.findAll();
        //匹配当前歌曲
        for (int i = 0; i < musics.size(); i++){
            Music music = musics.get(i);
            if (music.getMusicId().equals(musicId)){
                currIndex = i;
                break;
            }
        }
        int nextIndex = currIndex == musics.size()-1 ? 0 : currIndex+1;
        return musics.get(nextIndex);
    }
    //@Override
    //public List<TbMusic> findAll() {
    //    System.out.println("service");
    //
    //    return musicDao.selectByExample(null);
    //}
    //
    //@Override
    //public TbMusic finById(String id) {
    //    System.out.println("service");
    //
    //    return musicDao.selectByPrimaryKey(id);
    //}


}
