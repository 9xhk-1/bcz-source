package androidx.compose.foundation;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.Velocity;
import kotlin.DeprecationLevel;
import m80.l;
import x00.p;
import yz.g2;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public interface OverscrollEffect {
    @l
    /* renamed from: applyToFling-BMRW4eQ */
    Object mo213applyToFlingBMRW4eQ(long j11, @m80.k p<? super Velocity, ? super j00.c<? super Velocity>, ? extends Object> pVar, @m80.k j00.c<? super g2> cVar);

    /* renamed from: applyToScroll-Rhakbz0 */
    long mo214applyToScrollRhakbz0(long j11, int i11, @m80.k x00.l<? super Offset, Offset> lVar);

    @m80.k
    default Modifier getEffectModifier() {
        return Modifier.Companion;
    }

    @m80.k
    default DelegatableNode getNode() {
        return new Modifier.Node() { // from class: androidx.compose.foundation.OverscrollEffect$node$1
        };
    }

    boolean isInProgress();

    @n(level = DeprecationLevel.ERROR, message = "This has been replaced with `node`. If you are calling this property to render overscroll, use Modifier.overscroll() instead. If you are implementing OverscrollEffect, override `node` instead to render your overscroll.", replaceWith = @w0(expression = "Modifier.overscroll(this)", imports = {"androidx.compose.foundation.overscroll"}))
    static /* synthetic */ void getEffectModifier$annotations() {
    }
}
