package com.olympus.hora.dto.shop;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class MWorkingDayDto {

    /** mWorkingDay 営業日マスタ*/
    private Integer workingDayId;

    private Integer shopId;

    private LocalDate workingDate;

    private LocalTime startTime;

    private LocalTime endTime;

    private Boolean deleteFlag;

    private LocalDateTime registerDatetime;

    private LocalDateTime updateDatetime;

    public Integer getWorkingDayId() {
        return workingDayId;
    }

    public void setWorkingDayId(Integer workingDayId) {
        this.workingDayId = workingDayId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public LocalDate getWorkingDate() {
        return workingDate;
    }

    public void setWorkingDate(LocalDate workingDate) {
        this.workingDate = workingDate;
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

    public Boolean getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Boolean deleteFlag) {
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



}
