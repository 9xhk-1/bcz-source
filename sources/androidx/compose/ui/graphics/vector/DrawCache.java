package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nDrawCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawCache.kt\nandroidx/compose/ui/graphics/vector/DrawCache\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,107:1\n54#2:108\n59#2:110\n54#2:112\n59#2:114\n85#3:109\n90#3:111\n85#3:113\n90#3:115\n536#4,17:116\n56#5,5:133\n*S KotlinDebug\n*F\n+ 1 DrawCache.kt\nandroidx/compose/ui/graphics/vector/DrawCache\n*L\n70#1:108\n71#1:110\n74#1:112\n74#1:114\n70#1:109\n71#1:111\n74#1:113\n74#1:115\n82#1:116,17\n92#1:133,5\n*E\n"})
/* loaded from: classes.dex */
public final class DrawCache {
    public static final int $stable = 8;

    @l
    private Canvas cachedCanvas;

    @l
    private ImageBitmap mCachedImage;

    @l
    private Density scopeDensity;

    @k
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private long size = IntSize.Companion.m5291getZeroYbymL2g();
    private int config = ImageBitmapConfig.Companion.m2729getArgb8888_sVssgQ();

    @k
    private final CanvasDrawScope cacheScope = new CanvasDrawScope();

    private final void clear(DrawScope drawScope) {
        DrawScope.m3054drawRectnJ9OG0$default(drawScope, Color.Companion.m2535getBlack0d7_KjU(), 0L, 0L, 0.0f, null, null, BlendMode.Companion.m2424getClear0nO6VwU(), 62, null);
    }

    public static /* synthetic */ void drawInto$default(DrawCache drawCache, DrawScope drawScope, float f11, ColorFilter colorFilter, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f11 = 1.0f;
        }
        if ((i11 & 4) != 0) {
            colorFilter = null;
        }
        drawCache.drawInto(drawScope, f11, colorFilter);
    }

    /* renamed from: drawCachedImage-FqjB98A, reason: not valid java name */
    public final void m3187drawCachedImageFqjB98A(int i11, long j11, @k Density density, @k LayoutDirection layoutDirection, @k x00.l<? super DrawScope, g2> lVar) {
        this.scopeDensity = density;
        this.layoutDirection = layoutDirection;
        ImageBitmap imageBitmap = this.mCachedImage;
        Canvas canvas = this.cachedCanvas;
        if (imageBitmap == null || canvas == null || ((int) (j11 >> 32)) > imageBitmap.getWidth() || ((int) (j11 & 4294967295L)) > imageBitmap.getHeight() || !ImageBitmapConfig.m2724equalsimpl0(this.config, i11)) {
            imageBitmap = ImageBitmapKt.m2734ImageBitmapx__hDU$default((int) (j11 >> 32), (int) (4294967295L & j11), i11, false, null, 24, null);
            canvas = CanvasKt.Canvas(imageBitmap);
            this.mCachedImage = imageBitmap;
            this.cachedCanvas = canvas;
            this.config = i11;
        }
        this.size = j11;
        CanvasDrawScope canvasDrawScope = this.cacheScope;
        long m5298toSizeozmzZPI = IntSizeKt.m5298toSizeozmzZPI(j11);
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
        Density component1 = drawParams.component1();
        LayoutDirection component2 = drawParams.component2();
        Canvas component3 = drawParams.component3();
        long m2977component4NHjbRc = drawParams.m2977component4NHjbRc();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
        drawParams2.setDensity(density);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m2980setSizeuvyYCjk(m5298toSizeozmzZPI);
        canvas.save();
        clear(canvasDrawScope);
        lVar.invoke(canvasDrawScope);
        canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
        drawParams3.setDensity(component1);
        drawParams3.setLayoutDirection(component2);
        drawParams3.setCanvas(component3);
        drawParams3.m2980setSizeuvyYCjk(m2977component4NHjbRc);
        imageBitmap.prepareToDraw();
    }

    public final void drawInto(@k DrawScope drawScope, float f11, @l ColorFilter colorFilter) {
        ImageBitmap imageBitmap = this.mCachedImage;
        if (!(imageBitmap != null)) {
            InlineClassHelperKt.throwIllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        DrawScope.m3043drawImageAZ2fEMs$default(drawScope, imageBitmap, 0L, this.size, 0L, 0L, f11, null, colorFilter, 0, 0, 858, null);
    }

    @l
    public final ImageBitmap getMCachedImage() {
        return this.mCachedImage;
    }

    public final void setMCachedImage(@l ImageBitmap imageBitmap) {
        this.mCachedImage = imageBitmap;
    }

    @v0
    public static /* synthetic */ void getMCachedImage$annotations() {
    }
}
