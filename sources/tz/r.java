package tz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import yz.c2;

/* loaded from: classes8.dex */
public class r {
    public static int a(FileChannel fileChannel, long j11, ByteBuffer byteBuffer) throws IOException {
        int read;
        int i11 = 0;
        while (byteBuffer.hasRemaining() && (read = fileChannel.read(byteBuffer, j11)) != -1) {
            j11 += read;
            i11 += read;
        }
        return i11;
    }

    public static int b(FileChannel fileChannel, long j11, byte[] bArr, int i11, int i12) throws IOException {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i11, i12);
        int i13 = 0;
        while (i13 < i12) {
            int read = fileChannel.read(wrap, i13 + j11);
            if (read == -1) {
                break;
            }
            i13 += read;
        }
        return i13;
    }

    public static q c(FileChannel fileChannel) throws IOException {
        v f11 = f(fileChannel);
        if (f11 == null) {
            return null;
        }
        long j11 = f11.f91384f;
        if (j11 < 32) {
            return new q(f11);
        }
        byte[] bArr = new byte[24];
        b(fileChannel, j11 - 24, bArr, 0, 24);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        long f12 = s.f(bArr, 0, byteOrder);
        long f13 = s.f(bArr, 8, byteOrder);
        long f14 = s.f(bArr, 16, byteOrder);
        if (f13 != ss.a.f88913b || f14 != ss.a.f88912a) {
            return new q(f11);
        }
        int i11 = (int) (8 + f12);
        long j12 = i11;
        long j13 = f11.f91384f - j12;
        if (i11 < 32 || j13 < 0) {
            return new q(f11);
        }
        if (j12 > 20971520) {
            return new q(f11);
        }
        ByteBuffer allocate = ByteBuffer.allocate(i11 - 24);
        allocate.order(byteOrder);
        if (a(fileChannel, j13, allocate) != allocate.capacity() || ((ByteBuffer) allocate.flip()).getLong() != f12) {
            return new q(f11);
        }
        u uVar = new u(j13);
        while (allocate.remaining() >= 12) {
            long j14 = allocate.getLong();
            int i12 = allocate.getInt();
            int i13 = (int) (j14 - 4);
            if (i13 < 0 || i13 > allocate.remaining()) {
                break;
            }
            byte[] bArr2 = new byte[i13];
            allocate.get(bArr2, 0, i13);
            uVar.b(i12, bArr2);
        }
        return new q(uVar, f11);
    }

    public static void d(FileChannel fileChannel, FileChannel fileChannel2, long j11, long j12) throws IOException {
        while (j12 > 0) {
            long j13 = j12;
            FileChannel fileChannel3 = fileChannel2;
            long j14 = j11;
            long transferTo = fileChannel.transferTo(j14, j13, fileChannel3);
            long j15 = j14 + transferTo;
            fileChannel2 = fileChannel3;
            j12 = j13 - transferTo;
            j11 = j15;
        }
    }

    public static void e(byte[] bArr, File file, File file2) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            FileChannel channel = fileInputStream.getChannel();
            FileChannel channel2 = fileOutputStream.getChannel();
            q c11 = c(channel);
            channel.position(0L);
            if (c11 == null) {
                d(channel, channel2, 0L, channel.size());
            } else {
                c11.b(bArr);
                u c12 = c11.c();
                v a11 = c11.a();
                if (c12 != null) {
                    d(channel, channel2, 0L, c12.e());
                    for (ByteBuffer byteBuffer : c12.i()) {
                        while (byteBuffer.hasRemaining()) {
                            channel2.write(byteBuffer);
                        }
                    }
                    long j11 = a11.f91384f;
                    d(channel, channel2, j11, a11.f91386h - j11);
                } else {
                    d(channel, channel2, 0L, a11.f91386h);
                }
                ByteBuffer b11 = a11.b(c12 != null ? c12.a() : a11.f91384f);
                while (b11.hasRemaining()) {
                    channel2.write(b11);
                }
            }
        } finally {
            fileInputStream.close();
            fileOutputStream.close();
        }
    }

    public static v f(FileChannel fileChannel) throws IOException {
        v vVar;
        byte[] bArr = new byte[128];
        long size = fileChannel.size();
        long j11 = 22;
        v vVar2 = null;
        if (size < 22) {
            return null;
        }
        long j12 = 0;
        long j13 = 106;
        long max = Math.max(0L, (size > 65557 ? size - 65557 : 0L) - j13);
        long j14 = size - 128;
        while (j14 >= max) {
            int i11 = 0;
            long j15 = j11;
            if (j14 < j12) {
                int i12 = (int) (-j14);
                Arrays.fill(bArr, 0, i12, (byte) 0);
                i11 = i12;
            }
            long j16 = j13;
            long j17 = j14;
            b(fileChannel, j14 < j12 ? j12 : j14, bArr, i11, 128 - i11);
            int i13 = 106;
            while (i13 >= 0) {
                if (bArr[i13] == 80 && bArr[i13 + 1] == 75 && bArr[i13 + 2] == 5 && bArr[i13 + 3] == 6) {
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    int e11 = s.e(bArr, i13 + 20, byteOrder) & c2.f100412d;
                    long j18 = i13 + j17;
                    vVar = vVar2;
                    if (j18 + j15 + e11 == size) {
                        v vVar3 = new v();
                        vVar3.f91386h = j18;
                        vVar3.f91379a = s.e(bArr, i13 + 4, byteOrder) & c2.f100412d;
                        vVar3.f91380b = s.e(bArr, i13 + 6, byteOrder) & c2.f100412d;
                        vVar3.f91381c = s.e(bArr, i13 + 8, byteOrder) & c2.f100412d;
                        vVar3.f91382d = 65535 & s.e(bArr, i13 + 10, byteOrder);
                        vVar3.f91383e = s.b(bArr, i13 + 12, byteOrder) & 4294967295L;
                        vVar3.f91384f = s.b(bArr, i13 + 16, byteOrder) & 4294967295L;
                        if (e11 > 0) {
                            byte[] bArr2 = new byte[e11];
                            vVar3.f91385g = bArr2;
                            b(fileChannel, vVar3.f91386h + j15, bArr2, 0, e11);
                        }
                        return vVar3;
                    }
                } else {
                    vVar = vVar2;
                }
                i13--;
                vVar2 = vVar;
            }
            j14 = j17 - j16;
            j11 = j15;
            j13 = j16;
            j12 = 0;
        }
        return vVar2;
    }
}
