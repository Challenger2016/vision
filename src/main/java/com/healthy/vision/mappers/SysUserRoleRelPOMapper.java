package com.healthy.vision.mappers;

import com.healthy.vision.entity.po.SysUserRoleRelPO;
import com.healthy.vision.entity.po.SysUserRoleRelPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserRoleRelPOMapper {

  /**
   * 只读. 
   * @mbg.generated  2018-12-27 19:26:57
   */
  long countByExample(SysUserRoleRelPOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-27 19:26:57
   */
  int deleteByExample(SysUserRoleRelPOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-27 19:26:57
   */
  int deleteByPrimaryKey(Integer sysUserRoleRelId);

  /**
   * 只读. 
   * @mbg.generated  2018-12-27 19:26:57
   */
  int insert(SysUserRoleRelPO record);

  /**
   * 只读. 
   * @mbg.generated  2018-12-27 19:26:57
   */
  int insertSelective(SysUserRoleRelPO record);

  /**
   * 只读. 
   * @mbg.generated  2018-12-27 19:26:57
   */
  List<SysUserRoleRelPO> selectByExample(SysUserRoleRelPOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-27 19:26:57
   */
  SysUserRoleRelPO selectByPrimaryKey(Integer sysUserRoleRelId);

  /**
   * 只读. 
   * @mbg.generated  2018-12-27 19:26:57
   */
  int updateByExampleSelective(@Param("record") SysUserRoleRelPO record,
      @Param("example") SysUserRoleRelPOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-27 19:26:57
   */
  int updateByExample(@Param("record") SysUserRoleRelPO record, @Param("example") SysUserRoleRelPOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-27 19:26:57
   */
  int updateByPrimaryKeySelective(SysUserRoleRelPO record);

  /**
   * 只读. 
   * @mbg.generated  2018-12-27 19:26:57
   */
  int updateByPrimaryKey(SysUserRoleRelPO record);
}