package z70;

import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface d {
    void f() throws IOException;

    @Deprecated
    void flush() throws IOException;

    @Deprecated
    int k(m70.c cVar) throws IOException;

    void reset();

    void write(int i11) throws IOException;

    void write(byte[] bArr, int i11, int i12) throws IOException;
}
