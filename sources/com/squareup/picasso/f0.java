package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class f0 extends a<e0> {
    public f0(Picasso picasso, e0 e0Var, y yVar, int i11, int i12, Drawable drawable, String str, Object obj, int i13) {
        super(picasso, e0Var, yVar, i11, i12, i13, drawable, str, obj, false);
    }

    @Override // com.squareup.picasso.a
    public void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        if (bitmap == null) {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
        }
        e0 k11 = k();
        if (k11 != null) {
            k11.onBitmapLoaded(bitmap, loadedFrom);
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Target callback must not recycle bitmap!");
            }
        }
    }

    @Override // com.squareup.picasso.a
    public void c(Exception exc) {
        e0 k11 = k();
        if (k11 != null) {
            if (this.f41763g != 0) {
                k11.onBitmapFailed(exc, this.f41757a.f41730e.getResources().getDrawable(this.f41763g));
            } else {
                k11.onBitmapFailed(exc, this.f41764h);
            }
        }
    }
}
