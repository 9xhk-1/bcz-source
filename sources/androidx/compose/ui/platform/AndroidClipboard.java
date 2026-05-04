package androidx.compose.ui.platform;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class AndroidClipboard implements Clipboard {
    public static final int $stable = 8;

    @m80.k
    private final AndroidClipboardManager androidClipboardManager;

    public AndroidClipboard(@m80.k AndroidClipboardManager androidClipboardManager) {
        this.androidClipboardManager = androidClipboardManager;
    }

    @Override // androidx.compose.ui.platform.Clipboard
    @m80.l
    public Object getClipEntry(@m80.k j00.c<? super ClipEntry> cVar) {
        return this.androidClipboardManager.getClip();
    }

    @Override // androidx.compose.ui.platform.Clipboard
    @m80.k
    public android.content.ClipboardManager getNativeClipboard() {
        return this.androidClipboardManager.getNativeClipboard();
    }

    @Override // androidx.compose.ui.platform.Clipboard
    @m80.l
    public Object setClipEntry(@m80.l ClipEntry clipEntry, @m80.k j00.c<? super g2> cVar) {
        this.androidClipboardManager.setClip(clipEntry);
        return g2.f100423a;
    }

    public AndroidClipboard(@m80.k Context context) {
        this(new AndroidClipboardManager(context));
    }
}
