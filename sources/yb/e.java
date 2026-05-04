package yb;

import java.io.File;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class e extends d {

    /* renamed from: b, reason: collision with root package name */
    public final String f99786b = "";

    /* renamed from: c, reason: collision with root package name */
    public final String f99787c = "/";

    /* renamed from: d, reason: collision with root package name */
    public final int f99788d = 1024;

    /* renamed from: e, reason: collision with root package name */
    public final String f99789e = ".tar";

    public void b(File srcFile) throws Exception {
        String name = srcFile.getName();
        d(srcFile, srcFile.getParent() + name + ".tar");
    }

    public void d(File srcFile, String destPath) throws Exception {
        c(srcFile, new File(destPath));
    }

    public void e(String srcPath) throws Exception {
        b(new File(srcPath));
    }

    public void f(String srcPath, String destPath) throws Exception {
        d(new File(srcPath), destPath);
    }

    public String g(File srcFile, File destFile, xb.c cancelable) throws Exception {
        return h(srcFile, destFile, true, cancelable);
    }

    public String h(File srcFile, File destFile, boolean delold, xb.c cancelable) throws Exception {
        return null;
    }

    public String i(File srcFile, String destPath, xb.c cancelable) throws Exception {
        return j(srcFile, destPath, true, cancelable);
    }

    public String j(File srcFile, String destPath, boolean delold, xb.c cancelable) throws Exception {
        return h(srcFile, new File(destPath), delold, cancelable);
    }

    public String k(File srcFile, xb.c cancelable) throws Exception {
        return l(srcFile, true, cancelable);
    }

    public String l(File srcFile, boolean delold, xb.c cancelable) throws Exception {
        String parent = srcFile.getParent();
        String name = srcFile.getName();
        int indexOf = name.toLowerCase(Locale.US).indexOf(".tar");
        if (indexOf >= 0) {
            name = name.substring(0, indexOf);
        }
        return j(srcFile, parent + "/" + name, delold, cancelable);
    }

    public String m(String srcPath, String destPath, boolean delold, xb.c cancelable) throws Exception {
        return j(new File(srcPath), destPath, delold, cancelable);
    }

    public void n(String srcPath, boolean delold, xb.c cancelable) throws Exception {
        l(new File(srcPath), delold, cancelable);
    }

    public final void o(File dirFile) {
        File parentFile = dirFile.getParentFile();
        if (parentFile.exists()) {
            return;
        }
        o(parentFile);
        parentFile.mkdir();
    }

    public void c(File srcFile, File destFile) throws Exception {
    }
}
