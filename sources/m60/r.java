package m60;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class r extends l60.i {

    /* renamed from: v, reason: collision with root package name */
    @m80.k
    public final Socket f72466v;

    public r(@m80.k Socket socket) {
        g0.p(socket, "socket");
        this.f72466v = socket;
    }

    @Override // l60.i
    @m80.k
    public IOException A(@m80.l IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException(com.alipay.sdk.m.m.a.f10784h0);
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // l60.i
    public void G() {
        Logger logger;
        Logger logger2;
        try {
            this.f72466v.close();
        } catch (AssertionError e11) {
            if (!z.b(e11)) {
                throw e11;
            }
            logger2 = z.f72514a;
            logger2.log(Level.WARNING, "Failed to close timed out socket " + this.f72466v, (Throwable) e11);
        } catch (Exception e12) {
            logger = z.f72514a;
            logger.log(Level.WARNING, "Failed to close timed out socket " + this.f72466v, (Throwable) e12);
        }
    }
}
