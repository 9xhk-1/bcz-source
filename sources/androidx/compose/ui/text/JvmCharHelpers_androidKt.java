package androidx.compose.ui.text;

import java.text.BreakIterator;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class JvmCharHelpers_androidKt {
    public static final int findFollowingBreak(@k String str, int i11) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i11);
    }

    public static final int findPrecedingBreak(@k String str, int i11) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i11);
    }
}
