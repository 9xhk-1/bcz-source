package b5;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {d5.f.class})
@kotlin.jvm.internal.u0({"SMAP\nResetComboCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResetComboCommand.kt\ncom/baicizhan/app/biz/game/impl/unity/command/ResetComboCommand\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n1563#2:37\n1634#2,3:38\n*S KotlinDebug\n*F\n+ 1 ResetComboCommand.kt\ncom/baicizhan/app/biz/game/impl/unity/command/ResetComboCommand\n*L\n32#1:37\n32#1:38,3\n*E\n"})
/* loaded from: classes3.dex */
public final class m1 implements d5.f<p, n1> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final g6.g f5960a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f5961b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final f50.e<p> f5962c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.unity.command.ResetComboCommand", f = "ResetComboCommand.kt", i = {0}, l = {28}, m = "execute-q8xRIHc", n = {"$v$c$com-baicizhan-app-biz-game-impl-unity-command-ComboReq$-payload$0"}, s = {"L$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f5963a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5964b;

        /* renamed from: d, reason: collision with root package name */
        public int f5966d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f5964b = obj;
            this.f5966d |= Integer.MIN_VALUE;
            return m1.this.d(null, this);
        }
    }

    public m1(@m80.k g6.g resetComboUC) {
        kotlin.jvm.internal.g0.p(resetComboUC, "resetComboUC");
        this.f5960a = resetComboUC;
        this.f5961b = "biz.wordsgame.resetcombo";
        this.f5962c = p.Companion.serializer();
    }

    @Override // d5.f
    public /* bridge */ /* synthetic */ Object a(p pVar, j00.c<? super n1> cVar) {
        return d(pVar.h(), cVar);
    }

    @Override // d5.f
    @m80.l
    public f50.e<p> b() {
        return this.f5962c;
    }

    @Override // d5.f
    @m80.k
    public String c() {
        return this.f5961b;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(@m80.k m3.m r5, @m80.k j00.c<? super b5.n1> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof b5.m1.a
            if (r0 == 0) goto L13
            r0 = r6
            b5.m1$a r0 = (b5.m1.a) r0
            int r1 = r0.f5966d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5966d = r1
            goto L18
        L13:
            b5.m1$a r0 = new b5.m1$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f5964b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f5966d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f5963a
            m3.m r5 = (m3.m) r5
            kotlin.e.n(r6)
            goto L49
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.e.n(r6)
            g6.g r6 = r4.f5960a
            java.lang.Object r5 = l00.k.a(r5)
            r0.f5963a = r5
            r0.f5966d = r3
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            kotlin.Triple r6 = (kotlin.Triple) r6
            java.lang.Object r5 = r6.component1()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.Object r0 = r6.component2()
            p8.c0 r0 = (p8.c0) r0
            java.lang.Object r6 = r6.component3()
            java.util.List r6 = (java.util.List) r6
            if (r0 == 0) goto L68
            m3.m0 r0 = e5.a.b(r0)
            goto L69
        L68:
            r0 = 0
        L69:
            if (r6 == 0) goto L90
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = a00.i0.d0(r6, r2)
            r1.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
        L7c:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L94
            java.lang.Object r2 = r6.next()
            p8.c0 r2 = (p8.c0) r2
            m3.m0 r2 = e5.a.b(r2)
            r1.add(r2)
            goto L7c
        L90:
            java.util.List r1 = a00.h0.J()
        L94:
            m3.u0 r6 = new m3.u0
            r6.<init>(r5, r0, r1)
            m3.u0 r5 = b5.n1.b(r6)
            b5.n1 r5 = b5.n1.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.m1.d(m3.m, j00.c):java.lang.Object");
    }
}
