package ga0;

import ba0.c2;
import ba0.g4;
import da0.v1;
import java.net.URI;
import java.util.Objects;
import org.junit.platform.engine.support.descriptor.UriSource;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class g implements UriSource {
    private static final long serialVersionUID = 1;

    /* renamed from: a, reason: collision with root package name */
    public final URI f53533a;

    public g(URI uri) {
        this.f53533a = (URI) c2.r(uri, "URI must not be null");
    }

    public boolean equals(Object o11) {
        if (this == o11) {
            return true;
        }
        if (o11 == null || getClass() != o11.getClass()) {
            return false;
        }
        return Objects.equals(this.f53533a, ((g) o11).f53533a);
    }

    @Override // org.junit.platform.engine.support.descriptor.UriSource
    public URI getUri() {
        return this.f53533a;
    }

    public int hashCode() {
        return this.f53533a.hashCode();
    }

    public String toString() {
        return new g4(this).a(v1.a.f47590a, this.f53533a).toString();
    }
}
