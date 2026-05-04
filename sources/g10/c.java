package g10;

import kotlin.jvm.internal.g0;
import yz.j2;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c extends g10.a implements g<Character>, r<Character> {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final a f52508e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final c f52509f = new c(1, 0);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final c a() {
            return c.f52509f;
        }

        public a() {
        }
    }

    public c(char c11, char c12) {
        super(c11, c12, 1);
    }

    @Override // g10.g
    public /* bridge */ /* synthetic */ boolean contains(Character ch2) {
        return k(ch2.charValue());
    }

    @Override // g10.a
    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        return d() == cVar.d() && f() == cVar.f();
    }

    @Override // g10.a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (d() * to.c.f90845b) + f();
    }

    @Override // g10.a, g10.g
    public boolean isEmpty() {
        return g0.t(d(), f()) > 0;
    }

    public boolean k(char c11) {
        return g0.t(d(), c11) <= 0 && g0.t(c11, f()) <= 0;
    }

    @Override // g10.r
    @m80.k
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Character b() {
        if (f() != 65535) {
            return Character.valueOf((char) (f() + 1));
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }

    @Override // g10.g
    @m80.k
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Character getEndInclusive() {
        return Character.valueOf(f());
    }

    @Override // g10.g
    @m80.k
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Character getStart() {
        return Character.valueOf(d());
    }

    @Override // g10.a
    @m80.k
    public String toString() {
        return d() + zr.m.f102856e + f();
    }

    @y0(version = "1.9")
    @yz.n(message = "Can throw an exception when it's impossible to represent the value with Char type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @j2(markerClass = {kotlin.c.class})
    public static /* synthetic */ void m() {
    }
}
