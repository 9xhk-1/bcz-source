package xy;

import java.io.File;
import java.nio.file.Path;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nNioPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NioPath.kt\nio/ktor/util/NioPathKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n1#2:50\n346#3,8:51\n*S KotlinDebug\n*F\n+ 1 NioPath.kt\nio/ktor/util/NioPathKt\n*L\n31#1:51,8\n*E\n"})
/* loaded from: classes8.dex */
public final class k1 {
    @m80.k
    public static final File a(@m80.k File file, @m80.k Path relativePath) {
        boolean startsWith;
        boolean isAbsolute;
        kotlin.jvm.internal.g0.p(file, "<this>");
        kotlin.jvm.internal.g0.p(relativePath, "relativePath");
        Path d11 = d(relativePath);
        startsWith = d11.startsWith(zr.m.f102856e);
        if (startsWith) {
            j1.a();
            throw i1.a(relativePath.toString(), "Relative path " + relativePath + " beginning with .. is invalid");
        }
        isAbsolute = d11.isAbsolute();
        if (!isAbsolute) {
            return new File(file, d11.toString());
        }
        throw new IllegalStateException(("Bad relative path " + relativePath).toString());
    }

    @m80.k
    public static final Path b(@m80.k Path path, @m80.k Path relativePath) {
        boolean startsWith;
        boolean isAbsolute;
        Path resolve;
        kotlin.jvm.internal.g0.p(path, "<this>");
        kotlin.jvm.internal.g0.p(relativePath, "relativePath");
        Path d11 = d(relativePath);
        startsWith = d11.startsWith(zr.m.f102856e);
        if (startsWith) {
            j1.a();
            throw i1.a(relativePath.toString(), "Relative path " + relativePath + " beginning with .. is invalid");
        }
        isAbsolute = d11.isAbsolute();
        if (!isAbsolute) {
            resolve = path.resolve(d11);
            kotlin.jvm.internal.g0.o(resolve, "resolve(...)");
            return resolve;
        }
        throw new IllegalStateException(("Bad relative path " + relativePath).toString());
    }

    public static final Path c(Path path) {
        int nameCount;
        Path subpath;
        Iterator it = path.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            Object next = it.next();
            if (i11 < 0) {
                a00.h0.b0();
            }
            if (!kotlin.jvm.internal.g0.g(io.ktor.server.engine.u0.a(next).toString(), zr.m.f102856e)) {
                break;
            }
            i11++;
        }
        if (i11 <= 0) {
            return path;
        }
        nameCount = path.getNameCount();
        subpath = path.subpath(i11, nameCount);
        kotlin.jvm.internal.g0.o(subpath, "subpath(...)");
        return subpath;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000b, code lost:
    
        r0 = r0.relativize(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        r0 = r0.normalize();
     */
    @m80.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.nio.file.Path d(@m80.k java.nio.file.Path r1) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.nio.file.Path r0 = xy.a1.a(r1)
            if (r0 == 0) goto L1f
            java.nio.file.Path r0 = xy.b1.a(r0, r1)
            if (r0 == 0) goto L1f
            java.nio.file.Path r0 = xy.c1.a(r0)
            if (r0 == 0) goto L1f
            java.nio.file.Path r0 = c(r0)
            if (r0 != 0) goto L1e
            goto L1f
        L1e:
            return r0
        L1f:
            java.nio.file.Path r1 = xy.c1.a(r1)
            java.lang.String r0 = "normalize(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            java.nio.file.Path r1 = c(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xy.k1.d(java.nio.file.Path):java.nio.file.Path");
    }
}
