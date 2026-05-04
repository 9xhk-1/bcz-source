package androidx.appcompat.graphics.drawable;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.graphics.drawable.DrawableCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class DrawerArrowDrawable extends Drawable {
    public static final int ARROW_DIRECTION_END = 3;
    public static final int ARROW_DIRECTION_LEFT = 0;
    public static final int ARROW_DIRECTION_RIGHT = 1;
    public static final int ARROW_DIRECTION_START = 2;
    private static final float ARROW_HEAD_ANGLE = (float) Math.toRadians(45.0d);
    private float mArrowHeadLength;
    private float mArrowShaftLength;
    private float mBarGap;
    private float mBarLength;
    private int mDirection;
    private float mMaxCutForBarSize;
    private final Paint mPaint;
    private final Path mPath;
    private float mProgress;
    private final int mSize;
    private boolean mSpin;
    private boolean mVerticalMirror;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface ArrowDirection {
    }

    public DrawerArrowDrawable(Context context) {
        Paint paint = new Paint();
        this.mPaint = paint;
        this.mPath = new Path();
        this.mVerticalMirror = false;
        this.mDirection = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, R.styleable.DrawerArrowToggle, R.attr.drawerArrowStyle, R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        setColor(obtainStyledAttributes.getColor(R.styleable.DrawerArrowToggle_color, 0));
        setBarThickness(obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_thickness, 0.0f));
        setSpinEnabled(obtainStyledAttributes.getBoolean(R.styleable.DrawerArrowToggle_spinBars, true));
        setGapSize(Math.round(obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.mSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.DrawerArrowToggle_drawableSize, 0);
        this.mBarLength = Math.round(obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_barLength, 0.0f));
        this.mArrowHeadLength = Math.round(obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.mArrowShaftLength = obtainStyledAttributes.getDimension(R.styleable.DrawerArrowToggle_arrowShaftLength, 0.0f);
        obtainStyledAttributes.recycle();
    }

    private static float lerp(float f11, float f12, float f13) {
        return f11 + ((f12 - f11) * f13);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i11 = this.mDirection;
        boolean z11 = false;
        if (i11 != 0 && (i11 == 1 || (i11 == 3 ? DrawableCompat.getLayoutDirection(this) == 0 : DrawableCompat.getLayoutDirection(this) == 1))) {
            z11 = true;
        }
        float f11 = this.mArrowHeadLength;
        float lerp = lerp(this.mBarLength, (float) Math.sqrt(f11 * f11 * 2.0f), this.mProgress);
        float lerp2 = lerp(this.mBarLength, this.mArrowShaftLength, this.mProgress);
        float round = Math.round(lerp(0.0f, this.mMaxCutForBarSize, this.mProgress));
        float lerp3 = lerp(0.0f, ARROW_HEAD_ANGLE, this.mProgress);
        float lerp4 = lerp(z11 ? 0.0f : -180.0f, z11 ? 180.0f : 0.0f, this.mProgress);
        double d11 = lerp;
        double d12 = lerp3;
        boolean z12 = z11;
        float round2 = Math.round(Math.cos(d12) * d11);
        float round3 = Math.round(d11 * Math.sin(d12));
        this.mPath.rewind();
        float lerp5 = lerp(this.mBarGap + this.mPaint.getStrokeWidth(), -this.mMaxCutForBarSize, this.mProgress);
        float f12 = (-lerp2) / 2.0f;
        this.mPath.moveTo(f12 + round, 0.0f);
        this.mPath.rLineTo(lerp2 - (round * 2.0f), 0.0f);
        this.mPath.moveTo(f12, lerp5);
        this.mPath.rLineTo(round2, round3);
        this.mPath.moveTo(f12, -lerp5);
        this.mPath.rLineTo(round2, -round3);
        this.mPath.close();
        canvas.save();
        float strokeWidth = this.mPaint.getStrokeWidth();
        float height = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), ((((int) (height - (r5 * 2.0f))) / 4) * 2) + (strokeWidth * 1.5f) + this.mBarGap);
        if (this.mSpin) {
            canvas.rotate(lerp4 * (this.mVerticalMirror ^ z12 ? -1 : 1));
        } else if (z12) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.mPath, this.mPaint);
        canvas.restore();
    }

    public float getArrowHeadLength() {
        return this.mArrowHeadLength;
    }

    public float getArrowShaftLength() {
        return this.mArrowShaftLength;
    }

    public float getBarLength() {
        return this.mBarLength;
    }

    public float getBarThickness() {
        return this.mPaint.getStrokeWidth();
    }

    @ColorInt
    public int getColor() {
        return this.mPaint.getColor();
    }

    public int getDirection() {
        return this.mDirection;
    }

    public float getGapSize() {
        return this.mBarGap;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.mSize;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.mSize;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final Paint getPaint() {
        return this.mPaint;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.mProgress;
    }

    public boolean isSpinEnabled() {
        return this.mSpin;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        if (i11 != this.mPaint.getAlpha()) {
            this.mPaint.setAlpha(i11);
            invalidateSelf();
        }
    }

    public void setArrowHeadLength(float f11) {
        if (this.mArrowHeadLength != f11) {
            this.mArrowHeadLength = f11;
            invalidateSelf();
        }
    }

    public void setArrowShaftLength(float f11) {
        if (this.mArrowShaftLength != f11) {
            this.mArrowShaftLength = f11;
            invalidateSelf();
        }
    }

    public void setBarLength(float f11) {
        if (this.mBarLength != f11) {
            this.mBarLength = f11;
            invalidateSelf();
        }
    }

    public void setBarThickness(float f11) {
        if (this.mPaint.getStrokeWidth() != f11) {
            this.mPaint.setStrokeWidth(f11);
            this.mMaxCutForBarSize = (float) ((f11 / 2.0f) * Math.cos(ARROW_HEAD_ANGLE));
            invalidateSelf();
        }
    }

    public void setColor(@ColorInt int i11) {
        if (i11 != this.mPaint.getColor()) {
            this.mPaint.setColor(i11);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setDirection(int i11) {
        if (i11 != this.mDirection) {
            this.mDirection = i11;
            invalidateSelf();
        }
    }

    public void setGapSize(float f11) {
        if (f11 != this.mBarGap) {
            this.mBarGap = f11;
            invalidateSelf();
        }
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f11) {
        if (this.mProgress != f11) {
            this.mProgress = f11;
            invalidateSelf();
        }
    }

    public void setSpinEnabled(boolean z11) {
        if (this.mSpin != z11) {
            this.mSpin = z11;
            invalidateSelf();
        }
    }

    public void setVerticalMirror(boolean z11) {
        if (this.mVerticalMirror != z11) {
            this.mVerticalMirror = z11;
            invalidateSelf();
        }
    }
}
