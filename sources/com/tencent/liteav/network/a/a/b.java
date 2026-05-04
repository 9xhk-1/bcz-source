package com.tencent.liteav.network.a.a;

import com.tencent.liteav.network.a.e;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.IDN;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashSet;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class b {
    public static byte[] a(String str, int i11) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        com.tencent.liteav.network.a.b.a aVar = new com.tencent.liteav.network.a.b.a();
        aVar.a(8);
        try {
            dataOutputStream.writeShort((short) i11);
            dataOutputStream.writeShort((short) aVar.a());
            dataOutputStream.writeShort(1);
            dataOutputStream.writeShort(0);
            dataOutputStream.writeShort(0);
            dataOutputStream.writeShort(0);
            dataOutputStream.flush();
            b(byteArrayOutputStream, str);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }

    private static void b(OutputStream outputStream, String str) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        a(outputStream, str);
        dataOutputStream.writeShort(1);
        dataOutputStream.writeShort(1);
    }

    private static e[] b(DataInputStream dataInputStream, byte[] bArr, int i11) throws IOException {
        e[] eVarArr = new e[i11];
        int i12 = 0;
        while (true) {
            int i13 = i11 - 1;
            if (i11 <= 0) {
                return eVarArr;
            }
            eVarArr[i12] = b(dataInputStream, bArr);
            i12++;
            i11 = i13;
        }
    }

    private static e b(DataInputStream dataInputStream, byte[] bArr) throws IOException {
        String hostAddress;
        a(dataInputStream, bArr);
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        dataInputStream.readUnsignedShort();
        long readUnsignedShort2 = (dataInputStream.readUnsignedShort() << 16) + dataInputStream.readUnsignedShort();
        int readUnsignedShort3 = dataInputStream.readUnsignedShort();
        if (readUnsignedShort == 1) {
            byte[] bArr2 = new byte[4];
            dataInputStream.readFully(bArr2);
            hostAddress = InetAddress.getByAddress(bArr2).getHostAddress();
        } else if (readUnsignedShort != 5) {
            for (int i11 = 0; i11 < readUnsignedShort3; i11++) {
                dataInputStream.readByte();
            }
            hostAddress = null;
        } else {
            hostAddress = a(dataInputStream, bArr);
        }
        if (hostAddress != null) {
            return new e(hostAddress, readUnsignedShort, (int) readUnsignedShort2, System.currentTimeMillis() / 1000);
        }
        throw new UnknownHostException("no record");
    }

    private static void a(OutputStream outputStream, String str) throws IOException {
        for (String str2 : str.split("[.。．｡]")) {
            byte[] bytes = IDN.toASCII(str2).getBytes();
            outputStream.write(bytes.length);
            outputStream.write(bytes, 0, bytes.length);
        }
        outputStream.write(0);
    }

    public static e[] a(byte[] bArr, int i11, String str) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        if (readUnsignedShort == i11) {
            int readUnsignedShort2 = dataInputStream.readUnsignedShort();
            boolean z11 = ((readUnsignedShort2 >> 8) & 1) == 1;
            if (((readUnsignedShort2 >> 7) & 1) == 1 && z11) {
                int readUnsignedShort3 = dataInputStream.readUnsignedShort();
                int readUnsignedShort4 = dataInputStream.readUnsignedShort();
                dataInputStream.readUnsignedShort();
                dataInputStream.readUnsignedShort();
                a(dataInputStream, bArr, readUnsignedShort3);
                return b(dataInputStream, bArr, readUnsignedShort4);
            }
            throw new com.tencent.liteav.network.a.a(str, "the dns server cant support recursion ");
        }
        throw new com.tencent.liteav.network.a.a(str, "the answer id " + readUnsignedShort + " is not match " + i11);
    }

    private static String a(DataInputStream dataInputStream, byte[] bArr) throws IOException {
        int readUnsignedByte = dataInputStream.readUnsignedByte();
        if ((readUnsignedByte & 192) == 192) {
            int readUnsignedByte2 = ((readUnsignedByte & 63) << 8) + dataInputStream.readUnsignedByte();
            HashSet hashSet = new HashSet();
            hashSet.add(Integer.valueOf(readUnsignedByte2));
            return a(bArr, readUnsignedByte2, (HashSet<Integer>) hashSet);
        }
        if (readUnsignedByte == 0) {
            return "";
        }
        byte[] bArr2 = new byte[readUnsignedByte];
        dataInputStream.readFully(bArr2);
        String unicode = IDN.toUnicode(new String(bArr2));
        String a11 = a(dataInputStream, bArr);
        if (a11.length() <= 0) {
            return unicode;
        }
        return unicode + "." + a11;
    }

    private static String a(byte[] bArr, int i11, HashSet<Integer> hashSet) throws IOException {
        int i12 = bArr[i11];
        int i13 = i12 & 255;
        if ((i12 & 192) == 192) {
            int i14 = ((i12 & 63) << 8) + (bArr[i11 + 1] & 255);
            if (!hashSet.contains(Integer.valueOf(i14))) {
                hashSet.add(Integer.valueOf(i14));
                return a(bArr, i14, hashSet);
            }
            throw new com.tencent.liteav.network.a.a("", "Cyclic offsets detected.");
        }
        if (i13 == 0) {
            return "";
        }
        int i15 = i11 + 1;
        String str = new String(bArr, i15, i13);
        String a11 = a(bArr, i15 + i13, hashSet);
        if (a11.length() <= 0) {
            return str;
        }
        return str + "." + a11;
    }

    private static void a(DataInputStream dataInputStream, byte[] bArr, int i11) throws IOException {
        while (true) {
            int i12 = i11 - 1;
            if (i11 <= 0) {
                return;
            }
            a(dataInputStream, bArr);
            dataInputStream.readUnsignedShort();
            dataInputStream.readUnsignedShort();
            i11 = i12;
        }
    }
}
