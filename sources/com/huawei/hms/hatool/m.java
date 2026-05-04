package com.huawei.hms.hatool;

import android.content.Context;
import com.heytap.mcssdk.constant.IntentConstant;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    private static m f35864b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f35865c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private Context f35866a;

    private m() {
    }

    public static m a() {
        if (f35864b == null) {
            b();
        }
        return f35864b;
    }

    private static synchronized void b() {
        synchronized (m.class) {
            if (f35864b == null) {
                f35864b = new m();
            }
        }
    }

    public void a(Context context) {
        synchronized (f35865c) {
            try {
                if (this.f35866a != null) {
                    v.f("hmsSdk", "DataManager already initialized.");
                    return;
                }
                this.f35866a = context;
                s.c().b().a(this.f35866a);
                s.c().b().j(context.getPackageName());
                j.a().a(context);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(String str) {
        v.c("hmsSdk", "HiAnalyticsDataManager.setAppid(String appid) is execute.");
        Context context = this.f35866a;
        if (context == null) {
            v.e("hmsSdk", "sdk is not init");
        } else {
            s.c().b().i(e1.a(IntentConstant.APP_ID, str, "[a-zA-Z0-9_][a-zA-Z0-9. _-]{0,255}", context.getPackageName()));
        }
    }
}
