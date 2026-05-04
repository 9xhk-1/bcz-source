package h80;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import org.fusesource.jansi.AnsiColors;
import org.fusesource.jansi.AnsiMode;
import org.fusesource.jansi.AnsiType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class a extends FilterOutputStream {
    public static final int A = 27;
    public static final int B = 91;
    public static final int C = 93;
    public static final int D = 7;
    public static final int E = 92;
    public static final int F = 40;
    public static final int G = 41;
    public static final int H = 100;

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f58987p = "\u001b[0m".getBytes(StandardCharsets.US_ASCII);

    /* renamed from: q, reason: collision with root package name */
    public static final int f58988q = 0;

    /* renamed from: r, reason: collision with root package name */
    public static final int f58989r = 1;

    /* renamed from: s, reason: collision with root package name */
    public static final int f58990s = 2;

    /* renamed from: t, reason: collision with root package name */
    public static final int f58991t = 3;

    /* renamed from: u, reason: collision with root package name */
    public static final int f58992u = 4;

    /* renamed from: v, reason: collision with root package name */
    public static final int f58993v = 5;

    /* renamed from: w, reason: collision with root package name */
    public static final int f58994w = 6;

    /* renamed from: x, reason: collision with root package name */
    public static final int f58995x = 7;

    /* renamed from: y, reason: collision with root package name */
    public static final int f58996y = 8;

    /* renamed from: z, reason: collision with root package name */
    public static final int f58997z = 9;

    /* renamed from: a, reason: collision with root package name */
    public h80.b f58998a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f58999b;

    /* renamed from: c, reason: collision with root package name */
    public int f59000c;

    /* renamed from: d, reason: collision with root package name */
    public int f59001d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList<Object> f59002e;

    /* renamed from: f, reason: collision with root package name */
    public int f59003f;

    /* renamed from: g, reason: collision with root package name */
    public final Charset f59004g;

    /* renamed from: h, reason: collision with root package name */
    public final b f59005h;

    /* renamed from: i, reason: collision with root package name */
    public final h80.b f59006i;

    /* renamed from: j, reason: collision with root package name */
    public final AnsiType f59007j;

    /* renamed from: k, reason: collision with root package name */
    public final AnsiColors f59008k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0667a f59009l;

    /* renamed from: m, reason: collision with root package name */
    public final InterfaceC0667a f59010m;

    /* renamed from: n, reason: collision with root package name */
    public AnsiMode f59011n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f59012o;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @FunctionalInterface
    /* renamed from: h80.a$a, reason: collision with other inner class name */
    public interface InterfaceC0667a {
        void run() throws IOException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @FunctionalInterface
    public interface b {
        int a();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements b {
        @Override // h80.a.b
        public int a() {
            return 0;
        }
    }

    public a(OutputStream outputStream, b bVar, AnsiMode ansiMode, h80.b bVar2, AnsiType ansiType, AnsiColors ansiColors, Charset charset, InterfaceC0667a interfaceC0667a, InterfaceC0667a interfaceC0667a2, boolean z11) {
        super(outputStream);
        this.f58999b = new byte[100];
        this.f59000c = 0;
        this.f59002e = new ArrayList<>();
        this.f59003f = 0;
        this.f59005h = bVar;
        this.f59006i = bVar2;
        this.f59007j = ansiType;
        this.f59008k = ansiColors;
        this.f59009l = interfaceC0667a;
        this.f59010m = interfaceC0667a2;
        this.f59012o = z11;
        this.f59004g = charset;
        E(ansiMode);
    }

    public final void C(boolean z11) throws IOException {
        if (!z11) {
            ((FilterOutputStream) this).out.write(this.f58999b, 0, this.f59000c);
        }
        this.f59000c = 0;
        this.f59001d = 0;
        this.f59002e.clear();
        this.f59003f = 0;
    }

    public void E(AnsiMode ansiMode) {
        h80.b dVar;
        if (ansiMode == AnsiMode.Strip) {
            dVar = new h80.b(((FilterOutputStream) this).out);
        } else if (ansiMode == AnsiMode.Force || (dVar = this.f59006i) == null) {
            dVar = new d(((FilterOutputStream) this).out, this.f59008k);
        }
        this.f58998a = dVar;
        this.f59011n = ansiMode;
    }

    public void H(boolean z11) {
        this.f59012o = z11;
    }

    public void I() throws IOException {
        AnsiType ansiType;
        if (this.f59012o && (ansiType = this.f59007j) != AnsiType.Redirected && ansiType != AnsiType.Unsupported) {
            E(AnsiMode.Default);
            write(f58987p);
            flush();
        }
        InterfaceC0667a interfaceC0667a = this.f59010m;
        if (interfaceC0667a != null) {
            interfaceC0667a.run();
        }
    }

    public AnsiColors a() {
        return this.f59008k;
    }

    public AnsiMode c() {
        return this.f59011n;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        I();
        super.close();
    }

    public int e() {
        return this.f59005h.a();
    }

    public AnsiType f() {
        return this.f59007j;
    }

    public void j() throws IOException {
        InterfaceC0667a interfaceC0667a = this.f59009l;
        if (interfaceC0667a != null) {
            interfaceC0667a.run();
        }
    }

    public boolean k() {
        return this.f59012o;
    }

    public final void q() throws IOException {
        try {
            h80.b bVar = this.f58998a;
            C(bVar != null && bVar.i(this.f59002e));
        } catch (RuntimeException e11) {
            C(true);
            throw e11;
        }
    }

    public final void r(int i11) throws IOException {
        try {
            h80.b bVar = this.f58998a;
            C(bVar != null && bVar.w(this.f59002e, i11));
        } catch (RuntimeException e11) {
            C(true);
            throw e11;
        }
    }

    public final void w() throws IOException {
        try {
            h80.b bVar = this.f58998a;
            C(bVar != null && bVar.y(this.f59002e));
        } catch (RuntimeException e11) {
            C(true);
            throw e11;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i11) throws IOException {
        switch (this.f59003f) {
            case 0:
                if (i11 != 27) {
                    ((FilterOutputStream) this).out.write(i11);
                    break;
                } else {
                    byte[] bArr = this.f58999b;
                    int i12 = this.f59000c;
                    this.f59000c = i12 + 1;
                    bArr[i12] = (byte) i11;
                    this.f59003f = 1;
                    break;
                }
            case 1:
                byte[] bArr2 = this.f58999b;
                int i13 = this.f59000c;
                this.f59000c = i13 + 1;
                bArr2[i13] = (byte) i11;
                if (i11 != 91) {
                    if (i11 != 93) {
                        if (i11 != 40) {
                            if (i11 != 41) {
                                C(false);
                                break;
                            } else {
                                this.f59002e.add(1);
                                this.f59003f = 9;
                                break;
                            }
                        } else {
                            this.f59002e.add(0);
                            this.f59003f = 9;
                            break;
                        }
                    } else {
                        this.f59003f = 5;
                        break;
                    }
                } else {
                    this.f59003f = 2;
                    break;
                }
            case 2:
                byte[] bArr3 = this.f58999b;
                int i14 = this.f59000c;
                this.f59000c = i14 + 1;
                bArr3[i14] = (byte) i11;
                if (34 != i11) {
                    if (48 <= i11 && i11 <= 57) {
                        this.f59001d = i14;
                        this.f59003f = 4;
                        break;
                    } else if (59 != i11) {
                        if (63 != i11) {
                            if (61 != i11) {
                                r(i11);
                                break;
                            } else {
                                this.f59002e.add('=');
                                break;
                            }
                        } else {
                            this.f59002e.add(Character.valueOf(s60.d.f88057a));
                            break;
                        }
                    } else {
                        this.f59002e.add(null);
                        break;
                    }
                } else {
                    this.f59001d = i14;
                    this.f59003f = 3;
                    break;
                }
            case 3:
                byte[] bArr4 = this.f58999b;
                int i15 = this.f59000c;
                this.f59000c = i15 + 1;
                bArr4[i15] = (byte) i11;
                if (34 != i11) {
                    int i16 = this.f59001d;
                    this.f59002e.add(new String(bArr4, i16, i15 - i16, this.f59004g));
                    if (i11 != 59) {
                        r(i11);
                        break;
                    } else {
                        this.f59003f = 2;
                        break;
                    }
                }
                break;
            case 4:
                byte[] bArr5 = this.f58999b;
                int i17 = this.f59000c;
                this.f59000c = i17 + 1;
                bArr5[i17] = (byte) i11;
                if (48 > i11 || i11 > 57) {
                    int i18 = this.f59001d;
                    this.f59002e.add(Integer.valueOf(new String(bArr5, i18, i17 - i18)));
                    if (i11 != 59) {
                        r(i11);
                        break;
                    } else {
                        this.f59003f = 2;
                        break;
                    }
                }
            case 5:
                byte[] bArr6 = this.f58999b;
                int i19 = this.f59000c;
                this.f59000c = i19 + 1;
                bArr6[i19] = (byte) i11;
                if (48 <= i11 && i11 <= 57) {
                    this.f59001d = i19;
                    this.f59003f = 6;
                    break;
                } else {
                    C(false);
                    break;
                }
            case 6:
                byte[] bArr7 = this.f58999b;
                int i21 = this.f59000c;
                this.f59000c = i21 + 1;
                bArr7[i21] = (byte) i11;
                if (59 != i11) {
                    if (48 > i11 || i11 > 57) {
                        C(false);
                        break;
                    }
                } else {
                    int i22 = this.f59001d;
                    this.f59002e.add(Integer.valueOf(new String(bArr7, i22, i21 - i22)));
                    this.f59001d = this.f59000c;
                    this.f59003f = 7;
                    break;
                }
            case 7:
                byte[] bArr8 = this.f58999b;
                int i23 = this.f59000c;
                this.f59000c = i23 + 1;
                bArr8[i23] = (byte) i11;
                if (7 != i11) {
                    if (27 == i11) {
                        this.f59003f = 8;
                        break;
                    }
                } else {
                    int i24 = this.f59001d;
                    this.f59002e.add(new String(bArr8, i24, i23 - i24, this.f59004g));
                    w();
                    break;
                }
                break;
            case 8:
                byte[] bArr9 = this.f58999b;
                int i25 = this.f59000c;
                this.f59000c = i25 + 1;
                bArr9[i25] = (byte) i11;
                if (92 != i11) {
                    this.f59003f = 7;
                    break;
                } else {
                    int i26 = this.f59001d;
                    this.f59002e.add(new String(bArr9, i26, (i25 - 1) - i26, this.f59004g));
                    w();
                    break;
                }
            case 9:
                this.f59002e.add(Character.valueOf((char) i11));
                q();
                break;
        }
        if (this.f59000c >= this.f58999b.length) {
            C(false);
        }
    }
}
