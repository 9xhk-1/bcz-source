package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBasicText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/TextMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Rect.kt\nandroidx/compose/ui/geometry/Rect\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,701:1\n230#2,3:702\n34#2,6:705\n233#2:711\n303#2,3:712\n70#2,4:715\n75#2:725\n306#2:726\n230#2,3:727\n34#2,6:730\n233#2:736\n56#3:719\n61#3:720\n26#4:721\n32#5:722\n80#6:723\n1#7:724\n*S KotlinDebug\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/TextMeasurePolicy\n*L\n474#1:702,3\n474#1:705,6\n474#1:711\n476#1:712,3\n476#1:715,4\n476#1:725\n476#1:726\n493#1:727,3\n493#1:730,6\n493#1:736\n483#1:719\n484#1:720\n487#1:721\n487#1:722\n487#1:723\n476#1:724\n*E\n"})
/* loaded from: classes.dex */
final class TextMeasurePolicy implements MeasurePolicy {

    @k
    private final x00.a<List<Rect>> placements;

    @k
    private final x00.a<Boolean> shouldMeasureLinks;

    /* JADX WARN: Multi-variable type inference failed */
    public TextMeasurePolicy(@k x00.a<Boolean> aVar, @k x00.a<? extends List<Rect>> aVar2) {
        this.shouldMeasureLinks = aVar;
        this.placements = aVar2;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(@k MeasureScope measureScope, @k List<? extends Measurable> list, long j11) {
        final ArrayList arrayList;
        final List measureWithTextRangeMeasureConstraints;
        ArrayList arrayList2 = new ArrayList(list.size());
        List<? extends Measurable> list2 = list;
        int size = list2.size();
        for (int i11 = 0; i11 < size; i11++) {
            Measurable measurable = list.get(i11);
            if (!(measurable.getParentData() instanceof TextRangeLayoutModifier)) {
                arrayList2.add(measurable);
            }
        }
        List<Rect> invoke = this.placements.invoke();
        if (invoke != null) {
            ArrayList arrayList3 = new ArrayList(invoke.size());
            int size2 = invoke.size();
            for (int i12 = 0; i12 < size2; i12++) {
                Rect rect = invoke.get(i12);
                Pair pair = rect != null ? new Pair(((Measurable) arrayList2.get(i12)).mo3857measureBRTryo0(ConstraintsKt.Constraints$default(0, (int) Math.floor(rect.getRight() - rect.getLeft()), 0, (int) Math.floor(rect.getBottom() - rect.getTop()), 5, null)), IntOffset.m5234boximpl(IntOffset.m5237constructorimpl((Math.round(rect.getTop()) & 4294967295L) | (Math.round(rect.getLeft()) << 32)))) : null;
                if (pair != null) {
                    arrayList3.add(pair);
                }
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        int size3 = list2.size();
        for (int i13 = 0; i13 < size3; i13++) {
            Measurable measurable2 = list.get(i13);
            if (measurable2.getParentData() instanceof TextRangeLayoutModifier) {
                arrayList4.add(measurable2);
            }
        }
        measureWithTextRangeMeasureConstraints = BasicTextKt.measureWithTextRangeMeasureConstraints(arrayList4, this.shouldMeasureLinks);
        return MeasureScope.layout$default(measureScope, Constraints.m5068getMaxWidthimpl(j11), Constraints.m5067getMaxHeightimpl(j11), null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.text.TextMeasurePolicy$measure$1
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
                List<Pair<Placeable, IntOffset>> list3 = arrayList;
                if (list3 != null) {
                    int size4 = list3.size();
                    for (int i14 = 0; i14 < size4; i14++) {
                        Pair<Placeable, IntOffset> pair2 = list3.get(i14);
                        Placeable.PlacementScope.m3921place70tqf50$default(placementScope, pair2.component1(), pair2.component2().m5252unboximpl(), 0.0f, 2, null);
                    }
                }
                List<Pair<Placeable, x00.a<IntOffset>>> list4 = measureWithTextRangeMeasureConstraints;
                if (list4 != null) {
                    int size5 = list4.size();
                    for (int i15 = 0; i15 < size5; i15++) {
                        Pair<Placeable, x00.a<IntOffset>> pair3 = list4.get(i15);
                        Placeable component1 = pair3.component1();
                        x00.a<IntOffset> component2 = pair3.component2();
                        Placeable.PlacementScope.m3921place70tqf50$default(placementScope, component1, component2 != null ? component2.invoke().m5252unboximpl() : IntOffset.Companion.m5254getZeronOccac(), 0.0f, 2, null);
                    }
                }
            }
        }, 4, null);
    }
}
