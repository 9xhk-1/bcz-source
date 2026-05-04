package coil.network;

import m80.k;
import okhttp3.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class HttpException extends RuntimeException {

    @k
    private final n response;

    public HttpException(@k n nVar) {
        super("HTTP " + nVar.Z() + ": " + nVar.o0());
        this.response = nVar;
    }

    @k
    public final n getResponse() {
        return this.response;
    }
}
