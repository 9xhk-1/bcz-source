package va;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class o implements m {

    /* renamed from: j, reason: collision with root package name */
    public static final int f93789j = -1359808;

    /* renamed from: k, reason: collision with root package name */
    public static final int f93790k = 2;

    /* renamed from: a, reason: collision with root package name */
    public View f93791a;

    /* renamed from: c, reason: collision with root package name */
    public int f93793c;

    /* renamed from: d, reason: collision with root package name */
    public int f93794d;

    /* renamed from: e, reason: collision with root package name */
    public int f93795e;

    /* renamed from: f, reason: collision with root package name */
    public Paint f93796f;

    /* renamed from: h, reason: collision with root package name */
    public int f93798h;

    /* renamed from: i, reason: collision with root package name */
    public ValueAnimator f93799i;

    /* renamed from: b, reason: collision with root package name */
    public boolean f93792b = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f93797g = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            o.this.f93798h = ((Integer) animation.getAnimatedValue()).intValue();
            o.this.f93791a.invalidate();
        }
    }

    public o(View view) {
        this.f93791a = view;
    }

    @Override // va.m
    public void a(boolean ignore) {
        this.f93797g = ignore;
    }

    public void d(Context context, AttributeSet attrs, int defStyleAttr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.RedDotView, defStyleAttr, 0);
        int color = obtainStyledAttributes.getColor(0, -1359808);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize == 0) {
            dimensionPixelSize = xb.i.a(context, 2.0f);
        }
        this.f93794d = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f93795e = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.f93796f = paint;
        paint.setColor(color);
        this.f93793c = dimensionPixelSize;
    }

    public void e(Canvas canvas) {
        int width = this.f93791a.getWidth();
        int i11 = this.f93793c;
        int i12 = (width - i11) - this.f93794d;
        int i13 = i11 + this.f93795e;
        if (!this.f93797g) {
            i12 -= this.f93791a.getPaddingRight();
            i13 += this.f93791a.getPaddingTop();
        }
        canvas.drawCircle(i12, i13, this.f93798h, this.f93796f);
    }

    @Override // va.m
    public void setShowRedDot(boolean showRedDot) {
        if (this.f93792b != showRedDot) {
            this.f93792b = showRedDot;
            ValueAnimator valueAnimator = this.f93799i;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.f93792b) {
                this.f93799i = ValueAnimator.ofInt(0, this.f93793c);
            } else {
                int i11 = this.f93798h;
                int i12 = this.f93793c;
                if (i11 != i12) {
                    return;
                } else {
                    this.f93799i = ValueAnimator.ofInt(i12, 0);
                }
            }
            this.f93799i.setDuration(300L).addUpdateListener(new a());
            this.f93799i.setStartDelay(100L);
            this.f93799i.start();
        }
    }
}
