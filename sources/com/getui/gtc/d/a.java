package com.getui.gtc.d;

import android.os.Handler;
import android.os.HandlerThread;
import com.getui.gtc.BuildConfig;
import com.getui.gtc.api.GtcIdCallback;
import com.getui.gtc.api.SdkInfo;
import com.getui.gtc.base.GtcProvider;
import com.getui.gtc.entity.a;
import com.getui.gtc.g.c;
import com.getui.gtc.i.d.b;
import com.getui.gtc.server.ServerManager;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    final c f29835a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f29836b;

    /* renamed from: com.getui.gtc.d.a$a, reason: collision with other inner class name */
    public static class C0349a {

        /* renamed from: a, reason: collision with root package name */
        private static final a f29846a = new a(0);
    }

    private a() {
        c cVar;
        b unused;
        HandlerThread handlerThread = new HandlerThread("Gtc HandlerThread");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f29836b = handler;
        cVar = c.a.f30094a;
        this.f29835a = cVar;
        com.getui.gtc.c.b.a();
        unused = b.C0360b.f30118a;
        com.getui.gtc.a.a.a();
        handler.post(new Runnable() { // from class: com.getui.gtc.d.a.4
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    SdkInfo.Builder psUrl = new SdkInfo.Builder().moduleName("GTC").version(BuildConfig.VERSION_NAME).appid(com.getui.gtc.c.b.f29824a).cid(com.getui.gtc.c.b.f29827d).psUrl(String.format("%s/api.php?format=json&t=1", ServerManager.getServer("gtc.cs")));
                    try {
                        Class.forName("com.getui.gtc.extension.distribution.gbd.stub.PushExtension");
                        psUrl.addStub("com.getui.gtc.extension.distribution.gbd.stub.PushExtension", false);
                    } catch (ClassNotFoundException unused2) {
                        com.getui.gtc.i.c.a.a("no local gbd");
                    }
                    try {
                        Class.forName("com.getui.gtc.extension.distribution.gws.stub.PushExtension");
                        psUrl.addStub("com.getui.gtc.extension.distribution.gws.stub.PushExtension", false);
                    } catch (ClassNotFoundException unused3) {
                        com.getui.gtc.i.c.a.a("no local gws");
                    }
                    a.this.f29835a.a(psUrl.build());
                } catch (Throwable th2) {
                    com.getui.gtc.i.c.a.b(th2);
                }
            }
        });
    }

    public final String a(final GtcIdCallback gtcIdCallback) {
        this.f29836b.post(new Runnable() { // from class: com.getui.gtc.d.a.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    com.getui.gtc.c.b.a(gtcIdCallback);
                } catch (Exception e11) {
                    com.getui.gtc.i.c.a.c(e11);
                }
            }
        });
        com.getui.gtc.i.c.a.a("gtcid is " + com.getui.gtc.c.b.f29827d);
        return com.getui.gtc.c.b.f29827d;
    }

    public /* synthetic */ a(byte b11) {
        this();
    }

    public final void a(final int i11) {
        this.f29836b.post(new Runnable() { // from class: com.getui.gtc.d.a.3
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    com.getui.gtc.a.a.a(i11);
                } catch (Throwable th2) {
                    com.getui.gtc.i.c.a.b(th2);
                }
            }
        });
    }

    public final void a(final SdkInfo sdkInfo) {
        this.f29836b.post(new Runnable() { // from class: com.getui.gtc.d.a.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    a.this.f29835a.a(sdkInfo);
                } catch (Throwable th2) {
                    com.getui.gtc.i.c.a.b(th2);
                }
            }
        });
    }

    public final void a(final int[] iArr) {
        this.f29836b.post(new Runnable() { // from class: com.getui.gtc.d.a.5
            @Override // java.lang.Runnable
            public final void run() {
                com.getui.gtc.entity.a a11;
                a.C0358a b11;
                try {
                    if (iArr == null) {
                        return;
                    }
                    com.getui.gtc.i.c.a.a("remove gtcFile id: " + Arrays.toString(iArr));
                    for (int i11 : iArr) {
                        Map<String, Map<String, String>> a12 = com.getui.gtc.dyc.b.a.a(GtcProvider.context());
                        if (a12 == null) {
                            return;
                        }
                        Iterator<Map.Entry<String, Map<String, String>>> it = a12.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry<String, Map<String, String>> next = it.next();
                            Map<String, String> value = next.getValue();
                            if (value != null && (a11 = com.getui.gtc.entity.a.a(value)) != null && (b11 = a11.b(i11)) != null) {
                                com.getui.gtc.i.c.a.a("found gtcFile id: " + i11 + ", remove it");
                                a.this.f29835a.a(b11.f30050c);
                                a11.f30045a.remove(i11);
                                value.put("ext_infos", a11.a());
                                com.getui.gtc.dyc.b.a.a(GtcProvider.context(), next.getKey(), value);
                                break;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    com.getui.gtc.i.c.a.b(th2);
                }
            }
        });
    }
}
