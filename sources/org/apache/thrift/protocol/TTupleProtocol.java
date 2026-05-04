package org.apache.thrift.protocol;

import java.util.BitSet;
import org.apache.thrift.TException;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.transport.TTransport;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class TTupleProtocol extends TCompactProtocol {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Factory implements TProtocolFactory {
        @Override // org.apache.thrift.protocol.TProtocolFactory
        public TProtocol getProtocol(TTransport tTransport) {
            return new TTupleProtocol(tTransport);
        }
    }

    public TTupleProtocol(TTransport tTransport) {
        super(tTransport);
    }

    public static BitSet fromByteArray(byte[] bArr) {
        BitSet bitSet = new BitSet();
        for (int i11 = 0; i11 < bArr.length * 8; i11++) {
            if ((bArr[(bArr.length - (i11 / 8)) - 1] & (1 << (i11 % 8))) > 0) {
                bitSet.set(i11);
            }
        }
        return bitSet;
    }

    public static byte[] toByteArray(BitSet bitSet, int i11) {
        int ceil = (int) Math.ceil(i11 / 8.0d);
        byte[] bArr = new byte[ceil];
        for (int i12 = 0; i12 < bitSet.length(); i12++) {
            if (bitSet.get(i12)) {
                int i13 = (ceil - (i12 / 8)) - 1;
                bArr[i13] = (byte) ((1 << (i12 % 8)) | bArr[i13]);
            }
        }
        return bArr;
    }

    @Override // org.apache.thrift.protocol.TProtocol
    public Class<? extends IScheme> getScheme() {
        return TupleScheme.class;
    }

    public BitSet readBitSet(int i11) throws TException {
        int ceil = (int) Math.ceil(i11 / 8.0d);
        byte[] bArr = new byte[ceil];
        for (int i12 = 0; i12 < ceil; i12++) {
            bArr[i12] = readByte();
        }
        return fromByteArray(bArr);
    }

    public void writeBitSet(BitSet bitSet, int i11) throws TException {
        for (byte b11 : toByteArray(bitSet, i11)) {
            writeByte(b11);
        }
    }
}
