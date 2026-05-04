package g80;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f53495a = "x86";

    /* renamed from: b, reason: collision with root package name */
    public static final String f53496b = "x86_64";

    /* renamed from: c, reason: collision with root package name */
    public static final String f53497c = "ia64_32";

    /* renamed from: d, reason: collision with root package name */
    public static final String f53498d = "ia64";

    /* renamed from: e, reason: collision with root package name */
    public static final String f53499e = "ppc";

    /* renamed from: f, reason: collision with root package name */
    public static final String f53500f = "ppc64";

    /* renamed from: g, reason: collision with root package name */
    public static final String f53501g = "arm64";

    /* renamed from: h, reason: collision with root package name */
    public static final HashMap<String, String> f53502h;

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        f53502h = hashMap;
        hashMap.put(f53495a, f53495a);
        hashMap.put("i386", f53495a);
        hashMap.put("i486", f53495a);
        hashMap.put("i586", f53495a);
        hashMap.put("i686", f53495a);
        hashMap.put("pentium", f53495a);
        hashMap.put(f53496b, f53496b);
        hashMap.put("amd64", f53496b);
        hashMap.put("em64t", f53496b);
        hashMap.put("universal", f53496b);
        hashMap.put(f53498d, f53498d);
        hashMap.put("ia64w", f53498d);
        hashMap.put(f53497c, f53497c);
        hashMap.put("ia64n", f53497c);
        hashMap.put(f53499e, f53499e);
        hashMap.put(c6.d.f8118j, f53499e);
        hashMap.put("powerpc", f53499e);
        hashMap.put("power_pc", f53499e);
        hashMap.put("power_rs", f53499e);
        hashMap.put(f53500f, f53500f);
        hashMap.put("power64", f53500f);
        hashMap.put("powerpc64", f53500f);
        hashMap.put("power_pc64", f53500f);
        hashMap.put("power_rs64", f53500f);
        hashMap.put("aarch64", f53501g);
    }

    public static String a() {
        String property = System.getProperty("os.arch");
        if (f()) {
            return "android-arm";
        }
        if (property.startsWith("arm")) {
            property = i();
        } else {
            String lowerCase = property.toLowerCase(Locale.US);
            HashMap<String, String> hashMap = f53502h;
            if (hashMap.containsKey(lowerCase)) {
                return hashMap.get(lowerCase);
            }
        }
        return j(property);
    }

    public static String b() {
        try {
            Process exec = Runtime.getRuntime().exec("uname -m");
            exec.waitFor();
            InputStream inputStream = exec.getInputStream();
            try {
                return h(inputStream);
            } finally {
                inputStream.close();
            }
        } catch (Throwable th2) {
            System.err.println("Error while running uname -m: " + th2.getMessage());
            return "unknown";
        }
    }

    public static String c() {
        return d() + "/" + a();
    }

    public static String d() {
        return k(System.getProperty("os.name"));
    }

    public static boolean e() {
        Path path;
        List<String> readAllLines;
        try {
            path = Paths.get("/etc/os-release", new String[0]);
            readAllLines = Files.readAllLines(path);
            for (String str : readAllLines) {
                if (str.startsWith("ID") && str.toLowerCase(Locale.ROOT).contains("alpine")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean f() {
        return System.getProperty("java.runtime.name", "").toLowerCase().contains("android");
    }

    public static void g(String[] strArr) {
        if (strArr.length >= 1) {
            if ("--os".equals(strArr[0])) {
                System.out.print(d());
                return;
            } else if ("--arch".equals(strArr[0])) {
                System.out.print(a());
                return;
            }
        }
        System.out.print(c());
    }

    public static String h(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[32];
        while (true) {
            int read = inputStream.read(bArr, 0, 32);
            if (read < 0) {
                return byteArrayOutputStream.toString();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static String i() {
        if (System.getProperty("os.name").contains("Linux")) {
            String b11 = b();
            if (b11.startsWith("armv6")) {
                return "armv6";
            }
            if (b11.startsWith("armv7")) {
                return "armv7";
            }
            if (b11.startsWith("armv5")) {
                return "arm";
            }
            if (b11.equals("aarch64")) {
                return f53501g;
            }
            String property = System.getProperty("sun.arch.abi");
            if (property != null && property.startsWith("gnueabihf")) {
                return "armv7";
            }
        }
        return "arm";
    }

    public static String j(String str) {
        return str.replaceAll("\\W", "");
    }

    public static String k(String str) {
        return str.contains("Windows") ? "Windows" : (str.contains("Mac") || str.contains("Darwin")) ? "Mac" : str.contains("Linux") ? "Linux" : str.contains("AIX") ? "AIX" : str.replaceAll("\\W", "");
    }
}
