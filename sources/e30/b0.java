package e30;

import java.util.HashMap;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class b0 {
    public static /* synthetic */ void a(int i11) {
        String str = i11 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i11 != 4 ? 3 : 2];
        switch (i11) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i11 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i11 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String format = String.format(str, objArr);
        if (i11 == 4) {
            throw new IllegalStateException(format);
        }
    }

    @m80.k
    public static f2 b(@m80.k List<p10.c1> list, @m80.k d2 d2Var, @m80.k p10.h hVar, @m80.k List<p10.c1> list2) {
        if (list == null) {
            a(0);
        }
        if (d2Var == null) {
            a(1);
        }
        if (hVar == null) {
            a(2);
        }
        if (list2 == null) {
            a(3);
        }
        f2 c11 = c(list, d2Var, hVar, list2, null);
        if (c11 != null) {
            return c11;
        }
        throw new AssertionError("Substitution failed");
    }

    @m80.l
    public static f2 c(@m80.k List<p10.c1> list, @m80.k d2 d2Var, @m80.k p10.h hVar, @m80.k List<p10.c1> list2, @m80.l boolean[] zArr) {
        if (list == null) {
            a(5);
        }
        if (d2Var == null) {
            a(6);
        }
        if (hVar == null) {
            a(7);
        }
        if (list2 == null) {
            a(8);
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        int i11 = 0;
        for (p10.c1 c1Var : list) {
            s10.t0 K0 = s10.t0.K0(hVar, c1Var.getAnnotations(), c1Var.h(), c1Var.j(), c1Var.getName(), i11, p10.x0.f78622a, c1Var.e0());
            hashMap.put(c1Var.o(), new c2(K0.s()));
            hashMap2.put(c1Var, K0);
            list2.add(K0);
            i11++;
        }
        v1 j11 = v1.j(hashMap);
        f2 h11 = f2.h(d2Var, j11);
        f2 h12 = f2.h(d2Var.h(), j11);
        for (p10.c1 c1Var2 : list) {
            s10.t0 t0Var = (s10.t0) hashMap2.get(c1Var2);
            for (r0 r0Var : c1Var2.getUpperBounds()) {
                p10.d r11 = r0Var.I0().r();
                r0 p11 = (((r11 instanceof p10.c1) && j30.e.q((p10.c1) r11)) ? h11 : h12).p(r0Var, Variance.OUT_VARIANCE);
                if (p11 == null) {
                    return null;
                }
                if (p11 != r0Var && zArr != null) {
                    zArr[0] = true;
                }
                t0Var.H0(p11);
            }
            t0Var.Q0();
        }
        return h11;
    }
}
