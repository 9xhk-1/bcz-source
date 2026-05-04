package qy;

import androidx.exifinterface.media.ExifInterface;
import com.jiongji.andriod.card.R;
import ix.b2;
import ix.g1;
import ix.k;
import ix.t2;
import ix.y0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import mx.v;
import y40.c0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nApplicationResponseFunctions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApplicationResponseFunctions.kt\nio/ktor/server/response/ApplicationResponseFunctionsKt\n+ 2 Type.kt\nio/ktor/util/reflect/TypeKt\n+ 3 URLBuilder.kt\nio/ktor/server/util/URLBuilderKt\n*L\n1#1,215:1\n25#1:248\n26#1:265\n33#1:266\n34#1:283\n25#1:284\n26#1:301\n25#1:303\n26#1:320\n25#1:321\n26#1:338\n25#1:339\n26#1:356\n25#1:357\n26#1:374\n25#1:375\n26#1:392\n25#1:393\n26#1:410\n58#2,16:216\n58#2,16:232\n58#2,16:249\n58#2,16:267\n58#2,16:285\n58#2,16:304\n58#2,16:322\n58#2,16:340\n58#2,16:358\n58#2,16:376\n58#2,16:394\n38#3:302\n*S KotlinDebug\n*F\n+ 1 ApplicationResponseFunctions.kt\nio/ktor/server/response/ApplicationResponseFunctionsKt\n*L\n43#1:248\n43#1:265\n65#1:266\n65#1:283\n74#1:284\n74#1:301\n107#1:303\n107#1:320\n122#1:321\n122#1:338\n136#1:339\n136#1:356\n151#1:357\n151#1:374\n166#1:375\n166#1:392\n181#1:393\n181#1:410\n25#1:216,16\n33#1:232,16\n43#1:249,16\n65#1:267,16\n74#1:285,16\n107#1:304,16\n122#1:322,16\n136#1:340,16\n151#1:358,16\n166#1:376,16\n181#1:394,16\n91#1:302\n*E\n"})
/* loaded from: classes8.dex */
public final class i {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.response.ApplicationResponseFunctionsKt", f = "ApplicationResponseFunctions.kt", i = {0, 0}, l = {136, R.styleable.Theme_drawable_right_arrow}, m = "respondBytes", n = {"contentType", "status"}, s = {"L$0", "L$1"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f82729a;

        /* renamed from: b, reason: collision with root package name */
        public Object f82730b;

        /* renamed from: c, reason: collision with root package name */
        public Object f82731c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f82732d;

