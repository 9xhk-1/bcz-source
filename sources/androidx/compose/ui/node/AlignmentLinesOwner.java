package androidx.compose.ui.node;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import java.util.Map;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface AlignmentLinesOwner extends Measurable {
    @k
    Map<AlignmentLine, Integer> calculateAlignmentLines();

    void forEachChildAlignmentLinesOwner(@k l<? super AlignmentLinesOwner, g2> lVar);

    @k
    AlignmentLines getAlignmentLines();

    @k
    NodeCoordinator getInnerCoordinator();

    @m80.l
    AlignmentLinesOwner getParentAlignmentLinesOwner();

    boolean isPlaced();

    void layoutChildren();

    void requestLayout();

    void requestMeasure();
}
