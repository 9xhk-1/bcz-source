package org.conscrypt;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
final class BufferUtils {
    private BufferUtils() {
    }

    public static void checkNotNull(ByteBuffer[] byteBufferArr) {
        for (ByteBuffer byteBuffer : byteBufferArr) {
            if (byteBuffer == null) {
                throw new IllegalArgumentException("Null buffer in array");
            }
        }
    }

    public static void consume(ByteBuffer[] byteBufferArr, int i11) {
        for (ByteBuffer byteBuffer : byteBufferArr) {
            int min = Math.min(byteBuffer.remaining(), i11);
            if (min > 0) {
                byteBuffer.position(byteBuffer.position() + min);
                i11 -= min;
                if (i11 == 0) {
                    break;
                }
            }
        }
        if (i11 > 0) {
            throw new IllegalArgumentException("toConsume > data size");
        }
    }

    public static ByteBuffer copyNoConsume(ByteBuffer[] byteBufferArr, ByteBuffer byteBuffer, int i11) {
        Preconditions.checkArgument(byteBuffer.remaining() >= i11, "Destination buffer too small");
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            int remaining = byteBuffer2.remaining();
            if (remaining > 0) {
                int position = byteBuffer2.position();
                if (remaining <= i11) {
                    byteBuffer.put(byteBuffer2);
                    i11 -= remaining;
                } else {
                    int limit = byteBuffer2.limit();
                    byteBuffer2.limit(byteBuffer2.position() + i11);
                    byteBuffer.put(byteBuffer2);
                    byteBuffer2.limit(limit);
                    i11 = 0;
                }
                byteBuffer2.position(position);
                if (i11 == 0) {
                    break;
                }
            }
        }
        byteBuffer.flip();
        return byteBuffer;
    }

    public static ByteBuffer getBufferLargerThan(ByteBuffer[] byteBufferArr, int i11) {
        int length = byteBufferArr.length;
        int i12 = 0;
        while (i12 < length) {
            ByteBuffer byteBuffer = byteBufferArr[i12];
            int remaining = byteBuffer.remaining();
            if (remaining > 0) {
                if (remaining < i11) {
                    do {
                        i12++;
                        if (i12 < length) {
                        }
                    } while (byteBufferArr[i12].remaining() <= 0);
                    return null;
                }
                return byteBuffer;
            }
            i12++;
        }
        return null;
    }

    public static long remaining(ByteBuffer[] byteBufferArr) {
        long j11 = 0;
        for (ByteBuffer byteBuffer : byteBufferArr) {
            j11 += byteBuffer.remaining();
        }
        return j11;
    }
}
