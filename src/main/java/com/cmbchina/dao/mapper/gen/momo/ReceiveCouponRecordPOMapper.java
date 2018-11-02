package com.cmbchina.dao.mapper.gen.momo;

import com.cmbchina.dao.po.momo.ReceiveCouponRecordPO;
import com.cmbchina.dao.po.momo.ReceiveCouponRecordPOExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReceiveCouponRecordPOMapper {
    int countByExample(ReceiveCouponRecordPOExample example);

    int deleteByExample(ReceiveCouponRecordPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ReceiveCouponRecordPO record);

    int insertSelective(ReceiveCouponRecordPO record);

    List<ReceiveCouponRecordPO> selectByExample(ReceiveCouponRecordPOExample example);

    ReceiveCouponRecordPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ReceiveCouponRecordPO record, @Param("example") ReceiveCouponRecordPOExample example);

    int updateByExample(@Param("record") ReceiveCouponRecordPO record, @Param("example") ReceiveCouponRecordPOExample example);

    int updateByPrimaryKeySelective(ReceiveCouponRecordPO record);

    int updateByPrimaryKey(ReceiveCouponRecordPO record);

    ReceiveCouponRecordPO lockByPrimaryKey(@Param("id") Integer id);

    List<ReceiveCouponRecordPO> lockByExample(ReceiveCouponRecordPOExample example);

    void insertBatch(@Param("recordList") List<ReceiveCouponRecordPO> recordList);

    void insertBatchSelective(@Param("recordList") List<ReceiveCouponRecordPO> recordList);
}