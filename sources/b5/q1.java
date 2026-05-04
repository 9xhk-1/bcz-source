package b5;

import com.igexin.assist.sdk.AssistPushConsts;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {d5.f.class})
/* loaded from: classes3.dex */
public final class q1 implements d5.f<e, e1> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.sentence.n f6015a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f6016b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final f50.e<e> f6017c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.unity.command.SentenceSwitchUnitCommand", f = "SentenceSwitchCommand.kt", i = {0}, l = {29}, m = "execute", n = {AssistPushConsts.MSG_TYPE_PAYLOAD}, s = {"L$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f6018a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f6019b;

        /* renamed from: d, reason: collision with root package name */
        public int f6021d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f6019b = obj;
            this.f6021d |= Integer.MIN_VALUE;
            return q1.this.a(null, this);
        }
    }

    public q1(@m80.k com.baicizhan.app.biz.game.uc.sentence.n switchSentenceUnitUC) {
        kotlin.jvm.internal.g0.p(switchSentenceUnitUC, "switchSentenceUnitUC");
        this.f6015a = switchSentenceUnitUC;
        this.f6016b = "biz.sentencegame.switchunit";
        this.f6017c = e.Companion.serializer();
    }

    @Override // d5.f
    @m80.l
    public f50.e<e> b() {
        return this.f6017c;
    }

    @Override // d5.f
    @m80.k
    public String c() {
        return this.f6016b;
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
    public java.lang.Object a(@m80.k b5.e r6, @m80.k j00.c<? super b5.e1> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof b5.q1.a
            if (r0 == 0) goto L13
            r0 = r7
            b5.q1$a r0 = (b5.q1.a) r0
            int r1 = r0.f6021d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6021d = r1
            goto L18
        L13:
            b5.q1$a r0 = new b5.q1$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f6019b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f6021d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f6018a
            b5.e r6 = (b5.e) r6
            kotlin.e.n(r7)
            goto L51
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.e.n(r7)
            com.baicizhan.app.biz.game.uc.sentence.n r7 = r5.f6015a
            int r2 = r6.e()
            int r4 = r6.g()
            java.lang.Object r6 = l00.k.a(r6)
            r0.f6018a = r6
            r0.f6021d = r3
            java.lang.Object r6 = r7.a(r2, r4, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            b5.e1 r6 = b5.e1.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.q1.a(b5.e, j00.c):java.lang.Object");
    }
}
