package kotlin.io.path;

import java.nio.file.FileSystemException;
import java.nio.file.Path;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class IllegalFileNameException extends FileSystemException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IllegalFileNameException(@k Path file, @l Path path, @l String str) {
        super(file.toString(), path != null ? path.toString() : null, str);
        g0.p(file, "file");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IllegalFileNameException(@k Path file) {
        this(file, null, null);
        g0.p(file, "file");
    }
}
