package androidx.compose.ui.platform;

import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface Clipboard {
    @m80.l
    Object getClipEntry(@m80.k j00.c<? super ClipEntry> cVar);

    @m80.k
    android.content.ClipboardManager getNativeClipboard();

    @m80.l
    Object setClipEntry(@m80.l ClipEntry clipEntry, @m80.k j00.c<? super g2> cVar);
}
