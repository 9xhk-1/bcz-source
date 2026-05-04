package com.mob.secverify.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public enum a {
    NO_ERROR(200, "成功"),
    Init_Server_Error(6119101, "初始化失败"),
    Init_Unexpected_Error(6119105, "初始化异常"),
    Init_No_Net(6119102, "未开启任何网络"),
    Init_No_Privacy(6119103, "未接受Mob隐私协议"),
    Init_APPKEY_NULL(6119106, "AppKey为空"),
    Init_Timeout(6119104, "初始化超时"),
    PREVERIFY_Timeout(6119124, "预取号超时"),
    AUTHPAGE_Timeout(6119144, "拉起授权登录页超时"),
    VERIFY_Timeout(6119164, "置换运营商token超时");


    /* renamed from: k, reason: collision with root package name */
    private int f40693k;

    /* renamed from: l, reason: collision with root package name */
    private String f40694l;

    a(int i11, String str) {
        this.f40693k = i11;
        this.f40694l = str;
    }

    public int a() {
        return this.f40693k;
    }

    public String b() {
        return this.f40694l;
    }
}
