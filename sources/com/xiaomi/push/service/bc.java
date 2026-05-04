package com.xiaomi.push.service;

import com.xiaomi.push.hn;
import com.xiaomi.push.ho;

/* loaded from: classes8.dex */
/* synthetic */ class bc {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f46274a;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f46275b;

    static {
        int[] iArr = new int[ho.values().length];
        f46275b = iArr;
        try {
            iArr[ho.INT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f46275b[ho.LONG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f46275b[ho.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f46275b[ho.BOOLEAN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[hn.values().length];
        f46274a = iArr2;
        try {
            iArr2[hn.MISC_CONFIG.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f46274a[hn.PLUGIN_CONFIG.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
