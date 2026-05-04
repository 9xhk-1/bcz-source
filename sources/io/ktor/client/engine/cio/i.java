package io.ktor.client.engine.cio;

import com.baicizhan.main.activity.schedule_v2.IdentityInfoActivity;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import tx.p0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final sx.g f60876a;

    /* renamed from: b, reason: collision with root package name */
    public final int f60877b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final n40.h f60878c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final zy.d<tx.a0, n40.h> f60879d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.engine.cio.ConnectionFactory", f = "ConnectionFactory.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2}, l = {24, 27, 30}, m = "connect", n = {"this", "address", IdentityInfoActivity.f18944g, "this", "address", IdentityInfoActivity.f18944g, "addressSemaphore", "this", "addressSemaphore"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f60880a;

        /* renamed from: b, reason: collision with root package name */
        public Object f60881b;

        /* renamed from: c, reason: collision with root package name */
        public Object f60882c;

        /* renamed from: d, reason: collision with root package name */
        public Object f60883d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f60884e;

        /* renamed from: g, reason: collision with root package name */
        public int f60886g;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f60884e = obj;
            this.f60886g |= Integer.MIN_VALUE;
            return i.this.c(null, null, this);
        }
    }

    public i(@m80.k sx.g selector, int i11, int i12) {
        g0.p(selector, "selector");
        this.f60876a = selector;
        this.f60877b = i12;
        this.f60878c = n40.l.b(i11, 0, 2, null);
        this.f60879d = new zy.d<>(0, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object d(i iVar, tx.a0 a0Var, x00.l lVar, j00.c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = new x00.l() { // from class: io.ktor.client.engine.cio.g
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 e11;
                    e11 = i.e((p0.e) obj2);
                    return e11;
                }
            };
        }
        return iVar.c(a0Var, lVar, cVar);
    }

    public static final g2 e(p0.e eVar) {
        g0.p(eVar, "<this>");
        return g2.f100423a;
    }

    public static final n40.h f(i iVar) {
        return n40.l.b(iVar.f60877b, 0, 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00be, code lost:
    
        if (r10 != r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, tx.a0] */
    /* JADX WARN: Type inference failed for: r8v1, types: [n40.h] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, x00.l<? super tx.p0$e, yz.g2>] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v6 */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@m80.k tx.a0 r8, @m80.k x00.l<? super tx.p0.e, yz.g2> r9, @m80.k j00.c<? super tx.k0> r10) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.i.c(tx.a0, x00.l, j00.c):java.lang.Object");
    }

    public final void g(@m80.k tx.a0 address) {
        g0.p(address, "address");
        n40.h hVar = this.f60879d.get(address);
        g0.m(hVar);
        hVar.release();
        this.f60878c.release();
    }
}
