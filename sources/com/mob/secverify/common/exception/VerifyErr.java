package com.mob.secverify.common.exception;

import com.mob.secverify.e.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public enum VerifyErr {
    C_UNSUPPORTED_OPERATOR(6119000, "Unsupported operator"),
    C_UNPREVERIFY(6119165, "Please do preVerify first"),
    C_PHONE_INVALID(6119001, "Invalid phone"),
    C_NO_SIM(6119002, "No sim"),
    C_LACK_OF_PERMISSIONS(6119003, "Lack of necessary permissions"),
    C_CELLULAR_DISABLED(6119004, "Cellular disabled"),
    C_MOB_PRIVACY_NOT_ACCEPTED_ERROR(6119005, "mob privacy Not accepted error"),
    C_ONE_KEY_OBTAIN_OPERATOR_CONFIG_ERR(6119401, "Obtain operator config error"),
    C_ONE_KEY_LOGIN_ERR(6119402, "login error"),
    C_ONE_KEY_OBTAIN_CM_OPERATOR_ACCESS_CODE_ERR(6119127, "Obtain access code from cm operator error"),
    C_ONE_KEY_OBTAIN_CU_OPERATOR_ACCESS_CODE_ERR(6119128, "Obtain access code from cu operator error"),
    C_ONE_KEY_OBTAIN_CT_OPERATOR_ACCESS_CODE_ERR(6119129, "Obtain access code from ct operator error"),
    C_ONE_KEY_OBTAIN_CM_OPERATOR_ACCESS_TOKEN_ERR(6119167, "Obtain access token from cm operator error"),
    C_ONE_KEY_OBTAIN_CU_OPERATOR_ACCESS_TOKEN_ERR(6119168, "Obtain access token from cu operator error"),
    C_ONE_KEY_OBTAIN_CT_OPERATOR_ACCESS_TOKEN_ERR(6119169, "Obtain access token from ct operator error"),
    C_ONE_KEY_OBTAIN_SERVER_TOKEN_ERR(6119405, "Obtain server token error"),
    C_MISSING_REQUIRED_PARAMS(6119095, "Missing required parameters"),
    C_ILLEGAL_PARAMS(6119096, "Illegal parameters"),
    C_RESPONSE_DATA_ABNORMAL(6119097, "Response data from server abnormal"),
    C_NETWORK_ERROR(6119098, "Network error"),
    C_UNKNOWN_ERROR(6119099, "Unknown error"),
    C_INIT_UNEXPECTED_ERROR(6119105, "Init unexpected error"),
    C_NOUI_SWITCH_OFF(6119107, "No UI Switch off"),
    C_NO_APPKEY(6119106, "appKey is null"),
    C_PREVERIFY_CATCH(6119125, "preVerify unkonwn exception"),
    C_VERIFY_CATCH(6119165, "verify unkonwn exception"),
    C_CONFIG_ERROR(6119170, "No operator configuration"),
    C_DECODE_ERROR(6119171, "Decode configuration error");

    private int code;
    private String message;

    VerifyErr(int i11, String str) {
        this.code = i11;
        this.message = h.a(i11, str);
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public static VerifyErr valueOf(int i11) {
        if (i11 == 6119405) {
            return C_ONE_KEY_OBTAIN_SERVER_TOKEN_ERR;
        }
        switch (i11) {
            case 6119000:
                return C_UNSUPPORTED_OPERATOR;
            case 6119001:
                return C_PHONE_INVALID;
            case 6119002:
                return C_NO_SIM;
            case 6119003:
                return C_LACK_OF_PERMISSIONS;
            case 6119004:
                return C_CELLULAR_DISABLED;
            default:
                switch (i11) {
                    case 6119095:
                        return C_MISSING_REQUIRED_PARAMS;
                    case 6119096:
                        return C_ILLEGAL_PARAMS;
                    case 6119097:
                        return C_RESPONSE_DATA_ABNORMAL;
                    case 6119098:
                        return C_NETWORK_ERROR;
                    case 6119099:
                        return C_UNKNOWN_ERROR;
                    default:
                        switch (i11) {
                            case 6119401:
                                return C_ONE_KEY_OBTAIN_OPERATOR_CONFIG_ERR;
                            case 6119402:
                                return C_ONE_KEY_LOGIN_ERR;
                            default:
                                return null;
                        }
                }
        }
    }
}
