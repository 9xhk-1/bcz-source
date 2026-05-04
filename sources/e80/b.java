package e80;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class b {
    public static void a(boolean z11, String str) {
        if (!z11) {
            throw new IllegalStateException(str);
        }
    }

    public static void b(boolean z11, String str, Object obj) {
        if (!z11) {
            throw new IllegalStateException(String.format(str, obj));
        }
    }

    public static void c(boolean z11, String str, Object... objArr) {
        if (!z11) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static void d(CharSequence charSequence, String str) {
        if (i.b(charSequence)) {
            throw new IllegalStateException(str + " is blank");
        }
    }

    public static void e(CharSequence charSequence, String str) {
        if (i.c(charSequence)) {
            throw new IllegalStateException(str + " is empty");
        }
    }

    public static void f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(str + " is null");
    }
}
