package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.g0;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
final class PaddingValuesConsumingModifier extends InsetsConsumingModifier {

    @m80.k
    private final PaddingValues paddingValues;

    public PaddingValuesConsumingModifier(@m80.k PaddingValues paddingValues) {
        super(null);
        this.paddingValues = paddingValues;
    }

    @Override // androidx.compose.foundation.layout.InsetsConsumingModifier
    @m80.k
    public WindowInsets calculateInsets(@m80.k WindowInsets windowInsets) {
        return WindowInsetsKt.add(WindowInsetsKt.asInsets(this.paddingValues), windowInsets);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaddingValuesConsumingModifier) {
            return g0.g(((PaddingValuesConsumingModifier) obj).paddingValues, this.paddingValues);
        }
        return false;
    }

    public int hashCode() {
        return this.paddingValues.hashCode();
    }
}
