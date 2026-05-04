package androidx.compose.foundation.text.modifiers;

import m80.k;
import u30.f0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class MinLinesConstrainerKt {
    private static final int DefaultWidthCharCount = 10;

    @k
    private static final String EmptyTextReplacement;

    @k
    private static final String TwoLineTextReplacement;

    static {
        String v22 = f0.v2("H", 10);
        EmptyTextReplacement = v22;
        TwoLineTextReplacement = v22 + '\n' + v22;
    }
}
