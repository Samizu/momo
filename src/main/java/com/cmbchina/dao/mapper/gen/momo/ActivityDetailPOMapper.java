package com.cmbchina.dao.mapper.gen.momo;

import com.cmbchina.dao.po.momo.ActivityDetailPO;
import com.cmbchina.dao.po.momo.ActivityDetailPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityDetailPOMapper {
    int countByExample(ActivityDetailPOExample example);

    int deleteByExample(ActivityDetailPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(ActivityDetailPO record);

    int insertSelective(ActivityDetailPO record);

    List<ActivityDetailPO> selectByExampleWithBLOBs(ActivityDetailPOExample example);

    List<ActivityDetailPO> selectByExample(ActivityDetailPOExample example);

    ActivityDetailPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ActivityDetailPO record, @Param("example") ActivityDetailPOExample example);

    int updateByExampleWithBLOBs(@Param("record") ActivityDetailPO record, @Param("example") ActivityDetailPOExample example);

    int updateByExample(@Param("record") ActivityDetailPO record, @Param("example") ActivityDetailPOExample example);

    int updateByPrimaryKeySelective(ActivityDetailPO record);

    int updateByPrimaryKeyWithBLOBs(ActivityDetailPO record);

    int updateByPrimaryKey(ActivityDetailPO record);

    ActivityDetailPO lockByPrimaryKey(@Param("id") String id);

    List<ActivityDetailPO> lockByExample(ActivityDetailPOExample example);

    void insertBatch(@Param("recordList") List<ActivityDetailPO> recordList);

    void insertBatchSelective(@Param("recordList") List<ActivityDetailPO> recordList);
}