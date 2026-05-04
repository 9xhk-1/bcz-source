package androidx.compose.ui.graphics;

import android.graphics.Canvas;
import androidx.compose.ui.graphics.VertexMode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class AndroidVertexMode_androidKt {
    @m80.k
    /* renamed from: toAndroidVertexMode-JOOmi9M, reason: not valid java name */
    public static final Canvas.VertexMode m2415toAndroidVertexModeJOOmi9M(int i11) {
        VertexMode.Companion companion = VertexMode.Companion;
        return VertexMode.m2904equalsimpl0(i11, companion.m2910getTrianglesc2xauaI()) ? Canvas.VertexMode.TRIANGLES : VertexMode.m2904equalsimpl0(i11, companion.m2909getTriangleStripc2xauaI()) ? Canvas.VertexMode.TRIANGLE_STRIP : VertexMode.m2904equalsimpl0(i11, companion.m2908getTriangleFanc2xauaI()) ? Canvas.VertexMode.TRIANGLE_FAN : Canvas.VertexMode.TRIANGLES;
    }
}
