package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import androidx.cardview.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
class RoundRectDrawableWithShadow extends Drawable {
    private static final double COS_45 = Math.cos(Math.toRadians(45.0d));
    private static final float SHADOW_MULTIPLIER = 1.5f;
    static RoundRectHelper sRoundRectHelper;
    private ColorStateList mBackground;
    private final RectF mCardBounds;
    private float mCornerRadius;
    private Paint mCornerShadowPaint;
    private Path mCornerShadowPath;
    private Paint mEdgeShadowPaint;
    private final int mInsetShadow;
    private float mRawMaxShadowSize;
    private float mRawShadowSize;
    private final int mShadowEndColor;
    private float mShadowSize;
    private final int mShadowStartColor;
    private boolean mDirty = true;
    private boolean mAddPaddingForCorners = true;
    private boolean mPrintedShadowClipWarning = false;
    private Paint mPaint = new Paint(5);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface RoundRectHelper {
        void drawRoundRect(Canvas canvas, RectF rectF, float f11, Paint paint);
    }

    public RoundRectDrawableWithShadow(Resources resources, ColorStateList colorStateList, float f11, float f12, float f13) {
        this.mShadowStartColor = resources.getColor(R.color.cardview_shadow_start_color);
        this.mShadowEndColor = resources.getColor(R.color.cardview_shadow_end_color);
        this.mInsetShadow = resources.getDimensionPixelSize(R.dimen.cardview_compat_inset_shadow);
        setBackground(colorStateList);
        Paint paint = new Paint(5);
        this.mCornerShadowPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.mCornerRadius = (int) (f11 + 0.5f);
        this.mCardBounds = new RectF();
        Paint paint2 = new Paint(this.mCornerShadowPaint);
        this.mEdgeShadowPaint = paint2;
        paint2.setAntiAlias(false);
        setShadowSize(f12, f13);
    }

    private void buildComponents(Rect rect) {
        float f11 = this.mRawMaxShadowSize;
        float f12 = 1.5f * f11;
        this.mCardBounds.set(rect.left + f11, rect.top + f12, rect.right - f11, rect.bottom - f12);
        buildShadowCorners();
    }

