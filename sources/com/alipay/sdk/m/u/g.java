package com.alipay.sdk.m.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public enum g {
    WIFI(0, "WIFI"),
    NETWORK_TYPE_1(1, "unicom2G"),
    NETWORK_TYPE_2(2, "mobile2G"),
    NETWORK_TYPE_4(4, "telecom2G"),
    NETWORK_TYPE_5(5, "telecom3G"),
    NETWORK_TYPE_6(6, "telecom3G"),
    NETWORK_TYPE_12(12, "telecom3G"),
    NETWORK_TYPE_8(8, "unicom3G"),
    NETWORK_TYPE_3(3, "unicom3G"),
    NETWORK_TYPE_13(13, "LTE"),
    NETWORK_TYPE_11(11, "IDEN"),
    NETWORK_TYPE_9(9, "HSUPA"),
    NETWORK_TYPE_10(10, "HSPA"),
    NETWORK_TYPE_15(15, "HSPAP"),
    NETWORK_TYPE_20(20, "5G"),
    NONE(-1, "none");


    /* renamed from: a, reason: collision with root package name */
    public int f11072a;

    /* renamed from: b, reason: collision with root package name */
    public String f11073b;

    g(int i11, String str) {
        this.f11072a = i11;
        this.f11073b = str;
    }

    public final int a() {
        return this.f11072a;
    }

    public final String b() {
        return this.f11073b;
    }

    public static g a(int i11) {
        for (g gVar : values()) {
            if (gVar.a() == i11) {
                return gVar;
            }
        }
        return NONE;
    }
}
