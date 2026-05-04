package androidx.compose.ui.node;

import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface OwnedLayer {
    void destroy();

    void drawLayer(@k Canvas canvas, @l GraphicsLayer graphicsLayer);

    @k
    /* renamed from: getUnderlyingMatrix-sQKQjiQ, reason: not valid java name */
    float[] mo4169getUnderlyingMatrixsQKQjiQ();

    void invalidate();

    /* renamed from: inverseTransform-58bKbWc, reason: not valid java name */
    void mo4170inverseTransform58bKbWc(@k float[] fArr);

    /* renamed from: isInLayer-k-4lQ0M, reason: not valid java name */
    boolean mo4171isInLayerk4lQ0M(long j11);

    void mapBounds(@k MutableRect mutableRect, boolean z11);

    /* renamed from: mapOffset-8S9VItk, reason: not valid java name */
    long mo4172mapOffset8S9VItk(long j11, boolean z11);

    /* renamed from: move--gyyYBs, reason: not valid java name */
    void mo4173movegyyYBs(long j11);

    /* renamed from: resize-ozmzZPI, reason: not valid java name */
    void mo4174resizeozmzZPI(long j11);

    void reuseLayer(@k p<? super Canvas, ? super GraphicsLayer, g2> pVar, @k x00.a<g2> aVar);

    /* renamed from: transform-58bKbWc, reason: not valid java name */
    void mo4175transform58bKbWc(@k float[] fArr);

    void updateDisplayList();

    void updateLayerProperties(@k ReusableGraphicsLayerScope reusableGraphicsLayerScope);
}
