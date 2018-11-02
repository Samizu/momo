package com.cmbchina.dao.po.momo;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActivityCouponDetailPO implements Serializable {
    /**
     *
     */
    private Integer id;

    /**
     *关联活动id
     */
    private Integer activityId;

    /**
     *
     */
    private String couponId;

    /**
     *饭票还是影票还是电商
     */
    private String couponType;

    /**
     *是否最大红包：是/否
     */
    private String isMax;

    /**
     *
     */
    private Date createTime;

    private static final long serialVersionUID = -7572714021474534339L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId == null ? null : couponId.trim();
    }

    public String getCouponType() {
        return couponType;
    }

    public void setCouponType(String couponType) {
        this.couponType = couponType == null ? null : couponType.trim();
    }

    public String getIsMax() {
        return isMax;
    }

    public void setIsMax(String isMax) {
        this.isMax = isMax == null ? null : isMax.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}