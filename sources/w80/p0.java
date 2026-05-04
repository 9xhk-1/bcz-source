package w80;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.Optional;
import java.util.function.Function;
import org.junit.jupiter.api.TestInstance;
import org.junit.platform.engine.support.hierarchical.Node;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class p0 extends e<o0> {

    /* renamed from: i, reason: collision with root package name */
    public final TestInstance.Lifecycle f95888i;

    /* renamed from: j, reason: collision with root package name */
    public final org.junit.platform.engine.support.hierarchical.m f95889j;

    /* renamed from: k, reason: collision with root package name */
    public p80.f0 f95890k;

    public p0(p80.n parent, ca0.r engineExecutionListener, o0 testDescriptor, v80.e0 configuration, org.junit.platform.engine.support.hierarchical.m throwableCollector, Function<p80.n, p80.j> executableInvokerFactory) {
        this(parent, engineExecutionListener, testDescriptor, TestInstance.Lifecycle.PER_METHOD, configuration, throwableCollector, executableInvokerFactory);
    }

    @Override // p80.n
    public Optional<Object> E() {
        return I().map(new b0());
    }

    @Override // p80.n
    public Optional<p80.f0> I() {
        return Optional.ofNullable(this.f95890k);
    }

    @Override // p80.n
    public Optional<Throwable> L() {
        return Optional.ofNullable(this.f95889j.d());
    }

    @Override // p80.n
    public Optional<TestInstance.Lifecycle> V() {
        return Optional.of(this.f95888i);
    }

    @Override // p80.n
    public Optional<Class<?>> c() {
        return Optional.of(i0().E0());
    }

    @Override // p80.n
    public Optional<AnnotatedElement> e() {
        return Optional.of(i0().E0());
    }

    @Override // w80.e
    public Node.ExecutionMode h0() {
        return i0().j();
    }

    @Override // p80.n
    public Optional<Method> k() {
        return Optional.empty();
    }

    public void m0(p80.f0 testInstances) {
        this.f95890k = testInstances;
    }

    public p0(p80.n parent, ca0.r engineExecutionListener, o0 testDescriptor, TestInstance.Lifecycle lifecycle, v80.e0 configuration, org.junit.platform.engine.support.hierarchical.m throwableCollector, Function<p80.n, p80.j> executableInvokerFactory) {
        super(parent, engineExecutionListener, testDescriptor, configuration, executableInvokerFactory);
        this.f95888i = lifecycle;
        this.f95889j = throwableCollector;
    }
}
