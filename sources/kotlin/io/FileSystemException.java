package kotlin.io;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class FileSystemException extends IOException {

    @k
    private final File file;

    @l
    private final File other;

    @l
    private final String reason;

    public /* synthetic */ FileSystemException(File file, File file2, String str, int i11, v vVar) {
        this(file, (i11 & 2) != 0 ? null : file2, (i11 & 4) != 0 ? null : str);
    }

    @k
    public final File getFile() {
        return this.file;
    }

    @l
    public final File getOther() {
        return this.other;
    }

    @l
    public final String getReason() {
        return this.reason;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FileSystemException(@m80.k java.io.File r2, @m80.l java.io.File r3, @m80.l java.lang.String r4) {
        /*
            r1 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = r00.e.a(r2, r3, r4)
            r1.<init>(r0)
            r1.file = r2
            r1.other = r3
            r1.reason = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.FileSystemException.<init>(java.io.File, java.io.File, java.lang.String):void");
    }
}
