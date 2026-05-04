package l6;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final v5.g f70204a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final v5.e f70205b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.resource.CleanResourceCacheUC", f = "CleanResourceCacheUC.kt", i = {}, l = {14, 15}, m = "invoke", n = {}, s = {}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f70206a;

        /* renamed from: c, reason: collision with root package name */
        public int f70208c;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f70206a = obj;
            this.f70208c |= Integer.MIN_VALUE;
            return h.this.a(this);
        }
    }

    public h(@m80.k v5.g wordResourceRepo, @m80.k v5.e mediaFileRepo) {
        g0.p(wordResourceRepo, "wordResourceRepo");
        g0.p(mediaFileRepo, "mediaFileRepo");
        this.f70204a = wordResourceRepo;
        this.f70205b = mediaFileRepo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (r6.a(r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r6.a(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@m80.k j00.c<? super yz.g2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof l6.h.a
            if (r0 == 0) goto L13
            r0 = r6
            l6.h$a r0 = (l6.h.a) r0
            int r1 = r0.f70208c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f70208c = r1
            goto L18
        L13:
            l6.h$a r0 = new l6.h$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f70206a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f70208c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r6)
            goto L51
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.e.n(r6)
            goto L46
        L38:
            kotlin.e.n(r6)
            v5.g r6 = r5.f70204a
            r0.f70208c = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L46
            goto L50
        L46:
            v5.e r6 = r5.f70205b
            r0.f70208c = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L51
        L50:
            return r1
        L51:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.h.a(j00.c):java.lang.Object");
    }
}
