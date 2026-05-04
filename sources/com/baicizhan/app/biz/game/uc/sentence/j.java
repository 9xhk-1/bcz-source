package com.baicizhan.app.biz.game.uc.sentence;

import c40.r0;
import c40.s0;
import c40.x2;
import com.baicizhan.app.api.service.model.game.RewardType;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m3.v0;
import oa0.r;
import r6.u;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nSubmitSentenceGameUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubmitSentenceGameUC.kt\ncom/baicizhan/app/biz/game/uc/sentence/SubmitSentenceGameUC\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n774#2:137\n865#2,2:138\n1#3:140\n*S KotlinDebug\n*F\n+ 1 SubmitSentenceGameUC.kt\ncom/baicizhan/app/biz/game/uc/sentence/SubmitSentenceGameUC\n*L\n108#1:137\n108#1:138,2\n*E\n"})
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final u f15263a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.incentive.g f15264b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final w5.a f15265c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final r6.r f15266d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final x5.b f15267e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final x5.d f15268f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final d f15269g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final a6.a f15270h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.ipavatar.c f15271i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final v5.e f15272j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final v5.d f15273k;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.sentence.SubmitSentenceGameUC", f = "SubmitSentenceGameUC.kt", i = {0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {112, 121, 124}, m = "commitReward", n = {"rewards", "rewardWithOutEmpty", "rewards", "rewardWithOutEmpty", "$this$commitReward_u24lambda_u241", "extra", "$i$a$-runCatching-SubmitSentenceGameUC$commitReward$2", "$i$a$-let-SubmitSentenceGameUC$commitReward$2$toBeDownload$2", "rewards", "rewardWithOutEmpty", "$this$commitReward_u24lambda_u241", "toBeDownload", "$i$a$-runCatching-SubmitSentenceGameUC$commitReward$2"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15274a;

        /* renamed from: b, reason: collision with root package name */
        public Object f15275b;

        /* renamed from: c, reason: collision with root package name */
        public Object f15276c;

        /* renamed from: d, reason: collision with root package name */
        public Object f15277d;

        /* renamed from: e, reason: collision with root package name */
        public Object f15278e;

        /* renamed from: f, reason: collision with root package name */
        public int f15279f;

        /* renamed from: g, reason: collision with root package name */
        public int f15280g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f15281h;

        /* renamed from: j, reason: collision with root package name */
        public int f15283j;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15281h = obj;
            this.f15283j |= Integer.MIN_VALUE;
            return j.this.g(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.sentence.SubmitSentenceGameUC", f = "SubmitSentenceGameUC.kt", i = {0, 1, 1, 2, 2, 3, 3, 3}, l = {84, 85, 86, 89}, m = "commitStudyProgress", n = {"skuId", "curSentence", "skuId", "curSentence", "skuId", "curSentence", "remote", "skuId"}, s = {"I$0", "L$0", "I$0", "L$0", "I$0", "L$0", "L$1", "I$0"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f15284a;

        /* renamed from: b, reason: collision with root package name */
        public Object f15285b;

        /* renamed from: c, reason: collision with root package name */
        public Object f15286c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f15287d;

        /* renamed from: f, reason: collision with root package name */
        public int f15289f;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15287d = obj;
            this.f15289f |= Integer.MIN_VALUE;
            return j.this.i(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.sentence.SubmitSentenceGameUC$invoke$2", f = "SubmitSentenceGameUC.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f15290a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f15292c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<v0> f15293d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f15294e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.uc.sentence.SubmitSentenceGameUC$invoke$2$1", f = "SubmitSentenceGameUC.kt", i = {0, 1, 2, 3}, l = {51, 75, 76, 77}, m = "invokeSuspend", n = {"$this$withContext", "$this$withContext", "$this$withContext", "$this$withContext"}, s = {"L$0", "L$0", "L$0", "L$0"}, v = 1)
        @u0({"SMAP\nSubmitSentenceGameUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubmitSentenceGameUC.kt\ncom/baicizhan/app/biz/game/uc/sentence/SubmitSentenceGameUC$invoke$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,136:1\n1869#2,2:137\n*S KotlinDebug\n*F\n+ 1 SubmitSentenceGameUC.kt\ncom/baicizhan/app/biz/game/uc/sentence/SubmitSentenceGameUC$invoke$2$1\n*L\n66#1:137,2\n*E\n"})
        public static final class a extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f15295a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f15296b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j f15297c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ boolean f15298d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ List<v0> f15299e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ int f15300f;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @l00.d(c = "com.baicizhan.app.biz.game.uc.sentence.SubmitSentenceGameUC$invoke$2$1$1", f = "SubmitSentenceGameUC.kt", i = {0, 0, 0}, l = {52}, m = "invokeSuspend", n = {"$this$async", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-SubmitSentenceGameUC$invoke$2$1$1$1"}, s = {"L$0", "L$1", "I$0"}, v = 1)
            @u0({"SMAP\nSubmitSentenceGameUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubmitSentenceGameUC.kt\ncom/baicizhan/app/biz/game/uc/sentence/SubmitSentenceGameUC$invoke$2$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
            /* renamed from: com.baicizhan.app.biz.game.uc.sentence.j$c$a$a, reason: collision with other inner class name */
            public static final class C0225a extends SuspendLambda implements p<r0, j00.c<? super Result<? extends g2>>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public Object f15301a;

                /* renamed from: b, reason: collision with root package name */
                public int f15302b;

                /* renamed from: c, reason: collision with root package name */
                public int f15303c;

                /* renamed from: d, reason: collision with root package name */
                public /* synthetic */ Object f15304d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ j f15305e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0225a(j jVar, j00.c<? super C0225a> cVar) {
                    super(2, cVar);
                    this.f15305e = jVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                    C0225a c0225a = new C0225a(this.f15305e, cVar);
                    c0225a.f15304d = obj;
                    return c0225a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(r0 r0Var, j00.c<? super Result<g2>> cVar) {
                    return ((C0225a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object m6308constructorimpl;
                    r0 r0Var = (r0) this.f15304d;
                    Object l11 = kotlin.coroutines.intrinsics.b.l();
                    int i11 = this.f15303c;
                    try {
                        if (i11 == 0) {
                            kotlin.e.n(obj);
                            j jVar = this.f15305e;
                            Result.a aVar = Result.Companion;
                            u uVar = jVar.f15263a;
                            this.f15304d = l00.k.a(r0Var);
                            this.f15301a = l00.k.a(r0Var);
                            this.f15302b = 0;
                            this.f15303c = 1;
                            if (uVar.b(0L, this) == l11) {
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
            @l00.d(c = "com.baicizhan.app.biz.game.uc.sentence.SubmitSentenceGameUC$invoke$2$1$2", f = "SubmitSentenceGameUC.kt", i = {0, 0, 0}, l = {56}, m = "invokeSuspend", n = {"$this$async", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-SubmitSentenceGameUC$invoke$2$1$2$1"}, s = {"L$0", "L$1", "I$0"}, v = 1)
            @u0({"SMAP\nSubmitSentenceGameUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubmitSentenceGameUC.kt\ncom/baicizhan/app/biz/game/uc/sentence/SubmitSentenceGameUC$invoke$2$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,136:1\n1761#2,3:137\n*S KotlinDebug\n*F\n+ 1 SubmitSentenceGameUC.kt\ncom/baicizhan/app/biz/game/uc/sentence/SubmitSentenceGameUC$invoke$2$1$2\n*L\n55#1:137,3\n*E\n"})
            public static final class b extends SuspendLambda implements p<r0, j00.c<? super Result<? extends g2>>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public Object f15306a;

                /* renamed from: b, reason: collision with root package name */
                public int f15307b;

                /* renamed from: c, reason: collision with root package name */
                public int f15308c;

                /* renamed from: d, reason: collision with root package name */
                public /* synthetic */ Object f15309d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ List<v0> f15310e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ j f15311f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(List<v0> list, j jVar, j00.c<? super b> cVar) {
                    super(2, cVar);
                    this.f15310e = list;
                    this.f15311f = jVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                    b bVar = new b(this.f15310e, this.f15311f, cVar);
                    bVar.f15309d = obj;
                    return bVar;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(r0 r0Var, j00.c<? super Result<g2>> cVar) {
                    return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object m6308constructorimpl;
                    r0 r0Var = (r0) this.f15309d;
                    Object l11 = kotlin.coroutines.intrinsics.b.l();
                    int i11 = this.f15308c;
                    try {
                        if (i11 == 0) {
                            kotlin.e.n(obj);
                            List<v0> list = this.f15310e;
                            j jVar = this.f15311f;
                            Result.a aVar = Result.Companion;
                            List<v0> list2 = list;
                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                Iterator<T> it = list2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    v0 v0Var = (v0) it.next();
                                    if (v0Var.j() == RewardType.BuddyTravelSnacks && v0Var.f() > 0) {
                                        com.baicizhan.app.biz.game.uc.ipavatar.c cVar = jVar.f15271i;
                                        this.f15309d = l00.k.a(r0Var);
                                        this.f15306a = l00.k.a(r0Var);
                                        this.f15307b = 0;
                                        this.f15308c = 1;
                                        if (cVar.f(true, this) == l11) {
                                            return l11;
                                        }
                                    }
                                }
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
            @l00.d(c = "com.baicizhan.app.biz.game.uc.sentence.SubmitSentenceGameUC$invoke$2$1$3", f = "SubmitSentenceGameUC.kt", i = {0, 0, 0}, l = {62}, m = "invokeSuspend", n = {"$this$async", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-SubmitSentenceGameUC$invoke$2$1$3$1"}, s = {"L$0", "L$1", "I$0"}, v = 1)
            /* renamed from: com.baicizhan.app.biz.game.uc.sentence.j$c$a$c, reason: collision with other inner class name */
            public static final class C0226c extends SuspendLambda implements p<r0, j00.c<? super Result<? extends g2>>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public Object f15312a;

                /* renamed from: b, reason: collision with root package name */
                public int f15313b;

                /* renamed from: c, reason: collision with root package name */
                public int f15314c;

                /* renamed from: d, reason: collision with root package name */
                public /* synthetic */ Object f15315d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f15316e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ j f15317f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ int f15318g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0226c(boolean z11, j jVar, int i11, j00.c<? super C0226c> cVar) {
                    super(2, cVar);
                    this.f15316e = z11;
                    this.f15317f = jVar;
                    this.f15318g = i11;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                    C0226c c0226c = new C0226c(this.f15316e, this.f15317f, this.f15318g, cVar);
                    c0226c.f15315d = obj;
                    return c0226c;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(r0 r0Var, j00.c<? super Result<g2>> cVar) {
                    return ((C0226c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object m6308constructorimpl;
                    r0 r0Var = (r0) this.f15315d;
                    Object l11 = kotlin.coroutines.intrinsics.b.l();
                    int i11 = this.f15314c;
                    try {
                        if (i11 == 0) {
                            kotlin.e.n(obj);
                            boolean z11 = this.f15316e;
                            j jVar = this.f15317f;
                            int i12 = this.f15318g;
                            Result.a aVar = Result.Companion;
                            if (z11) {
                                this.f15315d = l00.k.a(r0Var);
                                this.f15312a = l00.k.a(r0Var);
                                this.f15313b = 0;
                                this.f15314c = 1;
                                if (jVar.i(i12, this) == l11) {
                                    return l11;
                                }
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
            public a(j jVar, boolean z11, List<v0> list, int i11, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f15297c = jVar;
                this.f15298d = z11;
                this.f15299e = list;
                this.f15300f = i11;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                a aVar = new a(this.f15297c, this.f15298d, this.f15299e, this.f15300f, cVar);
                aVar.f15296b = obj;
                return aVar;
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x00eb, code lost:
            
                if (r14.g(r2, r13) == r0) goto L33;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x00ed, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x00d8, code lost:
            
                if (r14.h(r2, r13) == r0) goto L33;
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
            
                if (r14.j(r2, r13) == r0) goto L33;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x007d, code lost:
            
                if (r14 == r0) goto L33;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                /*
                    Method dump skipped, instructions count: 280
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.sentence.j.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z11, List<v0> list, int i11, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f15292c = z11;
            this.f15293d = list;
            this.f15294e = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return j.this.new c(this.f15292c, this.f15293d, this.f15294e, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f15290a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                kotlin.coroutines.d plus = c4.o.b().plus(x2.f8011a);
                a aVar = new a(j.this, this.f15292c, this.f15293d, this.f15294e, null);
                this.f15290a = 1;
                if (c40.i.h(plus, aVar, this) == l11) {
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

    public j(@m80.k u fetchVersionInfoUC, @m80.k com.baicizhan.app.biz.game.uc.incentive.g completeWinningStreakUC, @m80.k w5.a rewardRepo, @m80.k r6.r fetchSentenceHomeUC, @m80.k x5.b sentenceInfo, @m80.k x5.d sentenceUnit, @m80.k d extractUnitInfoUC, @m80.k a6.a studyRoundStatsRepo, @m80.k com.baicizhan.app.biz.game.uc.ipavatar.c fetchIpAvatarHomeUC, @m80.k v5.e mediaFileRepo, @m80.k v5.d downloadRepo) {
        g0.p(fetchVersionInfoUC, "fetchVersionInfoUC");
        g0.p(completeWinningStreakUC, "completeWinningStreakUC");
        g0.p(rewardRepo, "rewardRepo");
        g0.p(fetchSentenceHomeUC, "fetchSentenceHomeUC");
        g0.p(sentenceInfo, "sentenceInfo");
        g0.p(sentenceUnit, "sentenceUnit");
        g0.p(extractUnitInfoUC, "extractUnitInfoUC");
        g0.p(studyRoundStatsRepo, "studyRoundStatsRepo");
        g0.p(fetchIpAvatarHomeUC, "fetchIpAvatarHomeUC");
        g0.p(mediaFileRepo, "mediaFileRepo");
        g0.p(downloadRepo, "downloadRepo");
        this.f15263a = fetchVersionInfoUC;
        this.f15264b = completeWinningStreakUC;
        this.f15265c = rewardRepo;
        this.f15266d = fetchSentenceHomeUC;
        this.f15267e = sentenceInfo;
        this.f15268f = sentenceUnit;
        this.f15269g = extractUnitInfoUC;
        this.f15270h = studyRoundStatsRepo;
        this.f15271i = fetchIpAvatarHomeUC;
        this.f15272j = mediaFileRepo;
        this.f15273k = downloadRepo;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:0|1|(2:3|(8:5|6|(1:(1:(1:(11:11|12|13|14|15|16|17|(1:19)|20|21|22)(2:28|29))(6:30|31|32|33|34|(8:45|15|16|17|(0)|20|21|22)(3:38|(9:41|14|15|16|17|(0)|20|21|22)|40)))(1:49))(7:70|(4:73|(3:75|76|77)(1:79)|78|71)|80|81|(1:83)|21|22)|50|51|(2:52|(2:54|(2:56|57)(1:67))(2:68|69))|58|(10:66|(1:36)|45|15|16|17|(0)|20|21|22)(2:62|(2:64|40)(11:65|34|(0)|45|15|16|17|(0)|20|21|22))))|85|6|(0)(0)|50|51|(3:52|(0)(0)|67)|58|(1:60)|66|(0)|45|15|16|17|(0)|20|21|22|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e2, code lost:
    
        r12 = r0;
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00be, code lost:
    
        if (r13.b(r7, r0) == r1) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0124 A[Catch: all -> 0x00e1, TryCatch #0 {all -> 0x00e1, blocks: (B:34:0x0117, B:36:0x0124, B:38:0x0130, B:51:0x00c2, B:52:0x00cb, B:54:0x00d1, B:58:0x00e7, B:60:0x00ec, B:62:0x00f2), top: B:50:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d1 A[Catch: all -> 0x00e1, TryCatch #0 {all -> 0x00e1, blocks: (B:34:0x0117, B:36:0x0124, B:38:0x0130, B:51:0x00c2, B:52:0x00cb, B:54:0x00d1, B:58:0x00e7, B:60:0x00ec, B:62:0x00f2), top: B:50:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r12v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.util.List<m3.v0> r12, j00.c<? super yz.g2> r13) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.sentence.j.g(java.util.List, j00.c):java.lang.Object");
    }

    public final Object h(boolean z11, j00.c<? super g2> cVar) {
        if (!z11) {
            return g2.f100423a;
        }
        Object d11 = this.f15270h.d(cVar);
        return d11 == kotlin.coroutines.intrinsics.b.l() ? d11 : g2.f100423a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        if (r11 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        if (r11.e(r10, r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0074, code lost:
    
        if (r11 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(int r10, j00.c<? super yz.g2> r11) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.sentence.j.i(int, j00.c):java.lang.Object");
    }

    public final Object j(boolean z11, j00.c<? super g2> cVar) {
        if (!z11) {
            return g2.f100423a;
        }
        Object a11 = this.f15264b.a(w3.g.l(), cVar);
        return a11 == kotlin.coroutines.intrinsics.b.l() ? a11 : g2.f100423a;
    }

    @m80.l
    public final Object k(int i11, boolean z11, @m80.k List<v0> list, @m80.k j00.c<? super g2> cVar) {
        Object g11 = s0.g(new c(z11, list, i11, null), cVar);
        return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
    }
}