        /* renamed from: e, reason: collision with root package name */
        public int f82733e;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f82732d = obj;
            this.f82733e |= Integer.MIN_VALUE;
            return i.f(null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.response.ApplicationResponseFunctionsKt$respondSource$2", f = "ApplicationResponseFunctions.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements x00.p<io.ktor.utils.io.m, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f82734a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f82735b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c0 f82736c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c0 c0Var, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f82736c = c0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            b bVar = new b(this.f82736c, cVar);
            bVar.f82735b = obj;
            return bVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.utils.io.m mVar, j00.c<? super g2> cVar) {
            return ((b) create(mVar, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f82734a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                io.ktor.utils.io.m mVar = (io.ktor.utils.io.m) this.f82735b;
                c0 c0Var = this.f82736c;
                this.f82734a = 1;
                if (io.ktor.utils.io.q.o(mVar, c0Var, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.response.ApplicationResponseFunctionsKt", f = "ApplicationResponseFunctions.kt", i = {0, 0, 0}, l = {121, R.styleable.Theme_drawable_right_arrow}, m = "respondText", n = {"$this$respondText", "contentType", "status"}, s = {"L$0", "L$1", "L$2"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f82737a;

        /* renamed from: b, reason: collision with root package name */
        public Object f82738b;

        /* renamed from: c, reason: collision with root package name */
        public Object f82739c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f82740d;

        /* renamed from: e, reason: collision with root package name */
        public int f82741e;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f82740d = obj;
            this.f82741e |= Integer.MIN_VALUE;
            return i.x(null, null, null, null, this);
        }
    }

    public static /* synthetic */ Object A(zx.b bVar, String str, ix.k kVar, g1 g1Var, x00.l lVar, j00.c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            kVar = null;
        }
        if ((i11 & 4) != 0) {
            g1Var = null;
        }
        if ((i11 & 8) != 0) {
            lVar = new x00.l() { // from class: qy.h
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 B;
                    B = i.B((v) obj2);
                    return B;
                }
            };
        }
        return y(bVar, str, kVar, g1Var, lVar, cVar);
    }

    public static final g2 B(v vVar) {
        g0.p(vVar, "<this>");
        return g2.f100423a;
    }

    @w00.j(name = "respondWithType")
    public static final /* synthetic */ <T> Object C(zx.b bVar, g1 g1Var, T t11, j00.c<? super g2> cVar) {
        bVar.k().h(g1Var);
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        h10.d d11 = o0.d(Object.class);
        try {
            g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        } catch (Throwable unused) {
        }
        gz.a aVar = new gz.a(d11, null);
        d0.e(0);
        bVar.E(t11, aVar, cVar);
        d0.e(1);
        return g2.f100423a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r2 == null) goto L10;
     */
    @m80.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final ix.k c(@m80.k zx.b r1, @m80.l ix.k r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            if (r2 != 0) goto L2d
            qy.a r1 = r1.k()
            qy.q r1 = r1.a()
            ix.y0 r2 = ix.y0.f63006a
            java.lang.String r2 = r2.C()
            java.lang.String r1 = r1.f(r2)
            if (r1 == 0) goto L27
            ix.k$c r2 = ix.k.f62843f     // Catch: io.ktor.http.BadContentTypeFormatException -> L23
            ix.k r1 = r2.b(r1)     // Catch: io.ktor.http.BadContentTypeFormatException -> L23
        L21:
            r2 = r1
            goto L25
        L23:
            r1 = 0
            goto L21
        L25:
            if (r2 != 0) goto L2d
        L27:
            ix.k$h r1 = ix.k.h.f62902a
            ix.k r2 = r1.g()
        L2d:
            java.nio.charset.Charset r1 = ix.m.a(r2)
            if (r1 != 0) goto L45
            ix.k$h r1 = ix.k.h.f62902a
            ix.k r1 = r1.a()
            boolean r1 = r2.h(r1)
            if (r1 == 0) goto L45
            java.nio.charset.Charset r1 = u30.d.f91599b
            ix.k r2 = ix.m.b(r2, r1)
        L45:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: qy.i.c(zx.b, ix.k):ix.k");
    }

    @m80.l
    public static final Object d(@m80.k zx.b bVar, @m80.k g1 g1Var, @m80.l Object obj, @m80.k gz.a aVar, @m80.k j00.c<? super g2> cVar) {
        bVar.k().h(g1Var);
        Object E = bVar.E(obj, aVar, cVar);
        return E == kotlin.coroutines.intrinsics.b.l() ? E : g2.f100423a;
    }

    public static final /* synthetic */ <T> Object e(zx.b bVar, T t11, j00.c<? super g2> cVar) {
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        h10.d d11 = o0.d(Object.class);
        try {
            g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        } catch (Throwable unused) {
        }
        gz.a aVar = new gz.a(d11, null);
        d0.e(0);
        bVar.E(t11, aVar, cVar);
        d0.e(1);
        return g2.f100423a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|(1:(1:(3:10|11|12)(2:14|15))(1:16))(1:25)|17|18|19|20))|27|6|(0)(0)|17|18|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        if (r5.E(r8, r2, r0) != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        if (r9 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(@m80.k zx.b r5, @m80.l ix.k r6, @m80.l ix.g1 r7, @m80.k x00.l<? super j00.c<? super byte[]>, ? extends java.lang.Object> r8, @m80.k j00.c<? super yz.g2> r9) {
        /*
            boolean r0 = r9 instanceof qy.i.a
            if (r0 == 0) goto L13
            r0 = r9
            qy.i$a r0 = (qy.i.a) r0
            int r1 = r0.f82733e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f82733e = r1
            goto L18
        L13:
            qy.i$a r0 = new qy.i$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f82732d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f82733e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r9)
            goto L7f
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.f82731c
            zx.b r5 = (zx.b) r5
            java.lang.Object r6 = r0.f82730b
            r7 = r6
            ix.g1 r7 = (ix.g1) r7
            java.lang.Object r6 = r0.f82729a
            ix.k r6 = (ix.k) r6
            kotlin.e.n(r9)
            goto L57
        L45:
            kotlin.e.n(r9)
            r0.f82729a = r6
            r0.f82730b = r7
            r0.f82731c = r5
            r0.f82733e = r4
            java.lang.Object r9 = r8.invoke(r0)
            if (r9 != r1) goto L57
            goto L7e
        L57:
            byte[] r9 = (byte[]) r9
            mx.c r8 = new mx.c
            r8.<init>(r9, r6, r7)
            java.lang.Class<mx.c> r6 = mx.c.class
            h10.d r7 = kotlin.jvm.internal.o0.d(r6)
            r9 = 0
            h10.r r6 = kotlin.jvm.internal.o0.B(r6)     // Catch: java.lang.Throwable -> L6a
            goto L6b
        L6a:
            r6 = r9
        L6b:
            gz.a r2 = new gz.a
            r2.<init>(r7, r6)
            r0.f82729a = r9
            r0.f82730b = r9
            r0.f82731c = r9
            r0.f82733e = r3
            java.lang.Object r5 = r5.E(r8, r2, r0)
            if (r5 != r1) goto L7f
        L7e:
            return r1
        L7f:
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: qy.i.f(zx.b, ix.k, ix.g1, x00.l, j00.c):java.lang.Object");
    }

    @m80.l
    public static final Object g(@m80.k zx.b bVar, @m80.k byte[] bArr, @m80.l ix.k kVar, @m80.l g1 g1Var, @m80.k x00.l<? super v, g2> lVar, @m80.k j00.c<? super g2> cVar) {
        h10.r rVar;
        mx.c cVar2 = new mx.c(bArr, kVar, g1Var);
        lVar.invoke(cVar2);
        h10.d d11 = o0.d(mx.c.class);
        try {
            rVar = o0.B(mx.c.class);
        } catch (Throwable unused) {
            rVar = null;
        }
        Object E = bVar.E(cVar2, new gz.a(d11, rVar), cVar);
        return E == kotlin.coroutines.intrinsics.b.l() ? E : g2.f100423a;
    }

    public static /* synthetic */ Object h(zx.b bVar, ix.k kVar, g1 g1Var, x00.l lVar, j00.c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            kVar = null;
        }
        if ((i11 & 2) != 0) {
            g1Var = null;
        }
        return f(bVar, kVar, g1Var, lVar, cVar);
    }

    public static /* synthetic */ Object i(zx.b bVar, byte[] bArr, ix.k kVar, g1 g1Var, x00.l lVar, j00.c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            kVar = null;
        }
        if ((i11 & 4) != 0) {
            g1Var = null;
        }
        if ((i11 & 8) != 0) {
            lVar = new x00.l() { // from class: qy.g
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 j11;
                    j11 = i.j((v) obj2);
                    return j11;
                }
            };
        }
        return g(bVar, bArr, kVar, g1Var, lVar, cVar);
    }

