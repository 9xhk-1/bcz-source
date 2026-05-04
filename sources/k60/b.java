package k60;

import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import okhttp3.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class b {
    public void a(@k a eventSource) {
        g0.p(eventSource, "eventSource");
    }

    public void b(@k a eventSource, @l String str, @l String str2, @k String data) {
        g0.p(eventSource, "eventSource");
        g0.p(data, "data");
    }

    public void d(@k a eventSource, @l Throwable th2, @l n nVar) {
        g0.p(eventSource, "eventSource");
    }

    public void e(@k a eventSource, @k n response) {
        g0.p(eventSource, "eventSource");
        g0.p(response, "response");
    }
}
