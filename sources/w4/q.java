package w4;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
@u0({"SMAP\nSimpleDialogCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleDialogCollector.kt\ncom/baicizhan/app/biz/game/impl/home/uieffect/SimpleDialogCollector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
/* loaded from: classes3.dex */
public final class q implements c4.j {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.monetization.i f95124b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.monetization.f f95125c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.SimpleDialogCollector", f = "SimpleDialogCollector.kt", i = {}, l = {29}, m = "collectFreeMembershipEffect$biz_release", n = {}, s = {}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f95126a;

        /* renamed from: c, reason: collision with root package name */
        public int f95128c;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f95126a = obj;
            this.f95128c |= Integer.MIN_VALUE;
            return q.this.b(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.SimpleDialogCollector$collectFreeMembershipEffect$3$1", f = "SimpleDialogCollector.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f95129a;

        public b(j00.c<? super b> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return q.this.new b(cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super g2> cVar) {
            return ((b) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f95129a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                com.baicizhan.app.biz.game.uc.monetization.f fVar = q.this.f95125c;
                this.f95129a = 1;
                if (fVar.a(this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.SimpleDialogCollector", f = "SimpleDialogCollector.kt", i = {}, l = {44}, m = "collectMembershipPromotionEffect$biz_release", n = {}, s = {}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f95131a;

        /* renamed from: c, reason: collision with root package name */
        public int f95133c;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f95131a = obj;
            this.f95133c |= Integer.MIN_VALUE;
            return q.this.c(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.SimpleDialogCollector$collectMembershipPromotionEffect$3$1$1", f = "SimpleDialogCollector.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class d extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f95134a;

        public d(j00.c<? super d> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return q.this.new d(cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super g2> cVar) {
            return ((d) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f95134a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                com.baicizhan.app.biz.game.uc.monetization.f fVar = q.this.f95125c;
                this.f95134a = 1;
                if (fVar.a(this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return g2.f100423a;
        }
    }

    public q(@m80.k com.baicizhan.app.biz.game.uc.monetization.i getMemberPopupUC, @m80.k com.baicizhan.app.biz.game.uc.monetization.f consumeMemberPopUC) {
        g0.p(getMemberPopupUC, "getMemberPopupUC");
        g0.p(consumeMemberPopUC, "consumeMemberPopUC");
        this.f95124b = getMemberPopupUC;
        this.f95125c = consumeMemberPopUC;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@m80.k j00.c<? super x4.a> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof w4.q.a
            if (r0 == 0) goto L13
            r0 = r5
            w4.q$a r0 = (w4.q.a) r0
            int r1 = r0.f95128c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f95128c = r1
            goto L18
        L13:
            w4.q$a r0 = new w4.q$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f95126a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f95128c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.e.n(r5)
            com.baicizhan.app.biz.game.uc.monetization.i r5 = r4.f95124b
            r0.f95128c = r3
            java.lang.Object r5 = r5.e(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            kotlin.Pair r5 = (kotlin.Pair) r5
            r0 = 0
            if (r5 == 0) goto L7e
            java.lang.Object r1 = r5.getFirst()
            u8.e r1 = (u8.e) r1
            int r1 = r1.f91916a
            if (r1 == r3) goto L5b
            java.lang.Object r1 = r5.getFirst()
            u8.e r1 = (u8.e) r1
            int r1 = r1.f91916a
            r2 = 2
            if (r1 != r2) goto L5a
            goto L5b
        L5a:
            r5 = r0
        L5b:
            if (r5 == 0) goto L7e
            l3.o$c r1 = new l3.o$c
            java.lang.Object r5 = r5.getFirst()
            u8.e r5 = (u8.e) r5
            int r5 = r5.f91916a
            w4.q$b r2 = new w4.q$b
            r2.<init>(r0)
            l3.g2 r0 = u4.g.b(r2)
            l3.g2 r2 = u4.g.a()
            r1.<init>(r5, r0, r2)
            com.baicizhan.app.biz.game.impl.home.uieffect.internal.EffectType r5 = com.baicizhan.app.biz.game.impl.home.uieffect.internal.EffectType.Dialog
            x4.a$b r5 = x4.b.a(r1, r5)
            return r5
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.q.b(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@m80.k j00.c<? super x4.a> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof w4.q.c
            if (r0 == 0) goto L13
            r0 = r12
            w4.q$c r0 = (w4.q.c) r0
            int r1 = r0.f95133c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f95133c = r1
            goto L18
        L13:
            w4.q$c r0 = new w4.q$c
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f95131a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f95133c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r12)
            goto L3f
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L31:
            kotlin.e.n(r12)
            com.baicizhan.app.biz.game.uc.monetization.i r12 = r11.f95124b
            r0.f95133c = r3
            java.lang.Object r12 = r12.e(r0)
            if (r12 != r1) goto L3f
            return r1
        L3f:
            kotlin.Pair r12 = (kotlin.Pair) r12
            r1 = 0
            if (r12 == 0) goto Lce
            java.lang.Object r0 = r12.getFirst()
            u8.e r0 = (u8.e) r0
            u8.f r0 = r0.f91918c
            if (r0 == 0) goto L55
            u8.d r0 = r0.f91927d
            if (r0 == 0) goto L55
            java.lang.String r0 = r0.f91910c
            goto L56
        L55:
            r0 = r1
        L56:
            if (r0 == 0) goto L59
            goto L5a
        L59:
            r12 = r1
        L5a:
            if (r12 == 0) goto Lce
            kotlin.Result$a r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L89
            java.lang.Object r0 = r12.getFirst()     // Catch: java.lang.Throwable -> L89
            u8.e r0 = (u8.e) r0     // Catch: java.lang.Throwable -> L89
            u8.f r0 = r0.f91918c     // Catch: java.lang.Throwable -> L89
            kotlin.jvm.internal.g0.m(r0)     // Catch: java.lang.Throwable -> L89
            l3.o$f r2 = new l3.o$f     // Catch: java.lang.Throwable -> L89
            int r6 = r0.f91925b     // Catch: java.lang.Throwable -> L89
            int r7 = r0.f91926c     // Catch: java.lang.Throwable -> L89
            java.lang.Object r3 = r12.getFirst()     // Catch: java.lang.Throwable -> L89
            u8.e r3 = (u8.e) r3     // Catch: java.lang.Throwable -> L89
            int r4 = r3.f91916a     // Catch: java.lang.Throwable -> L89
            java.lang.Object r3 = r12.getFirst()     // Catch: java.lang.Throwable -> L89
            u8.e r3 = (u8.e) r3     // Catch: java.lang.Throwable -> L89
            long r8 = r3.f91917b     // Catch: java.lang.Throwable -> L89
            int r5 = r0.f91924a     // Catch: java.lang.Throwable -> L89
            u8.d r0 = r0.f91927d     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L8c
            java.lang.String r0 = r0.f91910c     // Catch: java.lang.Throwable -> L89
            r10 = r0
            goto L8d
        L89:
            r0 = move-exception
            r12 = r0
            goto Lba
        L8c:
            r10 = r1
        L8d:
            kotlin.jvm.internal.g0.m(r10)     // Catch: java.lang.Throwable -> L89
            l3.v r3 = new l3.v     // Catch: java.lang.Throwable -> L89
            r3.<init>(r4, r5, r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L89
            java.lang.Object r12 = r12.getSecond()     // Catch: java.lang.Throwable -> L89
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L89
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L89
            w4.q$d r0 = new w4.q$d     // Catch: java.lang.Throwable -> L89
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L89
            l3.g2 r0 = u4.g.b(r0)     // Catch: java.lang.Throwable -> L89
            l3.g2 r4 = u4.g.a()     // Catch: java.lang.Throwable -> L89
            r2.<init>(r3, r12, r0, r4)     // Catch: java.lang.Throwable -> L89
            com.baicizhan.app.biz.game.impl.home.uieffect.internal.EffectType r12 = com.baicizhan.app.biz.game.impl.home.uieffect.internal.EffectType.Dialog     // Catch: java.lang.Throwable -> L89
            x4.a$b r12 = x4.b.a(r2, r12)     // Catch: java.lang.Throwable -> L89
            java.lang.Object r12 = kotlin.Result.m6308constructorimpl(r12)     // Catch: java.lang.Throwable -> L89
            goto Lc4
        Lba:
            kotlin.Result$a r0 = kotlin.Result.Companion
            java.lang.Object r12 = kotlin.e.a(r12)
            java.lang.Object r12 = kotlin.Result.m6308constructorimpl(r12)
        Lc4:
            boolean r0 = kotlin.Result.m6314isFailureimpl(r12)
            if (r0 == 0) goto Lcb
            goto Lcc
        Lcb:
            r1 = r12
        Lcc:
            x4.a$b r1 = (x4.a.b) r1
        Lce:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.q.c(j00.c):java.lang.Object");
    }

    @Override // c4.j, pa0.a
    @m80.k
    public /* bridge */ na0.a r() {
        return super.r();
    }
}
