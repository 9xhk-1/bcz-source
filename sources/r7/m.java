package r7;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.microsoft.thrifty.service.a;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.i0;
import l7.p;
import oa0.r;
import p7.l0;
import p7.w;
import y7.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {r7.h.class})
@u0({"SMAP\nIUserBookWordsRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IUserBookWordsRepo.kt\ncom/baicizhan/app/biz/userbook/repo/UserBookWordsRepoImpl\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n6#2:154\n64#3,2:155\n66#3:158\n67#3,2:164\n6#4:157\n124#5,4:159\n142#6:163\n1563#7:166\n1634#7,3:167\n1563#7:170\n1634#7,3:171\n1563#7:174\n1634#7,3:175\n1563#7:178\n1634#7,3:179\n1222#7,2:182\n1252#7,4:184\n1563#7:188\n1634#7,3:189\n1563#7:192\n1634#7,3:193\n*S KotlinDebug\n*F\n+ 1 IUserBookWordsRepo.kt\ncom/baicizhan/app/biz/userbook/repo/UserBookWordsRepoImpl\n*L\n37#1:154\n37#1:155,2\n37#1:158\n37#1:164,2\n37#1:157\n37#1:159,4\n37#1:163\n59#1:166\n59#1:167,3\n77#1:170\n77#1:171,3\n88#1:174\n88#1:175,3\n100#1:178\n100#1:179,3\n117#1:182,2\n117#1:184,4\n123#1:188\n123#1:189,3\n124#1:192\n124#1:193,3\n*E\n"})
/* loaded from: classes3.dex */
public final class m implements r7.h {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final v3.b f83475a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final p f83476b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.repo.UserBookWordsRepoImpl", f = "IUserBookWordsRepo.kt", i = {0, 0, 1, 1}, l = {83, 83}, m = "addWord", n = {"wordDetail", "userBookId", "wordDetail", "userBookId"}, s = {"L$0", "J$0", "L$0", "J$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f83477a;

        /* renamed from: b, reason: collision with root package name */
        public Object f83478b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f83479c;

