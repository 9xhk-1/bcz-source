package q6;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import oa0.r;
import r6.u;
import z5.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final g f81784a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final r6.g f81785b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final u f81786c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.SyncStudyRecordUC", f = "SyncStudyRecordUC.kt", i = {0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4}, l = {21, 23, 29, 30, 31}, m = "invoke", n = {"bookId", "$this$invoke_u24lambda_u240", "bookId", "$i$a$-runCatching-SyncStudyRecordUC$invoke$2", "it", "bookId", "$i$a$-recoverCatching-SyncStudyRecordUC$invoke$3", "it", "bookId", "$i$a$-recoverCatching-SyncStudyRecordUC$invoke$3", "it", "bookId", "$i$a$-recoverCatching-SyncStudyRecordUC$invoke$3"}, s = {"J$0", "L$0", "J$0", "I$0", "L$0", "J$0", "I$0", "L$0", "J$0", "I$0", "L$0", "J$0", "I$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f81787a;

        /* renamed from: b, reason: collision with root package name */
        public Object f81788b;

        /* renamed from: c, reason: collision with root package name */
        public int f81789c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f81790d;

        /* renamed from: f, reason: collision with root package name */
        public int f81792f;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f81790d = obj;
            this.f81792f |= Integer.MIN_VALUE;
            return c.this.a(0L, this);
        }
    }

    public c(@k g studyRecordRepo, @k r6.g checkUpdateStudyRecordUC, @k u fetchVersionInfoUC) {
        g0.p(studyRecordRepo, "studyRecordRepo");
        g0.p(checkUpdateStudyRecordUC, "checkUpdateStudyRecordUC");
        g0.p(fetchVersionInfoUC, "fetchVersionInfoUC");
        this.f81784a = studyRecordRepo;
        this.f81785b = checkUpdateStudyRecordUC;
        this.f81786c = fetchVersionInfoUC;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(11:5|6|7|(1:(1:(1:(1:(1:(5:14|15|16|17|18)(2:20|21))(3:22|23|24))(6:27|28|29|30|31|(2:33|26)(2:34|24)))(7:35|36|37|38|(2:40|(1:48)(2:44|(2:46|26)(4:47|30|31|(0)(0))))|17|18))(1:50))(1:54)|51|(2:53|26)|37|38|(0)|17|18))|60|6|7|(0)(0)|51|(0)|37|38|(0)|17|18) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x012c, code lost:
    
        if (r0.a(r6, r4) != r5) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009a, code lost:
    
        if (r0.b(r2, r4) == r5) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0041, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0136, code lost:
    
        r2 = kotlin.Result.Companion;
        kotlin.Result.m6308constructorimpl(kotlin.e.a(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0076, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bd, code lost:
    
        r6 = kotlin.Result.Companion;
        r0 = kotlin.Result.m6308constructorimpl(kotlin.e.a(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd A[Catch: all -> 0x0041, TRY_ENTER, TryCatch #0 {all -> 0x0041, blocks: (B:15:0x003c, B:16:0x012f, B:23:0x0054, B:24:0x011a, B:28:0x0061, B:31:0x0104, B:40:0x00cd, B:42:0x00d3, B:44:0x00dc, B:48:0x0135), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r22, @m80.k j00.c<? super yz.g2> r24) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.c.a(long, j00.c):java.lang.Object");
    }
}
