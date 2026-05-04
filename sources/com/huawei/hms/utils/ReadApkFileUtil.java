package com.huawei.hms.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.text.TextUtils;
import android.util.AndroidException;
import android.util.Base64;
import c1.g;
import com.huawei.hms.support.log.HMSLog;
import io.ktor.util.date.b;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ReadApkFileUtil {
    public static final String EMUI10_PK = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAx4nUogUyMCmzHhaEb420yvpw9zBs+ETzE9Qm77bGxl1Iml9JEkBkNTsUWOstLgUBajNhV+BAMVBHKMEdzoQbL5kIHkTgUVM65yewd+5+BhrcB9OQ3LHp+0BN6aLKZh71T4WvsvHFhfhQpShuGWkRkSaVGLFTHxX70kpWLzeZ3RtqiEUNIufPR2SFCH6EmecJ+HdkmBOh603IblCpGxwSWse0fDI98wZBEmV88RFaiYEgyiezLlWvXzqIj6I/xuyd5nGAegjH2y3cmoDE6CubecoB1jf4KdgACXgdiQ4Oc63MfLGTor3l6RCqeUk4APAMtyhK83jc72W1sdXMd/sj2wIDAQAB";
    public static final String EMUI11_PK = "MIIBojANBgkqhkiG9w0BAQEFAAOCAY8AMIIBigKCAYEAqq2eRTMYr2JHLtvuZzfgPrgU8oatD4Rar9fOD7E00es2VhtB3vTyaT2BvYPUPA/nbkHRPak3EZX77CfWj9tzLgSHJE8XLk9C+2ESkdrxCDA6z7I8X+cBDnA05OlCJeZFjnUbjYB8SP8M3BttdrvqtVPxTkEJhchC7UXnMLaJ3kQ3ZPjN7ubjYzO4rv7EtEpqr2bX+qjnSLIZZuUXraxqfdBuhGDIYq62dNsqiyrhX1mfvA3+43N4ZIs3BdfSYII8BNFmFxf+gyf1aoq386R2kAjHcrfOOhjAbZh+R1OAGLWPCqi3E9nB8EsZkeoTW/oIP6pJvgL3bnxq+1viT2dmZyipMgcx/3N6FJqkd67j/sPMtPlHJuq8/s0silzs13jAw1WBV6tWHFkLGpkWGs8jp50wQtndtY8cCPl2XPGmdPN72agH+zsHuKqr/HOB2TuzzaO8rKlGIDQlzZcCSHB28nnvOyBVN9xzLkbYiLnHfd6bTwzNPeqjWrTnPwKyH3BPAgMBAAE=";
    public static final String KEY_SIGNATURE = "Signature:";
    public static final String KEY_SIGNATURE2 = "Signature2:";
    public static final String KEY_SIGNATURE3 = "Signature3:";

    /* renamed from: a, reason: collision with root package name */
    private static final String f36747a = "ReadApkFileUtil";

    /* renamed from: c, reason: collision with root package name */
    private static String f36749c;

    /* renamed from: d, reason: collision with root package name */
    private static String f36750d;

    /* renamed from: e, reason: collision with root package name */
    private static String f36751e;

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f36748b = Pattern.compile("\\s*|\t|\r|\n");

    /* renamed from: f, reason: collision with root package name */
    private static String f36752f = null;

    /* renamed from: g, reason: collision with root package name */
    private static String f36753g = null;

    private static byte[] a(ZipFile zipFile) {
        return a(zipFile, "META-INF/MANIFEST.MF");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.ByteArrayInputStream, java.io.InputStream] */
    @TargetApi(19)
    private static void b(byte[] bArr) {
        Throwable th2;
        BufferedReader bufferedReader;
        ?? r22;
        ?? r23;
        BufferedReader bufferedReader2;
        InputStream inputStream;
        if (bArr == null) {
            HMSLog.e(f36747a, "manifest is null！");
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader3 = null;
        f36749c = null;
        f36750d = null;
        f36751e = null;
        try {
            r22 = new ByteArrayInputStream(bArr);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader((InputStream) r22, StandardCharsets.UTF_8));
            } catch (Exception unused) {
            } catch (Throwable th3) {
                th2 = th3;
                r23 = r22;
                IOUtils.closeQuietly((InputStream) r23);
                IOUtils.closeQuietly((Reader) bufferedReader3);
                throw th2;
            }
            try {
                String a11 = a(bufferedReader);
                while (a11 != null) {
                    if (a11.length() != 0) {
                        if (a11.startsWith("ApkHash:")) {
                            f36752f = a(a11.substring(a11.indexOf(":") + 1));
                        }
                        if (a11.startsWith(KEY_SIGNATURE)) {
                            f36749c = a(a11.substring(a11.indexOf(":") + 1));
                            a11 = a(bufferedReader);
                        } else if (a11.startsWith(KEY_SIGNATURE2)) {
                            f36750d = a(a11.substring(a11.indexOf(":") + 1));
                            a11 = a(bufferedReader);
                        } else if (a11.startsWith(KEY_SIGNATURE3)) {
                            f36751e = a(a11.substring(a11.indexOf(":") + 1));
                            a11 = a(bufferedReader);
                        } else {
                            stringBuffer.append(a11);
                            stringBuffer.append("\r\n");
                        }
                    }
                    a11 = a(bufferedReader);
                }
                f36753g = stringBuffer.toString();
                inputStream = r22;
            } catch (Exception unused2) {
                bufferedReader3 = bufferedReader;
                try {
                    HMSLog.e(f36747a, "loadApkCert Exception!");
                    bufferedReader = bufferedReader3;
                    inputStream = r22;
                    IOUtils.closeQuietly(inputStream);
                    IOUtils.closeQuietly((Reader) bufferedReader);
                } catch (Throwable th4) {
                    th2 = th4;
                    bufferedReader = bufferedReader3;
                    bufferedReader3 = r22;
                    bufferedReader2 = bufferedReader3;
                    bufferedReader3 = bufferedReader;
                    r23 = bufferedReader2;
                    IOUtils.closeQuietly((InputStream) r23);
                    IOUtils.closeQuietly((Reader) bufferedReader3);
                    throw th2;
                }
            } catch (Throwable th5) {
                th2 = th5;
                bufferedReader2 = r22;
                bufferedReader3 = bufferedReader;
                r23 = bufferedReader2;
                IOUtils.closeQuietly((InputStream) r23);
                IOUtils.closeQuietly((Reader) bufferedReader3);
                throw th2;
            }
        } catch (Exception unused3) {
            r22 = 0;
        } catch (Throwable th6) {
            th2 = th6;
            bufferedReader = null;
            bufferedReader2 = bufferedReader3;
            bufferedReader3 = bufferedReader;
            r23 = bufferedReader2;
            IOUtils.closeQuietly((InputStream) r23);
            IOUtils.closeQuietly((Reader) bufferedReader3);
            throw th2;
        }
        IOUtils.closeQuietly(inputStream);
        IOUtils.closeQuietly((Reader) bufferedReader);
    }

    public static String bytesToString(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', b.f62000f, 'e', 'f'};
        char[] cArr2 = new char[bArr.length * 2];
        for (int i11 = 0; i11 < bArr.length; i11++) {
            byte b11 = bArr[i11];
            int i12 = i11 * 2;
            cArr2[i12] = cArr[(b11 & 255) >>> 4];
            cArr2[i12 + 1] = cArr[b11 & 15];
        }
        return String.valueOf(cArr2);
    }

    private static boolean c() {
        try {
        } catch (Exception e11) {
            HMSLog.i(f36747a, "verifyMDMSignatureV3 MDM verify Exception!:" + e11.getMessage());
        }
        if (a(Base64.decode(EMUI11_PK, 0), a(f36753g, "SHA-384"), b(f36751e), "SHA384withRSA")) {
            HMSLog.i(f36747a, "verifyMDMSignatureV3 verify successful!");
            return true;
        }
        HMSLog.i(f36747a, "verifyMDMSignatureV3 verify failure!");
        return false;
    }

    public static boolean checkSignature() {
        if (f36751e != null) {
            return c();
        }
        if (f36750d != null) {
            return b();
        }
        if (f36749c != null) {
            return a();
        }
        return false;
    }

    public static String getHmsPath(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo("com.huawei.hwid", 128).sourceDir;
        } catch (AndroidException | RuntimeException unused) {
            HMSLog.e(f36747a, "HMS is not found!");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @TargetApi(19)
    public static boolean isCertFound(String str) {
        ZipFile zipFile;
        boolean z11 = false;
        ZipFile zipFile2 = null;
        ZipFile zipFile3 = null;
        ZipFile zipFile4 = null;
        try {
            try {
                zipFile = new ZipFile(str);
            } catch (Throwable th2) {
                th = th2;
                zipFile = zipFile2;
            }
        } catch (Exception e11) {
            e = e11;
        }
        try {
            boolean z12 = zipFile.getEntry("META-INF/HUAWEI.CER") != null;
            if (z12) {
                b(a(zipFile, "META-INF/HUAWEI.CER"));
            }
            try {
                zipFile.close();
            } catch (IOException e12) {
                String str2 = f36747a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("zipFile.close Exception!");
                sb2.append(e12.getMessage());
                HMSLog.e(str2, sb2.toString());
                zipFile3 = sb2;
            }
            z11 = z12;
            zipFile2 = zipFile3;
        } catch (Exception e13) {
            e = e13;
            zipFile4 = zipFile;
            HMSLog.e(f36747a, "isCertFound Exception!" + e.getMessage());
            zipFile2 = zipFile4;
            if (zipFile4 != null) {
                try {
                    zipFile4.close();
                    zipFile2 = zipFile4;
                } catch (IOException e14) {
                    String str3 = f36747a;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("zipFile.close Exception!");
                    sb3.append(e14.getMessage());
                    HMSLog.e(str3, sb3.toString());
                    zipFile2 = sb3;
                }
            }
            return z11;
        } catch (Throwable th3) {
            th = th3;
            if (zipFile != null) {
                try {
                    zipFile.close();
                } catch (IOException e15) {
                    HMSLog.e(f36747a, "zipFile.close Exception!" + e15.getMessage());
                }
            }
            throw th;
        }
        return z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public static boolean verifyApkHash(String str) {
        ?? r22;
        ZipFile zipFile;
        String str2 = null;
        ZipFile zipFile2 = null;
        try {
            try {
                zipFile = new ZipFile(str);
            } catch (Throwable th2) {
                th = th2;
                r22 = str2;
            }
        } catch (Exception e11) {
            e = e11;
        }
        try {
            byte[] a11 = a(zipFile);
            ArrayList<String> a12 = a(a11);
            if (a12 != null) {
                a11 = a(a12);
            }
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(a11);
            String bytesToString = bytesToString(messageDigest.digest());
            String str3 = f36752f;
            if (str3 != null) {
                if (str3.equals(bytesToString)) {
                    try {
                        zipFile.close();
                        return true;
                    } catch (Exception e12) {
                        HMSLog.i(f36747a, "close stream Exception!" + e12.getMessage());
                        return true;
                    }
                }
            }
            try {
                zipFile.close();
                return false;
            } catch (Exception e13) {
                HMSLog.i(f36747a, "close stream Exception!" + e13.getMessage());
                return false;
            }
        } catch (Exception e14) {
            e = e14;
            zipFile2 = zipFile;
            HMSLog.i(f36747a, "verifyApkHash Exception!" + e.getMessage());
            if (zipFile2 == null) {
                return false;
            }
            try {
                zipFile2.close();
                return false;
            } catch (Exception e15) {
                str2 = f36747a;
                HMSLog.i(str2, "close stream Exception!" + e15.getMessage());
                return false;
            }
        } catch (Throwable th3) {
            th = th3;
            r22 = zipFile;
            if (r22 != null) {
                try {
                    r22.close();
                } catch (Exception e16) {
                    HMSLog.i(f36747a, "close stream Exception!" + e16.getMessage());
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static byte[] a(ZipFile zipFile, String str) {
        Throwable th2;
        InputStream inputStream;
        Exception e11;
        Throwable th3;
        BufferedInputStream bufferedInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        ByteArrayOutputStream byteArrayOutputStream3;
        ByteArrayOutputStream byteArrayOutputStream4;
        ZipEntry entry = zipFile.getEntry(str);
        OutputStream outputStream = null;
        if (entry == null) {
            return null;
        }
        try {
            inputStream = zipFile.getInputStream(entry);
            if (inputStream == null) {
                IOUtils.closeQuietly(inputStream);
                IOUtils.closeQuietly((InputStream) null);
                IOUtils.closeQuietly((OutputStream) null);
                IOUtils.closeQuietly((OutputStream) null);
                return null;
            }
            try {
                bufferedInputStream = new BufferedInputStream(inputStream);
            } catch (Exception e12) {
                e11 = e12;
                bufferedInputStream = null;
                byteArrayOutputStream = null;
                byteArrayOutputStream2 = byteArrayOutputStream;
                try {
                    HMSLog.i(f36747a, "getManifestBytes Exception!" + e11.getMessage());
                    IOUtils.closeQuietly(inputStream);
                    IOUtils.closeQuietly((InputStream) bufferedInputStream);
                    IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                    IOUtils.closeQuietly((OutputStream) byteArrayOutputStream2);
                    return null;
                } catch (Throwable th4) {
                    th3 = th4;
                    byteArrayOutputStream4 = byteArrayOutputStream2;
                    bufferedInputStream = bufferedInputStream;
                    byteArrayOutputStream3 = byteArrayOutputStream4;
                    outputStream = byteArrayOutputStream3;
                    IOUtils.closeQuietly(inputStream);
                    IOUtils.closeQuietly((InputStream) bufferedInputStream);
                    IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                    IOUtils.closeQuietly(outputStream);
                    throw th3;
                }
            } catch (Throwable th5) {
                th2 = th5;
                th3 = th2;
                bufferedInputStream = null;
                byteArrayOutputStream = null;
                IOUtils.closeQuietly(inputStream);
                IOUtils.closeQuietly((InputStream) bufferedInputStream);
                IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                IOUtils.closeQuietly(outputStream);
                throw th3;
            }
            try {
                byte[] bArr = new byte[4096];
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(byteArrayOutputStream);
                    try {
                        for (int read = bufferedInputStream.read(bArr, 0, 4096); read > 0; read = bufferedInputStream.read(bArr, 0, 4096)) {
                            bufferedOutputStream.write(bArr, 0, read);
                        }
                        bufferedOutputStream.flush();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        IOUtils.closeQuietly(inputStream);
                        IOUtils.closeQuietly((InputStream) bufferedInputStream);
                        IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                        IOUtils.closeQuietly((OutputStream) bufferedOutputStream);
                        return byteArray;
                    } catch (Exception e13) {
                        e11 = e13;
                        byteArrayOutputStream2 = bufferedOutputStream;
                        HMSLog.i(f36747a, "getManifestBytes Exception!" + e11.getMessage());
                        IOUtils.closeQuietly(inputStream);
                        IOUtils.closeQuietly((InputStream) bufferedInputStream);
                        IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                        IOUtils.closeQuietly((OutputStream) byteArrayOutputStream2);
                        return null;
                    } catch (Throwable th6) {
                        th3 = th6;
                        byteArrayOutputStream3 = bufferedOutputStream;
                        outputStream = byteArrayOutputStream3;
                        IOUtils.closeQuietly(inputStream);
                        IOUtils.closeQuietly((InputStream) bufferedInputStream);
                        IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                        IOUtils.closeQuietly(outputStream);
                        throw th3;
                    }
                } catch (Exception e14) {
                    e11 = e14;
                    byteArrayOutputStream2 = null;
                } catch (Throwable th7) {
                    th3 = th7;
                    IOUtils.closeQuietly(inputStream);
                    IOUtils.closeQuietly((InputStream) bufferedInputStream);
                    IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                    IOUtils.closeQuietly(outputStream);
                    throw th3;
                }
            } catch (Exception e15) {
                e11 = e15;
                byteArrayOutputStream = null;
                byteArrayOutputStream2 = byteArrayOutputStream;
                HMSLog.i(f36747a, "getManifestBytes Exception!" + e11.getMessage());
                IOUtils.closeQuietly(inputStream);
                IOUtils.closeQuietly((InputStream) bufferedInputStream);
                IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                IOUtils.closeQuietly((OutputStream) byteArrayOutputStream2);
                return null;
            } catch (Throwable th8) {
                th3 = th8;
                byteArrayOutputStream = null;
                byteArrayOutputStream4 = null;
                bufferedInputStream = bufferedInputStream;
                byteArrayOutputStream3 = byteArrayOutputStream4;
                outputStream = byteArrayOutputStream3;
                IOUtils.closeQuietly(inputStream);
                IOUtils.closeQuietly((InputStream) bufferedInputStream);
                IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                IOUtils.closeQuietly(outputStream);
                throw th3;
            }
        } catch (Exception e16) {
            e11 = e16;
            inputStream = null;
        } catch (Throwable th9) {
            th2 = th9;
            inputStream = null;
        }
    }

    @TargetApi(19)
    private static ArrayList<String> a(byte[] bArr) {
        if (bArr == null) {
            HMSLog.e(f36747a, "manifest is null！");
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(byteArrayInputStream, StandardCharsets.UTF_8));
                try {
                    if (a(bufferedReader, arrayList)) {
                        bufferedReader.close();
                        byteArrayInputStream.close();
                        return arrayList;
                    }
                    bufferedReader.close();
                    byteArrayInputStream.close();
                    return null;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            HMSLog.e(f36747a, "getManifestLinesArrary IOException!");
            return null;
        }
    }

    private static boolean b() {
        try {
        } catch (Exception e11) {
            HMSLog.i(f36747a, "verifyMDMSignatureV2 MDM verify Exception!:" + e11.getMessage());
        }
        if (a(Base64.decode(EMUI10_PK, 0), a(f36753g, "SHA-256"), b(f36750d), "SHA256withRSA")) {
            HMSLog.i(f36747a, "verifyMDMSignatureV2 verify successful!");
            return true;
        }
        HMSLog.i(f36747a, "verifyMDMSignatureV2 verify failure!");
        return false;
    }

    private static byte[] b(String str) {
        int i11;
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        int length = str.length();
        if (length % 2 == 0) {
            i11 = length / 2;
        } else {
            i11 = (length / 2) + 1;
        }
        byte[] bArr = new byte[i11];
        for (int i12 = 0; i12 < length; i12 += 2) {
            int i13 = i12 + 1;
            if (i13 < length) {
                bArr[i12 / 2] = (byte) ((Character.digit(str.charAt(i12), 16) << 4) + Character.digit(str.charAt(i13), 16));
            } else {
                bArr[i12 / 2] = (byte) (Character.digit(str.charAt(i12), 16) << 4);
            }
        }
        return bArr;
    }

    @TargetApi(19)
    private static byte[] a(ArrayList<String> arrayList) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, StandardCharsets.UTF_8));
        try {
            try {
                Collections.sort(arrayList);
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    String str = arrayList.get(i11);
                    bufferedWriter.write(str, 0, str.length());
                    bufferedWriter.write("\r\n", 0, 2);
                }
                bufferedWriter.flush();
            } catch (Exception e11) {
                HMSLog.i(f36747a, "getManifestBytesbySorted Exception!" + e11.getMessage());
            }
            IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
            IOUtils.closeQuietly((Writer) bufferedWriter);
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th2) {
            IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
            IOUtils.closeQuietly((Writer) bufferedWriter);
            throw th2;
        }
    }

    private static boolean a(BufferedReader bufferedReader, ArrayList<String> arrayList) throws IOException {
        String a11 = a(bufferedReader);
        boolean z11 = false;
        while (a11 != null) {
            if (a11.equals("Name: META-INF/HUAWEI.CER")) {
                String a12 = a(bufferedReader);
                while (true) {
                    if (a12 == null) {
                        break;
                    }
                    if (a12.startsWith("Name:")) {
                        a11 = a12;
                        break;
                    }
                    a12 = a(bufferedReader);
                }
                z11 = true;
            }
            if (a11.length() != 0) {
                arrayList.add(a11);
            }
            a11 = a(bufferedReader);
        }
        return z11;
    }

    private static String a(BufferedReader bufferedReader) throws IOException {
        int read;
        if (bufferedReader == null || (read = bufferedReader.read()) == -1) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(10);
        while (read != -1) {
            char c11 = (char) read;
            if (c11 == '\n') {
                break;
            }
            if (sb2.length() < 4096) {
                sb2.append(c11);
                read = bufferedReader.read();
            } else {
                throw new IOException("cert line is too long!");
            }
        }
        String sb3 = sb2.toString();
        return (sb3.isEmpty() || !sb3.endsWith(g.f7467d)) ? sb3 : sb3.substring(0, sb3.length() - 1);
    }

    private static boolean a() {
        try {
            if (a(b("30820122300d06092a864886f70d01010105000382010f003082010a0282010100a3d269348ac59923f65e8111c337605e29a1d1bc54fa96c1445050dd14d8d63b10f9f0230bb87ef348183660bedcabfdec045e235ed96935799fcdb4af5c97717ff3b0954eaf1b723225b3a00f81cbd67ce6dc5a4c07f7741ad3bf1913a480c6e267ab1740f409edd2dc33c8b718a8e30e56d9a93f321723c1d0c9ea62115f996812ceef186954595e39a19b74245542c407f7dddb1d12e6eedcfc0bd7cd945ef7255ad0fc9e796258e0fb5e52a23013d15033a32b4071b65f3f924ae5c5761e22327b4d2ae60f4158a5eb15565ba079de29b81540f5fbb3be101a95357f367fc661d797074ff3826950029c52223e4594673a24a334cae62d63b838ba3df9770203010001"), a(f36753g, "SHA-256"), b(f36749c), "SHA256withRSA")) {
                HMSLog.i(f36747a, "verifyMDMSignatureV1 verify successful!");
                return true;
            }
            HMSLog.i(f36747a, "verifyMDMSignatureV1 verify failure!");
            return false;
        } catch (Exception e11) {
            HMSLog.i(f36747a, "verifyMDMSignatureV1 MDM verify Exception!:" + e11.getMessage());
            return false;
        }
    }

    private static boolean a(byte[] bArr, byte[] bArr2, byte[] bArr3, String str) throws Exception {
        Signature signature = Signature.getInstance(str);
        signature.initVerify(KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr)));
        signature.update(bArr2);
        return signature.verify(bArr3);
    }

    @TargetApi(19)
    private static byte[] a(String str, String str2) throws Exception {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        messageDigest.update(str.getBytes(StandardCharsets.UTF_8.name()));
        return messageDigest.digest();
    }

    private static String a(String str) {
        if (str == null) {
            return "";
        }
        return f36748b.matcher(str).replaceAll("");
    }
}
