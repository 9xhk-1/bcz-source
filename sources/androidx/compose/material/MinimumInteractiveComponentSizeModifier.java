package androidx.compose.material;

import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.DpSize;
import c10.d;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class MinimumInteractiveComponentSizeModifier implements LayoutModifier {
    private final long size;

    public /* synthetic */ MinimumInteractiveComponentSizeModifier(long j11, v vVar) {
        this(j11);
    }

    public boolean equals(@l Object obj) {
        MinimumInteractiveComponentSizeModifier minimumInteractiveComponentSizeModifier = obj instanceof MinimumInteractiveComponentSizeModifier ? (MinimumInteractiveComponentSizeModifier) obj : null;
        if (minimumInteractiveComponentSizeModifier == null) {
            return false;
        }
        return DpSize.m5210equalsimpl0(this.size, minimumInteractiveComponentSizeModifier.size);
    }

    /* renamed from: getSize-MYxV2XQ, reason: not valid java name */
    public final long m1700getSizeMYxV2XQ() {
        return this.size;
    }

    public int hashCode() {
        return DpSize.m5215hashCodeimpl(this.size);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo646measure3p2s80s(@k MeasureScope measureScope, @k Measurable measurable, long j11) {
        final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(j11);
        final int max = Math.max(mo3857measureBRTryo0.getWidth(), measureScope.mo371roundToPx0680j_4(DpSize.m5213getWidthD9Ej5fM(this.size)));
        final int max2 = Math.max(mo3857measureBRTryo0.getHeight(), measureScope.mo371roundToPx0680j_4(DpSize.m5211getHeightD9Ej5fM(this.size)));
        return MeasureScope.layout$default(measureScope, max, max2, null, new x00.l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.material.MinimumInteractiveComponentSizeModifier$measure$1
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
                Placeable.PlacementScope.place$default(placementScope, mo3857measureBRTryo0, d.L0((max - mo3857measureBRTryo0.getWidth()) / 2.0f), d.L0((max2 - mo3857measureBRTryo0.getHeight()) / 2.0f), 0.0f, 4, null);
            }
        }, 4, null);
    }

    private MinimumInteractiveComponentSizeModifier(long j11) {
        this.size = j11;
    }
}
