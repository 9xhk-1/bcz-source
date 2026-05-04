package org.apache.thrift;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.transport.TIOStreamTransport;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TSerializer {
    private final ByteArrayOutputStream baos_;
    private TProtocol protocol_;
    private final TIOStreamTransport transport_;

    public TSerializer() {
        this(new TBinaryProtocol.Factory());
    }

    public byte[] serialize(TBase tBase) throws TException {
        this.baos_.reset();
        tBase.write(this.protocol_);
        return this.baos_.toByteArray();
    }

    public String toString(TBase tBase, String str) throws TException {
        try {
            return new String(serialize(tBase), str);
        } catch (UnsupportedEncodingException unused) {
            throw new TException("JVM DOES NOT SUPPORT ENCODING: " + str);
        }
    }

    public TSerializer(TProtocolFactory tProtocolFactory) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.baos_ = byteArrayOutputStream;
        TIOStreamTransport tIOStreamTransport = new TIOStreamTransport(byteArrayOutputStream);
        this.transport_ = tIOStreamTransport;
        this.protocol_ = tProtocolFactory.getProtocol(tIOStreamTransport);
    }

    public String toString(TBase tBase) throws TException {
        return new String(serialize(tBase));
    }
}
