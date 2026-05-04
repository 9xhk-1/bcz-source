package ho;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f59622a = e();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements g0 {
        public b() {
        }

        @Override // ho.g0
        public g a(String pattern) {
            return new z(Pattern.compile(pattern));
        }

        @Override // ho.g0
        public boolean b() {
            return true;
        }
    }

    public static g a(String pattern) {
        Preconditions.checkNotNull(pattern);
        return f59622a.a(pattern);
    }

    @CheckForNull
    public static String b(@CheckForNull String string) {
        if (i(string)) {
            return null;
        }
        return string;
    }

    public static String c(double value) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(value));
    }

    public static <T extends Enum<T>> Optional<T> d(Class<T> enumClass, String value) {
        WeakReference<? extends Enum<?>> weakReference = k.a(enumClass).get(value);
        return weakReference == null ? Optional.absent() : Optional.fromNullable(enumClass.cast(weakReference.get()));
    }

    public static g0 e() {
        return new b();
    }

    public static String f(@CheckForNull String string) {
        return string == null ? "" : string;
    }

    public static boolean g() {
        return f59622a.b();
    }

    public static d h(d matcher) {
        return matcher.K();
    }

    public static boolean i(@CheckForNull String string) {
        return string == null || string.isEmpty();
    }
}
