package m60;

import java.util.logging.Logger;
import kotlin.jvm.internal.g0;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f72514a = Logger.getLogger("okio.Okio");

    public static final boolean b(@m80.k AssertionError assertionError) {
        g0.p(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? k0.n3(message, "getsockname failed", false, 2, null) : false) {
                return true;
            }
        }
        return false;
    }
}
