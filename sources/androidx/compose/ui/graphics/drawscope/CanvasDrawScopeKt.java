package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.InlineClassHelperKt;
import androidx.compose.ui.graphics.Path;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class CanvasDrawScopeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawTransform asDrawTransform(final DrawContext drawContext) {
        return new DrawTransform() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt$asDrawTransform$1
            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: clipPath-mtrdD-E, reason: not valid java name */
            public void mo2983clipPathmtrdDE(Path path, int i11) {
                DrawContext.this.getCanvas().mo2362clipPathmtrdDE(path, i11);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: clipRect-N_I0leg, reason: not valid java name */
            public void mo2984clipRectN_I0leg(float f11, float f12, float f13, float f14, int i11) {
                DrawContext.this.getCanvas().mo2363clipRectN_I0leg(f11, f12, f13, f14, i11);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
            public long mo2985getCenterF1C5BW0() {
                return SizeKt.m2347getCenteruvyYCjk(mo2986getSizeNHjbRc());
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: getSize-NH-jbRc, reason: not valid java name */
            public long mo2986getSizeNHjbRc() {
                return DrawContext.this.mo2981getSizeNHjbRc();
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void inset(float f11, float f12, float f13, float f14) {
                Canvas canvas = DrawContext.this.getCanvas();
                DrawContext drawContext2 = DrawContext.this;
                float intBitsToFloat = Float.intBitsToFloat((int) (mo2986getSizeNHjbRc() >> 32)) - (f13 + f11);
                long m2328constructorimpl = Size.m2328constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (mo2986getSizeNHjbRc() & 4294967295L)) - (f14 + f12)) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
                if (!(Float.intBitsToFloat((int) (m2328constructorimpl >> 32)) >= 0.0f && Float.intBitsToFloat((int) (m2328constructorimpl & 4294967295L)) >= 0.0f)) {
                    InlineClassHelperKt.throwIllegalArgumentException("Width and height must be greater than or equal to zero");
                }
                drawContext2.mo2982setSizeuvyYCjk(m2328constructorimpl);
                canvas.translate(f11, f12);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: rotate-Uv8p0NA, reason: not valid java name */
            public void mo2987rotateUv8p0NA(float f11, long j11) {
                Canvas canvas = DrawContext.this.getCanvas();
                int i11 = (int) (j11 >> 32);
                int i12 = (int) (j11 & 4294967295L);
                canvas.translate(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12));
                canvas.rotate(f11);
                canvas.translate(-Float.intBitsToFloat(i11), -Float.intBitsToFloat(i12));
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: scale-0AR0LA0, reason: not valid java name */
            public void mo2988scale0AR0LA0(float f11, float f12, long j11) {
                Canvas canvas = DrawContext.this.getCanvas();
                int i11 = (int) (j11 >> 32);
                int i12 = (int) (j11 & 4294967295L);
                canvas.translate(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12));
                canvas.scale(f11, f12);
                canvas.translate(-Float.intBitsToFloat(i11), -Float.intBitsToFloat(i12));
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: transform-58bKbWc, reason: not valid java name */
            public void mo2989transform58bKbWc(float[] fArr) {
                DrawContext.this.getCanvas().mo2364concat58bKbWc(fArr);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void translate(float f11, float f12) {
                DrawContext.this.getCanvas().translate(f11, f12);
            }
        };
    }
}
