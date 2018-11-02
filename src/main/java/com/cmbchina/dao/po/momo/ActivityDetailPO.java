package com.cmbchina.dao.po.momo;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActivityDetailPO implements Serializable {
    /**
     *
     */
    private Integer id;

    /**
     *活动名称
     */
    private String activityName;

    /**
     *活动周期
     */
    private Integer duration;

    /**
     *周期内最大领取次数
     */
    private Integer maxReceiveCount;

    /**
     *最大红包id
     */
    private Integer maxCouponId;

    /**
     *最大红包类型
     */
    private String maxCouponType;

    /**
     *广告位名称
     */
    private String adventureName;

    /**
     *广告图片链接
     */
    private String adventurePicUrl;

    /**
     *跳转链接
     */
    private String adventureLink;

    /**
     *
     */
    private Date createTime;

    /**
     *
     */
    private Date updateTime;

    /**
     *活动规则
     */
    private String activityRule;

    private static final long serialVersionUID = 6197662311493036737L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName == null ? null : activityName.trim();
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getMaxReceiveCount() {
        return maxReceiveCount;
    }

    public void setMaxReceiveCount(Integer maxReceiveCount) {
        this.maxReceiveCount = maxReceiveCount;
    }

    public Integer getMaxCouponId() {
        return maxCouponId;
    }

    public void setMaxCouponId(Integer maxCouponId) {
        this.maxCouponId = maxCouponId;
    }

    public String getMaxCouponType() {
        return maxCouponType;
    }

    public void setMaxCouponType(String maxCouponType) {
        this.maxCouponType = maxCouponType == null ? null : maxCouponType.trim();
    }

    public String getAdventureName() {
        return adventureName;
    }

    public void setAdventureName(String adventureName) {
        this.adventureName = adventureName == null ? null : adventureName.trim();
    }

    public String getAdventurePicUrl() {
        return adventurePicUrl;
    }

    public void setAdventurePicUrl(String adventurePicUrl) {
        this.adventurePicUrl = adventurePicUrl == null ? null : adventurePicUrl.trim();
    }

    public String getAdventureLink() {
        return adventureLink;
    }

    public void setAdventureLink(String adventureLink) {
        this.adventureLink = adventureLink == null ? null : adventureLink.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getActivityRule() {
        return activityRule;
    }

    public void setActivityRule(String activityRule) {
        this.activityRule = activityRule == null ? null : activityRule.trim();
    }
}