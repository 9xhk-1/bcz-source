package ok;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import fl.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    @VisibleForTesting
    public static final Bitmap.Config f77097e = Bitmap.Config.RGB_565;

    /* renamed from: a, reason: collision with root package name */
    public final int f77098a;

    /* renamed from: b, reason: collision with root package name */
    public final int f77099b;

    /* renamed from: c, reason: collision with root package name */
    public final Bitmap.Config f77100c;

    /* renamed from: d, reason: collision with root package name */
    public final int f77101d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f77102a;

        /* renamed from: b, reason: collision with root package name */
        public final int f77103b;

        /* renamed from: c, reason: collision with root package name */
        public Bitmap.Config f77104c;

        /* renamed from: d, reason: collision with root package name */
        public int f77105d;

        public a(int i11) {
            this(i11, i11);
        }

        public d a() {
            return new d(this.f77102a, this.f77103b, this.f77104c, this.f77105d);
        }

        public Bitmap.Config b() {
            return this.f77104c;
        }

        public a c(@Nullable Bitmap.Config config) {
            this.f77104c = config;
            return this;
        }

        public a d(int i11) {
            if (i11 <= 0) {
                throw new IllegalArgumentException("Weight must be > 0");
            }
            this.f77105d = i11;
            return this;
        }

        public a(int i11, int i12) {
            this.f77105d = 1;
            if (i11 <= 0) {
                throw new IllegalArgumentException("Width must be > 0");
            }
            if (i12 <= 0) {
                throw new IllegalArgumentException("Height must be > 0");
            }
            this.f77102a = i11;
            this.f77103b = i12;
        }
    }

    public d(int i11, int i12, Bitmap.Config config, int i13) {
        this.f77100c = (Bitmap.Config) m.f(config, "Config must not be null");
        this.f77098a = i11;
        this.f77099b = i12;
        this.f77101d = i13;
    }

    public Bitmap.Config a() {
        return this.f77100c;
    }

    public int b() {
        return this.f77099b;
    }

    public int c() {
        return this.f77101d;
    }

    public int d() {
        return this.f77098a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f77099b == dVar.f77099b && this.f77098a == dVar.f77098a && this.f77101d == dVar.f77101d && this.f77100c == dVar.f77100c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f77098a * 31) + this.f77099b) * 31) + this.f77100c.hashCode()) * 31) + this.f77101d;
    }

    public String toString() {
        return "PreFillSize{width=" + this.f77098a + ", height=" + this.f77099b + ", config=" + this.f77100c + ", weight=" + this.f77101d + l50.b.f69928j;
    }
}
