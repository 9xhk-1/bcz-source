package com.badlogic.gdx.utils;

import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class BufferUtils {

    /* renamed from: a, reason: collision with root package name */
    public static a<ByteBuffer> f13149a = new a<>();

    /* renamed from: b, reason: collision with root package name */
    public static int f13150b = 0;

    public static long A(Buffer buffer) {
        return getBufferAddress(buffer) + buffer.position();
    }

    public static boolean B(ByteBuffer byteBuffer) {
        boolean l11;
        synchronized (f13149a) {
            l11 = f13149a.l(byteBuffer, true);
        }
        return l11;
    }

    public static ByteBuffer C(int i11) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i11);
        allocateDirect.order(ByteOrder.nativeOrder());
        return allocateDirect;
    }

    public static CharBuffer D(int i11) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i11 * 2);
        allocateDirect.order(ByteOrder.nativeOrder());
        return allocateDirect.asCharBuffer();
    }

    public static DoubleBuffer E(int i11) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i11 * 8);
        allocateDirect.order(ByteOrder.nativeOrder());
        return allocateDirect.asDoubleBuffer();
    }

    public static FloatBuffer F(int i11) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i11 * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        return allocateDirect.asFloatBuffer();
    }

    public static IntBuffer G(int i11) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i11 * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        return allocateDirect.asIntBuffer();
    }

    public static LongBuffer H(int i11) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i11 * 8);
        allocateDirect.order(ByteOrder.nativeOrder());
        return allocateDirect.asLongBuffer();
    }

    public static ShortBuffer I(int i11) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i11 * 2);
        allocateDirect.order(ByteOrder.nativeOrder());
        return allocateDirect.asShortBuffer();
    }

    public static ByteBuffer J(int i11) {
        ByteBuffer newDisposableByteBuffer = newDisposableByteBuffer(i11);
        newDisposableByteBuffer.order(ByteOrder.nativeOrder());
        f13150b += i11;
        synchronized (f13149a) {
            f13149a.a(newDisposableByteBuffer);
        }
        return newDisposableByteBuffer;
    }

    public static ByteBuffer K(ByteBuffer byteBuffer) {
        f13150b += byteBuffer.capacity();
        synchronized (f13149a) {
            f13149a.a(byteBuffer);
        }
        return byteBuffer;
    }

    public static int L(Buffer buffer) {
        if (buffer instanceof ByteBuffer) {
            return buffer.position();
        }
        if (buffer instanceof ShortBuffer) {
            return buffer.position() << 1;
        }
        if (buffer instanceof CharBuffer) {
            return buffer.position() << 1;
        }
        if (buffer instanceof IntBuffer) {
            return buffer.position() << 2;
        }
        if (buffer instanceof LongBuffer) {
            return buffer.position() << 3;
        }
        if (buffer instanceof FloatBuffer) {
            return buffer.position() << 2;
        }
        if (buffer instanceof DoubleBuffer) {
            return buffer.position() << 3;
        }
        throw new GdxRuntimeException("Can't copy to a " + buffer.getClass().getName() + " instance");
    }

    public static void M(Buffer buffer, int i11, int i12, int i13, Matrix3 matrix3) {
        N(buffer, i11, i12, i13, matrix3, 0);
    }

    public static void N(Buffer buffer, int i11, int i12, int i13, Matrix3 matrix3, int i14) {
        if (i11 == 2) {
            transformV2M3Jni(buffer, i12, i13, matrix3.val, L(buffer) + i14);
        } else {
            if (i11 != 3) {
                throw new IllegalArgumentException();
            }
            transformV3M3Jni(buffer, i12, i13, matrix3.val, L(buffer) + i14);
        }
    }

    public static void O(Buffer buffer, int i11, int i12, int i13, Matrix4 matrix4) {
        P(buffer, i11, i12, i13, matrix4, 0);
    }

    public static void P(Buffer buffer, int i11, int i12, int i13, Matrix4 matrix4, int i14) {
        if (i11 == 2) {
            transformV2M4Jni(buffer, i12, i13, matrix4.val, L(buffer) + i14);
        } else if (i11 == 3) {
            transformV3M4Jni(buffer, i12, i13, matrix4.val, L(buffer) + i14);
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException();
            }
            transformV4M4Jni(buffer, i12, i13, matrix4.val, L(buffer) + i14);
        }
    }

    public static void Q(float[] fArr, int i11, int i12, int i13, Matrix3 matrix3) {
        R(fArr, i11, i12, i13, matrix3, 0);
    }

    public static void R(float[] fArr, int i11, int i12, int i13, Matrix3 matrix3, int i14) {
        if (i11 == 2) {
            transformV2M3Jni(fArr, i12, i13, matrix3.val, i14);
        } else {
            if (i11 != 3) {
                throw new IllegalArgumentException();
            }
            transformV3M3Jni(fArr, i12, i13, matrix3.val, i14);
        }
    }

    public static void S(float[] fArr, int i11, int i12, int i13, Matrix4 matrix4) {
        T(fArr, i11, i12, i13, matrix4, 0);
    }

    public static void T(float[] fArr, int i11, int i12, int i13, Matrix4 matrix4, int i14) {
        if (i11 == 2) {
            transformV2M4Jni(fArr, i12, i13, matrix4.val, i14);
        } else if (i11 == 3) {
            transformV3M4Jni(fArr, i12, i13, matrix4.val, i14);
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException();
            }
            transformV4M4Jni(fArr, i12, i13, matrix4.val, i14);
        }
    }

    public static int a(Buffer buffer, int i11) {
        if (buffer instanceof ByteBuffer) {
            return i11;
        }
        if (buffer instanceof ShortBuffer) {
            return i11 >>> 1;
        }
        if (buffer instanceof CharBuffer) {
            return i11 >>> 1;
        }
        if (buffer instanceof IntBuffer) {
            return i11 >>> 2;
        }
        if (buffer instanceof LongBuffer) {
            return i11 >>> 3;
        }
        if (buffer instanceof FloatBuffer) {
            return i11 >>> 2;
        }
        if (buffer instanceof DoubleBuffer) {
            return i11 >>> 3;
        }
        throw new GdxRuntimeException("Can't copy to a " + buffer.getClass().getName() + " instance");
    }

    public static void b(Buffer buffer, Buffer buffer2, int i11) {
        int q11 = q(buffer, i11);
        buffer2.limit(buffer2.position() + a(buffer2, q11));
        copyJni(buffer, L(buffer), buffer2, L(buffer2), q11);
    }

    public static void c(byte[] bArr, int i11, Buffer buffer, int i12) {
        buffer.limit(buffer.position() + a(buffer, i12));
        copyJni(bArr, i11, buffer, L(buffer), i12);
    }

    public static native void clear(ByteBuffer byteBuffer, int i11);

    private static native void copyJni(Buffer buffer, int i11, Buffer buffer2, int i12, int i13);

    private static native void copyJni(byte[] bArr, int i11, Buffer buffer, int i12, int i13);

    private static native void copyJni(char[] cArr, int i11, Buffer buffer, int i12, int i13);

    private static native void copyJni(double[] dArr, int i11, Buffer buffer, int i12, int i13);

    private static native void copyJni(float[] fArr, int i11, Buffer buffer, int i12, int i13);

    private static native void copyJni(float[] fArr, Buffer buffer, int i11, int i12);

    private static native void copyJni(int[] iArr, int i11, Buffer buffer, int i12, int i13);

    private static native void copyJni(long[] jArr, int i11, Buffer buffer, int i12, int i13);

    private static native void copyJni(short[] sArr, int i11, Buffer buffer, int i12, int i13);

    public static void d(char[] cArr, int i11, int i12, Buffer buffer) {
        copyJni(cArr, i11, buffer, L(buffer), i12 << 1);
    }

    public static void e(char[] cArr, int i11, Buffer buffer, int i12) {
        int i13 = i12 << 1;
        buffer.limit(buffer.position() + a(buffer, i13));
        copyJni(cArr, i11, buffer, L(buffer), i13);
    }

    public static void f(double[] dArr, int i11, int i12, Buffer buffer) {
        copyJni(dArr, i11, buffer, L(buffer), i12 << 3);
    }

    private static native long find(Buffer buffer, int i11, int i12, Buffer buffer2, int i13, int i14);

    private static native long find(Buffer buffer, int i11, int i12, Buffer buffer2, int i13, int i14, float f11);

    private static native long find(Buffer buffer, int i11, int i12, float[] fArr, int i13, int i14);

    private static native long find(Buffer buffer, int i11, int i12, float[] fArr, int i13, int i14, float f11);

    private static native long find(float[] fArr, int i11, int i12, Buffer buffer, int i13, int i14);

    private static native long find(float[] fArr, int i11, int i12, Buffer buffer, int i13, int i14, float f11);

    private static native long find(float[] fArr, int i11, int i12, float[] fArr2, int i13, int i14);

    private static native long find(float[] fArr, int i11, int i12, float[] fArr2, int i13, int i14, float f11);

    private static native void freeMemory(ByteBuffer byteBuffer);

    public static void g(double[] dArr, int i11, Buffer buffer, int i12) {
        int i13 = i12 << 3;
        buffer.limit(buffer.position() + a(buffer, i13));
        copyJni(dArr, i11, buffer, L(buffer), i13);
    }

    private static native long getBufferAddress(Buffer buffer);

    public static void h(float[] fArr, int i11, int i12, Buffer buffer) {
        copyJni(fArr, i11, buffer, L(buffer), i12 << 2);
    }

    public static void i(float[] fArr, int i11, Buffer buffer, int i12) {
        int i13 = i12 << 2;
        buffer.limit(buffer.position() + a(buffer, i13));
        copyJni(fArr, i11, buffer, L(buffer), i13);
    }

    public static void j(float[] fArr, Buffer buffer, int i11, int i12) {
        if (buffer instanceof ByteBuffer) {
            buffer.limit(i11 << 2);
        } else if (buffer instanceof FloatBuffer) {
            buffer.limit(i11);
        }
        copyJni(fArr, buffer, i11, i12);
        buffer.position(0);
    }

    public static void k(int[] iArr, int i11, int i12, Buffer buffer) {
        copyJni(iArr, i11, buffer, L(buffer), i12 << 2);
    }

    public static void l(int[] iArr, int i11, Buffer buffer, int i12) {
        int i13 = i12 << 2;
        buffer.limit(buffer.position() + a(buffer, i13));
        copyJni(iArr, i11, buffer, L(buffer), i13);
    }

    public static void m(long[] jArr, int i11, int i12, Buffer buffer) {
        copyJni(jArr, i11, buffer, L(buffer), i12 << 3);
    }

    public static void n(long[] jArr, int i11, Buffer buffer, int i12) {
        int i13 = i12 << 3;
        buffer.limit(buffer.position() + a(buffer, i13));
        copyJni(jArr, i11, buffer, L(buffer), i13);
    }

    private static native ByteBuffer newDisposableByteBuffer(int i11);

    public static void o(short[] sArr, int i11, Buffer buffer, int i12) {
        int i13 = i12 << 1;
        buffer.limit(buffer.position() + a(buffer, i13));
        copyJni(sArr, i11, buffer, L(buffer), i13);
    }

    public static void p(ByteBuffer byteBuffer) {
        int capacity = byteBuffer.capacity();
        synchronized (f13149a) {
            if (!f13149a.C(byteBuffer, true)) {
                throw new IllegalArgumentException("buffer not allocated with newUnsafeByteBuffer or already disposed");
            }
        }
        f13150b -= capacity;
        freeMemory(byteBuffer);
    }

    public static int q(Buffer buffer, int i11) {
        if (buffer instanceof ByteBuffer) {
            return i11;
        }
        if (buffer instanceof ShortBuffer) {
            return i11 << 1;
        }
        if (buffer instanceof CharBuffer) {
            return i11 << 1;
        }
        if (buffer instanceof IntBuffer) {
            return i11 << 2;
        }
        if (buffer instanceof LongBuffer) {
            return i11 << 3;
        }
        if (buffer instanceof FloatBuffer) {
            return i11 << 2;
        }
        if (buffer instanceof DoubleBuffer) {
            return i11 << 3;
        }
        throw new GdxRuntimeException("Can't copy to a " + buffer.getClass().getName() + " instance");
    }

    public static long r(Buffer buffer, int i11, Buffer buffer2, int i12) {
        return find(buffer, L(buffer), i11, buffer2, L(buffer2), i12);
    }

    public static long s(Buffer buffer, int i11, Buffer buffer2, int i12, float f11) {
        return find(buffer, L(buffer), i11, buffer2, L(buffer2), i12, f11);
    }

    public static long t(Buffer buffer, int i11, float[] fArr, int i12) {
        return find(buffer, L(buffer), i11, fArr, 0, i12);
    }

    private static native void transformV2M3Jni(Buffer buffer, int i11, int i12, float[] fArr, int i13);

    private static native void transformV2M3Jni(float[] fArr, int i11, int i12, float[] fArr2, int i13);

    private static native void transformV2M4Jni(Buffer buffer, int i11, int i12, float[] fArr, int i13);

    private static native void transformV2M4Jni(float[] fArr, int i11, int i12, float[] fArr2, int i13);

    private static native void transformV3M3Jni(Buffer buffer, int i11, int i12, float[] fArr, int i13);

    private static native void transformV3M3Jni(float[] fArr, int i11, int i12, float[] fArr2, int i13);

    private static native void transformV3M4Jni(Buffer buffer, int i11, int i12, float[] fArr, int i13);

    private static native void transformV3M4Jni(float[] fArr, int i11, int i12, float[] fArr2, int i13);

    private static native void transformV4M4Jni(Buffer buffer, int i11, int i12, float[] fArr, int i13);

    private static native void transformV4M4Jni(float[] fArr, int i11, int i12, float[] fArr2, int i13);

    public static long u(Buffer buffer, int i11, float[] fArr, int i12, float f11) {
        return find(buffer, L(buffer), i11, fArr, 0, i12, f11);
    }

    public static long v(float[] fArr, int i11, Buffer buffer, int i12) {
        return find(fArr, 0, i11, buffer, L(buffer), i12);
    }

    public static long w(float[] fArr, int i11, Buffer buffer, int i12, float f11) {
        return find(fArr, 0, i11, buffer, L(buffer), i12, f11);
    }

    public static long x(float[] fArr, int i11, float[] fArr2, int i12) {
        return find(fArr, 0, i11, fArr2, 0, i12);
    }

    public static long y(float[] fArr, int i11, float[] fArr2, int i12, float f11) {
        return find(fArr, 0, i11, fArr2, 0, i12, f11);
    }

    public static int z() {
        return f13150b;
    }
}
