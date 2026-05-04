package okio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l60.s;
import m80.k;
import m80.l;
import okio.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nNioSystemFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NioSystemFileSystem.kt\nokio/NioSystemFileSystem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n1#2:93\n*E\n"})
/* loaded from: classes8.dex */
public class e extends c {
    @l
    public final s L0(@k Path nioPath) {
        LinkOption linkOption;
        BasicFileAttributes readAttributes;
        boolean isSymbolicLink;
        boolean isRegularFile;
        boolean isDirectory;
        long size;
        FileTime creationTime;
        FileTime lastModifiedTime;
        FileTime lastAccessTime;
        g0.p(nioPath, "nioPath");
        try {
            Class a11 = com.getui.gtc.a.h.a();
            linkOption = LinkOption.NOFOLLOW_LINKS;
            readAttributes = Files.readAttributes(nioPath, (Class<BasicFileAttributes>) a11, linkOption);
            isSymbolicLink = readAttributes.isSymbolicLink();
            Path readSymbolicLink = isSymbolicLink ? Files.readSymbolicLink(nioPath) : null;
            isRegularFile = readAttributes.isRegularFile();
            isDirectory = readAttributes.isDirectory();
            f i11 = readSymbolicLink != null ? f.a.i(f.f77539b, readSymbolicLink, false, 1, null) : null;
            size = readAttributes.size();
            Long valueOf = Long.valueOf(size);
            creationTime = readAttributes.creationTime();
            Long N0 = creationTime != null ? N0(creationTime) : null;
            lastModifiedTime = readAttributes.lastModifiedTime();
            Long N02 = lastModifiedTime != null ? N0(lastModifiedTime) : null;
            lastAccessTime = readAttributes.lastAccessTime();
            return new s(isRegularFile, isDirectory, i11, valueOf, N0, N02, lastAccessTime != null ? N0(lastAccessTime) : null, null, 128, null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    public final Long N0(FileTime fileTime) {
        long millis;
        millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (valueOf.longValue() != 0) {
            return valueOf;
        }
        return null;
    }

    @Override // okio.c, okio.b
    public void S(@k f source, @k f target) {
        g0.p(source, "source");
        g0.p(target, "target");
        Files.createSymbolicLink(source.E(), target.E(), new FileAttribute[0]);
    }

    @Override // okio.c, okio.b
    public void k(@k f source, @k f target) {
        String message;
        StandardCopyOption standardCopyOption;
        StandardCopyOption standardCopyOption2;
        g0.p(source, "source");
        g0.p(target, "target");
        try {
            Path E = source.E();
            Path E2 = target.E();
            standardCopyOption = StandardCopyOption.ATOMIC_MOVE;
            standardCopyOption2 = StandardCopyOption.REPLACE_EXISTING;
            Files.move(E, E2, standardCopyOption, standardCopyOption2);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e11) {
            message = e11.getMessage();
            throw new FileNotFoundException(message);
        }
    }

    @Override // okio.c
    @k
    public String toString() {
        return "NioSystemFileSystem";
    }

    @Override // okio.c, okio.b
    @l
    public s w0(@k f path) {
        g0.p(path, "path");
        return L0(path.E());
    }
}
