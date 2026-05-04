package androidx.compose.ui.platform;

import androidx.compose.ui.text.AnnotatedString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.n(message = "Use Clipboard instead, which supports suspend functions.", replaceWith = @yz.w0(expression = "Clipboard", imports = {"androidx.compose.ui.platform.Clipboard"}))
/* loaded from: classes2.dex */
public interface ClipboardManager {
    @m80.l
    default ClipEntry getClip() {
        return null;
    }

    @m80.k
    default android.content.ClipboardManager getNativeClipboard() {
        throw new UnsupportedOperationException("This platform does not offer a native Clipboard");
    }

    @m80.l
    AnnotatedString getText();

    default boolean hasText() {
        AnnotatedString text = getText();
        return text != null && text.length() > 0;
    }

    void setText(@m80.k AnnotatedString annotatedString);

    default void setClip(@m80.l ClipEntry clipEntry) {
    }
}
