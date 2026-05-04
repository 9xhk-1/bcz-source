package androidx.room.concurrent;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class FileLock {

    @l
    private FileChannel lockChannel;

    @k
    private final String lockFilename;

    public FileLock(@k String filename) {
        g0.p(filename, "filename");
        this.lockFilename = filename + ".lck";
    }

    public final void lock() {
        if (this.lockChannel != null) {
            return;
        }
        try {
            File file = new File(this.lockFilename);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.lockChannel = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th2) {
            FileChannel fileChannel = this.lockChannel;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.lockChannel = null;
            throw new IllegalStateException("Unable to lock file: '" + this.lockFilename + "'.", th2);
        }
    }

    public final void unlock() {
        FileChannel fileChannel = this.lockChannel;
        if (fileChannel == null) {
            return;
        }
        try {
            fileChannel.close();
        } finally {
            this.lockChannel = null;
        }
    }
}
