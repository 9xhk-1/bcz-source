package y7;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    public int f99469a = 1;

    /* renamed from: b, reason: collision with root package name */
    public String[] f99470b;

    /* renamed from: c, reason: collision with root package name */
    public Long[] f99471c;

    /* renamed from: d, reason: collision with root package name */
    public Long[] f99472d;

    /* renamed from: e, reason: collision with root package name */
    public y7.a f99473e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.net.retry.RetryImpl", f = "Retry.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {67, 70}, m = "run", n = {"task", "it", "i", "$i$a$-also-RetryImpl$run$2", "task", "it", "i", "$i$a$-also-RetryImpl$run$2"}, s = {"L$0", "L$2", "I$0", "I$2", "L$0", "L$2", "I$0", "I$2"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f99474a;

        /* renamed from: b, reason: collision with root package name */
        public Object f99475b;

        /* renamed from: c, reason: collision with root package name */
        public Object f99476c;

        /* renamed from: d, reason: collision with root package name */
        public int f99477d;

        /* renamed from: e, reason: collision with root package name */
        public int f99478e;

        /* renamed from: f, reason: collision with root package name */
        public int f99479f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f99480g;

        /* renamed from: i, reason: collision with root package name */
        public int f99482i;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f99480g = obj;
            this.f99482i |= Integer.MIN_VALUE;
            return e.this.a(null, this);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|(1:(1:(4:11|12|13|14)(2:17|18))(3:19|20|21))(2:24|(2:26|(3:28|(3:30|20|21)|23)(2:31|21))(2:32|33))))|39|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e4, code lost:
    
        if (r9.invoke(r10, r2) == r3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0042, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ed, code lost:
    
        if (r8 != (r16.f99469a - 1)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ef, code lost:
    
        r0 = r8 + 1;
        r8 = r9;
        r9 = r0;
        r0 = r8;
        r8 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f7, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00e4 -> B:13:0x00e7). Please report as a decompilation issue!!! */
    @Override // y7.c
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k x00.p<? super y7.g, ? super j00.c<? super yz.g2>, ? extends java.lang.Object> r17, @m80.k j00.c<? super yz.g2> r18) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.e.a(x00.p, j00.c):java.lang.Object");
    }

    @k
    public final y7.a b() {
        y7.a aVar = this.f99473e;
        if (aVar != null) {
            return aVar;
        }
        g0.S("backOffPolicy");
        return null;
    }

    @k
    public final Long[] c() {
        Long[] lArr = this.f99471c;
        if (lArr != null) {
            return lArr;
        }
        g0.S("connectTimeOuts");
        return null;
    }

    @k
    public final Long[] d() {
        Long[] lArr = this.f99472d;
        if (lArr != null) {
            return lArr;
        }
        g0.S("readTimeOuts");
        return null;
    }

    public final int e() {
        return this.f99469a;
    }

    @k
    public final String[] f() {
        String[] strArr = this.f99470b;
        if (strArr != null) {
            return strArr;
        }
        g0.S("urls");
        return null;
    }

    public final void g(@k y7.a aVar) {
        g0.p(aVar, "<set-?>");
        this.f99473e = aVar;
    }

    public final void h(@k Long[] lArr) {
        g0.p(lArr, "<set-?>");
        this.f99471c = lArr;
    }

    public final void i(@k Long[] lArr) {
        g0.p(lArr, "<set-?>");
        this.f99472d = lArr;
    }

    public final void j(int i11) {
        this.f99469a = i11;
    }

    public final void k(@k String[] strArr) {
        g0.p(strArr, "<set-?>");
        this.f99470b = strArr;
    }
}
