package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Vertices;
import java.util.List;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class EmptyCanvas implements Canvas {

    @k
    public static final EmptyCanvas INSTANCE = new EmptyCanvas();

    private EmptyCanvas() {
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: clipPath-mtrdD-E */
    public void mo2362clipPathmtrdDE(@k Path path, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: clipRect-N_I0leg */
    public void mo2363clipRectN_I0leg(float f11, float f12, float f13, float f14, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: concat-58bKbWc */
    public void mo2364concat58bKbWc(@k float[] fArr) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void disableZ() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawArc(float f11, float f12, float f13, float f14, float f15, float f16, boolean z11, @k Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawCircle-9KIMszo */
    public void mo2365drawCircle9KIMszo(long j11, float f11, @k Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawImage-d-4ec7I */
    public void mo2366drawImaged4ec7I(@k ImageBitmap imageBitmap, long j11, @k Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawImageRect-HPBpro0 */
    public void mo2367drawImageRectHPBpro0(@k ImageBitmap imageBitmap, long j11, long j12, long j13, long j14, @k Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawLine-Wko1d7g */
    public void mo2368drawLineWko1d7g(long j11, long j12, @k Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawOval(float f11, float f12, float f13, float f14, @k Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawPath(@k Path path, @k Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawPoints-O7TthRY */
    public void mo2369drawPointsO7TthRY(int i11, @k List<Offset> list, @k Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawRawPoints-O7TthRY */
    public void mo2370drawRawPointsO7TthRY(int i11, @k float[] fArr, @k Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRect(float f11, float f12, float f13, float f14, @k Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRoundRect(float f11, float f12, float f13, float f14, float f15, float f16, @k Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawVertices-TPEHhCM */
    public void mo2371drawVerticesTPEHhCM(@k Vertices vertices, int i11, @k Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void enableZ() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void restore() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void rotate(float f11) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void save() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void saveLayer(@k Rect rect, @k Paint paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void scale(float f11, float f12) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void skew(float f11, float f12) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void translate(float f11, float f12) {
        throw new UnsupportedOperationException();
    }
}
