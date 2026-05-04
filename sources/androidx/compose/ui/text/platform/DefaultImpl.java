package androidx.compose.ui.text.platform;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.emoji2.text.EmojiCompat;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class DefaultImpl implements EmojiCompatStatusDelegate {

    @l
    private State<Boolean> loadState;

    public DefaultImpl() {
        this.loadState = EmojiCompat.isConfigured() ? getFontLoadState() : null;
    }

    private final State<Boolean> getFontLoadState() {
        EmojiCompat emojiCompat = EmojiCompat.get();
        if (emojiCompat.getLoadState() == 1) {
            return new ImmutableBool(true);
        }
        final MutableState mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        emojiCompat.registerInitCallback(new EmojiCompat.InitCallback() { // from class: androidx.compose.ui.text.platform.DefaultImpl$getFontLoadState$initCallback$1
            @Override // androidx.emoji2.text.EmojiCompat.InitCallback
            public void onFailed(Throwable th2) {
                ImmutableBool immutableBool;
                DefaultImpl defaultImpl = this;
                immutableBool = EmojiCompatStatus_androidKt.Falsey;
                defaultImpl.loadState = immutableBool;
            }

            @Override // androidx.emoji2.text.EmojiCompat.InitCallback
            public void onInitialized() {
                mutableStateOf$default.setValue(Boolean.TRUE);
                this.loadState = new ImmutableBool(true);
            }
        });
        return mutableStateOf$default;
    }

    @Override // androidx.compose.ui.text.platform.EmojiCompatStatusDelegate
    @k
    public State<Boolean> getFontLoaded() {
        ImmutableBool immutableBool;
        State<Boolean> state = this.loadState;
        if (state != null) {
            g0.m(state);
            return state;
        }
        if (!EmojiCompat.isConfigured()) {
            immutableBool = EmojiCompatStatus_androidKt.Falsey;
            return immutableBool;
        }
        State<Boolean> fontLoadState = getFontLoadState();
        this.loadState = fontLoadState;
        g0.m(fontLoadState);
        return fontLoadState;
    }
}
