package com.olympus.hora.dto.shop;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class MWorkingDayDetailDeffDto {

    private MWorkingDayDeffDto mWorkingDayDeffDto;

    /** mWorkingDayDetailDeff 営業日詳細定義マスタ*/

    private Integer workingDayDetailDeffId;

    private Integer mWorkingDayDeffId;

    private boolean effectiveFlag;

    private boolean workingDayFlg;

    private boolean week1Flag;

    private boolean week2Flag;

    private boolean week3Flag;

    private boolean week4Flag;

    private boolean week5Flag;

    private boolean monFlg;

    private boolean tueFlg;

    private boolean webFlg;

    private boolean thuFlg;

    private boolean friFlg;

    private boolean satFlg;

    private boolean sunFlg;

    private boolean holidayFlg;

    private Integer dayOfMonth;

    private LocalDate specifiedDay;

    private LocalTime startTime;

    private LocalTime endTime;

    private boolean deleteFlag;

    private LocalDateTime registerDatetime;

    private LocalDateTime updateDatetime;

    private String remarks;

    public Integer getWorkingDayDetailDeffId() {
        return workingDayDetailDeffId;
    }

    public void setWorkingDayDetailDeffId(Integer workingDayDetailDeffId) {
        this.workingDayDetailDeffId = workingDayDetailDeffId;
    }

    public boolean isEffectiveFlag() {
        return effectiveFlag;
    }

    public void setEffectiveFlag(boolean effectiveFlag) {
        this.effectiveFlag = effectiveFlag;
    }

    public boolean isWorkingDayFlg() {
        return workingDayFlg;
    }

    public void setWorkingDayFlg(boolean workingDayFlg) {
        this.workingDayFlg = workingDayFlg;
    }

    public boolean isWeek1Flag() {
        return week1Flag;
    }

    public void setWeek1Flag(boolean week1Flag) {
        this.week1Flag = week1Flag;
    }

    public boolean isWeek2Flag() {
        return week2Flag;
    }

    public void setWeek2Flag(boolean week2Flag) {
        this.week2Flag = week2Flag;
    }

    public boolean isWeek3Flag() {
        return week3Flag;
    }

    public void setWeek3Flag(boolean week3Flag) {
        this.week3Flag = week3Flag;
    }

    public boolean isWeek4Flag() {
        return week4Flag;
    }

    public void setWeek4Flag(boolean week4Flag) {
        this.week4Flag = week4Flag;
    }

    public boolean isWeek5Flag() {
        return week5Flag;
    }

    public void setWeek5Flag(boolean week5Flag) {
        this.week5Flag = week5Flag;
    }

    public boolean isMonFlg() {
        return monFlg;
    }

    public void setMonFlg(boolean monFlg) {
        this.monFlg = monFlg;
    }

    public boolean isTueFlg() {
        return tueFlg;
    }

    public void setTueFlg(boolean tueFlg) {
        this.tueFlg = tueFlg;
    }

    public boolean isWebFlg() {
        return webFlg;
    }

    public void setWebFlg(boolean webFlg) {
        this.webFlg = webFlg;
    }

    public boolean isThuFlg() {
        return thuFlg;
    }

    public void setThuFlg(boolean thuFlg) {
        this.thuFlg = thuFlg;
    }

    public boolean isFriFlg() {
        return friFlg;
    }

    public void setFriFlg(boolean friFlg) {
        this.friFlg = friFlg;
    }

    public boolean isSatFlg() {
        return satFlg;
    }

    public void setSatFlg(boolean satFlg) {
        this.satFlg = satFlg;
    }

    public boolean isSunFlg() {
        return sunFlg;
    }

    public void setSunFlg(boolean sunFlg) {
        this.sunFlg = sunFlg;
    }

    public boolean isHolidayFlg() {
        return holidayFlg;
    }

    public void setHolidayFlg(boolean holidayFlg) {
        this.holidayFlg = holidayFlg;
    }

    public Integer getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(Integer dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public LocalDate getSpecifiedDay() {
        return specifiedDay;
    }

    public void setSpecifiedDay(LocalDate specifiedDay) {
        this.specifiedDay = specifiedDay;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public boolean isDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public LocalDateTime getRegisterDatetime() {
        return registerDatetime;
    }

    public void setRegisterDatetime(LocalDateTime registerDatetime) {
        this.registerDatetime = registerDatetime;
    }

    public LocalDateTime getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(LocalDateTime updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public MWorkingDayDeffDto getmWorkingDayDeffDto() {
        return mWorkingDayDeffDto;
    }

    public void setmWorkingDayDeffDto(MWorkingDayDeffDto mWorkingDayDeffDto) {
        this.mWorkingDayDeffDto = mWorkingDayDeffDto;
    }

    public Integer getmWorkingDayDeffId() {
        return mWorkingDayDeffId;
    }

    public void setmWorkingDayDeffId(Integer mWorkingDayDeffId) {
        this.mWorkingDayDeffId = mWorkingDayDeffId;
    }

}
