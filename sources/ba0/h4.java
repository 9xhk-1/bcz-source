package ba0;

import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.7", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public final class h4 {
    public static void a(Throwable exception) {
        if (exception instanceof OutOfMemoryError) {
            throw o1.e(exception);
        }
    }
}
