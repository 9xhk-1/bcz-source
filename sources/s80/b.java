package s80;

import java.io.Closeable;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import org.apiguardian.api.API;
import p80.d;
import p80.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.10", status = API.Status.EXPERIMENTAL)
@FunctionalInterface
/* loaded from: classes9.dex */
public interface b extends Closeable {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f88135a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final String f88136b = "junit-";

        @Override // s80.b
        public Path G2(d elementContext, n extensionContext) throws IOException {
            Path createTempDirectory;
            createTempDirectory = Files.createTempDirectory(f88136b, new FileAttribute[0]);
            return createTempDirectory;
        }
    }

    Path G2(d elementContext, n extensionContext) throws Exception;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() throws IOException {
    }
}
