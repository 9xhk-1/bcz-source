package nz;

import io.ktor.utils.io.m;
import java.nio.ByteBuffer;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import y40.t;
import y40.v;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nWriteSuspendSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WriteSuspendSession.kt\nio/ktor/utils/io/jvm/nio/WriteSuspendSessionKt\n+ 2 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n*L\n1#1,62:1\n195#2,28:63\n*S KotlinDebug\n*F\n+ 1 WriteSuspendSession.kt\nio/ktor/utils/io/jvm/nio/WriteSuspendSessionKt\n*L\n54#1:63,28\n*E\n"})
/* loaded from: classes8.dex */
public final class d {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt", f = "WriteSuspendSession.kt", i = {0}, l = {43, 45, 45}, m = "writeSuspendSession", n = {"$this$writeSuspendSession"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f75408a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f75409b;

        /* renamed from: c, reason: collision with root package name */
        public int f75410c;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f75409b = obj;
            this.f75410c |= Integer.MIN_VALUE;
            return d.a(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt", f = "WriteSuspendSession.kt", i = {0, 0, 0}, l = {59}, m = "writeWhile", n = {"$this$writeWhile", "block", "done"}, s = {"L$0", "L$1", "L$2"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f75411a;

        /* renamed from: b, reason: collision with root package name */
        public Object f75412b;

        /* renamed from: c, reason: collision with root package name */
        public Object f75413c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f75414d;

        /* renamed from: e, reason: collision with root package name */
        public int f75415e;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f75414d = obj;
            this.f75415e |= Integer.MIN_VALUE;
            return d.b(null, null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (r7 != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r8.invoke(r9, r0) == r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r7v0, types: [io.ktor.utils.io.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    @m80.l
    @yz.n(level = kotlin.DeprecationLevel.WARNING, message = "writeSuspendSession deprecated, use writeWhile instead", replaceWith = @yz.w0(expression = "writeWhile { buffer -> }", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@m80.k io.ktor.utils.io.m r7, @m80.k x00.p<? super nz.c, ? super j00.c<? super yz.g2>, ? extends java.lang.Object> r8, @m80.k j00.c<? super yz.g2> r9) {
        /*
            boolean r0 = r9 instanceof nz.d.a
            if (r0 == 0) goto L13
            r0 = r9
            nz.d$a r0 = (nz.d.a) r0
            int r1 = r0.f75410c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f75410c = r1
            goto L18
        L13:
            nz.d$a r0 = new nz.d$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f75409b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f75410c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4c
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L3b
            if (r2 == r3) goto L33
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            java.lang.Object r7 = r0.f75408a
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            kotlin.e.n(r9)
            goto L79
        L3b:
            kotlin.e.n(r9)
            goto L6b
        L3f:
            java.lang.Object r7 = r0.f75408a
            io.ktor.utils.io.m r7 = (io.ktor.utils.io.m) r7
            kotlin.e.n(r9)     // Catch: java.lang.Throwable -> L47
            goto L5f
        L47:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
            goto L6e
        L4c:
            kotlin.e.n(r9)
            nz.c r9 = new nz.c     // Catch: java.lang.Throwable -> L47
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L47
            r0.f75408a = r7     // Catch: java.lang.Throwable -> L47
            r0.f75410c = r5     // Catch: java.lang.Throwable -> L47
            java.lang.Object r8 = r8.invoke(r9, r0)     // Catch: java.lang.Throwable -> L47
            if (r8 != r1) goto L5f
            goto L78
        L5f:
            r8 = 0
            r0.f75408a = r8
            r0.f75410c = r4
            java.lang.Object r7 = r7.g(r0)
            if (r7 != r1) goto L6b
            goto L78
        L6b:
            yz.g2 r7 = yz.g2.f100423a
            return r7
        L6e:
            r0.f75408a = r7
            r0.f75410c = r3
            java.lang.Object r8 = r8.g(r0)
            if (r8 != r1) goto L79
        L78:
            return r1
        L79:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: nz.d.a(io.ktor.utils.io.m, x00.p, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(@m80.k io.ktor.utils.io.m r10, @m80.k x00.l<? super java.nio.ByteBuffer, java.lang.Boolean> r11, @m80.k j00.c<? super yz.g2> r12) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nz.d.b(io.ktor.utils.io.m, x00.l, j00.c):java.lang.Object");
    }

    public static final Object c(m mVar, x00.l<? super ByteBuffer, Boolean> lVar, j00.c<? super g2> cVar) {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        while (!booleanRef.element) {
            d50.d dVar = d50.d.f47268a;
            y40.b buffer = mVar.i().getBuffer();
            t d02 = buffer.d0(1);
            byte[] b11 = d02.b(false);
            Integer valueOf = Integer.valueOf(d02.d());
            int intValue = Integer.valueOf(b11.length).intValue();
            int intValue2 = valueOf.intValue();
            ByteBuffer wrap = ByteBuffer.wrap(b11, intValue2, intValue - intValue2);
            g0.m(wrap);
            booleanRef.element = !lVar.invoke(wrap).booleanValue();
            int intValue3 = Integer.valueOf(wrap.position() - intValue2).intValue();
            if (intValue3 == 1) {
                d02.I(b11, intValue3);
                d02.x(d02.d() + intValue3);
                buffer.Z(buffer.w() + intValue3);
            } else {
                if (intValue3 < 0 || intValue3 > d02.l()) {
                    throw new IllegalStateException(("Invalid number of bytes written: " + intValue3 + ". Should be in 0.." + d02.l()).toString());
                }
                if (intValue3 != 0) {
                    d02.I(b11, intValue3);
                    d02.x(d02.d() + intValue3);
                    buffer.Z(buffer.w() + intValue3);
                } else if (v.d(d02)) {
                    buffer.U();
                }
            }
            d0.e(0);
            mVar.g(cVar);
            d0.e(1);
        }
        return g2.f100423a;
    }
}
