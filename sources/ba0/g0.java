package ba0;

import java.net.URI;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class g0 implements z90.j {

    /* renamed from: a, reason: collision with root package name */
    public final String f6536a;

    /* renamed from: b, reason: collision with root package name */
    public final URI f6537b;

    public g0(String name, URI uri) {
        this.f6536a = (String) c2.r(name, "name must not be null");
        this.f6537b = (URI) c2.r(uri, "uri must not be null");
    }

    public boolean equals(Object o11) {
        if (this == o11) {
            return true;
        }
        if (o11 != null && getClass() == o11.getClass()) {
            g0 g0Var = (g0) o11;
            if (this.f6536a.equals(g0Var.f6536a) && this.f6537b.equals(g0Var.f6537b)) {
                return true;
            }
        }
        return false;
    }

    @Override // z90.j
    public String getName() {
        return this.f6536a;
    }

    @Override // z90.j
    public URI getUri() {
        return this.f6537b;
    }

    public int hashCode() {
        return Objects.hash(this.f6536a, this.f6537b);
    }
}
