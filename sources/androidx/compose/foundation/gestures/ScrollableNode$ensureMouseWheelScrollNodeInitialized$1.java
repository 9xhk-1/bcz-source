package androidx.compose.foundation.gestures;

import androidx.compose.ui.unit.Velocity;
import j00.c;
import kotlin.jvm.internal.AdaptedFunctionReference;
import l00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public /* synthetic */ class ScrollableNode$ensureMouseWheelScrollNodeInitialized$1 extends AdaptedFunctionReference implements p<Velocity, c<? super g2>, Object>, l {
    public ScrollableNode$ensureMouseWheelScrollNodeInitialized$1(Object obj) {
        super(2, obj, ScrollableNode.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4);
    }

    @Override // x00.p
    public /* bridge */ /* synthetic */ Object invoke(Velocity velocity, c<? super g2> cVar) {
        return m500invokesFctU(velocity.m5362unboximpl(), cVar);
    }

    /* renamed from: invoke-sF-c-tU, reason: not valid java name */
    public final Object m500invokesFctU(long j11, c<? super g2> cVar) {
        Object ensureMouseWheelScrollNodeInitialized$onWheelScrollStopped;
        ensureMouseWheelScrollNodeInitialized$onWheelScrollStopped = ScrollableNode.ensureMouseWheelScrollNodeInitialized$onWheelScrollStopped((ScrollableNode) this.receiver, j11, cVar);
        return ensureMouseWheelScrollNodeInitialized$onWheelScrollStopped;
    }
}
