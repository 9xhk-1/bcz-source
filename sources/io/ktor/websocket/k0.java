package io.ktor.websocket;

import io.ktor.websocket.CloseReason;
import io.ktor.websocket.d;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nWebSocketSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketSession.kt\nio/ktor/websocket/WebSocketSessionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,152:1\n295#2,2:153\n*S KotlinDebug\n*F\n+ 1 WebSocketSession.kt\nio/ktor/websocket/WebSocketSessionKt\n*L\n96#1:153,2\n*E\n"})
/* loaded from: classes8.dex */
public final class k0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.websocket.WebSocketSessionKt", f = "WebSocketSession.kt", i = {0}, l = {120, 121}, m = "close", n = {"$this$close"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62495a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f62496b;

        /* renamed from: c, reason: collision with root package name */
        public int f62497c;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62496b = obj;
            this.f62497c |= Integer.MIN_VALUE;
            return k0.a(null, null, this);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(5:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(3:22|23|(2:25|21))|19))|27|6|7|(0)(0)|19) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r5.g(r0) != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@m80.k io.ktor.websocket.j0 r5, @m80.k io.ktor.websocket.CloseReason r6, @m80.k j00.c<? super yz.g2> r7) {
        /*
            boolean r0 = r7 instanceof io.ktor.websocket.k0.a
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.websocket.k0$a r0 = (io.ktor.websocket.k0.a) r0
            int r1 = r0.f62497c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62497c = r1
            goto L18
        L13:
            io.ktor.websocket.k0$a r0 = new io.ktor.websocket.k0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f62496b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f62497c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r7)     // Catch: java.lang.Throwable -> L5b
            goto L5b
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.f62495a
            io.ktor.websocket.j0 r5 = (io.ktor.websocket.j0) r5
            kotlin.e.n(r7)     // Catch: java.lang.Throwable -> L5b
            goto L4f
        L3c:
            kotlin.e.n(r7)
            io.ktor.websocket.d$b r7 = new io.ktor.websocket.d$b     // Catch: java.lang.Throwable -> L5b
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L5b
            r0.f62495a = r5     // Catch: java.lang.Throwable -> L5b
            r0.f62497c = r4     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r6 = r5.U(r7, r0)     // Catch: java.lang.Throwable -> L5b
            if (r6 != r1) goto L4f
            goto L5a
        L4f:
            r6 = 0
            r0.f62495a = r6     // Catch: java.lang.Throwable -> L5b
            r0.f62497c = r3     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r5 = r5.g(r0)     // Catch: java.lang.Throwable -> L5b
            if (r5 != r1) goto L5b
        L5a:
            return r1
        L5b:
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.k0.a(io.ktor.websocket.j0, io.ktor.websocket.CloseReason, j00.c):java.lang.Object");
    }

    @m80.l
    @yz.n(level = DeprecationLevel.ERROR, message = "Close with reason or terminate instead.")
    public static final Object b(@m80.k j0 j0Var, @m80.l Throwable th2, @m80.k j00.c<? super g2> cVar) {
        if (th2 == null) {
            Object c11 = c(j0Var, null, cVar, 1, null);
            return c11 == kotlin.coroutines.intrinsics.b.l() ? c11 : g2.f100423a;
        }
        Object d11 = d(j0Var, th2, cVar);
        return d11 == kotlin.coroutines.intrinsics.b.l() ? d11 : g2.f100423a;
    }

    public static /* synthetic */ Object c(j0 j0Var, CloseReason closeReason, j00.c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            closeReason = new CloseReason(CloseReason.Codes.NORMAL, "");
        }
        return a(j0Var, closeReason, cVar);
    }

    @m80.l
    public static final Object d(@m80.k j0 j0Var, @m80.k Throwable th2, @m80.k j00.c<? super g2> cVar) {
        Object a11 = a(j0Var, th2 instanceof CancellationException ? new CloseReason(CloseReason.Codes.NORMAL, "") : new CloseReason(CloseReason.Codes.INTERNAL_ERROR, th2.toString()), cVar);
        return a11 == kotlin.coroutines.intrinsics.b.l() ? a11 : g2.f100423a;
    }

    @m80.k
    public static final <T extends z<?>> T e(@m80.k j0 j0Var, @m80.k a0<?, T> extension) {
        kotlin.jvm.internal.g0.p(j0Var, "<this>");
        kotlin.jvm.internal.g0.p(extension, "extension");
        T t11 = (T) f(j0Var, extension);
        if (t11 != null) {
            return t11;
        }
        throw new IllegalStateException(("Extension " + extension + " not found.").toString());
    }

    @m80.l
    public static final <T extends z<?>> T f(@m80.k j0 j0Var, @m80.k a0<?, T> extension) {
        Object obj;
        kotlin.jvm.internal.g0.p(j0Var, "<this>");
        kotlin.jvm.internal.g0.p(extension, "extension");
        Iterator<T> it = j0Var.A0().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((z) obj).a().getKey() == extension.getKey()) {
                break;
            }
        }
        if (obj instanceof z) {
            return (T) obj;
        }
        return null;
    }

    @m80.l
    public static final Object g(@m80.k j0 j0Var, @m80.k String str, @m80.k j00.c<? super g2> cVar) {
        Object U = j0Var.U(new d.f(str), cVar);
        return U == kotlin.coroutines.intrinsics.b.l() ? U : g2.f100423a;
    }

    @m80.l
    public static final Object h(@m80.k j0 j0Var, @m80.k byte[] bArr, @m80.k j00.c<? super g2> cVar) {
        Object U = j0Var.U(new d.a(true, bArr), cVar);
        return U == kotlin.coroutines.intrinsics.b.l() ? U : g2.f100423a;
    }
}
