package com.mob.tools.utils;

import android.text.TextUtils;
import com.mob.tools.MobLog;

/* loaded from: classes7.dex */
public abstract class e extends Thread {
    public e() {
    }

    public abstract void a();

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
    }

    public e(String str) {
        if (TextUtils.isEmpty("M-")) {
            return;
        }
        setName("M-" + str);
    }
}
