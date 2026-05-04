package w80;

import androidx.camera.core.CameraInfo;
import java.lang.reflect.AnnotatedElement;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.apiguardian.api.API;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.api.parallel.ResourceAccessMode;
import org.junit.platform.commons.JUnitException;
import org.junit.platform.engine.TestDescriptor;
import org.junit.platform.engine.TestSource;
import org.junit.platform.engine.TestTag;
import org.junit.platform.engine.UniqueId;
import org.junit.platform.engine.support.hierarchical.ExclusiveResource;
import org.junit.platform.engine.support.hierarchical.Node;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.0", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public abstract class u2 extends ga0.c implements Node<z80.t> {

    /* renamed from: g, reason: collision with root package name */
    public static final y90.e f95944g = y90.g.c(u2.class);

    /* renamed from: h, reason: collision with root package name */
    public static final z80.f f95945h = new z80.f();

    /* renamed from: f, reason: collision with root package name */
    public final v80.e0 f95946f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f95947a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f95948b;

        static {
            int[] iArr = new int[ResourceAccessMode.values().length];
            f95948b = iArr;
            try {
                iArr[ResourceAccessMode.READ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f95948b[ResourceAccessMode.READ_WRITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ExecutionMode.values().length];
            f95947a = iArr2;
            try {
                iArr2[ExecutionMode.CONCURRENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f95947a[ExecutionMode.SAME_THREAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @FunctionalInterface
    public interface b<E extends p80.m> {
        void a(E exceptionHandler, Throwable throwable) throws Throwable;
    }

    public u2(UniqueId uniqueId, AnnotatedElement element, Supplier<String> displayNameSupplier, TestSource source, v80.e0 configuration) {
        this(uniqueId, b1.l(element, displayNameSupplier), source, configuration);
    }

    public static /* synthetic */ boolean I(final AnnotatedElement annotatedElement, final String str) {
        boolean isValid = TestTag.isValid(str);
        if (!isValid) {
            f95944g.f(new Supplier() { // from class: w80.n2
                @Override // java.util.function.Supplier
                public final Object get() {
                    String format;
                    format = String.format("Configuration error: invalid tag syntax in @Tag(\"%s\") declaration on [%s]. Tag will be ignored.", str, annotatedElement);
                    return format;
                }
            });
        }
        return isValid;
    }

    public static /* synthetic */ ExclusiveResource J(t80.c cVar) {
        return new ExclusiveResource(cVar.value(), V(cVar.mode()));
    }

    public static Set<TestTag> P(final AnnotatedElement element) {
        return (Set) org.junit.platform.commons.util.a.s(element, org.junit.jupiter.api.d3.class).stream().map(new Function() { // from class: w80.q2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((org.junit.jupiter.api.d3) obj).value();
            }
        }).filter(new Predicate() { // from class: w80.r2
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return u2.I(element, (String) obj);
            }
        }).map(new Function() { // from class: w80.s2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return TestTag.create((String) obj);
            }
        }).collect(Collectors.collectingAndThen(Collectors.toCollection(new w80.b()), new c()));
    }

    public static Node.ExecutionMode U(ExecutionMode mode) {
        int i11 = a.f95947a[mode.ordinal()];
        if (i11 == 1) {
            return Node.ExecutionMode.CONCURRENT;
        }
        if (i11 == 2) {
            return Node.ExecutionMode.SAME_THREAD;
        }
        throw new JUnitException("Unknown ExecutionMode: " + mode);
    }

    public static ExclusiveResource.LockMode V(ResourceAccessMode mode) {
        int i11 = a.f95948b[mode.ordinal()];
        if (i11 == 1) {
            return ExclusiveResource.LockMode.READ;
        }
        if (i11 == 2) {
            return ExclusiveResource.LockMode.READ_WRITE;
        }
        throw new JUnitException("Unknown ResourceAccessMode: " + mode);
    }

    @Override // org.junit.platform.engine.support.hierarchical.Node
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public void v(z80.t context) throws Exception {
        context.e();
    }

    public Optional<Node.ExecutionMode> L() {
        return Optional.empty();
    }

    public Set<ExclusiveResource> M(AnnotatedElement element) {
        return (Set) org.junit.platform.commons.util.a.s(element, t80.c.class).stream().map(new Function() { // from class: w80.t2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u2.J((t80.c) obj);
            }
        }).collect(Collectors.toSet());
    }

    public Optional<Node.ExecutionMode> N(AnnotatedElement element) {
        return org.junit.platform.commons.util.a.m(element, t80.a.class).map(new Function() { // from class: w80.o2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((t80.a) obj).value();
            }
        }).map(new p2());
    }

    public Optional<Node.ExecutionMode> O() {
        return Optional.empty();
    }

    public <E extends p80.m> void Q(Class<E> handlerType, a90.o registry, Throwable throwable, b<E> handlerInvoker) {
        List<E> c11 = registry.c(handlerType);
        Collections.reverse(c11);
        R(c11, throwable, handlerInvoker);
    }

    public final <E extends p80.m> void R(List<E> exceptionHandlers, Throwable throwable, b<E> handlerInvoker) {
        if (exceptionHandlers.isEmpty()) {
            throw ba0.o1.e(throwable);
        }
        try {
            handlerInvoker.a(exceptionHandlers.remove(0), throwable);
        } catch (Throwable th2) {
            ba0.h4.a(th2);
            R(exceptionHandlers, th2, handlerInvoker);
        }
    }

    @Override // org.junit.platform.engine.support.hierarchical.Node
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public abstract z80.t l(z80.t context) throws Exception;

    @Override // org.junit.platform.engine.support.hierarchical.Node
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public Node.c E(z80.t context) throws Exception {
        context.l().b();
        return W(f95945h.c(context.j(), context.g(), context.i()));
    }

    public final Node.c W(p80.h evaluationResult) {
        return evaluationResult.e() ? Node.c.d(evaluationResult.d().orElse(CameraInfo.IMPLEMENTATION_TYPE_UNKNOWN)) : Node.c.a();
    }

    public Node.ExecutionMode j() {
        Optional<Node.ExecutionMode> O = O();
        if (O.isPresent()) {
            return O.get();
        }
        Optional<TestDescriptor> parent = getParent();
        while (parent.isPresent() && (parent.get() instanceof u2)) {
            u2 u2Var = (u2) parent.get();
            Optional<Node.ExecutionMode> O2 = u2Var.O();
            if (O2.isPresent()) {
                return O2.get();
            }
            Optional<Node.ExecutionMode> L = u2Var.L();
            if (L.isPresent()) {
                return L.get();
            }
            parent = u2Var.getParent();
        }
        return U(this.f95946f.a());
    }

    public u2(UniqueId uniqueId, String displayName, TestSource source, v80.e0 configuration) {
        super(uniqueId, displayName, source);
        this.f95946f = configuration;
    }
}
