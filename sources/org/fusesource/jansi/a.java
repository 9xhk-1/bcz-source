package org.fusesource.jansi;

import androidx.core.app.NotificationCompat;
import com.bumptech.glide.load.engine.GlideException;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Properties;
import org.fusesource.jansi.Ansi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class a {
    public static void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e11) {
            e11.printStackTrace(System.err);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(boolean r9) {
        /*
            boolean r0 = f80.f.f51322w
            r1 = 0
            if (r0 == 0) goto L4f
            if (r9 == 0) goto La
            int r0 = org.fusesource.jansi.internal.Kernel32.f77837s
            goto Lc
        La:
            int r0 = org.fusesource.jansi.internal.Kernel32.f77836r
        Lc:
            long r2 = org.fusesource.jansi.internal.Kernel32.GetStdHandle(r0)
            r0 = 1
            int[] r4 = new int[r0]
            int r4 = org.fusesource.jansi.internal.Kernel32.GetConsoleMode(r2, r4)
            boolean r5 = f80.f.f51325z
            if (r5 != 0) goto L23
            boolean r5 = f80.f.f51323x
            if (r5 != 0) goto L23
            boolean r5 = f80.f.f51324y
            if (r5 == 0) goto L42
        L23:
            if (r4 != 0) goto L42
            g80.f r2 = new g80.f
            r2.<init>()
            r3 = r9 ^ 1
            java.lang.String r3 = r2.a(r3)
            if (r3 == 0) goto L40
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L40
            int r1 = r2.c(r3)
            r8 = r1
            r1 = r0
            r0 = r8
            goto L6a
        L40:
            r0 = r1
            goto L6a
        L42:
            org.fusesource.jansi.internal.Kernel32$CONSOLE_SCREEN_BUFFER_INFO r0 = new org.fusesource.jansi.internal.Kernel32$CONSOLE_SCREEN_BUFFER_INFO
            r0.<init>()
            org.fusesource.jansi.internal.Kernel32.GetConsoleScreenBufferInfo(r2, r0)
            int r0 = r0.b()
            goto L6b
        L4f:
            if (r9 == 0) goto L54
            int r0 = org.fusesource.jansi.internal.CLibrary.f77794c
            goto L56
        L54:
            int r0 = org.fusesource.jansi.internal.CLibrary.f77793b
        L56:
            boolean r2 = org.fusesource.jansi.internal.CLibrary.f77792a
            if (r2 == 0) goto L5e
            int r1 = org.fusesource.jansi.internal.CLibrary.isatty(r0)
        L5e:
            org.fusesource.jansi.internal.CLibrary$WinSize r2 = new org.fusesource.jansi.internal.CLibrary$WinSize
            r2.<init>()
            long r3 = org.fusesource.jansi.internal.CLibrary.f77804m
            org.fusesource.jansi.internal.CLibrary.ioctl(r0, r3, r2)
            short r0 = r2.f77816b
        L6a:
            r4 = r1
        L6b:
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "isatty(STD"
            r2.append(r3)
            java.lang.String r3 = "OUT"
            java.lang.String r5 = "ERR"
            if (r9 == 0) goto L7f
            r6 = r5
            goto L80
        L7f:
            r6 = r3
        L80:
            r2.append(r6)
            java.lang.String r6 = "_FILENO): "
            r2.append(r6)
            r2.append(r4)
            java.lang.String r7 = ", System."
            r2.append(r7)
            if (r9 == 0) goto L95
            java.lang.String r7 = "err"
            goto L97
        L95:
            java.lang.String r7 = "out"
        L97:
            r2.append(r7)
            java.lang.String r7 = " "
            r2.append(r7)
            if (r4 != 0) goto La4
            java.lang.String r4 = "is *NOT*"
            goto La6
        La4:
            java.lang.String r4 = "is"
        La6:
            r2.append(r4)
            java.lang.String r4 = " a terminal"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.println(r2)
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "width(STD"
            r2.append(r4)
            if (r9 == 0) goto Lc4
            r3 = r5
        Lc4:
            r2.append(r3)
            r2.append(r6)
            r2.append(r0)
            java.lang.String r9 = r2.toString()
            r1.println(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.fusesource.jansi.a.b(boolean):void");
    }

    public static String c() {
        Package r02 = a.class.getPackage();
        if (r02 == null) {
            return null;
        }
        return r02.getImplementationVersion();
    }

    public static String d(String str) throws IOException {
        InputStream resourceAsStream = a.class.getResourceAsStream("/META-INF/maven/" + str + "/pom.properties");
        if (resourceAsStream == null) {
            return null;
        }
        try {
            Properties properties = new Properties();
            properties.load(resourceAsStream);
            return properties.getProperty("version");
        } finally {
            a(resourceAsStream);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b8, code lost:
    
        if (r0 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.lang.String... r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.fusesource.jansi.a.e(java.lang.String[]):void");
    }

    public static void f() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(a.class.getResourceAsStream("jansi.txt"), StandardCharsets.UTF_8));
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return;
                } else {
                    System.out.println(readLine);
                }
            } finally {
                a(bufferedReader);
            }
        }
    }

    public static void g(boolean z11) {
        PrintStream printStream = z11 ? System.err : System.out;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("test on System.");
        sb2.append(z11 ? NotificationCompat.CATEGORY_ERROR : "out");
        sb2.append(":");
        printStream.print(sb2.toString());
        for (Ansi.Color color : Ansi.Color.values()) {
            printStream.print(" " + Ansi.q().j0(color) + color + Ansi.q().K0());
        }
        printStream.println();
        printStream.print("            bright:");
        for (Ansi.Color color2 : Ansi.Color.values()) {
            printStream.print(" " + Ansi.q().m0(color2) + color2 + Ansi.q().K0());
        }
        printStream.println();
        printStream.print("              bold:");
        for (Ansi.Color color3 : Ansi.Color.values()) {
            printStream.print(" " + Ansi.q().R().j0(color3) + color3 + Ansi.q().K0());
        }
        printStream.println();
        printStream.print("             faint:");
        for (Ansi.Color color4 : Ansi.Color.values()) {
            printStream.print(" " + Ansi.q().m(Ansi.Attribute.INTENSITY_FAINT).j0(color4) + color4 + Ansi.q().K0());
        }
        printStream.println();
        printStream.print("        bold+faint:");
        for (Ansi.Color color5 : Ansi.Color.values()) {
            printStream.print(" " + Ansi.q().R().m(Ansi.Attribute.INTENSITY_FAINT).j0(color5) + color5 + Ansi.q().K0());
        }
        printStream.println();
        Ansi q11 = Ansi.q();
        q11.k("        256 colors: ");
        for (int i11 = 0; i11 < 216; i11++) {
            if (i11 > 0 && i11 % 36 == 0) {
                q11.K0();
                q11.H0();
                q11.k("                    ");
            } else if (i11 > 0 && i11 % 6 == 0) {
                q11.K0();
                q11.k(GlideException.a.f28776d);
            }
            q11.A((i11 % 6) + 16 + ((i11 / 36) * 6) + (((i11 / 6) % 6) * 36)).c(' ');
        }
        q11.K0();
        printStream.println(q11);
        Ansi q12 = Ansi.q();
        q12.k("         truecolor: ");
        for (int i12 = 0; i12 < 256; i12++) {
            if (i12 > 0 && i12 % 48 == 0) {
                q12.K0();
                q12.H0();
                q12.k("                    ");
            }
            int i13 = 255 - i12;
            int i14 = i12 * 2;
            if (i14 > 255) {
                i14 = 255 - i14;
            }
            q12.P(i13, i14, i12).B0(255 - i13, 255 - i14, i13).c(i12 % 2 == 0 ? '/' : '\\');
        }
        q12.K0();
        printStream.println(q12);
    }

    public static void h(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read < 0) {
                    return;
                } else {
                    System.out.write(bArr, 0, read);
                }
            }
        } finally {
            a(fileInputStream);
        }
    }
}
