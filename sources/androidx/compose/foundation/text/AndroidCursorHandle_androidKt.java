package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import x00.l;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAndroidCursorHandle.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,107:1\n1247#2,6:108\n113#3:114\n66#4:115\n58#4:116\n*S KotlinDebug\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt\n*L\n54#1:108,6\n44#1:114\n45#1:115\n45#1:116\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidCursorHandle_androidKt {
    private static final float CursorHandleHeight;
    private static final float CursorHandleWidth;
    private static final float Sqrt2 = 1.4142135f;

    static {
        float m5115constructorimpl = Dp.m5115constructorimpl(25);
        CursorHandleHeight = m5115constructorimpl;
        CursorHandleWidth = Dp.m5115constructorimpl(Dp.m5115constructorimpl(m5115constructorimpl * 2.0f) / 2.4142137f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        if ((r14 & 4) != 0) goto L48;
     */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: CursorHandle-USBMPiE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1022CursorHandleUSBMPiE(@m80.k final androidx.compose.foundation.text.selection.OffsetProvider r8, @m80.k final androidx.compose.ui.Modifier r9, final long r10, @m80.l androidx.compose.runtime.Composer r12, final int r13, final int r14) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.AndroidCursorHandle_androidKt.m1022CursorHandleUSBMPiE(androidx.compose.foundation.text.selection.OffsetProvider, androidx.compose.ui.Modifier, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DefaultCursorHandle(final Modifier modifier, Composer composer, final int i11, final int i12) {
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(694251107);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (startRestartGroup.changed(modifier) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if (startRestartGroup.shouldExecute((i13 & 3) != 2, i13 & 1)) {
            if (i14 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(694251107, i13, -1, "androidx.compose.foundation.text.DefaultCursorHandle (AndroidCursorHandle.android.kt:82)");
            }
            SpacerKt.Spacer(drawCursorHandle(SizeKt.m775sizeVpY3zN4(modifier, CursorHandleWidth, CursorHandleHeight)), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$DefaultCursorHandle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i15) {
                    AndroidCursorHandle_androidKt.DefaultCursorHandle(Modifier.this, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
                }
            });
        }
    }

    private static final Modifier drawCursorHandle(Modifier modifier) {
        return ComposedModifierKt.composed$default(modifier, null, new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$drawCursorHandle$1
            @Override // x00.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i11) {
                composer.startReplaceGroup(-2126899193);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2126899193, i11, -1, "androidx.compose.foundation.text.drawCursorHandle.<anonymous> (AndroidCursorHandle.android.kt:87)");
                }
                final long m1515getHandleColor0d7_KjU = ((TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).m1515getHandleColor0d7_KjU();
                Modifier.Companion companion = Modifier.Companion;
                boolean changed = composer.changed(m1515getHandleColor0d7_KjU);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new l<CacheDrawScope, DrawResult>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // x00.l
                        public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
                            final float intBitsToFloat = Float.intBitsToFloat((int) (cacheDrawScope.m2129getSizeNHjbRc() >> 32)) / 2.0f;
                            final ImageBitmap createHandleImage = AndroidSelectionHandles_androidKt.createHandleImage(cacheDrawScope, intBitsToFloat);
                            final ColorFilter m2550tintxETnrds$default = ColorFilter.Companion.m2550tintxETnrds$default(ColorFilter.Companion, m1515getHandleColor0d7_KjU, 0, 2, null);
                            return cacheDrawScope.onDrawWithContent(new l<ContentDrawScope, g2>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1.1
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
                                    float f11 = intBitsToFloat;
                                    ImageBitmap imageBitmap = createHandleImage;
                                    ColorFilter colorFilter = m2550tintxETnrds$default;
                                    DrawContext drawContext = contentDrawScope.getDrawContext();
                                    long mo2981getSizeNHjbRc = drawContext.mo2981getSizeNHjbRc();
                                    drawContext.getCanvas().save();
                                    try {
                                        DrawTransform transform = drawContext.getTransform();
                                        DrawTransform.translate$default(transform, f11, 0.0f, 2, null);
                                        transform.mo2987rotateUv8p0NA(45.0f, Offset.Companion.m2284getZeroF1C5BW0());
                                        DrawScope.m3044drawImagegbVJVH8$default(contentDrawScope, imageBitmap, 0L, 0.0f, null, colorFilter, 0, 46, null);
                                    } finally {
                                        drawContext.getCanvas().restore();
                                        drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
                                    }
                                }
                            });
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                Modifier then = modifier2.then(DrawModifierKt.drawWithCache(companion, (l) rememberedValue));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return then;
            }
        }, 1, null);
    }

    public static final float getCursorHandleHeight() {
        return CursorHandleHeight;
    }

    public static final float getCursorHandleWidth() {
        return CursorHandleWidth;
    }
}
