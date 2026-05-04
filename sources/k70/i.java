package k70;

import java.io.IOException;
import org.apache.http.util.CharArrayBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface i {
    void b(String str) throws IOException;

    void c(CharArrayBuffer charArrayBuffer) throws IOException;

    void flush() throws IOException;

    g getMetrics();

    void write(int i11) throws IOException;

    void write(byte[] bArr) throws IOException;

    void write(byte[] bArr, int i11, int i12) throws IOException;
}
