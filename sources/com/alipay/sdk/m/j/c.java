package com.alipay.sdk.m.j;

import androidx.media3.common.PlaybackException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public enum c {
    SUCCEEDED(9000, "处理成功"),
    FAILED(4000, "系统繁忙，请稍后再试"),
    CANCELED(6001, "用户取消"),
    NETWORK_ERROR(6002, "网络连接异常"),
    ACTIVITY_NOT_START_EXIT(PlaybackException.ERROR_CODE_DRM_DEVICE_REVOKED, "支付未完成"),
    PARAMS_ERROR(4001, "参数错误"),
    DOUBLE_REQUEST(5000, "重复请求"),
    PAY_WAITTING(8000, "支付结果确认中");


    /* renamed from: a, reason: collision with root package name */
    public int f10617a;

    /* renamed from: b, reason: collision with root package name */
    public String f10618b;

    c(int i11, String str) {
        this.f10617a = i11;
        this.f10618b = str;
    }

    public void a(int i11) {
        this.f10617a = i11;
    }

    public int b() {
        return this.f10617a;
    }

    public static c b(int i11) {
        return i11 != 4001 ? i11 != 5000 ? i11 != 8000 ? i11 != 9000 ? i11 != 6001 ? i11 != 6002 ? FAILED : NETWORK_ERROR : CANCELED : SUCCEEDED : PAY_WAITTING : DOUBLE_REQUEST : PARAMS_ERROR;
    }

    public void a(String str) {
        this.f10618b = str;
    }

    public String a() {
        return this.f10618b;
    }
}
