package com.doocker.crm.mapper;

import com.doocker.crm.po.Lose;
import com.doocker.crm.po.LoseExample;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lose
     *
     * @mbggenerated Thu Jul 27 23:53:50 CST 2017
     */
    int countByExample(LoseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lose
     *
     * @mbggenerated Thu Jul 27 23:53:50 CST 2017
     */
    int deleteByExample(LoseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lose
     *
     * @mbggenerated Thu Jul 27 23:53:50 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lose
     *
     * @mbggenerated Thu Jul 27 23:53:50 CST 2017
     */
    int insert(Lose record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lose
     *
     * @mbggenerated Thu Jul 27 23:53:50 CST 2017
     */
    int insertSelective(Lose record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lose
     *
     * @mbggenerated Thu Jul 27 23:53:50 CST 2017
     */
    List<Lose> selectByExample(LoseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lose
     *
     * @mbggenerated Thu Jul 27 23:53:50 CST 2017
     */
    Lose selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lose
     *
     * @mbggenerated Thu Jul 27 23:53:50 CST 2017
     */
    int updateByExampleSelective(@Param("record") Lose record, @Param("example") LoseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lose
     *
     * @mbggenerated Thu Jul 27 23:53:50 CST 2017
     */
    int updateByExample(@Param("record") Lose record, @Param("example") LoseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lose
     *
     * @mbggenerated Thu Jul 27 23:53:50 CST 2017
     */
    int updateByPrimaryKeySelective(Lose record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lose
     *
     * @mbggenerated Thu Jul 27 23:53:50 CST 2017
     */
    int updateByPrimaryKey(Lose record);
    List<HashMap> selectByPage(@Param("sname")String sname);

}