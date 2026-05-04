package p5;

import a00.h0;
import c40.r0;
import com.jiongji.andriod.card.R;
import com.microsoft.thrifty.service.a;
import j50.l1;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e0;
import kotlinx.coroutines.flow.x;
import l7.i0;
import y7.d;
import yz.g2;
import z8.b2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {p5.f.class})
@u0({"SMAP\nWinningStreakTaskRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WinningStreakTaskRepo.kt\ncom/baicizhan/app/biz/game/repo/incentive/WinningStreakTaskRepoImpl\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,223:1\n6#2:224\n64#3,2:225\n66#3:228\n67#3,2:234\n6#4:227\n124#5,4:229\n142#6:233\n1563#7:236\n1634#7,3:237\n*S KotlinDebug\n*F\n+ 1 WinningStreakTaskRepo.kt\ncom/baicizhan/app/biz/game/repo/incentive/WinningStreakTaskRepoImpl\n*L\n47#1:224\n47#1:225,2\n47#1:228\n47#1:234,2\n47#1:227\n47#1:229,4\n47#1:233\n198#1:236\n198#1:237,3\n*E\n"})
/* loaded from: classes3.dex */
public final class q implements p5.f {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l7.p f79045a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.preferences.a f79046b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.auth.r f79047c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final k50.a f79048d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final n40.a f79049e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final x<Boolean> f79050f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.incentive.WinningStreakTaskRepoImpl", f = "WinningStreakTaskRepo.kt", i = {0, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4}, l = {102, 103, 106, 107, 108}, m = "addLocalWinningDay", n = {"dateNumber", "dateNumber", "old", "list", "value", "dateNumber", "old", "list", "value", "dateNumber", "old", "list", "value", "dateNumber"}, s = {"J$0", "J$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "J$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f79051a;

        /* renamed from: b, reason: collision with root package name */
        public Object f79052b;

        /* renamed from: c, reason: collision with root package name */
        public Object f79053c;

        /* renamed from: d, reason: collision with root package name */
        public Object f79054d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f79055e;

