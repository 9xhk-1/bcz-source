package ex;

import c40.a0;
import c40.l2;
import cx.w;
import io.ktor.utils.io.b0;
import java.nio.charset.Charset;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.n;
import yz.v0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nHttpResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpResponse.kt\nio/ktor/client/statement/HttpResponseKt\n+ 2 HttpClientCall.kt\nio/ktor/client/call/HttpClientCallKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,122:1\n142#2:123\n142#2:140\n142#2:157\n58#3,16:124\n58#3,16:141\n58#3,16:158\n*S KotlinDebug\n*F\n+ 1 HttpResponse.kt\nio/ktor/client/statement/HttpResponseKt\n*L\n105#1:123\n113#1:140\n121#1:157\n105#1:124,16\n113#1:141,16\n121#1:158,16\n*E\n"})
/* loaded from: classes8.dex */
public final class e {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.statement.HttpResponseKt", f = "HttpResponse.kt", i = {}, l = {123}, m = "bodyAsBytes", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f50188a;

        /* renamed from: b, reason: collision with root package name */
        public int f50189b;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f50188a = obj;
            this.f50189b |= Integer.MIN_VALUE;
            return e.a(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.statement.HttpResponseKt", f = "HttpResponse.kt", i = {}, l = {123}, m = "bodyAsChannel", n = {}, s = {})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f50190a;

        /* renamed from: b, reason: collision with root package name */
        public int f50191b;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f50190a = obj;
            this.f50191b |= Integer.MIN_VALUE;
            return e.b(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.statement.HttpResponseKt", f = "HttpResponse.kt", i = {0}, l = {123}, m = "bodyAsText", n = {"decoder"}, s = {"L$0"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f50192a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50193b;

        /* renamed from: c, reason: collision with root package name */
        public int f50194c;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f50193b = obj;
            this.f50194c |= Integer.MIN_VALUE;
            return e.c(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@m80.k ex.c r5, @m80.k j00.c<? super byte[]> r6) {
        /*
            boolean r0 = r6 instanceof ex.e.a
            if (r0 == 0) goto L13
            r0 = r6
            ex.e$a r0 = (ex.e.a) r0
            int r1 = r0.f50189b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50189b = r1
            goto L18
        L13:
            ex.e$a r0 = new ex.e$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f50188a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50189b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r6)
            goto L52
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.e.n(r6)
            mw.a r5 = r5.c()
            java.lang.Class<byte[]> r6 = byte[].class
            h10.d r2 = kotlin.jvm.internal.o0.d(r6)
            h10.r r6 = kotlin.jvm.internal.o0.B(r6)     // Catch: java.lang.Throwable -> L43
            goto L44
        L43:
            r6 = 0
        L44:
            gz.a r4 = new gz.a
            r4.<init>(r2, r6)
            r0.f50189b = r3
            java.lang.Object r6 = r5.b(r4, r0)
            if (r6 != r1) goto L52
            return r1
        L52:
            if (r6 == 0) goto L57
            byte[] r6 = (byte[]) r6
            return r6
        L57:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.ByteArray"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ex.e.a(ex.c, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(@m80.k ex.c r5, @m80.k j00.c<? super io.ktor.utils.io.g> r6) {
        /*
            boolean r0 = r6 instanceof ex.e.b
            if (r0 == 0) goto L13
            r0 = r6
            ex.e$b r0 = (ex.e.b) r0
            int r1 = r0.f50191b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50191b = r1
            goto L18
        L13:
            ex.e$b r0 = new ex.e$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f50190a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50191b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r6)
            goto L52
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.e.n(r6)
            mw.a r5 = r5.c()
            java.lang.Class<io.ktor.utils.io.g> r6 = io.ktor.utils.io.g.class
            h10.d r2 = kotlin.jvm.internal.o0.d(r6)
            h10.r r6 = kotlin.jvm.internal.o0.B(r6)     // Catch: java.lang.Throwable -> L43
            goto L44
        L43:
            r6 = 0
        L44:
            gz.a r4 = new gz.a
            r4.<init>(r2, r6)
            r0.f50191b = r3
            java.lang.Object r6 = r5.b(r4, r0)
            if (r6 != r1) goto L52
            return r1
        L52:
            if (r6 == 0) goto L57
            io.ktor.utils.io.g r6 = (io.ktor.utils.io.g) r6
            return r6
        L57:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "null cannot be cast to non-null type io.ktor.utils.io.ByteReadChannel"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ex.e.b(ex.c, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(@m80.k ex.c r6, @m80.k java.nio.charset.Charset r7, @m80.k j00.c<? super java.lang.String> r8) {
        /*
            boolean r0 = r8 instanceof ex.e.c
            if (r0 == 0) goto L13
            r0 = r8
            ex.e$c r0 = (ex.e.c) r0
            int r1 = r0.f50194c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50194c = r1
            goto L18
        L13:
            ex.e$c r0 = new ex.e$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f50193b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50194c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r6 = r0.f50192a
            java.nio.charset.CharsetDecoder r6 = (java.nio.charset.CharsetDecoder) r6
            kotlin.e.n(r8)
            goto L66
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.e.n(r8)
            java.nio.charset.Charset r8 = ix.d1.b(r6)
            if (r8 != 0) goto L40
            goto L41
        L40:
            r7 = r8
        L41:
            java.nio.charset.CharsetDecoder r7 = r7.newDecoder()
            mw.a r6 = r6.c()
            java.lang.Class<y40.c0> r8 = y40.c0.class
            h10.d r2 = kotlin.jvm.internal.o0.d(r8)
            h10.r r8 = kotlin.jvm.internal.o0.B(r8)     // Catch: java.lang.Throwable -> L54
            goto L55
        L54:
            r8 = r3
        L55:
            gz.a r5 = new gz.a
            r5.<init>(r2, r8)
            r0.f50192a = r7
            r0.f50194c = r4
            java.lang.Object r8 = r6.b(r5, r0)
            if (r8 != r1) goto L65
            return r1
        L65:
            r6 = r7
        L66:
            if (r8 == 0) goto L74
            y40.c0 r8 = (y40.c0) r8
            kotlin.jvm.internal.g0.m(r6)
            r7 = 0
            r0 = 2
            java.lang.String r6 = iz.b.b(r6, r8, r7, r0, r3)
            return r6
        L74:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "null cannot be cast to non-null type kotlinx.io.Source"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ex.e.c(ex.c, java.nio.charset.Charset, j00.c):java.lang.Object");
    }

    public static /* synthetic */ Object d(ex.c cVar, Charset charset, j00.c cVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = u30.d.f91599b;
        }
        return c(cVar, charset, cVar2);
    }

    @v0
    @b0
    public static final void e(@k ex.c cVar) {
        g0.p(cVar, "<this>");
        d.b bVar = cVar.getCoroutineContext().get(l2.f7886e0);
        g0.m(bVar);
        ((a0) bVar).complete();
    }

    @k
    public static final io.ktor.utils.io.g f(@k ex.c cVar) {
        g0.p(cVar, "<this>");
        return cVar.b();
    }

    @k
    public static final w h(@k ex.c cVar) {
        g0.p(cVar, "<this>");
        return cVar.c().h();
    }

    @n(message = "This method was renamed to readRawBytes() to reflect what it does.", replaceWith = @w0(expression = "readRawBytes()", imports = {}))
    @b0
    public static /* synthetic */ void g(ex.c cVar) {
    }
}
