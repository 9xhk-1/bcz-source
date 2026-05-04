package com.baicizhan.main.vld.bonding;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nBluetoothConnector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BluetoothConnector.kt\ncom/baicizhan/main/vld/bonding/BluetoothConnectorKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,517:1\n13880#2,3:518\n20293#2,7:521\n20293#2,7:528\n*S KotlinDebug\n*F\n+ 1 BluetoothConnector.kt\ncom/baicizhan/main/vld/bonding/BluetoothConnectorKt\n*L\n58#1:518,3\n62#1:521,7\n74#1:528,7\n*E\n"})
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f25376a = -96;

    /* renamed from: b, reason: collision with root package name */
    public static final byte f25377b = -80;

    /* renamed from: c, reason: collision with root package name */
    public static final byte f25378c = -64;

    /* renamed from: d, reason: collision with root package name */
    public static final byte f25379d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final byte f25380e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final byte f25381f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final byte f25382g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final byte f25383h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static final byte f25384i = 3;

    public static final byte[] c(byte b11) {
        byte[] bArr = new byte[5];
        bArr[0] = b11;
        int i11 = 1;
        bArr[1] = 1;
        bArr[2] = 0;
        bArr[3] = 0;
        int Ie = a00.a0.Ie(bArr);
        if (1 <= Ie) {
            while (true) {
                b11 = (byte) (b11 + bArr[i11]);
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        bArr[4] = (byte) (0 - b11);
        return bArr;
    }

    public static final byte[] d(a aVar, String str) {
        byte[] bytes = str.getBytes(u30.d.f91599b);
        kotlin.jvm.internal.g0.o(bytes, "getBytes(...)");
        int length = bytes.length + 6;
        byte[] bArr = new byte[length];
        bArr[0] = f25376a;
        int i11 = 1;
        bArr[1] = aVar.c();
        bArr[2] = 0;
        bArr[3] = 1;
        bArr[4] = (byte) bytes.length;
        int length2 = bytes.length;
        int i12 = 0;
        int i13 = 0;
        while (i12 < length2) {
            bArr[i13 + 5] = bytes[i12];
            i12++;
            i13++;
        }
        if (length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte b11 = bArr[0];
        int Ie = a00.a0.Ie(bArr);
        if (1 <= Ie) {
            while (true) {
                b11 = (byte) (b11 + bArr[i11]);
                if (i11 == Ie) {
                    break;
                }
                i11++;
            }
        }
        bArr[bytes.length + 5] = (byte) (0 - b11);
        return bArr;
    }
}
