package i7;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.c(binds = {i7.a.class})
@oa0.j(c.f60213a)
/* loaded from: classes3.dex */
public final class d implements i7.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final n7.e f60216b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final r7.b f60217c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.synservice.SynAll", f = "ISynTask.kt", i = {}, l = {32, 33}, m = "sync", n = {}, s = {}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f60218a;

        /* renamed from: c, reason: collision with root package name */
        public int f60220c;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f60218a = obj;
            this.f60220c |= Integer.MIN_VALUE;
            return d.this.a(this);
        }
    }

    public d(@k n7.e basicInfoRepo, @k r7.b bookSyncer) {
        g0.p(basicInfoRepo, "basicInfoRepo");
        g0.p(bookSyncer, "bookSyncer");
        this.f60216b = basicInfoRepo;
        this.f60217c = bookSyncer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (r12.a(r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r12.u2(false, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // i7.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k j00.c<? super yz.g2> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof i7.d.a
            if (r0 == 0) goto L13
            r0 = r12
            i7.d$a r0 = (i7.d.a) r0
            int r1 = r0.f60220c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f60220c = r1
            goto L18
        L13:
            i7.d$a r0 = new i7.d$a
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f60218a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f60220c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r12)
            goto L5e
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L34:
            kotlin.e.n(r12)
            goto L53
        L38:
            kotlin.e.n(r12)
            z6.b r5 = z6.b.f101032b
            r9 = 4
            r10 = 0
            java.lang.String r6 = "SynService"
            java.lang.String r7 = "SynAll"
            r8 = 0
            z6.b.j(r5, r6, r7, r8, r9, r10)
            n7.e r12 = r11.f60216b
            r0.f60220c = r4
            r2 = 0
            java.lang.Object r12 = r12.u2(r2, r0)
            if (r12 != r1) goto L53
            goto L5d
        L53:
            r7.b r12 = r11.f60217c
            r0.f60220c = r3
            java.lang.Object r12 = r12.a(r0)
            if (r12 != r1) goto L5e
        L5d:
            return r1
        L5e:
            yz.g2 r12 = yz.g2.f100423a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.d.a(j00.c):java.lang.Object");
    }
}
