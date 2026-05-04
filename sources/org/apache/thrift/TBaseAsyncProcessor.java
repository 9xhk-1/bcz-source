package org.apache.thrift;

import java.util.Collections;
import java.util.Map;
import org.apache.thrift.protocol.TMessage;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.protocol.TProtocolUtil;
import org.apache.thrift.server.AbstractNonblockingServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TBaseAsyncProcessor<I> implements TAsyncProcessor, TProcessor {
    protected final Logger LOGGER = LoggerFactory.getLogger(getClass().getName());
    final I iface;
    final Map<String, AsyncProcessFunction<I, ? extends TBase, ?>> processMap;

    public TBaseAsyncProcessor(I i11, Map<String, AsyncProcessFunction<I, ? extends TBase, ?>> map) {
        this.iface = i11;
        this.processMap = map;
    }

    public Map<String, AsyncProcessFunction<I, ? extends TBase, ?>> getProcessMapView() {
        return Collections.unmodifiableMap(this.processMap);
    }

    @Override // org.apache.thrift.TProcessor
    public boolean process(TProtocol tProtocol, TProtocol tProtocol2) throws TException {
        return false;
    }

    @Override // org.apache.thrift.TAsyncProcessor
    public boolean process(AbstractNonblockingServer.AsyncFrameBuffer asyncFrameBuffer) throws TException {
        TProtocol inputProtocol = asyncFrameBuffer.getInputProtocol();
        TProtocol outputProtocol = asyncFrameBuffer.getOutputProtocol();
        TMessage readMessageBegin = inputProtocol.readMessageBegin();
        AsyncProcessFunction<I, ? extends TBase, ?> asyncProcessFunction = this.processMap.get(readMessageBegin.name);
        if (asyncProcessFunction == null) {
            TProtocolUtil.skip(inputProtocol, (byte) 12);
            inputProtocol.readMessageEnd();
            TApplicationException tApplicationException = new TApplicationException(1, "Invalid method name: '" + readMessageBegin.name + "'");
            outputProtocol.writeMessageBegin(new TMessage(readMessageBegin.name, (byte) 3, readMessageBegin.seqid));
            tApplicationException.write(outputProtocol);
            outputProtocol.writeMessageEnd();
            outputProtocol.getTransport().flush();
            asyncFrameBuffer.responseReady();
            return true;
        }
        TBase emptyArgsInstance = asyncProcessFunction.getEmptyArgsInstance();
        try {
            emptyArgsInstance.read(inputProtocol);
            inputProtocol.readMessageEnd();
            asyncProcessFunction.start(this.iface, emptyArgsInstance, asyncProcessFunction.getResultHandler(asyncFrameBuffer, readMessageBegin.seqid));
            return true;
        } catch (TProtocolException e11) {
            inputProtocol.readMessageEnd();
            TApplicationException tApplicationException2 = new TApplicationException(7, e11.getMessage());
            outputProtocol.writeMessageBegin(new TMessage(readMessageBegin.name, (byte) 3, readMessageBegin.seqid));
            tApplicationException2.write(outputProtocol);
            outputProtocol.writeMessageEnd();
            outputProtocol.getTransport().flush();
            asyncFrameBuffer.responseReady();
            return true;
        }
    }
}
