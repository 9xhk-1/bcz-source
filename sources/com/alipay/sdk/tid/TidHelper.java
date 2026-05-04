package com.alipay.sdk.tid;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.alipay.sdk.m.q.c;
import com.alipay.sdk.m.s.a;
import com.alipay.sdk.m.s.b;
import com.alipay.sdk.m.u.e;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class TidHelper {
    public static void a(Context context) {
        if (context == null) {
            return;
        }
        b.d().a(context);
    }

    public static Tid b(Context context) throws Exception {
        try {
            com.alipay.sdk.m.p.b a11 = new c().a(a.h(), context);
            if (a11 != null) {
                JSONObject jSONObject = new JSONObject(a11.a());
                com.alipay.sdk.m.t.a a12 = com.alipay.sdk.m.t.a.a(context);
                String optString = jSONObject.optString("tid");
                String string = jSONObject.getString(com.alipay.sdk.m.t.a.f11033j);
                if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(string)) {
                    a12.a(optString, string);
                }
                return a(context, a12);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static void clearTID(Context context) {
        com.alipay.sdk.m.t.a.a(context).a();
    }

    public static String getIMEI(Context context) {
        a(context);
        return com.alipay.sdk.m.u.c.b(context).b();
    }

    public static String getIMSI(Context context) {
        a(context);
        return com.alipay.sdk.m.u.c.b(context).c();
    }

    public static synchronized String getTIDValue(Context context) {
        String tid;
        synchronized (TidHelper.class) {
            try {
                Tid loadOrCreateTID = loadOrCreateTID(context);
                tid = Tid.isEmpty(loadOrCreateTID) ? "" : loadOrCreateTID.getTid();
            } finally {
            }
        }
        return tid;
    }

    public static String getVirtualImei(Context context) {
        a(context);
        com.alipay.sdk.m.m.b.b();
        return com.alipay.sdk.m.m.b.f();
    }

    public static String getVirtualImsi(Context context) {
        a(context);
        com.alipay.sdk.m.m.b.b();
        return com.alipay.sdk.m.m.b.g();
    }

    public static Tid loadLocalTid(Context context) {
        com.alipay.sdk.m.t.a a11 = com.alipay.sdk.m.t.a.a(context);
        if (a11.h()) {
            return null;
        }
        return new Tid(a11.d(), a11.c(), a11.e().longValue());
    }

    public static synchronized Tid loadOrCreateTID(Context context) {
        synchronized (TidHelper.class) {
            e.b(com.alipay.sdk.m.l.a.A, "load_create_tid");
            a(context);
            Tid loadTID = loadTID(context);
            if (Tid.isEmpty(loadTID)) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    return null;
                }
                try {
                    loadTID = b(context);
                } catch (Throwable unused) {
                }
            }
            return loadTID;
        }
    }

    public static Tid loadTID(Context context) {
        a(context);
        Tid a11 = a(context, com.alipay.sdk.m.t.a.a(context));
        if (a11 == null) {
            e.b(com.alipay.sdk.m.l.a.A, "load_tid null");
        }
        return a11;
    }

    public static boolean resetTID(Context context) throws Exception {
        Tid tid;
        e.b(com.alipay.sdk.m.l.a.A, "reset_tid");
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new Exception("Must be called on worker thread");
        }
        a(context);
        clearTID(context);
        try {
            tid = b(context);
        } catch (Throwable unused) {
            tid = null;
        }
        return !Tid.isEmpty(tid);
    }

    public static Tid a(Context context, com.alipay.sdk.m.t.a aVar) {
        if (aVar == null || aVar.i()) {
            return null;
        }
        return new Tid(aVar.d(), aVar.c(), aVar.e().longValue());
    }
}
