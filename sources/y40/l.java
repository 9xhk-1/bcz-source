package y40;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class l {
    @m80.k
    public static final o a(@m80.k OutputStream outputStream) {
        kotlin.jvm.internal.g0.p(outputStream, "<this>");
        return new m(outputStream);
    }

    @m80.k
    public static final p b(@m80.k InputStream inputStream) {
        kotlin.jvm.internal.g0.p(inputStream, "<this>");
        return new j(inputStream);
    }

    public static final boolean c(@m80.k AssertionError assertionError) {
        kotlin.jvm.internal.g0.p(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? u30.k0.n3(message, "getsockname failed", false, 2, null) : false) {
                return true;
            }
        }
        return false;
    }
}
