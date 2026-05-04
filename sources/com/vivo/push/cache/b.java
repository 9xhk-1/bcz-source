package com.vivo.push.cache;

import android.content.Context;
import com.vivo.push.util.p;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f44944a;

    /* renamed from: b, reason: collision with root package name */
    private d f44945b;

    private b() {
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            try {
                if (f44944a == null) {
                    f44944a = new b();
                }
                bVar = f44944a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    public final d a(Context context) {
        d dVar = this.f44945b;
        if (dVar != null) {
            return dVar;
        }
        try {
            Method method = ClientConfigManagerImpl.class.getMethod("getInstance", Context.class);
            p.d("ConfigManagerFactory", "createConfig success is ".concat("com.vivo.push.cache.ClientConfigManagerImpl"));
            d dVar2 = (d) method.invoke(null, context);
            this.f44945b = dVar2;
            return dVar2;
        } catch (Exception e11) {
            e11.printStackTrace();
            p.b("ConfigManagerFactory", "createConfig error", e11);
            return null;
        }
    }
}
