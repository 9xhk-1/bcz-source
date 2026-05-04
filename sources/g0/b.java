package g0;

import androidx.annotation.VisibleForTesting;
import c40.l3;
import c40.m0;
import c40.r0;
import c40.s0;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.text.Regex;
import l60.e1;
import l60.u;
import m80.k;
import m80.l;
import u30.f0;
import u30.k0;
import x00.p;
import yz.g2;
import yz.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\ncoil/disk/DiskLruCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Okio.kt\nokio/Okio__OkioKt\n+ 4 FileSystem.kt\nokio/FileSystem\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,869:1\n1#2:870\n66#3:871\n52#3,5:873\n60#3,10:879\n57#3,2:889\n71#3,2:891\n52#3,5:903\n60#3,10:909\n57#3,16:919\n67#4:872\n68#4:878\n80#4:900\n165#4:901\n81#4:902\n82#4:908\n372#5,7:893\n37#6,2:935\n37#6,2:937\n*S KotlinDebug\n*F\n+ 1 DiskLruCache.kt\ncoil/disk/DiskLruCache\n*L\n207#1:871\n207#1:873,5\n207#1:879,10\n207#1:889,2\n207#1:891,2\n320#1:903,5\n320#1:909,10\n320#1:919,16\n207#1:872\n207#1:878\n320#1:900\n320#1:901\n320#1:902\n320#1:908\n270#1:893,7\n585#1:935,2\n641#1:937,2\n*E\n"})
/* loaded from: classes3.dex */
public final class b implements Closeable, Flushable {

    @k
    public static final String A = "REMOVE";

    @k
    public static final String B = "READ";

    /* renamed from: t, reason: collision with root package name */
    @k
    public static final String f52439t = "journal";

    /* renamed from: u, reason: collision with root package name */
    @k
    public static final String f52440u = "journal.tmp";

    /* renamed from: v, reason: collision with root package name */
    @k
    public static final String f52441v = "journal.bkp";

    /* renamed from: w, reason: collision with root package name */
    @k
    public static final String f52442w = "libcore.io.DiskLruCache";

    /* renamed from: x, reason: collision with root package name */
    @k
    public static final String f52443x = "1";

    /* renamed from: y, reason: collision with root package name */
    @k
    public static final String f52444y = "CLEAN";

    /* renamed from: z, reason: collision with root package name */
    @k
    public static final String f52445z = "DIRTY";

    /* renamed from: a, reason: collision with root package name */
    @k
    public final okio.f f52446a;

    /* renamed from: b, reason: collision with root package name */
    public final long f52447b;

    /* renamed from: c, reason: collision with root package name */
    public final int f52448c;

    /* renamed from: d, reason: collision with root package name */
    public final int f52449d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final okio.f f52450e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final okio.f f52451f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final okio.f f52452g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final LinkedHashMap<String, c> f52453h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final r0 f52454i;

    /* renamed from: j, reason: collision with root package name */
    public long f52455j;

    /* renamed from: k, reason: collision with root package name */
    public int f52456k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public l60.l f52457l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f52458m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f52459n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f52460o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f52461p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f52462q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final e f52463r;

    /* renamed from: s, reason: collision with root package name */
    @k
    public static final a f52438s = new a(null);

