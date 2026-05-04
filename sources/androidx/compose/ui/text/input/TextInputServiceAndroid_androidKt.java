package androidx.compose.ui.text.input;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.emoji2.text.EmojiCompat;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTextInputServiceAndroid.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextInputServiceAndroid.android.kt\nandroidx/compose/ui/text/input/TextInputServiceAndroid_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,586:1\n1#2:587\n*E\n"})
/* loaded from: classes2.dex */
public final class TextInputServiceAndroid_androidKt {

    @k
    private static final String DEBUG_CLASS = "TextInputServiceAndroid";

    @k
    public static final Executor asExecutor(@k final Choreographer choreographer) {
        return new Executor() { // from class: androidx.compose.ui.text.input.e
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                TextInputServiceAndroid_androidKt.asExecutor$lambda$2(choreographer, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asExecutor$lambda$2(Choreographer choreographer, final Runnable runnable) {
        choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.compose.ui.text.input.d
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j11) {
                runnable.run();
            }
        });
    }

    private static final boolean hasFlag(int i11, int i12) {
        return (i11 & i12) == i12;
    }

    public static final void update(@k EditorInfo editorInfo, @k ImeOptions imeOptions, @k TextFieldValue textFieldValue) {
        String privateImeOptions;
        int m4754getImeActioneUduSuo = imeOptions.m4754getImeActioneUduSuo();
        ImeAction.Companion companion = ImeAction.Companion;
        int i11 = 6;
        if (ImeAction.m4725equalsimpl0(m4754getImeActioneUduSuo, companion.m4738getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i11 = 0;
            }
        } else if (ImeAction.m4725equalsimpl0(m4754getImeActioneUduSuo, companion.m4742getNoneeUduSuo())) {
            i11 = 1;
        } else if (ImeAction.m4725equalsimpl0(m4754getImeActioneUduSuo, companion.m4740getGoeUduSuo())) {
            i11 = 2;
        } else if (ImeAction.m4725equalsimpl0(m4754getImeActioneUduSuo, companion.m4741getNexteUduSuo())) {
            i11 = 5;
        } else if (ImeAction.m4725equalsimpl0(m4754getImeActioneUduSuo, companion.m4743getPreviouseUduSuo())) {
            i11 = 7;
        } else if (ImeAction.m4725equalsimpl0(m4754getImeActioneUduSuo, companion.m4744getSearcheUduSuo())) {
            i11 = 3;
        } else if (ImeAction.m4725equalsimpl0(m4754getImeActioneUduSuo, companion.m4745getSendeUduSuo())) {
            i11 = 4;
        } else if (!ImeAction.m4725equalsimpl0(m4754getImeActioneUduSuo, companion.m4739getDoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i11;
        PlatformImeOptions platformImeOptions = imeOptions.getPlatformImeOptions();
        if (platformImeOptions != null && (privateImeOptions = platformImeOptions.getPrivateImeOptions()) != null) {
            editorInfo.privateImeOptions = privateImeOptions;
        }
        int m4755getKeyboardTypePjHm6EE = imeOptions.m4755getKeyboardTypePjHm6EE();
        KeyboardType.Companion companion2 = KeyboardType.Companion;
        if (KeyboardType.m4778equalsimpl0(m4755getKeyboardTypePjHm6EE, companion2.m4799getTextPjHm6EE())) {
            editorInfo.inputType = 1;
        } else if (KeyboardType.m4778equalsimpl0(m4755getKeyboardTypePjHm6EE, companion2.m4792getAsciiPjHm6EE())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (KeyboardType.m4778equalsimpl0(m4755getKeyboardTypePjHm6EE, companion2.m4795getNumberPjHm6EE())) {
            editorInfo.inputType = 2;
        } else if (KeyboardType.m4778equalsimpl0(m4755getKeyboardTypePjHm6EE, companion2.m4798getPhonePjHm6EE())) {
            editorInfo.inputType = 3;
        } else if (KeyboardType.m4778equalsimpl0(m4755getKeyboardTypePjHm6EE, companion2.m4801getUriPjHm6EE())) {
            editorInfo.inputType = 17;
        } else if (KeyboardType.m4778equalsimpl0(m4755getKeyboardTypePjHm6EE, companion2.m4794getEmailPjHm6EE())) {
            editorInfo.inputType = 33;
        } else if (KeyboardType.m4778equalsimpl0(m4755getKeyboardTypePjHm6EE, companion2.m4797getPasswordPjHm6EE())) {
            editorInfo.inputType = 129;
        } else if (KeyboardType.m4778equalsimpl0(m4755getKeyboardTypePjHm6EE, companion2.m4796getNumberPasswordPjHm6EE())) {
            editorInfo.inputType = 18;
        } else {
            if (!KeyboardType.m4778equalsimpl0(m4755getKeyboardTypePjHm6EE, companion2.m4793getDecimalPjHm6EE())) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            editorInfo.inputType = 8194;
        }
        if (!imeOptions.getSingleLine() && hasFlag(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (ImeAction.m4725equalsimpl0(imeOptions.m4754getImeActioneUduSuo(), companion.m4738getDefaulteUduSuo())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (hasFlag(editorInfo.inputType, 1)) {
            int m4753getCapitalizationIUNYP9k = imeOptions.m4753getCapitalizationIUNYP9k();
            KeyboardCapitalization.Companion companion3 = KeyboardCapitalization.Companion;
            if (KeyboardCapitalization.m4761equalsimpl0(m4753getCapitalizationIUNYP9k, companion3.m4770getCharactersIUNYP9k())) {
                editorInfo.inputType |= 4096;
            } else if (KeyboardCapitalization.m4761equalsimpl0(m4753getCapitalizationIUNYP9k, companion3.m4774getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (KeyboardCapitalization.m4761equalsimpl0(m4753getCapitalizationIUNYP9k, companion3.m4772getSentencesIUNYP9k())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = TextRange.m4559getStartimpl(textFieldValue.m4807getSelectiond9O1mEE());
        editorInfo.initialSelEnd = TextRange.m4554getEndimpl(textFieldValue.m4807getSelectiond9O1mEE());
        EditorInfoCompat.setInitialSurroundingText(editorInfo, textFieldValue.getText());
        editorInfo.imeOptions |= 33554432;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateWithEmojiCompat(EditorInfo editorInfo) {
        if (EmojiCompat.isConfigured()) {
            EmojiCompat.get().updateEditorInfo(editorInfo);
        }
    }
}
