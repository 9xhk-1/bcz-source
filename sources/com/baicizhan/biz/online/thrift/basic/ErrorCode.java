package com.baicizhan.biz.online.thrift.basic;

import kotlin.jvm.internal.v;
import m00.c;
import m80.k;
import m80.l;
import w00.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class ErrorCode {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ ErrorCode[] $VALUES;

    @k
    public static final a Companion;

    @g
    public final int value;
    public static final ErrorCode SERVER_ERROR = new ErrorCode("SERVER_ERROR", 0, 1);
    public static final ErrorCode PARAM_ERROR = new ErrorCode("PARAM_ERROR", 1, 2);
    public static final ErrorCode NOT_FOUND = new ErrorCode("NOT_FOUND", 2, 3);
    public static final ErrorCode PASSWORD_ERROR = new ErrorCode("PASSWORD_ERROR", 3, 4);
    public static final ErrorCode EMAIL_FORMAT = new ErrorCode("EMAIL_FORMAT", 4, 5);
    public static final ErrorCode PHONE_FORMAT = new ErrorCode("PHONE_FORMAT", 5, 6);
    public static final ErrorCode PASSWORD_FORMAT = new ErrorCode("PASSWORD_FORMAT", 6, 7);
    public static final ErrorCode NOT_LOGIN = new ErrorCode("NOT_LOGIN", 7, 8);
    public static final ErrorCode ALREADY_IN_USE = new ErrorCode("ALREADY_IN_USE", 8, 9);
    public static final ErrorCode OPERATOR_SMS_LIMIT = new ErrorCode("OPERATOR_SMS_LIMIT", 9, 10);
    public static final ErrorCode PASSWORD_UNSET = new ErrorCode("PASSWORD_UNSET", 10, 11);
    public static final ErrorCode MAX_COLLECT_LIMIT = new ErrorCode("MAX_COLLECT_LIMIT", 11, 12);
    public static final ErrorCode VERSION_DEPRECATED = new ErrorCode("VERSION_DEPRECATED", 12, 13);
    public static final ErrorCode ENERGY_NOT_ENOUGH = new ErrorCode("ENERGY_NOT_ENOUGH", 13, 14);
    public static final ErrorCode GAME_STUDY_RECORD_ERROR = new ErrorCode("GAME_STUDY_RECORD_ERROR", 14, 15);
    public static final ErrorCode GAME_ROUND_ERROR = new ErrorCode("GAME_ROUND_ERROR", 15, 16);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @l
        public final ErrorCode a(int i11) {
            switch (i11) {
                case 1:
                    return ErrorCode.SERVER_ERROR;
                case 2:
                    return ErrorCode.PARAM_ERROR;
                case 3:
                    return ErrorCode.NOT_FOUND;
                case 4:
                    return ErrorCode.PASSWORD_ERROR;
                case 5:
                    return ErrorCode.EMAIL_FORMAT;
                case 6:
                    return ErrorCode.PHONE_FORMAT;
                case 7:
                    return ErrorCode.PASSWORD_FORMAT;
                case 8:
                    return ErrorCode.NOT_LOGIN;
                case 9:
                    return ErrorCode.ALREADY_IN_USE;
                case 10:
                    return ErrorCode.OPERATOR_SMS_LIMIT;
                case 11:
                    return ErrorCode.PASSWORD_UNSET;
                case 12:
                    return ErrorCode.MAX_COLLECT_LIMIT;
                case 13:
                    return ErrorCode.VERSION_DEPRECATED;
                case 14:
                    return ErrorCode.ENERGY_NOT_ENOUGH;
                case 15:
                    return ErrorCode.GAME_STUDY_RECORD_ERROR;
                case 16:
                    return ErrorCode.GAME_ROUND_ERROR;
                default:
                    return null;
            }
        }

        public a() {
        }
    }

    private static final /* synthetic */ ErrorCode[] $values() {
        return new ErrorCode[]{SERVER_ERROR, PARAM_ERROR, NOT_FOUND, PASSWORD_ERROR, EMAIL_FORMAT, PHONE_FORMAT, PASSWORD_FORMAT, NOT_LOGIN, ALREADY_IN_USE, OPERATOR_SMS_LIMIT, PASSWORD_UNSET, MAX_COLLECT_LIMIT, VERSION_DEPRECATED, ENERGY_NOT_ENOUGH, GAME_STUDY_RECORD_ERROR, GAME_ROUND_ERROR};
    }

    static {
        ErrorCode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
        Companion = new a(null);
    }

    private ErrorCode(String str, int i11, int i12) {
        this.value = i12;
    }

    @k
    public static m00.a<ErrorCode> getEntries() {
        return $ENTRIES;
    }

    public static ErrorCode valueOf(String str) {
        return (ErrorCode) Enum.valueOf(ErrorCode.class, str);
    }

    public static ErrorCode[] values() {
        return (ErrorCode[]) $VALUES.clone();
    }
}
