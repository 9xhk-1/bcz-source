package org.apache.thrift.transport;

import java.nio.channels.Selector;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class TNonblockingServerTransport extends TServerTransport {
    public abstract void registerSelector(Selector selector);
}
