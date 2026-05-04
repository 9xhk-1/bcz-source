package n6;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final y5.a f74485a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.book.b f74486b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.settings.GetStudyModeSetting", f = "GetWordsSettingUC.kt", i = {0, 1, 1, 2, 2, 2, 2, 2}, l = {47, 48, 50}, m = "invoke", n = {"bookId", "modeList", "bookId", "modeList", "settings", "bookId", "it", "$i$a$-also-GetStudyModeSetting$invoke$2"}, s = {"J$0", "L$0", "J$0", "L$0", "L$1", "J$0", "I$0", "I$1"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f74487a;

        /* renamed from: b, reason: collision with root package name */
        public Object f74488b;

        /* renamed from: c, reason: collision with root package name */
        public Object f74489c;

        /* renamed from: d, reason: collision with root package name */
        public Object f74490d;

        /* renamed from: e, reason: collision with root package name */
        public int f74491e;

        /* renamed from: f, reason: collision with root package name */
        public int f74492f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f74493g;

        /* renamed from: i, reason: collision with root package name */
        public int f74495i;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f74493g = obj;
            this.f74495i |= Integer.MIN_VALUE;
            return c.this.a(0L, this);
        }
    }

    public c(@m80.k y5.a settingRepo, @m80.k com.baicizhan.app.biz.game.repo.book.b gameBookRepo) {
        g0.p(settingRepo, "settingRepo");
        g0.p(gameBookRepo, "gameBookRepo");
        this.f74485a = settingRepo;
        this.f74486b = gameBookRepo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
    
        if (r11 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        if (r11 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r9, @m80.k j00.c<? super java.lang.Integer> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof n6.c.a
            if (r0 == 0) goto L13
            r0 = r11
            n6.c$a r0 = (n6.c.a) r0
            int r1 = r0.f74495i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f74495i = r1
            goto L18
        L13:
            n6.c$a r0 = new n6.c$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f74493g
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f74495i
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L53
            if (r2 == r5) goto L4d
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r9 = r0.f74490d
            java.lang.Integer r9 = (java.lang.Integer) r9
            java.lang.Object r10 = r0.f74489c
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Object r10 = r0.f74488b
            java.util.List r10 = (java.util.List) r10
            kotlin.e.n(r11)
            return r9
        L3b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L43:
            long r9 = r0.f74487a
            java.lang.Object r2 = r0.f74488b
            java.util.List r2 = (java.util.List) r2
            kotlin.e.n(r11)
            goto L78
        L4d:
            long r9 = r0.f74487a
            kotlin.e.n(r11)
            goto L63
        L53:
            kotlin.e.n(r11)
            com.baicizhan.app.biz.game.repo.book.b r11 = r8.f74486b
            r0.f74487a = r9
            r0.f74495i = r5
            java.lang.Object r11 = r11.e(r9, r0)
            if (r11 != r1) goto L63
            goto Lb1
        L63:
            h5.j r11 = (h5.j) r11
            java.util.List r2 = r11.r()
            y5.a r11 = r8.f74485a
            r0.f74488b = r2
            r0.f74487a = r9
            r0.f74495i = r4
            java.lang.Object r11 = r11.a(r0)
            if (r11 != r1) goto L78
            goto Lb1
        L78:
            java.util.Map r11 = (java.util.Map) r11
            java.lang.String r4 = "mode"
            java.lang.Object r4 = r11.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = n6.h.c(r2, r4)
            java.lang.Integer r4 = l00.a.f(r4)
            int r5 = r4.intValue()
            y5.a r6 = r8.f74485a
            java.lang.String r7 = java.lang.String.valueOf(r5)
            java.lang.Object r2 = l00.k.a(r2)
            r0.f74488b = r2
            java.lang.Object r2 = l00.k.a(r11)
            r0.f74489c = r2
            r0.f74490d = r4
            r0.f74487a = r9
            r0.f74491e = r5
            r9 = 0
            r0.f74492f = r9
            r0.f74495i = r3
            java.lang.Object r9 = n6.h.a(r6, r11, r7, r0)
            if (r9 != r1) goto Lb2
        Lb1:
            return r1
        Lb2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.c.a(long, j00.c):java.lang.Object");
    }
}
