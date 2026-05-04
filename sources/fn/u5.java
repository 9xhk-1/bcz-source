package fn;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.baicizhan.main.activity.SingleFragmentActivity;
import com.google.android.material.color.utilities.TonePolarity;
import com.google.android.material.color.utilities.Variant;
import java.util.function.Function;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public final class u5 {
    public static /* synthetic */ Double A0(u5 u5Var, k kVar) {
        u5Var.getClass();
        if (r2(kVar)) {
            return Double.valueOf(j.d(u5Var.Q2().f52183c.apply(kVar).doubleValue(), 4.5d));
        }
        if (s2(kVar)) {
            return Double.valueOf(kVar.f52194d ? 0.0d : 100.0d);
        }
        return Double.valueOf(kVar.f52194d ? 90.0d : 10.0d);
    }

    public static /* synthetic */ t6 C(u5 u5Var, k kVar) {
        return new t6(u5Var.W2(), u5Var.V2(), 15.0d, TonePolarity.NEARER, false);
    }

    public static /* synthetic */ t6 D(u5 u5Var, k kVar) {
        return new t6(u5Var.l2(), u5Var.k2(), 15.0d, TonePolarity.NEARER, false);
    }

    public static /* synthetic */ Double D1(k kVar) {
        if (s2(kVar)) {
            return Double.valueOf(kVar.f52194d ? 90.0d : 25.0d);
        }
        return Double.valueOf(kVar.f52194d ? 80.0d : 40.0d);
    }

    public static /* synthetic */ Double I0(k kVar) {
        if (s2(kVar)) {
            return Double.valueOf(kVar.f52194d ? 100.0d : 0.0d);
        }
        return Double.valueOf(kVar.f52194d ? 80.0d : 40.0d);
    }

    public static /* synthetic */ Double K0(k kVar) {
        if (s2(kVar)) {
            return Double.valueOf(kVar.f52194d ? 10.0d : 90.0d);
        }
        return Double.valueOf(kVar.f52194d ? 20.0d : 100.0d);
    }

    public static /* synthetic */ Double N(k kVar) {
        if (s2(kVar)) {
            return Double.valueOf(kVar.f52194d ? 10.0d : 100.0d);
        }
        return Double.valueOf(kVar.f52194d ? 20.0d : 100.0d);
    }

    public static double O2(l lVar, k kVar) {
        l f11 = lVar.f(v3(kVar));
        return (!j.l(lVar.e()) || j.k(f11.e())) ? j.c(f11.e()) : j.c(lVar.e());
    }

    public static /* synthetic */ Double Q0(k kVar) {
        if (r2(kVar)) {
            return Double.valueOf(O2(kVar.f52192b, kVar));
        }
        if (s2(kVar)) {
            return Double.valueOf(kVar.f52194d ? 85.0d : 25.0d);
        }
        return Double.valueOf(kVar.f52194d ? 30.0d : 90.0d);
    }

    public static /* synthetic */ t6 X1(u5 u5Var, k kVar) {
        return new t6(u5Var.n3(), u5Var.o3(), 10.0d, TonePolarity.LIGHTER, true);
    }

    public static /* synthetic */ t6 Z0(u5 u5Var, k kVar) {
        return new t6(u5Var.W2(), u5Var.V2(), 15.0d, TonePolarity.NEARER, false);
    }

    public static /* synthetic */ t6 a(u5 u5Var, k kVar) {
        return new t6(u5Var.R2(), u5Var.S2(), 10.0d, TonePolarity.LIGHTER, true);
    }

    public static /* synthetic */ Double a1(k kVar) {
        if (s2(kVar)) {
            return Double.valueOf(kVar.f52194d ? 10.0d : 90.0d);
        }
        return Double.valueOf(kVar.f52194d ? 20.0d : 100.0d);
    }

    public static /* synthetic */ t6 e1(u5 u5Var, k kVar) {
        return new t6(u5Var.X2(), u5Var.Y2(), 10.0d, TonePolarity.LIGHTER, true);
    }

    public static /* synthetic */ t6 f(u5 u5Var, k kVar) {
        return new t6(u5Var.R2(), u5Var.S2(), 10.0d, TonePolarity.LIGHTER, true);
    }

    public static /* synthetic */ Double g1(u5 u5Var, k kVar) {
        u5Var.getClass();
        if (s2(kVar)) {
            return Double.valueOf(kVar.f52194d ? 0.0d : 100.0d);
        }
        if (r2(kVar)) {
            return Double.valueOf(j.d(u5Var.m3().f52183c.apply(kVar).doubleValue(), 4.5d));
        }
        return Double.valueOf(kVar.f52194d ? 90.0d : 10.0d);
    }

    public static /* synthetic */ Double h1(k kVar) {
        if (s2(kVar)) {
            return Double.valueOf(kVar.f52194d ? 60.0d : 49.0d);
        }
        if (r2(kVar)) {
            return Double.valueOf(g.a(kVar.f52198h.f(O2(kVar.f52198h.f(kVar.f52192b.e()), kVar))).e());
        }
        return Double.valueOf(kVar.f52194d ? 30.0d : 90.0d);
    }

    public static /* synthetic */ Double k(k kVar) {
        double d11 = kVar.f52194d ? 30.0d : 90.0d;
        if (s2(kVar)) {
            return Double.valueOf(kVar.f52194d ? 30.0d : 85.0d);
        }
        if (r2(kVar)) {
            return Double.valueOf(O2(kVar.f52197g.f(m2(kVar.f52197g.g(), kVar.f52197g.e(), d11, !kVar.f52194d)), kVar));
        }
        return Double.valueOf(d11);
    }

    public static /* synthetic */ Double m(u5 u5Var, k kVar) {
        u5Var.getClass();
        if (r2(kVar)) {
            return Double.valueOf(j.d(u5Var.W2().f52183c.apply(kVar).doubleValue(), 4.5d));
        }
        return Double.valueOf(kVar.f52194d ? 90.0d : 10.0d);
    }

    public static /* synthetic */ t6 m1(u5 u5Var, k kVar) {
        return new t6(u5Var.Q2(), u5Var.P2(), 15.0d, TonePolarity.NEARER, false);
    }

    public static double m2(double d11, double d12, double d13, boolean z11) {
        l a11 = l.a(d11, d12, d13);
        if (a11.c() < d12) {
            double c11 = a11.c();
            while (a11.c() < d12) {
                d13 += z11 ? -1.0d : 1.0d;
                l a12 = l.a(d11, d12, d13);
                if (c11 > a12.c() || Math.abs(a12.c() - d12) < 0.4d) {
                    return d13;
                }
                if (Math.abs(a12.c() - d12) < Math.abs(a11.c() - d12)) {
                    a11 = a12;
                }
                c11 = Math.max(c11, a12.c());
            }
        }
        return d13;
    }

    public static /* synthetic */ t6 o0(u5 u5Var, k kVar) {
        return new t6(u5Var.l2(), u5Var.k2(), 15.0d, TonePolarity.NEARER, false);
    }

    public static boolean r2(k kVar) {
        Variant variant = kVar.f52193c;
        return variant == Variant.FIDELITY || variant == Variant.CONTENT;
    }

    public static /* synthetic */ t6 s0(u5 u5Var, k kVar) {
        return new t6(u5Var.X2(), u5Var.Y2(), 10.0d, TonePolarity.LIGHTER, true);
    }

    public static boolean s2(k kVar) {
        return kVar.f52193c == Variant.MONOCHROME;
    }

    public static /* synthetic */ t6 u(u5 u5Var, k kVar) {
        return new t6(u5Var.Q2(), u5Var.P2(), 15.0d, TonePolarity.NEARER, false);
    }

    public static /* synthetic */ t6 v1(u5 u5Var, k kVar) {
        return new t6(u5Var.n3(), u5Var.o3(), 10.0d, TonePolarity.LIGHTER, true);
    }

    public static u6 v3(k kVar) {
        return u6.a(kVar.f52194d ? 30.0d : 80.0d);
    }

    public static /* synthetic */ t6 y0(u5 u5Var, k kVar) {
        return new t6(u5Var.m3(), u5Var.l3(), 15.0d, TonePolarity.NEARER, false);
    }

    public static /* synthetic */ t6 z1(u5 u5Var, k kVar) {
        return new t6(u5Var.m3(), u5Var.l3(), 15.0d, TonePolarity.NEARER, false);
    }

    @NonNull
    public j A2() {
        return new j("on_primary_fixed", new Function() { // from class: fn.p0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52196f;
                return s6Var;
            }
        }, new Function() { // from class: fn.q0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(u5.s2(r2) ? 100.0d : 10.0d);
                return valueOf;
            }
        }, false, new Function() { // from class: fn.r0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                j S2;
                S2 = u5.this.S2();
                return S2;
            }
        }, new Function() { // from class: fn.s0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                j R2;
                R2 = u5.this.R2();
                return R2;
            }
        }, new e(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public j B2() {
        return new j("on_primary_fixed_variant", new Function() { // from class: fn.f4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52196f;
                return s6Var;
            }
        }, new Function() { // from class: fn.g4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(u5.s2(r2) ? 90.0d : 30.0d);
                return valueOf;
            }
        }, false, new Function() { // from class: fn.h4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                j S2;
                S2 = u5.this.S2();
                return S2;
            }
        }, new Function() { // from class: fn.i4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                j R2;
                R2 = u5.this.R2();
                return R2;
            }
        }, new e(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @NonNull
    public j C2() {
        return new j("on_secondary", new Function() { // from class: fn.o
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52197g;
                return s6Var;
            }
        }, new Function() { // from class: fn.p
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.N((k) obj);
            }
        }, false, new Function() { // from class: fn.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                j V2;
                V2 = u5.this.V2();
                return V2;
            }
        }, null, new e(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public j D2() {
        return new j("on_secondary_container", new Function() { // from class: fn.m0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52197g;
                return s6Var;
            }
        }, new Function() { // from class: fn.n0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.m(u5.this, (k) obj);
            }
        }, false, new Function() { // from class: fn.o0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                j W2;
                W2 = u5.this.W2();
                return W2;
            }
        }, null, new e(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public j E2() {
        return new j("on_secondary_fixed", new Function() { // from class: fn.b0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52197g;
                return s6Var;
            }
        }, new Function() { // from class: fn.c0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(10.0d);
                return valueOf;
            }
        }, false, new Function() { // from class: fn.d0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                j Y2;
                Y2 = u5.this.Y2();
                return Y2;
            }
        }, new Function() { // from class: fn.e0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                j X2;
                X2 = u5.this.X2();
                return X2;
            }
        }, new e(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public j F2() {
        return new j("on_secondary_fixed_variant", new Function() { // from class: fn.x1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52197g;
                return s6Var;
            }
        }, new Function() { // from class: fn.y1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(u5.s2(r2) ? 25.0d : 30.0d);
                return valueOf;
            }
        }, false, new Function() { // from class: fn.z1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                j Y2;
                Y2 = u5.this.Y2();
                return Y2;
            }
        }, new Function() { // from class: fn.a2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                j X2;
                X2 = u5.this.X2();
                return X2;
            }
        }, new e(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @NonNull
    public j G2() {
        return new j("on_surface", new Function() { // from class: fn.x4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52199i;
                return s6Var;
            }
        }, new Function() { // from class: fn.i5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(r2.f52194d ? 90.0d : 10.0d);
                return valueOf;
            }
        }, false, new t5(this), null, new e(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public j H2() {
        return new j("on_surface_variant", new Function() { // from class: fn.b1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52200j;
                return s6Var;
            }
        }, new Function() { // from class: fn.c1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(r2.f52194d ? 80.0d : 30.0d);
                return valueOf;
            }
        }, false, new t5(this), null, new e(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @NonNull
    public j I2() {
        return new j("on_tertiary", new Function() { // from class: fn.q3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52198h;
                return s6Var;
            }
        }, new Function() { // from class: fn.b4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.a1((k) obj);
            }
        }, false, new Function() { // from class: fn.m4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                j l32;
                l32 = u5.this.l3();
                return l32;
            }
        }, null, new e(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public j J2() {
        return new j("on_tertiary_container", new Function() { // from class: fn.i0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52198h;
                return s6Var;
            }
        }, new Function() { // from class: fn.k0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.g1(u5.this, (k) obj);
            }
        }, false, new Function() { // from class: fn.l0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                j m32;
                m32 = u5.this.m3();
                return m32;
            }
        }, null, new e(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public j K2() {
        return new j("on_tertiary_fixed", new Function() { // from class: fn.w2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52198h;
                return s6Var;
            }
        }, new Function() { // from class: fn.x2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(u5.s2(r2) ? 100.0d : 10.0d);
                return valueOf;
            }
        }, false, new Function() { // from class: fn.y2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                j o32;
                o32 = u5.this.o3();
                return o32;
            }
        }, new Function() { // from class: fn.z2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                j n32;
                n32 = u5.this.n3();
                return n32;
            }
        }, new e(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public j L2() {
        return new j("on_tertiary_fixed_variant", new Function() { // from class: fn.k2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52198h;
                return s6Var;
            }
        }, new Function() { // from class: fn.l2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(u5.s2(r2) ? 90.0d : 30.0d);
                return valueOf;
            }
        }, false, new Function() { // from class: fn.m2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                j o32;
                o32 = u5.this.o3();
                return o32;
            }
        }, new Function() { // from class: fn.n2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                j n32;
                n32 = u5.this.n3();
                return n32;
            }
        }, new e(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @NonNull
    public j M2() {
        return new j("outline", new Function() { // from class: fn.w
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52200j;
                return s6Var;
            }
        }, new Function() { // from class: fn.x
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(r2.f52194d ? 60.0d : 50.0d);
                return valueOf;
            }
        }, false, new t5(this), null, new e(1.5d, 3.0d, 4.5d, 7.0d), null);
    }

    @NonNull
    public j N2() {
        return new j("outline_variant", new Function() { // from class: fn.r3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52200j;
                return s6Var;
            }
        }, new Function() { // from class: fn.s3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(r2.f52194d ? 30.0d : 80.0d);
                return valueOf;
            }
        }, false, new t5(this), null, new e(1.0d, 1.0d, 3.0d, 7.0d), null);
    }

    @NonNull
    public j P2() {
        return new j(com.baicizhan.main.home.plan.module.exam.b.f22502a, new Function() { // from class: fn.s1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52196f;
                return s6Var;
            }
        }, new Function() { // from class: fn.t1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.I0((k) obj);
            }
        }, true, new t5(this), null, new e(3.0d, 4.5d, 7.0d, 11.0d), new Function() { // from class: fn.u1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.m1(u5.this, (k) obj);
            }
        });
    }

    @NonNull
    public j Q2() {
        return new j("primary_container", new Function() { // from class: fn.g3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52196f;
                return s6Var;
            }
        }, new Function() { // from class: fn.h3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.Q0((k) obj);
            }
        }, true, new t5(this), null, new e(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: fn.i3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.u(u5.this, (k) obj);
            }
        });
    }

    @NonNull
    public j R2() {
        return new j("primary_fixed", new Function() { // from class: fn.k5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52196f;
                return s6Var;
            }
        }, new Function() { // from class: fn.l5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(u5.s2(r2) ? 40.0d : 90.0d);
                return valueOf;
            }
        }, true, new t5(this), null, new e(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: fn.m5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.a(u5.this, (k) obj);
            }
        });
    }

    @NonNull
    public j S2() {
        return new j("primary_fixed_dim", new Function() { // from class: fn.n5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52196f;
                return s6Var;
            }
        }, new Function() { // from class: fn.o5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(u5.s2(r2) ? 30.0d : 80.0d);
                return valueOf;
            }
        }, true, new t5(this), null, new e(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: fn.p5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.f(u5.this, (k) obj);
            }
        });
    }

    @NonNull
    public j T2() {
        return j.f("primary_palette_key_color", new Function() { // from class: fn.h2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52196f;
                return s6Var;
            }
        }, new Function() { // from class: fn.i2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(((k) obj).f52196f.h().e());
                return valueOf;
            }
        });
    }

    @NonNull
    public j U2() {
        return new j("scrim", new Function() { // from class: fn.v1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52199i;
                return s6Var;
            }
        }, new Function() { // from class: fn.w1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(0.0d);
                return valueOf;
            }
        }, false, null, null, null, null);
    }

    @NonNull
    public j V2() {
        return new j(com.baicizhan.main.home.plan.module.exam.b.f22503b, new Function() { // from class: fn.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52197g;
                return s6Var;
            }
        }, new Function() { // from class: fn.s
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(r2.f52194d ? 80.0d : 40.0d);
                return valueOf;
            }
        }, true, new t5(this), null, new e(3.0d, 4.5d, 7.0d, 11.0d), new Function() { // from class: fn.t
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.C(u5.this, (k) obj);
            }
        });
    }

    @NonNull
    public j W2() {
        return new j("secondary_container", new Function() { // from class: fn.s2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52197g;
                return s6Var;
            }
        }, new Function() { // from class: fn.t2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.k((k) obj);
            }
        }, true, new t5(this), null, new e(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: fn.v2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.Z0(u5.this, (k) obj);
            }
        });
    }

    @NonNull
    public j X2() {
        return new j("secondary_fixed", new Function() { // from class: fn.c4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52197g;
                return s6Var;
            }
        }, new Function() { // from class: fn.d4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(u5.s2(r2) ? 80.0d : 90.0d);
                return valueOf;
            }
        }, true, new t5(this), null, new e(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: fn.e4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.e1(u5.this, (k) obj);
            }
        });
    }

    @NonNull
    public j Y2() {
        return new j("secondary_fixed_dim", new Function() { // from class: fn.v4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52197g;
                return s6Var;
            }
        }, new Function() { // from class: fn.w4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(u5.s2(r2) ? 70.0d : 80.0d);
                return valueOf;
            }
        }, true, new t5(this), null, new e(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: fn.y4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.s0(u5.this, (k) obj);
            }
        });
    }

    @NonNull
    public j Z2() {
        return j.f("secondary_palette_key_color", new Function() { // from class: fn.o2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52197g;
                return s6Var;
            }
        }, new Function() { // from class: fn.p2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(((k) obj).f52197g.h().e());
                return valueOf;
            }
        });
    }

    @NonNull
    public j a3() {
        return new j("shadow", new Function() { // from class: fn.f5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52199i;
                return s6Var;
            }
        }, new Function() { // from class: fn.g5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(0.0d);
                return valueOf;
            }
        }, false, null, null, null, null);
    }

    @NonNull
    public j b3() {
        return new j("surface", new Function() { // from class: fn.n
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52199i;
                return s6Var;
            }
        }, new Function() { // from class: fn.j2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(r2.f52194d ? 6.0d : 98.0d);
                return valueOf;
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public j c3() {
        return new j("surface_bright", new Function() { // from class: fn.t3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52199i;
                return s6Var;
            }
        }, new Function() { // from class: fn.u3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(r2.f52194d ? 24.0d : 98.0d);
                return valueOf;
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public j d3() {
        return new j("surface_container", new Function() { // from class: fn.z0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52199i;
                return s6Var;
            }
        }, new Function() { // from class: fn.a1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(r2.f52194d ? 12.0d : 94.0d);
                return valueOf;
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public j e3() {
        return new j("surface_container_high", new Function() { // from class: fn.l3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52199i;
                return s6Var;
            }
        }, new Function() { // from class: fn.m3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(r2.f52194d ? 17.0d : 92.0d);
                return valueOf;
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public j f3() {
        return new j("surface_container_highest", new Function() { // from class: fn.h5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52199i;
                return s6Var;
            }
        }, new Function() { // from class: fn.j5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(r2.f52194d ? 22.0d : 90.0d);
                return valueOf;
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public j g2() {
        return new j(SingleFragmentActivity.f18194n, new Function() { // from class: fn.j3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52199i;
                return s6Var;
            }
        }, new Function() { // from class: fn.k3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(r2.f52194d ? 6.0d : 98.0d);
                return valueOf;
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public j g3() {
        return new j("surface_container_low", new Function() { // from class: fn.q2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52199i;
                return s6Var;
            }
        }, new Function() { // from class: fn.r2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(r2.f52194d ? 10.0d : 96.0d);
                return valueOf;
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public j h2() {
        return j.f("control_activated", new Function() { // from class: fn.f2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52196f;
                return s6Var;
            }
        }, new Function() { // from class: fn.g2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(r2.f52194d ? 30.0d : 90.0d);
                return valueOf;
            }
        });
    }

    @NonNull
    public j h3() {
        return new j("surface_container_lowest", new Function() { // from class: fn.u
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52199i;
                return s6Var;
            }
        }, new Function() { // from class: fn.v
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(r2.f52194d ? 4.0d : 100.0d);
                return valueOf;
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public j i2() {
        return new j("control_highlight", new Function() { // from class: fn.c3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52199i;
                return s6Var;
            }
        }, new Function() { // from class: fn.d3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(r2.f52194d ? 100.0d : 0.0d);
                return valueOf;
            }
        }, false, null, null, null, null, new Function() { // from class: fn.e3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(r2.f52194d ? 0.2d : 0.12d);
                return valueOf;
            }
        });
    }

    @NonNull
    public j i3() {
        return new j("surface_dim", new Function() { // from class: fn.u0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52199i;
                return s6Var;
            }
        }, new Function() { // from class: fn.f1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(r2.f52194d ? 6.0d : 87.0d);
                return valueOf;
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public j j2() {
        return j.f("control_normal", new Function() { // from class: fn.q1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52200j;
                return s6Var;
            }
        }, new Function() { // from class: fn.b2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(r2.f52194d ? 80.0d : 30.0d);
                return valueOf;
            }
        });
    }

    @NonNull
    public j j3() {
        return new j("surface_tint", new Function() { // from class: fn.z
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52196f;
                return s6Var;
            }
        }, new Function() { // from class: fn.a0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(r2.f52194d ? 80.0d : 40.0d);
                return valueOf;
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public j k2() {
        return new j("error", new Function() { // from class: fn.t0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52201k;
                return s6Var;
            }
        }, new Function() { // from class: fn.v0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(r2.f52194d ? 80.0d : 40.0d);
                return valueOf;
            }
        }, true, new t5(this), null, new e(3.0d, 4.5d, 7.0d, 11.0d), new Function() { // from class: fn.w0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.D(u5.this, (k) obj);
            }
        });
    }

    @NonNull
    public j k3() {
        return new j("surface_variant", new Function() { // from class: fn.z4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52200j;
                return s6Var;
            }
        }, new Function() { // from class: fn.a5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(r2.f52194d ? 30.0d : 90.0d);
                return valueOf;
            }
        }, true, null, null, null, null);
    }

    @NonNull
    public j l2() {
        return new j("error_container", new Function() { // from class: fn.l1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52201k;
                return s6Var;
            }
        }, new Function() { // from class: fn.m1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(r2.f52194d ? 30.0d : 90.0d);
                return valueOf;
            }
        }, true, new t5(this), null, new e(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: fn.n1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.o0(u5.this, (k) obj);
            }
        });
    }

    @NonNull
    public j l3() {
        return new j("tertiary", new Function() { // from class: fn.c2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52198h;
                return s6Var;
            }
        }, new Function() { // from class: fn.d2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.D1((k) obj);
            }
        }, true, new t5(this), null, new e(3.0d, 4.5d, 7.0d, 11.0d), new Function() { // from class: fn.e2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.z1(u5.this, (k) obj);
            }
        });
    }

    @NonNull
    public j m3() {
        return new j("tertiary_container", new Function() { // from class: fn.q5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52198h;
                return s6Var;
            }
        }, new Function() { // from class: fn.r5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.h1((k) obj);
            }
        }, true, new t5(this), null, new e(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: fn.s5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.y0(u5.this, (k) obj);
            }
        });
    }

    @NonNull
    public j n2(@NonNull k kVar) {
        return kVar.f52194d ? c3() : i3();
    }

    @NonNull
    public j n3() {
        return new j("tertiary_fixed", new Function() { // from class: fn.o1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52198h;
                return s6Var;
            }
        }, new Function() { // from class: fn.p1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(u5.s2(r2) ? 40.0d : 90.0d);
                return valueOf;
            }
        }, true, new t5(this), null, new e(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: fn.r1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.X1(u5.this, (k) obj);
            }
        });
    }

    @NonNull
    public j o2() {
        return new j("inverse_on_surface", new Function() { // from class: fn.f0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52199i;
                return s6Var;
            }
        }, new Function() { // from class: fn.g0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(r2.f52194d ? 20.0d : 95.0d);
                return valueOf;
            }
        }, false, new Function() { // from class: fn.h0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                j q22;
                q22 = u5.this.q2();
                return q22;
            }
        }, null, new e(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public j o3() {
        return new j("tertiary_fixed_dim", new Function() { // from class: fn.j4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52198h;
                return s6Var;
            }
        }, new Function() { // from class: fn.k4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(u5.s2(r2) ? 30.0d : 80.0d);
                return valueOf;
            }
        }, true, new t5(this), null, new e(1.0d, 1.0d, 3.0d, 7.0d), new Function() { // from class: fn.l4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.v1(u5.this, (k) obj);
            }
        });
    }

    @NonNull
    public j p2() {
        return new j("inverse_primary", new Function() { // from class: fn.y3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52196f;
                return s6Var;
            }
        }, new Function() { // from class: fn.z3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(r2.f52194d ? 40.0d : 80.0d);
                return valueOf;
            }
        }, false, new Function() { // from class: fn.a4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                j q22;
                q22 = u5.this.q2();
                return q22;
            }
        }, null, new e(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    @NonNull
    public j p3() {
        return j.f("tertiary_palette_key_color", new Function() { // from class: fn.a3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52198h;
                return s6Var;
            }
        }, new Function() { // from class: fn.b3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(((k) obj).f52198h.h().e());
                return valueOf;
            }
        });
    }

    @NonNull
    public j q2() {
        return new j("inverse_surface", new Function() { // from class: fn.d1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52199i;
                return s6Var;
            }
        }, new Function() { // from class: fn.e1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(r2.f52194d ? 90.0d : 20.0d);
                return valueOf;
            }
        }, false, null, null, null, null);
    }

    @NonNull
    public j q3() {
        return j.f("text_hint_inverse", new Function() { // from class: fn.d5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52199i;
                return s6Var;
            }
        }, new Function() { // from class: fn.e5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(r2.f52194d ? 10.0d : 90.0d);
                return valueOf;
            }
        });
    }

    @NonNull
    public j r3() {
        return j.f("text_primary_inverse", new Function() { // from class: fn.x0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52199i;
                return s6Var;
            }
        }, new Function() { // from class: fn.y0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(r2.f52194d ? 10.0d : 90.0d);
                return valueOf;
            }
        });
    }

    @NonNull
    public j s3() {
        return j.f("text_primary_inverse_disable_only", new Function() { // from class: fn.q4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52199i;
                return s6Var;
            }
        }, new Function() { // from class: fn.r4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(r2.f52194d ? 10.0d : 90.0d);
                return valueOf;
            }
        });
    }

    @NonNull
    public j t2() {
        return j.f("neutral_palette_key_color", new Function() { // from class: fn.y
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52199i;
                return s6Var;
            }
        }, new Function() { // from class: fn.j0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(((k) obj).f52199i.h().e());
                return valueOf;
            }
        });
    }

    @NonNull
    public j t3() {
        return j.f("text_secondary_and_tertiary_inverse", new Function() { // from class: fn.j1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52200j;
                return s6Var;
            }
        }, new Function() { // from class: fn.k1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(r2.f52194d ? 30.0d : 80.0d);
                return valueOf;
            }
        });
    }

    @NonNull
    public j u2() {
        return j.f("neutral_variant_palette_key_color", new Function() { // from class: fn.b5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52200j;
                return s6Var;
            }
        }, new Function() { // from class: fn.c5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(((k) obj).f52200j.h().e());
                return valueOf;
            }
        });
    }

    @NonNull
    public j u3() {
        return j.f("text_secondary_and_tertiary_inverse_disabled", new Function() { // from class: fn.u2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52199i;
                return s6Var;
            }
        }, new Function() { // from class: fn.f3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(r2.f52194d ? 10.0d : 90.0d);
                return valueOf;
            }
        });
    }

    @NonNull
    public j v2() {
        return new j("on_background", new Function() { // from class: fn.n3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52199i;
                return s6Var;
            }
        }, new Function() { // from class: fn.o3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(r2.f52194d ? 90.0d : 10.0d);
                return valueOf;
            }
        }, false, new Function() { // from class: fn.p3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                j g22;
                g22 = u5.this.g2();
                return g22;
            }
        }, null, new e(3.0d, 3.0d, 4.5d, 7.0d), null);
    }

    @NonNull
    public j w2() {
        return new j("on_error", new Function() { // from class: fn.n4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52201k;
                return s6Var;
            }
        }, new Function() { // from class: fn.o4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(r2.f52194d ? 20.0d : 100.0d);
                return valueOf;
            }
        }, false, new Function() { // from class: fn.p4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                j k22;
                k22 = u5.this.k2();
                return k22;
            }
        }, null, new e(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public j x2() {
        return new j("on_error_container", new Function() { // from class: fn.g1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52201k;
                return s6Var;
            }
        }, new Function() { // from class: fn.h1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                valueOf = Double.valueOf(r2.f52194d ? 90.0d : 10.0d);
                return valueOf;
            }
        }, false, new Function() { // from class: fn.i1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                j l22;
                l22 = u5.this.l2();
                return l22;
            }
        }, null, new e(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public j y2() {
        return new j("on_primary", new Function() { // from class: fn.v3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52196f;
                return s6Var;
            }
        }, new Function() { // from class: fn.w3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.K0((k) obj);
            }
        }, false, new Function() { // from class: fn.x3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                j P2;
                P2 = u5.this.P2();
                return P2;
            }
        }, null, new e(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    @NonNull
    public j z2() {
        return new j("on_primary_container", new Function() { // from class: fn.s4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                s6 s6Var;
                s6Var = ((k) obj).f52196f;
                return s6Var;
            }
        }, new Function() { // from class: fn.t4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u5.A0(u5.this, (k) obj);
            }
        }, false, new Function() { // from class: fn.u4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                j Q2;
                Q2 = u5.this.Q2();
                return Q2;
            }
        }, null, new e(4.5d, 7.0d, 11.0d, 21.0d), null);
    }
}
