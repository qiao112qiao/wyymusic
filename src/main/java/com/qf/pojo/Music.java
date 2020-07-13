package com.qf.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

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

    public Integer getId() {
        return this.id;
    }

    public String getMusicName() {
        return this.musicName;
    }

    public String getMusicAlbumName() {
        return this.musicAlbumName;
    }

    public String getMusicAlbumPicurl() {
        return this.musicAlbumPicurl;
    }

    public String getMusicMp3url() {
        return this.musicMp3url;
    }

    public String getMusicArtistName() {
        return this.musicArtistName;
    }

    public String getSheetId() {
        return this.sheetId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public void setMusicAlbumName(String musicAlbumName) {
        this.musicAlbumName = musicAlbumName;
    }

    public void setMusicAlbumPicurl(String musicAlbumPicurl) {
        this.musicAlbumPicurl = musicAlbumPicurl;
    }

    public void setMusicMp3url(String musicMp3url) {
        this.musicMp3url = musicMp3url;
    }

    public void setMusicArtistName(String musicArtistName) {
        this.musicArtistName = musicArtistName;
    }

    public void setSheetId(String sheetId) {
        this.sheetId = sheetId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Music)) return false;
        final Music other = (Music) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$musicId = this.getMusicId();
        final Object other$musicId = other.getMusicId();
        if (this$musicId == null ? other$musicId != null : !this$musicId.equals(other$musicId)) return false;
        final Object this$musicName = this.getMusicName();
        final Object other$musicName = other.getMusicName();
        if (this$musicName == null ? other$musicName != null : !this$musicName.equals(other$musicName)) return false;
        final Object this$musicAlbumName = this.getMusicAlbumName();
        final Object other$musicAlbumName = other.getMusicAlbumName();
        if (this$musicAlbumName == null ? other$musicAlbumName != null : !this$musicAlbumName.equals(other$musicAlbumName))
            return false;
        final Object this$musicAlbumPicurl = this.getMusicAlbumPicurl();
        final Object other$musicAlbumPicurl = other.getMusicAlbumPicurl();
        if (this$musicAlbumPicurl == null ? other$musicAlbumPicurl != null : !this$musicAlbumPicurl.equals(other$musicAlbumPicurl))
            return false;
        final Object this$musicMp3url = this.getMusicMp3url();
        final Object other$musicMp3url = other.getMusicMp3url();
        if (this$musicMp3url == null ? other$musicMp3url != null : !this$musicMp3url.equals(other$musicMp3url))
            return false;
        final Object this$musicArtistName = this.getMusicArtistName();
        final Object other$musicArtistName = other.getMusicArtistName();
        if (this$musicArtistName == null ? other$musicArtistName != null : !this$musicArtistName.equals(other$musicArtistName))
            return false;
        final Object this$sheetId = this.getSheetId();
        final Object other$sheetId = other.getSheetId();
        if (this$sheetId == null ? other$sheetId != null : !this$sheetId.equals(other$sheetId)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Music;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $musicId = this.getMusicId();
        result = result * PRIME + ($musicId == null ? 43 : $musicId.hashCode());
        final Object $musicName = this.getMusicName();
        result = result * PRIME + ($musicName == null ? 43 : $musicName.hashCode());
        final Object $musicAlbumName = this.getMusicAlbumName();
        result = result * PRIME + ($musicAlbumName == null ? 43 : $musicAlbumName.hashCode());
        final Object $musicAlbumPicurl = this.getMusicAlbumPicurl();
        result = result * PRIME + ($musicAlbumPicurl == null ? 43 : $musicAlbumPicurl.hashCode());
        final Object $musicMp3url = this.getMusicMp3url();
        result = result * PRIME + ($musicMp3url == null ? 43 : $musicMp3url.hashCode());
        final Object $musicArtistName = this.getMusicArtistName();
        result = result * PRIME + ($musicArtistName == null ? 43 : $musicArtistName.hashCode());
        final Object $sheetId = this.getSheetId();
        result = result * PRIME + ($sheetId == null ? 43 : $sheetId.hashCode());
        return result;
    }

    public String toString() {
        return "Music(id=" + this.getId() + ", musicId=" + this.getMusicId() + ", musicName=" + this.getMusicName() + ", musicAlbumName=" + this.getMusicAlbumName() + ", musicAlbumPicurl=" + this.getMusicAlbumPicurl() + ", musicMp3url=" + this.getMusicMp3url() + ", musicArtistName=" + this.getMusicArtistName() + ", sheetId=" + this.getSheetId() + ")";
    }
}