    public static final g2 j(v vVar) {
        g0.p(vVar, "<this>");
        return g2.f100423a;
    }

    @m80.l
    public static final Object k(@m80.k zx.b bVar, @m80.l ix.k kVar, @m80.l g1 g1Var, @m80.l Long l11, @m80.k x00.p<? super io.ktor.utils.io.m, ? super j00.c<? super g2>, ? extends Object> pVar, @m80.k j00.c<? super g2> cVar) {
        h10.r rVar;
        if (kVar == null) {
            kVar = k.a.f62847a.j();
        }
        mx.f fVar = new mx.f(pVar, kVar, g1Var, l11);
        h10.d d11 = o0.d(mx.f.class);
        try {
            rVar = o0.B(mx.f.class);
        } catch (Throwable unused) {
            rVar = null;
        }
        Object E = bVar.E(fVar, new gz.a(d11, rVar), cVar);
        return E == kotlin.coroutines.intrinsics.b.l() ? E : g2.f100423a;
    }

    public static /* synthetic */ Object l(zx.b bVar, ix.k kVar, g1 g1Var, Long l11, x00.p pVar, j00.c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            kVar = null;
        }
        if ((i11 & 2) != 0) {
            g1Var = null;
        }
        if ((i11 & 4) != 0) {
            l11 = null;
        }
        return k(bVar, kVar, g1Var, l11, pVar, cVar);
    }

    public static final /* synthetic */ <T> Object m(zx.b bVar, g1 g1Var, T t11, j00.c<? super g2> cVar) {
        bVar.k().h(g1Var);
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        h10.d d11 = o0.d(Object.class);
        try {
            g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        } catch (Throwable unused) {
        }
        gz.a aVar = new gz.a(d11, null);
        d0.e(0);
        bVar.E(t11, aVar, cVar);
        d0.e(1);
        return g2.f100423a;
    }

    public static final /* synthetic */ <T> Object n(zx.b bVar, T t11, j00.c<? super g2> cVar) {
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        h10.d d11 = o0.d(Object.class);
        try {
            g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        } catch (Throwable unused) {
        }
        gz.a aVar = new gz.a(d11, null);
        d0.e(0);
        bVar.E(t11, aVar, cVar);
        d0.e(1);
        return g2.f100423a;
    }

    @m80.l
    public static final Object o(@m80.k zx.b bVar, @m80.k t2 t2Var, boolean z11, @m80.k j00.c<? super g2> cVar) {
        Object p11 = p(bVar, t2Var.toString(), z11, cVar);
        return p11 == kotlin.coroutines.intrinsics.b.l() ? p11 : g2.f100423a;
    }

    @m80.l
    public static final Object p(@m80.k zx.b bVar, @m80.k String str, boolean z11, @m80.k j00.c<? super g2> cVar) {
        h10.r rVar;
        q.c(bVar.k().a(), y0.f63006a.Z(), str, false, 4, null);
        g1.a aVar = g1.f62797c;
        g1 t11 = z11 ? aVar.t() : aVar.l();
        h10.d d11 = o0.d(g1.class);
        try {
            rVar = o0.B(g1.class);
        } catch (Throwable unused) {
            rVar = null;
        }
        Object E = bVar.E(t11, new gz.a(d11, rVar), cVar);
        return E == kotlin.coroutines.intrinsics.b.l() ? E : g2.f100423a;
    }

    @m80.l
    public static final Object q(@m80.k zx.b bVar, boolean z11, @m80.k x00.l<? super b2, g2> lVar, @m80.k j00.c<? super g2> cVar) {
        b2 a11 = ty.i.a(b2.f62712k, bVar);
        lVar.invoke(a11);
        Object p11 = p(bVar, a11.c(), z11, cVar);
        return p11 == kotlin.coroutines.intrinsics.b.l() ? p11 : g2.f100423a;
    }

    public static final Object r(zx.b bVar, boolean z11, x00.l<? super b2, g2> lVar, j00.c<? super g2> cVar) {
        b2 a11 = ty.i.a(b2.f62712k, bVar);
        lVar.invoke(a11);
        String c11 = a11.c();
        d0.e(0);
        p(bVar, c11, z11, cVar);
        d0.e(1);
        return g2.f100423a;
    }

    public static /* synthetic */ Object s(zx.b bVar, t2 t2Var, boolean z11, j00.c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return o(bVar, t2Var, z11, cVar);
    }

    public static /* synthetic */ Object t(zx.b bVar, String str, boolean z11, j00.c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return p(bVar, str, z11, cVar);
    }

    public static /* synthetic */ Object u(zx.b bVar, boolean z11, x00.l lVar, j00.c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        b2 a11 = ty.i.a(b2.f62712k, bVar);
        lVar.invoke(a11);
        String c11 = a11.c();
        d0.e(0);
        p(bVar, c11, z11, cVar);
        d0.e(1);
        return g2.f100423a;
    }

    @m80.l
    public static final Object v(@m80.k zx.b bVar, @m80.k c0 c0Var, @m80.l ix.k kVar, @m80.l g1 g1Var, @m80.k j00.c<? super g2> cVar) {
        h10.r rVar = null;
        mx.f fVar = new mx.f(new b(c0Var, null), kVar, g1Var, l00.a.g(jz.j.j(c0Var)));
        h10.d d11 = o0.d(mx.f.class);
        try {
            rVar = o0.B(mx.f.class);
        } catch (Throwable unused) {
        }
        Object E = bVar.E(fVar, new gz.a(d11, rVar), cVar);
        return E == kotlin.coroutines.intrinsics.b.l() ? E : g2.f100423a;
    }

    public static /* synthetic */ Object w(zx.b bVar, c0 c0Var, ix.k kVar, g1 g1Var, j00.c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            kVar = null;
        }
        if ((i11 & 4) != 0) {
            g1Var = null;
        }
        return v(bVar, c0Var, kVar, g1Var, cVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|(1:(1:(3:10|11|12)(2:14|15))(1:16))(1:25)|17|18|19|20))|27|6|(0)(0)|17|18|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
    
        if (r5.E(r8, r2, r0) != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        if (r9 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object x(@m80.k zx.b r5, @m80.l ix.k r6, @m80.l ix.g1 r7, @m80.k x00.l<? super j00.c<? super java.lang.String>, ? extends java.lang.Object> r8, @m80.k j00.c<? super yz.g2> r9) {
        /*
            boolean r0 = r9 instanceof qy.i.c
            if (r0 == 0) goto L13
            r0 = r9
            qy.i$c r0 = (qy.i.c) r0
            int r1 = r0.f82741e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f82741e = r1
            goto L18
        L13:
            qy.i$c r0 = new qy.i$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f82740d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f82741e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r9)
            goto L84
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.f82739c
            r7 = r5
            ix.g1 r7 = (ix.g1) r7
            java.lang.Object r5 = r0.f82738b
            r6 = r5
            ix.k r6 = (ix.k) r6
            java.lang.Object r5 = r0.f82737a
            zx.b r5 = (zx.b) r5
            kotlin.e.n(r9)
            goto L58
        L46:
            kotlin.e.n(r9)
            r0.f82737a = r5
            r0.f82738b = r6
            r0.f82739c = r7
            r0.f82741e = r4
            java.lang.Object r9 = r8.invoke(r0)
            if (r9 != r1) goto L58
            goto L83
        L58:
            java.lang.String r9 = (java.lang.String) r9
            ix.k r6 = c(r5, r6)
            mx.c0 r8 = new mx.c0
            r8.<init>(r9, r6, r7)
            java.lang.Class<mx.c0> r6 = mx.c0.class
            h10.d r7 = kotlin.jvm.internal.o0.d(r6)
            r9 = 0
            h10.r r6 = kotlin.jvm.internal.o0.B(r6)     // Catch: java.lang.Throwable -> L6f
            goto L70
        L6f:
            r6 = r9
        L70:
            gz.a r2 = new gz.a
            r2.<init>(r7, r6)
            r0.f82737a = r9
            r0.f82738b = r9
            r0.f82739c = r9
            r0.f82741e = r3
            java.lang.Object r5 = r5.E(r8, r2, r0)
            if (r5 != r1) goto L84
        L83:
            return r1
        L84:
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: qy.i.x(zx.b, ix.k, ix.g1, x00.l, j00.c):java.lang.Object");
    }

    @m80.l
    public static final Object y(@m80.k zx.b bVar, @m80.k String str, @m80.l ix.k kVar, @m80.l g1 g1Var, @m80.k x00.l<? super v, g2> lVar, @m80.k j00.c<? super g2> cVar) {
        h10.r rVar;
        mx.c0 c0Var = new mx.c0(str, c(bVar, kVar), g1Var);
        lVar.invoke(c0Var);
        h10.d d11 = o0.d(mx.c0.class);
        try {
            rVar = o0.B(mx.c0.class);
        } catch (Throwable unused) {
            rVar = null;
        }
        Object E = bVar.E(c0Var, new gz.a(d11, rVar), cVar);
        return E == kotlin.coroutines.intrinsics.b.l() ? E : g2.f100423a;
    }

    public static /* synthetic */ Object z(zx.b bVar, ix.k kVar, g1 g1Var, x00.l lVar, j00.c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            kVar = null;
        }
        if ((i11 & 2) != 0) {
            g1Var = null;
        }
        return x(bVar, kVar, g1Var, lVar, cVar);
    }
}
