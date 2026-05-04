package com.baicizhan.client.business.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.jiongji.andriod.card.R;
import lq.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class RecycleableImageView extends AppCompatImageView {

    /* renamed from: a, reason: collision with root package name */
    public boolean f17156a;

    public RecycleableImageView(Context context) {
        super(context);
        this.f17156a = false;
        a(null, R.style.DefaultRecycleableImageView);
    }

    private void a(AttributeSet attrs, int defStyleRes) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, R.styleable.RecycleableImageView, 0, defStyleRes);
        this.f17156a = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    public void b() {
        c(getBackground());
    }

    public final void c(Drawable d11) {
        Bitmap bitmap;
        if (d11 == null || !(d11 instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) d11).getBitmap()) == null) {
            return;
        }
        bitmap.isRecycled();
    }

    public void d() {
        ColorDrawable colorDrawable = new ColorDrawable(0);
        if (getDrawable() != null) {
            setImageDrawable(colorDrawable);
        }
        if (getBackground() != null) {
            c.b(this, colorDrawable);
        }
    }

    public void e() {
        c(getDrawable());
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setAutoRecycle(boolean auto) {
        this.f17156a = auto;
    }

    public RecycleableImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f17156a = false;
        a(attrs, R.style.DefaultRecycleableImageView);
    }

    public RecycleableImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f17156a = false;
        a(attrs, R.style.DefaultRecycleableImageView);
    }
}
