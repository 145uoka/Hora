package com.olympus.hora.form;

import org.hibernate.validator.constraints.NotEmpty;

public class WorkshopEditFrom {

    //@NotEmpty
    private String shopId;

    @NotEmpty
    private String startDay;

    private String workingDayDetailDeffId;

    private String mWorkingDayDeffId;

    private String[] effectiveFlag;

    private String[] workingDayFlg;

    private String[] week1Flag;

    private String[] week2Flag;

    private String[] week3Flag;

    private String[] week4Flag;

    private String[] week5Flag;

    private String[] monFlg;

    private String[] tueFlg;

    private String[] webFlg;

    private String[] thuFlg;

    private String[] friFlg;

    private String[] satFlg;

    private String[] sunFlg;

    private String[] holidayFlg;

    private String[] dayOfMonth;

    private String[] specifiedDay;

    private String[]  startTime;

    private String[] endTime;

    private String[] remarks;

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getWorkingDayDetailDeffId() {
        return workingDayDetailDeffId;
    }

    public void setWorkingDayDetailDeffId(String workingDayDetailDeffId) {
        this.workingDayDetailDeffId = workingDayDetailDeffId;
    }

    public String getmWorkingDayDeffId() {
        return mWorkingDayDeffId;
    }

    public void setmWorkingDayDeffId(String mWorkingDayDeffId) {
        this.mWorkingDayDeffId = mWorkingDayDeffId;
    }

    public String[] getEffectiveFlag() {
        return effectiveFlag;
    }

    public void setEffectiveFlag(String[] effectiveFlag) {
        this.effectiveFlag = effectiveFlag;
    }

    public String[] getWorkingDayFlg() {
        return workingDayFlg;
    }

    public void setWorkingDayFlg(String[] workingDayFlg) {
        this.workingDayFlg = workingDayFlg;
    }

    public String[] getWeek1Flag() {
        return week1Flag;
    }

    public void setWeek1Flag(String[] week1Flag) {
        this.week1Flag = week1Flag;
    }

    public String[] getWeek2Flag() {
        return week2Flag;
    }

    public void setWeek2Flag(String[] week2Flag) {
        this.week2Flag = week2Flag;
    }

    public String[] getWeek3Flag() {
        return week3Flag;
    }

    public void setWeek3Flag(String[] week3Flag) {
        this.week3Flag = week3Flag;
    }

    public String[] getWeek4Flag() {
        return week4Flag;
    }

    public void setWeek4Flag(String[] week4Flag) {
        this.week4Flag = week4Flag;
    }

    public String[] getWeek5Flag() {
        return week5Flag;
    }

    public void setWeek5Flag(String[] week5Flag) {
        this.week5Flag = week5Flag;
    }

    public String[] getMonFlg() {
        return monFlg;
    }

    public void setMonFlg(String[] monFlg) {
        this.monFlg = monFlg;
    }

    public String[] getTueFlg() {
        return tueFlg;
    }

    public void setTueFlg(String[] tueFlg) {
        this.tueFlg = tueFlg;
    }

    public String[] getWebFlg() {
        return webFlg;
    }

    public void setWebFlg(String[] webFlg) {
        this.webFlg = webFlg;
    }

    public String[] getThuFlg() {
        return thuFlg;
    }

    public void setThuFlg(String[] thuFlg) {
        this.thuFlg = thuFlg;
    }

    public String[] getFriFlg() {
        return friFlg;
    }

    public void setFriFlg(String[] friFlg) {
        this.friFlg = friFlg;
    }

    public String[] getSatFlg() {
        return satFlg;
    }

    public void setSatFlg(String[] satFlg) {
        this.satFlg = satFlg;
    }

    public String[] getSunFlg() {
        return sunFlg;
    }

    public void setSunFlg(String[] sunFlg) {
        this.sunFlg = sunFlg;
    }

    public String[] getHolidayFlg() {
        return holidayFlg;
    }

    public void setHolidayFlg(String[] holidayFlg) {
        this.holidayFlg = holidayFlg;
    }

    public String[] getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(String[] dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public String[] getSpecifiedDay() {
        return specifiedDay;
    }

    public void setSpecifiedDay(String[] specifiedDay) {
        this.specifiedDay = specifiedDay;
    }

    public String[] getStartTime() {
        return startTime;
    }

    public void setStartTime(String[] startTime) {
        this.startTime = startTime;
    }

    public String[] getEndTime() {
        return endTime;
    }

    public void setEndTime(String[] endTime) {
        this.endTime = endTime;
    }

    public String[] getRemarks() {
        return remarks;
    }

    public void setRemarks(String[] remarks) {
        this.remarks = remarks;
    }

}
