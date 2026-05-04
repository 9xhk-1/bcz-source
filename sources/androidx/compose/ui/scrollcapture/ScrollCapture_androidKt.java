package androidx.compose.ui.scrollcapture;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.platform.SemanticsUtils_androidKt;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nScrollCapture.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollCapture.android.kt\nandroidx/compose/ui/scrollcapture/ScrollCapture_androidKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,237:1\n203#1:238\n204#1:242\n205#1:244\n206#1:246\n207#1:248\n208#1,5:256\n1101#2:239\n1083#2,2:240\n1101#2:261\n1083#2,2:262\n136#3:243\n519#3:245\n44#3:247\n136#3:264\n519#3:265\n44#3:266\n136#3:267\n76#4,7:249\n*S KotlinDebug\n*F\n+ 1 ScrollCapture.android.kt\nandroidx/compose/ui/scrollcapture/ScrollCapture_androidKt\n*L\n133#1:238\n133#1:242\n133#1:244\n133#1:246\n133#1:248\n133#1:256,5\n133#1:239\n133#1:240,2\n203#1:261\n203#1:262,2\n133#1:243\n133#1:245\n133#1:247\n204#1:264\n205#1:265\n206#1:266\n209#1:267\n143#1:249,7\n*E\n"})
/* loaded from: classes2.dex */
public final class ScrollCapture_androidKt {
    private static final boolean getCanScrollVertically(SemanticsNode semanticsNode) {
        p<Offset, j00.c<? super Offset>, Object> scrollCaptureScrollByAction = getScrollCaptureScrollByAction(semanticsNode);
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getVerticalScrollAxisRange());
        return (scrollCaptureScrollByAction == null || scrollAxisRange == null || scrollAxisRange.getMaxValue().invoke().floatValue() <= 0.0f) ? false : true;
    }

    private static final List<SemanticsNode> getChildrenForSearch(SemanticsNode semanticsNode) {
        return semanticsNode.getChildren$ui_release(false, false, false);
    }

    @l
    public static final p<Offset, j00.c<? super Offset>, Object> getScrollCaptureScrollByAction(@k SemanticsNode semanticsNode) {
        return (p) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getScrollByOffset());
    }

    private static final void visitDescendants(SemanticsNode semanticsNode, x00.l<? super SemanticsNode, Boolean> lVar) {
        MutableVector mutableVector = new MutableVector(new SemanticsNode[16], 0);
        mutableVector.addAll(mutableVector.getSize(), (List) getChildrenForSearch(semanticsNode));
        while (mutableVector.getSize() != 0) {
            SemanticsNode semanticsNode2 = (SemanticsNode) mutableVector.removeAt(mutableVector.getSize() - 1);
            if (lVar.invoke(semanticsNode2).booleanValue()) {
                mutableVector.addAll(mutableVector.getSize(), (List) getChildrenForSearch(semanticsNode2));
            }
        }
    }

    private static final void visitScrollCaptureCandidates(SemanticsNode semanticsNode, int i11, x00.l<? super ScrollCaptureCandidate, g2> lVar) {
        SemanticsNode semanticsNode2;
        MutableVector mutableVector = new MutableVector(new SemanticsNode[16], 0);
        List<SemanticsNode> childrenForSearch = getChildrenForSearch(semanticsNode);
        while (true) {
            mutableVector.addAll(mutableVector.getSize(), (List) childrenForSearch);
            while (mutableVector.getSize() != 0) {
                semanticsNode2 = (SemanticsNode) mutableVector.removeAt(mutableVector.getSize() - 1);
                if (!SemanticsUtils_androidKt.isHidden(semanticsNode2) && !semanticsNode2.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getDisabled())) {
                    NodeCoordinator findCoordinatorToGetBounds$ui_release = semanticsNode2.findCoordinatorToGetBounds$ui_release();
                    if (findCoordinatorToGetBounds$ui_release == null) {
                        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Expected semantics node to have a coordinator.");
                        throw new KotlinNothingValueException();
                    }
                    LayoutCoordinates coordinates = findCoordinatorToGetBounds$ui_release.getCoordinates();
                    IntRect roundToIntRect = IntRectKt.roundToIntRect(LayoutCoordinatesKt.boundsInWindow(coordinates));
                    if (roundToIntRect.isEmpty()) {
                        continue;
                    } else {
                        if (!getCanScrollVertically(semanticsNode2)) {
                            break;
                        }
                        int i12 = i11 + 1;
                        lVar.invoke(new ScrollCaptureCandidate(semanticsNode2, i12, roundToIntRect, coordinates));
                        visitScrollCaptureCandidates(semanticsNode2, i12, lVar);
                    }
                }
            }
            return;
            childrenForSearch = getChildrenForSearch(semanticsNode2);
        }
    }

    public static /* synthetic */ void visitScrollCaptureCandidates$default(SemanticsNode semanticsNode, int i11, x00.l lVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        visitScrollCaptureCandidates(semanticsNode, i11, lVar);
    }
}
