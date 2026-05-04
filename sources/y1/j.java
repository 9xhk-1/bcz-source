package y1;

import a3.e0;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.n;
import com.badlogic.gdx.utils.GdxRuntimeException;
import l2.r;
import w1.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class j extends x1.a {

    /* renamed from: k, reason: collision with root package name */
    public static final String f98990k = "diffuseTexture";

    /* renamed from: l, reason: collision with root package name */
    public static final long f98991l;

    /* renamed from: m, reason: collision with root package name */
    public static final String f98992m = "specularTexture";

    /* renamed from: n, reason: collision with root package name */
    public static final long f98993n;

    /* renamed from: o, reason: collision with root package name */
    public static final String f98994o = "bumpTexture";

    /* renamed from: p, reason: collision with root package name */
    public static final long f98995p;

    /* renamed from: q, reason: collision with root package name */
    public static final String f98996q = "normalTexture";

    /* renamed from: r, reason: collision with root package name */
    public static final long f98997r;

    /* renamed from: s, reason: collision with root package name */
    public static final String f98998s = "ambientTexture";

    /* renamed from: t, reason: collision with root package name */
    public static final long f98999t;

    /* renamed from: u, reason: collision with root package name */
    public static final String f99000u = "emissiveTexture";

    /* renamed from: v, reason: collision with root package name */
    public static final long f99001v;

    /* renamed from: w, reason: collision with root package name */
    public static final String f99002w = "reflectionTexture";

    /* renamed from: x, reason: collision with root package name */
    public static final long f99003x;

    /* renamed from: y, reason: collision with root package name */
    public static long f99004y;

    /* renamed from: e, reason: collision with root package name */
    public final r<Texture> f99005e;

    /* renamed from: f, reason: collision with root package name */
    public float f99006f;

    /* renamed from: g, reason: collision with root package name */
    public float f99007g;

    /* renamed from: h, reason: collision with root package name */
    public float f99008h;

    /* renamed from: i, reason: collision with root package name */
    public float f99009i;

    /* renamed from: j, reason: collision with root package name */
    public int f99010j;

    static {
        long e11 = x1.a.e(f98990k);
        f98991l = e11;
        long e12 = x1.a.e(f98992m);
        f98993n = e12;
        long e13 = x1.a.e(f98994o);
        f98995p = e13;
        long e14 = x1.a.e(f98996q);
        f98997r = e14;
        long e15 = x1.a.e(f98998s);
        f98999t = e15;
        long e16 = x1.a.e(f99000u);
        f99001v = e16;
        long e17 = x1.a.e(f99002w);
        f99003x = e17;
        f99004y = e11 | e12 | e13 | e14 | e15 | e16 | e17;
    }

    public j(long j11) {
        super(j11);
        this.f99006f = 0.0f;
        this.f99007g = 0.0f;
        this.f99008h = 1.0f;
        this.f99009i = 1.0f;
        this.f99010j = 0;
        if (!x(j11)) {
            throw new GdxRuntimeException("Invalid type specified");
        }
        this.f99005e = new r<>();
    }

    public static j g(Texture texture) {
        return new j(f98999t, texture);
    }

    public static j i(o oVar) {
        return new j(f98999t, oVar);
    }

    public static j k(Texture texture) {
        return new j(f98995p, texture);
    }

    public static j l(o oVar) {
        return new j(f98995p, oVar);
    }

    public static j m(Texture texture) {
        return new j(f98991l, texture);
    }

    public static j o(o oVar) {
        return new j(f98991l, oVar);
    }

    public static j p(Texture texture) {
        return new j(f99001v, texture);
    }

    public static j q(o oVar) {
        return new j(f99001v, oVar);
    }

    public static j r(Texture texture) {
        return new j(f98997r, texture);
    }

    public static j s(o oVar) {
        return new j(f98997r, oVar);
    }

    public static j t(Texture texture) {
        return new j(f99003x, texture);
    }

    public static j u(o oVar) {
        return new j(f99003x, oVar);
    }

    public static j v(Texture texture) {
        return new j(f98993n, texture);
    }

    public static j w(o oVar) {
        return new j(f98993n, oVar);
    }

    public static final boolean x(long j11) {
        return (j11 & f99004y) != 0;
    }

    @Override // x1.a
    public x1.a a() {
        return new j(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(x1.a aVar) {
        long j11 = this.f97002a;
        long j12 = aVar.f97002a;
        if (j11 != j12) {
            return j11 < j12 ? -1 : 1;
        }
        j jVar = (j) aVar;
        int compareTo = this.f99005e.compareTo(jVar.f99005e);
        if (compareTo != 0) {
            return compareTo;
        }
        int i11 = this.f99010j;
        int i12 = jVar.f99010j;
        if (i11 != i12) {
            return i11 - i12;
        }
        if (!n.w(this.f99008h, jVar.f99008h)) {
            return this.f99008h > jVar.f99008h ? 1 : -1;
        }
        if (!n.w(this.f99009i, jVar.f99009i)) {
            return this.f99009i > jVar.f99009i ? 1 : -1;
        }
        if (!n.w(this.f99006f, jVar.f99006f)) {
            return this.f99006f > jVar.f99006f ? 1 : -1;
        }
        if (n.w(this.f99007g, jVar.f99007g)) {
            return 0;
        }
        return this.f99007g > jVar.f99007g ? 1 : -1;
    }

    @Override // x1.a
    public int hashCode() {
        return (((((((((((super.hashCode() * 991) + this.f99005e.hashCode()) * 991) + e0.d(this.f99006f)) * 991) + e0.d(this.f99007g)) * 991) + e0.d(this.f99008h)) * 991) + e0.d(this.f99009i)) * 991) + this.f99010j;
    }

    public void y(o oVar) {
        this.f99005e.f69250a = oVar.f();
        this.f99006f = oVar.g();
        this.f99007g = oVar.i();
        this.f99008h = oVar.h() - this.f99006f;
        this.f99009i = oVar.j() - this.f99007g;
    }

    public <T extends Texture> j(long j11, r<T> rVar) {
        this(j11);
        this.f99005e.c(rVar);
    }

    public <T extends Texture> j(long j11, r<T> rVar, float f11, float f12, float f13, float f14, int i11) {
        this(j11, rVar);
        this.f99006f = f11;
        this.f99007g = f12;
        this.f99008h = f13;
        this.f99009i = f14;
        this.f99010j = i11;
    }

    public <T extends Texture> j(long j11, r<T> rVar, float f11, float f12, float f13, float f14) {
        this(j11, rVar, f11, f12, f13, f14, 0);
    }

    public j(long j11, Texture texture) {
        this(j11);
        this.f99005e.f69250a = texture;
    }

    public j(long j11, o oVar) {
        this(j11);
        y(oVar);
    }

    public j(j jVar) {
        this(jVar.f97002a, jVar.f99005e, jVar.f99006f, jVar.f99007g, jVar.f99008h, jVar.f99009i, jVar.f99010j);
    }
}
