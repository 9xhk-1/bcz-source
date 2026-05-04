package s6;

import c40.r0;
import c40.s0;
import c40.x0;
import java.util.Iterator;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import oa0.r;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final s5.b f88023a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final r6.l f88024b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.monetization.c f88025c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.compose.UpdateUserEntitlementsUC$invoke$2", f = "UpdateUserEntitlementsUC.kt", i = {0}, l = {22}, m = "invokeSuspend", n = {"$this$coroutineScope"}, s = {"L$0"}, v = 1)
    @u0({"SMAP\nUpdateUserEntitlementsUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdateUserEntitlementsUC.kt\ncom/baicizhan/app/biz/game/uc/sync/compose/UpdateUserEntitlementsUC$invoke$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,45:1\n1869#2,2:46\n*S KotlinDebug\n*F\n+ 1 UpdateUserEntitlementsUC.kt\ncom/baicizhan/app/biz/game/uc/sync/compose/UpdateUserEntitlementsUC$invoke$2\n*L\n36#1:46,2\n*E\n"})
    public static final class a extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f88026a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f88027b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.compose.UpdateUserEntitlementsUC$invoke$2$1", f = "UpdateUserEntitlementsUC.kt", i = {0, 0, 0, 1, 1, 1}, l = {26, 27}, m = "invokeSuspend", n = {"$this$async", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-UpdateUserEntitlementsUC$invoke$2$1$1", "$this$async", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-UpdateUserEntitlementsUC$invoke$2$1$1"}, s = {"L$0", "L$2", "I$0", "L$0", "L$1", "I$0"}, v = 1)
        /* renamed from: s6.k$a$a, reason: collision with other inner class name */
        public static final class C1151a extends SuspendLambda implements p<r0, j00.c<? super Result<? extends g2>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f88029a;

            /* renamed from: b, reason: collision with root package name */
            public Object f88030b;

            /* renamed from: c, reason: collision with root package name */
            public int f88031c;

            /* renamed from: d, reason: collision with root package name */
            public int f88032d;

            /* renamed from: e, reason: collision with root package name */
            public /* synthetic */ Object f88033e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ k f88034f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1151a(k kVar, j00.c<? super C1151a> cVar) {
                super(2, cVar);
                this.f88034f = kVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                C1151a c1151a = new C1151a(this.f88034f, cVar);
                c1151a.f88033e = obj;
                return c1151a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(r0 r0Var, j00.c<? super Result<g2>> cVar) {
                return ((C1151a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
            
                if (r9.b(r8) == r1) goto L23;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = r8.f88033e
                    c40.r0 r0 = (c40.r0) r0
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    int r2 = r8.f88032d
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L32
                    if (r2 == r4) goto L24
                    if (r2 != r3) goto L1c
                    java.lang.Object r0 = r8.f88029a
                    c40.r0 r0 = (c40.r0) r0
                    kotlin.e.n(r9)     // Catch: java.lang.Throwable -> L1a
                    goto L74
                L1a:
                    r9 = move-exception
                    goto L7b
                L1c:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L24:
                    int r2 = r8.f88031c
                    java.lang.Object r4 = r8.f88030b
                    c40.r0 r4 = (c40.r0) r4
                    java.lang.Object r5 = r8.f88029a
                    s6.k r5 = (s6.k) r5
                    kotlin.e.n(r9)     // Catch: java.lang.Throwable -> L1a
                    goto L56
                L32:
                    kotlin.e.n(r9)
                    s6.k r5 = r8.f88034f
                    kotlin.Result$a r9 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L1a
                    java.lang.Object r9 = l00.k.a(r0)     // Catch: java.lang.Throwable -> L1a
                    r8.f88033e = r9     // Catch: java.lang.Throwable -> L1a
                    r8.f88029a = r5     // Catch: java.lang.Throwable -> L1a
                    java.lang.Object r9 = l00.k.a(r0)     // Catch: java.lang.Throwable -> L1a
                    r8.f88030b = r9     // Catch: java.lang.Throwable -> L1a
                    r2 = 0
                    r8.f88031c = r2     // Catch: java.lang.Throwable -> L1a
                    r8.f88032d = r4     // Catch: java.lang.Throwable -> L1a
                    r6 = 500(0x1f4, double:2.47E-321)
                    java.lang.Object r9 = c40.a1.b(r6, r8)     // Catch: java.lang.Throwable -> L1a
                    if (r9 != r1) goto L55
                    goto L73
                L55:
                    r4 = r0
                L56:
                    s5.b r9 = s6.k.c(r5)     // Catch: java.lang.Throwable -> L1a
                    java.lang.Object r0 = l00.k.a(r0)     // Catch: java.lang.Throwable -> L1a
                    r8.f88033e = r0     // Catch: java.lang.Throwable -> L1a
                    java.lang.Object r0 = l00.k.a(r4)     // Catch: java.lang.Throwable -> L1a
                    r8.f88029a = r0     // Catch: java.lang.Throwable -> L1a
                    r0 = 0
                    r8.f88030b = r0     // Catch: java.lang.Throwable -> L1a
                    r8.f88031c = r2     // Catch: java.lang.Throwable -> L1a
                    r8.f88032d = r3     // Catch: java.lang.Throwable -> L1a
                    java.lang.Object r9 = r9.b(r8)     // Catch: java.lang.Throwable -> L1a
                    if (r9 != r1) goto L74
                L73:
                    return r1
                L74:
                    yz.g2 r9 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L1a
                    java.lang.Object r9 = kotlin.Result.m6308constructorimpl(r9)     // Catch: java.lang.Throwable -> L1a
                    goto L85
                L7b:
                    kotlin.Result$a r0 = kotlin.Result.Companion
                    java.lang.Object r9 = kotlin.e.a(r9)
                    java.lang.Object r9 = kotlin.Result.m6308constructorimpl(r9)
                L85:
                    kotlin.Result r9 = kotlin.Result.m6307boximpl(r9)
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: s6.k.a.C1151a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super Result<? extends g2>> cVar) {
                return invoke2(r0Var, (j00.c<? super Result<g2>>) cVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.compose.UpdateUserEntitlementsUC$invoke$2$2", f = "UpdateUserEntitlementsUC.kt", i = {0, 0, 0}, l = {31}, m = "invokeSuspend", n = {"$this$async", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-UpdateUserEntitlementsUC$invoke$2$2$1"}, s = {"L$0", "L$1", "I$0"}, v = 1)
        @u0({"SMAP\nUpdateUserEntitlementsUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdateUserEntitlementsUC.kt\ncom/baicizhan/app/biz/game/uc/sync/compose/UpdateUserEntitlementsUC$invoke$2$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
        public static final class b extends SuspendLambda implements p<r0, j00.c<? super Result<? extends g2>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f88035a;

            /* renamed from: b, reason: collision with root package name */
            public int f88036b;

            /* renamed from: c, reason: collision with root package name */
            public int f88037c;

            /* renamed from: d, reason: collision with root package name */
            public /* synthetic */ Object f88038d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ k f88039e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(k kVar, j00.c<? super b> cVar) {
                super(2, cVar);
                this.f88039e = kVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                b bVar = new b(this.f88039e, cVar);
                bVar.f88038d = obj;
                return bVar;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(r0 r0Var, j00.c<? super Result<g2>> cVar) {
                return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object m6308constructorimpl;
                r0 r0Var = (r0) this.f88038d;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f88037c;
                try {
                    if (i11 == 0) {
                        kotlin.e.n(obj);
                        k kVar = this.f88039e;
                        Result.a aVar = Result.Companion;
                        r6.l lVar = kVar.f88024b;
                        this.f88038d = l00.k.a(r0Var);
                        this.f88035a = l00.k.a(r0Var);
                        this.f88036b = 0;
                        this.f88037c = 1;
                        if (lVar.c(this) == l11) {
                            return l11;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.e.n(obj);
                    }
                    m6308constructorimpl = Result.m6308constructorimpl(g2.f100423a);
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
                }
                return Result.m6307boximpl(m6308constructorimpl);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super Result<? extends g2>> cVar) {
                return invoke2(r0Var, (j00.c<? super Result<g2>>) cVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.compose.UpdateUserEntitlementsUC$invoke$2$3", f = "UpdateUserEntitlementsUC.kt", i = {0, 0, 0}, l = {34}, m = "invokeSuspend", n = {"$this$async", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-UpdateUserEntitlementsUC$invoke$2$3$1"}, s = {"L$0", "L$1", "I$0"}, v = 1)
        @u0({"SMAP\nUpdateUserEntitlementsUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdateUserEntitlementsUC.kt\ncom/baicizhan/app/biz/game/uc/sync/compose/UpdateUserEntitlementsUC$invoke$2$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
        public static final class c extends SuspendLambda implements p<r0, j00.c<? super Result<? extends g2>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f88040a;

            /* renamed from: b, reason: collision with root package name */
            public int f88041b;

            /* renamed from: c, reason: collision with root package name */
            public int f88042c;

            /* renamed from: d, reason: collision with root package name */
            public /* synthetic */ Object f88043d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ k f88044e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(k kVar, j00.c<? super c> cVar) {
                super(2, cVar);
                this.f88044e = kVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                c cVar2 = new c(this.f88044e, cVar);
                cVar2.f88043d = obj;
                return cVar2;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(r0 r0Var, j00.c<? super Result<g2>> cVar) {
                return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object m6308constructorimpl;
                r0 r0Var = (r0) this.f88043d;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f88042c;
                try {
                    if (i11 == 0) {
                        kotlin.e.n(obj);
                        k kVar = this.f88044e;
                        Result.a aVar = Result.Companion;
                        com.baicizhan.app.biz.game.uc.monetization.c cVar = kVar.f88025c;
                        this.f88043d = l00.k.a(r0Var);
                        this.f88040a = l00.k.a(r0Var);
                        this.f88041b = 0;
                        this.f88042c = 1;
                        if (cVar.a(true, this) == l11) {
                            return l11;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.e.n(obj);
                    }
                    m6308constructorimpl = Result.m6308constructorimpl(g2.f100423a);
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
                }
                return Result.m6307boximpl(m6308constructorimpl);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super Result<? extends g2>> cVar) {
                return invoke2(r0Var, (j00.c<? super Result<g2>>) cVar);
            }
        }

        public a(j00.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = k.this.new a(cVar);
            aVar.f88027b = obj;
            return aVar;
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            x0 b11;
            x0 b12;
            x0 b13;
            r0 r0Var = (r0) this.f88027b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f88026a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                b11 = c40.k.b(r0Var, null, null, new C1151a(k.this, null), 3, null);
                b12 = c40.k.b(r0Var, null, null, new b(k.this, null), 3, null);
                b13 = c40.k.b(r0Var, null, null, new c(k.this, null), 3, null);
                this.f88027b = l00.k.a(r0Var);
                this.f88026a = 1;
                obj = c40.f.b(new x0[]{b11, b12, b13}, this);
                if (obj == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                Object m6317unboximpl = ((Result) it.next()).m6317unboximpl();
                if (Result.m6314isFailureimpl(m6317unboximpl)) {
                    z6.b.f101032b.e(l.f88045a, "failed", Result.m6311exceptionOrNullimpl(m6317unboximpl));
                }
            }
            return g2.f100423a;
        }
    }

    public k(@m80.k s5.b purchasedBookRepo, @m80.k r6.l fetchEntitlementsUC, @m80.k com.baicizhan.app.biz.game.uc.monetization.c checkFetchPromotionUC) {
        g0.p(purchasedBookRepo, "purchasedBookRepo");
        g0.p(fetchEntitlementsUC, "fetchEntitlementsUC");
        g0.p(checkFetchPromotionUC, "checkFetchPromotionUC");
        this.f88023a = purchasedBookRepo;
        this.f88024b = fetchEntitlementsUC;
        this.f88025c = checkFetchPromotionUC;
    }

    @m80.l
    public final Object d(@m80.k j00.c<? super g2> cVar) {
        Object g11 = s0.g(new a(null), cVar);
        return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
    }
}
