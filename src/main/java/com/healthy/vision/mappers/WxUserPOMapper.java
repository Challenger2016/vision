package com.healthy.vision.mappers;

import com.healthy.vision.entity.po.WxUserPO;
import com.healthy.vision.entity.po.WxUserPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxUserPOMapper {

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  long countByExample(WxUserPOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int deleteByExample(WxUserPOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int deleteByPrimaryKey(Integer wxUserId);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int insert(WxUserPO record);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int insertSelective(WxUserPO record);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  List<WxUserPO> selectByExample(WxUserPOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  WxUserPO selectByPrimaryKey(Integer wxUserId);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int updateByExampleSelective(@Param("record") WxUserPO record, @Param("example") WxUserPOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int updateByExample(@Param("record") WxUserPO record, @Param("example") WxUserPOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int updateByPrimaryKeySelective(WxUserPO record);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int updateByPrimaryKey(WxUserPO record);
}