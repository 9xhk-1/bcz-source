package da0;

import ba0.c2;
import ba0.g4;
import da0.k;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Objects;
import java.util.Optional;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public class i implements ca0.l {

    /* renamed from: a, reason: collision with root package name */
    public final URI f47539a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @API(since = "1.11", status = API.Status.INTERNAL)
    public static class a implements k {

        /* renamed from: a, reason: collision with root package name */
        public static final String f47540a = "classpath-root";

        @Override // da0.k
        public Optional<i> a(ca0.o identifier, k.a context) {
            Path path;
            path = Paths.get(URI.create(identifier.e()));
            return ba0.n1.e(x.m(Collections.singleton(path)));
        }

        @Override // da0.k
        public String getPrefix() {
            return f47540a;
        }
    }

    public i(URI classpathRoot) {
        this.f47539a = (URI) c2.r(classpathRoot, "classpathRoot must not be null");
    }

    @Override // ca0.l
    public Optional<ca0.o> a() {
        return Optional.of(ca0.o.c(a.f47540a, this.f47539a.toString()));
    }

    public URI b() {
        return this.f47539a;
    }

    @API(since = "1.3", status = API.Status.STABLE)
    public boolean equals(Object o11) {
        if (this == o11) {
            return true;
        }
        if (o11 == null || getClass() != o11.getClass()) {
            return false;
        }
        return Objects.equals(this.f47539a, ((i) o11).f47539a);
    }

    @API(since = "1.3", status = API.Status.STABLE)
    public int hashCode() {
        return this.f47539a.hashCode();
    }

    public String toString() {
        return new g4(this).a("classpathRoot", this.f47539a).toString();
    }
}
