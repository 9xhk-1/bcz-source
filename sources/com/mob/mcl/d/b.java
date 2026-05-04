package com.mob.mcl.d;

import com.mob.tools.MobLog;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static b f40552a = new b();

    private b() {
    }

    public static b a() {
        return f40552a;
    }

    public void b(String str) {
        MobLog.getInstance().d("[MC][MCL]" + str, new Object[0]);
    }

    public void a(String str) {
        MobLog.getInstance().d("[MC][MCL]" + str, new Object[0]);
    }

    public void a(Throwable th2) {
        MobLog.getInstance().d(th2, "%s", "[MC][MCL]");
    }

    public void a(String str, Throwable th2) {
        MobLog.getInstance().d(th2, "%s", "[MC][MCL] " + str);
    }
}
