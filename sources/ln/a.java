package ln;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.R;
import com.google.android.material.internal.m0;
import en.u;
import sn.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: f, reason: collision with root package name */
    public static final float f71533f = 4.5f;

    /* renamed from: g, reason: collision with root package name */
    public static final float f71534g = 2.0f;

    /* renamed from: h, reason: collision with root package name */
    public static final int f71535h = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f71536a;

    /* renamed from: b, reason: collision with root package name */
    public final int f71537b;

    /* renamed from: c, reason: collision with root package name */
    public final int f71538c;

    /* renamed from: d, reason: collision with root package name */
    public final int f71539d;

    /* renamed from: e, reason: collision with root package name */
    public final float f71540e;

    public a(@NonNull Context context) {
        this(b.b(context, R.attr.elevationOverlayEnabled, false), u.b(context, R.attr.elevationOverlayColor, 0), u.b(context, R.attr.elevationOverlayAccentColor, 0), u.b(context, R.attr.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    public int a(float f11) {
        return Math.round(b(f11) * 255.0f);
    }

    public float b(float f11) {
        if (this.f71540e <= 0.0f || f11 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f11 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    @ColorInt
    public int c(@ColorInt int i11, float f11) {
        int i12;
        float b11 = b(f11);
        int alpha = Color.alpha(i11);
        int t11 = u.t(ColorUtils.setAlphaComponent(i11, 255), this.f71537b, b11);
        if (b11 > 0.0f && (i12 = this.f71538c) != 0) {
            t11 = u.s(t11, ColorUtils.setAlphaComponent(i12, f71535h));
        }
        return ColorUtils.setAlphaComponent(t11, alpha);
    }

    @ColorInt
    public int d(@ColorInt int i11, float f11, @NonNull View view) {
        return c(i11, f11 + i(view));
    }

    @ColorInt
    public int e(@ColorInt int i11, float f11) {
        return (this.f71536a && m(i11)) ? c(i11, f11) : i11;
    }

    @ColorInt
    public int f(@ColorInt int i11, float f11, @NonNull View view) {
        return e(i11, f11 + i(view));
    }

    @ColorInt
    public int g(float f11) {
        return e(this.f71539d, f11);
    }

    @ColorInt
    public int h(float f11, @NonNull View view) {
        return g(f11 + i(view));
    }

    public float i(@NonNull View view) {
        return m0.p(view);
    }

    @ColorInt
    public int j() {
        return this.f71537b;
    }

    @ColorInt
    public int k() {
        return this.f71539d;
    }

    public boolean l() {
        return this.f71536a;
    }

    public final boolean m(@ColorInt int i11) {
        return ColorUtils.setAlphaComponent(i11, 255) == this.f71539d;
    }

    public a(boolean z11, @ColorInt int i11, @ColorInt int i12, @ColorInt int i13, float f11) {
        this.f71536a = z11;
        this.f71537b = i11;
        this.f71538c = i12;
        this.f71539d = i13;
        this.f71540e = f11;
    }
}
