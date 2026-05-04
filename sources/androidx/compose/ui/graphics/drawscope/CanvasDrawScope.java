package androidx.compose.ui.graphics.drawscope;

import androidx.annotation.FloatRange;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.g2;
import yz.n;
import yz.v0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCanvasDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 6 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,775:1\n65#2:776\n69#2:779\n65#2:782\n69#2:786\n65#2:790\n69#2:793\n65#2:796\n69#2:800\n65#2:804\n69#2:807\n65#2:810\n69#2:814\n65#2:824\n69#2:827\n65#2:830\n69#2:834\n65#2:844\n69#2:847\n65#2:850\n69#2:854\n65#2:858\n69#2:861\n65#2:864\n69#2:868\n65#2:872\n69#2:875\n65#2:878\n69#2:882\n65#2:886\n69#2:889\n65#2:892\n69#2:896\n60#3:777\n70#3:780\n60#3:783\n70#3:787\n60#3:791\n70#3:794\n60#3:797\n70#3:801\n60#3:805\n70#3:808\n60#3:811\n70#3:815\n60#3:819\n70#3:822\n60#3:825\n70#3:828\n60#3:831\n70#3:835\n60#3:839\n70#3:842\n60#3:845\n70#3:848\n60#3:851\n70#3:855\n60#3:859\n70#3:862\n60#3:865\n70#3:869\n60#3:873\n70#3:876\n60#3:879\n70#3:883\n60#3:887\n70#3:890\n60#3:893\n70#3:897\n22#4:778\n22#4:781\n22#4:784\n22#4:788\n22#4:792\n22#4:795\n22#4:798\n22#4:802\n22#4:806\n22#4:809\n22#4:812\n22#4:816\n22#4:820\n22#4:823\n22#4:826\n22#4:829\n22#4:832\n22#4:836\n22#4:840\n22#4:843\n22#4:846\n22#4:849\n22#4:852\n22#4:856\n22#4:860\n22#4:863\n22#4:866\n22#4:870\n22#4:874\n22#4:877\n22#4:880\n22#4:884\n22#4:888\n22#4:891\n22#4:894\n22#4:898\n57#5:785\n61#5:789\n57#5:799\n61#5:803\n57#5:813\n61#5:817\n57#5:833\n61#5:837\n57#5:853\n61#5:857\n57#5:867\n61#5:871\n57#5:881\n61#5:885\n57#5:895\n61#5:899\n48#6:818\n53#6:821\n48#6:838\n53#6:841\n1#7:900\n*S KotlinDebug\n*F\n+ 1 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n177#1:776\n178#1:779\n179#1:782\n180#1:786\n195#1:790\n196#1:793\n197#1:796\n198#1:800\n283#1:804\n284#1:807\n285#1:810\n286#1:814\n304#1:824\n305#1:827\n306#1:830\n307#1:834\n356#1:844\n357#1:847\n358#1:850\n359#1:854\n374#1:858\n375#1:861\n376#1:864\n377#1:868\n395#1:872\n396#1:875\n397#1:878\n398#1:882\n419#1:886\n420#1:889\n421#1:892\n422#1:896\n177#1:777\n178#1:780\n179#1:783\n180#1:787\n195#1:791\n196#1:794\n197#1:797\n198#1:801\n283#1:805\n284#1:808\n285#1:811\n286#1:815\n287#1:819\n288#1:822\n304#1:825\n305#1:828\n306#1:831\n307#1:835\n308#1:839\n309#1:842\n356#1:845\n357#1:848\n358#1:851\n359#1:855\n374#1:859\n375#1:862\n376#1:865\n377#1:869\n395#1:873\n396#1:876\n397#1:879\n398#1:883\n419#1:887\n420#1:890\n421#1:893\n422#1:897\n177#1:778\n178#1:781\n179#1:784\n180#1:788\n195#1:792\n196#1:795\n197#1:798\n198#1:802\n283#1:806\n284#1:809\n285#1:812\n286#1:816\n287#1:820\n288#1:823\n304#1:826\n305#1:829\n306#1:832\n307#1:836\n308#1:840\n309#1:843\n356#1:846\n357#1:849\n358#1:852\n359#1:856\n374#1:860\n375#1:863\n376#1:866\n377#1:870\n395#1:874\n396#1:877\n397#1:880\n398#1:884\n419#1:888\n420#1:891\n421#1:894\n422#1:898\n179#1:785\n180#1:789\n197#1:799\n198#1:803\n285#1:813\n286#1:817\n306#1:833\n307#1:837\n358#1:853\n359#1:857\n376#1:867\n377#1:871\n397#1:881\n398#1:885\n421#1:895\n422#1:899\n287#1:818\n288#1:821\n308#1:838\n309#1:841\n*E\n"})
/* loaded from: classes.dex */
public final class CanvasDrawScope implements DrawScope {

