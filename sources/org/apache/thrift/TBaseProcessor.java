package org.apache.thrift;

import java.util.Collections;
import java.util.Map;
import org.apache.thrift.protocol.TMessage;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TProtocolUtil;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class TBaseProcessor<I> implements TProcessor {
    private final I iface;
    private final Map<String, ProcessFunction<I, ? extends TBase>> processMap;

    public TBaseProcessor(I i11, Map<String, ProcessFunction<I, ? extends TBase>> map) {
        this.iface = i11;
        this.processMap = map;
    }

    public Map<String, ProcessFunction<I, ? extends TBase>> getProcessMapView() {
        return Collections.unmodifiableMap(this.processMap);
    }

    @Override // org.apache.thrift.TProcessor
    public boolean process(TProtocol tProtocol, TProtocol tProtocol2) throws TException {
        TMessage readMessageBegin = tProtocol.readMessageBegin();
        ProcessFunction<I, ? extends TBase> processFunction = this.processMap.get(readMessageBegin.name);
        if (processFunction != null) {
            processFunction.process(readMessageBegin.seqid, tProtocol, tProtocol2, this.iface);
            return true;
        }
        TProtocolUtil.skip(tProtocol, (byte) 12);
        tProtocol.readMessageEnd();
        TApplicationException tApplicationException = new TApplicationException(1, "Invalid method name: '" + readMessageBegin.name + "'");
        tProtocol2.writeMessageBegin(new TMessage(readMessageBegin.name, (byte) 3, readMessageBegin.seqid));
        tApplicationException.write(tProtocol2);
        tProtocol2.writeMessageEnd();
        tProtocol2.getTransport().flush();
        return true;
    }
}
