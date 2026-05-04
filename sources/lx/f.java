package lx;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final int f71662a = 4096;

    /* renamed from: b, reason: collision with root package name */
    public static final int f71663b = 2048;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final pz.h<char[]> f71664c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends pz.g<char[]> {
        @Override // pz.h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public char[] U6() {
            return new char[2048];
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends pz.d<char[]> {
        public b() {
            super(4096);
        }

        @Override // pz.d
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public char[] f() {
            return new char[2048];
        }
    }

    static {
        f71664c = e.a() ? new a() : new b();
    }

    @m80.k
    public static final pz.h<char[]> a() {
        return f71664c;
    }
}
