package da0;

import ba0.e4;
import ba0.g4;
import da0.k;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import org.apiguardian.api.API;
import org.junit.platform.engine.discovery.FilePosition;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public class k0 implements ca0.l {

    /* renamed from: a, reason: collision with root package name */
    public final String f47551a;

    /* renamed from: b, reason: collision with root package name */
    public final FilePosition f47552b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @API(since = "1.11", status = API.Status.INTERNAL)
    public static class a implements k {

        /* renamed from: a, reason: collision with root package name */
        public static final String f47553a = "file";

        @Override // da0.k
        public Optional<k0> a(ca0.o identifier, k.a context) {
            return Optional.of((k0) e4.l(s60.d.f88057a, identifier.e()).a(new Function() { // from class: da0.i0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return x.r((String) obj);
                }
            }, new BiFunction() { // from class: da0.j0
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    k0 s11;
                    s11 = x.s((String) obj, FilePosition.fromQuery((String) obj2).orElse(null));
                    return s11;
                }
            }));
        }

        @Override // da0.k
        public String getPrefix() {
            return "file";
        }
    }

    public k0(String path, FilePosition position) {
        this.f47551a = path;
        this.f47552b = position;
    }

    @Override // ca0.l
    public Optional<ca0.o> a() {
        FilePosition filePosition = this.f47552b;
        return filePosition == null ? Optional.of(ca0.o.c("file", this.f47551a)) : Optional.of(ca0.o.c("file", String.format("%s?%s", this.f47551a, filePosition.toQueryPart())));
    }

    public File b() {
        return new File(this.f47551a);
    }

    public Path c() {
        Path path;
        path = Paths.get(this.f47551a, new String[0]);
        return path;
    }

    public Optional<FilePosition> d() {
        return Optional.ofNullable(this.f47552b);
    }

    public String e() {
        return this.f47551a;
    }

    @API(since = "1.3", status = API.Status.STABLE)
    public boolean equals(Object o11) {
        if (this == o11) {
            return true;
        }
        if (o11 != null && getClass() == o11.getClass()) {
            k0 k0Var = (k0) o11;
            if (Objects.equals(this.f47551a, k0Var.f47551a) && Objects.equals(this.f47552b, k0Var.f47552b)) {
                return true;
            }
        }
        return false;
    }

    @API(since = "1.3", status = API.Status.STABLE)
    public int hashCode() {
        return Objects.hash(this.f47551a, this.f47552b);
    }

    public String toString() {
        return new g4(this).a("path", this.f47551a).a("position", this.f47552b).toString();
    }
}
