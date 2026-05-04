package y40;

import kotlin.jvm.internal.u0;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSegment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Segment.kt\nkotlinx/io/Segment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 -Util.kt\nkotlinx/io/_UtilKt\n*L\n1#1,535:1\n1#2:536\n95#3:537\n95#3:538\n95#3:539\n95#3:540\n95#3:541\n98#3:542\n98#3:543\n98#3:544\n98#3:545\n98#3:546\n98#3:547\n98#3:548\n98#3:549\n*S KotlinDebug\n*F\n+ 1 Segment.kt\nkotlinx/io/Segment\n*L\n282#1:537\n291#1:538\n292#1:539\n293#1:540\n294#1:541\n304#1:542\n305#1:543\n306#1:544\n307#1:545\n308#1:546\n309#1:547\n310#1:548\n311#1:549\n*E\n"})
/* loaded from: classes8.dex */
public final class t {

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final a f99318h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f99319i = 8192;

    /* renamed from: j, reason: collision with root package name */
    public static final int f99320j = 1024;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final byte[] f99321a;

    /* renamed from: b, reason: collision with root package name */
    public int f99322b;

    /* renamed from: c, reason: collision with root package name */
    public int f99323c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public u f99324d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public boolean f99325e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public t f99326f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public t f99327g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public final /* synthetic */ t a() {
            return new t(null);
        }

        public final /* synthetic */ t b(byte[] data, int i11, int i12, u uVar, boolean z11) {
            kotlin.jvm.internal.g0.p(data, "data");
            return new t(data, i11, i12, uVar, z11, null);
        }

