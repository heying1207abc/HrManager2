package com.heying.hrmanager.pojo;

import java.util.Date;

public class Position {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column position.id
     *
     * @mbggenerated Mon Dec 10 16:35:16 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column position.position_name
     *
     * @mbggenerated Mon Dec 10 16:35:16 CST 2018
     */
    private String positionName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column position.createTime
     *
     * @mbggenerated Mon Dec 10 16:35:16 CST 2018
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column position.deptId
     *
     * @mbggenerated Mon Dec 10 16:35:16 CST 2018
     */
    private Integer deptid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column position.id
     *
     * @return the value of position.id
     *
     * @mbggenerated Mon Dec 10 16:35:16 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column position.id
     *
     * @param id the value for position.id
     *
     * @mbggenerated Mon Dec 10 16:35:16 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column position.position_name
     *
     * @return the value of position.position_name
     *
     * @mbggenerated Mon Dec 10 16:35:16 CST 2018
     */
    public String getPositionName() {
        return positionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column position.position_name
     *
     * @param positionName the value for position.position_name
     *
     * @mbggenerated Mon Dec 10 16:35:16 CST 2018
     */
    public void setPositionName(String positionName) {
        this.positionName = positionName == null ? null : positionName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column position.createTime
     *
     * @return the value of position.createTime
     *
     * @mbggenerated Mon Dec 10 16:35:16 CST 2018
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column position.createTime
     *
     * @param createtime the value for position.createTime
     *
     * @mbggenerated Mon Dec 10 16:35:16 CST 2018
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column position.deptId
     *
     * @return the value of position.deptId
     *
     * @mbggenerated Mon Dec 10 16:35:16 CST 2018
     */
    public Integer getDeptid() {
        return deptid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column position.deptId
     *
     * @param deptid the value for position.deptId
     *
     * @mbggenerated Mon Dec 10 16:35:16 CST 2018
     */
    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }
}