    @k
    public static final Regex C = new Regex("[a-z0-9_-]{1,120}");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }

        @VisibleForTesting
        public static /* synthetic */ void a() {
        }

        @VisibleForTesting
        public static /* synthetic */ void b() {
        }

        @VisibleForTesting
        public static /* synthetic */ void c() {
        }

        @VisibleForTesting
        public static /* synthetic */ void d() {
        }

        @VisibleForTesting
        public static /* synthetic */ void e() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\ncoil/disk/DiskLruCache$Editor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,869:1\n1#2:870\n*E\n"})
    /* renamed from: g0.b$b, reason: collision with other inner class name */
    public final class C0621b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final c f52464a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f52465b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final boolean[] f52466c;

        public C0621b(@k c cVar) {
            this.f52464a = cVar;
            this.f52466c = new boolean[b.this.f52449d];
        }

        public final void a() {
            d(false);
        }

        public final void b() {
            d(true);
        }

        @l
        public final d c() {
            d a02;
            b bVar = b.this;
            synchronized (bVar) {
                b();
                a02 = bVar.a0(this.f52464a.d());
            }
            return a02;
        }

        public final void d(boolean z11) {
            b bVar = b.this;
            synchronized (bVar) {
                try {
                    if (this.f52465b) {
                        throw new IllegalStateException("editor is closed");
                    }
                    if (g0.g(this.f52464a.b(), this)) {
                        bVar.S(this, z11);
                    }
                    this.f52465b = true;
                    g2 g2Var = g2.f100423a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void e() {
            if (g0.g(this.f52464a.b(), this)) {
                this.f52464a.m(true);
            }
        }

        @k
        public final okio.f f(int i11) {
            okio.f fVar;
            b bVar = b.this;
            synchronized (bVar) {
                if (this.f52465b) {
                    throw new IllegalStateException("editor is closed");
                }
                this.f52466c[i11] = true;
                okio.f fVar2 = this.f52464a.c().get(i11);
                u0.e.a(bVar.f52463r, fVar2);
                fVar = fVar2;
            }
            return fVar;
        }

        @k
        public final c g() {
            return this.f52464a;
        }

        @k
        public final boolean[] h() {
            return this.f52466c;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\ncoil/disk/DiskLruCache$Entry\n+ 2 Collections.kt\ncoil/util/-Collections\n*L\n1#1,869:1\n12#2,4:870\n*S KotlinDebug\n*F\n+ 1 DiskLruCache.kt\ncoil/disk/DiskLruCache$Entry\n*L\n841#1:870,4\n*E\n"})
    public final class c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f52468a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final long[] f52469b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ArrayList<okio.f> f52470c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final ArrayList<okio.f> f52471d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f52472e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f52473f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public C0621b f52474g;

        /* renamed from: h, reason: collision with root package name */
        public int f52475h;

        public c(@k String str) {
            this.f52468a = str;
            this.f52469b = new long[b.this.f52449d];
            this.f52470c = new ArrayList<>(b.this.f52449d);
            this.f52471d = new ArrayList<>(b.this.f52449d);
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            int i11 = b.this.f52449d;
            for (int i12 = 0; i12 < i11; i12++) {
                sb2.append(i12);
                this.f52470c.add(b.this.f52446a.v(sb2.toString()));
                sb2.append(".tmp");
                this.f52471d.add(b.this.f52446a.v(sb2.toString()));
                sb2.setLength(length);
            }
        }

        @k
        public final ArrayList<okio.f> a() {
            return this.f52470c;
        }

        @l
        public final C0621b b() {
            return this.f52474g;
        }

        @k
        public final ArrayList<okio.f> c() {
            return this.f52471d;
        }

        @k
        public final String d() {
            return this.f52468a;
        }

        @k
        public final long[] e() {
            return this.f52469b;
        }

        public final int f() {
            return this.f52475h;
        }

        public final boolean g() {
            return this.f52472e;
        }

        public final boolean h() {
            return this.f52473f;
        }

        public final void i(@l C0621b c0621b) {
            this.f52474g = c0621b;
        }

        public final void j(@k List<String> list) {
            if (list.size() != b.this.f52449d) {
                throw new IOException("unexpected journal line: " + list);
            }
            try {
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    this.f52469b[i11] = Long.parseLong(list.get(i11));
                }
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + list);
            }
        }

        public final void k(int i11) {
            this.f52475h = i11;
        }

        public final void l(boolean z11) {
            this.f52472e = z11;
        }

        public final void m(boolean z11) {
            this.f52473f = z11;
        }

        @l
        public final d n() {
            if (!this.f52472e || this.f52474g != null || this.f52473f) {
                return null;
            }
            ArrayList<okio.f> arrayList = this.f52470c;
            b bVar = b.this;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (!bVar.f52463r.f0(arrayList.get(i11))) {
                    try {
                        bVar.s0(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
            }
            this.f52475h++;
            return b.this.new d(this);
        }

        public final void o(@k l60.l lVar) {
            for (long j11 : this.f52469b) {
                lVar.writeByte(32).Q1(j11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\ncoil/disk/DiskLruCache$Snapshot\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,869:1\n1#2:870\n*E\n"})
    public final class d implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final c f52477a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f52478b;

        public d(@k c cVar) {
            this.f52477a = cVar;
        }

        @l
        public final C0621b a() {
            C0621b V;
            b bVar = b.this;
            synchronized (bVar) {
                close();
                V = bVar.V(this.f52477a.d());
            }
            return V;
        }

        @k
        public final okio.f c(int i11) {
            if (this.f52478b) {
                throw new IllegalStateException("snapshot is closed");
            }
            return this.f52477a.a().get(i11);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f52478b) {
                return;
            }
            this.f52478b = true;
            b bVar = b.this;
            synchronized (bVar) {
                try {
                    this.f52477a.k(r1.f() - 1);
                    if (this.f52477a.f() == 0 && this.f52477a.h()) {
                        bVar.s0(this.f52477a);
                    }
                    g2 g2Var = g2.f100423a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @k
        public final c e() {
            return this.f52477a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\ncoil/disk/DiskLruCache$fileSystem$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,869:1\n1#2:870\n*E\n"})
    public static final class e extends u {
        public e(okio.b bVar) {
            super(bVar);
        }

        @Override // l60.u, okio.b
        @k
        public e1 D0(@k okio.f fVar, boolean z11) {
            okio.f t11 = fVar.t();
            if (t11 != null) {
                w(t11);
            }
            return super.D0(fVar, z11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "coil.disk.DiskLruCache$launchCleanup$1", f = "DiskLruCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f52480a;

        public f(j00.c<? super f> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final j00.c<g2> create(@l Object obj, @k j00.c<?> cVar) {
            return b.this.new f(cVar);
        }

        @Override // x00.p
        @l
        public final Object invoke(@k r0 r0Var, @l j00.c<? super g2> cVar) {
            return ((f) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f52480a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            b bVar = b.this;
            synchronized (bVar) {
                if (!bVar.f52459n || bVar.f52460o) {
                    return g2.f100423a;
                }
                try {
                    bVar.w0();
                } catch (IOException unused) {
                    bVar.f52461p = true;
                }
                try {
                    if (bVar.d0()) {
                        bVar.y0();
                    }
                } catch (IOException unused2) {
                    bVar.f52462q = true;
                    bVar.f52457l = l60.r0.d(l60.r0.c());
                }
                return g2.f100423a;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g extends Lambda implements x00.l<IOException, g2> {
        public g() {
            super(1);
        }

        public final void a(@k IOException iOException) {
            b.this.f52458m = true;
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(IOException iOException) {
            a(iOException);
            return g2.f100423a;
        }
    }

    public b(@k okio.b bVar, @k okio.f fVar, @k m0 m0Var, long j11, int i11, int i12) {
        this.f52446a = fVar;
        this.f52447b = j11;
        this.f52448c = i11;
        this.f52449d = i12;
        if (j11 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i12 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.f52450e = fVar.v("journal");
        this.f52451f = fVar.v("journal.tmp");
        this.f52452g = fVar.v("journal.bkp");
        this.f52453h = new LinkedHashMap<>(0, 0.75f, true);
        this.f52454i = s0.a(l3.c(null, 1, null).plus(m0Var.limitedParallelism(1)));
        this.f52463r = new e(bVar);
    }

    public final void L() {
        if (this.f52460o) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void S(C0621b c0621b, boolean z11) {
        c g11 = c0621b.g();
        if (!g0.g(g11.b(), c0621b)) {
            throw new IllegalStateException("Check failed.");
        }
        int i11 = 0;
        if (!z11 || g11.h()) {
            int i12 = this.f52449d;
            while (i11 < i12) {
                this.f52463r.U(g11.c().get(i11));
                i11++;
            }
        } else {
            int i13 = this.f52449d;
            for (int i14 = 0; i14 < i13; i14++) {
                if (c0621b.h()[i14] && !this.f52463r.f0(g11.c().get(i14))) {
                    c0621b.a();
                    return;
                }
            }
            int i15 = this.f52449d;
            while (i11 < i15) {
                okio.f fVar = g11.c().get(i11);
                okio.f fVar2 = g11.a().get(i11);
                if (this.f52463r.f0(fVar)) {
                    this.f52463r.k(fVar, fVar2);
                } else {
                    u0.e.a(this.f52463r, g11.a().get(i11));
                }
                long j11 = g11.e()[i11];
                Long h11 = this.f52463r.v0(fVar2).h();
                long longValue = h11 != null ? h11.longValue() : 0L;
                g11.e()[i11] = longValue;
                this.f52455j = (this.f52455j - j11) + longValue;
                i11++;
            }
        }
        g11.i(null);
        if (g11.h()) {
            s0(g11);
            return;
        }
        this.f52456k++;
        l60.l lVar = this.f52457l;
        g0.m(lVar);
        if (!z11 && !g11.g()) {
            this.f52453h.remove(g11.d());
            lVar.n5("REMOVE");
            lVar.writeByte(32);
            lVar.n5(g11.d());
            lVar.writeByte(10);
            lVar.flush();
            if (this.f52455j <= this.f52447b || d0()) {
                f0();
            }
        }
        g11.l(true);
        lVar.n5("CLEAN");
        lVar.writeByte(32);
        lVar.n5(g11.d());
        g11.o(lVar);
        lVar.writeByte(10);
        lVar.flush();
        if (this.f52455j <= this.f52447b) {
        }
        f0();
    }

    public final void U() {
        close();
        u0.e.b(this.f52463r, this.f52446a);
    }

    @l
    public final synchronized C0621b V(@k String str) {
        L();
        x0(str);
        c0();
        c cVar = this.f52453h.get(str);
        if ((cVar != null ? cVar.b() : null) != null) {
            return null;
        }
        if (cVar != null && cVar.f() != 0) {
            return null;
        }
        if (!this.f52461p && !this.f52462q) {
            l60.l lVar = this.f52457l;
            g0.m(lVar);
            lVar.n5("DIRTY");
            lVar.writeByte(32);
            lVar.n5(str);
            lVar.writeByte(10);
            lVar.flush();
            if (this.f52458m) {
                return null;
            }
            if (cVar == null) {
                cVar = new c(str);
                this.f52453h.put(str, cVar);
            }
            C0621b c0621b = new C0621b(cVar);
            cVar.i(c0621b);
            return c0621b;
        }
        f0();
        return null;
    }

    public final synchronized void Z() {
        try {
            c0();
            for (c cVar : (c[]) this.f52453h.values().toArray(new c[0])) {
                s0(cVar);
            }
            this.f52461p = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @l
    public final synchronized d a0(@k String str) {
        d n11;
        L();
        x0(str);
        c0();
        c cVar = this.f52453h.get(str);
        if (cVar != null && (n11 = cVar.n()) != null) {
            this.f52456k++;
            l60.l lVar = this.f52457l;
            g0.m(lVar);
            lVar.n5("READ");
            lVar.writeByte(32);
            lVar.n5(str);
            lVar.writeByte(10);
            if (d0()) {
                f0();
            }
            return n11;
        }
        return null;
    }

    public final synchronized void c0() {
        try {
            if (this.f52459n) {
                return;
            }
            this.f52463r.U(this.f52451f);
            if (this.f52463r.f0(this.f52452g)) {
                if (this.f52463r.f0(this.f52450e)) {
                    this.f52463r.U(this.f52452g);
                } else {
                    this.f52463r.k(this.f52452g, this.f52450e);
                }
            }
            if (this.f52463r.f0(this.f52450e)) {
                try {
                    k0();
                    i0();
                    this.f52459n = true;
                    return;
                } catch (IOException unused) {
                    try {
                        U();
                        this.f52460o = false;
                    } catch (Throwable th2) {
                        this.f52460o = false;
                        throw th2;
                    }
                }
            }
            y0();
            this.f52459n = true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.f52459n && !this.f52460o) {
                for (c cVar : (c[]) this.f52453h.values().toArray(new c[0])) {
                    C0621b b11 = cVar.b();
                    if (b11 != null) {
                        b11.e();
                    }
                }
                w0();
                s0.f(this.f52454i, null, 1, null);
                l60.l lVar = this.f52457l;
                g0.m(lVar);
                lVar.close();
                this.f52457l = null;
                this.f52460o = true;
                return;
            }
            this.f52460o = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean d0() {
        return this.f52456k >= 2000;
    }

    public final void f0() {
        c40.k.f(this.f52454i, null, null, new f(null), 3, null);
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.f52459n) {
            L();
            w0();
            l60.l lVar = this.f52457l;
            g0.m(lVar);
            lVar.flush();
        }
    }

    public final l60.l h0() {
        return l60.r0.d(new g0.c(this.f52463r.f(this.f52450e), new g()));
    }

    public final void i0() {
        Iterator<c> it = this.f52453h.values().iterator();
        long j11 = 0;
        while (it.hasNext()) {
            c next = it.next();
            int i11 = 0;
            if (next.b() == null) {
                int i12 = this.f52449d;
                while (i11 < i12) {
                    j11 += next.e()[i11];
                    i11++;
                }
            } else {
                next.i(null);
                int i13 = this.f52449d;
                while (i11 < i13) {
                    this.f52463r.U(next.a().get(i11));
                    this.f52463r.U(next.c().get(i11));
                    i11++;
                }
                it.remove();
            }
        }
        this.f52455j = j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k0() {
        /*
            r12 = this;
            java.lang.String r0 = ", "
            g0.b$e r1 = r12.f52463r
            okio.f r2 = r12.f52450e
            l60.g1 r1 = r1.F0(r2)
            l60.m r1 = l60.r0.e(r1)
            r2 = 0
            java.lang.String r3 = r1.L5()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = r1.L5()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r5 = r1.L5()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r6 = r1.L5()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r7 = r1.L5()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r8 = "libcore.io.DiskLruCache"
            boolean r8 = kotlin.jvm.internal.g0.g(r8, r3)     // Catch: java.lang.Throwable -> L5c
            if (r8 == 0) goto L81
            java.lang.String r8 = "1"
            boolean r8 = kotlin.jvm.internal.g0.g(r8, r4)     // Catch: java.lang.Throwable -> L5c
            if (r8 == 0) goto L81
            int r8 = r12.f52448c     // Catch: java.lang.Throwable -> L5c
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L5c
            boolean r8 = kotlin.jvm.internal.g0.g(r8, r5)     // Catch: java.lang.Throwable -> L5c
            if (r8 == 0) goto L81
            int r8 = r12.f52449d     // Catch: java.lang.Throwable -> L5c
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L5c
            boolean r8 = kotlin.jvm.internal.g0.g(r8, r6)     // Catch: java.lang.Throwable -> L5c
            if (r8 == 0) goto L81
            int r8 = r7.length()     // Catch: java.lang.Throwable -> L5c
            if (r8 > 0) goto L81
            r0 = 0
        L52:
            java.lang.String r3 = r1.L5()     // Catch: java.lang.Throwable -> L5c java.io.EOFException -> L5e
            r12.m0(r3)     // Catch: java.lang.Throwable -> L5c java.io.EOFException -> L5e
            int r0 = r0 + 1
            goto L52
        L5c:
            r0 = move-exception
            goto Lb5
        L5e:
            java.util.LinkedHashMap<java.lang.String, g0.b$c> r3 = r12.f52453h     // Catch: java.lang.Throwable -> L5c
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L5c
            int r0 = r0 - r3
            r12.f52456k = r0     // Catch: java.lang.Throwable -> L5c
            boolean r0 = r1.J()     // Catch: java.lang.Throwable -> L5c
            if (r0 != 0) goto L71
            r12.y0()     // Catch: java.lang.Throwable -> L5c
            goto L77
        L71:
            l60.l r0 = r12.h0()     // Catch: java.lang.Throwable -> L5c
            r12.f52457l = r0     // Catch: java.lang.Throwable -> L5c
        L77:
            yz.g2 r0 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L5c
            if (r1 == 0) goto Lc2
            r1.close()     // Catch: java.lang.Throwable -> L7f
            goto Lc2
        L7f:
            r2 = move-exception
            goto Lc2
        L81:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r9.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r10 = "unexpected journal header: ["
            r9.append(r10)     // Catch: java.lang.Throwable -> L5c
            r9.append(r3)     // Catch: java.lang.Throwable -> L5c
            r9.append(r0)     // Catch: java.lang.Throwable -> L5c
            r9.append(r4)     // Catch: java.lang.Throwable -> L5c
            r9.append(r0)     // Catch: java.lang.Throwable -> L5c
            r9.append(r5)     // Catch: java.lang.Throwable -> L5c
            r9.append(r0)     // Catch: java.lang.Throwable -> L5c
            r9.append(r6)     // Catch: java.lang.Throwable -> L5c
            r9.append(r0)     // Catch: java.lang.Throwable -> L5c
            r9.append(r7)     // Catch: java.lang.Throwable -> L5c
            r0 = 93
            r9.append(r0)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = r9.toString()     // Catch: java.lang.Throwable -> L5c
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L5c
            throw r8     // Catch: java.lang.Throwable -> L5c
        Lb5:
            if (r1 == 0) goto Lbf
            r1.close()     // Catch: java.lang.Throwable -> Lbb
            goto Lbf
        Lbb:
            r1 = move-exception
            yz.r.a(r0, r1)
        Lbf:
            r11 = r2
            r2 = r0
            r0 = r11
        Lc2:
            if (r2 != 0) goto Lc8
            kotlin.jvm.internal.g0.m(r0)
            return
        Lc8:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.b.k0():void");
    }

    public final void m0(String str) {
        String substring;
        int I3 = k0.I3(str, ' ', 0, false, 6, null);
        if (I3 == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i11 = I3 + 1;
        int I32 = k0.I3(str, ' ', i11, false, 4, null);
        if (I32 == -1) {
            substring = str.substring(i11);
            g0.o(substring, "substring(...)");
            if (I3 == 6 && f0.J2(str, "REMOVE", false, 2, null)) {
                this.f52453h.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i11, I32);
            g0.o(substring, "substring(...)");
        }
        LinkedHashMap<String, c> linkedHashMap = this.f52453h;
        c cVar = linkedHashMap.get(substring);
        if (cVar == null) {
            cVar = new c(substring);
            linkedHashMap.put(substring, cVar);
        }
        c cVar2 = cVar;
        if (I32 != -1 && I3 == 5 && f0.J2(str, "CLEAN", false, 2, null)) {
            String substring2 = str.substring(I32 + 1);
            g0.o(substring2, "substring(...)");
            List<String> n52 = k0.n5(substring2, new char[]{' '}, false, 0, 6, null);
            cVar2.l(true);
            cVar2.i(null);
            cVar2.j(n52);
            return;
        }
        if (I32 == -1 && I3 == 5 && f0.J2(str, "DIRTY", false, 2, null)) {
            cVar2.i(new C0621b(cVar2));
            return;
        }
        if (I32 == -1 && I3 == 4 && f0.J2(str, "READ", false, 2, null)) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    public final synchronized boolean o0(@k String str) {
        L();
        x0(str);
        c0();
        c cVar = this.f52453h.get(str);
        if (cVar == null) {
            return false;
        }
        boolean s02 = s0(cVar);
        if (s02 && this.f52455j <= this.f52447b) {
            this.f52461p = false;
        }
        return s02;
    }

    public final boolean s0(c cVar) {
        l60.l lVar;
        if (cVar.f() > 0 && (lVar = this.f52457l) != null) {
            lVar.n5("DIRTY");
            lVar.writeByte(32);
            lVar.n5(cVar.d());
            lVar.writeByte(10);
            lVar.flush();
        }
        if (cVar.f() > 0 || cVar.b() != null) {
            cVar.m(true);
            return true;
        }
        int i11 = this.f52449d;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f52463r.U(cVar.a().get(i12));
            this.f52455j -= cVar.e()[i12];
            cVar.e()[i12] = 0;
        }
        this.f52456k++;
        l60.l lVar2 = this.f52457l;
        if (lVar2 != null) {
            lVar2.n5("REMOVE");
            lVar2.writeByte(32);
            lVar2.n5(cVar.d());
            lVar2.writeByte(10);
        }
        this.f52453h.remove(cVar.d());
        if (d0()) {
            f0();
        }
        return true;
    }

    public final synchronized long size() {
        c0();
        return this.f52455j;
    }

    public final boolean v0() {
        for (c cVar : this.f52453h.values()) {
            if (!cVar.h()) {
                s0(cVar);
                return true;
            }
        }
        return false;
    }

    public final void w0() {
        while (this.f52455j > this.f52447b) {
            if (!v0()) {
                return;
            }
        }
        this.f52461p = false;
    }

    public final void x0(String str) {
        if (C.matches(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    public final synchronized void y0() {
        g2 g2Var;
        try {
            l60.l lVar = this.f52457l;
            if (lVar != null) {
                lVar.close();
            }
            l60.l d11 = l60.r0.d(this.f52463r.D0(this.f52451f, false));
            Throwable th2 = null;
            try {
                d11.n5("libcore.io.DiskLruCache").writeByte(10);
                d11.n5("1").writeByte(10);
                d11.Q1(this.f52448c).writeByte(10);
                d11.Q1(this.f52449d).writeByte(10);
                d11.writeByte(10);
                for (c cVar : this.f52453h.values()) {
                    if (cVar.b() != null) {
                        d11.n5("DIRTY");
                        d11.writeByte(32);
                        d11.n5(cVar.d());
                        d11.writeByte(10);
                    } else {
                        d11.n5("CLEAN");
                        d11.writeByte(32);
                        d11.n5(cVar.d());
                        cVar.o(d11);
                        d11.writeByte(10);
                    }
                }
                g2Var = g2.f100423a;
                if (d11 != null) {
                    try {
                        d11.close();
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                }
            } catch (Throwable th4) {
                if (d11 != null) {
                    try {
                        d11.close();
                    } catch (Throwable th5) {
                        r.a(th4, th5);
                    }
                }
                g2Var = null;
                th2 = th4;
            }
            if (th2 != null) {
                throw th2;
            }
            g0.m(g2Var);
            if (this.f52463r.f0(this.f52450e)) {
                this.f52463r.k(this.f52450e, this.f52452g);
                this.f52463r.k(this.f52451f, this.f52450e);
                this.f52463r.U(this.f52452g);
            } else {
                this.f52463r.k(this.f52451f, this.f52450e);
            }
            this.f52457l = h0();
            this.f52456k = 0;
            this.f52458m = false;
            this.f52462q = false;
        } catch (Throwable th6) {
            throw th6;
        }
    }
}
