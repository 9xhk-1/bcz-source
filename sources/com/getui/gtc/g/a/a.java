package com.getui.gtc.g.a;

import android.content.Context;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Pair;
import com.getui.gtc.base.util.CommonUtil;
import com.igexin.push.GtPushInterface;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    Handler f30068a;

    /* renamed from: b, reason: collision with root package name */
    public GtPushInterface f30069b;

    public a(final b bVar) {
        final HandlerThread handlerThread = new HandlerThread("Plugin Handler Thread");
        handlerThread.start();
        this.f30068a = new Handler(handlerThread.getLooper()) { // from class: com.getui.gtc.g.a.a.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                try {
                } catch (Exception e11) {
                    com.getui.gtc.i.c.a.b(e11);
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a(false);
                    }
                }
                if (message.what < 0) {
                    b bVar3 = bVar;
                    if (bVar3 != null) {
                        bVar3.a(false);
                        return;
                    }
                    return;
                }
                boolean loadSdk = a.this.f30069b.loadSdk(message.getData());
                b bVar4 = bVar;
                if (bVar4 != null) {
                    bVar4.a(loadSdk);
                }
                handlerThread.quit();
                a.this.f30068a = null;
            }
        };
    }

    public static Pair<ServiceInfo, Class> a(Context context, Class cls) {
        try {
            ServiceInfo[] serviceInfoArr = CommonUtil.getPackageInfoForSelf(context).services;
            if (serviceInfoArr == null || serviceInfoArr.length <= 0) {
                com.getui.gtc.i.c.a.b("no any service");
            } else {
                int length = serviceInfoArr.length;
                for (int i11 = 0; i11 < length; i11++) {
                    ServiceInfo serviceInfo = serviceInfoArr[i11];
                    try {
                        Class<?> cls2 = Class.forName(serviceInfo.name);
                        if (cls2 != cls) {
                            Class<?> cls3 = cls2;
                            for (int i12 = 5; cls3 != null && cls != null && i12 > 0; i12--) {
                                if (cls3 == cls) {
                                    return Pair.create(serviceInfo, cls2);
                                }
                                if (cls3.getSuperclass() != null) {
                                    cls3 = cls3.getSuperclass();
                                }
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.a("findGtImplClassInManifest error", th2);
        }
        return Pair.create(null, null);
    }

    public final void a(String str, String str2, String str3, String str4, String str5) {
        Bundle bundle = new Bundle();
        bundle.putString("dp", str);
        bundle.putString("od", str2);
        bundle.putString(AdvanceSetting.CLEAR_NOTIFICATION, str3);
        bundle.putString("ad", str4);
        bundle.putString("gd", str5);
        Message obtain = Message.obtain();
        obtain.setData(bundle);
        obtain.what = 0;
        Handler handler = this.f30068a;
        if (handler != null) {
            obtain.setTarget(handler);
            obtain.sendToTarget();
        }
    }
}
