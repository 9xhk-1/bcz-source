package androidx.compose.foundation.text.selection;

import a00.h0;
import a00.r0;
import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.IntSize;
import g10.u;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManagerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,1107:1\n34#2,4:1108\n39#2:1132\n30#3:1112\n30#3:1116\n30#3:1138\n53#4,3:1113\n53#4,3:1117\n60#4:1121\n70#4:1124\n60#4:1127\n70#4:1130\n60#4:1134\n85#4:1137\n53#4,3:1139\n60#4:1143\n70#4:1146\n65#5:1120\n69#5:1123\n65#5:1126\n69#5:1129\n65#5:1133\n65#5:1142\n69#5:1145\n22#6:1122\n22#6:1125\n22#6:1128\n22#6:1131\n22#6:1135\n22#6:1144\n54#7:1136\n*S KotlinDebug\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManagerKt\n*L\n981#1:1108,4\n981#1:1132\n1004#1:1112\n1005#1:1116\n1092#1:1138\n1004#1:1113,3\n1005#1:1117,3\n1011#1:1121\n1012#1:1124\n1013#1:1127\n1014#1:1130\n1048#1:1134\n1080#1:1137\n1092#1:1139,3\n1106#1:1143\n1106#1:1146\n1011#1:1120\n1012#1:1123\n1013#1:1126\n1014#1:1129\n1048#1:1133\n1106#1:1142\n1106#1:1145\n1011#1:1122\n1012#1:1125\n1013#1:1128\n1014#1:1131\n1048#1:1135\n1106#1:1144\n1080#1:1136\n*E\n"})
/* loaded from: classes.dex */
public final class SelectionManagerKt {

