package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class CircularProgressDrawable extends Drawable implements Animatable {
    private static final int ANIMATION_DURATION = 1332;
    private static final int ARROW_HEIGHT = 5;
    private static final int ARROW_HEIGHT_LARGE = 6;
    private static final int ARROW_WIDTH = 10;
    private static final int ARROW_WIDTH_LARGE = 12;
    private static final float CENTER_RADIUS = 7.5f;
    private static final float CENTER_RADIUS_LARGE = 11.0f;
    private static final float COLOR_CHANGE_OFFSET = 0.75f;
    public static final int DEFAULT = 1;
    private static final float GROUP_FULL_ROTATION = 216.0f;
    public static final int LARGE = 0;
    private static final float MAX_PROGRESS_ARC = 0.8f;
    private static final float MIN_PROGRESS_ARC = 0.01f;
    private static final float RING_ROTATION = 0.20999998f;
    private static final float SHRINK_OFFSET = 0.5f;
    private static final float STROKE_WIDTH = 2.5f;
    private static final float STROKE_WIDTH_LARGE = 3.0f;
    private Animator mAnimator;
    boolean mFinishing;
    private Resources mResources;
    private final Ring mRing;
    private float mRotation;
    float mRotationCount;
    private static final Interpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    private static final Interpolator MATERIAL_INTERPOLATOR = new FastOutSlowInInterpolator();
    private static final int[] COLORS = {-16777216};

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ProgressDrawableSize {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Ring {
        int mAlpha;
        Path mArrow;
        int mArrowHeight;
        final Paint mArrowPaint;
        float mArrowScale;
        int mArrowWidth;
        final Paint mCirclePaint;
        int mColorIndex;
        int[] mColors;
        int mCurrentColor;
        float mEndTrim;
        final Paint mPaint;
        float mRingCenterRadius;
        float mRotation;
        boolean mShowArrow;
        float mStartTrim;
        float mStartingEndTrim;
        float mStartingRotation;
        float mStartingStartTrim;
        float mStrokeWidth;
        final RectF mTempBounds = new RectF();

        public Ring() {
            Paint paint = new Paint();
            this.mPaint = paint;
            Paint paint2 = new Paint();
            this.mArrowPaint = paint2;
            Paint paint3 = new Paint();
            this.mCirclePaint = paint3;
            this.mStartTrim = 0.0f;
            this.mEndTrim = 0.0f;
            this.mRotation = 0.0f;
            this.mStrokeWidth = 5.0f;
            this.mArrowScale = 1.0f;
            this.mAlpha = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public void draw(Canvas canvas, Rect rect) {
            RectF rectF = this.mTempBounds;
            float f11 = this.mRingCenterRadius;
            float f12 = (this.mStrokeWidth / 2.0f) + f11;
            if (f11 <= 0.0f) {
                f12 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.mArrowWidth * this.mArrowScale) / 2.0f, this.mStrokeWidth / 2.0f);
            }
            rectF.set(rect.centerX() - f12, rect.centerY() - f12, rect.centerX() + f12, rect.centerY() + f12);
            float f13 = this.mStartTrim;
            float f14 = this.mRotation;
            float f15 = (f13 + f14) * 360.0f;
            float f16 = ((this.mEndTrim + f14) * 360.0f) - f15;
            this.mPaint.setColor(this.mCurrentColor);
            this.mPaint.setAlpha(this.mAlpha);
            float f17 = this.mStrokeWidth / 2.0f;
            rectF.inset(f17, f17);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.mCirclePaint);
            float f18 = -f17;
            rectF.inset(f18, f18);
            canvas.drawArc(rectF, f15, f16, false, this.mPaint);
            drawTriangle(canvas, f15, f16, rectF);
        }

        public void drawTriangle(Canvas canvas, float f11, float f12, RectF rectF) {
            if (this.mShowArrow) {
                Path path = this.mArrow;
                if (path == null) {
                    Path path2 = new Path();
                    this.mArrow = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f13 = (this.mArrowWidth * this.mArrowScale) / 2.0f;
                this.mArrow.moveTo(0.0f, 0.0f);
                this.mArrow.lineTo(this.mArrowWidth * this.mArrowScale, 0.0f);
                Path path3 = this.mArrow;
                float f14 = this.mArrowWidth;
                float f15 = this.mArrowScale;
                path3.lineTo((f14 * f15) / 2.0f, this.mArrowHeight * f15);
                this.mArrow.offset((min + rectF.centerX()) - f13, rectF.centerY() + (this.mStrokeWidth / 2.0f));
                this.mArrow.close();
                this.mArrowPaint.setColor(this.mCurrentColor);
                this.mArrowPaint.setAlpha(this.mAlpha);
                canvas.save();
                canvas.rotate(f11 + f12, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.mArrow, this.mArrowPaint);
                canvas.restore();
            }
        }

        public int getAlpha() {
            return this.mAlpha;
        }

        public float getArrowHeight() {
            return this.mArrowHeight;
        }

        public float getArrowScale() {
            return this.mArrowScale;
        }

        public float getArrowWidth() {
            return this.mArrowWidth;
        }

        public int getBackgroundColor() {
            return this.mCirclePaint.getColor();
        }

        public float getCenterRadius() {
            return this.mRingCenterRadius;
        }

        public int[] getColors() {
            return this.mColors;
        }

        public float getEndTrim() {
            return this.mEndTrim;
        }

        public int getNextColor() {
            return this.mColors[getNextColorIndex()];
        }

        public int getNextColorIndex() {
            return (this.mColorIndex + 1) % this.mColors.length;
        }

        public float getRotation() {
            return this.mRotation;
        }

        public boolean getShowArrow() {
            return this.mShowArrow;
        }

        public float getStartTrim() {
            return this.mStartTrim;
        }

        public int getStartingColor() {
            return this.mColors[this.mColorIndex];
        }

        public float getStartingEndTrim() {
            return this.mStartingEndTrim;
        }

        public float getStartingRotation() {
            return this.mStartingRotation;
        }

        public float getStartingStartTrim() {
            return this.mStartingStartTrim;
        }

        public Paint.Cap getStrokeCap() {
            return this.mPaint.getStrokeCap();
        }

        public float getStrokeWidth() {
            return this.mStrokeWidth;
        }

        public void goToNextColor() {
            setColorIndex(getNextColorIndex());
        }

        public void resetOriginals() {
            this.mStartingStartTrim = 0.0f;
            this.mStartingEndTrim = 0.0f;
            this.mStartingRotation = 0.0f;
            setStartTrim(0.0f);
            setEndTrim(0.0f);
            setRotation(0.0f);
        }

        public void setAlpha(int i11) {
            this.mAlpha = i11;
        }

        public void setArrowDimensions(float f11, float f12) {
            this.mArrowWidth = (int) f11;
            this.mArrowHeight = (int) f12;
        }

        public void setArrowScale(float f11) {
            if (f11 != this.mArrowScale) {
                this.mArrowScale = f11;
            }
        }

        public void setBackgroundColor(int i11) {
            this.mCirclePaint.setColor(i11);
        }

        public void setCenterRadius(float f11) {
            this.mRingCenterRadius = f11;
        }

        public void setColor(int i11) {
            this.mCurrentColor = i11;
        }

        public void setColorFilter(ColorFilter colorFilter) {
            this.mPaint.setColorFilter(colorFilter);
        }

        public void setColorIndex(int i11) {
            this.mColorIndex = i11;
            this.mCurrentColor = this.mColors[i11];
        }

        public void setColors(@NonNull int[] iArr) {
            this.mColors = iArr;
            setColorIndex(0);
        }

        public void setEndTrim(float f11) {
            this.mEndTrim = f11;
        }

        public void setRotation(float f11) {
            this.mRotation = f11;
        }

        public void setShowArrow(boolean z11) {
            if (this.mShowArrow != z11) {
                this.mShowArrow = z11;
            }
        }

        public void setStartTrim(float f11) {
            this.mStartTrim = f11;
        }

        public void setStrokeCap(Paint.Cap cap) {
            this.mPaint.setStrokeCap(cap);
        }

        public void setStrokeWidth(float f11) {
            this.mStrokeWidth = f11;
            this.mPaint.setStrokeWidth(f11);
        }

        public void storeOriginals() {
            this.mStartingStartTrim = this.mStartTrim;
            this.mStartingEndTrim = this.mEndTrim;
            this.mStartingRotation = this.mRotation;
        }
    }

    public CircularProgressDrawable(@NonNull Context context) {
        this.mResources = ((Context) Preconditions.checkNotNull(context)).getResources();
        Ring ring = new Ring();
        this.mRing = ring;
        ring.setColors(COLORS);
        setStrokeWidth(STROKE_WIDTH);
        setupAnimators();
    }

    private void applyFinishTranslation(float f11, Ring ring) {
        updateRingColor(f11, ring);
        float floor = (float) (Math.floor(ring.getStartingRotation() / 0.8f) + 1.0d);
        ring.setStartTrim(ring.getStartingStartTrim() + (((ring.getStartingEndTrim() - 0.01f) - ring.getStartingStartTrim()) * f11));
        ring.setEndTrim(ring.getStartingEndTrim());
        ring.setRotation(ring.getStartingRotation() + ((floor - ring.getStartingRotation()) * f11));
    }

    private int evaluateColorChange(float f11, int i11, int i12) {
        return ((((i11 >> 24) & 255) + ((int) ((((i12 >> 24) & 255) - r0) * f11))) << 24) | ((((i11 >> 16) & 255) + ((int) ((((i12 >> 16) & 255) - r1) * f11))) << 16) | ((((i11 >> 8) & 255) + ((int) ((((i12 >> 8) & 255) - r2) * f11))) << 8) | ((i11 & 255) + ((int) (f11 * ((i12 & 255) - r8))));
    }

    private float getRotation() {
        return this.mRotation;
    }

    private void setRotation(float f11) {
        this.mRotation = f11;
    }

    private void setSizeParameters(float f11, float f12, float f13, float f14) {
        Ring ring = this.mRing;
        float f15 = this.mResources.getDisplayMetrics().density;
        ring.setStrokeWidth(f12 * f15);
        ring.setCenterRadius(f11 * f15);
        ring.setColorIndex(0);
        ring.setArrowDimensions(f13 * f15, f14 * f15);
    }

    private void setupAnimators() {
        final Ring ring = this.mRing;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.swiperefreshlayout.widget.CircularProgressDrawable.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressDrawable.this.updateRingColor(floatValue, ring);
                CircularProgressDrawable.this.applyTransformation(floatValue, ring, false);
                CircularProgressDrawable.this.invalidateSelf();
            }
        });
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(LINEAR_INTERPOLATOR);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: androidx.swiperefreshlayout.widget.CircularProgressDrawable.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                CircularProgressDrawable.this.applyTransformation(1.0f, ring, true);
                ring.storeOriginals();
                ring.goToNextColor();
                CircularProgressDrawable circularProgressDrawable = CircularProgressDrawable.this;
                if (!circularProgressDrawable.mFinishing) {
                    circularProgressDrawable.mRotationCount += 1.0f;
                    return;
                }
                circularProgressDrawable.mFinishing = false;
                animator.cancel();
                animator.setDuration(1332L);
                animator.start();
                ring.setShowArrow(false);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                CircularProgressDrawable.this.mRotationCount = 0.0f;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }
        });
        this.mAnimator = ofFloat;
    }

    public void applyTransformation(float f11, Ring ring, boolean z11) {
        float interpolation;
        float f12;
        if (this.mFinishing) {
            applyFinishTranslation(f11, ring);
            return;
        }
        if (f11 != 1.0f || z11) {
            float startingRotation = ring.getStartingRotation();
            if (f11 < 0.5f) {
                interpolation = ring.getStartingStartTrim();
                f12 = (MATERIAL_INTERPOLATOR.getInterpolation(f11 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float startingStartTrim = ring.getStartingStartTrim() + 0.79f;
                interpolation = startingStartTrim - (((1.0f - MATERIAL_INTERPOLATOR.getInterpolation((f11 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f12 = startingStartTrim;
            }
            float f13 = startingRotation + (RING_ROTATION * f11);
            float f14 = (f11 + this.mRotationCount) * GROUP_FULL_ROTATION;
            ring.setStartTrim(interpolation);
            ring.setEndTrim(f12);
            ring.setRotation(f13);
            setRotation(f14);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.mRotation, bounds.exactCenterX(), bounds.exactCenterY());
        this.mRing.draw(canvas, bounds);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.mRing.getAlpha();
    }

    public boolean getArrowEnabled() {
        return this.mRing.getShowArrow();
    }

    public float getArrowHeight() {
        return this.mRing.getArrowHeight();
    }

    public float getArrowScale() {
        return this.mRing.getArrowScale();
    }

    public float getArrowWidth() {
        return this.mRing.getArrowWidth();
    }

    public int getBackgroundColor() {
        return this.mRing.getBackgroundColor();
    }

    public float getCenterRadius() {
        return this.mRing.getCenterRadius();
    }

    @NonNull
    public int[] getColorSchemeColors() {
        return this.mRing.getColors();
    }

    public float getEndTrim() {
        return this.mRing.getEndTrim();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public float getProgressRotation() {
        return this.mRing.getRotation();
    }

    public float getStartTrim() {
        return this.mRing.getStartTrim();
    }

    @NonNull
    public Paint.Cap getStrokeCap() {
        return this.mRing.getStrokeCap();
    }

    public float getStrokeWidth() {
        return this.mRing.getStrokeWidth();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.mAnimator.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.mRing.setAlpha(i11);
        invalidateSelf();
    }

    public void setArrowDimensions(float f11, float f12) {
        this.mRing.setArrowDimensions(f11, f12);
        invalidateSelf();
    }

    public void setArrowEnabled(boolean z11) {
        this.mRing.setShowArrow(z11);
        invalidateSelf();
    }

    public void setArrowScale(float f11) {
        this.mRing.setArrowScale(f11);
        invalidateSelf();
    }

    public void setBackgroundColor(int i11) {
        this.mRing.setBackgroundColor(i11);
        invalidateSelf();
    }

    public void setCenterRadius(float f11) {
        this.mRing.setCenterRadius(f11);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.mRing.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setColorSchemeColors(@NonNull int... iArr) {
        this.mRing.setColors(iArr);
        this.mRing.setColorIndex(0);
        invalidateSelf();
    }

    public void setProgressRotation(float f11) {
        this.mRing.setRotation(f11);
        invalidateSelf();
    }

    public void setStartEndTrim(float f11, float f12) {
        this.mRing.setStartTrim(f11);
        this.mRing.setEndTrim(f12);
        invalidateSelf();
    }

    public void setStrokeCap(@NonNull Paint.Cap cap) {
        this.mRing.setStrokeCap(cap);
        invalidateSelf();
    }

    public void setStrokeWidth(float f11) {
        this.mRing.setStrokeWidth(f11);
        invalidateSelf();
    }

    public void setStyle(int i11) {
        if (i11 == 0) {
            setSizeParameters(CENTER_RADIUS_LARGE, 3.0f, 12.0f, 6.0f);
        } else {
            setSizeParameters(CENTER_RADIUS, STROKE_WIDTH, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.mAnimator.cancel();
        this.mRing.storeOriginals();
        if (this.mRing.getEndTrim() != this.mRing.getStartTrim()) {
            this.mFinishing = true;
            this.mAnimator.setDuration(666L);
            this.mAnimator.start();
        } else {
            this.mRing.setColorIndex(0);
            this.mRing.resetOriginals();
            this.mAnimator.setDuration(1332L);
            this.mAnimator.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.mAnimator.cancel();
        setRotation(0.0f);
        this.mRing.setShowArrow(false);
        this.mRing.setColorIndex(0);
        this.mRing.resetOriginals();
        invalidateSelf();
    }

    public void updateRingColor(float f11, Ring ring) {
        if (f11 > 0.75f) {
            ring.setColor(evaluateColorChange((f11 - 0.75f) / 0.25f, ring.getStartingColor(), ring.getNextColor()));
        } else {
            ring.setColor(ring.getStartingColor());
        }
    }
}
