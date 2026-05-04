package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.Px;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDrawable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawable.kt\nandroidx/core/graphics/drawable/DrawableKt\n+ 2 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n1#1,118:1\n38#2:119\n49#2:120\n60#2:121\n71#2:122\n*S KotlinDebug\n*F\n+ 1 Drawable.kt\nandroidx/core/graphics/drawable/DrawableKt\n*L\n66#1:119\n66#1:120\n66#1:121\n66#1:122\n*E\n"})
/* loaded from: classes2.dex */
public final class DrawableKt {
    @k
    public static final Bitmap toBitmap(@k Drawable drawable, @Px int i11, @Px int i12, @l Bitmap.Config config) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() == null) {
                throw new IllegalArgumentException("bitmap is null");
            }
            if (config == null || bitmapDrawable.getBitmap().getConfig() == config) {
                return (i11 == bitmapDrawable.getBitmap().getWidth() && i12 == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i11, i12, true);
            }
        }
        Rect bounds = drawable.getBounds();
        int i13 = bounds.left;
        int i14 = bounds.top;
        int i15 = bounds.right;
        int i16 = bounds.bottom;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i11, i12, config);
        drawable.setBounds(0, 0, i11, i12);
        drawable.draw(new Canvas(createBitmap));
        drawable.setBounds(i13, i14, i15, i16);
        return createBitmap;
    }

    public static /* synthetic */ Bitmap toBitmap$default(Drawable drawable, int i11, int i12, Bitmap.Config config, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = drawable.getIntrinsicWidth();
        }
        if ((i13 & 2) != 0) {
            i12 = drawable.getIntrinsicHeight();
        }
        if ((i13 & 4) != 0) {
            config = null;
        }
        return toBitmap(drawable, i11, i12, config);
    }

    @l
    public static final Bitmap toBitmapOrNull(@k Drawable drawable, @Px int i11, @Px int i12, @l Bitmap.Config config) {
        if ((drawable instanceof BitmapDrawable) && ((BitmapDrawable) drawable).getBitmap() == null) {
            return null;
        }
        return toBitmap(drawable, i11, i12, config);
    }

    public static /* synthetic */ Bitmap toBitmapOrNull$default(Drawable drawable, int i11, int i12, Bitmap.Config config, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = drawable.getIntrinsicWidth();
        }
        if ((i13 & 2) != 0) {
            i12 = drawable.getIntrinsicHeight();
        }
        if ((i13 & 4) != 0) {
            config = null;
        }
        return toBitmapOrNull(drawable, i11, i12, config);
    }

    public static final void updateBounds(@k Drawable drawable, @Px int i11, @Px int i12, @Px int i13, @Px int i14) {
        drawable.setBounds(i11, i12, i13, i14);
    }

    public static /* synthetic */ void updateBounds$default(Drawable drawable, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = drawable.getBounds().left;
        }
        if ((i15 & 2) != 0) {
            i12 = drawable.getBounds().top;
        }
        if ((i15 & 4) != 0) {
            i13 = drawable.getBounds().right;
        }
        if ((i15 & 8) != 0) {
            i14 = drawable.getBounds().bottom;
        }
        updateBounds(drawable, i11, i12, i13, i14);
    }
}
