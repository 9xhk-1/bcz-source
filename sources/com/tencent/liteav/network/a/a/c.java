package com.tencent.liteav.network.a.a;

import com.tencent.liteav.network.a.d;
import com.tencent.liteav.network.a.e;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Random;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class c implements com.tencent.liteav.network.a.c {

    /* renamed from: b, reason: collision with root package name */
    private static final Random f43713b = new Random();

    /* renamed from: a, reason: collision with root package name */
    final InetAddress f43714a;

    /* renamed from: c, reason: collision with root package name */
    private final int f43715c;

    public c(InetAddress inetAddress) {
        this(inetAddress, 10);
    }

    @Override // com.tencent.liteav.network.a.c
    public e[] a(com.tencent.liteav.network.a.b bVar, d dVar) throws IOException {
        int nextInt;
        Random random = f43713b;
        synchronized (random) {
            nextInt = random.nextInt() & 255;
        }
        byte[] a11 = a(b.a(bVar.f43716a, nextInt));
        if (a11 != null) {
            return b.a(a11, nextInt, bVar.f43716a);
        }
        throw new com.tencent.liteav.network.a.a(bVar.f43716a, "cant get answer");
    }

    public c(InetAddress inetAddress, int i11) {
        this.f43714a = inetAddress;
        this.f43715c = i11;
    }

    private byte[] a(byte[] bArr) throws IOException {
        DatagramSocket datagramSocket;
        DatagramSocket datagramSocket2 = null;
        try {
            datagramSocket = new DatagramSocket();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length, this.f43714a, 53);
            datagramSocket.setSoTimeout(this.f43715c * 1000);
            datagramSocket.send(datagramPacket);
            DatagramPacket datagramPacket2 = new DatagramPacket(new byte[1500], 1500);
            datagramSocket.receive(datagramPacket2);
            byte[] data = datagramPacket2.getData();
            datagramSocket.close();
            return data;
        } catch (Throwable th3) {
            th = th3;
            datagramSocket2 = datagramSocket;
            if (datagramSocket2 != null) {
                datagramSocket2.close();
            }
            throw th;
        }
    }
}
