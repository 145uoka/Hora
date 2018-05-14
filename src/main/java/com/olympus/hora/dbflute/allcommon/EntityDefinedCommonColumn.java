package com.olympus.hora.dbflute.allcommon;

import org.dbflute.Entity;

/**
 * The interface of entity defined common columns.
 * @author DBFlute(AutoGenerator)
 */
public interface EntityDefinedCommonColumn extends Entity {

    /**
     * Get the value of registerDatetime.
     * @return The instance of the property type. (NullAllowed)
     */
    java.time.LocalDateTime getRegisterDatetime();

    /**
     * Set the value of registerDatetime.
     * @param registerDatetime The instance of the property type. (NullAllowed)
     */
    void setRegisterDatetime(java.time.LocalDateTime registerDatetime);

    /**
     * Get the value of updateDatetime.
     * @return The instance of the property type. (NullAllowed)
     */
    java.time.LocalDateTime getUpdateDatetime();

    /**
     * Set the value of updateDatetime.
     * @param updateDatetime The instance of the property type. (NullAllowed)
     */
    void setUpdateDatetime(java.time.LocalDateTime updateDatetime);
}
