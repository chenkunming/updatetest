package com.etc.entity;

public class UserFollow {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_follow.followId
     *
     * @mbggenerated Thu Jul 19 15:40:10 CST 2018
     */
    private Integer followid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_follow.userId
     *
     * @mbggenerated Thu Jul 19 15:40:10 CST 2018
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_follow.followuserId
     *
     * @mbggenerated Thu Jul 19 15:40:10 CST 2018
     */
    private Integer followuserid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_follow.followId
     *
     * @return the value of user_follow.followId
     *
     * @mbggenerated Thu Jul 19 15:40:10 CST 2018
     */
    public Integer getFollowid() {
        return followid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_follow.followId
     *
     * @param followid the value for user_follow.followId
     *
     * @mbggenerated Thu Jul 19 15:40:10 CST 2018
     */
    public void setFollowid(Integer followid) {
        this.followid = followid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_follow.userId
     *
     * @return the value of user_follow.userId
     *
     * @mbggenerated Thu Jul 19 15:40:10 CST 2018
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_follow.userId
     *
     * @param userid the value for user_follow.userId
     *
     * @mbggenerated Thu Jul 19 15:40:10 CST 2018
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_follow.followuserId
     *
     * @return the value of user_follow.followuserId
     *
     * @mbggenerated Thu Jul 19 15:40:10 CST 2018
     */
    public Integer getFollowuserid() {
        return followuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_follow.followuserId
     *
     * @param followuserid the value for user_follow.followuserId
     *
     * @mbggenerated Thu Jul 19 15:40:10 CST 2018
     */
    public void setFollowuserid(Integer followuserid) {
        this.followuserid = followuserid;
    }
}