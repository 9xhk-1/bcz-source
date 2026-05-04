package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class DimensionDescription implements Dimension.Coercible, Dimension.MinCoercible, Dimension.MaxCoercible, Dimension {
    public static final int $stable = 8;

    @k
    private final DimensionSymbol max;

    @k
    private final DimensionSymbol min;

    @k
    private final DimensionSymbol valueSymbol;

    public /* synthetic */ DimensionDescription(float f11, v vVar) {
        this(f11);
    }

    @k
    public final CLElement asCLElement$constraintlayout_compose_release() {
        if (this.min.isUndefined() && this.max.isUndefined()) {
            return this.valueSymbol.asCLElement();
        }
        CLObject cLObject = new CLObject(new char[0]);
        if (!this.min.isUndefined()) {
            cLObject.put("min", this.min.asCLElement());
        }
        if (!this.max.isUndefined()) {
            cLObject.put("max", this.max.asCLElement());
        }
        cLObject.put("value", this.valueSymbol.asCLElement());
        return cLObject;
    }

    @k
    public final DimensionSymbol getMax$constraintlayout_compose_release() {
        return this.max;
    }

    @k
    public final DimensionSymbol getMin$constraintlayout_compose_release() {
        return this.min;
    }

    private DimensionDescription(Dp dp2, String str) {
        this.valueSymbol = new DimensionSymbol(dp2, str, TtmlNode.RUBY_BASE, null);
        this.min = new DimensionSymbol(null, null, "min", null);
        this.max = new DimensionSymbol(null, null, "max", null);
    }

    private DimensionDescription(float f11) {
        this(Dp.m5113boximpl(f11), (String) null);
    }

    public DimensionDescription(@k String str) {
        this((Dp) null, str);
    }
}
