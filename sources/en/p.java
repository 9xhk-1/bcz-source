package en;

import android.app.Activity;
import android.graphics.Bitmap;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import en.o;
import fn.o6;
import fn.z5;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class p {

    /* renamed from: e, reason: collision with root package name */
    public static final o.f f50013e = new a();

    /* renamed from: f, reason: collision with root package name */
    public static final o.e f50014f = new b();

    /* renamed from: a, reason: collision with root package name */
    @StyleRes
    public final int f50015a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final o.f f50016b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final o.e f50017c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public Integer f50018d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements o.f {
        @Override // en.o.f
        public boolean a(@NonNull Activity activity, int i11) {
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        @StyleRes
        public int f50019a;

        /* renamed from: b, reason: collision with root package name */
        @NonNull
        public o.f f50020b = p.f50013e;

        /* renamed from: c, reason: collision with root package name */
        @NonNull
        public o.e f50021c = p.f50014f;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        public Bitmap f50022d;

        /* renamed from: e, reason: collision with root package name */
        @Nullable
        public Integer f50023e;

        @NonNull
        public p f() {
            return new p(this, null);
        }

        @NonNull
        @uo.a
        public c g(@ColorInt int i11) {
            this.f50022d = null;
            this.f50023e = Integer.valueOf(i11);
            return this;
        }

        @NonNull
        @uo.a
        public c h(@NonNull Bitmap bitmap) {
            this.f50022d = bitmap;
            this.f50023e = null;
            return this;
        }

        @NonNull
        @uo.a
        public c i(@NonNull o.e eVar) {
            this.f50021c = eVar;
            return this;
        }

        @NonNull
        @uo.a
        public c j(@NonNull o.f fVar) {
            this.f50020b = fVar;
            return this;
        }

        @NonNull
        @uo.a
        public c k(@StyleRes int i11) {
            this.f50019a = i11;
            return this;
        }
    }

    public /* synthetic */ p(c cVar, a aVar) {
        this(cVar);
    }

    public static int c(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        return o6.a(z5.a(iArr, 128)).get(0).intValue();
    }

    @Nullable
    public Integer d() {
        return this.f50018d;
    }

    @NonNull
    public o.e e() {
        return this.f50017c;
    }

    @NonNull
    public o.f f() {
        return this.f50016b;
    }

    @StyleRes
    public int g() {
        return this.f50015a;
    }

    public p(c cVar) {
        this.f50015a = cVar.f50019a;
        this.f50016b = cVar.f50020b;
        this.f50017c = cVar.f50021c;
        if (cVar.f50023e != null) {
            this.f50018d = cVar.f50023e;
        } else if (cVar.f50022d != null) {
            this.f50018d = Integer.valueOf(c(cVar.f50022d));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements o.e {
        @Override // en.o.e
        public void a(@NonNull Activity activity) {
        }
    }
}
