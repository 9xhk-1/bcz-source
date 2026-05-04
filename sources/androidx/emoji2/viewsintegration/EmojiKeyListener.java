package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
final class EmojiKeyListener implements KeyListener {
    private final EmojiCompatHandleKeyDownHelper mEmojiCompatHandleKeyDownHelper;
    private final KeyListener mKeyListener;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EmojiCompatHandleKeyDownHelper {
        public boolean handleKeyDown(@NonNull Editable editable, int i11, @NonNull KeyEvent keyEvent) {
            return EmojiCompat.handleOnKeyDown(editable, i11, keyEvent);
        }
    }

    public EmojiKeyListener(KeyListener keyListener) {
        this(keyListener, new EmojiCompatHandleKeyDownHelper());
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i11) {
        this.mKeyListener.clearMetaKeyState(view, editable, i11);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.mKeyListener.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i11, KeyEvent keyEvent) {
        return this.mEmojiCompatHandleKeyDownHelper.handleKeyDown(editable, i11, keyEvent) || this.mKeyListener.onKeyDown(view, editable, i11, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.mKeyListener.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i11, KeyEvent keyEvent) {
        return this.mKeyListener.onKeyUp(view, editable, i11, keyEvent);
    }

    public EmojiKeyListener(KeyListener keyListener, EmojiCompatHandleKeyDownHelper emojiCompatHandleKeyDownHelper) {
        this.mKeyListener = keyListener;
        this.mEmojiCompatHandleKeyDownHelper = emojiCompatHandleKeyDownHelper;
    }
}
