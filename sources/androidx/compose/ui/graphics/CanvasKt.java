package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class CanvasKt {
    @m80.k
    public static final Canvas Canvas(@m80.k ImageBitmap imageBitmap) {
        return AndroidCanvas_androidKt.ActualCanvas(imageBitmap);
    }

    public static final void rotate(@m80.k Canvas canvas, float f11, float f12, float f13) {
        if (f11 == 0.0f) {
            return;
        }
        canvas.translate(f12, f13);
        canvas.rotate(f11);
        canvas.translate(-f12, -f13);
    }

    public static final void rotateRad(@m80.k Canvas canvas, float f11, float f12, float f13) {
        rotate(canvas, DegreesKt.degrees(f11), f12, f13);
    }

    public static /* synthetic */ void rotateRad$default(Canvas canvas, float f11, float f12, float f13, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f12 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            f13 = 0.0f;
        }
        rotateRad(canvas, f11, f12, f13);
    }

    public static final void scale(@m80.k Canvas canvas, float f11, float f12, float f13, float f14) {
        if (f11 == 1.0f && f12 == 1.0f) {
            return;
        }
        canvas.translate(f13, f14);
        canvas.scale(f11, f12);
        canvas.translate(-f13, -f14);
    }

    public static /* synthetic */ void scale$default(Canvas canvas, float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f12 = f11;
        }
        scale(canvas, f11, f12, f13, f14);
    }

    public static final void withSave(@m80.k Canvas canvas, @m80.k x00.a<yz.g2> aVar) {
        try {
            canvas.save();
            aVar.invoke();
        } finally {
            kotlin.jvm.internal.d0.d(1);
            canvas.restore();
            kotlin.jvm.internal.d0.c(1);
        }
    }

    public static final void withSaveLayer(@m80.k Canvas canvas, @m80.k Rect rect, @m80.k Paint paint, @m80.k x00.a<yz.g2> aVar) {
        try {
            canvas.saveLayer(rect, paint);
            aVar.invoke();
        } finally {
            kotlin.jvm.internal.d0.d(1);
            canvas.restore();
            kotlin.jvm.internal.d0.c(1);
        }
    }
}
