package d70;

import java.io.IOException;
import org.apache.commons.logging.Log;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class r implements x70.e {

    /* renamed from: a, reason: collision with root package name */
    public final Log f47431a;

    public r(Log log) {
        this.f47431a = log;
    }

    @Override // x70.e
    public boolean a(RuntimeException runtimeException) {
        this.f47431a.error("Fatal runtime error", runtimeException);
        return false;
    }

    @Override // x70.e
    public boolean b(IOException iOException) {
        this.f47431a.error("Fatal I/O error", iOException);
        return false;
    }
}
