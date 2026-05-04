package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class FileAlreadyExistsException extends FileSystemException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileAlreadyExistsException(@k File file, @l File file2, @l String str) {
        super(file, file2, str);
        g0.p(file, "file");
    }

    public /* synthetic */ FileAlreadyExistsException(File file, File file2, String str, int i11, v vVar) {
        this(file, (i11 & 2) != 0 ? null : file2, (i11 & 4) != 0 ? null : str);
    }
}
