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
    private String id;

    /**
     *关联活动id
     */
    private String activityId;

    /**
     *
     */
    private String couponId;

    /**
     *饭票1 还是影票2 还是电商3
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

    private static final long serialVersionUID = -4450970615000078774L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId == null ? null : activityId.trim();
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