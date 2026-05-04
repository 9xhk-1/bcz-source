package z80;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.junit.platform.commons.util.ReflectionUtils;
import p80.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class g<T> implements q.a<T>, p80.v<Constructor<T>> {

    /* renamed from: a, reason: collision with root package name */
    public final Constructor<T> f102373a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f102374b;

    public g(Constructor<T> constructor, Object[] arguments) {
        this.f102373a = constructor;
        this.f102374b = arguments;
    }

    @Override // p80.q.a
    public T b() {
        return (T) ReflectionUtils.y1(this.f102373a, this.f102374b);
    }

    @Override // p80.v
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Constructor<T> a() {
        return this.f102373a;
    }

    @Override // p80.v
    public List<Object> getArguments() {
        return Collections.unmodifiableList(Arrays.asList(this.f102374b));
    }

    @Override // p80.v
    public Optional<Object> getTarget() {
        return Optional.empty();
    }

    @Override // p80.v
    public Class<?> getTargetClass() {
        return this.f102373a.getDeclaringClass();
    }
}
