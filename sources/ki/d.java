package ki;

import c40.h1;
import c40.m0;
import com.baicizhan.main.vld.model.FavoritePlanInfo;
import com.baicizhan.online.user_book.UserBookService;
import com.baicizhan.online.user_book.UserSelectedBookInfo;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class d implements ki.c {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m0 f66537a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.vld.model.DeviceLearnerImpl", f = "DeviceLearner.kt", i = {0}, l = {35}, m = "getPlannedFavoriteBook-gIAlu-s", n = {"deviceId"}, s = {"J$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f66538a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f66539b;

        /* renamed from: d, reason: collision with root package name */
        public int f66541d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f66539b = obj;
            this.f66541d |= Integer.MIN_VALUE;
            Object a11 = d.this.a(0L, this);
            return a11 == kotlin.coroutines.intrinsics.b.l() ? a11 : Result.m6307boximpl(a11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.vld.model.DeviceLearnerImpl$getPlannedFavoriteBook$2", f = "DeviceLearner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @u0({"SMAP\nDeviceLearner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceLearner.kt\ncom/baicizhan/main/vld/model/DeviceLearnerImpl$getPlannedFavoriteBook$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n1#2:40\n*E\n"})
    public static final class b extends SuspendLambda implements x00.l<j00.c<? super FavoritePlanInfo>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f66542a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f66544c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j11, j00.c<? super b> cVar) {
            super(1, cVar);
            this.f66544c = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return d.this.new b(this.f66544c, cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super FavoritePlanInfo> cVar) {
            return ((b) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f66542a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            UserSelectedBookInfo userSelectedBookInfo = d.this.d().get_user_plan_book(this.f66544c);
            return new FavoritePlanInfo(userSelectedBookInfo.user_book_id, userSelectedBookInfo.daily_plan_count);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.vld.model.DeviceLearnerImpl", f = "DeviceLearner.kt", i = {0, 0, 0}, l = {31}, m = "setFavoriteBookPlan-BWLJW6A", n = {"deviceId", "favoriteBookId", "dailyPlanCount"}, s = {"J$0", "J$1", "I$0"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f66545a;

        /* renamed from: b, reason: collision with root package name */
        public long f66546b;

        /* renamed from: c, reason: collision with root package name */
        public int f66547c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f66548d;

        /* renamed from: f, reason: collision with root package name */
        public int f66550f;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f66548d = obj;
            this.f66550f |= Integer.MIN_VALUE;
            Object b11 = d.this.b(0L, 0L, 0, this);
            return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : Result.m6307boximpl(b11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.vld.model.DeviceLearnerImpl$setFavoriteBookPlan$2", f = "DeviceLearner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: ki.d$d, reason: collision with other inner class name */
    public static final class C0771d extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f66551a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f66553c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f66554d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f66555e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0771d(long j11, long j12, int i11, j00.c<? super C0771d> cVar) {
            super(1, cVar);
            this.f66553c = j11;
            this.f66554d = j12;
            this.f66555e = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return d.this.new C0771d(this.f66553c, this.f66554d, this.f66555e, cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super g2> cVar) {
            return ((C0771d) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f66551a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            d.this.d().select_user_book(this.f66553c, this.f66554d, this.f66555e);
            return g2.f100423a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // ki.c
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(long r8, @m80.k j00.c<? super kotlin.Result<com.baicizhan.main.vld.model.FavoritePlanInfo>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof ki.d.a
            if (r0 == 0) goto L14
            r0 = r10
            ki.d$a r0 = (ki.d.a) r0
            int r1 = r0.f66541d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f66541d = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            ki.d$a r0 = new ki.d$a
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r4.f66539b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.f66541d
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            kotlin.e.n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r8 = r10.m6317unboximpl()
            return r8
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            kotlin.e.n(r10)
            c40.m0 r1 = r7.f66537a
            ki.d$b r3 = new ki.d$b
            r10 = 0
            r3.<init>(r8, r10)
            r4.f66538a = r8
            r4.f66541d = r2
            r2 = 0
            r5 = 2
            r6 = 0
            java.lang.Object r8 = com.baicizhan.main.word_book.data.impl.c.d(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L52
            return r0
        L52:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.d.a(long, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // ki.c
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(long r13, long r15, int r17, @m80.k j00.c<? super kotlin.Result<yz.g2>> r18) {
        /*
            r12 = this;
            r0 = r18
            boolean r2 = r0 instanceof ki.d.c
            if (r2 == 0) goto L16
            r2 = r0
            ki.d$c r2 = (ki.d.c) r2
            int r3 = r2.f66550f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f66550f = r3
        L14:
            r8 = r2
            goto L1c
        L16:
            ki.d$c r2 = new ki.d$c
            r2.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r8.f66548d
            java.lang.Object r9 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r8.f66550f
            r10 = 1
            if (r2 == 0) goto L3b
            if (r2 != r10) goto L33
            kotlin.e.n(r0)
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.m6317unboximpl()
            return r0
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3b:
            kotlin.e.n(r0)
            c40.m0 r11 = r12.f66537a
            ki.d$d r0 = new ki.d$d
            r7 = 0
            r1 = r12
            r2 = r13
            r4 = r15
            r6 = r17
            r0.<init>(r2, r4, r6, r7)
            r8.f66545a = r13
            r8.f66546b = r4
            r8.f66547c = r6
            r8.f66550f = r10
            r1 = 0
            r2 = 2
            r3 = 0
            r15 = r0
            r14 = r1
            r17 = r2
            r18 = r3
            r16 = r8
            r13 = r11
            java.lang.Object r0 = com.baicizhan.main.word_book.data.impl.c.d(r13, r14, r15, r16, r17, r18)
            if (r0 != r9) goto L66
            return r9
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.d.b(long, long, int, j00.c):java.lang.Object");
    }

    public final UserBookService.Client d() {
        return (UserBookService.Client) new com.baicizhan.client.business.thrift.l("/rpc/user_book").a();
    }

    public d(@m80.k m0 coroutineDispatcher) {
        g0.p(coroutineDispatcher, "coroutineDispatcher");
        this.f66537a = coroutineDispatcher;
    }

    public /* synthetic */ d(m0 m0Var, int i11, v vVar) {
        this((i11 & 1) != 0 ? h1.c() : m0Var);
    }
}
