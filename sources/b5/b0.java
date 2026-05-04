package b5;

import com.igexin.assist.sdk.AssistPushConsts;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {d5.f.class})
@kotlin.jvm.internal.u0({"SMAP\nGetMembershipInfoCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetMembershipInfoCommand.kt\ncom/baicizhan/app/biz/game/impl/unity/command/GetMembershipInfoCommand\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1#2:65\n*E\n"})
/* loaded from: classes3.dex */
public final class b0 implements d5.f<x0, c1> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final c6.b f5776a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final l6.o f5777b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f5778c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final f50.e<x0> f5779d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.unity.command.GetMembershipInfoCommand", f = "GetMembershipInfoCommand.kt", i = {0}, l = {51}, m = "checkEnergySufficient", n = {"isVip"}, s = {"Z$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public boolean f5780a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5781b;

        /* renamed from: d, reason: collision with root package name */
        public int f5783d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f5781b = obj;
            this.f5783d |= Integer.MIN_VALUE;
            return b0.this.e(false, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.unity.command.GetMembershipInfoCommand", f = "GetMembershipInfoCommand.kt", i = {0, 1, 1}, l = {31, 32}, m = "execute", n = {AssistPushConsts.MSG_TYPE_PAYLOAD, AssistPushConsts.MSG_TYPE_PAYLOAD, "vipModel"}, s = {"L$0", "L$0", "L$1"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f5784a;

        /* renamed from: b, reason: collision with root package name */
        public Object f5785b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f5786c;

        /* renamed from: e, reason: collision with root package name */
        public int f5788e;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f5786c = obj;
            this.f5788e |= Integer.MIN_VALUE;
            return b0.this.a(null, this);
        }
    }

    public b0(@m80.k c6.b userGameInfoRepo, @m80.k l6.o getEnergyUC) {
        kotlin.jvm.internal.g0.p(userGameInfoRepo, "userGameInfoRepo");
        kotlin.jvm.internal.g0.p(getEnergyUC, "getEnergyUC");
        this.f5776a = userGameInfoRepo;
        this.f5777b = getEnergyUC;
        this.f5778c = "biz.wordsgame.getmembershipinfo";
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // d5.f
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k b5.x0 r7, @m80.k j00.c<? super b5.c1> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof b5.b0.b
            if (r0 == 0) goto L13
            r0 = r8
            b5.b0$b r0 = (b5.b0.b) r0
            int r1 = r0.f5788e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5788e = r1
            goto L18
        L13:
            b5.b0$b r0 = new b5.b0$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f5786c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f5788e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.f5785b
            h5.y r7 = (h5.y) r7
            java.lang.Object r0 = r0.f5784a
            b5.x0 r0 = (b5.x0) r0
            kotlin.e.n(r8)
            goto L72
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            java.lang.Object r7 = r0.f5784a
            b5.x0 r7 = (b5.x0) r7
            kotlin.e.n(r8)
            goto L58
        L44:
            kotlin.e.n(r8)
            c6.b r8 = r6.f5776a
            java.lang.Object r2 = l00.k.a(r7)
            r0.f5784a = r2
            r0.f5788e = r4
            java.lang.Object r8 = r8.r(r0)
            if (r8 != r1) goto L58
            goto L6e
        L58:
            h5.y r8 = (h5.y) r8
            boolean r2 = com.baicizhan.app.biz.game.model.a.d(r8)
            java.lang.Object r7 = l00.k.a(r7)
            r0.f5784a = r7
            r0.f5785b = r8
            r0.f5788e = r3
            java.lang.Object r7 = r6.e(r2, r0)
            if (r7 != r1) goto L6f
        L6e:
            return r1
        L6f:
            r5 = r8
            r8 = r7
            r7 = r5
        L72:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            m3.i0 r0 = new m3.i0
            boolean r1 = com.baicizhan.app.biz.game.model.a.d(r7)
            if (r1 == 0) goto L85
            int r1 = r7.g()
            goto L8b
        L85:
            com.baicizhan.app.biz.game.model.MembershipLevel r1 = com.baicizhan.app.biz.game.model.MembershipLevel.Free
            int r1 = r1.getValue()
        L8b:
            long r2 = r7.e()
            r0.<init>(r1, r8, r2)
            m3.i0 r7 = b5.c0.b(r0)
            b5.c0 r7 = b5.c0.a(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.b0.a(b5.x0, j00.c):java.lang.Object");
    }

    @Override // d5.f
    @m80.l
    public f50.e<x0> b() {
        return this.f5779d;
    }

    @Override // d5.f
    @m80.k
    public String c() {
        return this.f5778c;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(boolean r5, j00.c<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof b5.b0.a
            if (r0 == 0) goto L13
            r0 = r6
            b5.b0$a r0 = (b5.b0.a) r0
            int r1 = r0.f5783d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5783d = r1
            goto L18
        L13:
            b5.b0$a r0 = new b5.b0$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f5781b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f5783d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r6)
            goto L4a
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.e.n(r6)
            if (r5 == 0) goto L3b
            java.lang.Boolean r5 = l00.a.a(r3)
            return r5
        L3b:
            l6.o r6 = r4.f5777b
            com.baicizhan.app.biz.game.repo.userresource.LanguageType r2 = com.baicizhan.app.biz.game.repo.userresource.LanguageType.En
            r0.f5780a = r5
            r0.f5783d = r3
            java.lang.Object r6 = r6.e(r2, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            h5.g r6 = (h5.g) r6
            boolean r5 = r4.f(r6)
            if (r5 != 0) goto L5a
            boolean r5 = r4.g(r6)
            if (r5 == 0) goto L59
            goto L5a
        L59:
            r3 = 0
        L5a:
            java.lang.Boolean r5 = l00.a.a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.b0.e(boolean, j00.c):java.lang.Object");
    }

    public final boolean f(h5.g gVar) {
        h5.x h11 = gVar.h();
        return h11 != null && h11.h() >= 1;
    }

    public final boolean g(h5.g gVar) {
        h5.v0 j11 = gVar.j();
        return j11 != null && j11.d() > w3.g.n();
    }
}
