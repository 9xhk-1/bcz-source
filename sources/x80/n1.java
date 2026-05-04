package x80;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import org.junit.jupiter.api.j3;
import org.junit.jupiter.api.l2;
import org.junit.platform.commons.util.ReflectionUtils;
import org.junit.platform.engine.TestDescriptor;
import org.junit.platform.engine.support.hierarchical.Node;
import w80.d3;
import w80.p2;
import x80.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class n1 extends n<w80.o0, d3, q0> {

    /* renamed from: b, reason: collision with root package name */
    public final v80.e0 f97870b;

    public n1(v80.e0 configuration) {
        this.f97870b = configuration;
    }

    public static /* synthetic */ l2 i(Class cls) {
        return (l2) ReflectionUtils.x1(cls, new Object[0]);
    }

    public static /* synthetic */ void j(final n1 n1Var, final Class cls, final w80.o0 o0Var, final l2 l2Var) {
        n1Var.getClass();
        n1Var.h(o0Var, d3.class, new Function() { // from class: x80.l1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new q0((d3) obj);
            }
        }, new n.a(new Consumer() { // from class: x80.i1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                l2Var.b(new r0(cls, (List) obj, n1.this.f97870b));
            }
        }, new n.b() { // from class: x80.j1
            @Override // x80.n.b
            public final String a(int i11) {
                String format;
                format = String.format("MethodOrderer [%s] added %s MethodDescriptor(s) for test class [%s] which will be ignored.", l2.this.getClass().getName(), Integer.valueOf(i11), cls.getName());
                return format;
            }
        }, new n.b() { // from class: x80.k1
            @Override // x80.n.b
            public final String a(int i11) {
                String format;
                format = String.format("MethodOrderer [%s] removed %s MethodDescriptor(s) for test class [%s] which will be retained with arbitrary ordering.", l2.this.getClass().getName(), Integer.valueOf(i11), cls.getName());
                return format;
            }
        }));
        Optional<U> map = l2Var.a().map(new p2());
        Objects.requireNonNull(o0Var);
        map.ifPresent(new Consumer() { // from class: x80.m1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                w80.o0.this.Z0((Node.ExecutionMode) obj);
            }
        });
    }

    public static /* synthetic */ void k(n1 n1Var, w80.o0 o0Var) {
        n1Var.getClass();
        n1Var.p(o0Var, o0Var.E0());
    }

    public static /* synthetic */ String o(w80.o0 o0Var) {
        return "Failed to order methods for " + o0Var.E0();
    }

    @Override // org.junit.platform.engine.TestDescriptor.a
    public void a(TestDescriptor testDescriptor) {
        f(w80.o0.class, testDescriptor, new Consumer() { // from class: x80.c1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                n1.k(n1.this, (w80.o0) obj);
            }
        }, new Function() { // from class: x80.d1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return n1.o((w80.o0) obj);
            }
        });
    }

    public final void p(final w80.o0 classBasedTestDescriptor, final Class<?> testClass) {
        Optional map = z90.f.m(testClass, j3.class).map(new Function() { // from class: x80.b1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((j3) obj).value();
            }
        }).map(new Function() { // from class: x80.e1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return n1.i((Class) obj);
            }
        }).map(new Function() { // from class: x80.f1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Optional.of((l2) obj);
            }
        });
        final v80.e0 e0Var = this.f97870b;
        Objects.requireNonNull(e0Var);
        ((Optional) map.orElseGet(new Supplier() { // from class: x80.g1
            @Override // java.util.function.Supplier
            public final Object get() {
                return v80.e0.this.i();
            }
        })).ifPresent(new Consumer() { // from class: x80.h1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                n1.j(n1.this, testClass, classBasedTestDescriptor, (l2) obj);
            }
        });
    }
}
