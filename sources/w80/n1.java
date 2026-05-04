package w80;

import java.util.function.Function;
import java.util.function.Supplier;
import org.junit.platform.engine.TestDescriptor;
import org.junit.platform.engine.TestSource;
import org.junit.platform.engine.UniqueId;
import org.junit.platform.engine.support.hierarchical.Node;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class n1 extends u2 {

    /* renamed from: i, reason: collision with root package name */
    public final int f95865i;

    public n1(UniqueId uniqueId, int index, org.junit.jupiter.api.c2 dynamicNode, TestSource testSource, v80.e0 configuration) {
        super(uniqueId, dynamicNode.a(), testSource, configuration);
        this.f95865i = index;
    }

    public static /* synthetic */ p80.j X(z80.t tVar, p80.n nVar) {
        return new z80.h(nVar, tVar.j());
    }

    @Override // w80.u2, org.junit.platform.engine.support.hierarchical.Node
    /* renamed from: S */
    public z80.t l(final z80.t context) {
        return context.f().c(new j1(context.i(), context.h(), this, context.g(), new Function() { // from class: w80.m1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return n1.X(z80.t.this, (p80.n) obj);
            }
        })).a();
    }

    @Override // w80.u2, org.junit.platform.engine.support.hierarchical.Node
    /* renamed from: T */
    public Node.c E(z80.t context) {
        return Node.c.a();
    }

    @Override // org.junit.platform.engine.TestDescriptor
    public String c() {
        return ((String) getParent().map(new Function() { // from class: w80.k1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((TestDescriptor) obj).c();
            }
        }).orElseGet(new Supplier() { // from class: w80.l1
            @Override // java.util.function.Supplier
            public final Object get() {
                return n1.this.a();
            }
        })) + "[" + this.f95865i + "]";
    }
}
