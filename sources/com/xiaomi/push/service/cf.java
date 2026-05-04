package com.xiaomi.push.service;

import com.xiaomi.push.hh;

/* loaded from: classes8.dex */
/* synthetic */ class cf {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f46352a;

    static {
        int[] iArr = new int[hh.values().length];
        f46352a = iArr;
        try {
            iArr[hh.Registration.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f46352a[hh.UnRegistration.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f46352a[hh.Subscription.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f46352a[hh.UnSubscription.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f46352a[hh.SendMessage.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f46352a[hh.AckMessage.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f46352a[hh.SetConfig.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f46352a[hh.ReportFeedback.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f46352a[hh.Notification.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f46352a[hh.Command.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
