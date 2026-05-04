package com.bun.miitmdid;

import com.huawei.hms.android.SystemUtils;
import com.igexin.assist.util.AssistUtils;

/* loaded from: classes6.dex */
public enum c {
    UNSUPPORT(-1, "unsupport"),
    HUAWEI(0, SystemUtils.PRODUCT_HUAWEI),
    XIAOMI(1, "Xiaomi"),
    VIVO(2, "vivo"),
    OPPO(3, "oppo"),
    MOTO(4, "motorola"),
    LENOVO(5, "lenovo"),
    ASUS(6, "asus"),
    SAMSUNG(7, com.google.android.material.internal.l.f31607b),
    MEIZU(8, "meizu"),
    NUBIA(10, "nubia"),
    ZTE(11, "ZTE"),
    ONEPLUS(12, "OnePlus"),
    BLACKSHARK(13, "blackshark"),
    FREEMEOS(30, "freemeos"),
    PRIZE(32, "prize"),
    REALME(33, "realme"),
    HONOR(34, AssistUtils.BRAND_HON),
    COOLPAD(35, "coolpad"),
    EEBBK(36, "EEBBK"),
    CHUANGLIAN(37, "ChuangLian"),
    CHINATELECOM(38, "ChinaTelecom"),
    OS360(39, "360UI");


    /* renamed from: y, reason: collision with root package name */
    public int f28900y;

    /* renamed from: z, reason: collision with root package name */
    public String f28901z;

    c(int i11, String str) {
        this.f28900y = i11;
        this.f28901z = str;
    }

    public static native c a(String str);

    public static native c valueOf(String str);

    public static native c[] values();
}