    @l
    private Paint fillPaint;

    @l
    private Paint strokePaint;

    @k
    private final DrawParams drawParams = new DrawParams(null, null, null, 0, 15, null);

    @k
    private final DrawContext drawContext = new DrawContext() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1
        private GraphicsLayer graphicsLayer;
        private final DrawTransform transform;

        {
            DrawTransform asDrawTransform;
            asDrawTransform = CanvasDrawScopeKt.asDrawTransform(this);
            this.transform = asDrawTransform;
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public Canvas getCanvas() {
            return CanvasDrawScope.this.getDrawParams().getCanvas();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public Density getDensity() {
            return CanvasDrawScope.this.getDrawParams().getDensity();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public GraphicsLayer getGraphicsLayer() {
            return this.graphicsLayer;
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public LayoutDirection getLayoutDirection() {
            return CanvasDrawScope.this.getDrawParams().getLayoutDirection();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public long mo2981getSizeNHjbRc() {
            return CanvasDrawScope.this.getDrawParams().m2979getSizeNHjbRc();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public DrawTransform getTransform() {
            return this.transform;
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public void setCanvas(Canvas canvas) {
            CanvasDrawScope.this.getDrawParams().setCanvas(canvas);
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public void setDensity(Density density) {
            CanvasDrawScope.this.getDrawParams().setDensity(density);
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public void setGraphicsLayer(GraphicsLayer graphicsLayer) {
            this.graphicsLayer = graphicsLayer;
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public void setLayoutDirection(LayoutDirection layoutDirection) {
            CanvasDrawScope.this.getDrawParams().setLayoutDirection(layoutDirection);
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        /* renamed from: setSize-uvyYCjk, reason: not valid java name */
        public void mo2982setSizeuvyYCjk(long j11) {
            CanvasDrawScope.this.getDrawParams().m2980setSizeuvyYCjk(j11);
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @v0
    public static final class DrawParams {

        @k
        private Canvas canvas;

        @k
        private Density density;

        @k
        private LayoutDirection layoutDirection;
        private long size;

        public /* synthetic */ DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j11, v vVar) {
            this(density, layoutDirection, canvas, j11);
        }

        /* renamed from: copy-Ug5Nnss$default, reason: not valid java name */
        public static /* synthetic */ DrawParams m2976copyUg5Nnss$default(DrawParams drawParams, Density density, LayoutDirection layoutDirection, Canvas canvas, long j11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                density = drawParams.density;
            }
            if ((i11 & 2) != 0) {
                layoutDirection = drawParams.layoutDirection;
            }
            if ((i11 & 4) != 0) {
                canvas = drawParams.canvas;
            }
            if ((i11 & 8) != 0) {
                j11 = drawParams.size;
            }
            Canvas canvas2 = canvas;
            return drawParams.m2978copyUg5Nnss(density, layoutDirection, canvas2, j11);
        }

        @k
        public final Density component1() {
            return this.density;
        }

        @k
        public final LayoutDirection component2() {
            return this.layoutDirection;
        }

        @k
        public final Canvas component3() {
            return this.canvas;
        }

        /* renamed from: component4-NH-jbRc, reason: not valid java name */
        public final long m2977component4NHjbRc() {
            return this.size;
        }

        @k
        /* renamed from: copy-Ug5Nnss, reason: not valid java name */
        public final DrawParams m2978copyUg5Nnss(@k Density density, @k LayoutDirection layoutDirection, @k Canvas canvas, long j11) {
            return new DrawParams(density, layoutDirection, canvas, j11, null);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DrawParams)) {
                return false;
            }
            DrawParams drawParams = (DrawParams) obj;
            return g0.g(this.density, drawParams.density) && this.layoutDirection == drawParams.layoutDirection && g0.g(this.canvas, drawParams.canvas) && Size.m2333equalsimpl0(this.size, drawParams.size);
        }

        @k
        public final Canvas getCanvas() {
            return this.canvas;
        }

        @k
        public final Density getDensity() {
            return this.density;
        }

        @k
        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public final long m2979getSizeNHjbRc() {
            return this.size;
        }

        public int hashCode() {
            return (((((this.density.hashCode() * 31) + this.layoutDirection.hashCode()) * 31) + this.canvas.hashCode()) * 31) + Size.m2338hashCodeimpl(this.size);
        }

        public final void setCanvas(@k Canvas canvas) {
            this.canvas = canvas;
        }

        public final void setDensity(@k Density density) {
            this.density = density;
        }

        public final void setLayoutDirection(@k LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        /* renamed from: setSize-uvyYCjk, reason: not valid java name */
        public final void m2980setSizeuvyYCjk(long j11) {
            this.size = j11;
        }

        @k
        public String toString() {
            return "DrawParams(density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", canvas=" + this.canvas + ", size=" + ((Object) Size.m2341toStringimpl(this.size)) + ')';
        }

        private DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j11) {
            this.density = density;
            this.layoutDirection = layoutDirection;
            this.canvas = canvas;
            this.size = j11;
        }

        public /* synthetic */ DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j11, int i11, v vVar) {
            this((i11 & 1) != 0 ? DrawContextKt.getDefaultDensity() : density, (i11 & 2) != 0 ? LayoutDirection.Ltr : layoutDirection, (i11 & 4) != 0 ? EmptyCanvas.INSTANCE : canvas, (i11 & 8) != 0 ? Size.Companion.m2346getZeroNHjbRc() : j11, null);
        }
    }

    /* renamed from: configurePaint-2qPWKa0, reason: not valid java name */
    private final Paint m2947configurePaint2qPWKa0(long j11, DrawStyle drawStyle, @FloatRange(from = 0.0d, to = 1.0d) float f11, ColorFilter colorFilter, int i11, int i12) {
        Paint selectPaint = selectPaint(drawStyle);
        long m2955modulate5vOe2sY = m2955modulate5vOe2sY(j11, f11);
        if (!Color.m2510equalsimpl0(selectPaint.mo2382getColor0d7_KjU(), m2955modulate5vOe2sY)) {
            selectPaint.mo2388setColor8_81llA(m2955modulate5vOe2sY);
        }
        if (selectPaint.getShader() != null) {
            selectPaint.setShader(null);
        }
        if (!g0.g(selectPaint.getColorFilter(), colorFilter)) {
            selectPaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m2420equalsimpl0(selectPaint.mo2381getBlendMode0nO6VwU(), i11)) {
            selectPaint.mo2387setBlendModes9anfk8(i11);
        }
        if (!FilterQuality.m2603equalsimpl0(selectPaint.mo2383getFilterQualityfv9h1I(), i12)) {
            selectPaint.mo2389setFilterQualityvDHp3xo(i12);
        }
        return selectPaint;
    }

    /* renamed from: configurePaint-2qPWKa0$default, reason: not valid java name */
    public static /* synthetic */ Paint m2948configurePaint2qPWKa0$default(CanvasDrawScope canvasDrawScope, long j11, DrawStyle drawStyle, float f11, ColorFilter colorFilter, int i11, int i12, int i13, Object obj) {
        return canvasDrawScope.m2947configurePaint2qPWKa0(j11, drawStyle, f11, colorFilter, i11, (i13 & 32) != 0 ? DrawScope.Companion.m3063getDefaultFilterQualityfv9h1I() : i12);
    }

    /* renamed from: configurePaint-swdJneE, reason: not valid java name */
    private final Paint m2949configurePaintswdJneE(Brush brush, DrawStyle drawStyle, @FloatRange(from = 0.0d, to = 1.0d) float f11, ColorFilter colorFilter, int i11, int i12) {
        Paint selectPaint = selectPaint(drawStyle);
        if (brush != null) {
            brush.mo2456applyToPq9zytI(mo3060getSizeNHjbRc(), selectPaint, f11);
        } else {
            if (selectPaint.getShader() != null) {
                selectPaint.setShader(null);
            }
            long mo2382getColor0d7_KjU = selectPaint.mo2382getColor0d7_KjU();
            Color.Companion companion = Color.Companion;
            if (!Color.m2510equalsimpl0(mo2382getColor0d7_KjU, companion.m2535getBlack0d7_KjU())) {
                selectPaint.mo2388setColor8_81llA(companion.m2535getBlack0d7_KjU());
            }
            if (selectPaint.getAlpha() != f11) {
                selectPaint.setAlpha(f11);
            }
        }
        if (!g0.g(selectPaint.getColorFilter(), colorFilter)) {
            selectPaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m2420equalsimpl0(selectPaint.mo2381getBlendMode0nO6VwU(), i11)) {
            selectPaint.mo2387setBlendModes9anfk8(i11);
        }
        if (!FilterQuality.m2603equalsimpl0(selectPaint.mo2383getFilterQualityfv9h1I(), i12)) {
            selectPaint.mo2389setFilterQualityvDHp3xo(i12);
        }
        return selectPaint;
    }

    /* renamed from: configurePaint-swdJneE$default, reason: not valid java name */
    public static /* synthetic */ Paint m2950configurePaintswdJneE$default(CanvasDrawScope canvasDrawScope, Brush brush, DrawStyle drawStyle, float f11, ColorFilter colorFilter, int i11, int i12, int i13, Object obj) {
        if ((i13 & 32) != 0) {
            i12 = DrawScope.Companion.m3063getDefaultFilterQualityfv9h1I();
        }
        return canvasDrawScope.m2949configurePaintswdJneE(brush, drawStyle, f11, colorFilter, i11, i12);
    }

    /* renamed from: configureStrokePaint-Q_0CZUI, reason: not valid java name */
    private final Paint m2951configureStrokePaintQ_0CZUI(long j11, float f11, float f12, int i11, int i12, PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f13, ColorFilter colorFilter, int i13, int i14) {
        Paint obtainStrokePaint = obtainStrokePaint();
        long m2955modulate5vOe2sY = m2955modulate5vOe2sY(j11, f13);
        if (!Color.m2510equalsimpl0(obtainStrokePaint.mo2382getColor0d7_KjU(), m2955modulate5vOe2sY)) {
            obtainStrokePaint.mo2388setColor8_81llA(m2955modulate5vOe2sY);
        }
        if (obtainStrokePaint.getShader() != null) {
            obtainStrokePaint.setShader(null);
        }
        if (!g0.g(obtainStrokePaint.getColorFilter(), colorFilter)) {
            obtainStrokePaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m2420equalsimpl0(obtainStrokePaint.mo2381getBlendMode0nO6VwU(), i13)) {
            obtainStrokePaint.mo2387setBlendModes9anfk8(i13);
        }
        if (obtainStrokePaint.getStrokeWidth() != f11) {
            obtainStrokePaint.setStrokeWidth(f11);
        }
        if (obtainStrokePaint.getStrokeMiterLimit() != f12) {
            obtainStrokePaint.setStrokeMiterLimit(f12);
        }
        if (!StrokeCap.m2858equalsimpl0(obtainStrokePaint.mo2384getStrokeCapKaPHkGw(), i11)) {
            obtainStrokePaint.mo2390setStrokeCapBeK7IIE(i11);
        }
        if (!StrokeJoin.m2868equalsimpl0(obtainStrokePaint.mo2385getStrokeJoinLxFBmk8(), i12)) {
            obtainStrokePaint.mo2391setStrokeJoinWw9F2mQ(i12);
        }
        if (!g0.g(obtainStrokePaint.getPathEffect(), pathEffect)) {
            obtainStrokePaint.setPathEffect(pathEffect);
        }
        if (!FilterQuality.m2603equalsimpl0(obtainStrokePaint.mo2383getFilterQualityfv9h1I(), i14)) {
            obtainStrokePaint.mo2389setFilterQualityvDHp3xo(i14);
        }
        return obtainStrokePaint;
    }

    /* renamed from: configureStrokePaint-Q_0CZUI$default, reason: not valid java name */
    public static /* synthetic */ Paint m2952configureStrokePaintQ_0CZUI$default(CanvasDrawScope canvasDrawScope, long j11, float f11, float f12, int i11, int i12, PathEffect pathEffect, float f13, ColorFilter colorFilter, int i13, int i14, int i15, Object obj) {
        return canvasDrawScope.m2951configureStrokePaintQ_0CZUI(j11, f11, f12, i11, i12, pathEffect, f13, colorFilter, i13, (i15 & 512) != 0 ? DrawScope.Companion.m3063getDefaultFilterQualityfv9h1I() : i14);
    }

    /* renamed from: configureStrokePaint-ho4zsrM, reason: not valid java name */
    private final Paint m2953configureStrokePaintho4zsrM(Brush brush, float f11, float f12, int i11, int i12, PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f13, ColorFilter colorFilter, int i13, int i14) {
        Paint obtainStrokePaint = obtainStrokePaint();
        if (brush != null) {
            brush.mo2456applyToPq9zytI(mo3060getSizeNHjbRc(), obtainStrokePaint, f13);
        } else if (obtainStrokePaint.getAlpha() != f13) {
            obtainStrokePaint.setAlpha(f13);
        }
        if (!g0.g(obtainStrokePaint.getColorFilter(), colorFilter)) {
            obtainStrokePaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m2420equalsimpl0(obtainStrokePaint.mo2381getBlendMode0nO6VwU(), i13)) {
            obtainStrokePaint.mo2387setBlendModes9anfk8(i13);
        }
        if (obtainStrokePaint.getStrokeWidth() != f11) {
            obtainStrokePaint.setStrokeWidth(f11);
        }
        if (obtainStrokePaint.getStrokeMiterLimit() != f12) {
            obtainStrokePaint.setStrokeMiterLimit(f12);
        }
        if (!StrokeCap.m2858equalsimpl0(obtainStrokePaint.mo2384getStrokeCapKaPHkGw(), i11)) {
            obtainStrokePaint.mo2390setStrokeCapBeK7IIE(i11);
        }
        if (!StrokeJoin.m2868equalsimpl0(obtainStrokePaint.mo2385getStrokeJoinLxFBmk8(), i12)) {
            obtainStrokePaint.mo2391setStrokeJoinWw9F2mQ(i12);
        }
        if (!g0.g(obtainStrokePaint.getPathEffect(), pathEffect)) {
            obtainStrokePaint.setPathEffect(pathEffect);
        }
        if (!FilterQuality.m2603equalsimpl0(obtainStrokePaint.mo2383getFilterQualityfv9h1I(), i14)) {
            obtainStrokePaint.mo2389setFilterQualityvDHp3xo(i14);
        }
        return obtainStrokePaint;
    }

    /* renamed from: configureStrokePaint-ho4zsrM$default, reason: not valid java name */
    public static /* synthetic */ Paint m2954configureStrokePaintho4zsrM$default(CanvasDrawScope canvasDrawScope, Brush brush, float f11, float f12, int i11, int i12, PathEffect pathEffect, float f13, ColorFilter colorFilter, int i13, int i14, int i15, Object obj) {
        return canvasDrawScope.m2953configureStrokePaintho4zsrM(brush, f11, f12, i11, i12, pathEffect, f13, colorFilter, i13, (i15 & 512) != 0 ? DrawScope.Companion.m3063getDefaultFilterQualityfv9h1I() : i14);
    }

    /* renamed from: modulate-5vOe2sY, reason: not valid java name */
    private final long m2955modulate5vOe2sY(long j11, float f11) {
        return f11 == 1.0f ? j11 : Color.m2508copywmQWz5c$default(j11, Color.m2511getAlphaimpl(j11) * f11, 0.0f, 0.0f, 0.0f, 14, null);
    }

    private final Paint obtainFillPaint() {
        Paint paint = this.fillPaint;
        if (paint != null) {
            return paint;
        }
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo2392setStylek9PVt8s(PaintingStyle.Companion.m2776getFillTiuSbCo());
        this.fillPaint = Paint;
        return Paint;
    }

    private final Paint obtainStrokePaint() {
        Paint paint = this.strokePaint;
        if (paint != null) {
            return paint;
        }
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo2392setStylek9PVt8s(PaintingStyle.Companion.m2777getStrokeTiuSbCo());
        this.strokePaint = Paint;
        return Paint;
    }

    private final Paint selectPaint(DrawStyle drawStyle) {
        if (g0.g(drawStyle, Fill.INSTANCE)) {
            return obtainFillPaint();
        }
        if (!(drawStyle instanceof Stroke)) {
            throw new NoWhenBranchMatchedException();
        }
        Paint obtainStrokePaint = obtainStrokePaint();
        Stroke stroke = (Stroke) drawStyle;
        if (obtainStrokePaint.getStrokeWidth() != stroke.getWidth()) {
            obtainStrokePaint.setStrokeWidth(stroke.getWidth());
        }
        if (!StrokeCap.m2858equalsimpl0(obtainStrokePaint.mo2384getStrokeCapKaPHkGw(), stroke.m3129getCapKaPHkGw())) {
            obtainStrokePaint.mo2390setStrokeCapBeK7IIE(stroke.m3129getCapKaPHkGw());
        }
        if (obtainStrokePaint.getStrokeMiterLimit() != stroke.getMiter()) {
            obtainStrokePaint.setStrokeMiterLimit(stroke.getMiter());
        }
        if (!StrokeJoin.m2868equalsimpl0(obtainStrokePaint.mo2385getStrokeJoinLxFBmk8(), stroke.m3130getJoinLxFBmk8())) {
            obtainStrokePaint.mo2391setStrokeJoinWw9F2mQ(stroke.m3130getJoinLxFBmk8());
        }
        if (!g0.g(obtainStrokePaint.getPathEffect(), stroke.getPathEffect())) {
            obtainStrokePaint.setPathEffect(stroke.getPathEffect());
        }
        return obtainStrokePaint;
    }

    /* renamed from: draw-yzxVdVo, reason: not valid java name */
    public final void m2956drawyzxVdVo(@k Density density, @k LayoutDirection layoutDirection, @k Canvas canvas, long j11, @k x00.l<? super DrawScope, g2> lVar) {
        DrawParams drawParams = getDrawParams();
        Density component1 = drawParams.component1();
        LayoutDirection component2 = drawParams.component2();
        Canvas component3 = drawParams.component3();
        long m2977component4NHjbRc = drawParams.m2977component4NHjbRc();
        DrawParams drawParams2 = getDrawParams();
        drawParams2.setDensity(density);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m2980setSizeuvyYCjk(j11);
        canvas.save();
        lVar.invoke(this);
        canvas.restore();
        DrawParams drawParams3 = getDrawParams();
        drawParams3.setDensity(component1);
        drawParams3.setLayoutDirection(component2);
        drawParams3.setCanvas(component3);
        drawParams3.m2980setSizeuvyYCjk(m2977component4NHjbRc);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-illE91I, reason: not valid java name */
    public void mo2957drawArcillE91I(@k Brush brush, float f11, float f12, boolean z11, long j11, long j12, @FloatRange(from = 0.0d, to = 1.0d) float f13, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11) {
        int i12 = (int) (j11 >> 32);
        int i13 = (int) (j11 & 4294967295L);
        this.drawParams.getCanvas().drawArc(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13), Float.intBitsToFloat(i12) + Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat(i13) + Float.intBitsToFloat((int) (j12 & 4294967295L)), f11, f12, z11, m2950configurePaintswdJneE$default(this, brush, drawStyle, f13, colorFilter, i11, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-yD3GUKo, reason: not valid java name */
    public void mo2958drawArcyD3GUKo(long j11, float f11, float f12, boolean z11, long j12, long j13, @FloatRange(from = 0.0d, to = 1.0d) float f13, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11) {
        int i12 = (int) (j12 >> 32);
        int i13 = (int) (j12 & 4294967295L);
        this.drawParams.getCanvas().drawArc(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13), Float.intBitsToFloat(i12) + Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat(i13) + Float.intBitsToFloat((int) (j13 & 4294967295L)), f11, f12, z11, m2948configurePaint2qPWKa0$default(this, j11, drawStyle, f13, colorFilter, i11, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-V9BoPsw, reason: not valid java name */
    public void mo2959drawCircleV9BoPsw(@k Brush brush, float f11, long j11, @FloatRange(from = 0.0d, to = 1.0d) float f12, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11) {
        this.drawParams.getCanvas().mo2365drawCircle9KIMszo(j11, f11, m2950configurePaintswdJneE$default(this, brush, drawStyle, f12, colorFilter, i11, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-VaOC9Bg, reason: not valid java name */
    public void mo2960drawCircleVaOC9Bg(long j11, float f11, long j12, @FloatRange(from = 0.0d, to = 1.0d) float f12, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11) {
        this.drawParams.getCanvas().mo2365drawCircle9KIMszo(j12, f11, m2948configurePaint2qPWKa0$default(this, j11, drawStyle, f12, colorFilter, i11, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @n(level = DeprecationLevel.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @w0(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    /* renamed from: drawImage-9jGpkUE, reason: not valid java name */
    public /* synthetic */ void mo2961drawImage9jGpkUE(ImageBitmap imageBitmap, long j11, long j12, long j13, long j14, @FloatRange(from = 0.0d, to = 1.0d) float f11, DrawStyle drawStyle, ColorFilter colorFilter, int i11) {
        this.drawParams.getCanvas().mo2367drawImageRectHPBpro0(imageBitmap, j11, j12, j13, j14, m2950configurePaintswdJneE$default(this, null, drawStyle, f11, colorFilter, i11, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
    public void mo2962drawImageAZ2fEMs(@k ImageBitmap imageBitmap, long j11, long j12, long j13, long j14, @FloatRange(from = 0.0d, to = 1.0d) float f11, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11, int i12) {
        this.drawParams.getCanvas().mo2367drawImageRectHPBpro0(imageBitmap, j11, j12, j13, j14, m2949configurePaintswdJneE(null, drawStyle, f11, colorFilter, i11, i12));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-gbVJVH8, reason: not valid java name */
    public void mo2963drawImagegbVJVH8(@k ImageBitmap imageBitmap, long j11, @FloatRange(from = 0.0d, to = 1.0d) float f11, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11) {
        this.drawParams.getCanvas().mo2366drawImaged4ec7I(imageBitmap, j11, m2950configurePaintswdJneE$default(this, null, drawStyle, f11, colorFilter, i11, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-1RTmtNc, reason: not valid java name */
    public void mo2964drawLine1RTmtNc(@k Brush brush, long j11, long j12, float f11, int i11, @l PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f12, @l ColorFilter colorFilter, int i12) {
        this.drawParams.getCanvas().mo2368drawLineWko1d7g(j11, j12, m2954configureStrokePaintho4zsrM$default(this, brush, f11, 4.0f, i11, StrokeJoin.Companion.m2873getMiterLxFBmk8(), pathEffect, f12, colorFilter, i12, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-NGM6Ib0, reason: not valid java name */
    public void mo2965drawLineNGM6Ib0(long j11, long j12, long j13, float f11, int i11, @l PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f12, @l ColorFilter colorFilter, int i12) {
        this.drawParams.getCanvas().mo2368drawLineWko1d7g(j12, j13, m2952configureStrokePaintQ_0CZUI$default(this, j11, f11, 4.0f, i11, StrokeJoin.Companion.m2873getMiterLxFBmk8(), pathEffect, f12, colorFilter, i12, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-AsUm42w, reason: not valid java name */
    public void mo2966drawOvalAsUm42w(@k Brush brush, long j11, long j12, @FloatRange(from = 0.0d, to = 1.0d) float f11, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11) {
        int i12 = (int) (j11 >> 32);
        int i13 = (int) (j11 & 4294967295L);
        this.drawParams.getCanvas().drawOval(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13), Float.intBitsToFloat(i12) + Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat(i13) + Float.intBitsToFloat((int) (j12 & 4294967295L)), m2950configurePaintswdJneE$default(this, brush, drawStyle, f11, colorFilter, i11, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-n-J9OG0, reason: not valid java name */
    public void mo2967drawOvalnJ9OG0(long j11, long j12, long j13, @FloatRange(from = 0.0d, to = 1.0d) float f11, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11) {
        int i12 = (int) (j12 >> 32);
        int i13 = (int) (j12 & 4294967295L);
        this.drawParams.getCanvas().drawOval(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13), Float.intBitsToFloat(i12) + Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat(i13) + Float.intBitsToFloat((int) (j13 & 4294967295L)), m2948configurePaint2qPWKa0$default(this, j11, drawStyle, f11, colorFilter, i11, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-GBMwjPU, reason: not valid java name */
    public void mo2968drawPathGBMwjPU(@k Path path, @k Brush brush, @FloatRange(from = 0.0d, to = 1.0d) float f11, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11) {
        this.drawParams.getCanvas().drawPath(path, m2950configurePaintswdJneE$default(this, brush, drawStyle, f11, colorFilter, i11, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-LG529CI, reason: not valid java name */
    public void mo2969drawPathLG529CI(@k Path path, long j11, @FloatRange(from = 0.0d, to = 1.0d) float f11, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11) {
        this.drawParams.getCanvas().drawPath(path, m2948configurePaint2qPWKa0$default(this, j11, drawStyle, f11, colorFilter, i11, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-F8ZwMP8, reason: not valid java name */
    public void mo2970drawPointsF8ZwMP8(@k List<Offset> list, int i11, long j11, float f11, int i12, @l PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f12, @l ColorFilter colorFilter, int i13) {
        this.drawParams.getCanvas().mo2369drawPointsO7TthRY(i11, list, m2952configureStrokePaintQ_0CZUI$default(this, j11, f11, 4.0f, i12, StrokeJoin.Companion.m2873getMiterLxFBmk8(), pathEffect, f12, colorFilter, i13, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-Gsft0Ws, reason: not valid java name */
    public void mo2971drawPointsGsft0Ws(@k List<Offset> list, int i11, @k Brush brush, float f11, int i12, @l PathEffect pathEffect, @FloatRange(from = 0.0d, to = 1.0d) float f12, @l ColorFilter colorFilter, int i13) {
        this.drawParams.getCanvas().mo2369drawPointsO7TthRY(i11, list, m2954configureStrokePaintho4zsrM$default(this, brush, f11, 4.0f, i12, StrokeJoin.Companion.m2873getMiterLxFBmk8(), pathEffect, f12, colorFilter, i13, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-AsUm42w, reason: not valid java name */
    public void mo2972drawRectAsUm42w(@k Brush brush, long j11, long j12, @FloatRange(from = 0.0d, to = 1.0d) float f11, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11) {
        int i12 = (int) (j11 >> 32);
        int i13 = (int) (j11 & 4294967295L);
        this.drawParams.getCanvas().drawRect(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13), Float.intBitsToFloat(i12) + Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat(i13) + Float.intBitsToFloat((int) (j12 & 4294967295L)), m2950configurePaintswdJneE$default(this, brush, drawStyle, f11, colorFilter, i11, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-n-J9OG0, reason: not valid java name */
    public void mo2973drawRectnJ9OG0(long j11, long j12, long j13, @FloatRange(from = 0.0d, to = 1.0d) float f11, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11) {
        int i12 = (int) (j12 >> 32);
        int i13 = (int) (j12 & 4294967295L);
        this.drawParams.getCanvas().drawRect(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13), Float.intBitsToFloat(i12) + Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat(i13) + Float.intBitsToFloat((int) (j13 & 4294967295L)), m2948configurePaint2qPWKa0$default(this, j11, drawStyle, f11, colorFilter, i11, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-ZuiqVtQ, reason: not valid java name */
    public void mo2974drawRoundRectZuiqVtQ(@k Brush brush, long j11, long j12, long j13, @FloatRange(from = 0.0d, to = 1.0d) float f11, @k DrawStyle drawStyle, @l ColorFilter colorFilter, int i11) {
        int i12 = (int) (j11 >> 32);
        int i13 = (int) (j11 & 4294967295L);
        this.drawParams.getCanvas().drawRoundRect(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13), Float.intBitsToFloat(i12) + Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat(i13) + Float.intBitsToFloat((int) (j12 & 4294967295L)), Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)), m2950configurePaintswdJneE$default(this, brush, drawStyle, f11, colorFilter, i11, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-u-Aw5IA, reason: not valid java name */
    public void mo2975drawRoundRectuAw5IA(long j11, long j12, long j13, long j14, @k DrawStyle drawStyle, @FloatRange(from = 0.0d, to = 1.0d) float f11, @l ColorFilter colorFilter, int i11) {
        int i12 = (int) (j12 >> 32);
        int i13 = (int) (j12 & 4294967295L);
        this.drawParams.getCanvas().drawRoundRect(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13), Float.intBitsToFloat(i12) + Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat(i13) + Float.intBitsToFloat((int) (j13 & 4294967295L)), Float.intBitsToFloat((int) (j14 >> 32)), Float.intBitsToFloat((int) (j14 & 4294967295L)), m2948configurePaint2qPWKa0$default(this, j11, drawStyle, f11, colorFilter, i11, 0, 32, null));
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.drawParams.getDensity().getDensity();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @k
    public DrawContext getDrawContext() {
        return this.drawContext;
    }

    @k
    public final DrawParams getDrawParams() {
        return this.drawParams;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.drawParams.getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @k
    public LayoutDirection getLayoutDirection() {
        return this.drawParams.getLayoutDirection();
    }

    @v0
    public static /* synthetic */ void getDrawParams$annotations() {
    }
}
