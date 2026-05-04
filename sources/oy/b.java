package oy;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.plugins.partialcontent.BodyTransformedHookKt", f = "BodyTransformedHook.kt", i = {0, 0, 0, 0, 0}, l = {42, 43}, m = "tryProcessRange", n = {"$this$tryProcessRange", "content", "rangesSpecifier", "length", "maxRangeCount"}, s = {"L$0", "L$1", "L$2", "J$0", "I$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f78492a;

        /* renamed from: b, reason: collision with root package name */
        public Object f78493b;

        /* renamed from: c, reason: collision with root package name */
        public Object f78494c;

        /* renamed from: d, reason: collision with root package name */
        public long f78495d;

        /* renamed from: e, reason: collision with root package name */
        public int f78496e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f78497f;

        /* renamed from: g, reason: collision with root package name */
        public int f78498g;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f78497f = obj;
            this.f78498g |= Integer.MIN_VALUE;
            return b.a(null, null, null, null, 0L, 0, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        if (oy.g.k(r5, r6, r7, r8, r10, r0) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (r12 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@m80.k oy.a.C0964a r5, @m80.k mx.v.e r6, @m80.k zx.b r7, @m80.k ix.y1 r8, long r9, int r11, @m80.k j00.c<? super yz.g2> r12) {
        /*
            boolean r0 = r12 instanceof oy.b.a
            if (r0 == 0) goto L13
            r0 = r12
            oy.b$a r0 = (oy.b.a) r0
            int r1 = r0.f78498g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f78498g = r1
            goto L18
        L13:
            oy.b$a r0 = new oy.b$a
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f78497f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f78498g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4d
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r12)
            goto L7c
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            int r11 = r0.f78496e
            long r9 = r0.f78495d
            java.lang.Object r5 = r0.f78494c
            r8 = r5
            ix.y1 r8 = (ix.y1) r8
            java.lang.Object r5 = r0.f78493b
            r6 = r5
            mx.v$e r6 = (mx.v.e) r6
            java.lang.Object r5 = r0.f78492a
            oy.a$a r5 = (oy.a.C0964a) r5
            kotlin.e.n(r12)
        L49:
            r7 = r8
            r8 = r9
            r10 = r11
            goto L63
        L4d:
            kotlin.e.n(r12)
            r0.f78492a = r5
            r0.f78493b = r6
            r0.f78494c = r8
            r0.f78495d = r9
            r0.f78496e = r11
            r0.f78498g = r4
            java.lang.Object r12 = oy.g.b(r6, r7, r0)
            if (r12 != r1) goto L49
            goto L7b
        L63:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r11 = r12.booleanValue()
            if (r11 == 0) goto L7f
            r11 = 0
            r0.f78492a = r11
            r0.f78493b = r11
            r0.f78494c = r11
            r0.f78498g = r3
            r11 = r0
            java.lang.Object r5 = oy.g.k(r5, r6, r7, r8, r10, r11)
            if (r5 != r1) goto L7c
        L7b:
            return r1
        L7c:
            yz.g2 r5 = yz.g2.f100423a
            return r5
        L7f:
            oy.i$a r7 = new oy.i$a
            r7.<init>(r6)
            r5.b(r7)
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: oy.b.a(oy.a$a, mx.v$e, zx.b, ix.y1, long, int, j00.c):java.lang.Object");
    }
}
