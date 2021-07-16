package com.zking.entity;

public class NavCont {
    private Integer moeCid;

    private String moeName;

    private String moeUrl;

    private String moeSort;

    private String moeImage;

    private String moeDescription;

    private String moeUser;

    private String moeOrder;

    public Integer getMoeCid() {
        return moeCid;
    }

    public void setMoeCid(Integer moeCid) {
        this.moeCid = moeCid;
    }

    public String getMoeName() {
        return moeName;
    }

    public void setMoeName(String moeName) {
        this.moeName = moeName == null ? null : moeName.trim();
    }

    public String getMoeUrl() {
        return moeUrl;
    }

    public void setMoeUrl(String moeUrl) {
        this.moeUrl = moeUrl == null ? null : moeUrl.trim();
    }

    public String getMoeSort() {
        return moeSort;
    }

    public void setMoeSort(String moeSort) {
        this.moeSort = moeSort == null ? null : moeSort.trim();
    }

    public String getMoeImage() {
        return moeImage;
    }

    public void setMoeImage(String moeImage) {
        this.moeImage = moeImage == null ? null : moeImage.trim();
    }

    public String getMoeDescription() {
        return moeDescription;
    }

    public void setMoeDescription(String moeDescription) {
        this.moeDescription = moeDescription == null ? null : moeDescription.trim();
    }

    public String getMoeUser() {
        return moeUser;
    }

    public void setMoeUser(String moeUser) {
        this.moeUser = moeUser == null ? null : moeUser.trim();
    }

    public String getMoeOrder() {
        return moeOrder;
    }

    public void setMoeOrder(String moeOrder) {
        this.moeOrder = moeOrder == null ? null : moeOrder.trim();
    }

    @Override
    public String toString() {
        return "NavCont{" +
                "moeCid=" + moeCid +
                ", moeName='" + moeName + '\'' +
                ", moeUrl='" + moeUrl + '\'' +
                ", moeSort='" + moeSort + '\'' +
                ", moeImage='" + moeImage + '\'' +
                ", moeDescription='" + moeDescription + '\'' +
                ", moeUser='" + moeUser + '\'' +
                ", moeOrder='" + moeOrder + '\'' +
                '}';
    }
}