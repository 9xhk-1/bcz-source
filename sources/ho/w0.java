package ho;

import com.google.common.base.VerifyException;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j
@go.b
/* loaded from: classes7.dex */
public final class w0 {
    public static void a(boolean expression) {
        if (!expression) {
            throw new VerifyException();
        }
    }

    public static void b(boolean expression, String errorMessageTemplate, char p12) {
        if (!expression) {
            throw new VerifyException(o0.e(errorMessageTemplate, Character.valueOf(p12)));
        }
    }

    public static void c(boolean expression, String errorMessageTemplate, char p12, char p22) {
        if (!expression) {
            throw new VerifyException(o0.e(errorMessageTemplate, Character.valueOf(p12), Character.valueOf(p22)));
        }
    }

    public static void d(boolean expression, String errorMessageTemplate, char p12, int p22) {
        if (!expression) {
            throw new VerifyException(o0.e(errorMessageTemplate, Character.valueOf(p12), Integer.valueOf(p22)));
        }
    }

    public static void e(boolean expression, String errorMessageTemplate, char p12, long p22) {
        if (!expression) {
            throw new VerifyException(o0.e(errorMessageTemplate, Character.valueOf(p12), Long.valueOf(p22)));
        }
    }

    public static void f(boolean expression, String errorMessageTemplate, char p12, @CheckForNull Object p22) {
        if (!expression) {
            throw new VerifyException(o0.e(errorMessageTemplate, Character.valueOf(p12), p22));
        }
    }

    public static void g(boolean expression, String errorMessageTemplate, int p12) {
        if (!expression) {
            throw new VerifyException(o0.e(errorMessageTemplate, Integer.valueOf(p12)));
        }
    }

    public static void h(boolean expression, String errorMessageTemplate, int p12, char p22) {
        if (!expression) {
            throw new VerifyException(o0.e(errorMessageTemplate, Integer.valueOf(p12), Character.valueOf(p22)));
        }
    }

    public static void i(boolean expression, String errorMessageTemplate, int p12, int p22) {
        if (!expression) {
            throw new VerifyException(o0.e(errorMessageTemplate, Integer.valueOf(p12), Integer.valueOf(p22)));
        }
    }

    public static void j(boolean expression, String errorMessageTemplate, int p12, long p22) {
        if (!expression) {
            throw new VerifyException(o0.e(errorMessageTemplate, Integer.valueOf(p12), Long.valueOf(p22)));
        }
    }

    public static void k(boolean expression, String errorMessageTemplate, int p12, @CheckForNull Object p22) {
        if (!expression) {
            throw new VerifyException(o0.e(errorMessageTemplate, Integer.valueOf(p12), p22));
        }
    }

    public static void l(boolean expression, String errorMessageTemplate, long p12) {
        if (!expression) {
            throw new VerifyException(o0.e(errorMessageTemplate, Long.valueOf(p12)));
        }
    }

    public static void m(boolean expression, String errorMessageTemplate, long p12, char p22) {
        if (!expression) {
            throw new VerifyException(o0.e(errorMessageTemplate, Long.valueOf(p12), Character.valueOf(p22)));
        }
    }

    public static void n(boolean expression, String errorMessageTemplate, long p12, int p22) {
        if (!expression) {
            throw new VerifyException(o0.e(errorMessageTemplate, Long.valueOf(p12), Integer.valueOf(p22)));
        }
    }

    public static void o(boolean expression, String errorMessageTemplate, long p12, long p22) {
        if (!expression) {
            throw new VerifyException(o0.e(errorMessageTemplate, Long.valueOf(p12), Long.valueOf(p22)));
        }
    }

    public static void p(boolean expression, String errorMessageTemplate, long p12, @CheckForNull Object p22) {
        if (!expression) {
            throw new VerifyException(o0.e(errorMessageTemplate, Long.valueOf(p12), p22));
        }
    }

    public static void q(boolean expression, String errorMessageTemplate, @CheckForNull Object p12) {
        if (!expression) {
            throw new VerifyException(o0.e(errorMessageTemplate, p12));
        }
    }

    public static void r(boolean expression, String errorMessageTemplate, @CheckForNull Object p12, char p22) {
        if (!expression) {
            throw new VerifyException(o0.e(errorMessageTemplate, p12, Character.valueOf(p22)));
        }
    }

    public static void s(boolean expression, String errorMessageTemplate, @CheckForNull Object p12, int p22) {
        if (!expression) {
            throw new VerifyException(o0.e(errorMessageTemplate, p12, Integer.valueOf(p22)));
        }
    }

    public static void t(boolean expression, String errorMessageTemplate, @CheckForNull Object p12, long p22) {
        if (!expression) {
            throw new VerifyException(o0.e(errorMessageTemplate, p12, Long.valueOf(p22)));
        }
    }

    public static void u(boolean expression, String errorMessageTemplate, @CheckForNull Object p12, @CheckForNull Object p22) {
        if (!expression) {
            throw new VerifyException(o0.e(errorMessageTemplate, p12, p22));
        }
    }

    public static void v(boolean expression, String errorMessageTemplate, @CheckForNull Object p12, @CheckForNull Object p22, @CheckForNull Object p32) {
        if (!expression) {
            throw new VerifyException(o0.e(errorMessageTemplate, p12, p22, p32));
        }
    }

    public static void w(boolean expression, String errorMessageTemplate, @CheckForNull Object p12, @CheckForNull Object p22, @CheckForNull Object p32, @CheckForNull Object p42) {
        if (!expression) {
            throw new VerifyException(o0.e(errorMessageTemplate, p12, p22, p32, p42));
        }
    }

    public static void x(boolean expression, String errorMessageTemplate, @CheckForNull Object... errorMessageArgs) {
        if (!expression) {
            throw new VerifyException(o0.e(errorMessageTemplate, errorMessageArgs));
        }
    }

    @uo.a
    public static <T> T y(@CheckForNull T t11) {
        return (T) z(t11, "expected a non-null reference", new Object[0]);
    }

    @uo.a
    public static <T> T z(@CheckForNull T reference, String errorMessageTemplate, @CheckForNull Object... errorMessageArgs) {
        if (reference != null) {
            return reference;
        }
        throw new VerifyException(o0.e(errorMessageTemplate, errorMessageArgs));
    }
}
