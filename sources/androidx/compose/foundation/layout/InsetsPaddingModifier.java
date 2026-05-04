package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/InsetsPaddingModifier\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,623:1\n85#2:624\n113#2,2:625\n85#2:627\n113#2,2:628\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/InsetsPaddingModifier\n*L\n371#1:624\n371#1:625,2\n372#1:627\n372#1:628,2\n*E\n"})
/* loaded from: classes.dex */
public final class InsetsPaddingModifier implements LayoutModifier, ModifierLocalConsumer, ModifierLocalProvider<WindowInsets> {
    public static final int $stable = 0;

    @m80.k
    private final MutableState consumedInsets$delegate;

    @m80.k
    private final WindowInsets insets;

    @m80.k
    private final MutableState unconsumedInsets$delegate;

    public InsetsPaddingModifier(@m80.k WindowInsets windowInsets) {
        this.insets = windowInsets;
        this.unconsumedInsets$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(windowInsets, null, 2, null);
        this.consumedInsets$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(windowInsets, null, 2, null);
    }

    private final WindowInsets getConsumedInsets() {
        return (WindowInsets) this.consumedInsets$delegate.getValue();
    }

    private final WindowInsets getUnconsumedInsets() {
        return (WindowInsets) this.unconsumedInsets$delegate.getValue();
    }

    private final void setConsumedInsets(WindowInsets windowInsets) {
        this.consumedInsets$delegate.setValue(windowInsets);
    }

    private final void setUnconsumedInsets(WindowInsets windowInsets) {
        this.unconsumedInsets$delegate.setValue(windowInsets);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InsetsPaddingModifier) {
            return g0.g(((InsetsPaddingModifier) obj).insets, this.insets);
        }
        return false;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    @m80.k
    public ProvidableModifierLocal<WindowInsets> getKey() {
        return WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets();
    }

    public int hashCode() {
        return this.insets.hashCode();
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @m80.k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo646measure3p2s80s(@m80.k MeasureScope measureScope, @m80.k Measurable measurable, long j11) {
        final int left = getUnconsumedInsets().getLeft(measureScope, measureScope.getLayoutDirection());
        final int top = getUnconsumedInsets().getTop(measureScope);
        int right = getUnconsumedInsets().getRight(measureScope, measureScope.getLayoutDirection()) + left;
        int bottom = getUnconsumedInsets().getBottom(measureScope) + top;
        final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(ConstraintsKt.m5087offsetNN6EwU(j11, -right, -bottom));
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m5085constrainWidthK40F9xA(j11, mo3857measureBRTryo0.getWidth() + right), ConstraintsKt.m5084constrainHeightK40F9xA(j11, mo3857measureBRTryo0.getHeight() + bottom), null, new x00.l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.layout.InsetsPaddingModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.place$default(placementScope, Placeable.this, left, top, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(@m80.k ModifierLocalReadScope modifierLocalReadScope) {
        WindowInsets windowInsets = (WindowInsets) modifierLocalReadScope.getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets());
        setUnconsumedInsets(WindowInsetsKt.exclude(this.insets, windowInsets));
        setConsumedInsets(WindowInsetsKt.union(windowInsets, this.insets));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    @m80.k
    public WindowInsets getValue() {
        return getConsumedInsets();
    }
}
