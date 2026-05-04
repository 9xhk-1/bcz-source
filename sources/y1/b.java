package y1;

import com.badlogic.gdx.utils.GdxRuntimeException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b extends x1.a {

    /* renamed from: f, reason: collision with root package name */
    public static final String f98946f = "diffuseColor";

    /* renamed from: g, reason: collision with root package name */
    public static final long f98947g;

    /* renamed from: h, reason: collision with root package name */
    public static final String f98948h = "specularColor";

    /* renamed from: i, reason: collision with root package name */
    public static final long f98949i;

    /* renamed from: j, reason: collision with root package name */
    public static final String f98950j = "ambientColor";

    /* renamed from: k, reason: collision with root package name */
    public static final long f98951k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f98952l = "emissiveColor";

    /* renamed from: m, reason: collision with root package name */
    public static final long f98953m;

    /* renamed from: n, reason: collision with root package name */
    public static final String f98954n = "reflectionColor";

    /* renamed from: o, reason: collision with root package name */
    public static final long f98955o;

    /* renamed from: p, reason: collision with root package name */
    public static final String f98956p = "ambientLightColor";

    /* renamed from: q, reason: collision with root package name */
    public static final long f98957q;

    /* renamed from: r, reason: collision with root package name */
    public static final String f98958r = "fogColor";

    /* renamed from: s, reason: collision with root package name */
    public static final long f98959s;

    /* renamed from: t, reason: collision with root package name */
    public static long f98960t;

    /* renamed from: e, reason: collision with root package name */
    public final com.badlogic.gdx.graphics.b f98961e;

    static {
        long e11 = x1.a.e(f98946f);
        f98947g = e11;
        long e12 = x1.a.e(f98948h);
        f98949i = e12;
        long e13 = x1.a.e(f98950j);
        f98951k = e13;
        long e14 = x1.a.e(f98952l);
        f98953m = e14;
        long e15 = x1.a.e(f98954n);
        f98955o = e15;
        long e16 = x1.a.e(f98956p);
        f98957q = e16;
        long e17 = x1.a.e(f98958r);
        f98959s = e17;
        f98960t = e11 | e13 | e12 | e14 | e15 | e16 | e17;
    }

    public b(long j11) {
        super(j11);
        this.f98961e = new com.badlogic.gdx.graphics.b();
        if (!x(j11)) {
            throw new GdxRuntimeException("Invalid type specified");
        }
    }

    public static final b g(float f11, float f12, float f13, float f14) {
        return new b(f98951k, f11, f12, f13, f14);
    }

    public static final b i(com.badlogic.gdx.graphics.b bVar) {
        return new b(f98951k, bVar);
    }

    public static final b k(float f11, float f12, float f13, float f14) {
        return new b(f98957q, f11, f12, f13, f14);
    }

    public static final b l(com.badlogic.gdx.graphics.b bVar) {
        return new b(f98957q, bVar);
    }

    public static final b m(float f11, float f12, float f13, float f14) {
        return new b(f98947g, f11, f12, f13, f14);
    }

    public static final b o(com.badlogic.gdx.graphics.b bVar) {
        return new b(f98947g, bVar);
    }

    public static final b p(float f11, float f12, float f13, float f14) {
        return new b(f98953m, f11, f12, f13, f14);
    }

    public static final b q(com.badlogic.gdx.graphics.b bVar) {
        return new b(f98953m, bVar);
    }

    public static final b r(float f11, float f12, float f13, float f14) {
        return new b(f98959s, f11, f12, f13, f14);
    }

    public static final b s(com.badlogic.gdx.graphics.b bVar) {
        return new b(f98959s, bVar);
    }

    public static final b t(float f11, float f12, float f13, float f14) {
        return new b(f98955o, f11, f12, f13, f14);
    }

    public static final b u(com.badlogic.gdx.graphics.b bVar) {
        return new b(f98955o, bVar);
    }

    public static final b v(float f11, float f12, float f13, float f14) {
        return new b(f98949i, f11, f12, f13, f14);
    }

    public static final b w(com.badlogic.gdx.graphics.b bVar) {
        return new b(f98949i, bVar);
    }

    public static final boolean x(long j11) {
        return (j11 & f98960t) != 0;
    }

    @Override // x1.a
    public x1.a a() {
        return new b(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(x1.a aVar) {
        long j11 = this.f97002a;
        long j12 = aVar.f97002a;
        return j11 != j12 ? (int) (j11 - j12) : ((b) aVar).f98961e.P() - this.f98961e.P();
    }

    @Override // x1.a
    public int hashCode() {
        return (super.hashCode() * 953) + this.f98961e.P();
    }

    public b(long j11, com.badlogic.gdx.graphics.b bVar) {
        this(j11);
        if (bVar != null) {
            this.f98961e.H(bVar);
        }
    }

    public b(long j11, float f11, float f12, float f13, float f14) {
        this(j11);
        this.f98961e.F(f11, f12, f13, f14);
    }

    public b(b bVar) {
        this(bVar.f97002a, bVar.f98961e);
    }
}
