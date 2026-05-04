package fl;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class c extends FilterInputStream {

    /* renamed from: c, reason: collision with root package name */
    public static final String f51991c = "ContentLengthStream";

    /* renamed from: d, reason: collision with root package name */
    public static final int f51992d = -1;

    /* renamed from: a, reason: collision with root package name */
    public final long f51993a;

    /* renamed from: b, reason: collision with root package name */
    public int f51994b;

    public c(@NonNull InputStream inputStream, long j11) {
        super(inputStream);
        this.f51993a = j11;
    }

    @NonNull
    public static InputStream c(@NonNull InputStream inputStream, long j11) {
        return new c(inputStream, j11);
    }

    @NonNull
    public static InputStream e(@NonNull InputStream inputStream, @Nullable String str) {
        return c(inputStream, f(str));
    }

    public static int f(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e11) {
            if (!Log.isLoggable(f51991c, 3)) {
                return -1;
            }
            Log.d(f51991c, "failed to parse content length header: " + str, e11);
            return -1;
        }
    }

    public final int a(int i11) throws IOException {
        if (i11 >= 0) {
            this.f51994b += i11;
            return i11;
        }
        if (this.f51993a - this.f51994b <= 0) {
            return i11;
        }
        throw new IOException("Failed to read all expected data, expected: " + this.f51993a + ", but read: " + this.f51994b);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.f51993a - this.f51994b, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i11, int i12) throws IOException {
        return a(super.read(bArr, i11, i12));
    }
}