        /* renamed from: g, reason: collision with root package name */
        public int f79057g;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f79055e = obj;
            this.f79057g |= Integer.MIN_VALUE;
            return q.this.r(0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.incentive.WinningStreakTaskRepoImpl", f = "WinningStreakTaskRepo.kt", i = {0, 1, 1, 2, 2}, l = {196, 198, 200}, m = "checkUpload", n = {"today", "local", "today", "local", "today"}, s = {"I$0", "L$0", "I$0", "L$0", "I$0"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f79058a;

        /* renamed from: b, reason: collision with root package name */
        public Object f79059b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f79060c;

        /* renamed from: e, reason: collision with root package name */
        public int f79062e;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f79060c = obj;
            this.f79062e |= Integer.MIN_VALUE;
            return q.this.s(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.incentive.WinningStreakTaskRepoImpl$checkUpload$3", f = "WinningStreakTaskRepo.kt", i = {}, l = {201}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f79063a;

        public c(j00.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return q.this.new c(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f79063a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                com.baicizhan.app.preferences.g u11 = q.this.u();
                this.f79063a = 1;
                if (u11.k(r.f79131f, okhttp3.i.f77289p, this) == l11) {
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
    @l00.d(c = "com.baicizhan.app.biz.game.repo.incentive.WinningStreakTaskRepoImpl", f = "WinningStreakTaskRepo.kt", i = {0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5}, l = {183, 185, 186, 187, 188, 190}, m = "fetch", n = {"today", "winningStreak", "$this$fetch_u24lambda_u240", "today", "$i$a$-apply-WinningStreakTaskRepoImpl$fetch$2", "winningStreak", "$this$fetch_u24lambda_u240", "today", "$i$a$-apply-WinningStreakTaskRepoImpl$fetch$2", "winningStreak", "$this$fetch_u24lambda_u240", "today", "$i$a$-apply-WinningStreakTaskRepoImpl$fetch$2", "winningStreak", "$this$fetch_u24lambda_u240", "today", "$i$a$-apply-WinningStreakTaskRepoImpl$fetch$2", "winningStreak", "today"}, s = {"I$0", "L$0", "L$2", "I$0", "I$1", "L$0", "L$2", "I$0", "I$1", "L$0", "L$2", "I$0", "I$1", "L$0", "L$2", "I$0", "I$1", "L$0", "I$0"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f79065a;

        /* renamed from: b, reason: collision with root package name */
        public int f79066b;

        /* renamed from: c, reason: collision with root package name */
        public Object f79067c;

        /* renamed from: d, reason: collision with root package name */
        public Object f79068d;

        /* renamed from: e, reason: collision with root package name */
        public Object f79069e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f79070f;

        /* renamed from: h, reason: collision with root package name */
        public int f79072h;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f79070f = obj;
            this.f79072h |= Integer.MIN_VALUE;
            return q.this.t(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.incentive.WinningStreakTaskRepoImpl$getFetchRemoteTime$2", f = "WinningStreakTaskRepo.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class e extends SuspendLambda implements x00.p<r0, j00.c<? super Long>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f79073a;

        public e(j00.c<? super e> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return q.this.new e(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super Long> cVar) {
            return ((e) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f79073a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            com.baicizhan.app.preferences.g u11 = q.this.u();
            this.f79073a = 1;
            Object h11 = u11.h(r.f79136k, 0L, this);
            return h11 == l11 ? l11 : h11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.incentive.WinningStreakTaskRepoImpl$getLastWinDate$2", f = "WinningStreakTaskRepo.kt", i = {1}, l = {138, 139}, m = "invokeSuspend", n = {"winnings"}, s = {"L$0"}, v = 1)
    public static final class f extends SuspendLambda implements x00.p<r0, j00.c<? super Long>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f79075a;

        /* renamed from: b, reason: collision with root package name */
        public int f79076b;

        public f(j00.c<? super f> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return q.this.new f(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super Long> cVar) {
            return ((f) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x002f, code lost:
        
            if (r7 == r0) goto L15;
         */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0069  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f79076b
                r2 = 0
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L24
                if (r1 == r5) goto L20
                if (r1 != r4) goto L18
                java.lang.Object r0 = r6.f79075a
                java.util.List r0 = (java.util.List) r0
                kotlin.e.n(r7)
                goto L49
            L18:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L20:
                kotlin.e.n(r7)
                goto L32
            L24:
                kotlin.e.n(r7)
                p5.q r7 = p5.q.this
                r6.f79076b = r5
                java.lang.Object r7 = p5.q.p(r7, r6)
                if (r7 != r0) goto L32
                goto L46
            L32:
                java.util.List r7 = (java.util.List) r7
                p5.q r1 = p5.q.this
                com.baicizhan.app.preferences.g r1 = p5.q.o(r1)
                r6.f79075a = r7
                r6.f79076b = r4
                java.lang.String r4 = "remote_winning_day"
                java.lang.Object r1 = r1.h(r4, r2, r6)
                if (r1 != r0) goto L47
            L46:
                return r0
            L47:
                r0 = r7
                r7 = r1
            L49:
                java.lang.Number r7 = (java.lang.Number) r7
                long r4 = r7.longValue()
                java.util.Collection r0 = (java.util.Collection) r0
                java.lang.Long r7 = l00.a.g(r4)
                java.util.List r7 = a00.g0.l(r7)
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.List r7 = a00.r0.I4(r0, r7)
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.lang.Comparable r7 = a00.r0.U3(r7)
                java.lang.Long r7 = (java.lang.Long) r7
                if (r7 == 0) goto L6d
                long r2 = r7.longValue()
            L6d:
                java.lang.Long r7 = l00.a.g(r2)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p5.q.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.incentive.WinningStreakTaskRepoImpl$getLocalWinningDay$2", f = "WinningStreakTaskRepo.kt", i = {0, 0, 0}, l = {120}, m = "invokeSuspend", n = {"$this$withContext", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-WinningStreakTaskRepoImpl$getLocalWinningDay$2$1"}, s = {"L$0", "L$2", "I$0"}, v = 1)
    @u0({"SMAP\nWinningStreakTaskRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WinningStreakTaskRepo.kt\ncom/baicizhan/app/biz/game/repo/incentive/WinningStreakTaskRepoImpl$getLocalWinningDay$2\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,223:1\n147#2:224\n*S KotlinDebug\n*F\n+ 1 WinningStreakTaskRepo.kt\ncom/baicizhan/app/biz/game/repo/incentive/WinningStreakTaskRepoImpl$getLocalWinningDay$2\n*L\n121#1:224\n*E\n"})
    public static final class g extends SuspendLambda implements x00.p<r0, j00.c<? super List<? extends Long>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f79078a;

        /* renamed from: b, reason: collision with root package name */
        public Object f79079b;

        /* renamed from: c, reason: collision with root package name */
        public int f79080c;

        /* renamed from: d, reason: collision with root package name */
        public int f79081d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f79082e;

        public g(j00.c<? super g> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            g gVar = q.this.new g(cVar);
            gVar.f79082e = obj;
            return gVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(r0 r0Var, j00.c<? super List<Long>> cVar) {
            return ((g) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m6308constructorimpl;
            q qVar;
            r0 r0Var = (r0) this.f79082e;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f79081d;
            try {
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    q qVar2 = q.this;
                    Result.a aVar = Result.Companion;
                    com.baicizhan.app.preferences.g u11 = qVar2.u();
                    this.f79082e = l00.k.a(r0Var);
                    this.f79078a = qVar2;
                    this.f79079b = l00.k.a(r0Var);
                    this.f79080c = 0;
                    this.f79081d = 1;
                    Object j11 = u11.j(r.f79131f, okhttp3.i.f77289p, this);
                    if (j11 == l11) {
                        return l11;
                    }
                    qVar = qVar2;
                    obj = j11;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    qVar = (q) this.f79078a;
                    kotlin.e.n(obj);
                }
                k50.a aVar2 = qVar.f79048d;
                aVar2.getSerializersModule();
                m6308constructorimpl = Result.m6308constructorimpl((List) aVar2.c(new j50.f(l1.f63406a), (String) obj));
            } catch (Throwable th2) {
                Result.a aVar3 = Result.Companion;
                m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
            }
            return Result.m6311exceptionOrNullimpl(m6308constructorimpl) == null ? m6308constructorimpl : h0.J();
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super List<? extends Long>> cVar) {
            return invoke2(r0Var, (j00.c<? super List<Long>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.incentive.WinningStreakTaskRepoImpl$getTasks$2", f = "WinningStreakTaskRepo.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class h extends SuspendLambda implements x00.p<r0, j00.c<? super Integer>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f79084a;

        public h(j00.c<? super h> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return q.this.new h(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super Integer> cVar) {
            return ((h) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f79084a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            com.baicizhan.app.preferences.g u11 = q.this.u();
            this.f79084a = 1;
            Object d11 = u11.d(r.f79134i, 0, this);
            return d11 == l11 ? l11 : d11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.incentive.WinningStreakTaskRepoImpl$getWinningStreakDays$2", f = "WinningStreakTaskRepo.kt", i = {}, l = {146}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class i extends SuspendLambda implements x00.p<r0, j00.c<? super Integer>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f79086a;

        public i(j00.c<? super i> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return q.this.new i(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super Integer> cVar) {
            return ((i) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f79086a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            com.baicizhan.app.preferences.g u11 = q.this.u();
            this.f79086a = 1;
            Object d11 = u11.d(r.f79133h, 0, this);
            return d11 == l11 ? l11 : d11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.incentive.WinningStreakTaskRepoImpl$localWinningStreakTime$2", f = "WinningStreakTaskRepo.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class j extends SuspendLambda implements x00.p<r0, j00.c<? super Long>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f79088a;

        public j(j00.c<? super j> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return q.this.new j(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super Long> cVar) {
            return ((j) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f79088a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            com.baicizhan.app.preferences.g u11 = q.this.u();
            this.f79088a = 1;
            Object h11 = u11.h(r.f79135j, 0L, this);
            return h11 == l11 ? l11 : h11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.incentive.WinningStreakTaskRepoImpl$setShowStreakConsumed$2", f = "WinningStreakTaskRepo.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class k extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f79090a;

        public k(j00.c<? super k> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return q.this.new k(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((k) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f79090a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                com.baicizhan.app.preferences.g u11 = q.this.u();
                this.f79090a = 1;
                if (u11.i(r.f79135j, 0L, this) == l11) {
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
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class l implements x00.l<w7.d<b2>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f79092a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f79093b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f79094c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f79095a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f79096b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f79097c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f79095a = eVar;
                this.f79096b = cVar;
                this.f79097c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f79095a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f79095a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f79096b.b(this.f79097c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public l(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f79092a = dVar;
            this.f79093b = eVar;
            this.f79094c = cVar;
        }

        public final void a(w7.d<b2> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f79093b, this.f79094c, this.f79092a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f79092a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<b2> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.incentive.WinningStreakTaskRepoImpl", f = "WinningStreakTaskRepo.kt", i = {0, 0, 0}, l = {171}, m = "sync", n = {"$this$sync_u24lambda_u240", "today", "$i$a$-runCatching-WinningStreakTaskRepoImpl$sync$2"}, s = {"L$0", "I$0", "I$1"}, v = 1)
    public static final class m extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f79098a;

        /* renamed from: b, reason: collision with root package name */
        public int f79099b;

        /* renamed from: c, reason: collision with root package name */
        public Object f79100c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f79101d;

        /* renamed from: f, reason: collision with root package name */
        public int f79103f;

        public m(j00.c<? super m> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f79101d = obj;
            this.f79103f |= Integer.MIN_VALUE;
            return q.this.a(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.incentive.WinningStreakTaskRepoImpl$sync$2$1", f = "WinningStreakTaskRepo.kt", i = {}, l = {172, 173}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class n extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f79104a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f79106c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(int i11, j00.c<? super n> cVar) {
            super(2, cVar);
            this.f79106c = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return q.this.new n(this.f79106c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((n) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
        
            if (r5.t(r1, r4) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        
            if (r5.s(r1, r4) == r0) goto L15;
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
                int r1 = r4.f79104a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r5)
                goto L3b
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                kotlin.e.n(r5)
                goto L2e
            L1e:
                kotlin.e.n(r5)
                p5.q r5 = p5.q.this
                int r1 = r4.f79106c
                r4.f79104a = r3
                java.lang.Object r5 = p5.q.l(r5, r1, r4)
                if (r5 != r0) goto L2e
                goto L3a
            L2e:
                p5.q r5 = p5.q.this
                int r1 = r4.f79106c
                r4.f79104a = r2
                java.lang.Object r5 = p5.q.m(r5, r1, r4)
                if (r5 != r0) goto L3b
            L3a:
                return r0
            L3b:
                yz.g2 r5 = yz.g2.f100423a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p5.q.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.incentive.WinningStreakTaskRepoImpl", f = "WinningStreakTaskRepo.kt", i = {0, 0, 1, 1}, l = {70, 73}, m = "wordsWinning", n = {"winningToady", "dateNumber", "winningToady", "dateNumber"}, s = {"L$0", "J$0", "L$0", "J$0"}, v = 1)
    public static final class o extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f79107a;

        /* renamed from: b, reason: collision with root package name */
        public Object f79108b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f79109c;

        /* renamed from: e, reason: collision with root package name */
        public int f79111e;

        public o(j00.c<? super o> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f79109c = obj;
            this.f79111e |= Integer.MIN_VALUE;
            return q.this.e(0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.incentive.WinningStreakTaskRepoImpl$wordsWinning$2", f = "WinningStreakTaskRepo.kt", i = {0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5}, l = {R.styleable.Theme_drawable_syncview_update, 76, 78, 80, 87, 88}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$i$f$withLock", "$this$withLock_u24default$iv", "$this$invokeSuspend_u24lambda_u240_u240", "$i$f$withLock", "$i$a$-withLock$default-WinningStreakTaskRepoImpl$wordsWinning$2$1", "$i$a$-apply-WinningStreakTaskRepoImpl$wordsWinning$2$1$1", "$this$withLock_u24default$iv", "$this$invokeSuspend_u24lambda_u240_u240", "$i$f$withLock", "$i$a$-withLock$default-WinningStreakTaskRepoImpl$wordsWinning$2$1", "$i$a$-apply-WinningStreakTaskRepoImpl$wordsWinning$2$1$1", "today", "$this$withLock_u24default$iv", "$this$invokeSuspend_u24lambda_u240_u240", "$i$f$withLock", "$i$a$-withLock$default-WinningStreakTaskRepoImpl$wordsWinning$2$1", "$i$a$-apply-WinningStreakTaskRepoImpl$wordsWinning$2$1$1", "today", "todayWinningCount", "$this$withLock_u24default$iv", "$this$invokeSuspend_u24lambda_u240_u240", "$i$f$withLock", "$i$a$-withLock$default-WinningStreakTaskRepoImpl$wordsWinning$2$1", "$i$a$-apply-WinningStreakTaskRepoImpl$wordsWinning$2$1$1", "today", "$this$withLock_u24default$iv", "$this$invokeSuspend_u24lambda_u240_u240", "$i$f$withLock", "$i$a$-withLock$default-WinningStreakTaskRepoImpl$wordsWinning$2$1", "$i$a$-apply-WinningStreakTaskRepoImpl$wordsWinning$2$1$1", "today"}, s = {"L$0", "I$0", "L$0", "L$3", "I$0", "I$1", "I$2", "L$0", "L$3", "I$0", "I$1", "I$2", "J$1", "L$0", "L$3", "I$0", "I$1", "I$2", "J$1", "I$3", "L$0", "L$2", "I$0", "I$1", "I$2", "J$1", "L$0", "L$2", "I$0", "I$1", "I$2", "J$1"}, v = 1)
    @u0({"SMAP\nWinningStreakTaskRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WinningStreakTaskRepo.kt\ncom/baicizhan/app/biz/game/repo/incentive/WinningStreakTaskRepoImpl$wordsWinning$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,223:1\n116#2,11:224\n*S KotlinDebug\n*F\n+ 1 WinningStreakTaskRepo.kt\ncom/baicizhan/app/biz/game/repo/incentive/WinningStreakTaskRepoImpl$wordsWinning$2\n*L\n74#1:224,11\n*E\n"})
    public static final class p extends SuspendLambda implements x00.p<r0, j00.c<? super com.baicizhan.app.preferences.g>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f79112a;

        /* renamed from: b, reason: collision with root package name */
        public Object f79113b;

        /* renamed from: c, reason: collision with root package name */
        public Object f79114c;

        /* renamed from: d, reason: collision with root package name */
        public Object f79115d;

        /* renamed from: e, reason: collision with root package name */
        public long f79116e;

        /* renamed from: f, reason: collision with root package name */
        public long f79117f;

        /* renamed from: g, reason: collision with root package name */
        public int f79118g;

        /* renamed from: h, reason: collision with root package name */
        public int f79119h;

        /* renamed from: i, reason: collision with root package name */
        public int f79120i;

        /* renamed from: j, reason: collision with root package name */
        public int f79121j;

        /* renamed from: k, reason: collision with root package name */
        public int f79122k;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ long f79124m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f79125n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(long j11, Ref.BooleanRef booleanRef, j00.c<? super p> cVar) {
            super(2, cVar);
            this.f79124m = j11;
            this.f79125n = booleanRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return q.this.new p(this.f79124m, this.f79125n, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super com.baicizhan.app.preferences.g> cVar) {
            return ((p) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0228  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x01b0 A[Catch: all -> 0x01b5, TryCatch #1 {all -> 0x01b5, blocks: (B:9:0x0229, B:18:0x0209, B:33:0x01b0, B:35:0x01bc, B:42:0x017a, B:44:0x0185, B:52:0x0147, B:54:0x0153, B:58:0x01ea, B:68:0x011f), top: B:67:0x011f }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0185 A[Catch: all -> 0x01b5, TryCatch #1 {all -> 0x01b5, blocks: (B:9:0x0229, B:18:0x0209, B:33:0x01b0, B:35:0x01bc, B:42:0x017a, B:44:0x0185, B:52:0x0147, B:54:0x0153, B:58:0x01ea, B:68:0x011f), top: B:67:0x011f }] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0153 A[Catch: all -> 0x01b5, TryCatch #1 {all -> 0x01b5, blocks: (B:9:0x0229, B:18:0x0209, B:33:0x01b0, B:35:0x01bc, B:42:0x017a, B:44:0x0185, B:52:0x0147, B:54:0x0153, B:58:0x01ea, B:68:0x011f), top: B:67:0x011f }] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x01ea A[Catch: all -> 0x01b5, TryCatch #1 {all -> 0x01b5, blocks: (B:9:0x0229, B:18:0x0209, B:33:0x01b0, B:35:0x01bc, B:42:0x017a, B:44:0x0185, B:52:0x0147, B:54:0x0153, B:58:0x01ea, B:68:0x011f), top: B:67:0x011f }] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x013e  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0140  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instructions count: 608
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p5.q.p.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public q(@m80.k l7.p thrift, @m80.k com.baicizhan.app.preferences.a factory, @m80.k com.baicizhan.app.biz.auth.r tokenProvider, @m80.k k50.a json) {
        g0.p(thrift, "thrift");
        g0.p(factory, "factory");
        g0.p(tokenProvider, "tokenProvider");
        g0.p(json, "json");
        this.f79045a = thrift;
        this.f79046b = factory;
        this.f79047c = tokenProvider;
        this.f79048d = json;
        this.f79049e = n40.g.b(false, 1, null);
        x<Boolean> a11 = e0.a(1, 0, BufferOverflow.DROP_OLDEST);
        a11.d(Boolean.TRUE);
        this.f79050f = a11;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:20|21))(3:22|23|(1:25))|12|13|(1:15)|16|17))|28|6|7|(0)(0)|12|13|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002d, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        r0 = kotlin.Result.Companion;
        r7 = kotlin.Result.m6308constructorimpl(kotlin.e.a(r7));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // p5.f
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k j00.c<? super yz.g2> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p5.q.m
            if (r0 == 0) goto L13
            r0 = r7
            p5.q$m r0 = (p5.q.m) r0
            int r1 = r0.f79103f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79103f = r1
            goto L18
        L13:
            p5.q$m r0 = new p5.q$m
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f79101d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f79103f
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f79100c
            p5.q r0 = (p5.q) r0
            kotlin.e.n(r7)     // Catch: java.lang.Throwable -> L2d
            goto L65
        L2d:
            r7 = move-exception
            goto L6c
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            kotlin.e.n(r7)
            long r4 = w3.g.l()
            int r7 = (int) r4
            kotlin.Result$a r2 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L2d
            c40.m0 r2 = c4.o.b()     // Catch: java.lang.Throwable -> L2d
            c40.x2 r4 = c40.x2.f8011a     // Catch: java.lang.Throwable -> L2d
            kotlin.coroutines.d r2 = r2.plus(r4)     // Catch: java.lang.Throwable -> L2d
            p5.q$n r4 = new p5.q$n     // Catch: java.lang.Throwable -> L2d
            r5 = 0
            r4.<init>(r7, r5)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r5 = l00.k.a(r6)     // Catch: java.lang.Throwable -> L2d
            r0.f79100c = r5     // Catch: java.lang.Throwable -> L2d
            r0.f79098a = r7     // Catch: java.lang.Throwable -> L2d
            r7 = 0
            r0.f79099b = r7     // Catch: java.lang.Throwable -> L2d
            r0.f79103f = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r7 = c40.i.h(r2, r4, r0)     // Catch: java.lang.Throwable -> L2d
            if (r7 != r1) goto L65
            return r1
        L65:
            yz.g2 r7 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r7 = kotlin.Result.m6308constructorimpl(r7)     // Catch: java.lang.Throwable -> L2d
            goto L76
        L6c:
            kotlin.Result$a r0 = kotlin.Result.Companion
            java.lang.Object r7 = kotlin.e.a(r7)
            java.lang.Object r7 = kotlin.Result.m6308constructorimpl(r7)
        L76:
            java.lang.Throwable r7 = kotlin.Result.m6311exceptionOrNullimpl(r7)
            if (r7 == 0) goto L85
            z6.b r0 = z6.b.f101032b
            java.lang.String r1 = "IWinningStreakTaskRepo"
            java.lang.String r2 = "sync failed"
            r0.e(r1, r2, r7)
        L85:
            yz.g2 r7 = yz.g2.f100423a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.q.a(j00.c):java.lang.Object");
    }

    @Override // p5.f
    @m80.l
    public Object b(@m80.k j00.c<? super Long> cVar) {
        return c40.i.h(c4.o.b(), new f(null), cVar);
    }

    @Override // p5.f
    @m80.l
    public Object c(@m80.k j00.c<? super Integer> cVar) {
        return c40.i.h(c4.o.b(), new i(null), cVar);
    }

    @Override // p5.f
    @m80.l
    public Object d(@m80.k j00.c<? super Long> cVar) {
        return c40.i.h(c4.o.b(), new e(null), cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        if (r13 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // p5.f
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(long r11, @m80.k j00.c<? super java.lang.Boolean> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof p5.q.o
            if (r0 == 0) goto L13
            r0 = r13
            p5.q$o r0 = (p5.q.o) r0
            int r1 = r0.f79111e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79111e = r1
            goto L18
        L13:
            p5.q$o r0 = new p5.q$o
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f79109c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f79111e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r11 = r0.f79108b
            kotlin.jvm.internal.Ref$BooleanRef r11 = (kotlin.jvm.internal.Ref.BooleanRef) r11
            kotlin.e.n(r13)
            goto L89
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L38:
            long r11 = r0.f79107a
            java.lang.Object r2 = r0.f79108b
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            kotlin.e.n(r13)
        L41:
            r6 = r11
            r8 = r2
            goto L59
        L44:
            kotlin.e.n(r13)
            kotlin.jvm.internal.Ref$BooleanRef r2 = new kotlin.jvm.internal.Ref$BooleanRef
            r2.<init>()
            r0.f79108b = r2
            r0.f79107a = r11
            r0.f79111e = r4
            java.lang.Object r13 = r10.b(r0)
            if (r13 != r1) goto L41
            goto L87
        L59:
            java.lang.Number r13 = (java.lang.Number) r13
            long r11 = r13.longValue()
            int r11 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r11 != 0) goto L6a
            boolean r11 = r8.element
            java.lang.Boolean r11 = l00.a.a(r11)
            return r11
        L6a:
            c40.m0 r11 = c4.o.b()
            c40.x2 r12 = c40.x2.f8011a
            kotlin.coroutines.d r11 = r11.plus(r12)
            p5.q$p r4 = new p5.q$p
            r9 = 0
            r5 = r10
            r4.<init>(r6, r8, r9)
            r0.f79108b = r8
            r0.f79107a = r6
            r0.f79111e = r3
            java.lang.Object r11 = c40.i.h(r11, r4, r0)
            if (r11 != r1) goto L88
        L87:
            return r1
        L88:
            r11 = r8
        L89:
            boolean r11 = r11.element
            java.lang.Boolean r11 = l00.a.a(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.q.e(long, j00.c):java.lang.Object");
    }

    @Override // p5.f
    @m80.l
    public Object f(@m80.k j00.c<? super g2> cVar) {
        Object h11 = c40.i.h(c4.o.b(), new k(null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }

    @Override // p5.f
    @m80.l
    public Object g(@m80.k j00.c<? super Long> cVar) {
        return c40.i.h(c4.o.b(), new j(null), cVar);
    }

    @Override // p5.f
    @m80.l
    public Object h(@m80.k j00.c<? super Integer> cVar) {
        return c40.i.h(c4.o.b(), new h(null), cVar);
    }

    @Override // p5.f
    @m80.k
    public kotlinx.coroutines.flow.i<Boolean> i() {
        return this.f79050f;
    }

    @Override // p5.f
    @m80.l
    public Object j(long j11, @m80.k j00.c<? super Boolean> cVar) {
        return r(j11, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
    
        if (r1 == r3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0092, code lost:
    
        if (r1 == r3) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(long r23, j00.c<? super java.lang.Boolean> r25) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.q.r(long, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00fe, code lost:
    
        if (c40.i.h(r1, r7, r2) != r3) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0062, code lost:
    
        if (r4 == r3) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(int r20, j00.c<? super yz.g2> r21) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.q.s(int, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x015a, code lost:
    
        if (r2.emit(r3, r0) != r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0121, code lost:
    
        if (r4.f(p5.r.f79134i, r12, r0) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0101, code lost:
    
        if (r4.f(p5.r.f79133h, r12, r0) != r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
    
        if (r12 == r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(int r11, j00.c<? super yz.g2> r12) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.q.t(int, j00.c):java.lang.Object");
    }

    public final com.baicizhan.app.preferences.g u() {
        com.baicizhan.app.preferences.a aVar = this.f79046b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("incentive_scope-");
        Long b11 = this.f79047c.b();
        g0.m(b11);
        sb2.append(b11.longValue());
        return aVar.a(sb2.toString());
    }

    public final Object v(j00.c<? super List<Long>> cVar) {
        return c40.i.h(c4.o.b(), new g(null), cVar);
    }

    public final b2 w() {
        return (b2) w7.f.b(new l(o0.d(b2.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }
}
