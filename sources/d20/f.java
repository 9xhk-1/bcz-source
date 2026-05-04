package d20;

import e30.a2;
import e30.c2;
import e30.f0;
import e30.g0;
import e30.h2;
import e30.r0;
import e30.z1;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import m80.k;
import p10.c1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f extends f0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47078a;

        static {
            int[] iArr = new int[JavaTypeFlexibility.values().length];
            try {
                iArr[JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JavaTypeFlexibility.INFLEXIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f47078a = iArr;
        }
    }

    @Override // e30.f0
    @k
    public a2 a(@k c1 parameter, @k g0 typeAttr, @k z1 typeParameterUpperBoundEraser, @k r0 erasedUpperBound) {
        kotlin.jvm.internal.g0.p(parameter, "parameter");
        kotlin.jvm.internal.g0.p(typeAttr, "typeAttr");
        kotlin.jvm.internal.g0.p(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        kotlin.jvm.internal.g0.p(erasedUpperBound, "erasedUpperBound");
        if (!(typeAttr instanceof d20.a)) {
            return super.a(parameter, typeAttr, typeParameterUpperBoundEraser, erasedUpperBound);
        }
        d20.a aVar = (d20.a) typeAttr;
        if (!aVar.i()) {
            aVar = aVar.l(JavaTypeFlexibility.INFLEXIBLE);
        }
        int i11 = a.f47078a[aVar.g().ordinal()];
        if (i11 == 1) {
            return new c2(Variance.INVARIANT, erasedUpperBound);
        }
        if (i11 != 2 && i11 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (!parameter.j().getAllowsOutPosition()) {
            return new c2(Variance.INVARIANT, u20.e.m(parameter).H());
        }
        List<c1> parameters = erasedUpperBound.I0().getParameters();
        kotlin.jvm.internal.g0.o(parameters, "getParameters(...)");
        if (!parameters.isEmpty()) {
            return new c2(Variance.OUT_VARIANCE, erasedUpperBound);
        }
        a2 t11 = h2.t(parameter, aVar);
        kotlin.jvm.internal.g0.m(t11);
        return t11;
    }
}
