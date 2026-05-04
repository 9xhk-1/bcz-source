package org.apache.thrift.transport;

import org.apache.thrift.TException;
import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TProtocolFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TFileProcessor {
    private TProtocolFactory inputProtocolFactory_;
    private TFileTransport inputTransport_;
    private TProtocolFactory outputProtocolFactory_;
    private TTransport outputTransport_;
    private TProcessor processor_;

    public TFileProcessor(TProcessor tProcessor, TProtocolFactory tProtocolFactory, TFileTransport tFileTransport, TTransport tTransport) {
        this.processor_ = tProcessor;
        this.outputProtocolFactory_ = tProtocolFactory;
        this.inputProtocolFactory_ = tProtocolFactory;
        this.inputTransport_ = tFileTransport;
        this.outputTransport_ = tTransport;
    }

    private void processUntil(int i11) throws TException {
        TProtocol protocol = this.inputProtocolFactory_.getProtocol(this.inputTransport_);
        TProtocol protocol2 = this.outputProtocolFactory_.getProtocol(this.outputTransport_);
        int curChunk = this.inputTransport_.getCurChunk();
        while (i11 >= curChunk) {
            try {
                this.processor_.process(protocol, protocol2);
                curChunk = this.inputTransport_.getCurChunk();
            } catch (TTransportException e11) {
                if (e11.getType() != 4) {
                    throw e11;
                }
                return;
            }
        }
    }

    public void processChunk(int i11, int i12) throws TException {
        int numChunks = this.inputTransport_.getNumChunks();
        if (i12 < 0) {
            i12 += numChunks;
        }
        if (i11 < 0) {
            i11 += numChunks;
        }
        if (i12 >= i11) {
            this.inputTransport_.seekToChunk(i11);
            processUntil(i12);
            return;
        }
        throw new TException("endChunkNum " + i12 + " is less than " + i11);
    }

    public void processChunk(int i11) throws TException {
        processChunk(i11, i11);
    }

    public TFileProcessor(TProcessor tProcessor, TProtocolFactory tProtocolFactory, TProtocolFactory tProtocolFactory2, TFileTransport tFileTransport, TTransport tTransport) {
        this.processor_ = tProcessor;
        this.inputProtocolFactory_ = tProtocolFactory;
        this.outputProtocolFactory_ = tProtocolFactory2;
        this.inputTransport_ = tFileTransport;
        this.outputTransport_ = tTransport;
    }

    public void processChunk() throws TException {
        processChunk(this.inputTransport_.getCurChunk());
    }
}
