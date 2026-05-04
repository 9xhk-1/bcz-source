package b50;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i implements g {
    @Override // b50.g
    @a
    public void a(@m80.k j source, @m80.k j destination) {
        Path path;
        Path path2;
        StandardCopyOption standardCopyOption;
        StandardCopyOption standardCopyOption2;
        g0.p(source, "source");
        g0.p(destination, "destination");
        if (!source.a().exists()) {
            throw new FileNotFoundException("Source file does not exist: " + source.a());
        }
        try {
            path = source.a().toPath();
            path2 = destination.a().toPath();
            standardCopyOption = StandardCopyOption.ATOMIC_MOVE;
            standardCopyOption2 = StandardCopyOption.REPLACE_EXISTING;
            Files.move(path, path2, standardCopyOption, standardCopyOption2);
        } catch (Throwable th2) {
            if (!(th2 instanceof IOException)) {
                throw new IOException("Move failed", th2);
            }
            throw th2;
        }
    }
}
