package org.junit.platform.engine.support.hierarchical;

import androidx.camera.core.CameraInfo;
import ba0.g4;
import ca0.r;
import ja0.p;
import java.util.Collections;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.Future;
import org.apiguardian.api.API;
import org.junit.platform.engine.TestDescriptor;
import org.junit.platform.engine.TestExecutionResult;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(consumers = {"org.junit.platform.engine.support.hierarchical"}, since = "1.0", status = API.Status.MAINTAINED)
/* loaded from: classes9.dex */
public interface Node<C extends p> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @API(consumers = {"org.junit.platform.engine.support.hierarchical"}, since = "1.10", status = API.Status.STABLE)
    public enum ExecutionMode {
        SAME_THREAD,
        CONCURRENT
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void a() throws InterruptedException;

        void b(TestDescriptor testDescriptor);

        @API(since = "1.10", status = API.Status.STABLE)
        Future<?> c(TestDescriptor testDescriptor, r executionListener);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @API(since = "1.10", status = API.Status.STABLE)
    public interface b<C extends p> {
        void a(C context) throws Exception;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {

        /* renamed from: c, reason: collision with root package name */
        public static final c f78264c = new c(false, null);

        /* renamed from: a, reason: collision with root package name */
        public final boolean f78265a;

        /* renamed from: b, reason: collision with root package name */
        public final Optional<String> f78266b;

        public c(boolean skipped, String reason) {
            this.f78265a = skipped;
            this.f78266b = Optional.ofNullable(reason);
        }

        public static c a() {
            return f78264c;
        }

        public static c d(String reason) {
            return new c(true, reason);
        }

        public Optional<String> b() {
            return this.f78266b;
        }

        public boolean c() {
            return this.f78265a;
        }

        public String toString() {
            return new g4(this).a("skipped", Boolean.valueOf(this.f78265a)).a("reason", this.f78266b.orElse(CameraInfo.IMPLEMENTATION_TYPE_UNKNOWN)).toString();
        }
    }

    default c E(C context) throws Exception {
        return c.a();
    }

    @API(since = "1.10", status = API.Status.STABLE)
    default void h(C context, b<C> invocation) throws Exception {
        invocation.a(context);
    }

    @API(consumers = {"org.junit.platform.engine.support.hierarchical"}, since = "1.10", status = API.Status.STABLE)
    default ExecutionMode j() {
        return ExecutionMode.CONCURRENT;
    }

    @API(consumers = {"org.junit.platform.engine.support.hierarchical"}, since = "1.10", status = API.Status.STABLE)
    default Set<ExclusiveResource> n() {
        return Collections.EMPTY_SET;
    }

    default C D(C context) throws Exception {
        return context;
    }

    default C l(C context) throws Exception {
        return context;
    }

    default void v(C context) throws Exception {
    }

    default void x(C context) throws Exception {
    }

    default C z(C context, a dynamicTestExecutor) throws Exception {
        return context;
    }

    @API(consumers = {"org.junit.platform.engine.support.hierarchical"}, since = "1.10", status = API.Status.STABLE)
    default void k(C context, TestDescriptor testDescriptor, c result) {
    }

    @API(consumers = {"org.junit.platform.engine.support.hierarchical"}, since = "1.10", status = API.Status.STABLE)
    default void y(C context, TestDescriptor testDescriptor, TestExecutionResult result) {
    }
}
