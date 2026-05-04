package org.apache.thrift.protocol;

import org.apache.thrift.TException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TMultiplexedProtocol extends TProtocolDecorator {
    public static final String SEPARATOR = ":";
    private final String SERVICE_NAME;

    public TMultiplexedProtocol(TProtocol tProtocol, String str) {
        super(tProtocol);
        this.SERVICE_NAME = str;
    }

    @Override // org.apache.thrift.protocol.TProtocolDecorator, org.apache.thrift.protocol.TProtocol
    public void writeMessageBegin(TMessage tMessage) throws TException {
        byte b11 = tMessage.type;
        if (b11 != 1 && b11 != 4) {
            super.writeMessageBegin(tMessage);
            return;
        }
        super.writeMessageBegin(new TMessage(this.SERVICE_NAME + ":" + tMessage.name, tMessage.type, tMessage.seqid));
    }
}
