package org.docksidestage.db2.dbflute.allcommon;

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
    java.sql.Timestamp getRegisterDatetime();

    /**
     * Set the value of registerDatetime.
     * @param registerDatetime The instance of the property type. (NullAllowed)
     */
    void setRegisterDatetime(java.sql.Timestamp registerDatetime);

    /**
     * Get the value of registerUser.
     * @return The instance of the property type. (NullAllowed)
     */
    String getRegisterUser();

    /**
     * Set the value of registerUser.
     * @param registerUser The instance of the property type. (NullAllowed)
     */
    void setRegisterUser(String registerUser);

    /**
     * Get the value of updateDatetime.
     * @return The instance of the property type. (NullAllowed)
     */
    java.sql.Timestamp getUpdateDatetime();

    /**
     * Set the value of updateDatetime.
     * @param updateDatetime The instance of the property type. (NullAllowed)
     */
    void setUpdateDatetime(java.sql.Timestamp updateDatetime);

    /**
     * Get the value of updateUser.
     * @return The instance of the property type. (NullAllowed)
     */
    String getUpdateUser();

    /**
     * Set the value of updateUser.
     * @param updateUser The instance of the property type. (NullAllowed)
     */
    void setUpdateUser(String updateUser);
}
