package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@ExperimentalMotionApi
/* loaded from: classes2.dex */
public final class CurveFit implements NamedPropertyOrValue {
    public static final int $stable = 0;

    @k
    private final String name;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final CurveFit Spline = new CurveFit("spline");

    @k
    private static final CurveFit Linear = new CurveFit("linear");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final CurveFit getLinear() {
            return CurveFit.Linear;
        }

        @k
        public final CurveFit getSpline() {
            return CurveFit.Spline;
        }

        private Companion() {
        }
    }

    public CurveFit(@k String str) {
        this.name = str;
    }

    @Override // androidx.constraintlayout.compose.NamedPropertyOrValue
    @k
    public String getName() {
        return this.name;
    }
}
