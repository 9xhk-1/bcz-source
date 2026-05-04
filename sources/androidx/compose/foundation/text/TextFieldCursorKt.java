package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.CursorAnimationState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import g10.u;
import m80.k;
import x00.l;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class TextFieldCursorKt {
    @k
    public static final Modifier cursor(@k Modifier modifier, @k final LegacyTextFieldState legacyTextFieldState, @k final TextFieldValue textFieldValue, @k final OffsetMapping offsetMapping, @k final Brush brush, boolean z11) {
        return z11 ? ComposedModifierKt.composed$default(modifier, null, new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1
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
                Modifier modifier3;
                composer.startReplaceGroup(-84507373);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-84507373, i11, -1, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:46)");
                }
                boolean booleanValue = ((Boolean) composer.consume(CompositionLocalsKt.getLocalCursorBlinkEnabled())).booleanValue();
                boolean changed = composer.changed(booleanValue);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new CursorAnimationState(booleanValue);
                    composer.updateRememberedValue(rememberedValue);
                }
                final CursorAnimationState cursorAnimationState = (CursorAnimationState) rememberedValue;
                Brush brush2 = Brush.this;
                boolean z12 = ((brush2 instanceof SolidColor) && ((SolidColor) brush2).m2844getValue0d7_KjU() == 16) ? false : true;
                if (((WindowInfo) composer.consume(CompositionLocalsKt.getLocalWindowInfo())).isWindowFocused() && legacyTextFieldState.getHasFocus() && TextRange.m4553getCollapsedimpl(textFieldValue.m4807getSelectiond9O1mEE()) && z12) {
                    composer.startReplaceGroup(808460990);
                    AnnotatedString annotatedString = textFieldValue.getAnnotatedString();
                    TextRange m4547boximpl = TextRange.m4547boximpl(textFieldValue.m4807getSelectiond9O1mEE());
                    boolean changedInstance = composer.changedInstance(cursorAnimationState);
                    Object rememberedValue2 = composer.rememberedValue();
                    if (changedInstance || rememberedValue2 == Composer.Companion.getEmpty()) {
                        rememberedValue2 = new TextFieldCursorKt$cursor$1$1$1(cursorAnimationState, null);
                        composer.updateRememberedValue(rememberedValue2);
                    }
                    EffectsKt.LaunchedEffect(annotatedString, m4547boximpl, (p) rememberedValue2, composer, 0);
                    boolean changedInstance2 = composer.changedInstance(cursorAnimationState) | composer.changedInstance(offsetMapping) | composer.changed(textFieldValue) | composer.changedInstance(legacyTextFieldState) | composer.changed(Brush.this);
                    final OffsetMapping offsetMapping2 = offsetMapping;
                    final TextFieldValue textFieldValue2 = textFieldValue;
                    final LegacyTextFieldState legacyTextFieldState2 = legacyTextFieldState;
                    final Brush brush3 = Brush.this;
                    Object rememberedValue3 = composer.rememberedValue();
                    if (changedInstance2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                        Object obj = new l<ContentDrawScope, g2>() { // from class: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$2$1
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
                                Rect rect;
                                TextLayoutResult value;
                                contentDrawScope.drawContent();
                                float cursorAlpha = CursorAnimationState.this.getCursorAlpha();
                                if (cursorAlpha == 0.0f) {
                                    return;
                                }
                                int originalToTransformed = offsetMapping2.originalToTransformed(TextRange.m4559getStartimpl(textFieldValue2.m4807getSelectiond9O1mEE()));
                                TextLayoutResultProxy layoutResult = legacyTextFieldState2.getLayoutResult();
                                if (layoutResult == null || (value = layoutResult.getValue()) == null || (rect = value.getCursorRect(originalToTransformed)) == null) {
                                    rect = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
                                }
                                float t11 = u.t((float) Math.floor(contentDrawScope.mo377toPx0680j_4(TextFieldCursor_androidKt.getDefaultCursorThickness())), 1.0f);
                                float f11 = t11 / 2;
                                float t12 = u.t(u.A(rect.getLeft() + f11, Float.intBitsToFloat((int) (contentDrawScope.mo3060getSizeNHjbRc() >> 32)) - f11), f11);
                                float floor = ((int) t11) % 2 == 1 ? ((float) Math.floor(t12)) + 0.5f : (float) Math.rint(t12);
                                DrawScope.m3045drawLine1RTmtNc$default(contentDrawScope, brush3, Offset.m2260constructorimpl((Float.floatToRawIntBits(floor) << 32) | (Float.floatToRawIntBits(rect.getTop()) & 4294967295L)), Offset.m2260constructorimpl((Float.floatToRawIntBits(rect.getBottom()) & 4294967295L) | (Float.floatToRawIntBits(floor) << 32)), t11, 0, null, cursorAlpha, null, 0, 432, null);
                            }
                        };
                        composer.updateRememberedValue(obj);
                        rememberedValue3 = obj;
                    }
                    modifier3 = DrawModifierKt.drawWithContent(modifier2, (l) rememberedValue3);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(810474750);
                    composer.endReplaceGroup();
                    modifier3 = Modifier.Companion;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifier3;
            }
        }, 1, null) : modifier;
    }
}
