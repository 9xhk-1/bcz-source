package org.apache.thrift;

import java.util.HashMap;
import java.util.Map;
import org.apache.thrift.protocol.TMessage;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TProtocolDecorator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TMultiplexedProcessor implements TProcessor {
    private final Map<String, TProcessor> SERVICE_PROCESSOR_MAP = new HashMap();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StoredMessageProtocol extends TProtocolDecorator {
        TMessage messageBegin;

        public StoredMessageProtocol(TProtocol tProtocol, TMessage tMessage) {
            super(tProtocol);
            this.messageBegin = tMessage;
        }

        @Override // org.apache.thrift.protocol.TProtocolDecorator, org.apache.thrift.protocol.TProtocol
        public TMessage readMessageBegin() throws TException {
            return this.messageBegin;
        }
    }

    @Override // org.apache.thrift.TProcessor
    public boolean process(TProtocol tProtocol, TProtocol tProtocol2) throws TException {
        TMessage readMessageBegin = tProtocol.readMessageBegin();
        byte b11 = readMessageBegin.type;
        if (b11 != 1 && b11 != 4) {
            throw new TException("This should not have happened!?");
        }
        int indexOf = readMessageBegin.name.indexOf(":");
        if (indexOf < 0) {
            throw new TException("Service name not found in message name: " + readMessageBegin.name + ".  Did you forget to use a TMultiplexProtocol in your client?");
        }
        String substring = readMessageBegin.name.substring(0, indexOf);
        TProcessor tProcessor = this.SERVICE_PROCESSOR_MAP.get(substring);
        if (tProcessor != null) {
            return tProcessor.process(new StoredMessageProtocol(tProtocol, new TMessage(readMessageBegin.name.substring(substring.length() + 1), readMessageBegin.type, readMessageBegin.seqid)), tProtocol2);
        }
        throw new TException("Service name not found: " + substring + ".  Did you forget to call registerProcessor()?");
    }

    public void registerProcessor(String str, TProcessor tProcessor) {
        this.SERVICE_PROCESSOR_MAP.put(str, tProcessor);
    }
}
