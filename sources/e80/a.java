package e80;

import java.util.Collection;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class a {
    public static void a(boolean z11, String str) {
        if (!z11) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void b(boolean z11, String str, Object obj) {
        if (!z11) {
            throw new IllegalArgumentException(String.format(str, obj));
        }
    }

    public static void c(boolean z11, String str, Object... objArr) {
        if (!z11) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static <T extends CharSequence> T d(T t11, String str) {
        if (t11 == null) {
            throw new IllegalArgumentException(str + " may not be null");
        }
        if (t11.length() == 0) {
            throw new IllegalArgumentException(str + " may not be empty");
        }
        if (!i.a(t11)) {
            return t11;
        }
        throw new IllegalArgumentException(str + " may not contain blanks");
    }

    public static <T extends CharSequence> T e(T t11, String str) {
        if (t11 == null) {
            throw new IllegalArgumentException(str + " may not be null");
        }
        if (!i.b(t11)) {
            return t11;
        }
        throw new IllegalArgumentException(str + " may not be blank");
    }

    public static <T extends CharSequence> T f(T t11, String str) {
        if (t11 == null) {
            throw new IllegalArgumentException(str + " may not be null");
        }
        if (!i.c(t11)) {
            return t11;
        }
        throw new IllegalArgumentException(str + " may not be empty");
    }

    public static <E, T extends Collection<E>> T g(T t11, String str) {
        if (t11 == null) {
            throw new IllegalArgumentException(str + " may not be null");
        }
        if (!t11.isEmpty()) {
            return t11;
        }
        throw new IllegalArgumentException(str + " may not be empty");
    }

    public static int h(int i11, String str) {
        if (i11 >= 0) {
            return i11;
        }
        throw new IllegalArgumentException(str + " may not be negative");
    }

    public static long i(long j11, String str) {
        if (j11 >= 0) {
            return j11;
        }
        throw new IllegalArgumentException(str + " may not be negative");
    }

    public static <T> T j(T t11, String str) {
        if (t11 != null) {
            return t11;
        }
        throw new IllegalArgumentException(str + " may not be null");
    }

    public static int k(int i11, String str) {
        if (i11 > 0) {
            return i11;
        }
        throw new IllegalArgumentException(str + " may not be negative or zero");
    }

    public static long l(long j11, String str) {
        if (j11 > 0) {
            return j11;
        }
        throw new IllegalArgumentException(str + " may not be negative or zero");
    }
}
