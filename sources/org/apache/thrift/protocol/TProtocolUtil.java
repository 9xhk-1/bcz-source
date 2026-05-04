package org.apache.thrift.protocol;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TJSONProtocol;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TProtocolUtil {
    private static int maxSkipDepth = Integer.MAX_VALUE;

    public static TProtocolFactory guessProtocolFactory(byte[] bArr, TProtocolFactory tProtocolFactory) {
        byte b11 = bArr[0];
        return (123 == b11 && 125 == bArr[bArr.length - 1]) ? new TJSONProtocol.Factory() : bArr[bArr.length - 1] != 0 ? new TBinaryProtocol.Factory() : b11 > 16 ? new TCompactProtocol.Factory() : (bArr.length <= 1 || bArr[1] != 0) ? (bArr.length <= 1 || (bArr[1] & 128) == 0) ? tProtocolFactory : new TCompactProtocol.Factory() : new TBinaryProtocol.Factory();
    }

    public static void setMaxSkipDepth(int i11) {
        maxSkipDepth = i11;
    }

    public static void skip(TProtocol tProtocol, byte b11) throws TException {
        skip(tProtocol, b11, maxSkipDepth);
    }

    public static void skip(TProtocol tProtocol, byte b11, int i11) throws TException {
        if (i11 <= 0) {
            throw new TException("Maximum skip depth exceeded");
        }
        int i12 = 0;
        switch (b11) {
            case 2:
                tProtocol.readBool();
                return;
            case 3:
                tProtocol.readByte();
                return;
            case 4:
                tProtocol.readDouble();
                return;
            case 5:
            case 7:
            case 9:
            default:
                return;
            case 6:
                tProtocol.readI16();
                return;
            case 8:
                tProtocol.readI32();
                return;
            case 10:
                tProtocol.readI64();
                return;
            case 11:
                tProtocol.readBinary();
                return;
            case 12:
                tProtocol.readStructBegin();
                while (true) {
                    byte b12 = tProtocol.readFieldBegin().type;
                    if (b12 == 0) {
                        tProtocol.readStructEnd();
                        return;
                    } else {
                        skip(tProtocol, b12, i11 - 1);
                        tProtocol.readFieldEnd();
                    }
                }
            case 13:
                TMap readMapBegin = tProtocol.readMapBegin();
                while (i12 < readMapBegin.size) {
                    int i13 = i11 - 1;
                    skip(tProtocol, readMapBegin.keyType, i13);
                    skip(tProtocol, readMapBegin.valueType, i13);
                    i12++;
                }
                tProtocol.readMapEnd();
                return;
            case 14:
                TSet readSetBegin = tProtocol.readSetBegin();
                while (i12 < readSetBegin.size) {
                    skip(tProtocol, readSetBegin.elemType, i11 - 1);
                    i12++;
                }
                tProtocol.readSetEnd();
                return;
            case 15:
                TList readListBegin = tProtocol.readListBegin();
                while (i12 < readListBegin.size) {
                    skip(tProtocol, readListBegin.elemType, i11 - 1);
                    i12++;
                }
                tProtocol.readListEnd();
                return;
        }
    }
}
