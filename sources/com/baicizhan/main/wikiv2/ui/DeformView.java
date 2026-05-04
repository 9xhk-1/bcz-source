package com.baicizhan.main.wikiv2.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.baicizhan.client.business.util.NoProguard;
import com.jiongji.andriod.card.R;
import xb.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class DeformView extends View implements NoProguard {
    private static final int PICTURE_H = 500;
    private static final int PICTURE_W = 100;
    private float left;
    private int mCircleColor;
    private int mCount;
    private int mLineColor;
    private Picture mPicture;
    private float mSpan;

    /* renamed from: r, reason: collision with root package name */
    private float f26162r;
    private float r_oval;

    public DeformView(Context context) {
        this(context, null);
    }

    private float dp(float dp2) {
        return f.a(getContext(), dp2);
    }

    private void drawLine(float start, float end, Paint paint, Canvas canvas) {
        float f11 = this.left;
        canvas.drawLine(f11, start, f11, end, paint);
        canvas.drawArc(new RectF(this.left, end - dp(6.0f), this.left + dp(12.0f), dp(6.0f) + end), 90.0f, 90.0f, false, paint);
    }

    private void recording() {
        if (this.mPicture == null) {
            this.mPicture = new Picture();
            this.mSpan = dp(this.mSpan);
            this.f26162r = dp(this.f26162r);
            this.left = dp(this.left);
            this.r_oval = dp(this.r_oval);
        }
        Canvas beginRecording = this.mPicture.beginRecording(100, 500);
        Paint paint = new Paint();
        paint.setColor(this.mCircleColor);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        beginRecording.drawCircle(dp(7.0f), dp(10.0f), this.f26162r, paint);
        Paint paint2 = new Paint();
        paint2.setColor(this.mLineColor);
        paint2.setStrokeWidth(dp(0.5f));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        float dp2 = dp(13.0f);
        drawLine(dp2, (this.mSpan + dp2) - dp(2.5f), paint2, beginRecording);
        if (this.mCount > 1) {
            dp2 = ((dp2 + this.mSpan) + this.r_oval) - dp(8.0f);
            drawLine(dp2, this.mSpan + dp2 + dp(7.0f), paint2, beginRecording);
        }
        for (int i11 = 1; i11 < this.mCount - 1; i11++) {
            dp2 = dp2 + this.mSpan + this.r_oval + dp(1.0f);
            drawLine(dp2, this.mSpan + dp2 + dp(7.0f), paint2, beginRecording);
        }
        this.mPicture.endRecording();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.mPicture.draw(canvas);
        super.onDraw(canvas);
    }

    public void setItemCount(int count) {
        this.mCount = count;
        recording();
    }

    public DeformView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DeformView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mSpan = 16.0f;
        this.f26162r = 3.0f;
        this.r_oval = 6.0f;
        this.left = 7.0f;
        this.mCircleColor = -12406796;
        this.mLineColor = -6645611;
        setLayerType(1, null);
        this.mCircleColor = getContext().getResources().getColor(R.color.main_color_blue_dark);
        this.mLineColor = getContext().getResources().getColor(R.color.main_color_word_b8);
    }
}
