package da0;

import ba0.g4;
import com.vivo.push.PushClientConstants;
import da0.k;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import org.apiguardian.api.API;
import org.junit.platform.commons.PreconditionViolationException;
import org.junit.platform.commons.util.ReflectionUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public class e implements ca0.l {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f47524a;

    /* renamed from: b, reason: collision with root package name */
    public final String f47525b;

    /* renamed from: c, reason: collision with root package name */
    public Class<?> f47526c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @API(since = "1.11", status = API.Status.INTERNAL)
    public static class a implements k {

        /* renamed from: a, reason: collision with root package name */
        public static final String f47527a = "class";

        @Override // da0.k
        public Optional<e> a(ca0.o identifier, k.a context) {
            return Optional.of(x.j(identifier.e()));
        }

        @Override // da0.k
        public String getPrefix() {
            return "class";
        }
    }

    public e(ClassLoader classLoader, String className) {
        this.f47525b = className;
        this.f47524a = classLoader;
    }

    public static /* synthetic */ PreconditionViolationException b(e eVar, Exception exc) {
        eVar.getClass();
        return new PreconditionViolationException("Could not load class with name: " + eVar.f47525b, exc);
    }

    @Override // ca0.l
    public Optional<ca0.o> a() {
        return Optional.of(ca0.o.c("class", this.f47525b));
    }

    @API(since = "1.10", status = API.Status.EXPERIMENTAL)
    public ClassLoader c() {
        return this.f47524a;
    }

    public String d() {
        return this.f47525b;
    }

    public Class<?> e() {
        if (this.f47526c == null) {
            ClassLoader classLoader = this.f47524a;
            this.f47526c = (classLoader == null ? ReflectionUtils.X1(this.f47525b) : ReflectionUtils.Y1(this.f47525b, classLoader)).j(new Function() { // from class: da0.d
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return e.b(e.this, (Exception) obj);
                }
            });
        }
        return this.f47526c;
    }

    @API(since = "1.3", status = API.Status.STABLE)
    public boolean equals(Object o11) {
        if (this == o11) {
            return true;
        }
        if (o11 == null || getClass() != o11.getClass()) {
            return false;
        }
        return Objects.equals(this.f47525b, ((e) o11).f47525b);
    }

    @API(since = "1.3", status = API.Status.STABLE)
    public int hashCode() {
        return this.f47525b.hashCode();
    }

    public String toString() {
        return new g4(this).a(PushClientConstants.TAG_CLASS_NAME, this.f47525b).a("classLoader", this.f47524a).toString();
    }

    public e(Class<?> javaClass) {
        this.f47525b = javaClass.getName();
        this.f47524a = javaClass.getClassLoader();
        this.f47526c = javaClass;
    }
}
