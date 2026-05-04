package w80;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apiguardian.api.API;
import org.junit.platform.engine.TestDescriptor;
import org.junit.platform.engine.UniqueId;
import org.junit.platform.engine.support.hierarchical.Node;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.0", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public class d5 extends d3 implements j2 {

    /* renamed from: n, reason: collision with root package name */
    public static final String f95775n = "test-template";

    /* renamed from: m, reason: collision with root package name */
    public final i1 f95776m;

    public d5(UniqueId uniqueId, Class<?> testClass, Method templateMethod, v80.e0 configuration) {
        super(uniqueId, testClass, templateMethod, configuration);
        this.f95776m = new i1();
    }

    public static /* synthetic */ p80.j g0(a90.b0 b0Var, p80.n nVar) {
        return new z80.h(nVar, b0Var);
    }

    public static /* synthetic */ Optional j0(d5 d5Var, AtomicInteger atomicInteger, p80.g0 g0Var) {
        d5Var.getClass();
        return d5Var.n0(g0Var, atomicInteger.incrementAndGet());
    }

    public static /* synthetic */ String k0(List list) {
        return "None of the supporting " + p80.h0.class.getSimpleName() + "s " + ((String) list.stream().map(new Function() { // from class: w80.u4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String simpleName;
                simpleName = ((p80.h0) obj).getClass().getSimpleName();
                return simpleName;
            }
        }).collect(Collectors.joining(org.junit.jupiter.api.j2.O, "[", "]"))) + " provided a non-empty stream";
    }

    @Override // org.junit.platform.engine.TestDescriptor
    public boolean A() {
        return true;
    }

    @Override // w80.u2, org.junit.platform.engine.support.hierarchical.Node
    /* renamed from: S */
    public z80.t l(z80.t context) {
        final a90.b0 m11 = i2.m(context.j(), c0());
        return context.f().d(m11).c(new q4(context.i(), context.h(), this, context.g(), context.i().I().orElse(null), new Function() { // from class: w80.w4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return d5.g0(a90.b0.this, (p80.n) obj);
            }
        })).a();
    }

    @Override // org.junit.platform.engine.TestDescriptor
    public TestDescriptor.Type getType() {
        return TestDescriptor.Type.CONTAINER;
    }

    public final Optional<TestDescriptor> n0(p80.g0 invocationContext, int index) {
        UniqueId append = getUniqueId().append(t4.f95935s, "#" + index);
        return p().test(append, Integer.valueOf(index + (-1))) ? Optional.of(new t4(append, b0(), c0(), invocationContext, index, this.f95946f)) : Optional.empty();
    }

    @Override // org.junit.platform.engine.support.hierarchical.Node
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public z80.t z(z80.t context, final Node.a dynamicTestExecutor) throws Exception {
        final p80.n i11 = context.i();
        List<p80.h0> q02 = q0(i11, context.j());
        final AtomicInteger atomicInteger = new AtomicInteger();
        q02.stream().flatMap(new Function() { // from class: w80.x4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Stream b11;
                b11 = ((p80.h0) obj).b(p80.n.this);
                return b11;
            }
        }).map(new Function() { // from class: w80.y4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return d5.j0(d5.this, atomicInteger, (p80.g0) obj);
            }
        }).filter(new d1()).map(new z4()).forEach(new Consumer() { // from class: w80.a5
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                d5.this.p0(dynamicTestExecutor, (TestDescriptor) obj);
            }
        });
        r0(atomicInteger.get(), q02);
        return context;
    }

    @Override // w80.j2
    public i1 p() {
        return this.f95776m;
    }

    public final void p0(Node.a dynamicTestExecutor, TestDescriptor testDescriptor) {
        testDescriptor.o(this);
        dynamicTestExecutor.b(testDescriptor);
    }

    public final List<p80.h0> q0(final p80.n extensionContext, a90.o extensionRegistry) {
        return (List) ba0.c2.n((List) extensionRegistry.a(p80.h0.class).filter(new Predicate() { // from class: w80.b5
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean D;
                D = ((p80.h0) obj).D(p80.n.this);
                return D;
            }
        }).collect(Collectors.toList()), new Supplier() { // from class: w80.c5
            @Override // java.util.function.Supplier
            public final Object get() {
                String format;
                format = String.format("You must register at least one %s that supports @TestTemplate method [%s]", p80.h0.class.getSimpleName(), d5.this.c0());
                return format;
            }
        });
    }

    public final void r0(int invocationIndex, final List<p80.h0> providers) {
        ba0.c2.f(invocationIndex > 0, new Supplier() { // from class: w80.v4
            @Override // java.util.function.Supplier
            public final Object get() {
                return d5.k0(providers);
            }
        });
    }
}
