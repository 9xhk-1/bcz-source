package androidx.compose.foundation;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.Velocity;
import kotlin.jvm.internal.g0;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
final class WrappedOverscrollEffect implements OverscrollEffect {
    private final boolean attachNode;
    private final boolean eventHandlingEnabled;

    @m80.k
    private final OverscrollEffect innerOverscrollEffect;

    @m80.k
    private final DelegatableNode node;

    public WrappedOverscrollEffect(boolean z11, boolean z12, @m80.k OverscrollEffect overscrollEffect) {
        this.attachNode = z11;
        this.eventHandlingEnabled = z12;
        this.innerOverscrollEffect = overscrollEffect;
        this.node = z11 ? overscrollEffect.getNode() : new Modifier.Node() { // from class: androidx.compose.foundation.WrappedOverscrollEffect$node$1
        };
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    @l
    /* renamed from: applyToFling-BMRW4eQ */
    public Object mo213applyToFlingBMRW4eQ(long j11, @m80.k p<? super Velocity, ? super j00.c<? super Velocity>, ? extends Object> pVar, @m80.k j00.c<? super g2> cVar) {
        if (this.eventHandlingEnabled) {
            Object mo213applyToFlingBMRW4eQ = this.innerOverscrollEffect.mo213applyToFlingBMRW4eQ(j11, pVar, cVar);
            return mo213applyToFlingBMRW4eQ == kotlin.coroutines.intrinsics.b.l() ? mo213applyToFlingBMRW4eQ : g2.f100423a;
        }
        Object invoke = pVar.invoke(Velocity.m5344boximpl(j11), cVar);
        return invoke == kotlin.coroutines.intrinsics.b.l() ? invoke : g2.f100423a;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToScroll-Rhakbz0 */
    public long mo214applyToScrollRhakbz0(long j11, int i11, @m80.k x00.l<? super Offset, Offset> lVar) {
        return this.eventHandlingEnabled ? this.innerOverscrollEffect.mo214applyToScrollRhakbz0(j11, i11, lVar) : lVar.invoke(Offset.m2257boximpl(j11)).m2278unboximpl();
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WrappedOverscrollEffect)) {
            return false;
        }
        WrappedOverscrollEffect wrappedOverscrollEffect = (WrappedOverscrollEffect) obj;
        return this.attachNode == wrappedOverscrollEffect.attachNode && this.eventHandlingEnabled == wrappedOverscrollEffect.eventHandlingEnabled && g0.g(this.innerOverscrollEffect, wrappedOverscrollEffect.innerOverscrollEffect);
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    @m80.k
    public DelegatableNode getNode() {
        return this.node;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.attachNode) * 31) + Boolean.hashCode(this.eventHandlingEnabled)) * 31) + this.innerOverscrollEffect.hashCode();
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public boolean isInProgress() {
        return this.innerOverscrollEffect.isInProgress();
    }
}
