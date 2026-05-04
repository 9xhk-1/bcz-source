package org.junit.platform.engine.support.descriptor;

import ba0.c2;
import ga0.m;
import java.io.File;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Supplier;
import org.apiguardian.api.API;
import org.junit.platform.engine.TestSource;
import y90.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public interface UriSource extends TestSource {
    static UriSource from(final URI uri) {
        Path path;
        boolean isRegularFile;
        boolean isDirectory;
        File file;
        File file2;
        c2.r(uri, "URI must not be null");
        try {
            path = Paths.get(m.a(uri));
            isRegularFile = Files.isRegularFile(path, new LinkOption[0]);
        } catch (RuntimeException e11) {
            g.c(UriSource.class).a(e11, new Supplier() { // from class: ga0.n
                @Override // java.util.function.Supplier
                public final Object get() {
                    String format;
                    format = String.format("The supplied URI [%s] is not path-based. Falling back to default UriSource implementation.", uri);
                    return format;
                }
            });
        }
        if (isRegularFile) {
            file2 = path.toFile();
            return FileSource.from(file2, FilePosition.fromQuery(uri.getQuery()).orElse(null));
        }
        isDirectory = Files.isDirectory(path, new LinkOption[0]);
        if (isDirectory) {
            file = path.toFile();
            return DirectorySource.from(file);
        }
        return new ga0.g(uri);
    }

    URI getUri();
}
