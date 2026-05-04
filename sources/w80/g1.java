package w80;

import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Stream;
import org.junit.platform.engine.TestDescriptor;
import org.junit.platform.engine.TestSource;
import org.junit.platform.engine.UniqueId;
import org.junit.platform.engine.support.hierarchical.Node;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class g1 extends n1 {

    /* renamed from: j, reason: collision with root package name */
    public final org.junit.jupiter.api.b2 f95814j;

    /* renamed from: k, reason: collision with root package name */
    public final TestSource f95815k;

    /* renamed from: l, reason: collision with root package name */
    public final i1 f95816l;

    public g1(UniqueId uniqueId, int index, org.junit.jupiter.api.b2 dynamicContainer, TestSource testSource, i1 dynamicDescendantFilter, v80.e0 configuration) {
        super(uniqueId, index, dynamicContainer, testSource, configuration);
        this.f95814j = dynamicContainer;
        this.f95815k = testSource;
        this.f95816l = dynamicDescendantFilter;
    }

    public static /* synthetic */ Optional Y(g1 g1Var, AtomicInteger atomicInteger, org.junit.jupiter.api.c2 c2Var) {
        g1Var.getClass();
        ba0.c2.r(c2Var, "individual dynamic node must not be null");
        return g1Var.a0(atomicInteger.getAndIncrement(), c2Var);
    }

    @Override // org.junit.platform.engine.support.hierarchical.Node
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public z80.t z(z80.t context, Node.a dynamicTestExecutor) throws Exception {
        final AtomicInteger atomicInteger = new AtomicInteger(1);
        Stream<? extends org.junit.jupiter.api.c2> f11 = this.f95814j.f();
        try {
            Stream map = f11.map(new Function() { // from class: w80.c1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return g1.Y(g1.this, atomicInteger, (org.junit.jupiter.api.c2) obj);
                }
            }).filter(new d1()).map(new Function() { // from class: w80.e1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return (u2) ((Optional) obj).get();
                }
            });
            Objects.requireNonNull(dynamicTestExecutor);
            map.forEachOrdered(new f1(dynamicTestExecutor));
            f11.close();
            return context;
        } catch (Throwable th2) {
            if (f11 != null) {
                try {
                    f11.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public final Optional<u2> a0(int index, org.junit.jupiter.api.c2 childNode) {
        return s3.R0(this, childNode, index, this.f95815k, this.f95816l, this.f95946f);
    }

    @Override // org.junit.platform.engine.TestDescriptor
    public TestDescriptor.Type getType() {
        return TestDescriptor.Type.CONTAINER;
    }
}
