package fn;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.color.utilities.TonePolarity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f52181a;

    /* renamed from: b, reason: collision with root package name */
    public final Function<k, s6> f52182b;

    /* renamed from: c, reason: collision with root package name */
    public final Function<k, Double> f52183c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f52184d;

    /* renamed from: e, reason: collision with root package name */
    public final Function<k, j> f52185e;

    /* renamed from: f, reason: collision with root package name */
    public final Function<k, j> f52186f;

    /* renamed from: g, reason: collision with root package name */
    public final e f52187g;

    /* renamed from: h, reason: collision with root package name */
    public final Function<k, t6> f52188h;

    /* renamed from: i, reason: collision with root package name */
    public final Function<k, Double> f52189i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap<k, l> f52190j;

    public j(@NonNull String str, @NonNull Function<k, s6> function, @NonNull Function<k, Double> function2, boolean z11, @Nullable Function<k, j> function3, @Nullable Function<k, j> function4, @Nullable e eVar, @Nullable Function<k, t6> function5) {
        this.f52190j = new HashMap<>();
        this.f52181a = str;
        this.f52182b = function;
        this.f52183c = function2;
        this.f52184d = z11;
        this.f52185e = function3;
        this.f52186f = function4;
        this.f52187g = eVar;
        this.f52188h = function5;
        this.f52189i = null;
    }

    public static double c(double d11) {
        if (!l(d11) || k(d11)) {
            return d11;
        }
        return 49.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static double d(double r10, double r12) {
        /*
            double r0 = fn.d.d(r10, r12)
            double r2 = fn.d.b(r10, r12)
            double r4 = fn.d.e(r0, r10)
            double r6 = fn.d.e(r2, r10)
            boolean r10 = l(r10)
            if (r10 == 0) goto L3b
            double r10 = r4 - r6
            double r10 = java.lang.Math.abs(r10)
            r8 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 >= 0) goto L2f
            int r10 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r10 >= 0) goto L2f
            int r10 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r10 >= 0) goto L2f
            r10 = 1
            goto L30
        L2f:
            r10 = 0
        L30:
            int r11 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r11 >= 0) goto L44
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 >= 0) goto L44
            if (r10 == 0) goto L45
            goto L44
        L3b:
            int r10 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r10 >= 0) goto L45
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 < 0) goto L44
            goto L45
        L44:
            return r0
        L45:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: fn.j.d(double, double):double");
    }

    @NonNull
    public static j e(@NonNull String str, int i11) {
        final l b11 = l.b(i11);
        final s6 d11 = s6.d(i11);
        return f(str, new Function() { // from class: fn.h
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return j.b(s6.this, (k) obj);
            }
        }, new Function() { // from class: fn.i
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(l.this.e());
                return valueOf;
            }
        });
    }

    @NonNull
    public static j f(@NonNull String str, @NonNull Function<k, s6> function, @NonNull Function<k, Double> function2) {
        return new j(str, function, function2, false, null, null, null, null);
    }

    @NonNull
    public static j g(@NonNull String str, @NonNull Function<k, s6> function, @NonNull Function<k, Double> function2, boolean z11) {
        return new j(str, function, function2, z11, null, null, null, null);
    }

    public static boolean k(double d11) {
        return Math.round(d11) <= 49;
    }

    public static boolean l(double d11) {
        return Math.round(d11) < 60;
    }

    public int h(@NonNull k kVar) {
        int k11 = i(kVar).k();
        Function<k, Double> function = this.f52189i;
        if (function == null) {
            return k11;
        }
        return (v5.b(0, 255, (int) Math.round(function.apply(kVar).doubleValue() * 255.0d)) << 24) | (k11 & 16777215);
    }

    @NonNull
    public l i(@NonNull k kVar) {
        l lVar = this.f52190j.get(kVar);
        if (lVar != null) {
            return lVar;
        }
        l f11 = this.f52182b.apply(kVar).f(j(kVar));
        if (this.f52190j.size() > 4) {
            this.f52190j.clear();
        }
        this.f52190j.put(kVar, f11);
        return f11;
    }

    public double j(@NonNull k kVar) {
        double d11;
        double d12;
        double min;
        boolean z11 = false;
        boolean z12 = kVar.f52195e < 0.0d;
        Function<k, t6> function = this.f52188h;
        if (function == null) {
            boolean z13 = z12;
            double doubleValue = this.f52183c.apply(kVar).doubleValue();
            Function<k, j> function2 = this.f52185e;
            if (function2 == null) {
                return doubleValue;
            }
            double j11 = function2.apply(kVar).j(kVar);
            double a11 = this.f52187g.a(kVar.f52195e);
            if (d.e(j11, doubleValue) < a11) {
                doubleValue = d(j11, a11);
            }
            if (z13) {
                doubleValue = d(j11, a11);
            }
            if (!this.f52184d || 50.0d > doubleValue || doubleValue >= 60.0d) {
                d11 = doubleValue;
            } else {
                d11 = 49.0d;
                if (d.e(49.0d, j11) < a11) {
                    d11 = 60.0d;
                }
            }
            if (this.f52186f != null) {
                double j12 = this.f52185e.apply(kVar).j(kVar);
                double j13 = this.f52186f.apply(kVar).j(kVar);
                double max = Math.max(j12, j13);
                double min2 = Math.min(j12, j13);
                if (d.e(max, d11) < a11 || d.e(min2, d11) < a11) {
                    double c11 = d.c(max, a11);
                    double a12 = d.a(min2, a11);
                    ArrayList arrayList = new ArrayList();
                    if (c11 != -1.0d) {
                        arrayList.add(Double.valueOf(c11));
                    }
                    if (a12 != -1.0d) {
                        arrayList.add(Double.valueOf(a12));
                    }
                    if (l(j12) || l(j13)) {
                        if (c11 == -1.0d) {
                            return 100.0d;
                        }
                        return c11;
                    }
                    if (arrayList.size() == 1) {
                        return ((Double) arrayList.get(0)).doubleValue();
                    }
                    if (a12 == -1.0d) {
                        return 0.0d;
                    }
                    return a12;
                }
            }
            return d11;
        }
        t6 apply = function.apply(kVar);
        j c12 = apply.c();
        j d13 = apply.d();
        double a13 = apply.a();
        TonePolarity b11 = apply.b();
        boolean e11 = apply.e();
        double j14 = this.f52185e.apply(kVar).j(kVar);
        if (b11 == TonePolarity.NEARER || ((b11 == TonePolarity.LIGHTER && !kVar.f52194d) || (b11 == TonePolarity.DARKER && kVar.f52194d))) {
            z11 = true;
        }
        j jVar = z11 ? c12 : d13;
        j jVar2 = z11 ? d13 : c12;
        boolean equals = this.f52181a.equals(jVar.f52181a);
        double d14 = kVar.f52194d ? 1.0d : -1.0d;
        double a14 = jVar.f52187g.a(kVar.f52195e);
        double a15 = jVar2.f52187g.a(kVar.f52195e);
        double doubleValue2 = jVar.f52183c.apply(kVar).doubleValue();
        if (d.e(j14, doubleValue2) < a14) {
            doubleValue2 = d(j14, a14);
        }
        boolean z14 = z12;
        double doubleValue3 = jVar2.f52183c.apply(kVar).doubleValue();
        if (d.e(j14, doubleValue3) < a15) {
            doubleValue3 = d(j14, a15);
        }
        if (z14) {
            doubleValue2 = d(j14, a14);
            doubleValue3 = d(j14, a15);
        }
        if ((doubleValue3 - doubleValue2) * d14 < a13) {
            double d15 = a13 * d14;
            double a16 = v5.a(0.0d, 100.0d, doubleValue2 + d15);
            if ((a16 - doubleValue2) * d14 < a13) {
                doubleValue2 = v5.a(0.0d, 100.0d, a16 - d15);
            }
            doubleValue3 = a16;
        }
        if (50.0d > doubleValue2 || doubleValue2 >= 60.0d) {
            if (50.0d > doubleValue3 || doubleValue3 >= 60.0d) {
                d12 = doubleValue3;
            } else if (!e11) {
                d12 = d14 > 0.0d ? 60.0d : 49.0d;
            } else if (d14 > 0.0d) {
                d12 = Math.max(doubleValue3, (a13 * d14) + 60.0d);
                doubleValue2 = 60.0d;
            } else {
                min = Math.min(doubleValue3, (a13 * d14) + 49.0d);
                d12 = min;
                doubleValue2 = 49.0d;
            }
        } else if (d14 > 0.0d) {
            d12 = Math.max(doubleValue3, (a13 * d14) + 60.0d);
            doubleValue2 = 60.0d;
        } else {
            min = Math.min(doubleValue3, (a13 * d14) + 49.0d);
            d12 = min;
            doubleValue2 = 49.0d;
        }
        return equals ? doubleValue2 : d12;
    }

    public j(@NonNull String str, @NonNull Function<k, s6> function, @NonNull Function<k, Double> function2, boolean z11, @Nullable Function<k, j> function3, @Nullable Function<k, j> function4, @Nullable e eVar, @Nullable Function<k, t6> function5, @Nullable Function<k, Double> function6) {
        this.f52190j = new HashMap<>();
        this.f52181a = str;
        this.f52182b = function;
        this.f52183c = function2;
        this.f52184d = z11;
        this.f52185e = function3;
        this.f52186f = function4;
        this.f52187g = eVar;
        this.f52188h = function5;
        this.f52189i = function6;
    }

    public static /* synthetic */ s6 b(s6 s6Var, k kVar) {
        return s6Var;
    }
}
