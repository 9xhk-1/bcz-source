package x50;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import l60.g1;
import l60.i1;
import m80.k;
import m80.l;
import okio.ByteString;
import u50.f;
import w00.g;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final a f97545k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    public static final int f97546l = 1;

    /* renamed from: m, reason: collision with root package name */
    public static final int f97547m = 2;

    /* renamed from: n, reason: collision with root package name */
    @g
    @k
    public static final ByteString f97548n;

    /* renamed from: o, reason: collision with root package name */
    @g
    @k
    public static final ByteString f97549o;

    /* renamed from: p, reason: collision with root package name */
    public static final long f97550p = 32;

    /* renamed from: a, reason: collision with root package name */
    @l
    public RandomAccessFile f97551a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public g1 f97552b;

    /* renamed from: c, reason: collision with root package name */
    public long f97553c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ByteString f97554d;

    /* renamed from: e, reason: collision with root package name */
    public final long f97555e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public Thread f97556f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final l60.k f97557g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f97558h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final l60.k f97559i;

    /* renamed from: j, reason: collision with root package name */
    public int f97560j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final b a(@k File file, @k g1 upstream, @k ByteString metadata, long j11) throws IOException {
            g0.p(file, "file");
            g0.p(upstream, "upstream");
            g0.p(metadata, "metadata");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            b bVar = new b(randomAccessFile, upstream, 0L, metadata, j11, null);
            randomAccessFile.setLength(0L);
            bVar.u(b.f97549o, -1L, -1L);
            return bVar;
        }

        @k
        public final b b(@k File file) throws IOException {
            g0.p(file, "file");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            g0.o(channel, "randomAccessFile.channel");
            x50.a aVar = new x50.a(channel);
            l60.k kVar = new l60.k();
            aVar.a(0L, kVar, 32L);
            if (!g0.g(kVar.h2(r11.size()), b.f97548n)) {
                throw new IOException("unreadable cache file");
            }
            long readLong = kVar.readLong();
            long readLong2 = kVar.readLong();
            l60.k kVar2 = new l60.k();
            aVar.a(32 + readLong, kVar2, readLong2);
            return new b(randomAccessFile, null, readLong, kVar2.q3(), 0L, null);
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nRelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Relay.kt\nokhttp3/internal/cache2/Relay$RelaySource\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,356:1\n563#2:357\n*S KotlinDebug\n*F\n+ 1 Relay.kt\nokhttp3/internal/cache2/Relay$RelaySource\n*L\n267#1:357\n*E\n"})
    /* renamed from: x50.b$b, reason: collision with other inner class name */
    public final class C1311b implements g1 {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final i1 f97561a = new i1();

        /* renamed from: b, reason: collision with root package name */
        @l
        public x50.a f97562b;

        /* renamed from: c, reason: collision with root package name */
        public long f97563c;

        public C1311b() {
            RandomAccessFile f11 = b.this.f();
            g0.m(f11);
            FileChannel channel = f11.getChannel();
            g0.o(channel, "file!!.channel");
            this.f97562b = new x50.a(channel);
        }

        @Override // l60.g1
        @k
        public i1 D() {
            return this.f97561a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
        
            if (r0 != 2) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        
            r6 = java.lang.Math.min(r21, r19.f97564d.j() - r19.f97563c);
            r2 = r19.f97562b;
            kotlin.jvm.internal.g0.m(r2);
            r2.a(r19.f97563c + 32, r20, r6);
            r19.f97563c += r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
        
            r0 = r19.f97564d.h();
            kotlin.jvm.internal.g0.m(r0);
            r11 = r0.L3(r19.f97564d.i(), r19.f97564d.d());
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
        
            if (r11 != (-1)) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
        
            r0 = r19.f97564d;
            r0.b(r0.j());
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x009d, code lost:
        
            r2 = r19.f97564d;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a0, code lost:
        
            r2.t(null);
            kotlin.jvm.internal.g0.n(r2, "null cannot be cast to non-null type java.lang.Object");
            r2.notifyAll();
            r0 = yz.g2.f100423a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00ad, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00ae, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00b5, code lost:
        
            r6 = java.lang.Math.min(r11, r21);
            r19.f97564d.i().c0(r20, 0, r6);
            r19.f97563c += r6;
            r13 = r19.f97562b;
            kotlin.jvm.internal.g0.m(r13);
            r13.b(r19.f97564d.j() + 32, r19.f97564d.i().clone(), r11);
            r4 = r19.f97564d;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00eb, code lost:
        
            monitor-enter(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00ec, code lost:
        
            r4.c().y8(r4.i(), r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0105, code lost:
        
            if (r4.c().size() <= r4.d()) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0107, code lost:
        
            r4.c().skip(r4.c().size() - r4.d());
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x011e, code lost:
        
            r4.s(r4.j() + r11);
            r0 = yz.g2.f100423a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0128, code lost:
        
            monitor-exit(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0129, code lost:
        
            r2 = r19.f97564d;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x012b, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x012c, code lost:
        
            r2.t(null);
            kotlin.jvm.internal.g0.n(r2, "null cannot be cast to non-null type java.lang.Object");
            r2.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0137, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0138, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x011c, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x013d, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00b2, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x013e, code lost:
        
            r2 = r19.f97564d;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0140, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0141, code lost:
        
            r2.t(null);
            kotlin.jvm.internal.g0.n(r2, "null cannot be cast to non-null type java.lang.Object");
            r2.notifyAll();
            r3 = yz.g2.f100423a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x014f, code lost:
        
            throw r0;
         */
        @Override // l60.g1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long L3(@m80.k l60.k r20, long r21) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 380
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: x50.b.C1311b.L3(l60.k, long):long");
        }

        @Override // l60.g1, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f97562b == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.f97562b = null;
            b bVar = b.this;
            synchronized (bVar) {
                try {
                    bVar.q(bVar.g() - 1);
                    if (bVar.g() == 0) {
                        RandomAccessFile f11 = bVar.f();
                        bVar.p(null);
                        randomAccessFile = f11;
                    }
                    g2 g2Var = g2.f100423a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (randomAccessFile != null) {
                f.o(randomAccessFile);
            }
        }
    }

    static {
        ByteString.a aVar = ByteString.Companion;
        f97548n = aVar.l("OkHttp cache v1\n");
        f97549o = aVar.l("OkHttp DIRTY :(\n");
    }

    public /* synthetic */ b(RandomAccessFile randomAccessFile, g1 g1Var, long j11, ByteString byteString, long j12, v vVar) {
        this(randomAccessFile, g1Var, j11, byteString, j12);
    }

    public final void b(long j11) throws IOException {
        v(j11);
        RandomAccessFile randomAccessFile = this.f97551a;
        g0.m(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        u(f97548n, j11, this.f97554d.size());
        RandomAccessFile randomAccessFile2 = this.f97551a;
        g0.m(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            this.f97558h = true;
            g2 g2Var = g2.f100423a;
        }
        g1 g1Var = this.f97552b;
        if (g1Var != null) {
            f.o(g1Var);
        }
        this.f97552b = null;
    }

    @k
    public final l60.k c() {
        return this.f97559i;
    }

    public final long d() {
        return this.f97555e;
    }

    public final boolean e() {
        return this.f97558h;
    }

    @l
    public final RandomAccessFile f() {
        return this.f97551a;
    }

    public final int g() {
        return this.f97560j;
    }

    @l
    public final g1 h() {
        return this.f97552b;
    }

    @k
    public final l60.k i() {
        return this.f97557g;
    }

    public final long j() {
        return this.f97553c;
    }

    @l
    public final Thread k() {
        return this.f97556f;
    }

    public final boolean l() {
        return this.f97551a == null;
    }

    @k
    public final ByteString m() {
        return this.f97554d;
    }

    @l
    public final g1 n() {
        synchronized (this) {
            if (this.f97551a == null) {
                return null;
            }
            this.f97560j++;
            return new C1311b();
        }
    }

    public final void o(boolean z11) {
        this.f97558h = z11;
    }

    public final void p(@l RandomAccessFile randomAccessFile) {
        this.f97551a = randomAccessFile;
    }

    public final void q(int i11) {
        this.f97560j = i11;
    }

    public final void r(@l g1 g1Var) {
        this.f97552b = g1Var;
    }

    public final void s(long j11) {
        this.f97553c = j11;
    }

    public final void t(@l Thread thread) {
        this.f97556f = thread;
    }

    public final void u(ByteString byteString, long j11, long j12) throws IOException {
        l60.k kVar = new l60.k();
        kVar.X3(byteString);
        kVar.writeLong(j11);
        kVar.writeLong(j12);
        if (kVar.size() != 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        RandomAccessFile randomAccessFile = this.f97551a;
        g0.m(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        g0.o(channel, "file!!.channel");
        new x50.a(channel).b(0L, kVar, 32L);
    }

    public final void v(long j11) throws IOException {
        l60.k kVar = new l60.k();
        kVar.X3(this.f97554d);
        RandomAccessFile randomAccessFile = this.f97551a;
        g0.m(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        g0.o(channel, "file!!.channel");
        new x50.a(channel).b(32 + j11, kVar, this.f97554d.size());
    }

    public b(RandomAccessFile randomAccessFile, g1 g1Var, long j11, ByteString byteString, long j12) {
        this.f97551a = randomAccessFile;
        this.f97552b = g1Var;
        this.f97553c = j11;
        this.f97554d = byteString;
        this.f97555e = j12;
        this.f97557g = new l60.k();
        this.f97558h = this.f97552b == null;
        this.f97559i = new l60.k();
    }
}
