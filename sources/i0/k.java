package i0;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.annotation.VisibleForTesting;
import coil.decode.DataSource;
import f0.l0;
import g0.a;
import i0.i;
import java.io.IOException;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import l60.r0;
import okhttp3.c;
import okhttp3.l;
import okhttp3.n;
import okhttp3.o;
import t50.b;
import u30.f0;
import u30.k0;
import yz.c0;
import yz.g2;
import yz.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nHttpUriFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpUriFetcher.kt\ncoil/fetch/HttpUriFetcher\n+ 2 FileSystem.kt\nokio/FileSystem\n+ 3 Okio.kt\nokio/Okio__OkioKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,304:1\n80#2:305\n165#2:306\n81#2:307\n82#2:313\n80#2:340\n165#2:341\n81#2:342\n82#2:348\n80#2:375\n165#2:376\n81#2:377\n82#2:383\n67#2:414\n68#2:420\n52#3,5:308\n60#3,10:314\n57#3,16:324\n52#3,5:343\n60#3,10:349\n57#3,16:359\n52#3,5:378\n60#3,10:384\n57#3,16:394\n66#3:413\n52#3,5:415\n60#3,10:421\n57#3,2:431\n71#3,2:433\n215#4,2:410\n1#5:412\n*S KotlinDebug\n*F\n+ 1 HttpUriFetcher.kt\ncoil/fetch/HttpUriFetcher\n*L\n162#1:305\n162#1:306\n162#1:307\n162#1:313\n167#1:340\n167#1:341\n167#1:342\n167#1:348\n170#1:375\n170#1:376\n170#1:377\n170#1:383\n255#1:414\n255#1:420\n162#1:308,5\n162#1:314,10\n162#1:324,16\n167#1:343,5\n167#1:349,10\n167#1:359,16\n170#1:378,5\n170#1:384,10\n170#1:394,16\n255#1:413\n255#1:415,5\n255#1:421,10\n255#1:431,2\n255#1:433,2\n190#1:410,2\n*E\n"})
/* loaded from: classes3.dex */
public final class k implements i {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final String f60028g = "text/plain";

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f60031a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final o0.j f60032b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final c0<b.a> f60033c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final c0<g0.a> f60034d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f60035e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final a f60027f = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final okhttp3.c f60029h = new c.a().g().h().a();

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final okhttp3.c f60030i = new c.a().g().j().a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements i.a<Uri> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final c0<b.a> f60036a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final c0<g0.a> f60037b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f60038c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@m80.k c0<? extends b.a> c0Var, @m80.k c0<? extends g0.a> c0Var2, boolean z11) {
            this.f60036a = c0Var;
            this.f60037b = c0Var2;
            this.f60038c = z11;
        }

        private final boolean c(Uri uri) {
            return g0.g(uri.getScheme(), "http") || g0.g(uri.getScheme(), "https");
        }

        @Override // i0.i.a
        @m80.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(@m80.k Uri uri, @m80.k o0.j jVar, @m80.k b0.f fVar) {
            if (c(uri)) {
                return new k(uri.toString(), jVar, this.f60036a, this.f60037b, this.f60038c);
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", i = {}, l = {224}, m = "executeNetworkRequest", n = {}, s = {})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f60039a;

        /* renamed from: c, reason: collision with root package name */
        public int f60041c;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f60039a = obj;
            this.f60041c |= Integer.MIN_VALUE;
            return k.this.c(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", i = {0, 0, 0, 1, 1, 1}, l = {77, 106}, m = "fetch", n = {"this", "snapshot", "cacheStrategy", "this", "snapshot", "response"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f60042a;

        /* renamed from: b, reason: collision with root package name */
        public Object f60043b;

        /* renamed from: c, reason: collision with root package name */
        public Object f60044c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f60045d;

        /* renamed from: f, reason: collision with root package name */
        public int f60047f;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f60045d = obj;
            this.f60047f |= Integer.MIN_VALUE;
            return k.this.b(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(@m80.k String str, @m80.k o0.j jVar, @m80.k c0<? extends b.a> c0Var, @m80.k c0<? extends g0.a> c0Var2, boolean z11) {
        this.f60031a = str;
        this.f60032b = jVar;
        this.f60033c = c0Var;
        this.f60034d = c0Var2;
        this.f60035e = z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012d A[Catch: Exception -> 0x0140, TryCatch #0 {Exception -> 0x0140, blocks: (B:14:0x0189, B:36:0x011f, B:38:0x012d, B:40:0x013b, B:41:0x0144, B:43:0x014e, B:45:0x0156, B:47:0x016e), top: B:35:0x011f }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014e A[Catch: Exception -> 0x0140, TryCatch #0 {Exception -> 0x0140, blocks: (B:14:0x0189, B:36:0x011f, B:38:0x012d, B:40:0x013b, B:41:0x0144, B:43:0x014e, B:45:0x0156, B:47:0x016e), top: B:35:0x011f }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // i0.i
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(@m80.k j00.c<? super i0.h> r13) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.k.b(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(okhttp3.l r5, j00.c<? super okhttp3.n> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof i0.k.c
            if (r0 == 0) goto L13
            r0 = r6
            i0.k$c r0 = (i0.k.c) r0
            int r1 = r0.f60041c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f60041c = r1
            goto L18
        L13:
            i0.k$c r0 = new i0.k$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f60039a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f60041c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r6)
            goto L72
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.e.n(r6)
            boolean r6 = u0.l.A()
            if (r6 == 0) goto L5d
            o0.j r6 = r4.f60032b
            coil.request.CachePolicy r6 = r6.l()
            boolean r6 = r6.getReadEnabled()
            if (r6 != 0) goto L57
            yz.c0<t50.b$a> r6 = r4.f60033c
            java.lang.Object r6 = r6.getValue()
            t50.b$a r6 = (t50.b.a) r6
            t50.b r5 = r6.b(r5)
            okhttp3.n r5 = r5.execute()
            goto L75
        L57:
            android.os.NetworkOnMainThreadException r5 = new android.os.NetworkOnMainThreadException
            r5.<init>()
            throw r5
        L5d:
            yz.c0<t50.b$a> r6 = r4.f60033c
            java.lang.Object r6 = r6.getValue()
            t50.b$a r6 = (t50.b.a) r6
            t50.b r5 = r6.b(r5)
            r0.f60041c = r3
            java.lang.Object r6 = u0.b.a(r5, r0)
            if (r6 != r1) goto L72
            return r1
        L72:
            r5 = r6
            okhttp3.n r5 = (okhttp3.n) r5
        L75:
            boolean r6 = r5.S5()
            if (r6 != 0) goto L92
            int r6 = r5.Z()
            r0 = 304(0x130, float:4.26E-43)
            if (r6 == r0) goto L92
            okhttp3.o r6 = r5.L()
            if (r6 == 0) goto L8c
            u0.l.f(r6)
        L8c:
            coil.network.HttpException r6 = new coil.network.HttpException
            r6.<init>(r5)
            throw r6
        L92:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.k.c(okhttp3.l, j00.c):java.lang.Object");
    }

    public final String d() {
        String h11 = this.f60032b.h();
        return h11 == null ? this.f60031a : h11;
    }

    public final okio.b e() {
        g0.a value = this.f60034d.getValue();
        g0.m(value);
        return value.getFileSystem();
    }

    @m80.l
    @VisibleForTesting
    public final String f(@m80.k String str, @m80.l okhttp3.j jVar) {
        String q11;
        String jVar2 = jVar != null ? jVar.toString() : null;
        if ((jVar2 == null || f0.J2(jVar2, "text/plain", false, 2, null)) && (q11 = u0.l.q(MimeTypeMap.getSingleton(), str)) != null) {
            return q11;
        }
        if (jVar2 != null) {
            return k0.T5(jVar2, l70.f.f70689d, null, 2, null);
        }
        return null;
    }

    public final boolean g(okhttp3.l lVar, n nVar) {
        if (this.f60032b.i().getWriteEnabled()) {
            return !this.f60035e || n0.b.f73937c.c(lVar, nVar);
        }
        return false;
    }

    public final okhttp3.l h() {
        l.a o11 = new l.a().B(this.f60031a).o(this.f60032b.j());
        for (Map.Entry<Class<?>, Object> entry : this.f60032b.q().a().entrySet()) {
            Class<?> key = entry.getKey();
            g0.n(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            o11.z(key, entry.getValue());
        }
        boolean readEnabled = this.f60032b.i().getReadEnabled();
        boolean readEnabled2 = this.f60032b.l().getReadEnabled();
        if (!readEnabled2 && readEnabled) {
            o11.c(okhttp3.c.f77158p);
        } else if (!readEnabled2 || readEnabled) {
            if (!readEnabled2 && !readEnabled) {
                o11.c(f60030i);
            }
        } else if (this.f60032b.i().getWriteEnabled()) {
            o11.c(okhttp3.c.f77157o);
        } else {
            o11.c(f60029h);
        }
        return o11.b();
    }

    public final a.c i() {
        g0.a value;
        if (!this.f60032b.i().getReadEnabled() || (value = this.f60034d.getValue()) == null) {
            return null;
        }
        return value.g(d());
    }

    public final n0.a j(a.c cVar) {
        Throwable th2;
        n0.a aVar;
        try {
            l60.m e11 = r0.e(e().F0(cVar.getMetadata()));
            try {
                aVar = new n0.a(e11);
                if (e11 != null) {
                    try {
                        e11.close();
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                }
                th2 = null;
            } catch (Throwable th4) {
                if (e11 != null) {
                    try {
                        e11.close();
                    } catch (Throwable th5) {
                        r.a(th4, th5);
                    }
                }
                th2 = th4;
                aVar = null;
            }
            if (th2 != null) {
                throw th2;
            }
            g0.m(aVar);
            return aVar;
        } catch (IOException unused) {
            return null;
        }
    }

    public final DataSource k(n nVar) {
        return nVar.s0() != null ? DataSource.NETWORK : DataSource.DISK;
    }

    public final f0.k0 l(a.c cVar) {
        return l0.e(cVar.getData(), e(), d(), cVar);
    }

    public final f0.k0 m(o oVar) {
        return l0.a(oVar.V(), this.f60032b.g());
    }

    public final a.c n(a.c cVar, okhttp3.l lVar, n nVar, n0.a aVar) {
        a.b f11;
        Throwable th2;
        g2 g2Var;
        Long l11;
        g2 g2Var2;
        Throwable th3 = null;
        if (!g(lVar, nVar)) {
            if (cVar != null) {
                u0.l.f(cVar);
            }
            return null;
        }
        if (cVar != null) {
            f11 = cVar.C7();
        } else {
            g0.a value = this.f60034d.getValue();
            f11 = value != null ? value.f(d()) : null;
        }
        try {
            if (f11 == null) {
                return null;
            }
            try {
                if (nVar.Z() != 304 || aVar == null) {
                    l60.l d11 = r0.d(e().D0(f11.getMetadata(), false));
                    try {
                        new n0.a(nVar).g(d11);
                        g2Var = g2.f100423a;
                        if (d11 != null) {
                            try {
                                d11.close();
                            } catch (Throwable th4) {
                                th2 = th4;
                            }
                        }
                        th2 = null;
                    } catch (Throwable th5) {
                        if (d11 != null) {
                            try {
                                d11.close();
                            } catch (Throwable th6) {
                                r.a(th5, th6);
                            }
                        }
                        th2 = th5;
                        g2Var = null;
                    }
                    if (th2 != null) {
                        throw th2;
                    }
                    g0.m(g2Var);
                    l60.l d12 = r0.d(e().D0(f11.getData(), false));
                    try {
                        o L = nVar.L();
                        g0.m(L);
                        l11 = Long.valueOf(L.V().z7(d12));
                        if (d12 != null) {
                            try {
                                d12.close();
                            } catch (Throwable th7) {
                                th3 = th7;
                            }
                        }
                    } catch (Throwable th8) {
                        if (d12 != null) {
                            try {
                                d12.close();
                            } catch (Throwable th9) {
                                r.a(th8, th9);
                            }
                        }
                        th3 = th8;
                        l11 = null;
                    }
                    if (th3 != null) {
                        throw th3;
                    }
                    g0.m(l11);
                } else {
                    n c11 = nVar.v0().w(n0.b.f73937c.a(aVar.d(), nVar.k0())).c();
                    l60.l d13 = r0.d(e().D0(f11.getMetadata(), false));
                    try {
                        new n0.a(c11).g(d13);
                        g2Var2 = g2.f100423a;
                        if (d13 != null) {
                            try {
                                d13.close();
                            } catch (Throwable th10) {
                                th3 = th10;
                            }
                        }
                    } catch (Throwable th11) {
                        if (d13 != null) {
                            try {
                                d13.close();
                            } catch (Throwable th12) {
                                r.a(th11, th12);
                            }
                        }
                        th3 = th11;
                        g2Var2 = null;
                    }
                    if (th3 != null) {
                        throw th3;
                    }
                    g0.m(g2Var2);
                }
                a.c a11 = f11.a();
                u0.l.f(nVar);
                return a11;
            } catch (Exception e11) {
                u0.l.a(f11);
                throw e11;
            }
        } catch (Throwable th13) {
            u0.l.f(nVar);
            throw th13;
        }
    }
}
