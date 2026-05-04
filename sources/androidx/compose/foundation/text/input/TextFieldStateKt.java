package androidx.compose.foundation.text.input;

import a00.g0;
import a00.h0;
import a00.r0;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.List;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,765:1\n1247#2,6:766\n170#3,8:772\n170#3,8:780\n170#3,8:788\n519#4:796\n*S KotlinDebug\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldStateKt\n*L\n645#1:766,6\n665#1:772,8\n689#1:780,8\n711#1:788,8\n728#1:796\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldStateKt {
    public static final void clearText(@k TextFieldState textFieldState) {
        TextFieldBuffer startEdit = textFieldState.startEdit();
        try {
            TextFieldBufferKt.delete(startEdit, 0, startEdit.getLength());
            TextFieldBufferKt.placeCursorAtEnd(startEdit);
            textFieldState.commitEdit(startEdit);
        } finally {
            textFieldState.finishEditing();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: finalizeComposingAnnotations-itr0ztk, reason: not valid java name */
    public static final List<AnnotatedString.Range<AnnotatedString.Annotation>> m1193finalizeComposingAnnotationsitr0ztk(TextRange textRange, MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> mutableVector) {
        return (mutableVector == null || mutableVector.getSize() == 0) ? (textRange == null || TextRange.m4553getCollapsedimpl(textRange.m4563unboximpl())) ? h0.J() : g0.l(new AnnotatedString.Range(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Companion.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (v) null), TextRange.m4557getMinimpl(textRange.m4563unboximpl()), TextRange.m4556getMaximpl(textRange.m4563unboximpl()))) : r0.a6(mutableVector.asMutableList());
    }

    @Composable
    @k
    /* renamed from: rememberTextFieldState-Le-punE, reason: not valid java name */
    public static final TextFieldState m1194rememberTextFieldStateLepunE(@l final String str, final long j11, @l Composer composer, int i11, int i12) {
        if ((i12 & 1) != 0) {
            str = "";
        }
        if ((i12 & 2) != 0) {
            j11 = TextRangeKt.TextRange(str.length());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1125389485, i11, -1, "androidx.compose.foundation.text.input.rememberTextFieldState (TextFieldState.kt:644)");
        }
        Object[] objArr = new Object[0];
        TextFieldState.Saver saver = TextFieldState.Saver.INSTANCE;
        boolean z11 = ((((i11 & 14) ^ 6) > 4 && composer.changed(str)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && composer.changed(j11)) || (i11 & 48) == 32);
        Object rememberedValue = composer.rememberedValue();
        if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new a<TextFieldState>() { // from class: androidx.compose.foundation.text.input.TextFieldStateKt$rememberTextFieldState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final TextFieldState invoke() {
                    return new TextFieldState(str, j11, (v) null);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        TextFieldState textFieldState = (TextFieldState) RememberSaveableKt.m2066rememberSaveable(objArr, (Saver) saver, (String) null, (a) rememberedValue, composer, 48, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldState;
    }

    public static final void setTextAndPlaceCursorAtEnd(@k TextFieldState textFieldState, @k String str) {
        TextFieldBuffer startEdit = textFieldState.startEdit();
        try {
            startEdit.replace(0, startEdit.getLength(), str);
            TextFieldBufferKt.placeCursorAtEnd(startEdit);
            textFieldState.commitEdit(startEdit);
        } finally {
            textFieldState.finishEditing();
        }
    }

    public static final void setTextAndSelectAll(@k TextFieldState textFieldState, @k String str) {
        TextFieldBuffer startEdit = textFieldState.startEdit();
        try {
            startEdit.replace(0, startEdit.getLength(), str);
            TextFieldBufferKt.selectAll(startEdit);
            textFieldState.commitEdit(startEdit);
        } finally {
            textFieldState.finishEditing();
        }
    }

    @k
    public static final TextFieldBuffer toTextFieldBuffer(@k TextFieldState textFieldState) {
        return new TextFieldBuffer(textFieldState.getValue$foundation_release(), null, null, null, 14, null);
    }
}
