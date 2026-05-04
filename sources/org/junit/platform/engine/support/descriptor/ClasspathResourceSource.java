package org.junit.platform.engine.support.descriptor;

import ba0.c2;
import ba0.g4;
import ga0.m;
import java.net.URI;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;
import org.apiguardian.api.API;
import org.junit.platform.engine.TestSource;
import org.junit.platform.engine.support.descriptor.ClasspathResourceSource;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public class ClasspathResourceSource implements TestSource {
    public static final String CLASSPATH_SCHEME = "classpath";
    private static final long serialVersionUID = 1;
    private final String classpathResourceName;
    private final FilePosition filePosition;

    private ClasspathResourceSource(String classpathResourceName) {
        this(classpathResourceName, null);
    }

    public static /* synthetic */ String a(URI uri) {
        return "URI [" + uri + "] must have [" + CLASSPATH_SCHEME + "] scheme";
    }

    public static ClasspathResourceSource from(String classpathResourceName) {
        return new ClasspathResourceSource(classpathResourceName);
    }

    public boolean equals(Object o11) {
        if (this == o11) {
            return true;
        }
        if (o11 != null && getClass() == o11.getClass()) {
            ClasspathResourceSource classpathResourceSource = (ClasspathResourceSource) o11;
            if (Objects.equals(this.classpathResourceName, classpathResourceSource.classpathResourceName) && Objects.equals(this.filePosition, classpathResourceSource.filePosition)) {
                return true;
            }
        }
        return false;
    }

    public String getClasspathResourceName() {
        return this.classpathResourceName;
    }

    public final Optional<FilePosition> getPosition() {
        return Optional.ofNullable(this.filePosition);
    }

    public int hashCode() {
        return Objects.hash(this.classpathResourceName, this.filePosition);
    }

    public String toString() {
        return new g4(this).a("classpathResourceName", this.classpathResourceName).a("filePosition", this.filePosition).toString();
    }

    private ClasspathResourceSource(String classpathResourceName, FilePosition filePosition) {
        c2.k(classpathResourceName, "Classpath resource name must not be null or blank");
        this.classpathResourceName = classpathResourceName.startsWith("/") ? classpathResourceName.substring(1) : classpathResourceName;
        this.filePosition = filePosition;
    }

    public static ClasspathResourceSource from(String classpathResourceName, FilePosition filePosition) {
        return new ClasspathResourceSource(classpathResourceName, filePosition);
    }

    @API(since = "1.3", status = API.Status.STABLE)
    public static ClasspathResourceSource from(final URI uri) {
        c2.r(uri, "URI must not be null");
        c2.f(CLASSPATH_SCHEME.equals(uri.getScheme()), new Supplier() { // from class: ga0.f
            @Override // java.util.function.Supplier
            public final Object get() {
                return ClasspathResourceSource.a(uri);
            }
        });
        return from(m.a(uri).getPath(), FilePosition.fromQuery(uri.getQuery()).orElse(null));
    }
}
