package ex;

import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import cx.y;
import fx.i;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nHttpStatement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpStatement.kt\nio/ktor/client/statement/HttpStatement\n+ 2 HttpTimeout.kt\nio/ktor/client/plugins/HttpTimeoutKt\n+ 3 HttpClientCall.kt\nio/ktor/client/call/HttpClientCallKt\n+ 4 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,140:1\n278#2,4:141\n278#2,2:145\n280#2,2:164\n278#2,2:166\n280#2,2:185\n278#2,4:187\n278#2,4:191\n142#3:147\n142#3:168\n58#4,16:148\n58#4,16:169\n*S KotlinDebug\n*F\n+ 1 HttpStatement.kt\nio/ktor/client/statement/HttpStatement\n*L\n43#1:141,4\n67#1:145,2\n67#1:164,2\n83#1:166,2\n83#1:185,2\n98#1:187,4\n111#1:191,4\n70#1:147\n86#1:168\n70#1:148,16\n86#1:169,16\n*E\n"})
/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final y f50202a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final lw.c f50203b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", i = {}, l = {134}, m = "cleanup", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f50204a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f50205b;

        /* renamed from: d, reason: collision with root package name */
        public int f50207d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f50205b = obj;
            this.f50207d |= Integer.MIN_VALUE;
            return g.this.c(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", i = {0, 0, 1, 1}, l = {44, 47, 49, 49}, m = "execute", n = {"this", "block", "this", "response"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class b<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f50208a;

        /* renamed from: b, reason: collision with root package name */
        public Object f50209b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f50210c;

        /* renamed from: e, reason: collision with root package name */
        public int f50212e;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f50210c = obj;
            this.f50212e |= Integer.MIN_VALUE;
            return g.this.e(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", i = {0, 1, 1, 2}, l = {113, 114, 115}, m = "fetchResponse", n = {"this", "this", NotificationCompat.CATEGORY_CALL, "result"}, s = {"L$0", "L$0", "L$1", "L$0"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f50213a;

        /* renamed from: b, reason: collision with root package name */
        public Object f50214b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f50215c;

        /* renamed from: e, reason: collision with root package name */
        public int f50217e;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f50215c = obj;
            this.f50217e |= Integer.MIN_VALUE;
            return g.this.f(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", i = {}, l = {102}, m = "fetchStreamingResponse", n = {}, s = {})
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f50218a;

        /* renamed from: c, reason: collision with root package name */
        public int f50220c;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f50218a = obj;
            this.f50220c |= Integer.MIN_VALUE;
            return g.this.g(this);
        }
    }

    public g(@k y builder, @k lw.c client) {
        g0.p(builder, "builder");
        g0.p(client, "client");
        this.f50202a = builder;
        this.f50203b = client;
    }

    public final /* synthetic */ <T> Object a(j00.c<? super T> cVar) {
        try {
            d0.e(3);
            d0.e(0);
            Object g11 = g(null);
            d0.e(1);
            ex.c cVar2 = (ex.c) g11;
            try {
                d0.e(3);
                mw.a c11 = cVar2.c();
                g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
                h10.d d11 = o0.d(Object.class);
                try {
                    g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
                } catch (Throwable unused) {
                }
                gz.a aVar = new gz.a(d11, null);
                d0.e(0);
                Object b11 = c11.b(aVar, null);
                d0.e(1);
                g0.y(1, ExifInterface.GPS_DIRECTION_TRUE);
                return b11;
            } finally {
                d0.d(1);
                e.e(cVar2);
                d0.c(1);
            }
        } catch (CancellationException e11) {
            throw i.a(e11);
        }
    }

    public final /* synthetic */ <T, R> Object b(p<? super T, ? super j00.c<? super R>, ? extends Object> pVar, j00.c<? super R> cVar) {
        try {
            d0.e(3);
            d0.e(0);
            Object g11 = g(null);
            d0.e(1);
            ex.c cVar2 = (ex.c) g11;
            try {
                d0.e(3);
                mw.a c11 = cVar2.c();
                g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
                h10.d d11 = o0.d(Object.class);
                try {
                    g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
                } catch (Throwable unused) {
                }
                gz.a aVar = new gz.a(d11, null);
                d0.e(0);
                Object b11 = c11.b(aVar, null);
                d0.e(1);
                g0.y(1, ExifInterface.GPS_DIRECTION_TRUE);
                d0.e(3);
                return pVar.invoke(b11, null);
            } finally {
                d0.d(1);
                d0.e(3);
                d0.e(0);
                c(cVar2, null);
                d0.e(1);
                d0.c(1);
            }
        } catch (CancellationException e11) {
            throw i.a(e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    @yz.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@m80.k ex.c r5, @m80.k j00.c<? super yz.g2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ex.g.a
            if (r0 == 0) goto L13
            r0 = r6
            ex.g$a r0 = (ex.g.a) r0
            int r1 = r0.f50207d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50207d = r1
            goto L18
        L13:
            ex.g$a r0 = new ex.g$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f50205b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50207d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f50204a
            c40.a0 r5 = (c40.a0) r5
            kotlin.e.n(r6)
            goto L5c
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.e.n(r6)
            kotlin.coroutines.d r6 = r5.getCoroutineContext()
            c40.l2$b r2 = c40.l2.f7886e0
            kotlin.coroutines.d$b r6 = r6.get(r2)
            kotlin.jvm.internal.g0.m(r6)
            c40.a0 r6 = (c40.a0) r6
            r6.complete()
            io.ktor.utils.io.g r5 = r5.b()     // Catch: java.lang.Throwable -> L51
            io.ktor.utils.io.h.a(r5)     // Catch: java.lang.Throwable -> L51
        L51:
            r0.f50204a = r6
            r0.f50207d = r3
            java.lang.Object r5 = r6.K0(r0)
            if (r5 != r1) goto L5c
            return r1
        L5c:
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ex.g.c(ex.c, j00.c):java.lang.Object");
    }

    @l
    public final Object d(@k j00.c<? super ex.c> cVar) {
        return f(cVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(1:(1:(2:13|14)(3:16|17|18))(3:19|20|21))(5:22|23|24|25|(2:27|28)(1:29)))(2:35|36))(3:44|45|(2:47|28)(1:48))|37|38|39|(3:41|25|(0)(0))|28))|52|6|7|(0)(0)|37|38|39|(0)|28|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a2, code lost:
    
        if (r2.c(r11, r0) == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0097, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object e(@m80.k x00.p<? super ex.c, ? super j00.c<? super T>, ? extends java.lang.Object> r10, @m80.k j00.c<? super T> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof ex.g.b
            if (r0 == 0) goto L13
            r0 = r11
            ex.g$b r0 = (ex.g.b) r0
            int r1 = r0.f50212e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50212e = r1
            goto L18
        L13:
            ex.g$b r0 = new ex.g$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f50210c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50212e
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L66
            if (r2 == r7) goto L5a
            if (r2 == r6) goto L49
            if (r2 == r5) goto L43
            if (r2 == r4) goto L37
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            java.lang.Object r10 = r0.f50208a
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            kotlin.e.n(r11)     // Catch: java.util.concurrent.CancellationException -> L40
            goto La5
        L40:
            r10 = move-exception
            goto La6
        L43:
            java.lang.Object r10 = r0.f50208a
            kotlin.e.n(r11)     // Catch: java.util.concurrent.CancellationException -> L40
            return r10
        L49:
            java.lang.Object r10 = r0.f50209b
            ex.c r10 = (ex.c) r10
            java.lang.Object r2 = r0.f50208a
            ex.g r2 = (ex.g) r2
            kotlin.e.n(r11)     // Catch: java.lang.Throwable -> L55
            goto L89
        L55:
            r11 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
            goto L98
        L5a:
            java.lang.Object r10 = r0.f50209b
            x00.p r10 = (x00.p) r10
            java.lang.Object r2 = r0.f50208a
            ex.g r2 = (ex.g) r2
            kotlin.e.n(r11)     // Catch: java.util.concurrent.CancellationException -> L40
            goto L77
        L66:
            kotlin.e.n(r11)
            r0.f50208a = r9     // Catch: java.util.concurrent.CancellationException -> L40
            r0.f50209b = r10     // Catch: java.util.concurrent.CancellationException -> L40
            r0.f50212e = r7     // Catch: java.util.concurrent.CancellationException -> L40
            java.lang.Object r11 = r9.g(r0)     // Catch: java.util.concurrent.CancellationException -> L40
            if (r11 != r1) goto L76
            goto La4
        L76:
            r2 = r9
        L77:
            ex.c r11 = (ex.c) r11     // Catch: java.util.concurrent.CancellationException -> L40
            r0.f50208a = r2     // Catch: java.lang.Throwable -> L97
            r0.f50209b = r11     // Catch: java.lang.Throwable -> L97
            r0.f50212e = r6     // Catch: java.lang.Throwable -> L97
            java.lang.Object r10 = r10.invoke(r11, r0)     // Catch: java.lang.Throwable -> L97
            if (r10 != r1) goto L86
            goto La4
        L86:
            r8 = r11
            r11 = r10
            r10 = r8
        L89:
            r0.f50208a = r11     // Catch: java.util.concurrent.CancellationException -> L40
            r0.f50209b = r3     // Catch: java.util.concurrent.CancellationException -> L40
            r0.f50212e = r5     // Catch: java.util.concurrent.CancellationException -> L40
            java.lang.Object r10 = r2.c(r10, r0)     // Catch: java.util.concurrent.CancellationException -> L40
            if (r10 != r1) goto L96
            goto La4
        L96:
            return r11
        L97:
            r10 = move-exception
        L98:
            r0.f50208a = r10     // Catch: java.util.concurrent.CancellationException -> L40
            r0.f50209b = r3     // Catch: java.util.concurrent.CancellationException -> L40
            r0.f50212e = r4     // Catch: java.util.concurrent.CancellationException -> L40
            java.lang.Object r11 = r2.c(r11, r0)     // Catch: java.util.concurrent.CancellationException -> L40
            if (r11 != r1) goto La5
        La4:
            return r1
        La5:
            throw r10     // Catch: java.util.concurrent.CancellationException -> L40
        La6:
            java.lang.Throwable r10 = fx.i.a(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ex.g.e(x00.p, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @m80.l
    @yz.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(@m80.k j00.c<? super ex.c> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ex.g.c
            if (r0 == 0) goto L13
            r0 = r8
            ex.g$c r0 = (ex.g.c) r0
            int r1 = r0.f50217e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50217e = r1
            goto L18
        L13:
            ex.g$c r0 = new ex.g$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f50215c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50217e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L51
            if (r2 == r5) goto L49
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r0 = r0.f50213a
            ex.c r0 = (ex.c) r0
            kotlin.e.n(r8)     // Catch: java.util.concurrent.CancellationException -> L33
            return r0
        L33:
            r8 = move-exception
            goto L99
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3d:
            java.lang.Object r2 = r0.f50214b
            mw.a r2 = (mw.a) r2
            java.lang.Object r4 = r0.f50213a
            ex.g r4 = (ex.g) r4
            kotlin.e.n(r8)     // Catch: java.util.concurrent.CancellationException -> L33
            goto L80
        L49:
            java.lang.Object r2 = r0.f50213a
            ex.g r2 = (ex.g) r2
            kotlin.e.n(r8)     // Catch: java.util.concurrent.CancellationException -> L33
            goto L6d
        L51:
            kotlin.e.n(r8)
            cx.y r8 = new cx.y     // Catch: java.util.concurrent.CancellationException -> L33
            r8.<init>()     // Catch: java.util.concurrent.CancellationException -> L33
            cx.y r2 = r7.f50202a     // Catch: java.util.concurrent.CancellationException -> L33
            cx.y r8 = r8.s(r2)     // Catch: java.util.concurrent.CancellationException -> L33
            lw.c r2 = r7.f50203b     // Catch: java.util.concurrent.CancellationException -> L33
            r0.f50213a = r7     // Catch: java.util.concurrent.CancellationException -> L33
            r0.f50217e = r5     // Catch: java.util.concurrent.CancellationException -> L33
            java.lang.Object r8 = r2.C(r8, r0)     // Catch: java.util.concurrent.CancellationException -> L33
            if (r8 != r1) goto L6c
            goto L97
        L6c:
            r2 = r7
        L6d:
            mw.a r8 = (mw.a) r8     // Catch: java.util.concurrent.CancellationException -> L33
            r0.f50213a = r2     // Catch: java.util.concurrent.CancellationException -> L33
            r0.f50214b = r8     // Catch: java.util.concurrent.CancellationException -> L33
            r0.f50217e = r4     // Catch: java.util.concurrent.CancellationException -> L33
            java.lang.Object r4 = mw.c.a(r8, r0)     // Catch: java.util.concurrent.CancellationException -> L33
            if (r4 != r1) goto L7c
            goto L97
        L7c:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L80:
            mw.a r8 = (mw.a) r8     // Catch: java.util.concurrent.CancellationException -> L33
            ex.c r8 = r8.i()     // Catch: java.util.concurrent.CancellationException -> L33
            ex.c r2 = r2.i()     // Catch: java.util.concurrent.CancellationException -> L33
            r0.f50213a = r8     // Catch: java.util.concurrent.CancellationException -> L33
            r5 = 0
            r0.f50214b = r5     // Catch: java.util.concurrent.CancellationException -> L33
            r0.f50217e = r3     // Catch: java.util.concurrent.CancellationException -> L33
            java.lang.Object r0 = r4.c(r2, r0)     // Catch: java.util.concurrent.CancellationException -> L33
            if (r0 != r1) goto L98
        L97:
            return r1
        L98:
            return r8
        L99:
            java.lang.Throwable r8 = fx.i.a(r8)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ex.g.f(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @m80.l
    @yz.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(@m80.k j00.c<? super ex.c> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ex.g.d
            if (r0 == 0) goto L13
            r0 = r5
            ex.g$d r0 = (ex.g.d) r0
            int r1 = r0.f50220c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50220c = r1
            goto L18
        L13:
            ex.g$d r0 = new ex.g$d
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f50218a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f50220c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.e.n(r5)     // Catch: java.util.concurrent.CancellationException -> L29
            goto L4f
        L29:
            r5 = move-exception
            goto L56
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.e.n(r5)
            cx.y r5 = new cx.y     // Catch: java.util.concurrent.CancellationException -> L29
            r5.<init>()     // Catch: java.util.concurrent.CancellationException -> L29
            cx.y r2 = r4.f50202a     // Catch: java.util.concurrent.CancellationException -> L29
            cx.y r5 = r5.s(r2)     // Catch: java.util.concurrent.CancellationException -> L29
            rw.p.h(r5)     // Catch: java.util.concurrent.CancellationException -> L29
            lw.c r2 = r4.f50203b     // Catch: java.util.concurrent.CancellationException -> L29
            r0.f50220c = r3     // Catch: java.util.concurrent.CancellationException -> L29
            java.lang.Object r5 = r2.C(r5, r0)     // Catch: java.util.concurrent.CancellationException -> L29
            if (r5 != r1) goto L4f
            return r1
        L4f:
            mw.a r5 = (mw.a) r5     // Catch: java.util.concurrent.CancellationException -> L29
            ex.c r5 = r5.i()     // Catch: java.util.concurrent.CancellationException -> L29
            return r5
        L56:
            java.lang.Throwable r5 = fx.i.a(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ex.g.g(j00.c):java.lang.Object");
    }

    @k
    public final lw.c h() {
        return this.f50203b;
    }

    @k
    public String toString() {
        return "HttpStatement[" + this.f50202a.j() + l50.b.f69930l;
    }

    @v0
    public static /* synthetic */ void i() {
    }
}