    private void buildShadowCorners() {
        float f11 = this.mCornerRadius;
        RectF rectF = new RectF(-f11, -f11, f11, f11);
        RectF rectF2 = new RectF(rectF);
        float f12 = this.mShadowSize;
        rectF2.inset(-f12, -f12);
        Path path = this.mCornerShadowPath;
        if (path == null) {
            this.mCornerShadowPath = new Path();
        } else {
            path.reset();
        }
        this.mCornerShadowPath.setFillType(Path.FillType.EVEN_ODD);
        this.mCornerShadowPath.moveTo(-this.mCornerRadius, 0.0f);
        this.mCornerShadowPath.rLineTo(-this.mShadowSize, 0.0f);
        this.mCornerShadowPath.arcTo(rectF2, 180.0f, 90.0f, false);
        this.mCornerShadowPath.arcTo(rectF, 270.0f, -90.0f, false);
        this.mCornerShadowPath.close();
        float f13 = this.mCornerRadius;
        float f14 = f13 / (this.mShadowSize + f13);
        Paint paint = this.mCornerShadowPaint;
        float f15 = this.mCornerRadius + this.mShadowSize;
        int i11 = this.mShadowStartColor;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f15, new int[]{i11, i11, this.mShadowEndColor}, new float[]{0.0f, f14, 1.0f}, tileMode));
        Paint paint2 = this.mEdgeShadowPaint;
        float f16 = this.mCornerRadius;
        float f17 = this.mShadowSize;
        float f18 = (-f16) + f17;
        float f19 = (-f16) - f17;
        int i12 = this.mShadowStartColor;
        paint2.setShader(new LinearGradient(0.0f, f18, 0.0f, f19, new int[]{i12, i12, this.mShadowEndColor}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        this.mEdgeShadowPaint.setAntiAlias(false);
    }

    public static float calculateHorizontalPadding(float f11, float f12, boolean z11) {
        return z11 ? (float) (f11 + ((1.0d - COS_45) * f12)) : f11;
    }

    public static float calculateVerticalPadding(float f11, float f12, boolean z11) {
        return z11 ? (float) ((f11 * 1.5f) + ((1.0d - COS_45) * f12)) : f11 * 1.5f;
    }

    private void drawShadow(Canvas canvas) {
        Canvas canvas2;
        float f11 = this.mCornerRadius;
        float f12 = (-f11) - this.mShadowSize;
        float f13 = f11 + this.mInsetShadow + (this.mRawShadowSize / 2.0f);
        float f14 = 2.0f * f13;
        boolean z11 = this.mCardBounds.width() - f14 > 0.0f;
        boolean z12 = this.mCardBounds.height() - f14 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.mCardBounds;
        canvas.translate(rectF.left + f13, rectF.top + f13);
        canvas.drawPath(this.mCornerShadowPath, this.mCornerShadowPaint);
        if (z11) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, f12, this.mCardBounds.width() - f14, -this.mCornerRadius, this.mEdgeShadowPaint);
        } else {
            canvas2 = canvas;
        }
        canvas2.restoreToCount(save);
        int save2 = canvas2.save();
        RectF rectF2 = this.mCardBounds;
        canvas2.translate(rectF2.right - f13, rectF2.bottom - f13);
        canvas2.rotate(180.0f);
        canvas2.drawPath(this.mCornerShadowPath, this.mCornerShadowPaint);
        if (z11) {
            canvas2.drawRect(0.0f, f12, this.mCardBounds.width() - f14, (-this.mCornerRadius) + this.mShadowSize, this.mEdgeShadowPaint);
        }
        canvas2.restoreToCount(save2);
        int save3 = canvas2.save();
        RectF rectF3 = this.mCardBounds;
        canvas2.translate(rectF3.left + f13, rectF3.bottom - f13);
        canvas2.rotate(270.0f);
        canvas2.drawPath(this.mCornerShadowPath, this.mCornerShadowPaint);
        if (z12) {
            canvas2.drawRect(0.0f, f12, this.mCardBounds.height() - f14, -this.mCornerRadius, this.mEdgeShadowPaint);
        }
        canvas2.restoreToCount(save3);
        int save4 = canvas2.save();
        RectF rectF4 = this.mCardBounds;
        canvas2.translate(rectF4.right - f13, rectF4.top + f13);
        canvas2.rotate(90.0f);
        canvas2.drawPath(this.mCornerShadowPath, this.mCornerShadowPaint);
        if (z12) {
            canvas2.drawRect(0.0f, f12, this.mCardBounds.height() - f14, -this.mCornerRadius, this.mEdgeShadowPaint);
        }
        canvas2.restoreToCount(save4);
    }

    private void setBackground(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.mBackground = colorStateList;
        this.mPaint.setColor(colorStateList.getColorForState(getState(), this.mBackground.getDefaultColor()));
    }

    private void setShadowSize(float f11, float f12) {
        if (f11 < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f11 + ". Must be >= 0");
        }
        if (f12 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f12 + ". Must be >= 0");
        }
        float even = toEven(f11);
        float even2 = toEven(f12);
        if (even > even2) {
            if (!this.mPrintedShadowClipWarning) {
                this.mPrintedShadowClipWarning = true;
            }
            even = even2;
        }
        if (this.mRawShadowSize == even && this.mRawMaxShadowSize == even2) {
            return;
        }
        this.mRawShadowSize = even;
        this.mRawMaxShadowSize = even2;
        this.mShadowSize = (int) ((even * 1.5f) + this.mInsetShadow + 0.5f);
        this.mDirty = true;
        invalidateSelf();
    }

    private int toEven(float f11) {
        int i11 = (int) (f11 + 0.5f);
        return i11 % 2 == 1 ? i11 - 1 : i11;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.mDirty) {
            buildComponents(getBounds());
            this.mDirty = false;
        }
        canvas.translate(0.0f, this.mRawShadowSize / 2.0f);
        drawShadow(canvas);
        canvas.translate(0.0f, (-this.mRawShadowSize) / 2.0f);
        sRoundRectHelper.drawRoundRect(canvas, this.mCardBounds, this.mCornerRadius, this.mPaint);
    }

    public ColorStateList getColor() {
        return this.mBackground;
    }

    public float getCornerRadius() {
        return this.mCornerRadius;
    }

    public void getMaxShadowAndCornerPadding(Rect rect) {
        getPadding(rect);
    }

    public float getMaxShadowSize() {
        return this.mRawMaxShadowSize;
    }

    public float getMinHeight() {
        float f11 = this.mRawMaxShadowSize;
        return (Math.max(f11, this.mCornerRadius + this.mInsetShadow + ((f11 * 1.5f) / 2.0f)) * 2.0f) + (((this.mRawMaxShadowSize * 1.5f) + this.mInsetShadow) * 2.0f);
    }

    public float getMinWidth() {
        float f11 = this.mRawMaxShadowSize;
        return (Math.max(f11, this.mCornerRadius + this.mInsetShadow + (f11 / 2.0f)) * 2.0f) + ((this.mRawMaxShadowSize + this.mInsetShadow) * 2.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(calculateVerticalPadding(this.mRawMaxShadowSize, this.mCornerRadius, this.mAddPaddingForCorners));
        int ceil2 = (int) Math.ceil(calculateHorizontalPadding(this.mRawMaxShadowSize, this.mCornerRadius, this.mAddPaddingForCorners));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public float getShadowSize() {
        return this.mRawShadowSize;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.mBackground;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.mDirty = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.mBackground;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.mPaint.getColor() == colorForState) {
            return false;
        }
        this.mPaint.setColor(colorForState);
        this.mDirty = true;
        invalidateSelf();
        return true;
    }

    public void setAddPaddingForCorners(boolean z11) {
        this.mAddPaddingForCorners = z11;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.mPaint.setAlpha(i11);
        this.mCornerShadowPaint.setAlpha(i11);
        this.mEdgeShadowPaint.setAlpha(i11);
    }

    public void setColor(@Nullable ColorStateList colorStateList) {
        setBackground(colorStateList);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
    }

    public void setCornerRadius(float f11) {
        if (f11 < 0.0f) {
            throw new IllegalArgumentException("Invalid radius " + f11 + ". Must be >= 0");
        }
        float f12 = (int) (f11 + 0.5f);
        if (this.mCornerRadius == f12) {
            return;
        }
        this.mCornerRadius = f12;
        this.mDirty = true;
        invalidateSelf();
    }

    public void setMaxShadowSize(float f11) {
        setShadowSize(this.mRawShadowSize, f11);
    }

    public void setShadowSize(float f11) {
        setShadowSize(f11, this.mRawMaxShadowSize);
    }
}
