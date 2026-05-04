package z80;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Optional;
import org.apiguardian.api.API;
import org.junit.platform.commons.util.ReflectionUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.9", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public class h implements p80.j {

    /* renamed from: a, reason: collision with root package name */
    public final p80.n f102375a;

    /* renamed from: b, reason: collision with root package name */
    public final a90.o f102376b;

    public h(p80.n extensionContext, a90.o extensionRegistry) {
        this.f102375a = extensionContext;
        this.f102376b = extensionRegistry;
    }

    @Override // p80.j
    public <T> T a(Constructor<T> constructor, Object obj) {
        return (T) ReflectionUtils.y1(constructor, k0.e(constructor, Optional.empty(), Optional.ofNullable(obj), this.f102375a, this.f102376b));
    }

    @Override // p80.j
    public Object d(Method method, Object target) {
        return ReflectionUtils.L0(method, target, k0.f(method, Optional.ofNullable(target), this.f102375a, this.f102376b));
    }
}
