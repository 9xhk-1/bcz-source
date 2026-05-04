package fl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class m {
    public static void a(boolean z11) {
        b(z11, "");
    }

    public static void b(boolean z11, @NonNull String str) {
        if (!z11) {
            throw new IllegalArgumentException(str);
        }
    }

    @NonNull
    public static String c(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        return str;
    }

    @NonNull
    public static <T extends Collection<Y>, Y> T d(@NonNull T t11) {
        if (t11.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        return t11;
    }

    @NonNull
    public static <T> T e(@Nullable T t11) {
        return (T) f(t11, "Argument must not be null");
    }

    @NonNull
    public static <T> T f(@Nullable T t11, @NonNull String str) {
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException(str);
    }
}
