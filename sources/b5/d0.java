package b5;

import com.igexin.assist.sdk.AssistPushConsts;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {d5.f.class})
/* loaded from: classes3.dex */
public final class d0 implements d5.f<x0, h1> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.monetization.k f5809a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f5810b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final f50.e<x0> f5811c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.unity.command.GetRechargeInfoCommand", f = "GetRechargeInfoCommand.kt", i = {0}, l = {28}, m = "execute-Z04Amp4", n = {AssistPushConsts.MSG_TYPE_PAYLOAD}, s = {"L$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f5812a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5813b;

        /* renamed from: d, reason: collision with root package name */
        public int f5815d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f5813b = obj;
            this.f5815d |= Integer.MIN_VALUE;
            return d0.this.a(null, this);
        }
    }

    public d0(@m80.k com.baicizhan.app.biz.game.uc.monetization.k getRechargeInfoUC) {
        kotlin.jvm.internal.g0.p(getRechargeInfoUC, "getRechargeInfoUC");
        this.f5809a = getRechargeInfoUC;
        this.f5810b = "biz.wordsgame.getrechargeinfo";
    }

    @Override // d5.f
    @m80.l
    public f50.e<x0> b() {
        return this.f5811c;
    }

    @Override // d5.f
    @m80.k
    public String c() {
        return this.f5810b;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // d5.f
    @m80.l
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k b5.x0 r5, @m80.k j00.c<? super b5.h1> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof b5.d0.a
            if (r0 == 0) goto L13
            r0 = r6
            b5.d0$a r0 = (b5.d0.a) r0
            int r1 = r0.f5815d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5815d = r1
            goto L18
        L13:
            b5.d0$a r0 = new b5.d0$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f5813b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f5815d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f5812a
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
            com.baicizhan.app.biz.game.uc.monetization.k r6 = r4.f5809a
            java.lang.Object r5 = l00.k.a(r5)
            r0.f5812a = r5
            r0.f5815d = r3
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            kotlin.Triple r6 = (kotlin.Triple) r6
            java.lang.Object r5 = r6.component1()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.Object r0 = r6.component2()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            java.lang.Object r6 = r6.component3()
            u8.l r6 = (u8.l) r6
            int r0 = (int) r0
            if (r6 == 0) goto L6f
            u8.g r1 = r6.f91979d
            if (r1 == 0) goto L6f
            int r1 = r1.f91936a
            goto L71
        L6f:
            r1 = 100
        L71:
            if (r6 == 0) goto L7c
            u8.f r6 = r6.f91976a
            if (r6 == 0) goto L7c
            m3.h0 r6 = e5.a.o(r6)
            goto L7d
        L7c:
            r6 = 0
        L7d:
            m3.o0 r2 = new m3.o0
            r2.<init>(r0, r5, r1, r6)
            m3.o0 r5 = b5.h1.b(r2)
            b5.h1 r5 = b5.h1.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.d0.a(b5.x0, j00.c):java.lang.Object");
    }
}
