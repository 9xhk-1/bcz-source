package com.mob.secverify.e;

import android.util.Base64;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.MobRSA;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.math.BigInteger;
import java.util.Random;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static Random f40722a = new Random();

    /* renamed from: b, reason: collision with root package name */
    private static MobRSA f40723b = new MobRSA(1024);

    /* renamed from: c, reason: collision with root package name */
    private static BigInteger f40724c = new BigInteger("d008219b14c84872559aaf9e69d1348175289c186912da64b2393bab376bb0d6b471220cb29cbc9875b148b593eb9d7c4c359549a1aff22f6de9d18d22f0b6cb", 16);

    /* renamed from: d, reason: collision with root package name */
    private static BigInteger f40725d = new BigInteger("1f228b2b8fbb7317674db20bab1d4b0f0ddb3e1f3a93177f1821c026ffd7c6b782be720a308ab69bf6c631c3c0c4d68bf9d92ddaaf712a032d591ba1c296df13332a23e37b281e5fd9b93ab016dd3efc5de45e264ed692ac63ac40013f507cd272b7aeeb85be9fe2f31f11b8c55d904b5331932c70c7cf3f2b05cb802f6b89a7", 16);

    public static String a(String str) throws Throwable {
        return b(a(), str);
    }

    public static String[] b(String str) throws Throwable {
        byte[] a11 = a();
        return new String[]{com.mob.secverify.pure.core.ope.a.a.a.a(a11), b(a11, str)};
    }

    public static String a(byte[] bArr, String str) {
        String str2 = "";
        try {
            new DataOutputStream(new ByteArrayOutputStream());
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(Base64.decode(str, 2)));
            while (dataInputStream.available() > 0) {
                int readInt = dataInputStream.readInt();
                dataInputStream.readFully(new byte[readInt], 0, readInt);
                int readInt2 = dataInputStream.readInt();
                byte[] bArr2 = new byte[readInt2];
                dataInputStream.readFully(bArr2, 0, readInt2);
                str2 = new String(Data.AES128Decode(bArr, bArr2));
            }
        } catch (Throwable unused) {
        }
        return str2;
    }

    private static String b(byte[] bArr, String str) throws Throwable {
        byte[] bytes = str.getBytes("utf-8");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        byte[] encode = f40723b.encode(bArr, f40724c, f40725d);
        dataOutputStream.writeInt(encode.length);
        dataOutputStream.write(encode);
        byte[] AES128Encode = Data.AES128Encode(bArr, bytes);
        dataOutputStream.writeInt(AES128Encode.length);
        dataOutputStream.write(AES128Encode);
        dataOutputStream.flush();
        dataOutputStream.close();
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
    }

    private static byte[] a() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        f40722a.setSeed(System.currentTimeMillis());
        dataOutputStream.writeLong(f40722a.nextLong());
        dataOutputStream.writeLong(f40722a.nextLong());
        dataOutputStream.flush();
        dataOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }
}
