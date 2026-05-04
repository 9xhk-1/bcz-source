package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
final class EmojiInputConnection extends InputConnectionWrapper {
    private final EmojiCompatDeleteHelper mEmojiCompatDeleteHelper;
    private final TextView mTextView;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EmojiCompatDeleteHelper {
        public boolean handleDeleteSurroundingText(@NonNull InputConnection inputConnection, @NonNull Editable editable, @IntRange(from = 0) int i11, @IntRange(from = 0) int i12, boolean z11) {
            return EmojiCompat.handleDeleteSurroundingText(inputConnection, editable, i11, i12, z11);
        }

        public void updateEditorInfoAttrs(@NonNull EditorInfo editorInfo) {
            if (EmojiCompat.isConfigured()) {
                EmojiCompat.get().updateEditorInfo(editorInfo);
            }
        }
    }

    public EmojiInputConnection(@NonNull TextView textView, @NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new EmojiCompatDeleteHelper());
    }

    private Editable getEditable() {
        return this.mTextView.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i11, int i12) {
        return this.mEmojiCompatDeleteHelper.handleDeleteSurroundingText(this, getEditable(), i11, i12, false) || super.deleteSurroundingText(i11, i12);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i11, int i12) {
        return this.mEmojiCompatDeleteHelper.handleDeleteSurroundingText(this, getEditable(), i11, i12, true) || super.deleteSurroundingTextInCodePoints(i11, i12);
    }

    public EmojiInputConnection(@NonNull TextView textView, @NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo, @NonNull EmojiCompatDeleteHelper emojiCompatDeleteHelper) {
        super(inputConnection, false);
        this.mTextView = textView;
        this.mEmojiCompatDeleteHelper = emojiCompatDeleteHelper;
        emojiCompatDeleteHelper.updateEditorInfoAttrs(editorInfo);
    }
}
