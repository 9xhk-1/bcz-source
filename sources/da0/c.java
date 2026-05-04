package da0;

import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public interface c extends ca0.k<String> {

    /* renamed from: a, reason: collision with root package name */
    public static final String f47518a = "^(Test.*|.+[.$]Test.*|.*Tests?)$";

    static c a(String... patterns) {
        return new o0(patterns);
    }

    static c d(String... patterns) {
        return new b0(patterns);
    }
}
