package com.makeramen.roundedimageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import js.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class RoundedImageView extends ImageView {

    /* renamed from: p, reason: collision with root package name */
    public static final int f39104p = -2;

    /* renamed from: q, reason: collision with root package name */
    public static final int f39105q = 0;

    /* renamed from: r, reason: collision with root package name */
    public static final int f39106r = 1;

    /* renamed from: s, reason: collision with root package name */
    public static final int f39107s = 2;

    /* renamed from: t, reason: collision with root package name */
    public static final String f39108t = "RoundedImageView";

    /* renamed from: u, reason: collision with root package name */
    public static final float f39109u = 0.0f;

    /* renamed from: v, reason: collision with root package name */
    public static final float f39110v = 0.0f;

    /* renamed from: w, reason: collision with root package name */
    public static final Shader.TileMode f39111w = Shader.TileMode.CLAMP;

    /* renamed from: x, reason: collision with root package name */
    public static final ImageView.ScaleType[] f39112x = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ boolean f39113y = false;

    /* renamed from: a, reason: collision with root package name */
    public final float[] f39114a;

    /* renamed from: b, reason: collision with root package name */
    public Drawable f39115b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f39116c;

    /* renamed from: d, reason: collision with root package name */
    public float f39117d;

    /* renamed from: e, reason: collision with root package name */
    public ColorFilter f39118e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f39119f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f39120g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f39121h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f39122i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f39123j;

    /* renamed from: k, reason: collision with root package name */
    public int f39124k;

    /* renamed from: l, reason: collision with root package name */
    public int f39125l;

    /* renamed from: m, reason: collision with root package name */
    public ImageView.ScaleType f39126m;

    /* renamed from: n, reason: collision with root package name */
    public Shader.TileMode f39127n;

    /* renamed from: o, reason: collision with root package name */
    public Shader.TileMode f39128o;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39129a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f39129a = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39129a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39129a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39129a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f39129a[ImageView.ScaleType.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f39129a[ImageView.ScaleType.FIT_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f39129a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public RoundedImageView(Context context) {
        super(context);
        this.f39114a = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.f39116c = ColorStateList.valueOf(-16777216);
        this.f39117d = 0.0f;
        this.f39118e = null;
        this.f39119f = false;
        this.f39121h = false;
        this.f39122i = false;
        this.f39123j = false;
        Shader.TileMode tileMode = f39111w;
        this.f39127n = tileMode;
        this.f39128o = tileMode;
    }

    public static Shader.TileMode f(int i11) {
        if (i11 == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i11 == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i11 != 2) {
            return null;
        }
        return Shader.TileMode.MIRROR;
    }

    public final void a() {
        Drawable drawable = this.f39120g;
        if (drawable == null || !this.f39119f) {
            return;
        }
        Drawable mutate = drawable.mutate();
        this.f39120g = mutate;
        if (this.f39121h) {
            mutate.setColorFilter(this.f39118e);
        }
    }

    public float b(int i11) {
        return this.f39114a[i11];
    }

    public boolean c() {
        return this.f39122i;
    }

    public void d(boolean z11) {
        if (this.f39123j == z11) {
            return;
        }
        this.f39123j = z11;
        m(true);
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public boolean e() {
        return this.f39123j;
    }

    public final Drawable g() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i11 = this.f39125l;
        if (i11 != 0) {
            try {
                drawable = resources.getDrawable(i11);
            } catch (Exception e11) {
                Log.w(f39108t, "Unable to find resource: " + this.f39125l, e11);
                this.f39125l = 0;
            }
        }
        return c.e(drawable);
    }

    @ColorInt
    public int getBorderColor() {
        return this.f39116c.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.f39116c;
    }

    public float getBorderWidth() {
        return this.f39117d;
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float f11 = 0.0f;
        for (float f12 : this.f39114a) {
            f11 = Math.max(f12, f11);
        }
        return f11;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f39126m;
    }

    public Shader.TileMode getTileModeX() {
        return this.f39127n;
    }

    public Shader.TileMode getTileModeY() {
        return this.f39128o;
    }

    public final Drawable h() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i11 = this.f39124k;
        if (i11 != 0) {
            try {
                drawable = resources.getDrawable(i11);
            } catch (Exception e11) {
                Log.w(f39108t, "Unable to find resource: " + this.f39124k, e11);
                this.f39124k = 0;
            }
        }
        return c.e(drawable);
    }

    public void i(float f11, float f12, float f13, float f14) {
        float[] fArr = this.f39114a;
        if (fArr[0] == f11 && fArr[1] == f12 && fArr[2] == f14 && fArr[3] == f13) {
            return;
        }
        fArr[0] = f11;
        fArr[1] = f12;
        fArr[3] = f13;
        fArr[2] = f14;
        n();
        m(false);
        invalidate();
    }

    public void j(int i11, float f11) {
        float[] fArr = this.f39114a;
        if (fArr[i11] == f11) {
            return;
        }
        fArr[i11] = f11;
        n();
        m(false);
        invalidate();
    }

    public void k(int i11, @DimenRes int i12) {
        j(i11, getResources().getDimensionPixelSize(i12));
    }

    public final void l(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof c) {
            c cVar = (c) drawable;
            cVar.z(scaleType).u(this.f39117d).t(this.f39116c).y(this.f39122i).A(this.f39127n).B(this.f39128o);
            float[] fArr = this.f39114a;
            if (fArr != null) {
                cVar.w(fArr[0], fArr[1], fArr[2], fArr[3]);
            }
            a();
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i11 = 0; i11 < numberOfLayers; i11++) {
                l(layerDrawable.getDrawable(i11), scaleType);
            }
        }
    }

    public final void m(boolean z11) {
        if (this.f39123j) {
            if (z11) {
                this.f39115b = c.e(this.f39115b);
            }
            l(this.f39115b, ImageView.ScaleType.FIT_XY);
        }
    }

    public final void n() {
        l(this.f39120g, this.f39126m);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        ColorDrawable colorDrawable = new ColorDrawable(i11);
        this.f39115b = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.f39115b = drawable;
        m(true);
        super.setBackgroundDrawable(this.f39115b);
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i11) {
        if (this.f39125l != i11) {
            this.f39125l = i11;
            Drawable g11 = g();
            this.f39115b = g11;
            setBackgroundDrawable(g11);
        }
    }

    public void setBorderColor(@ColorInt int i11) {
        setBorderColor(ColorStateList.valueOf(i11));
    }

    public void setBorderWidth(@DimenRes int i11) {
        setBorderWidth(getResources().getDimension(i11));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f39118e != colorFilter) {
            this.f39118e = colorFilter;
            this.f39121h = true;
            this.f39119f = true;
            a();
            invalidate();
        }
    }

    public void setCornerRadius(float f11) {
        i(f11, f11, f11, f11);
    }

    public void setCornerRadiusDimen(@DimenRes int i11) {
        float dimension = getResources().getDimension(i11);
        i(dimension, dimension, dimension, dimension);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f39124k = 0;
        this.f39120g = c.d(bitmap);
        n();
        super.setImageDrawable(this.f39120g);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f39124k = 0;
        this.f39120g = c.e(drawable);
        n();
        super.setImageDrawable(this.f39120g);
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i11) {
        if (this.f39124k != i11) {
            this.f39124k = i11;
            this.f39120g = h();
            n();
            super.setImageDrawable(this.f39120g);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z11) {
        this.f39122i = z11;
        n();
        m(false);
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (this.f39126m != scaleType) {
            this.f39126m = scaleType;
            switch (a.f39129a[scaleType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    super.setScaleType(ImageView.ScaleType.FIT_XY);
                    break;
                default:
                    super.setScaleType(scaleType);
                    break;
            }
            n();
            m(false);
            invalidate();
        }
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.f39127n == tileMode) {
            return;
        }
        this.f39127n = tileMode;
        n();
        m(false);
        invalidate();
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.f39128o == tileMode) {
            return;
        }
        this.f39128o = tileMode;
        n();
        m(false);
        invalidate();
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.f39116c.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(-16777216);
        }
        this.f39116c = colorStateList;
        n();
        m(false);
        if (this.f39117d > 0.0f) {
            invalidate();
        }
    }

    public void setBorderWidth(float f11) {
        if (this.f39117d == f11) {
            return;
        }
        this.f39117d = f11;
        n();
        m(false);
        invalidate();
    }

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundedImageView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        this.f39114a = fArr;
        this.f39116c = ColorStateList.valueOf(-16777216);
        this.f39117d = 0.0f;
        this.f39118e = null;
        this.f39119f = false;
        this.f39121h = false;
        this.f39122i = false;
        this.f39123j = false;
        Shader.TileMode tileMode = f39111w;
        this.f39127n = tileMode;
        this.f39128o = tileMode;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RoundedImageView, i11, 0);
        int i12 = obtainStyledAttributes.getInt(R.styleable.RoundedImageView_android_scaleType, -1);
        if (i12 >= 0) {
            setScaleType(f39112x[i12]);
        } else {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.RoundedImageView_riv_corner_radius, -1);
        fArr[0] = obtainStyledAttributes.getDimensionPixelSize(R.styleable.RoundedImageView_riv_corner_radius_top_left, -1);
        fArr[1] = obtainStyledAttributes.getDimensionPixelSize(R.styleable.RoundedImageView_riv_corner_radius_top_right, -1);
        fArr[2] = obtainStyledAttributes.getDimensionPixelSize(R.styleable.RoundedImageView_riv_corner_radius_bottom_right, -1);
        fArr[3] = obtainStyledAttributes.getDimensionPixelSize(R.styleable.RoundedImageView_riv_corner_radius_bottom_left, -1);
        int length = fArr.length;
        boolean z11 = false;
        for (int i13 = 0; i13 < length; i13++) {
            float[] fArr2 = this.f39114a;
            if (fArr2[i13] < 0.0f) {
                fArr2[i13] = 0.0f;
            } else {
                z11 = true;
            }
        }
        if (!z11) {
            dimensionPixelSize = dimensionPixelSize < 0.0f ? 0.0f : dimensionPixelSize;
            int length2 = this.f39114a.length;
            for (int i14 = 0; i14 < length2; i14++) {
                this.f39114a[i14] = dimensionPixelSize;
            }
        }
        float dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.RoundedImageView_riv_border_width, -1);
        this.f39117d = dimensionPixelSize2;
        if (dimensionPixelSize2 < 0.0f) {
            this.f39117d = 0.0f;
        }
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(R.styleable.RoundedImageView_riv_border_color);
        this.f39116c = colorStateList;
        if (colorStateList == null) {
            this.f39116c = ColorStateList.valueOf(-16777216);
        }
        this.f39123j = obtainStyledAttributes.getBoolean(R.styleable.RoundedImageView_riv_mutate_background, false);
        this.f39122i = obtainStyledAttributes.getBoolean(R.styleable.RoundedImageView_riv_oval, false);
        int i15 = obtainStyledAttributes.getInt(R.styleable.RoundedImageView_riv_tile_mode, -2);
        if (i15 != -2) {
            setTileModeX(f(i15));
            setTileModeY(f(i15));
        }
        int i16 = obtainStyledAttributes.getInt(R.styleable.RoundedImageView_riv_tile_mode_x, -2);
        if (i16 != -2) {
            setTileModeX(f(i16));
        }
        int i17 = obtainStyledAttributes.getInt(R.styleable.RoundedImageView_riv_tile_mode_y, -2);
        if (i17 != -2) {
            setTileModeY(f(i17));
        }
        n();
        m(true);
        if (this.f39123j) {
            super.setBackgroundDrawable(this.f39115b);
        }
        obtainStyledAttributes.recycle();
    }
}
