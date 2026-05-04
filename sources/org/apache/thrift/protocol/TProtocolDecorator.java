package org.apache.thrift.protocol;

import java.nio.ByteBuffer;
import org.apache.thrift.TException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class TProtocolDecorator extends TProtocol {
    private final TProtocol concreteProtocol;

    public TProtocolDecorator(TProtocol tProtocol) {
        super(tProtocol.getTransport());
        this.concreteProtocol = tProtocol;
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public ByteBuffer readBinary() throws TException {
        return this.concreteProtocol.readBinary();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public boolean readBool() throws TException {
        return this.concreteProtocol.readBool();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public byte readByte() throws TException {
        return this.concreteProtocol.readByte();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public double readDouble() throws TException {
        return this.concreteProtocol.readDouble();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public TField readFieldBegin() throws TException {
        return this.concreteProtocol.readFieldBegin();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void readFieldEnd() throws TException {
        this.concreteProtocol.readFieldEnd();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public short readI16() throws TException {
        return this.concreteProtocol.readI16();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public int readI32() throws TException {
        return this.concreteProtocol.readI32();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public long readI64() throws TException {
        return this.concreteProtocol.readI64();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public TList readListBegin() throws TException {
        return this.concreteProtocol.readListBegin();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void readListEnd() throws TException {
        this.concreteProtocol.readListEnd();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public TMap readMapBegin() throws TException {
        return this.concreteProtocol.readMapBegin();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void readMapEnd() throws TException {
        this.concreteProtocol.readMapEnd();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public TMessage readMessageBegin() throws TException {
        return this.concreteProtocol.readMessageBegin();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void readMessageEnd() throws TException {
        this.concreteProtocol.readMessageEnd();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public TSet readSetBegin() throws TException {
        return this.concreteProtocol.readSetBegin();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void readSetEnd() throws TException {
        this.concreteProtocol.readSetEnd();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public String readString() throws TException {
        return this.concreteProtocol.readString();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public TStruct readStructBegin() throws TException {
        return this.concreteProtocol.readStructBegin();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void readStructEnd() throws TException {
        this.concreteProtocol.readStructEnd();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeBinary(ByteBuffer byteBuffer) throws TException {
        this.concreteProtocol.writeBinary(byteBuffer);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeBool(boolean z11) throws TException {
        this.concreteProtocol.writeBool(z11);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeByte(byte b11) throws TException {
        this.concreteProtocol.writeByte(b11);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeDouble(double d11) throws TException {
        this.concreteProtocol.writeDouble(d11);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeFieldBegin(TField tField) throws TException {
        this.concreteProtocol.writeFieldBegin(tField);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeFieldEnd() throws TException {
        this.concreteProtocol.writeFieldEnd();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeFieldStop() throws TException {
        this.concreteProtocol.writeFieldStop();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeI16(short s11) throws TException {
        this.concreteProtocol.writeI16(s11);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeI32(int i11) throws TException {
        this.concreteProtocol.writeI32(i11);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeI64(long j11) throws TException {
        this.concreteProtocol.writeI64(j11);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeListBegin(TList tList) throws TException {
        this.concreteProtocol.writeListBegin(tList);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeListEnd() throws TException {
        this.concreteProtocol.writeListEnd();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeMapBegin(TMap tMap) throws TException {
        this.concreteProtocol.writeMapBegin(tMap);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeMapEnd() throws TException {
        this.concreteProtocol.writeMapEnd();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeMessageBegin(TMessage tMessage) throws TException {
        this.concreteProtocol.writeMessageBegin(tMessage);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeMessageEnd() throws TException {
        this.concreteProtocol.writeMessageEnd();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeSetBegin(TSet tSet) throws TException {
        this.concreteProtocol.writeSetBegin(tSet);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeSetEnd() throws TException {
        this.concreteProtocol.writeSetEnd();
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeString(String str) throws TException {
        this.concreteProtocol.writeString(str);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeStructBegin(TStruct tStruct) throws TException {
        this.concreteProtocol.writeStructBegin(tStruct);
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public void writeStructEnd() throws TException {
        this.concreteProtocol.writeStructEnd();
    }
}
