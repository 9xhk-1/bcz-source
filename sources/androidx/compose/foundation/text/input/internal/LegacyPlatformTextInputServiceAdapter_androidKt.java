package androidx.compose.foundation.text.input.internal;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import androidx.annotation.VisibleForTesting;
import androidx.emoji2.text.EmojiCompat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class LegacyPlatformTextInputServiceAdapter_androidKt {

    @m80.k
    private static final String DEBUG_CLASS = "AndroidLegacyPlatformTextInputServiceAdapter";

    @m80.k
    private static x00.l<? super View, ? extends InputMethodManager> inputMethodManagerFactory = LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1.INSTANCE;

    @m80.k
    public static final LegacyPlatformTextInputServiceAdapter createLegacyPlatformTextInputServiceAdapter() {
        return new AndroidLegacyPlatformTextInputServiceAdapter();
    }

    @m80.k
    public static final x00.l<View, InputMethodManager> getInputMethodManagerFactory() {
        return inputMethodManagerFactory;
    }

    public static final void setInputMethodManagerFactory(@m80.k x00.l<? super View, ? extends InputMethodManager> lVar) {
        inputMethodManagerFactory = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateWithEmojiCompat(EditorInfo editorInfo) {
        if (EmojiCompat.isConfigured()) {
            EmojiCompat.get().updateEditorInfo(editorInfo);
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getInputMethodManagerFactory$annotations() {
    }
}
