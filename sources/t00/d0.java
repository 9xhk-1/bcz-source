package t00;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d0 {
    public static final boolean c(u uVar) {
        boolean isSameFile;
        for (u c11 = uVar.c(); c11 != null; c11 = c11.c()) {
            if (c11.b() == null || uVar.b() == null) {
                try {
                    isSameFile = Files.isSameFile(c11.d(), uVar.d());
                    if (isSameFile) {
                        return true;
                    }
                } catch (IOException | SecurityException unused) {
                    continue;
                }
            } else if (kotlin.jvm.internal.g0.g(c11.b(), uVar.b())) {
                return true;
            }
        }
        return false;
    }

    public static final Object d(Path path, LinkOption[] linkOptionArr) {
        BasicFileAttributes readAttributes;
        Object fileKey;
        try {
            LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length);
            readAttributes = Files.readAttributes(path, (Class<BasicFileAttributes>) com.getui.gtc.a.h.a(), (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length));
            kotlin.jvm.internal.g0.o(readAttributes, "readAttributes(...)");
            fileKey = readAttributes.fileKey();
            return fileKey;
        } catch (Throwable unused) {
            return null;
        }
    }
}
