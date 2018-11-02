package com.cmbchina.dao.po.momo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShareCouponRecordPO implements Serializable {
    /**
     *
     */
    private Integer id;

    /**
     *
     */
    private String userId;

    /**
     *订单号
     */
    private Integer orderNo;

    /**
     *活动id
     */
    private Integer activityId;

    /**
     *优惠券id
     */
    private String couponId;

    /**
     *首次分享时间
     */
    private Date createTime;

    private static final long serialVersionUID = -1630597980381859040L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}