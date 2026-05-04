package sn;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import androidx.annotation.FontRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.res.ResourcesCompat;
import com.google.android.material.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class d {

    /* renamed from: r, reason: collision with root package name */
    public static final String f88849r = "TextAppearance";

    /* renamed from: s, reason: collision with root package name */
    public static final int f88850s = 1;

    /* renamed from: t, reason: collision with root package name */
    public static final int f88851t = 2;

    /* renamed from: u, reason: collision with root package name */
    public static final int f88852u = 3;

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public final ColorStateList f88853a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public final ColorStateList f88854b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public final ColorStateList f88855c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f88856d;

    /* renamed from: e, reason: collision with root package name */
    public final int f88857e;

    /* renamed from: f, reason: collision with root package name */
    public final int f88858f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f88859g;

    /* renamed from: h, reason: collision with root package name */
    public final float f88860h;

    /* renamed from: i, reason: collision with root package name */
    public final float f88861i;

    /* renamed from: j, reason: collision with root package name */
    public final float f88862j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f88863k;

    /* renamed from: l, reason: collision with root package name */
    public final float f88864l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public ColorStateList f88865m;

    /* renamed from: n, reason: collision with root package name */
    public float f88866n;

    /* renamed from: o, reason: collision with root package name */
    @FontRes
    public final int f88867o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f88868p = false;

    /* renamed from: q, reason: collision with root package name */
    public Typeface f88869q;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends ResourcesCompat.FontCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f88870a;

        public a(f fVar) {
            this.f88870a = fVar;
        }

        @Override // androidx.core.content.res.ResourcesCompat.FontCallback
        public void onFontRetrievalFailed(int i11) {
            d.this.f88868p = true;
            this.f88870a.a(i11);
        }

        @Override // androidx.core.content.res.ResourcesCompat.FontCallback
        public void onFontRetrieved(@NonNull Typeface typeface) {
            d dVar = d.this;
            dVar.f88869q = Typeface.create(typeface, dVar.f88857e);
            d.this.f88868p = true;
            this.f88870a.b(d.this.f88869q, false);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f88872a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextPaint f88873b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f88874c;

        public b(Context context, TextPaint textPaint, f fVar) {
            this.f88872a = context;
            this.f88873b = textPaint;
            this.f88874c = fVar;
        }

        @Override // sn.f
        public void a(int i11) {
            this.f88874c.a(i11);
        }

        @Override // sn.f
        public void b(@NonNull Typeface typeface, boolean z11) {
            d.this.p(this.f88872a, this.f88873b, typeface);
            this.f88874c.b(typeface, z11);
        }
    }

    public d(@NonNull Context context, @StyleRes int i11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i11, R.styleable.TextAppearance);
        l(obtainStyledAttributes.getDimension(R.styleable.TextAppearance_android_textSize, 0.0f));
        k(c.a(context, obtainStyledAttributes, R.styleable.TextAppearance_android_textColor));
        this.f88853a = c.a(context, obtainStyledAttributes, R.styleable.TextAppearance_android_textColorHint);
        this.f88854b = c.a(context, obtainStyledAttributes, R.styleable.TextAppearance_android_textColorLink);
        this.f88857e = obtainStyledAttributes.getInt(R.styleable.TextAppearance_android_textStyle, 0);
        this.f88858f = obtainStyledAttributes.getInt(R.styleable.TextAppearance_android_typeface, 1);
        int g11 = c.g(obtainStyledAttributes, R.styleable.TextAppearance_fontFamily, R.styleable.TextAppearance_android_fontFamily);
        this.f88867o = obtainStyledAttributes.getResourceId(g11, 0);
        this.f88856d = obtainStyledAttributes.getString(g11);
        this.f88859g = obtainStyledAttributes.getBoolean(R.styleable.TextAppearance_textAllCaps, false);
        this.f88855c = c.a(context, obtainStyledAttributes, R.styleable.TextAppearance_android_shadowColor);
        this.f88860h = obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowDx, 0.0f);
        this.f88861i = obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowDy, 0.0f);
        this.f88862j = obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i11, R.styleable.MaterialTextAppearance);
        int i12 = R.styleable.MaterialTextAppearance_android_letterSpacing;
        this.f88863k = obtainStyledAttributes2.hasValue(i12);
        this.f88864l = obtainStyledAttributes2.getFloat(i12, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void d() {
        String str;
        if (this.f88869q == null && (str = this.f88856d) != null) {
            this.f88869q = Typeface.create(str, this.f88857e);
        }
        if (this.f88869q == null) {
            int i11 = this.f88858f;
            if (i11 == 1) {
                this.f88869q = Typeface.SANS_SERIF;
            } else if (i11 == 2) {
                this.f88869q = Typeface.SERIF;
            } else if (i11 != 3) {
                this.f88869q = Typeface.DEFAULT;
            } else {
                this.f88869q = Typeface.MONOSPACE;
            }
            this.f88869q = Typeface.create(this.f88869q, this.f88857e);
        }
    }

    public Typeface e() {
        d();
        return this.f88869q;
    }

    @NonNull
    @VisibleForTesting
    public Typeface f(@NonNull Context context) {
        if (this.f88868p) {
            return this.f88869q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface font = ResourcesCompat.getFont(context, this.f88867o);
                this.f88869q = font;
                if (font != null) {
                    this.f88869q = Typeface.create(font, this.f88857e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e11) {
                Log.d(f88849r, "Error loading font " + this.f88856d, e11);
            }
        }
        d();
        this.f88868p = true;
        return this.f88869q;
    }

    public void g(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull f fVar) {
        p(context, textPaint, e());
        h(context, new b(context, textPaint, fVar));
    }

    public void h(@NonNull Context context, @NonNull f fVar) {
        if (m(context)) {
            f(context);
        } else {
            d();
        }
        int i11 = this.f88867o;
        if (i11 == 0) {
            this.f88868p = true;
        }
        if (this.f88868p) {
            fVar.b(this.f88869q, true);
            return;
        }
        try {
            ResourcesCompat.getFont(context, i11, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f88868p = true;
            fVar.a(1);
        } catch (Exception e11) {
            Log.d(f88849r, "Error loading font " + this.f88856d, e11);
            this.f88868p = true;
            fVar.a(-3);
        }
    }

    @Nullable
    public ColorStateList i() {
        return this.f88865m;
    }

    public float j() {
        return this.f88866n;
    }

    public void k(@Nullable ColorStateList colorStateList) {
        this.f88865m = colorStateList;
    }

    public void l(float f11) {
        this.f88866n = f11;
    }

    public final boolean m(Context context) {
        if (e.b()) {
            return true;
        }
        int i11 = this.f88867o;
        return (i11 != 0 ? ResourcesCompat.getCachedFont(context, i11) : null) != null;
    }

    public void n(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull f fVar) {
        o(context, textPaint, fVar);
        ColorStateList colorStateList = this.f88865m;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f11 = this.f88862j;
        float f12 = this.f88860h;
        float f13 = this.f88861i;
        ColorStateList colorStateList2 = this.f88855c;
        textPaint.setShadowLayer(f11, f12, f13, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void o(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull f fVar) {
        if (m(context)) {
            p(context, textPaint, f(context));
        } else {
            g(context, textPaint, fVar);
        }
    }

    public void p(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull Typeface typeface) {
        Typeface a11 = h.a(context, typeface);
        if (a11 != null) {
            typeface = a11;
        }
        textPaint.setTypeface(typeface);
        int i11 = this.f88857e & (~typeface.getStyle());
        textPaint.setFakeBoldText((i11 & 1) != 0);
        textPaint.setTextSkewX((i11 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f88866n);
        if (this.f88863k) {
            textPaint.setLetterSpacing(this.f88864l);
        }
    }
}
