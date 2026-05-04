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
import r6.w;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final w f87997a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final q6.c f87998b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final l6.b f87999c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.compose.SyncWordsDataUC$invoke$2", f = "SyncWordsDataUC.kt", i = {0}, l = {22}, m = "invokeSuspend", n = {"$this$coroutineScope"}, s = {"L$0"}, v = 1)
    @u0({"SMAP\nSyncWordsDataUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyncWordsDataUC.kt\ncom/baicizhan/app/biz/game/uc/sync/compose/SyncWordsDataUC$invoke$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,41:1\n1869#2,2:42\n*S KotlinDebug\n*F\n+ 1 SyncWordsDataUC.kt\ncom/baicizhan/app/biz/game/uc/sync/compose/SyncWordsDataUC$invoke$2\n*L\n32#1:42,2\n*E\n"})
    public static final class a extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f88000a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f88001b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f88003d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.compose.SyncWordsDataUC$invoke$2$1", f = "SyncWordsDataUC.kt", i = {0, 0, 0}, l = {24}, m = "invokeSuspend", n = {"$this$async", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-SyncWordsDataUC$invoke$2$1$1"}, s = {"L$0", "L$1", "I$0"}, v = 1)
        @u0({"SMAP\nSyncWordsDataUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyncWordsDataUC.kt\ncom/baicizhan/app/biz/game/uc/sync/compose/SyncWordsDataUC$invoke$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
        /* renamed from: s6.i$a$a, reason: collision with other inner class name */
        public static final class C1150a extends SuspendLambda implements p<r0, j00.c<? super Result<? extends g2>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f88004a;

            /* renamed from: b, reason: collision with root package name */
            public int f88005b;

            /* renamed from: c, reason: collision with root package name */
            public int f88006c;

            /* renamed from: d, reason: collision with root package name */
            public /* synthetic */ Object f88007d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ i f88008e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ long f88009f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1150a(i iVar, long j11, j00.c<? super C1150a> cVar) {
                super(2, cVar);
                this.f88008e = iVar;
                this.f88009f = j11;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                C1150a c1150a = new C1150a(this.f88008e, this.f88009f, cVar);
                c1150a.f88007d = obj;
                return c1150a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(r0 r0Var, j00.c<? super Result<g2>> cVar) {
                return ((C1150a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object m6308constructorimpl;
                r0 r0Var = (r0) this.f88007d;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f88006c;
                try {
                    if (i11 == 0) {
                        kotlin.e.n(obj);
                        i iVar = this.f88008e;
                        long j11 = this.f88009f;
                        Result.a aVar = Result.Companion;
                        w wVar = iVar.f87997a;
                        this.f88007d = l00.k.a(r0Var);
                        this.f88004a = l00.k.a(r0Var);
                        this.f88005b = 0;
                        this.f88006c = 1;
                        if (wVar.a(j11, this) == l11) {
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
        @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.compose.SyncWordsDataUC$invoke$2$2", f = "SyncWordsDataUC.kt", i = {0, 0, 0}, l = {27}, m = "invokeSuspend", n = {"$this$async", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-SyncWordsDataUC$invoke$2$2$1"}, s = {"L$0", "L$1", "I$0"}, v = 1)
        @u0({"SMAP\nSyncWordsDataUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyncWordsDataUC.kt\ncom/baicizhan/app/biz/game/uc/sync/compose/SyncWordsDataUC$invoke$2$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
        public static final class b extends SuspendLambda implements p<r0, j00.c<? super Result<? extends g2>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f88010a;

            /* renamed from: b, reason: collision with root package name */
            public int f88011b;

            /* renamed from: c, reason: collision with root package name */
            public int f88012c;

            /* renamed from: d, reason: collision with root package name */
            public /* synthetic */ Object f88013d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ i f88014e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ long f88015f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(i iVar, long j11, j00.c<? super b> cVar) {
                super(2, cVar);
                this.f88014e = iVar;
                this.f88015f = j11;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                b bVar = new b(this.f88014e, this.f88015f, cVar);
                bVar.f88013d = obj;
                return bVar;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(r0 r0Var, j00.c<? super Result<g2>> cVar) {
                return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object m6308constructorimpl;
                r0 r0Var = (r0) this.f88013d;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f88012c;
                try {
                    if (i11 == 0) {
                        kotlin.e.n(obj);
                        i iVar = this.f88014e;
                        long j11 = this.f88015f;
                        Result.a aVar = Result.Companion;
                        q6.c cVar = iVar.f87998b;
                        this.f88013d = l00.k.a(r0Var);
                        this.f88010a = l00.k.a(r0Var);
                        this.f88011b = 0;
                        this.f88012c = 1;
                        if (cVar.a(j11, this) == l11) {
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
        @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.compose.SyncWordsDataUC$invoke$2$3", f = "SyncWordsDataUC.kt", i = {0, 0, 0}, l = {30}, m = "invokeSuspend", n = {"$this$async", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-SyncWordsDataUC$invoke$2$3$1"}, s = {"L$0", "L$1", "I$0"}, v = 1)
        @u0({"SMAP\nSyncWordsDataUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyncWordsDataUC.kt\ncom/baicizhan/app/biz/game/uc/sync/compose/SyncWordsDataUC$invoke$2$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
        public static final class c extends SuspendLambda implements p<r0, j00.c<? super Result<? extends g2>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f88016a;

            /* renamed from: b, reason: collision with root package name */
            public int f88017b;

            /* renamed from: c, reason: collision with root package name */
            public int f88018c;

            /* renamed from: d, reason: collision with root package name */
            public /* synthetic */ Object f88019d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ i f88020e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ long f88021f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(i iVar, long j11, j00.c<? super c> cVar) {
                super(2, cVar);
                this.f88020e = iVar;
                this.f88021f = j11;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                c cVar2 = new c(this.f88020e, this.f88021f, cVar);
                cVar2.f88019d = obj;
                return cVar2;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(r0 r0Var, j00.c<? super Result<g2>> cVar) {
                return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object m6308constructorimpl;
                r0 r0Var = (r0) this.f88019d;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f88018c;
                try {
                    if (i11 == 0) {
                        kotlin.e.n(obj);
                        i iVar = this.f88020e;
                        long j11 = this.f88021f;
                        Result.a aVar = Result.Companion;
                        l6.b bVar = iVar.f87999c;
                        this.f88019d = l00.k.a(r0Var);
                        this.f88016a = l00.k.a(r0Var);
                        this.f88017b = 0;
                        this.f88018c = 1;
                        if (bVar.a(j11, this) == l11) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j11, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f88003d = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = i.this.new a(this.f88003d, cVar);
            aVar.f88001b = obj;
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
            r0 r0Var = (r0) this.f88001b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f88000a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                z6.b.j(z6.b.f101032b, j.f88022a, "start SyncWordsDataUC", null, 4, null);
                b11 = c40.k.b(r0Var, null, null, new C1150a(i.this, this.f88003d, null), 3, null);
                b12 = c40.k.b(r0Var, null, null, new b(i.this, this.f88003d, null), 3, null);
                b13 = c40.k.b(r0Var, null, null, new c(i.this, this.f88003d, null), 3, null);
                this.f88001b = l00.k.a(r0Var);
                this.f88000a = 1;
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
                    z6.b.f101032b.e(j.f88022a, "syncWordsData failed", Result.m6311exceptionOrNullimpl(m6317unboximpl));
                }
            }
            return g2.f100423a;
        }
    }

    public i(@m80.k w syncAbilityUC, @m80.k q6.c syncStudyRecordUC, @m80.k l6.b checkAndFetchResourceVersionUC) {
        g0.p(syncAbilityUC, "syncAbilityUC");
        g0.p(syncStudyRecordUC, "syncStudyRecordUC");
        g0.p(checkAndFetchResourceVersionUC, "checkAndFetchResourceVersionUC");
        this.f87997a = syncAbilityUC;
        this.f87998b = syncStudyRecordUC;
        this.f87999c = checkAndFetchResourceVersionUC;
    }

    @m80.l
    public final Object d(long j11, @m80.k j00.c<? super g2> cVar) {
        Object g11 = s0.g(new a(j11, null), cVar);
        return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
    }
}
