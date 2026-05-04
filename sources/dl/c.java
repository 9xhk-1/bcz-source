package dl;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class c implements g<Drawable> {

    /* renamed from: a, reason: collision with root package name */
    public final int f48025a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f48026b;

    /* renamed from: c, reason: collision with root package name */
    public d f48027c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: c, reason: collision with root package name */
        public static final int f48028c = 300;

        /* renamed from: a, reason: collision with root package name */
        public final int f48029a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f48030b;

        public a() {
            this(300);
        }

        public c a() {
            return new c(this.f48029a, this.f48030b);
        }

        public a b(boolean z11) {
            this.f48030b = z11;
            return this;
        }

        public a(int i11) {
            this.f48029a = i11;
        }
    }

    public c(int i11, boolean z11) {
        this.f48025a = i11;
        this.f48026b = z11;
    }

    @Override // dl.g
    public f<Drawable> a(DataSource dataSource, boolean z11) {
        return dataSource == DataSource.MEMORY_CACHE ? e.b() : b();
    }

    public final f<Drawable> b() {
        if (this.f48027c == null) {
            this.f48027c = new d(this.f48025a, this.f48026b);
        }
        return this.f48027c;
    }
}
