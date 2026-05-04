package kx;

import androidx.core.app.NotificationCompat;
import c40.r0;
import e40.k0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kx.y;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@io.ktor.utils.io.b0
@u0({"SMAP\nCIOMultipartDataBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CIOMultipartDataBase.kt\nio/ktor/http/cio/CIOMultipartDataBase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1#2:100\n*E\n"})
/* loaded from: classes8.dex */
public final class g implements mx.r, r0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f68969a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public mx.b0 f68970b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final k0<y> f68971c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.http.cio.CIOMultipartDataBase", f = "CIOMultipartDataBase.kt", i = {0}, l = {60}, m = "eventToData", n = {NotificationCompat.CATEGORY_EVENT}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f68972a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f68973b;

        /* renamed from: d, reason: collision with root package name */
        public int f68975d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f68973b = obj;
            this.f68975d |= Integer.MIN_VALUE;
            return g.this.m(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.http.cio.CIOMultipartDataBase", f = "CIOMultipartDataBase.kt", i = {0, 1, 1}, l = {73, 80}, m = "partToData", n = {"part", "part", "headers"}, s = {"L$0", "L$0", "L$1"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f68976a;

        /* renamed from: b, reason: collision with root package name */
        public Object f68977b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f68978c;

        /* renamed from: e, reason: collision with root package name */
        public int f68980e;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f68978c = obj;
            this.f68980e |= Integer.MIN_VALUE;
            return g.this.n(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.http.cio.CIOMultipartDataBase", f = "CIOMultipartDataBase.kt", i = {0}, l = {37, 43}, m = "readPart", n = {"this"}, s = {"L$0"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f68981a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f68982b;

        /* renamed from: d, reason: collision with root package name */
        public int f68984d;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f68982b = obj;
            this.f68984d |= Integer.MIN_VALUE;
            return g.this.a(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.http.cio.CIOMultipartDataBase", f = "CIOMultipartDataBase.kt", i = {0, 1}, l = {49, 50}, m = "readPartSuspend", n = {"this", "this"}, s = {"L$0", "L$0"})
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f68985a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f68986b;

        /* renamed from: d, reason: collision with root package name */
        public int f68988d;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f68986b = obj;
            this.f68988d |= Integer.MIN_VALUE;
            return g.this.s(this);
        }
    }

    public g(@m80.k kotlin.coroutines.d coroutineContext, @m80.k io.ktor.utils.io.g channel, @m80.k CharSequence contentType, @m80.l Long l11, long j11) {
        g0.p(coroutineContext, "coroutineContext");
        g0.p(channel, "channel");
        g0.p(contentType, "contentType");
        this.f68969a = coroutineContext;
        this.f68971c = a0.l(this, channel, contentType, l11, j11);
    }

    public static final g2 o(y.b bVar) {
        bVar.a();
        return g2.f100423a;
    }

    public static final io.ktor.utils.io.g p(y.b bVar) {
        return bVar.c();
    }

    public static final g2 r(y.b bVar) {
        bVar.a();
        return g2.f100423a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        if (r6 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0070 -> B:16:0x0073). Please report as a decompilation issue!!! */
    @Override // mx.r
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k j00.c<? super mx.b0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kx.g.c
            if (r0 == 0) goto L13
            r0 = r6
            kx.g$c r0 = (kx.g.c) r0
            int r1 = r0.f68984d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f68984d = r1
            goto L18
        L13:
            kx.g$c r0 = new kx.g$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f68982b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f68984d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r6)
            return r6
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f68981a
            kx.g r2 = (kx.g) r2
            kotlin.e.n(r6)
            goto L73
        L3c:
            kotlin.e.n(r6)
            mx.b0 r6 = r5.f68970b
            if (r6 == 0) goto L4c
            x00.a r6 = r6.g()
            if (r6 == 0) goto L4c
            r6.invoke()
        L4c:
            r2 = r5
        L4d:
            e40.k0<kx.y> r6 = r2.f68971c
            java.lang.Object r6 = r6.O()
            java.lang.Object r6 = e40.s.h(r6)
            kx.y r6 = (kx.y) r6
            if (r6 != 0) goto L68
            r6 = 0
            r0.f68981a = r6
            r0.f68984d = r3
            java.lang.Object r6 = r2.s(r0)
            if (r6 != r1) goto L67
            goto L72
        L67:
            return r6
        L68:
            r0.f68981a = r2
            r0.f68984d = r4
            java.lang.Object r6 = r2.m(r6, r0)
            if (r6 != r1) goto L73
        L72:
            return r1
        L73:
            mx.b0 r6 = (mx.b0) r6
            if (r6 == 0) goto L4d
            r2.f68970b = r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kx.g.a(j00.c):java.lang.Object");
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f68969a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(kx.y r5, j00.c<? super mx.b0> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kx.g.a
            if (r0 == 0) goto L13
            r0 = r6
            kx.g$a r0 = (kx.g.a) r0
            int r1 = r0.f68975d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f68975d = r1
            goto L18
        L13:
            kx.g$a r0 = new kx.g$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f68973b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f68975d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f68972a
            kx.y r5 = (kx.y) r5
            kotlin.e.n(r6)     // Catch: java.lang.Throwable -> L2d
            goto L4c
        L2d:
            r6 = move-exception
            goto L54
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.e.n(r6)
            boolean r6 = r5 instanceof kx.y.b     // Catch: java.lang.Throwable -> L2d
            if (r6 == 0) goto L4f
            r6 = r5
            kx.y$b r6 = (kx.y.b) r6     // Catch: java.lang.Throwable -> L2d
            r0.f68972a = r5     // Catch: java.lang.Throwable -> L2d
            r0.f68975d = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r6 = r4.n(r6, r0)     // Catch: java.lang.Throwable -> L2d
            if (r6 != r1) goto L4c
            return r1
        L4c:
            mx.b0 r6 = (mx.b0) r6     // Catch: java.lang.Throwable -> L2d
            return r6
        L4f:
            r5.a()     // Catch: java.lang.Throwable -> L2d
            r5 = 0
            return r5
        L54:
            r5.a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kx.g.m(kx.y, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0054, code lost:
    
        if (r9 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(final kx.y.b r8, j00.c<? super mx.b0> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kx.g.b
            if (r0 == 0) goto L13
            r0 = r9
            kx.g$b r0 = (kx.g.b) r0
            int r1 = r0.f68980e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f68980e = r1
            goto L18
        L13:
            kx.g$b r0 = new kx.g$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f68978c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f68980e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L45
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r8 = r0.f68977b
            kx.s r8 = (kx.s) r8
            java.lang.Object r0 = r0.f68976a
            kx.y$b r0 = (kx.y.b) r0
            kotlin.e.n(r9)
            goto L8e
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3d:
            java.lang.Object r8 = r0.f68976a
            kx.y$b r8 = (kx.y.b) r8
            kotlin.e.n(r9)
            goto L57
        L45:
            kotlin.e.n(r9)
            c40.x0 r9 = r8.d()
            r0.f68976a = r8
            r0.f68980e = r4
            java.lang.Object r9 = r9.i(r0)
            if (r9 != r1) goto L57
            goto L89
        L57:
            kx.s r9 = (kx.s) r9
            java.lang.String r2 = "Content-Disposition"
            java.lang.CharSequence r2 = r9.g(r2)
            if (r2 == 0) goto L6c
            ix.g$a r4 = ix.g.f62782d
            java.lang.String r2 = r2.toString()
            ix.g r2 = r4.e(r2)
            goto L6d
        L6c:
            r2 = r5
        L6d:
            if (r2 == 0) goto L76
            java.lang.String r4 = "filename"
            java.lang.String r2 = r2.c(r4)
            goto L77
        L76:
            r2 = r5
        L77:
            io.ktor.utils.io.g r4 = r8.c()
            if (r2 != 0) goto Lae
            r0.f68976a = r8
            r0.f68977b = r9
            r0.f68980e = r3
            java.lang.Object r0 = io.ktor.utils.io.j.G(r4, r0)
            if (r0 != r1) goto L8a
        L89:
            return r1
        L8a:
            r6 = r0
            r0 = r8
            r8 = r9
            r9 = r6
        L8e:
            y40.c0 r9 = (y40.c0) r9
            mx.b0$d r1 = new mx.b0$d     // Catch: java.lang.Throwable -> La7
            java.lang.String r2 = io.ktor.utils.io.z.a(r9)     // Catch: java.lang.Throwable -> La7
            kx.d r3 = new kx.d     // Catch: java.lang.Throwable -> La7
            r3.<init>()     // Catch: java.lang.Throwable -> La7
            kx.c r0 = new kx.c     // Catch: java.lang.Throwable -> La7
            r0.<init>(r8)     // Catch: java.lang.Throwable -> La7
            r1.<init>(r2, r3, r0)     // Catch: java.lang.Throwable -> La7
            u00.a.c(r9, r5)
            return r1
        La7:
            r8 = move-exception
            throw r8     // Catch: java.lang.Throwable -> La9
        La9:
            r0 = move-exception
            u00.a.c(r9, r8)
            throw r0
        Lae:
            mx.b0$c r0 = new mx.b0$c
            kx.e r1 = new kx.e
            r1.<init>()
            kx.f r2 = new kx.f
            r2.<init>()
            kx.c r8 = new kx.c
            r8.<init>(r9)
            r0.<init>(r1, r2, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kx.g.n(kx.y$b, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (r7 != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005e -> B:13:0x0061). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(j00.c<? super mx.b0> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kx.g.d
            if (r0 == 0) goto L13
            r0 = r7
            kx.g$d r0 = (kx.g.d) r0
            int r1 = r0.f68988d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f68988d = r1
            goto L18
        L13:
            kx.g$d r0 = new kx.g$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f68986b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f68988d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r2 = r0.f68985a
            kx.g r2 = (kx.g) r2
            kotlin.e.n(r7)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L68
            goto L61
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            java.lang.Object r2 = r0.f68985a
            kx.g r2 = (kx.g) r2
            kotlin.e.n(r7)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L68
            goto L54
        L40:
            kotlin.e.n(r7)
            r7 = r6
        L44:
            e40.k0<kx.y> r2 = r7.f68971c     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L68
            r0.f68985a = r7     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L68
            r0.f68988d = r4     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L68
            java.lang.Object r2 = r2.H(r0)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L68
            if (r2 != r1) goto L51
            goto L60
        L51:
            r5 = r2
            r2 = r7
            r7 = r5
        L54:
            kx.y r7 = (kx.y) r7     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L68
            r0.f68985a = r2     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L68
            r0.f68988d = r3     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L68
            java.lang.Object r7 = r2.m(r7, r0)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L68
            if (r7 != r1) goto L61
        L60:
            return r1
        L61:
            mx.b0 r7 = (mx.b0) r7     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L68
            if (r7 == 0) goto L66
            return r7
        L66:
            r7 = r2
            goto L44
        L68:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kx.g.s(j00.c):java.lang.Object");
    }

    public /* synthetic */ g(kotlin.coroutines.d dVar, io.ktor.utils.io.g gVar, CharSequence charSequence, Long l11, long j11, int i11, kotlin.jvm.internal.v vVar) {
        this(dVar, gVar, charSequence, l11, (i11 & 16) != 0 ? 65536L : j11);
    }
}
