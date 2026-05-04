package fl;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class e extends InputStream {

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("POOL")
    public static final Queue<e> f51998c = o.g(0);

    /* renamed from: a, reason: collision with root package name */
    public InputStream f51999a;

    /* renamed from: b, reason: collision with root package name */
    public IOException f52000b;

    public static void a() {
        synchronized (f51998c) {
            while (true) {
                try {
                    Queue<e> queue = f51998c;
                    if (!queue.isEmpty()) {
                        queue.remove();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @NonNull
    public static e e(@NonNull InputStream inputStream) {
        e poll;
        Queue<e> queue = f51998c;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new e();
        }
        poll.f(inputStream);
        return poll;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f51999a.available();
    }

    @Nullable
    public IOException c() {
        return this.f52000b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f51999a.close();
    }

    public void f(@NonNull InputStream inputStream) {
        this.f51999a = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i11) {
        this.f51999a.mark(i11);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f51999a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f51999a.read();
        } catch (IOException e11) {
            this.f52000b = e11;
            throw e11;
        }
    }

    public void release() {
        this.f52000b = null;
        this.f51999a = null;
        Queue<e> queue = f51998c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f51999a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j11) throws IOException {
        try {
            return this.f51999a.skip(j11);
        } catch (IOException e11) {
            this.f52000b = e11;
            throw e11;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f51999a.read(bArr);
        } catch (IOException e11) {
            this.f52000b = e11;
            throw e11;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        try {
            return this.f51999a.read(bArr, i11, i12);
        } catch (IOException e11) {
            this.f52000b = e11;
            throw e11;
        }
    }
}
