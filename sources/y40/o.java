package y40;

import java.io.Flushable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface o extends AutoCloseable, Flushable {
    @Override // java.lang.AutoCloseable
    void close();

    @Override // java.io.Flushable
    void flush();

    void i6(@m80.k b bVar, long j11);
}
