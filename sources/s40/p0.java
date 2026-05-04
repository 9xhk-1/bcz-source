package s40;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class p0 extends u40.k<y1> {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final a f87748g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final List<Integer> f87749h = a00.h0.Q(0, 0, 0, 0, 0, 0, 0, 0, 0);

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final List<Integer> f87750i = a00.h0.Q(2, 1, 0, 2, 1, 0, 2, 1, 0);

    /* renamed from: e, reason: collision with root package name */
    public final int f87751e;

    /* renamed from: f, reason: collision with root package name */
    public final int f87752f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final List<Integer> a() {
            return p0.f87750i;
        }

        @m80.k
        public final List<Integer> b() {
            return p0.f87749h;
        }

        public a() {
        }
    }

    public /* synthetic */ p0(int i11, int i12, List list, int i13, kotlin.jvm.internal.v vVar) {
        this(i11, i12, (i13 & 4) != 0 ? f87749h : list);
    }

    @Override // u40.l
    @m80.k
    public String d() {
        int i11 = this.f87751e;
        if (i11 == 1 && this.f87752f == 9) {
            return "secondFraction()";
        }
        if (i11 == 1) {
            return "secondFraction(maxLength = " + this.f87752f + ')';
        }
        int i12 = this.f87752f;
        if (i12 == 1) {
            return "secondFraction(minLength = " + this.f87751e + ')';
        }
        if (i12 == i11) {
            return "secondFraction(" + this.f87751e + ')';
        }
        return "secondFraction(" + this.f87751e + org.junit.jupiter.api.j2.O + this.f87752f + ')';
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return this.f87751e == p0Var.f87751e && this.f87752f == p0Var.f87752f;
    }

    public int hashCode() {
        return (this.f87751e * 31) + this.f87752f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(int i11, int i12, @m80.k List<Integer> zerosToAdd) {
        super(z1.f87806a.b(), i11, i12, zerosToAdd);
        kotlin.jvm.internal.g0.p(zerosToAdd, "zerosToAdd");
        this.f87751e = i11;
        this.f87752f = i12;
    }
}
