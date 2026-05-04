package b50;

import java.util.Arrays;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import u30.f0;
import u30.k0;
import y40.c0;
import y40.x;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPaths.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Paths.kt\nkotlinx/io/files/PathsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,177:1\n13346#2,2:178\n*S KotlinDebug\n*F\n+ 1 Paths.kt\nkotlinx/io/files/PathsKt\n*L\n84#1:178,2\n*E\n"})
/* loaded from: classes8.dex */
public final class l {
    @m80.k
    public static final j a(@m80.k j base, @m80.k String... parts) {
        g0.p(base, "base");
        g0.p(parts, "parts");
        return b(base.toString(), (String[]) Arrays.copyOf(parts, parts.length));
    }

    @m80.k
    public static final j b(@m80.k String base, @m80.k String... parts) {
        g0.p(base, "base");
        g0.p(parts, "parts");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(base);
        for (String str : parts) {
            if (sb2.length() > 0) {
                char c11 = k.f6119a;
                if (!k0.s3(sb2, c11, false, 2, null)) {
                    sb2.append(c11);
                }
            }
            sb2.append(str);
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return k.a(sb3);
    }

    public static final boolean c(String str) {
        if (str.length() < 2) {
            return false;
        }
        return f0.J2(str, "\\\\", false, 2, null) || f0.J2(str, r60.e.f83301a, false, 2, null);
    }

    @m80.k
    public static final String d(@m80.k String path, boolean z11) {
        g0.p(path, "path");
        if (!z11) {
            return f(path);
        }
        int i11 = 1;
        if (path.length() > 1) {
            if (path.charAt(1) == ':') {
                i11 = 3;
            } else if (c(path)) {
                i11 = 2;
            }
        }
        return g(i11, path);
    }

    public static /* synthetic */ String e(String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = e.d();
        }
        return d(str, z11);
    }

    public static final String f(String str) {
        int length = str.length();
        while (length > 1 && str.charAt(length - 1) == '/') {
            length--;
        }
        String substring = str.substring(0, length);
        g0.o(substring, "substring(...)");
        return substring;
    }

    public static final String g(int i11, String str) {
        if (i11 < 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int length = str.length();
        while (length > i11) {
            char charAt = str.charAt(length - 1);
            if (charAt != '\\' && charAt != '/') {
                break;
            }
            length--;
        }
        String substring = str.substring(0, length);
        g0.o(substring, "substring(...)");
        return substring;
    }

    @w00.j(name = "sinkDeprecated")
    @n(level = DeprecationLevel.WARNING, message = "Use FileSystem.sink instead", replaceWith = @w0(expression = "SystemFileSystem.sink(this).buffered()", imports = {"kotlinx.io.files.FileSystem"}))
    @m80.k
    public static final x h(@m80.k j jVar) {
        g0.p(jVar, "<this>");
        return y40.g.a(c.a(e.f6113b, jVar, false, 2, null));
    }

    @w00.j(name = "sourceDeprecated")
    @n(level = DeprecationLevel.WARNING, message = "Use FileSystem.source instead", replaceWith = @w0(expression = "SystemFileSystem.source(this).buffered()", imports = {"kotlinx.io.files.FileSystem"}))
    @m80.k
    public static final c0 i(@m80.k j jVar) {
        g0.p(jVar, "<this>");
        return y40.g.b(e.f6113b.h(jVar));
    }
}
