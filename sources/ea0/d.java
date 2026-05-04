package ea0;

import ba0.c2;
import ba0.g4;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final LocalDateTime f49621a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, String> f49622b;

    @API(since = "5.8", status = API.Status.DEPRECATED)
    @Deprecated
    public d() {
        LocalDateTime now;
        now = LocalDateTime.now();
        this.f49621a = now;
        this.f49622b = new LinkedHashMap();
    }

    public static d c(String key, String value) {
        d dVar = new d();
        dVar.b(key, value);
        return dVar;
    }

    public static d d(Map<String, String> keyValuePairs) {
        c2.r(keyValuePairs, "keyValuePairs must not be null");
        final d dVar = new d();
        keyValuePairs.forEach(new BiConsumer() { // from class: ea0.b
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                d.this.b((String) obj, (String) obj2);
            }
        });
        return dVar;
    }

    public final void b(String key, String value) {
        c2.k(key, "key must not be null or blank");
        c2.k(value, "value must not be null or blank");
        this.f49622b.put(key, value);
    }

    public final Map<String, String> e() {
        return Collections.unmodifiableMap(this.f49622b);
    }

    public final LocalDateTime f() {
        return this.f49621a;
    }

    public String toString() {
        final g4 g4Var = new g4(this);
        g4Var.a(com.alipay.sdk.m.t.a.f11034k, this.f49621a);
        this.f49622b.forEach(new BiConsumer() { // from class: ea0.c
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                g4.this.a((String) obj, (String) obj2);
            }
        });
        return g4Var.toString();
    }
}
