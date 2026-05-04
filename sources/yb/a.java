package yb;

import java.io.File;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {
    public final String a(File src, File dest, xb.c cancelable) throws Exception {
        return new b().h(src, dest, cancelable);
    }

    public final String b(File src, File dest, boolean delold, xb.c cancelable) throws Exception {
        return new b().i(src, dest, delold, cancelable);
    }

    public final String c(File src, xb.c cancelable) throws Exception {
        return new b().k(src, cancelable);
    }

    public final String d(File src, boolean delold, xb.c cancelable) throws Exception {
        return new b().l(src, delold, cancelable);
    }

    public final String e(String src, String dest, xb.c cancelable) throws Exception {
        return new b().m(src, dest, cancelable);
    }

    public final String f(String src, String dest, boolean delold, xb.c cancelable) throws Exception {
        return new b().n(src, dest, delold, cancelable);
    }

    public final String g(String src, xb.c cancelable) throws Exception {
        return new b().o(src, cancelable);
    }

    public final String h(String src, boolean delold, xb.c cancelable) throws Exception {
        return new b().p(src, delold, cancelable);
    }

    public final String i(File src, File dest, xb.c cancelable) throws Exception {
        File file = new File(new b().k(src, cancelable));
        if (file.exists() && !file.isDirectory()) {
            return new e().g(file, dest, cancelable);
        }
        throw new RuntimeException(src + " is not tared correctly.");
    }

    public final String j(File src, File dest, boolean delold, xb.c cancelable) throws Exception {
        File file = new File(new b().l(src, delold, cancelable));
        if (file.exists() && !file.isDirectory()) {
            return new e().h(file, dest, delold, cancelable);
        }
        throw new RuntimeException(src + " is not tared correctly.");
    }

    public final String k(File src, xb.c cancelable) throws Exception {
        File file = new File(new b().k(src, cancelable));
        if (file.exists() && !file.isDirectory()) {
            return new e().k(file, cancelable);
        }
        throw new RuntimeException(src + " is not tared correctly.");
    }

    public final String l(File src, boolean delold, xb.c cancelable) throws Exception {
        File file = new File(new b().l(src, delold, cancelable));
        if (file.exists() && !file.isDirectory()) {
            return new e().l(file, delold, cancelable);
        }
        throw new RuntimeException(src + " is not tared correctly.");
    }

    public final String m(String src, String dest, xb.c cancelable) throws Exception {
        if (src.toLowerCase().lastIndexOf(".tar.gz") <= 0) {
            throw new IllegalArgumentException("Incorrect .tar.gz file type.");
        }
        File file = new File(src);
        if (!file.exists() || file.isDirectory()) {
            throw new IllegalArgumentException(src + " is not a valid .tar.gz file.");
        }
        File file2 = new File(new b().k(file, cancelable));
        if (file2.exists() && !file2.isDirectory()) {
            return new e().i(file2, dest, cancelable);
        }
        throw new RuntimeException(src + " is not tared correctly.");
    }

    public final String n(String src, String dest, boolean delold, xb.c cancelable) throws Exception {
        if (src.toLowerCase().lastIndexOf(".tar.gz") <= 0) {
            throw new IllegalArgumentException("Incorrect .tar.gz file type.");
        }
        File file = new File(src);
        if (!file.exists() || file.isDirectory()) {
            throw new IllegalArgumentException(src + " is not a valid .tar.gz file.");
        }
        File file2 = new File(new b().l(file, delold, cancelable));
        if (file2.exists() && !file2.isDirectory()) {
            return new e().j(file2, dest, delold, cancelable);
        }
        throw new RuntimeException(src + " is not tared correctly.");
    }

    public final String o(String src, xb.c cancelable) throws Exception {
        if (src.toLowerCase().lastIndexOf(".tar.gz") <= 0) {
            throw new IllegalArgumentException("Incorrect .tar.gz file type.");
        }
        File file = new File(src);
        if (!file.exists() || file.isDirectory()) {
            throw new IllegalArgumentException(src + " is not a valid .tar.gz file.");
        }
        File file2 = new File(new b().k(file, cancelable));
        if (file2.exists() && !file2.isDirectory()) {
            return new e().k(file2, cancelable);
        }
        throw new RuntimeException(src + " is not tared correctly.");
    }

    public final String p(String src, boolean delold, xb.c cancelable) throws Exception {
        if (src.toLowerCase().lastIndexOf(".tar.gz") <= 0) {
            throw new IllegalArgumentException("Incorrect .tar.gz file type.");
        }
        File file = new File(src);
        if (!file.exists() || file.isDirectory()) {
            throw new IllegalArgumentException(src + " is not a valid .tar.gz file.");
        }
        File file2 = new File(new b().l(file, delold, cancelable));
        if (file2.exists() && !file2.isDirectory()) {
            return new e().l(file2, delold, cancelable);
        }
        throw new RuntimeException(src + " is not tared correctly.");
    }

    public final String q(File src, File dest, xb.c cancelable) throws Exception {
        return new f().c(src, dest, true, cancelable);
    }

    public final String r(File src, File dest, boolean delold, xb.c cancelable) throws Exception {
        return new f().c(src, dest, delold, cancelable);
    }

    public final String s(File src, xb.c cancelable) throws Exception {
        return new f().f(src, cancelable);
    }

    public final String t(File src, boolean deold, xb.c cancelable) throws Exception {
        return new f().g(src, deold, cancelable);
    }

    public final String u(String src, String dest, xb.c cancelable) throws Exception {
        return new f().i(src, dest, true, cancelable);
    }

    public final String v(String src, String dest, boolean delold, xb.c cancelable) throws Exception {
        return new f().i(src, dest, delold, cancelable);
    }

    public final String w(String src, xb.c cancelable) throws Exception {
        return new f().j(src, cancelable);
    }

    public final String x(String src, boolean deold, xb.c cancelable) throws Exception {
        return new f().k(src, deold, cancelable);
    }
}
