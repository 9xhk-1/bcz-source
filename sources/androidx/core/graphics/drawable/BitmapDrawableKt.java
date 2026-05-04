package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class BitmapDrawableKt {
    @k
    public static final BitmapDrawable toDrawable(@k Bitmap bitmap, @k Resources resources) {
        return new BitmapDrawable(resources, bitmap);
    }
}
