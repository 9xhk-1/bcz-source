package com.baicizhan.client.business.auth;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class AuthException extends Exception {
    public static final int CODE_LOAD_BITMAP_FAILED = -5;
    public static final int CODE_QQ_EMPTY_ACCESS_TOKEN = -6;
    public static final int CODE_QQ_EMPTY_USER_INFO = -7;
    public static final int CODE_QQ_NOT_INSTALLED = -8;
    public static final int CODE_WB_NOT_INSTALLED = -9;
    public static final int CODE_WX_EMPTY_ACCESS_TOKEN = -1;
    public static final int CODE_WX_EMPTY_USER_INFO = -2;
    public static final int CODE_WX_NOT_INSTALLED = -4;
    public static final int CODE_WX_SHARE_FAILED = -3;
    private int code;

    public AuthException(int code) {
        this(code, parseCode(code));
    }

    public static String parseCode(int code) {
        switch (code) {
            case -9:
                return "没有安装微博";
            case -8:
                return "没有安装QQ";
            case -7:
            case -2:
                return "空的用户信息";
            case -6:
            case -1:
                return "空的 access token";
            case -5:
                return "加载位图失败";
            case -4:
                return "没有安装微信";
            case -3:
                return "微信分享失败";
            default:
                return "未知错误";
        }
    }

    public int getCode() {
        return this.code;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return this.code + "#" + super.toString();
    }

    public AuthException(int code, String message) {
        super(message);
        this.code = code;
    }
}
