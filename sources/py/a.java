package py;

import h10.r;
import io.ktor.server.plugins.CannotTransformContentToTypeException;
import java.io.InputStream;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nApplicationReceiveFunctionsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApplicationReceiveFunctionsJvm.kt\nio/ktor/server/request/ApplicationReceiveFunctionsJvmKt\n+ 2 ApplicationReceiveFunctions.kt\nio/ktor/server/request/ApplicationReceiveFunctionsKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,17:1\n72#2:18\n73#2:35\n58#3,16:19\n*S KotlinDebug\n*F\n+ 1 ApplicationReceiveFunctionsJvm.kt\nio/ktor/server/request/ApplicationReceiveFunctionsJvmKt\n*L\n16#1:18\n16#1:35\n16#1:19,16\n*E\n"})
/* loaded from: classes8.dex */
public final class a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.request.ApplicationReceiveFunctionsJvmKt", f = "ApplicationReceiveFunctionsJvm.kt", i = {}, l = {18}, m = "receiveStream", n = {}, s = {})
    /* renamed from: py.a$a, reason: collision with other inner class name */
    public static final class C0996a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f81300a;

        /* renamed from: b, reason: collision with root package name */
        public int f81301b;

        public C0996a(j00.c<? super C0996a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f81300a = obj;
            this.f81301b |= Integer.MIN_VALUE;
            return a.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@m80.k zx.b r7, @m80.k j00.c<? super java.io.InputStream> r8) {
        /*
            boolean r0 = r8 instanceof py.a.C0996a
            if (r0 == 0) goto L13
            r0 = r8
            py.a$a r0 = (py.a.C0996a) r0
            int r1 = r0.f81301b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f81301b = r1
            goto L18
        L13:
            py.a$a r0 = new py.a$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f81300a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f81301b
            r3 = 0
            r4 = 1
            java.lang.Class<java.io.InputStream> r5 = java.io.InputStream.class
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            kotlin.e.n(r8)
            goto L4f
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            kotlin.e.n(r8)
            h10.d r8 = kotlin.jvm.internal.o0.d(r5)
            h10.r r2 = kotlin.jvm.internal.o0.B(r5)     // Catch: java.lang.Throwable -> L40
            goto L41
        L40:
            r2 = r3
        L41:
            gz.a r6 = new gz.a
            r6.<init>(r8, r2)
            r0.f81301b = r4
            java.lang.Object r8 = r7.L(r6, r0)
            if (r8 != r1) goto L4f
            return r1
        L4f:
            if (r8 == 0) goto L52
            return r8
        L52:
            h10.d r7 = kotlin.jvm.internal.o0.d(r5)
            h10.r r3 = kotlin.jvm.internal.o0.B(r5)     // Catch: java.lang.Throwable -> L5a
        L5a:
            gz.a r8 = new gz.a
            r8.<init>(r7, r3)
            h10.r r7 = r8.a()
            kotlin.jvm.internal.g0.m(r7)
            io.ktor.server.plugins.CannotTransformContentToTypeException r8 = new io.ktor.server.plugins.CannotTransformContentToTypeException
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: py.a.a(zx.b, j00.c):java.lang.Object");
    }

    public static final Object b(zx.b bVar, j00.c<? super InputStream> cVar) {
        r rVar;
        h10.d d11 = o0.d(InputStream.class);
        r rVar2 = null;
        try {
            rVar = o0.B(InputStream.class);
        } catch (Throwable unused) {
            rVar = null;
        }
        gz.a aVar = new gz.a(d11, rVar);
        d0.e(0);
        Object L = bVar.L(aVar, cVar);
        d0.e(1);
        if (L != null) {
            return L;
        }
        h10.d d12 = o0.d(InputStream.class);
        try {
            rVar2 = o0.B(InputStream.class);
        } catch (Throwable unused2) {
        }
        r a11 = new gz.a(d12, rVar2).a();
        g0.m(a11);
        throw new CannotTransformContentToTypeException(a11);
    }
}
