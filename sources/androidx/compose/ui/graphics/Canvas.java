package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCanvas.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Canvas.kt\nandroidx/compose/ui/graphics/Canvas\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,540:1\n30#2:541\n80#3:542\n*S KotlinDebug\n*F\n+ 1 Canvas.kt\nandroidx/compose/ui/graphics/Canvas\n*L\n494#1:541\n494#1:542\n*E\n"})
/* loaded from: classes.dex */
public interface Canvas {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: clipRect-mtrdD-E, reason: not valid java name */
        public static void m2487clipRectmtrdDE(@m80.k Canvas canvas, @m80.k Rect rect, int i11) {
            Canvas.super.m2484clipRectmtrdDE(rect, i11);
        }

        @Deprecated
        public static void drawArc(@m80.k Canvas canvas, @m80.k Rect rect, float f11, float f12, boolean z11, @m80.k Paint paint) {
            Canvas.super.drawArc(rect, f11, f12, z11, paint);
        }

        @Deprecated
        public static void drawArcRad(@m80.k Canvas canvas, @m80.k Rect rect, float f11, float f12, boolean z11, @m80.k Paint paint) {
            Canvas.super.drawArcRad(rect, f11, f12, z11, paint);
        }

        @Deprecated
        public static void drawOval(@m80.k Canvas canvas, @m80.k Rect rect, @m80.k Paint paint) {
            Canvas.super.drawOval(rect, paint);
        }

        @Deprecated
        public static void drawRect(@m80.k Canvas canvas, @m80.k Rect rect, @m80.k Paint paint) {
            Canvas.super.drawRect(rect, paint);
        }

        @Deprecated
        public static void skewRad(@m80.k Canvas canvas, float f11, float f12) {
            Canvas.super.skewRad(f11, f12);
        }
    }

    /* renamed from: clipPath-mtrdD-E$default, reason: not valid java name */
    static /* synthetic */ void m2480clipPathmtrdDE$default(Canvas canvas, Path path, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i12 & 2) != 0) {
            i11 = ClipOp.Companion.m2498getIntersectrtfAjoo();
        }
        canvas.mo2362clipPathmtrdDE(path, i11);
    }

    /* renamed from: clipRect-N_I0leg$default, reason: not valid java name */
    static /* synthetic */ void m2481clipRectN_I0leg$default(Canvas canvas, float f11, float f12, float f13, float f14, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i12 & 16) != 0) {
            i11 = ClipOp.Companion.m2498getIntersectrtfAjoo();
        }
        canvas.mo2363clipRectN_I0leg(f11, f12, f13, f14, i11);
    }

    /* renamed from: clipRect-mtrdD-E$default, reason: not valid java name */
    static /* synthetic */ void m2482clipRectmtrdDE$default(Canvas canvas, Rect rect, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
        }
        if ((i12 & 2) != 0) {
            i11 = ClipOp.Companion.m2498getIntersectrtfAjoo();
        }
        canvas.m2484clipRectmtrdDE(rect, i11);
    }

    /* renamed from: drawImageRect-HPBpro0$default, reason: not valid java name */
    static /* synthetic */ void m2483drawImageRectHPBpro0$default(Canvas canvas, ImageBitmap imageBitmap, long j11, long j12, long j13, long j14, Paint paint, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImageRect-HPBpro0");
        }
        long m5254getZeronOccac = (i11 & 2) != 0 ? IntOffset.Companion.m5254getZeronOccac() : j11;
        long m5281constructorimpl = (i11 & 4) != 0 ? IntSize.m5281constructorimpl((imageBitmap.getHeight() & 4294967295L) | (imageBitmap.getWidth() << 32)) : j12;
        canvas.mo2367drawImageRectHPBpro0(imageBitmap, m5254getZeronOccac, m5281constructorimpl, (i11 & 8) != 0 ? IntOffset.Companion.m5254getZeronOccac() : j13, (i11 & 16) != 0 ? m5281constructorimpl : j14, paint);
    }

    static /* synthetic */ void scale$default(Canvas canvas, float f11, float f12, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale");
        }
        if ((i11 & 2) != 0) {
            f12 = f11;
        }
        canvas.scale(f11, f12);
    }

    /* renamed from: clipPath-mtrdD-E */
    void mo2362clipPathmtrdDE(@m80.k Path path, int i11);

    /* renamed from: clipRect-N_I0leg */
    void mo2363clipRectN_I0leg(float f11, float f12, float f13, float f14, int i11);

    /* renamed from: clipRect-mtrdD-E, reason: not valid java name */
    default void m2484clipRectmtrdDE(@m80.k Rect rect, int i11) {
        mo2363clipRectN_I0leg(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), i11);
    }

    /* renamed from: concat-58bKbWc */
    void mo2364concat58bKbWc(@m80.k float[] fArr);

    void disableZ();

    void drawArc(float f11, float f12, float f13, float f14, float f15, float f16, boolean z11, @m80.k Paint paint);

    default void drawArc(@m80.k Rect rect, float f11, float f12, boolean z11, @m80.k Paint paint) {
        drawArc(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f11, f12, z11, paint);
    }

    default void drawArcRad(@m80.k Rect rect, float f11, float f12, boolean z11, @m80.k Paint paint) {
        drawArc(rect, DegreesKt.degrees(f11), DegreesKt.degrees(f12), z11, paint);
    }

    /* renamed from: drawCircle-9KIMszo */
    void mo2365drawCircle9KIMszo(long j11, float f11, @m80.k Paint paint);

    /* renamed from: drawImage-d-4ec7I */
    void mo2366drawImaged4ec7I(@m80.k ImageBitmap imageBitmap, long j11, @m80.k Paint paint);

    /* renamed from: drawImageRect-HPBpro0 */
    void mo2367drawImageRectHPBpro0(@m80.k ImageBitmap imageBitmap, long j11, long j12, long j13, long j14, @m80.k Paint paint);

    /* renamed from: drawLine-Wko1d7g */
    void mo2368drawLineWko1d7g(long j11, long j12, @m80.k Paint paint);

    void drawOval(float f11, float f12, float f13, float f14, @m80.k Paint paint);

    default void drawOval(@m80.k Rect rect, @m80.k Paint paint) {
        drawOval(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
    }

    void drawPath(@m80.k Path path, @m80.k Paint paint);

    /* renamed from: drawPoints-O7TthRY */
    void mo2369drawPointsO7TthRY(int i11, @m80.k List<Offset> list, @m80.k Paint paint);

    /* renamed from: drawRawPoints-O7TthRY */
    void mo2370drawRawPointsO7TthRY(int i11, @m80.k float[] fArr, @m80.k Paint paint);

    void drawRect(float f11, float f12, float f13, float f14, @m80.k Paint paint);

    default void drawRect(@m80.k Rect rect, @m80.k Paint paint) {
        drawRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
    }

    void drawRoundRect(float f11, float f12, float f13, float f14, float f15, float f16, @m80.k Paint paint);

    /* renamed from: drawVertices-TPEHhCM */
    void mo2371drawVerticesTPEHhCM(@m80.k Vertices vertices, int i11, @m80.k Paint paint);

    void enableZ();

    void restore();

    void rotate(float f11);

    void save();

    void saveLayer(@m80.k Rect rect, @m80.k Paint paint);

    void scale(float f11, float f12);

    void skew(float f11, float f12);

    default void skewRad(float f11, float f12) {
        skew(DegreesKt.degrees(f11), DegreesKt.degrees(f12));
    }

    void translate(float f11, float f12);
}
