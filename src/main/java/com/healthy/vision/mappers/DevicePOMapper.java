package com.healthy.vision.mappers;

import com.healthy.vision.entity.po.DevicePO;
import com.healthy.vision.entity.po.DevicePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DevicePOMapper {

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  long countByExample(DevicePOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int deleteByExample(DevicePOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int deleteByPrimaryKey(Integer deviceId);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int insert(DevicePO record);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int insertSelective(DevicePO record);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  List<DevicePO> selectByExample(DevicePOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  DevicePO selectByPrimaryKey(Integer deviceId);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int updateByExampleSelective(@Param("record") DevicePO record, @Param("example") DevicePOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int updateByExample(@Param("record") DevicePO record, @Param("example") DevicePOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int updateByPrimaryKeySelective(DevicePO record);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int updateByPrimaryKey(DevicePO record);
}