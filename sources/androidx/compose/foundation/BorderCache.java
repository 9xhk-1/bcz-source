package androidx.compose.foundation;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderCache\n+ 2 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,468:1\n57#2:469\n61#2:472\n60#3:470\n70#3:473\n85#3:476\n90#3:478\n22#4:471\n22#4:474\n54#5:475\n59#5:477\n1#6:479\n536#7,17:480\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderCache\n*L\n375#1:469\n376#1:472\n375#1:470\n376#1:473\n380#1:476\n380#1:478\n375#1:471\n376#1:474\n380#1:475\n380#1:477\n389#1:480,17\n*E\n"})
/* loaded from: classes.dex */
final class BorderCache {

    @l
    private Path borderPath;

    @l
    private Canvas canvas;

    @l
    private CanvasDrawScope canvasDrawScope;

    @l
    private ImageBitmap imageBitmap;

    public BorderCache() {
        this(null, null, null, null, 15, null);
    }

    private final ImageBitmap component1() {
        return this.imageBitmap;
    }

    private final Canvas component2() {
        return this.canvas;
    }

    private final CanvasDrawScope component3() {
        return this.canvasDrawScope;
    }

    private final Path component4() {
        return this.borderPath;
    }

    public static /* synthetic */ BorderCache copy$default(BorderCache borderCache, ImageBitmap imageBitmap, Canvas canvas, CanvasDrawScope canvasDrawScope, Path path, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageBitmap = borderCache.imageBitmap;
        }
        if ((i11 & 2) != 0) {
            canvas = borderCache.canvas;
        }
        if ((i11 & 4) != 0) {
            canvasDrawScope = borderCache.canvasDrawScope;
        }
        if ((i11 & 8) != 0) {
            path = borderCache.borderPath;
        }
        return borderCache.copy(imageBitmap, canvas, canvasDrawScope, path);
    }

    @m80.k
    public final BorderCache copy(@l ImageBitmap imageBitmap, @l Canvas canvas, @l CanvasDrawScope canvasDrawScope, @l Path path) {
        return new BorderCache(imageBitmap, canvas, canvasDrawScope, path);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        if (androidx.compose.ui.graphics.ImageBitmapConfig.m2723equalsimpl(r9, r1 != null ? androidx.compose.ui.graphics.ImageBitmapConfig.m2721boximpl(r1.mo2376getConfig_sVssgQ()) : null) != false) goto L17;
     */
    @m80.k
    /* renamed from: drawBorderCache-EMwLDEs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.graphics.ImageBitmap m243drawBorderCacheEMwLDEs(@m80.k androidx.compose.ui.draw.CacheDrawScope r26, long r27, int r29, @m80.k x00.l<? super androidx.compose.ui.graphics.drawscope.DrawScope, yz.g2> r30) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BorderCache.m243drawBorderCacheEMwLDEs(androidx.compose.ui.draw.CacheDrawScope, long, int, x00.l):androidx.compose.ui.graphics.ImageBitmap");
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderCache)) {
            return false;
        }
        BorderCache borderCache = (BorderCache) obj;
        return g0.g(this.imageBitmap, borderCache.imageBitmap) && g0.g(this.canvas, borderCache.canvas) && g0.g(this.canvasDrawScope, borderCache.canvasDrawScope) && g0.g(this.borderPath, borderCache.borderPath);
    }

    public int hashCode() {
        ImageBitmap imageBitmap = this.imageBitmap;
        int hashCode = (imageBitmap == null ? 0 : imageBitmap.hashCode()) * 31;
        Canvas canvas = this.canvas;
        int hashCode2 = (hashCode + (canvas == null ? 0 : canvas.hashCode())) * 31;
        CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
        int hashCode3 = (hashCode2 + (canvasDrawScope == null ? 0 : canvasDrawScope.hashCode())) * 31;
        Path path = this.borderPath;
        return hashCode3 + (path != null ? path.hashCode() : 0);
    }

    @m80.k
    public final Path obtainPath() {
        Path path = this.borderPath;
        if (path != null) {
            return path;
        }
        Path Path = AndroidPath_androidKt.Path();
        this.borderPath = Path;
        return Path;
    }

    @m80.k
    public String toString() {
        return "BorderCache(imageBitmap=" + this.imageBitmap + ", canvas=" + this.canvas + ", canvasDrawScope=" + this.canvasDrawScope + ", borderPath=" + this.borderPath + ')';
    }

    public BorderCache(@l ImageBitmap imageBitmap, @l Canvas canvas, @l CanvasDrawScope canvasDrawScope, @l Path path) {
        this.imageBitmap = imageBitmap;
        this.canvas = canvas;
        this.canvasDrawScope = canvasDrawScope;
        this.borderPath = path;
    }

    public /* synthetic */ BorderCache(ImageBitmap imageBitmap, Canvas canvas, CanvasDrawScope canvasDrawScope, Path path, int i11, v vVar) {
        this((i11 & 1) != 0 ? null : imageBitmap, (i11 & 2) != 0 ? null : canvas, (i11 & 4) != 0 ? null : canvasDrawScope, (i11 & 8) != 0 ? null : path);
    }
}
