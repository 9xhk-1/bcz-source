package jo;

import com.google.common.base.Preconditions;
import com.google.common.cache.RemovalNotification;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.c
@e
/* loaded from: classes7.dex */
public final class s {
    public static <K, V> p<K, V> c(final p<K, V> listener, final Executor executor) {
        Preconditions.checkNotNull(listener);
        Preconditions.checkNotNull(executor);
        return new p() { // from class: jo.r
            @Override // jo.p
            public final void a(RemovalNotification removalNotification) {
                executor.execute(new Runnable() { // from class: jo.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        p.this.a(removalNotification);
                    }
                });
            }
        };
    }
}
