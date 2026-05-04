package cp;

import com.google.gson.internal.g;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import n6.m;
import r60.e;
import xo.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a implements Closeable {
    public static final int A = 10;
    public static final int B = 11;
    public static final int C = 12;
    public static final int D = 13;
    public static final int E = 14;
    public static final int F = 15;
    public static final int G = 16;
    public static final int H = 17;
    public static final int I = 0;
    public static final int J = 1;
    public static final int K = 2;
    public static final int L = 3;
    public static final int M = 4;
    public static final int N = 5;
    public static final int O = 6;
    public static final int P = 7;
    public static final int Q = 1024;

    /* renamed from: p, reason: collision with root package name */
    public static final long f46769p = -922337203685477580L;

    /* renamed from: q, reason: collision with root package name */
    public static final int f46770q = 0;

    /* renamed from: r, reason: collision with root package name */
    public static final int f46771r = 1;

    /* renamed from: s, reason: collision with root package name */
    public static final int f46772s = 2;

    /* renamed from: t, reason: collision with root package name */
    public static final int f46773t = 3;

    /* renamed from: u, reason: collision with root package name */
    public static final int f46774u = 4;

    /* renamed from: v, reason: collision with root package name */
    public static final int f46775v = 5;

    /* renamed from: w, reason: collision with root package name */
    public static final int f46776w = 6;

    /* renamed from: x, reason: collision with root package name */
    public static final int f46777x = 7;

    /* renamed from: y, reason: collision with root package name */
    public static final int f46778y = 8;

    /* renamed from: z, reason: collision with root package name */
    public static final int f46779z = 9;

    /* renamed from: a, reason: collision with root package name */
    public final Reader f46780a;

    /* renamed from: i, reason: collision with root package name */
    public long f46788i;

    /* renamed from: j, reason: collision with root package name */
    public int f46789j;

    /* renamed from: k, reason: collision with root package name */
    public String f46790k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f46791l;

    /* renamed from: n, reason: collision with root package name */
    public String[] f46793n;

    /* renamed from: o, reason: collision with root package name */
    public int[] f46794o;

    /* renamed from: b, reason: collision with root package name */
    public boolean f46781b = false;

    /* renamed from: c, reason: collision with root package name */
    public final char[] f46782c = new char[1024];

    /* renamed from: d, reason: collision with root package name */
    public int f46783d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f46784e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f46785f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f46786g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f46787h = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f46792m = 1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: cp.a$a, reason: collision with other inner class name */
    public class C0539a extends g {
        @Override // com.google.gson.internal.g
        public void a(a aVar) throws IOException {
            if (aVar instanceof f) {
                ((f) aVar).K0();
                return;
            }
            int i11 = aVar.f46787h;
            if (i11 == 0) {
                i11 = aVar.j();
            }
            if (i11 == 13) {
                aVar.f46787h = 9;
                return;
            }
            if (i11 == 12) {
                aVar.f46787h = 8;
                return;
            }
            if (i11 == 14) {
                aVar.f46787h = 10;
                return;
            }
            throw new IllegalStateException("Expected a name but was " + aVar.k0() + aVar.L());
        }
    }

    static {
        g.f35036a = new C0539a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f46791l = iArr;
        iArr[0] = 6;
        this.f46793n = new String[32];
        this.f46794o = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f46780a = reader;
    }

    private String w(boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i11 = 0;
        while (true) {
            int i12 = this.f46792m;
            if (i11 >= i12) {
                return sb2.toString();
            }
            int i13 = this.f46791l[i11];
            if (i13 == 1 || i13 == 2) {
                int i14 = this.f46794o[i11];
                if (z11 && i14 > 0 && i11 == i12 - 1) {
                    i14--;
                }
                sb2.append('[');
                sb2.append(i14);
                sb2.append(l50.b.f69930l);
            } else if (i13 == 3 || i13 == 4 || i13 == 5) {
                sb2.append('.');
                String str = this.f46793n[i11];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i11++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0() throws java.io.IOException {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f46783d
            int r2 = r1 + r0
            int r3 = r4.f46784e
            if (r2 >= r3) goto L51
            char[] r2 = r4.f46782c
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.e()
        L4b:
            int r1 = r4.f46783d
            int r1 = r1 + r0
            r4.f46783d = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f46783d = r1
            r0 = 1
            boolean r0 = r4.r(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cp.a.A0():void");
    }

    public String C() {
        return w(true);
    }

    public void C0() throws IOException {
        int i11 = 0;
        do {
            int i12 = this.f46787h;
            if (i12 == 0) {
                i12 = j();
            }
            if (i12 == 3) {
                s0(1);
            } else if (i12 == 1) {
                s0(3);
            } else {
                if (i12 == 4) {
                    this.f46792m--;
                } else if (i12 == 2) {
                    this.f46792m--;
                } else {
                    if (i12 == 14 || i12 == 10) {
                        A0();
                    } else if (i12 == 8 || i12 == 12) {
                        x0('\'');
                    } else if (i12 == 9 || i12 == 13) {
                        x0('\"');
                    } else if (i12 == 16) {
                        this.f46783d += this.f46789j;
                    }
                    this.f46787h = 0;
                }
                i11--;
                this.f46787h = 0;
            }
            i11++;
            this.f46787h = 0;
        } while (i11 != 0);
        int[] iArr = this.f46794o;
        int i13 = this.f46792m;
        int i14 = i13 - 1;
        iArr[i14] = iArr[i14] + 1;
        this.f46793n[i13 - 1] = "null";
    }

    public final IOException D0(String str) throws IOException {
        throw new MalformedJsonException(str + L());
    }

    public boolean E() throws IOException {
        int i11 = this.f46787h;
        if (i11 == 0) {
            i11 = j();
        }
        return (i11 == 2 || i11 == 4 || i11 == 17) ? false : true;
    }

    public final boolean H() {
        return this.f46781b;
    }

    public final boolean I(char c11) throws IOException {
        if (c11 == '\t' || c11 == '\n' || c11 == '\f' || c11 == '\r' || c11 == ' ') {
            return false;
        }
        if (c11 != '#') {
            if (c11 == ',') {
                return false;
            }
            if (c11 != '/' && c11 != '=') {
                if (c11 == '{' || c11 == '}' || c11 == ':') {
                    return false;
                }
                if (c11 != ';') {
                    switch (c11) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        e();
        return false;
    }

    public String L() {
        return " at line " + (this.f46785f + 1) + " column " + ((this.f46783d - this.f46786g) + 1) + " path " + getPath();
    }

    public boolean S() throws IOException {
        int i11 = this.f46787h;
        if (i11 == 0) {
            i11 = j();
        }
        if (i11 == 5) {
            this.f46787h = 0;
            int[] iArr = this.f46794o;
            int i12 = this.f46792m - 1;
            iArr[i12] = iArr[i12] + 1;
            return true;
        }
        if (i11 == 6) {
            this.f46787h = 0;
            int[] iArr2 = this.f46794o;
            int i13 = this.f46792m - 1;
            iArr2[i13] = iArr2[i13] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + k0() + L());
    }

    public double U() throws IOException {
        int i11 = this.f46787h;
        if (i11 == 0) {
            i11 = j();
        }
        if (i11 == 15) {
            this.f46787h = 0;
            int[] iArr = this.f46794o;
            int i12 = this.f46792m - 1;
            iArr[i12] = iArr[i12] + 1;
            return this.f46788i;
        }
        if (i11 == 16) {
            this.f46790k = new String(this.f46782c, this.f46783d, this.f46789j);
            this.f46783d += this.f46789j;
        } else if (i11 == 8 || i11 == 9) {
            this.f46790k = f0(i11 == 8 ? '\'' : '\"');
        } else if (i11 == 10) {
            this.f46790k = i0();
        } else if (i11 != 11) {
            throw new IllegalStateException("Expected a double but was " + k0() + L());
        }
        this.f46787h = 11;
        double parseDouble = Double.parseDouble(this.f46790k);
        if (!this.f46781b && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + parseDouble + L());
        }
        this.f46790k = null;
        this.f46787h = 0;
        int[] iArr2 = this.f46794o;
        int i13 = this.f46792m - 1;
        iArr2[i13] = iArr2[i13] + 1;
        return parseDouble;
    }

    public int V() throws IOException {
        int i11 = this.f46787h;
        if (i11 == 0) {
            i11 = j();
        }
        if (i11 == 15) {
            long j11 = this.f46788i;
            int i12 = (int) j11;
            if (j11 == i12) {
                this.f46787h = 0;
                int[] iArr = this.f46794o;
                int i13 = this.f46792m - 1;
                iArr[i13] = iArr[i13] + 1;
                return i12;
            }
            throw new NumberFormatException("Expected an int but was " + this.f46788i + L());
        }
        if (i11 == 16) {
            this.f46790k = new String(this.f46782c, this.f46783d, this.f46789j);
            this.f46783d += this.f46789j;
        } else {
            if (i11 != 8 && i11 != 9 && i11 != 10) {
                throw new IllegalStateException("Expected an int but was " + k0() + L());
            }
            if (i11 == 10) {
                this.f46790k = i0();
            } else {
                this.f46790k = f0(i11 == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.f46790k);
                this.f46787h = 0;
                int[] iArr2 = this.f46794o;
                int i14 = this.f46792m - 1;
                iArr2[i14] = iArr2[i14] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f46787h = 11;
        double parseDouble = Double.parseDouble(this.f46790k);
        int i15 = (int) parseDouble;
        if (i15 != parseDouble) {
            throw new NumberFormatException("Expected an int but was " + this.f46790k + L());
        }
        this.f46790k = null;
        this.f46787h = 0;
        int[] iArr3 = this.f46794o;
        int i16 = this.f46792m - 1;
        iArr3[i16] = iArr3[i16] + 1;
        return i15;
    }

    public long Z() throws IOException {
        int i11 = this.f46787h;
        if (i11 == 0) {
            i11 = j();
        }
        if (i11 == 15) {
            this.f46787h = 0;
            int[] iArr = this.f46794o;
            int i12 = this.f46792m - 1;
            iArr[i12] = iArr[i12] + 1;
            return this.f46788i;
        }
        if (i11 == 16) {
            this.f46790k = new String(this.f46782c, this.f46783d, this.f46789j);
            this.f46783d += this.f46789j;
        } else {
            if (i11 != 8 && i11 != 9 && i11 != 10) {
                throw new IllegalStateException("Expected a long but was " + k0() + L());
            }
            if (i11 == 10) {
                this.f46790k = i0();
            } else {
                this.f46790k = f0(i11 == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.f46790k);
                this.f46787h = 0;
                int[] iArr2 = this.f46794o;
                int i13 = this.f46792m - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f46787h = 11;
        double parseDouble = Double.parseDouble(this.f46790k);
        long j11 = (long) parseDouble;
        if (j11 != parseDouble) {
            throw new NumberFormatException("Expected a long but was " + this.f46790k + L());
        }
        this.f46790k = null;
        this.f46787h = 0;
        int[] iArr3 = this.f46794o;
        int i14 = this.f46792m - 1;
        iArr3[i14] = iArr3[i14] + 1;
        return j11;
    }

    public void a() throws IOException {
        int i11 = this.f46787h;
        if (i11 == 0) {
            i11 = j();
        }
        if (i11 == 3) {
            s0(1);
            this.f46794o[this.f46792m - 1] = 0;
            this.f46787h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + k0() + L());
        }
    }

    public String a0() throws IOException {
        String f02;
        int i11 = this.f46787h;
        if (i11 == 0) {
            i11 = j();
        }
        if (i11 == 14) {
            f02 = i0();
        } else if (i11 == 12) {
            f02 = f0('\'');
        } else {
            if (i11 != 13) {
                throw new IllegalStateException("Expected a name but was " + k0() + L());
            }
            f02 = f0('\"');
        }
        this.f46787h = 0;
        this.f46793n[this.f46792m - 1] = f02;
        return f02;
    }

    public void c() throws IOException {
        int i11 = this.f46787h;
        if (i11 == 0) {
            i11 = j();
        }
        if (i11 == 1) {
            s0(3);
            this.f46787h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + k0() + L());
        }
    }

    public final int c0(boolean z11) throws IOException {
        char c11;
        char[] cArr = this.f46782c;
        int i11 = this.f46783d;
        int i12 = this.f46784e;
        while (true) {
            if (i11 == i12) {
                this.f46783d = i11;
                if (!r(1)) {
                    if (!z11) {
                        return -1;
                    }
                    throw new EOFException("End of input" + L());
                }
                i11 = this.f46783d;
                i12 = this.f46784e;
            }
            int i13 = i11 + 1;
            c11 = cArr[i11];
            if (c11 == '\n') {
                this.f46785f++;
                this.f46786g = i13;
            } else if (c11 != ' ' && c11 != '\r' && c11 != '\t') {
                if (c11 == '/') {
                    this.f46783d = i13;
                    if (i13 == i12) {
                        this.f46783d = i11;
                        boolean r11 = r(2);
                        this.f46783d++;
                        if (!r11) {
                            break;
                        }
                    }
                    e();
                    int i14 = this.f46783d;
                    char c12 = cArr[i14];
                    if (c12 == '*') {
                        this.f46783d = i14 + 1;
                        if (!y0(e.f83303c)) {
                            throw D0("Unterminated comment");
                        }
                        i11 = this.f46783d + 2;
                        i12 = this.f46784e;
                    } else {
                        if (c12 != '/') {
                            break;
                        }
                        this.f46783d = i14 + 1;
                        z0();
                        i11 = this.f46783d;
                        i12 = this.f46784e;
                    }
                } else {
                    if (c11 != '#') {
                        this.f46783d = i13;
                        return c11;
                    }
                    this.f46783d = i13;
                    e();
                    z0();
                    i11 = this.f46783d;
                    i12 = this.f46784e;
                }
            }
            i11 = i13;
        }
        return c11;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f46787h = 0;
        this.f46791l[0] = 8;
        this.f46792m = 1;
        this.f46780a.close();
    }

    public void d0() throws IOException {
        int i11 = this.f46787h;
        if (i11 == 0) {
            i11 = j();
        }
        if (i11 == 7) {
            this.f46787h = 0;
            int[] iArr = this.f46794o;
            int i12 = this.f46792m - 1;
            iArr[i12] = iArr[i12] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + k0() + L());
    }

    public final void e() throws IOException {
        if (!this.f46781b) {
            throw D0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    public final void f() throws IOException {
        c0(true);
        int i11 = this.f46783d;
        this.f46783d = i11 - 1;
        if (i11 + 4 <= this.f46784e || r(5)) {
            int i12 = this.f46783d;
            char[] cArr = this.f46782c;
            if (cArr[i12] == ')' && cArr[i12 + 1] == ']' && cArr[i12 + 2] == '}' && cArr[i12 + 3] == '\'' && cArr[i12 + 4] == '\n') {
                this.f46783d = i12 + 5;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005c, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006a, code lost:
    
        r1.append(r0, r3, r2 - r3);
        r9.f46783d = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String f0(char r10) throws java.io.IOException {
        /*
            r9 = this;
            char[] r0 = r9.f46782c
            r1 = 0
        L3:
            int r2 = r9.f46783d
            int r3 = r9.f46784e
        L7:
            r4 = r3
            r3 = r2
        L9:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L5a
            int r7 = r2 + 1
            char r2 = r0[r2]
            if (r2 != r10) goto L28
            r9.f46783d = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L20
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0, r3, r7)
            return r10
        L20:
            r1.append(r0, r3, r7)
            java.lang.String r10 = r1.toString()
            return r10
        L28:
            r8 = 92
            if (r2 != r8) goto L4d
            r9.f46783d = r7
            int r7 = r7 - r3
            int r2 = r7 + (-1)
            if (r1 != 0) goto L3e
            int r7 = r7 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r7, r5)
            r1.<init>(r4)
        L3e:
            r1.append(r0, r3, r2)
            char r2 = r9.v0()
            r1.append(r2)
            int r2 = r9.f46783d
            int r3 = r9.f46784e
            goto L7
        L4d:
            r5 = 10
            if (r2 != r5) goto L58
            int r2 = r9.f46785f
            int r2 = r2 + r6
            r9.f46785f = r2
            r9.f46786g = r7
        L58:
            r2 = r7
            goto L9
        L5a:
            if (r1 != 0) goto L6a
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L6a:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r9.f46783d = r2
            boolean r2 = r9.r(r6)
            if (r2 == 0) goto L78
            goto L3
        L78:
            java.lang.String r10 = "Unterminated string"
            java.io.IOException r10 = r9.D0(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: cp.a.f0(char):java.lang.String");
    }

    public String getPath() {
        return w(false);
    }

    public String h0() throws IOException {
        String str;
        int i11 = this.f46787h;
        if (i11 == 0) {
            i11 = j();
        }
        if (i11 == 10) {
            str = i0();
        } else if (i11 == 8) {
            str = f0('\'');
        } else if (i11 == 9) {
            str = f0('\"');
        } else if (i11 == 11) {
            str = this.f46790k;
            this.f46790k = null;
        } else if (i11 == 15) {
            str = Long.toString(this.f46788i);
        } else {
            if (i11 != 16) {
                throw new IllegalStateException("Expected a string but was " + k0() + L());
            }
            str = new String(this.f46782c, this.f46783d, this.f46789j);
            this.f46783d += this.f46789j;
        }
        this.f46787h = 0;
        int[] iArr = this.f46794o;
        int i12 = this.f46792m - 1;
        iArr[i12] = iArr[i12] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004a, code lost:
    
        e();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String i0() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r6.f46783d
            int r4 = r3 + r2
            int r5 = r6.f46784e
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f46782c
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.e()
            goto L5c
        L4e:
            char[] r3 = r6.f46782c
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.r(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r1 = r2
            goto L7e
        L5e:
            if (r0 != 0) goto L6b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L6b:
            char[] r3 = r6.f46782c
            int r4 = r6.f46783d
            r0.append(r3, r4, r2)
            int r3 = r6.f46783d
            int r3 = r3 + r2
            r6.f46783d = r3
            r2 = 1
            boolean r2 = r6.r(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r0 != 0) goto L8a
            java.lang.String r0 = new java.lang.String
            char[] r2 = r6.f46782c
            int r3 = r6.f46783d
            r0.<init>(r2, r3, r1)
            goto L95
        L8a:
            char[] r2 = r6.f46782c
            int r3 = r6.f46783d
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L95:
            int r2 = r6.f46783d
            int r2 = r2 + r1
            r6.f46783d = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cp.a.i0():java.lang.String");
    }

    public int j() throws IOException {
        int c02;
        int[] iArr = this.f46791l;
        int i11 = this.f46792m;
        int i12 = iArr[i11 - 1];
        if (i12 == 1) {
            iArr[i11 - 1] = 2;
        } else if (i12 == 2) {
            int c03 = c0(true);
            if (c03 != 44) {
                if (c03 != 59) {
                    if (c03 != 93) {
                        throw D0("Unterminated array");
                    }
                    this.f46787h = 4;
                    return 4;
                }
                e();
            }
        } else {
            if (i12 == 3 || i12 == 5) {
                iArr[i11 - 1] = 4;
                if (i12 == 5 && (c02 = c0(true)) != 44) {
                    if (c02 != 59) {
                        if (c02 != 125) {
                            throw D0("Unterminated object");
                        }
                        this.f46787h = 2;
                        return 2;
                    }
                    e();
                }
                int c04 = c0(true);
                if (c04 == 34) {
                    this.f46787h = 13;
                    return 13;
                }
                if (c04 == 39) {
                    e();
                    this.f46787h = 12;
                    return 12;
                }
                if (c04 == 125) {
                    if (i12 == 5) {
                        throw D0("Expected name");
                    }
                    this.f46787h = 2;
                    return 2;
                }
                e();
                this.f46783d--;
                if (!I((char) c04)) {
                    throw D0("Expected name");
                }
                this.f46787h = 14;
                return 14;
            }
            if (i12 == 4) {
                iArr[i11 - 1] = 5;
                int c05 = c0(true);
                if (c05 != 58) {
                    if (c05 != 61) {
                        throw D0("Expected ':'");
                    }
                    e();
                    if (this.f46783d < this.f46784e || r(1)) {
                        char[] cArr = this.f46782c;
                        int i13 = this.f46783d;
                        if (cArr[i13] == '>') {
                            this.f46783d = i13 + 1;
                        }
                    }
                }
            } else if (i12 == 6) {
                if (this.f46781b) {
                    f();
                }
                this.f46791l[this.f46792m - 1] = 7;
            } else if (i12 == 7) {
                if (c0(false) == -1) {
                    this.f46787h = 17;
                    return 17;
                }
                e();
                this.f46783d--;
            } else if (i12 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int c06 = c0(true);
        if (c06 == 34) {
            this.f46787h = 9;
            return 9;
        }
        if (c06 == 39) {
            e();
            this.f46787h = 8;
            return 8;
        }
        if (c06 != 44 && c06 != 59) {
            if (c06 == 91) {
                this.f46787h = 3;
                return 3;
            }
            if (c06 != 93) {
                if (c06 == 123) {
                    this.f46787h = 1;
                    return 1;
                }
                this.f46783d--;
                int m02 = m0();
                if (m02 != 0) {
                    return m02;
                }
                int o02 = o0();
                if (o02 != 0) {
                    return o02;
                }
                if (!I(this.f46782c[this.f46783d])) {
                    throw D0("Expected value");
                }
                e();
                this.f46787h = 10;
                return 10;
            }
            if (i12 == 1) {
                this.f46787h = 4;
                return 4;
            }
        }
        if (i12 != 1 && i12 != 2) {
            throw D0("Unexpected value");
        }
        e();
        this.f46783d--;
        this.f46787h = 7;
        return 7;
    }

    public void k() throws IOException {
        int i11 = this.f46787h;
        if (i11 == 0) {
            i11 = j();
        }
        if (i11 != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + k0() + L());
        }
        int i12 = this.f46792m;
        this.f46792m = i12 - 1;
        int[] iArr = this.f46794o;
        int i13 = i12 - 2;
        iArr[i13] = iArr[i13] + 1;
        this.f46787h = 0;
    }

    public JsonToken k0() throws IOException {
        int i11 = this.f46787h;
        if (i11 == 0) {
            i11 = j();
        }
        switch (i11) {
            case 1:
                return JsonToken.BEGIN_OBJECT;
            case 2:
                return JsonToken.END_OBJECT;
            case 3:
                return JsonToken.BEGIN_ARRAY;
            case 4:
                return JsonToken.END_ARRAY;
            case 5:
            case 6:
                return JsonToken.BOOLEAN;
            case 7:
                return JsonToken.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonToken.STRING;
            case 12:
            case 13:
            case 14:
                return JsonToken.NAME;
            case 15:
            case 16:
                return JsonToken.NUMBER;
            case 17:
                return JsonToken.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final int m0() throws IOException {
        String str;
        String str2;
        int i11;
        char c11 = this.f46782c[this.f46783d];
        if (c11 == 't' || c11 == 'T') {
            str = m.f74525c;
            str2 = "TRUE";
            i11 = 5;
        } else if (c11 == 'f' || c11 == 'F') {
            str = "false";
            str2 = "FALSE";
            i11 = 6;
        } else {
            if (c11 != 'n' && c11 != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i11 = 7;
        }
        int length = str.length();
        for (int i12 = 1; i12 < length; i12++) {
            if (this.f46783d + i12 >= this.f46784e && !r(i12 + 1)) {
                return 0;
            }
            char c12 = this.f46782c[this.f46783d + i12];
            if (c12 != str.charAt(i12) && c12 != str2.charAt(i12)) {
                return 0;
            }
        }
        if ((this.f46783d + length < this.f46784e || r(length + 1)) && I(this.f46782c[this.f46783d + length])) {
            return 0;
        }
        this.f46783d += length;
        this.f46787h = i11;
        return i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0095, code lost:
    
        if (r9 != 2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0097, code lost:
    
        if (r10 == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009d, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009f, code lost:
    
        if (r13 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a3, code lost:
    
        if (r11 != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a5, code lost:
    
        if (r13 != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a7, code lost:
    
        if (r13 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00aa, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ab, code lost:
    
        r19.f46788i = r11;
        r19.f46783d += r8;
        r19.f46787h = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b6, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
    
        if (r9 == 2) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ba, code lost:
    
        if (r9 == 4) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bd, code lost:
    
        if (r9 != 7) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c0, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c1, code lost:
    
        r19.f46789j = r8;
        r19.f46787h = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c7, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0093, code lost:
    
        if (I(r14) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00c8, code lost:
    
        return r18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int o0() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cp.a.o0():int");
    }

    public void q() throws IOException {
        int i11 = this.f46787h;
        if (i11 == 0) {
            i11 = j();
        }
        if (i11 != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + k0() + L());
        }
        int i12 = this.f46792m;
        int i13 = i12 - 1;
        this.f46792m = i13;
        this.f46793n[i13] = null;
        int[] iArr = this.f46794o;
        int i14 = i12 - 2;
        iArr[i14] = iArr[i14] + 1;
        this.f46787h = 0;
    }

    public final boolean r(int i11) throws IOException {
        int i12;
        int i13;
        char[] cArr = this.f46782c;
        int i14 = this.f46786g;
        int i15 = this.f46783d;
        this.f46786g = i14 - i15;
        int i16 = this.f46784e;
        if (i16 != i15) {
            int i17 = i16 - i15;
            this.f46784e = i17;
            System.arraycopy(cArr, i15, cArr, 0, i17);
        } else {
            this.f46784e = 0;
        }
        this.f46783d = 0;
        do {
            Reader reader = this.f46780a;
            int i18 = this.f46784e;
            int read = reader.read(cArr, i18, cArr.length - i18);
            if (read == -1) {
                return false;
            }
            i12 = this.f46784e + read;
            this.f46784e = i12;
            if (this.f46785f == 0 && (i13 = this.f46786g) == 0 && i12 > 0 && cArr[0] == 65279) {
                this.f46783d++;
                this.f46786g = i13 + 1;
                i11++;
            }
        } while (i12 < i11);
        return true;
    }

    public final void s0(int i11) {
        int i12 = this.f46792m;
        int[] iArr = this.f46791l;
        if (i12 == iArr.length) {
            int i13 = i12 * 2;
            this.f46791l = Arrays.copyOf(iArr, i13);
            this.f46794o = Arrays.copyOf(this.f46794o, i13);
            this.f46793n = (String[]) Arrays.copyOf(this.f46793n, i13);
        }
        int[] iArr2 = this.f46791l;
        int i14 = this.f46792m;
        this.f46792m = i14 + 1;
        iArr2[i14] = i11;
    }

    public String toString() {
        return getClass().getSimpleName() + L();
    }

    public final char v0() throws IOException {
        int i11;
        if (this.f46783d == this.f46784e && !r(1)) {
            throw D0("Unterminated escape sequence");
        }
        char[] cArr = this.f46782c;
        int i12 = this.f46783d;
        int i13 = i12 + 1;
        this.f46783d = i13;
        char c11 = cArr[i12];
        if (c11 == '\n') {
            this.f46785f++;
            this.f46786g = i13;
            return c11;
        }
        if (c11 == '\"' || c11 == '\'' || c11 == '/' || c11 == '\\') {
            return c11;
        }
        if (c11 == 'b') {
            return '\b';
        }
        if (c11 == 'f') {
            return '\f';
        }
        if (c11 == 'n') {
            return '\n';
        }
        if (c11 == 'r') {
            return '\r';
        }
        if (c11 == 't') {
            return '\t';
        }
        if (c11 != 'u') {
            throw D0("Invalid escape sequence");
        }
        if (i12 + 5 > this.f46784e && !r(4)) {
            throw D0("Unterminated escape sequence");
        }
        int i14 = this.f46783d;
        int i15 = i14 + 4;
        char c12 = 0;
        while (i14 < i15) {
            char c13 = this.f46782c[i14];
            char c14 = (char) (c12 << 4);
            if (c13 >= '0' && c13 <= '9') {
                i11 = c13 - '0';
            } else if (c13 >= 'a' && c13 <= 'f') {
                i11 = c13 - 'W';
            } else {
                if (c13 < 'A' || c13 > 'F') {
                    throw new NumberFormatException("\\u" + new String(this.f46782c, this.f46783d, 4));
                }
                i11 = c13 - '7';
            }
            c12 = (char) (c14 + i11);
            i14++;
        }
        this.f46783d += 4;
        return c12;
    }

    public final void w0(boolean z11) {
        this.f46781b = z11;
    }

    public final void x0(char c11) throws IOException {
        char[] cArr = this.f46782c;
        do {
            int i11 = this.f46783d;
            int i12 = this.f46784e;
            while (i11 < i12) {
                int i13 = i11 + 1;
                char c12 = cArr[i11];
                if (c12 == c11) {
                    this.f46783d = i13;
                    return;
                }
                if (c12 == '\\') {
                    this.f46783d = i13;
                    v0();
                    i11 = this.f46783d;
                    i12 = this.f46784e;
                } else {
                    if (c12 == '\n') {
                        this.f46785f++;
                        this.f46786g = i13;
                    }
                    i11 = i13;
                }
            }
            this.f46783d = i11;
        } while (r(1));
        throw D0("Unterminated string");
    }

    public final boolean y0(String str) throws IOException {
        int length = str.length();
        while (true) {
            if (this.f46783d + length > this.f46784e && !r(length)) {
                return false;
            }
            char[] cArr = this.f46782c;
            int i11 = this.f46783d;
            if (cArr[i11] != '\n') {
                for (int i12 = 0; i12 < length; i12++) {
                    if (this.f46782c[this.f46783d + i12] != str.charAt(i12)) {
                        break;
                    }
                }
                return true;
            }
            this.f46785f++;
            this.f46786g = i11 + 1;
            this.f46783d++;
        }
    }

    public final void z0() throws IOException {
        char c11;
        do {
            if (this.f46783d >= this.f46784e && !r(1)) {
                return;
            }
            char[] cArr = this.f46782c;
            int i11 = this.f46783d;
            int i12 = i11 + 1;
            this.f46783d = i12;
            c11 = cArr[i11];
            if (c11 == '\n') {
                this.f46785f++;
                this.f46786g = i12;
                return;
            }
        } while (c11 != '\r');
    }
}
