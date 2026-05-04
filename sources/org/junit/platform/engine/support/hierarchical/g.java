package org.junit.platform.engine.support.hierarchical;

import ja0.h0;
import ja0.j1;
import ja0.p1;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.junit.platform.engine.TestDescriptor;
import org.junit.platform.engine.support.hierarchical.Node;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final Map<TestDescriptor, Node.ExecutionMode> f78289a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Map<TestDescriptor, p1> f78290b = new HashMap();

    public void b(TestDescriptor testDescriptor, Node.ExecutionMode executionMode) {
        this.f78289a.put(testDescriptor, executionMode);
    }

    public Optional<Node.ExecutionMode> c(TestDescriptor testDescriptor) {
        return testDescriptor.getParent().flatMap(new h0(this));
    }

    public p1 d(TestDescriptor testDescriptor) {
        return this.f78290b.getOrDefault(testDescriptor, j1.f63967a);
    }

    public final Optional<Node.ExecutionMode> e(TestDescriptor testDescriptor) {
        Node.ExecutionMode executionMode = this.f78289a.get(testDescriptor);
        return executionMode != null ? Optional.of(executionMode) : testDescriptor.getParent().flatMap(new h0(this));
    }

    public void f(TestDescriptor testDescriptor) {
        this.f78290b.remove(testDescriptor);
    }

    public void g(TestDescriptor testDescriptor, p1 resourceLock) {
        this.f78290b.put(testDescriptor, resourceLock);
    }
}
