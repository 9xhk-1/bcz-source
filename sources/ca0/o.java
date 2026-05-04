package ca0;

import ba0.c2;
import ba0.e4;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import org.apiguardian.api.API;
import org.junit.platform.commons.PreconditionViolationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.11", status = API.Status.EXPERIMENTAL)
/* loaded from: classes9.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f8469a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8470b;

    public o(String prefix, String value) {
        this.f8469a = c2.k(prefix, "prefix must not be blank");
        this.f8470b = c2.k(value, "value must not be blank");
    }

    public static /* synthetic */ RuntimeException a(String str) {
        return new PreconditionViolationException("Identifier string must be 'prefix:value', but was " + str);
    }

    public static /* synthetic */ o b(String str, String str2) {
        return new o(str, str2);
    }

    public static o c(String prefix, String value) {
        return new o(prefix, value);
    }

    public static o f(final String string) {
        return (o) e4.l(':', string).b(new Supplier() { // from class: ca0.m
            @Override // java.util.function.Supplier
            public final Object get() {
                return o.a(string);
            }
        }, new BiFunction() { // from class: ca0.n
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return o.b((String) obj, (String) obj2);
            }
        });
    }

    public String d() {
        return this.f8469a;
    }

    public String e() {
        return this.f8470b;
    }

    public boolean equals(Object o11) {
        if (this == o11) {
            return true;
        }
        if (o11 != null && o.class == o11.getClass()) {
            o oVar = (o) o11;
            if (Objects.equals(this.f8469a, oVar.f8469a) && Objects.equals(this.f8470b, oVar.f8470b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f8469a, this.f8470b);
    }

    public String toString() {
        return String.format("%s:%s", this.f8469a, this.f8470b);
    }
}
