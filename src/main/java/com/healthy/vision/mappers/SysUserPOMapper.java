package com.healthy.vision.mappers;

import com.healthy.vision.entity.po.SysUserPO;
import com.healthy.vision.entity.po.SysUserPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserPOMapper {

  /**
   * 只读. 
   * @mbg.generated  2018-12-27 15:44:14
   */
  long countByExample(SysUserPOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-27 15:44:14
   */
  int deleteByExample(SysUserPOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-27 15:44:14
   */
  int deleteByPrimaryKey(Integer sysUserId);

  /**
   * 只读. 
   * @mbg.generated  2018-12-27 15:44:14
   */
  int insert(SysUserPO record);

  /**
   * 只读. 
   * @mbg.generated  2018-12-27 15:44:14
   */
  int insertSelective(SysUserPO record);

  /**
   * 只读. 
   * @mbg.generated  2018-12-27 15:44:14
   */
  List<SysUserPO> selectByExample(SysUserPOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-27 15:44:14
   */
  SysUserPO selectByPrimaryKey(Integer sysUserId);

  /**
   * 只读. 
   * @mbg.generated  2018-12-27 15:44:14
   */
  int updateByExampleSelective(@Param("record") SysUserPO record, @Param("example") SysUserPOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-27 15:44:14
   */
  int updateByExample(@Param("record") SysUserPO record, @Param("example") SysUserPOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-27 15:44:14
   */
  int updateByPrimaryKeySelective(SysUserPO record);

  /**
   * 只读. 
   * @mbg.generated  2018-12-27 15:44:14
   */
  int updateByPrimaryKey(SysUserPO record);
}