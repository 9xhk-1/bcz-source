package com.mob.secverify.pure.core.ope.wo.core;

import android.content.Context;
import com.mob.secverify.pure.core.ope.wo.listener.WoCallback;
import java.net.URLDecoder;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class WoExecutor {

    /* renamed from: a, reason: collision with root package name */
    public com.mob.secverify.pure.core.ope.wo.listener.a f41068a;

    /* renamed from: b, reason: collision with root package name */
    private ScheduledExecutorService f41069b;

    /* renamed from: c, reason: collision with root package name */
    private String f41070c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Callback {
        void onResult(String str);
    }

    public void a(Context context, int i11, int i12, Callback callback) {
        this.f41068a = new com.mob.secverify.pure.core.ope.wo.listener.a(callback);
        try {
            a();
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);
            this.f41069b = newScheduledThreadPool;
            newScheduledThreadPool.schedule(new Runnable() { // from class: com.mob.secverify.pure.core.ope.wo.core.WoExecutor.1
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (WoExecutor.class) {
                        try {
                            com.mob.secverify.pure.core.ope.wo.listener.a aVar = WoExecutor.this.f41068a;
                            if (aVar != null) {
                                aVar.a(10000, com.alipay.sdk.m.m.a.f10784h0);
                                WoExecutor woExecutor = WoExecutor.this;
                                woExecutor.f41068a = null;
                                woExecutor.a();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }, i11, TimeUnit.MILLISECONDS);
            a(context, i12);
        } catch (Throwable unused) {
        }
    }

    private void a(Context context, int i11) {
        this.f41070c = com.mob.secverify.pure.core.ope.wo.c.c.a();
        b.a().a(context, i11, this.f41070c, new WoCallback() { // from class: com.mob.secverify.pure.core.ope.wo.core.WoExecutor.2
            @Override // com.mob.secverify.pure.core.ope.wo.listener.WoCallback
            public void onResult(int i12, String str) {
                synchronized (WoExecutor.class) {
                    try {
                        WoExecutor woExecutor = WoExecutor.this;
                        if (woExecutor.f41068a == null) {
                            return;
                        }
                        woExecutor.a();
                        if (i12 == 0) {
                            try {
                                JSONObject jSONObject = new JSONObject(str);
                                int optInt = jSONObject.optInt("code");
                                String optString = jSONObject.optString("msg");
                                String optString2 = jSONObject.optString("data");
                                if (optInt == 0) {
                                    WoExecutor.this.f41068a.a(optString, URLDecoder.decode(com.mob.secverify.pure.core.ope.wo.c.c.b(optString2, WoExecutor.this.f41070c), "UTF-8"));
                                } else {
                                    WoExecutor.this.f41068a.a(optInt, optString, optString2);
                                }
                            } catch (Exception e11) {
                                WoExecutor.this.f41068a.a(10002, "异常" + e11.getMessage(), str);
                            }
                        } else {
                            WoExecutor.this.f41068a.a(i12, str);
                        }
                        WoExecutor.this.f41068a = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        try {
            ScheduledExecutorService scheduledExecutorService = this.f41069b;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
                this.f41069b = null;
            }
        } catch (Exception unused) {
        }
    }
}
