package com.doocker.crm.mapper;

import com.doocker.crm.po.Class;
import com.doocker.crm.po.ClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbggenerated Tue Jul 25 22:00:49 CST 2017
     */
    int countByExample(ClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbggenerated Tue Jul 25 22:00:49 CST 2017
     */
    int deleteByExample(ClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbggenerated Tue Jul 25 22:00:49 CST 2017
     */
    int deleteByPrimaryKey(Integer classId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbggenerated Tue Jul 25 22:00:49 CST 2017
     */
    int insert(Class record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbggenerated Tue Jul 25 22:00:49 CST 2017
     */
    int insertSelective(Class record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbggenerated Tue Jul 25 22:00:49 CST 2017
     */
    List<Class> selectByExample(ClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbggenerated Tue Jul 25 22:00:49 CST 2017
     */
    Class selectByPrimaryKey(Integer classId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbggenerated Tue Jul 25 22:00:49 CST 2017
     */
    int updateByExampleSelective(@Param("record") Class record, @Param("example") ClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbggenerated Tue Jul 25 22:00:49 CST 2017
     */
    int updateByExample(@Param("record") Class record, @Param("example") ClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbggenerated Tue Jul 25 22:00:49 CST 2017
     */
    int updateByPrimaryKeySelective(Class record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbggenerated Tue Jul 25 22:00:49 CST 2017
     */
    int updateByPrimaryKey(Class record);
}