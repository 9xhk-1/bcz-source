package com.mob.secverify.pure.core.ope.wo.net;

import android.net.Network;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class WoHttpManager {

    /* renamed from: a, reason: collision with root package name */
    private static volatile WoHttpManager f41092a;

    /* renamed from: b, reason: collision with root package name */
    private ExecutorService f41093b = Executors.newFixedThreadPool(5);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface ExcutorCallback {
        void complete(String str);
    }

    private WoHttpManager() {
    }

    public static WoHttpManager a() {
        if (f41092a == null) {
            synchronized (WoHttpManager.class) {
                try {
                    if (f41092a == null) {
                        f41092a = new WoHttpManager();
                    }
                } finally {
                }
            }
        }
        return f41092a;
    }

    public void a(final String str, final HashMap<String, String> hashMap, final Network network, final ExcutorCallback excutorCallback) {
        this.f41093b.submit(new Runnable() { // from class: com.mob.secverify.pure.core.ope.wo.net.WoHttpManager.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    excutorCallback.complete(new a().a(str, hashMap, network));
                } catch (Throwable unused) {
                }
            }
        });
    }
}
