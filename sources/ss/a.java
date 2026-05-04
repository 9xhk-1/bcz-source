package ss;

import androidx.collection.SieveCacheKt;
import com.meituan.android.walle.SignatureNotFoundException;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final long f88912a = 3617552046287187010L;

    /* renamed from: b, reason: collision with root package name */
    public static final long f88913b = 2334950737559900225L;

    /* renamed from: c, reason: collision with root package name */
    public static final int f88914c = 32;

    /* renamed from: d, reason: collision with root package name */
    public static final int f88915d = 1896449818;

    /* renamed from: e, reason: collision with root package name */
    public static final int f88916e = 1114793335;

    /* renamed from: f, reason: collision with root package name */
    public static final int f88917f = 4096;

    /* renamed from: g, reason: collision with root package name */
    public static final int f88918g = 1903654775;

    /* renamed from: h, reason: collision with root package name */
    public static final String f88919h = "UTF-8";

    /* renamed from: i, reason: collision with root package name */
    public static final int f88920i = 22;

    /* renamed from: j, reason: collision with root package name */
    public static final int f88921j = 101010256;

    /* renamed from: k, reason: collision with root package name */
    public static final int f88922k = 65535;

    /* renamed from: l, reason: collision with root package name */
    public static final int f88923l = 20;

    public static void a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static e<ByteBuffer, Long> b(FileChannel fileChannel) throws IOException, SignatureNotFoundException {
        return c(fileChannel, d(fileChannel));
    }

    public static e<ByteBuffer, Long> c(FileChannel fileChannel, long j11) throws IOException, SignatureNotFoundException {
        if (j11 < 32) {
            throw new SignatureNotFoundException("APK too small for APK Signing Block. ZIP Central Directory offset: " + j11);
        }
        fileChannel.position(j11 - 24);
        ByteBuffer allocate = ByteBuffer.allocate(24);
        fileChannel.read(allocate);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        allocate.order(byteOrder);
        if (allocate.getLong(8) != f88913b || allocate.getLong(16) != f88912a) {
            throw new SignatureNotFoundException("No APK Signing Block before ZIP Central Directory");
        }
        long j12 = allocate.getLong(0);
        if (j12 < allocate.capacity() || j12 > 2147483639) {
            throw new SignatureNotFoundException("APK Signing Block size out of range: " + j12);
        }
        int i11 = (int) (8 + j12);
        long j13 = j11 - i11;
        if (j13 < 0) {
            throw new SignatureNotFoundException("APK Signing Block offset out of range: " + j13);
        }
        fileChannel.position(j13);
        ByteBuffer allocate2 = ByteBuffer.allocate(i11);
        fileChannel.read(allocate2);
        allocate2.order(byteOrder);
        long j14 = allocate2.getLong(0);
        if (j14 == j12) {
            return e.c(allocate2, Long.valueOf(j13));
        }
        throw new SignatureNotFoundException("APK Signing Block sizes in header and footer do not match: " + j14 + " vs " + j12);
    }

    public static long d(FileChannel fileChannel) throws IOException {
        return e(fileChannel, h(fileChannel));
    }

    public static long e(FileChannel fileChannel, long j11) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        fileChannel.position((fileChannel.size() - j11) - 6);
        fileChannel.read(allocate);
        return allocate.getInt(0);
    }

    public static Map<Integer, ByteBuffer> f(ByteBuffer byteBuffer) throws SignatureNotFoundException {
        a(byteBuffer);
        ByteBuffer i11 = i(byteBuffer, 8, byteBuffer.capacity() - 24);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i12 = 0;
        while (i11.hasRemaining()) {
            i12++;
            if (i11.remaining() < 8) {
                throw new SignatureNotFoundException("Insufficient data to read size of APK Signing Block entry #" + i12);
            }
            long j11 = i11.getLong();
            if (j11 < 4 || j11 > SieveCacheKt.NodeLinkMask) {
                throw new SignatureNotFoundException("APK Signing Block entry #" + i12 + " size out of range: " + j11);
            }
            int i13 = (int) j11;
            int position = i11.position() + i13;
            if (i13 > i11.remaining()) {
                throw new SignatureNotFoundException("APK Signing Block entry #" + i12 + " size out of range: " + i13 + ", available: " + i11.remaining());
            }
            linkedHashMap.put(Integer.valueOf(i11.getInt()), g(i11, i13 - 4));
        }
        return linkedHashMap;
    }

    public static ByteBuffer g(ByteBuffer byteBuffer, int i11) throws BufferUnderflowException {
        if (i11 < 0) {
            throw new IllegalArgumentException("size: " + i11);
        }
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (i12 < position || i12 > limit) {
            throw new BufferUnderflowException();
        }
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            return slice;
        } finally {
        }
    }

    public static long h(FileChannel fileChannel) throws IOException {
        long size = fileChannel.size();
        if (size < 22) {
            throw new IOException("APK too small for ZIP End of Central Directory (EOCD) record");
        }
        long j11 = size - 22;
        long min = Math.min(j11, j60.g.f63638t);
        int i11 = 0;
        while (true) {
            long j12 = i11;
            if (j12 > min) {
                throw new IOException("ZIP End of Central Directory (EOCD) record not found");
            }
            long j13 = j11 - j12;
            ByteBuffer allocate = ByteBuffer.allocate(4);
            fileChannel.position(j13);
            fileChannel.read(allocate);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            allocate.order(byteOrder);
            if (allocate.getInt(0) == 101010256) {
                ByteBuffer allocate2 = ByteBuffer.allocate(2);
                fileChannel.position(j13 + 20);
                fileChannel.read(allocate2);
                allocate2.order(byteOrder);
                short s11 = allocate2.getShort(0);
                if (s11 == i11) {
                    return s11;
                }
            }
            i11++;
        }
    }

    public static ByteBuffer i(ByteBuffer byteBuffer, int i11, int i12) {
        if (i11 < 0) {
            throw new IllegalArgumentException("start: " + i11);
        }
        if (i12 < i11) {
            throw new IllegalArgumentException("end < start: " + i12 + " < " + i11);
        }
        int capacity = byteBuffer.capacity();
        if (i12 > byteBuffer.capacity()) {
            throw new IllegalArgumentException("end > capacity: " + i12 + " > " + capacity);
        }
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            return slice;
        } finally {
        }
    }
}
