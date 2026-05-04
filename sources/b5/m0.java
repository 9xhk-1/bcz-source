package b5;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {d5.f.class})
@kotlin.jvm.internal.u0({"SMAP\nGetWordCollectionStatusCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetWordCollectionStatusCommand.kt\ncom/baicizhan/app/biz/game/impl/unity/command/GetWordCollectionStatusCommand\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,48:1\n1563#2:49\n1634#2,3:50\n*S KotlinDebug\n*F\n+ 1 GetWordCollectionStatusCommand.kt\ncom/baicizhan/app/biz/game/impl/unity/command/GetWordCollectionStatusCommand\n*L\n36#1:49\n36#1:50,3\n*E\n"})
/* loaded from: classes3.dex */
public final class m0 implements d5.f<n0, c1> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final u6.c f5953a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f5954b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final f50.e<n0> f5955c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.unity.command.GetWordCollectionStatusCommand", f = "GetWordCollectionStatusCommand.kt", i = {0}, l = {32}, m = "execute-BJMpxQQ", n = {"$v$c$com-baicizhan-app-biz-game-impl-unity-command-GetWordCollectionStatusReq$-payload$0"}, s = {"L$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f5956a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5957b;

        /* renamed from: d, reason: collision with root package name */
        public int f5959d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f5957b = obj;
            this.f5959d |= Integer.MIN_VALUE;
            return m0.this.d(null, this);
        }
    }

    public m0(@m80.k u6.c getTopicCollectionStatus) {
        kotlin.jvm.internal.g0.p(getTopicCollectionStatus, "getTopicCollectionStatus");
        this.f5953a = getTopicCollectionStatus;
        this.f5954b = "biz.userbook.getwordcollectionstatus";
        this.f5955c = n0.Companion.serializer();
    }

    @Override // d5.f
    public /* bridge */ /* synthetic */ Object a(n0 n0Var, j00.c<? super c1> cVar) {
        return d(n0Var.h(), cVar);
    }

    @Override // d5.f
    @m80.l
    public f50.e<n0> b() {
        return this.f5955c;
    }

    @Override // d5.f
    @m80.k
    public String c() {
        return this.f5954b;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006e A[LOOP:0: B:11:0x0068->B:13:0x006e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(@m80.k m3.u r9, @m80.k j00.c<? super b5.c1> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof b5.m0.a
            if (r0 == 0) goto L13
            r0 = r10
            b5.m0$a r0 = (b5.m0.a) r0
            int r1 = r0.f5959d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5959d = r1
            goto L18
        L13:
            b5.m0$a r0 = new b5.m0$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f5957b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f5959d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r9 = r0.f5956a
            m3.u r9 = (m3.u) r9
            kotlin.e.n(r10)
            goto L4d
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            kotlin.e.n(r10)
            u6.c r10 = r8.f5953a
            int r2 = r9.d()
            java.lang.Object r9 = l00.k.a(r9)
            r0.f5956a = r9
            r0.f5959d = r3
            java.lang.Object r10 = r10.a(r2, r0)
            if (r10 != r1) goto L4d
            return r1
        L4d:
            k3.h4 r10 = (k3.h4) r10
            java.util.List r9 = r10.f()
            java.util.List r10 = r10.e()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = a00.i0.d0(r10, r1)
            r0.<init>(r1)
            java.util.Iterator r10 = r10.iterator()
        L68:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L8d
            java.lang.Object r1 = r10.next()
            k3.p3 r1 = (k3.p3) r1
            m3.w1 r2 = new m3.w1
            long r3 = r1.i()
            java.lang.String r5 = r1.h()
            int r6 = r1.j()
            java.lang.String r7 = r1.g()
            r2.<init>(r3, r5, r6, r7)
            r0.add(r2)
            goto L68
        L8d:
            m3.x r10 = new m3.x
            r10.<init>(r9, r0)
            m3.x r9 = b5.o0.b(r10)
            b5.o0 r9 = b5.o0.a(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.m0.d(m3.u, j00.c):java.lang.Object");
    }
}
