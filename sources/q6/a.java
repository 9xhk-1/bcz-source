package q6;

import c40.f;
import c40.r0;
import c40.s0;
import c40.x0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import oa0.r;
import r6.g;
import r6.n;
import r6.u;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final n f81771a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final u f81772b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g f81773c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.RefreshStudyDataUC$invoke$2", f = "RefreshStudyDataUC.kt", i = {0}, l = {25}, m = "invokeSuspend", n = {"$this$coroutineScope"}, s = {"L$0"}, v = 1)
    /* renamed from: q6.a$a, reason: collision with other inner class name */
    public static final class C1004a extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f81774a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f81775b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f81776c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a f81777d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.RefreshStudyDataUC$invoke$2$1", f = "RefreshStudyDataUC.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: q6.a$a$a, reason: collision with other inner class name */
        public static final class C1005a extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f81778a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f81779b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1005a(a aVar, j00.c<? super C1005a> cVar) {
                super(2, cVar);
                this.f81779b = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new C1005a(this.f81779b, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                return ((C1005a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f81778a;
                if (i11 == 0) {
                    e.n(obj);
                    z6.b.d(z6.b.f101032b, q6.b.f81783a, "Execute fetchGameHome task", null, 4, null);
                    n nVar = this.f81779b.f81771a;
                    this.f81778a = 1;
                    if (n.c(nVar, 0, this, 1, null) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e.n(obj);
                }
                z6.b.d(z6.b.f101032b, q6.b.f81783a, "FetchGameHome task completed", null, 4, null);
                return g2.f100423a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.RefreshStudyDataUC$invoke$2$2", f = "RefreshStudyDataUC.kt", i = {}, l = {33, 35}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: q6.a$a$b */
        public static final class b extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f81780a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f81781b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f81782c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a aVar, long j11, j00.c<? super b> cVar) {
                super(2, cVar);
                this.f81781b = aVar;
                this.f81782c = j11;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new b(this.f81781b, this.f81782c, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
            
                if (r11.b(r3, r10) == r0) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
            
                if (r11.b(r4, r10) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r10.f81780a
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    kotlin.e.n(r11)
                    goto L5b
                L12:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L1a:
                    kotlin.e.n(r11)
                    goto L3e
                L1e:
                    kotlin.e.n(r11)
                    z6.b r4 = z6.b.f101032b
                    r8 = 4
                    r9 = 0
                    java.lang.String r5 = "RefreshStudyDataUC"
                    java.lang.String r6 = "Execute fetchVersionInfo and checkUpdateStudyRecord tasks"
                    r7 = 0
                    z6.b.d(r4, r5, r6, r7, r8, r9)
                    q6.a r11 = r10.f81781b
                    r6.u r11 = q6.a.c(r11)
                    long r4 = r10.f81782c
                    r10.f81780a = r3
                    java.lang.Object r11 = r11.b(r4, r10)
                    if (r11 != r0) goto L3e
                    goto L5a
                L3e:
                    z6.b r3 = z6.b.f101032b
                    r7 = 4
                    r8 = 0
                    java.lang.String r4 = "RefreshStudyDataUC"
                    java.lang.String r5 = "FetchVersionInfo task completed"
                    r6 = 0
                    z6.b.d(r3, r4, r5, r6, r7, r8)
                    q6.a r11 = r10.f81781b
                    r6.g r11 = q6.a.a(r11)
                    long r3 = r10.f81782c
                    r10.f81780a = r2
                    java.lang.Object r11 = r11.b(r3, r10)
                    if (r11 != r0) goto L5b
                L5a:
                    return r0
                L5b:
                    z6.b r1 = z6.b.f101032b
                    r5 = 4
                    r6 = 0
                    java.lang.String r2 = "RefreshStudyDataUC"
                    java.lang.String r3 = "CheckUpdateStudyRecord task completed"
                    r4 = 0
                    z6.b.d(r1, r2, r3, r4, r5, r6)
                    yz.g2 r11 = yz.g2.f100423a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: q6.a.C1004a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1004a(long j11, a aVar, j00.c<? super C1004a> cVar) {
            super(2, cVar);
            this.f81776c = j11;
            this.f81777d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            C1004a c1004a = new C1004a(this.f81776c, this.f81777d, cVar);
            c1004a.f81775b = obj;
            return c1004a;
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((C1004a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            x0 b11;
            x0 b12;
            r0 r0Var = (r0) this.f81775b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f81774a;
            try {
                if (i11 == 0) {
                    e.n(obj);
                    z6.b.d(z6.b.f101032b, q6.b.f81783a, "Execute parallel refresh tasks", null, 4, null);
                    b11 = c40.k.b(r0Var, null, null, new C1005a(this.f81777d, null), 3, null);
                    b12 = c40.k.b(r0Var, null, null, new b(this.f81777d, this.f81776c, null), 3, null);
                    x0[] x0VarArr = {b11, b12};
                    this.f81775b = l00.k.a(r0Var);
                    this.f81774a = 1;
                    if (f.b(x0VarArr, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e.n(obj);
                }
                z6.b.j(z6.b.f101032b, q6.b.f81783a, "Refresh study data completed - bookId: " + this.f81776c, null, 4, null);
                return g2.f100423a;
            } catch (Exception e11) {
                z6.b.f101032b.e(q6.b.f81783a, "Refresh study data failed - bookId: " + this.f81776c, e11);
                throw e11;
            }
        }
    }

    public a(@k n fetchGameHomeUC, @k u fetchVersionInfoUC, @k g checkUpdateStudyRecordUC) {
        g0.p(fetchGameHomeUC, "fetchGameHomeUC");
        g0.p(fetchVersionInfoUC, "fetchVersionInfoUC");
        g0.p(checkUpdateStudyRecordUC, "checkUpdateStudyRecordUC");
        this.f81771a = fetchGameHomeUC;
        this.f81772b = fetchVersionInfoUC;
        this.f81773c = checkUpdateStudyRecordUC;
    }

    @l
    public final Object d(long j11, @k j00.c<? super g2> cVar) {
        z6.b.j(z6.b.f101032b, b.f81783a, "Start refresh study data - bookId: " + j11, null, 4, null);
        Object g11 = s0.g(new C1004a(j11, this, null), cVar);
        return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
    }
}
