package w50;

import e60.j;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.text.Regex;
import l60.e1;
import l60.g1;
import l60.m;
import l60.r0;
import l60.w;
import m80.k;
import m80.l;
import org.junit.jupiter.api.j2;
import u30.f0;
import u30.k0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,1065:1\n1#2:1066\n608#3,4:1067\n37#4,2:1071\n37#4,2:1073\n*S KotlinDebug\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache\n*L\n215#1:1067,4\n672#1:1071,2\n721#1:1073,2\n*E\n"})
/* loaded from: classes8.dex */
public final class d implements Closeable, Flushable {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d60.a f95347a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final File f95348b;

    /* renamed from: c, reason: collision with root package name */
    public final int f95349c;

    /* renamed from: d, reason: collision with root package name */
    public final int f95350d;

    /* renamed from: e, reason: collision with root package name */
    public long f95351e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final File f95352f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final File f95353g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final File f95354h;

    /* renamed from: i, reason: collision with root package name */
    public long f95355i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public l60.l f95356j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final LinkedHashMap<String, c> f95357k;

    /* renamed from: l, reason: collision with root package name */
    public int f95358l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f95359m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f95360n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f95361o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f95362p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f95363q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f95364r;

    /* renamed from: s, reason: collision with root package name */
    public long f95365s;

    /* renamed from: t, reason: collision with root package name */
    @k
    public final y50.c f95366t;

    /* renamed from: u, reason: collision with root package name */
    @k
    public final e f95367u;

    /* renamed from: v, reason: collision with root package name */
    @k
    public static final a f95342v = new a(null);

    /* renamed from: w, reason: collision with root package name */
    @w00.g
    @k
    public static final String f95343w = "journal";

    /* renamed from: x, reason: collision with root package name */
    @w00.g
    @k
    public static final String f95344x = "journal.tmp";

    /* renamed from: y, reason: collision with root package name */
    @w00.g
    @k
    public static final String f95345y = "journal.bkp";

    /* renamed from: z, reason: collision with root package name */
    @w00.g
    @k
    public static final String f95346z = "libcore.io.DiskLruCache";

    @w00.g
    @k
    public static final String A = "1";

    @w00.g
    public static final long B = -1;

    @w00.g
    @k
    public static final Regex C = new Regex("[a-z0-9_-]{1,120}");

    @w00.g
    @k
    public static final String D = "CLEAN";

    @w00.g
    @k
    public static final String E = "DIRTY";

    @w00.g
    @k
    public static final String F = "REMOVE";

