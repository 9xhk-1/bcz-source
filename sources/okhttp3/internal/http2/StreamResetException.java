package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.jvm.internal.g0;
import m80.k;
import w00.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class StreamResetException extends IOException {

    @g
    @k
    public final ErrorCode errorCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamResetException(@k ErrorCode errorCode) {
        super("stream was reset: " + errorCode);
        g0.p(errorCode, "errorCode");
        this.errorCode = errorCode;
    }
}
