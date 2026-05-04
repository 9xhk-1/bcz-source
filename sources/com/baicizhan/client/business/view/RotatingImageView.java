package com.baicizhan.client.business.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.baicizhan.client.business.view.a;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class RotatingImageView extends AppCompatImageView {

    /* renamed from: h, reason: collision with root package name */
    public static final int f16751h = 3;

    /* renamed from: a, reason: collision with root package name */
    public com.baicizhan.client.business.view.a f16752a;

    /* renamed from: b, reason: collision with root package name */
    public a f16753b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16754c;

    /* renamed from: d, reason: collision with root package name */
    public int f16755d;

    /* renamed from: e, reason: collision with root package name */
    public int f16756e;

    /* renamed from: f, reason: collision with root package name */
    public int f16757f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16758g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements a.b {
        @Override // com.baicizhan.client.business.view.a.b
        public void b(int frame) {
            RotatingImageView.this.f(frame);
        }

        @Override // com.baicizhan.client.business.view.a.b
        public void c() {
            if (RotatingImageView.this.f16754c) {
                RotatingImageView.this.f16752a.k(0, 360);
            }
        }

        @Override // com.baicizhan.client.business.view.a.b
        public boolean d() {
            return RotatingImageView.this.f16754c;
        }

        public a() {
        }

        @Override // com.baicizhan.client.business.view.a.b
        public void a() {
        }
    }

    public RotatingImageView(Context context) {
        super(context);
        this.f16753b = new a();
        this.f16754c = true;
        this.f16758g = true;
        d(null, R.style.DefaultRotatingImageView);
    }

    private void d(AttributeSet attrs, int defStyleRes) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, R.styleable.RotatingImageView, 0, defStyleRes);
        int i11 = obtainStyledAttributes.getInt(0, 3);
        com.baicizhan.client.business.view.a h11 = com.baicizhan.client.business.view.a.g().h(this.f16753b);
        this.f16752a = h11;
        h11.j(i11);
        obtainStyledAttributes.recycle();
    }

    public boolean e() {
        return this.f16758g;
    }

    public final void f(int degree) {
        this.f16755d = (this.f16755d + degree) % 360;
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z11 = getVisibility() == 0;
        this.f16754c = z11;
        com.baicizhan.client.business.view.a aVar = this.f16752a;
        if (aVar == null || !z11) {
            return;
        }
        aVar.k(0, 360);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f16754c = false;
        com.baicizhan.client.business.view.a aVar = this.f16752a;
        if (aVar != null) {
            aVar.l();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f16758g) {
            canvas.rotate(this.f16755d, this.f16756e, this.f16757f);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    @Override // android.view.View
    public void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        super.onSizeChanged(w11, h11, oldw, oldh);
        this.f16756e = (((w11 - getPaddingLeft()) - getPaddingRight()) / 2) + getPaddingLeft();
        this.f16757f = (((h11 - getPaddingTop()) - getPaddingBottom()) / 2) + getPaddingTop();
    }

    public void setIsRotate(boolean isRotate) {
        this.f16758g = isRotate;
    }

    public void setVelocity(int velocity) {
        com.baicizhan.client.business.view.a aVar = this.f16752a;
        if (aVar != null) {
            aVar.j(velocity);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        if (visibility != 0 && this.f16754c) {
            this.f16754c = false;
            com.baicizhan.client.business.view.a aVar = this.f16752a;
            if (aVar != null) {
                aVar.l();
                return;
            }
            return;
        }
        if (visibility != 0 || this.f16754c) {
            return;
        }
        this.f16754c = true;
        com.baicizhan.client.business.view.a aVar2 = this.f16752a;
        if (aVar2 != null) {
            aVar2.k(0, 360);
        }
    }

    public RotatingImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f16753b = new a();
        this.f16754c = true;
        this.f16758g = true;
        d(attrs, R.style.DefaultRotatingImageView);
    }

    public RotatingImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f16753b = new a();
        this.f16754c = true;
        this.f16758g = true;
        d(attrs, R.style.DefaultRotatingImageView);
    }
}
