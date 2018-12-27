package com.healthy.vision.mappers;

import com.healthy.vision.entity.bo.CheckRecordGetListBO;
import com.healthy.vision.entity.po.CheckRecordPO;
import com.healthy.vision.entity.po.CheckRecordPOExample;
import com.healthy.vision.entity.po.WxUserPO;
import com.healthy.vision.entity.vo.CheckRecordGetListVO;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckRecordPOMapper {

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  long countByExample(CheckRecordPOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int deleteByExample(CheckRecordPOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int deleteByPrimaryKey(Integer checkRecordId);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int insert(CheckRecordPO record);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int insertSelective(CheckRecordPO record);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  List<CheckRecordPO> selectByExample(CheckRecordPOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  CheckRecordPO selectByPrimaryKey(Integer checkRecordId);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int updateByExampleSelective(@Param("record") CheckRecordPO record, @Param("example") CheckRecordPOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int updateByExample(@Param("record") CheckRecordPO record, @Param("example") CheckRecordPOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int updateByPrimaryKeySelective(CheckRecordPO record);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int updateByPrimaryKey(CheckRecordPO record);
  
  List<CheckRecordGetListVO> selectByCondition(CheckRecordGetListBO bo);
}