    @w00.g
    @k
    public static final String G = "READ";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final c f95368a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final boolean[] f95369b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f95370c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d f95371d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a extends Lambda implements x00.l<IOException, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f95372a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f95373b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, b bVar) {
                super(1);
                this.f95372a = dVar;
                this.f95373b = bVar;
            }

            public final void a(@k IOException it) {
                g0.p(it, "it");
                d dVar = this.f95372a;
                b bVar = this.f95373b;
                synchronized (dVar) {
                    bVar.c();
                    g2 g2Var = g2.f100423a;
                }
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(IOException iOException) {
                a(iOException);
                return g2.f100423a;
            }
        }

        public b(@k d dVar, c entry) {
            g0.p(entry, "entry");
            this.f95371d = dVar;
            this.f95368a = entry;
            this.f95369b = entry.g() ? null : new boolean[dVar.d0()];
        }

        public final void a() throws IOException {
            d dVar = this.f95371d;
            synchronized (dVar) {
                try {
                    if (this.f95370c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (g0.g(this.f95368a.b(), this)) {
                        dVar.w(this, false);
                    }
                    this.f95370c = true;
                    g2 g2Var = g2.f100423a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void b() throws IOException {
            d dVar = this.f95371d;
            synchronized (dVar) {
                try {
                    if (this.f95370c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (g0.g(this.f95368a.b(), this)) {
                        dVar.w(this, true);
                    }
                    this.f95370c = true;
                    g2 g2Var = g2.f100423a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void c() {
            if (g0.g(this.f95368a.b(), this)) {
                if (this.f95371d.f95360n) {
                    this.f95371d.w(this, false);
                } else {
                    this.f95368a.q(true);
                }
            }
        }

        @k
        public final c d() {
            return this.f95368a;
        }

        @l
        public final boolean[] e() {
            return this.f95369b;
        }

        @k
        public final e1 f(int i11) {
            d dVar = this.f95371d;
            synchronized (dVar) {
                if (this.f95370c) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!g0.g(this.f95368a.b(), this)) {
                    return r0.c();
                }
                if (!this.f95368a.g()) {
                    boolean[] zArr = this.f95369b;
                    g0.m(zArr);
                    zArr[i11] = true;
                }
                try {
                    return new w50.e(dVar.Z().h(this.f95368a.c().get(i11)), new a(dVar, this));
                } catch (FileNotFoundException unused) {
                    return r0.c();
                }
            }
        }

        @l
        public final g1 g(int i11) {
            d dVar = this.f95371d;
            synchronized (dVar) {
                if (this.f95370c) {
                    throw new IllegalStateException("Check failed.");
                }
                g1 g1Var = null;
                if (!this.f95368a.g() || !g0.g(this.f95368a.b(), this) || this.f95368a.i()) {
                    return null;
                }
                try {
                    g1Var = dVar.Z().g(this.f95368a.a().get(i11));
                } catch (FileNotFoundException unused) {
                }
                return g1Var;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$Entry\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,1065:1\n608#2,4:1066\n*S KotlinDebug\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$Entry\n*L\n1001#1:1066,4\n*E\n"})
    public final class c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f95374a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final long[] f95375b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<File> f95376c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final List<File> f95377d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f95378e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f95379f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public b f95380g;

        /* renamed from: h, reason: collision with root package name */
        public int f95381h;

        /* renamed from: i, reason: collision with root package name */
        public long f95382i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ d f95383j;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a extends w {

            /* renamed from: b, reason: collision with root package name */
            public boolean f95384b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f95385c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ c f95386d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g1 g1Var, d dVar, c cVar) {
                super(g1Var);
                this.f95385c = dVar;
                this.f95386d = cVar;
            }

            @Override // l60.w, l60.g1, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                super.close();
                if (this.f95384b) {
                    return;
                }
                this.f95384b = true;
                d dVar = this.f95385c;
                c cVar = this.f95386d;
                synchronized (dVar) {
                    try {
                        cVar.n(cVar.f() - 1);
                        if (cVar.f() == 0 && cVar.i()) {
                            dVar.w0(cVar);
                        }
                        g2 g2Var = g2.f100423a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public c(@k d dVar, String key) {
            g0.p(key, "key");
            this.f95383j = dVar;
            this.f95374a = key;
            this.f95375b = new long[dVar.d0()];
            this.f95376c = new ArrayList();
            this.f95377d = new ArrayList();
            StringBuilder sb2 = new StringBuilder(key);
            sb2.append('.');
            int length = sb2.length();
            int d02 = dVar.d0();
            for (int i11 = 0; i11 < d02; i11++) {
                sb2.append(i11);
                this.f95376c.add(new File(this.f95383j.V(), sb2.toString()));
                sb2.append(".tmp");
                this.f95377d.add(new File(this.f95383j.V(), sb2.toString()));
                sb2.setLength(length);
            }
        }

        @k
        public final List<File> a() {
            return this.f95376c;
        }

        @l
        public final b b() {
            return this.f95380g;
        }

        @k
        public final List<File> c() {
            return this.f95377d;
        }

        @k
        public final String d() {
            return this.f95374a;
        }

        @k
        public final long[] e() {
            return this.f95375b;
        }

        public final int f() {
            return this.f95381h;
        }

        public final boolean g() {
            return this.f95378e;
        }

        public final long h() {
            return this.f95382i;
        }

        public final boolean i() {
            return this.f95379f;
        }

        public final Void j(List<String> list) throws IOException {
            throw new IOException("unexpected journal line: " + list);
        }

        public final g1 k(int i11) {
            g1 g11 = this.f95383j.Z().g(this.f95376c.get(i11));
            if (this.f95383j.f95360n) {
                return g11;
            }
            this.f95381h++;
            return new a(g11, this.f95383j, this);
        }

        public final void l(@l b bVar) {
            this.f95380g = bVar;
        }

        public final void m(@k List<String> strings) throws IOException {
            g0.p(strings, "strings");
            if (strings.size() != this.f95383j.d0()) {
                j(strings);
                throw new KotlinNothingValueException();
            }
            try {
                int size = strings.size();
                for (int i11 = 0; i11 < size; i11++) {
                    this.f95375b[i11] = Long.parseLong(strings.get(i11));
                }
            } catch (NumberFormatException unused) {
                j(strings);
                throw new KotlinNothingValueException();
            }
        }

        public final void n(int i11) {
            this.f95381h = i11;
        }

        public final void o(boolean z11) {
            this.f95378e = z11;
        }

        public final void p(long j11) {
            this.f95382i = j11;
        }

        public final void q(boolean z11) {
            this.f95379f = z11;
        }

        @l
        public final C1282d r() {
            d dVar = this.f95383j;
            if (u50.f.f91853h && !Thread.holdsLock(dVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + dVar);
            }
            if (!this.f95378e) {
                return null;
            }
            if (!this.f95383j.f95360n && (this.f95380g != null || this.f95379f)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.f95375b.clone();
            try {
                int d02 = this.f95383j.d0();
                for (int i11 = 0; i11 < d02; i11++) {
                    arrayList.add(k(i11));
                }
                return new C1282d(this.f95383j, this.f95374a, this.f95382i, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    u50.f.o((g1) it.next());
                }
                try {
                    this.f95383j.w0(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void s(@k l60.l writer) throws IOException {
            g0.p(writer, "writer");
            for (long j11 : this.f95375b) {
                writer.writeByte(32).Q1(j11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: w50.d$d, reason: collision with other inner class name */
    public final class C1282d implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f95387a;

        /* renamed from: b, reason: collision with root package name */
        public final long f95388b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<g1> f95389c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final long[] f95390d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ d f95391e;

        /* JADX WARN: Multi-variable type inference failed */
        public C1282d(@k d dVar, String key, @k long j11, @k List<? extends g1> sources, long[] lengths) {
            g0.p(key, "key");
            g0.p(sources, "sources");
            g0.p(lengths, "lengths");
            this.f95391e = dVar;
            this.f95387a = key;
            this.f95388b = j11;
            this.f95389c = sources;
            this.f95390d = lengths;
        }

        @l
        public final b a() throws IOException {
            return this.f95391e.H(this.f95387a, this.f95388b);
        }

        public final long c(int i11) {
            return this.f95390d[i11];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator<g1> it = this.f95389c.iterator();
            while (it.hasNext()) {
                u50.f.o(it.next());
            }
        }

        @k
        public final g1 e(int i11) {
            return this.f95389c.get(i11);
        }

        @k
        public final String f() {
            return this.f95387a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e extends y50.a {
        public e(String str) {
            super(str, false, 2, null);
        }

        @Override // y50.a
        public long f() {
            d dVar = d.this;
            synchronized (dVar) {
                if (!dVar.f95361o || dVar.U()) {
                    return -1L;
                }
                try {
                    dVar.C0();
                } catch (IOException unused) {
                    dVar.f95363q = true;
                }
                try {
                    if (dVar.h0()) {
                        dVar.s0();
                        dVar.f95358l = 0;
                    }
                } catch (IOException unused2) {
                    dVar.f95364r = true;
                    dVar.f95356j = r0.d(r0.c());
                }
                return -1L;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$newJournalWriter$faultHidingSink$1\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,1065:1\n608#2,4:1066\n*S KotlinDebug\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$newJournalWriter$faultHidingSink$1\n*L\n304#1:1066,4\n*E\n"})
    public static final class f extends Lambda implements x00.l<IOException, g2> {
        public f() {
            super(1);
        }

        public final void a(@k IOException it) {
            g0.p(it, "it");
            d dVar = d.this;
            if (!u50.f.f91853h || Thread.holdsLock(dVar)) {
                d.this.f95359m = true;
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + dVar);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(IOException iOException) {
            a(iOException);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$snapshots$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1065:1\n1#2:1066\n*E\n"})
    public static final class g implements Iterator<C1282d>, y00.d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Iterator<c> f95394a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public C1282d f95395b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public C1282d f95396c;

        public g() {
            Iterator<c> it = new ArrayList(d.this.a0().values()).iterator();
            g0.o(it, "ArrayList(lruEntries.values).iterator()");
            this.f95394a = it;
        }

        @Override // java.util.Iterator
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1282d next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            C1282d c1282d = this.f95395b;
            this.f95396c = c1282d;
            this.f95395b = null;
            g0.m(c1282d);
            return c1282d;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            C1282d r11;
            if (this.f95395b != null) {
                return true;
            }
            d dVar = d.this;
            synchronized (dVar) {
                if (dVar.U()) {
                    return false;
                }
                while (this.f95394a.hasNext()) {
                    c next = this.f95394a.next();
                    if (next != null && (r11 = next.r()) != null) {
                        this.f95395b = r11;
                        return true;
                    }
                }
                g2 g2Var = g2.f100423a;
                return false;
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            C1282d c1282d = this.f95396c;
            if (c1282d == null) {
                throw new IllegalStateException("remove() before next()");
            }
            try {
                d.this.v0(c1282d.f());
            } catch (IOException unused) {
            } finally {
                this.f95396c = null;
            }
        }
    }

    public d(@k d60.a fileSystem, @k File directory, int i11, int i12, long j11, @k y50.d taskRunner) {
        g0.p(fileSystem, "fileSystem");
        g0.p(directory, "directory");
        g0.p(taskRunner, "taskRunner");
        this.f95347a = fileSystem;
        this.f95348b = directory;
        this.f95349c = i11;
        this.f95350d = i12;
        this.f95351e = j11;
        this.f95357k = new LinkedHashMap<>(0, 0.75f, true);
        this.f95366t = taskRunner.j();
        this.f95367u = new e(u50.f.f91854i + " Cache");
        if (j11 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i12 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.f95352f = new File(directory, f95343w);
        this.f95353g = new File(directory, f95344x);
        this.f95354h = new File(directory, f95345y);
    }

    public static /* synthetic */ b I(d dVar, String str, long j11, int i11, Object obj) throws IOException {
        if ((i11 & 2) != 0) {
            j11 = B;
        }
        return dVar.H(str, j11);
    }

    @k
    public final synchronized Iterator<C1282d> A0() throws IOException {
        f0();
        return new g();
    }

    public final void C() throws IOException {
        close();
        this.f95347a.a(this.f95348b);
    }

    public final void C0() throws IOException {
        while (this.f95355i > this.f95351e) {
            if (!x0()) {
                return;
            }
        }
        this.f95363q = false;
    }

    public final void D0(String str) {
        if (C.matches(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    @l
    @w00.k
    public final b E(@k String key) throws IOException {
        g0.p(key, "key");
        return I(this, key, 0L, 2, null);
    }

    @l
    @w00.k
    public final synchronized b H(@k String key, long j11) throws IOException {
        g0.p(key, "key");
        f0();
        r();
        D0(key);
        c cVar = this.f95357k.get(key);
        if (j11 != B && (cVar == null || cVar.h() != j11)) {
            return null;
        }
        if ((cVar != null ? cVar.b() : null) != null) {
            return null;
        }
        if (cVar != null && cVar.f() != 0) {
            return null;
        }
        if (!this.f95363q && !this.f95364r) {
            l60.l lVar = this.f95356j;
            g0.m(lVar);
            lVar.n5(E).writeByte(32).n5(key).writeByte(10);
            lVar.flush();
            if (this.f95359m) {
                return null;
            }
            if (cVar == null) {
                cVar = new c(this, key);
                this.f95357k.put(key, cVar);
            }
            b bVar = new b(this, cVar);
            cVar.l(bVar);
            return bVar;
        }
        y50.c.p(this.f95366t, this.f95367u, 0L, 2, null);
        return null;
    }

    public final synchronized void L() throws IOException {
        try {
            f0();
            Collection<c> values = this.f95357k.values();
            g0.o(values, "lruEntries.values");
            for (c entry : (c[]) values.toArray(new c[0])) {
                g0.o(entry, "entry");
                w0(entry);
            }
            this.f95363q = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @l
    public final synchronized C1282d S(@k String key) throws IOException {
        g0.p(key, "key");
        f0();
        r();
        D0(key);
        c cVar = this.f95357k.get(key);
        if (cVar == null) {
            return null;
        }
        C1282d r11 = cVar.r();
        if (r11 == null) {
            return null;
        }
        this.f95358l++;
        l60.l lVar = this.f95356j;
        g0.m(lVar);
        lVar.n5(G).writeByte(32).n5(key).writeByte(10);
        if (h0()) {
            y50.c.p(this.f95366t, this.f95367u, 0L, 2, null);
        }
        return r11;
    }

    public final boolean U() {
        return this.f95362p;
    }

    @k
    public final File V() {
        return this.f95348b;
    }

    @k
    public final d60.a Z() {
        return this.f95347a;
    }

    @k
    public final LinkedHashMap<String, c> a0() {
        return this.f95357k;
    }

    public final synchronized long c0() {
        return this.f95351e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        b b11;
        try {
            if (this.f95361o && !this.f95362p) {
                Collection<c> values = this.f95357k.values();
                g0.o(values, "lruEntries.values");
                for (c cVar : (c[]) values.toArray(new c[0])) {
                    if (cVar.b() != null && (b11 = cVar.b()) != null) {
                        b11.c();
                    }
                }
                C0();
                l60.l lVar = this.f95356j;
                g0.m(lVar);
                lVar.close();
                this.f95356j = null;
                this.f95362p = true;
                return;
            }
            this.f95362p = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final int d0() {
        return this.f95350d;
    }

    public final synchronized void f0() throws IOException {
        try {
            if (u50.f.f91853h && !Thread.holdsLock(this)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
            }
            if (this.f95361o) {
                return;
            }
            if (this.f95347a.d(this.f95354h)) {
                if (this.f95347a.d(this.f95352f)) {
                    this.f95347a.c(this.f95354h);
                } else {
                    this.f95347a.b(this.f95354h, this.f95352f);
                }
            }
            this.f95360n = u50.f.M(this.f95347a, this.f95354h);
            if (this.f95347a.d(this.f95352f)) {
                try {
                    m0();
                    k0();
                    this.f95361o = true;
                    return;
                } catch (IOException e11) {
                    j.f49490a.g().m("DiskLruCache " + this.f95348b + " is corrupt: " + e11.getMessage() + ", removing", 5, e11);
                    try {
                        C();
                        this.f95362p = false;
                    } catch (Throwable th2) {
                        this.f95362p = false;
                        throw th2;
                    }
                }
            }
            s0();
            this.f95361o = true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
        if (this.f95361o) {
            r();
            C0();
            l60.l lVar = this.f95356j;
            g0.m(lVar);
            lVar.flush();
        }
    }

    public final boolean h0() {
        int i11 = this.f95358l;
        return i11 >= 2000 && i11 >= this.f95357k.size();
    }

    public final l60.l i0() throws FileNotFoundException {
        return r0.d(new w50.e(this.f95347a.e(this.f95352f), new f()));
    }

    public final synchronized boolean isClosed() {
        return this.f95362p;
    }

    public final void k0() throws IOException {
        this.f95347a.c(this.f95353g);
        Iterator<c> it = this.f95357k.values().iterator();
        while (it.hasNext()) {
            c next = it.next();
            g0.o(next, "i.next()");
            c cVar = next;
            int i11 = 0;
            if (cVar.b() == null) {
                int i12 = this.f95350d;
                while (i11 < i12) {
                    this.f95355i += cVar.e()[i11];
                    i11++;
                }
            } else {
                cVar.l(null);
                int i13 = this.f95350d;
                while (i11 < i13) {
                    this.f95347a.c(cVar.a().get(i11));
                    this.f95347a.c(cVar.c().get(i11));
                    i11++;
                }
                it.remove();
            }
        }
    }

    public final void m0() throws IOException {
        m e11 = r0.e(this.f95347a.g(this.f95352f));
        try {
            String L5 = e11.L5();
            String L52 = e11.L5();
            String L53 = e11.L5();
            String L54 = e11.L5();
            String L55 = e11.L5();
            if (!g0.g(f95346z, L5) || !g0.g(A, L52) || !g0.g(String.valueOf(this.f95349c), L53) || !g0.g(String.valueOf(this.f95350d), L54) || L55.length() > 0) {
                throw new IOException("unexpected journal header: [" + L5 + j2.O + L52 + j2.O + L54 + j2.O + L55 + l50.b.f69930l);
            }
            int i11 = 0;
            while (true) {
                try {
                    o0(e11.L5());
                    i11++;
                } catch (EOFException unused) {
                    this.f95358l = i11 - this.f95357k.size();
                    if (e11.J()) {
                        this.f95356j = i0();
                    } else {
                        s0();
                    }
                    g2 g2Var = g2.f100423a;
                    r00.b.a(e11, null);
                    return;
                }
            }
        } finally {
        }
    }

    public final void o0(String str) throws IOException {
        String substring;
        int I3 = k0.I3(str, ' ', 0, false, 6, null);
        if (I3 == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i11 = I3 + 1;
        int I32 = k0.I3(str, ' ', i11, false, 4, null);
        if (I32 == -1) {
            substring = str.substring(i11);
            g0.o(substring, "this as java.lang.String).substring(startIndex)");
            String str2 = F;
            if (I3 == str2.length() && f0.J2(str, str2, false, 2, null)) {
                this.f95357k.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i11, I32);
            g0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        c cVar = this.f95357k.get(substring);
        if (cVar == null) {
            cVar = new c(this, substring);
            this.f95357k.put(substring, cVar);
        }
        if (I32 != -1) {
            String str3 = D;
            if (I3 == str3.length() && f0.J2(str, str3, false, 2, null)) {
                String substring2 = str.substring(I32 + 1);
                g0.o(substring2, "this as java.lang.String).substring(startIndex)");
                List<String> n52 = k0.n5(substring2, new char[]{' '}, false, 0, 6, null);
                cVar.o(true);
                cVar.l(null);
                cVar.m(n52);
                return;
            }
        }
        if (I32 == -1) {
            String str4 = E;
            if (I3 == str4.length() && f0.J2(str, str4, false, 2, null)) {
                cVar.l(new b(this, cVar));
                return;
            }
        }
        if (I32 == -1) {
            String str5 = G;
            if (I3 == str5.length() && f0.J2(str, str5, false, 2, null)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: " + str);
    }

    public final synchronized void r() {
        if (this.f95362p) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void s0() throws IOException {
        try {
            l60.l lVar = this.f95356j;
            if (lVar != null) {
                lVar.close();
            }
            l60.l d11 = r0.d(this.f95347a.h(this.f95353g));
            try {
                d11.n5(f95346z).writeByte(10);
                d11.n5(A).writeByte(10);
                d11.Q1(this.f95349c).writeByte(10);
                d11.Q1(this.f95350d).writeByte(10);
                d11.writeByte(10);
                for (c cVar : this.f95357k.values()) {
                    if (cVar.b() != null) {
                        d11.n5(E).writeByte(32);
                        d11.n5(cVar.d());
                        d11.writeByte(10);
                    } else {
                        d11.n5(D).writeByte(32);
                        d11.n5(cVar.d());
                        cVar.s(d11);
                        d11.writeByte(10);
                    }
                }
                g2 g2Var = g2.f100423a;
                r00.b.a(d11, null);
                if (this.f95347a.d(this.f95352f)) {
                    this.f95347a.b(this.f95352f, this.f95354h);
                }
                this.f95347a.b(this.f95353g, this.f95352f);
                this.f95347a.c(this.f95354h);
                this.f95356j = i0();
                this.f95359m = false;
                this.f95364r = false;
            } finally {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long size() throws IOException {
        f0();
        return this.f95355i;
    }

    public final synchronized boolean v0(@k String key) throws IOException {
        g0.p(key, "key");
        f0();
        r();
        D0(key);
        c cVar = this.f95357k.get(key);
        if (cVar == null) {
            return false;
        }
        boolean w02 = w0(cVar);
        if (w02 && this.f95355i <= this.f95351e) {
            this.f95363q = false;
        }
        return w02;
    }

    public final synchronized void w(@k b editor, boolean z11) throws IOException {
        g0.p(editor, "editor");
        c d11 = editor.d();
        if (!g0.g(d11.b(), editor)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z11 && !d11.g()) {
            int i11 = this.f95350d;
            for (int i12 = 0; i12 < i11; i12++) {
                boolean[] e11 = editor.e();
                g0.m(e11);
                if (!e11[i12]) {
                    editor.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i12);
                }
                if (!this.f95347a.d(d11.c().get(i12))) {
                    editor.a();
                    return;
                }
            }
        }
        int i13 = this.f95350d;
        for (int i14 = 0; i14 < i13; i14++) {
            File file = d11.c().get(i14);
            if (!z11 || d11.i()) {
                this.f95347a.c(file);
            } else if (this.f95347a.d(file)) {
                File file2 = d11.a().get(i14);
                this.f95347a.b(file, file2);
                long j11 = d11.e()[i14];
                long f11 = this.f95347a.f(file2);
                d11.e()[i14] = f11;
                this.f95355i = (this.f95355i - j11) + f11;
            }
        }
        d11.l(null);
        if (d11.i()) {
            w0(d11);
            return;
        }
        this.f95358l++;
        l60.l lVar = this.f95356j;
        g0.m(lVar);
        if (!d11.g() && !z11) {
            this.f95357k.remove(d11.d());
            lVar.n5(F).writeByte(32);
            lVar.n5(d11.d());
            lVar.writeByte(10);
            lVar.flush();
            if (this.f95355i <= this.f95351e || h0()) {
                y50.c.p(this.f95366t, this.f95367u, 0L, 2, null);
            }
        }
        d11.o(true);
        lVar.n5(D).writeByte(32);
        lVar.n5(d11.d());
        d11.s(lVar);
        lVar.writeByte(10);
        if (z11) {
            long j12 = this.f95365s;
            this.f95365s = 1 + j12;
            d11.p(j12);
        }
        lVar.flush();
        if (this.f95355i <= this.f95351e) {
        }
        y50.c.p(this.f95366t, this.f95367u, 0L, 2, null);
    }

    public final boolean w0(@k c entry) throws IOException {
        l60.l lVar;
        g0.p(entry, "entry");
        if (!this.f95360n) {
            if (entry.f() > 0 && (lVar = this.f95356j) != null) {
                lVar.n5(E);
                lVar.writeByte(32);
                lVar.n5(entry.d());
                lVar.writeByte(10);
                lVar.flush();
            }
            if (entry.f() > 0 || entry.b() != null) {
                entry.q(true);
                return true;
            }
        }
        b b11 = entry.b();
        if (b11 != null) {
            b11.c();
        }
        int i11 = this.f95350d;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f95347a.c(entry.a().get(i12));
            this.f95355i -= entry.e()[i12];
            entry.e()[i12] = 0;
        }
        this.f95358l++;
        l60.l lVar2 = this.f95356j;
        if (lVar2 != null) {
            lVar2.n5(F);
            lVar2.writeByte(32);
            lVar2.n5(entry.d());
            lVar2.writeByte(10);
        }
        this.f95357k.remove(entry.d());
        if (h0()) {
            y50.c.p(this.f95366t, this.f95367u, 0L, 2, null);
        }
        return true;
    }

    public final boolean x0() {
        for (c toEvict : this.f95357k.values()) {
            if (!toEvict.i()) {
                g0.o(toEvict, "toEvict");
                w0(toEvict);
                return true;
            }
        }
        return false;
    }

    public final void y0(boolean z11) {
        this.f95362p = z11;
    }

    public final synchronized void z0(long j11) {
        this.f95351e = j11;
        if (this.f95361o) {
            y50.c.p(this.f95366t, this.f95367u, 0L, 2, null);
        }
    }
}
