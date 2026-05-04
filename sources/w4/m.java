package w4;

import a00.h0;
import c40.r0;
import c40.x0;
import com.baicizhan.app.biz.game.impl.home.uieffect.internal.EffectType;
import h5.a0;
import h5.q0;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.CoroutineStart;
import l3.o;
import x4.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
@u0({"SMAP\nIncentiveCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IncentiveCollector.kt\ncom/baicizhan/app/biz/game/impl/home/uieffect/IncentiveCollector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,209:1\n1#2:210\n*E\n"})
/* loaded from: classes3.dex */
public final class m implements c4.j {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.incentive.e f95036b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.incentive.k f95037c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.incentive.f f95038d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.incentive.m f95039e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final b6.a f95040f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.incentive.b f95041g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.incentive.j f95042h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final t5.a f95043i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.advertisement.b f95044j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final k5.a f95045k;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.IncentiveCollector$collectFreeMemberAdEffect$deferredEffect$1", f = "IncentiveCollector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<r0, j00.c, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f95046a;

        public a(j00.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new a(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f95046a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.IncentiveCollector", f = "IncentiveCollector.kt", i = {0, 0}, l = {108}, m = "collectLavaQuestEffect$biz_release", n = {"$this$collectLavaQuestEffect_u24lambda_u240", "$i$a$-runCatching-IncentiveCollector$collectLavaQuestEffect$2"}, s = {"L$0", "I$0"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f95047a;

        /* renamed from: b, reason: collision with root package name */
        public int f95048b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f95049c;

        /* renamed from: e, reason: collision with root package name */
        public int f95051e;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f95049c = obj;
            this.f95051e |= Integer.MIN_VALUE;
            return m.this.l(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.IncentiveCollector$collectLavaQuestEffect$3$1", f = "IncentiveCollector.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f95052a;

        public c(j00.c<? super c> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return m.this.new c(cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super g2> cVar) {
            return ((c) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f95052a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                com.baicizhan.app.biz.game.uc.incentive.j jVar = m.this.f95042h;
                this.f95052a = 1;
                if (jVar.a(this) == l11) {
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
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.IncentiveCollector$collectPopupAdEffect$1", f = "IncentiveCollector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class d extends SuspendLambda implements x00.p<Boolean, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f95054a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f95055b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f95056c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Ref.BooleanRef booleanRef, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f95056c = booleanRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            d dVar = new d(this.f95056c, cVar);
            dVar.f95055b = ((Boolean) obj).booleanValue();
            return dVar;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, j00.c<? super g2> cVar) {
            return invoke(bool.booleanValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z11 = this.f95055b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f95054a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            this.f95056c.element = z11;
            return g2.f100423a;
        }

        public final Object invoke(boolean z11, j00.c<? super g2> cVar) {
            return ((d) create(Boolean.valueOf(z11), cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.IncentiveCollector$collectPopupAdOnly$deferredEffect$1", f = "IncentiveCollector.kt", i = {0, 0, 0}, l = {186}, m = "invokeSuspend", n = {"$this$async", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-IncentiveCollector$collectPopupAdOnly$deferredEffect$1$1"}, s = {"L$0", "L$3", "I$0"}, v = 1)
    public static final class e extends SuspendLambda implements x00.p<r0, j00.c<? super o.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f95057a;

        /* renamed from: b, reason: collision with root package name */
        public Object f95058b;

        /* renamed from: c, reason: collision with root package name */
        public Object f95059c;

        /* renamed from: d, reason: collision with root package name */
        public int f95060d;

        /* renamed from: e, reason: collision with root package name */
        public int f95061e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f95062f;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ x00.p<Boolean, j00.c<? super g2>, Object> f95064h;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.IncentiveCollector$collectPopupAdOnly$deferredEffect$1$1$1$1", f = "IncentiveCollector.kt", i = {}, l = {191, 192}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f95065a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f95066b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ r8.b f95067c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ x00.p<Boolean, j00.c<? super g2>, Object> f95068d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(m mVar, r8.b bVar, x00.p<? super Boolean, ? super j00.c<? super g2>, ? extends Object> pVar, j00.c<? super a> cVar) {
                super(1, cVar);
                this.f95066b = mVar;
                this.f95067c = bVar;
                this.f95068d = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(j00.c<?> cVar) {
                return new a(this.f95066b, this.f95067c, this.f95068d, cVar);
            }

            @Override // x00.l
            public final Object invoke(j00.c<? super g2> cVar) {
                return ((a) create(cVar)).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
            
                if (r5.invoke(r1, r4) == r0) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
            
                if (r5.b(r1, r4) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r4.f95065a
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    kotlin.e.n(r5)
                    goto L41
                L12:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L1a:
                    kotlin.e.n(r5)
                    goto L32
                L1e:
                    kotlin.e.n(r5)
                    w4.m r5 = r4.f95066b
                    t5.a r5 = w4.m.i(r5)
                    r8.b r1 = r4.f95067c
                    r4.f95065a = r3
                    java.lang.Object r5 = r5.b(r1, r4)
                    if (r5 != r0) goto L32
                    goto L40
                L32:
                    x00.p<java.lang.Boolean, j00.c<? super yz.g2>, java.lang.Object> r5 = r4.f95068d
                    java.lang.Boolean r1 = l00.a.a(r3)
                    r4.f95065a = r2
                    java.lang.Object r5 = r5.invoke(r1, r4)
                    if (r5 != r0) goto L41
                L40:
                    return r0
                L41:
                    yz.g2 r5 = yz.g2.f100423a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: w4.m.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.IncentiveCollector$collectPopupAdOnly$deferredEffect$1$1$1$2", f = "IncentiveCollector.kt", i = {}, l = {195}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class b extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f95069a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f95070b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ r8.b f95071c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(m mVar, r8.b bVar, j00.c<? super b> cVar) {
                super(1, cVar);
                this.f95070b = mVar;
                this.f95071c = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(j00.c<?> cVar) {
                return new b(this.f95070b, this.f95071c, cVar);
            }

            @Override // x00.l
            public final Object invoke(j00.c<? super g2> cVar) {
                return ((b) create(cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f95069a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    t5.a aVar = this.f95070b.f95043i;
                    r8.b bVar = this.f95071c;
                    this.f95069a = 1;
                    if (aVar.b(bVar, this) == l11) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(x00.p<? super Boolean, ? super j00.c<? super g2>, ? extends Object> pVar, j00.c<? super e> cVar) {
            super(2, cVar);
            this.f95064h = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            e eVar = m.this.new e(this.f95064h, cVar);
            eVar.f95062f = obj;
            return eVar;
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super o.p> cVar) {
            return ((e) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m6308constructorimpl;
            m mVar;
            x00.p<Boolean, j00.c<? super g2>, Object> pVar;
            o.p pVar2;
            r0 r0Var = (r0) this.f95062f;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f95061e;
            try {
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    m mVar2 = m.this;
                    x00.p<Boolean, j00.c<? super g2>, Object> pVar3 = this.f95064h;
                    Result.a aVar = Result.Companion;
                    com.baicizhan.app.biz.game.uc.advertisement.b bVar = mVar2.f95044j;
                    this.f95062f = l00.k.a(r0Var);
                    this.f95057a = mVar2;
                    this.f95058b = pVar3;
                    this.f95059c = l00.k.a(r0Var);
                    this.f95060d = 0;
                    this.f95061e = 1;
                    Object a11 = bVar.a(this);
                    if (a11 == l11) {
                        return l11;
                    }
                    mVar = mVar2;
                    obj = a11;
                    pVar = pVar3;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = (x00.p) this.f95058b;
                    mVar = (m) this.f95057a;
                    kotlin.e.n(obj);
                }
                r8.b bVar2 = (r8.b) obj;
                if (bVar2 != null) {
                    pVar2 = new o.p(u4.a.e(bVar2), u4.g.b(new a(mVar, bVar2, pVar, null)), u4.g.b(new b(mVar, bVar2, null)), u4.g.a());
                } else {
                    pVar2 = null;
                }
                m6308constructorimpl = Result.m6308constructorimpl(pVar2);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
            }
            if (Result.m6314isFailureimpl(m6308constructorimpl)) {
                return null;
            }
            return m6308constructorimpl;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.IncentiveCollector$collectPopupNotifyEffect$deferredEffect$1", f = "IncentiveCollector.kt", i = {0}, l = {124}, m = "invokeSuspend", n = {"$this$async"}, s = {"L$0"}, v = 1)
    public static final class f extends SuspendLambda implements x00.p<r0, j00.c<? super o.m>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f95072a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f95073b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.IncentiveCollector$collectPopupNotifyEffect$deferredEffect$1$1$1$1", f = "IncentiveCollector.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f95075a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f95076b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ r8.b f95077c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(m mVar, r8.b bVar, j00.c<? super a> cVar) {
                super(1, cVar);
                this.f95076b = mVar;
                this.f95077c = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(j00.c<?> cVar) {
                return new a(this.f95076b, this.f95077c, cVar);
            }

            @Override // x00.l
            public final Object invoke(j00.c<? super g2> cVar) {
                return ((a) create(cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f95075a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    t5.a aVar = this.f95076b.f95043i;
                    r8.b bVar = this.f95077c;
                    this.f95075a = 1;
                    if (aVar.g(bVar, this) == l11) {
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

        public f(j00.c<? super f> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            f fVar = m.this.new f(cVar);
            fVar.f95073b = obj;
            return fVar;
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super o.m> cVar) {
            return ((f) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m6308constructorimpl;
            r0 r0Var = (r0) this.f95073b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f95072a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                t5.a aVar = m.this.f95043i;
                this.f95073b = r0Var;
                this.f95072a = 1;
                obj = aVar.e(this);
                if (obj == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            r8.b bVar = (r8.b) obj;
            if (bVar == null) {
                return null;
            }
            m mVar = m.this;
            try {
                Result.a aVar2 = Result.Companion;
                String str = bVar.f83604g;
                if (str == null) {
                    str = bVar.f83599b;
                }
                String str2 = str;
                String str3 = bVar.f83599b;
                String str4 = bVar.f83601d;
                g0.m(str4);
                m6308constructorimpl = Result.m6308constructorimpl(new o.m(str2, str3, str4, u4.g.b(new a(mVar, bVar, null)), u4.g.a()));
            } catch (Throwable th2) {
                Result.a aVar3 = Result.Companion;
                m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
            }
            return (o.m) (Result.m6314isFailureimpl(m6308constructorimpl) ? null : m6308constructorimpl);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.IncentiveCollector$collectRankListEffect$deferredEffect$1", f = "IncentiveCollector.kt", i = {1}, l = {51, 52}, m = "invokeSuspend", n = {"data"}, s = {"L$0"}, v = 1)
    @u0({"SMAP\nIncentiveCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IncentiveCollector.kt\ncom/baicizhan/app/biz/game/impl/home/uieffect/IncentiveCollector$collectRankListEffect$deferredEffect$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,209:1\n1#2:210\n774#3:211\n865#3,2:212\n1563#3:214\n1634#3,3:215\n*S KotlinDebug\n*F\n+ 1 IncentiveCollector.kt\ncom/baicizhan/app/biz/game/impl/home/uieffect/IncentiveCollector$collectRankListEffect$deferredEffect$1\n*L\n57#1:211\n57#1:212,2\n57#1:214\n57#1:215,3\n*E\n"})
    public static final class g extends SuspendLambda implements x00.p<r0, j00.c<? super o.q>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f95078a;

        /* renamed from: b, reason: collision with root package name */
        public int f95079b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.IncentiveCollector$collectRankListEffect$deferredEffect$1$1$2", f = "IncentiveCollector.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f95081a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f95082b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a0 f95083c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(m mVar, a0 a0Var, j00.c<? super a> cVar) {
                super(1, cVar);
                this.f95082b = mVar;
                this.f95083c = a0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(j00.c<?> cVar) {
                return new a(this.f95082b, this.f95083c, cVar);
            }

            @Override // x00.l
            public final Object invoke(j00.c<? super g2> cVar) {
                return ((a) create(cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f95081a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    com.baicizhan.app.biz.game.uc.incentive.k kVar = this.f95082b.f95037c;
                    a0 a0Var = this.f95083c;
                    this.f95081a = 1;
                    if (kVar.a(a0Var, this) == l11) {
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

        public g(j00.c<? super g> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return m.this.new g(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super o.q> cVar) {
            return ((g) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:58:0x0037, code lost:
        
            if (r2 == r1) goto L15;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00c3 A[LOOP:2: B:29:0x00bd->B:31:0x00c3, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x007f A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 280
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: w4.m.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.IncentiveCollector$collectTaskEffect$deferredEffect$1", f = "IncentiveCollector.kt", i = {1}, l = {86, 87}, m = "invokeSuspend", n = {"data"}, s = {"L$0"}, v = 1)
    @u0({"SMAP\nIncentiveCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IncentiveCollector.kt\ncom/baicizhan/app/biz/game/impl/home/uieffect/IncentiveCollector$collectTaskEffect$deferredEffect$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,209:1\n1563#2:210\n1634#2,3:211\n*S KotlinDebug\n*F\n+ 1 IncentiveCollector.kt\ncom/baicizhan/app/biz/game/impl/home/uieffect/IncentiveCollector$collectTaskEffect$deferredEffect$1\n*L\n92#1:210\n92#1:211,3\n*E\n"})
    public static final class h extends SuspendLambda implements x00.p<r0, j00.c<? super o.x>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f95084a;

        /* renamed from: b, reason: collision with root package name */
        public int f95085b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.IncentiveCollector$collectTaskEffect$deferredEffect$1$1$2", f = "IncentiveCollector.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f95087a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f95088b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ q0 f95089c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(m mVar, q0 q0Var, j00.c<? super a> cVar) {
                super(1, cVar);
                this.f95088b = mVar;
                this.f95089c = q0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(j00.c<?> cVar) {
                return new a(this.f95088b, this.f95089c, cVar);
            }

            @Override // x00.l
            public final Object invoke(j00.c<? super g2> cVar) {
                return ((a) create(cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f95087a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    com.baicizhan.app.biz.game.uc.incentive.m mVar = this.f95088b.f95039e;
                    q0 q0Var = this.f95089c;
                    this.f95087a = 1;
                    if (mVar.a(q0Var, true, this) == l11) {
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
        @l00.d(c = "com.baicizhan.app.biz.game.impl.home.uieffect.IncentiveCollector$collectTaskEffect$deferredEffect$1$1$3", f = "IncentiveCollector.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class b extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f95090a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f95091b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ q0 f95092c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(m mVar, q0 q0Var, j00.c<? super b> cVar) {
                super(1, cVar);
                this.f95091b = mVar;
                this.f95092c = q0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(j00.c<?> cVar) {
                return new b(this.f95091b, this.f95092c, cVar);
            }

            @Override // x00.l
            public final Object invoke(j00.c<? super g2> cVar) {
                return ((b) create(cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f95090a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    com.baicizhan.app.biz.game.uc.incentive.m mVar = this.f95091b.f95039e;
                    q0 q0Var = this.f95092c;
                    this.f95090a = 1;
                    if (mVar.a(q0Var, false, this) == l11) {
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

        public h(j00.c<? super h> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return m.this.new h(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super o.x> cVar) {
            return ((h) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0031, code lost:
        
            if (r7 == r0) goto L15;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0074 A[LOOP:0: B:12:0x006e->B:14:0x0074, LOOP_END] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f95085b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r6.f95084a
                h5.q0 r0 = (h5.q0) r0
                kotlin.e.n(r7)
                goto L4b
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                kotlin.e.n(r7)
                goto L34
            L22:
                kotlin.e.n(r7)
                w4.m r7 = w4.m.this
                com.baicizhan.app.biz.game.uc.incentive.f r7 = w4.m.c(r7)
                r6.f95085b = r3
                java.lang.Object r7 = r7.n(r6)
                if (r7 != r0) goto L34
                goto L48
            L34:
                h5.q0 r7 = (h5.q0) r7
                w4.m r1 = w4.m.this
                b6.a r1 = w4.m.j(r1)
                com.baicizhan.app.biz.game.repo.userguide.UserGuideType r3 = com.baicizhan.app.biz.game.repo.userguide.UserGuideType.NewUserTasksLocked
                r6.f95084a = r7
                r6.f95085b = r2
                java.lang.Object r1 = r1.e(r3, r6)
                if (r1 != r0) goto L49
            L48:
                return r0
            L49:
                r0 = r7
                r7 = r1
            L4b:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                r1 = 0
                if (r7 == 0) goto L55
                return r1
            L55:
                if (r0 == 0) goto L9e
                w4.m r7 = w4.m.this
                java.util.List r2 = r0.g()
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                java.util.ArrayList r3 = new java.util.ArrayList
                r4 = 10
                int r4 = a00.i0.d0(r2, r4)
                r3.<init>(r4)
                java.util.Iterator r2 = r2.iterator()
            L6e:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L82
                java.lang.Object r4 = r2.next()
                h5.r0 r4 = (h5.r0) r4
                l3.c0 r4 = u4.b.n(r4)
                r3.add(r4)
                goto L6e
            L82:
                l3.g2 r2 = u4.g.a()
                w4.m$h$a r4 = new w4.m$h$a
                r4.<init>(r7, r0, r1)
                l3.g2 r4 = u4.g.b(r4)
                w4.m$h$b r5 = new w4.m$h$b
                r5.<init>(r7, r0, r1)
                l3.g2 r7 = u4.g.b(r5)
                l3.o$x r0 = new l3.o$x
                r0.<init>(r3, r4, r7, r2)
                return r0
            L9e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: w4.m.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public m(@m80.k com.baicizhan.app.biz.game.uc.incentive.e checkRankPopupDataUC, @m80.k com.baicizhan.app.biz.game.uc.incentive.k markRankPopupShownUC, @m80.k com.baicizhan.app.biz.game.uc.incentive.f checkTaskPopupDataUC, @m80.k com.baicizhan.app.biz.game.uc.incentive.m markTaskPopupShownUC, @m80.k b6.a userGuideRepo, @m80.k com.baicizhan.app.biz.game.uc.incentive.b checkLavaPopupUC, @m80.k com.baicizhan.app.biz.game.uc.incentive.j markLavaPopupShownUC, @m80.k t5.a notificationRepo, @m80.k com.baicizhan.app.biz.game.uc.advertisement.b fetchPopupAdUC, @m80.k k5.a topAdvertisementRepo) {
        g0.p(checkRankPopupDataUC, "checkRankPopupDataUC");
        g0.p(markRankPopupShownUC, "markRankPopupShownUC");
        g0.p(checkTaskPopupDataUC, "checkTaskPopupDataUC");
        g0.p(markTaskPopupShownUC, "markTaskPopupShownUC");
        g0.p(userGuideRepo, "userGuideRepo");
        g0.p(checkLavaPopupUC, "checkLavaPopupUC");
        g0.p(markLavaPopupShownUC, "markLavaPopupShownUC");
        g0.p(notificationRepo, "notificationRepo");
        g0.p(fetchPopupAdUC, "fetchPopupAdUC");
        g0.p(topAdvertisementRepo, "topAdvertisementRepo");
        this.f95036b = checkRankPopupDataUC;
        this.f95037c = markRankPopupShownUC;
        this.f95038d = checkTaskPopupDataUC;
        this.f95039e = markTaskPopupShownUC;
        this.f95040f = userGuideRepo;
        this.f95041g = checkLavaPopupUC;
        this.f95042h = markLavaPopupShownUC;
        this.f95043i = notificationRepo;
        this.f95044j = fetchPopupAdUC;
        this.f95045k = topAdvertisementRepo;
    }

    public static final boolean n(Ref.BooleanRef booleanRef) {
        return booleanRef.element;
    }

    @m80.k
    public final a.c k(@m80.k r0 scope, @m80.k x00.a<Boolean> hasClosed) {
        x0 b11;
        g0.p(scope, "scope");
        g0.p(hasClosed, "hasClosed");
        b11 = c40.k.b(scope, null, CoroutineStart.LAZY, new a(null), 1, null);
        return new a.c(b11, "FreeMembershipClaim", EffectType.Default);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:23|24))(3:25|26|(1:28))|12|13|(1:15)|16|(2:18|19)(1:21)))|31|6|7|(0)(0)|12|13|(0)|16|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x002d, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
    
        r0 = kotlin.Result.Companion;
        r5 = kotlin.Result.m6308constructorimpl(kotlin.e.a(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(@m80.k j00.c<? super x4.a.b> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof w4.m.b
            if (r0 == 0) goto L13
            r0 = r5
            w4.m$b r0 = (w4.m.b) r0
            int r1 = r0.f95051e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f95051e = r1
            goto L18
        L13:
            w4.m$b r0 = new w4.m$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f95049c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f95051e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f95047a
            w4.m r0 = (w4.m) r0
            kotlin.e.n(r5)     // Catch: java.lang.Throwable -> L2d
            goto L50
        L2d:
            r5 = move-exception
            goto L57
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            kotlin.e.n(r5)
            kotlin.Result$a r5 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L2d
            com.baicizhan.app.biz.game.uc.incentive.b r5 = r4.f95041g     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r2 = l00.k.a(r4)     // Catch: java.lang.Throwable -> L2d
            r0.f95047a = r2     // Catch: java.lang.Throwable -> L2d
            r2 = 0
            r0.f95048b = r2     // Catch: java.lang.Throwable -> L2d
            r0.f95051e = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r5 = r5.a(r0)     // Catch: java.lang.Throwable -> L2d
            if (r5 != r1) goto L50
            return r1
        L50:
            com.baicizhan.online.playground_api.LavaquestGameInfo r5 = (com.baicizhan.online.playground_api.LavaquestGameInfo) r5     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r5 = kotlin.Result.m6308constructorimpl(r5)     // Catch: java.lang.Throwable -> L2d
            goto L61
        L57:
            kotlin.Result$a r0 = kotlin.Result.Companion
            java.lang.Object r5 = kotlin.e.a(r5)
            java.lang.Object r5 = kotlin.Result.m6308constructorimpl(r5)
        L61:
            boolean r0 = kotlin.Result.m6314isFailureimpl(r5)
            r1 = 0
            if (r0 == 0) goto L69
            r5 = r1
        L69:
            com.baicizhan.online.playground_api.LavaquestGameInfo r5 = (com.baicizhan.online.playground_api.LavaquestGameInfo) r5
            if (r5 == 0) goto L89
            x4.a$b r0 = new x4.a$b
            l3.o$e r2 = new l3.o$e
            w4.m$c r3 = new w4.m$c
            r3.<init>(r1)
            l3.g2 r1 = u4.g.b(r3)
            l3.g2 r3 = u4.g.a()
            java.lang.String r5 = r5.theme_pic
            r2.<init>(r1, r3, r5)
            com.baicizhan.app.biz.game.impl.home.uieffect.internal.EffectType r5 = com.baicizhan.app.biz.game.impl.home.uieffect.internal.EffectType.Default
            r0.<init>(r2, r5)
            r1 = r0
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.m.l(j00.c):java.lang.Object");
    }

    @m80.k
    public final x4.a m(@m80.k r0 scope) {
        g0.p(scope, "scope");
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        return new a.d(h0.Q(o(scope, new d(booleanRef, null)), k(scope, new x00.a() { // from class: w4.l
            @Override // x00.a
            public final Object invoke() {
                boolean n11;
                n11 = m.n(Ref.BooleanRef.this);
                return Boolean.valueOf(n11);
            }
        })), null, 2, null);
    }

    @m80.k
    public final a.c o(@m80.k r0 scope, @m80.k x00.p<? super Boolean, ? super j00.c<? super g2>, ? extends Object> onClosed) {
        x0 b11;
        g0.p(scope, "scope");
        g0.p(onClosed, "onClosed");
        b11 = c40.k.b(scope, null, null, new e(onClosed, null), 3, null);
        return new a.c(b11, "PopupAdEffect", EffectType.Default);
    }

    @m80.k
    public final x4.a p(@m80.k r0 scope) {
        x0 b11;
        g0.p(scope, "scope");
        b11 = c40.k.b(scope, null, CoroutineStart.LAZY, new f(null), 1, null);
        return new a.c(b11, "NotifyEffect", EffectType.Default);
    }

    @m80.l
    public final a.c q(@m80.k r0 scope) {
        x0 b11;
        g0.p(scope, "scope");
        b11 = c40.k.b(scope, null, null, new g(null), 3, null);
        return new a.c(b11, "RankListPopup", EffectType.Dialog);
    }

    @Override // c4.j, pa0.a
    @m80.k
    public /* bridge */ na0.a r() {
        return super.r();
    }

    @m80.l
    public final a.c s(@m80.k r0 scope) {
        x0 b11;
        g0.p(scope, "scope");
        b11 = c40.k.b(scope, null, null, new h(null), 3, null);
        return new a.c(b11, "TaskEffect", EffectType.Dialog);
    }
}
