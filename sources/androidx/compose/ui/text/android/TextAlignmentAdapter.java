package androidx.compose.ui.text.android;

import android.text.Layout;
import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class TextAlignmentAdapter {
    public static final int $stable = 0;

    @m80.k
    private static final Layout.Alignment ALIGN_LEFT_FRAMEWORK;

    @m80.k
    private static final Layout.Alignment ALIGN_RIGHT_FRAMEWORK;

    @m80.k
    public static final TextAlignmentAdapter INSTANCE = new TextAlignmentAdapter();

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (kotlin.jvm.internal.g0.g(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (kotlin.jvm.internal.g0.g(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        ALIGN_LEFT_FRAMEWORK = alignment;
        ALIGN_RIGHT_FRAMEWORK = alignment2;
    }

    private TextAlignmentAdapter() {
    }

    @m80.k
    public final Layout.Alignment get(int i11) {
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? Layout.Alignment.ALIGN_NORMAL : ALIGN_RIGHT_FRAMEWORK : ALIGN_LEFT_FRAMEWORK : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
    }
}
