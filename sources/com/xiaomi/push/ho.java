package com.xiaomi.push;

/* loaded from: classes8.dex */
public enum ho {
    INT(1),
    LONG(2),
    STRING(3),
    BOOLEAN(4);


    /* renamed from: a, reason: collision with other field name */
    private final int f526a;

    ho(int i11) {
        this.f526a = i11;
    }

    public static ho a(int i11) {
        if (i11 == 1) {
            return INT;
        }
        if (i11 == 2) {
            return LONG;
        }
        if (i11 == 3) {
            return STRING;
        }
        if (i11 != 4) {
            return null;
        }
        return BOOLEAN;
    }
}
