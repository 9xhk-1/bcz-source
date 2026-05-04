package i80;

import android.os.Looper;
import i80.f;
import i80.g;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.greenrobot.eventbus.EventBusException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class d {

    /* renamed from: n, reason: collision with root package name */
    public static final ExecutorService f60289n = Executors.newCachedThreadPool();

    /* renamed from: e, reason: collision with root package name */
    public boolean f60294e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f60296g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f60297h;

    /* renamed from: j, reason: collision with root package name */
    public List<Class<?>> f60299j;

    /* renamed from: k, reason: collision with root package name */
    public List<j80.d> f60300k;

    /* renamed from: l, reason: collision with root package name */
    public f f60301l;

    /* renamed from: m, reason: collision with root package name */
    public g f60302m;

    /* renamed from: a, reason: collision with root package name */
    public boolean f60290a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f60291b = true;

    /* renamed from: c, reason: collision with root package name */
    public boolean f60292c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f60293d = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f60295f = true;

    /* renamed from: i, reason: collision with root package name */
    public ExecutorService f60298i = f60289n;

    public d a(j80.d dVar) {
        if (this.f60300k == null) {
            this.f60300k = new ArrayList();
        }
        this.f60300k.add(dVar);
        return this;
    }

    public c b() {
        return new c(this);
    }

    public d c(boolean z11) {
        this.f60295f = z11;
        return this;
    }

    public d d(ExecutorService executorService) {
        this.f60298i = executorService;
        return this;
    }

    public Object e() {
        try {
            return Looper.getMainLooper();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public f f() {
        f fVar = this.f60301l;
        return fVar != null ? fVar : (!f.a.c() || e() == null) ? new f.c() : new f.a("EventBus");
    }

    public g g() {
        Object e11;
        g gVar = this.f60302m;
        if (gVar != null) {
            return gVar;
        }
        if (!f.a.c() || (e11 = e()) == null) {
            return null;
        }
        return new g.a((Looper) e11);
    }

    public d h(boolean z11) {
        this.f60296g = z11;
        return this;
    }

    public c i() {
        c cVar;
        synchronized (c.class) {
            try {
                if (c.f60260t != null) {
                    throw new EventBusException("Default instance already exists. It may be only set once before it's used the first time to ensure consistent behavior.");
                }
                c.f60260t = b();
                cVar = c.f60260t;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    public d j(boolean z11) {
        this.f60291b = z11;
        return this;
    }

    public d k(boolean z11) {
        this.f60290a = z11;
        return this;
    }

    public d l(f fVar) {
        this.f60301l = fVar;
        return this;
    }

    public d m(boolean z11) {
        this.f60293d = z11;
        return this;
    }

    public d n(boolean z11) {
        this.f60292c = z11;
        return this;
    }

    public d o(Class<?> cls) {
        if (this.f60299j == null) {
            this.f60299j = new ArrayList();
        }
        this.f60299j.add(cls);
        return this;
    }

    public d p(boolean z11) {
        this.f60297h = z11;
        return this;
    }

    public d q(boolean z11) {
        this.f60294e = z11;
        return this;
    }
}
