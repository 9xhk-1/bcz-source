package uk;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import kk.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class j extends h<Drawable> {
    public j(Drawable drawable) {
        super(drawable);
    }

    @Nullable
    public static u<Drawable> c(@Nullable Drawable drawable) {
        if (drawable != null) {
            return new j(drawable);
        }
        return null;
    }

    @Override // kk.u
    @NonNull
    public Class<Drawable> a() {
        return this.f92270a.getClass();
    }

    @Override // kk.u
    public int getSize() {
        return Math.max(1, this.f92270a.getIntrinsicWidth() * this.f92270a.getIntrinsicHeight() * 4);
    }

    @Override // kk.u
    public void recycle() {
    }
}
