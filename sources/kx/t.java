package kx;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final int f69039a = 64;

    /* renamed from: b, reason: collision with root package name */
    public static final int f69040b = 8;

    /* renamed from: c, reason: collision with root package name */
    public static final int f69041c = 1000;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final int[] f69042d = new int[0];

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final pz.d<int[]> f69043e = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends pz.d<int[]> {
        public a() {
            super(1000);
        }

        @Override // pz.d
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public int[] f() {
            return new int[512];
        }
    }

    public static final void c(@m80.k s sVar, @m80.k String indent, @m80.k Appendable out) {
        g0.p(sVar, "<this>");
        g0.p(indent, "indent");
        g0.p(out, "out");
        int m11 = sVar.m();
        for (int i11 = 0; i11 < m11; i11++) {
            out.append(indent);
            out.append(sVar.n(i11));
            out.append(" => ");
            out.append(sVar.q(i11));
            out.append("\n");
        }
    }
}
