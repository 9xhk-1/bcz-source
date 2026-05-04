package yb;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import kp.k;
import zr.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class f extends d {

    /* renamed from: d, reason: collision with root package name */
    public static final int f99790d = 1048576;

    /* renamed from: b, reason: collision with root package name */
    public final String f99791b = ".zip";

    /* renamed from: c, reason: collision with root package name */
    public final int f99792c = 1024;

    private void n(File dirFile) {
        File parentFile = dirFile.getParentFile();
        if (parentFile.exists()) {
            return;
        }
        n(parentFile);
        parentFile.mkdir();
    }

    public static Enumeration<?> o(File zipFile) throws ZipException, IOException {
        return new ZipFile(zipFile).entries();
    }

    public static ArrayList<String> p(File zipFile) throws ZipException, IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        Enumeration<?> o11 = o(zipFile);
        while (o11.hasMoreElements()) {
            arrayList.add(new String(r((ZipEntry) o11.nextElement()).getBytes(k.f68582c), "8859_1"));
        }
        return arrayList;
    }

    public static String q(ZipEntry entry) throws UnsupportedEncodingException {
        return new String(entry.getComment().getBytes(k.f68582c), "8859_1");
    }

    public static String r(ZipEntry entry) throws UnsupportedEncodingException {
        return new String(entry.getName().getBytes(k.f68582c), "8859_1");
    }

    public static void s(File zipFile, String folderPath) throws ZipException, IOException {
        File file = new File(folderPath);
        if (!file.exists()) {
            file.mkdirs();
        }
        ZipFile zipFile2 = new ZipFile(zipFile);
        Enumeration<? extends ZipEntry> entries = zipFile2.entries();
        while (entries.hasMoreElements()) {
            ZipEntry nextElement = entries.nextElement();
            InputStream inputStream = zipFile2.getInputStream(nextElement);
            String name = nextElement.getName();
            if (name.contains("../") || name.contains(m.f102856e)) {
                throw new IllegalArgumentException("zipName illegal " + name);
            }
            File file2 = new File(new String((folderPath + File.separator + name).getBytes("8859_1"), k.f68582c));
            if (!file2.exists()) {
                File parentFile = file2.getParentFile();
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                file2.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            byte[] bArr = new byte[1048576];
            while (true) {
                int read = inputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                }
            }
            inputStream.close();
            fileOutputStream.close();
        }
    }

    public static ArrayList<File> t(File zipFile, String folderPath, String nameContains) throws ZipException, IOException {
        ArrayList<File> arrayList = new ArrayList<>();
        File file = new File(folderPath);
        if (!file.exists()) {
            file.mkdir();
        }
        ZipFile zipFile2 = new ZipFile(zipFile);
        Enumeration<? extends ZipEntry> entries = zipFile2.entries();
        while (entries.hasMoreElements()) {
            ZipEntry nextElement = entries.nextElement();
            if (nextElement.getName().contains(nameContains)) {
                InputStream inputStream = zipFile2.getInputStream(nextElement);
                String name = nextElement.getName();
                if (name.contains("../") || name.contains(m.f102856e)) {
                    throw new IllegalArgumentException("zipName illegal " + name);
                }
                File file2 = new File(new String((folderPath + File.separator + name).getBytes("8859_1"), k.f68582c));
                if (!file2.exists()) {
                    File parentFile = file2.getParentFile();
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    file2.createNewFile();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                byte[] bArr = new byte[1048576];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                inputStream.close();
                fileOutputStream.close();
                arrayList.add(file2);
            }
        }
        return arrayList;
    }

    public static void u(File resFile, ZipOutputStream zipout, String rootpath) throws FileNotFoundException, IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(rootpath);
        sb2.append(rootpath.trim().length() == 0 ? "" : File.separator);
        sb2.append(resFile.getName());
        String str = new String(sb2.toString().getBytes("8859_1"), k.f68582c);
        if (resFile.isDirectory()) {
            for (File file : resFile.listFiles()) {
                u(file, zipout, str);
            }
            return;
        }
        byte[] bArr = new byte[1048576];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(resFile), 1048576);
        zipout.putNextEntry(new ZipEntry(str));
        while (true) {
            int read = bufferedInputStream.read(bArr);
            if (read == -1) {
                bufferedInputStream.close();
                zipout.flush();
                zipout.closeEntry();
                return;
            }
            zipout.write(bArr, 0, read);
        }
    }

    public static void v(Collection<File> resFileList, File zipFile) throws IOException {
        ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(zipFile), 1048576));
        Iterator<File> it = resFileList.iterator();
        while (it.hasNext()) {
            u(it.next(), zipOutputStream, "");
        }
        zipOutputStream.close();
    }

    public static void w(Collection<File> resFileList, File zipFile, String comment) throws IOException {
        ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(zipFile), 1048576));
        Iterator<File> it = resFileList.iterator();
        while (it.hasNext()) {
            u(it.next(), zipOutputStream, "");
        }
        zipOutputStream.setComment(comment);
        zipOutputStream.close();
    }

    public String b(File srcFile, File destFile, xb.c cancelable) throws Exception {
        return c(srcFile, destFile, true, cancelable);
    }

    public String c(File srcFile, File destFile, boolean delold, xb.c cancelable) throws Exception {
        this.f99785a = cancelable;
        ZipInputStream zipInputStream = new ZipInputStream(new CheckedInputStream(new FileInputStream(srcFile), new CRC32()));
        l(destFile, zipInputStream);
        zipInputStream.close();
        if (delold && !a()) {
            srcFile.delete();
        }
        return destFile.getAbsolutePath();
    }

    public String d(File srcFile, String destPath, xb.c cancelable) throws Exception {
        return e(srcFile, destPath, true, cancelable);
    }

    public String e(File srcFile, String destPath, boolean delold, xb.c cancelable) throws Exception {
        return c(srcFile, new File(destPath), delold, cancelable);
    }

    public String f(File srcFile, xb.c cancelable) throws Exception {
        return g(srcFile, true, cancelable);
    }

    public String g(File srcFile, boolean delold, xb.c cancelable) throws Exception {
        return e(srcFile, srcFile.getPath().replace(".zip", ""), delold, cancelable);
    }

    public String h(String srcPath, String destPath, xb.c cancelable) throws Exception {
        return i(srcPath, destPath, true, cancelable);
    }

    public String i(String srcPath, String destPath, boolean delold, xb.c cancelable) throws Exception {
        return e(new File(srcPath), destPath, delold, cancelable);
    }

    public String j(String srcPath, xb.c cancelable) throws Exception {
        return k(srcPath, true, cancelable);
    }

    public String k(String srcPath, boolean delold, xb.c cancelable) throws Exception {
        return g(new File(srcPath), delold, cancelable);
    }

    public final void l(File destFile, ZipInputStream zis) throws Exception {
        String name;
        while (true) {
            ZipEntry nextEntry = zis.getNextEntry();
            if (nextEntry == null || a()) {
                return;
            }
            name = nextEntry.getName();
            if (name.contains("../") || name.contains(m.f102856e)) {
                break;
            }
            File file = new File(destFile.getPath() + File.separator + name);
            n(file);
            if (nextEntry.isDirectory()) {
                file.mkdirs();
            } else {
                m(file, zis);
            }
            zis.closeEntry();
        }
        throw new IllegalArgumentException("zipName illegal " + name);
    }

    public final void m(File destFile, ZipInputStream zis) throws Exception {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destFile));
        byte[] bArr = new byte[1024];
        while (true) {
            int read = zis.read(bArr, 0, 1024);
            if (read == -1 || a()) {
                break;
            } else {
                bufferedOutputStream.write(bArr, 0, read);
            }
        }
        bufferedOutputStream.close();
    }
}
