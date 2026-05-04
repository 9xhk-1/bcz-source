package kk;

import android.os.Build;
import android.os.Process;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.d;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.GlideException;
import gl.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import kk.f;
import kk.i;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class h<R> implements f.a, Runnable, Comparable<h<?>>, a.f {
    public static final String I = "DecodeJob";
    public static final ik.d<Supplier<Integer>> J = ik.d.f("glide_thread_priority_override");
    public ik.b A;
    public Object B;
    public DataSource C;
    public com.bumptech.glide.load.data.d<?> D;
    public volatile kk.f E;
    public volatile boolean F;
    public volatile boolean G;
    public boolean H;

    /* renamed from: d, reason: collision with root package name */
    public final e f66670d;

    /* renamed from: e, reason: collision with root package name */
    public final Pools.Pool<h<?>> f66671e;

    /* renamed from: h, reason: collision with root package name */
    public com.bumptech.glide.e f66674h;

    /* renamed from: i, reason: collision with root package name */
    public ik.b f66675i;

    /* renamed from: j, reason: collision with root package name */
    public Priority f66676j;

    /* renamed from: k, reason: collision with root package name */
    public n f66677k;

    /* renamed from: l, reason: collision with root package name */
    public int f66678l;

    /* renamed from: m, reason: collision with root package name */
    public int f66679m;

    /* renamed from: n, reason: collision with root package name */
    public j f66680n;

    /* renamed from: o, reason: collision with root package name */
    public ik.e f66681o;

    /* renamed from: p, reason: collision with root package name */
    public b<R> f66682p;

    /* renamed from: q, reason: collision with root package name */
    public int f66683q;

    /* renamed from: r, reason: collision with root package name */
    public EnumC0776h f66684r;

    /* renamed from: s, reason: collision with root package name */
    public g f66685s;

    /* renamed from: t, reason: collision with root package name */
    public long f66686t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f66687u;

    /* renamed from: v, reason: collision with root package name */
    public Object f66688v;

    /* renamed from: w, reason: collision with root package name */
    public com.bumptech.glide.f f66689w;

    /* renamed from: x, reason: collision with root package name */
    @Nullable
    public Supplier<Integer> f66690x;

    /* renamed from: y, reason: collision with root package name */
    public Thread f66691y;

    /* renamed from: z, reason: collision with root package name */
    public ik.b f66692z;

    /* renamed from: a, reason: collision with root package name */
    public final kk.g<R> f66667a = new kk.g<>();

    /* renamed from: b, reason: collision with root package name */
    public final List<Throwable> f66668b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final gl.c f66669c = gl.c.a();

    /* renamed from: f, reason: collision with root package name */
    public final d<?> f66672f = new d<>();

    /* renamed from: g, reason: collision with root package name */
    public final f f66673g = new f();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66693a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f66694b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f66695c;

        static {
            int[] iArr = new int[EncodeStrategy.values().length];
            f66695c = iArr;
            try {
                iArr[EncodeStrategy.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66695c[EncodeStrategy.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0776h.values().length];
            f66694b = iArr2;
            try {
                iArr2[EnumC0776h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f66694b[EnumC0776h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f66694b[EnumC0776h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f66694b[EnumC0776h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f66694b[EnumC0776h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            f66693a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f66693a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f66693a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b<R> {
        void a(GlideException glideException);

        void b(u<R> uVar, DataSource dataSource, boolean z11);

        void c(h<?> hVar);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class c<Z> implements i.a<Z> {

        /* renamed from: a, reason: collision with root package name */
        public final DataSource f66696a;

        public c(DataSource dataSource) {
            this.f66696a = dataSource;
        }

        @Override // kk.i.a
        @NonNull
        public u<Z> a(@NonNull u<Z> uVar) {
            return h.this.y(this.f66696a, uVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d<Z> {

        /* renamed from: a, reason: collision with root package name */
        public ik.b f66698a;

        /* renamed from: b, reason: collision with root package name */
        public ik.g<Z> f66699b;

        /* renamed from: c, reason: collision with root package name */
        public t<Z> f66700c;

        public void a() {
            this.f66698a = null;
            this.f66699b = null;
            this.f66700c = null;
        }

        public void b(e eVar, ik.e eVar2) {
            gl.b.a("DecodeJob.encode");
            try {
                eVar.a().a(this.f66698a, new kk.e(this.f66699b, this.f66700c, eVar2));
            } finally {
                this.f66700c.f();
                gl.b.f();
            }
        }

        public boolean c() {
            return this.f66700c != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <X> void d(ik.b bVar, ik.g<X> gVar, t<X> tVar) {
            this.f66698a = bVar;
            this.f66699b = gVar;
            this.f66700c = tVar;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface e {
        mk.a a();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public boolean f66701a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f66702b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f66703c;

        public final boolean a(boolean z11) {
            return (this.f66703c || z11 || this.f66702b) && this.f66701a;
        }

        public synchronized boolean b() {
            this.f66702b = true;
            return a(false);
        }

        public synchronized boolean c() {
            this.f66703c = true;
            return a(false);
        }

        public synchronized boolean d(boolean z11) {
            this.f66701a = true;
            return a(z11);
        }

        public synchronized void e() {
            this.f66702b = false;
            this.f66701a = false;
            this.f66703c = false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: kk.h$h, reason: collision with other inner class name */
    public enum EnumC0776h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    public h(e eVar, Pools.Pool<h<?>> pool) {
        this.f66670d = eVar;
        this.f66671e = pool;
    }

    public final void A() {
        this.f66673g.e();
        this.f66672f.a();
        this.f66667a.a();
        this.F = false;
        this.f66674h = null;
        this.f66675i = null;
        this.f66681o = null;
        this.f66676j = null;
        this.f66677k = null;
        this.f66682p = null;
        this.f66684r = null;
        this.E = null;
        this.f66691y = null;
        this.f66692z = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.f66686t = 0L;
        this.G = false;
        this.f66688v = null;
        this.f66668b.clear();
        this.f66671e.release(this);
    }

    public final void B(g gVar) {
        this.f66685s = gVar;
        this.f66682p.c(this);
    }

    public final void C() {
        if (!this.f66689w.b(d.f.class)) {
            throw new IllegalStateException("OverrideGlideThreadPriority experiment is not enabled.");
        }
        Supplier<Integer> supplier = this.f66690x;
        if (supplier == null || supplier.get() == null) {
            return;
        }
        try {
            Process.setThreadPriority(Process.myTid(), 9);
        } catch (IllegalArgumentException | SecurityException e11) {
            this.f66690x = null;
            if (Log.isLoggable(I, 2)) {
                Log.v(I, "Failed to set thread priority; using default priority for any subsequent jobs.", e11);
            }
        }
    }

    public final void D() {
        this.f66691y = Thread.currentThread();
        this.f66686t = fl.i.b();
        boolean z11 = false;
        while (!this.G && this.E != null && !(z11 = this.E.a())) {
            this.f66684r = m(this.f66684r);
            this.E = l();
            if (this.f66684r == EnumC0776h.SOURCE) {
                B(g.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f66684r == EnumC0776h.FINISHED || this.G) && !z11) {
            v();
        }
    }

    public final <Data, ResourceType> u<R> E(Data data, DataSource dataSource, s<Data, ResourceType, R> sVar) throws GlideException {
        ik.e o11 = o(dataSource);
        com.bumptech.glide.load.data.e<Data> l11 = this.f66674h.i().l(data);
        try {
            return sVar.b(l11, o11, this.f66678l, this.f66679m, new c(dataSource));
        } finally {
            l11.cleanup();
        }
    }

    public final void F() {
        int i11 = a.f66693a[this.f66685s.ordinal()];
        if (i11 == 1) {
            this.f66684r = m(EnumC0776h.INITIALIZE);
            this.E = l();
            D();
        } else if (i11 == 2) {
            D();
        } else {
            if (i11 == 3) {
                k();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.f66685s);
        }
    }

    public final void G() {
        Throwable th2;
        this.f66669c.c();
        if (!this.F) {
            this.F = true;
            return;
        }
        if (this.f66668b.isEmpty()) {
            th2 = null;
        } else {
            List<Throwable> list = this.f66668b;
            th2 = list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th2);
    }

    public boolean H() {
        EnumC0776h m11 = m(EnumC0776h.INITIALIZE);
        return m11 == EnumC0776h.RESOURCE_CACHE || m11 == EnumC0776h.DATA_CACHE;
    }

    public void a() {
        this.G = true;
        kk.f fVar = this.E;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    @Override // kk.f.a
    public void b(ik.b bVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, DataSource dataSource, ik.b bVar2) {
        this.f66692z = bVar;
        this.B = obj;
        this.D = dVar;
        this.C = dataSource;
        this.A = bVar2;
        this.H = bVar != this.f66667a.c().get(0);
        if (Thread.currentThread() != this.f66691y) {
            B(g.DECODE_DATA);
            return;
        }
        gl.b.a("DecodeJob.decodeFromRetrievedData");
        try {
            k();
        } finally {
            gl.b.f();
        }
    }

    @Override // kk.f.a
    public void c(ik.b bVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, DataSource dataSource) {
        dVar.cleanup();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.setLoggingDetails(bVar, dataSource, dVar.getDataClass());
        this.f66668b.add(glideException);
        if (Thread.currentThread() != this.f66691y) {
            B(g.SWITCH_TO_SOURCE_SERVICE);
        } else {
            D();
        }
    }

    @Override // gl.a.f
    @NonNull
    public gl.c d() {
        return this.f66669c;
    }

    @Override // kk.f.a
    public void e() {
        B(g.SWITCH_TO_SOURCE_SERVICE);
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull h<?> hVar) {
        int p11 = p() - hVar.p();
        return p11 == 0 ? this.f66683q - hVar.f66683q : p11;
    }

    public final <Data> u<R> g(com.bumptech.glide.load.data.d<?> dVar, Data data, DataSource dataSource) throws GlideException {
        if (data == null) {
            dVar.cleanup();
            return null;
        }
        try {
            long b11 = fl.i.b();
            u<R> i11 = i(data, dataSource);
            if (Log.isLoggable(I, 2)) {
                r("Decoded result " + i11, b11);
            }
            return i11;
        } finally {
            dVar.cleanup();
        }
    }

    public final <Data> u<R> i(Data data, DataSource dataSource) throws GlideException {
        return E(data, dataSource, this.f66667a.h(data.getClass()));
    }

    public final void k() {
        Supplier<Integer> supplier;
        if (Log.isLoggable(I, 2)) {
            s("Retrieved data", this.f66686t, "data: " + this.B + ", cache key: " + this.f66692z + ", fetcher: " + this.D);
        }
        u<R> uVar = null;
        if (this.f66689w.b(d.f.class) && (supplier = this.f66690x) != null && supplier.get() != null) {
            try {
                Process.setThreadPriority(Process.myTid(), this.f66690x.get().intValue());
            } catch (IllegalArgumentException | SecurityException e11) {
                this.f66690x = null;
                if (Log.isLoggable(I, 2)) {
                    Log.v(I, "Failed to set thread priority; using default priority for any subsequent jobs.", e11);
                }
            }
        }
        try {
            uVar = g(this.D, this.B, this.C);
        } catch (GlideException e12) {
            e12.setLoggingDetails(this.A, this.C);
            this.f66668b.add(e12);
        }
        if (uVar != null) {
            u(uVar, this.C, this.H);
        } else {
            D();
        }
    }

    public final kk.f l() {
        int i11 = a.f66694b[this.f66684r.ordinal()];
        if (i11 == 1) {
            return new v(this.f66667a, this);
        }
        if (i11 == 2) {
            return new kk.c(this.f66667a, this);
        }
        if (i11 == 3) {
            return new y(this.f66667a, this);
        }
        if (i11 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f66684r);
    }

    public final EnumC0776h m(EnumC0776h enumC0776h) {
        int i11 = a.f66694b[enumC0776h.ordinal()];
        if (i11 == 1) {
            return this.f66680n.a() ? EnumC0776h.DATA_CACHE : m(EnumC0776h.DATA_CACHE);
        }
        if (i11 == 2) {
            return this.f66687u ? EnumC0776h.FINISHED : EnumC0776h.SOURCE;
        }
        if (i11 == 3 || i11 == 4) {
            return EnumC0776h.FINISHED;
        }
        if (i11 == 5) {
            return this.f66680n.b() ? EnumC0776h.RESOURCE_CACHE : m(EnumC0776h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + enumC0776h);
    }

    @NonNull
    public final ik.e o(DataSource dataSource) {
        ik.e eVar = this.f66681o;
        if (Build.VERSION.SDK_INT < 26) {
            return eVar;
        }
        boolean z11 = dataSource == DataSource.RESOURCE_DISK_CACHE || this.f66667a.x();
        ik.d<Boolean> dVar = com.bumptech.glide.load.resource.bitmap.a.f28821k;
        Boolean bool = (Boolean) eVar.c(dVar);
        if (bool != null && (!bool.booleanValue() || z11)) {
            return eVar;
        }
        ik.e eVar2 = new ik.e();
        eVar2.d(this.f66681o);
        eVar2.f(dVar, Boolean.valueOf(z11));
        return eVar2;
    }

    public final int p() {
        return this.f66676j.ordinal();
    }

    public h<R> q(com.bumptech.glide.e eVar, Object obj, n nVar, ik.b bVar, int i11, int i12, Class<?> cls, Class<R> cls2, Priority priority, j jVar, Map<Class<?>, ik.h<?>> map, boolean z11, boolean z12, boolean z13, ik.e eVar2, b<R> bVar2, int i13) {
        this.f66667a.v(eVar, obj, bVar, i11, i12, jVar, cls, cls2, priority, eVar2, map, z11, z12, this.f66670d);
        this.f66674h = eVar;
        this.f66675i = bVar;
        this.f66676j = priority;
        this.f66677k = nVar;
        this.f66678l = i11;
        this.f66679m = i12;
        this.f66680n = jVar;
        this.f66687u = z13;
        this.f66681o = eVar2;
        this.f66682p = bVar2;
        this.f66683q = i13;
        this.f66685s = g.INITIALIZE;
        this.f66688v = obj;
        this.f66689w = eVar.g();
        this.f66690x = (Supplier) eVar2.c(J);
        return this;
    }

    public final void r(String str, long j11) {
        s(str, j11, null);
    }

    @Override // java.lang.Runnable
    public void run() {
        gl.b.d("DecodeJob#run(reason=%s, model=%s)", this.f66685s, this.f66688v);
        com.bumptech.glide.load.data.d<?> dVar = this.D;
        try {
            try {
                try {
                    if (this.G) {
                        v();
                        if (dVar != null) {
                            dVar.cleanup();
                        }
                        gl.b.f();
                        return;
                    }
                    F();
                    if (dVar != null) {
                        dVar.cleanup();
                    }
                    gl.b.f();
                } catch (kk.b e11) {
                    throw e11;
                }
            } catch (Throwable th2) {
                if (Log.isLoggable(I, 3)) {
                    Log.d(I, "DecodeJob threw unexpectedly, isCancelled: " + this.G + ", stage: " + this.f66684r, th2);
                }
                if (this.f66684r != EnumC0776h.ENCODE) {
                    this.f66668b.add(th2);
                    v();
                }
                if (!this.G) {
                    throw th2;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            if (dVar != null) {
                dVar.cleanup();
            }
            gl.b.f();
            throw th3;
        }
    }

    public final void s(String str, long j11, String str2) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" in ");
        sb2.append(fl.i.a(j11));
        sb2.append(", load key: ");
        sb2.append(this.f66677k);
        if (str2 != null) {
            str3 = j2.O + str2;
        } else {
            str3 = "";
        }
        sb2.append(str3);
        sb2.append(", thread: ");
        sb2.append(Thread.currentThread().getName());
        Log.v(I, sb2.toString());
    }

    public final void t(u<R> uVar, DataSource dataSource, boolean z11) {
        if (this.f66689w.b(d.f.class)) {
            C();
        }
        G();
        this.f66682p.b(uVar, dataSource, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u(u<R> uVar, DataSource dataSource, boolean z11) {
        t tVar;
        gl.b.a("DecodeJob.notifyEncodeAndRelease");
        try {
            if (uVar instanceof q) {
                ((q) uVar).initialize();
            }
            if (this.f66672f.c()) {
                uVar = t.c(uVar);
                tVar = uVar;
            } else {
                tVar = 0;
            }
            t(uVar, dataSource, z11);
            this.f66684r = EnumC0776h.ENCODE;
            try {
                if (this.f66672f.c()) {
                    this.f66672f.b(this.f66670d, this.f66681o);
                }
                w();
                gl.b.f();
            } finally {
                if (tVar != 0) {
                    tVar.f();
                }
            }
        } catch (Throwable th2) {
            gl.b.f();
            throw th2;
        }
    }

    public final void v() {
        if (this.f66689w.b(d.f.class)) {
            C();
        }
        G();
        this.f66682p.a(new GlideException("Failed to load resource", new ArrayList(this.f66668b)));
        x();
    }

    public final void w() {
        if (this.f66673g.b()) {
            A();
        }
    }

    public final void x() {
        if (this.f66673g.c()) {
            A();
        }
    }

    @NonNull
    public <Z> u<Z> y(DataSource dataSource, @NonNull u<Z> uVar) {
        u<Z> uVar2;
        ik.h<Z> hVar;
        EncodeStrategy encodeStrategy;
        ik.b dVar;
        Class<?> cls = uVar.get().getClass();
        ik.g<Z> gVar = null;
        if (dataSource != DataSource.RESOURCE_DISK_CACHE) {
            ik.h<Z> s11 = this.f66667a.s(cls);
            hVar = s11;
            uVar2 = s11.b(this.f66674h, uVar, this.f66678l, this.f66679m);
        } else {
            uVar2 = uVar;
            hVar = null;
        }
        if (!uVar.equals(uVar2)) {
            uVar.recycle();
        }
        if (this.f66667a.w(uVar2)) {
            gVar = this.f66667a.n(uVar2);
            encodeStrategy = gVar.a(this.f66681o);
        } else {
            encodeStrategy = EncodeStrategy.NONE;
        }
        ik.g gVar2 = gVar;
        if (!this.f66680n.d(!this.f66667a.y(this.f66692z), dataSource, encodeStrategy)) {
            return uVar2;
        }
        if (gVar2 == null) {
            throw new Registry.NoResultEncoderAvailableException(uVar2.get().getClass());
        }
        int i11 = a.f66695c[encodeStrategy.ordinal()];
        if (i11 == 1) {
            dVar = new kk.d(this.f66692z, this.f66675i);
        } else {
            if (i11 != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + encodeStrategy);
            }
            dVar = new w(this.f66667a.b(), this.f66692z, this.f66675i, this.f66678l, this.f66679m, hVar, cls, this.f66681o);
        }
        t c11 = t.c(uVar2);
        this.f66672f.d(dVar, gVar2, c11);
        return c11;
    }

    public void z(boolean z11) {
        if (this.f66673g.d(z11)) {
            A();
        }
    }
}
