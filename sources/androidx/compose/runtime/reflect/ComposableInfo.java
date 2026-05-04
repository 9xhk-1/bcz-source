package androidx.compose.runtime.reflect;

import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class ComposableInfo {
    public static final int $stable = 0;
    private final int changedParams;
    private final int defaultParams;
    private final boolean isComposable;
    private final int realParamsCount;

    public ComposableInfo(boolean z11, int i11, int i12, int i13) {
        this.isComposable = z11;
        this.realParamsCount = i11;
        this.changedParams = i12;
        this.defaultParams = i13;
    }

    public static /* synthetic */ ComposableInfo copy$default(ComposableInfo composableInfo, boolean z11, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            z11 = composableInfo.isComposable;
        }
        if ((i14 & 2) != 0) {
            i11 = composableInfo.realParamsCount;
        }
        if ((i14 & 4) != 0) {
            i12 = composableInfo.changedParams;
        }
        if ((i14 & 8) != 0) {
            i13 = composableInfo.defaultParams;
        }
        return composableInfo.copy(z11, i11, i12, i13);
    }

    public final boolean component1() {
        return this.isComposable;
    }

    public final int component2() {
        return this.realParamsCount;
    }

    public final int component3() {
        return this.changedParams;
    }

    public final int component4() {
        return this.defaultParams;
    }

    @k
    public final ComposableInfo copy(boolean z11, int i11, int i12, int i13) {
        return new ComposableInfo(z11, i11, i12, i13);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposableInfo)) {
            return false;
        }
        ComposableInfo composableInfo = (ComposableInfo) obj;
        return this.isComposable == composableInfo.isComposable && this.realParamsCount == composableInfo.realParamsCount && this.changedParams == composableInfo.changedParams && this.defaultParams == composableInfo.defaultParams;
    }

    public final int getChangedParams() {
        return this.changedParams;
    }

    public final int getDefaultParams() {
        return this.defaultParams;
    }

    public final int getRealParamsCount() {
        return this.realParamsCount;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.isComposable) * 31) + Integer.hashCode(this.realParamsCount)) * 31) + Integer.hashCode(this.changedParams)) * 31) + Integer.hashCode(this.defaultParams);
    }

    public final boolean isComposable() {
        return this.isComposable;
    }

    @k
    public String toString() {
        return "ComposableInfo(isComposable=" + this.isComposable + ", realParamsCount=" + this.realParamsCount + ", changedParams=" + this.changedParams + ", defaultParams=" + this.defaultParams + ')';
    }
}
