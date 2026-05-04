package org.junit.platform.engine.support.descriptor;

import ba0.c2;
import ba0.g4;
import da0.j;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import org.apiguardian.api.API;
import org.junit.platform.commons.JUnitException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public class DirectorySource implements FileSystemSource {
    private static final long serialVersionUID = 1;
    private final File directory;

    private DirectorySource(File directory) {
        c2.r(directory, "directory must not be null");
        try {
            this.directory = directory.getCanonicalFile();
        } catch (IOException e11) {
            throw new JUnitException("Failed to retrieve canonical path for directory: " + directory, e11);
        }
    }

    public static DirectorySource from(File directory) {
        return new DirectorySource(directory);
    }

    public boolean equals(Object o11) {
        if (this == o11) {
            return true;
        }
        if (o11 == null || getClass() != o11.getClass()) {
            return false;
        }
        return this.directory.equals(((DirectorySource) o11).directory);
    }

    @Override // org.junit.platform.engine.support.descriptor.FileSystemSource
    public final File getFile() {
        return this.directory;
    }

    @Override // org.junit.platform.engine.support.descriptor.UriSource
    public final URI getUri() {
        return getFile().toURI();
    }

    public int hashCode() {
        return this.directory.hashCode();
    }

    public String toString() {
        return new g4(this).a(j.a.f47542a, this.directory).toString();
    }
}
