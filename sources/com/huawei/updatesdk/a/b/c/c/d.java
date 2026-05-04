package com.huawei.updatesdk.a.b.c.c;

import com.alipay.sdk.m.u.i;
import com.huawei.updatesdk.service.appmgr.bean.SDKNetTransmission;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class d extends b {
    public static final int ERROR = 1;
    public static final int NETWORK_ERROR = 3;
    public static final int OK = 0;
    public static final int PROGUARD_ERROR = 6;
    public static final int REQ_PARAM_ERROR = 5;
    public static final int RTN_CODE_OK = 0;
    public static final int TIMEOUT = 2;
    private String reason;
    private int responseCode = 1;

    @SDKNetTransmission
    private int rtnCode = 0;
    private a errCause = a.NORMAL;
    private int httpRespondeCode = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum a {
        NORMAL,
        NO_NETWORK,
        JSON_ERROR,
        PARAM_ERROR,
        IO_EXCEPTION,
        CONNECT_EXCEPTION,
        UNKNOWN_EXCEPTION,
        NO_PROGUARD
    }

    public a a() {
        return this.errCause;
    }

    public int b() {
        return this.httpRespondeCode;
    }

    public String c() {
        return this.reason;
    }

    public int d() {
        return this.responseCode;
    }

    public boolean e() {
        return d() == 0 && this.rtnCode == 0;
    }

    public String toString() {
        return " {responseCode: " + d() + ",rtnCode_: " + this.rtnCode + ",errCause: " + a() + i.f11099d;
    }

    public void a(int i11) {
        this.httpRespondeCode = i11;
    }

    public void b(int i11) {
        this.responseCode = i11;
    }

    public void a(a aVar) {
        this.errCause = aVar;
    }

    public void a(String str) {
        this.reason = str;
    }
}
