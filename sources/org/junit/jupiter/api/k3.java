package org.junit.jupiter.api;

import java.util.Collections;
import java.util.Map;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.0", status = API.Status.STABLE)
@FunctionalInterface
/* loaded from: classes9.dex */
public interface k3 {
    void a(Map<String, String> map);

    @API(since = "5.3", status = API.Status.STABLE)
    default void b(String value) {
        c("value", value);
    }

    default void c(String key, String value) {
        a(Collections.singletonMap(key, value));
    }
}
