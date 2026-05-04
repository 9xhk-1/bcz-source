package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.v;
import m80.k;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class ScrollAxisRange {
    public static final int $stable = 0;

    @k
    private final a<Float> maxValue;
    private final boolean reverseScrolling;

    @k
    private final a<Float> value;

    public ScrollAxisRange(@k a<Float> aVar, @k a<Float> aVar2, boolean z11) {
        this.value = aVar;
        this.maxValue = aVar2;
        this.reverseScrolling = z11;
    }

    @k
    public final a<Float> getMaxValue() {
        return this.maxValue;
    }

    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    @k
    public final a<Float> getValue() {
        return this.value;
    }

    @k
    public String toString() {
        return "ScrollAxisRange(value=" + this.value.invoke().floatValue() + ", maxValue=" + this.maxValue.invoke().floatValue() + ", reverseScrolling=" + this.reverseScrolling + ')';
    }

    public /* synthetic */ ScrollAxisRange(a aVar, a aVar2, boolean z11, int i11, v vVar) {
        this(aVar, aVar2, (i11 & 4) != 0 ? false : z11);
    }
}
