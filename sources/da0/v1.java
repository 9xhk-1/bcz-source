package da0;

import ba0.g4;
import da0.k;
import java.net.URI;
import java.util.Objects;
import java.util.Optional;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public class v1 implements ca0.l {

    /* renamed from: a, reason: collision with root package name */
    public final URI f47589a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @API(since = "1.11", status = API.Status.INTERNAL)
    public static class a implements k {

        /* renamed from: a, reason: collision with root package name */
        public static final String f47590a = "uri";

        @Override // da0.k
        public Optional<v1> a(ca0.o identifier, k.a context) {
            return Optional.of(x.W(identifier.e()));
        }

        @Override // da0.k
        public String getPrefix() {
            return f47590a;
        }
    }

    public v1(URI uri) {
        this.f47589a = uri;
    }

    @Override // ca0.l
    public Optional<ca0.o> a() {
        return Optional.of(ca0.o.c(a.f47590a, this.f47589a.toString()));
    }

    public URI b() {
        return this.f47589a;
    }

    @API(since = "1.3", status = API.Status.STABLE)
    public boolean equals(Object o11) {
        if (this == o11) {
            return true;
        }
        if (o11 == null || getClass() != o11.getClass()) {
            return false;
        }
        return Objects.equals(this.f47589a, ((v1) o11).f47589a);
    }

    @API(since = "1.3", status = API.Status.STABLE)
    public int hashCode() {
        return this.f47589a.hashCode();
    }

    public String toString() {
        return new g4(this).a(a.f47590a, this.f47589a).toString();
    }
}
