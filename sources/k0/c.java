package k0;

import coil.request.ImageRequest;
import java.util.List;
import k0.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l00.d;
import m80.k;
import m80.l;
import o0.h;
import q0.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class c implements b.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ImageRequest f64861a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<b> f64862b;

    /* renamed from: c, reason: collision with root package name */
    public final int f64863c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ImageRequest f64864d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final g f64865e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final b0.c f64866f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f64867g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "coil.intercept.RealInterceptorChain", f = "RealInterceptorChain.kt", i = {0, 0}, l = {32}, m = "proceed", n = {"this", "interceptor"}, s = {"L$0", "L$1"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f64868a;

        /* renamed from: b, reason: collision with root package name */
        public Object f64869b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f64870c;

        /* renamed from: e, reason: collision with root package name */
        public int f64872e;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f64870c = obj;
            this.f64872e |= Integer.MIN_VALUE;
            return c.this.c(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k ImageRequest imageRequest, @k List<? extends b> list, int i11, @k ImageRequest imageRequest2, @k g gVar, @k b0.c cVar, boolean z11) {
        this.f64861a = imageRequest;
        this.f64862b = list;
        this.f64863c = i11;
        this.f64864d = imageRequest2;
        this.f64865e = gVar;
        this.f64866f = cVar;
        this.f64867g = z11;
    }

    public static /* synthetic */ c g(c cVar, int i11, ImageRequest imageRequest, g gVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = cVar.f64863c;
        }
        if ((i12 & 2) != 0) {
            imageRequest = cVar.f();
        }
        if ((i12 & 4) != 0) {
            gVar = cVar.getSize();
        }
        return cVar.e(i11, imageRequest, gVar);
    }

    @Override // k0.b.a
    @k
    public b.a a(@k g gVar) {
        return g(this, 0, null, gVar, 3, null);
    }

    @Override // k0.b.a
    @k
    public b.a b(@k ImageRequest imageRequest) {
        int i11 = this.f64863c;
        if (i11 > 0) {
            d(imageRequest, this.f64862b.get(i11 - 1));
        }
        return g(this, 0, imageRequest, null, 5, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // k0.b.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(@m80.k coil.request.ImageRequest r11, @m80.k j00.c<? super o0.g> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof k0.c.a
            if (r0 == 0) goto L13
            r0 = r12
            k0.c$a r0 = (k0.c.a) r0
            int r1 = r0.f64872e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f64872e = r1
            goto L18
        L13:
            k0.c$a r0 = new k0.c$a
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f64870c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f64872e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r11 = r0.f64869b
            k0.b r11 = (k0.b) r11
            java.lang.Object r0 = r0.f64868a
            k0.c r0 = (k0.c) r0
            kotlin.e.n(r12)
            r4 = r10
            goto L75
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3a:
            kotlin.e.n(r12)
            int r12 = r10.f64863c
            if (r12 <= 0) goto L4d
            java.util.List<k0.b> r2 = r10.f64862b
            int r12 = r12 - r3
            java.lang.Object r12 = r2.get(r12)
            k0.b r12 = (k0.b) r12
            r10.d(r11, r12)
        L4d:
            java.util.List<k0.b> r12 = r10.f64862b
            int r2 = r10.f64863c
            java.lang.Object r12 = r12.get(r2)
            k0.b r12 = (k0.b) r12
            int r2 = r10.f64863c
            int r5 = r2 + 1
            r8 = 4
            r9 = 0
            r7 = 0
            r4 = r10
            r6 = r11
            k0.c r11 = g(r4, r5, r6, r7, r8, r9)
            r0.f64868a = r4
            r0.f64869b = r12
            r0.f64872e = r3
            java.lang.Object r11 = r12.a(r11, r0)
            if (r11 != r1) goto L71
            return r1
        L71:
            r0 = r12
            r12 = r11
            r11 = r0
            r0 = r4
        L75:
            o0.g r12 = (o0.g) r12
            coil.request.ImageRequest r1 = r12.b()
            r0.d(r1, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.c.c(coil.request.ImageRequest, j00.c):java.lang.Object");
    }

    public final void d(ImageRequest imageRequest, b bVar) {
        if (imageRequest.l() != this.f64861a.l()) {
            throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's context.").toString());
        }
        if (imageRequest.m() == h.f75461a) {
            throw new IllegalStateException(("Interceptor '" + bVar + "' cannot set the request's data to null.").toString());
        }
        if (imageRequest.M() != this.f64861a.M()) {
            throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's target.").toString());
        }
        if (imageRequest.z() != this.f64861a.z()) {
            throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's lifecycle.").toString());
        }
        if (imageRequest.K() == this.f64861a.K()) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    public final c e(int i11, ImageRequest imageRequest, g gVar) {
        return new c(this.f64861a, this.f64862b, i11, imageRequest, gVar, this.f64866f, this.f64867g);
    }

    @Override // k0.b.a
    @k
    public ImageRequest f() {
        return this.f64864d;
    }

    @Override // k0.b.a
    @k
    public g getSize() {
        return this.f64865e;
    }

    @k
    public final b0.c h() {
        return this.f64866f;
    }

    public final int i() {
        return this.f64863c;
    }

    @k
    public final ImageRequest j() {
        return this.f64861a;
    }

    @k
    public final List<b> k() {
        return this.f64862b;
    }

    public final boolean l() {
        return this.f64867g;
    }
}
