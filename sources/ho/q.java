package ho;

import java.lang.ref.WeakReference;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@j
@go.c
/* loaded from: classes7.dex */
public abstract class q<T> extends WeakReference<T> implements n {
    public q(@CheckForNull T referent, o queue) {
        super(referent, queue.f59681a);
        queue.c();
    }
}
