package w80;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import org.apiguardian.api.API;
import org.junit.platform.engine.TestDescriptor;
import org.junit.platform.engine.TestTag;
import org.junit.platform.engine.UniqueId;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.0", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public class l3 extends o0 {

    /* renamed from: q, reason: collision with root package name */
    public static final String f95857q = "nested-class";

    public l3(UniqueId uniqueId, Class<?> testClass, v80.e0 configuration) {
        super(uniqueId, testClass, b1.k(testClass, configuration), configuration);
    }

    @Override // w80.o0
    public List<Class<?>> D0() {
        TestDescriptor orElse = getParent().orElse(null);
        if (!(orElse instanceof o0)) {
            return Collections.EMPTY_LIST;
        }
        o0 o0Var = (o0) orElse;
        ArrayList arrayList = new ArrayList(o0Var.D0());
        arrayList.add(o0Var.E0());
        return arrayList;
    }

    @Override // w80.o0
    public p80.f0 H0(z80.t parentExecutionContext, a90.o registry, a90.n registrar, p80.n extensionContext, org.junit.platform.engine.support.hierarchical.m throwableCollector) {
        return G0(Optional.of(parentExecutionContext.k().b(parentExecutionContext.j(), registrar, throwableCollector)), registry, extensionContext);
    }

    @Override // ga0.c, org.junit.platform.engine.TestDescriptor
    public final Set<TestTag> f() {
        final LinkedHashSet linkedHashSet = new LinkedHashSet(this.f95873j);
        getParent().ifPresent(new Consumer() { // from class: w80.k3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                linkedHashSet.addAll(((TestDescriptor) obj).f());
            }
        });
        return linkedHashSet;
    }
}
