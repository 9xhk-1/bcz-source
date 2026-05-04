package r40;

import kotlinx.datetime.DateTimeFormatException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0(with = x40.f.class)
/* loaded from: classes8.dex */
public final class k extends l {

    @m80.k
    public static final a Companion = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f83061a;

    /* renamed from: b, reason: collision with root package name */
    public final int f83062b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final k a(@m80.k String text) {
            kotlin.jvm.internal.g0.p(text, "text");
            l a11 = l.Companion.a(text);
            if (a11 instanceof k) {
                return (k) a11;
            }
            throw new DateTimeFormatException("Period " + a11 + " (parsed from string " + text + ") is not date-based");
        }

        @m80.k
        public final f50.i<k> serializer() {
            return x40.f.f97426b;
        }

        public a() {
        }
    }

    public k(long j11, int i11) {
        super(null);
        this.f83061a = j11;
        this.f83062b = i11;
    }

    @Override // r40.l
    public int b() {
        return this.f83062b;
    }

    @Override // r40.l
    public int c() {
        return 0;
    }

    @Override // r40.l
    public int d() {
        return 0;
    }

    @Override // r40.l
    public int f() {
        return 0;
    }

    @Override // r40.l
    public int g() {
        return 0;
    }

    @Override // r40.l
    public long h() {
        return this.f83061a;
    }

    @Override // r40.l
    public long i() {
        return 0L;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k(int r1, int r2, int r3) {
        /*
            r0 = this;
            long r1 = r40.n.c(r1, r2)
            r0.<init>(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r40.k.<init>(int, int, int):void");
    }

    public /* synthetic */ k(int i11, int i12, int i13, int i14, kotlin.jvm.internal.v vVar) {
        this((i14 & 1) != 0 ? 0 : i11, (i14 & 2) != 0 ? 0 : i12, (i14 & 4) != 0 ? 0 : i13);
    }
}
