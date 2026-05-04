package lk;

import android.graphics.Bitmap;
import androidx.annotation.VisibleForTesting;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class c implements l {

    /* renamed from: a, reason: collision with root package name */
    public final b f71437a = new b();

    /* renamed from: b, reason: collision with root package name */
    public final h<a, Bitmap> f71438b = new h<>();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @VisibleForTesting
    public static class a implements m {

        /* renamed from: a, reason: collision with root package name */
        public final b f71439a;

        /* renamed from: b, reason: collision with root package name */
        public int f71440b;

        /* renamed from: c, reason: collision with root package name */
        public int f71441c;

        /* renamed from: d, reason: collision with root package name */
        public Bitmap.Config f71442d;

        public a(b bVar) {
            this.f71439a = bVar;
        }

        @Override // lk.m
        public void a() {
            this.f71439a.c(this);
        }

        public void b(int i11, int i12, Bitmap.Config config) {
            this.f71440b = i11;
            this.f71441c = i12;
            this.f71442d = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f71440b == aVar.f71440b && this.f71441c == aVar.f71441c && this.f71442d == aVar.f71442d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i11 = ((this.f71440b * 31) + this.f71441c) * 31;
            Bitmap.Config config = this.f71442d;
            return i11 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return c.d(this.f71440b, this.f71441c, this.f71442d);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @VisibleForTesting
    public static class b extends d<a> {
        @Override // lk.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        public a e(int i11, int i12, Bitmap.Config config) {
            a b11 = b();
            b11.b(i11, i12, config);
            return b11;
        }
    }

    public static String d(int i11, int i12, Bitmap.Config config) {
        return "[" + i11 + "x" + i12 + "], " + config;
    }

    public static String g(Bitmap bitmap) {
        return d(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    @Override // lk.l
    public String a(int i11, int i12, Bitmap.Config config) {
        return d(i11, i12, config);
    }

    @Override // lk.l
    public int b(Bitmap bitmap) {
        return fl.o.i(bitmap);
    }

    @Override // lk.l
    public String c(Bitmap bitmap) {
        return g(bitmap);
    }

    @Override // lk.l
    public void e(Bitmap bitmap) {
        this.f71438b.d(this.f71437a.e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    @Override // lk.l
    public Bitmap f(int i11, int i12, Bitmap.Config config) {
        return this.f71438b.a(this.f71437a.e(i11, i12, config));
    }

    @Override // lk.l
    public Bitmap removeLast() {
        return this.f71438b.f();
    }

    public String toString() {
        return "AttributeStrategy:\n  " + this.f71438b;
    }
}
