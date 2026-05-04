package com.airbnb.lottie.parser.moshi;

import androidx.annotation.Nullable;
import com.airbnb.lottie.parser.moshi.JsonReader;
import i1.b;
import java.io.EOFException;
import java.io.IOException;
import l60.k;
import l60.m;
import l70.e;
import okio.ByteString;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a extends JsonReader {
    public static final int A = 7;
    public static final int B = 8;
    public static final int C = 9;
    public static final int D = 10;
    public static final int E = 11;
    public static final int F = 12;
    public static final int G = 13;
    public static final int H = 14;
    public static final int I = 15;
    public static final int J = 16;
    public static final int K = 17;
    public static final int L = 18;
    public static final int M = 0;
    public static final int N = 1;
    public static final int O = 2;
    public static final int P = 3;
    public static final int Q = 4;
    public static final int R = 5;
    public static final int S = 6;
    public static final int T = 7;

    /* renamed from: n, reason: collision with root package name */
    public static final long f10165n = -922337203685477580L;

    /* renamed from: o, reason: collision with root package name */
    public static final ByteString f10166o = ByteString.encodeUtf8("'\\");

    /* renamed from: p, reason: collision with root package name */
    public static final ByteString f10167p = ByteString.encodeUtf8(e.f70686d);

    /* renamed from: q, reason: collision with root package name */
    public static final ByteString f10168q = ByteString.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: r, reason: collision with root package name */
    public static final ByteString f10169r = ByteString.encodeUtf8("\n\r");

    /* renamed from: s, reason: collision with root package name */
    public static final ByteString f10170s = ByteString.encodeUtf8(r60.e.f83303c);

    /* renamed from: t, reason: collision with root package name */
    public static final int f10171t = 0;

    /* renamed from: u, reason: collision with root package name */
    public static final int f10172u = 1;

    /* renamed from: v, reason: collision with root package name */
    public static final int f10173v = 2;

    /* renamed from: w, reason: collision with root package name */
    public static final int f10174w = 3;

    /* renamed from: x, reason: collision with root package name */
    public static final int f10175x = 4;

    /* renamed from: y, reason: collision with root package name */
    public static final int f10176y = 5;

    /* renamed from: z, reason: collision with root package name */
    public static final int f10177z = 6;

    /* renamed from: h, reason: collision with root package name */
    public final m f10178h;

    /* renamed from: i, reason: collision with root package name */
    public final k f10179i;

    /* renamed from: j, reason: collision with root package name */
    public int f10180j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f10181k;

    /* renamed from: l, reason: collision with root package name */
    public int f10182l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public String f10183m;

    public a(m mVar) {
        if (mVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f10178h = mVar;
        this.f10179i = mVar.z();
        L(6);
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String C() throws IOException {
        String str;
        int i11 = this.f10180j;
        if (i11 == 0) {
            i11 = d0();
        }
        if (i11 == 14) {
            str = m0();
        } else if (i11 == 13) {
            str = k0(f10167p);
        } else if (i11 == 12) {
            str = k0(f10166o);
        } else {
            if (i11 != 15) {
                throw new i1.a("Expected a name but was " + I() + " at path " + getPath());
            }
            str = this.f10183m;
        }
        this.f10180j = 0;
        this.f10159c[this.f10157a - 1] = str;
        return str;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String E() throws IOException {
        String b22;
        int i11 = this.f10180j;
        if (i11 == 0) {
            i11 = d0();
        }
        if (i11 == 10) {
            b22 = m0();
        } else if (i11 == 9) {
            b22 = k0(f10167p);
        } else if (i11 == 8) {
            b22 = k0(f10166o);
        } else if (i11 == 11) {
            b22 = this.f10183m;
            this.f10183m = null;
        } else if (i11 == 16) {
            b22 = Long.toString(this.f10181k);
        } else {
            if (i11 != 17) {
                throw new i1.a("Expected a string but was " + I() + " at path " + getPath());
            }
            b22 = this.f10179i.b2(this.f10182l);
        }
        this.f10180j = 0;
        int[] iArr = this.f10160d;
        int i12 = this.f10157a - 1;
        iArr[i12] = iArr[i12] + 1;
        return b22;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public JsonReader.Token I() throws IOException {
        int i11 = this.f10180j;
        if (i11 == 0) {
            i11 = d0();
        }
        switch (i11) {
            case 1:
                return JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                return JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader.Token.BOOLEAN;
            case 7:
                return JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.NAME;
            case 16:
            case 17:
                return JsonReader.Token.NUMBER;
            case 18:
                return JsonReader.Token.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int S(JsonReader.a aVar) throws IOException {
        int i11 = this.f10180j;
        if (i11 == 0) {
            i11 = d0();
        }
        if (i11 < 12 || i11 > 15) {
            return -1;
        }
        if (i11 == 15) {
            return f0(this.f10183m, aVar);
        }
        int X2 = this.f10178h.X2(aVar.f10164b);
        if (X2 != -1) {
            this.f10180j = 0;
            this.f10159c[this.f10157a - 1] = aVar.f10163a[X2];
            return X2;
        }
        String str = this.f10159c[this.f10157a - 1];
        String C2 = C();
        int f02 = f0(C2, aVar);
        if (f02 == -1) {
            this.f10180j = 15;
            this.f10183m = C2;
            this.f10159c[this.f10157a - 1] = str;
        }
        return f02;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void U() throws IOException {
        if (this.f10162f) {
            throw new i1.a("Cannot skip unexpected " + I() + " at " + getPath());
        }
        int i11 = this.f10180j;
        if (i11 == 0) {
            i11 = d0();
        }
        if (i11 == 14) {
            z0();
        } else if (i11 == 13) {
            w0(f10167p);
        } else if (i11 == 12) {
            w0(f10166o);
        } else if (i11 != 15) {
            throw new i1.a("Expected a name but was " + I() + " at path " + getPath());
        }
        this.f10180j = 0;
        this.f10159c[this.f10157a - 1] = "null";
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void V() throws IOException {
        if (this.f10162f) {
            throw new i1.a("Cannot skip unexpected " + I() + " at " + getPath());
        }
        int i11 = 0;
        do {
            int i12 = this.f10180j;
            if (i12 == 0) {
                i12 = d0();
            }
            if (i12 == 3) {
                L(1);
            } else if (i12 == 1) {
                L(3);
            } else {
                if (i12 == 4) {
                    i11--;
                    if (i11 < 0) {
                        throw new i1.a("Expected a value but was " + I() + " at path " + getPath());
                    }
                    this.f10157a--;
                } else if (i12 == 2) {
                    i11--;
                    if (i11 < 0) {
                        throw new i1.a("Expected a value but was " + I() + " at path " + getPath());
                    }
                    this.f10157a--;
                } else if (i12 == 14 || i12 == 10) {
                    z0();
                } else if (i12 == 9 || i12 == 13) {
                    w0(f10167p);
                } else if (i12 == 8 || i12 == 12) {
                    w0(f10166o);
                } else if (i12 == 17) {
                    this.f10179i.skip(this.f10182l);
                } else if (i12 == 18) {
                    throw new i1.a("Expected a value but was " + I() + " at path " + getPath());
                }
                this.f10180j = 0;
            }
            i11++;
            this.f10180j = 0;
        } while (i11 != 0);
        int[] iArr = this.f10160d;
        int i13 = this.f10157a;
        int i14 = i13 - 1;
        iArr[i14] = iArr[i14] + 1;
        this.f10159c[i13 - 1] = "null";
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void c() throws IOException {
        int i11 = this.f10180j;
        if (i11 == 0) {
            i11 = d0();
        }
        if (i11 == 3) {
            L(1);
            this.f10160d[this.f10157a - 1] = 0;
            this.f10180j = 0;
        } else {
            throw new i1.a("Expected BEGIN_ARRAY but was " + I() + " at path " + getPath());
        }
    }

    public final void c0() throws IOException {
        if (!this.f10161e) {
            throw a0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f10180j = 0;
        this.f10158b[0] = 8;
        this.f10157a = 1;
        this.f10179i.e();
        this.f10178h.close();
    }

    public final int d0() throws IOException {
        int[] iArr = this.f10158b;
        int i11 = this.f10157a;
        int i12 = iArr[i11 - 1];
        if (i12 == 1) {
            iArr[i11 - 1] = 2;
        } else if (i12 == 2) {
            int i02 = i0(true);
            this.f10179i.readByte();
            if (i02 != 44) {
                if (i02 != 59) {
                    if (i02 != 93) {
                        throw a0("Unterminated array");
                    }
                    this.f10180j = 4;
                    return 4;
                }
                c0();
            }
        } else {
            if (i12 == 3 || i12 == 5) {
                iArr[i11 - 1] = 4;
                if (i12 == 5) {
                    int i03 = i0(true);
                    this.f10179i.readByte();
                    if (i03 != 44) {
                        if (i03 != 59) {
                            if (i03 != 125) {
                                throw a0("Unterminated object");
                            }
                            this.f10180j = 2;
                            return 2;
                        }
                        c0();
                    }
                }
                int i04 = i0(true);
                if (i04 == 34) {
                    this.f10179i.readByte();
                    this.f10180j = 13;
                    return 13;
                }
                if (i04 == 39) {
                    this.f10179i.readByte();
                    c0();
                    this.f10180j = 12;
                    return 12;
                }
                if (i04 != 125) {
                    c0();
                    if (!h0((char) i04)) {
                        throw a0("Expected name");
                    }
                    this.f10180j = 14;
                    return 14;
                }
                if (i12 == 5) {
                    throw a0("Expected name");
                }
                this.f10179i.readByte();
                this.f10180j = 2;
                return 2;
            }
            if (i12 == 4) {
                iArr[i11 - 1] = 5;
                int i05 = i0(true);
                this.f10179i.readByte();
                if (i05 != 58) {
                    if (i05 != 61) {
                        throw a0("Expected ':'");
                    }
                    c0();
                    if (this.f10178h.request(1L) && this.f10179i.x0(0L) == 62) {
                        this.f10179i.readByte();
                    }
                }
            } else if (i12 == 6) {
                iArr[i11 - 1] = 7;
            } else if (i12 == 7) {
                if (i0(false) == -1) {
                    this.f10180j = 18;
                    return 18;
                }
                c0();
            } else if (i12 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int i06 = i0(true);
        if (i06 == 34) {
            this.f10179i.readByte();
            this.f10180j = 9;
            return 9;
        }
        if (i06 == 39) {
            c0();
            this.f10179i.readByte();
            this.f10180j = 8;
            return 8;
        }
        if (i06 != 44 && i06 != 59) {
            if (i06 == 91) {
                this.f10179i.readByte();
                this.f10180j = 3;
                return 3;
            }
            if (i06 != 93) {
                if (i06 == 123) {
                    this.f10179i.readByte();
                    this.f10180j = 1;
                    return 1;
                }
                int o02 = o0();
                if (o02 != 0) {
                    return o02;
                }
                int s02 = s0();
                if (s02 != 0) {
                    return s02;
                }
                if (!h0(this.f10179i.x0(0L))) {
                    throw a0("Expected value");
                }
                c0();
                this.f10180j = 10;
                return 10;
            }
            if (i12 == 1) {
                this.f10179i.readByte();
                this.f10180j = 4;
                return 4;
            }
        }
        if (i12 != 1 && i12 != 2) {
            throw a0("Unexpected value");
        }
        c0();
        this.f10180j = 7;
        return 7;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void e() throws IOException {
        int i11 = this.f10180j;
        if (i11 == 0) {
            i11 = d0();
        }
        if (i11 == 1) {
            L(3);
            this.f10180j = 0;
            return;
        }
        throw new i1.a("Expected BEGIN_OBJECT but was " + I() + " at path " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void f() throws IOException {
        int i11 = this.f10180j;
        if (i11 == 0) {
            i11 = d0();
        }
        if (i11 != 4) {
            throw new i1.a("Expected END_ARRAY but was " + I() + " at path " + getPath());
        }
        int i12 = this.f10157a;
        this.f10157a = i12 - 1;
        int[] iArr = this.f10160d;
        int i13 = i12 - 2;
        iArr[i13] = iArr[i13] + 1;
        this.f10180j = 0;
    }

    public final int f0(String str, JsonReader.a aVar) {
        int length = aVar.f10163a.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(aVar.f10163a[i11])) {
                this.f10180j = 0;
                this.f10159c[this.f10157a - 1] = str;
                return i11;
            }
        }
        return -1;
    }

    public final boolean h0(int i11) throws IOException {
        if (i11 == 9 || i11 == 10 || i11 == 12 || i11 == 13 || i11 == 32) {
            return false;
        }
        if (i11 != 35) {
            if (i11 == 44) {
                return false;
            }
            if (i11 != 47 && i11 != 61) {
                if (i11 == 123 || i11 == 125 || i11 == 58) {
                    return false;
                }
                if (i11 != 59) {
                    switch (i11) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        c0();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        r6.f10179i.skip(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r2 != 47) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        if (r2 != 35) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        c0();
        y0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0037, code lost:
    
        if (r6.f10178h.request(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003a, code lost:
    
        c0();
        r3 = r6.f10179i.x0(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
    
        if (r3 == 42) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        r6.f10179i.readByte();
        r6.f10179i.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        if (x0() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        throw a0("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0049, code lost:
    
        if (r3 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x004c, code lost:
    
        r6.f10179i.readByte();
        r6.f10179i.readByte();
        y0();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i0(boolean r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            l60.m r2 = r6.f10178h
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.request(r4)
            if (r2 == 0) goto L80
            l60.k r2 = r6.f10179i
            long r4 = (long) r1
            byte r2 = r2.x0(r4)
            r4 = 10
            if (r2 == r4) goto L7e
            r4 = 32
            if (r2 == r4) goto L7e
            r4 = 13
            if (r2 == r4) goto L7e
            r4 = 9
            if (r2 != r4) goto L25
            goto L7e
        L25:
            l60.k r3 = r6.f10179i
            long r4 = (long) r1
            r3.skip(r4)
            r1 = 47
            if (r2 != r1) goto L72
            l60.m r3 = r6.f10178h
            r4 = 2
            boolean r3 = r3.request(r4)
            if (r3 != 0) goto L3a
            goto L7d
        L3a:
            r6.c0()
            l60.k r3 = r6.f10179i
            r4 = 1
            byte r3 = r3.x0(r4)
            r4 = 42
            if (r3 == r4) goto L5a
            if (r3 == r1) goto L4c
            goto L7d
        L4c:
            l60.k r1 = r6.f10179i
            r1.readByte()
            l60.k r1 = r6.f10179i
            r1.readByte()
            r6.y0()
            goto L1
        L5a:
            l60.k r1 = r6.f10179i
            r1.readByte()
            l60.k r1 = r6.f10179i
            r1.readByte()
            boolean r1 = r6.x0()
            if (r1 == 0) goto L6b
            goto L1
        L6b:
            java.lang.String r7 = "Unterminated comment"
            i1.b r7 = r6.a0(r7)
            throw r7
        L72:
            r1 = 35
            if (r2 != r1) goto L7d
            r6.c0()
            r6.y0()
            goto L1
        L7d:
            return r2
        L7e:
            r1 = r3
            goto L2
        L80:
            if (r7 != 0) goto L84
            r7 = -1
            return r7
        L84:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.a.i0(boolean):int");
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void j() throws IOException {
        int i11 = this.f10180j;
        if (i11 == 0) {
            i11 = d0();
        }
        if (i11 != 2) {
            throw new i1.a("Expected END_OBJECT but was " + I() + " at path " + getPath());
        }
        int i12 = this.f10157a;
        int i13 = i12 - 1;
        this.f10157a = i13;
        this.f10159c[i13] = null;
        int[] iArr = this.f10160d;
        int i14 = i12 - 2;
        iArr[i14] = iArr[i14] + 1;
        this.f10180j = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean k() throws IOException {
        int i11 = this.f10180j;
        if (i11 == 0) {
            i11 = d0();
        }
        return (i11 == 2 || i11 == 4 || i11 == 18) ? false : true;
    }

    public final String k0(ByteString byteString) throws IOException {
        StringBuilder sb2 = null;
        while (true) {
            long p02 = this.f10178h.p0(byteString);
            if (p02 == -1) {
                throw a0("Unterminated string");
            }
            if (this.f10179i.x0(p02) != 92) {
                if (sb2 == null) {
                    String b22 = this.f10179i.b2(p02);
                    this.f10179i.readByte();
                    return b22;
                }
                sb2.append(this.f10179i.b2(p02));
                this.f10179i.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(this.f10179i.b2(p02));
            this.f10179i.readByte();
            sb2.append(v0());
        }
    }

    public final String m0() throws IOException {
        long p02 = this.f10178h.p0(f10168q);
        return p02 != -1 ? this.f10179i.b2(p02) : this.f10179i.R3();
    }

    public final int o0() throws IOException {
        String str;
        String str2;
        int i11;
        byte x02 = this.f10179i.x0(0L);
        if (x02 == 116 || x02 == 84) {
            str = n6.m.f74525c;
            str2 = "TRUE";
            i11 = 5;
        } else if (x02 == 102 || x02 == 70) {
            str = "false";
            str2 = "FALSE";
            i11 = 6;
        } else {
            if (x02 != 110 && x02 != 78) {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i11 = 7;
        }
        int length = str.length();
        int i12 = 1;
        while (i12 < length) {
            int i13 = i12 + 1;
            if (!this.f10178h.request(i13)) {
                return 0;
            }
            byte x03 = this.f10179i.x0(i12);
            if (x03 != str.charAt(i12) && x03 != str2.charAt(i12)) {
                return 0;
            }
            i12 = i13;
        }
        if (this.f10178h.request(length + 1) && h0(this.f10179i.x0(length))) {
            return 0;
        }
        this.f10179i.skip(length);
        this.f10180j = i11;
        return i11;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean q() throws IOException {
        int i11 = this.f10180j;
        if (i11 == 0) {
            i11 = d0();
        }
        if (i11 == 5) {
            this.f10180j = 0;
            int[] iArr = this.f10160d;
            int i12 = this.f10157a - 1;
            iArr[i12] = iArr[i12] + 1;
            return true;
        }
        if (i11 == 6) {
            this.f10180j = 0;
            int[] iArr2 = this.f10160d;
            int i13 = this.f10157a - 1;
            iArr2[i13] = iArr2[i13] + 1;
            return false;
        }
        throw new i1.a("Expected a boolean but was " + I() + " at path " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public double r() throws IOException {
        int i11 = this.f10180j;
        if (i11 == 0) {
            i11 = d0();
        }
        if (i11 == 16) {
            this.f10180j = 0;
            int[] iArr = this.f10160d;
            int i12 = this.f10157a - 1;
            iArr[i12] = iArr[i12] + 1;
            return this.f10181k;
        }
        if (i11 == 17) {
            this.f10183m = this.f10179i.b2(this.f10182l);
        } else if (i11 == 9) {
            this.f10183m = k0(f10167p);
        } else if (i11 == 8) {
            this.f10183m = k0(f10166o);
        } else if (i11 == 10) {
            this.f10183m = m0();
        } else if (i11 != 11) {
            throw new i1.a("Expected a double but was " + I() + " at path " + getPath());
        }
        this.f10180j = 11;
        try {
            double parseDouble = Double.parseDouble(this.f10183m);
            if (this.f10161e || !(Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                this.f10183m = null;
                this.f10180j = 0;
                int[] iArr2 = this.f10160d;
                int i13 = this.f10157a - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseDouble;
            }
            throw new b("JSON forbids NaN and infinities: " + parseDouble + " at path " + getPath());
        } catch (NumberFormatException unused) {
            throw new i1.a("Expected a double but was " + this.f10183m + " at path " + getPath());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
    
        if (h0(r1) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008b, code lost:
    
        if (r6 != 2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008d, code lost:
    
        if (r7 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0093, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0095, code lost:
    
        if (r10 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0099, code lost:
    
        if (r8 != r16) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009b, code lost:
    
        if (r10 != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009d, code lost:
    
        if (r10 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a0, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a1, code lost:
    
        r19.f10181k = r8;
        r19.f10179i.skip(r5);
        r19.f10180j = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ad, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ae, code lost:
    
        if (r6 == 2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b0, code lost:
    
        if (r6 == 4) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b3, code lost:
    
        if (r6 != 7) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b6, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b7, code lost:
    
        r19.f10182l = r5;
        r19.f10180j = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00bd, code lost:
    
        return 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00be, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int s0() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.a.s0():int");
    }

    public String toString() {
        return "JsonReader(" + this.f10178h + j.f81007d;
    }

    public final char v0() throws IOException {
        int i11;
        if (!this.f10178h.request(1L)) {
            throw a0("Unterminated escape sequence");
        }
        byte readByte = this.f10179i.readByte();
        if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
            return (char) readByte;
        }
        if (readByte == 98) {
            return '\b';
        }
        if (readByte == 102) {
            return '\f';
        }
        if (readByte == 110) {
            return '\n';
        }
        if (readByte == 114) {
            return '\r';
        }
        if (readByte == 116) {
            return '\t';
        }
        if (readByte != 117) {
            if (this.f10161e) {
                return (char) readByte;
            }
            throw a0("Invalid escape sequence: \\" + ((char) readByte));
        }
        if (!this.f10178h.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            byte x02 = this.f10179i.x0(i12);
            char c12 = (char) (c11 << 4);
            if (x02 >= 48 && x02 <= 57) {
                i11 = x02 - 48;
            } else if (x02 >= 97 && x02 <= 102) {
                i11 = x02 - 87;
            } else {
                if (x02 < 65 || x02 > 70) {
                    throw a0("\\u" + this.f10179i.b2(4L));
                }
                i11 = x02 - 55;
            }
            c11 = (char) (c12 + i11);
        }
        this.f10179i.skip(4L);
        return c11;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int w() throws IOException {
        int i11 = this.f10180j;
        if (i11 == 0) {
            i11 = d0();
        }
        if (i11 == 16) {
            long j11 = this.f10181k;
            int i12 = (int) j11;
            if (j11 == i12) {
                this.f10180j = 0;
                int[] iArr = this.f10160d;
                int i13 = this.f10157a - 1;
                iArr[i13] = iArr[i13] + 1;
                return i12;
            }
            throw new i1.a("Expected an int but was " + this.f10181k + " at path " + getPath());
        }
        if (i11 == 17) {
            this.f10183m = this.f10179i.b2(this.f10182l);
        } else if (i11 == 9 || i11 == 8) {
            String k02 = i11 == 9 ? k0(f10167p) : k0(f10166o);
            this.f10183m = k02;
            try {
                int parseInt = Integer.parseInt(k02);
                this.f10180j = 0;
                int[] iArr2 = this.f10160d;
                int i14 = this.f10157a - 1;
                iArr2[i14] = iArr2[i14] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i11 != 11) {
            throw new i1.a("Expected an int but was " + I() + " at path " + getPath());
        }
        this.f10180j = 11;
        try {
            double parseDouble = Double.parseDouble(this.f10183m);
            int i15 = (int) parseDouble;
            if (i15 == parseDouble) {
                this.f10183m = null;
                this.f10180j = 0;
                int[] iArr3 = this.f10160d;
                int i16 = this.f10157a - 1;
                iArr3[i16] = iArr3[i16] + 1;
                return i15;
            }
            throw new i1.a("Expected an int but was " + this.f10183m + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new i1.a("Expected an int but was " + this.f10183m + " at path " + getPath());
        }
    }

    public final void w0(ByteString byteString) throws IOException {
        while (true) {
            long p02 = this.f10178h.p0(byteString);
            if (p02 == -1) {
                throw a0("Unterminated string");
            }
            if (this.f10179i.x0(p02) != 92) {
                this.f10179i.skip(p02 + 1);
                return;
            } else {
                this.f10179i.skip(p02 + 1);
                v0();
            }
        }
    }

    public final boolean x0() throws IOException {
        long b02 = this.f10178h.b0(f10170s);
        boolean z11 = b02 != -1;
        k kVar = this.f10179i;
        kVar.skip(z11 ? b02 + r1.size() : kVar.size());
        return z11;
    }

    public final void y0() throws IOException {
        long p02 = this.f10178h.p0(f10169r);
        k kVar = this.f10179i;
        kVar.skip(p02 != -1 ? p02 + 1 : kVar.size());
    }

    public final void z0() throws IOException {
        long p02 = this.f10178h.p0(f10168q);
        k kVar = this.f10179i;
        if (p02 == -1) {
            p02 = kVar.size();
        }
        kVar.skip(p02);
    }
}
