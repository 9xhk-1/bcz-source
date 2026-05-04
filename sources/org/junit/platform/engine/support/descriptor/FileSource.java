package org.junit.platform.engine.support.descriptor;

import ba0.c2;
import ba0.g4;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.Objects;
import java.util.Optional;
import org.apiguardian.api.API;
import org.junit.platform.commons.JUnitException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public class FileSource implements FileSystemSource {
    private static final long serialVersionUID = 1;
    private final File file;
    private final FilePosition filePosition;

    private FileSource(File file) {
        this(file, null);
    }

    public static FileSource from(File file) {
        return new FileSource(file);
    }

    public boolean equals(Object o11) {
        if (this == o11) {
            return true;
        }
        if (o11 != null && getClass() == o11.getClass()) {
            FileSource fileSource = (FileSource) o11;
            if (Objects.equals(this.file, fileSource.file) && Objects.equals(this.filePosition, fileSource.filePosition)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.junit.platform.engine.support.descriptor.FileSystemSource
    public final File getFile() {
        return this.file;
    }

    public final Optional<FilePosition> getPosition() {
        return Optional.ofNullable(this.filePosition);
    }

    @Override // org.junit.platform.engine.support.descriptor.UriSource
    public final URI getUri() {
        return getFile().toURI();
    }

    public int hashCode() {
        return Objects.hash(this.file, this.filePosition);
    }

    public String toString() {
        return new g4(this).a("file", this.file).a("filePosition", this.filePosition).toString();
    }

    private FileSource(File file, FilePosition filePosition) {
        c2.r(file, "file must not be null");
        try {
            this.file = file.getCanonicalFile();
            this.filePosition = filePosition;
        } catch (IOException e11) {
            throw new JUnitException("Failed to retrieve canonical path for file: " + file, e11);
        }
    }

    public static FileSource from(File file, FilePosition filePosition) {
        return new FileSource(file, filePosition);
    }
}
