package l6;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final o5.a f70168a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final v5.f f70169b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.resource.CheckAndFetchResourceVersionUC", f = "CheckAndFetchResourceVersionUC.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {29, 45, 48}, m = "invoke", n = {"$this$invoke_u24lambda_u240", "bookId", "$i$a$-runCatching-CheckAndFetchResourceVersionUC$invoke$2", "$this$invoke_u24lambda_u240", "bookId", "$i$a$-runCatching-CheckAndFetchResourceVersionUC$invoke$2", "localVersion", "remoteVersion", "$this$invoke_u24lambda_u240", "bookId", "$i$a$-runCatching-CheckAndFetchResourceVersionUC$invoke$2", "localVersion", "remoteVersion"}, s = {"L$0", "J$0", "I$0", "L$0", "J$0", "I$0", "J$1", "J$2", "L$0", "J$0", "I$0", "J$1", "J$2"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f70170a;

        /* renamed from: b, reason: collision with root package name */
        public long f70171b;

        /* renamed from: c, reason: collision with root package name */
        public long f70172c;

        /* renamed from: d, reason: collision with root package name */
        public Object f70173d;

        /* renamed from: e, reason: collision with root package name */
        public int f70174e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f70175f;

        /* renamed from: h, reason: collision with root package name */
        public int f70177h;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f70175f = obj;
            this.f70177h |= Integer.MIN_VALUE;
            return b.this.a(0L, this);
        }
    }

    public b(@m80.k o5.a versionProvider, @m80.k v5.f topicVersionRepo) {
        g0.p(versionProvider, "versionProvider");
        g0.p(topicVersionRepo, "topicVersionRepo");
        this.f70168a = versionProvider;
        this.f70169b = topicVersionRepo;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|8|(1:(1:(1:(7:13|14|15|16|(1:18)|19|20)(2:22|23))(4:24|25|26|27))(3:30|31|32))(3:41|42|(2:44|29)(1:45))|33|(2:35|36)(2:37|(2:39|29)(2:40|27))))|48|6|7|8|(0)(0)|33|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x014a, code lost:
    
        if (r0.b(r2, r13, r9, r11) != r4) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x003c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0160, code lost:
    
        r2 = kotlin.Result.Companion;
        r0 = kotlin.Result.m6308constructorimpl(kotlin.e.a(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:14:0x0037, B:15:0x014d, B:25:0x0053, B:27:0x012f, B:31:0x0065, B:33:0x0088, B:35:0x00d0, B:37:0x00ef, B:42:0x006f), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ef A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:14:0x0037, B:15:0x014d, B:25:0x0053, B:27:0x012f, B:31:0x0065, B:33:0x0088, B:35:0x00d0, B:37:0x00ef, B:42:0x006f), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r24, @m80.k j00.c<? super yz.g2> r26) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.b.a(long, j00.c):java.lang.Object");
    }
}
