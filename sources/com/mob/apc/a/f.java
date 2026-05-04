package com.mob.apc.a;

import com.mob.tools.MobLog;

/* loaded from: classes7.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static f f40084a = new f();

    private f() {
    }

    public static f a() {
        return f40084a;
    }

    public void b(String str, Object... objArr) {
        MobLog.getInstance().i("[MC][APC]" + String.format(str, objArr));
    }

    public void a(Throwable th2) {
        MobLog.getInstance().d(th2, "%s", "[MC][APC]");
    }

    public void a(String str, Object... objArr) {
        MobLog.getInstance().d("[MC][APC]" + String.format(str, objArr), new Object[0]);
    }
}
