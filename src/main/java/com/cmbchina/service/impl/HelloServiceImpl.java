package com.cmbchina.service.impl;

import com.cmbchina.dao.mapper.gen.momo.ActivityCouponDetailPOMapper;
import com.cmbchina.dao.po.momo.ActivityCouponDetailPO;
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

    @Override
    public String say(String str) {
        ActivityCouponDetailPO po = activityCouponDetailPOMapper.selectByPrimaryKey(1);
        return "say " + str;
    }
}
