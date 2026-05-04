package t50;

import kotlin.jvm.internal.g0;
import okio.ByteString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class t {
    public void a(@m80.k s webSocket, int i11, @m80.k String reason) {
        g0.p(webSocket, "webSocket");
        g0.p(reason, "reason");
    }

    public void b(@m80.k s webSocket, int i11, @m80.k String reason) {
        g0.p(webSocket, "webSocket");
        g0.p(reason, "reason");
    }

    public void d(@m80.k s webSocket, @m80.k Throwable t11, @m80.l okhttp3.n nVar) {
        g0.p(webSocket, "webSocket");
        g0.p(t11, "t");
    }

    public void e(@m80.k s webSocket, @m80.k String text) {
        g0.p(webSocket, "webSocket");
        g0.p(text, "text");
    }

    public void h(@m80.k s webSocket, @m80.k ByteString bytes) {
        g0.p(webSocket, "webSocket");
        g0.p(bytes, "bytes");
    }

    public void i(@m80.k s webSocket, @m80.k okhttp3.n response) {
        g0.p(webSocket, "webSocket");
        g0.p(response, "response");
    }
}
