package org.junit.platform.engine.support.hierarchical;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.function.Consumer;
import org.apiguardian.api.API;
import org.junit.platform.engine.support.hierarchical.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.10", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public class k implements e {
    @Override // org.junit.platform.engine.support.hierarchical.e
    public Future<Void> e3(e.a testTask) {
        testTask.execute();
        return CompletableFuture.completedFuture(null);
    }

    @Override // org.junit.platform.engine.support.hierarchical.e
    public void v7(List<? extends e.a> tasks) {
        tasks.forEach(new Consumer() { // from class: ja0.q1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((e.a) obj).execute();
            }
        });
    }

    @Override // org.junit.platform.engine.support.hierarchical.e, java.lang.AutoCloseable
    public void close() {
    }
}
