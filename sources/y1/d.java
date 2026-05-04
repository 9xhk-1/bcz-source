package y1;

import a3.e0;
import com.badlogic.gdx.math.n;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d extends x1.a {

    /* renamed from: i, reason: collision with root package name */
    public static final String f98966i = "depthStencil";

    /* renamed from: j, reason: collision with root package name */
    public static final long f98967j;

    /* renamed from: k, reason: collision with root package name */
    public static long f98968k;

    /* renamed from: e, reason: collision with root package name */
    public int f98969e;

    /* renamed from: f, reason: collision with root package name */
    public float f98970f;

    /* renamed from: g, reason: collision with root package name */
    public float f98971g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f98972h;

    static {
        long e11 = x1.a.e(f98966i);
        f98967j = e11;
        f98968k = e11;
    }

    public d() {
        this(com.badlogic.gdx.graphics.f.f11596h2);
    }

    public static final boolean g(long j11) {
        return (j11 & f98968k) != 0;
    }

    @Override // x1.a
    public x1.a a() {
        return new d(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(x1.a aVar) {
        long j11 = this.f97002a;
        long j12 = aVar.f97002a;
        if (j11 != j12) {
            return (int) (j11 - j12);
        }
        d dVar = (d) aVar;
        int i11 = this.f98969e;
        int i12 = dVar.f98969e;
        if (i11 != i12) {
            return i11 - i12;
        }
        boolean z11 = this.f98972h;
        if (z11 != dVar.f98972h) {
            return z11 ? -1 : 1;
        }
        if (!n.w(this.f98970f, dVar.f98970f)) {
            return this.f98970f < dVar.f98970f ? -1 : 1;
        }
        if (n.w(this.f98971g, dVar.f98971g)) {
            return 0;
        }
        return this.f98971g < dVar.f98971g ? -1 : 1;
    }

    @Override // x1.a
    public int hashCode() {
        return (((((((super.hashCode() * 971) + this.f98969e) * 971) + e0.d(this.f98970f)) * 971) + e0.d(this.f98971g)) * 971) + (this.f98972h ? 1 : 0);
    }

    public d(boolean z11) {
        this(com.badlogic.gdx.graphics.f.f11596h2, z11);
    }

    public d(int i11) {
        this(i11, true);
    }

    public d(int i11, boolean z11) {
        this(i11, 0.0f, 1.0f, z11);
    }

    public d(int i11, float f11, float f12) {
        this(i11, f11, f12, true);
    }

    public d(int i11, float f11, float f12, boolean z11) {
        this(f98967j, i11, f11, f12, z11);
    }

    public d(long j11, int i11, float f11, float f12, boolean z11) {
        super(j11);
        if (g(j11)) {
            this.f98969e = i11;
            this.f98970f = f11;
            this.f98971g = f12;
            this.f98972h = z11;
            return;
        }
        throw new GdxRuntimeException("Invalid type specified");
    }

    public d(d dVar) {
        this(dVar.f97002a, dVar.f98969e, dVar.f98970f, dVar.f98971g, dVar.f98972h);
    }
}
