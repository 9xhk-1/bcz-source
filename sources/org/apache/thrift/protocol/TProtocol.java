package org.apache.thrift.protocol;

import java.nio.ByteBuffer;
import org.apache.thrift.TException;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.transport.TTransport;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class TProtocol {
    protected TTransport trans_;

    private TProtocol() {
    }

    public Class<? extends IScheme> getScheme() {
        return StandardScheme.class;
    }

    public TTransport getTransport() {
        return this.trans_;
    }

    public abstract ByteBuffer readBinary() throws TException;

    public abstract boolean readBool() throws TException;

    public abstract byte readByte() throws TException;

    public abstract double readDouble() throws TException;

    public abstract TField readFieldBegin() throws TException;

    public abstract void readFieldEnd() throws TException;

    public abstract short readI16() throws TException;

    public abstract int readI32() throws TException;

    public abstract long readI64() throws TException;

    public abstract TList readListBegin() throws TException;

    public abstract void readListEnd() throws TException;

    public abstract TMap readMapBegin() throws TException;

    public abstract void readMapEnd() throws TException;

    public abstract TMessage readMessageBegin() throws TException;

    public abstract void readMessageEnd() throws TException;

    public abstract TSet readSetBegin() throws TException;

    public abstract void readSetEnd() throws TException;

    public abstract String readString() throws TException;

    public abstract TStruct readStructBegin() throws TException;

    public abstract void readStructEnd() throws TException;

    public abstract void writeBinary(ByteBuffer byteBuffer) throws TException;

    public abstract void writeBool(boolean z11) throws TException;

    public abstract void writeByte(byte b11) throws TException;

    public abstract void writeDouble(double d11) throws TException;

    public abstract void writeFieldBegin(TField tField) throws TException;

    public abstract void writeFieldEnd() throws TException;

    public abstract void writeFieldStop() throws TException;

    public abstract void writeI16(short s11) throws TException;

    public abstract void writeI32(int i11) throws TException;

    public abstract void writeI64(long j11) throws TException;

    public abstract void writeListBegin(TList tList) throws TException;

    public abstract void writeListEnd() throws TException;

    public abstract void writeMapBegin(TMap tMap) throws TException;

    public abstract void writeMapEnd() throws TException;

    public abstract void writeMessageBegin(TMessage tMessage) throws TException;

    public abstract void writeMessageEnd() throws TException;

    public abstract void writeSetBegin(TSet tSet) throws TException;

    public abstract void writeSetEnd() throws TException;

    public abstract void writeString(String str) throws TException;

    public abstract void writeStructBegin(TStruct tStruct) throws TException;

    public abstract void writeStructEnd() throws TException;

    public TProtocol(TTransport tTransport) {
        this.trans_ = tTransport;
    }

    public void reset() {
    }
}
