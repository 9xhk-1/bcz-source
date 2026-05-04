package com.mob.tools.utils;

import com.mob.commons.r;
import com.mob.tools.proguard.PublicMemberKeeper;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.math.BigInteger;

/* loaded from: classes7.dex */
public class MobRSA implements PublicMemberKeeper {

    /* renamed from: a, reason: collision with root package name */
    private int f41388a;

    public MobRSA(int i11) {
        this.f41388a = i11;
    }

    private byte[] a(byte[] bArr, int i11, int i12, BigInteger bigInteger, BigInteger bigInteger2, int i13) throws Throwable {
        if (bArr.length != i12 || i11 != 0) {
            byte[] bArr2 = new byte[i12];
            System.arraycopy(bArr, i11, bArr2, 0, i12);
            bArr = bArr2;
        }
        BigInteger bigInteger3 = new BigInteger(a(bArr, i13));
        if (bigInteger3.compareTo(bigInteger2) <= 0) {
            return bigInteger3.modPow(bigInteger, bigInteger2).toByteArray();
        }
        throw new Throwable("the message must be smaller than the modulue");
    }

    public byte[] encode(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) throws Throwable {
        Throwable th2;
        int i11 = this.f41388a / 8;
        int i12 = i11 - 11;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = null;
        try {
            DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream);
            int i13 = 0;
            while (bArr.length > i13) {
                try {
                    int min = Math.min(bArr.length - i13, i12);
                    byte[] bArr2 = bArr;
                    BigInteger bigInteger3 = bigInteger;
                    BigInteger bigInteger4 = bigInteger2;
                    byte[] a11 = a(bArr2, i13, min, bigInteger3, bigInteger4, i11);
                    dataOutputStream2.writeInt(a11.length);
                    dataOutputStream2.write(a11);
                    i13 += min;
                    bArr = bArr2;
                    bigInteger = bigInteger3;
                    bigInteger2 = bigInteger4;
                } catch (Throwable th3) {
                    th2 = th3;
                    dataOutputStream = dataOutputStream2;
                    r.a(dataOutputStream);
                    throw th2;
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            r.a(dataOutputStream2);
            return byteArray;
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    private byte[] a(byte[] bArr, int i11) throws Throwable {
        if (bArr.length <= i11 - 1) {
            byte[] bArr2 = new byte[i11];
            bArr2[0] = 1;
            int length = bArr.length;
            bArr2[1] = (byte) (length >> 24);
            bArr2[2] = (byte) (length >> 16);
            bArr2[3] = (byte) (length >> 8);
            bArr2[4] = (byte) length;
            System.arraycopy(bArr, 0, bArr2, i11 - length, length);
            return bArr2;
        }
        throw new Throwable("Message too large");
    }
}
