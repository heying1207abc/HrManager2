package com.heying.hrmanager.pojo;

import java.util.Date;

public class Attendance {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attendance.id
     *
     * @mbggenerated Mon Dec 17 09:38:35 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attendance.employeeId
     *
     * @mbggenerated Mon Dec 17 09:38:35 CST 2018
     */
    private Integer employeeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attendance.beginTime
     *
     * @mbggenerated Mon Dec 17 09:38:35 CST 2018
     */
    private Date begintime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attendance.endTime
     *
     * @mbggenerated Mon Dec 17 09:38:35 CST 2018
     */
    private Date endtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attendance.id
     *
     * @return the value of attendance.id
     *
     * @mbggenerated Mon Dec 17 09:38:35 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attendance.id
     *
     * @param id the value for attendance.id
     *
     * @mbggenerated Mon Dec 17 09:38:35 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attendance.employeeId
     *
     * @return the value of attendance.employeeId
     *
     * @mbggenerated Mon Dec 17 09:38:35 CST 2018
     */
    public Integer getEmployeeid() {
        return employeeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attendance.employeeId
     *
     * @param employeeid the value for attendance.employeeId
     *
     * @mbggenerated Mon Dec 17 09:38:35 CST 2018
     */
    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attendance.beginTime
     *
     * @return the value of attendance.beginTime
     *
     * @mbggenerated Mon Dec 17 09:38:35 CST 2018
     */
    public Date getBegintime() {
        return begintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attendance.beginTime
     *
     * @param begintime the value for attendance.beginTime
     *
     * @mbggenerated Mon Dec 17 09:38:35 CST 2018
     */
    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attendance.endTime
     *
     * @return the value of attendance.endTime
     *
     * @mbggenerated Mon Dec 17 09:38:35 CST 2018
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attendance.endTime
     *
     * @param endtime the value for attendance.endTime
     *
     * @mbggenerated Mon Dec 17 09:38:35 CST 2018
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }
}