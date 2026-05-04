package com.mob.mgs.impl;

import com.mob.tools.MobLog;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static e f40601a = new e();

    private e() {
    }

    public static e a() {
        return f40601a;
    }

    public void b(String str) {
        MobLog.getInstance().d("[MC][MGS]" + str, new Object[0]);
    }

    public void a(String str) {
        MobLog.getInstance().d("[MC][MGS]" + str, new Object[0]);
    }

    public void b(Throwable th2) {
        MobLog.getInstance().e(th2, "%s", "[MC][MGS]");
    }

    public void a(Throwable th2) {
        MobLog.getInstance().d(th2, "%s", "[MC][MGS]");
    }

    public void a(String str, Throwable th2) {
        MobLog.getInstance().d(th2, "%s", "[MC][MGS] " + str);
    }
}
