package w80;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;
import org.apiguardian.api.API;
import org.junit.platform.engine.TestTag;
import org.junit.platform.engine.UniqueId;
import org.junit.platform.engine.support.hierarchical.Node;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.0", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public class r0 extends o0 {

    /* renamed from: q, reason: collision with root package name */
    public static final String f95914q = "class";

    public r0(UniqueId uniqueId, Class<?> testClass, v80.e0 configuration) {
        super(uniqueId, testClass, b1.i(testClass, configuration), configuration);
    }

    @Override // w80.o0
    public List<Class<?>> D0() {
        return Collections.EMPTY_LIST;
    }

    @Override // w80.o0
    public p80.f0 H0(z80.t parentExecutionContext, a90.o registry, a90.n registrar, p80.n extensionContext, org.junit.platform.engine.support.hierarchical.m throwableCollector) {
        return G0(Optional.empty(), registry, extensionContext);
    }

    @Override // ga0.c, org.junit.platform.engine.TestDescriptor
    public Set<TestTag> f() {
        return new LinkedHashSet(this.f95873j);
    }

    @Override // w80.u2, org.junit.platform.engine.support.hierarchical.Node
    public Node.ExecutionMode j() {
        return O().orElseGet(new Supplier() { // from class: w80.q0
            @Override // java.util.function.Supplier
            public final Object get() {
                Node.ExecutionMode U;
                U = u2.U(r0.this.f95946f.j());
                return U;
            }
        });
    }
}
