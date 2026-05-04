package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nRootMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RootMeasurePolicy.kt\nandroidx/compose/ui/layout/RootMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,65:1\n150#2,3:66\n34#2,6:69\n153#2:75\n*S KotlinDebug\n*F\n+ 1 RootMeasurePolicy.kt\nandroidx/compose/ui/layout/RootMeasurePolicy\n*L\n49#1:66,3\n49#1:69,6\n49#1:75\n*E\n"})
/* loaded from: classes.dex */
public final class RootMeasurePolicy extends LayoutNode.NoIntrinsicsMeasurePolicy {
    public static final int $stable = 0;

    @k
    public static final RootMeasurePolicy INSTANCE = new RootMeasurePolicy();

    private RootMeasurePolicy() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(@k MeasureScope measureScope, @k List<? extends Measurable> list, long j11) {
        int size = list.size();
        if (size == 0) {
            return MeasureScope.layout$default(measureScope, Constraints.m5070getMinWidthimpl(j11), Constraints.m5069getMinHeightimpl(j11), null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$1
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
        if (size == 1) {
            final Placeable mo3857measureBRTryo0 = list.get(0).mo3857measureBRTryo0(j11);
            return MeasureScope.layout$default(measureScope, ConstraintsKt.m5085constrainWidthK40F9xA(j11, mo3857measureBRTryo0.getWidth()), ConstraintsKt.m5084constrainHeightK40F9xA(j11, mo3857measureBRTryo0.getHeight()), null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$2
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
                    Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, Placeable.this, 0, 0, 0.0f, (l) null, 12, (Object) null);
                }
            }, 4, null);
        }
        final ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size2; i13++) {
            Placeable mo3857measureBRTryo02 = list.get(i13).mo3857measureBRTryo0(j11);
            i11 = Math.max(mo3857measureBRTryo02.getWidth(), i11);
            i12 = Math.max(mo3857measureBRTryo02.getHeight(), i12);
            arrayList.add(mo3857measureBRTryo02);
        }
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m5085constrainWidthK40F9xA(j11, i11), ConstraintsKt.m5084constrainHeightK40F9xA(j11, i12), null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                List<Placeable> list2 = arrayList;
                int size3 = list2.size();
                for (int i14 = 0; i14 < size3; i14++) {
                    Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, list2.get(i14), 0, 0, 0.0f, (l) null, 12, (Object) null);
                }
            }
        }, 4, null);
    }
}
