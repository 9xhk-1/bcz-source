package fl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SieveCacheKt;
import en.r;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f51982a = 16384;

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference<byte[]> f51983b = new AtomicReference<>();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f51987a;

        /* renamed from: b, reason: collision with root package name */
        public final int f51988b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f51989c;

        public b(@NonNull byte[] bArr, int i11, int i12) {
            this.f51989c = bArr;
            this.f51987a = i11;
            this.f51988b = i12;
        }
    }

    @NonNull
    public static ByteBuffer a(@NonNull File file) throws IOException {
        Throwable th2;
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length > SieveCacheKt.NodeLinkMask) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, r.f50027a);
            try {
                FileChannel channel = randomAccessFile.getChannel();
                try {
                    MappedByteBuffer load = channel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                    try {
                        channel.close();
                    } catch (IOException unused) {
                    }
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused2) {
                    }
                    return load;
                } catch (Throwable th3) {
                    th2 = th3;
                    fileChannel = channel;
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException unused3) {
                        }
                    }
                    if (randomAccessFile == null) {
                        throw th2;
                    }
                    try {
                        randomAccessFile.close();
                        throw th2;
                    } catch (IOException unused4) {
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                th2 = th4;
            }
        } catch (Throwable th5) {
            th2 = th5;
            randomAccessFile = null;
        }
    }

    @NonNull
    public static ByteBuffer b(@NonNull InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = f51983b.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int read = inputStream.read(andSet);
            if (read < 0) {
                f51983b.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return d(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
            byteArrayOutputStream.write(andSet, 0, read);
        }
    }

    @Nullable
    public static b c(@NonNull ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }

    public static ByteBuffer d(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    @NonNull
    public static byte[] e(@NonNull ByteBuffer byteBuffer) {
        b c11 = c(byteBuffer);
        if (c11 != null && c11.f51987a == 0 && c11.f51988b == c11.f51989c.length) {
            return byteBuffer.array();
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[asReadOnlyBuffer.limit()];
        d(asReadOnlyBuffer);
        asReadOnlyBuffer.get(bArr);
        return bArr;
    }

    public static void f(@NonNull ByteBuffer byteBuffer, @NonNull File file) throws IOException {
        RandomAccessFile randomAccessFile;
        d(byteBuffer);
        FileChannel fileChannel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                fileChannel = randomAccessFile.getChannel();
                fileChannel.write(byteBuffer);
                fileChannel.force(false);
                fileChannel.close();
                randomAccessFile.close();
                try {
                    fileChannel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th2) {
                th = th2;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
        }
    }

    @NonNull
    public static InputStream g(@NonNull ByteBuffer byteBuffer) {
        return new C0617a(byteBuffer);
    }

    public static void h(@NonNull ByteBuffer byteBuffer, @NonNull OutputStream outputStream) throws IOException {
        b c11 = c(byteBuffer);
        if (c11 != null) {
            byte[] bArr = c11.f51989c;
            int i11 = c11.f51987a;
            outputStream.write(bArr, i11, c11.f51988b + i11);
            return;
        }
        byte[] andSet = f51983b.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (byteBuffer.remaining() > 0) {
            int min = Math.min(byteBuffer.remaining(), andSet.length);
            byteBuffer.get(andSet, 0, min);
            outputStream.write(andSet, 0, min);
        }
        f51983b.set(andSet);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: fl.a$a, reason: collision with other inner class name */
    public static class C0617a extends InputStream {

        /* renamed from: c, reason: collision with root package name */
        public static final int f51984c = -1;

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        public final ByteBuffer f51985a;

        /* renamed from: b, reason: collision with root package name */
        public int f51986b = -1;

        public C0617a(@NonNull ByteBuffer byteBuffer) {
            this.f51985a = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f51985a.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i11) {
            this.f51986b = this.f51985a.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f51985a.hasRemaining()) {
                return this.f51985a.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() throws IOException {
            int i11 = this.f51986b;
            if (i11 == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f51985a.position(i11);
        }

        @Override // java.io.InputStream
        public long skip(long j11) {
            if (!this.f51985a.hasRemaining()) {
                return -1L;
            }
            long min = Math.min(j11, available());
            this.f51985a.position((int) (r0.position() + min));
            return min;
        }

        @Override // java.io.InputStream
        public int read(@NonNull byte[] bArr, int i11, int i12) {
            if (!this.f51985a.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i12, available());
            this.f51985a.get(bArr, i11, min);
            return min;
        }
    }
}
