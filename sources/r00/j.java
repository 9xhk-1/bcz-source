package r00;

import a00.h0;
import a00.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFilePathComponents.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilePathComponents.kt\nkotlin/io/FilesKt__FilePathComponentsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,149:1\n1563#2:150\n1634#2,3:151\n*S KotlinDebug\n*F\n+ 1 FilePathComponents.kt\nkotlin/io/FilesKt__FilePathComponentsKt\n*L\n134#1:150\n134#1:151,3\n*E\n"})
/* loaded from: classes8.dex */
public class j {
    @m80.k
    public static final File a(@m80.k File file) {
        g0.p(file, "<this>");
        return new File(c(file));
    }

    public static final int b(String str) {
        int I3;
        char c11 = File.separatorChar;
        int I32 = k0.I3(str, c11, 0, false, 4, null);
        if (I32 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c11 || (I3 = k0.I3(str, c11, 2, false, 4, null)) < 0) {
                return 1;
            }
            int I33 = k0.I3(str, c11, I3 + 1, false, 4, null);
            return I33 >= 0 ? I33 + 1 : str.length();
        }
        if (I32 > 0 && str.charAt(I32 - 1) == ':') {
            return I32 + 1;
        }
        if (I32 == -1 && k0.s3(str, ':', false, 2, null)) {
            return str.length();
        }
        return 0;
    }

    @m80.k
    public static final String c(@m80.k File file) {
        g0.p(file, "<this>");
        String path = file.getPath();
        g0.o(path, "getPath(...)");
        String path2 = file.getPath();
        g0.o(path2, "getPath(...)");
        String substring = path.substring(0, b(path2));
        g0.o(substring, "substring(...)");
        return substring;
    }

    public static boolean d(@m80.k File file) {
        g0.p(file, "<this>");
        String path = file.getPath();
        g0.o(path, "getPath(...)");
        return b(path) > 0;
    }

    @m80.k
    public static final File e(@m80.k File file, int i11, int i12) {
        g0.p(file, "<this>");
        return f(file).j(i11, i12);
    }

    @m80.k
    public static final g f(@m80.k File file) {
        List list;
        g0.p(file, "<this>");
        String path = file.getPath();
        g0.m(path);
        int b11 = b(path);
        String substring = path.substring(0, b11);
        g0.o(substring, "substring(...)");
        String substring2 = path.substring(b11);
        g0.o(substring2, "substring(...)");
        if (substring2.length() == 0) {
            list = h0.J();
        } else {
            List n52 = k0.n5(substring2, new char[]{File.separatorChar}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList(i0.d0(n52, 10));
            Iterator it = n52.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
            list = arrayList;
        }
        return new g(new File(substring), list);
    }
}
