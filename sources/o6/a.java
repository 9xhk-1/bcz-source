package o6;

import a00.k1;
import c40.r0;
import com.baicizhan.app.biz.game.model.RoundType;
import com.baicizhan.client.business.dataset.provider.a;
import com.baicizhan.main.activity.ShowOffActivity;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.jiongji.andriod.card.R;
import com.microsoft.thrifty.service.a;
import f4.w2;
import h5.n0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Triple;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.i0;
import m3.g1;
import p8.q;
import p8.v0;
import y7.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
@u0({"SMAP\nCommitGameUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommitGameUC.kt\ncom/baicizhan/app/biz/game/uc/study/CommitGameUC\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,265:1\n6#2:266\n64#3,2:267\n66#3:270\n67#3,2:276\n6#4:269\n124#5,4:271\n142#6:275\n1#7:278\n1208#8,2:279\n1236#8,4:281\n1563#8:285\n1634#8,3:286\n*S KotlinDebug\n*F\n+ 1 CommitGameUC.kt\ncom/baicizhan/app/biz/game/uc/study/CommitGameUC\n*L\n68#1:266\n68#1:267,2\n68#1:270\n68#1:276,2\n68#1:269\n68#1:271,4\n68#1:275\n137#1:279,2\n137#1:281,4\n138#1:285\n138#1:286,3\n*E\n"})
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.gameround.e f75939a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final l7.p f75940b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final c6.b f75941c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.book.b f75942d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final o5.a f75943e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final q6.a f75944f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final p6.c f75945g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final p6.o f75946h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final r6.g f75947i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final p6.f f75948j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final m6.m f75949k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final m6.f f75950l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final o6.c f75951m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final p6.k f75952n;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.incentive.g f75953o;

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public final h6.b f75954p;

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public final z f75955q;

    /* renamed from: r, reason: collision with root package name */
    @m80.k
    public final g6.f f75956r;

    /* renamed from: s, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.uc.ipavatar.c f75957s;

    /* renamed from: t, reason: collision with root package name */
    @m80.k
    public final a6.a f75958t;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.study.CommitGameUC", f = "CommitGameUC.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6}, l = {188, 190, 192, 200, 202, 204, R.styleable.Theme_drawable_reset_plan}, m = "commitWithRetry", n = {"gameId", "commiter", "$this$commitWithRetry_u24lambda_u240", "bookId", "$i$a$-runCatching-CommitGameUC$commitWithRetry$2", "gameId", "commiter", "$this$commitWithRetry_u24lambda_u240", "bookId", "$i$a$-runCatching-CommitGameUC$commitWithRetry$2", "gameId", "commiter", "$this$commitWithRetry_u24lambda_u240", "bookId", "$i$a$-runCatching-CommitGameUC$commitWithRetry$2", "currentVersion", "gameId", "commiter", "it", "bookId", "$i$a$-recoverCatching-CommitGameUC$commitWithRetry$3", "gameId", "commiter", "it", "bookId", "$i$a$-recoverCatching-CommitGameUC$commitWithRetry$3", "gameId", "commiter", "it", "bookId", "$i$a$-recoverCatching-CommitGameUC$commitWithRetry$3", "retryVersion", "gameId", "commiter", "it", "$this$commitWithRetry_u24lambda_u241_u240", "bookId", "$i$a$-recoverCatching-CommitGameUC$commitWithRetry$3", "$i$a$-runCatching-CommitGameUC$commitWithRetry$3$1"}, s = {"L$0", "L$1", "L$2", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0", "I$0", "J$1", "L$0", "L$1", "L$2", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0", "I$0", "J$1", "L$0", "L$1", "L$2", "L$3", "J$0", "I$0", "I$1"}, v = 1)
    /* renamed from: o6.a$a, reason: collision with other inner class name */
    public static final class C0928a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f75959a;

        /* renamed from: b, reason: collision with root package name */
        public long f75960b;

        /* renamed from: c, reason: collision with root package name */
        public Object f75961c;

        /* renamed from: d, reason: collision with root package name */
        public Object f75962d;

        /* renamed from: e, reason: collision with root package name */
        public Object f75963e;

        /* renamed from: f, reason: collision with root package name */
        public Object f75964f;

        /* renamed from: g, reason: collision with root package name */
        public int f75965g;

        /* renamed from: h, reason: collision with root package name */
        public int f75966h;

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f75967i;

        /* renamed from: k, reason: collision with root package name */
        public int f75969k;

        public C0928a(j00.c<? super C0928a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f75967i = obj;
            this.f75969k |= Integer.MIN_VALUE;
            return a.this.j(0L, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.study.CommitGameUC$createRemoteCommiter$1", f = "CommitGameUC.kt", i = {0}, l = {244}, m = "invokeSuspend", n = {"version"}, s = {"J$0"}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<Long, j00.c<? super p8.r>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f75970a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ long f75971b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f75972c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a f75973d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f75974e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ List<v0> f75975f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f75976g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f75977h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f75978i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, a aVar, int i11, List<v0> list, int i12, int i13, int i14, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f75972c = str;
            this.f75973d = aVar;
            this.f75974e = i11;
            this.f75975f = list;
            this.f75976g = i12;
            this.f75977h = i13;
            this.f75978i = i14;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            b bVar = new b(this.f75972c, this.f75973d, this.f75974e, this.f75975f, this.f75976g, this.f75977h, this.f75978i, cVar);
            bVar.f75971b = ((Number) obj).longValue();
            return bVar;
        }

        public final Object i(long j11, j00.c<? super p8.r> cVar) {
            return ((b) create(Long.valueOf(j11), cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(Long l11, j00.c<? super p8.r> cVar) {
            return i(l11.longValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            long j11 = this.f75971b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f75970a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                z6.b.j(z6.b.f101032b, o6.b.f76023a, "executing remote commit - gameId: " + this.f75972c + ", version: " + j11, null, 4, null);
                p8.s l12 = this.f75973d.l();
                p8.q build = new q.a().f(this.f75972c).g(this.f75974e).e(j11).h(this.f75975f).c(this.f75976g).b(this.f75977h).d(l00.a.f(this.f75978i)).build();
                this.f75971b = j11;
                this.f75970a = 1;
                obj = l12.g1(build, this);
                if (obj == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            p8.r rVar = (p8.r) obj;
            z6.b.j(z6.b.f101032b, o6.b.f76023a, "remote commit success - gameId: " + this.f75972c + ", responseVersion: " + rVar.f80090c, null, 4, null);
            return rVar;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.study.CommitGameUC", f = "CommitGameUC.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, l = {76, 82, 113, 118}, m = "invoke", n = {"gameId", "wordList", "enterDay", "starCount", "gameId", "wordList", "$this$invoke_u24lambda_u240", "enterDay", "starCount", "maxCombo", "$i$a$-runCatching-CommitGameUC$invoke$gameInfo$1", "gameId", "wordList", "gameInfo", "studyRecords", "wordListRemote", "commiter", "enterDay", "starCount", "maxCombo", "accuracy", a.b.C0242a.f16107c, "gameId", "wordList", "gameInfo", "studyRecords", "wordListRemote", "commiter", HiAnalyticsConstant.Direction.RESPONSE, "enterDay", "starCount", "maxCombo", "accuracy", a.b.C0242a.f16107c}, s = {"L$0", "L$1", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "I$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f75979a;

        /* renamed from: b, reason: collision with root package name */
        public Object f75980b;

        /* renamed from: c, reason: collision with root package name */
        public Object f75981c;

        /* renamed from: d, reason: collision with root package name */
        public Object f75982d;

        /* renamed from: e, reason: collision with root package name */
        public Object f75983e;

        /* renamed from: f, reason: collision with root package name */
        public Object f75984f;

        /* renamed from: g, reason: collision with root package name */
        public Object f75985g;

        /* renamed from: h, reason: collision with root package name */
        public long f75986h;

        /* renamed from: i, reason: collision with root package name */
        public int f75987i;

        /* renamed from: j, reason: collision with root package name */
        public int f75988j;

        /* renamed from: k, reason: collision with root package name */
        public int f75989k;

        /* renamed from: l, reason: collision with root package name */
        public int f75990l;

        /* renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f75991m;

        /* renamed from: o, reason: collision with root package name */
        public int f75993o;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f75991m = obj;
            this.f75993o |= Integer.MIN_VALUE;
            return a.this.m(null, null, 0L, 0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.study.CommitGameUC$invoke$2", f = "CommitGameUC.kt", i = {0, 0, 0, 1, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5}, l = {120, 124, 125, 127, 128, 129}, m = "invokeSuspend", n = {"$this$withContext", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-CommitGameUC$invoke$2$1", "$this$withContext", "$this$withContext", "$this$withContext", ShowOffActivity.f18169n, "comboStarReward", "box", "$this$withContext", ShowOffActivity.f18169n, "comboStarReward", "box", "$this$withContext", ShowOffActivity.f18169n, "comboStarReward", "box"}, s = {"L$0", "L$1", "I$0", "L$0", "L$0", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"}, v = 1)
    @u0({"SMAP\nCommitGameUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommitGameUC.kt\ncom/baicizhan/app/biz/game/uc/study/CommitGameUC$invoke$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,265:1\n1#2:266\n*E\n"})
    public static final class d extends SuspendLambda implements x00.p<r0, j00.c<? super Triple<? extends List<? extends m3.v0>, ? extends n0, ? extends p8.r>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f75994a;

        /* renamed from: b, reason: collision with root package name */
        public Object f75995b;

        /* renamed from: c, reason: collision with root package name */
        public Object f75996c;

        /* renamed from: d, reason: collision with root package name */
        public Object f75997d;

        /* renamed from: e, reason: collision with root package name */
        public int f75998e;

        /* renamed from: f, reason: collision with root package name */
        public int f75999f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f76000g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f76001h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ a f76002i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ h5.m f76003j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ List<w2> f76004k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ long f76005l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ p8.r f76006m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, a aVar, h5.m mVar, List<w2> list, long j11, p8.r rVar, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f76001h = str;
            this.f76002i = aVar;
            this.f76003j = mVar;
            this.f76004k = list;
            this.f76005l = j11;
            this.f76006m = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            d dVar = new d(this.f76001h, this.f76002i, this.f76003j, this.f76004k, this.f76005l, this.f76006m, cVar);
            dVar.f76000g = obj;
            return dVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(r0 r0Var, j00.c<? super Triple<? extends List<m3.v0>, n0, p8.r>> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x01bd, code lost:
        
            if (r15 != r2) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0105, code lost:
        
            if (r15.p(r0, r3, r14) == r2) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00ee, code lost:
        
            if (r4.a(r5, r6, r7, r9) != r2) goto L30;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x018d  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00a9  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 474
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o6.a.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super Triple<? extends List<? extends m3.v0>, ? extends n0, ? extends p8.r>> cVar) {
            return invoke2(r0Var, (j00.c<? super Triple<? extends List<m3.v0>, n0, p8.r>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class e implements x00.l<w7.d<p8.s>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f76007a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f76008b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f76009c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        /* renamed from: o6.a$e$a, reason: collision with other inner class name */
        public static final class C0929a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f76010a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f76011b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f76012c;

            public C0929a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f76010a = eVar;
                this.f76011b = cVar;
                this.f76012c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f76010a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f76010a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f76011b.b(this.f76012c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public e(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f76007a = dVar;
            this.f76008b = eVar;
            this.f76009c = cVar;
        }

        public final void a(w7.d<p8.s> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new C0929a(this.f76008b, this.f76009c, this.f76007a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f76007a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<p8.s> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.study.CommitGameUC", f = "CommitGameUC.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6}, l = {160, 165, 166, 170, 173, 175, 176}, m = "updateLocalData", n = {"gameRound", HiAnalyticsConstant.Direction.RESPONSE, "it", "bookId", "$i$a$-also-CommitGameUC$updateLocalData$2", "gameRound", HiAnalyticsConstant.Direction.RESPONSE, "it", "bookId", "$i$a$-also-CommitGameUC$updateLocalData$3", "gameRound", HiAnalyticsConstant.Direction.RESPONSE, "it", "bookId", "$i$a$-also-CommitGameUC$updateLocalData$3", "gameRound", HiAnalyticsConstant.Direction.RESPONSE, "bookId", "gameRound", HiAnalyticsConstant.Direction.RESPONSE, "bookId", "gameRound", HiAnalyticsConstant.Direction.RESPONSE, "bookId", "gameRound", HiAnalyticsConstant.Direction.RESPONSE, "bookId"}, s = {"L$0", "L$1", "L$3", "J$0", "I$0", "L$0", "L$1", "L$3", "J$0", "I$0", "L$0", "L$1", "L$3", "J$0", "I$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0"}, v = 1)
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f76013a;

        /* renamed from: b, reason: collision with root package name */
        public Object f76014b;

        /* renamed from: c, reason: collision with root package name */
        public Object f76015c;

        /* renamed from: d, reason: collision with root package name */
        public Object f76016d;

        /* renamed from: e, reason: collision with root package name */
        public long f76017e;

        /* renamed from: f, reason: collision with root package name */
        public int f76018f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f76019g;

        /* renamed from: i, reason: collision with root package name */
        public int f76021i;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f76019g = obj;
            this.f76021i |= Integer.MIN_VALUE;
            return a.this.p(null, null, this);
        }
    }

    public a(@m80.k com.baicizhan.app.biz.game.repo.gameround.e gameRoundRepo, @m80.k l7.p thrift, @m80.k c6.b usrRepo, @m80.k com.baicizhan.app.biz.game.repo.book.b gameBookRepo, @m80.k o5.a versionProvider, @m80.k q6.a refreshStudyDataUC, @m80.k p6.c calculateAccuracyUC, @m80.k p6.o processStudyResultUC, @m80.k r6.g checkUpdateStudyRecordUC, @m80.k p6.f calculateRankScoreUC, @m80.k m6.m extractGameRewardsUC, @m80.k m6.f addWordsGameRewardUC, @m80.k o6.c commitLocal, @m80.k p6.k getStudyProgressUC, @m80.k com.baicizhan.app.biz.game.uc.incentive.g completeWinningStreakUC, @m80.k h6.b updateGameRoundUC, @m80.k z skipSpellingIfDisabledUC, @m80.k g6.f getCurComboUC, @m80.k com.baicizhan.app.biz.game.uc.ipavatar.c fetchIpAvatarHomeUC, @m80.k a6.a studyRoundStatsRepo) {
        g0.p(gameRoundRepo, "gameRoundRepo");
        g0.p(thrift, "thrift");
        g0.p(usrRepo, "usrRepo");
        g0.p(gameBookRepo, "gameBookRepo");
        g0.p(versionProvider, "versionProvider");
        g0.p(refreshStudyDataUC, "refreshStudyDataUC");
        g0.p(calculateAccuracyUC, "calculateAccuracyUC");
        g0.p(processStudyResultUC, "processStudyResultUC");
        g0.p(checkUpdateStudyRecordUC, "checkUpdateStudyRecordUC");
        g0.p(calculateRankScoreUC, "calculateRankScoreUC");
        g0.p(extractGameRewardsUC, "extractGameRewardsUC");
        g0.p(addWordsGameRewardUC, "addWordsGameRewardUC");
        g0.p(commitLocal, "commitLocal");
        g0.p(getStudyProgressUC, "getStudyProgressUC");
        g0.p(completeWinningStreakUC, "completeWinningStreakUC");
        g0.p(updateGameRoundUC, "updateGameRoundUC");
        g0.p(skipSpellingIfDisabledUC, "skipSpellingIfDisabledUC");
        g0.p(getCurComboUC, "getCurComboUC");
        g0.p(fetchIpAvatarHomeUC, "fetchIpAvatarHomeUC");
        g0.p(studyRoundStatsRepo, "studyRoundStatsRepo");
        this.f75939a = gameRoundRepo;
        this.f75940b = thrift;
        this.f75941c = usrRepo;
        this.f75942d = gameBookRepo;
        this.f75943e = versionProvider;
        this.f75944f = refreshStudyDataUC;
        this.f75945g = calculateAccuracyUC;
        this.f75946h = processStudyResultUC;
        this.f75947i = checkUpdateStudyRecordUC;
        this.f75948j = calculateRankScoreUC;
        this.f75949k = extractGameRewardsUC;
        this.f75950l = addWordsGameRewardUC;
        this.f75951m = commitLocal;
        this.f75952n = getStudyProgressUC;
        this.f75953o = completeWinningStreakUC;
        this.f75954p = updateGameRoundUC;
        this.f75955q = skipSpellingIfDisabledUC;
        this.f75956r = getCurComboUC;
        this.f75957s = fetchIpAvatarHomeUC;
        this.f75958t = studyRoundStatsRepo;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|128|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0061, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x00cd, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x00ce, code lost:
    
        r2 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x00ce: MOVE (r2 I:??[long, double]) = (r9 I:??[long, double]) (LINE:207), block:B:127:0x00ce */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0323 A[Catch: all -> 0x0061, TryCatch #2 {all -> 0x0061, blocks: (B:16:0x031d, B:18:0x0323, B:19:0x032a, B:20:0x0338, B:23:0x0313, B:25:0x005c, B:26:0x028f, B:36:0x023f, B:45:0x0093, B:47:0x0218, B:58:0x01bf, B:60:0x01c5, B:62:0x01d0, B:66:0x0297, B:68:0x02b0, B:70:0x02b7, B:71:0x02bd, B:73:0x02d7, B:83:0x0339), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01bf A[Catch: all -> 0x0061, TRY_ENTER, TryCatch #2 {all -> 0x0061, blocks: (B:16:0x031d, B:18:0x0323, B:19:0x032a, B:20:0x0338, B:23:0x0313, B:25:0x005c, B:26:0x028f, B:36:0x023f, B:45:0x0093, B:47:0x0218, B:58:0x01bf, B:60:0x01c5, B:62:0x01d0, B:66:0x0297, B:68:0x02b0, B:70:0x02b7, B:71:0x02bd, B:73:0x02d7, B:83:0x0339), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v34, types: [x00.p] */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(long r23, java.lang.String r25, x00.p<? super java.lang.Long, ? super j00.c<? super p8.r>, ? extends java.lang.Object> r26, j00.c<? super p8.r> r27) {
        /*
            Method dump skipped, instructions count: 896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.a.j(long, java.lang.String, x00.p, j00.c):java.lang.Object");
    }

    @m80.k
    public final x00.p<Long, j00.c<? super p8.r>, Object> k(@m80.k String gameId, @m80.k List<v0> wordList, int i11, int i12, int i13, int i14) {
        g0.p(gameId, "gameId");
        g0.p(wordList, "wordList");
        z6.b.j(z6.b.f101032b, o6.b.f76023a, "create remote commiter - gameId: " + gameId + ", wordCount: " + wordList.size() + ", maxCombo: " + i11 + ", accuracy: " + i12 + ", scores: " + i13, null, 4, null);
        return new b(gameId, this, i13, wordList, i12, i11, i14, null);
    }

    public final p8.s l() {
        return (p8.s) w7.f.b(new e(o0.d(p8.s.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:(1:(1:(2:13|14)(2:16|17))(3:18|19|(1:21)(1:22)))(7:23|24|25|26|27|28|(3:30|(3:32|19|(0))|21)(2:33|34)))(1:38))(1:47)|39|40|41|(5:43|26|27|28|(0)(0))|21))|49|6|7|(0)(0)|39|40|41|(0)|21) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0160, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0161, code lost:
    
        r3 = r10;
        r21 = r6;
        r7 = r2;
        r2 = r4;
        r6 = r5;
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00dd, code lost:
    
        if (r0 == r9) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(@m80.k java.lang.String r24, @m80.k java.util.List<m3.g1> r25, long r26, int r28, @m80.k j00.c<? super kotlin.Triple<? extends java.util.List<m3.v0>, h5.n0, p8.r>> r29) {
        /*
            Method dump skipped, instructions count: 741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.a.m(java.lang.String, java.util.List, long, int, j00.c):java.lang.Object");
    }

    public final List<v0> n(List<w2> list, List<g1> list2) {
        v0 c11;
        List<g1> list3 = list2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(a00.i0.d0(list3, 10)), 16));
        for (Object obj : list3) {
            linkedHashMap.put(Integer.valueOf(((g1) obj).s()), obj);
        }
        List<w2> list4 = list;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list4, 10));
        for (w2 w2Var : list4) {
            g1 g1Var = (g1) linkedHashMap.get(Integer.valueOf((int) w2Var.q()));
            if (g1Var == null || (c11 = z5.a.b(w2Var, g1Var.k(), g1Var.m(), g1Var.u())) == null) {
                c11 = z5.a.c(w2Var, 0, 0, 0, 7, null);
            }
            arrayList.add(c11);
        }
        return arrayList;
    }

    public final Object o(long j11, long j12, long j13, j00.c<? super g2> cVar) {
        if (j13 != RoundType.SPELLING.getValue()) {
            return g2.f100423a;
        }
        Object a11 = this.f75955q.a(j11, j12, cVar);
        return a11 == kotlin.coroutines.intrinsics.b.l() ? a11 : g2.f100423a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x025b, code lost:
    
        if (r2.d(r10) == r3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0241, code lost:
    
        if (r2.a(r7, r10) != r3) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01ca, code lost:
    
        if (r4.b(r5, r7, r8, r10) == r3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0170, code lost:
    
        if (r9.d(r1, r10) != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0117, code lost:
    
        if (r2 != null) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(h5.m r20, p8.r r21, j00.c<? super yz.g2> r22) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.a.p(h5.m, p8.r, j00.c):java.lang.Object");
    }
}
