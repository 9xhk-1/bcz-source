package z5;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import m80.l;
import oa0.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {e.class})
@u0({"SMAP\nDailyReviewRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DailyReviewRepo.kt\ncom/baicizhan/app/biz/game/repo/studyrecord/DailyReviewRepoImpl\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n+ 5 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,63:1\n41#2,6:64\n48#2:71\n142#3:70\n127#4:72\n116#5,11:73\n*S KotlinDebug\n*F\n+ 1 DailyReviewRepo.kt\ncom/baicizhan/app/biz/game/repo/studyrecord/DailyReviewRepoImpl\n*L\n29#1:64,6\n29#1:71\n29#1:70\n29#1:72\n43#1:73,11\n*E\n"})
/* loaded from: classes3.dex */
public final class c implements e, c4.j {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.auth.r f100832b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final n40.a f100833c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.studyrecord.DailyReviewRepoImpl", f = "DailyReviewRepo.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2}, l = {69, 44, 45}, m = "addDailyReviewCount", n = {"$this$withLock_u24default$iv", "bookId", "dateNumber", "count", "$i$f$withLock", "$this$withLock_u24default$iv", "bookId", "dateNumber", "count", "$i$f$withLock", "$i$a$-withLock$default-DailyReviewRepoImpl$addDailyReviewCount$2", "$this$withLock_u24default$iv", "bookId", "dateNumber", "count", "$i$f$withLock", "$i$a$-withLock$default-DailyReviewRepoImpl$addDailyReviewCount$2", "old"}, s = {"L$0", "J$0", "J$1", "I$0", "I$1", "L$0", "J$0", "J$1", "I$0", "I$1", "I$2", "L$0", "J$0", "J$1", "I$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f100834a;

        /* renamed from: b, reason: collision with root package name */
        public long f100835b;

        /* renamed from: c, reason: collision with root package name */
        public int f100836c;

        /* renamed from: d, reason: collision with root package name */
        public int f100837d;

        /* renamed from: e, reason: collision with root package name */
        public int f100838e;

        /* renamed from: f, reason: collision with root package name */
        public int f100839f;

        /* renamed from: g, reason: collision with root package name */
        public Object f100840g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f100841h;

        /* renamed from: j, reason: collision with root package name */
        public int f100843j;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f100841h = obj;
            this.f100843j |= Integer.MIN_VALUE;
            return c.this.c(0L, 0L, 0, this);
        }
    }

    public c(@m80.k com.baicizhan.app.biz.auth.r tokenProvider) {
        g0.p(tokenProvider, "tokenProvider");
        this.f100832b = tokenProvider;
        this.f100833c = n40.g.b(false, 1, null);
    }

    public static final ya0.a e(c cVar) {
        String c11;
        c11 = d.c(cVar.f100832b.b());
        return ya0.b.d(c11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final com.baicizhan.app.preferences.g f() {
        return (com.baicizhan.app.preferences.g) (this instanceof pa0.c ? ((pa0.c) this).getScope() : r().P().h()).i(o0.d(com.baicizhan.app.preferences.g.class), null, new x00.a() { // from class: z5.b
            @Override // x00.a
            public final Object invoke() {
                ya0.a e11;
                e11 = c.e(c.this);
                return e11;
            }
        });
    }

    @Override // z5.e
    @l
    public Object a(long j11, long j12, @m80.k j00.c<? super Integer> cVar) {
        String d11;
        com.baicizhan.app.preferences.g f11 = f();
        d11 = d.d(j11, j12);
        return f11.d(d11, 0, cVar);
    }

    @Override // z5.e
    @l
    public Object b(long j11, long j12, @m80.k j00.c<? super g2> cVar) {
        String d11;
        com.baicizhan.app.preferences.g f11 = f();
        d11 = d.d(j11, j12);
        Object f12 = f11.f(d11, 0, cVar);
        return f12 == kotlin.coroutines.intrinsics.b.l() ? f12 : g2.f100423a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|(1:(4:(1:(7:11|12|13|15|16|17|18)(2:27|28))(7:29|30|31|32|33|(5:36|15|16|17|18)|35)|26|23|24)(1:43))(3:49|(1:51)|35)|44|45|(2:47|35)(4:48|33|(0)|35)))|52|6|(0)(0)|44|45|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ee, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ef, code lost:
    
        r2 = r14;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // z5.e
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(long r19, long r21, int r23, @m80.k j00.c<? super yz.g2> r24) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.c.c(long, long, int, j00.c):java.lang.Object");
    }

    @Override // c4.j, pa0.a
    @m80.k
    public /* bridge */ na0.a r() {
        return super.r();
    }
}
