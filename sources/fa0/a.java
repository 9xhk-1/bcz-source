package fa0;

import ba0.c2;
import ca0.j;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.10", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public class a implements j {

    /* renamed from: b, reason: collision with root package name */
    public final j f51452b;

    /* renamed from: c, reason: collision with root package name */
    public final String f51453c;

    public a(j delegate, String prefix) {
        this.f51452b = (j) c2.r(delegate, "delegate must not be null");
        this.f51453c = c2.k(prefix, "prefix must not be null or blank");
    }

    @Override // ca0.j
    public <T> Optional<T> b(String key, Function<String, T> transformer) {
        return this.f51452b.b(c(key), transformer);
    }

    public final String c(String key) {
        return this.f51453c + key;
    }

    @Override // ca0.j
    public Optional<String> get(String key) {
        return this.f51452b.get(c(key));
    }

    @Override // ca0.j
    public Optional<Boolean> getBoolean(String key) {
        return this.f51452b.getBoolean(c(key));
    }

    @Override // ca0.j
    public Set<String> keySet() {
        return this.f51452b.keySet();
    }

    @Override // ca0.j
    public int size() {
        return this.f51452b.size();
    }
}
