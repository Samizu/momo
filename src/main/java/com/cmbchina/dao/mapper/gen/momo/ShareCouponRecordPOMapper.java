package com.cmbchina.dao.mapper.gen.momo;

import com.cmbchina.dao.po.momo.ShareCouponRecordPO;
import com.cmbchina.dao.po.momo.ShareCouponRecordPOExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShareCouponRecordPOMapper {
    int countByExample(ShareCouponRecordPOExample example);

    int deleteByExample(ShareCouponRecordPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShareCouponRecordPO record);

    int insertSelective(ShareCouponRecordPO record);

    List<ShareCouponRecordPO> selectByExample(ShareCouponRecordPOExample example);

    ShareCouponRecordPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShareCouponRecordPO record, @Param("example") ShareCouponRecordPOExample example);

    int updateByExample(@Param("record") ShareCouponRecordPO record, @Param("example") ShareCouponRecordPOExample example);

    int updateByPrimaryKeySelective(ShareCouponRecordPO record);

    int updateByPrimaryKey(ShareCouponRecordPO record);

    ShareCouponRecordPO lockByPrimaryKey(@Param("id") Integer id);

    List<ShareCouponRecordPO> lockByExample(ShareCouponRecordPOExample example);

    void insertBatch(@Param("recordList") List<ShareCouponRecordPO> recordList);

    void insertBatchSelective(@Param("recordList") List<ShareCouponRecordPO> recordList);
}