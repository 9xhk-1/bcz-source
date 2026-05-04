package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputScope;
import c40.s0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class PointerMoveDetectorKt {
    @l
    public static final Object detectMoves(@k PointerInputScope pointerInputScope, @k PointerEventPass pointerEventPass, @k x00.l<? super Offset, g2> lVar, @k j00.c<? super g2> cVar) {
        Object g11 = s0.g(new PointerMoveDetectorKt$detectMoves$2(pointerInputScope, pointerEventPass, lVar, null), cVar);
        return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
    }

    public static /* synthetic */ Object detectMoves$default(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, x00.l lVar, j00.c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            pointerEventPass = PointerEventPass.Initial;
        }
        return detectMoves(pointerInputScope, pointerEventPass, lVar, cVar);
    }
}
