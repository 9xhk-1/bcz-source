package w80;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.Optional;
import java.util.function.Function;
import org.junit.jupiter.api.TestInstance;
import org.junit.platform.engine.support.hierarchical.Node;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class q4 extends e<d5> {

    /* renamed from: i, reason: collision with root package name */
    public final p80.f0 f95913i;

    public q4(p80.n parent, ca0.r engineExecutionListener, d5 testDescriptor, v80.e0 configuration, p80.f0 testInstances, Function<p80.n, p80.j> executableInvokerFactory) {
        super(parent, engineExecutionListener, testDescriptor, configuration, executableInvokerFactory);
        this.f95913i = testInstances;
    }

    @Override // p80.n
    public Optional<Object> E() {
        return I().map(new b0());
    }

    @Override // p80.n
    public Optional<p80.f0> I() {
        return Optional.ofNullable(this.f95913i);
    }

    @Override // p80.n
    public Optional<Throwable> L() {
        return Optional.empty();
    }

    @Override // p80.n
    public Optional<TestInstance.Lifecycle> V() {
        return getParent().flatMap(new e3());
    }

    @Override // p80.n
    public Optional<Class<?>> c() {
        return Optional.of(i0().b0());
    }

    @Override // p80.n
    public Optional<AnnotatedElement> e() {
        return Optional.of(i0().c0());
    }

    @Override // w80.e
    public Node.ExecutionMode h0() {
        return i0().j();
    }

    @Override // p80.n
    public Optional<Method> k() {
        return Optional.of(i0().c0());
    }
}
