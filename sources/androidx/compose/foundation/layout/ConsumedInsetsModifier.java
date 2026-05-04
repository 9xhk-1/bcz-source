package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import kotlin.jvm.internal.g0;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
final class ConsumedInsetsModifier implements ModifierLocalConsumer {

    @m80.k
    private final l<WindowInsets, g2> block;

    @m80.l
    private WindowInsets oldWindowInsets;

    /* JADX WARN: Multi-variable type inference failed */
    public ConsumedInsetsModifier(@m80.k l<? super WindowInsets, g2> lVar) {
        this.block = lVar;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ConsumedInsetsModifier) && ((ConsumedInsetsModifier) obj).block == this.block;
    }

    public int hashCode() {
        return this.block.hashCode();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(@m80.k ModifierLocalReadScope modifierLocalReadScope) {
        WindowInsets windowInsets = (WindowInsets) modifierLocalReadScope.getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets());
        if (g0.g(windowInsets, this.oldWindowInsets)) {
            return;
        }
        this.oldWindowInsets = windowInsets;
        this.block.invoke(windowInsets);
    }
}
