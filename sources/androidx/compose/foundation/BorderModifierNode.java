package androidx.compose.foundation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.draw.CacheDrawModifierNode;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.unit.Dp;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode\n+ 2 Rect.kt\nandroidx/compose/ui/geometry/Rect\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 Border.kt\nandroidx/compose/foundation/BorderCache\n+ 6 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 11 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,468:1\n56#2,6:469\n30#3:475\n80#4:476\n60#4:489\n70#4:493\n85#4:499\n90#4:501\n60#4:529\n70#4:532\n365#5,11:477\n376#5:491\n377#5,4:494\n381#5,2:502\n379#5,6:504\n387#5,3:511\n392#5,2:523\n394#5:556\n395#5,2:565\n57#6:488\n61#6:492\n57#6:528\n61#6:531\n22#7:490\n22#7:530\n54#8:498\n59#8:500\n1#9:510\n536#10,9:514\n545#10,8:557\n120#11,3:525\n167#11,6:533\n249#11,14:539\n124#11,3:553\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode\n*L\n240#1:469,6\n240#1:475\n240#1:476\n247#1:489\n247#1:493\n247#1:499\n247#1:501\n262#1:529\n262#1:532\n247#1:477,11\n247#1:491\n247#1:494,4\n247#1:502,2\n247#1:504,6\n247#1:511,3\n247#1:523,2\n247#1:556\n247#1:565,2\n247#1:488\n247#1:492\n262#1:528\n262#1:531\n247#1:490\n262#1:530\n247#1:498\n247#1:500\n247#1:510\n247#1:514,9\n247#1:557,8\n250#1:525,3\n262#1:533,6\n262#1:539,14\n250#1:553,3\n*E\n"})
/* loaded from: classes.dex */
public final class BorderModifierNode extends DelegatingNode {
    public static final int $stable = 8;

    @l
    private BorderCache borderCache;

    @m80.k
    private Brush brush;

    @m80.k
    private final CacheDrawModifierNode drawWithCacheModifierNode;

    @m80.k
    private Shape shape;
    private float width;

