package com.healthy.vision.mappers;

import com.healthy.vision.entity.po.WxPublicPO;
import com.healthy.vision.entity.po.WxPublicPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxPublicPOMapper {
    /**
     * 只读. 
     *
     * @mbg.generated 2018-12-19 10:34:36
     */
    long countByExample(WxPublicPOExample example);

    /**
     * 只读. 
     *
     * @mbg.generated 2018-12-19 10:34:36
     */
    int deleteByExample(WxPublicPOExample example);

    /**
     * 只读. 
     *
     * @mbg.generated 2018-12-19 10:34:36
     */
    int deleteByPrimaryKey(Long wxPublicId);

    /**
     * 只读. 
     *
     * @mbg.generated 2018-12-19 10:34:36
     */
    int insert(WxPublicPO record);

    /**
     * 只读. 
     *
     * @mbg.generated 2018-12-19 10:34:36
     */
    int insertSelective(WxPublicPO record);

    /**
     * 只读. 
     *
     * @mbg.generated 2018-12-19 10:34:36
     */
    List<WxPublicPO> selectByExample(WxPublicPOExample example);

    /**
     * 只读. 
     *
     * @mbg.generated 2018-12-19 10:34:36
     */
    WxPublicPO selectByPrimaryKey(Long wxPublicId);

    /**
     * 只读. 
     *
     * @mbg.generated 2018-12-19 10:34:36
     */
    int updateByExampleSelective(@Param("record") WxPublicPO record, @Param("example") WxPublicPOExample example);

    /**
     * 只读. 
     *
     * @mbg.generated 2018-12-19 10:34:36
     */
    int updateByExample(@Param("record") WxPublicPO record, @Param("example") WxPublicPOExample example);

    /**
     * 只读. 
     *
     * @mbg.generated 2018-12-19 10:34:36
     */
    int updateByPrimaryKeySelective(WxPublicPO record);

    /**
     * 只读. 
     *
     * @mbg.generated 2018-12-19 10:34:36
     */
    int updateByPrimaryKey(WxPublicPO record);
}