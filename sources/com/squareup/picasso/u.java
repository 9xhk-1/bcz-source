package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class u extends BitmapDrawable {

    /* renamed from: h, reason: collision with root package name */
    public static final Paint f41953h = new Paint();

    /* renamed from: i, reason: collision with root package name */
    public static final float f41954i = 200.0f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f41955a;

    /* renamed from: b, reason: collision with root package name */
    public final float f41956b;

    /* renamed from: c, reason: collision with root package name */
    public final Picasso.LoadedFrom f41957c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f41958d;

    /* renamed from: e, reason: collision with root package name */
    public long f41959e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f41960f;

    /* renamed from: g, reason: collision with root package name */
    public int f41961g;

    public u(Context context, Bitmap bitmap, Drawable drawable, Picasso.LoadedFrom loadedFrom, boolean z11, boolean z12) {
        super(context.getResources(), bitmap);
        this.f41961g = 255;
        this.f41955a = z12;
        this.f41956b = context.getResources().getDisplayMetrics().density;
        this.f41957c = loadedFrom;
        if (loadedFrom == Picasso.LoadedFrom.MEMORY || z11) {
            return;
        }
        this.f41958d = drawable;
        this.f41960f = true;
        this.f41959e = SystemClock.uptimeMillis();
    }

    public static Path b(int i11, int i12, int i13) {
        Path path = new Path();
        float f11 = i11;
        float f12 = i12;
        path.moveTo(f11, f12);
        path.lineTo(i11 + i13, f12);
        path.lineTo(f11, i12 + i13);
        return path;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(ImageView imageView, Context context, Bitmap bitmap, Picasso.LoadedFrom loadedFrom, boolean z11, boolean z12) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new u(context, bitmap, drawable, loadedFrom, z11, z12));
    }

    public static void d(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof Animatable) {
            ((Animatable) imageView.getDrawable()).start();
        }
    }

    public final void a(Canvas canvas) {
        Paint paint = f41953h;
        paint.setColor(-1);
        canvas.drawPath(b(0, 0, (int) (this.f41956b * 16.0f)), paint);
        paint.setColor(this.f41957c.debugColor);
        canvas.drawPath(b(0, 0, (int) (this.f41956b * 15.0f)), paint);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f41960f) {
            float uptimeMillis = (SystemClock.uptimeMillis() - this.f41959e) / 200.0f;
            if (uptimeMillis >= 1.0f) {
                this.f41960f = false;
                this.f41958d = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.f41958d;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (this.f41961g * uptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.f41961g);
            }
        } else {
            super.draw(canvas);
        }
        if (this.f41955a) {
            a(canvas);
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f41958d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f41961g = i11;
        Drawable drawable = this.f41958d;
        if (drawable != null) {
            drawable.setAlpha(i11);
        }
        super.setAlpha(i11);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f41958d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
