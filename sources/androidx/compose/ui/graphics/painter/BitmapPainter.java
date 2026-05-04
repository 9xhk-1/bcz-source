package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBitmapPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitmapPainter.kt\nandroidx/compose/ui/graphics/painter/BitmapPainter\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,155:1\n30#2:156\n30#2:172\n80#3:157\n60#3:159\n70#3:166\n80#3:173\n85#3:175\n90#3:177\n85#3:179\n90#3:181\n57#4:158\n61#4:165\n22#5,5:160\n22#5,5:167\n54#6:174\n59#6:176\n54#6:178\n59#6:180\n*S KotlinDebug\n*F\n+ 1 BitmapPainter.kt\nandroidx/compose/ui/graphics/painter/BitmapPainter\n*L\n70#1:156\n94#1:172\n70#1:157\n95#1:159\n96#1:166\n94#1:173\n123#1:175\n124#1:177\n125#1:179\n126#1:181\n95#1:158\n96#1:165\n95#1:160,5\n96#1:167,5\n123#1:174\n124#1:176\n125#1:178\n126#1:180\n*E\n"})
/* loaded from: classes.dex */
public final class BitmapPainter extends Painter {
    private float alpha;

    @l
    private ColorFilter colorFilter;
    private int filterQuality;

    @k
    private final ImageBitmap image;
    private final long size;
    private final long srcOffset;
    private final long srcSize;

    public /* synthetic */ BitmapPainter(ImageBitmap imageBitmap, long j11, long j12, v vVar) {
        this(imageBitmap, j11, j12);
    }

    /* renamed from: validateSize-N5eqBDc, reason: not valid java name */
    private final long m3178validateSizeN5eqBDc(long j11, long j12) {
        int i11;
        int i12;
        if (IntOffset.m5243getXimpl(j11) < 0 || IntOffset.m5244getYimpl(j11) < 0 || (i11 = (int) (j12 >> 32)) < 0 || (i12 = (int) (4294967295L & j12)) < 0 || i11 > this.image.getWidth() || i12 > this.image.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return j12;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyAlpha(float f11) {
        this.alpha = f11;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyColorFilter(@l ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitmapPainter)) {
            return false;
        }
        BitmapPainter bitmapPainter = (BitmapPainter) obj;
        return g0.g(this.image, bitmapPainter.image) && IntOffset.m5242equalsimpl0(this.srcOffset, bitmapPainter.srcOffset) && IntSize.m5284equalsimpl0(this.srcSize, bitmapPainter.srcSize) && FilterQuality.m2603equalsimpl0(this.filterQuality, bitmapPainter.filterQuality);
    }

    /* renamed from: getFilterQuality-f-v9h1I$ui_graphics_release, reason: not valid java name */
    public final int m3179getFilterQualityfv9h1I$ui_graphics_release() {
        return this.filterQuality;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name */
    public long mo3180getIntrinsicSizeNHjbRc() {
        return IntSizeKt.m5298toSizeozmzZPI(this.size);
    }

    public int hashCode() {
        return (((((this.image.hashCode() * 31) + IntOffset.m5245hashCodeimpl(this.srcOffset)) * 31) + IntSize.m5287hashCodeimpl(this.srcSize)) * 31) + FilterQuality.m2604hashCodeimpl(this.filterQuality);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(@k DrawScope drawScope) {
        DrawScope.m3043drawImageAZ2fEMs$default(drawScope, this.image, this.srcOffset, this.srcSize, 0L, IntSize.m5281constructorimpl((Math.round(Float.intBitsToFloat((int) (drawScope.mo3060getSizeNHjbRc() & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (drawScope.mo3060getSizeNHjbRc() >> 32))) << 32)), this.alpha, null, this.colorFilter, 0, this.filterQuality, 328, null);
    }

    /* renamed from: setFilterQuality-vDHp3xo$ui_graphics_release, reason: not valid java name */
    public final void m3181setFilterQualityvDHp3xo$ui_graphics_release(int i11) {
        this.filterQuality = i11;
    }

    @k
    public String toString() {
        return "BitmapPainter(image=" + this.image + ", srcOffset=" + ((Object) IntOffset.m5250toStringimpl(this.srcOffset)) + ", srcSize=" + ((Object) IntSize.m5289toStringimpl(this.srcSize)) + ", filterQuality=" + ((Object) FilterQuality.m2605toStringimpl(this.filterQuality)) + ')';
    }

    public /* synthetic */ BitmapPainter(ImageBitmap imageBitmap, long j11, long j12, int i11, v vVar) {
        this(imageBitmap, (i11 & 2) != 0 ? IntOffset.Companion.m5254getZeronOccac() : j11, (i11 & 4) != 0 ? IntSize.m5281constructorimpl((imageBitmap.getHeight() & 4294967295L) | (imageBitmap.getWidth() << 32)) : j12, null);
    }

    private BitmapPainter(ImageBitmap imageBitmap, long j11, long j12) {
        this.image = imageBitmap;
        this.srcOffset = j11;
        this.srcSize = j12;
        this.filterQuality = FilterQuality.Companion.m2608getLowfv9h1I();
        this.size = m3178validateSizeN5eqBDc(j11, j12);
        this.alpha = 1.0f;
    }
}
