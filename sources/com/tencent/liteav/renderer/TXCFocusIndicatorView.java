package com.tencent.liteav.renderer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class TXCFocusIndicatorView extends View {
    private static final int FOCUS_AREA_STROKE = 1;
    private int mFocusAreaStroke;
    private Runnable mHideRunnable;
    private Paint mPaint;
    private ScaleAnimation mScaleAnimation;
    private int mSize;

    public TXCFocusIndicatorView(Context context) {
        super(context);
        this.mSize = 0;
        this.mFocusAreaStroke = 2;
        this.mHideRunnable = new Runnable() { // from class: com.tencent.liteav.renderer.TXCFocusIndicatorView.1
            @Override // java.lang.Runnable
            public void run() {
                TXCFocusIndicatorView.this.setVisibility(8);
            }
        };
        init(null, 0);
    }

    private void init(AttributeSet attributeSet, int i11) {
        this.mPaint = new Paint();
        this.mFocusAreaStroke = (int) ((getContext().getResources().getDisplayMetrics().density * 1.0f) + 0.5f);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.3f, 1.0f, 1.3f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.mScaleAnimation = scaleAnimation;
        scaleAnimation.setDuration(200L);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        int i11 = this.mFocusAreaStroke / 2;
        int i12 = this.mSize;
        Rect rect = new Rect(i11, i11, i12 - i11, i12 - i11);
        this.mPaint.setColor(-1);
        this.mPaint.setStyle(Paint.Style.STROKE);
        this.mPaint.setStrokeWidth(i11 * 2);
        canvas.drawRect(rect, this.mPaint);
        canvas.restore();
        super.onDraw(canvas);
    }

    public void show(int i11, int i12, int i13) {
        removeCallbacks(this.mHideRunnable);
        this.mScaleAnimation.cancel();
        this.mSize = i13;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(i11, i12, 0, 0);
        int i14 = this.mSize;
        layoutParams.width = i14;
        layoutParams.height = i14;
        setVisibility(0);
        requestLayout();
        this.mScaleAnimation.reset();
        startAnimation(this.mScaleAnimation);
        postDelayed(this.mHideRunnable, 1000L);
    }

    public TXCFocusIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mSize = 0;
        this.mFocusAreaStroke = 2;
        this.mHideRunnable = new Runnable() { // from class: com.tencent.liteav.renderer.TXCFocusIndicatorView.1
            @Override // java.lang.Runnable
            public void run() {
                TXCFocusIndicatorView.this.setVisibility(8);
            }
        };
        init(attributeSet, 0);
    }

    public TXCFocusIndicatorView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.mSize = 0;
        this.mFocusAreaStroke = 2;
        this.mHideRunnable = new Runnable() { // from class: com.tencent.liteav.renderer.TXCFocusIndicatorView.1
            @Override // java.lang.Runnable
            public void run() {
                TXCFocusIndicatorView.this.setVisibility(8);
            }
        };
        init(attributeSet, i11);
    }
}
