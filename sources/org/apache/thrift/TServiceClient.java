package org.apache.thrift;

import org.apache.thrift.protocol.TMessage;
import org.apache.thrift.protocol.TProtocol;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class TServiceClient {
    protected TProtocol iprot_;
    protected TProtocol oprot_;
    protected int seqid_;

    public TServiceClient(TProtocol tProtocol) {
        this(tProtocol, tProtocol);
    }

    public TProtocol getInputProtocol() {
        return this.iprot_;
    }

    public TProtocol getOutputProtocol() {
        return this.oprot_;
    }

    public void receiveBase(TBase<?, ?> tBase, String str) throws TException {
        TMessage readMessageBegin = this.iprot_.readMessageBegin();
        if (readMessageBegin.type == 3) {
            TApplicationException read = TApplicationException.read(this.iprot_);
            this.iprot_.readMessageEnd();
            throw read;
        }
        if (readMessageBegin.seqid == this.seqid_) {
            tBase.read(this.iprot_);
            this.iprot_.readMessageEnd();
        } else {
            throw new TApplicationException(4, str + " failed: out of sequence response");
        }
    }

    public void sendBase(String str, TBase<?, ?> tBase) throws TException {
        sendBase(str, tBase, (byte) 1);
    }

    public void sendBaseOneway(String str, TBase<?, ?> tBase) throws TException {
        sendBase(str, tBase, (byte) 4);
    }

    public TServiceClient(TProtocol tProtocol, TProtocol tProtocol2) {
        this.iprot_ = tProtocol;
        this.oprot_ = tProtocol2;
    }

    private void sendBase(String str, TBase<?, ?> tBase, byte b11) throws TException {
        TProtocol tProtocol = this.oprot_;
        int i11 = this.seqid_ + 1;
        this.seqid_ = i11;
        tProtocol.writeMessageBegin(new TMessage(str, b11, i11));
        tBase.write(this.oprot_);
        this.oprot_.writeMessageEnd();
        this.oprot_.getTransport().setMethodName(str);
        this.oprot_.getTransport().flush();
    }
}
