package po;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.common.base.Preconditions;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@q
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final int f81036a = 8192;

    /* renamed from: b, reason: collision with root package name */
    public static final int f81037b = 524288;

    /* renamed from: c, reason: collision with root package name */
    public static final int f81038c = 2147483639;

    /* renamed from: d, reason: collision with root package name */
    public static final int f81039d = 20;

    /* renamed from: e, reason: collision with root package name */
    public static final OutputStream f81040e = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends OutputStream {
        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int b11) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] b11) {
            Preconditions.checkNotNull(b11);
        }

        @Override // java.io.OutputStream
        public void write(byte[] b11, int off, int len) {
            Preconditions.checkNotNull(b11);
            Preconditions.checkPositionIndexes(off, len + off, b11.length);
        }
    }

    public static byte[] a(Queue<byte[]> bufs, int totalLen) {
        if (bufs.isEmpty()) {
            return new byte[0];
        }
        byte[] remove = bufs.remove();
        if (remove.length == totalLen) {
            return remove;
        }
        int length = totalLen - remove.length;
        byte[] copyOf = Arrays.copyOf(remove, totalLen);
        while (length > 0) {
            byte[] remove2 = bufs.remove();
            int min = Math.min(length, remove2.length);
            System.arraycopy(remove2, 0, copyOf, totalLen - length, min);
            length -= min;
        }
        return copyOf;
    }

    @uo.a
    public static long b(InputStream from, OutputStream to2) throws IOException {
        Preconditions.checkNotNull(from);
        Preconditions.checkNotNull(to2);
        byte[] d11 = d();
        long j11 = 0;
        while (true) {
            int read = from.read(d11);
            if (read == -1) {
                return j11;
            }
            to2.write(d11, 0, read);
            j11 += read;
        }
    }

    @uo.a
    public static long c(ReadableByteChannel from, WritableByteChannel to2) throws IOException {
        Preconditions.checkNotNull(from);
        Preconditions.checkNotNull(to2);
        long j11 = 0;
        if (!(from instanceof FileChannel)) {
            ByteBuffer wrap = ByteBuffer.wrap(d());
            while (from.read(wrap) != -1) {
                v.b(wrap);
                while (wrap.hasRemaining()) {
                    j11 += to2.write(wrap);
                }
                v.a(wrap);
            }
            return j11;
        }
        FileChannel fileChannel = (FileChannel) from;
        long position = fileChannel.position();
        long j12 = position;
        while (true) {
            WritableByteChannel writableByteChannel = to2;
            long transferTo = fileChannel.transferTo(j12, PlaybackStateCompat.F, writableByteChannel);
            j12 += transferTo;
            fileChannel.position(j12);
            if (transferTo <= 0 && j12 >= fileChannel.size()) {
                return j12 - position;
            }
            to2 = writableByteChannel;
        }
    }

    public static byte[] d() {
        return new byte[8192];
    }

    @uo.a
    public static long e(InputStream in2) throws IOException {
        byte[] d11 = d();
        long j11 = 0;
        while (true) {
            long read = in2.read(d11);
            if (read == -1) {
                return j11;
            }
            j11 += read;
        }
    }

    public static InputStream f(InputStream in2, long limit) {
        return new d(in2, limit);
    }

    public static po.b g(ByteArrayInputStream byteArrayInputStream) {
        return new b((ByteArrayInputStream) Preconditions.checkNotNull(byteArrayInputStream));
    }

    public static po.b h(byte[] bytes) {
        return g(new ByteArrayInputStream(bytes));
    }

    public static po.b i(byte[] bytes, int start) {
        Preconditions.checkPositionIndex(start, bytes.length);
        return g(new ByteArrayInputStream(bytes, start, bytes.length - start));
    }

    public static po.c j() {
        return l(new ByteArrayOutputStream());
    }

    public static po.c k(int size) {
        if (size >= 0) {
            return l(new ByteArrayOutputStream(size));
        }
        throw new IllegalArgumentException(String.format("Invalid size: %s", Integer.valueOf(size)));
    }

    public static po.c l(ByteArrayOutputStream byteArrayOutputStream) {
        return new c((ByteArrayOutputStream) Preconditions.checkNotNull(byteArrayOutputStream));
    }

    public static OutputStream m() {
        return f81040e;
    }

    @uo.a
    public static int n(InputStream in2, byte[] b11, int off, int len) throws IOException {
        Preconditions.checkNotNull(in2);
        Preconditions.checkNotNull(b11);
        if (len < 0) {
            throw new IndexOutOfBoundsException(String.format("len (%s) cannot be negative", Integer.valueOf(len)));
        }
        Preconditions.checkPositionIndexes(off, off + len, b11.length);
        int i11 = 0;
        while (i11 < len) {
            int read = in2.read(b11, off + i11, len - i11);
            if (read == -1) {
                break;
            }
            i11 += read;
        }
        return i11;
    }

    @d0
    @uo.a
    public static <T> T o(InputStream input, po.d<T> processor) throws IOException {
        int read;
        Preconditions.checkNotNull(input);
        Preconditions.checkNotNull(processor);
        byte[] d11 = d();
        do {
            read = input.read(d11);
            if (read == -1) {
                break;
            }
        } while (processor.a(d11, 0, read));
        return processor.getResult();
    }

    public static void p(InputStream in2, byte[] b11) throws IOException {
        q(in2, b11, 0, b11.length);
    }

    public static void q(InputStream in2, byte[] b11, int off, int len) throws IOException {
        int n11 = n(in2, b11, off, len);
        if (n11 == len) {
            return;
        }
        throw new EOFException("reached end of stream after reading " + n11 + " bytes; " + len + " bytes expected");
    }

    public static void r(InputStream in2, long n11) throws IOException {
        long t11 = t(in2, n11);
        if (t11 >= n11) {
            return;
        }
        throw new EOFException("reached end of stream after skipping " + t11 + " bytes; " + n11 + " bytes expected");
    }

    public static long s(InputStream in2, long n11) throws IOException {
        int available = in2.available();
        if (available == 0) {
            return 0L;
        }
        return in2.skip(Math.min(available, n11));
    }

    public static long t(InputStream in2, long n11) throws IOException {
        byte[] bArr = null;
        long j11 = 0;
        while (j11 < n11) {
            long j12 = n11 - j11;
            long s11 = s(in2, j12);
            if (s11 == 0) {
                int min = (int) Math.min(j12, 8192L);
                if (bArr == null) {
                    bArr = new byte[min];
                }
                s11 = in2.read(bArr, 0, min);
                if (s11 == -1) {
                    break;
                }
            }
            j11 += s11;
        }
        return j11;
    }

    public static byte[] u(InputStream in2) throws IOException {
        Preconditions.checkNotNull(in2);
        return w(in2, new ArrayDeque(20), 0);
    }

    public static byte[] v(InputStream in2, long expectedSize) throws IOException {
        Preconditions.checkArgument(expectedSize >= 0, "expectedSize (%s) must be non-negative", expectedSize);
        if (expectedSize > 2147483639) {
            throw new OutOfMemoryError(expectedSize + " bytes is too large to fit in a byte array");
        }
        int i11 = (int) expectedSize;
        byte[] bArr = new byte[i11];
        int i12 = i11;
        while (i12 > 0) {
            int i13 = i11 - i12;
            int read = in2.read(bArr, i13, i12);
            if (read == -1) {
                return Arrays.copyOf(bArr, i13);
            }
            i12 -= read;
        }
        int read2 = in2.read();
        if (read2 == -1) {
            return bArr;
        }
        ArrayDeque arrayDeque = new ArrayDeque(22);
        arrayDeque.add(bArr);
        arrayDeque.add(new byte[]{(byte) read2});
        return w(in2, arrayDeque, i11 + 1);
    }

    public static byte[] w(InputStream in2, Queue<byte[]> bufs, int totalLen) throws IOException {
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(totalLen) * 2));
        while (totalLen < 2147483639) {
            int min2 = Math.min(min, 2147483639 - totalLen);
            byte[] bArr = new byte[min2];
            bufs.add(bArr);
            int i11 = 0;
            while (i11 < min2) {
                int read = in2.read(bArr, i11, min2 - i11);
                if (read == -1) {
                    return a(bufs, totalLen);
                }
                i11 += read;
                totalLen += read;
            }
            min = com.google.common.math.f.u(min, min < 4096 ? 4 : 2);
        }
        if (in2.read() == -1) {
            return a(bufs, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements po.b {

        /* renamed from: a, reason: collision with root package name */
        public final DataInput f81041a;

        public b(ByteArrayInputStream byteArrayInputStream) {
            this.f81041a = new DataInputStream(byteArrayInputStream);
        }

        @Override // po.b, java.io.DataInput
        public boolean readBoolean() {
            try {
                return this.f81041a.readBoolean();
            } catch (IOException e11) {
                throw new IllegalStateException(e11);
            }
        }

        @Override // po.b, java.io.DataInput
        public byte readByte() {
            try {
                return this.f81041a.readByte();
            } catch (EOFException e11) {
                throw new IllegalStateException(e11);
            } catch (IOException e12) {
                throw new AssertionError(e12);
            }
        }

        @Override // po.b, java.io.DataInput
        public char readChar() {
            try {
                return this.f81041a.readChar();
            } catch (IOException e11) {
                throw new IllegalStateException(e11);
            }
        }

        @Override // po.b, java.io.DataInput
        public double readDouble() {
            try {
                return this.f81041a.readDouble();
            } catch (IOException e11) {
                throw new IllegalStateException(e11);
            }
        }

        @Override // po.b, java.io.DataInput
        public float readFloat() {
            try {
                return this.f81041a.readFloat();
            } catch (IOException e11) {
                throw new IllegalStateException(e11);
            }
        }

        @Override // po.b, java.io.DataInput
        public void readFully(byte[] b11) {
            try {
                this.f81041a.readFully(b11);
            } catch (IOException e11) {
                throw new IllegalStateException(e11);
            }
        }

        @Override // po.b, java.io.DataInput
        public int readInt() {
            try {
                return this.f81041a.readInt();
            } catch (IOException e11) {
                throw new IllegalStateException(e11);
            }
        }

        @Override // po.b, java.io.DataInput
        @CheckForNull
        public String readLine() {
            try {
                return this.f81041a.readLine();
            } catch (IOException e11) {
                throw new IllegalStateException(e11);
            }
        }

        @Override // po.b, java.io.DataInput
        public long readLong() {
            try {
                return this.f81041a.readLong();
            } catch (IOException e11) {
                throw new IllegalStateException(e11);
            }
        }

        @Override // po.b, java.io.DataInput
        public short readShort() {
            try {
                return this.f81041a.readShort();
            } catch (IOException e11) {
                throw new IllegalStateException(e11);
            }
        }

        @Override // po.b, java.io.DataInput
        public String readUTF() {
            try {
                return this.f81041a.readUTF();
            } catch (IOException e11) {
                throw new IllegalStateException(e11);
            }
        }

        @Override // po.b, java.io.DataInput
        public int readUnsignedByte() {
            try {
                return this.f81041a.readUnsignedByte();
            } catch (IOException e11) {
                throw new IllegalStateException(e11);
            }
        }

        @Override // po.b, java.io.DataInput
        public int readUnsignedShort() {
            try {
                return this.f81041a.readUnsignedShort();
            } catch (IOException e11) {
                throw new IllegalStateException(e11);
            }
        }

        @Override // po.b, java.io.DataInput
        public int skipBytes(int n11) {
            try {
                return this.f81041a.skipBytes(n11);
            } catch (IOException e11) {
                throw new IllegalStateException(e11);
            }
        }

        @Override // po.b, java.io.DataInput
        public void readFully(byte[] b11, int off, int len) {
            try {
                this.f81041a.readFully(b11, off, len);
            } catch (IOException e11) {
                throw new IllegalStateException(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements po.c {

        /* renamed from: a, reason: collision with root package name */
        public final DataOutput f81042a;

        /* renamed from: b, reason: collision with root package name */
        public final ByteArrayOutputStream f81043b;

        public c(ByteArrayOutputStream byteArrayOutputStream) {
            this.f81043b = byteArrayOutputStream;
            this.f81042a = new DataOutputStream(byteArrayOutputStream);
        }

        @Override // po.c
        public byte[] toByteArray() {
            return this.f81043b.toByteArray();
        }

        @Override // po.c, java.io.DataOutput
        public void write(int b11) {
            try {
                this.f81042a.write(b11);
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // po.c, java.io.DataOutput
        public void writeBoolean(boolean v11) {
            try {
                this.f81042a.writeBoolean(v11);
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // po.c, java.io.DataOutput
        public void writeByte(int v11) {
            try {
                this.f81042a.writeByte(v11);
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // po.c, java.io.DataOutput
        public void writeBytes(String s11) {
            try {
                this.f81042a.writeBytes(s11);
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // po.c, java.io.DataOutput
        public void writeChar(int v11) {
            try {
                this.f81042a.writeChar(v11);
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // po.c, java.io.DataOutput
        public void writeChars(String s11) {
            try {
                this.f81042a.writeChars(s11);
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // po.c, java.io.DataOutput
        public void writeDouble(double v11) {
            try {
                this.f81042a.writeDouble(v11);
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // po.c, java.io.DataOutput
        public void writeFloat(float v11) {
            try {
                this.f81042a.writeFloat(v11);
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // po.c, java.io.DataOutput
        public void writeInt(int v11) {
            try {
                this.f81042a.writeInt(v11);
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // po.c, java.io.DataOutput
        public void writeLong(long v11) {
            try {
                this.f81042a.writeLong(v11);
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // po.c, java.io.DataOutput
        public void writeShort(int v11) {
            try {
                this.f81042a.writeShort(v11);
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // po.c, java.io.DataOutput
        public void writeUTF(String s11) {
            try {
                this.f81042a.writeUTF(s11);
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // po.c, java.io.DataOutput
        public void write(byte[] b11) {
            try {
                this.f81042a.write(b11);
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // po.c, java.io.DataOutput
        public void write(byte[] b11, int off, int len) {
            try {
                this.f81042a.write(b11, off, len);
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends FilterInputStream {

        /* renamed from: a, reason: collision with root package name */
        public long f81044a;

        /* renamed from: b, reason: collision with root package name */
        public long f81045b;

        public d(InputStream in2, long limit) {
            super(in2);
            this.f81045b = -1L;
            Preconditions.checkNotNull(in2);
            Preconditions.checkArgument(limit >= 0, "limit must be non-negative");
            this.f81044a = limit;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() throws IOException {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f81044a);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int readLimit) {
            ((FilterInputStream) this).in.mark(readLimit);
            this.f81045b = this.f81044a;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            if (this.f81044a == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.f81044a--;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() throws IOException {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f81045b == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f81044a = this.f81045b;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long n11) throws IOException {
            long skip = ((FilterInputStream) this).in.skip(Math.min(n11, this.f81044a));
            this.f81044a -= skip;
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] b11, int off, int len) throws IOException {
            long j11 = this.f81044a;
            if (j11 == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read(b11, off, (int) Math.min(len, j11));
            if (read != -1) {
                this.f81044a -= read;
            }
            return read;
        }
    }
}
