package io.ktor.serialization;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class WebsocketDeserializeException extends WebsocketContentConvertException {

    @k
    private final io.ktor.websocket.d frame;

    public /* synthetic */ WebsocketDeserializeException(String str, Throwable th2, io.ktor.websocket.d dVar, int i11, v vVar) {
        this(str, (i11 & 2) != 0 ? null : th2, dVar);
    }

    @k
    public final io.ktor.websocket.d getFrame() {
        return this.frame;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebsocketDeserializeException(@k String message, @l Throwable th2, @k io.ktor.websocket.d frame) {
        super(message, th2);
        g0.p(message, "message");
        g0.p(frame, "frame");
        this.frame = frame;
    }
}
