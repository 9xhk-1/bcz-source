package w80;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.Optional;
import java.util.function.Function;
import org.junit.jupiter.api.TestInstance;
import org.junit.platform.engine.support.hierarchical.Node;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class f3 extends e<p4> {

    /* renamed from: i, reason: collision with root package name */
    public final org.junit.platform.engine.support.hierarchical.m f95801i;

    /* renamed from: j, reason: collision with root package name */
    public p80.f0 f95802j;

    public f3(p80.n parent, ca0.r engineExecutionListener, p4 testDescriptor, v80.e0 configuration, org.junit.platform.engine.support.hierarchical.m throwableCollector, Function<p80.n, p80.j> executableInvokerFactory) {
        super(parent, engineExecutionListener, testDescriptor, configuration, executableInvokerFactory);
        this.f95801i = throwableCollector;
    }

    @Override // p80.n
    public Optional<Object> E() {
        return I().map(new b0());
    }

    @Override // p80.n
    public Optional<p80.f0> I() {
        return Optional.ofNullable(this.f95802j);
    }

    @Override // p80.n
    public Optional<Throwable> L() {
        return Optional.ofNullable(this.f95801i.d());
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

    public void m0(p80.f0 testInstances) {
        this.f95802j = testInstances;
    }
}
