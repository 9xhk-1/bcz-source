package ly;

import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import x00.q;
import yz.g2;
import zx.i0;
import zx.k0;
import zx.l0;
import zx.o0;
import zx.x0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.plugins.contentnegotiation.RequestConverterKt", f = "RequestConverter.kt", i = {0, 0}, l = {67}, m = "convertBody", n = {TtmlNode.TAG_BODY, "receiveType"}, s = {"L$0", "L$1"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f71690a;

        /* renamed from: b, reason: collision with root package name */
        public Object f71691b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f71692c;

        /* renamed from: d, reason: collision with root package name */
        public int f71693d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f71692c = obj;
            this.f71693d |= Integer.MIN_VALUE;
            return i.b(null, null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.plugins.contentnegotiation.RequestConverterKt$convertRequestBody$1", f = "RequestConverter.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements q<i0<ly.a>, k0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f71694a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f71695b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f71696c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.server.plugins.contentnegotiation.RequestConverterKt$convertRequestBody$1$1", f = "RequestConverter.kt", i = {0, 0, 0}, l = {40}, m = "invokeSuspend", n = {TtmlNode.TAG_BODY, "requestContentType", "charset"}, s = {"L$0", "L$1", "L$2"})
        public static final class a extends SuspendLambda implements q<x0, io.ktor.utils.io.g, j00.c<? super Object>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f71697a;

            /* renamed from: b, reason: collision with root package name */
            public Object f71698b;

            /* renamed from: c, reason: collision with root package name */
            public Object f71699c;

            /* renamed from: d, reason: collision with root package name */
            public int f71700d;

            /* renamed from: e, reason: collision with root package name */
            public /* synthetic */ Object f71701e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ k0 f71702f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ List<g> f71703g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ gz.a f71704h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k0 k0Var, List<g> list, gz.a aVar, j00.c<? super a> cVar) {
                super(3, cVar);
                this.f71702f = k0Var;
                this.f71703g = list;
                this.f71704h = aVar;
            }

            @Override // x00.q
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(x0 x0Var, io.ktor.utils.io.g gVar, j00.c<Object> cVar) {
                a aVar = new a(this.f71702f, this.f71703g, this.f71704h, cVar);
                aVar.f71701e = gVar;
                return aVar.invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x005d  */
            /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
            /* JADX WARN: Removed duplicated region for block: B:6:0x007b A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0075 -> B:5:0x0078). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r11.f71700d
                    r2 = 1
                    if (r1 == 0) goto L2a
                    if (r1 != r2) goto L22
                    java.lang.Object r1 = r11.f71699c
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r3 = r11.f71698b
                    java.nio.charset.Charset r3 = (java.nio.charset.Charset) r3
                    java.lang.Object r4 = r11.f71697a
                    ix.k r4 = (ix.k) r4
                    java.lang.Object r5 = r11.f71701e
                    io.ktor.utils.io.g r5 = (io.ktor.utils.io.g) r5
                    kotlin.e.n(r12)
                    r10 = r11
                    r6 = r3
                    r9 = r4
                    goto L78
                L22:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L2a:
                    kotlin.e.n(r12)
                    java.lang.Object r12 = r11.f71701e
                    io.ktor.utils.io.g r12 = (io.ktor.utils.io.g) r12
                    zx.k0 r1 = r11.f71702f     // Catch: io.ktor.http.BadContentTypeFormatException -> L9c
                    py.g r1 = r1.f()     // Catch: io.ktor.http.BadContentTypeFormatException -> L9c
                    ix.k r1 = py.e.m(r1)     // Catch: io.ktor.http.BadContentTypeFormatException -> L9c
                    ix.k r1 = r1.k()     // Catch: io.ktor.http.BadContentTypeFormatException -> L9c
                    zx.k0 r3 = r11.f71702f
                    py.g r3 = r3.f()
                    java.nio.charset.Charset r3 = py.e.k(r3)
                    if (r3 != 0) goto L4d
                    java.nio.charset.Charset r3 = u30.d.f91599b
                L4d:
                    java.util.List<ly.g> r4 = r11.f71703g
                    java.util.Iterator r4 = r4.iterator()
                    r5 = r12
                    r9 = r1
                    r6 = r3
                    r1 = r4
                L57:
                    boolean r12 = r1.hasNext()
                    if (r12 == 0) goto L7c
                    java.lang.Object r12 = r1.next()
                    r7 = r12
                    ly.g r7 = (ly.g) r7
                    gz.a r8 = r11.f71704h
                    r11.f71701e = r5
                    r11.f71697a = r9
                    r11.f71698b = r6
                    r11.f71699c = r1
                    r11.f71700d = r2
                    r10 = r11
                    java.lang.Object r12 = ly.i.a(r5, r6, r7, r8, r9, r10)
                    if (r12 != r0) goto L78
                    return r0
                L78:
                    if (r12 != 0) goto L7b
                    goto L57
                L7b:
                    return r12
                L7c:
                    r10 = r11
                    org.slf4j.Logger r12 = ly.d.d()
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "No suitable content converter found for request type "
                    r0.append(r1)
                    gz.a r1 = r10.f71704h
                    h10.d r1 = r1.b()
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    r12.trace(r0)
                    return r5
                L9c:
                    r0 = move-exception
                    r10 = r11
                    r12 = r0
                    io.ktor.server.plugins.BadRequestException r0 = new io.ktor.server.plugins.BadRequestException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Illegal Content-Type header format: "
                    r1.append(r2)
                    zx.k0 r2 = r10.f71702f
                    py.g r2 = r2.f()
                    ix.q0 r2 = r2.a()
                    ix.y0 r3 = ix.y0.f63006a
                    java.lang.String r3 = r3.C()
                    java.lang.String r2 = r2.get(r3)
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1, r12)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: ly.i.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public b(j00.c<? super b> cVar) {
            super(3, cVar);
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i0<ly.a> i0Var, k0 k0Var, j00.c<? super g2> cVar) {
            b bVar = new b(cVar);
            bVar.f71695b = i0Var;
            bVar.f71696c = k0Var;
            return bVar.invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f71694a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                i0 i0Var = (i0) this.f71695b;
                k0 k0Var = (k0) this.f71696c;
                List<g> g11 = ((ly.a) i0Var.c()).g();
                gz.a b11 = l0.b(k0Var);
                if (((ly.a) i0Var.c()).f().contains(b11.b())) {
                    d.d().trace("Skipping for request type " + b11.b() + " because the type is ignored.");
                    return g2.f100423a;
                }
                a aVar = new a(k0Var, g11, b11, null);
                this.f71695b = null;
                this.f71694a = 1;
                if (i0Var.d(aVar, this) == l11) {
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(io.ktor.utils.io.g r5, java.nio.charset.Charset r6, ly.g r7, gz.a r8, ix.k r9, j00.c<java.lang.Object> r10) {
        /*
            boolean r0 = r10 instanceof ly.i.a
            if (r0 == 0) goto L13
            r0 = r10
            ly.i$a r0 = (ly.i.a) r0
            int r1 = r0.f71693d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f71693d = r1
            goto L18
        L13:
            ly.i$a r0 = new ly.i$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f71692c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f71693d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 != r4) goto L35
            java.lang.Object r5 = r0.f71691b
            r8 = r5
            gz.a r8 = (gz.a) r8
            java.lang.Object r5 = r0.f71690a
            io.ktor.utils.io.g r5 = (io.ktor.utils.io.g) r5
            kotlin.e.n(r10)     // Catch: java.lang.Throwable -> L33
            goto L90
        L33:
            r5 = move-exception
            goto Laa
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3d:
            kotlin.e.n(r10)
            ix.k r10 = r7.a()
            ix.k r10 = r10.k()
            boolean r10 = r9.h(r10)
            if (r10 != 0) goto L7f
            org.slf4j.Logger r5 = ly.d.d()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "Skipping content converter for request type "
            r6.append(r10)
            h10.d r8 = r8.b()
            r6.append(r8)
            java.lang.String r8 = " because content type "
            r6.append(r8)
            r6.append(r9)
            java.lang.String r8 = " does not match "
            r6.append(r8)
            ix.k r7 = r7.a()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.trace(r6)
            return r3
        L7f:
            io.ktor.serialization.c r7 = r7.b()
            r0.f71690a = r5     // Catch: java.lang.Throwable -> L33
            r0.f71691b = r8     // Catch: java.lang.Throwable -> L33
            r0.f71693d = r4     // Catch: java.lang.Throwable -> L33
            java.lang.Object r10 = r7.b(r6, r8, r5, r0)     // Catch: java.lang.Throwable -> L33
            if (r10 != r1) goto L90
            return r1
        L90:
            if (r10 != 0) goto La9
            boolean r5 = r5.f()
            if (r5 != 0) goto L99
            return r3
        L99:
            h10.r r5 = r8.a()
            if (r5 == 0) goto La8
            boolean r5 = r5.e()
            if (r5 != r4) goto La8
            mx.u r5 = mx.u.f73831a
            return r5
        La8:
            return r3
        La9:
            return r10
        Laa:
            io.ktor.server.plugins.BadRequestException r6 = new io.ktor.server.plugins.BadRequestException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "Failed to convert request body to "
            r7.append(r9)
            h10.d r8 = r8.b()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ly.i.b(io.ktor.utils.io.g, java.nio.charset.Charset, ly.g, gz.a, ix.k, j00.c):java.lang.Object");
    }

    public static final void c(@k o0<ly.a> o0Var) {
        g0.p(o0Var, "<this>");
        o0Var.p(new b(null));
    }
}
