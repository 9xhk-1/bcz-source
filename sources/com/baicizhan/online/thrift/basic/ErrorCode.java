package com.baicizhan.online.thrift.basic;

import org.apache.thrift.TEnum;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public enum ErrorCode implements TEnum {
    SERVER_ERROR(1),
    PARAM_ERROR(2),
    NOT_FOUND(3),
    PASSWORD_ERROR(4),
    EMAIL_FORMAT(5),
    PHONE_FORMAT(6),
    PASSWORD_FORMAT(7),
    NOT_LOGIN(8),
    ALREADY_IN_USE(9),
    OPERATOR_SMS_LIMIT(10),
    PASSWORD_UNSET(11),
    MAX_COLLECT_LIMIT(12),
    VERSION_DEPRECATED(13),
    ENERGY_NOT_ENOUGH(14),
    GAME_STUDY_RECORD_ERROR(15),
    GAME_ROUND_ERROR(16);

    private final int value;

    ErrorCode(int value) {
        this.value = value;
    }

    public static ErrorCode findByValue(int value) {
        switch (value) {
            case 1:
                return SERVER_ERROR;
            case 2:
                return PARAM_ERROR;
            case 3:
                return NOT_FOUND;
            case 4:
                return PASSWORD_ERROR;
            case 5:
                return EMAIL_FORMAT;
            case 6:
                return PHONE_FORMAT;
            case 7:
                return PASSWORD_FORMAT;
            case 8:
                return NOT_LOGIN;
            case 9:
                return ALREADY_IN_USE;
            case 10:
                return OPERATOR_SMS_LIMIT;
            case 11:
                return PASSWORD_UNSET;
            case 12:
                return MAX_COLLECT_LIMIT;
            case 13:
                return VERSION_DEPRECATED;
            case 14:
                return ENERGY_NOT_ENOUGH;
            case 15:
                return GAME_STUDY_RECORD_ERROR;
            case 16:
                return GAME_ROUND_ERROR;
            default:
                return null;
        }
    }

    @Override // org.apache.thrift.TEnum
    public int getValue() {
        return this.value;
    }
}
