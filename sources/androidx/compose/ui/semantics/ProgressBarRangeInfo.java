package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import g10.f;
import g10.t;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/ProgressBarRangeInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1523:1\n1#2:1524\n*E\n"})
/* loaded from: classes2.dex */
public final class ProgressBarRangeInfo {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final ProgressBarRangeInfo Indeterminate = new ProgressBarRangeInfo(0.0f, t.e(0.0f, 0.0f), 0, 4, null);
    private final float current;

    @k
    private final f<Float> range;
    private final int steps;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final ProgressBarRangeInfo getIndeterminate() {
            return ProgressBarRangeInfo.Indeterminate;
        }

        private Companion() {
        }
    }

    public ProgressBarRangeInfo(float f11, @k f<Float> fVar, int i11) {
        this.current = f11;
        this.range = fVar;
        this.steps = i11;
        if (Float.isNaN(f11)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressBarRangeInfo)) {
            return false;
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) obj;
        return this.current == progressBarRangeInfo.current && g0.g(this.range, progressBarRangeInfo.range) && this.steps == progressBarRangeInfo.steps;
    }

    public final float getCurrent() {
        return this.current;
    }

    @k
    public final f<Float> getRange() {
        return this.range;
    }

    public final int getSteps() {
        return this.steps;
    }

    public int hashCode() {
        return (((Float.hashCode(this.current) * 31) + this.range.hashCode()) * 31) + this.steps;
    }

    @k
    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.current + ", range=" + this.range + ", steps=" + this.steps + ')';
    }

    public /* synthetic */ ProgressBarRangeInfo(float f11, f fVar, int i11, int i12, v vVar) {
        this(f11, fVar, (i12 & 4) != 0 ? 0 : i11);
    }
}
