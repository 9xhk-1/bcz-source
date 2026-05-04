package y1;

import a3.e0;
import com.badlogic.gdx.math.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class f extends x1.a {

    /* renamed from: f, reason: collision with root package name */
    public static final String f98976f = "shininess";

    /* renamed from: g, reason: collision with root package name */
    public static final long f98977g = x1.a.e(f98976f);

    /* renamed from: h, reason: collision with root package name */
    public static final String f98978h = "alphaTest";

    /* renamed from: i, reason: collision with root package name */
    public static final long f98979i = x1.a.e(f98978h);

    /* renamed from: e, reason: collision with root package name */
    public float f98980e;

    public f(long j11) {
        super(j11);
    }

    public static f g(float f11) {
        return new f(f98979i, f11);
    }

    public static f i(float f11) {
        return new f(f98977g, f11);
    }

    @Override // x1.a
    public x1.a a() {
        return new f(this.f97002a, this.f98980e);
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(x1.a aVar) {
        long j11 = this.f97002a;
        long j12 = aVar.f97002a;
        if (j11 != j12) {
            return (int) (j11 - j12);
        }
        float f11 = ((f) aVar).f98980e;
        if (n.w(this.f98980e, f11)) {
            return 0;
        }
        return this.f98980e < f11 ? -1 : 1;
    }

    @Override // x1.a
    public int hashCode() {
        return (super.hashCode() * 977) + e0.d(this.f98980e);
    }

    public f(long j11, float f11) {
        super(j11);
        this.f98980e = f11;
    }
}
