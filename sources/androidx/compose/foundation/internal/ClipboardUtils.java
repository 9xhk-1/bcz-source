package androidx.compose.foundation.internal;

import android.content.ClipData;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.text.AnnotatedString;
import m80.k;
import m80.l;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class ClipboardUtils {
    public static final int $stable = 0;

    @k
    public static final ClipboardUtils INSTANCE = new ClipboardUtils();

    private ClipboardUtils() {
    }

    @o
    public static final boolean hasText(@l ClipEntry clipEntry) {
        if (clipEntry == null) {
            return false;
        }
        return clipEntry.getClipData().getDescription().hasMimeType("text/*");
    }

    @l
    @o
    public static final AnnotatedString readAnnotatedString(@k ClipEntry clipEntry) {
        CharSequence text;
        ClipData.Item itemAt = clipEntry.getClipData().getItemAt(0);
        if (itemAt == null || (text = itemAt.getText()) == null) {
            return null;
        }
        return ClipboardUtils_androidKt.convertToAnnotatedString(text);
    }

    @l
    @o
    public static final String readText(@k ClipEntry clipEntry) {
        CharSequence text;
        ClipData.Item itemAt = clipEntry.getClipData().getItemAt(0);
        if (itemAt == null || (text = itemAt.getText()) == null) {
            return null;
        }
        return text.toString();
    }

    @l
    @o
    public static final ClipEntry toClipEntry(@l AnnotatedString annotatedString) {
        if (annotatedString == null) {
            return null;
        }
        return new ClipEntry(ClipData.newPlainText("plain text", ClipboardUtils_androidKt.convertToCharSequence(annotatedString)));
    }
}
