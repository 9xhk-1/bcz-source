package io.ktor.server.engine;

import androidx.core.app.NotificationCompat;
import io.ktor.server.plugins.BadRequestException;
import io.ktor.server.plugins.NotFoundException;
import io.ktor.server.plugins.PayloadTooLargeException;
import io.ktor.server.plugins.UnsupportedMediaTypeException;
import io.ktor.util.cio.ChannelIOException;
import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDefaultEnginePipeline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultEnginePipeline.kt\nio/ktor/server/engine/DefaultEnginePipelineKt\n+ 2 ApplicationResponseFunctions.kt\nio/ktor/server/response/ApplicationResponseFunctionsKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,121:1\n25#2:122\n26#2:139\n58#3,16:123\n*S KotlinDebug\n*F\n+ 1 DefaultEnginePipeline.kt\nio/ktor/server/engine/DefaultEnginePipelineKt\n*L\n84#1:122\n84#1:139\n84#1:123,16\n*E\n"})
/* loaded from: classes8.dex */
public final class DefaultEnginePipelineKt {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.engine.DefaultEnginePipelineKt", f = "DefaultEnginePipeline.kt", i = {0, 0}, l = {55, 56}, m = "handleFailure", n = {NotificationCompat.CATEGORY_CALL, "error"}, s = {"L$0", "L$1"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f61272a;

        /* renamed from: b, reason: collision with root package name */
        public Object f61273b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f61274c;