    public /* synthetic */ BorderModifierNode(float f11, Brush brush, Shape shape, v vVar) {
        this(f11, brush, shape);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f9, code lost:
    
        if (androidx.compose.ui.graphics.ImageBitmapConfig.m2723equalsimpl(r8, r7 != null ? androidx.compose.ui.graphics.ImageBitmapConfig.m2721boximpl(r7.mo2376getConfig_sVssgQ()) : null) != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015f  */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, androidx.compose.ui.graphics.ImageBitmap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.draw.DrawResult drawGenericBorder(androidx.compose.ui.draw.CacheDrawScope r43, final androidx.compose.ui.graphics.Brush r44, final androidx.compose.ui.graphics.Outline.Generic r45, boolean r46, float r47) {
        /*
            Method dump skipped, instructions count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BorderModifierNode.drawGenericBorder(androidx.compose.ui.draw.CacheDrawScope, androidx.compose.ui.graphics.Brush, androidx.compose.ui.graphics.Outline$Generic, boolean, float):androidx.compose.ui.draw.DrawResult");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawRoundRectBorder-JqoCqck, reason: not valid java name */
    public final DrawResult m252drawRoundRectBorderJqoCqck(CacheDrawScope cacheDrawScope, final Brush brush, Outline.Rounded rounded, final long j11, final long j12, final boolean z11, final float f11) {
        final Path createRoundRectPath;
        if (RoundRectKt.isSimple(rounded.getRoundRect())) {
            final long m2318getTopLeftCornerRadiuskKHJgLs = rounded.getRoundRect().m2318getTopLeftCornerRadiuskKHJgLs();
            final float f12 = f11 / 2;
            final Stroke stroke = new Stroke(f11, 0.0f, 0, 0, null, 30, null);
            return cacheDrawScope.onDrawWithContent(new x00.l<ContentDrawScope, g2>() { // from class: androidx.compose.foundation.BorderModifierNode$drawRoundRectBorder$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(ContentDrawScope contentDrawScope) {
                    invoke2(contentDrawScope);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ContentDrawScope contentDrawScope) {
                    long m250shrinkKibmq7A;
                    contentDrawScope.drawContent();
                    if (z11) {
                        DrawScope.m3055drawRoundRectZuiqVtQ$default(contentDrawScope, brush, 0L, 0L, m2318getTopLeftCornerRadiuskKHJgLs, 0.0f, null, null, 0, com.jiongji.andriod.card.R.styleable.Theme_drawable_walk_sound2, null);
                        return;
                    }
                    float intBitsToFloat = Float.intBitsToFloat((int) (m2318getTopLeftCornerRadiuskKHJgLs >> 32));
                    float f13 = f12;
                    if (intBitsToFloat >= f13) {
                        Brush brush2 = brush;
                        long j13 = j11;
                        long j14 = j12;
                        m250shrinkKibmq7A = BorderKt.m250shrinkKibmq7A(m2318getTopLeftCornerRadiuskKHJgLs, f13);
                        DrawScope.m3055drawRoundRectZuiqVtQ$default(contentDrawScope, brush2, j13, j14, m250shrinkKibmq7A, 0.0f, stroke, null, 0, 208, null);
                        return;
                    }
                    float f14 = f11;
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (contentDrawScope.mo3060getSizeNHjbRc() >> 32)) - f11;
                    float intBitsToFloat3 = Float.intBitsToFloat((int) (contentDrawScope.mo3060getSizeNHjbRc() & 4294967295L)) - f11;
                    int m2497getDifferencertfAjoo = ClipOp.Companion.m2497getDifferencertfAjoo();
                    Brush brush3 = brush;
                    long j15 = m2318getTopLeftCornerRadiuskKHJgLs;
                    DrawContext drawContext = contentDrawScope.getDrawContext();
                    long mo2981getSizeNHjbRc = drawContext.mo2981getSizeNHjbRc();
                    drawContext.getCanvas().save();
                    try {
                        drawContext.getTransform().mo2984clipRectN_I0leg(f14, f14, intBitsToFloat2, intBitsToFloat3, m2497getDifferencertfAjoo);
                        DrawScope.m3055drawRoundRectZuiqVtQ$default(contentDrawScope, brush3, 0L, 0L, j15, 0.0f, null, null, 0, com.jiongji.andriod.card.R.styleable.Theme_drawable_walk_sound2, null);
                    } finally {
                        drawContext.getCanvas().restore();
                        drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
                    }
                }
            });
        }
        if (this.borderCache == null) {
            this.borderCache = new BorderCache(null, null, null, null, 15, null);
        }
        BorderCache borderCache = this.borderCache;
        g0.m(borderCache);
        createRoundRectPath = BorderKt.createRoundRectPath(borderCache.obtainPath(), rounded.getRoundRect(), f11, z11);
        return cacheDrawScope.onDrawWithContent(new x00.l<ContentDrawScope, g2>() { // from class: androidx.compose.foundation.BorderModifierNode$drawRoundRectBorder$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                contentDrawScope.drawContent();
                DrawScope.m3049drawPathGBMwjPU$default(contentDrawScope, Path.this, brush, 0.0f, null, null, 0, 60, null);
            }
        });
    }

    @m80.k
    public final Brush getBrush() {
        return this.brush;
    }

    @m80.k
    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m253getWidthD9Ej5fM() {
        return this.width;
    }

