package n6;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nGetWordsSettingUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetWordsSettingUC.kt\ncom/baicizhan/app/biz/game/uc/settings/GetCurrentModeSpellSetting\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,160:1\n1#2:161\n*E\n"})
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final y5.a f74476a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.book.b f74477b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.settings.GetCurrentModeSpellSetting", f = "GetWordsSettingUC.kt", i = {0, 1, 1, 2, 2, 2, 2}, l = {62, 63, 65}, m = "invoke", n = {"bookId", "modeList", "bookId", "modeList", "settings", "bookId", "mode"}, s = {"J$0", "L$0", "J$0", "L$0", "L$1", "J$0", "I$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f74478a;

        /* renamed from: b, reason: collision with root package name */
        public Object f74479b;

        /* renamed from: c, reason: collision with root package name */
        public Object f74480c;

        /* renamed from: d, reason: collision with root package name */
        public int f74481d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f74482e;

        /* renamed from: g, reason: collision with root package name */
        public int f74484g;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f74482e = obj;
            this.f74484g |= Integer.MIN_VALUE;
            return b.this.a(0L, this);
        }
    }

    public b(@m80.k y5.a settingRepo, @m80.k com.baicizhan.app.biz.game.repo.book.b gameBookRepo) {
        g0.p(settingRepo, "settingRepo");
        g0.p(gameBookRepo, "gameBookRepo");
        this.f74476a = settingRepo;
        this.f74477b = gameBookRepo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        if (r10 != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        if (r10 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c7 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r8, @m80.k j00.c<? super java.lang.Boolean> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof n6.b.a
            if (r0 == 0) goto L13
            r0 = r10
            n6.b$a r0 = (n6.b.a) r0
            int r1 = r0.f74484g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f74484g = r1
            goto L18
        L13:
            n6.b$a r0 = new n6.b$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f74482e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f74484g
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L51
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            int r8 = r0.f74481d
            java.lang.Object r9 = r0.f74480c
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r0 = r0.f74479b
            java.util.List r0 = (java.util.List) r0
            kotlin.e.n(r10)
            goto La1
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L41:
            long r8 = r0.f74478a
            java.lang.Object r2 = r0.f74479b
            java.util.List r2 = (java.util.List) r2
            kotlin.e.n(r10)
            goto L76
        L4b:
            long r8 = r0.f74478a
            kotlin.e.n(r10)
            goto L61
        L51:
            kotlin.e.n(r10)
            com.baicizhan.app.biz.game.repo.book.b r10 = r7.f74477b
            r0.f74478a = r8
            r0.f74484g = r5
            java.lang.Object r10 = r10.e(r8, r0)
            if (r10 != r1) goto L61
            goto L9e
        L61:
            h5.j r10 = (h5.j) r10
            java.util.List r2 = r10.r()
            y5.a r10 = r7.f74476a
            r0.f74479b = r2
            r0.f74478a = r8
            r0.f74484g = r4
            java.lang.Object r10 = r10.a(r0)
            if (r10 != r1) goto L76
            goto L9e
        L76:
            java.util.Map r10 = (java.util.Map) r10
            java.lang.String r4 = "mode"
            java.lang.Object r4 = r10.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = n6.h.c(r2, r4)
            y5.a r5 = r7.f74476a
            java.lang.String r6 = java.lang.String.valueOf(r4)
            java.lang.Object r2 = l00.k.a(r2)
            r0.f74479b = r2
            r0.f74480c = r10
            r0.f74478a = r8
            r0.f74481d = r4
            r0.f74484g = r3
            java.lang.Object r8 = n6.h.a(r5, r10, r6, r0)
            if (r8 != r1) goto L9f
        L9e:
            return r1
        L9f:
            r9 = r10
            r8 = r4
        La1:
            n6.l r10 = n6.l.f74522a
            java.lang.String r8 = r10.a(r8)
            java.lang.Object r8 = r9.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto Lc7
            java.util.Locale r9 = java.util.Locale.ROOT
            java.lang.String r8 = r8.toLowerCase(r9)
            java.lang.String r9 = "toLowerCase(...)"
            kotlin.jvm.internal.g0.o(r8, r9)
            if (r8 == 0) goto Lc7
            java.lang.String r9 = "true"
            boolean r8 = kotlin.jvm.internal.g0.g(r8, r9)
            java.lang.Boolean r8 = l00.a.a(r8)
            return r8
        Lc7:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.b.a(long, j00.c):java.lang.Object");
    }
}
