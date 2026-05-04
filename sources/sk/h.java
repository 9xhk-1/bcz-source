package sk;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class h implements kk.u<Bitmap>, kk.q {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f88761a;

    /* renamed from: b, reason: collision with root package name */
    public final lk.e f88762b;

    public h(@NonNull Bitmap bitmap, @NonNull lk.e eVar) {
        this.f88761a = (Bitmap) fl.m.f(bitmap, "Bitmap must not be null");
        this.f88762b = (lk.e) fl.m.f(eVar, "BitmapPool must not be null");
    }

    @Nullable
    public static h c(@Nullable Bitmap bitmap, @NonNull lk.e eVar) {
        if (bitmap == null) {
            return null;
        }
        return new h(bitmap, eVar);
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
        return this.f88761a;
    }

    @Override // kk.u
    public int getSize() {
        return fl.o.i(this.f88761a);
    }

    @Override // kk.q
    public void initialize() {
        this.f88761a.prepareToDraw();
    }

    @Override // kk.u
    public void recycle() {
        this.f88762b.e(this.f88761a);
    }
}
