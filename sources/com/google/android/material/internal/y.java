package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public final class y {

    /* renamed from: o, reason: collision with root package name */
    public static final int f31679o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final float f31680p = 0.0f;

    /* renamed from: q, reason: collision with root package name */
    public static final float f31681q = 1.0f;

    /* renamed from: r, reason: collision with root package name */
    public static final String f31682r = "android.text.TextDirectionHeuristic";

    /* renamed from: s, reason: collision with root package name */
    public static final String f31683s = "android.text.TextDirectionHeuristics";

    /* renamed from: t, reason: collision with root package name */
    public static final String f31684t = "LTR";

    /* renamed from: u, reason: collision with root package name */
    public static final String f31685u = "RTL";

    /* renamed from: v, reason: collision with root package name */
    public static boolean f31686v;

    /* renamed from: w, reason: collision with root package name */
    @Nullable
    public static Constructor<StaticLayout> f31687w;

    /* renamed from: x, reason: collision with root package name */
    @Nullable
    public static Object f31688x;

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f31689a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f31690b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31691c;

    /* renamed from: e, reason: collision with root package name */
    public int f31693e;

    /* renamed from: l, reason: collision with root package name */
    public boolean f31700l;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public z f31702n;

    /* renamed from: d, reason: collision with root package name */
    public int f31692d = 0;

    /* renamed from: f, reason: collision with root package name */
    public Layout.Alignment f31694f = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: g, reason: collision with root package name */
    public int f31695g = Integer.MAX_VALUE;

    /* renamed from: h, reason: collision with root package name */
    public float f31696h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f31697i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    public int f31698j = f31679o;

    /* renamed from: k, reason: collision with root package name */
    public boolean f31699k = true;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public TextUtils.TruncateAt f31701m = null;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends Exception {
        public a(Throwable th2) {
            super("Error thrown initializing StaticLayout " + th2.getMessage(), th2);
        }
    }

    public y(CharSequence charSequence, TextPaint textPaint, int i11) {
        this.f31689a = charSequence;
        this.f31690b = textPaint;
        this.f31691c = i11;
        this.f31693e = charSequence.length();
    }

    @NonNull
    public static y c(@NonNull CharSequence charSequence, @NonNull TextPaint textPaint, @IntRange(from = 0) int i11) {
        return new y(charSequence, textPaint, i11);
    }

    public StaticLayout a() throws a {
        if (this.f31689a == null) {
            this.f31689a = "";
        }
        int max = Math.max(0, this.f31691c);
        CharSequence charSequence = this.f31689a;
        if (this.f31695g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f31690b, max, this.f31701m);
        }
        int min = Math.min(charSequence.length(), this.f31693e);
        this.f31693e = min;
        if (this.f31700l && this.f31695g == 1) {
            this.f31694f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f31692d, min, this.f31690b, max);
        obtain.setAlignment(this.f31694f);
        obtain.setIncludePad(this.f31699k);
        obtain.setTextDirection(this.f31700l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f31701m;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f31695g);
        float f11 = this.f31696h;
        if (f11 != 0.0f || this.f31697i != 1.0f) {
            obtain.setLineSpacing(f11, this.f31697i);
        }
        if (this.f31695g > 1) {
            obtain.setHyphenationFrequency(this.f31698j);
        }
        z zVar = this.f31702n;
        if (zVar != null) {
            zVar.a(obtain);
        }
        return obtain.build();
    }

    public final void b() throws a {
        if (f31686v) {
            return;
        }
        try {
            f31688x = this.f31700l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            f31687w = declaredConstructor;
            declaredConstructor.setAccessible(true);
            f31686v = true;
        } catch (Exception e11) {
            throw new a(e11);
        }
    }

    @NonNull
    @uo.a
    public y d(@NonNull Layout.Alignment alignment) {
        this.f31694f = alignment;
        return this;
    }

    @NonNull
    @uo.a
    public y e(@Nullable TextUtils.TruncateAt truncateAt) {
        this.f31701m = truncateAt;
        return this;
    }

    @NonNull
    @uo.a
    public y f(@IntRange(from = 0) int i11) {
        this.f31693e = i11;
        return this;
    }

    @NonNull
    @uo.a
    public y g(int i11) {
        this.f31698j = i11;
        return this;
    }

    @NonNull
    @uo.a
    public y h(boolean z11) {
        this.f31699k = z11;
        return this;
    }

    public y i(boolean z11) {
        this.f31700l = z11;
        return this;
    }

    @NonNull
    @uo.a
    public y j(float f11, float f12) {
        this.f31696h = f11;
        this.f31697i = f12;
        return this;
    }

    @NonNull
    @uo.a
    public y k(@IntRange(from = 0) int i11) {
        this.f31695g = i11;
        return this;
    }

    @NonNull
    @uo.a
    public y l(@IntRange(from = 0) int i11) {
        this.f31692d = i11;
        return this;
    }

    @NonNull
    @uo.a
    public y m(@Nullable z zVar) {
        this.f31702n = zVar;
        return this;
    }
}
