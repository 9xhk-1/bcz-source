package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(21)
/* loaded from: classes2.dex */
class RoundedBitmapDrawable21 extends RoundedBitmapDrawable {
    public RoundedBitmapDrawable21(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@NonNull Outline outline) {
        updateDstRect();
        outline.setRoundRect(this.mDstRect, getCornerRadius());
    }

    @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
    public void gravityCompatApply(int i11, int i12, int i13, Rect rect, Rect rect2) {
        Gravity.apply(i11, i12, i13, rect, rect2, 0);
    }

    @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
    public boolean hasMipMap() {
        Bitmap bitmap = this.mBitmap;
        return bitmap != null && bitmap.hasMipMap();
    }

    @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
    public void setMipMap(boolean z11) {
        Bitmap bitmap = this.mBitmap;
        if (bitmap != null) {
            bitmap.setHasMipMap(z11);
            invalidateSelf();
        }
    }
}
