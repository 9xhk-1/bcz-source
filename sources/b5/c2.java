package b5;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {d5.f.class})
/* loaded from: classes3.dex */
public final class c2 implements d5.f<b2, c1> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final o6.x f5799a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f5800b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final f50.e<b2> f5801c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.unity.command.SyncLearningRecordCommand", f = "SyncBehaviorCommand.kt", i = {0}, l = {26}, m = "execute-9TAhJgM", n = {"$v$c$com-baicizhan-app-biz-game-impl-unity-command-SyncBehaviorReq$-payload$0"}, s = {"L$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f5802a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5803b;

        /* renamed from: d, reason: collision with root package name */
        public int f5805d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f5803b = obj;
            this.f5805d |= Integer.MIN_VALUE;
            return c2.this.d(null, this);
        }
    }

    public c2(@m80.k o6.x processLearningBehaviorUC) {
        kotlin.jvm.internal.g0.p(processLearningBehaviorUC, "processLearningBehaviorUC");
        this.f5799a = processLearningBehaviorUC;
        this.f5800b = "biz.wordsgame.syncbehavior";
        this.f5801c = b2.Companion.serializer();
    }

    @Override // d5.f
    public /* bridge */ /* synthetic */ Object a(b2 b2Var, j00.c<? super c1> cVar) {
        return d(b2Var.h(), cVar);
    }

    @Override // d5.f
    @m80.l
    public f50.e<b2> b() {
        return this.f5801c;
    }

    @Override // d5.f
    @m80.k
    public String c() {
        return this.f5800b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(@m80.k m3.t1 r6, @m80.k j00.c<? super b5.c1> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof b5.c2.a
            if (r0 == 0) goto L13
            r0 = r7
            b5.c2$a r0 = (b5.c2.a) r0
            int r1 = r0.f5805d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5805d = r1
            goto L18
        L13:
            b5.c2$a r0 = new b5.c2$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f5803b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f5805d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f5802a
            m3.t1 r6 = (m3.t1) r6
            kotlin.e.n(r7)
            goto L51
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.e.n(r7)
            o6.x r7 = r5.f5799a
            java.lang.String r2 = r6.g()
            m3.b0 r4 = r6.e()
            java.lang.Object r6 = l00.k.a(r6)
            r0.f5802a = r6
            r0.f5805d = r3
            java.lang.Object r6 = r7.a(r2, r4, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            b5.e1 r6 = b5.e1.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.c2.d(m3.t1, j00.c):java.lang.Object");
    }
}
