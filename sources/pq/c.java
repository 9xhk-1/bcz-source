package pq;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class c extends mq.c {

    /* renamed from: b, reason: collision with root package name */
    public static final Map<String, mq.c> f81111b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final Object f81112c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static String f81113d;

    /* renamed from: a, reason: collision with root package name */
    public oq.a f81114a;

    public c(Context context, String str) {
        this.f81114a = oq.a.c(context, str);
    }

    public static mq.c n() {
        return q(f81113d);
    }

    public static mq.c o(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        String packageName = context.getPackageName();
        f81113d = packageName;
        return p(context, packageName);
    }

    public static mq.c p(Context context, String str) {
        mq.c cVar;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName can not be empty");
        }
        synchronized (f81112c) {
            try {
                Map<String, mq.c> map = f81111b;
                cVar = map.get(str);
                if (cVar == null) {
                    map.put(str, new c(context, str));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    public static mq.c q(String str) {
        mq.c cVar;
        synchronized (f81112c) {
            try {
                cVar = f81111b.get(str);
                if (cVar == null) {
                    throw new IllegalStateException("you should call AGConnectApp.initialize first");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    @Override // mq.c
    public void e(String str) {
        this.f81114a.f(mq.f.f73641i, str);
    }

    @Override // mq.c
    public void f(String str) {
        this.f81114a.f(mq.f.f73639g, str);
    }

    @Override // mq.c
    public void g(String str) {
        this.f81114a.f(mq.f.f73642j, str);
    }

    @Override // mq.c
    public void h(String str) {
        this.f81114a.f(mq.f.f73643k, str);
    }

    @Override // mq.c
    public void i(String str) {
        this.f81114a.f(mq.f.f73640h, str);
    }

    @Override // mq.c
    public void j(mq.g gVar) {
        ((rq.b) mq.d.d()).q(gVar);
    }

    @Override // mq.c
    public void k(mq.h hVar) {
        ((rq.b) mq.d.d()).r(hVar);
    }

    @Override // mq.c
    public void l(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("path can not be empty");
        }
        this.f81114a.f(str, str2);
    }

    @Override // mq.c
    public void m(String str) {
        this.f81114a.f(mq.f.f73638f, str);
    }
}
