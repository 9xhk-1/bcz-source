package b5;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {d5.f.class})
@kotlin.jvm.internal.u0({"SMAP\nPreloadResourceCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloadResourceCommand.kt\ncom/baicizhan/app/biz/game/impl/unity/command/PreloadResourceReqCommand\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,29:1\n1563#2:30\n1634#2,3:31\n*S KotlinDebug\n*F\n+ 1 PreloadResourceCommand.kt\ncom/baicizhan/app/biz/game/impl/unity/command/PreloadResourceReqCommand\n*L\n26#1:30\n26#1:31,3\n*E\n"})
/* loaded from: classes3.dex */
public final class g1 implements d5.f<f1, c1> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l6.x f5858a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final g6.i f5859b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f5860c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final f50.e<f1> f5861d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.unity.command.PreloadResourceReqCommand", f = "PreloadResourceCommand.kt", i = {0}, l = {26}, m = "execute-emtWdqU", n = {"$v$c$com-baicizhan-app-biz-game-impl-unity-command-PreloadResourceReq$-payload$0"}, s = {"L$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f5862a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5863b;

        /* renamed from: d, reason: collision with root package name */
        public int f5865d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f5863b = obj;
            this.f5865d |= Integer.MIN_VALUE;
            return g1.this.d(null, this);
        }
    }

    public g1(@m80.k l6.x preloadResourceUC, @m80.k g6.i syncComboUC) {
        kotlin.jvm.internal.g0.p(preloadResourceUC, "preloadResourceUC");
        kotlin.jvm.internal.g0.p(syncComboUC, "syncComboUC");
        this.f5858a = preloadResourceUC;
        this.f5859b = syncComboUC;
        this.f5860c = "biz.wordsgame.preloadresource";
        this.f5861d = f1.Companion.serializer();
    }

    @Override // d5.f
    public /* bridge */ /* synthetic */ Object a(f1 f1Var, j00.c<? super c1> cVar) {
        return d(f1Var.h(), cVar);
    }

    @Override // d5.f
    @m80.l
    public f50.e<f1> b() {
        return this.f5861d;
    }

    @Override // d5.f
    @m80.k
    public String c() {
        return this.f5860c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(@m80.k m3.l0 r10, @m80.k j00.c<? super b5.c1> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof b5.g1.a
            if (r0 == 0) goto L13
            r0 = r11
            b5.g1$a r0 = (b5.g1.a) r0
            int r1 = r0.f5865d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5865d = r1
            goto L18
        L13:
            b5.g1$a r0 = new b5.g1$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f5863b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f5865d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r10 = r0.f5862a
            m3.l0 r10 = (m3.l0) r10
            kotlin.e.n(r11)
            goto L84
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            kotlin.e.n(r11)
            g6.i r11 = r9.f5859b
            r11.i()
            l6.x r11 = r9.f5858a
            java.lang.String r2 = r10.i()
            int r4 = r10.k()
            java.util.List r5 = r10.m()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = a00.i0.d0(r5, r7)
            r6.<init>(r7)
            java.util.Iterator r5 = r5.iterator()
        L5c:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L75
            java.lang.Object r7 = r5.next()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            long r7 = (long) r7
            java.lang.Long r7 = l00.a.g(r7)
            r6.add(r7)
            goto L5c
        L75:
            java.lang.Object r10 = l00.k.a(r10)
            r0.f5862a = r10
            r0.f5865d = r3
            java.lang.Object r10 = r11.e(r2, r4, r6, r0)
            if (r10 != r1) goto L84
            return r1
        L84:
            b5.e1 r10 = b5.e1.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.g1.d(m3.l0, j00.c):java.lang.Object");
    }
}
