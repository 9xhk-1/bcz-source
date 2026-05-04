package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import androidx.compose.ui.window.SecureFlagPolicy;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAndroidSelectionHandles.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 7 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,235:1\n1247#2,6:236\n1247#2,6:272\n75#3:242\n33#4:243\n33#4:256\n53#5,3:244\n53#5,3:257\n53#5,3:261\n536#6,9:247\n545#6,8:264\n30#7:260\n*S KotlinDebug\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt\n*L\n72#1:236,6\n226#1:272,6\n84#1:242\n205#1:243\n212#1:256\n205#1:244,3\n212#1:257,3\n214#1:261,3\n201#1:247,9\n201#1:264,8\n214#1:260\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidSelectionHandles_androidKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void HandlePopup(@k final OffsetProvider offsetProvider, @k final Alignment alignment, @k final p<? super Composer, ? super Integer, g2> pVar, @l Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(476043083);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? startRestartGroup.changed(offsetProvider) : startRestartGroup.changedInstance(offsetProvider) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changed(alignment) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(pVar) ? 256 : 128;
        }
        boolean z11 = false;
        if (startRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(476043083, i12, -1, "androidx.compose.foundation.text.selection.HandlePopup (AndroidSelectionHandles.android.kt:223)");
            }
            boolean z12 = (i12 & 112) == 32;
            if ((i12 & 14) == 4 || ((i12 & 8) != 0 && startRestartGroup.changed(offsetProvider))) {
                z11 = true;
            }
            boolean z13 = z12 | z11;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z13 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new HandlePositionProvider(alignment, offsetProvider);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            AndroidPopup_androidKt.Popup((HandlePositionProvider) rememberedValue, null, new PopupProperties(false, false, false, (SecureFlagPolicy) null, true, false, 15, (v) null), pVar, startRestartGroup, ((i12 << 3) & 7168) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$HandlePopup$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i13) {
                    AndroidSelectionHandles_androidKt.HandlePopup(OffsetProvider.this, alignment, pVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00dc, code lost:
    
        if ((r29 & 16) != 0) goto L79;
     */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: SelectionHandle-wLIcFTc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1430SelectionHandlewLIcFTc(@m80.k final androidx.compose.foundation.text.selection.OffsetProvider r19, final boolean r20, @m80.k androidx.compose.ui.text.style.ResolvedTextDirection r21, boolean r22, long r23, final float r25, @m80.k final androidx.compose.ui.Modifier r26, @m80.l androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.m1430SelectionHandlewLIcFTc(androidx.compose.foundation.text.selection.OffsetProvider, boolean, androidx.compose.ui.text.style.ResolvedTextDirection, boolean, long, float, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void SelectionHandleIcon(@k final Modifier modifier, @k final x00.a<Boolean> aVar, final boolean z11, @l Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(2111672474);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(modifier) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(aVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changed(z11) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2111672474, i12, -1, "androidx.compose.foundation.text.selection.SelectionHandleIcon (AndroidSelectionHandles.android.kt:127)");
            }
            SpacerKt.Spacer(drawSelectionHandle(SizeKt.m775sizeVpY3zN4(modifier, SelectionHandlesKt.getHandleWidth(), SelectionHandlesKt.getHandleHeight()), aVar, z11), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandleIcon$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i13) {
                    AndroidSelectionHandles_androidKt.SelectionHandleIcon(Modifier.this, aVar, z11, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    @k
    public static final ImageBitmap createHandleImage(@k CacheDrawScope cacheDrawScope, float f11) {
        int ceil = ((int) Math.ceil(f11)) * 2;
        HandleImageCache handleImageCache = HandleImageCache.INSTANCE;
        ImageBitmap imageBitmap = handleImageCache.getImageBitmap();
        Canvas canvas = handleImageCache.getCanvas();
        CanvasDrawScope canvasDrawScope = handleImageCache.getCanvasDrawScope();
        if (imageBitmap == null || canvas == null || ceil > imageBitmap.getWidth() || ceil > imageBitmap.getHeight()) {
            imageBitmap = ImageBitmapKt.m2734ImageBitmapx__hDU$default(ceil, ceil, ImageBitmapConfig.Companion.m2728getAlpha8_sVssgQ(), false, null, 24, null);
            handleImageCache.setImageBitmap(imageBitmap);
            canvas = CanvasKt.Canvas(imageBitmap);
            handleImageCache.setCanvas(canvas);
        }
        ImageBitmap imageBitmap2 = imageBitmap;
        Canvas canvas2 = canvas;
        if (canvasDrawScope == null) {
            canvasDrawScope = new CanvasDrawScope();
            handleImageCache.setCanvasDrawScope(canvasDrawScope);
        }
        CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
        LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
        float width = imageBitmap2.getWidth();
        float height = imageBitmap2.getHeight();
        long m2328constructorimpl = Size.m2328constructorimpl((Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32));
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope2.getDrawParams();
        Density component1 = drawParams.component1();
        LayoutDirection component2 = drawParams.component2();
        Canvas component3 = drawParams.component3();
        long m2977component4NHjbRc = drawParams.m2977component4NHjbRc();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope2.getDrawParams();
        drawParams2.setDensity(cacheDrawScope);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas2);
        drawParams2.m2980setSizeuvyYCjk(m2328constructorimpl);
        canvas2.save();
        DrawScope.m3054drawRectnJ9OG0$default(canvasDrawScope2, Color.Companion.m2535getBlack0d7_KjU(), 0L, canvasDrawScope2.mo3060getSizeNHjbRc(), 0.0f, null, null, BlendMode.Companion.m2424getClear0nO6VwU(), 58, null);
        DrawScope.m3054drawRectnJ9OG0$default(canvasDrawScope2, ColorKt.Color(4278190080L), Offset.Companion.m2284getZeroF1C5BW0(), Size.m2328constructorimpl((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L)), 0.0f, null, null, 0, 120, null);
        DrawScope.m3041drawCircleVaOC9Bg$default(canvasDrawScope2, ColorKt.Color(4278190080L), f11, Offset.m2260constructorimpl((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32)), 0.0f, null, null, 0, 120, null);
        canvas2.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope2.getDrawParams();
        drawParams3.setDensity(component1);
        drawParams3.setLayoutDirection(component2);
        drawParams3.setCanvas(component3);
        drawParams3.m2980setSizeuvyYCjk(m2977component4NHjbRc);
        return imageBitmap2;
    }

    @k
    public static final Modifier drawSelectionHandle(@k Modifier modifier, @k final x00.a<Boolean> aVar, final boolean z11) {
        return ComposedModifierKt.composed$default(modifier, null, new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i11) {
                composer.startReplaceGroup(-196777734);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-196777734, i11, -1, "androidx.compose.foundation.text.selection.drawSelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:133)");
                }
                final long m1515getHandleColor0d7_KjU = ((TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).m1515getHandleColor0d7_KjU();
                boolean changed = composer.changed(m1515getHandleColor0d7_KjU) | composer.changed(aVar) | composer.changed(z11);
                final x00.a<Boolean> aVar2 = aVar;
                final boolean z12 = z11;
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new x00.l<CacheDrawScope, DrawResult>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // x00.l
                        public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
                            final ImageBitmap createHandleImage = AndroidSelectionHandles_androidKt.createHandleImage(cacheDrawScope, Float.intBitsToFloat((int) (cacheDrawScope.m2129getSizeNHjbRc() >> 32)) / 2.0f);
                            final ColorFilter m2550tintxETnrds$default = ColorFilter.Companion.m2550tintxETnrds$default(ColorFilter.Companion, m1515getHandleColor0d7_KjU, 0, 2, null);
                            final x00.a<Boolean> aVar3 = aVar2;
                            final boolean z13 = z12;
                            return cacheDrawScope.onDrawWithContent(new x00.l<ContentDrawScope, g2>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1.1
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
                                    if (aVar3.invoke().booleanValue()) {
                                        if (!z13) {
                                            DrawScope.m3044drawImagegbVJVH8$default(contentDrawScope, createHandleImage, 0L, 0.0f, null, m2550tintxETnrds$default, 0, 46, null);
                                            return;
                                        }
                                        ImageBitmap imageBitmap = createHandleImage;
                                        ColorFilter colorFilter = m2550tintxETnrds$default;
                                        long mo3059getCenterF1C5BW0 = contentDrawScope.mo3059getCenterF1C5BW0();
                                        DrawContext drawContext = contentDrawScope.getDrawContext();
                                        long mo2981getSizeNHjbRc = drawContext.mo2981getSizeNHjbRc();
                                        drawContext.getCanvas().save();
                                        try {
                                            drawContext.getTransform().mo2988scale0AR0LA0(-1.0f, 1.0f, mo3059getCenterF1C5BW0);
                                            DrawScope.m3044drawImagegbVJVH8$default(contentDrawScope, imageBitmap, 0L, 0.0f, null, colorFilter, 0, 46, null);
                                        } finally {
                                            drawContext.getCanvas().restore();
                                            drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
                                        }
                                    }
                                }
                            });
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                Modifier drawWithCache = DrawModifierKt.drawWithCache(modifier2, (x00.l) rememberedValue);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return drawWithCache;
            }
        }, 1, null);
    }
}
