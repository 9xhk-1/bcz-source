package j;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTransacter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transacter.kt\napp/cash/sqldelight/SuspendingTransacterImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,423:1\n1#2:424\n*E\n"})
/* loaded from: classes3.dex */
public abstract class p extends c implements o {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "app.cash.sqldelight.SuspendingTransacterImpl", f = "Transacter.kt", i = {0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4}, l = {403, 413, 418, 418, 418}, m = "transactionWithWrapper", n = {"wrapperBody", "noEnclosing", "wrapperBody", "transaction", "enclosing", "noEnclosing", "wrapperBody", "transaction", "enclosing", "returnValue", "noEnclosing", "wrapperBody", "transaction", "enclosing", "thrownException", "returnValue", "noEnclosing", "wrapperBody", "transaction", "enclosing", "returnValue", "noEnclosing"}, s = {"L$0", "Z$0", "L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "L$0", "L$1", "L$2", "L$3", "Z$0"}, v = 1)
    public static final class a<R> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public boolean f63080a;

        /* renamed from: b, reason: collision with root package name */
        public Object f63081b;

        /* renamed from: c, reason: collision with root package name */
        public Object f63082c;

        /* renamed from: d, reason: collision with root package name */
        public Object f63083d;

        /* renamed from: e, reason: collision with root package name */
        public Object f63084e;

        /* renamed from: f, reason: collision with root package name */
        public Object f63085f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f63086g;

        /* renamed from: i, reason: collision with root package name */
        public int f63088i;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f63086g = obj;
            this.f63088i |= Integer.MIN_VALUE;
            return p.this.K(false, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(@m80.k l.e driver) {
        super(driver);
        g0.p(driver, "driver");
    }

    public static /* synthetic */ Object I(p pVar, boolean z11, x00.p<? super r, ? super j00.c<? super g2>, ? extends Object> pVar2, j00.c<? super g2> cVar) {
        Object K = pVar.K(z11, pVar2, cVar);
        return K == kotlin.coroutines.intrinsics.b.l() ? K : g2.f100423a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(5:5|6|(1:(1:(1:(1:(2:12|(2:14|15)(2:17|18))(3:19|20|21))(3:22|23|24))(8:25|26|27|28|29|30|(3:32|23|24)|33))(1:44))(1:57)|45|(4:50|51|(5:53|28|29|30|(0))|33)(2:48|49)))|59|6|(0)(0)|45|(0)|50|51|(0)|33|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0117, code lost:
    
        r4 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0118, code lost:
    
        r5 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b3, code lost:
    
        if (r14 == r1) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <R> java.lang.Object K(boolean r12, x00.p<? super j.s<R>, ? super j00.c<? super R>, ? extends java.lang.Object> r13, j00.c<? super R> r14) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.p.K(boolean, x00.p, j00.c):java.lang.Object");
    }

    @Override // j.o
    @m80.l
    public Object a(boolean z11, @m80.k x00.p<? super r, ? super j00.c<? super g2>, ? extends Object> pVar, @m80.k j00.c<? super g2> cVar) {
        return I(this, z11, pVar, cVar);
    }

    @Override // j.o
    @m80.l
    public <R> Object s(boolean z11, @m80.k x00.p<? super q<R>, ? super j00.c<? super R>, ? extends Object> pVar, @m80.k j00.c<? super R> cVar) {
        return K(z11, pVar, cVar);
    }
}
