package org.junit.platform.engine.support.descriptor;

import ba0.c2;
import ba0.g4;
import com.vivo.push.PushClientConstants;
import java.net.URI;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apiguardian.api.API;
import org.junit.platform.commons.PreconditionViolationException;
import org.junit.platform.commons.util.ReflectionUtils;
import org.junit.platform.engine.TestSource;
import org.junit.platform.engine.support.descriptor.ClassSource;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public class ClassSource implements TestSource {

    @API(since = "1.8", status = API.Status.STABLE)
    public static final String CLASS_SCHEME = "class";
    private static final long serialVersionUID = 1;
    private final String className;
    private final FilePosition filePosition;
    private Class<?> javaClass;

    private ClassSource(String className) {
        this(className, (FilePosition) null);
    }

    public static /* synthetic */ String a(URI uri) {
        return "URI [" + uri + "] must have [class] scheme";
    }

    public static /* synthetic */ PreconditionViolationException b(ClassSource classSource, Exception exc) {
        classSource.getClass();
        return new PreconditionViolationException("Could not load class with name: " + classSource.className, exc);
    }

    public static ClassSource from(String className) {
        return new ClassSource(className);
    }

    public boolean equals(Object o11) {
        if (this == o11) {
            return true;
        }
        if (o11 != null && getClass() == o11.getClass()) {
            ClassSource classSource = (ClassSource) o11;
            if (Objects.equals(this.className, classSource.className) && Objects.equals(this.filePosition, classSource.filePosition)) {
                return true;
            }
        }
        return false;
    }

    public final String getClassName() {
        return this.className;
    }

    public final Class<?> getJavaClass() {
        if (this.javaClass == null) {
            this.javaClass = ReflectionUtils.X1(this.className).j(new Function() { // from class: ga0.e
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ClassSource.b(ClassSource.this, (Exception) obj);
                }
            });
        }
        return this.javaClass;
    }

    public final Optional<FilePosition> getPosition() {
        return Optional.ofNullable(this.filePosition);
    }

    public int hashCode() {
        return Objects.hash(this.className, this.filePosition);
    }

    public String toString() {
        return new g4(this).a(PushClientConstants.TAG_CLASS_NAME, this.className).a("filePosition", this.filePosition).toString();
    }

    private ClassSource(String className, FilePosition filePosition) {
        this.className = c2.k(className, "Class name must not be null or blank");
        this.filePosition = filePosition;
    }

    public static ClassSource from(String className, FilePosition filePosition) {
        return new ClassSource(className, filePosition);
    }

    public static ClassSource from(Class<?> javaClass) {
        return new ClassSource(javaClass);
    }

    public static ClassSource from(Class<?> javaClass, FilePosition filePosition) {
        return new ClassSource(javaClass, filePosition);
    }

    private ClassSource(Class<?> javaClass) {
        this(javaClass, (FilePosition) null);
    }

    @API(since = "1.8", status = API.Status.STABLE)
    public static ClassSource from(final URI uri) {
        c2.r(uri, "URI must not be null");
        c2.f("class".equals(uri.getScheme()), new Supplier() { // from class: ga0.d
            @Override // java.util.function.Supplier
            public final Object get() {
                return ClassSource.a(uri);
            }
        });
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int indexOf = schemeSpecificPart.indexOf(63);
        FilePosition filePosition = null;
        if (indexOf >= 0) {
            filePosition = FilePosition.fromQuery(schemeSpecificPart.substring(indexOf + 1)).orElse(null);
            schemeSpecificPart = schemeSpecificPart.substring(0, indexOf);
        }
        return from(schemeSpecificPart, filePosition);
    }

    private ClassSource(Class<?> javaClass, FilePosition filePosition) {
        Class<?> cls = (Class) c2.r(javaClass, "Class must not be null");
        this.javaClass = cls;
        this.className = cls.getName();
        this.filePosition = filePosition;
    }
}
