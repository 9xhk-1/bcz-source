package r6;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final n f83106a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final o5.a f83107b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.atomic.CheckUpdateGameHomeUC", f = "CheckUpdateGameHomeUC.kt", i = {0, 1}, l = {13, 14}, m = "invoke", n = {"bookId", "bookId"}, s = {"J$0", "J$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f83108a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f83109b;

        /* renamed from: d, reason: collision with root package name */
        public int f83111d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f83109b = obj;
            this.f83111d |= Integer.MIN_VALUE;
            return d.this.a(0L, this);
        }
    }

    public d(@m80.k n fetchGameHomeUC, @m80.k o5.a versionProvider) {
        g0.p(fetchGameHomeUC, "fetchGameHomeUC");
        g0.p(versionProvider, "versionProvider");
        this.f83106a = fetchGameHomeUC;
        this.f83107b = versionProvider;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r6.n.c(r8, 0, r0, 1, null) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r6, @m80.k j00.c<? super yz.g2> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof r6.d.a
            if (r0 == 0) goto L13
            r0 = r8
            r6.d$a r0 = (r6.d.a) r0
            int r1 = r0.f83111d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f83111d = r1
            goto L18
        L13:
            r6.d$a r0 = new r6.d$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f83109b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f83111d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r8)
            goto L63
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            long r6 = r0.f83108a
            kotlin.e.n(r8)
            goto L4c
        L3a:
            kotlin.e.n(r8)
            o5.a r8 = r5.f83107b
            com.baicizhan.app.biz.game.repo.gameversion.ResourceId r2 = com.baicizhan.app.biz.game.repo.gameversion.ResourceId.BookSchedule
            r0.f83108a = r6
            r0.f83111d = r4
            java.lang.Object r8 = r8.a(r6, r2, r0)
            if (r8 != r1) goto L4c
            goto L62
        L4c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L66
            r6.n r8 = r5.f83106a
            r0.f83108a = r6
            r0.f83111d = r3
            r6 = 0
            r7 = 0
            java.lang.Object r6 = r6.n.c(r8, r6, r0, r4, r7)
            if (r6 != r1) goto L63
        L62:
            return r1
        L63:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        L66:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.d.a(long, j00.c):java.lang.Object");
    }
}