    public final void setBrush(@m80.k Brush brush) {
        if (g0.g(this.brush, brush)) {
            return;
        }
        this.brush = brush;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    public final void setShape(@m80.k Shape shape) {
        if (g0.g(this.shape, shape)) {
            return;
        }
        this.shape = shape;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    /* renamed from: setWidth-0680j_4, reason: not valid java name */
    public final void m254setWidth0680j_4(float f11) {
        if (Dp.m5120equalsimpl0(this.width, f11)) {
            return;
        }
        this.width = f11;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    private BorderModifierNode(float f11, Brush brush, Shape shape) {
        this.width = f11;
        this.brush = brush;
        this.shape = shape;
        this.drawWithCacheModifierNode = (CacheDrawModifierNode) delegate(DrawModifierKt.CacheDrawModifierNode(new x00.l<CacheDrawScope, DrawResult>() { // from class: androidx.compose.foundation.BorderModifierNode$drawWithCacheModifierNode$1
            {
                super(1);
            }

            @Override // x00.l
            public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
                DrawResult drawContentWithoutBorder;
                DrawResult m249drawRectBorderNsqcLGU;
                DrawResult m252drawRoundRectBorderJqoCqck;
                DrawResult drawGenericBorder;
                if (cacheDrawScope.mo377toPx0680j_4(BorderModifierNode.this.m253getWidthD9Ej5fM()) < 0.0f || Size.m2336getMinDimensionimpl(cacheDrawScope.m2129getSizeNHjbRc()) <= 0.0f) {
                    drawContentWithoutBorder = BorderKt.drawContentWithoutBorder(cacheDrawScope);
                    return drawContentWithoutBorder;
                }
                float f12 = 2;
                float min = Math.min(Dp.m5120equalsimpl0(BorderModifierNode.this.m253getWidthD9Ej5fM(), Dp.Companion.m5133getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(cacheDrawScope.mo377toPx0680j_4(BorderModifierNode.this.m253getWidthD9Ej5fM())), (float) Math.ceil(Size.m2336getMinDimensionimpl(cacheDrawScope.m2129getSizeNHjbRc()) / f12));
                float f13 = min / f12;
                long m2260constructorimpl = Offset.m2260constructorimpl((Float.floatToRawIntBits(f13) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L));
                long m2328constructorimpl = Size.m2328constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (cacheDrawScope.m2129getSizeNHjbRc() >> 32)) - min) << 32) | (4294967295L & Float.floatToRawIntBits(Float.intBitsToFloat((int) (cacheDrawScope.m2129getSizeNHjbRc() & 4294967295L)) - min)));
                boolean z11 = f12 * min > Size.m2336getMinDimensionimpl(cacheDrawScope.m2129getSizeNHjbRc());
                Outline mo291createOutlinePq9zytI = BorderModifierNode.this.getShape().mo291createOutlinePq9zytI(cacheDrawScope.m2129getSizeNHjbRc(), cacheDrawScope.getLayoutDirection(), cacheDrawScope);
                if (mo291createOutlinePq9zytI instanceof Outline.Generic) {
                    BorderModifierNode borderModifierNode = BorderModifierNode.this;
                    drawGenericBorder = borderModifierNode.drawGenericBorder(cacheDrawScope, borderModifierNode.getBrush(), (Outline.Generic) mo291createOutlinePq9zytI, z11, min);
                    return drawGenericBorder;
                }
                if (mo291createOutlinePq9zytI instanceof Outline.Rounded) {
                    BorderModifierNode borderModifierNode2 = BorderModifierNode.this;
                    m252drawRoundRectBorderJqoCqck = borderModifierNode2.m252drawRoundRectBorderJqoCqck(cacheDrawScope, borderModifierNode2.getBrush(), (Outline.Rounded) mo291createOutlinePq9zytI, m2260constructorimpl, m2328constructorimpl, z11, min);
                    return m252drawRoundRectBorderJqoCqck;
                }
                if (!(mo291createOutlinePq9zytI instanceof Outline.Rectangle)) {
                    throw new NoWhenBranchMatchedException();
                }
                m249drawRectBorderNsqcLGU = BorderKt.m249drawRectBorderNsqcLGU(cacheDrawScope, BorderModifierNode.this.getBrush(), m2260constructorimpl, m2328constructorimpl, z11, min);
                return m249drawRectBorderNsqcLGU;
            }
        }));
    }
}
