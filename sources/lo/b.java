package lo;

import java.util.concurrent.Executor;
import lo.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e
/* loaded from: classes7.dex */
public class b extends f {
    public b(String identifier, Executor executor) {
        super(identifier, executor, d.c(), f.a.f71559a);
    }

    public b(Executor executor, l subscriberExceptionHandler) {
        super("default", executor, d.c(), subscriberExceptionHandler);
    }

    public b(Executor executor) {
        super("default", executor, d.c(), f.a.f71559a);
    }
}
