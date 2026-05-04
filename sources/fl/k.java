package fl;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class k extends FilterInputStream {

    /* renamed from: b, reason: collision with root package name */
    public static final int f52014b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public static final int f52015c = -1;

    /* renamed from: a, reason: collision with root package name */
    public int f52016a;

    public k(@NonNull InputStream inputStream) {
        super(inputStream);
        this.f52016a = Integer.MIN_VALUE;
    }

    public final long a(long j11) {
        int i11 = this.f52016a;
        if (i11 == 0) {
            return -1L;
        }
        return (i11 == Integer.MIN_VALUE || j11 <= ((long) i11)) ? j11 : i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int i11 = this.f52016a;
        return i11 == Integer.MIN_VALUE ? super.available() : Math.min(i11, super.available());
    }

    public final void c(long j11) {
        int i11 = this.f52016a;
        if (i11 == Integer.MIN_VALUE || j11 == -1) {
            return;
        }
        this.f52016a = (int) (i11 - j11);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i11) {
        super.mark(i11);
        this.f52016a = i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (a(1L) == -1) {
            return -1;
        }
        int read = super.read();
        c(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        super.reset();
        this.f52016a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j11) throws IOException {
        long a11 = a(j11);
        if (a11 == -1) {
            return 0L;
        }
        long skip = super.skip(a11);
        c(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@NonNull byte[] bArr, int i11, int i12) throws IOException {
        int a11 = (int) a(i12);
        if (a11 == -1) {
            return -1;
        }
        int read = super.read(bArr, i11, a11);
        c(read);
        return read;
    }
}
