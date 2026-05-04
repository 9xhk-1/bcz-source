package w80;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Set;
import java.util.function.Consumer;
import org.apiguardian.api.API;
import org.junit.platform.engine.UniqueId;
import org.junit.platform.engine.support.hierarchical.ExclusiveResource;
import p80.q;
import z80.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.0", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public class t4 extends p4 {

    /* renamed from: s, reason: collision with root package name */
    public static final String f95935s = "test-template-invocation";

    /* renamed from: t, reason: collision with root package name */
    public static final n.a<Method, Void> f95936t = n.a.c(new n.a.InterfaceC1389a() { // from class: w80.s4
        @Override // z80.n.a.InterfaceC1389a
        public final void a(p80.q qVar, q.a aVar, p80.v vVar, p80.n nVar) {
            qVar.c(aVar, vVar, nVar);
        }
    });

    /* renamed from: q, reason: collision with root package name */
    public p80.g0 f95937q;

    /* renamed from: r, reason: collision with root package name */
    public final int f95938r;

    public t4(UniqueId uniqueId, Class<?> testClass, Method templateMethod, p80.g0 invocationContext, int index, v80.e0 configuration) {
        super(uniqueId, invocationContext.a(index), testClass, templateMethod, configuration, f95936t);
        this.f95937q = invocationContext;
        this.f95938r = index;
    }

    @Override // w80.p4
    public a90.b0 M0(z80.t context) {
        final a90.b0 M0 = super.M0(context);
        this.f95937q.b().forEach(new Consumer() { // from class: w80.r4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                M0.e((p80.m) obj, t4.this.f95937q);
            }
        });
        return M0;
    }

    @Override // org.junit.platform.engine.support.hierarchical.Node
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public void x(z80.t context) {
        this.f95937q = null;
    }

    @Override // w80.d3, org.junit.platform.engine.TestDescriptor
    public String c() {
        return super.c() + "[" + this.f95938r + "]";
    }

    @Override // w80.d3, org.junit.platform.engine.support.hierarchical.Node
    public Set<ExclusiveResource> n() {
        return Collections.EMPTY_SET;
    }
}
