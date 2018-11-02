package com.cmbchina.service.impl;

import com.cmbchina.dao.mapper.gen.momo.ActivityCouponDetailPOMapper;
import com.cmbchina.dao.mapper.gen.momo.ActivityDetailPOMapper;
import com.cmbchina.dao.po.momo.ActivityCouponDetailPO;
import com.cmbchina.dao.po.momo.ActivityDetailPO;
import com.cmbchina.service.HelloService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by sanshui on 2018/11/2.
 */
@Service
public class HelloServiceImpl implements HelloService{

    @Resource
    private ActivityCouponDetailPOMapper activityCouponDetailPOMapper;

    @Resource
    private ActivityDetailPOMapper activityDetailPOMapper;

    @Override
    public String say(String str) {
        ActivityCouponDetailPO po = activityCouponDetailPOMapper.selectByPrimaryKey("111");
        po = new ActivityCouponDetailPO();
        po.setActivityId("111");
        po.setCouponId("2222");
        po.setCouponType("1");
        po.setIsMax("1");
        int ss = activityCouponDetailPOMapper.insertSelective(po);
        return "say " + str;
    }
}
