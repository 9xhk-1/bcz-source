package com.huawei.hms.support.api.entity.auth;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface AuthCode {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface ErrorCode {
        public static final int CERT_FINGERPRINT_EMPTY = 907135702;
        public static final int GET_SCOPE_ERROR = 907135700;
        public static final int PERMISSION_LIST_EMPTY = 907135703;
        public static final int SCOPE_LIST_EMPTY = 907135701;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface StatusCode {
        public static final int AUTH_INFO_NOT_EXIST = 6002;
        public static final int CERT_FINGERPRINT_ERROR = 6003;
        public static final int OK = 0;
        public static final int PERMISSION_EXPIRED = 6006;
        public static final int PERMISSION_NOT_AUTHORIZED = 6005;
        public static final int PERMISSION_NOT_EXIST = 6004;
        public static final int WAITING_CONNECT = 6001;
    }
}
