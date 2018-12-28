package com.heying.hrmanager.mapper;

import com.heying.hrmanager.pojo.Position;
import com.heying.hrmanager.pojo.PositionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PositionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbggenerated Mon Dec 10 16:35:16 CST 2018
     */
    int countByExample(PositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbggenerated Mon Dec 10 16:35:16 CST 2018
     */
    int deleteByExample(PositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbggenerated Mon Dec 10 16:35:16 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbggenerated Mon Dec 10 16:35:16 CST 2018
     */
    int insert(Position record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbggenerated Mon Dec 10 16:35:16 CST 2018
     */
    int insertSelective(Position record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbggenerated Mon Dec 10 16:35:16 CST 2018
     */
    List<Position> selectByExample(PositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbggenerated Mon Dec 10 16:35:16 CST 2018
     */
    Position selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbggenerated Mon Dec 10 16:35:16 CST 2018
     */
    int updateByExampleSelective(@Param("record") Position record, @Param("example") PositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbggenerated Mon Dec 10 16:35:16 CST 2018
     */
    int updateByExample(@Param("record") Position record, @Param("example") PositionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbggenerated Mon Dec 10 16:35:16 CST 2018
     */
    int updateByPrimaryKeySelective(Position record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table position
     *
     * @mbggenerated Mon Dec 10 16:35:16 CST 2018
     */
    int updateByPrimaryKey(Position record);
}