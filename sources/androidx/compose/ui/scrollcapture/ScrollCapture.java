package androidx.compose.ui.scrollcapture;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRectKt;
import c40.s0;
import e00.g;
import java.util.function.Consumer;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@RequiresApi(31)
@u0({"SMAP\nScrollCapture.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollCapture.android.kt\nandroidx/compose/ui/scrollcapture/ScrollCapture\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,237:1\n85#2:238\n113#2,2:239\n1101#3:241\n1083#3,2:242\n563#4:244\n516#4:245\n44#4:246\n472#4:247\n1#5:248\n*S KotlinDebug\n*F\n+ 1 ScrollCapture.android.kt\nandroidx/compose/ui/scrollcapture/ScrollCapture\n*L\n50#1:238\n50#1:239,2\n76#1:241\n76#1:242,2\n90#1:244\n90#1:245\n90#1:246\n90#1:247\n*E\n"})
/* loaded from: classes2.dex */
public final class ScrollCapture implements ComposeScrollCaptureCallback.ScrollCaptureSessionListener {
    public static final int $stable = 0;

    @k
    private final MutableState scrollCaptureInProgress$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    private final void setScrollCaptureInProgress(boolean z11) {
        this.scrollCaptureInProgress$delegate.setValue(Boolean.valueOf(z11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getScrollCaptureInProgress() {
        return ((Boolean) this.scrollCaptureInProgress$delegate.getValue()).booleanValue();
    }

    public final void onScrollCaptureSearch(@k View view, @k SemanticsOwner semanticsOwner, @k kotlin.coroutines.d dVar, @k Consumer<ScrollCaptureTarget> consumer) {
        MutableVector mutableVector = new MutableVector(new ScrollCaptureCandidate[16], 0);
        ScrollCapture_androidKt.visitScrollCaptureCandidates$default(semanticsOwner.getUnmergedRootSemanticsNode(), 0, new ScrollCapture$onScrollCaptureSearch$1(mutableVector), 2, null);
        mutableVector.sortWith(g.h(new l<ScrollCaptureCandidate, Comparable<?>>() { // from class: androidx.compose.ui.scrollcapture.ScrollCapture$onScrollCaptureSearch$2
            @Override // x00.l
            public final Comparable<?> invoke(ScrollCaptureCandidate scrollCaptureCandidate) {
                return Integer.valueOf(scrollCaptureCandidate.getDepth());
            }
        }, new l<ScrollCaptureCandidate, Comparable<?>>() { // from class: androidx.compose.ui.scrollcapture.ScrollCapture$onScrollCaptureSearch$3
            @Override // x00.l
            public final Comparable<?> invoke(ScrollCaptureCandidate scrollCaptureCandidate) {
                return Integer.valueOf(scrollCaptureCandidate.getViewportBoundsInWindow().getHeight());
            }
        }));
        ScrollCaptureCandidate scrollCaptureCandidate = (ScrollCaptureCandidate) (mutableVector.getSize() != 0 ? mutableVector.content[mutableVector.getSize() - 1] : null);
        if (scrollCaptureCandidate == null) {
            return;
        }
        ComposeScrollCaptureCallback composeScrollCaptureCallback = new ComposeScrollCaptureCallback(scrollCaptureCandidate.getNode(), scrollCaptureCandidate.getViewportBoundsInWindow(), s0.a(dVar), this, view);
        Rect boundsInRoot = LayoutCoordinatesKt.boundsInRoot(scrollCaptureCandidate.getCoordinates());
        long m5272getTopLeftnOccac = scrollCaptureCandidate.getViewportBoundsInWindow().m5272getTopLeftnOccac();
        ScrollCaptureTarget a11 = f.a(view, RectHelper_androidKt.toAndroidRect(IntRectKt.roundToIntRect(boundsInRoot)), new Point(IntOffset.m5243getXimpl(m5272getTopLeftnOccac), IntOffset.m5244getYimpl(m5272getTopLeftnOccac)), d.a(composeScrollCaptureCallback));
        a11.setScrollBounds(RectHelper_androidKt.toAndroidRect(scrollCaptureCandidate.getViewportBoundsInWindow()));
        consumer.accept(a11);
    }

    @Override // androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback.ScrollCaptureSessionListener
    public void onSessionEnded() {
        setScrollCaptureInProgress(false);
    }

    @Override // androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback.ScrollCaptureSessionListener
    public void onSessionStarted() {
        setScrollCaptureInProgress(true);
    }
}
