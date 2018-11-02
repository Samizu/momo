package com.cmbchina.dao.po.momo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReceiveCouponRecordPO implements Serializable {
    /**
     *
     */
    private Integer id;

    /**
     *用戶id
     */
    private String userId;

    /**
     *
     */
    private Integer activityId;

    /**
     *
     */
    private Integer sharedUserId;

    /**
     *優惠券id
     */
    private String couponId;

    /**
     *領取時間
     */
    private Date createTime;

    /**
     *是否新户，0-老户；1-新户
     */
    private Integer isNewUser;

    /**
     *是否使用：0-未使用；1-已使用
     */
    private Integer isUsed;

    /**
     *手机号
     */
    private String phone;

    private static final long serialVersionUID = -1471800616227493172L;

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

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getSharedUserId() {
        return sharedUserId;
    }

    public void setSharedUserId(Integer sharedUserId) {
        this.sharedUserId = sharedUserId;
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

    public Integer getIsNewUser() {
        return isNewUser;
    }

    public void setIsNewUser(Integer isNewUser) {
        this.isNewUser = isNewUser;
    }

    public Integer getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(Integer isUsed) {
        this.isUsed = isUsed;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }
}