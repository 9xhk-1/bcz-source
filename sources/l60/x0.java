package l60;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nPeekSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeekSource.kt\nokio/PeekSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
/* loaded from: classes8.dex */
public final class x0 implements g1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m f70506a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final k f70507b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public c1 f70508c;

    /* renamed from: d, reason: collision with root package name */
    public int f70509d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f70510e;

    /* renamed from: f, reason: collision with root package name */
    public long f70511f;

    public x0(@m80.k m upstream) {
        kotlin.jvm.internal.g0.p(upstream, "upstream");
        this.f70506a = upstream;
        k buffer = upstream.getBuffer();
        this.f70507b = buffer;
        c1 c1Var = buffer.f70446a;
        this.f70508c = c1Var;
        this.f70509d = c1Var != null ? c1Var.f70384b : -1;
    }

    @Override // l60.g1
    @m80.k
    public i1 D() {
        return this.f70506a.D();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r3 == r4.f70384b) goto L15;
     */
    @Override // l60.g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long L3(@m80.k l60.k r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L74
            boolean r3 = r8.f70510e
            if (r3 != 0) goto L6c
            l60.c1 r3 = r8.f70508c
            if (r3 == 0) goto L2b
            l60.k r4 = r8.f70507b
            l60.c1 r4 = r4.f70446a
            if (r3 != r4) goto L23
            int r3 = r8.f70509d
            kotlin.jvm.internal.g0.m(r4)
            int r4 = r4.f70384b
            if (r3 != r4) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            l60.m r0 = r8.f70506a
            long r1 = r8.f70511f
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.request(r1)
            if (r0 != 0) goto L3e
            r9 = -1
            return r9
        L3e:
            l60.c1 r0 = r8.f70508c
            if (r0 != 0) goto L51
            l60.k r0 = r8.f70507b
            l60.c1 r0 = r0.f70446a
            if (r0 == 0) goto L51
            r8.f70508c = r0
            kotlin.jvm.internal.g0.m(r0)
            int r0 = r0.f70384b
            r8.f70509d = r0
        L51:
            l60.k r0 = r8.f70507b
            long r0 = r0.size()
            long r2 = r8.f70511f
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            l60.k r2 = r8.f70507b
            long r4 = r8.f70511f
            r3 = r9
            r2.c0(r3, r4, r6)
            long r9 = r8.f70511f
            long r9 = r9 + r6
            r8.f70511f = r9
            return r6
        L6c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L74:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: l60.x0.L3(l60.k, long):long");
    }

    @Override // l60.g1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f70510e = true;
    }
}
