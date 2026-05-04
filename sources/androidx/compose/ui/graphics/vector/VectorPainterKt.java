package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableOpenTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.r;
import yz.g2;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nVectorPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 7 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 8 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 9 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 10 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,474:1\n75#2:475\n75#2:500\n1247#3,6:476\n1247#3,6:482\n1247#3,6:488\n1247#3,6:494\n1247#3,3:504\n1250#3,3:508\n53#4,3:501\n53#4,3:532\n60#4:536\n70#4:539\n53#4,3:542\n1#5:507\n167#6,6:511\n249#6,14:517\n33#7:531\n33#7:541\n57#8:535\n61#8:538\n22#9:537\n22#9:540\n635#10:545\n*S KotlinDebug\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt\n*L\n131#1:475\n171#1:500\n135#1:476,6\n136#1:482,6\n147#1:488,6\n159#1:494,6\n173#1:504,3\n173#1:508,3\n172#1:501,3\n317#1:532,3\n325#1:536\n326#1:539\n324#1:542,3\n262#1:511,6\n262#1:517,14\n317#1:531\n324#1:541\n325#1:535\n326#1:538\n325#1:537\n326#1:540\n334#1:545\n*E\n"})
/* loaded from: classes.dex */
public final class VectorPainterKt {

    @k
    public static final String RootGroupName = "VectorRootGroup";

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0049  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.graphics.vector.VectorComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void RenderVectorGroup(@m80.k final androidx.compose.ui.graphics.vector.VectorGroup r23, @m80.l java.util.Map<java.lang.String, ? extends androidx.compose.ui.graphics.vector.VectorConfig> r24, @m80.l androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.VectorPainterKt.RenderVectorGroup(androidx.compose.ui.graphics.vector.VectorGroup, java.util.Map, androidx.compose.runtime.Composer, int, int):void");
    }

    @k
    /* renamed from: configureVectorPainter-T4PVSW8, reason: not valid java name */
    public static final VectorPainter m3217configureVectorPainterT4PVSW8(@k VectorPainter vectorPainter, long j11, long j12, @k String str, @l ColorFilter colorFilter, boolean z11) {
        vectorPainter.m3215setSizeuvyYCjk$ui_release(j11);
        vectorPainter.setAutoMirror$ui_release(z11);
        vectorPainter.setIntrinsicColorFilter$ui_release(colorFilter);
        vectorPainter.m3216setViewportSizeuvyYCjk$ui_release(j12);
        vectorPainter.setName$ui_release(str);
        return vectorPainter;
    }

