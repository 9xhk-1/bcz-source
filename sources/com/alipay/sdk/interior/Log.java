package com.alipay.sdk.interior;

import android.content.Context;
import android.os.SystemClock;
import com.alipay.sdk.m.k.a;
import com.alipay.sdk.m.s.b;
import com.alipay.sdk.m.u.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class Log {

    /* renamed from: a, reason: collision with root package name */
    public static long f10456a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface ISdkLogCallback {
        void onLogLine(String str);
    }

    public static boolean forcedLogReport(Context context) {
        try {
            b.d().a(context);
            long elapsedRealtime = SystemClock.elapsedRealtime() / 1000;
            if (elapsedRealtime - f10456a < 600) {
                return false;
            }
            f10456a = elapsedRealtime;
            a.a(context);
            return true;
        } catch (Exception e11) {
            e.a(e11);
            return false;
        }
    }

    public static void setupLogCallback(ISdkLogCallback iSdkLogCallback) {
        e.a(iSdkLogCallback);
    }
}
