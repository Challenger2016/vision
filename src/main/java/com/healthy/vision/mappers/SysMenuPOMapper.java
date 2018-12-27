package com.healthy.vision.mappers;

import com.healthy.vision.entity.po.SysMenuPO;
import com.healthy.vision.entity.po.SysMenuPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysMenuPOMapper {

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  long countByExample(SysMenuPOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int deleteByExample(SysMenuPOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int deleteByPrimaryKey(Integer sysMenuId);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int insert(SysMenuPO record);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int insertSelective(SysMenuPO record);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  List<SysMenuPO> selectByExample(SysMenuPOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  SysMenuPO selectByPrimaryKey(Integer sysMenuId);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int updateByExampleSelective(@Param("record") SysMenuPO record, @Param("example") SysMenuPOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int updateByExample(@Param("record") SysMenuPO record, @Param("example") SysMenuPOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int updateByPrimaryKeySelective(SysMenuPO record);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int updateByPrimaryKey(SysMenuPO record);
  
  List<SysMenuPO> selectBySysRoleId(@Param("sysRoleIdList") List<Integer> sysRoleIdList);
  
}