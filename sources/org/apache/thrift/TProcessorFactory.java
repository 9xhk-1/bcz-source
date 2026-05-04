package org.apache.thrift;

import org.apache.thrift.transport.TTransport;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TProcessorFactory {
    private final TProcessor processor_;

    public TProcessorFactory(TProcessor tProcessor) {
        this.processor_ = tProcessor;
    }

    public TProcessor getProcessor(TTransport tTransport) {
        return this.processor_;
    }

    public boolean isAsyncProcessor() {
        return this.processor_ instanceof TAsyncProcessor;
    }
}
