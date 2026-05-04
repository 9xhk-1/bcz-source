package t50;

import java.io.IOException;
import l60.i1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface b extends Cloneable {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        @m80.k
        b b(@m80.k okhttp3.l lVar);
    }

    @m80.k
    i1 D();

    void U(@m80.k c cVar);

    void cancel();

    @m80.k
    /* renamed from: clone */
    b mo6332clone();

    @m80.k
    okhttp3.n execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    @m80.k
    okhttp3.l request();
}
