package com.qf.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("音乐实体类")
public class Music {
    @ApiModelProperty("音乐编号")
    private Integer id;
    private String musicId;
    @ApiModelProperty("音乐名称")
    private String musicName;
    @ApiModelProperty("歌手名")
    private String musicAlbumName;
    @ApiModelProperty("音乐专辑图片路径 ")
    private String musicAlbumPicurl;
    @ApiModelProperty("音乐路径")
    private String musicMp3url;
    @ApiModelProperty("专辑名称")
    private String musicArtistName;
    @ApiModelProperty("所属类别")
    private String sheetId;

    public String getMusicId() {
        return musicId;
    }

    public void setMusicId(String musicId) {
        this.musicId = musicId;
    }
}
