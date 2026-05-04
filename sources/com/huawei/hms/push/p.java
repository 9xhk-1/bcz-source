package com.huawei.hms.push;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.support.log.HMSLog;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class p extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public Context f36217a;

    /* renamed from: b, reason: collision with root package name */
    public k f36218b;

    public p(Context context, k kVar) {
        this.f36217a = context;
        this.f36218b = kVar;
    }

    public static Intent a(Context context, k kVar) {
        Intent parseUri;
        if (kVar == null) {
            return null;
        }
        Intent b11 = q.b(context, kVar.d());
        if (kVar.n() == null) {
            if (kVar.a() != null) {
                Intent intent = new Intent(kVar.a());
                if (q.a(context, kVar.d(), intent).booleanValue()) {
                    b11 = intent;
                }
            }
            b11.setPackage(kVar.d());
            return b11;
        }
        try {
            parseUri = Intent.parseUri(kVar.n(), 0);
            parseUri.setSelector(null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Intent.parseUri(msg.intentUri, 0), action:");
            sb2.append(parseUri.getAction());
            HMSLog.d("PushSelfShowLog", sb2.toString());
        } catch (Exception e11) {
            HMSLog.w("PushSelfShowLog", "intentUri error," + e11.toString());
        }
        return q.a(context, kVar.d(), parseUri).booleanValue() ? parseUri : b11;
    }

    public final boolean b(Context context) {
        if ("cosa".equals(this.f36218b.i())) {
            return a(context);
        }
        return true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        HMSLog.i("PushSelfShowLog", "enter run()");
        try {
            if (b(this.f36217a) && !b(this.f36217a, this.f36218b)) {
                o.a(this.f36217a, this.f36218b);
            }
        } catch (Exception e11) {
            HMSLog.e("PushSelfShowLog", e11.toString());
        }
    }

    public final boolean b(Context context, k kVar) {
        if (!"cosa".equals(kVar.i()) || a(context, kVar) != null) {
            return false;
        }
        HMSLog.d("PushSelfShowLog", "launchCosaApp,intent == null");
        return true;
    }

    public final boolean a(Context context) {
        return q.c(context, this.f36218b.d());
    }
}
