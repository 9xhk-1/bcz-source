package b5;

import com.baicizhan.app.biz.game.uc.abtest.GetABTestUC;
import com.igexin.assist.sdk.AssistPushConsts;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {d5.f.class})
/* loaded from: classes3.dex */
public final class t implements d5.f<x0, c1> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final GetABTestUC f6047a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f6048b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final f50.e<x0> f6049c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.unity.command.GetABTestConfigCommand", f = "GetABTestConfigCommand.kt", i = {0}, l = {32}, m = "execute", n = {AssistPushConsts.MSG_TYPE_PAYLOAD}, s = {"L$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f6050a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f6051b;

        /* renamed from: d, reason: collision with root package name */
        public int f6053d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f6051b = obj;
            this.f6053d |= Integer.MIN_VALUE;
            return t.this.a(null, this);
        }
    }

    public t(@m80.k GetABTestUC getABTestUC) {
        kotlin.jvm.internal.g0.p(getABTestUC, "getABTestUC");
        this.f6047a = getABTestUC;
        this.f6048b = "biz.wordsgame.getabtestconfig";
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // d5.f
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k b5.x0 r5, @m80.k j00.c<? super b5.c1> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof b5.t.a
            if (r0 == 0) goto L13
            r0 = r6
            b5.t$a r0 = (b5.t.a) r0
            int r1 = r0.f6053d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6053d = r1
            goto L18
        L13:
            b5.t$a r0 = new b5.t$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f6051b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f6053d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f6050a
            b5.x0 r5 = (b5.x0) r5
            kotlin.e.n(r6)
            goto L49
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.e.n(r6)
            com.baicizhan.app.biz.game.uc.abtest.GetABTestUC r6 = r4.f6047a
            java.lang.Object r5 = l00.k.a(r5)
            r0.f6050a = r5
            r0.f6053d = r3
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            java.util.Map r6 = (java.util.Map) r6
            java.util.Map r5 = b5.v.e(r6)
            b5.v r5 = b5.v.d(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.t.a(b5.x0, j00.c):java.lang.Object");
    }

    @Override // d5.f
    @m80.l
    public f50.e<x0> b() {
        return this.f6049c;
    }

    @Override // d5.f
    @m80.k
    public String c() {
        return this.f6048b;
    }
}
