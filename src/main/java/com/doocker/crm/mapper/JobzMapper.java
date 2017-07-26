package com.doocker.crm.mapper;

import com.doocker.crm.po.Jobz;
import com.doocker.crm.po.JobzExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobzMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jobz
     *
     * @mbggenerated Wed Jul 26 19:17:52 CST 2017
     */
    int countByExample(JobzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jobz
     *
     * @mbggenerated Wed Jul 26 19:17:52 CST 2017
     */
    int deleteByExample(JobzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jobz
     *
     * @mbggenerated Wed Jul 26 19:17:52 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jobz
     *
     * @mbggenerated Wed Jul 26 19:17:52 CST 2017
     */
    int insert(Jobz record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jobz
     *
     * @mbggenerated Wed Jul 26 19:17:52 CST 2017
     */
    int insertSelective(Jobz record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jobz
     *
     * @mbggenerated Wed Jul 26 19:17:52 CST 2017
     */
    List<Jobz> selectByExample(JobzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jobz
     *
     * @mbggenerated Wed Jul 26 19:17:52 CST 2017
     */
    Jobz selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jobz
     *
     * @mbggenerated Wed Jul 26 19:17:52 CST 2017
     */
    int updateByExampleSelective(@Param("record") Jobz record, @Param("example") JobzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jobz
     *
     * @mbggenerated Wed Jul 26 19:17:52 CST 2017
     */
    int updateByExample(@Param("record") Jobz record, @Param("example") JobzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jobz
     *
     * @mbggenerated Wed Jul 26 19:17:52 CST 2017
     */
    int updateByPrimaryKeySelective(Jobz record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jobz
     *
     * @mbggenerated Wed Jul 26 19:17:52 CST 2017
     */
    int updateByPrimaryKey(Jobz record);
}