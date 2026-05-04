package org.apache.thrift.server;

import org.apache.thrift.server.AbstractNonblockingServer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class Invocation implements Runnable {
    private final AbstractNonblockingServer.FrameBuffer frameBuffer;

    public Invocation(AbstractNonblockingServer.FrameBuffer frameBuffer) {
        this.frameBuffer = frameBuffer;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.frameBuffer.invoke();
    }
}
