package com.airbnb.lottie;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public final g1.e f10233a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public final g1.d f10234b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10235c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        public g1.e f10236a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        public g1.d f10237b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f10238c = false;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements g1.d {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ File f10239a;

            public a(File file) {
                this.f10239a = file;
            }

            @Override // g1.d
            @NonNull
            public File a() {
                if (this.f10239a.isDirectory()) {
                    return this.f10239a;
                }
                throw new IllegalArgumentException("cache file must be a directory");
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.airbnb.lottie.y$b$b, reason: collision with other inner class name */
        public class C0158b implements g1.d {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g1.d f10241a;

            public C0158b(g1.d dVar) {
                this.f10241a = dVar;
            }

            @Override // g1.d
            @NonNull
            public File a() {
                File a11 = this.f10241a.a();
                if (a11.isDirectory()) {
                    return a11;
                }
                throw new IllegalArgumentException("cache file must be a directory");
            }
        }

        @NonNull
        public y a() {
            return new y(this.f10236a, this.f10237b, this.f10238c);
        }

        @NonNull
        public b b(boolean z11) {
            this.f10238c = z11;
            return this;
        }

        @NonNull
        public b c(@NonNull File file) {
            if (this.f10237b != null) {
                throw new IllegalStateException("There is already a cache provider!");
            }
            this.f10237b = new a(file);
            return this;
        }

        @NonNull
        public b d(@NonNull g1.d dVar) {
            if (this.f10237b != null) {
                throw new IllegalStateException("There is already a cache provider!");
            }
            this.f10237b = new C0158b(dVar);
            return this;
        }

        @NonNull
        public b e(@NonNull g1.e eVar) {
            this.f10236a = eVar;
            return this;
        }
    }

    public y(@Nullable g1.e eVar, @Nullable g1.d dVar, boolean z11) {
        this.f10233a = eVar;
        this.f10234b = dVar;
        this.f10235c = z11;
    }
}
