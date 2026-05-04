package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import h10.i;
import m80.k;
import x00.l;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class TextFieldKeyInputKt {
    @k
    /* renamed from: textFieldKeyInput-2WJ9YEU, reason: not valid java name */
    public static final Modifier m1150textFieldKeyInput2WJ9YEU(@k Modifier modifier, @k final LegacyTextFieldState legacyTextFieldState, @k final TextFieldSelectionManager textFieldSelectionManager, @k final TextFieldValue textFieldValue, @k final l<? super TextFieldValue, g2> lVar, final boolean z11, final boolean z12, @k final OffsetMapping offsetMapping, @k final UndoManager undoManager, final int i11) {
        return ComposedModifierKt.composed$default(modifier, null, new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.TextFieldKeyInputKt$textFieldKeyInput$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i12) {
                composer.startReplaceGroup(851809892);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(851809892, i12, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:252)");
                }
                Object rememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.Companion;
                if (rememberedValue == companion.getEmpty()) {
                    rememberedValue = new TextPreparedSelectionState();
                    composer.updateRememberedValue(rememberedValue);
                }
                TextPreparedSelectionState textPreparedSelectionState = (TextPreparedSelectionState) rememberedValue;
                Object rememberedValue2 = composer.rememberedValue();
                if (rememberedValue2 == companion.getEmpty()) {
                    rememberedValue2 = new DeadKeyCombiner();
                    composer.updateRememberedValue(rememberedValue2);
                }
                TextFieldKeyInput textFieldKeyInput = new TextFieldKeyInput(LegacyTextFieldState.this, textFieldSelectionManager, textFieldValue, z11, z12, textPreparedSelectionState, offsetMapping, undoManager, (DeadKeyCombiner) rememberedValue2, null, lVar, i11, 512, null);
                Modifier.Companion companion2 = Modifier.Companion;
                boolean changedInstance = composer.changedInstance(textFieldKeyInput);
                Object rememberedValue3 = composer.rememberedValue();
                if (changedInstance || rememberedValue3 == companion.getEmpty()) {
                    rememberedValue3 = new TextFieldKeyInputKt$textFieldKeyInput$2$1$1(textFieldKeyInput);
                    composer.updateRememberedValue(rememberedValue3);
                }
                Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(companion2, (l) ((i) rememberedValue3));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return onKeyEvent;
            }
        }, 1, null);
    }

    /* renamed from: textFieldKeyInput-2WJ9YEU$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1151textFieldKeyInput2WJ9YEU$default(Modifier modifier, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, l lVar, boolean z11, boolean z12, OffsetMapping offsetMapping, UndoManager undoManager, int i11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            lVar = new l<TextFieldValue, g2>() { // from class: androidx.compose.foundation.text.TextFieldKeyInputKt$textFieldKeyInput$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(TextFieldValue textFieldValue2) {
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(TextFieldValue textFieldValue2) {
                    invoke2(textFieldValue2);
                    return g2.f100423a;
                }
            };
        }
        return m1150textFieldKeyInput2WJ9YEU(modifier, legacyTextFieldState, textFieldSelectionManager, textFieldValue, lVar, z11, z12, offsetMapping, undoManager, i11);
    }
}
