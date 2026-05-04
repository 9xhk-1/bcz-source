package org.apache.http;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public interface HttpConnection extends Closeable {
    boolean X1();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    k getMetrics();

    boolean isOpen();

    void setSocketTimeout(int i11);

    void shutdown() throws IOException;

    int x();
}
