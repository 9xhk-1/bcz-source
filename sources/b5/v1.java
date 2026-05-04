package b5;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {d5.f.class})
@kotlin.jvm.internal.u0({"SMAP\nSubmitGameCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubmitGameCommand.kt\ncom/baicizhan/app/biz/game/impl/unity/command/SubmitGameCommand\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,115:1\n1#2:116\n*E\n"})
/* loaded from: classes3.dex */
public final class v1 implements d5.f<x1, c1> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final o6.a f6072a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final o6.t f6073b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f6074c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final f50.e<x1> f6075d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.unity.command.SubmitGameCommand", f = "SubmitGameCommand.kt", i = {0, 1}, l = {41, 54}, m = "execute-gRx_6Ys", n = {"$v$c$com-baicizhan-app-biz-game-impl-unity-command-SubmitGameReq$-payload$0", "$v$c$com-baicizhan-app-biz-game-impl-unity-command-SubmitGameReq$-payload$0"}, s = {"L$0", "L$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f6076a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f6077b;

        /* renamed from: d, reason: collision with root package name */
        public int f6079d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f6077b = obj;
            this.f6079d |= Integer.MIN_VALUE;
            return v1.this.d(null, this);
        }
    }

    public v1(@m80.k o6.a commitGameUC, @m80.k o6.t giveUpUC) {
        kotlin.jvm.internal.g0.p(commitGameUC, "commitGameUC");
        kotlin.jvm.internal.g0.p(giveUpUC, "giveUpUC");
        this.f6072a = commitGameUC;
        this.f6073b = giveUpUC;
        this.f6074c = "biz.wordsgame.submitgame";
        this.f6075d = x1.Companion.serializer();
    }

    @Override // d5.f
    public /* bridge */ /* synthetic */ Object a(x1 x1Var, j00.c<? super c1> cVar) {
        return d(x1Var.h(), cVar);
    }

    @Override // d5.f
    @m80.k
    public f50.e<x1> b() {
        return this.f6075d;
    }

    @Override // d5.f
    @m80.k
    public String c() {
        return this.f6074c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0061, code lost:
    
        if (r1.b(r3, r9) == r2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a2, code lost:
    
        if (r1 == r2) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(@m80.k m3.n1 r20, @m80.k j00.c<? super b5.c1> r21) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.v1.d(m3.n1, j00.c):java.lang.Object");
    }
}