    /* renamed from: configureVectorPainter-T4PVSW8$default, reason: not valid java name */
    public static /* synthetic */ VectorPainter m3218configureVectorPainterT4PVSW8$default(VectorPainter vectorPainter, long j11, long j12, String str, ColorFilter colorFilter, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str = RootGroupName;
        }
        return m3217configureVectorPainterT4PVSW8(vectorPainter, j11, j12, str, colorFilter, (i11 & 16) != 0 ? false : z11);
    }

    /* renamed from: createColorFilter-xETnrds, reason: not valid java name */
    private static final ColorFilter m3219createColorFilterxETnrds(long j11, int i11) {
        if (j11 != 16) {
            return ColorFilter.Companion.m2553tintxETnrds(j11, i11);
        }
        return null;
    }

    @k
    public static final GroupComponent createGroupComponent(@k GroupComponent groupComponent, @k VectorGroup vectorGroup) {
        int size = vectorGroup.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            VectorNode vectorNode = vectorGroup.get(i11);
            if (vectorNode instanceof VectorPath) {
                PathComponent pathComponent = new PathComponent();
                VectorPath vectorPath = (VectorPath) vectorNode;
                pathComponent.setPathData(vectorPath.getPathData());
                pathComponent.m3201setPathFillTypeoQ8Xj4U(vectorPath.m3224getPathFillTypeRgk1Os());
                pathComponent.setName(vectorPath.getName());
                pathComponent.setFill(vectorPath.getFill());
                pathComponent.setFillAlpha(vectorPath.getFillAlpha());
                pathComponent.setStroke(vectorPath.getStroke());
                pathComponent.setStrokeAlpha(vectorPath.getStrokeAlpha());
                pathComponent.setStrokeLineWidth(vectorPath.getStrokeLineWidth());
                pathComponent.m3202setStrokeLineCapBeK7IIE(vectorPath.m3225getStrokeLineCapKaPHkGw());
                pathComponent.m3203setStrokeLineJoinWw9F2mQ(vectorPath.m3226getStrokeLineJoinLxFBmk8());
                pathComponent.setStrokeLineMiter(vectorPath.getStrokeLineMiter());
                pathComponent.setTrimPathStart(vectorPath.getTrimPathStart());
                pathComponent.setTrimPathEnd(vectorPath.getTrimPathEnd());
                pathComponent.setTrimPathOffset(vectorPath.getTrimPathOffset());
                groupComponent.insertAt(i11, pathComponent);
            } else if (vectorNode instanceof VectorGroup) {
                GroupComponent groupComponent2 = new GroupComponent();
                VectorGroup vectorGroup2 = (VectorGroup) vectorNode;
                groupComponent2.setName(vectorGroup2.getName());
                groupComponent2.setRotation(vectorGroup2.getRotation());
                groupComponent2.setScaleX(vectorGroup2.getScaleX());
                groupComponent2.setScaleY(vectorGroup2.getScaleY());
                groupComponent2.setTranslationX(vectorGroup2.getTranslationX());
                groupComponent2.setTranslationY(vectorGroup2.getTranslationY());
                groupComponent2.setPivotX(vectorGroup2.getPivotX());
                groupComponent2.setPivotY(vectorGroup2.getPivotY());
                groupComponent2.setClipPathData(vectorGroup2.getClipPathData());
                createGroupComponent(groupComponent2, vectorGroup2);
                groupComponent.insertAt(i11, groupComponent2);
            }
        }
        return groupComponent;
    }

    @k
    public static final VectorPainter createVectorPainterFromImageVector(@k Density density, @k ImageVector imageVector, @k GroupComponent groupComponent) {
        long m3220obtainSizePxVpY3zN4 = m3220obtainSizePxVpY3zN4(density, imageVector.m3191getDefaultWidthD9Ej5fM(), imageVector.m3190getDefaultHeightD9Ej5fM());
        return m3217configureVectorPainterT4PVSW8(new VectorPainter(groupComponent), m3220obtainSizePxVpY3zN4, m3221obtainViewportSizePq9zytI(m3220obtainSizePxVpY3zN4, imageVector.getViewportWidth(), imageVector.getViewportHeight()), imageVector.getName(), m3219createColorFilterxETnrds(imageVector.m3193getTintColor0d7_KjU(), imageVector.m3192getTintBlendMode0nO6VwU()), imageVector.getAutoMirror());
    }

    private static final void mirror(DrawScope drawScope, x00.l<? super DrawScope, g2> lVar) {
        long mo3059getCenterF1C5BW0 = drawScope.mo3059getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long mo2981getSizeNHjbRc = drawContext.mo2981getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo2988scale0AR0LA0(-1.0f, 1.0f, mo3059getCenterF1C5BW0);
            lVar.invoke(drawScope);
        } finally {
            d0.d(1);
            drawContext.getCanvas().restore();
            drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
            d0.c(1);
        }
    }

    /* renamed from: obtainSizePx-VpY3zN4, reason: not valid java name */
    private static final long m3220obtainSizePxVpY3zN4(Density density, float f11, float f12) {
        float mo377toPx0680j_4 = density.mo377toPx0680j_4(f11);
        float mo377toPx0680j_42 = density.mo377toPx0680j_4(f12);
        return Size.m2328constructorimpl((Float.floatToRawIntBits(mo377toPx0680j_4) << 32) | (Float.floatToRawIntBits(mo377toPx0680j_42) & 4294967295L));
    }

    /* renamed from: obtainViewportSize-Pq9zytI, reason: not valid java name */
    private static final long m3221obtainViewportSizePq9zytI(long j11, float f11, float f12) {
        if (Float.isNaN(f11)) {
            f11 = Float.intBitsToFloat((int) (j11 >> 32));
        }
        if (Float.isNaN(f12)) {
            f12 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        }
        return Size.m2328constructorimpl((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L));
    }

    @Composable
    @k
    public static final VectorPainter rememberVectorPainter(@k ImageVector imageVector, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1413834416, i11, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:169)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        float genId$ui_release = imageVector.getGenId$ui_release();
        float density2 = density.getDensity();
        boolean changed = composer.changed((Float.floatToRawIntBits(density2) & 4294967295L) | (Float.floatToRawIntBits(genId$ui_release) << 32));
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            GroupComponent groupComponent = new GroupComponent();
            createGroupComponent(groupComponent, imageVector.getRoot());
            g2 g2Var = g2.f100423a;
            rememberedValue = createVectorPainterFromImageVector(density, imageVector, groupComponent);
            composer.updateRememberedValue(rememberedValue);
        }
        VectorPainter vectorPainter = (VectorPainter) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return vectorPainter;
    }

    @ComposableOpenTarget(index = -1)
    @k
    @Composable
    @n(message = "Replace rememberVectorPainter graphicsLayer that consumes the auto mirror flag", replaceWith = @w0(expression = "rememberVectorPainter(defaultWidth, defaultHeight, viewportWidth, viewportHeight, name, tintColor, tintBlendMode, false, content)", imports = {"androidx.compose.ui.graphics.vector"}))
    /* renamed from: rememberVectorPainter-mlNsNFs, reason: not valid java name */
    public static final VectorPainter m3222rememberVectorPaintermlNsNFs(float f11, float f12, float f13, float f14, @l String str, long j11, int i11, @k r<? super Float, ? super Float, ? super Composer, ? super Integer, g2> rVar, @l Composer composer, int i12, int i13) {
        float f15 = (i13 & 4) != 0 ? Float.NaN : f13;
        float f16 = (i13 & 8) != 0 ? Float.NaN : f14;
        String str2 = (i13 & 16) != 0 ? RootGroupName : str;
        long m2545getUnspecified0d7_KjU = (i13 & 32) != 0 ? Color.Companion.m2545getUnspecified0d7_KjU() : j11;
        int m2449getSrcIn0nO6VwU = (i13 & 64) != 0 ? BlendMode.Companion.m2449getSrcIn0nO6VwU() : i11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-964365210, i12, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:85)");
        }
        VectorPainter m3223rememberVectorPaintervIP8VLU = m3223rememberVectorPaintervIP8VLU(f11, f12, f15, f16, str2, m2545getUnspecified0d7_KjU, m2449getSrcIn0nO6VwU, false, rVar, composer, (i12 & 14) | 12582912 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (3670016 & i12) | ((i12 << 3) & 234881024), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m3223rememberVectorPaintervIP8VLU;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0131, code lost:
    
        if (r4 == r7.getEmpty()) goto L81;
     */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableOpenTarget(index = -1)
    @m80.k
    /* renamed from: rememberVectorPainter-vIP8VLU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.graphics.vector.VectorPainter m3223rememberVectorPaintervIP8VLU(float r17, float r18, float r19, float r20, @m80.l java.lang.String r21, long r22, int r24, boolean r25, @m80.k final x00.r<? super java.lang.Float, ? super java.lang.Float, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r26, @m80.l androidx.compose.runtime.Composer r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.VectorPainterKt.m3223rememberVectorPaintervIP8VLU(float, float, float, float, java.lang.String, long, int, boolean, x00.r, androidx.compose.runtime.Composer, int, int):androidx.compose.ui.graphics.vector.VectorPainter");
    }
}
