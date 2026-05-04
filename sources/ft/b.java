package ft;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f52365a = new C0618b();

    /* renamed from: b, reason: collision with root package name */
    public static final b f52366b = new a();

    /* renamed from: c, reason: collision with root package name */
    public static final int f52367c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f52368d = 1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: ft.b$b, reason: collision with other inner class name */
    public static class C0618b extends b {

        /* renamed from: g, reason: collision with root package name */
        public static final float f52369g = 3.0f;

        /* renamed from: e, reason: collision with root package name */
        public final Interpolator f52370e;

        /* renamed from: f, reason: collision with root package name */
        public final Interpolator f52371f;

        public C0618b() {
            this(3.0f);
        }

        @Override // ft.b
        public float a(float f11) {
            return this.f52370e.getInterpolation(f11);
        }

        @Override // ft.b
        public float b(float f11) {
            return this.f52371f.getInterpolation(f11);
        }

        @Override // ft.b
        public float c(float f11) {
            return 1.0f / ((1.0f - a(f11)) + b(f11));
        }

        public C0618b(float f11) {
            this.f52370e = new AccelerateInterpolator(f11);
            this.f52371f = new DecelerateInterpolator(f11);
        }
    }

    public static b d(int i11) {
        if (i11 == 0) {
            return f52365a;
        }
        if (i11 == 1) {
            return f52366b;
        }
        throw new IllegalArgumentException("Unknown id: " + i11);
    }

    public abstract float a(float f11);

    public abstract float b(float f11);

    public float c(float f11) {
        return 1.0f;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends b {
        @Override // ft.b
        public float a(float f11) {
            return f11;
        }

        @Override // ft.b
        public float b(float f11) {
            return f11;
        }
    }
}
