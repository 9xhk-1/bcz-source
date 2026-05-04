package lb0;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Method f70889a;

    /* renamed from: b, reason: collision with root package name */
    public final List<?> f70890b;

    public k(Method method, List<?> list) {
        this.f70889a = method;
        this.f70890b = Collections.unmodifiableList(list);
    }

    public static k c(Method method, List<?> list) {
        Objects.requireNonNull(method, "method == null");
        Objects.requireNonNull(list, "arguments == null");
        return new k(method, new ArrayList(list));
    }

    public List<?> a() {
        return this.f70890b;
    }

    public Method b() {
        return this.f70889a;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f70889a.getDeclaringClass().getName(), this.f70889a.getName(), this.f70890b);
    }
}
