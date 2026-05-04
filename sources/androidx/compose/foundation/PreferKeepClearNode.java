package androidx.compose.foundation;

import androidx.annotation.RequiresApi;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(33)
@u0({"SMAP\nPreferKeepClear.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreferKeepClear.android.kt\nandroidx/compose/foundation/PreferKeepClearNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,107:1\n1101#2:108\n1083#2,2:109\n136#3:111\n*S KotlinDebug\n*F\n+ 1 PreferKeepClear.android.kt\nandroidx/compose/foundation/PreferKeepClearNode\n*L\n98#1:108\n98#1:109,2\n99#1:111\n*E\n"})
/* loaded from: classes.dex */
final class PreferKeepClearNode extends RectListNode {
    public PreferKeepClearNode(@l x00.l<? super LayoutCoordinates, Rect> lVar) {
        super(lVar);
    }

    @Override // androidx.compose.foundation.RectListNode
    @m80.k
    public MutableVector<android.graphics.Rect> currentRects() {
        List<? extends android.graphics.Rect> preferKeepClearRects;
        MutableVector<android.graphics.Rect> mutableVector = new MutableVector<>(new android.graphics.Rect[16], 0);
        preferKeepClearRects = getView().getPreferKeepClearRects();
        mutableVector.addAll(mutableVector.getSize(), preferKeepClearRects);
        return mutableVector;
    }

    @Override // androidx.compose.foundation.RectListNode
    public void updateRects(@m80.k MutableVector<android.graphics.Rect> mutableVector) {
        getView().setPreferKeepClearRects(mutableVector.asMutableList());
    }
}
