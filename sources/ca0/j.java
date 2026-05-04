package ca0;

import ba0.c2;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import org.apiguardian.api.API;
import org.junit.platform.commons.JUnitException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public interface j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f8466a = "junit-platform.properties";

    static /* synthetic */ Object a(Function function, String str, String str2) {
        try {
            return function.apply(str2);
        } catch (Exception e11) {
            throw new JUnitException(String.format("Failed to transform configuration parameter with key '%s' and initial value '%s'", str, str2), e11);
        }
    }

    @API(since = "1.3", status = API.Status.STABLE)
    default <T> Optional<T> b(final String str, final Function<String, T> function) {
        c2.r(function, "transformer must not be null");
        return (Optional<T>) get(str).map(new Function() { // from class: ca0.i
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return j.a(function, str, (String) obj);
            }
        });
    }

    Optional<String> get(String key);

    Optional<Boolean> getBoolean(String key);

    @API(since = "1.9", status = API.Status.STABLE)
    Set<String> keySet();

    @API(since = "1.9", status = API.Status.DEPRECATED)
    @Deprecated
    int size();
}
