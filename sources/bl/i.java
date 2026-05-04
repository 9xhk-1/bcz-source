package bl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.DrawableRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import cl.o;
import cl.p;
import com.bumptech.glide.Priority;
import com.bumptech.glide.d;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestCoordinator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kk.j;
import kk.k;
import kk.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class i<R> implements d, o, h {
    public static final String F = "Glide";

    @GuardedBy("requestLock")
    public int A;

    @GuardedBy("requestLock")
    public int B;

    @GuardedBy("requestLock")
    public boolean C;

    @Nullable
    public RuntimeException D;

    /* renamed from: a, reason: collision with root package name */
    public int f6935a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f6936b;

    /* renamed from: c, reason: collision with root package name */
    public final gl.c f6937c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f6938d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public final f<R> f6939e;

    /* renamed from: f, reason: collision with root package name */
    public final RequestCoordinator f6940f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f6941g;

    /* renamed from: h, reason: collision with root package name */
    public final com.bumptech.glide.e f6942h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public final Object f6943i;

    /* renamed from: j, reason: collision with root package name */
    public final Class<R> f6944j;

    /* renamed from: k, reason: collision with root package name */
    public final bl.a<?> f6945k;

    /* renamed from: l, reason: collision with root package name */
    public final int f6946l;

    /* renamed from: m, reason: collision with root package name */
    public final int f6947m;

    /* renamed from: n, reason: collision with root package name */
    public final Priority f6948n;

    /* renamed from: o, reason: collision with root package name */
    public final p<R> f6949o;

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    public final List<f<R>> f6950p;

    /* renamed from: q, reason: collision with root package name */
    public final dl.g<? super R> f6951q;

    /* renamed from: r, reason: collision with root package name */
    public final Executor f6952r;

    /* renamed from: s, reason: collision with root package name */
    @GuardedBy("requestLock")
    public u<R> f6953s;

    /* renamed from: t, reason: collision with root package name */
    @GuardedBy("requestLock")
    public k.d f6954t;

    /* renamed from: u, reason: collision with root package name */
    @GuardedBy("requestLock")
    public long f6955u;

    /* renamed from: v, reason: collision with root package name */
    public volatile k f6956v;

    /* renamed from: w, reason: collision with root package name */
    @GuardedBy("requestLock")
    public a f6957w;

    /* renamed from: x, reason: collision with root package name */
    @Nullable
    @GuardedBy("requestLock")
    public Drawable f6958x;

    /* renamed from: y, reason: collision with root package name */
    @Nullable
    @GuardedBy("requestLock")
    public Drawable f6959y;

    /* renamed from: z, reason: collision with root package name */
    @Nullable
    @GuardedBy("requestLock")
    public Drawable f6960z;
    public static final String E = "GlideRequest";
    public static final boolean G = Log.isLoggable(E, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public i(Context context, com.bumptech.glide.e eVar, @NonNull Object obj, @Nullable Object obj2, Class<R> cls, bl.a<?> aVar, int i11, int i12, Priority priority, p<R> pVar, @Nullable f<R> fVar, @Nullable List<f<R>> list, RequestCoordinator requestCoordinator, k kVar, dl.g<? super R> gVar, Executor executor) {
        this.f6936b = G ? String.valueOf(super.hashCode()) : null;
        this.f6937c = gl.c.a();
        this.f6938d = obj;
        this.f6941g = context;
        this.f6942h = eVar;
        this.f6943i = obj2;
        this.f6944j = cls;
        this.f6945k = aVar;
        this.f6946l = i11;
        this.f6947m = i12;
        this.f6948n = priority;
        this.f6949o = pVar;
        this.f6939e = fVar;
        this.f6950p = list;
        this.f6940f = requestCoordinator;
        this.f6956v = kVar;
        this.f6951q = gVar;
        this.f6952r = executor;
        this.f6957w = a.PENDING;
        if (this.D == null && eVar.g().b(d.C0336d.class)) {
            this.D = new RuntimeException("Glide request origin trace");
        }
    }

    public static int u(int i11, float f11) {
        return i11 == Integer.MIN_VALUE ? i11 : Math.round(f11 * i11);
    }

    public static <R> i<R> x(Context context, com.bumptech.glide.e eVar, Object obj, Object obj2, Class<R> cls, bl.a<?> aVar, int i11, int i12, Priority priority, p<R> pVar, f<R> fVar, @Nullable List<f<R>> list, RequestCoordinator requestCoordinator, k kVar, dl.g<? super R> gVar, Executor executor) {
        return new i<>(context, eVar, obj, obj2, cls, aVar, i11, i12, priority, pVar, fVar, list, requestCoordinator, kVar, gVar, executor);
    }

    @GuardedBy("requestLock")
    public final void A() {
        if (k()) {
            Drawable p11 = this.f6943i == null ? p() : null;
            if (p11 == null) {
                p11 = o();
            }
            if (p11 == null) {
                p11 = q();
            }
            this.f6949o.m(p11);
        }
    }

    @Override // bl.h
    public void a(GlideException glideException) {
        y(glideException, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bl.h
    public void b(u<?> uVar, DataSource dataSource, boolean z11) {
        this.f6937c.c();
        u<?> uVar2 = null;
        try {
            synchronized (this.f6938d) {
                try {
                    this.f6954t = null;
                    if (uVar == null) {
                        a(new GlideException("Expected to receive a Resource<R> with an object of " + this.f6944j + " inside, but instead got null."));
                        return;
                    }
                    Object obj = uVar.get();
                    try {
                        if (obj != null && this.f6944j.isAssignableFrom(obj.getClass())) {
                            if (l()) {
                                z(uVar, obj, dataSource, z11);
                                return;
                            }
                            this.f6953s = null;
                            this.f6957w = a.COMPLETE;
                            gl.b.g(E, this.f6935a);
                            this.f6956v.l(uVar);
                        }
                        this.f6953s = null;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected to receive an object of ");
                        sb2.append(this.f6944j);
                        sb2.append(" but instead got ");
                        sb2.append(obj != null ? obj.getClass() : "");
                        sb2.append("{");
                        sb2.append(obj);
                        sb2.append("} inside Resource{");
                        sb2.append(uVar);
                        sb2.append("}.");
                        sb2.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        a(new GlideException(sb2.toString()));
                        this.f6956v.l(uVar);
                    } catch (Throwable th2) {
                        uVar2 = uVar;
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            if (uVar2 != null) {
                this.f6956v.l(uVar2);
            }
            throw th4;
        }
    }

    @Override // bl.d
    public void c() {
        synchronized (this.f6938d) {
            try {
                i();
                this.f6937c.c();
                this.f6955u = fl.i.b();
                Object obj = this.f6943i;
                if (obj == null) {
                    if (fl.o.x(this.f6946l, this.f6947m)) {
                        this.A = this.f6946l;
                        this.B = this.f6947m;
                    }
                    y(new GlideException("Received null model"), p() == null ? 5 : 3);
                    return;
                }
                a aVar = this.f6957w;
                a aVar2 = a.RUNNING;
                if (aVar == aVar2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (aVar == a.COMPLETE) {
                    b(this.f6953s, DataSource.MEMORY_CACHE, false);
                    return;
                }
                n(obj);
                this.f6935a = gl.b.b(E);
                a aVar3 = a.WAITING_FOR_SIZE;
                this.f6957w = aVar3;
                if (fl.o.x(this.f6946l, this.f6947m)) {
                    e(this.f6946l, this.f6947m);
                } else {
                    this.f6949o.j(this);
                }
                a aVar4 = this.f6957w;
                if ((aVar4 == aVar2 || aVar4 == aVar3) && k()) {
                    this.f6949o.l(q());
                }
                if (G) {
                    t("finished run method in " + fl.i.a(this.f6955u));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // bl.d
    public void clear() {
        synchronized (this.f6938d) {
            try {
                i();
                this.f6937c.c();
                a aVar = this.f6957w;
                a aVar2 = a.CLEARED;
                if (aVar == aVar2) {
                    return;
                }
                m();
                u<R> uVar = this.f6953s;
                if (uVar != null) {
                    this.f6953s = null;
                } else {
                    uVar = null;
                }
                if (j()) {
                    this.f6949o.i(q());
                }
                gl.b.g(E, this.f6935a);
                this.f6957w = aVar2;
                if (uVar != null) {
                    this.f6956v.l(uVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // bl.d
    public boolean d() {
        boolean z11;
        synchronized (this.f6938d) {
            z11 = this.f6957w == a.COMPLETE;
        }
        return z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cl.o
    public void e(int i11, int i12) {
        i<R> iVar = this;
        iVar.f6937c.c();
        Object obj = iVar.f6938d;
        synchronized (obj) {
            try {
                try {
                    boolean z11 = G;
                    if (z11) {
                        iVar.t("Got onSizeReady in " + fl.i.a(iVar.f6955u));
                    }
                    if (iVar.f6957w == a.WAITING_FOR_SIZE) {
                        a aVar = a.RUNNING;
                        iVar.f6957w = aVar;
                        float sizeMultiplier = iVar.f6945k.getSizeMultiplier();
                        iVar.A = u(i11, sizeMultiplier);
                        iVar.B = u(i12, sizeMultiplier);
                        if (z11) {
                            iVar.t("finished setup for calling load in " + fl.i.a(iVar.f6955u));
                        }
                        try {
                            k kVar = iVar.f6956v;
                            com.bumptech.glide.e eVar = iVar.f6942h;
                            try {
                                Object obj2 = iVar.f6943i;
                                ik.b signature = iVar.f6945k.getSignature();
                                try {
                                    int i13 = iVar.A;
                                    int i14 = iVar.B;
                                    Class<?> resourceClass = iVar.f6945k.getResourceClass();
                                    Class<R> cls = iVar.f6944j;
                                    try {
                                        Priority priority = iVar.f6948n;
                                        j diskCacheStrategy = iVar.f6945k.getDiskCacheStrategy();
                                        Map<Class<?>, ik.h<?>> transformations = iVar.f6945k.getTransformations();
                                        boolean isTransformationRequired = iVar.f6945k.isTransformationRequired();
                                        boolean isScaleOnlyOrNoTransform = iVar.f6945k.isScaleOnlyOrNoTransform();
                                        ik.e options = iVar.f6945k.getOptions();
                                        boolean isMemoryCacheable = iVar.f6945k.isMemoryCacheable();
                                        boolean useUnlimitedSourceGeneratorsPool = iVar.f6945k.getUseUnlimitedSourceGeneratorsPool();
                                        boolean useAnimationPool = iVar.f6945k.getUseAnimationPool();
                                        boolean onlyRetrieveFromCache = iVar.f6945k.getOnlyRetrieveFromCache();
                                        Executor executor = iVar.f6952r;
                                        iVar = obj;
                                        try {
                                            iVar.f6954t = kVar.g(eVar, obj2, signature, i13, i14, resourceClass, cls, priority, diskCacheStrategy, transformations, isTransformationRequired, isScaleOnlyOrNoTransform, options, isMemoryCacheable, useUnlimitedSourceGeneratorsPool, useAnimationPool, onlyRetrieveFromCache, iVar, executor);
                                            if (iVar.f6957w != aVar) {
                                                iVar.f6954t = null;
                                            }
                                            if (z11) {
                                                iVar.t("finished onSizeReady in " + fl.i.a(iVar.f6955u));
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        iVar = obj;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    iVar = obj;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                iVar = obj;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            iVar = obj;
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                    iVar = obj;
                }
            } catch (Throwable th8) {
                th = th8;
            }
        }
    }

    @Override // bl.d
    public boolean f() {
        boolean z11;
        synchronized (this.f6938d) {
            z11 = this.f6957w == a.CLEARED;
        }
        return z11;
    }

    @Override // bl.d
    public boolean g(d dVar) {
        int i11;
        int i12;
        Object obj;
        Class<R> cls;
        bl.a<?> aVar;
        Priority priority;
        int size;
        int i13;
        int i14;
        Object obj2;
        Class<R> cls2;
        bl.a<?> aVar2;
        Priority priority2;
        int size2;
        if (!(dVar instanceof i)) {
            return false;
        }
        synchronized (this.f6938d) {
            try {
                i11 = this.f6946l;
                i12 = this.f6947m;
                obj = this.f6943i;
                cls = this.f6944j;
                aVar = this.f6945k;
                priority = this.f6948n;
                List<f<R>> list = this.f6950p;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        i iVar = (i) dVar;
        synchronized (iVar.f6938d) {
            try {
                i13 = iVar.f6946l;
                i14 = iVar.f6947m;
                obj2 = iVar.f6943i;
                cls2 = iVar.f6944j;
                aVar2 = iVar.f6945k;
                priority2 = iVar.f6948n;
                List<f<R>> list2 = iVar.f6950p;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        return i11 == i13 && i12 == i14 && fl.o.d(obj, obj2) && cls.equals(cls2) && fl.o.c(aVar, aVar2) && priority == priority2 && size == size2;
    }

    @Override // bl.h
    public Object h() {
        this.f6937c.c();
        return this.f6938d;
    }

    @GuardedBy("requestLock")
    public final void i() {
        if (this.C) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    @Override // bl.d
    public boolean isComplete() {
        boolean z11;
        synchronized (this.f6938d) {
            z11 = this.f6957w == a.COMPLETE;
        }
        return z11;
    }

    @Override // bl.d
    public boolean isRunning() {
        boolean z11;
        synchronized (this.f6938d) {
            try {
                a aVar = this.f6957w;
                z11 = aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
            } finally {
            }
        }
        return z11;
    }

    @GuardedBy("requestLock")
    public final boolean j() {
        RequestCoordinator requestCoordinator = this.f6940f;
        return requestCoordinator == null || requestCoordinator.i(this);
    }

    @GuardedBy("requestLock")
    public final boolean k() {
        RequestCoordinator requestCoordinator = this.f6940f;
        return requestCoordinator == null || requestCoordinator.e(this);
    }

    @GuardedBy("requestLock")
    public final boolean l() {
        RequestCoordinator requestCoordinator = this.f6940f;
        return requestCoordinator == null || requestCoordinator.b(this);
    }

    @GuardedBy("requestLock")
    public final void m() {
        i();
        this.f6937c.c();
        this.f6949o.g(this);
        k.d dVar = this.f6954t;
        if (dVar != null) {
            dVar.a();
            this.f6954t = null;
        }
    }

    public final void n(Object obj) {
        List<f<R>> list = this.f6950p;
        if (list == null) {
            return;
        }
        for (f<R> fVar : list) {
            if (fVar instanceof b) {
                ((b) fVar).c(obj);
            }
        }
    }

    @GuardedBy("requestLock")
    public final Drawable o() {
        if (this.f6958x == null) {
            Drawable errorPlaceholder = this.f6945k.getErrorPlaceholder();
            this.f6958x = errorPlaceholder;
            if (errorPlaceholder == null && this.f6945k.getErrorId() > 0) {
                this.f6958x = s(this.f6945k.getErrorId());
            }
        }
        return this.f6958x;
    }

    @GuardedBy("requestLock")
    public final Drawable p() {
        if (this.f6960z == null) {
            Drawable fallbackDrawable = this.f6945k.getFallbackDrawable();
            this.f6960z = fallbackDrawable;
            if (fallbackDrawable == null && this.f6945k.getFallbackId() > 0) {
                this.f6960z = s(this.f6945k.getFallbackId());
            }
        }
        return this.f6960z;
    }

    @Override // bl.d
    public void pause() {
        synchronized (this.f6938d) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @GuardedBy("requestLock")
    public final Drawable q() {
        if (this.f6959y == null) {
            Drawable placeholderDrawable = this.f6945k.getPlaceholderDrawable();
            this.f6959y = placeholderDrawable;
            if (placeholderDrawable == null && this.f6945k.getPlaceholderId() > 0) {
                this.f6959y = s(this.f6945k.getPlaceholderId());
            }
        }
        return this.f6959y;
    }

    @GuardedBy("requestLock")
    public final boolean r() {
        RequestCoordinator requestCoordinator = this.f6940f;
        return requestCoordinator == null || !requestCoordinator.getRoot().d();
    }

    @GuardedBy("requestLock")
    public final Drawable s(@DrawableRes int i11) {
        return uk.g.a(this.f6941g, i11, this.f6945k.getTheme() != null ? this.f6945k.getTheme() : this.f6941g.getTheme());
    }

    public final void t(String str) {
        Log.v(E, str + " this: " + this.f6936b);
    }

    public String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.f6938d) {
            obj = this.f6943i;
            cls = this.f6944j;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }

    @GuardedBy("requestLock")
    public final void v() {
        RequestCoordinator requestCoordinator = this.f6940f;
        if (requestCoordinator != null) {
            requestCoordinator.h(this);
        }
    }

    @GuardedBy("requestLock")
    public final void w() {
        RequestCoordinator requestCoordinator = this.f6940f;
        if (requestCoordinator != null) {
            requestCoordinator.a(this);
        }
    }

    public final void y(GlideException glideException, int i11) {
        boolean z11;
        this.f6937c.c();
        synchronized (this.f6938d) {
            try {
                glideException.setOrigin(this.D);
                int h11 = this.f6942h.h();
                if (h11 <= i11) {
                    Log.w("Glide", "Load failed for [" + this.f6943i + "] with dimensions [" + this.A + "x" + this.B + "]", glideException);
                    if (h11 <= 4) {
                        glideException.logRootCauses("Glide");
                    }
                }
                this.f6954t = null;
                this.f6957w = a.FAILED;
                v();
                boolean z12 = true;
                this.C = true;
                try {
                    List<f<R>> list = this.f6950p;
                    if (list != null) {
                        Iterator<f<R>> it = list.iterator();
                        z11 = false;
                        while (it.hasNext()) {
                            z11 |= it.next().a(glideException, this.f6943i, this.f6949o, r());
                        }
                    } else {
                        z11 = false;
                    }
                    f<R> fVar = this.f6939e;
                    if (fVar == null || !fVar.a(glideException, this.f6943i, this.f6949o, r())) {
                        z12 = false;
                    }
                    if (!(z11 | z12)) {
                        A();
                    }
                    this.C = false;
                    gl.b.g(E, this.f6935a);
                } catch (Throwable th2) {
                    this.C = false;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @GuardedBy("requestLock")
    public final void z(u<R> uVar, R r11, DataSource dataSource, boolean z11) {
        boolean z12;
        boolean z13;
        boolean r12 = r();
        this.f6957w = a.COMPLETE;
        this.f6953s = uVar;
        if (this.f6942h.h() <= 3) {
            Log.d("Glide", "Finished loading " + r11.getClass().getSimpleName() + " from " + dataSource + " for " + this.f6943i + " with size [" + this.A + "x" + this.B + "] in " + fl.i.a(this.f6955u) + " ms");
        }
        w();
        boolean z14 = true;
        this.C = true;
        try {
            List<f<R>> list = this.f6950p;
            if (list != null) {
                z12 = false;
                for (f<R> fVar : list) {
                    R r13 = r11;
                    DataSource dataSource2 = dataSource;
                    boolean b11 = fVar.b(r13, this.f6943i, this.f6949o, dataSource2, r12) | z12;
                    if (fVar instanceof b) {
                        z13 = z11;
                        b11 |= ((b) fVar).d(r13, this.f6943i, this.f6949o, dataSource2, r12, z13);
                    } else {
                        z13 = z11;
                    }
                    dataSource = dataSource2;
                    z11 = z13;
                    z12 = b11;
                    r11 = r13;
                }
            } else {
                z12 = false;
            }
            R r14 = r11;
            DataSource dataSource3 = dataSource;
            f<R> fVar2 = this.f6939e;
            if (fVar2 == null || !fVar2.b(r14, this.f6943i, this.f6949o, dataSource3, r12)) {
                z14 = false;
            }
            if (!(z14 | z12)) {
                this.f6949o.h(r14, this.f6951q.a(dataSource3, r12));
            }
            this.C = false;
            gl.b.g(E, this.f6935a);
        } catch (Throwable th2) {
            this.C = false;
            throw th2;
        }
    }
}
