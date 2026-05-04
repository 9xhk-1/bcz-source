package org.apache.thrift;

import org.apache.thrift.server.AbstractNonblockingServer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface TAsyncProcessor {
    boolean process(AbstractNonblockingServer.AsyncFrameBuffer asyncFrameBuffer) throws TException;
}
