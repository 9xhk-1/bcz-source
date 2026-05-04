package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import m80.k;
import m80.l;
import x00.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class PressDownGestureKt {
    @l
    public static final Object detectPressDownGesture(@k PointerInputScope pointerInputScope, @k TapOnPosition tapOnPosition, @l a<g2> aVar, @k c<? super g2> cVar) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new PressDownGestureKt$detectPressDownGesture$2(tapOnPosition, aVar, null), cVar);
        return awaitEachGesture == b.l() ? awaitEachGesture : g2.f100423a;
    }

    public static /* synthetic */ Object detectPressDownGesture$default(PointerInputScope pointerInputScope, TapOnPosition tapOnPosition, a aVar, c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            aVar = null;
        }
        return detectPressDownGesture(pointerInputScope, tapOnPosition, aVar, cVar);
    }
}
