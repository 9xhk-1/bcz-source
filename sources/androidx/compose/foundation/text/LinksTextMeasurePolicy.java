package androidx.compose.foundation.text;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import java.util.List;
import kotlin.Pair;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class LinksTextMeasurePolicy implements MeasurePolicy {

    @k
    private final x00.a<Boolean> shouldMeasureLinks;

    public LinksTextMeasurePolicy(@k x00.a<Boolean> aVar) {
        this.shouldMeasureLinks = aVar;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(@k MeasureScope measureScope, @k final List<? extends Measurable> list, long j11) {
        return MeasureScope.layout$default(measureScope, Constraints.m5068getMaxWidthimpl(j11), Constraints.m5067getMaxHeightimpl(j11), null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.text.LinksTextMeasurePolicy$measure$1
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
                x00.a aVar;
                List measureWithTextRangeMeasureConstraints;
                List<Measurable> list2 = list;
                aVar = this.shouldMeasureLinks;
                measureWithTextRangeMeasureConstraints = BasicTextKt.measureWithTextRangeMeasureConstraints(list2, aVar);
                if (measureWithTextRangeMeasureConstraints != null) {
                    int size = measureWithTextRangeMeasureConstraints.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        Pair pair = (Pair) measureWithTextRangeMeasureConstraints.get(i11);
                        Placeable placeable = (Placeable) pair.component1();
                        x00.a aVar2 = (x00.a) pair.component2();
                        Placeable.PlacementScope.m3921place70tqf50$default(placementScope, placeable, aVar2 != null ? ((IntOffset) aVar2.invoke()).m5252unboximpl() : IntOffset.Companion.m5254getZeronOccac(), 0.0f, 2, null);
                    }
                }
            }
        }, 4, null);
    }
}
