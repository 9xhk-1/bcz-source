package w80;

import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.apiguardian.api.API;
import org.junit.platform.commons.util.ReflectionUtils;
import org.junit.platform.engine.TestDescriptor;
import org.junit.platform.engine.TestTag;
import org.junit.platform.engine.UniqueId;
import org.junit.platform.engine.support.descriptor.MethodSource;
import org.junit.platform.engine.support.hierarchical.ExclusiveResource;
import org.junit.platform.engine.support.hierarchical.Node;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.0", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public abstract class d3 extends u2 {

    /* renamed from: l, reason: collision with root package name */
    public static final y90.e f95771l = y90.g.c(d3.class);

    /* renamed from: i, reason: collision with root package name */
    public final Class<?> f95772i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f95773j;

    /* renamed from: k, reason: collision with root package name */
    public final Set<TestTag> f95774k;

    public d3(UniqueId uniqueId, Class<?> testClass, Method testMethod, v80.e0 configuration) {
        this(uniqueId, b1.m(testClass, testMethod, configuration), testClass, testMethod, configuration);
    }

    public static /* synthetic */ String X(d3 d3Var, p80.i0 i0Var, p80.n nVar) {
        d3Var.getClass();
        return String.format("Failed to invoke TestWatcher [%s] for method [%s] with display name [%s]", i0Var.getClass().getName(), ReflectionUtils.x0(nVar.Z(), nVar.a0()), d3Var.a());
    }

    public static /* synthetic */ void Z(final d3 d3Var, Consumer consumer, z80.t tVar, final p80.i0 i0Var) {
        d3Var.getClass();
        try {
            consumer.accept(i0Var);
        } catch (Throwable th2) {
            ba0.h4.a(th2);
            final p80.n i11 = tVar.i();
            f95771l.b(th2, new Supplier() { // from class: w80.c3
                @Override // java.util.function.Supplier
                public final Object get() {
                    return d3.X(d3.this, i0Var, i11);
                }
            });
        }
    }

    @Override // w80.u2
    public Optional<Node.ExecutionMode> O() {
        return N(c0());
    }

    public final Class<?> b0() {
        return this.f95772i;
    }

    @Override // org.junit.platform.engine.TestDescriptor
    public String c() {
        return String.format("%s(%s)", this.f95773j.getName(), ba0.y.c(new org.junit.jupiter.api.p1(), this.f95773j.getParameterTypes()));
    }

    public final Method c0() {
        return this.f95773j;
    }

    public void d0(final z80.t context, boolean reverseOrder, final Consumer<p80.i0> callback) {
        List c11 = context.j().c(p80.i0.class);
        Consumer consumer = new Consumer() { // from class: w80.a3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                d3.Z(d3.this, callback, context, (p80.i0) obj);
            }
        };
        if (reverseOrder) {
            ba0.n1.d(c11, consumer);
        } else {
            c11.forEach(consumer);
        }
    }

    @Override // org.junit.platform.engine.support.hierarchical.Node
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public void k(final z80.t context, TestDescriptor descriptor, final Node.c result) {
        if (context != null) {
            d0(context, false, new Consumer() { // from class: w80.b3
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((p80.i0) obj).E(z80.t.this.i(), result.b());
                }
            });
        }
    }

    @Override // ga0.c, org.junit.platform.engine.TestDescriptor
    public final Set<TestTag> f() {
        final LinkedHashSet linkedHashSet = new LinkedHashSet(this.f95774k);
        getParent().ifPresent(new Consumer() { // from class: w80.z2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                linkedHashSet.addAll(((TestDescriptor) obj).f());
            }
        });
        return linkedHashSet;
    }

    @Override // org.junit.platform.engine.support.hierarchical.Node
    public Set<ExclusiveResource> n() {
        return M(c0());
    }

    public d3(UniqueId uniqueId, String displayName, Class<?> testClass, Method testMethod, v80.e0 configuration) {
        super(uniqueId, displayName, MethodSource.from(testClass, testMethod), configuration);
        this.f95772i = (Class) ba0.c2.r(testClass, "Class must not be null");
        this.f95773j = testMethod;
        this.f95774k = u2.P(testMethod);
    }
}
