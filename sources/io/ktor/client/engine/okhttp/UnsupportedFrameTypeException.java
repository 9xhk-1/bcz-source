package io.ktor.client.engine.okhttp;

import c40.g0;
import io.ktor.websocket.d;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class UnsupportedFrameTypeException extends IllegalArgumentException implements g0<UnsupportedFrameTypeException> {

    @k
    private final d frame;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnsupportedFrameTypeException(@k d frame) {
        super("Unsupported frame type: " + frame);
        kotlin.jvm.internal.g0.p(frame, "frame");
        this.frame = frame;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // c40.g0
    @k
    public UnsupportedFrameTypeException createCopy() {
        UnsupportedFrameTypeException unsupportedFrameTypeException = new UnsupportedFrameTypeException(this.frame);
        unsupportedFrameTypeException.initCause(this);
        return unsupportedFrameTypeException;
    }
}
