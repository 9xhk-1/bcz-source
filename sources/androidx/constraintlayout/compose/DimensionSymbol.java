package androidx.constraintlayout.compose;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLString;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class DimensionSymbol {
    public static final int $stable = 8;

    @k
    private final String debugName;

    @l
    private String symbol;

    @l
    private Dp value;

    public /* synthetic */ DimensionSymbol(Dp dp2, String str, String str2, v vVar) {
        this(dp2, str, str2);
    }

    @k
    public final CLElement asCLElement() {
        Dp dp2 = this.value;
        if (dp2 != null) {
            return new CLNumber(dp2.m5129unboximpl());
        }
        String str = this.symbol;
        if (str != null) {
            return CLString.from(str);
        }
        Log.e("CCL", "DimensionDescription: Null value & symbol for " + this.debugName + ". Using WrapContent.");
        return CLString.from("wrap");
    }

    public final boolean isUndefined() {
        return this.value == null && this.symbol == null;
    }

    public final void update(@k String str) {
        this.value = null;
        this.symbol = str;
    }

    /* renamed from: update-0680j_4, reason: not valid java name */
    public final void m5474update0680j_4(float f11) {
        this.value = Dp.m5113boximpl(f11);
        this.symbol = null;
    }

    private DimensionSymbol(Dp dp2, String str, String str2) {
        this.value = dp2;
        this.symbol = str;
        this.debugName = str2;
    }
}