        /* renamed from: e, reason: collision with root package name */
        public int f83481e;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f83479c = obj;
            this.f83481e |= Integer.MIN_VALUE;
            return m.this.f(0L, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.repo.UserBookWordsRepoImpl", f = "IUserBookWordsRepo.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 2, 2}, l = {88, 89, 90}, m = "addWordsToBook", n = {xd.a.f98002r, "userBookId", xd.a.f98002r, HiAnalyticsConstant.Direction.RESPONSE, "userBookId", xd.a.f98002r, HiAnalyticsConstant.Direction.RESPONSE, "$this$addWordsToBook_u24lambda_u241", "userBookId", "$i$a$-apply-UserBookWordsRepoImpl$addWordsToBook$2"}, s = {"L$0", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "L$3", "J$0", "I$0"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f83482a;

        /* renamed from: b, reason: collision with root package name */
        public Object f83483b;

        /* renamed from: c, reason: collision with root package name */
        public Object f83484c;

        /* renamed from: d, reason: collision with root package name */
        public Object f83485d;

        /* renamed from: e, reason: collision with root package name */
        public Object f83486e;

        /* renamed from: f, reason: collision with root package name */
        public int f83487f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f83488g;

        /* renamed from: i, reason: collision with root package name */
        public int f83490i;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f83488g = obj;
            this.f83490i |= Integer.MIN_VALUE;
            return m.this.b(0L, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.repo.UserBookWordsRepoImpl$addWordsToBook$2$1", f = "IUserBookWordsRepo.kt", i = {0, 0, 0, 0, 0}, l = {92}, m = "invokeSuspend", n = {"$this$forEach$iv", "element$iv", "addWord", "$i$f$forEach", "$i$a$-forEach-UserBookWordsRepoImpl$addWordsToBook$2$1$1"}, s = {"L$0", "L$3", "L$4", "I$0", "I$1"}, v = 1)
    @u0({"SMAP\nIUserBookWordsRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IUserBookWordsRepo.kt\ncom/baicizhan/app/biz/userbook/repo/UserBookWordsRepoImpl$addWordsToBook$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n1869#2,2:154\n*S KotlinDebug\n*F\n+ 1 IUserBookWordsRepo.kt\ncom/baicizhan/app/biz/userbook/repo/UserBookWordsRepoImpl$addWordsToBook$2$1\n*L\n91#1:154,2\n*E\n"})
    public static final class c extends SuspendLambda implements x00.p<j.r, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f83491a;

        /* renamed from: b, reason: collision with root package name */
        public Object f83492b;

        /* renamed from: c, reason: collision with root package name */
        public Object f83493c;

        /* renamed from: d, reason: collision with root package name */
        public Object f83494d;

        /* renamed from: e, reason: collision with root package name */
        public Object f83495e;

        /* renamed from: f, reason: collision with root package name */
        public long f83496f;

        /* renamed from: g, reason: collision with root package name */
        public int f83497g;

        /* renamed from: h, reason: collision with root package name */
        public int f83498h;

        /* renamed from: i, reason: collision with root package name */
        public int f83499i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ y8.b f83500j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ l0 f83501k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ long f83502l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(y8.b bVar, l0 l0Var, long j11, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f83500j = bVar;
            this.f83501k = l0Var;
            this.f83502l = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new c(this.f83500j, this.f83501k, this.f83502l, cVar);
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(j.r rVar, j00.c<? super g2> cVar) {
            return ((c) create(rVar, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            long j11;
            Iterator it;
            Iterable iterable;
            l0 l0Var;
            int i11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i12 = this.f83499i;
            if (i12 == 0) {
                kotlin.e.n(obj);
                List<y8.k> list = this.f83500j.f99520b;
                l0 l0Var2 = this.f83501k;
                j11 = this.f83502l;
                it = list.iterator();
                iterable = list;
                l0Var = l0Var2;
                i11 = 0;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = this.f83497g;
                j11 = this.f83496f;
                it = (Iterator) this.f83493c;
                l0Var = (l0) this.f83492b;
                iterable = (Iterable) this.f83491a;
                kotlin.e.n(obj);
            }
            while (it.hasNext()) {
                Object next = it.next();
                y8.k kVar = (y8.k) next;
                w a11 = r7.i.a(kVar, j11);
                this.f83491a = l00.k.a(iterable);
                this.f83492b = l0Var;
                this.f83493c = it;
                this.f83494d = l00.k.a(next);
                this.f83495e = l00.k.a(kVar);
                this.f83496f = j11;
                this.f83497g = i11;
                this.f83498h = 0;
                this.f83499i = 1;
                if (l0Var.m0(a11, this) == l11) {
                    return l11;
                }
            }
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.repo.UserBookWordsRepoImpl", f = "IUserBookWordsRepo.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 2, 2}, l = {100, 101, 102}, m = "addWordsToBooks", n = {"userBookIds", xd.a.f98002r, "userBookIds", xd.a.f98002r, HiAnalyticsConstant.Direction.RESPONSE, "userBookIds", xd.a.f98002r, HiAnalyticsConstant.Direction.RESPONSE, "$this$addWordsToBooks_u24lambda_u241", "$i$a$-apply-UserBookWordsRepoImpl$addWordsToBooks$2"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$4", "I$0"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f83503a;

        /* renamed from: b, reason: collision with root package name */
        public Object f83504b;

        /* renamed from: c, reason: collision with root package name */
        public Object f83505c;

        /* renamed from: d, reason: collision with root package name */
        public Object f83506d;

        /* renamed from: e, reason: collision with root package name */
        public Object f83507e;

        /* renamed from: f, reason: collision with root package name */
        public int f83508f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f83509g;

        /* renamed from: i, reason: collision with root package name */
        public int f83511i;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f83509g = obj;
            this.f83511i |= Integer.MIN_VALUE;
            return m.this.j(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.repo.UserBookWordsRepoImpl$addWordsToBooks$2$1", f = "IUserBookWordsRepo.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {105}, m = "invokeSuspend", n = {"$this$forEach$iv", "element$iv", "word", "$this$forEach$iv", "element$iv", "$i$f$forEach", "$i$a$-forEach-UserBookWordsRepoImpl$addWordsToBooks$2$1$1", "$i$f$forEach", "ubId", "$i$a$-forEach-UserBookWordsRepoImpl$addWordsToBooks$2$1$1$1"}, s = {"L$0", "L$4", "L$5", "L$6", "L$8", "I$0", "I$1", "I$2", "J$0", "I$3"}, v = 1)
    @u0({"SMAP\nIUserBookWordsRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IUserBookWordsRepo.kt\ncom/baicizhan/app/biz/userbook/repo/UserBookWordsRepoImpl$addWordsToBooks$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n1869#2:154\n1869#2,2:155\n1870#2:157\n*S KotlinDebug\n*F\n+ 1 IUserBookWordsRepo.kt\ncom/baicizhan/app/biz/userbook/repo/UserBookWordsRepoImpl$addWordsToBooks$2$1\n*L\n103#1:154\n104#1:155,2\n103#1:157\n*E\n"})
    public static final class e extends SuspendLambda implements x00.p<j.r, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f83512a;

        /* renamed from: b, reason: collision with root package name */
        public Object f83513b;

        /* renamed from: c, reason: collision with root package name */
        public Object f83514c;

        /* renamed from: d, reason: collision with root package name */
        public Object f83515d;

        /* renamed from: e, reason: collision with root package name */
        public Object f83516e;

        /* renamed from: f, reason: collision with root package name */
        public Object f83517f;

        /* renamed from: g, reason: collision with root package name */
        public Object f83518g;

        /* renamed from: h, reason: collision with root package name */
        public Object f83519h;

        /* renamed from: i, reason: collision with root package name */
        public Object f83520i;

        /* renamed from: j, reason: collision with root package name */
        public int f83521j;

        /* renamed from: k, reason: collision with root package name */
        public int f83522k;

        /* renamed from: l, reason: collision with root package name */
        public int f83523l;

        /* renamed from: m, reason: collision with root package name */
        public int f83524m;

        /* renamed from: n, reason: collision with root package name */
        public long f83525n;

        /* renamed from: o, reason: collision with root package name */
        public int f83526o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ y8.c f83527p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ List<Long> f83528q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ l0 f83529r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(y8.c cVar, List<Long> list, l0 l0Var, j00.c<? super e> cVar2) {
            super(2, cVar2);
            this.f83527p = cVar;
            this.f83528q = list;
            this.f83529r = l0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new e(this.f83527p, this.f83528q, this.f83529r, cVar);
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(j.r rVar, j00.c<? super g2> cVar) {
            return ((e) create(rVar, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x00d1  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00db  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0080  */
        /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Iterable] */
        /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Iterable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x00cb -> B:5:0x00cf). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0064 -> B:6:0x007a). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 222
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: r7.m.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.repo.UserBookWordsRepoImpl", f = "IUserBookWordsRepo.kt", i = {0, 1}, l = {66, 66}, m = "deleteAllWordsLocal", n = {"userBookId", "userBookId"}, s = {"J$0", "J$0"}, v = 1)
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f83530a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f83531b;

        /* renamed from: d, reason: collision with root package name */
        public int f83533d;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f83531b = obj;
            this.f83533d |= Integer.MIN_VALUE;
            return m.this.g(0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.repo.UserBookWordsRepoImpl", f = "IUserBookWordsRepo.kt", i = {0, 0, 1, 1}, l = {71, 71}, m = "deleteWordLocal", n = {"userBookId", "topicId", "userBookId", "topicId"}, s = {"J$0", "I$0", "J$0", "I$0"}, v = 1)
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f83534a;

        /* renamed from: b, reason: collision with root package name */
        public int f83535b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f83536c;

        /* renamed from: e, reason: collision with root package name */
        public int f83538e;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f83536c = obj;
            this.f83538e |= Integer.MIN_VALUE;
            return m.this.d(0L, 0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.repo.UserBookWordsRepoImpl", f = "IUserBookWordsRepo.kt", i = {0, 0, 1, 1, 1, 2, 2, 2}, l = {76, 77, 77}, m = "deleteWords", n = {"topicIds", "userBookId", "topicIds", "item", "userBookId", "topicIds", "item", "userBookId"}, s = {"L$0", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0"}, v = 1)
    public static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f83539a;

        /* renamed from: b, reason: collision with root package name */
        public Object f83540b;

        /* renamed from: c, reason: collision with root package name */
        public Object f83541c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f83542d;

        /* renamed from: f, reason: collision with root package name */
        public int f83544f;

        public h(j00.c<? super h> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f83542d = obj;
            this.f83544f |= Integer.MIN_VALUE;
            return m.this.e(0L, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.repo.UserBookWordsRepoImpl", f = "IUserBookWordsRepo.kt", i = {0, 1, 1, 2, 2, 2, 2}, l = {45, 46, 47}, m = "fetchWords", n = {"userBookId", "remoteWords", "userBookId", "remoteWords", "$this$fetchWords_u24lambda_u240", "userBookId", "$i$a$-apply-UserBookWordsRepoImpl$fetchWords$2"}, s = {"J$0", "L$0", "J$0", "L$0", "L$2", "J$0", "I$0"}, v = 1)
    public static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f83545a;

        /* renamed from: b, reason: collision with root package name */
        public Object f83546b;

        /* renamed from: c, reason: collision with root package name */
        public Object f83547c;

        /* renamed from: d, reason: collision with root package name */
        public Object f83548d;

        /* renamed from: e, reason: collision with root package name */
        public int f83549e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f83550f;

        /* renamed from: h, reason: collision with root package name */
        public int f83552h;

        public i(j00.c<? super i> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f83550f = obj;
            this.f83552h |= Integer.MIN_VALUE;
            return m.this.i(0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.repo.UserBookWordsRepoImpl$fetchWords$2$1", f = "IUserBookWordsRepo.kt", i = {1, 1, 1, 1, 1}, l = {48, 50}, m = "invokeSuspend", n = {"$this$forEach$iv", "element$iv", "remoteWord", "$i$f$forEach", "$i$a$-forEach-UserBookWordsRepoImpl$fetchWords$2$1$1"}, s = {"L$0", "L$3", "L$4", "I$0", "I$1"}, v = 1)
    @u0({"SMAP\nIUserBookWordsRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IUserBookWordsRepo.kt\ncom/baicizhan/app/biz/userbook/repo/UserBookWordsRepoImpl$fetchWords$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n1869#2,2:154\n*S KotlinDebug\n*F\n+ 1 IUserBookWordsRepo.kt\ncom/baicizhan/app/biz/userbook/repo/UserBookWordsRepoImpl$fetchWords$2$1\n*L\n49#1:154,2\n*E\n"})
    public static final class j extends SuspendLambda implements x00.p<j.r, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f83553a;

        /* renamed from: b, reason: collision with root package name */
        public Object f83554b;

        /* renamed from: c, reason: collision with root package name */
        public Object f83555c;

        /* renamed from: d, reason: collision with root package name */
        public Object f83556d;

        /* renamed from: e, reason: collision with root package name */
        public Object f83557e;

        /* renamed from: f, reason: collision with root package name */
        public long f83558f;

        /* renamed from: g, reason: collision with root package name */
        public int f83559g;

        /* renamed from: h, reason: collision with root package name */
        public int f83560h;

        /* renamed from: i, reason: collision with root package name */
        public int f83561i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ p7.c f83562j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ long f83563k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ List<y8.k> f83564l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(p7.c cVar, long j11, List<y8.k> list, j00.c<? super j> cVar2) {
            super(2, cVar2);
            this.f83562j = cVar;
            this.f83563k = j11;
            this.f83564l = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new j(this.f83562j, this.f83563k, this.f83564l, cVar);
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(j.r rVar, j00.c<? super g2> cVar) {
            return ((j) create(rVar, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
        
            if (r14.g0(r5, r13) == r0) goto L18;
         */
        /* JADX WARN: Removed duplicated region for block: B:9:0x005c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r13.f83561i
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L33
                if (r1 == r4) goto L2f
                if (r1 != r3) goto L27
                int r1 = r13.f83559g
                long r4 = r13.f83558f
                java.lang.Object r6 = r13.f83557e
                y8.k r6 = (y8.k) r6
                java.lang.Object r6 = r13.f83555c
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r7 = r13.f83554b
                p7.c r7 = (p7.c) r7
                java.lang.Object r8 = r13.f83553a
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                kotlin.e.n(r14)
                goto L56
            L27:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L2f:
                kotlin.e.n(r14)
                goto L47
            L33:
                kotlin.e.n(r14)
                p7.c r14 = r13.f83562j
                p7.l0 r14 = r14.f()
                long r5 = r13.f83563k
                r13.f83561i = r4
                java.lang.Object r14 = r14.g0(r5, r13)
                if (r14 != r0) goto L47
                goto L8f
            L47:
                java.util.List<y8.k> r14 = r13.f83564l
                java.lang.Iterable r14 = (java.lang.Iterable) r14
                p7.c r1 = r13.f83562j
                long r4 = r13.f83563k
                java.util.Iterator r6 = r14.iterator()
                r8 = r14
                r7 = r1
                r1 = r2
            L56:
                boolean r14 = r6.hasNext()
                if (r14 == 0) goto L90
                java.lang.Object r14 = r6.next()
                r9 = r14
                y8.k r9 = (y8.k) r9
                p7.l0 r10 = r7.f()
                p7.w r11 = r7.i.a(r9, r4)
                java.lang.Object r12 = l00.k.a(r8)
                r13.f83553a = r12
                r13.f83554b = r7
                r13.f83555c = r6
                java.lang.Object r14 = l00.k.a(r14)
                r13.f83556d = r14
                java.lang.Object r14 = l00.k.a(r9)
                r13.f83557e = r14
                r13.f83558f = r4
                r13.f83559g = r1
                r13.f83560h = r2
                r13.f83561i = r3
                java.lang.Object r14 = r10.j0(r11, r13)
                if (r14 != r0) goto L56
            L8f:
                return r0
            L90:
                yz.g2 r14 = yz.g2.f100423a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: r7.m.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.repo.UserBookWordsRepoImpl$getOrCreateDb$2", f = "IUserBookWordsRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class k extends SuspendLambda implements x00.p<l.e, j00.c<? super p7.c>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f83565a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f83566b;

        public k(j00.c<? super k> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            k kVar = new k(cVar);
            kVar.f83566b = obj;
            return kVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(l.e eVar, j00.c<? super p7.c> cVar) {
            return ((k) create(eVar, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            l.e eVar = (l.e) this.f83566b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f83565a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return p7.c.f79351d.b(eVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.repo.UserBookWordsRepoImpl", f = "IUserBookWordsRepo.kt", i = {0, 1}, l = {59, 59}, m = "getWords", n = {"userBookId", "userBookId"}, s = {"J$0", "J$0"}, v = 1)
    public static final class l extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f83567a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f83568b;

        /* renamed from: d, reason: collision with root package name */
        public int f83570d;

        public l(j00.c<? super l> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f83568b = obj;
            this.f83570d |= Integer.MIN_VALUE;
            return m.this.a(0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.repo.UserBookWordsRepoImpl", f = "IUserBookWordsRepo.kt", i = {0, 1}, l = {121, 124}, m = "queryExistTopicIds", n = {"topicIds", "topicIds"}, s = {"L$0", "L$0"}, v = 1)
    /* renamed from: r7.m$m, reason: collision with other inner class name */
    public static final class C1040m extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f83571a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f83572b;

        /* renamed from: d, reason: collision with root package name */
        public int f83574d;

        public C1040m(j00.c<? super C1040m> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f83572b = obj;
            this.f83574d |= Integer.MIN_VALUE;
            return m.this.h(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.repo.UserBookWordsRepoImpl", f = "IUserBookWordsRepo.kt", i = {0, 1}, l = {114, 117}, m = "queryWordCount", n = {"userBookIds", "userBookIds"}, s = {"L$0", "L$0"}, v = 1)
    public static final class n extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f83575a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f83576b;

        /* renamed from: d, reason: collision with root package name */
        public int f83578d;

        public n(j00.c<? super n> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f83576b = obj;
            this.f83578d |= Integer.MIN_VALUE;
            return m.this.c(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class o implements x00.l<w7.d<y8.h>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f83579a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f83580b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f83581c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f83582a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f83583b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f83584c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f83582a = eVar;
                this.f83583b = cVar;
                this.f83584c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f83582a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f83582a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f83583b.b(this.f83584c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public o(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f83579a = dVar;
            this.f83580b = eVar;
            this.f83581c = cVar;
        }

        public final void a(w7.d<y8.h> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f83580b, this.f83581c, this.f83579a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f83579a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<y8.h> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    public m(@m80.k v3.b dbPoll, @m80.k p thrift) {
        g0.p(dbPoll, "dbPoll");
        g0.p(thrift, "thrift");
        this.f83475a = dbPoll;
        this.f83476b = thrift;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (r8 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // r7.h
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(long r6, @m80.k j00.c<? super java.util.List<k3.r3>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof r7.m.l
            if (r0 == 0) goto L13
            r0 = r8
            r7.m$l r0 = (r7.m.l) r0
            int r1 = r0.f83570d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f83570d = r1
            goto L18
        L13:
            r7.m$l r0 = new r7.m$l
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f83568b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f83570d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r8)
            goto L5d
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            long r6 = r0.f83567a
            kotlin.e.n(r8)
            goto L48
        L3a:
            kotlin.e.n(r8)
            r0.f83567a = r6
            r0.f83570d = r4
            java.lang.Object r8 = r5.l(r0)
            if (r8 != r1) goto L48
            goto L5c
        L48:
            p7.c r8 = (p7.c) r8
            p7.l0 r8 = r8.f()
            j.j r8 = r8.p0(r6)
            r0.f83567a = r6
            r0.f83570d = r3
            java.lang.Object r8 = k.e.c(r8, r0)
            if (r8 != r1) goto L5d
        L5c:
            return r1
        L5d:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = a00.i0.d0(r8, r7)
            r6.<init>(r7)
            java.util.Iterator r7 = r8.iterator()
        L6e:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L82
            java.lang.Object r8 = r7.next()
            p7.w r8 = (p7.w) r8
            k3.r3 r8 = r7.i.b(r8)
            r6.add(r8)
            goto L6e
        L82:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.m.a(long, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00fe, code lost:
    
        if (j.o.a.a(r11, false, r9, r8, 1, null) != r4) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    @Override // r7.h
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(long r17, @m80.k java.util.List<k3.m4> r19, @m80.k j00.c<? super y8.g> r20) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.m.b(long, java.util.List, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        if (r7 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // r7.h
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(@m80.k java.util.Collection<java.lang.Long> r6, @m80.k j00.c<? super java.util.Map<java.lang.Long, java.lang.Integer>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof r7.m.n
            if (r0 == 0) goto L13
            r0 = r7
            r7.m$n r0 = (r7.m.n) r0
            int r1 = r0.f83578d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f83578d = r1
            goto L18
        L13:
            r7.m$n r0 = new r7.m$n
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f83576b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f83578d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f83575a
            java.util.Collection r6 = (java.util.Collection) r6
            kotlin.e.n(r7)
            goto L67
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.f83575a
            java.util.Collection r6 = (java.util.Collection) r6
            kotlin.e.n(r7)
            goto L4e
        L40:
            kotlin.e.n(r7)
            r0.f83575a = r6
            r0.f83578d = r4
            java.lang.Object r7 = r5.l(r0)
            if (r7 != r1) goto L4e
            goto L66
        L4e:
            p7.c r7 = (p7.c) r7
            p7.l0 r7 = r7.f()
            j.j r7 = r7.u0(r6)
            java.lang.Object r6 = l00.k.a(r6)
            r0.f83575a = r6
            r0.f83578d = r3
            java.lang.Object r7 = k.e.c(r7, r0)
            if (r7 != r1) goto L67
        L66:
            return r1
        L67:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            r6 = 10
            int r6 = a00.i0.d0(r7, r6)
            int r6 = a00.k1.j(r6)
            r0 = 16
            int r6 = g10.u.u(r6, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r6)
            java.util.Iterator r6 = r7.iterator()
        L82:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto La3
            java.lang.Object r7 = r6.next()
            p7.b r7 = (p7.b) r7
            long r1 = r7.f()
            java.lang.Long r1 = l00.a.g(r1)
            long r2 = r7.e()
            int r7 = (int) r2
            java.lang.Integer r7 = l00.a.f(r7)
            r0.put(r1, r7)
            goto L82
        La3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.m.c(java.util.Collection, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0090, code lost:
    
        if (((p7.c) r4).f().a0(r1, r9, r11) != r5) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    @Override // r7.h
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(long r19, int r21, @m80.k j00.c<? super yz.g2> r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r3 = r21
            r4 = r22
            boolean r5 = r4 instanceof r7.m.g
            if (r5 == 0) goto L1c
            r5 = r4
            r7.m$g r5 = (r7.m.g) r5
            int r6 = r5.f83538e
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L1c
            int r6 = r6 - r7
            r5.f83538e = r6
        L1a:
            r11 = r5
            goto L22
        L1c:
            r7.m$g r5 = new r7.m$g
            r5.<init>(r4)
            goto L1a
        L22:
            java.lang.Object r4 = r11.f83536c
            java.lang.Object r5 = kotlin.coroutines.intrinsics.b.l()
            int r6 = r11.f83538e
            r7 = 2
            r8 = 1
            if (r6 == 0) goto L47
            if (r6 == r8) goto L3e
            if (r6 != r7) goto L36
            kotlin.e.n(r4)
            goto L93
        L36:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3e:
            int r1 = r11.f83535b
            long r2 = r11.f83534a
            kotlin.e.n(r4)
            r9 = r2
            goto L7e
        L47:
            kotlin.e.n(r4)
            z6.b r12 = z6.b.f101032b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "deleteWord userBookId: "
            r4.append(r6)
            r4.append(r1)
            java.lang.String r6 = ", topicId: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r14 = r4.toString()
            r16 = 4
            r17 = 0
            java.lang.String r13 = "UserBookService"
            r15 = 0
            z6.b.j(r12, r13, r14, r15, r16, r17)
            r11.f83534a = r1
            r11.f83535b = r3
            r11.f83538e = r8
            java.lang.Object r4 = r0.l(r11)
            if (r4 != r5) goto L7c
            goto L92
        L7c:
            r9 = r1
            r1 = r3
        L7e:
            p7.c r4 = (p7.c) r4
            p7.l0 r6 = r4.f()
            long r2 = (long) r1
            r11.f83534a = r9
            r11.f83535b = r1
            r11.f83538e = r7
            r7 = r2
            java.lang.Object r1 = r6.a0(r7, r9, r11)
            if (r1 != r5) goto L93
        L92:
            return r5
        L93:
            yz.g2 r1 = yz.g2.f100423a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.m.d(long, int, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0094, code lost:
    
        if (r4 == r6) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cc A[LOOP:0: B:18:0x00c6->B:20:0x00cc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // r7.h
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(long r19, @m80.k java.util.List<java.lang.Integer> r21, @m80.k j00.c<? super y8.g> r22) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.m.e(long, java.util.List, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        if (r15.m0(r2, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r15 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // r7.h
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(long r12, @m80.k y8.k r14, @m80.k j00.c<? super yz.g2> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof r7.m.a
            if (r0 == 0) goto L13
            r0 = r15
            r7.m$a r0 = (r7.m.a) r0
            int r1 = r0.f83481e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f83481e = r1
            goto L18
        L13:
            r7.m$a r0 = new r7.m$a
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f83479c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f83481e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r12 = r0.f83478b
            y8.k r12 = (y8.k) r12
            kotlin.e.n(r15)
            goto L79
        L30:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L38:
            long r12 = r0.f83477a
            java.lang.Object r14 = r0.f83478b
            y8.k r14 = (y8.k) r14
            kotlin.e.n(r15)
            goto L5e
        L42:
            kotlin.e.n(r15)
            z6.b r5 = z6.b.f101032b
            r9 = 4
            r10 = 0
            java.lang.String r6 = "UserBookService"
            java.lang.String r7 = "addWord"
            r8 = 0
            z6.b.j(r5, r6, r7, r8, r9, r10)
            r0.f83478b = r14
            r0.f83477a = r12
            r0.f83481e = r4
            java.lang.Object r15 = r11.l(r0)
            if (r15 != r1) goto L5e
            goto L78
        L5e:
            p7.c r15 = (p7.c) r15
            p7.l0 r15 = r15.f()
            p7.w r2 = r7.i.a(r14, r12)
            java.lang.Object r14 = l00.k.a(r14)
            r0.f83478b = r14
            r0.f83477a = r12
            r0.f83481e = r3
            java.lang.Object r12 = r15.m0(r2, r0)
            if (r12 != r1) goto L79
        L78:
            return r1
        L79:
            yz.g2 r12 = yz.g2.f100423a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.m.f(long, y8.k, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
    
        if (r14.g0(r12, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (r14 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // r7.h
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(long r12, @m80.k j00.c<? super yz.g2> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof r7.m.f
            if (r0 == 0) goto L13
            r0 = r14
            r7.m$f r0 = (r7.m.f) r0
            int r1 = r0.f83533d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f83533d = r1
            goto L18
        L13:
            r7.m$f r0 = new r7.m$f
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f83531b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f83533d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r14)
            goto L74
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            long r12 = r0.f83530a
            kotlin.e.n(r14)
            goto L63
        L3a:
            kotlin.e.n(r14)
            z6.b r5 = z6.b.f101032b
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r2 = "deleteWords userBookId: "
            r14.append(r2)
            r14.append(r12)
            java.lang.String r7 = r14.toString()
            r9 = 4
            r10 = 0
            java.lang.String r6 = "UserBookService"
            r8 = 0
            z6.b.j(r5, r6, r7, r8, r9, r10)
            r0.f83530a = r12
            r0.f83533d = r4
            java.lang.Object r14 = r11.l(r0)
            if (r14 != r1) goto L63
            goto L73
        L63:
            p7.c r14 = (p7.c) r14
            p7.l0 r14 = r14.f()
            r0.f83530a = r12
            r0.f83533d = r3
            java.lang.Object r12 = r14.g0(r12, r0)
            if (r12 != r1) goto L74
        L73:
            return r1
        L74:
            yz.g2 r12 = yz.g2.f100423a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.m.g(long, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008f, code lost:
    
        if (r10 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004d, code lost:
    
        if (r10 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c A[LOOP:1: B:22:0x0066->B:24:0x006c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // r7.h
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(@m80.k java.util.Collection<java.lang.Integer> r9, @m80.k j00.c<? super java.util.List<java.lang.Integer>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof r7.m.C1040m
            if (r0 == 0) goto L13
            r0 = r10
            r7.m$m r0 = (r7.m.C1040m) r0
            int r1 = r0.f83574d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f83574d = r1
            goto L18
        L13:
            r7.m$m r0 = new r7.m$m
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f83572b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f83574d
            r3 = 10
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r9 = r0.f83571a
            java.util.Collection r9 = (java.util.Collection) r9
            kotlin.e.n(r10)
            goto L92
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            java.lang.Object r9 = r0.f83571a
            java.util.Collection r9 = (java.util.Collection) r9
            kotlin.e.n(r10)
            goto L50
        L42:
            kotlin.e.n(r10)
            r0.f83571a = r9
            r0.f83574d = r5
            java.lang.Object r10 = r8.l(r0)
            if (r10 != r1) goto L50
            goto L91
        L50:
            p7.c r10 = (p7.c) r10
            p7.l0 r10 = r10.f()
            r2 = r9
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = a00.i0.d0(r2, r3)
            r5.<init>(r6)
            java.util.Iterator r2 = r2.iterator()
        L66:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L7f
            java.lang.Object r6 = r2.next()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            long r6 = (long) r6
            java.lang.Long r6 = l00.a.g(r6)
            r5.add(r6)
            goto L66
        L7f:
            j.j r10 = r10.s0(r5)
            java.lang.Object r9 = l00.k.a(r9)
            r0.f83571a = r9
            r0.f83574d = r4
            java.lang.Object r10 = k.e.c(r10, r0)
            if (r10 != r1) goto L92
        L91:
            return r1
        L92:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r9 = new java.util.ArrayList
            int r0 = a00.i0.d0(r10, r3)
            r9.<init>(r0)
            java.util.Iterator r10 = r10.iterator()
        La1:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Lba
            java.lang.Object r0 = r10.next()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            int r0 = (int) r0
            java.lang.Integer r0 = l00.a.f(r0)
            r9.add(r0)
            goto La1
        Lba:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.m.h(java.util.Collection, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0090, code lost:
    
        if (r15 != r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        if (r15 == r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // r7.h
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(long r13, @m80.k j00.c<? super yz.g2> r15) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.m.i(long, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f1, code lost:
    
        if (j.o.a.a(r12, false, r3, r4, 1, null) != r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a6, code lost:
    
        if (r12 == r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // r7.h
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(@m80.k java.util.List<java.lang.Long> r10, @m80.k java.util.List<k3.m4> r11, @m80.k j00.c<? super java.util.List<y8.g>> r12) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.m.j(java.util.List, java.util.List, j00.c):java.lang.Object");
    }

    public final Object l(j00.c<? super p7.c> cVar) {
        return this.f83475a.a(p7.c.f79351d.a(), "user_book", true, new k(null), cVar);
    }

    public final y8.h m() {
        return (y8.h) w7.f.b(new o(o0.d(y8.h.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }
}
