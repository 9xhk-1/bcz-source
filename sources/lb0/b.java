package lb0;

import java.io.IOException;
import l60.i1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface b<T> extends Cloneable {
    i1 D();

    void K0(d<T> dVar);

    void cancel();

    /* renamed from: clone */
    b<T> mo6328clone();

    y<T> execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    okhttp3.l request();
}
