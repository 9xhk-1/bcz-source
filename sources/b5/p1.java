package b5;

import com.igexin.assist.sdk.AssistPushConsts;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {d5.f.class})
/* loaded from: classes3.dex */
public final class p1 implements d5.f<e, e1> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.sentence.l f5999a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f6000b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final f50.e<e> f6001c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.unity.command.SentenceSwitchSkuCommand", f = "SentenceSwitchCommand.kt", i = {0}, l = {43}, m = "execute", n = {AssistPushConsts.MSG_TYPE_PAYLOAD}, s = {"L$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f6002a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f6003b;

        /* renamed from: d, reason: collision with root package name */
        public int f6005d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f6003b = obj;
            this.f6005d |= Integer.MIN_VALUE;
            return p1.this.a(null, this);
        }
    }

    public p1(@m80.k com.baicizhan.app.biz.game.uc.sentence.l switchSentenceSkuUC) {
        kotlin.jvm.internal.g0.p(switchSentenceSkuUC, "switchSentenceSkuUC");
        this.f5999a = switchSentenceSkuUC;
        this.f6000b = "biz.sentencegame.switchsku";
        this.f6001c = e.Companion.serializer();
    }

    @Override // d5.f
    @m80.l
    public f50.e<e> b() {
        return this.f6001c;
    }

    @Override // d5.f
    @m80.k
    public String c() {
        return this.f6000b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // d5.f
    @m80.l
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k b5.e r5, @m80.k j00.c<? super b5.e1> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof b5.p1.a
            if (r0 == 0) goto L13
            r0 = r6
            b5.p1$a r0 = (b5.p1.a) r0
            int r1 = r0.f6005d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6005d = r1
            goto L18
        L13:
            b5.p1$a r0 = new b5.p1$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f6003b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f6005d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f6002a
            b5.e r5 = (b5.e) r5
            kotlin.e.n(r6)
            goto L4d
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.e.n(r6)
            com.baicizhan.app.biz.game.uc.sentence.l r6 = r4.f5999a
            int r2 = r5.e()
            java.lang.Object r5 = l00.k.a(r5)
            r0.f6002a = r5
            r0.f6005d = r3
            java.lang.Object r5 = r6.b(r2, r0)
            if (r5 != r1) goto L4d
            return r1
        L4d:
            b5.e1 r5 = b5.e1.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.p1.a(b5.e, j00.c):java.lang.Object");
    }
}
