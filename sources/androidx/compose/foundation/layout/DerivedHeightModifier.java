package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@u0({"SMAP\nWindowInsetsSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/DerivedHeightModifier\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,220:1\n85#2:221\n113#2,2:222\n1#3:224\n*S KotlinDebug\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/DerivedHeightModifier\n*L\n189#1:221\n189#1:222,2\n*E\n"})
/* loaded from: classes.dex */
final class DerivedHeightModifier extends InspectorValueInfo implements LayoutModifier, ModifierLocalConsumer {

    @m80.k
    private final p<WindowInsets, Density, Integer> heightCalc;

    @m80.k
    private final WindowInsets insets;

    @m80.k
    private final MutableState unconsumedInsets$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public DerivedHeightModifier(@m80.k WindowInsets windowInsets, @m80.k l<? super InspectorInfo, g2> lVar, @m80.k p<? super WindowInsets, ? super Density, Integer> pVar) {
        super(lVar);
        this.insets = windowInsets;
        this.heightCalc = pVar;
        this.unconsumedInsets$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(windowInsets, null, 2, null);
    }

    private final WindowInsets getUnconsumedInsets() {
        return (WindowInsets) this.unconsumedInsets$delegate.getValue();
    }

    private final void setUnconsumedInsets(WindowInsets windowInsets) {
        this.unconsumedInsets$delegate.setValue(windowInsets);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DerivedHeightModifier)) {
            return false;
        }
        DerivedHeightModifier derivedHeightModifier = (DerivedHeightModifier) obj;
        return g0.g(this.insets, derivedHeightModifier.insets) && this.heightCalc == derivedHeightModifier.heightCalc;
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + this.heightCalc.hashCode();
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @m80.k
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    public MeasureResult mo646measure3p2s80s(@m80.k MeasureScope measureScope, @m80.k Measurable measurable, long j11) {
        int intValue = this.heightCalc.invoke(getUnconsumedInsets(), measureScope).intValue();
        if (intValue == 0) {
            return MeasureScope.layout$default(measureScope, 0, 0, null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.layout.DerivedHeightModifier$measure$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return g2.f100423a;
                }
            }, 4, null);
        }
        final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(Constraints.m5058copyZbe2FdA$default(j11, 0, 0, intValue, intValue, 3, null));
        return MeasureScope.layout$default(measureScope, mo3857measureBRTryo0.getWidth(), intValue, null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.layout.DerivedHeightModifier$measure$2
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
                Placeable.PlacementScope.placeRelative$default(placementScope, Placeable.this, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(@m80.k ModifierLocalReadScope modifierLocalReadScope) {
        setUnconsumedInsets(WindowInsetsKt.exclude(this.insets, (WindowInsets) modifierLocalReadScope.getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets())));
    }
}
