package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
class EmojiExclusions {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(34)
    public static class EmojiExclusions_Api34 {
        private EmojiExclusions_Api34() {
        }

        @NonNull
        @DoNotInline
        public static Set<int[]> getExclusions() {
            return EmojiExclusions_Reflections.getExclusions();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EmojiExclusions_Reflections {
        private EmojiExclusions_Reflections() {
        }

        @NonNull
        @SuppressLint({"BanUncheckedReflection"})
        public static Set<int[]> getExclusions() {
            try {
                Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
                if (invoke == null) {
                    return Collections.EMPTY_SET;
                }
                Set<int[]> set = (Set) invoke;
                Iterator<int[]> it = set.iterator();
                while (it.hasNext()) {
                    if (!(it.next() instanceof int[])) {
                        return Collections.EMPTY_SET;
                    }
                }
                return set;
            } catch (Throwable unused) {
                return Collections.EMPTY_SET;
            }
        }
    }

    private EmojiExclusions() {
    }

    @NonNull
    public static Set<int[]> getEmojiExclusions() {
        return Build.VERSION.SDK_INT >= 34 ? EmojiExclusions_Api34.getExclusions() : EmojiExclusions_Reflections.getExclusions();
    }
}
