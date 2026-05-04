package org.apache.thrift.server;

import org.apache.thrift.TProcessor;
import org.apache.thrift.TProcessorFactory;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TTransportFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class TServer {
    protected TServerEventHandler eventHandler_;
    protected TProtocolFactory inputProtocolFactory_;
    protected TTransportFactory inputTransportFactory_;
    private boolean isServing;
    protected TProtocolFactory outputProtocolFactory_;
    protected TTransportFactory outputTransportFactory_;
    protected TProcessorFactory processorFactory_;
    protected TServerTransport serverTransport_;
    protected volatile boolean stopped_ = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class AbstractServerArgs<T extends AbstractServerArgs<T>> {
        TProcessorFactory processorFactory;
        final TServerTransport serverTransport;
        TTransportFactory inputTransportFactory = new TTransportFactory();
        TTransportFactory outputTransportFactory = new TTransportFactory();
        TProtocolFactory inputProtocolFactory = new TBinaryProtocol.Factory();
        TProtocolFactory outputProtocolFactory = new TBinaryProtocol.Factory();

        public AbstractServerArgs(TServerTransport tServerTransport) {
            this.serverTransport = tServerTransport;
        }

        public T inputProtocolFactory(TProtocolFactory tProtocolFactory) {
            this.inputProtocolFactory = tProtocolFactory;
            return this;
        }

        public T inputTransportFactory(TTransportFactory tTransportFactory) {
            this.inputTransportFactory = tTransportFactory;
            return this;
        }

        public T outputProtocolFactory(TProtocolFactory tProtocolFactory) {
            this.outputProtocolFactory = tProtocolFactory;
            return this;
        }

        public T outputTransportFactory(TTransportFactory tTransportFactory) {
            this.outputTransportFactory = tTransportFactory;
            return this;
        }

        public T processor(TProcessor tProcessor) {
            this.processorFactory = new TProcessorFactory(tProcessor);
            return this;
        }

        public T processorFactory(TProcessorFactory tProcessorFactory) {
            this.processorFactory = tProcessorFactory;
            return this;
        }

        public T protocolFactory(TProtocolFactory tProtocolFactory) {
            this.inputProtocolFactory = tProtocolFactory;
            this.outputProtocolFactory = tProtocolFactory;
            return this;
        }

        public T transportFactory(TTransportFactory tTransportFactory) {
            this.inputTransportFactory = tTransportFactory;
            this.outputTransportFactory = tTransportFactory;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Args extends AbstractServerArgs<Args> {
        public Args(TServerTransport tServerTransport) {
            super(tServerTransport);
        }
    }

    public TServer(AbstractServerArgs abstractServerArgs) {
        this.processorFactory_ = abstractServerArgs.processorFactory;
        this.serverTransport_ = abstractServerArgs.serverTransport;
        this.inputTransportFactory_ = abstractServerArgs.inputTransportFactory;
        this.outputTransportFactory_ = abstractServerArgs.outputTransportFactory;
        this.inputProtocolFactory_ = abstractServerArgs.inputProtocolFactory;
        this.outputProtocolFactory_ = abstractServerArgs.outputProtocolFactory;
    }

    public TServerEventHandler getEventHandler() {
        return this.eventHandler_;
    }

    public boolean getShouldStop() {
        return this.stopped_;
    }

    public boolean isServing() {
        return this.isServing;
    }

    public abstract void serve();

    public void setServerEventHandler(TServerEventHandler tServerEventHandler) {
        this.eventHandler_ = tServerEventHandler;
    }

    public void setServing(boolean z11) {
        this.isServing = z11;
    }

    public void setShouldStop(boolean z11) {
        this.stopped_ = z11;
    }

    public void stop() {
    }
}
