package androidx.compose.foundation.text;

import android.R;
import android.os.Build;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.res.StringResources_androidKt;
import m80.k;
import m80.l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class TextContextMenuItems {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ TextContextMenuItems[] $VALUES;
    public static final TextContextMenuItems Autofill;
    private final int stringId;
    public static final TextContextMenuItems Cut = new TextContextMenuItems("Cut", 0, R.string.cut);
    public static final TextContextMenuItems Copy = new TextContextMenuItems("Copy", 1, R.string.copy);
    public static final TextContextMenuItems Paste = new TextContextMenuItems("Paste", 2, R.string.paste);
    public static final TextContextMenuItems SelectAll = new TextContextMenuItems("SelectAll", 3, R.string.selectAll);

    private static final /* synthetic */ TextContextMenuItems[] $values() {
        return new TextContextMenuItems[]{Cut, Copy, Paste, SelectAll, Autofill};
    }

    static {
        Autofill = new TextContextMenuItems("Autofill", 4, Build.VERSION.SDK_INT <= 26 ? androidx.compose.foundation.R.string.autofill : R.string.autofill);
        TextContextMenuItems[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private TextContextMenuItems(String str, int i11, int i12) {
        this.stringId = i12;
    }

    @k
    public static m00.a<TextContextMenuItems> getEntries() {
        return $ENTRIES;
    }

    public static TextContextMenuItems valueOf(String str) {
        return (TextContextMenuItems) Enum.valueOf(TextContextMenuItems.class, str);
    }

    public static TextContextMenuItems[] values() {
        return (TextContextMenuItems[]) $VALUES.clone();
    }

    @Composable
    @ReadOnlyComposable
    @k
    public final String resolvedString(@l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-309609081, i11, -1, "androidx.compose.foundation.text.TextContextMenuItems.resolvedString (ContextMenu.android.kt:131)");
        }
        String stringResource = StringResources_androidKt.stringResource(this.stringId, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stringResource;
    }
}
