package w80;

import java.lang.reflect.Method;
import java.net.URI;
import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.apiguardian.api.API;
import org.junit.platform.commons.JUnitException;
import org.junit.platform.commons.PreconditionViolationException;
import org.junit.platform.engine.TestDescriptor;
import org.junit.platform.engine.TestExecutionResult;
import org.junit.platform.engine.TestSource;
import org.junit.platform.engine.UniqueId;
import org.junit.platform.engine.support.descriptor.ClassSource;
import org.junit.platform.engine.support.descriptor.ClasspathResourceSource;
import org.junit.platform.engine.support.descriptor.UriSource;
import org.junit.platform.engine.support.hierarchical.Node;
import org.junit.platform.engine.support.hierarchical.m;
import p80.q;
import z80.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.0", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public class s3 extends p4 implements j2 {

    /* renamed from: r, reason: collision with root package name */
    public static final String f95922r = "test-factory";

    /* renamed from: s, reason: collision with root package name */
    public static final String f95923s = "dynamic-container";

    /* renamed from: t, reason: collision with root package name */
    public static final String f95924t = "dynamic-test";

    /* renamed from: u, reason: collision with root package name */
    public static final n.a<Method, Object> f95925u = new n.a() { // from class: w80.r3
        @Override // z80.n.a
        public final Object a(p80.q qVar, q.a aVar, p80.v vVar, p80.n nVar) {
            return qVar.m(aVar, vVar, nVar);
        }
    };

    /* renamed from: v, reason: collision with root package name */
    public static final z80.n f95926v = new z80.n();

    /* renamed from: q, reason: collision with root package name */
    public final i1 f95927q;

    public s3(UniqueId uniqueId, Class<?> testClass, Method testMethod, v80.e0 configuration) {
        super(uniqueId, testClass, testMethod, configuration);
        this.f95927q = new i1();
    }

    public static /* synthetic */ u2 N0(UniqueId uniqueId, int i11, org.junit.jupiter.api.i2 i2Var, TestSource testSource, v80.e0 e0Var) {
        return new q1(uniqueId, i11, i2Var, testSource, e0Var);
    }

    public static /* synthetic */ u2 O0(UniqueId uniqueId, int i11, org.junit.jupiter.api.b2 b2Var, TestSource testSource, i1 i1Var, v80.e0 e0Var) {
        return new g1(uniqueId, i11, b2Var, testSource, i1Var.k(), e0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [z80.n] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [w80.s3] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7, types: [w80.u2] */
    public static /* synthetic */ void P0(s3 s3Var, p80.n nVar, z80.t tVar, Node.a aVar) {
        s3Var.getClass();
        Object w11 = nVar.w();
        ?? r02 = f95926v;
        ?? c02 = s3Var.c0();
        Object c11 = r02.c(c02, w11, nVar, tVar.j(), f95925u);
        TestSource orElseThrow = s3Var.getSource().orElseThrow(new Supplier() { // from class: w80.m3
            @Override // java.util.function.Supplier
            public final Object get() {
                return s3.Q0();
            }
        });
        try {
            try {
                Stream<org.junit.jupiter.api.c2> U0 = s3Var.U0(c11);
                try {
                    Iterator<org.junit.jupiter.api.c2> it = U0.iterator();
                    int i11 = 1;
                    while (it.hasNext()) {
                        c02 = s3Var;
                        try {
                            Optional<u2> R0 = R0(c02, it.next(), i11, orElseThrow, s3Var.p(), s3Var.f95946f);
                            Objects.requireNonNull(aVar);
                            R0.ifPresent(new f1(aVar));
                            i11++;
                            s3Var = c02;
                        } catch (Throwable th2) {
                            th = th2;
                            Throwable th3 = th;
                            if (U0 == null) {
                                throw th3;
                            }
                            try {
                                U0.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    }
                    U0.close();
                    aVar.a();
                } catch (Throwable th5) {
                    th = th5;
                    c02 = s3Var;
                }
            } catch (ClassCastException e11) {
                e = e11;
                c02 = s3Var;
                throw c02.T0(e);
            }
        } catch (ClassCastException e12) {
            e = e12;
            throw c02.T0(e);
        }
    }

    public static /* synthetic */ JUnitException Q0() {
        return new JUnitException("Illegal state: TestSource must be present");
    }

    public static Optional<u2> R0(u2 parent, org.junit.jupiter.api.c2 node, int index, TestSource defaultTestSource, i1 dynamicDescendantFilter, final v80.e0 configuration) {
        final int i11;
        final UniqueId append;
        Supplier supplier;
        final i1 i1Var;
        final TestSource testSource = (TestSource) node.b().map(new Function() { // from class: w80.n3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return s3.S0((URI) obj);
            }
        }).orElse(defaultTestSource);
        if (node instanceof org.junit.jupiter.api.i2) {
            final org.junit.jupiter.api.i2 i2Var = (org.junit.jupiter.api.i2) node;
            append = parent.getUniqueId().append(f95924t, "#" + index);
            i11 = index;
            supplier = new Supplier() { // from class: w80.o3
                @Override // java.util.function.Supplier
                public final Object get() {
                    return s3.N0(UniqueId.this, i11, i2Var, testSource, configuration);
                }
            };
            i1Var = dynamicDescendantFilter;
        } else {
            i11 = index;
            final org.junit.jupiter.api.b2 b2Var = (org.junit.jupiter.api.b2) node;
            append = parent.getUniqueId().append(f95923s, "#" + i11);
            i1Var = dynamicDescendantFilter;
            supplier = new Supplier() { // from class: w80.p3
                @Override // java.util.function.Supplier
                public final Object get() {
                    return s3.O0(UniqueId.this, i11, b2Var, testSource, i1Var, configuration);
                }
            };
        }
        if (!i1Var.test(append, Integer.valueOf(i11 - 1))) {
            return Optional.empty();
        }
        u2 u2Var = (u2) supplier.get();
        u2Var.o(parent);
        return Optional.of(u2Var);
    }

    public static TestSource S0(URI uri) {
        ba0.c2.r(uri, "URI must not be null");
        return ClasspathResourceSource.CLASSPATH_SCHEME.equals(uri.getScheme()) ? ClasspathResourceSource.from(uri) : "class".equals(uri.getScheme()) ? ClassSource.from(uri) : "method".equals(uri.getScheme()) ? j3.d(uri) : UriSource.from(uri);
    }

    @Override // org.junit.platform.engine.TestDescriptor
    public boolean A() {
        return true;
    }

    @Override // w80.p4
    public void J0(final z80.t context, final Node.a dynamicTestExecutor) {
        final p80.n i11 = context.i();
        context.l().c(new m.a() { // from class: w80.q3
            @Override // org.junit.platform.engine.support.hierarchical.m.a
            public final void execute() {
                s3.P0(s3.this, i11, context, dynamicTestExecutor);
            }
        });
    }

    public final JUnitException T0(Throwable cause) {
        return new JUnitException(String.format("@TestFactory method [%s] must return a single %2$s or a Stream, Collection, Iterable, Iterator, or array of %2$s.", c0().toGenericString(), org.junit.jupiter.api.c2.class.getName()), cause);
    }

    public final Stream<org.junit.jupiter.api.c2> U0(Object testFactoryMethodResult) {
        if (testFactoryMethodResult instanceof org.junit.jupiter.api.c2) {
            return Stream.of((org.junit.jupiter.api.c2) testFactoryMethodResult);
        }
        try {
            return ba0.n1.i(testFactoryMethodResult);
        } catch (PreconditionViolationException e11) {
            throw T0(e11);
        }
    }

    @Override // w80.p4, org.junit.platform.engine.TestDescriptor
    public TestDescriptor.Type getType() {
        return TestDescriptor.Type.CONTAINER;
    }

    @Override // w80.j2
    public i1 p() {
        return this.f95927q;
    }

    @Override // w80.p4, org.junit.platform.engine.support.hierarchical.Node
    /* renamed from: L0 */
    public void y(z80.t context, TestDescriptor descriptor, TestExecutionResult result) {
    }

    @Override // w80.d3, org.junit.platform.engine.support.hierarchical.Node
    /* renamed from: e0 */
    public void k(z80.t context, TestDescriptor descriptor, Node.c result) {
    }
}
