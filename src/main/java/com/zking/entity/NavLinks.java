package com.zking.entity;

public class NavLinks {
    private Integer linkId;

    private String linkName;

    private String linkUrl;

    private String linkSort;

    private String linkStyle;

    private String linkTarget;

    public Integer getLinkId() {
        return linkId;
    }

    public void setLinkId(Integer linkId) {
        this.linkId = linkId;
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName == null ? null : linkName.trim();
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl == null ? null : linkUrl.trim();
    }

    public String getLinkSort() {
        return linkSort;
    }

    public void setLinkSort(String linkSort) {
        this.linkSort = linkSort == null ? null : linkSort.trim();
    }

    public String getLinkStyle() {
        return linkStyle;
    }

    public void setLinkStyle(String linkStyle) {
        this.linkStyle = linkStyle == null ? null : linkStyle.trim();
    }

    public String getLinkTarget() {
        return linkTarget;
    }

    public void setLinkTarget(String linkTarget) {
        this.linkTarget = linkTarget == null ? null : linkTarget.trim();
    }

    @Override
    public String toString() {
        return "NavLinks{" +
                "linkId=" + linkId +
                ", linkName='" + linkName + '\'' +
                ", linkUrl='" + linkUrl + '\'' +
                ", linkSort='" + linkSort + '\'' +
                ", linkStyle='" + linkStyle + '\'' +
                ", linkTarget='" + linkTarget + '\'' +
                '}';
    }
}