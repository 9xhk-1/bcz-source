package androidx.core.splashscreen;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class MaskedDrawable extends Drawable {

    @m80.k
    private final Drawable drawable;

    @m80.k
    private final Path mask;
    private final float maskDiameter;

    public MaskedDrawable(@m80.k Drawable drawable, float f11) {
        g0.p(drawable, "drawable");
        this.drawable = drawable;
        this.maskDiameter = f11;
        Path path = new Path();
        path.addCircle(0.0f, 0.0f, f11 / 2.0f, Path.Direction.CW);
        this.mask = path;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@m80.k Canvas canvas) {
        g0.p(canvas, "canvas");
        canvas.clipPath(this.mask);
        this.drawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.drawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@m80.k Rect bounds) {
        g0.p(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.drawable.setBounds(bounds);
        this.mask.offset(bounds.exactCenterX(), bounds.exactCenterY());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.drawable.setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@m80.l ColorFilter colorFilter) {
        this.drawable.setColorFilter(colorFilter);
    }
}
