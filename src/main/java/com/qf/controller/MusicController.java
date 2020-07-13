package com.qf.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.pojo.Music;
import com.qf.service.MusicService;
import io.swagger.annotations.*;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("music")
@Api("音乐控制层")
public class MusicController {
    @Autowired
    MusicService musicService;

    @RequestMapping("findAll")
    @ApiOperation("获得所有音乐的方法")
    public List<Music> findAll(){
        System.out.println("controller");
        //return musicService.findAll();
        return musicService.findAll();
    }
    @ApiOperation("通过id查找音乐")
    @RequestMapping("findById")
    @ApiImplicitParam(value = "音乐id" ,name = "musicId")
    public Music findById(String musicId){
        return musicService.findById(musicId);
    }

    @RequestMapping("search")
    @ApiOperation("通过音乐名模糊查询")
    public List<Music> search(String keyword){
        System.out.println(keyword);
        return musicService.search(keyword);
    }

    @RequestMapping("prevSong")
    @ApiOperation("上一首")
    @ApiImplicitParams({@ApiImplicitParam(name = "musicId",value = "音乐id"),@ApiImplicitParam(name = "aa",value = "随便",required = false)})
    public Music prevSong(String musicId, Integer aa){
        return musicService.prevSong(musicId);
    }
    @RequestMapping("nextSong")
    @ApiOperation("下一首")
    public Music nextSong(String musicId){
        return musicService.nextSong(musicId);
    }



    @RequestMapping("findByPage")
    public PageInfo findByPage(
         @ApiParam("页码") @RequestParam(value = "pageNum",required = false,defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize",required = false,defaultValue = "2") Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Music> list = musicService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }



}
