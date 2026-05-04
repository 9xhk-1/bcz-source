package androidx.compose.foundation.text;

import androidx.emoji2.text.EmojiCompat;
import java.text.BreakIterator;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nStringHelpers.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringHelpers.android.kt\nandroidx/compose/foundation/text/StringHelpers_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
/* loaded from: classes.dex */
public final class StringHelpers_androidKt {
    public static final int findFollowingBreak(@k String str, int i11) {
        EmojiCompat emojiCompatIfLoaded = getEmojiCompatIfLoaded();
        Integer num = null;
        if (emojiCompatIfLoaded != null) {
            Integer valueOf = Integer.valueOf(emojiCompatIfLoaded.getEmojiEnd(str, i11));
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i11);
    }

    public static final int findPrecedingBreak(@k String str, int i11) {
        EmojiCompat emojiCompatIfLoaded = getEmojiCompatIfLoaded();
        Integer num = null;
        if (emojiCompatIfLoaded != null) {
            Integer valueOf = Integer.valueOf(emojiCompatIfLoaded.getEmojiStart(str, Math.max(0, i11 - 1)));
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i11);
    }

    private static final EmojiCompat getEmojiCompatIfLoaded() {
        if (EmojiCompat.isConfigured()) {
            EmojiCompat emojiCompat = EmojiCompat.get();
            if (emojiCompat.getLoadState() == 1) {
                return emojiCompat;
            }
        }
        return null;
    }
}
