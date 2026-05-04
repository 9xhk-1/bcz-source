package com.tencent.liteav.network.a.a;

import com.tencent.liteav.network.a.e;
import ct.d;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class a {
    public static InetAddress[] a() {
        String hostAddress;
        try {
            LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(Runtime.getRuntime().exec("getprop").getInputStream()));
            ArrayList arrayList = new ArrayList(5);
            while (true) {
                String readLine = lineNumberReader.readLine();
                if (readLine == null) {
                    break;
                }
                int indexOf = readLine.indexOf("]: [");
                if (indexOf != -1) {
                    String substring = readLine.substring(1, indexOf);
                    String substring2 = readLine.substring(indexOf + 4, readLine.length() - 1);
                    if (substring.endsWith(".dns") || substring.endsWith(".dns1") || substring.endsWith(".dns2") || substring.endsWith(".dns3") || substring.endsWith(".dns4")) {
                        InetAddress byName = InetAddress.getByName(substring2);
                        if (byName != null && (hostAddress = byName.getHostAddress()) != null && hostAddress.length() != 0) {
                            arrayList.add(byName);
                        }
                    }
                }
            }
            if (arrayList.size() > 0) {
                return (InetAddress[]) arrayList.toArray(new InetAddress[arrayList.size()]);
            }
            return null;
        } catch (IOException e11) {
            Logger.getLogger("AndroidDnsServer").log(Level.WARNING, "Exception in findDNSByExec", (Throwable) e11);
            return null;
        }
    }

    public static InetAddress[] b() {
        InetAddress byName;
        String hostAddress;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod(d.f46852f, String.class);
            ArrayList arrayList = new ArrayList(5);
            String[] strArr = {"net.dns1", "net.dns2", "net.dns3", "net.dns4"};
            for (int i11 = 0; i11 < 4; i11++) {
                String str = (String) method.invoke(null, strArr[i11]);
                if (str != null && str.length() != 0 && (byName = InetAddress.getByName(str)) != null && (hostAddress = byName.getHostAddress()) != null && hostAddress.length() != 0 && !arrayList.contains(byName)) {
                    arrayList.add(byName);
                }
            }
            if (arrayList.size() > 0) {
                return (InetAddress[]) arrayList.toArray(new InetAddress[arrayList.size()]);
            }
        } catch (Exception e11) {
            Logger.getLogger("AndroidDnsServer").log(Level.WARNING, "Exception in findDNSByReflection", (Throwable) e11);
        }
        return null;
    }

    public static com.tencent.liteav.network.a.c c() {
        return new com.tencent.liteav.network.a.c() { // from class: com.tencent.liteav.network.a.a.a.1
            @Override // com.tencent.liteav.network.a.c
            public e[] a(com.tencent.liteav.network.a.b bVar, com.tencent.liteav.network.a.d dVar) throws IOException {
                InetAddress[] b11 = a.b();
                if (b11 == null) {
                    b11 = a.a();
                }
                if (b11 != null) {
                    return new c(b11[0]).a(bVar, dVar);
                }
                throw new IOException("cant get local dns server");
            }
        };
    }
}
