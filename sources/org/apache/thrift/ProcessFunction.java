package org.apache.thrift;

import org.apache.thrift.TBase;
import org.apache.thrift.protocol.TMessage;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class ProcessFunction<I, T extends TBase> {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProcessFunction.class.getName());
    private final String methodName;

    public ProcessFunction(String str) {
        this.methodName = str;
    }

    public abstract T getEmptyArgsInstance();

    public String getMethodName() {
        return this.methodName;
    }

    public abstract TBase getResult(I i11, T t11) throws TException;

    public abstract boolean isOneway();

    public final void process(int i11, TProtocol tProtocol, TProtocol tProtocol2, I i12) throws TException {
        T emptyArgsInstance = getEmptyArgsInstance();
        try {
            emptyArgsInstance.read(tProtocol);
            tProtocol.readMessageEnd();
            try {
                TBase result = getResult(i12, emptyArgsInstance);
                if (isOneway()) {
                    return;
                }
                tProtocol2.writeMessageBegin(new TMessage(getMethodName(), (byte) 2, i11));
                result.write(tProtocol2);
                tProtocol2.writeMessageEnd();
                tProtocol2.getTransport().flush();
            } catch (TException e11) {
                LOGGER.error("Internal error processing " + getMethodName(), (Throwable) e11);
                TApplicationException tApplicationException = new TApplicationException(6, "Internal error processing " + getMethodName());
                tProtocol2.writeMessageBegin(new TMessage(getMethodName(), (byte) 3, i11));
                tApplicationException.write(tProtocol2);
                tProtocol2.writeMessageEnd();
                tProtocol2.getTransport().flush();
            }
        } catch (TProtocolException e12) {
            tProtocol.readMessageEnd();
            TApplicationException tApplicationException2 = new TApplicationException(7, e12.getMessage());
            tProtocol2.writeMessageBegin(new TMessage(getMethodName(), (byte) 3, i11));
            tApplicationException2.write(tProtocol2);
            tProtocol2.writeMessageEnd();
            tProtocol2.getTransport().flush();
        }
    }
}
