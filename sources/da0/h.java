package da0;

import ba0.e4;
import ba0.g4;
import da0.k;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import org.apiguardian.api.API;
import org.junit.platform.engine.discovery.FilePosition;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public class h implements ca0.l {

    /* renamed from: a, reason: collision with root package name */
    public final String f47534a;

    /* renamed from: b, reason: collision with root package name */
    public final FilePosition f47535b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @API(since = "1.11", status = API.Status.INTERNAL)
    public static class a implements k {

        /* renamed from: a, reason: collision with root package name */
        public static final String f47536a = "resource";

        @Override // da0.k
        public Optional<h> a(ca0.o identifier, k.a context) {
            return Optional.of((h) e4.l(s60.d.f88057a, identifier.e()).a(new Function() { // from class: da0.f
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return x.k((String) obj);
                }
            }, new BiFunction() { // from class: da0.g
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    h l11;
                    l11 = x.l((String) obj, FilePosition.fromQuery((String) obj2).orElse(null));
                    return l11;
                }
            }));
        }

        @Override // da0.k
        public String getPrefix() {
            return "resource";
        }
    }

    public h(String classpathResourceName, FilePosition position) {
        this.f47534a = classpathResourceName.startsWith("/") ? classpathResourceName.substring(1) : classpathResourceName;
        this.f47535b = position;
    }

    @Override // ca0.l
    public Optional<ca0.o> a() {
        FilePosition filePosition = this.f47535b;
        return filePosition == null ? Optional.of(ca0.o.c("resource", this.f47534a)) : Optional.of(ca0.o.c("resource", String.format("%s?%s", this.f47534a, filePosition.toQueryPart())));
    }

    public String b() {
        return this.f47534a;
    }

    public Optional<FilePosition> c() {
        return Optional.ofNullable(this.f47535b);
    }

    @API(since = "1.3", status = API.Status.STABLE)
    public boolean equals(Object o11) {
        if (this == o11) {
            return true;
        }
        if (o11 != null && getClass() == o11.getClass()) {
            h hVar = (h) o11;
            if (Objects.equals(this.f47534a, hVar.f47534a) && Objects.equals(this.f47535b, hVar.f47535b)) {
                return true;
            }
        }
        return false;
    }

    @API(since = "1.3", status = API.Status.STABLE)
    public int hashCode() {
        return Objects.hash(this.f47534a, this.f47535b);
    }

    public String toString() {
        return new g4(this).a("classpathResourceName", this.f47534a).a("position", this.f47535b).toString();
    }
}
