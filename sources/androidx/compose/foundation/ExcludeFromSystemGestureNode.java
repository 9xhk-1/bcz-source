package androidx.compose.foundation;

import androidx.annotation.RequiresApi;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(29)
@u0({"SMAP\nSystemGestureExclusion.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemGestureExclusion.android.kt\nandroidx/compose/foundation/ExcludeFromSystemGestureNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,109:1\n1101#2:110\n1083#2,2:111\n136#3:113\n*S KotlinDebug\n*F\n+ 1 SystemGestureExclusion.android.kt\nandroidx/compose/foundation/ExcludeFromSystemGestureNode\n*L\n100#1:110\n100#1:111,2\n101#1:113\n*E\n"})
/* loaded from: classes.dex */
final class ExcludeFromSystemGestureNode extends RectListNode {
    public ExcludeFromSystemGestureNode(@l x00.l<? super LayoutCoordinates, Rect> lVar) {
        super(lVar);
    }

    @Override // androidx.compose.foundation.RectListNode
    @m80.k
    public MutableVector<android.graphics.Rect> currentRects() {
        List<? extends android.graphics.Rect> systemGestureExclusionRects;
        MutableVector<android.graphics.Rect> mutableVector = new MutableVector<>(new android.graphics.Rect[16], 0);
        systemGestureExclusionRects = getView().getSystemGestureExclusionRects();
        mutableVector.addAll(mutableVector.getSize(), systemGestureExclusionRects);
        return mutableVector;
    }

    @Override // androidx.compose.foundation.RectListNode
    public void updateRects(@m80.k MutableVector<android.graphics.Rect> mutableVector) {
        getView().setSystemGestureExclusionRects(mutableVector.asMutableList());
    }
}