        public a() {
        }
    }

    public /* synthetic */ t(kotlin.jvm.internal.v vVar) {
        this();
    }

    public final /* synthetic */ void A(t tVar) {
        this.f99327g = tVar;
    }

    public final void B(int i11, byte b11) {
        this.f99321a[this.f99323c + i11] = b11;
    }

    public final void C(int i11, byte b11, byte b12) {
        byte[] bArr = this.f99321a;
        int i12 = this.f99323c + i11;
        bArr[i12] = b11;
        bArr[i12 + 1] = b12;
    }

    public final void D(int i11, byte b11, byte b12, byte b13) {
        byte[] bArr = this.f99321a;
        int i12 = this.f99323c + i11;
        bArr[i12] = b11;
        bArr[i12 + 1] = b12;
        bArr[i12 + 2] = b13;
    }

    public final void E(int i11, byte b11, byte b12, byte b13, byte b14) {
        byte[] bArr = this.f99321a;
        int i12 = this.f99323c + i11;
        bArr[i12] = b11;
        bArr[i12 + 1] = b12;
        bArr[i12 + 2] = b13;
        bArr[i12 + 3] = b14;
    }

    @m80.k
    public final t F() {
        u uVar = this.f99324d;
        if (uVar == null) {
            uVar = w.l();
            this.f99324d = uVar;
        }
        u uVar2 = uVar;
        byte[] bArr = this.f99321a;
        int i11 = this.f99322b;
        int i12 = this.f99323c;
        uVar2.a();
        g2 g2Var = g2.f100423a;
        return new t(bArr, i11, i12, uVar2, false);
    }

    @m80.k
    public final t G(int i11) {
        t j11;
        if (i11 <= 0 || i11 > this.f99323c - this.f99322b) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i11 >= 1024) {
            j11 = F();
        } else {
            j11 = w.j();
            byte[] bArr = this.f99321a;
            byte[] bArr2 = j11.f99321a;
            int i12 = this.f99322b;
            a00.q.E0(bArr, bArr2, 0, i12, i12 + i11, 2, null);
        }
        j11.f99323c = j11.f99322b + i11;
        this.f99322b += i11;
        t tVar = this.f99327g;
        if (tVar != null) {
            kotlin.jvm.internal.g0.m(tVar);
            tVar.q(j11);
            return j11;
        }
        j11.f99326f = this;
        this.f99327g = j11;
        return j11;
    }

    public final void H(@m80.k byte[] src, int i11, int i12) {
        kotlin.jvm.internal.g0.p(src, "src");
        a00.q.v0(src, this.f99321a, this.f99323c, i11, i12);
        this.f99323c += i12 - i11;
    }

    @v0
    public final /* synthetic */ void I(byte[] data, int i11) {
        kotlin.jvm.internal.g0.p(data, "data");
    }

    public final void J(byte b11) {
        byte[] bArr = this.f99321a;
        int i11 = this.f99323c;
        this.f99323c = i11 + 1;
        bArr[i11] = b11;
    }

    public final void K(int i11) {
        byte[] bArr = this.f99321a;
        int i12 = this.f99323c;
        bArr[i12] = (byte) ((i11 >>> 24) & 255);
        bArr[i12 + 1] = (byte) ((i11 >>> 16) & 255);
        bArr[i12 + 2] = (byte) ((i11 >>> 8) & 255);
        bArr[i12 + 3] = (byte) (i11 & 255);
        this.f99323c = i12 + 4;
    }

    public final void L(long j11) {
        byte[] bArr = this.f99321a;
        int i11 = this.f99323c;
        bArr[i11] = (byte) ((j11 >>> 56) & 255);
        bArr[i11 + 1] = (byte) ((j11 >>> 48) & 255);
        bArr[i11 + 2] = (byte) ((j11 >>> 40) & 255);
        bArr[i11 + 3] = (byte) ((j11 >>> 32) & 255);
        bArr[i11 + 4] = (byte) ((j11 >>> 24) & 255);
        bArr[i11 + 5] = (byte) ((j11 >>> 16) & 255);
        bArr[i11 + 6] = (byte) ((j11 >>> 8) & 255);
        bArr[i11 + 7] = (byte) (j11 & 255);
        this.f99323c = i11 + 8;
    }

    public final void M(short s11) {
        byte[] bArr = this.f99321a;
        int i11 = this.f99323c;
        bArr[i11] = (byte) ((s11 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (s11 & 255);
        this.f99323c = i11 + 2;
    }

    public final void N(@m80.k t sink, int i11) {
        kotlin.jvm.internal.g0.p(sink, "sink");
        if (!sink.f99325e) {
            throw new IllegalStateException("only owner can write");
        }
        if (sink.f99323c + i11 > 8192) {
            if (sink.m()) {
                throw new IllegalArgumentException();
            }
            int i12 = sink.f99323c;
            int i13 = sink.f99322b;
            if ((i12 + i11) - i13 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.f99321a;
            a00.q.E0(bArr, bArr, 0, i13, i12, 2, null);
            sink.f99323c -= sink.f99322b;
            sink.f99322b = 0;
        }
        byte[] bArr2 = this.f99321a;
        byte[] bArr3 = sink.f99321a;
        int i14 = sink.f99323c;
        int i15 = this.f99322b;
        a00.q.v0(bArr2, bArr3, i14, i15, i15 + i11);
        sink.f99323c += i11;
        this.f99322b += i11;
    }

    @m80.k
    public final t a() {
        int i11;
        t tVar = this.f99327g;
        if (tVar == null) {
            throw new IllegalStateException("cannot compact");
        }
        kotlin.jvm.internal.g0.m(tVar);
        if (tVar.f99325e) {
            int i12 = this.f99323c - this.f99322b;
            t tVar2 = this.f99327g;
            kotlin.jvm.internal.g0.m(tVar2);
            int i13 = 8192 - tVar2.f99323c;
            t tVar3 = this.f99327g;
            kotlin.jvm.internal.g0.m(tVar3);
            if (tVar3.m()) {
                i11 = 0;
            } else {
                t tVar4 = this.f99327g;
                kotlin.jvm.internal.g0.m(tVar4);
                i11 = tVar4.f99322b;
            }
            if (i12 <= i13 + i11) {
                t tVar5 = this.f99327g;
                kotlin.jvm.internal.g0.m(tVar5);
                N(tVar5, i12);
                if (p() != null) {
                    throw new IllegalStateException("Check failed.");
                }
                w.h(this);
                return tVar5;
            }
        }
        return this;
    }

    @v0
    public final /* synthetic */ byte[] b(boolean z11) {
        return this.f99321a;
    }

    @m80.l
    public final u c() {
        return this.f99324d;
    }

    public final /* synthetic */ int d() {
        return this.f99323c;
    }

    public final /* synthetic */ t f() {
        return this.f99326f;
    }

    public final /* synthetic */ int h() {
        return this.f99322b;
    }

    public final /* synthetic */ t j() {
        return this.f99327g;
    }

    public final int l() {
        return this.f99321a.length - this.f99323c;
    }

    public final boolean m() {
        u uVar = this.f99324d;
        if (uVar != null) {
            return uVar.b();
        }
        return false;
    }

    public final int n() {
        return this.f99323c - this.f99322b;
    }

    public final byte o(int i11) {
        return this.f99321a[this.f99322b + i11];
    }

    @m80.l
    public final t p() {
        t tVar = this.f99326f;
        t tVar2 = this.f99327g;
        if (tVar2 != null) {
            kotlin.jvm.internal.g0.m(tVar2);
            tVar2.f99326f = this.f99326f;
        }
        t tVar3 = this.f99326f;
        if (tVar3 != null) {
            kotlin.jvm.internal.g0.m(tVar3);
            tVar3.f99327g = this.f99327g;
        }
        this.f99326f = null;
        this.f99327g = null;
        return tVar;
    }

    @m80.k
    public final t q(@m80.k t segment) {
        kotlin.jvm.internal.g0.p(segment, "segment");
        segment.f99327g = this;
        segment.f99326f = this.f99326f;
        t tVar = this.f99326f;
        if (tVar != null) {
            kotlin.jvm.internal.g0.m(tVar);
            tVar.f99327g = segment;
        }
        this.f99326f = segment;
        return segment;
    }

    public final byte r() {
        byte[] bArr = this.f99321a;
        int i11 = this.f99322b;
        this.f99322b = i11 + 1;
        return bArr[i11];
    }

    public final int s() {
        byte[] bArr = this.f99321a;
        int i11 = this.f99322b;
        int i12 = ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11] & 255) << 24);
        int i13 = i12 | ((bArr[i11 + 2] & 255) << 8);
        int i14 = (bArr[i11 + 3] & 255) | i13;
        this.f99322b = i11 + 4;
        return i14;
    }

    public final long t() {
        byte[] bArr = this.f99321a;
        long j11 = ((bArr[r1] & 255) << 56) | ((bArr[r1 + 1] & 255) << 48) | ((bArr[r1 + 2] & 255) << 40) | ((bArr[r1 + 3] & 255) << 32) | ((bArr[r1 + 4] & 255) << 24) | ((bArr[r1 + 5] & 255) << 16) | ((bArr[r1 + 6] & 255) << 8) | (bArr[r1 + 7] & 255);
        this.f99322b = this.f99322b + 8;
        return j11;
    }

    public final short u() {
        byte[] bArr = this.f99321a;
        int i11 = this.f99322b;
        int i12 = (bArr[i11] & 255) << 8;
        short s11 = (short) ((bArr[i11 + 1] & 255) | i12);
        this.f99322b = i11 + 2;
        return s11;
    }

    public final void v(@m80.k byte[] dst, int i11, int i12) {
        kotlin.jvm.internal.g0.p(dst, "dst");
        int i13 = i12 - i11;
        byte[] bArr = this.f99321a;
        int i14 = this.f99322b;
        a00.q.v0(bArr, dst, i11, i14, i14 + i13);
        this.f99322b += i13;
    }

    public final void w(@m80.l u uVar) {
        this.f99324d = uVar;
    }

    public final /* synthetic */ void x(int i11) {
        this.f99323c = i11;
    }

    public final /* synthetic */ void y(t tVar) {
        this.f99326f = tVar;
    }

    public final /* synthetic */ void z(int i11) {
        this.f99322b = i11;
    }

    public /* synthetic */ t(byte[] bArr, int i11, int i12, u uVar, boolean z11, kotlin.jvm.internal.v vVar) {
        this(bArr, i11, i12, uVar, z11);
    }

    public t() {
        this.f99321a = new byte[8192];
        this.f99325e = true;
        this.f99324d = null;
    }

    public t(byte[] bArr, int i11, int i12, u uVar, boolean z11) {
        this.f99321a = bArr;
        this.f99322b = i11;
        this.f99323c = i12;
        this.f99324d = uVar;
        this.f99325e = z11;
    }

    @v0
    public static /* synthetic */ void e() {
    }

    @v0
    public static /* synthetic */ void g() {
    }

    @v0
    public static /* synthetic */ void i() {
    }

    @v0
    public static /* synthetic */ void k() {
    }
}
