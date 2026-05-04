package fl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes6.dex */
public class d extends InputStream {

    /* renamed from: c, reason: collision with root package name */
    public static final Queue<d> f51995c = o.g(0);

    /* renamed from: a, reason: collision with root package name */
    public InputStream f51996a;

    /* renamed from: b, reason: collision with root package name */
    public IOException f51997b;

    public static void a() {
        while (true) {
            Queue<d> queue = f51995c;
            if (queue.isEmpty()) {
                return;
            } else {
                queue.remove();
            }
        }
    }

    @NonNull
    public static d e(@NonNull InputStream inputStream) {
        d poll;
        Queue<d> queue = f51995c;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new d();
        }
        poll.f(inputStream);
        return poll;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f51996a.available();
    }

    @Nullable
    public IOException c() {
        return this.f51997b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f51996a.close();
    }

    public void f(@NonNull InputStream inputStream) {
        this.f51996a = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i11) {
        this.f51996a.mark(i11);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f51996a.markSupported();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f51996a.read(bArr);
        } catch (IOException e11) {
            this.f51997b = e11;
            return -1;
        }
    }

    public void release() {
        this.f51997b = null;
        this.f51996a = null;
        Queue<d> queue = f51995c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f51996a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j11) {
        try {
            return this.f51996a.skip(j11);
        } catch (IOException e11) {
            this.f51997b = e11;
            return 0L;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) {
        try {
            return this.f51996a.read(bArr, i11, i12);
        } catch (IOException e11) {
            this.f51997b = e11;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f51996a.read();
        } catch (IOException e11) {
            this.f51997b = e11;
            return -1;
        }
    }
}
