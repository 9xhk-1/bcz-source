package com.xiaomi.push;

/* loaded from: classes8.dex */
public enum hn {
    MISC_CONFIG(1),
    PLUGIN_CONFIG(2);


    /* renamed from: a, reason: collision with other field name */
    private final int f524a;

    hn(int i11) {
        this.f524a = i11;
    }

    public int a() {
        return this.f524a;
    }

    public static hn a(int i11) {
        if (i11 == 1) {
            return MISC_CONFIG;
        }
        if (i11 != 2) {
            return null;
        }
        return PLUGIN_CONFIG;
    }
}
