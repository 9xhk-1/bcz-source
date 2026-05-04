package w80;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import ka0.i;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.platform.commons.JUnitException;
import org.junit.platform.engine.TestDescriptor;
import org.junit.platform.engine.TestTag;
import org.junit.platform.engine.support.hierarchical.Node;
import p80.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class e<T extends TestDescriptor> implements p80.n, AutoCloseable {

    /* renamed from: h, reason: collision with root package name */
    public static final i.b<n.a> f95777h = new i.b() { // from class: w80.d
        @Override // ka0.i.b
        public final void a(Object obj, Object obj2, Object obj3) {
            e.d0((n.a) obj, obj2, obj3);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final p80.n f95778a;

    /* renamed from: b, reason: collision with root package name */
    public final ca0.r f95779b;

    /* renamed from: c, reason: collision with root package name */
    public final T f95780c;

    /* renamed from: d, reason: collision with root package name */
    public final Set<String> f95781d;

    /* renamed from: e, reason: collision with root package name */
    public final v80.e0 f95782e;

    /* renamed from: f, reason: collision with root package name */
    public final ka0.i<n.a> f95783f;

    /* renamed from: g, reason: collision with root package name */
    public final p80.j f95784g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f95785a;

        static {
            int[] iArr = new int[Node.ExecutionMode.values().length];
            f95785a = iArr;
            try {
                iArr[Node.ExecutionMode.CONCURRENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f95785a[Node.ExecutionMode.SAME_THREAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public e(p80.n parent, ca0.r engineExecutionListener, T testDescriptor, v80.e0 configuration, Function<p80.n, p80.j> executableInvokerFactory) {
        this.f95784g = executableInvokerFactory.apply(this);
        ba0.c2.r(testDescriptor, "TestDescriptor must not be null");
        ba0.c2.r(configuration, "JupiterConfiguration must not be null");
        this.f95778a = parent;
        this.f95779b = engineExecutionListener;
        this.f95780c = testDescriptor;
        this.f95782e = configuration;
        this.f95783f = f0(parent);
        this.f95781d = (Set) testDescriptor.f().stream().map(new Function() { // from class: w80.a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((TestTag) obj).getName();
            }
        }).collect(Collectors.collectingAndThen(Collectors.toCollection(new b()), new c()));
    }

    public static /* synthetic */ void d0(n.a aVar, Object obj, Object obj2) {
        if (obj2 instanceof n.b.a) {
            ((n.b.a) obj2).close();
        }
    }

    public static ka0.i<n.a> f0(p80.n parent) {
        return new ka0.i<>(parent != null ? ((e) parent).f95783f : null, f95777h);
    }

    @Override // p80.n
    public p80.j H() {
        return this.f95784g;
    }

    @Override // p80.n
    public void S(Map<String, String> values) {
        this.f95779b.a(this.f95780c, ea0.d.d(values));
    }

    @Override // p80.n
    public n.b U(n.a namespace) {
        ba0.c2.r(namespace, "Namespace must not be null");
        return new z80.e0(this.f95783f, namespace);
    }

    @Override // p80.n
    public String a() {
        return i0().a();
    }

    @Override // p80.n
    public <V> Optional<V> c0(String key, Function<String, V> transformer) {
        return this.f95782e.b(key, transformer);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.f95783f.close();
    }

    @Override // p80.n
    public Set<String> f() {
        return new LinkedHashSet(this.f95781d);
    }

    @Override // p80.n
    public Optional<p80.n> getParent() {
        return Optional.ofNullable(this.f95778a);
    }

    @Override // p80.n
    public p80.n getRoot() {
        p80.n nVar = this.f95778a;
        return nVar != null ? nVar.getRoot() : this;
    }

    @Override // p80.n
    public String getUniqueId() {
        return i0().getUniqueId().toString();
    }

    public abstract Node.ExecutionMode h0();

    @Override // p80.n
    public Optional<String> i(String key) {
        return this.f95782e.h(key);
    }

    public T i0() {
        return this.f95780c;
    }

    @Override // p80.n
    public ExecutionMode j() {
        return k0(h0());
    }

    public final ExecutionMode k0(Node.ExecutionMode mode) {
        int i11 = a.f95785a[mode.ordinal()];
        if (i11 == 1) {
            return ExecutionMode.CONCURRENT;
        }
        if (i11 == 2) {
            return ExecutionMode.SAME_THREAD;
        }
        throw new JUnitException("Unknown ExecutionMode: " + mode);
    }
}
