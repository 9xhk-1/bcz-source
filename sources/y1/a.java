package y1;

import a3.e0;
import com.badlogic.gdx.math.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a extends x1.a {

    /* renamed from: i, reason: collision with root package name */
    public static final String f98940i = "blended";

    /* renamed from: j, reason: collision with root package name */
    public static final long f98941j = x1.a.e(f98940i);

    /* renamed from: e, reason: collision with root package name */
    public boolean f98942e;

    /* renamed from: f, reason: collision with root package name */
    public int f98943f;

    /* renamed from: g, reason: collision with root package name */
    public int f98944g;

    /* renamed from: h, reason: collision with root package name */
    public float f98945h;

    public a() {
        this((a) null);
    }

    public static final boolean i(long j11) {
        return (f98941j & j11) == j11;
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(x1.a aVar) {
        long j11 = this.f97002a;
        long j12 = aVar.f97002a;
        if (j11 != j12) {
            return (int) (j11 - j12);
        }
        a aVar2 = (a) aVar;
        boolean z11 = this.f98942e;
        if (z11 != aVar2.f98942e) {
            return z11 ? 1 : -1;
        }
        int i11 = this.f98943f;
        int i12 = aVar2.f98943f;
        if (i11 != i12) {
            return i11 - i12;
        }
        int i13 = this.f98944g;
        int i14 = aVar2.f98944g;
        if (i13 != i14) {
            return i13 - i14;
        }
        if (n.w(this.f98945h, aVar2.f98945h)) {
            return 0;
        }
        return this.f98945h < aVar2.f98945h ? 1 : -1;
    }

    @Override // x1.a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public a a() {
        return new a(this);
    }

    @Override // x1.a
    public int hashCode() {
        return (((((((super.hashCode() * 947) + (this.f98942e ? 1 : 0)) * 947) + this.f98943f) * 947) + this.f98944g) * 947) + e0.d(this.f98945h);
    }

    public a(boolean z11, int i11, int i12, float f11) {
        super(f98941j);
        this.f98942e = z11;
        this.f98943f = i11;
        this.f98944g = i12;
        this.f98945h = f11;
    }

    public a(int i11, int i12, float f11) {
        this(true, i11, i12, f11);
    }

    public a(int i11, int i12) {
        this(i11, i12, 1.0f);
    }

    public a(boolean z11, float f11) {
        this(z11, com.badlogic.gdx.graphics.f.f11653r, com.badlogic.gdx.graphics.f.f11659s, f11);
    }

    public a(float f11) {
        this(true, f11);
    }

    public a(a aVar) {
        this(aVar == null || aVar.f98942e, aVar == null ? com.badlogic.gdx.graphics.f.f11653r : aVar.f98943f, aVar == null ? com.badlogic.gdx.graphics.f.f11659s : aVar.f98944g, aVar == null ? 1.0f : aVar.f98945h);
    }
}
