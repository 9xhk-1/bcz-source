package androidx.compose.foundation;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nRectListNode.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectListNode.android.kt\nandroidx/compose/foundation/RectListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,98:1\n1#2:99\n641#3,2:100\n65#4:102\n69#4:105\n65#4:108\n69#4:111\n60#5:103\n70#5:106\n60#5:109\n70#5:112\n22#6:104\n22#6:107\n22#6:110\n22#6:113\n*S KotlinDebug\n*F\n+ 1 RectListNode.android.kt\nandroidx/compose/foundation/RectListNode\n*L\n68#1:100,2\n85#1:102\n86#1:105\n87#1:108\n88#1:111\n85#1:103\n86#1:106\n87#1:109\n88#1:112\n85#1:104\n86#1:107\n87#1:110\n88#1:113\n*E\n"})
/* loaded from: classes.dex */
public abstract class RectListNode extends Modifier.Node implements GlobalPositionAwareModifierNode {
    public static final int $stable = 8;

    @l
    private Rect androidRect;

    @l
    private x00.l<? super LayoutCoordinates, androidx.compose.ui.geometry.Rect> rect;

    public RectListNode(@l x00.l<? super LayoutCoordinates, androidx.compose.ui.geometry.Rect> lVar) {
        this.rect = lVar;
    }

    private final Rect calcBounds(LayoutCoordinates layoutCoordinates, androidx.compose.ui.geometry.Rect rect) {
        LayoutCoordinates findRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(layoutCoordinates);
        long mo3866localPositionOfR5De75A = findRootCoordinates.mo3866localPositionOfR5De75A(layoutCoordinates, rect.m2303getTopLeftF1C5BW0());
        long mo3866localPositionOfR5De75A2 = findRootCoordinates.mo3866localPositionOfR5De75A(layoutCoordinates, rect.m2304getTopRightF1C5BW0());
        long mo3866localPositionOfR5De75A3 = findRootCoordinates.mo3866localPositionOfR5De75A(layoutCoordinates, rect.m2296getBottomLeftF1C5BW0());
        long mo3866localPositionOfR5De75A4 = findRootCoordinates.mo3866localPositionOfR5De75A(layoutCoordinates, rect.m2297getBottomRightF1C5BW0());
        int i11 = (int) (mo3866localPositionOfR5De75A >> 32);
        int i12 = (int) (mo3866localPositionOfR5De75A2 >> 32);
        int i13 = (int) (mo3866localPositionOfR5De75A3 >> 32);
        int i14 = (int) (mo3866localPositionOfR5De75A4 >> 32);
        int i15 = (int) (mo3866localPositionOfR5De75A & 4294967295L);
        int i16 = (int) (mo3866localPositionOfR5De75A2 & 4294967295L);
        int i17 = (int) (mo3866localPositionOfR5De75A3 & 4294967295L);
        int i18 = (int) (mo3866localPositionOfR5De75A4 & 4294967295L);
        return new Rect(c10.d.L0(e00.h.l0(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat(i13), Float.intBitsToFloat(i14))), c10.d.L0(e00.h.l0(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16), Float.intBitsToFloat(i17), Float.intBitsToFloat(i18))), c10.d.L0(e00.h.Q(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat(i13), Float.intBitsToFloat(i14))), c10.d.L0(e00.h.Q(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16), Float.intBitsToFloat(i17), Float.intBitsToFloat(i18))));
    }

    private final void replaceRect(Rect rect) {
        MutableVector<Rect> currentRects = currentRects();
        Rect rect2 = this.androidRect;
        if (rect2 != null) {
            currentRects.remove(rect2);
        }
        if (rect != null && !rect.isEmpty()) {
            currentRects.add(rect);
        }
        updateRects(currentRects);
        this.androidRect = rect;
    }

    @m80.k
    public abstract MutableVector<Rect> currentRects();

    @l
    public x00.l<LayoutCoordinates, androidx.compose.ui.geometry.Rect> getRect() {
        return this.rect;
    }

    @m80.k
    public final View getView() {
        return DelegatableNode_androidKt.requireView(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        super.onDetach();
        replaceRect(null);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@m80.k LayoutCoordinates layoutCoordinates) {
        Rect calcBounds;
        if (getRect() == null) {
            androidx.compose.ui.geometry.Rect boundsInRoot = LayoutCoordinatesKt.boundsInRoot(layoutCoordinates);
            calcBounds = new Rect(c10.d.L0(boundsInRoot.getLeft()), c10.d.L0(boundsInRoot.getTop()), c10.d.L0(boundsInRoot.getRight()), c10.d.L0(boundsInRoot.getBottom()));
        } else {
            x00.l<LayoutCoordinates, androidx.compose.ui.geometry.Rect> rect = getRect();
            g0.m(rect);
            calcBounds = calcBounds(layoutCoordinates, rect.invoke(layoutCoordinates));
        }
        replaceRect(calcBounds);
    }

    public void setRect(@l x00.l<? super LayoutCoordinates, androidx.compose.ui.geometry.Rect> lVar) {
        this.rect = lVar;
    }

    public abstract void updateRects(@m80.k MutableVector<Rect> mutableVector);
}
