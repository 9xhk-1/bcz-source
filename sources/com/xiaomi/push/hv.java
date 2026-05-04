package com.xiaomi.push;

/* loaded from: classes8.dex */
public enum hv {
    RegIdExpired(0),
    PackageUnregistered(1),
    Init(2);


    /* renamed from: a, reason: collision with other field name */
    private final int f584a;

    hv(int i11) {
        this.f584a = i11;
    }

    public int a() {
        return this.f584a;
    }

    public static hv a(int i11) {
        if (i11 == 0) {
            return RegIdExpired;
        }
        if (i11 == 1) {
            return PackageUnregistered;
        }
        if (i11 != 2) {
            return null;
        }
        return Init;
    }
}
