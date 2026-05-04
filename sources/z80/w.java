package z80;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;
import org.junit.platform.commons.util.ReflectionUtils;
import p80.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class w<T> implements q.a<T>, p80.v<Method> {

    /* renamed from: a, reason: collision with root package name */
    public final Method f102413a;

    /* renamed from: b, reason: collision with root package name */
    public final Optional<Object> f102414b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f102415c;

    public w(Method method, Optional<Object> target, Object[] arguments) {
        this.f102413a = method;
        this.f102414b = target;
        this.f102415c = arguments;
    }

    @Override // p80.q.a
    public T b() {
        return (T) ReflectionUtils.L0(this.f102413a, this.f102414b.orElse(null), this.f102415c);
    }

    @Override // p80.v
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Method a() {
        return this.f102413a;
    }

    @Override // p80.v
    public List<Object> getArguments() {
        return Collections.unmodifiableList(Arrays.asList(this.f102415c));
    }

    @Override // p80.v
    public Optional<Object> getTarget() {
        return this.f102414b;
    }

    @Override // p80.v
    public Class<?> getTargetClass() {
        Optional<U> map = this.f102414b.map(new u());
        final Method method = this.f102413a;
        Objects.requireNonNull(method);
        return (Class) map.orElseGet(new Supplier() { // from class: z80.v
            @Override // java.util.function.Supplier
            public final Object get() {
                return method.getDeclaringClass();
            }
        });
    }
}
