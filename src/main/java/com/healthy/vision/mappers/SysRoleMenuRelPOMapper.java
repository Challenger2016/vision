package com.healthy.vision.mappers;

import com.healthy.vision.entity.po.SysRoleMenuRelPO;
import com.healthy.vision.entity.po.SysRoleMenuRelPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleMenuRelPOMapper {

  /**
   * 只读. 
   * @mbg.generated  2018-12-27 15:42:07
   */
  long countByExample(SysRoleMenuRelPOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-27 15:42:07
   */
  int deleteByExample(SysRoleMenuRelPOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-27 15:42:07
   */
  int deleteByPrimaryKey(Integer sysRoleMenuRelId);

  /**
   * 只读. 
   * @mbg.generated  2018-12-27 15:42:07
   */
  int insert(SysRoleMenuRelPO record);

  /**
   * 只读. 
   * @mbg.generated  2018-12-27 15:42:07
   */
  int insertSelective(SysRoleMenuRelPO record);

  /**
   * 只读. 
   * @mbg.generated  2018-12-27 15:42:07
   */
  List<SysRoleMenuRelPO> selectByExample(SysRoleMenuRelPOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-27 15:42:07
   */
  SysRoleMenuRelPO selectByPrimaryKey(Integer sysRoleMenuRelId);

  /**
   * 只读. 
   * @mbg.generated  2018-12-27 15:42:07
   */
  int updateByExampleSelective(@Param("record") SysRoleMenuRelPO record,
      @Param("example") SysRoleMenuRelPOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-27 15:42:07
   */
  int updateByExample(@Param("record") SysRoleMenuRelPO record, @Param("example") SysRoleMenuRelPOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-27 15:42:07
   */
  int updateByPrimaryKeySelective(SysRoleMenuRelPO record);

  /**
   * 只读. 
   * @mbg.generated  2018-12-27 15:42:07
   */
  int updateByPrimaryKey(SysRoleMenuRelPO record);
}