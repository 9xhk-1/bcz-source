package l60;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface g1 extends Closeable {
    @m80.k
    i1 D();

    long L3(@m80.k k kVar, long j11) throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;
}
