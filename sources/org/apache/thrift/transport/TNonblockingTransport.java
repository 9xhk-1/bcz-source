package org.apache.thrift.transport;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class TNonblockingTransport extends TTransport {
    public abstract boolean finishConnect() throws IOException;

    public abstract int read(ByteBuffer byteBuffer) throws IOException;

    public abstract SelectionKey registerSelector(Selector selector, int i11) throws IOException;

    public abstract boolean startConnect() throws IOException;

    public abstract int write(ByteBuffer byteBuffer) throws IOException;
}