        /* renamed from: d, reason: collision with root package name */
        public int f61275d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f61274c = obj;
            this.f61275d |= Integer.MIN_VALUE;
            return DefaultEnginePipelineKt.e(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.engine.DefaultEnginePipelineKt$logError$2", f = "DefaultEnginePipeline.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements x00.l<j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f61276a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ zx.b f61277b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Throwable f61278c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(zx.b bVar, Throwable th2, j00.c<? super b> cVar) {
            super(1, cVar);
            this.f61277b = bVar;
            this.f61278c = th2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(j00.c<?> cVar) {
            return new b(this.f61277b, this.f61278c, cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super yz.g2> cVar) {
            return ((b) create(cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f61276a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            DefaultEnginePipelineKt.g(this.f61277b.w0().a(), this.f61277b, this.f61278c);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.engine.DefaultEnginePipelineKt", f = "DefaultEnginePipeline.kt", i = {}, l = {122}, m = "tryRespondError", n = {}, s = {})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f61279a;

        /* renamed from: b, reason: collision with root package name */
        public int f61280b;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f61279a = obj;
            this.f61280b |= Integer.MIN_VALUE;
            return DefaultEnginePipelineKt.h(null, null, this);
        }
    }

    @m80.k
    public static final s1 c(@m80.k ey.a config, boolean z11) {
        kotlin.jvm.internal.g0.p(config, "config");
        s1 s1Var = new s1(z11);
        fy.b.c(config, s1Var);
        s1Var.C(s1.f61434j.b(), new DefaultEnginePipelineKt$defaultEnginePipeline$1(null));
        return s1Var;
    }

    @m80.l
    public static final ix.g1 d(@m80.k Throwable cause) {
        kotlin.jvm.internal.g0.p(cause, "cause");
        if (cause instanceof BadRequestException) {
            return ix.g1.f62797c.e();
        }
        if (cause instanceof NotFoundException) {
            return ix.g1.f62797c.z();
        }
        if (cause instanceof UnsupportedMediaTypeException) {
            return ix.g1.f62797c.Y();
        }
        if (cause instanceof PayloadTooLargeException) {
            return ix.g1.f62797c.E();
        }
        if ((cause instanceof TimeoutException) || (cause instanceof TimeoutCancellationException)) {
            return ix.g1.f62797c.m();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        if (h(r5, r6, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        if (f(r5, r6, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(@m80.k zx.b r5, @m80.k java.lang.Throwable r6, @m80.k j00.c<? super yz.g2> r7) {
        /*
            boolean r0 = r7 instanceof io.ktor.server.engine.DefaultEnginePipelineKt.a
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.server.engine.DefaultEnginePipelineKt$a r0 = (io.ktor.server.engine.DefaultEnginePipelineKt.a) r0
            int r1 = r0.f61275d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f61275d = r1
            goto L18
        L13:
            io.ktor.server.engine.DefaultEnginePipelineKt$a r0 = new io.ktor.server.engine.DefaultEnginePipelineKt$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f61274c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f61275d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r7)
            goto L6b
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.f61273b
            r6 = r5
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            java.lang.Object r5 = r0.f61272a
            zx.b r5 = (zx.b) r5
            kotlin.e.n(r7)
            goto L51
        L41:
            kotlin.e.n(r7)
            r0.f61272a = r5
            r0.f61273b = r6
            r0.f61275d = r4
            java.lang.Object r7 = f(r5, r6, r0)
            if (r7 != r1) goto L51
            goto L6a
        L51:
            ix.g1 r6 = d(r6)
            if (r6 != 0) goto L5d
            ix.g1$a r6 = ix.g1.f62797c
            ix.g1 r6 = r6.p()
        L5d:
            r7 = 0
            r0.f61272a = r7
            r0.f61273b = r7
            r0.f61275d = r3
            java.lang.Object r5 = h(r5, r6, r0)
            if (r5 != r1) goto L6b
        L6a:
            return r1
        L6b:
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.engine.DefaultEnginePipelineKt.e(zx.b, java.lang.Throwable, j00.c):java.lang.Object");
    }

    @m80.l
    public static final Object f(@m80.k zx.b bVar, @m80.k Throwable th2, @m80.k j00.c<? super yz.g2> cVar) {
        Object a11 = iy.b.a(bVar.w0()).a(bVar, new b(bVar, th2, null), cVar);
        return a11 == kotlin.coroutines.intrinsics.b.l() ? a11 : yz.g2.f100423a;
    }

    public static final void g(zx.f fVar, zx.b bVar, Throwable th2) {
        String str;
        try {
            Object l11 = bVar.k().l();
            if (l11 == null) {
                l11 = "Unhandled";
            }
            try {
                try {
                    str = iy.b.b(bVar.f());
                } catch (OutOfMemoryError unused) {
                    fy.b.f("OutOfMemoryError: ");
                    fy.b.f(th2.getMessage());
                    fy.b.f("\n");
                    return;
                }
            } catch (Throwable th3) {
                str = "(request error: " + th3 + ')';
            }
            String str2 = l11 + ": " + str + ". Exception " + kotlin.jvm.internal.o0.d(th2.getClass()) + ": " + th2.getMessage();
            if (!(th2 instanceof CancellationException) && !(th2 instanceof ClosedChannelException) && !(th2 instanceof ChannelIOException) && !(th2 instanceof IOException) && !(th2 instanceof BadRequestException) && !(th2 instanceof NotFoundException) && !(th2 instanceof PayloadTooLargeException) && !(th2 instanceof UnsupportedMediaTypeException)) {
                fVar.c().error(l11 + ": " + str, th2);
                return;
            }
            fVar.c().debug(str2, th2);
        } catch (OutOfMemoryError unused2) {
            ez.c.a(fVar.c(), th2);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(6:18|19|20|21|22|(1:24))|11|12|13))|28|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(zx.b r5, ix.g1 r6, j00.c<? super yz.g2> r7) {
        /*
            java.lang.Class<ix.g1> r0 = ix.g1.class
            boolean r1 = r7 instanceof io.ktor.server.engine.DefaultEnginePipelineKt.c
            if (r1 == 0) goto L15
            r1 = r7
            io.ktor.server.engine.DefaultEnginePipelineKt$c r1 = (io.ktor.server.engine.DefaultEnginePipelineKt.c) r1
            int r2 = r1.f61280b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f61280b = r2
            goto L1a
        L15:
            io.ktor.server.engine.DefaultEnginePipelineKt$c r1 = new io.ktor.server.engine.DefaultEnginePipelineKt$c
            r1.<init>(r7)
        L1a:
            java.lang.Object r7 = r1.f61279a
            java.lang.Object r2 = kotlin.coroutines.intrinsics.b.l()
            int r3 = r1.f61280b
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            kotlin.e.n(r7)     // Catch: io.ktor.server.engine.BaseApplicationResponse.ResponseAlreadySentException -> L4e
            goto L4e
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.e.n(r7)
            h10.d r7 = kotlin.jvm.internal.o0.d(r0)     // Catch: io.ktor.server.engine.BaseApplicationResponse.ResponseAlreadySentException -> L4e
            h10.r r0 = kotlin.jvm.internal.o0.B(r0)     // Catch: java.lang.Throwable -> L3f
            goto L40
        L3f:
            r0 = 0
        L40:
            gz.a r3 = new gz.a     // Catch: io.ktor.server.engine.BaseApplicationResponse.ResponseAlreadySentException -> L4e
            r3.<init>(r7, r0)     // Catch: io.ktor.server.engine.BaseApplicationResponse.ResponseAlreadySentException -> L4e
            r1.f61280b = r4     // Catch: io.ktor.server.engine.BaseApplicationResponse.ResponseAlreadySentException -> L4e
            java.lang.Object r5 = r5.E(r6, r3, r1)     // Catch: io.ktor.server.engine.BaseApplicationResponse.ResponseAlreadySentException -> L4e
            if (r5 != r2) goto L4e
            return r2
        L4e:
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.engine.DefaultEnginePipelineKt.h(zx.b, ix.g1, j00.c):java.lang.Object");
    }
}
