package f80;

import h80.a;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Locale;
import org.fusesource.jansi.AnsiColors;
import org.fusesource.jansi.AnsiMode;
import org.fusesource.jansi.AnsiType;
import org.fusesource.jansi.internal.CLibrary;
import org.fusesource.jansi.internal.Kernel32;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class f {
    public static final int A = 4;
    public static int B = 0;
    public static int C = 0;
    public static boolean D = false;
    public static int E = 0;
    public static int F = 0;

    /* renamed from: a, reason: collision with root package name */
    public static final String f51300a = "jansi.mode";

    /* renamed from: b, reason: collision with root package name */
    public static final String f51301b = "jansi.out.mode";

    /* renamed from: c, reason: collision with root package name */
    public static final String f51302c = "jansi.err.mode";

    /* renamed from: d, reason: collision with root package name */
    public static final String f51303d = "strip";

    /* renamed from: e, reason: collision with root package name */
    public static final String f51304e = "force";

    /* renamed from: f, reason: collision with root package name */
    public static final String f51305f = "default";

    /* renamed from: g, reason: collision with root package name */
    public static final String f51306g = "jansi.colors";

    /* renamed from: h, reason: collision with root package name */
    public static final String f51307h = "jansi.out.colors";

    /* renamed from: i, reason: collision with root package name */
    public static final String f51308i = "jansi.err.colors";

    /* renamed from: j, reason: collision with root package name */
    public static final String f51309j = "16";

    /* renamed from: k, reason: collision with root package name */
    public static final String f51310k = "256";

    /* renamed from: l, reason: collision with root package name */
    public static final String f51311l = "truecolor";

    /* renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final String f51312m = "jansi.passthrough";

    /* renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final String f51313n = "jansi.strip";

    /* renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final String f51314o = "jansi.force";

    /* renamed from: p, reason: collision with root package name */
    @Deprecated
    public static final String f51315p = "jansi.eager";

    /* renamed from: q, reason: collision with root package name */
    public static final String f51316q = "jansi.noreset";

    /* renamed from: r, reason: collision with root package name */
    public static final String f51317r = "jansi.graceful";

    /* renamed from: t, reason: collision with root package name */
    @Deprecated
    public static PrintStream f51319t;

    /* renamed from: v, reason: collision with root package name */
    @Deprecated
    public static PrintStream f51321v;

    /* renamed from: w, reason: collision with root package name */
    public static final boolean f51322w;

    /* renamed from: x, reason: collision with root package name */
    public static final boolean f51323x;

    /* renamed from: y, reason: collision with root package name */
    public static final boolean f51324y;

    /* renamed from: z, reason: collision with root package name */
    public static final boolean f51325z;

    /* renamed from: s, reason: collision with root package name */
    @Deprecated
    public static PrintStream f51318s = System.out;

    /* renamed from: u, reason: collision with root package name */
    @Deprecated
    public static PrintStream f51320u = System.err;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements a.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f51326a;

        public a(long j11) {
            this.f51326a = j11;
        }

        @Override // h80.a.b
        public int a() {
            Kernel32.CONSOLE_SCREEN_BUFFER_INFO console_screen_buffer_info = new Kernel32.CONSOLE_SCREEN_BUFFER_INFO();
            Kernel32.GetConsoleScreenBufferInfo(this.f51326a, console_screen_buffer_info);
            return console_screen_buffer_info.b();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements a.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f51327a;

        public b(int i11) {
            this.f51327a = i11;
        }

        @Override // h80.a.b
        public int a() {
            CLibrary.WinSize winSize = new CLibrary.WinSize();
            CLibrary.ioctl(this.f51327a, CLibrary.f77804m, winSize);
            return winSize.f77816b;
        }
    }

    static {
        boolean contains = System.getProperty("os.name").toLowerCase(Locale.ENGLISH).contains("win");
        f51322w = contains;
        boolean z11 = false;
        f51323x = contains && System.getenv("PWD") != null && System.getenv("PWD").startsWith("/");
        f51324y = contains && System.getenv("MSYSTEM") != null && (System.getenv("MSYSTEM").startsWith("MINGW") || System.getenv("MSYSTEM").equals("MSYS"));
        if (contains && System.getenv("ConEmuPID") != null) {
            z11 = true;
        }
        f51325z = z11;
        B = 1;
        C = 2;
        if (g(f51315p)) {
            i();
        }
    }

    public static /* synthetic */ void a(long j11, int[] iArr) {
        synchronized (f.class) {
            F++;
            Kernel32.SetConsoleMode(j11, iArr[0] | 4);
        }
    }

    public static /* synthetic */ int c() {
        return -1;
    }

    public static /* synthetic */ void d(long j11, int[] iArr) {
        synchronized (f.class) {
            try {
                int i11 = F - 1;
                F = i11;
                if (i11 == 0) {
                    Kernel32.SetConsoleMode(j11, iArr[0]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static g e(boolean z11) {
        boolean z12;
        boolean z13;
        AnsiType ansiType;
        boolean z14;
        a.InterfaceC0667a interfaceC0667a;
        a.InterfaceC0667a interfaceC0667a2;
        a.b bVar;
        AnsiType ansiType2;
        a.InterfaceC0667a interfaceC0667a3;
        a.InterfaceC0667a interfaceC0667a4;
        a.b bVar2;
        h80.b bVar3;
        AnsiType ansiType3;
        AnsiColors ansiColors;
        h80.e eVar = new h80.e(new FileOutputStream(z11 ? FileDescriptor.out : FileDescriptor.err));
        String property = System.getProperty(z11 ? "stdout.encoding" : "stderr.encoding");
        if (property == null) {
            property = System.getProperty(z11 ? "sun.stdout.encoding" : "sun.stderr.encoding");
        }
        int i11 = z11 ? B : C;
        try {
            z13 = CLibrary.isatty(i11) != 0;
            String str = System.getenv("TERM");
            String str2 = System.getenv("INSIDE_EMACS");
            if (z13 && "dumb".equals(str) && str2 != null) {
                if (!str2.contains("comint")) {
                    z13 = false;
                }
            }
            z12 = false;
        } catch (Throwable unused) {
            z12 = true;
            z13 = false;
        }
        h80.b bVar4 = null;
        if (!z13) {
            ansiType = z12 ? AnsiType.Unsupported : AnsiType.Redirected;
            z14 = true;
            bVar = new a.c();
            interfaceC0667a = null;
            interfaceC0667a2 = null;
        } else if (f51322w) {
            final long GetStdHandle = Kernel32.GetStdHandle(z11 ? Kernel32.f77836r : Kernel32.f77837s);
            final int[] iArr = new int[1];
            boolean z15 = Kernel32.GetConsoleMode(GetStdHandle, iArr) != 0;
            a.b aVar = new a(GetStdHandle);
            if (z15 && Kernel32.SetConsoleMode(GetStdHandle, iArr[0] | 4) != 0) {
                Kernel32.SetConsoleMode(GetStdHandle, iArr[0]);
                ansiType3 = AnsiType.VirtualTerminal;
                interfaceC0667a3 = new a.InterfaceC0667a() { // from class: f80.b
                    @Override // h80.a.InterfaceC0667a
                    public final void run() {
                        f.a(GetStdHandle, iArr);
                    }
                };
                interfaceC0667a4 = new a.InterfaceC0667a() { // from class: f80.c
                    @Override // h80.a.InterfaceC0667a
                    public final void run() {
                        f.d(GetStdHandle, iArr);
                    }
                };
            } else if ((f51325z || f51323x || f51324y) && !z15) {
                ansiType2 = AnsiType.Native;
                final g80.f fVar = new g80.f();
                final String a11 = fVar.a(z11);
                interfaceC0667a3 = null;
                interfaceC0667a4 = null;
                bVar2 = (a11 == null || a11.isEmpty()) ? new a.b() { // from class: f80.e
                    @Override // h80.a.b
                    public final int a() {
                        return f.c();
                    }
                } : new a.b() { // from class: f80.d
                    @Override // h80.a.b
                    public final int a() {
                        int c11;
                        c11 = g80.f.this.c(a11);
                        return c11;
                    }
                };
                a.b bVar5 = bVar2;
                ansiType = ansiType2;
                z14 = true;
                bVar = bVar5;
                interfaceC0667a = interfaceC0667a3;
                interfaceC0667a2 = interfaceC0667a4;
            } else {
                try {
                    bVar3 = new h80.f(eVar, GetStdHandle);
                    ansiType3 = AnsiType.Emulation;
                } catch (Throwable unused2) {
                    bVar3 = new h80.b(eVar);
                    ansiType3 = AnsiType.Unsupported;
                }
                interfaceC0667a3 = null;
                interfaceC0667a4 = null;
                bVar4 = bVar3;
            }
            ansiType2 = ansiType3;
            bVar2 = aVar;
            a.b bVar52 = bVar2;
            ansiType = ansiType2;
            z14 = true;
            bVar = bVar52;
            interfaceC0667a = interfaceC0667a3;
            interfaceC0667a2 = interfaceC0667a4;
        } else {
            ansiType = AnsiType.Native;
            a.b bVar6 = new b(i11);
            z14 = true;
            interfaceC0667a = null;
            interfaceC0667a2 = null;
            bVar = bVar6;
        }
        String property2 = System.getProperty(z11 ? f51301b : f51302c, System.getProperty(f51300a));
        AnsiMode ansiMode = f51304e.equals(property2) ? AnsiMode.Force : f51303d.equals(property2) ? AnsiMode.Strip : property2 != null ? z13 ? AnsiMode.Default : AnsiMode.Strip : g(f51312m) ? AnsiMode.Force : g(f51313n) ? AnsiMode.Strip : g(f51314o) ? AnsiMode.Force : z13 ? AnsiMode.Default : AnsiMode.Strip;
        String property3 = System.getProperty(z11 ? f51307h : f51308i, System.getProperty(f51306g));
        if (f51311l.equals(property3)) {
            ansiColors = AnsiColors.TrueColor;
        } else if (f51310k.equals(property3)) {
            ansiColors = AnsiColors.Colors256;
        } else if (property3 != null) {
            ansiColors = AnsiColors.Colors16;
        } else {
            String str3 = System.getenv("COLORTERM");
            if (str3 == null || !(str3.contains(f51311l) || str3.contains("24bit"))) {
                String str4 = System.getenv("TERM");
                ansiColors = (str4 == null || !str4.contains("-direct")) ? (str4 == null || !str4.contains("-256color")) ? AnsiColors.Colors16 : AnsiColors.Colors256 : AnsiColors.TrueColor;
            } else {
                ansiColors = AnsiColors.TrueColor;
            }
        }
        boolean z16 = (ansiType == AnsiType.Unsupported || g(f51316q)) ? false : z14;
        Charset defaultCharset = Charset.defaultCharset();
        if (property != null) {
            try {
                defaultCharset = Charset.forName(property);
            } catch (UnsupportedCharsetException unused3) {
            }
        }
        Charset charset = defaultCharset;
        return k(new h80.a(eVar, bVar, ansiMode, bVar4, ansiType, ansiColors, charset, interfaceC0667a, interfaceC0667a2, z16), charset.name());
    }

    public static g f() {
        i();
        return (g) f51321v;
    }

    public static boolean g(String str) {
        try {
            String property = System.getProperty(str);
            if (property.isEmpty()) {
                return true;
            }
            return Boolean.parseBoolean(property);
        } catch (IllegalArgumentException | NullPointerException unused) {
            return false;
        }
    }

    public static int h() {
        int f11 = l().f();
        return f11 <= 0 ? f().f() : f11;
    }

    public static synchronized void i() {
        synchronized (f.class) {
            if (!D) {
                f51319t = e(true);
                f51321v = e(false);
                D = true;
            }
        }
    }

    public static synchronized boolean j() {
        boolean z11;
        synchronized (f.class) {
            z11 = E > 0;
        }
        return z11;
    }

    public static g k(h80.a aVar, String str) {
        if (str != null) {
            try {
                return new g(aVar, true, str);
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return new g(aVar, true);
    }

    public static g l() {
        i();
        return (g) f51319t;
    }

    public static PrintStream m() {
        return f51320u;
    }

    public static PrintStream n() {
        return f51318s;
    }

    public static synchronized void o() {
        synchronized (f.class) {
            try {
                if (E == 0) {
                    i();
                    try {
                        ((g) f51319t).k();
                        ((g) f51321v).k();
                        System.setOut(f51319t);
                        System.setErr(f51321v);
                    } catch (IOException e11) {
                        throw new IOError(e11);
                    }
                }
                E++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized void p() {
        synchronized (f.class) {
            try {
                int i11 = E - 1;
                E = i11;
                if (i11 == 0) {
                    try {
                        ((g) f51319t).C();
                        ((g) f51321v).C();
                        D = false;
                        System.setOut(f51318s);
                        System.setErr(f51320u);
                    } catch (IOException e11) {
                        throw new IOError(e11);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