    @k
    private static final Rect invertedInfiniteRect = new Rect(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.SelectionStart.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.SelectionEnd.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.Cursor.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: calculateSelectionMagnifierCenterAndroid-O0kMr_c, reason: not valid java name */
    public static final long m1484calculateSelectionMagnifierCenterAndroidO0kMr_c(@k SelectionManager selectionManager, long j11) {
        Selection selection = selectionManager.getSelection();
        if (selection == null) {
            return Offset.Companion.m2283getUnspecifiedF1C5BW0();
        }
        Handle draggingHandle = selectionManager.getDraggingHandle();
        int i11 = draggingHandle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        if (i11 == -1) {
            return Offset.Companion.m2283getUnspecifiedF1C5BW0();
        }
        if (i11 == 1) {
            return m1486getMagnifierCenterJVtK1S4(selectionManager, j11, selection.getStart());
        }
        if (i11 == 2) {
            return m1486getMagnifierCenterJVtK1S4(selectionManager, j11, selection.getEnd());
        }
        if (i11 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("SelectionContainer does not support cursor");
    }

    /* renamed from: containsInclusive-Uv8p0NA, reason: not valid java name */
    public static final boolean m1485containsInclusiveUv8p0NA(@k Rect rect, long j11) {
        float left = rect.getLeft();
        float right = rect.getRight();
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        if (left > intBitsToFloat || intBitsToFloat > right) {
            return false;
        }
        float top = rect.getTop();
        float bottom = rect.getBottom();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        return top <= intBitsToFloat2 && intBitsToFloat2 <= bottom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> firstAndLast(List<? extends T> list) {
        int size = list.size();
        return (size == 0 || size == 1) ? list : h0.Q(r0.G2(list), r0.u3(list));
    }

    /* renamed from: getMagnifierCenter-JVtK1S4, reason: not valid java name */
    private static final long m1486getMagnifierCenterJVtK1S4(SelectionManager selectionManager, long j11, Selection.AnchorInfo anchorInfo) {
        float H;
        Selectable anchorSelectable$foundation_release = selectionManager.getAnchorSelectable$foundation_release(anchorInfo);
        if (anchorSelectable$foundation_release == null) {
            return Offset.Companion.m2283getUnspecifiedF1C5BW0();
        }
        LayoutCoordinates containerLayoutCoordinates = selectionManager.getContainerLayoutCoordinates();
        if (containerLayoutCoordinates == null) {
            return Offset.Companion.m2283getUnspecifiedF1C5BW0();
        }
        LayoutCoordinates layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates();
        if (layoutCoordinates == null) {
            return Offset.Companion.m2283getUnspecifiedF1C5BW0();
        }
        int offset = anchorInfo.getOffset();
        if (offset > anchorSelectable$foundation_release.getLastVisibleOffset()) {
            return Offset.Companion.m2283getUnspecifiedF1C5BW0();
        }
        Offset m1473getCurrentDragPosition_m7T9E = selectionManager.m1473getCurrentDragPosition_m7T9E();
        g0.m(m1473getCurrentDragPosition_m7T9E);
        float intBitsToFloat = Float.intBitsToFloat((int) (layoutCoordinates.mo3866localPositionOfR5De75A(containerLayoutCoordinates, m1473getCurrentDragPosition_m7T9E.m2278unboximpl()) >> 32));
        long mo1436getRangeOfLineContainingjx7JFs = anchorSelectable$foundation_release.mo1436getRangeOfLineContainingjx7JFs(offset);
        if (TextRange.m4553getCollapsedimpl(mo1436getRangeOfLineContainingjx7JFs)) {
            H = anchorSelectable$foundation_release.getLineLeft(offset);
        } else {
            float lineLeft = anchorSelectable$foundation_release.getLineLeft(TextRange.m4559getStartimpl(mo1436getRangeOfLineContainingjx7JFs));
            float lineRight = anchorSelectable$foundation_release.getLineRight(TextRange.m4554getEndimpl(mo1436getRangeOfLineContainingjx7JFs) - 1);
            H = u.H(intBitsToFloat, Math.min(lineLeft, lineRight), Math.max(lineLeft, lineRight));
        }
        if (H == -1.0f) {
            return Offset.Companion.m2283getUnspecifiedF1C5BW0();
        }
        if (!IntSize.m5284equalsimpl0(j11, IntSize.Companion.m5291getZeroYbymL2g()) && Math.abs(intBitsToFloat - H) > ((int) (j11 >> 32)) / 2) {
            return Offset.Companion.m2283getUnspecifiedF1C5BW0();
        }
        if (anchorSelectable$foundation_release.getCenterYForOffset(offset) == -1.0f) {
            return Offset.Companion.m2283getUnspecifiedF1C5BW0();
        }
        return containerLayoutCoordinates.mo3866localPositionOfR5De75A(layoutCoordinates, Offset.m2260constructorimpl((Float.floatToRawIntBits(H) << 32) | (4294967295L & Float.floatToRawIntBits(r9))));
    }

    @VisibleForTesting
    @k
    public static final Rect getSelectedRegionRect(@k List<? extends Pair<? extends Selectable, Selection>> list, @k LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        int[] iArr;
        List<? extends Pair<? extends Selectable, Selection>> list2 = list;
        if (list2.isEmpty()) {
            return invertedInfiniteRect;
        }
        Rect rect = invertedInfiniteRect;
        float component1 = rect.component1();
        float component2 = rect.component2();
        float component3 = rect.component3();
        float component4 = rect.component4();
        int size = list2.size();
        char c11 = 0;
        int i11 = 0;
        while (i11 < size) {
            Pair<? extends Selectable, Selection> pair = list2.get(i11);
            Selectable component12 = pair.component1();
            Selection component22 = pair.component2();
            int offset = component22.getStart().getOffset();
            int offset2 = component22.getEnd().getOffset();
            if (offset != offset2 && (layoutCoordinates2 = component12.getLayoutCoordinates()) != null) {
                int min = Math.min(offset, offset2);
                int max = Math.max(offset, offset2) - 1;
                if (min == max) {
                    iArr = new int[1];
                    iArr[c11] = min;
                } else {
                    int[] iArr2 = new int[2];
                    iArr2[c11] = min;
                    iArr2[1] = max;
                    iArr = iArr2;
                }
                Rect rect2 = invertedInfiniteRect;
                float component13 = rect2.component1();
                float component23 = rect2.component2();
                float component32 = rect2.component3();
                float component42 = rect2.component4();
                int length = iArr.length;
                int i12 = 0;
                while (i12 < length) {
                    int i13 = i12;
                    Rect boundingBox = component12.getBoundingBox(iArr[i13]);
                    component13 = Math.min(component13, boundingBox.getLeft());
                    component23 = Math.min(component23, boundingBox.getTop());
                    component32 = Math.max(component32, boundingBox.getRight());
                    component42 = Math.max(component42, boundingBox.getBottom());
                    i12 = i13 + 1;
                }
                long m2260constructorimpl = Offset.m2260constructorimpl((Float.floatToRawIntBits(component13) << 32) | (Float.floatToRawIntBits(component23) & 4294967295L));
                long m2260constructorimpl2 = Offset.m2260constructorimpl((Float.floatToRawIntBits(component42) & 4294967295L) | (Float.floatToRawIntBits(component32) << 32));
                long mo3866localPositionOfR5De75A = layoutCoordinates.mo3866localPositionOfR5De75A(layoutCoordinates2, m2260constructorimpl);
                long mo3866localPositionOfR5De75A2 = layoutCoordinates.mo3866localPositionOfR5De75A(layoutCoordinates2, m2260constructorimpl2);
                component1 = Math.min(component1, Float.intBitsToFloat((int) (mo3866localPositionOfR5De75A >> 32)));
                component2 = Math.min(component2, Float.intBitsToFloat((int) (mo3866localPositionOfR5De75A & 4294967295L)));
                component3 = Math.max(component3, Float.intBitsToFloat((int) (mo3866localPositionOfR5De75A2 >> 32)));
                component4 = Math.max(component4, Float.intBitsToFloat((int) (mo3866localPositionOfR5De75A2 & 4294967295L)));
            }
            i11++;
            list2 = list;
            c11 = 0;
        }
        return new Rect(component1, component2, component3, component4);
    }

    @l
    public static final Selection merge(@l Selection selection, @l Selection selection2) {
        Selection merge;
        return (selection == null || (merge = selection.merge(selection2)) == null) ? selection2 : merge;
    }

    @k
    public static final Rect visibleBounds(@k LayoutCoordinates layoutCoordinates) {
        Rect boundsInWindow = LayoutCoordinatesKt.boundsInWindow(layoutCoordinates);
        return RectKt.m2306Rect0a9Yr6o(layoutCoordinates.mo3874windowToLocalMKHz9U(boundsInWindow.m2303getTopLeftF1C5BW0()), layoutCoordinates.mo3874windowToLocalMKHz9U(boundsInWindow.m2297getBottomRightF1C5BW0()));
    }
}
