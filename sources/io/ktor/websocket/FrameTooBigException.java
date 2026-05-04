package io.ktor.websocket;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class FrameTooBigException extends Exception implements c40.g0<FrameTooBigException> {
    private final long frameSize;

    public FrameTooBigException(long j11) {
        this.frameSize = j11;
    }

    public final long getFrameSize() {
        return this.frameSize;
    }

    @Override // java.lang.Throwable
    @m80.k
    public String getMessage() {
        return "Frame is too big: " + this.frameSize;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // c40.g0
    @m80.k
    public FrameTooBigException createCopy() {
        FrameTooBigException frameTooBigException = new FrameTooBigException(this.frameSize);
        io.ktor.util.internal.c.a(frameTooBigException, this);
        return frameTooBigException;
    }
}
