package com.healthy.vision.mappers;

import com.healthy.vision.entity.po.SysRolePO;
import com.healthy.vision.entity.po.SysRolePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRolePOMapper {

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  long countByExample(SysRolePOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int deleteByExample(SysRolePOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int deleteByPrimaryKey(Integer sysRoleId);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int insert(SysRolePO record);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int insertSelective(SysRolePO record);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  List<SysRolePO> selectByExample(SysRolePOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  SysRolePO selectByPrimaryKey(Integer sysRoleId);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int updateByExampleSelective(@Param("record") SysRolePO record, @Param("example") SysRolePOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int updateByExample(@Param("record") SysRolePO record, @Param("example") SysRolePOExample example);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int updateByPrimaryKeySelective(SysRolePO record);

  /**
   * 只读. 
   * @mbg.generated  2018-12-26 10:46:20
   */
  int updateByPrimaryKey(SysRolePO record);
}