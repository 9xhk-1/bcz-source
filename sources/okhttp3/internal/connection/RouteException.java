package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.jvm.internal.g0;
import m80.k;
import yz.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class RouteException extends RuntimeException {

    @k
    private final IOException firstConnectException;

    @k
    private IOException lastConnectException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteException(@k IOException firstConnectException) {
        super(firstConnectException);
        g0.p(firstConnectException, "firstConnectException");
        this.firstConnectException = firstConnectException;
        this.lastConnectException = firstConnectException;
    }

    public final void addConnectException(@k IOException e11) {
        g0.p(e11, "e");
        r.a(this.firstConnectException, e11);
        this.lastConnectException = e11;
    }

    @k
    public final IOException getFirstConnectException() {
        return this.firstConnectException;
    }

    @k
    public final IOException getLastConnectException() {
        return this.lastConnectException;
    }
}
