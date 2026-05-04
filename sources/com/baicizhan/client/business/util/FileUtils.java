package com.baicizhan.client.business.util;

import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Environment;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class FileUtils {
    private static final long FILE_COPY_BUFFER_SIZE = 31457280;
    public static final BigInteger ONE_EB_BI;
    public static final BigInteger ONE_GB_BI;
    public static final long ONE_KB = 1024;
    public static final BigInteger ONE_KB_BI;
    public static final long ONE_MB = 1048576;
    public static final BigInteger ONE_MB_BI;
    public static final BigInteger ONE_PB_BI;
    public static final BigInteger ONE_TB_BI;
    private static final Pattern SAFE_FILENAME_PATTERN;
    public static final String TAG = "FileUtils";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DirCopyProgress {
        public int current;
        public int total;

        public String toString() {
            return new JsonSerializer(new bp.a<DirCopyProgress>() { // from class: com.baicizhan.client.business.util.FileUtils.DirCopyProgress.1
            }.getType()).writeToJson(this);
        }
    }

    static {
        BigInteger valueOf = BigInteger.valueOf(1024L);
        ONE_KB_BI = valueOf;
        BigInteger multiply = valueOf.multiply(valueOf);
        ONE_MB_BI = multiply;
        BigInteger multiply2 = valueOf.multiply(multiply);
        ONE_GB_BI = multiply2;
        BigInteger multiply3 = valueOf.multiply(multiply2);
        ONE_TB_BI = multiply3;
        BigInteger multiply4 = valueOf.multiply(multiply3);
        ONE_PB_BI = multiply4;
        ONE_EB_BI = valueOf.multiply(multiply4);
        SAFE_FILENAME_PATTERN = Pattern.compile("[\\w%+,./=_-]+");
    }

    public static void asyncTryDeleteFile(File file) {
        new AsyncTask<File, Void, Boolean>() { // from class: com.baicizhan.client.business.util.FileUtils.2
            @Override // android.os.AsyncTask
            public Boolean doInBackground(File... params) {
                boolean z11 = false;
                File file2 = (params == null || params.length <= 0) ? null : params[0];
                if (file2 != null && file2.delete()) {
                    z11 = true;
                }
                return Boolean.valueOf(z11);
            }
        }.execute(file);
    }

    public static String byteCountToDisplaySize(BigInteger size) {
        BigDecimal bigDecimal = new BigDecimal(size);
        BigInteger bigInteger = ONE_EB_BI;
        BigDecimal divide = bigDecimal.divide(new BigDecimal(bigInteger), 4);
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        if (divide.compareTo(bigDecimal2) > 0) {
            return String.valueOf(bigDecimal.divide(new BigDecimal(bigInteger), 1, 4)) + " EB";
        }
        BigInteger bigInteger2 = ONE_PB_BI;
        if (bigDecimal.divide(new BigDecimal(bigInteger2), 4).compareTo(bigDecimal2) > 0) {
            return String.valueOf(bigDecimal.divide(new BigDecimal(bigInteger2), 1, 4)) + " PB";
        }
        BigInteger bigInteger3 = ONE_TB_BI;
        if (bigDecimal.divide(new BigDecimal(bigInteger3), 4).compareTo(bigDecimal2) > 0) {
            return String.valueOf(bigDecimal.divide(new BigDecimal(bigInteger3), 1, 4)) + " TB";
        }
        BigInteger bigInteger4 = ONE_GB_BI;
        if (bigDecimal.divide(new BigDecimal(bigInteger4), 4).compareTo(bigDecimal2) > 0) {
            return String.valueOf(bigDecimal.divide(new BigDecimal(bigInteger4), 1, 4)) + " GB";
        }
        BigInteger bigInteger5 = ONE_MB_BI;
        if (bigDecimal.divide(new BigDecimal(bigInteger5), 4).compareTo(bigDecimal2) > 0) {
            return String.valueOf(bigDecimal.divide(new BigDecimal(bigInteger5), 1, 4)) + " MB";
        }
        BigInteger bigInteger6 = ONE_KB_BI;
        if (bigDecimal.divide(new BigDecimal(bigInteger6), 4).compareTo(bigDecimal2) > 0) {
            return String.valueOf(bigDecimal.divide(new BigDecimal(bigInteger6), 1, 4)) + " KB";
        }
        return String.valueOf(size) + " bytes";
    }

    public static boolean checkDir(String dir) {
        if (!checkSD()) {
            return false;
        }
        File file = new File(dir);
        if (file.exists() || file.mkdirs()) {
            return true;
        }
        if (qb.d.b()) {
            qb.c.d("", "error fulldirObj.mkdirs:" + dir, new Object[0]);
        }
        return false;
    }

    private static void checkDirectory(File directory) {
        if (!directory.exists()) {
            qb.c.i(TAG, "directory %s does not exist", directory);
        } else {
            if (directory.isDirectory()) {
                return;
            }
            throw new IllegalArgumentException(directory + " is not a directory");
        }
    }

    public static boolean checkSD() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    public static long checksumCrc32(File file) throws FileNotFoundException, IOException {
        CRC32 crc32 = new CRC32();
        CheckedInputStream checkedInputStream = null;
        try {
            CheckedInputStream checkedInputStream2 = new CheckedInputStream(new FileInputStream(file), crc32);
            try {
                while (checkedInputStream2.read(new byte[128]) >= 0) {
                }
                long value = crc32.getValue();
                try {
                    checkedInputStream2.close();
                } catch (IOException unused) {
                }
                return value;
            } catch (Throwable th2) {
                th = th2;
                checkedInputStream = checkedInputStream2;
                if (checkedInputStream != null) {
                    try {
                        checkedInputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void closeQuietly(Closeable stream) {
        if (stream != null) {
            try {
                stream.close();
            } catch (IOException e11) {
                e11.printStackTrace();
            }
        }
    }

    public static boolean contains(File dir, File file) {
        if (file == null) {
            return false;
        }
        String absolutePath = dir.getAbsolutePath();
        String absolutePath2 = file.getAbsolutePath();
        if (absolutePath.equals(absolutePath2)) {
            return true;
        }
        if (!absolutePath.endsWith("/")) {
            absolutePath = absolutePath + "/";
        }
        return absolutePath2.startsWith(absolutePath);
    }

    public static void copy(InputStream input, OutputStream output) throws IOException {
        byte[] bArr = new byte[4096];
        while (true) {
            int read = input.read(bArr);
            if (read < 0) {
                output.flush();
                output.close();
                return;
            }
            output.write(bArr, 0, read);
        }
    }

    public static boolean copyAndUnzipFromRaw(Resources res, int zipId, String localDir, String fileName) {
        if (!checkDir(localDir)) {
            return false;
        }
        File file = new File(localDir, fileName);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(res.openRawResource(zipId));
        try {
            if (copyToFile(bufferedInputStream, file)) {
                new yb.f().g(file, true, null);
                return true;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            try {
                bufferedInputStream.close();
            } catch (IOException e12) {
                e12.printStackTrace();
            }
        }
        return false;
    }

    public static void copyDirectory(File srcDir, File destDir) throws IOException {
        copyDirectory(srcDir, destDir, true);
    }

    public static void copyDirectoryToDirectory(File srcDir, File destDir) throws IOException {
        if (srcDir == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (srcDir.exists() && !srcDir.isDirectory()) {
            throw new IllegalArgumentException("Source '" + destDir + "' is not a directory");
        }
        if (destDir == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (!destDir.exists() || destDir.isDirectory()) {
            copyDirectory(srcDir, new File(destDir, srcDir.getName()), true);
            return;
        }
        throw new IllegalArgumentException("Destination '" + destDir + "' is not a directory");
    }

    public static boolean copyFile(File srcFile, File destFile) {
        try {
            FileInputStream fileInputStream = new FileInputStream(srcFile);
            try {
                return copyToFile(fileInputStream, destFile);
            } finally {
                fileInputStream.close();
            }
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean copyFromRaw(Resources res, int id2, String localDir, String fileName) {
        if (!checkDir(localDir)) {
            return false;
        }
        File file = new File(localDir, fileName);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(res.openRawResource(id2));
        try {
            return copyToFile(bufferedInputStream, file);
        } catch (Exception e11) {
            e11.printStackTrace();
            try {
                bufferedInputStream.close();
            } catch (IOException e12) {
                e12.printStackTrace();
            }
            return false;
        }
    }

    /* JADX WARN: Finally extract failed */
    public static boolean copyToFile(InputStream inputStream, File destFile) {
        try {
            if (destFile.exists()) {
                destFile.delete();
            }
            File parentFile = destFile.getParentFile();
            if (!parentFile.exists() && !parentFile.mkdirs()) {
                qb.c.b(TAG, "cant mkdir " + parentFile, new Object[0]);
                return false;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(destFile);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read < 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                fileOutputStream.flush();
                try {
                    fileOutputStream.getFD().sync();
                } catch (IOException unused) {
                }
                fileOutputStream.close();
                return true;
            } catch (Throwable th2) {
                fileOutputStream.flush();
                try {
                    fileOutputStream.getFD().sync();
                } catch (IOException unused2) {
                }
                fileOutputStream.close();
                throw th2;
            }
        } catch (IOException e11) {
            qb.c.c(TAG, "", e11);
            return false;
        }
    }

    public static boolean deleteContents(File dir) {
        File[] listFiles = dir.listFiles();
        boolean z11 = true;
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isDirectory()) {
                    z11 &= deleteContents(file);
                }
                if (!file.delete()) {
                    qb.c.q(TAG, "Failed to delete " + file + " exists" + file.exists(), new Object[0]);
                    if (file.exists()) {
                        z11 = false;
                    }
                }
            }
        }
        return z11;
    }

    public static boolean deleteOlderFiles(File dir, int minCount, long minAge) {
        if (minCount < 0 || minAge < 0) {
            throw new IllegalArgumentException("Constraints must be positive or 0");
        }
        File[] listFiles = dir.listFiles();
        if (listFiles == null) {
            return false;
        }
        Arrays.sort(listFiles, new Comparator<File>() { // from class: com.baicizhan.client.business.util.FileUtils.1
            @Override // java.util.Comparator
            public int compare(File lhs, File rhs) {
                return (int) (rhs.lastModified() - lhs.lastModified());
            }
        });
        boolean z11 = false;
        while (minCount < listFiles.length) {
            File file = listFiles[minCount];
            if (System.currentTimeMillis() - file.lastModified() > minAge && file.delete()) {
                qb.c.b(TAG, "Deleted old file " + file, new Object[0]);
                z11 = true;
            }
            minCount++;
        }
        return z11;
    }

    private static void doCopyDirectory(File srcDir, File destDir, FileFilter filter, boolean preserveFileDate, List<String> exclusionList) throws IOException {
        File[] listFiles = filter == null ? srcDir.listFiles() : srcDir.listFiles(filter);
        if (listFiles == null) {
            throw new IOException("Failed to list contents of " + srcDir);
        }
        if (destDir.exists()) {
            if (!destDir.isDirectory()) {
                throw new IOException("Destination '" + destDir + "' exists but is not a directory");
            }
        } else if (!destDir.mkdirs() && !destDir.isDirectory()) {
            throw new IOException("Destination '" + destDir + "' directory cannot be created");
        }
        if (!destDir.canWrite()) {
            throw new IOException("Destination '" + destDir + "' cannot be written to");
        }
        for (File file : listFiles) {
            File file2 = new File(destDir, file.getName());
            if (exclusionList == null || !exclusionList.contains(file.getCanonicalPath())) {
                if (file.isDirectory()) {
                    doCopyDirectory(file, file2, filter, preserveFileDate, exclusionList);
                } else {
                    doCopyFile(file, file2, preserveFileDate);
                }
            }
        }
        if (preserveFileDate) {
            destDir.setLastModified(srcDir.lastModified());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void doCopyFile(File file, File file2, boolean z11) throws IOException {
        Throwable th2;
        FileInputStream fileInputStream;
        FileChannel fileChannel;
        FileChannel fileChannel2;
        FileChannel fileChannel3;
        FileChannel channel;
        long j11;
        if (file2.exists() && file2.isDirectory()) {
            throw new IOException("Destination '" + file2 + "' exists but is a directory");
        }
        FileChannel fileChannel4 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    fileChannel2 = fileInputStream.getChannel();
                    try {
                        channel = fileOutputStream.getChannel();
                    } catch (Throwable th3) {
                        th2 = th3;
                        fileChannel3 = fileOutputStream;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    fileChannel2 = null;
                    fileChannel3 = fileOutputStream;
                }
                try {
                    long size = fileChannel2.size();
                    for (long j12 = 0; j12 < size; j12 += channel.transferFrom(fileChannel2, j12, j11)) {
                        j11 = size - j12;
                        if (j11 > FILE_COPY_BUFFER_SIZE) {
                            j11 = 31457280;
                        }
                    }
                    closeQuietly(channel);
                    closeQuietly(fileOutputStream);
                    closeQuietly(fileChannel2);
                    closeQuietly(fileInputStream);
                    if (file.length() != file2.length()) {
                        throw new IOException("Failed to copy full contents from '" + file + "' to '" + file2 + "'");
                    }
                    if (z11) {
                        file2.setLastModified(file.lastModified());
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    fileChannel4 = channel;
                    fileChannel3 = fileOutputStream;
                    closeQuietly(fileChannel4);
                    closeQuietly(fileChannel3);
                    closeQuietly(fileChannel2);
                    closeQuietly(fileInputStream);
                    throw th2;
                }
            } catch (Throwable th6) {
                th2 = th6;
                fileChannel = null;
                fileChannel2 = fileChannel;
                fileChannel3 = fileChannel;
                closeQuietly(fileChannel4);
                closeQuietly(fileChannel3);
                closeQuietly(fileChannel2);
                closeQuietly(fileInputStream);
                throw th2;
            }
        } catch (Throwable th7) {
            th2 = th7;
            fileInputStream = null;
            fileChannel = null;
        }
    }

    public static byte[] getBytes(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static int getDirectoryFileCount(File dir, FileFilter filter, List<String> exclusionList) throws IOException {
        int i11 = 0;
        for (File file : filter == null ? dir.listFiles() : dir.listFiles(filter)) {
            if (exclusionList == null || !exclusionList.contains(dir.getCanonicalPath())) {
                i11 += file.isDirectory() ? getDirectoryFileCount(file, filter, exclusionList) : 1;
            }
        }
        return i11;
    }

    public static String getFileName(String path) {
        return new File(path).getName();
    }

    public static boolean isFilenameSafe(File file) {
        return SAFE_FILENAME_PATTERN.matcher(file.getPath()).matches();
    }

    public static boolean isSymlink(File file) throws IOException {
        if (file == null) {
            throw new NullPointerException("File must not be null");
        }
        if (file.getParent() != null) {
            file = new File(file.getParentFile().getCanonicalFile(), file.getName());
        }
        return !file.getCanonicalFile().equals(file.getAbsoluteFile());
    }

    public static boolean isValidExtFilename(String name) {
        if (TextUtils.isEmpty(name) || ".".equals(name) || zr.m.f102856e.equals(name)) {
            return false;
        }
        for (int i11 = 0; i11 < name.length(); i11++) {
            char charAt = name.charAt(i11);
            if (charAt == 0 || charAt == '/') {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0040, code lost:
    
        if (java.lang.Math.abs(r3.length() - r0.available()) > 1000000) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean needUnzipRawDatabaseToSDCard(android.content.res.Resources r3, int r4, java.lang.String r5, java.lang.String r6) throws java.io.IOException {
        /*
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            java.io.InputStream r3 = r3.openRawResource(r4)
            r0.<init>(r3)
            java.lang.String r3 = "whiz"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            r4.<init>()     // Catch: java.lang.Throwable -> L43
            java.lang.String r1 = "check if need to unzip: "
            r4.append(r1)     // Catch: java.lang.Throwable -> L43
            r4.append(r6)     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L43
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L43
            qb.c.b(r3, r4, r2)     // Catch: java.lang.Throwable -> L43
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L43
            r3.<init>(r5, r6)     // Catch: java.lang.Throwable -> L43
            boolean r4 = r3.exists()     // Catch: java.lang.Throwable -> L43
            if (r4 == 0) goto L45
            long r3 = r3.length()     // Catch: java.lang.Throwable -> L43
            int r5 = r0.available()     // Catch: java.lang.Throwable -> L43
            long r5 = (long) r5     // Catch: java.lang.Throwable -> L43
            long r3 = r3 - r5
            long r3 = java.lang.Math.abs(r3)     // Catch: java.lang.Throwable -> L43
            r5 = 1000000(0xf4240, double:4.940656E-318)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L46
            goto L45
        L43:
            r3 = move-exception
            goto L4a
        L45:
            r1 = 1
        L46:
            r0.close()
            return r1
        L4a:
            r0.close()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.client.business.util.FileUtils.needUnzipRawDatabaseToSDCard(android.content.res.Resources, int, java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:
    
        if (r3.length() != r0.available()) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean needUnzipRawFileToSDCard(android.content.res.Resources r3, int r4, java.lang.String r5, java.lang.String r6) throws java.io.IOException {
        /*
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            java.io.InputStream r3 = r3.openRawResource(r4)
            r0.<init>(r3)
            java.lang.String r3 = "whiz"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3b
            r4.<init>()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r1 = "check if need to unzip: "
            r4.append(r1)     // Catch: java.lang.Throwable -> L3b
            r4.append(r6)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L3b
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L3b
            qb.c.b(r3, r4, r2)     // Catch: java.lang.Throwable -> L3b
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L3b
            r3.<init>(r5, r6)     // Catch: java.lang.Throwable -> L3b
            boolean r4 = r3.exists()     // Catch: java.lang.Throwable -> L3b
            if (r4 == 0) goto L3d
            long r3 = r3.length()     // Catch: java.lang.Throwable -> L3b
            int r5 = r0.available()     // Catch: java.lang.Throwable -> L3b
            long r5 = (long) r5
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L3e
            goto L3d
        L3b:
            r3 = move-exception
            goto L42
        L3d:
            r1 = 1
        L3e:
            r0.close()
            return r1
        L42:
            r0.close()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.client.business.util.FileUtils.needUnzipRawFileToSDCard(android.content.res.Resources, int, java.lang.String, java.lang.String):boolean");
    }

    public static String readAll(InputStream input) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copy(input, byteArrayOutputStream);
        String byteArrayOutputStream2 = byteArrayOutputStream.toString();
        byteArrayOutputStream.close();
        return byteArrayOutputStream2;
    }

    public static String readTextFile(File file, int max, String ellipsis) throws IOException {
        int read;
        boolean z11;
        int read2;
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        try {
            long length = file.length();
            String str = "";
            if (max > 0 || (length > 0 && max == 0)) {
                if (length > 0 && (max == 0 || length < max)) {
                    max = (int) length;
                }
                byte[] bArr = new byte[max + 1];
                int read3 = bufferedInputStream.read(bArr);
                if (read3 > 0) {
                    if (read3 <= max) {
                        str = new String(bArr, 0, read3);
                    } else if (ellipsis == null) {
                        str = new String(bArr, 0, max);
                    } else {
                        str = new String(bArr, 0, max) + ellipsis;
                    }
                }
            } else if (max < 0) {
                byte[] bArr2 = null;
                byte[] bArr3 = null;
                boolean z12 = false;
                while (true) {
                    z11 = true;
                    if (bArr2 != null) {
                        z12 = true;
                    }
                    if (bArr2 == null) {
                        bArr2 = new byte[-max];
                    }
                    read2 = bufferedInputStream.read(bArr2);
                    if (read2 != bArr2.length) {
                        break;
                    }
                    byte[] bArr4 = bArr3;
                    bArr3 = bArr2;
                    bArr2 = bArr4;
                }
                if (bArr3 != null || read2 > 0) {
                    if (bArr3 == null) {
                        str = new String(bArr2, 0, read2);
                    } else {
                        if (read2 > 0) {
                            System.arraycopy(bArr3, read2, bArr3, 0, bArr3.length - read2);
                            System.arraycopy(bArr2, 0, bArr3, bArr3.length - read2, read2);
                        } else {
                            z11 = z12;
                        }
                        if (ellipsis != null && z11) {
                            str = ellipsis + new String(bArr3);
                        }
                        str = new String(bArr3);
                    }
                }
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr5 = new byte[1024];
                do {
                    read = bufferedInputStream.read(bArr5);
                    if (read > 0) {
                        byteArrayOutputStream.write(bArr5, 0, read);
                    }
                } while (read == 1024);
                str = byteArrayOutputStream.toString();
            }
            return str;
        } finally {
            bufferedInputStream.close();
            fileInputStream.close();
        }
    }

    public static String readTextStringFromRaw(Resources res, int id2) throws IOException {
        return readAll(new BufferedInputStream(res.openRawResource(id2)));
    }

    public static String replaceExtension(String fileName, String extension) {
        if (fileName == null) {
            return fileName;
        }
        return stripExtension(fileName) + extension;
    }

    public static String rewriteAfterRename(File beforeDir, File afterDir, String path) {
        File rewriteAfterRename;
        if (path == null || (rewriteAfterRename = rewriteAfterRename(beforeDir, afterDir, new File(path))) == null) {
            return null;
        }
        return rewriteAfterRename.getAbsolutePath();
    }

    public static long sizeOf(File file, boolean ignore) {
        if (file.exists()) {
            return file.isDirectory() ? sizeOfDirectory(file, ignore) : file.length();
        }
        qb.c.i(TAG, "%s", file + " does not exist");
        return 0L;
    }

    public static long sizeOfDirectory(File directory, boolean ignore) {
        checkDirectory(directory);
        File[] listFiles = directory.listFiles();
        if (listFiles == null) {
            return 0L;
        }
        long j11 = 0;
        for (File file : listFiles) {
            if (ignore) {
                try {
                } catch (IOException e11) {
                    e11.printStackTrace();
                }
                if (isSymlink(file)) {
                    continue;
                }
            }
            j11 += sizeOf(file, ignore);
            if (j11 < 0) {
                break;
            }
        }
        return j11;
    }

    public static void stringToFile(String filename, String string) throws IOException {
        FileWriter fileWriter = new FileWriter(filename);
        try {
            fileWriter.write(string);
        } finally {
            fileWriter.close();
        }
    }

    public static String stripExtension(String fileName) {
        int lastIndexOf;
        return (fileName == null || fileName.length() <= 0 || (lastIndexOf = fileName.lastIndexOf(46)) <= -1) ? fileName : fileName.substring(0, lastIndexOf);
    }

    public static boolean sync(FileOutputStream stream) {
        if (stream == null) {
            return true;
        }
        try {
            stream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static void unzipRawFileToSDCard(Resources res, int rawId, String dir, String fileName) throws IOException {
        File file;
        BufferedInputStream bufferedInputStream;
        qb.c.b("whiz", "unzipRawFileToSDCard name" + fileName, new Object[0]);
        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(res.openRawResource(rawId));
        try {
            file = new File(dir, fileName);
            bufferedInputStream = new BufferedInputStream(res.openRawResource(rawId));
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (file.exists() && file.length() > 0) {
                qb.c.b("whiz", "unneed to unzip: " + fileName, new Object[0]);
                bufferedInputStream.close();
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            boolean copyToFile = copyToFile(bufferedInputStream, file);
            qb.c.b(TAG, "exists %b %d unzip %s elapsed %d", Boolean.valueOf(file.exists()), Long.valueOf(file.length()), fileName, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            if (copyToFile) {
                bufferedInputStream.close();
                return;
            }
            file.delete();
            throw new IOException("unzip failed " + fileName);
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream2 = bufferedInputStream;
            bufferedInputStream2.close();
            throw th;
        }
    }

    public static void copyDirectory(File srcDir, File destDir, boolean preserveFileDate) throws IOException {
        copyDirectory(srcDir, destDir, (FileFilter) null, preserveFileDate);
    }

    public static void copyDirectory(File srcDir, File destDir, FileFilter filter) throws IOException {
        copyDirectory(srcDir, destDir, filter, true);
    }

    public static String[] rewriteAfterRename(File beforeDir, File afterDir, String[] paths) {
        if (paths == null) {
            return null;
        }
        String[] strArr = new String[paths.length];
        for (int i11 = 0; i11 < paths.length; i11++) {
            strArr[i11] = rewriteAfterRename(beforeDir, afterDir, paths[i11]);
        }
        return strArr;
    }

    public static void copyDirectory(File srcDir, File destDir, FileFilter filter, boolean preserveFileDate) throws IOException {
        ArrayList arrayList;
        if (srcDir == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (destDir != null) {
            if (srcDir.exists()) {
                if (srcDir.isDirectory()) {
                    if (!srcDir.getCanonicalPath().equals(destDir.getCanonicalPath())) {
                        if (destDir.getCanonicalPath().startsWith(srcDir.getCanonicalPath())) {
                            File[] listFiles = filter == null ? srcDir.listFiles() : srcDir.listFiles(filter);
                            if (listFiles != null && listFiles.length > 0) {
                                arrayList = new ArrayList(listFiles.length);
                                for (File file : listFiles) {
                                    arrayList.add(new File(destDir, file.getName()).getCanonicalPath());
                                }
                                doCopyDirectory(srcDir, destDir, filter, preserveFileDate, arrayList);
                                return;
                            }
                        }
                        arrayList = null;
                        doCopyDirectory(srcDir, destDir, filter, preserveFileDate, arrayList);
                        return;
                    }
                    throw new IOException("Source '" + srcDir + "' and destination '" + destDir + "' are the same");
                }
                throw new IOException("Source '" + srcDir + "' exists but is not a directory");
            }
            throw new FileNotFoundException("Source '" + srcDir + "' does not exist");
        }
        throw new NullPointerException("Destination must not be null");
    }

    public static File rewriteAfterRename(File beforeDir, File afterDir, File file) {
        if (file != null && contains(beforeDir, file)) {
            return new File(afterDir, file.getAbsolutePath().substring(beforeDir.getAbsolutePath().length()));
        }
        return null;
    }

    public static long sizeOf(File file) {
        return sizeOf(file, true);
    }

    public static String byteCountToDisplaySize(long size) {
        return byteCountToDisplaySize(BigInteger.valueOf(size));
    }

    private static void doCopyDirectory(File srcDir, File destDir, FileFilter filter, List<String> exclusionList, dc0.c<DirCopyProgress> publish, DirCopyProgress progress) throws IOException {
        FileFilter fileFilter;
        List<String> list;
        dc0.c<DirCopyProgress> cVar;
        DirCopyProgress dirCopyProgress;
        File[] listFiles = filter == null ? srcDir.listFiles() : srcDir.listFiles(filter);
        if (listFiles != null) {
            if (destDir.exists()) {
                if (!destDir.isDirectory()) {
                    throw new IOException("Destination '" + destDir + "' exists but is not a directory");
                }
            } else if (!destDir.mkdirs() && !destDir.isDirectory()) {
                throw new IOException("Destination '" + destDir + "' directory cannot be created");
            }
            if (destDir.canWrite()) {
                int length = listFiles.length;
                int i11 = 0;
                while (i11 < length) {
                    File file = listFiles[i11];
                    File file2 = new File(destDir, file.getName());
                    if (exclusionList != null && exclusionList.contains(file.getCanonicalPath())) {
                        fileFilter = filter;
                        list = exclusionList;
                        cVar = publish;
                        dirCopyProgress = progress;
                    } else if (file.isDirectory()) {
                        fileFilter = filter;
                        list = exclusionList;
                        cVar = publish;
                        dirCopyProgress = progress;
                        doCopyDirectory(file, file2, fileFilter, list, cVar, dirCopyProgress);
                    } else {
                        fileFilter = filter;
                        list = exclusionList;
                        cVar = publish;
                        dirCopyProgress = progress;
                        doCopyFile(file, file2, true);
                        dirCopyProgress.current++;
                        if (cVar != null) {
                            cVar.onNext(dirCopyProgress);
                        }
                    }
                    i11++;
                    filter = fileFilter;
                    exclusionList = list;
                    publish = cVar;
                    progress = dirCopyProgress;
                }
                destDir.setLastModified(srcDir.lastModified());
                return;
            }
            throw new IOException("Destination '" + destDir + "' cannot be written to");
        }
        throw new IOException("Failed to list contents of " + srcDir);
    }

    public static void copyDirectory(File srcDir, File destDir, FileFilter filter, dc0.c<DirCopyProgress> publish) throws IOException {
        ArrayList arrayList;
        if (srcDir == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (destDir != null) {
            if (srcDir.exists()) {
                if (srcDir.isDirectory()) {
                    if (!srcDir.getCanonicalPath().equals(destDir.getCanonicalPath())) {
                        if (destDir.getCanonicalPath().startsWith(srcDir.getCanonicalPath())) {
                            File[] listFiles = filter == null ? srcDir.listFiles() : srcDir.listFiles(filter);
                            if (listFiles != null && listFiles.length > 0) {
                                arrayList = new ArrayList(listFiles.length);
                                for (File file : listFiles) {
                                    arrayList.add(new File(destDir, file.getName()).getCanonicalPath());
                                }
                                ArrayList arrayList2 = arrayList;
                                qb.c.b(TAG, "app root dir copy, exclusionList: " + arrayList2, new Object[0]);
                                DirCopyProgress dirCopyProgress = new DirCopyProgress();
                                dirCopyProgress.total = getDirectoryFileCount(srcDir, filter, arrayList2);
                                dirCopyProgress.current = 0;
                                doCopyDirectory(srcDir, destDir, filter, arrayList2, publish, dirCopyProgress);
                                return;
                            }
                        }
                        arrayList = null;
                        ArrayList arrayList22 = arrayList;
                        qb.c.b(TAG, "app root dir copy, exclusionList: " + arrayList22, new Object[0]);
                        DirCopyProgress dirCopyProgress2 = new DirCopyProgress();
                        dirCopyProgress2.total = getDirectoryFileCount(srcDir, filter, arrayList22);
                        dirCopyProgress2.current = 0;
                        doCopyDirectory(srcDir, destDir, filter, arrayList22, publish, dirCopyProgress2);
                        return;
                    }
                    throw new IOException("Source '" + srcDir + "' and destination '" + destDir + "' are the same");
                }
                throw new IOException("Source '" + srcDir + "' exists but is not a directory");
            }
            throw new FileNotFoundException("Source '" + srcDir + "' does not exist");
        }
        throw new NullPointerException("Destination must not be null");
    }
}
