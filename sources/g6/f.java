package g6;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final m5.c f52993a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final i f52994b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.combo.GetCurComboUC", f = "GetCurComboUC.kt", i = {2}, l = {12, 13, 14}, m = "invoke", n = {"localIncrementCombo"}, s = {"I$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f52995a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f52996b;

        /* renamed from: d, reason: collision with root package name */
        public int f52998d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f52996b = obj;
            this.f52998d |= Integer.MIN_VALUE;
            return f.this.a(this);
        }
    }

    public f(@k m5.c comboRepo, @k i syncComboUC) {
        g0.p(comboRepo, "comboRepo");
        g0.p(syncComboUC, "syncComboUC");
        this.f52993a = comboRepo;
        this.f52994b = syncComboUC;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        if (r8 != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004c, code lost:
    
        if (r8.e(r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@m80.k j00.c<? super java.lang.Integer> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof g6.f.a
            if (r0 == 0) goto L13
            r0 = r8
            g6.f$a r0 = (g6.f.a) r0
            int r1 = r0.f52998d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f52998d = r1
            goto L18
        L13:
            g6.f$a r0 = new g6.f$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f52996b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f52998d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            int r0 = r0.f52995a
            kotlin.e.n(r8)
            goto L70
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            kotlin.e.n(r8)
            goto L5a
        L3d:
            kotlin.e.n(r8)
            goto L4f
        L41:
            kotlin.e.n(r8)
            g6.i r8 = r7.f52994b
            r0.f52998d = r5
            java.lang.Object r8 = r8.e(r0)
            if (r8 != r1) goto L4f
            goto L6c
        L4f:
            m5.c r8 = r7.f52993a
            r0.f52998d = r4
            java.lang.Object r8 = r8.e(r0)
            if (r8 != r1) goto L5a
            goto L6c
        L5a:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            m5.c r2 = r7.f52993a
            r0.f52995a = r8
            r0.f52998d = r3
            java.lang.Object r0 = r2.k(r0)
            if (r0 != r1) goto L6d
        L6c:
            return r1
        L6d:
            r6 = r0
            r0 = r8
            r8 = r6
        L70:
            p8.j r8 = (p8.j) r8
            if (r8 == 0) goto L77
            int r8 = r8.f79940a
            goto L78
        L77:
            r8 = 0
        L78:
            int r0 = r0 + r8
            java.lang.Integer r8 = l00.a.f(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.f.a(j00.c):java.lang.Object");
    }
}
