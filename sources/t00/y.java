package t00;

import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.Paths;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final y f89193a = new y();

    /* renamed from: b, reason: collision with root package name */
    public static final Path f89194b;

    /* renamed from: c, reason: collision with root package name */
    public static final Path f89195c;

    static {
        Path path;
        Path path2;
        path = Paths.get("", new String[0]);
        f89194b = path;
        path2 = Paths.get(zr.m.f102856e, new String[0]);
        f89195c = path2;
    }

    @m80.k
    public final Path a(@m80.k Path path, @m80.k Path base) {
        Path normalize;
        Path normalize2;
        Path relativize;
        int nameCount;
        int nameCount2;
        FileSystem fileSystem;
        String separator;
        FileSystem fileSystem2;
        FileSystem fileSystem3;
        String separator2;
        Path name;
        Path name2;
        kotlin.jvm.internal.g0.p(path, "path");
        kotlin.jvm.internal.g0.p(base, "base");
        normalize = base.normalize();
        normalize2 = path.normalize();
        relativize = normalize.relativize(normalize2);
        nameCount = normalize.getNameCount();
        nameCount2 = normalize2.getNameCount();
        int min = Math.min(nameCount, nameCount2);
        for (int i11 = 0; i11 < min; i11++) {
            name = normalize.getName(i11);
            Path path2 = f89195c;
            if (!kotlin.jvm.internal.g0.g(name, path2)) {
                break;
            }
            name2 = normalize2.getName(i11);
            if (!kotlin.jvm.internal.g0.g(name2, path2)) {
                throw new IllegalArgumentException("Unable to compute relative path");
            }
        }
        if (kotlin.jvm.internal.g0.g(normalize2, normalize) || !kotlin.jvm.internal.g0.g(normalize, f89194b)) {
            String obj = relativize.toString();
            fileSystem = relativize.getFileSystem();
            separator = fileSystem.getSeparator();
            kotlin.jvm.internal.g0.o(separator, "getSeparator(...)");
            if (u30.f0.b2(obj, separator, false, 2, null)) {
                fileSystem2 = relativize.getFileSystem();
                fileSystem3 = relativize.getFileSystem();
                separator2 = fileSystem3.getSeparator();
                normalize2 = fileSystem2.getPath(u30.r0.f7(obj, separator2.length()), new String[0]);
            } else {
                normalize2 = relativize;
            }
        }
        kotlin.jvm.internal.g0.m(normalize2);
        return normalize2;
    }
}
