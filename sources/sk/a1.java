package sk;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class a1 implements ik.f<Bitmap, Bitmap> {
    @Override // ik.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public kk.u<Bitmap> a(@NonNull Bitmap bitmap, int i11, int i12, @NonNull ik.e eVar) {
        return new a(bitmap);
    }

    @Override // ik.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull Bitmap bitmap, @NonNull ik.e eVar) {
        return true;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements kk.u<Bitmap> {

        /* renamed from: a, reason: collision with root package name */
        public final Bitmap f88735a;

        public a(@NonNull Bitmap bitmap) {
            this.f88735a = bitmap;
        }

        @Override // kk.u
        @NonNull
        public Class<Bitmap> a() {
            return Bitmap.class;
        }

        @Override // kk.u
        @NonNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f88735a;
        }

        @Override // kk.u
        public int getSize() {
            return fl.o.i(this.f88735a);
        }

        @Override // kk.u
        public void recycle() {
        }
    }
}
