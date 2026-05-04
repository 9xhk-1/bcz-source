package sk;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class t0 implements kk.u<BitmapDrawable>, kk.q {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f88800a;

    /* renamed from: b, reason: collision with root package name */
    public final kk.u<Bitmap> f88801b;

    public t0(@NonNull Resources resources, @NonNull kk.u<Bitmap> uVar) {
        this.f88800a = (Resources) fl.m.e(resources);
        this.f88801b = (kk.u) fl.m.e(uVar);
    }

    @Nullable
    public static kk.u<BitmapDrawable> c(@NonNull Resources resources, @Nullable kk.u<Bitmap> uVar) {
        if (uVar == null) {
            return null;
        }
        return new t0(resources, uVar);
    }

    @Deprecated
    public static t0 d(Context context, Bitmap bitmap) {
        return (t0) c(context.getResources(), h.c(bitmap, com.bumptech.glide.c.e(context).h()));
    }

    @Deprecated
    public static t0 e(Resources resources, lk.e eVar, Bitmap bitmap) {
        return (t0) c(resources, h.c(bitmap, eVar));
    }

    @Override // kk.u
    @NonNull
    public Class<BitmapDrawable> a() {
        return BitmapDrawable.class;
    }

    @Override // kk.u
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f88800a, this.f88801b.get());
    }

    @Override // kk.u
    public int getSize() {
        return this.f88801b.getSize();
    }

    @Override // kk.q
    public void initialize() {
        kk.u<Bitmap> uVar = this.f88801b;
        if (uVar instanceof kk.q) {
            ((kk.q) uVar).initialize();
        }
    }

    @Override // kk.u
    public void recycle() {
        this.f88801b.recycle();
    }
}
