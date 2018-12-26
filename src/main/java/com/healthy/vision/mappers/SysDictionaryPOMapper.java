package com.healthy.vision.mappers;

import com.healthy.vision.entity.po.SysDictionaryPO;
import com.healthy.vision.entity.po.SysDictionaryPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysDictionaryPOMapper {

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  long countByExample(SysDictionaryPOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int deleteByExample(SysDictionaryPOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int deleteByPrimaryKey(Integer sysDictionaryId);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int insert(SysDictionaryPO record);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int insertSelective(SysDictionaryPO record);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  List<SysDictionaryPO> selectByExample(SysDictionaryPOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  SysDictionaryPO selectByPrimaryKey(Integer sysDictionaryId);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int updateByExampleSelective(@Param("record") SysDictionaryPO record,
      @Param("example") SysDictionaryPOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int updateByExample(@Param("record") SysDictionaryPO record, @Param("example") SysDictionaryPOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int updateByPrimaryKeySelective(SysDictionaryPO record);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int updateByPrimaryKey(SysDictionaryPO record);
}