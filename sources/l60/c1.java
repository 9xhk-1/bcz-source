package l60;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nSegment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Segment.kt\nokio/Segment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n1#2:188\n*E\n"})
/* loaded from: classes8.dex */
public final class c1 {

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final a f70380h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f70381i = 8192;

    /* renamed from: j, reason: collision with root package name */
    public static final int f70382j = 1024;

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final byte[] f70383a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public int f70384b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public int f70385c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public boolean f70386d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public boolean f70387e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public c1 f70388f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public c1 f70389g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    public c1() {
        this.f70383a = new byte[8192];
        this.f70387e = true;
        this.f70386d = false;
    }

    public final void a() {
        int i11;
        c1 c1Var = this.f70389g;
        if (c1Var == this) {
            throw new IllegalStateException("cannot compact");
        }
        kotlin.jvm.internal.g0.m(c1Var);
        if (c1Var.f70387e) {
            int i12 = this.f70385c - this.f70384b;
            c1 c1Var2 = this.f70389g;
            kotlin.jvm.internal.g0.m(c1Var2);
            int i13 = 8192 - c1Var2.f70385c;
            c1 c1Var3 = this.f70389g;
            kotlin.jvm.internal.g0.m(c1Var3);
            if (c1Var3.f70386d) {
                i11 = 0;
            } else {
                c1 c1Var4 = this.f70389g;
                kotlin.jvm.internal.g0.m(c1Var4);
                i11 = c1Var4.f70384b;
            }
            if (i12 > i13 + i11) {
                return;
            }
            c1 c1Var5 = this.f70389g;
            kotlin.jvm.internal.g0.m(c1Var5);
            g(c1Var5, i12);
            b();
            d1.d(this);
        }
    }

    @m80.l
    public final c1 b() {
        c1 c1Var = this.f70388f;
        if (c1Var == this) {
            c1Var = null;
        }
        c1 c1Var2 = this.f70389g;
        kotlin.jvm.internal.g0.m(c1Var2);
        c1Var2.f70388f = this.f70388f;
        c1 c1Var3 = this.f70388f;
        kotlin.jvm.internal.g0.m(c1Var3);
        c1Var3.f70389g = this.f70389g;
        this.f70388f = null;
        this.f70389g = null;
        return c1Var;
    }

    @m80.k
    public final c1 c(@m80.k c1 segment) {
        kotlin.jvm.internal.g0.p(segment, "segment");
        segment.f70389g = this;
        segment.f70388f = this.f70388f;
        c1 c1Var = this.f70388f;
        kotlin.jvm.internal.g0.m(c1Var);
        c1Var.f70389g = segment;
        this.f70388f = segment;
        return segment;
    }

    @m80.k
    public final c1 d() {
        this.f70386d = true;
        return new c1(this.f70383a, this.f70384b, this.f70385c, true, false);
    }

    @m80.k
    public final c1 e(int i11) {
        c1 e11;
        if (i11 <= 0 || i11 > this.f70385c - this.f70384b) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i11 >= 1024) {
            e11 = d();
        } else {
            e11 = d1.e();
            byte[] bArr = this.f70383a;
            byte[] bArr2 = e11.f70383a;
            int i12 = this.f70384b;
            a00.q.E0(bArr, bArr2, 0, i12, i12 + i11, 2, null);
        }
        e11.f70385c = e11.f70384b + i11;
        this.f70384b += i11;
        c1 c1Var = this.f70389g;
        kotlin.jvm.internal.g0.m(c1Var);
        c1Var.c(e11);
        return e11;
    }

    @m80.k
    public final c1 f() {
        byte[] bArr = this.f70383a;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        return new c1(copyOf, this.f70384b, this.f70385c, false, true);
    }

    public final void g(@m80.k c1 sink, int i11) {
        kotlin.jvm.internal.g0.p(sink, "sink");
        if (!sink.f70387e) {
            throw new IllegalStateException("only owner can write");
        }
        int i12 = sink.f70385c;
        if (i12 + i11 > 8192) {
            if (sink.f70386d) {
                throw new IllegalArgumentException();
            }
            int i13 = sink.f70384b;
            if ((i12 + i11) - i13 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.f70383a;
            a00.q.E0(bArr, bArr, 0, i13, i12, 2, null);
            sink.f70385c -= sink.f70384b;
            sink.f70384b = 0;
        }
        byte[] bArr2 = this.f70383a;
        byte[] bArr3 = sink.f70383a;
        int i14 = sink.f70385c;
        int i15 = this.f70384b;
        a00.q.v0(bArr2, bArr3, i14, i15, i15 + i11);
        sink.f70385c += i11;
        this.f70384b += i11;
    }

    public c1(@m80.k byte[] data, int i11, int i12, boolean z11, boolean z12) {
        kotlin.jvm.internal.g0.p(data, "data");
        this.f70383a = data;
        this.f70384b = i11;
        this.f70385c = i12;
        this.f70386d = z11;
        this.f70387e = z12;
    }
}
