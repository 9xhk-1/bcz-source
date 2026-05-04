package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextPainter;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Triple;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import w00.o;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class TextFieldDelegate {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTextFieldDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDelegate.kt\nandroidx/compose/foundation/text/TextFieldDelegate$Companion\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 7 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 8 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 9 Rect.kt\nandroidx/compose/ui/geometry/Rect\n+ 10 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,440:1\n54#2:441\n59#2:443\n59#2:447\n85#3:442\n90#3:444\n90#3:448\n53#3,3:450\n60#3:454\n70#3:457\n53#3,3:459\n1#4:445\n640#5:446\n30#6:449\n30#6:458\n65#7:453\n69#7:456\n22#8:455\n56#9,6:462\n33#10:468\n*S KotlinDebug\n*F\n+ 1 TextFieldDelegate.kt\nandroidx/compose/foundation/text/TextFieldDelegate$Companion\n*L\n111#1:441\n111#1:443\n228#1:447\n111#1:442\n111#1:444\n228#1:448\n231#1:450,3\n234#1:454\n234#1:457\n234#1:459,3\n150#1:446\n231#1:449\n234#1:458\n234#1:453\n234#1:456\n234#1:455\n234#1:462,6\n234#1:468\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: drawHighlight-Le-punE, reason: not valid java name */
        private final void m1138drawHighlightLepunE(Canvas canvas, long j11, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Paint paint) {
            int originalToTransformed = offsetMapping.originalToTransformed(TextRange.m4557getMinimpl(j11));
            int originalToTransformed2 = offsetMapping.originalToTransformed(TextRange.m4556getMaximpl(j11));
            if (originalToTransformed != originalToTransformed2) {
                canvas.drawPath(textLayoutResult.getPathForRange(originalToTransformed, originalToTransformed2), paint);
            }
        }

        /* renamed from: layout-_EkL_-Y$foundation_release$default, reason: not valid java name */
        public static /* synthetic */ Triple m1139layout_EkL_Y$foundation_release$default(Companion companion, TextDelegate textDelegate, long j11, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult, int i11, Object obj) {
            if ((i11 & 8) != 0) {
                textLayoutResult = null;
            }
            return companion.m1142layout_EkL_Y$foundation_release(textDelegate, j11, layoutDirection, textLayoutResult);
        }

        @k
        /* renamed from: applyCompositionDecoration-72CqOWE, reason: not valid java name */
        public final TransformedText m1140applyCompositionDecoration72CqOWE(long j11, @k TransformedText transformedText) {
            int originalToTransformed = transformedText.getOffsetMapping().originalToTransformed(TextRange.m4559getStartimpl(j11));
            int originalToTransformed2 = transformedText.getOffsetMapping().originalToTransformed(TextRange.m4554getEndimpl(j11));
            int min = Math.min(originalToTransformed, originalToTransformed2);
            int max = Math.max(originalToTransformed, originalToTransformed2);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(transformedText.getText());
            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Companion.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (v) null), min, max);
            return new TransformedText(builder.toAnnotatedString(), transformedText.getOffsetMapping());
        }

        @o
        /* renamed from: draw-Q1vqE60$foundation_release, reason: not valid java name */
        public final void m1141drawQ1vqE60$foundation_release(@k Canvas canvas, @k TextFieldValue textFieldValue, long j11, long j12, @k OffsetMapping offsetMapping, @k TextLayoutResult textLayoutResult, @k Paint paint, long j13) {
            if (!TextRange.m4553getCollapsedimpl(j11)) {
                paint.mo2388setColor8_81llA(j13);
                m1138drawHighlightLepunE(canvas, j11, offsetMapping, textLayoutResult, paint);
            } else if (!TextRange.m4553getCollapsedimpl(j12)) {
                Color m2499boximpl = Color.m2499boximpl(textLayoutResult.getLayoutInput().getStyle().m4589getColor0d7_KjU());
                if (m2499boximpl.m2519unboximpl() == 16) {
                    m2499boximpl = null;
                }
                long m2519unboximpl = m2499boximpl != null ? m2499boximpl.m2519unboximpl() : Color.Companion.m2535getBlack0d7_KjU();
                paint.mo2388setColor8_81llA(Color.m2508copywmQWz5c$default(m2519unboximpl, Color.m2511getAlphaimpl(m2519unboximpl) * 0.2f, 0.0f, 0.0f, 0.0f, 14, null));
                m1138drawHighlightLepunE(canvas, j12, offsetMapping, textLayoutResult, paint);
            } else if (!TextRange.m4553getCollapsedimpl(textFieldValue.m4807getSelectiond9O1mEE())) {
                paint.mo2388setColor8_81llA(j13);
                m1138drawHighlightLepunE(canvas, textFieldValue.m4807getSelectiond9O1mEE(), offsetMapping, textLayoutResult, paint);
            }
            TextPainter.INSTANCE.paint(canvas, textLayoutResult);
        }

        @o
        @k
        /* renamed from: layout-_EkL_-Y$foundation_release, reason: not valid java name */
        public final Triple<Integer, Integer, TextLayoutResult> m1142layout_EkL_Y$foundation_release(@k TextDelegate textDelegate, long j11, @k LayoutDirection layoutDirection, @l TextLayoutResult textLayoutResult) {
            TextLayoutResult m1129layoutNN6EwU = textDelegate.m1129layoutNN6EwU(j11, layoutDirection, textLayoutResult);
            return new Triple<>(Integer.valueOf((int) (m1129layoutNN6EwU.m4530getSizeYbymL2g() >> 32)), Integer.valueOf((int) (m1129layoutNN6EwU.m4530getSizeYbymL2g() & 4294967295L)), m1129layoutNN6EwU);
        }

        @o
        public final void notifyFocusedRect$foundation_release(@k TextFieldValue textFieldValue, @k TextDelegate textDelegate, @k TextLayoutResult textLayoutResult, @k LayoutCoordinates layoutCoordinates, @k TextInputSession textInputSession, boolean z11, @k OffsetMapping offsetMapping) {
            if (z11) {
                int originalToTransformed = offsetMapping.originalToTransformed(TextRange.m4556getMaximpl(textFieldValue.m4807getSelectiond9O1mEE()));
                Rect boundingBox = originalToTransformed < textLayoutResult.getLayoutInput().getText().length() ? textLayoutResult.getBoundingBox(originalToTransformed) : originalToTransformed != 0 ? textLayoutResult.getBoundingBox(originalToTransformed - 1) : new Rect(0.0f, 0.0f, 1.0f, (int) (TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), null, 0, 24, null) & 4294967295L));
                long mo3868localToRootMKHz9U = layoutCoordinates.mo3868localToRootMKHz9U(Offset.m2260constructorimpl((Float.floatToRawIntBits(boundingBox.getTop()) & 4294967295L) | (Float.floatToRawIntBits(boundingBox.getLeft()) << 32)));
                textInputSession.notifyFocusedRect(RectKt.m2308Recttz77jQw(Offset.m2260constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (mo3868localToRootMKHz9U & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (mo3868localToRootMKHz9U >> 32))) << 32)), Size.m2328constructorimpl((Float.floatToRawIntBits(boundingBox.getBottom() - boundingBox.getTop()) & 4294967295L) | (Float.floatToRawIntBits(boundingBox.getRight() - boundingBox.getLeft()) << 32))));
            }
        }

        @o
        public final void onBlur$foundation_release(@k TextInputSession textInputSession, @k EditProcessor editProcessor, @k x00.l<? super TextFieldValue, g2> lVar) {
            lVar.invoke(TextFieldValue.m4802copy3r_uNRQ$default(editProcessor.toTextFieldValue(), (AnnotatedString) null, 0L, (TextRange) null, 3, (Object) null));
            textInputSession.dispose();
        }

        @o
        public final void onEditCommand$foundation_release(@k List<? extends EditCommand> list, @k EditProcessor editProcessor, @k x00.l<? super TextFieldValue, g2> lVar, @l TextInputSession textInputSession) {
            TextFieldValue apply = editProcessor.apply(list);
            if (textInputSession != null) {
                textInputSession.updateState(null, apply);
            }
            lVar.invoke(apply);
        }

        @o
        @k
        public final TextInputSession onFocus$foundation_release(@k TextInputService textInputService, @k TextFieldValue textFieldValue, @k EditProcessor editProcessor, @k ImeOptions imeOptions, @k x00.l<? super TextFieldValue, g2> lVar, @k x00.l<? super ImeAction, g2> lVar2) {
            return restartInput$foundation_release(textInputService, textFieldValue, editProcessor, imeOptions, lVar, lVar2);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [T, androidx.compose.ui.text.input.TextInputSession] */
        @o
        @k
        public final TextInputSession restartInput$foundation_release(@k TextInputService textInputService, @k TextFieldValue textFieldValue, @k final EditProcessor editProcessor, @k ImeOptions imeOptions, @k final x00.l<? super TextFieldValue, g2> lVar, @k x00.l<? super ImeAction, g2> lVar2) {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? startInput = textInputService.startInput(textFieldValue, imeOptions, new x00.l<List<? extends EditCommand>, g2>() { // from class: androidx.compose.foundation.text.TextFieldDelegate$Companion$restartInput$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(List<? extends EditCommand> list) {
                    invoke2(list);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(List<? extends EditCommand> list) {
                    TextFieldDelegate.Companion.onEditCommand$foundation_release(list, EditProcessor.this, lVar, objectRef.element);
                }
            }, lVar2);
            objectRef.element = startInput;
            return startInput;
        }

        @o
        /* renamed from: setCursorOffset-ULxng0E$foundation_release, reason: not valid java name */
        public final void m1143setCursorOffsetULxng0E$foundation_release(long j11, @k TextLayoutResultProxy textLayoutResultProxy, @k EditProcessor editProcessor, @k OffsetMapping offsetMapping, @k x00.l<? super TextFieldValue, g2> lVar) {
            lVar.invoke(TextFieldValue.m4802copy3r_uNRQ$default(editProcessor.toTextFieldValue(), (AnnotatedString) null, TextRangeKt.TextRange(offsetMapping.transformedToOriginal(TextLayoutResultProxy.m1165getOffsetForPosition3MmeM6k$default(textLayoutResultProxy, j11, false, 2, null))), (TextRange) null, 5, (Object) null));
        }

        @o
        public final void updateTextLayoutResult$foundation_release(@k TextInputSession textInputSession, @k TextFieldValue textFieldValue, @k OffsetMapping offsetMapping, @k TextLayoutResultProxy textLayoutResultProxy) {
            LayoutCoordinates decorationBoxCoordinates;
            final LayoutCoordinates innerTextFieldCoordinates = textLayoutResultProxy.getInnerTextFieldCoordinates();
            if (innerTextFieldCoordinates == null || !innerTextFieldCoordinates.isAttached() || (decorationBoxCoordinates = textLayoutResultProxy.getDecorationBoxCoordinates()) == null) {
                return;
            }
            textInputSession.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResultProxy.getValue(), new x00.l<Matrix, g2>() { // from class: androidx.compose.foundation.text.TextFieldDelegate$Companion$updateTextLayoutResult$1$1$1
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Matrix matrix) {
                    m1144invoke58bKbWc(matrix.m2762unboximpl());
                    return g2.f100423a;
                }

                /* renamed from: invoke-58bKbWc, reason: not valid java name */
                public final void m1144invoke58bKbWc(float[] fArr) {
                    if (LayoutCoordinates.this.isAttached()) {
                        LayoutCoordinatesKt.findRootCoordinates(LayoutCoordinates.this).mo3872transformFromEL8BTi8(LayoutCoordinates.this, fArr);
                    }
                }
            }, SelectionManagerKt.visibleBounds(innerTextFieldCoordinates), innerTextFieldCoordinates.localBoundingBoxOf(decorationBoxCoordinates, false));
        }

        private Companion() {
        }
    }
}
