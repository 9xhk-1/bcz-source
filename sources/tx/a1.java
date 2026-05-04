package tx;

import yz.o1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.h
/* loaded from: classes8.dex */
public final class a1 {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f91061b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final byte f91062c = g((byte) 0);

    /* renamed from: d, reason: collision with root package name */
    public static final byte f91063d = g((byte) 2);

    /* renamed from: e, reason: collision with root package name */
    public static final byte f91064e = g((byte) 4);

    /* renamed from: f, reason: collision with root package name */
    public static final byte f91065f = g((byte) 8);

    /* renamed from: g, reason: collision with root package name */
    public static final byte f91066g = g((byte) 16);

    /* renamed from: a, reason: collision with root package name */
    public final byte f91067a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public final byte a() {
            return a1.f91063d;
        }

        public final byte b() {
            return a1.f91066g;
        }

        public final byte c() {
            return a1.f91064e;
        }

        public final byte d() {
            return a1.f91065f;
        }

        public final byte e() {
            return a1.f91062c;
        }

        public a() {
        }
    }

    public /* synthetic */ a1(byte b11) {
        this.f91067a = b11;
    }

    public static final /* synthetic */ a1 f(byte b11) {
        return new a1(b11);
    }

    public static byte h(int i11) {
        return g(o1.i((byte) i11));
    }

    public static boolean i(byte b11, Object obj) {
        return (obj instanceof a1) && b11 == ((a1) obj).o();
    }

    public static final boolean j(byte b11, byte b12) {
        return o1.r(b11, b12);
    }

    public static final int k(byte b11) {
        return b11 & 255;
    }

    public static int m(byte b11) {
        return o1.x(b11);
    }

    public static String n(byte b11) {
        return "TypeOfService(value=" + ((Object) o1.f0(b11)) + ')';
    }

    public boolean equals(Object obj) {
        return i(this.f91067a, obj);
    }

    public int hashCode() {
        return m(this.f91067a);
    }

    public final byte l() {
        return this.f91067a;
    }

    public final /* synthetic */ byte o() {
        return this.f91067a;
    }

    public String toString() {
        return n(this.f91067a);
    }

    public static byte g(byte b11) {
        return b11;
    }
}
