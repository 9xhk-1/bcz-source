package xy;

import java.io.File;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nio/ktor/util/PathKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,98:1\n1#2:99\n413#3,4:100\n*S KotlinDebug\n*F\n+ 1 Path.kt\nio/ktor/util/PathKt\n*L\n42#1:100,4\n*E\n"})
/* loaded from: classes8.dex */
public final class n1 {
    public static final File a(File file, File file2) {
        File g11 = g(file2);
        if (r00.o.t0(g11, zr.m.f102856e)) {
            throw new IllegalArgumentException("Bad relative path " + file2);
        }
        if (!g11.isAbsolute()) {
            return new File(file, g11.getPath());
        }
        throw new IllegalStateException(("Bad relative path " + file2).toString());
    }

    @m80.k
    public static final File b(@m80.k File file, @m80.k String relativePath) {
        kotlin.jvm.internal.g0.p(file, "<this>");
        kotlin.jvm.internal.g0.p(relativePath, "relativePath");
        return a(file, new File(relativePath));
    }

    public static final int c(@m80.k String path) {
        kotlin.jvm.internal.g0.p(path, "path");
        int length = path.length() - 1;
        int i11 = 0;
        while (i11 <= length) {
            char charAt = path.charAt(i11);
            if (!e(charAt)) {
                if (charAt != '.') {
                    break;
                }
                if (i11 == length) {
                    return i11 + 1;
                }
                char charAt2 = path.charAt(i11 + 1);
                int i12 = 2;
                if (!e(charAt2)) {
                    if (charAt2 == '.') {
                        int i13 = i11 + 2;
                        if (i13 != path.length()) {
                            if (!e(path.charAt(i13))) {
                                break;
                            }
                            i12 = 3;
                        }
                    } else {
                        break;
                    }
                }
                i11 += i12;
            } else {
                i11++;
            }
        }
        return i11;
    }

    public static final File d(File file) {
        String path = file.getPath();
        if (path == null) {
            path = "";
        }
        int c11 = c(path);
        if (c11 == 0) {
            return file;
        }
        if (c11 >= file.getPath().length()) {
            return new File(".");
        }
        String path2 = file.getPath();
        kotlin.jvm.internal.g0.o(path2, "getPath(...)");
        String substring = path2.substring(c11);
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        return new File(substring);
    }

    public static final boolean e(char c11) {
        return c11 == '\\' || c11 == '/';
    }

    public static final boolean f(char c11) {
        return c11 == '.' || e(c11);
    }

    @m80.k
    public static final File g(@m80.k File file) {
        kotlin.jvm.internal.g0.p(file, "<this>");
        return d(h(r00.o.i0(file)));
    }

    public static final File h(File file) {
        String str;
        if (!r00.j.d(file)) {
            return file;
        }
        File file2 = file;
        while (true) {
            File parentFile = file2.getParentFile();
            if (parentFile == null) {
                break;
            }
            file2 = parentFile;
        }
        String path = file.getPath();
        kotlin.jvm.internal.g0.o(path, "getPath(...)");
        String d72 = u30.r0.d7(path, file2.getName().length());
        int length = d72.length();
        int i11 = 0;
        while (true) {
            if (i11 < length) {
                char charAt = d72.charAt(i11);
                if (charAt != '\\' && charAt != '/') {
                    str = d72.substring(i11);
                    kotlin.jvm.internal.g0.o(str, "substring(...)");
                    break;
                }
                i11++;
            } else {
                str = "";
                break;
            }
        }
        return new File(str);
    }
}
