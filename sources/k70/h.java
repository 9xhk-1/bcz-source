package k70;

import java.io.IOException;
import org.apache.http.util.CharArrayBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface h {
    int a(CharArrayBuffer charArrayBuffer) throws IOException;

    @Deprecated
    boolean b(int i11) throws IOException;

    g getMetrics();

    int read() throws IOException;

    int read(byte[] bArr) throws IOException;

    int read(byte[] bArr, int i11, int i12) throws IOException;

    String readLine() throws IOException;
}
