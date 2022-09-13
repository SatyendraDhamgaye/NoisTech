/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noistech.beans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.google.api.client.util.DateTime;
import java.math.BigInteger;

/**
 *
 * @author Adrenaline Morphine
 */
public class VideoBeans {

    private int id;
    private String videoId;
    private String title;
    private String description;
    private String link;
    private String duration;
    private String status;
    private String datePublished;
    private String tags;
    private String thumbnail90;
    private String thumbnail180;
    private String thumbnail360;
    private String thumbnail480;
    private String thumbnail720;
    private BigInteger views;
    private BigInteger likes;
    private BigInteger dislikes;
    private BigInteger comments;
    private String article;

    public VideoBeans(
            String videoId,
            String title,
            String description,
            String datePublished,
            String tags,
            String thumbnail90,
            String thumbnail180,
            String thumbnail360,
            String thumbnail480,
            String thumbnail720,
            String duration,
            BigInteger views,
            BigInteger likes,
            BigInteger dislikes,
            BigInteger comments) {
        this.videoId = videoId;
        this.title = title;
        this.description = description;
        this.datePublished = datePublished;
        this.tags = tags;
        this.thumbnail90 = thumbnail90;
        this.thumbnail180 = thumbnail180;
        this.thumbnail360 = thumbnail360;
        this.thumbnail480 = thumbnail480;
        this.thumbnail720 = thumbnail720;
        this.duration = duration;
        this.views = views;
        this.likes = likes;
        this.dislikes = dislikes;
        this.comments = comments;
    }

    public VideoBeans(String id, String title, String description, DateTime publishedAt, String toString, String url, String url0, String url1, String url2, String url3, String duration, BigInteger viewCount, BigInteger likeCount, BigInteger dislikeCount, BigInteger commentCount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getThumbnail90() {
        return thumbnail90;
    }

    public void setThumbnail90(String thumbnail90) {
        this.thumbnail90 = thumbnail90;
    }

    public String getThumbnail180() {
        return thumbnail180;
    }

    public void setThumbnail180(String thumbnail180) {
        this.thumbnail180 = thumbnail180;
    }

    public String getThumbnail360() {
        return thumbnail360;
    }

    public void setThumbnail360(String thumbnail360) {
        this.thumbnail360 = thumbnail360;
    }

    public String getThumbnail480() {
        return thumbnail480;
    }

    public void setThumbnail480(String thumbnail480) {
        this.thumbnail480 = thumbnail480;
    }

    public String getThumbnail720() {
        return thumbnail720;
    }

    public void setThumbnail720(String thumbnail720) {
        this.thumbnail720 = thumbnail720;
    }

    public BigInteger getViews() {
        return views;
    }

    public void setViews(BigInteger views) {
        this.views = views;
    }

    public BigInteger getLikes() {
        return likes;
    }

    public void setLikes(BigInteger likes) {
        this.likes = likes;
    }

    public BigInteger getDislikes() {
        return dislikes;
    }

    public void setDislikes(BigInteger dislikes) {
        this.dislikes = dislikes;
    }

    public BigInteger getComments() {
        return comments;
    }

    public void setComments(BigInteger comments) {
        this.comments = comments;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public VideoBeans() {
    }

    public String getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

}
