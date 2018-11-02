package com.cmbchina.dao.mapper.gen.momo;

import com.cmbchina.dao.po.momo.ActivityCouponDetailPO;
import com.cmbchina.dao.po.momo.ActivityCouponDetailPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityCouponDetailPOMapper {
    int countByExample(ActivityCouponDetailPOExample example);

    int deleteByExample(ActivityCouponDetailPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(ActivityCouponDetailPO record);

    int insertSelective(ActivityCouponDetailPO record);

    List<ActivityCouponDetailPO> selectByExample(ActivityCouponDetailPOExample example);

    ActivityCouponDetailPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ActivityCouponDetailPO record, @Param("example") ActivityCouponDetailPOExample example);

    int updateByExample(@Param("record") ActivityCouponDetailPO record, @Param("example") ActivityCouponDetailPOExample example);

    int updateByPrimaryKeySelective(ActivityCouponDetailPO record);

    int updateByPrimaryKey(ActivityCouponDetailPO record);

    ActivityCouponDetailPO lockByPrimaryKey(@Param("id") String id);

    List<ActivityCouponDetailPO> lockByExample(ActivityCouponDetailPOExample example);

    void insertBatch(@Param("recordList") List<ActivityCouponDetailPO> recordList);

    void insertBatchSelective(@Param("recordList") List<ActivityCouponDetailPO> recordList);
}