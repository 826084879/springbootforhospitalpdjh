package com.hospital.theforth.bean;

public class PostMsg {
    private int postId;
    private String postName;
    private String postIntroduce;

    @Override
    public String toString() {
        return "PostMsg{" +
                "postId=" + postId +
                ", postName='" + postName + '\'' +
                ", postIntroduce='" + postIntroduce + '\'' +
                '}';
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getPostIntroduce() {
        return postIntroduce;
    }

    public void setPostIntroduce(String postIntroduce) {
        this.postIntroduce = postIntroduce;
    }
}
