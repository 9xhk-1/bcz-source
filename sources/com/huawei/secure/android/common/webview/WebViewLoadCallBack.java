package com.huawei.secure.android.common.webview;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface WebViewLoadCallBack {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum ErrorCode {
        HTTP_URL,
        URL_NOT_IN_WHITE_LIST,
        OTHER
    }

    void a(String str, ErrorCode errorCode);
}
