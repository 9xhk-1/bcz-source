package com.baicizhan.client.business.util;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.e0;
import java.util.HashSet;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class StrongRefTarget implements e0 {
    private static HashSet<e0> mTargetSet = new HashSet<>();

    @Override // com.squareup.picasso.e0
    public void onBitmapFailed(Exception e11, Drawable errorDrawable) {
        onBitmapFailedImpl(errorDrawable);
        qb.c.c("StrongRefTarget", "", e11);
        mTargetSet.remove(this);
    }

    public abstract void onBitmapFailedImpl(Drawable drawable);

    @Override // com.squareup.picasso.e0
    public final void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        onBitmapLoadedImpl(bitmap, loadedFrom);
        mTargetSet.remove(this);
    }

    public abstract void onBitmapLoadedImpl(Bitmap bitmap, Picasso.LoadedFrom loadedFrom);

    @Override // com.squareup.picasso.e0
    public final void onPrepareLoad(Drawable drawable) {
        mTargetSet.add(this);
        onPrepareLoadImpl(drawable);
    }

    public abstract void onPrepareLoadImpl(Drawable drawable);
}
