package po;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@q
/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @go.e
    public static final Logger f81068a = Logger.getLogger(l.class.getName());

    public static void a(@CheckForNull Closeable closeable, boolean swallowIOException) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e11) {
            if (!swallowIOException) {
                throw e11;
            }
            f81068a.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e11);
        }
    }

    public static void b(@CheckForNull InputStream inputStream) {
        try {
            a(inputStream, true);
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }

    public static void c(@CheckForNull Reader reader) {
        try {
            a(reader, true);
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }
}
