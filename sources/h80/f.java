package h80;

import java.io.IOException;
import java.io.OutputStream;
import org.fusesource.jansi.internal.Kernel32;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class f extends b {
    public static final short J = 0;
    public static final short K;
    public static final short L;
    public static final short M;
    public static final short N;
    public static final short O = 0;
    public static final short P;
    public static final short Q;
    public static final short R;
    public static final short S;
    public static final short[] T;
    public static final short[] U;
    public final long D;
    public final Kernel32.CONSOLE_SCREEN_BUFFER_INFO E;
    public final short F;
    public boolean G;
    public short H;
    public short I;

    static {
        short s11 = (short) (Kernel32.f77821c | Kernel32.f77820b);
        K = s11;
        short s12 = (short) (Kernel32.f77819a | Kernel32.f77821c);
        L = s12;
        short s13 = (short) (Kernel32.f77819a | Kernel32.f77820b);
        M = s13;
        short s14 = (short) (Kernel32.f77821c | Kernel32.f77820b | Kernel32.f77819a);
        N = s14;
        short s15 = (short) (Kernel32.f77825g | Kernel32.f77824f);
        P = s15;
        short s16 = (short) (Kernel32.f77823e | Kernel32.f77825g);
        Q = s16;
        short s17 = (short) (Kernel32.f77823e | Kernel32.f77824f);
        R = s17;
        short s18 = (short) (Kernel32.f77825g | Kernel32.f77824f | Kernel32.f77823e);
        S = s18;
        T = new short[]{0, Kernel32.f77821c, Kernel32.f77820b, s11, Kernel32.f77819a, s12, s13, s14};
        U = new short[]{0, Kernel32.f77825g, Kernel32.f77824f, s15, Kernel32.f77823e, s16, s17, s18};
    }

    public f(OutputStream outputStream, long j11) throws IOException {
        super(outputStream);
        Kernel32.CONSOLE_SCREEN_BUFFER_INFO console_screen_buffer_info = new Kernel32.CONSOLE_SCREEN_BUFFER_INFO();
        this.E = console_screen_buffer_info;
        this.H = (short) -1;
        this.I = (short) -1;
        this.D = j11;
        Q();
        this.F = console_screen_buffer_info.f77845c;
    }

    @Override // h80.b
    public void A() throws IOException {
        Q();
        Kernel32.COORD coord = this.E.f77844b;
        this.H = coord.f77849a;
        this.I = coord.f77850b;
    }

    @Override // h80.b
    public void D(int i11) throws IOException {
        if (i11 == 1) {
            Kernel32.CONSOLE_SCREEN_BUFFER_INFO console_screen_buffer_info = this.E;
            console_screen_buffer_info.f77845c = (short) (console_screen_buffer_info.f77845c | Kernel32.f77822d);
            O();
            return;
        }
        if (i11 == 4) {
            Kernel32.CONSOLE_SCREEN_BUFFER_INFO console_screen_buffer_info2 = this.E;
            console_screen_buffer_info2.f77845c = (short) (console_screen_buffer_info2.f77845c | Kernel32.f77826h);
            O();
            return;
        }
        if (i11 == 7) {
            this.G = true;
            O();
            return;
        }
        if (i11 == 22) {
            Kernel32.CONSOLE_SCREEN_BUFFER_INFO console_screen_buffer_info3 = this.E;
            console_screen_buffer_info3.f77845c = (short) (console_screen_buffer_info3.f77845c & (~Kernel32.f77822d));
            O();
        } else if (i11 == 24) {
            Kernel32.CONSOLE_SCREEN_BUFFER_INFO console_screen_buffer_info4 = this.E;
            console_screen_buffer_info4.f77845c = (short) (console_screen_buffer_info4.f77845c & (~Kernel32.f77826h));
            O();
        } else {
            if (i11 != 27) {
                return;
            }
            this.G = false;
            O();
        }
    }

    @Override // h80.b
    public void F(int i11, boolean z11) throws IOException {
        Kernel32.CONSOLE_SCREEN_BUFFER_INFO console_screen_buffer_info = this.E;
        short s11 = (short) (U[i11] | (console_screen_buffer_info.f77845c & (-113)));
        console_screen_buffer_info.f77845c = s11;
        if (z11) {
            console_screen_buffer_info.f77845c = (short) (s11 | Kernel32.f77826h);
        }
        O();
    }

    @Override // h80.b
    public void G(int i11) throws IOException {
        int h11 = c.h(i11, 16);
        F(h11 >= 8 ? h11 - 8 : h11, h11 >= 8);
    }

    @Override // h80.b
    public void H(int i11, int i12, int i13) throws IOException {
        int j11 = c.j(i11, i12, i13, 16);
        F(j11 >= 8 ? j11 - 8 : j11, j11 >= 8);
    }

    @Override // h80.b
    public void J(int i11, boolean z11) throws IOException {
        Kernel32.CONSOLE_SCREEN_BUFFER_INFO console_screen_buffer_info = this.E;
        short s11 = (short) (T[i11] | (console_screen_buffer_info.f77845c & (-8)));
        console_screen_buffer_info.f77845c = s11;
        if (z11) {
            console_screen_buffer_info.f77845c = (short) (s11 | Kernel32.f77822d);
        }
        O();
    }

    @Override // h80.b
    public void K(int i11) throws IOException {
        int h11 = c.h(i11, 16);
        J(h11 >= 8 ? h11 - 8 : h11, h11 >= 8);
    }

    @Override // h80.b
    public void L(int i11, int i12, int i13) throws IOException {
        int j11 = c.j(i11, i12, i13, 16);
        J(j11 >= 8 ? j11 - 8 : j11, j11 >= 8);
    }

    public final void O() throws IOException {
        this.f59038a.flush();
        short s11 = this.E.f77845c;
        if (this.G) {
            s11 = R(s11);
        }
        if (Kernel32.SetConsoleTextAttribute(this.D, s11) == 0) {
            throw new IOException(Kernel32.b());
        }
    }

    public final void P() throws IOException {
        if (Kernel32.SetConsoleCursorPosition(this.D, this.E.f77844b.a()) == 0) {
            throw new IOException(Kernel32.b());
        }
    }

    public final void Q() throws IOException {
        this.f59038a.flush();
        if (Kernel32.GetConsoleScreenBufferInfo(this.D, this.E) == 0) {
            throw new IOException("Could not get the screen info: " + Kernel32.b());
        }
        if (this.G) {
            Kernel32.CONSOLE_SCREEN_BUFFER_INFO console_screen_buffer_info = this.E;
            console_screen_buffer_info.f77845c = R(console_screen_buffer_info.f77845c);
        }
    }

    public final short R(short s11) {
        return (short) ((s11 & 65280) | ((s11 & 15) << 4) | ((s11 & 240) >> 4));
    }

    @Override // h80.b
    public void d() throws IOException {
        Kernel32.CONSOLE_SCREEN_BUFFER_INFO console_screen_buffer_info = this.E;
        console_screen_buffer_info.f77845c = (short) ((console_screen_buffer_info.f77845c & (-256)) | this.F);
        this.G = false;
        O();
    }

    @Override // h80.b
    public void g(String str) {
        Kernel32.SetConsoleTitle(str);
    }

    @Override // h80.b
    public void j(int i11) throws IOException {
        Q();
        this.E.f77844b.f77850b = (short) Math.min(Math.max(0, r0.f77843a.f77850b - 1), this.E.f77844b.f77850b + i11);
        P();
    }

    @Override // h80.b
    public void k(int i11) throws IOException {
        Q();
        Kernel32.CONSOLE_SCREEN_BUFFER_INFO console_screen_buffer_info = this.E;
        Kernel32.COORD coord = console_screen_buffer_info.f77844b;
        coord.f77849a = (short) 0;
        coord.f77850b = (short) Math.max((int) console_screen_buffer_info.f77846d.f77908b, coord.f77850b + i11);
        P();
    }

    @Override // h80.b
    public void l(int i11) throws IOException {
        Q();
        Kernel32.COORD coord = this.E.f77844b;
        coord.f77849a = (short) Math.max(0, coord.f77849a - i11);
        P();
    }

    @Override // h80.b
    public void m(int i11) throws IOException {
        Q();
        Kernel32.CONSOLE_SCREEN_BUFFER_INFO console_screen_buffer_info = this.E;
        console_screen_buffer_info.f77844b.f77849a = (short) Math.min((int) console_screen_buffer_info.f77846d.c(), this.E.f77844b.f77849a + i11);
        P();
    }

    @Override // h80.b
    public void n(int i11, int i12) throws IOException {
        Q();
        Kernel32.CONSOLE_SCREEN_BUFFER_INFO console_screen_buffer_info = this.E;
        console_screen_buffer_info.f77844b.f77850b = (short) Math.max((int) console_screen_buffer_info.f77846d.f77908b, Math.min((int) console_screen_buffer_info.f77843a.f77850b, (i11 + r2) - 1));
        Kernel32.CONSOLE_SCREEN_BUFFER_INFO console_screen_buffer_info2 = this.E;
        console_screen_buffer_info2.f77844b.f77849a = (short) Math.max(0, Math.min((int) console_screen_buffer_info2.f77846d.c(), i12 - 1));
        P();
    }

    @Override // h80.b
    public void o(int i11) throws IOException {
        Q();
        Kernel32.CONSOLE_SCREEN_BUFFER_INFO console_screen_buffer_info = this.E;
        console_screen_buffer_info.f77844b.f77849a = (short) Math.max(0, Math.min((int) console_screen_buffer_info.f77846d.c(), i11 - 1));
        P();
    }

    @Override // h80.b
    public void p(int i11) throws IOException {
        Q();
        Kernel32.CONSOLE_SCREEN_BUFFER_INFO console_screen_buffer_info = this.E;
        Kernel32.COORD coord = console_screen_buffer_info.f77844b;
        coord.f77850b = (short) Math.max((int) console_screen_buffer_info.f77846d.f77908b, coord.f77850b - i11);
        P();
    }

    @Override // h80.b
    public void q(int i11) throws IOException {
        Q();
        Kernel32.CONSOLE_SCREEN_BUFFER_INFO console_screen_buffer_info = this.E;
        Kernel32.COORD coord = console_screen_buffer_info.f77844b;
        coord.f77849a = (short) 0;
        coord.f77850b = (short) Math.max((int) console_screen_buffer_info.f77846d.f77908b, coord.f77850b - i11);
        P();
    }

    @Override // h80.b
    public void r() throws IOException {
        Kernel32.CONSOLE_SCREEN_BUFFER_INFO console_screen_buffer_info = this.E;
        short s11 = (short) ((console_screen_buffer_info.f77845c & (-241)) | (this.F & 240));
        console_screen_buffer_info.f77845c = s11;
        console_screen_buffer_info.f77845c = (short) (s11 & (~Kernel32.f77826h));
        O();
    }

    @Override // h80.b
    public void s() throws IOException {
        Kernel32.CONSOLE_SCREEN_BUFFER_INFO console_screen_buffer_info = this.E;
        short s11 = (short) ((console_screen_buffer_info.f77845c & (-16)) | (this.F & 15));
        console_screen_buffer_info.f77845c = s11;
        console_screen_buffer_info.f77845c = (short) (s11 & (~Kernel32.f77822d));
        O();
    }

    @Override // h80.b
    public void t(int i11) throws IOException {
        Q();
        Kernel32.SMALL_RECT a11 = this.E.f77846d.a();
        a11.f77908b = this.E.f77844b.f77850b;
        Kernel32.COORD coord = new Kernel32.COORD();
        coord.f77849a = (short) 0;
        coord.f77850b = (short) (this.E.f77844b.f77850b - i11);
        Kernel32.CHAR_INFO char_info = new Kernel32.CHAR_INFO();
        char_info.f77840a = this.F;
        char_info.f77841b = ' ';
        if (Kernel32.ScrollConsoleScreenBuffer(this.D, a11, a11, coord, char_info) == 0) {
            throw new IOException(Kernel32.b());
        }
    }

    @Override // h80.b
    public void u(int i11) throws IOException {
        Q();
        int[] iArr = new int[1];
        if (i11 == 0) {
            Kernel32.CONSOLE_SCREEN_BUFFER_INFO console_screen_buffer_info = this.E;
            short s11 = console_screen_buffer_info.f77843a.f77849a;
            Kernel32.COORD coord = console_screen_buffer_info.f77844b;
            int i12 = s11 - coord.f77849a;
            Kernel32.FillConsoleOutputAttribute(this.D, console_screen_buffer_info.f77845c, i12, coord.a(), iArr);
            Kernel32.FillConsoleOutputCharacterW(this.D, ' ', i12, this.E.f77844b.a(), iArr);
            return;
        }
        if (i11 == 1) {
            Kernel32.COORD a11 = this.E.f77844b.a();
            a11.f77849a = (short) 0;
            long j11 = this.D;
            Kernel32.CONSOLE_SCREEN_BUFFER_INFO console_screen_buffer_info2 = this.E;
            Kernel32.FillConsoleOutputAttribute(j11, console_screen_buffer_info2.f77845c, console_screen_buffer_info2.f77844b.f77849a, a11, iArr);
            Kernel32.FillConsoleOutputCharacterW(this.D, ' ', this.E.f77844b.f77849a, a11, iArr);
            return;
        }
        if (i11 != 2) {
            return;
        }
        Kernel32.COORD a12 = this.E.f77844b.a();
        a12.f77849a = (short) 0;
        long j12 = this.D;
        Kernel32.CONSOLE_SCREEN_BUFFER_INFO console_screen_buffer_info3 = this.E;
        Kernel32.FillConsoleOutputAttribute(j12, console_screen_buffer_info3.f77845c, console_screen_buffer_info3.f77843a.f77849a, a12, iArr);
        Kernel32.FillConsoleOutputCharacterW(this.D, ' ', this.E.f77843a.f77849a, a12, iArr);
    }

    @Override // h80.b
    public void v(int i11) throws IOException {
        Q();
        int[] iArr = new int[1];
        if (i11 == 0) {
            Kernel32.CONSOLE_SCREEN_BUFFER_INFO console_screen_buffer_info = this.E;
            short s11 = console_screen_buffer_info.f77846d.f77910d;
            Kernel32.COORD coord = console_screen_buffer_info.f77844b;
            int i12 = s11 - coord.f77850b;
            short s12 = console_screen_buffer_info.f77843a.f77849a;
            int i13 = (i12 * s12) + (s12 - coord.f77849a);
            Kernel32.FillConsoleOutputAttribute(this.D, console_screen_buffer_info.f77845c, i13, coord.a(), iArr);
            Kernel32.FillConsoleOutputCharacterW(this.D, ' ', i13, this.E.f77844b.a(), iArr);
            return;
        }
        if (i11 == 1) {
            Kernel32.COORD coord2 = new Kernel32.COORD();
            coord2.f77849a = (short) 0;
            Kernel32.CONSOLE_SCREEN_BUFFER_INFO console_screen_buffer_info2 = this.E;
            short s13 = console_screen_buffer_info2.f77846d.f77908b;
            coord2.f77850b = s13;
            Kernel32.COORD coord3 = console_screen_buffer_info2.f77844b;
            int i14 = ((coord3.f77850b - s13) * console_screen_buffer_info2.f77843a.f77849a) + coord3.f77849a;
            Kernel32.FillConsoleOutputAttribute(this.D, console_screen_buffer_info2.f77845c, i14, coord2, iArr);
            Kernel32.FillConsoleOutputCharacterW(this.D, ' ', i14, coord2, iArr);
            return;
        }
        if (i11 != 2) {
            return;
        }
        Kernel32.COORD coord4 = new Kernel32.COORD();
        coord4.f77849a = (short) 0;
        Kernel32.SMALL_RECT small_rect = this.E.f77846d;
        coord4.f77850b = small_rect.f77908b;
        short b11 = small_rect.b();
        Kernel32.CONSOLE_SCREEN_BUFFER_INFO console_screen_buffer_info3 = this.E;
        int i15 = b11 * console_screen_buffer_info3.f77843a.f77849a;
        Kernel32.FillConsoleOutputAttribute(this.D, console_screen_buffer_info3.f77845c, i15, coord4, iArr);
        Kernel32.FillConsoleOutputCharacterW(this.D, ' ', i15, coord4, iArr);
    }

    @Override // h80.b
    public void x(int i11) throws IOException {
        Q();
        Kernel32.SMALL_RECT a11 = this.E.f77846d.a();
        a11.f77908b = this.E.f77844b.f77850b;
        Kernel32.COORD coord = new Kernel32.COORD();
        coord.f77849a = (short) 0;
        coord.f77850b = (short) (this.E.f77844b.f77850b + i11);
        Kernel32.CHAR_INFO char_info = new Kernel32.CHAR_INFO();
        char_info.f77840a = this.F;
        char_info.f77841b = ' ';
        if (Kernel32.ScrollConsoleScreenBuffer(this.D, a11, a11, coord, char_info) == 0) {
            throw new IOException(Kernel32.b());
        }
    }

    @Override // h80.b
    public void z() throws IOException {
        if (this.H == -1 || this.I == -1) {
            return;
        }
        this.f59038a.flush();
        Kernel32.COORD coord = this.E.f77844b;
        coord.f77849a = this.H;
        coord.f77850b = this.I;
        P();
    }

    public f(OutputStream outputStream, boolean z11) throws IOException {
        this(outputStream, Kernel32.GetStdHandle(z11 ? Kernel32.f77836r : Kernel32.f77837s));
    }

    public f(OutputStream outputStream) throws IOException {
        this(outputStream, true);
    }
}
