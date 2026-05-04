package s2;

import com.badlogic.gdx.graphics.Pixmap;
import w1.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class g extends q2.d {

    /* renamed from: p, reason: collision with root package name */
    public o f87414p;

    /* renamed from: q, reason: collision with root package name */
    public float f87415q;

    /* renamed from: r, reason: collision with root package name */
    public float f87416r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f87417s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f87418t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f87419u;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f87420a;

        static {
            int[] iArr = new int[Pixmap.Format.values().length];
            f87420a = iArr;
            try {
                iArr[Pixmap.Format.Alpha.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f87420a[Pixmap.Format.LuminanceAlpha.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f87420a[Pixmap.Format.RGBA4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f87420a[Pixmap.Format.RGBA8888.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public g(o oVar, float f11, float f12, boolean z11, boolean z12) {
        this.f87414p = oVar;
        this.f87415q = f11;
        this.f87416r = f12;
        this.f87417s = z11;
        this.f87418t = z12;
        this.f87419u = z(oVar);
    }

    public final boolean A(Pixmap.Format format) {
        int i11 = a.f87420a[format.ordinal()];
        return i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4;
    }

    public o B() {
        return this.f87414p;
    }

    public float C() {
        return this.f87415q;
    }

    public float D() {
        return this.f87416r;
    }

    public boolean E() {
        return this.f87417s;
    }

    public boolean F() {
        return this.f87418t;
    }

    public void G(boolean z11) {
        this.f87417s = z11;
    }

    public void H(boolean z11) {
        this.f87418t = z11;
    }

    public void I(o oVar) {
        this.f87414p = oVar;
    }

    public void J(float f11) {
        this.f87415q = f11;
    }

    public void K(float f11) {
        this.f87416r = f11;
    }

    public boolean L() {
        return this.f87419u;
    }

    public final boolean z(o oVar) {
        Pixmap.Format format = oVar.f().p1().getFormat();
        return format != null && A(format);
    }
}
