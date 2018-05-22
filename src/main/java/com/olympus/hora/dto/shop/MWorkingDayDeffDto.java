package com.olympus.hora.dto.shop;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MWorkingDayDeffDto {

    /** mWorkingDayDeff 営業日定義マスタ*/
    private Integer mWorkingDayDeffId;

    private Integer shopId;

    private LocalDate startDay;

    private boolean deleteFlag;

    private LocalDateTime registerDatetime;

    private LocalDateTime updateDatetime;

    public Integer getmWorkingDayDeffId() {
        return mWorkingDayDeffId;
    }

    public void setmWorkingDayDeffId(Integer mWorkingDayDeffId) {
        this.mWorkingDayDeffId = mWorkingDayDeffId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public LocalDate getStartDay() {
        return startDay;
    }

    public void setStartDay(LocalDate startDay) {
        this.startDay = startDay;
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


}