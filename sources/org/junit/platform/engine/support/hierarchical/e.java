package org.junit.platform.engine.support.hierarchical;

import ja0.p1;
import java.util.List;
import java.util.concurrent.Future;
import org.apiguardian.api.API;
import org.junit.platform.engine.support.hierarchical.Node;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.10", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public interface e extends AutoCloseable {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void execute();

        Node.ExecutionMode j();

        p1 k();
    }

    @Override // java.lang.AutoCloseable
    void close();

    Future<Void> e3(a testTask);

    void v7(List<? extends a> testTasks);
}
