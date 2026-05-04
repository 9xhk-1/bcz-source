package t30;

import kotlin.jvm.internal.u0;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\nkotlin/test/UtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n1#2:53\n*E\n"})
/* loaded from: classes8.dex */
public final class i0 {
    public static final void c(double d11) {
        if (d11 < 0.0d) {
            throw new IllegalArgumentException(("Illegal negative absolute tolerance <" + d11 + ">.").toString());
        }
        if (Double.isNaN(d11)) {
            throw new IllegalArgumentException(("Illegal NaN absolute tolerance <" + d11 + ">.").toString());
        }
    }

    public static final void d(final double d11, final double d12, final double d13, @m80.l final String str, boolean z11) {
        c(d13);
        l.v1().i(new x00.a() { // from class: t30.g0
            @Override // x00.a
            public final Object invoke() {
                String f11;
                f11 = i0.f(str, d11, d13, d12);
                return f11;
            }
        }, ((Double.doubleToLongBits(d11) > Double.doubleToLongBits(d12) ? 1 : (Double.doubleToLongBits(d11) == Double.doubleToLongBits(d12) ? 0 : -1)) == 0 || (Math.abs(d11 - d12) > d13 ? 1 : (Math.abs(d11 - d12) == d13 ? 0 : -1)) <= 0) != z11);
    }

    public static final String f(String str, double d11, double d12, double d13) {
        return j(str) + "Expected <" + d11 + "> with absolute tolerance <" + d12 + ">, actual <" + d13 + ">.";
    }

    public static final void g(final float f11, final float f12, final float f13, @m80.l final String str, boolean z11) {
        c(f13);
        l.v1().i(new x00.a() { // from class: t30.h0
            @Override // x00.a
            public final Object invoke() {
                String i11;
                i11 = i0.i(str, f11, f13, f12);
                return i11;
            }
        }, (Float.floatToIntBits(f11) == Float.floatToIntBits(f12) || (Math.abs(f11 - f12) > f13 ? 1 : (Math.abs(f11 - f12) == f13 ? 0 : -1)) <= 0) != z11);
    }

    public static /* synthetic */ void h(float f11, float f12, float f13, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            z11 = false;
        }
        g(f11, f12, f13, str, z11);
    }

    public static final String i(String str, float f11, float f12, float f13) {
        return j(str) + "Expected <" + f11 + "> with absolute tolerance <" + f12 + ">, actual <" + f13 + ">.";
    }

    @m80.k
    public static final String j(@m80.l String str) {
        if (str == null) {
            return "";
        }
        return str + ". ";
    }

    @m80.l
    @v0
    public static final i k(@m80.l i iVar) {
        i w12 = l.w1();
        l.x1(iVar);
        return w12;
    }
}
