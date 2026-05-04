package ya;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import ya.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class g {
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(ya.e r2, java.lang.String r3, java.lang.String r4) throws java.io.IOException {
        /*
            r0 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3c
            java.io.InputStream r2 = r2.t(r3)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3c
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3c
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L36
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L36
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L36
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L36
            r3 = 4096(0x1000, float:5.74E-42)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L26
        L18:
            int r4 = r1.read(r3)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L26
            if (r4 <= 0) goto L29
            r0 = 0
            r2.write(r3, r0, r4)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L26
            goto L18
        L23:
            r3 = move-exception
        L24:
            r0 = r1
            goto L40
        L26:
            r3 = move-exception
        L27:
            r0 = r1
            goto L3e
        L29:
            r1.close()
            r2.flush()
            r2.close()
            return
        L33:
            r3 = move-exception
            r2 = r0
            goto L24
        L36:
            r3 = move-exception
            r2 = r0
            goto L27
        L39:
            r3 = move-exception
            r2 = r0
            goto L40
        L3c:
            r3 = move-exception
            r2 = r0
        L3e:
            throw r3     // Catch: java.lang.Throwable -> L3f
        L3f:
            r3 = move-exception
        L40:
            if (r0 == 0) goto L45
            r0.close()
        L45:
            if (r2 == 0) goto L4d
            r2.flush()
            r2.close()
        L4d:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.g.a(ya.e, java.lang.String, java.lang.String):void");
    }

    public static void b(e srcPack, e destPack) throws IOException {
        byte[] bArr = new byte[4096];
        for (int i11 = 0; i11 < srcPack.k(); i11++) {
            e.a l11 = srcPack.l(i11);
            InputStream t11 = srcPack.t(l11.f99755a);
            OutputStream e11 = destPack.e(l11.f99755a, l11.f99763i);
            while (true) {
                int read = t11.read(bArr);
                if (read > 0) {
                    e11.write(bArr, 0, read);
                }
            }
            t11.close();
            e11.close();
        }
        destPack.h();
    }

    public static void c(e pack, String path) throws IOException {
        File file = new File(path);
        if (file.exists()) {
            d(pack, file);
            pack.d();
        } else {
            throw new IOException("path not exists: " + path);
        }
    }

    public static void d(e pack, File parent) throws IOException {
        System.out.println("packImpl" + parent.getPath());
        if (parent.isDirectory()) {
            for (File file : parent.listFiles()) {
                d(pack, file);
            }
            return;
        }
        if (!parent.isFile() || parent.isHidden()) {
            return;
        }
        pack.a(parent.getPath(), parent.getPath());
        System.out.println("inject " + parent.getPath());
    }

    public static void e(e pack) throws IOException {
        f(pack, a.g(pack.o())[0]);
    }

    public static void f(e pack, String unpackDirname) throws IOException {
        if (!a.d(unpackDirname)) {
            throw new IOException("Cannot create unpack dir: " + unpackDirname);
        }
        for (int i11 = 0; i11 < pack.k(); i11++) {
            e.a l11 = pack.l(i11);
            String str = unpackDirname + File.separator + l11.f99755a;
            a.a(str);
            a(pack, l11.f99755a, str);
        }
    }
}
