package w80;

import org.junit.platform.engine.TestDescriptor;
import org.junit.platform.engine.TestSource;
import org.junit.platform.engine.UniqueId;
import org.junit.platform.engine.support.hierarchical.Node;
import p80.q;
import z80.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class q1 extends n1 {

    /* renamed from: k, reason: collision with root package name */
    public static final z80.o f95907k = new z80.o();

    /* renamed from: j, reason: collision with root package name */
    public org.junit.jupiter.api.i2 f95908j;

    public q1(UniqueId uniqueId, int index, org.junit.jupiter.api.i2 dynamicTest, TestSource source, v80.e0 configuration) {
        super(uniqueId, index, dynamicTest, source, configuration);
        this.f95908j = dynamicTest;
    }

    public static /* synthetic */ Void Z(q1 q1Var) {
        q1Var.f95908j.j().execute();
        return null;
    }

    @Override // org.junit.platform.engine.support.hierarchical.Node
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public void x(z80.t context) throws Exception {
        super.x(context);
        this.f95908j = null;
    }

    @Override // org.junit.platform.engine.support.hierarchical.Node
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public z80.t z(z80.t context, Node.a dynamicTestExecutor) {
        q.a aVar = new q.a() { // from class: w80.o1
            @Override // p80.q.a
            public final Object b() {
                return q1.Z(q1.this);
            }
        };
        final s0 s0Var = new s0(this.f95908j.j());
        final p80.n i11 = context.i();
        f95907k.c(aVar, context.j(), o.b.b(new o.d() { // from class: w80.p1
            @Override // z80.o.d
            public final void a(p80.q qVar, q.a aVar2) {
                qVar.K(aVar2, p80.i.this, i11);
            }
        }));
        return context;
    }

    @Override // org.junit.platform.engine.TestDescriptor
    public TestDescriptor.Type getType() {
        return TestDescriptor.Type.TEST;
    }
}
