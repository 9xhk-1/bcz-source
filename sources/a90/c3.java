package a90;

import a90.d3;
import ba0.b4;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtensionConfigurationException;
import org.junit.platform.commons.util.ReflectionUtils;
import p80.n;
import p80.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class c3 implements p80.e, p80.f, p80.q {

    /* renamed from: a, reason: collision with root package name */
    public static final n.a f2338a = n.a.b(Timeout.class);

    /* renamed from: b, reason: collision with root package name */
    public static final String f2339b = "testable_method_timeout_from_annotation";

    /* renamed from: c, reason: collision with root package name */
    public static final String f2340c = "testable_method_timeout_thread_mode_from_annotation";

    /* renamed from: d, reason: collision with root package name */
    public static final String f2341d = "global_timeout_config";

    /* renamed from: e, reason: collision with root package name */
    public static final String f2342e = "enabled";

    /* renamed from: f, reason: collision with root package name */
    public static final String f2343f = "disabled";

    /* renamed from: g, reason: collision with root package name */
    public static final String f2344g = "disabled_on_debug";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @FunctionalInterface
    public interface a extends Function<d2, Optional<k2>> {
    }

    public static /* synthetic */ d2 P(p80.n nVar, String str) {
        return new d2(nVar);
    }

    @Override // p80.e
    public void A(p80.n context) {
        a0(context);
    }

    @Override // p80.q
    public void J(q.a<Void> invocation, p80.v<Method> invocationContext, p80.n extensionContext) throws Throwable {
        W(invocation, invocationContext, extensionContext, new a() { // from class: a90.t2
            @Override // java.util.function.Function
            public final Optional<k2> apply(d2 d2Var) {
                return d2Var.l();
            }
        });
    }

    public final <T> q.a<T> Q(q.a<T> invocation, final p80.v<Method> invocationContext, final p80.n extensionContext, k2 timeout) {
        if (timeout == null || Z(extensionContext)) {
            return invocation;
        }
        return new d3(extensionContext.getRoot().U(f2338a)).a(d0(extensionContext), new d3.c<>(invocation, timeout, new Supplier() { // from class: a90.b3
            @Override // java.util.function.Supplier
            public final Object get() {
                String R;
                R = c3.this.R(invocationContext, extensionContext);
                return R;
            }
        }));
    }

    public final String R(p80.v<Method> invocationContext, p80.n extensionContext) {
        Method a11 = invocationContext.a();
        Optional<Class<?>> c11 = extensionContext.c();
        return (c11.isPresent() && invocationContext.getTargetClass().equals(c11.get())) ? String.format("%s(%s)", a11.getName(), ba0.y.d(a11.getParameterTypes())) : ReflectionUtils.x0(invocationContext.getTargetClass(), a11);
    }

    public final Timeout.ThreadMode S(p80.n extensionContext) {
        return (Timeout.ThreadMode) extensionContext.U(f2338a).e(f2340c, Timeout.ThreadMode.class);
    }

    public final k2 T(p80.n extensionContext, a defaultTimeoutProvider) {
        return defaultTimeoutProvider.apply(U(extensionContext)).orElse(null);
    }

    public final d2 U(p80.n extensionContext) {
        final p80.n root = extensionContext.getRoot();
        return (d2) root.U(f2338a).c(f2341d, new Function() { // from class: a90.z2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return c3.P(p80.n.this, (String) obj);
            }
        }, d2.class);
    }

    public final <T> T V(q.a<T> invocation, p80.v<Method> invocationContext, p80.n extensionContext, k2 explicitTimeout, a defaultTimeoutProvider) throws Throwable {
        if (explicitTimeout == null) {
            explicitTimeout = T(extensionContext, defaultTimeoutProvider);
        }
        return Q(invocation, invocationContext, extensionContext, explicitTimeout).b();
    }

    public final void W(q.a<Void> invocation, p80.v<Method> invocationContext, p80.n extensionContext, a defaultTimeoutProvider) throws Throwable {
        V(invocation, invocationContext, extensionContext, b0(Optional.of(invocationContext.a())).orElse(null), defaultTimeoutProvider);
    }

    public final <T> T X(q.a<T> aVar, p80.v<Method> vVar, p80.n nVar, a aVar2) throws Throwable {
        return (T) V(aVar, vVar, nVar, (k2) nVar.U(f2338a).e(f2339b, k2.class), aVar2);
    }

    public final boolean Y(String mode) {
        mode.getClass();
        switch (mode) {
            case "enabled":
                return false;
            case "disabled":
                return true;
            case "disabled_on_debug":
                return b4.d();
            default:
                throw new ExtensionConfigurationException("Unsupported timeout mode: " + mode);
        }
    }

    public final boolean Z(p80.n extensionContext) {
        return ((Boolean) extensionContext.i("junit.jupiter.execution.timeout.mode").map(new Function() { // from class: a90.w2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                boolean Y;
                Y = c3.this.Y((String) obj);
                return Boolean.valueOf(Y);
            }
        }).orElse(Boolean.FALSE)).booleanValue();
    }

    public final void a0(final p80.n context) {
        b0(context.e()).ifPresent(new Consumer() { // from class: a90.x2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                p80.n.this.U(c3.f2338a).put(c3.f2339b, (k2) obj);
            }
        });
        c0(context.e()).ifPresent(new Consumer() { // from class: a90.y2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                p80.n.this.U(c3.f2338a).put(c3.f2340c, (Timeout.ThreadMode) obj);
            }
        });
    }

    public final Optional<k2> b0(Optional<AnnotatedElement> element) {
        return z90.f.n(element, Timeout.class).map(new Function() { // from class: a90.o2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return k2.b((Timeout) obj);
            }
        });
    }

    @Override // p80.q
    public void c(q.a<Void> invocation, p80.v<Method> invocationContext, p80.n extensionContext) throws Throwable {
        X(invocation, invocationContext, extensionContext, new a() { // from class: a90.a3
            @Override // java.util.function.Function
            public final Optional<k2> apply(d2 d2Var) {
                return d2Var.q();
            }
        });
    }

    public final Optional<Timeout.ThreadMode> c0(Optional<AnnotatedElement> element) {
        return z90.f.n(element, Timeout.class).map(new Function() { // from class: a90.r2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Timeout) obj).threadMode();
            }
        });
    }

    public final Timeout.ThreadMode d0(p80.n extensionContext) {
        Timeout.ThreadMode S = S(extensionContext);
        return (S == null || S == Timeout.ThreadMode.INFERRED) ? U(extensionContext).t().orElse(Timeout.ThreadMode.SAME_THREAD) : S;
    }

    @Override // p80.q
    public <T> T m(q.a<T> aVar, p80.v<Method> vVar, p80.n nVar) throws Throwable {
        return (T) X(aVar, vVar, nVar, new a() { // from class: a90.s2
            @Override // java.util.function.Function
            public final Optional<k2> apply(d2 d2Var) {
                return d2Var.o();
            }
        });
    }

    @Override // p80.f
    public void n(p80.n context) {
        a0(context);
    }

    @Override // p80.q
    public void o(q.a<Void> invocation, p80.v<Method> invocationContext, p80.n extensionContext) throws Throwable {
        W(invocation, invocationContext, extensionContext, new a() { // from class: a90.u2
            @Override // java.util.function.Function
            public final Optional<k2> apply(d2 d2Var) {
                return d2Var.m();
            }
        });
    }

    @Override // p80.q
    public void p(q.a<Void> invocation, p80.v<Method> invocationContext, p80.n extensionContext) throws Throwable {
        W(invocation, invocationContext, extensionContext, new a() { // from class: a90.v2
            @Override // java.util.function.Function
            public final Optional<k2> apply(d2 d2Var) {
                return d2Var.j();
            }
        });
    }

    @Override // p80.q
    public void t(q.a<Void> invocation, p80.v<Method> invocationContext, p80.n extensionContext) throws Throwable {
        X(invocation, invocationContext, extensionContext, new a() { // from class: a90.q2
            @Override // java.util.function.Function
            public final Optional<k2> apply(d2 d2Var) {
                return d2Var.p();
            }
        });
    }

    @Override // p80.q
    public void v(q.a<Void> invocation, p80.v<Method> invocationContext, p80.n extensionContext) throws Throwable {
        W(invocation, invocationContext, extensionContext, new a() { // from class: a90.p2
            @Override // java.util.function.Function
            public final Optional<k2> apply(d2 d2Var) {
                return d2Var.k();
            }
        });
    }
}
