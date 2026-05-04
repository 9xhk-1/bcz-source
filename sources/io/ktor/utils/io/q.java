package io.ktor.utils.io;

import c40.l2;
import c40.r0;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nByteWriteChannelOperations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteWriteChannelOperations.kt\nio/ktor/utils/io/ByteWriteChannelOperationsKt\n+ 2 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n*L\n1#1,204:1\n195#2,28:205\n*S KotlinDebug\n*F\n+ 1 ByteWriteChannelOperations.kt\nio/ktor/utils/io/ByteWriteChannelOperationsKt\n*L\n183#1:205,28\n*E\n"})
/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f62288a = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class b extends FunctionReferenceImpl implements x00.l<j00.c<? super g2>, Object>, l00.l {
        public b(Object obj) {
            super(1, obj, m.class, "flushAndClose", "flushAndClose(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(j00.c<? super g2> cVar) {
            return ((m) this.receiver).j(cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.ByteWriteChannelOperationsKt", f = "ByteWriteChannelOperations.kt", i = {0}, l = {186}, m = "write", n = {"written"}, s = {"I$0"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f62290a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f62291b;

        /* renamed from: c, reason: collision with root package name */
        public int f62292c;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62291b = obj;
            this.f62292c |= Integer.MIN_VALUE;
            return q.m(null, 0, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.ByteWriteChannelOperationsKt$writer$job$1", f = "ByteWriteChannelOperations.kt", i = {0, 0, 1, 3, 5}, l = {143, 153, 154, 153, 154, 153, 154}, m = "invokeSuspend", n = {"$this$launch", "nested", "$this$launch", "$this$launch", "$this$launch"}, s = {"L$0", "L$1", "L$0", "L$0", "L$0"})
    @u0({"SMAP\nByteWriteChannelOperations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteWriteChannelOperations.kt\nio/ktor/utils/io/ByteWriteChannelOperationsKt$writer$job$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n1#2:205\n*E\n"})
    public static final class d extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f62293a;

        /* renamed from: b, reason: collision with root package name */
        public int f62294b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f62295c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x00.p<m0, j00.c<? super g2>, Object> f62296d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.b f62297e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(x00.p<? super m0, ? super j00.c<? super g2>, ? extends Object> pVar, io.ktor.utils.io.b bVar, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f62296d = pVar;
            this.f62297e = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            d dVar = new d(this.f62296d, this.f62297e, cVar);
            dVar.f62295c = obj;
            return dVar;
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:51:0x00ba, code lost:
        
            if (r1.K0(r8) != r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00f3, code lost:
        
            if (r1.K0(r8) != r0) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0118, code lost:
        
            if (r1.K0(r8) != r0) goto L59;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:48:0x009e A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #1 {all -> 0x0056, blocks: (B:45:0x0052, B:46:0x008d, B:48:0x009e, B:53:0x006d), top: B:2:0x0007 }] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [c40.l2] */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v21 */
        /* JADX WARN: Type inference failed for: r1v9, types: [c40.a0, c40.l2] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instructions count: 342
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.q.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @m80.l
    public static final Object A(@m80.k m mVar, @m80.k String str, @m80.k j00.c<? super g2> cVar) {
        jz.s.p(mVar.i(), str, 0, 0, null, 14, null);
        Object d11 = n.d(mVar, cVar);
        return d11 == kotlin.coroutines.intrinsics.b.l() ? d11 : g2.f100423a;
    }

    @m80.k
    public static final l0 B(@m80.k r0 r0Var, @m80.k kotlin.coroutines.d coroutineContext, @m80.k final io.ktor.utils.io.b channel, @m80.k x00.p<? super m0, ? super j00.c<? super g2>, ? extends Object> block) {
        l2 f11;
        kotlin.jvm.internal.g0.p(r0Var, "<this>");
        kotlin.jvm.internal.g0.p(coroutineContext, "coroutineContext");
        kotlin.jvm.internal.g0.p(channel, "channel");
        kotlin.jvm.internal.g0.p(block, "block");
        f11 = c40.k.f(r0Var, coroutineContext, null, new d(block, channel, null), 2, null);
        f11.z0(new x00.l() { // from class: io.ktor.utils.io.o
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 F;
                F = q.F(b.this, (Throwable) obj);
                return F;
            }
        });
        return new l0(channel, f11);
    }

    @m80.k
    public static final l0 C(@m80.k r0 r0Var, @m80.k kotlin.coroutines.d coroutineContext, boolean z11, @m80.k x00.p<? super m0, ? super j00.c<? super g2>, ? extends Object> block) {
        kotlin.jvm.internal.g0.p(r0Var, "<this>");
        kotlin.jvm.internal.g0.p(coroutineContext, "coroutineContext");
        kotlin.jvm.internal.g0.p(block, "block");
        return B(r0Var, coroutineContext, new io.ktor.utils.io.b(false, 1, null), block);
    }

    public static /* synthetic */ l0 D(r0 r0Var, kotlin.coroutines.d dVar, io.ktor.utils.io.b bVar, x00.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        return B(r0Var, dVar, bVar, pVar);
    }

    public static /* synthetic */ l0 E(r0 r0Var, kotlin.coroutines.d dVar, boolean z11, x00.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return C(r0Var, dVar, z11, pVar);
    }

    public static final g2 F(io.ktor.utils.io.b bVar, Throwable th2) {
        if (th2 != null && !bVar.h()) {
            bVar.a(th2);
        }
        return g2.f100423a;
    }

    @m80.l
    public static final Object c(@m80.k m mVar, @m80.k j00.c<? super g2> cVar) {
        Object g11 = mVar.g(cVar);
        return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
    }

    public static final void d(@m80.k s sVar) {
        kotlin.jvm.internal.g0.p(sVar, "<this>");
        l2.a.b(sVar.a(), null, 1, null);
    }

    public static final void e(@m80.k m mVar, @m80.l Throwable th2) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        if (th2 == null) {
            f(new b(mVar));
        } else {
            mVar.a(th2);
        }
    }

    public static final <R> void f(@m80.k x00.l<? super j00.c<? super R>, ? extends Object> lVar) {
        kotlin.jvm.internal.g0.p(lVar, "<this>");
        i40.a.d(lVar, f62288a);
    }

    @m80.k
    public static final CancellationException g(@m80.k s sVar) {
        kotlin.jvm.internal.g0.p(sVar, "<this>");
        return sVar.a().y0();
    }

    public static final void h(@m80.k s sVar, @m80.k final x00.a<g2> block) {
        kotlin.jvm.internal.g0.p(sVar, "<this>");
        kotlin.jvm.internal.g0.p(block, "block");
        sVar.a().z0(new x00.l() { // from class: io.ktor.utils.io.p
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 i11;
                i11 = q.i(x00.a.this, (Throwable) obj);
                return i11;
            }
        });
    }

    public static final g2 i(x00.a aVar, Throwable th2) {
        aVar.invoke();
        return g2.f100423a;
    }

    public static final boolean j(@m80.k s sVar) {
        kotlin.jvm.internal.g0.p(sVar, "<this>");
        return sVar.a().isCancelled();
    }

    public static final boolean k(@m80.k s sVar) {
        kotlin.jvm.internal.g0.p(sVar, "<this>");
        return sVar.a().e();
    }

    @m80.l
    public static final Object l(@m80.k s sVar, @m80.k j00.c<? super g2> cVar) {
        Object K0 = sVar.a().K0(cVar);
        return K0 == kotlin.coroutines.intrinsics.b.l() ? K0 : g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(@m80.k io.ktor.utils.io.m r8, int r9, @m80.k x00.q<? super byte[], ? super java.lang.Integer, ? super java.lang.Integer, java.lang.Integer> r10, @m80.k j00.c<? super java.lang.Integer> r11) {
        /*
            boolean r0 = r11 instanceof io.ktor.utils.io.q.c
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.utils.io.q$c r0 = (io.ktor.utils.io.q.c) r0
            int r1 = r0.f62292c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62292c = r1
            goto L18
        L13:
            io.ktor.utils.io.q$c r0 = new io.ktor.utils.io.q$c
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f62291b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f62292c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            int r8 = r0.f62290a
            kotlin.e.n(r11)
            goto Lbd
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            kotlin.e.n(r11)
            y40.x r11 = r8.i()
            int r11 = jz.h.f(r11)
            d50.d r2 = d50.d.f47268a
            y40.x r2 = r8.i()
            y40.b r2 = r2.getBuffer()
            y40.t r4 = r2.d0(r9)
            r5 = 0
            byte[] r5 = r4.b(r5)
            int r6 = r4.d()
            java.lang.Integer r6 = l00.a.f(r6)
            int r7 = r5.length
            java.lang.Integer r7 = l00.a.f(r7)
            java.lang.Object r10 = r10.invoke(r5, r6, r7)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            if (r10 != r9) goto L80
            r4.I(r5, r10)
            int r9 = r4.d()
            int r9 = r9 + r10
            r4.x(r9)
            long r4 = r2.w()
            long r9 = (long) r10
            long r4 = r4 + r9
            r2.Z(r4)
            goto La8
        L80:
            if (r10 < 0) goto Lc2
            int r9 = r4.l()
            if (r10 > r9) goto Lc2
            if (r10 == 0) goto L9f
            r4.I(r5, r10)
            int r9 = r4.d()
            int r9 = r9 + r10
            r4.x(r9)
            long r4 = r2.w()
            long r9 = (long) r10
            long r4 = r4 + r9
            r2.Z(r4)
            goto La8
        L9f:
            boolean r9 = y40.v.d(r4)
            if (r9 == 0) goto La8
            r2.U()
        La8:
            y40.x r9 = r8.i()
            int r9 = jz.h.f(r9)
            int r9 = r9 - r11
            r0.f62290a = r9
            r0.f62292c = r3
            java.lang.Object r8 = io.ktor.utils.io.n.d(r8, r0)
            if (r8 != r1) goto Lbc
            return r1
        Lbc:
            r8 = r9
        Lbd:
            java.lang.Integer r8 = l00.a.f(r8)
            return r8
        Lc2:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Invalid number of bytes written: "
            r8.append(r9)
            r8.append(r10)
            java.lang.String r9 = ". Should be in 0.."
            r8.append(r9)
            int r9 = r4.l()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.q.m(io.ktor.utils.io.m, int, x00.q, j00.c):java.lang.Object");
    }

    public static /* synthetic */ Object n(m mVar, int i11, x00.q qVar, j00.c cVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 1;
        }
        return m(mVar, i11, qVar, cVar);
    }

    @m80.l
    public static final Object o(@m80.k m mVar, @m80.k y40.c0 c0Var, @m80.k j00.c<? super g2> cVar) {
        mVar.i().T(c0Var);
        Object d11 = n.d(mVar, cVar);
        return d11 == kotlin.coroutines.intrinsics.b.l() ? d11 : g2.f100423a;
    }

    @m80.l
    public static final Object p(@m80.k m mVar, byte b11, @m80.k j00.c<? super g2> cVar) {
        mVar.i().u(b11);
        Object d11 = n.d(mVar, cVar);
        return d11 == kotlin.coroutines.intrinsics.b.l() ? d11 : g2.f100423a;
    }

    @m80.l
    public static final Object q(@m80.k m mVar, @m80.k byte[] bArr, @m80.k j00.c<? super g2> cVar) {
        y40.x.p8(mVar.i(), bArr, 0, 0, 6, null);
        Object d11 = n.d(mVar, cVar);
        return d11 == kotlin.coroutines.intrinsics.b.l() ? d11 : g2.f100423a;
    }

    @m80.l
    public static final Object r(@m80.k m mVar, @m80.k byte[] bArr, int i11, int i12, @m80.k j00.c<? super g2> cVar) {
        mVar.i().write(bArr, i11, i12);
        Object d11 = n.d(mVar, cVar);
        return d11 == kotlin.coroutines.intrinsics.b.l() ? d11 : g2.f100423a;
    }

    public static /* synthetic */ Object s(m mVar, byte[] bArr, int i11, int i12, j00.c cVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = bArr.length;
        }
        return r(mVar, bArr, i11, i12, cVar);
    }

    @m80.l
    public static final Object t(@m80.k m mVar, int i11, @m80.k j00.c<? super g2> cVar) {
        mVar.i().writeInt(i11);
        Object d11 = n.d(mVar, cVar);
        return d11 == kotlin.coroutines.intrinsics.b.l() ? d11 : g2.f100423a;
    }

    @m80.l
    public static final Object u(@m80.k m mVar, long j11, @m80.k j00.c<? super g2> cVar) {
        mVar.i().writeLong(j11);
        Object d11 = n.d(mVar, cVar);
        return d11 == kotlin.coroutines.intrinsics.b.l() ? d11 : g2.f100423a;
    }

    @m80.l
    public static final Object v(@m80.k m mVar, @m80.k y40.b bVar, @m80.k j00.c<? super g2> cVar) {
        mVar.i().T(bVar);
        Object d11 = n.d(mVar, cVar);
        return d11 == kotlin.coroutines.intrinsics.b.l() ? d11 : g2.f100423a;
    }

    @m80.l
    public static final Object w(@m80.k m mVar, @m80.k y40.c0 c0Var, @m80.k j00.c<? super g2> cVar) {
        mVar.i().T(c0Var);
        Object d11 = n.d(mVar, cVar);
        return d11 == kotlin.coroutines.intrinsics.b.l() ? d11 : g2.f100423a;
    }

    @m80.l
    public static final Object x(@m80.k m mVar, short s11, @m80.k j00.c<? super g2> cVar) {
        mVar.i().writeShort(s11);
        Object d11 = n.d(mVar, cVar);
        return d11 == kotlin.coroutines.intrinsics.b.l() ? d11 : g2.f100423a;
    }

    @m80.l
    public static final Object y(@m80.k m mVar, @m80.k y40.c0 c0Var, @m80.k j00.c<? super g2> cVar) {
        mVar.i().T(c0Var);
        Object d11 = n.d(mVar, cVar);
        return d11 == kotlin.coroutines.intrinsics.b.l() ? d11 : g2.f100423a;
    }

    @m80.l
    public static final Object z(@m80.k m mVar, @m80.k String str, @m80.k j00.c<? super g2> cVar) {
        jz.s.p(mVar.i(), str, 0, 0, null, 14, null);
        Object d11 = n.d(mVar, cVar);
        return d11 == kotlin.coroutines.intrinsics.b.l() ? d11 : g2.f100423a;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements j00.c<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final kotlin.coroutines.d f62289a = EmptyCoroutineContext.INSTANCE;

        @Override // j00.c
        public kotlin.coroutines.d getContext() {
            return this.f62289a;
        }

        @Override // j00.c
        public void resumeWith(Object obj) {
        }
    }
}
