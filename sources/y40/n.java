package y40;

import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPeekSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeekSource.kt\nkotlinx/io/PeekSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 -Util.kt\nkotlinx/io/_UtilKt\n*L\n1#1,76:1\n1#2:77\n1#2:79\n52#3:78\n53#3:80\n*S KotlinDebug\n*F\n+ 1 PeekSource.kt\nkotlinx/io/PeekSource\n*L\n46#1:79\n46#1:78\n46#1:80\n*E\n"})
/* loaded from: classes8.dex */
public final class n implements p {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final c0 f99303a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final b f99304b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public t f99305c;

    /* renamed from: d, reason: collision with root package name */
    public int f99306d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f99307e;

    /* renamed from: f, reason: collision with root package name */
    public long f99308f;

    public n(@m80.k c0 upstream) {
        kotlin.jvm.internal.g0.p(upstream, "upstream");
        this.f99303a = upstream;
        b buffer = upstream.getBuffer();
        this.f99304b = buffer;
        this.f99305c = buffer.k();
        t k11 = buffer.k();
        this.f99306d = k11 != null ? k11.h() : -1;
    }

    @Override // y40.p, java.lang.AutoCloseable
    public void close() {
        this.f99307e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r3 == r4.h()) goto L15;
     */
    @Override // y40.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long r2(@m80.k y40.b r7, long r8) {
        /*
            r6 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r7, r0)
            boolean r0 = r6.f99307e
            if (r0 != 0) goto La8
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 < 0) goto L88
            y40.t r3 = r6.f99305c
            if (r3 == 0) goto L35
            y40.b r4 = r6.f99304b
            y40.t r4 = r4.k()
            if (r3 != r4) goto L2d
            int r3 = r6.f99306d
            y40.b r4 = r6.f99304b
            y40.t r4 = r4.k()
            kotlin.jvm.internal.g0.m(r4)
            int r4 = r4.h()
            if (r3 != r4) goto L2d
            goto L35
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Peek source is invalid because upstream source was used"
            r7.<init>(r8)
            throw r7
        L35:
            if (r2 != 0) goto L38
            return r0
        L38:
            y40.c0 r0 = r6.f99303a
            long r1 = r6.f99308f
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.request(r1)
            if (r0 != 0) goto L48
            r7 = -1
            return r7
        L48:
            y40.t r0 = r6.f99305c
            if (r0 != 0) goto L6b
            y40.b r0 = r6.f99304b
            y40.t r0 = r0.k()
            if (r0 == 0) goto L6b
            y40.b r0 = r6.f99304b
            y40.t r0 = r0.k()
            r6.f99305c = r0
            y40.b r0 = r6.f99304b
            y40.t r0 = r0.k()
            kotlin.jvm.internal.g0.m(r0)
            int r0 = r0.h()
            r6.f99306d = r0
        L6b:
            y40.b r0 = r6.f99304b
            long r0 = r0.r()
            long r2 = r6.f99308f
            long r0 = r0 - r2
            long r8 = java.lang.Math.min(r8, r0)
            y40.b r0 = r6.f99304b
            long r2 = r6.f99308f
            long r4 = r2 + r8
            r1 = r7
            r0.f(r1, r2, r4)
            long r0 = r6.f99308f
            long r0 = r0 + r8
            r6.f99308f = r0
            return r8
        L88:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "byteCount ("
            r7.append(r0)
            r7.append(r8)
            java.lang.String r8 = ") < 0"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        La8:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Source is closed."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: y40.n.r2(y40.b, long):long");
    }

    private static /* synthetic */ void N() {
    }
}
