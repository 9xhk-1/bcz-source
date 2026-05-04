package s6;

import c4.o;
import c40.r0;
import c40.s0;
import c40.x0;
import com.baicizhan.app.biz.base.BizInternalException;
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
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final r6.e f87894a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final r6.i f87895b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.compose.CheckUpdateWordsDataUC$invoke$2", f = "CheckUpdateWordsDataUC.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f87896a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f87898c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.compose.CheckUpdateWordsDataUC$invoke$2$1", f = "CheckUpdateWordsDataUC.kt", i = {0, 0, 0}, l = {28}, m = "invokeSuspend", n = {"$this$coroutineScope", "checkUpdateStudyRecord", "checkUpdateWordRoadMap"}, s = {"L$0", "L$1", "L$2"}, v = 1)
        @u0({"SMAP\nCheckUpdateWordsDataUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckUpdateWordsDataUC.kt\ncom/baicizhan/app/biz/game/uc/sync/compose/CheckUpdateWordsDataUC$invoke$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,45:1\n1869#2,2:46\n*S KotlinDebug\n*F\n+ 1 CheckUpdateWordsDataUC.kt\ncom/baicizhan/app/biz/game/uc/sync/compose/CheckUpdateWordsDataUC$invoke$2$1\n*L\n31#1:46,2\n*E\n"})
        /* renamed from: s6.c$a$a, reason: collision with other inner class name */
        public static final class C1145a extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f87899a;

            /* renamed from: b, reason: collision with root package name */
            public Object f87900b;

            /* renamed from: c, reason: collision with root package name */
            public int f87901c;

            /* renamed from: d, reason: collision with root package name */
            public /* synthetic */ Object f87902d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ c f87903e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ long f87904f;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.compose.CheckUpdateWordsDataUC$invoke$2$1$checkUpdateStudyRecord$1", f = "CheckUpdateWordsDataUC.kt", i = {0, 0, 0}, l = {25}, m = "invokeSuspend", n = {"$this$async", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-CheckUpdateWordsDataUC$invoke$2$1$checkUpdateStudyRecord$1$1"}, s = {"L$0", "L$1", "I$0"}, v = 1)
            @u0({"SMAP\nCheckUpdateWordsDataUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckUpdateWordsDataUC.kt\ncom/baicizhan/app/biz/game/uc/sync/compose/CheckUpdateWordsDataUC$invoke$2$1$checkUpdateStudyRecord$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
            /* renamed from: s6.c$a$a$a, reason: collision with other inner class name */
            public static final class C1146a extends SuspendLambda implements p<r0, j00.c<? super Result<? extends g2>>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public Object f87905a;

                /* renamed from: b, reason: collision with root package name */
                public int f87906b;

                /* renamed from: c, reason: collision with root package name */
                public int f87907c;

                /* renamed from: d, reason: collision with root package name */
                public /* synthetic */ Object f87908d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ c f87909e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ long f87910f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1146a(c cVar, long j11, j00.c<? super C1146a> cVar2) {
                    super(2, cVar2);
                    this.f87909e = cVar;
                    this.f87910f = j11;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                    C1146a c1146a = new C1146a(this.f87909e, this.f87910f, cVar);
                    c1146a.f87908d = obj;
                    return c1146a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(r0 r0Var, j00.c<? super Result<g2>> cVar) {
                    return ((C1146a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object m6308constructorimpl;
                    r0 r0Var = (r0) this.f87908d;
                    Object l11 = kotlin.coroutines.intrinsics.b.l();
                    int i11 = this.f87907c;
                    try {
                        if (i11 == 0) {
                            kotlin.e.n(obj);
                            c cVar = this.f87909e;
                            long j11 = this.f87910f;
                            Result.a aVar = Result.Companion;
                            r6.e eVar = cVar.f87894a;
                            this.f87908d = l00.k.a(r0Var);
                            this.f87905a = l00.k.a(r0Var);
                            this.f87906b = 0;
                            this.f87907c = 1;
                            if (eVar.b(j11, this) == l11) {
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
            @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.compose.CheckUpdateWordsDataUC$invoke$2$1$checkUpdateWordRoadMap$1", f = "CheckUpdateWordsDataUC.kt", i = {0, 0, 0}, l = {27}, m = "invokeSuspend", n = {"$this$async", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-CheckUpdateWordsDataUC$invoke$2$1$checkUpdateWordRoadMap$1$1"}, s = {"L$0", "L$1", "I$0"}, v = 1)
            @u0({"SMAP\nCheckUpdateWordsDataUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckUpdateWordsDataUC.kt\ncom/baicizhan/app/biz/game/uc/sync/compose/CheckUpdateWordsDataUC$invoke$2$1$checkUpdateWordRoadMap$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
            /* renamed from: s6.c$a$a$b */
            public static final class b extends SuspendLambda implements p<r0, j00.c<? super Result<? extends g2>>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public Object f87911a;

                /* renamed from: b, reason: collision with root package name */
                public int f87912b;

                /* renamed from: c, reason: collision with root package name */
                public int f87913c;

                /* renamed from: d, reason: collision with root package name */
                public /* synthetic */ Object f87914d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ c f87915e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ long f87916f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(c cVar, long j11, j00.c<? super b> cVar2) {
                    super(2, cVar2);
                    this.f87915e = cVar;
                    this.f87916f = j11;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                    b bVar = new b(this.f87915e, this.f87916f, cVar);
                    bVar.f87914d = obj;
                    return bVar;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(r0 r0Var, j00.c<? super Result<g2>> cVar) {
                    return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object m6308constructorimpl;
                    r0 r0Var = (r0) this.f87914d;
                    Object l11 = kotlin.coroutines.intrinsics.b.l();
                    int i11 = this.f87913c;
                    try {
                        if (i11 == 0) {
                            kotlin.e.n(obj);
                            c cVar = this.f87915e;
                            long j11 = this.f87916f;
                            Result.a aVar = Result.Companion;
                            r6.i iVar = cVar.f87895b;
                            this.f87914d = l00.k.a(r0Var);
                            this.f87911a = l00.k.a(r0Var);
                            this.f87912b = 0;
                            this.f87913c = 1;
                            if (iVar.b(j11, this) == l11) {
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
            public C1145a(c cVar, long j11, j00.c<? super C1145a> cVar2) {
                super(2, cVar2);
                this.f87903e = cVar;
                this.f87904f = j11;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                C1145a c1145a = new C1145a(this.f87903e, this.f87904f, cVar);
                c1145a.f87902d = obj;
                return c1145a;
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                return ((C1145a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                x0 b11;
                x0 b12;
                r0 r0Var = (r0) this.f87902d;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f87901c;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    b11 = c40.k.b(r0Var, null, null, new C1146a(this.f87903e, this.f87904f, null), 3, null);
                    b12 = c40.k.b(r0Var, null, null, new b(this.f87903e, this.f87904f, null), 3, null);
                    this.f87902d = l00.k.a(r0Var);
                    this.f87899a = l00.k.a(b11);
                    this.f87900b = l00.k.a(b12);
                    this.f87901c = 1;
                    obj = c40.f.b(new x0[]{b11, b12}, this);
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
                        z6.b.f(z6.b.f101032b, d.f87917a, "CheckUpdateWordsDataUC error: " + Result.m6311exceptionOrNullimpl(m6317unboximpl), null, 4, null);
                        Throwable m6311exceptionOrNullimpl = Result.m6311exceptionOrNullimpl(m6317unboximpl);
                        if (m6311exceptionOrNullimpl != null) {
                            throw new BizInternalException("网络错误，稍后重试", m6311exceptionOrNullimpl, 0, 4, null);
                        }
                    }
                }
                return g2.f100423a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j11, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f87898c = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return c.this.new a(this.f87898c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f87896a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                C1145a c1145a = new C1145a(c.this, this.f87898c, null);
                this.f87896a = 1;
                if (s0.g(c1145a, this) == l11) {
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

    public c(@m80.k r6.e checkUpdateStudyAndAbilityUC, @m80.k r6.i checkUpdateWordRoadMapUC) {
        g0.p(checkUpdateStudyAndAbilityUC, "checkUpdateStudyAndAbilityUC");
        g0.p(checkUpdateWordRoadMapUC, "checkUpdateWordRoadMapUC");
        this.f87894a = checkUpdateStudyAndAbilityUC;
        this.f87895b = checkUpdateWordRoadMapUC;
    }

    @m80.l
    public final Object c(long j11, @m80.k j00.c<? super g2> cVar) {
        Object h11 = c40.i.h(o.b(), new a(j11, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }
}
