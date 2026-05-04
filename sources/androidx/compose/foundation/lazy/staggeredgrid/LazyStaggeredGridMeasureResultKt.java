package androidx.compose.foundation.lazy.staggeredgrid;

import a00.h0;
import a00.l1;
import a00.r0;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntSize;
import c40.s0;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazyStaggeredGridMeasureResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasureResult.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResultKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,297:1\n133#2,3:298\n34#2,4:301\n39#2:309\n136#2:310\n59#3:305\n54#3:307\n59#3:311\n54#3:313\n90#4:306\n85#4:308\n90#4:312\n85#4:314\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasureResult.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResultKt\n*L\n280#1:298,3\n280#1:301,4\n280#1:309\n280#1:310\n282#1:305\n284#1:307\n293#1:311\n295#1:313\n282#1:306\n284#1:308\n293#1:312\n295#1:314\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureResultKt {

    @k
    private static final int[] EmptyArray;

    @k
    private static final LazyStaggeredGridMeasureResult EmptyLazyStaggeredGridLayoutInfo;

    static {
        int[] iArr = new int[0];
        EmptyArray = iArr;
        EmptyLazyStaggeredGridLayoutInfo = new LazyStaggeredGridMeasureResult(iArr, iArr, 0.0f, new MeasureResult() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResultKt$EmptyLazyStaggeredGridLayoutInfo$1
            private final Map<AlignmentLine, Integer> alignmentLines = l1.z();
            private final int height;
            private final int width;

            @Override // androidx.compose.ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return this.alignmentLines;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return this.width;
            }

            public static /* synthetic */ void getAlignmentLines$annotations() {
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
            }
        }, 0.0f, false, false, false, new LazyStaggeredGridSlots(iArr, iArr), new LazyStaggeredGridSpanProvider(new MutableIntervalList()), DensityKt.Density$default(1.0f, 0.0f, 2, null), 0, h0.J(), IntSize.Companion.m5291getZeroYbymL2g(), 0, 0, 0, 0, 0, s0.a(EmptyCoroutineContext.INSTANCE), null);
    }

    @l
    public static final LazyStaggeredGridItemInfo findVisibleItem(@k LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, final int i11) {
        if (lazyStaggeredGridLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            return null;
        }
        int index = ((LazyStaggeredGridItemInfo) r0.G2(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo())).getIndex();
        if (i11 > ((LazyStaggeredGridItemInfo) r0.u3(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo())).getIndex() || index > i11) {
            return null;
        }
        return (LazyStaggeredGridItemInfo) r0.b3(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo(), h0.z(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo(), 0, 0, new x00.l<LazyStaggeredGridItemInfo, Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResultKt$findVisibleItem$index$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public final Integer invoke(LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo) {
                return Integer.valueOf(lazyStaggeredGridItemInfo.getIndex() - i11);
            }
        }, 3, null));
    }

    @k
    public static final LazyStaggeredGridMeasureResult getEmptyLazyStaggeredGridLayoutInfo() {
        return EmptyLazyStaggeredGridLayoutInfo;
    }

    public static final int getSingleAxisViewportSize(@k LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo) {
        return (int) (lazyStaggeredGridLayoutInfo.getOrientation() == Orientation.Vertical ? lazyStaggeredGridLayoutInfo.mo935getViewportSizeYbymL2g() & 4294967295L : lazyStaggeredGridLayoutInfo.mo935getViewportSizeYbymL2g() >> 32);
    }

    public static final int visibleItemsAverageSize(@k LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo) {
        List<LazyStaggeredGridItemInfo> visibleItemsInfo = lazyStaggeredGridLayoutInfo.getVisibleItemsInfo();
        if (visibleItemsInfo.isEmpty()) {
            return 0;
        }
        int size = visibleItemsInfo.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo = visibleItemsInfo.get(i12);
            i11 += (int) (lazyStaggeredGridLayoutInfo.getOrientation() == Orientation.Vertical ? lazyStaggeredGridItemInfo.mo933getSizeYbymL2g() & 4294967295L : lazyStaggeredGridItemInfo.mo933getSizeYbymL2g() >> 32);
        }
        return (i11 / visibleItemsInfo.size()) + lazyStaggeredGridLayoutInfo.getMainAxisItemSpacing();
    }
}
