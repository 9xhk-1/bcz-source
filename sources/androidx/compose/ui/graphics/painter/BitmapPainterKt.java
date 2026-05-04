package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBitmapPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitmapPainter.kt\nandroidx/compose/ui/graphics/painter/BitmapPainterKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,155:1\n1#2:156\n30#3:157\n80#4:158\n*S KotlinDebug\n*F\n+ 1 BitmapPainter.kt\nandroidx/compose/ui/graphics/painter/BitmapPainterKt\n*L\n49#1:157\n49#1:158\n*E\n"})
/* loaded from: classes.dex */
public final class BitmapPainterKt {
    @k
    /* renamed from: BitmapPainter-QZhYCtY, reason: not valid java name */
    public static final BitmapPainter m3182BitmapPainterQZhYCtY(@k ImageBitmap imageBitmap, long j11, long j12, int i11) {
        BitmapPainter bitmapPainter = new BitmapPainter(imageBitmap, j11, j12, null);
        bitmapPainter.m3181setFilterQualityvDHp3xo$ui_graphics_release(i11);
        return bitmapPainter;
    }

    /* renamed from: BitmapPainter-QZhYCtY$default, reason: not valid java name */
    public static /* synthetic */ BitmapPainter m3183BitmapPainterQZhYCtY$default(ImageBitmap imageBitmap, long j11, long j12, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            j11 = IntOffset.Companion.m5254getZeronOccac();
        }
        long j13 = j11;
        if ((i12 & 4) != 0) {
            j12 = IntSize.m5281constructorimpl((imageBitmap.getHeight() & 4294967295L) | (imageBitmap.getWidth() << 32));
        }
        long j14 = j12;
        if ((i12 & 8) != 0) {
            i11 = FilterQuality.Companion.m2608getLowfv9h1I();
        }
        return m3182BitmapPainterQZhYCtY(imageBitmap, j13, j14, i11);
    }
}
