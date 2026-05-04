package org.apache.thrift.transport;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface TSeekableFile {
    void close() throws IOException;

    InputStream getInputStream() throws IOException;

    OutputStream getOutputStream() throws IOException;

    long length() throws IOException;

    void seek(long j11) throws IOException;
}
