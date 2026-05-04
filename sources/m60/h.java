package m60;

import java.io.EOFException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l60.b1;
import l60.e1;
import l60.i1;
import l60.r0;
import l60.v0;
import l60.x0;
import okio.ByteString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "-RealBufferedSource")
@u0({"SMAP\nRealBufferedSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSource.kt\nokio/internal/-RealBufferedSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,472:1\n1#2:473\n63#3:474\n63#3:475\n63#3:476\n63#3:477\n63#3:478\n63#3:479\n63#3:480\n63#3:481\n63#3:482\n63#3:483\n63#3:484\n63#3:485\n63#3:486\n63#3:487\n63#3:488\n63#3:489\n63#3:490\n63#3:491\n63#3:492\n63#3:493\n63#3:494\n63#3:495\n63#3:496\n63#3:498\n63#3:499\n63#3:500\n63#3:501\n63#3:502\n63#3:503\n63#3:504\n63#3:505\n63#3:506\n63#3:507\n63#3:508\n63#3:509\n63#3:510\n63#3:511\n63#3:512\n63#3:513\n63#3:514\n63#3:515\n63#3:516\n63#3:517\n63#3:519\n63#3:520\n63#3:521\n63#3:522\n63#3:523\n63#3:524\n63#3:525\n63#3:526\n63#3:527\n63#3:528\n63#3:529\n63#3:530\n63#3:531\n63#3:532\n63#3:533\n63#3:534\n63#3:535\n63#3:536\n63#3:537\n63#3:538\n63#3:539\n63#3:540\n63#3:541\n63#3:543\n63#3:544\n63#3:545\n63#3:546\n88#4:497\n88#4:518\n88#4:542\n*S KotlinDebug\n*F\n+ 1 RealBufferedSource.kt\nokio/internal/-RealBufferedSource\n*L\n42#1:474\n44#1:475\n48#1:476\n49#1:477\n54#1:478\n64#1:479\n65#1:480\n72#1:481\n76#1:482\n77#1:483\n82#1:484\n89#1:485\n96#1:486\n101#1:487\n109#1:488\n110#1:489\n115#1:490\n124#1:491\n125#1:492\n132#1:493\n138#1:494\n140#1:495\n144#1:496\n145#1:498\n153#1:499\n157#1:500\n162#1:501\n163#1:502\n166#1:503\n169#1:504\n170#1:505\n171#1:506\n177#1:507\n178#1:508\n183#1:509\n190#1:510\n191#1:511\n196#1:512\n204#1:513\n206#1:514\n207#1:515\n209#1:516\n212#1:517\n214#1:519\n222#1:520\n229#1:521\n234#1:522\n239#1:523\n244#1:524\n249#1:525\n254#1:526\n259#1:527\n267#1:528\n278#1:529\n286#1:530\n300#1:531\n307#1:532\n310#1:533\n311#1:534\n322#1:535\n327#1:536\n328#1:537\n349#1:538\n358#1:539\n362#1:540\n372#1:541\n425#1:543\n428#1:544\n429#1:545\n466#1:546\n144#1:497\n212#1:518\n406#1:542\n*E\n"})
/* loaded from: classes8.dex */
public final class h {
    @m80.k
    public static final String A(@m80.k b1 b1Var) {
        g0.p(b1Var, "<this>");
        b1Var.f70371b.V2(b1Var.f70370a);
        return b1Var.f70371b.R3();
    }

    @m80.k
    public static final String B(@m80.k b1 b1Var, long j11) {
        g0.p(b1Var, "<this>");
        b1Var.F(j11);
        return b1Var.f70371b.b2(j11);
    }

    public static final int C(@m80.k b1 b1Var) {
        g0.p(b1Var, "<this>");
        b1Var.F(1L);
        byte x02 = b1Var.f70371b.x0(0L);
        if ((x02 & ws.c.f96768m) == 192) {
            b1Var.F(2L);
        } else if ((x02 & 240) == 224) {
            b1Var.F(3L);
        } else if ((x02 & 248) == 240) {
            b1Var.F(4L);
        }
        return b1Var.f70371b.k3();
    }

    @m80.l
    public static final String D(@m80.k b1 b1Var) {
        g0.p(b1Var, "<this>");
        long U1 = b1Var.U1((byte) 10);
        if (U1 != -1) {
            return a.l0(b1Var.f70371b, U1);
        }
        if (b1Var.f70371b.size() != 0) {
            return b1Var.b2(b1Var.f70371b.size());
        }
        return null;
    }

    @m80.k
    public static final String E(@m80.k b1 b1Var, long j11) {
        g0.p(b1Var, "<this>");
        if (j11 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j11).toString());
        }
        long j12 = j11 == Long.MAX_VALUE ? Long.MAX_VALUE : j11 + 1;
        long T4 = b1Var.T4((byte) 10, 0L, j12);
        if (T4 != -1) {
            return a.l0(b1Var.f70371b, T4);
        }
        if (j12 < Long.MAX_VALUE && b1Var.request(j12) && b1Var.f70371b.x0(j12 - 1) == 13 && b1Var.request(j12 + 1) && b1Var.f70371b.x0(j12) == 10) {
            return a.l0(b1Var.f70371b, j12);
        }
        l60.k kVar = new l60.k();
        l60.k kVar2 = b1Var.f70371b;
        kVar2.c0(kVar, 0L, Math.min(32, kVar2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(b1Var.f70371b.size(), j11) + " content=" + kVar.q3().hex() + (char) 8230);
    }

    public static final boolean F(@m80.k b1 b1Var, long j11) {
        g0.p(b1Var, "<this>");
        if (j11 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j11).toString());
        }
        if (b1Var.f70372c) {
            throw new IllegalStateException("closed");
        }
        while (b1Var.f70371b.size() < j11) {
            if (b1Var.f70370a.L3(b1Var.f70371b, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    public static final void G(@m80.k b1 b1Var, long j11) {
        g0.p(b1Var, "<this>");
        if (!b1Var.request(j11)) {
            throw new EOFException();
        }
    }

    public static final int H(@m80.k b1 b1Var, @m80.k v0 options) {
        g0.p(b1Var, "<this>");
        g0.p(options, "options");
        if (b1Var.f70372c) {
            throw new IllegalStateException("closed");
        }
        do {
            int n02 = a.n0(b1Var.f70371b, options, true);
            if (n02 != -2) {
                if (n02 == -1) {
                    return -1;
                }
                b1Var.f70371b.skip(options.g()[n02].size());
                return n02;
            }
        } while (b1Var.f70370a.L3(b1Var.f70371b, 8192L) != -1);
        return -1;
    }

    public static final void I(@m80.k b1 b1Var, long j11) {
        g0.p(b1Var, "<this>");
        if (b1Var.f70372c) {
            throw new IllegalStateException("closed");
        }
        while (j11 > 0) {
            if (b1Var.f70371b.size() == 0 && b1Var.f70370a.L3(b1Var.f70371b, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j11, b1Var.f70371b.size());
            b1Var.f70371b.skip(min);
            j11 -= min;
        }
    }

    @m80.k
    public static final i1 J(@m80.k b1 b1Var) {
        g0.p(b1Var, "<this>");
        return b1Var.f70370a.D();
    }

    @m80.k
    public static final String K(@m80.k b1 b1Var) {
        g0.p(b1Var, "<this>");
        return "buffer(" + b1Var.f70370a + ')';
    }

    public static final boolean L(l60.k kVar, ByteString byteString, int i11, int i12, long j11, long j12) {
        if (kVar.size() < j12) {
            return true;
        }
        int max = (int) Math.max(1L, (kVar.size() - j12) + 1);
        int min = ((int) Math.min(i12, (kVar.size() - j11) + 1)) - 1;
        if (max > min) {
            return false;
        }
        int i13 = min;
        while (true) {
            l60.k kVar2 = kVar;
            ByteString byteString2 = byteString;
            int i14 = i11;
            if (kVar2.O5(kVar.size() - i13, byteString2, i14, i13)) {
                return true;
            }
            if (i13 == max) {
                return false;
            }
            i13--;
            kVar = kVar2;
            byteString = byteString2;
            i11 = i14;
        }
    }

    public static final void a(@m80.k b1 b1Var) {
        g0.p(b1Var, "<this>");
        if (b1Var.f70372c) {
            return;
        }
        b1Var.f70372c = true;
        b1Var.f70370a.close();
        b1Var.f70371b.e();
    }

    public static final boolean b(@m80.k b1 b1Var) {
        g0.p(b1Var, "<this>");
        if (b1Var.f70372c) {
            throw new IllegalStateException("closed");
        }
        return b1Var.f70371b.J() && b1Var.f70370a.L3(b1Var.f70371b, 8192L) == -1;
    }

    public static final long c(@m80.k b1 b1Var, byte b11, long j11, long j12) {
        g0.p(b1Var, "<this>");
        if (b1Var.f70372c) {
            throw new IllegalStateException("closed");
        }
        if (0 > j11 || j11 > j12) {
            throw new IllegalArgumentException(("fromIndex=" + j11 + " toIndex=" + j12).toString());
        }
        long j13 = j11;
        while (j13 < j12) {
            byte b12 = b11;
            long j14 = j12;
            long T4 = b1Var.f70371b.T4(b12, j13, j14);
            if (T4 == -1) {
                long size = b1Var.f70371b.size();
                if (size >= j14 || b1Var.f70370a.L3(b1Var.f70371b, 8192L) == -1) {
                    break;
                }
                j13 = Math.max(j13, size);
                b11 = b12;
                j12 = j14;
            } else {
                return T4;
            }
        }
        return -1L;
    }

    public static final long d(@m80.k b1 b1Var, @m80.k ByteString byteString, int i11, int i12, long j11, long j12) {
        g0.p(b1Var, "<this>");
        ByteString bytes = byteString;
        g0.p(bytes, "bytes");
        int i13 = i11;
        long j13 = i12;
        l60.h.e(bytes.size(), i13, j13);
        if (b1Var.f70372c) {
            throw new IllegalStateException("closed");
        }
        long j14 = j11;
        while (true) {
            long l11 = a.l(b1Var.f70371b, bytes, j14, j12, i13, i12);
            if (l11 != -1) {
                return l11;
            }
            long size = (b1Var.f70371b.size() - j13) + 1;
            if (size >= j12) {
                return -1L;
            }
            long j15 = j14;
            if (!L(b1Var.f70371b, byteString, i11, i12, j15, j12) || b1Var.f70370a.L3(b1Var.f70371b, 8192L) == -1) {
                return -1L;
            }
            j14 = Math.max(j15, size);
            bytes = byteString;
            i13 = i11;
        }
    }

    public static /* synthetic */ long e(b1 b1Var, ByteString byteString, int i11, int i12, long j11, long j12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        int i14 = i11;
        if ((i13 & 4) != 0) {
            i12 = byteString.size();
        }
        return d(b1Var, byteString, i14, i12, j11, (i13 & 16) != 0 ? Long.MAX_VALUE : j12);
    }

    public static final long f(@m80.k b1 b1Var, @m80.k ByteString targetBytes, long j11) {
        g0.p(b1Var, "<this>");
        g0.p(targetBytes, "targetBytes");
        if (b1Var.f70372c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long O1 = b1Var.f70371b.O1(targetBytes, j11);
            if (O1 != -1) {
                return O1;
            }
            long size = b1Var.f70371b.size();
            if (b1Var.f70370a.L3(b1Var.f70371b, 8192L) == -1) {
                return -1L;
            }
            j11 = Math.max(j11, size);
        }
    }

    @m80.k
    public static final l60.m g(@m80.k b1 b1Var) {
        g0.p(b1Var, "<this>");
        return r0.e(new x0(b1Var));
    }

    public static final boolean h(@m80.k b1 b1Var, long j11, @m80.k ByteString bytes, int i11, int i12) {
        g0.p(b1Var, "<this>");
        g0.p(bytes, "bytes");
        if (b1Var.f70372c) {
            throw new IllegalStateException("closed");
        }
        return i12 >= 0 && j11 >= 0 && i11 >= 0 && i11 + i12 <= bytes.size() && (i12 == 0 || d(b1Var, bytes, i11, i12, j11, j11 + 1) != -1);
    }

    public static final int i(@m80.k b1 b1Var, @m80.k byte[] sink, int i11, int i12) {
        g0.p(b1Var, "<this>");
        g0.p(sink, "sink");
        long j11 = i12;
        l60.h.e(sink.length, i11, j11);
        if (b1Var.f70371b.size() == 0) {
            if (i12 == 0) {
                return 0;
            }
            if (b1Var.f70370a.L3(b1Var.f70371b, 8192L) == -1) {
                return -1;
            }
        }
        return b1Var.f70371b.read(sink, i11, (int) Math.min(j11, b1Var.f70371b.size()));
    }

    public static final long j(@m80.k b1 b1Var, @m80.k l60.k sink, long j11) {
        g0.p(b1Var, "<this>");
        g0.p(sink, "sink");
        if (j11 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j11).toString());
        }
        if (b1Var.f70372c) {
            throw new IllegalStateException("closed");
        }
        if (b1Var.f70371b.size() == 0) {
            if (j11 == 0) {
                return 0L;
            }
            if (b1Var.f70370a.L3(b1Var.f70371b, 8192L) == -1) {
                return -1L;
            }
        }
        return b1Var.f70371b.L3(sink, Math.min(j11, b1Var.f70371b.size()));
    }

    public static final long k(@m80.k b1 b1Var, @m80.k e1 sink) {
        g0.p(b1Var, "<this>");
        g0.p(sink, "sink");
        long j11 = 0;
        while (b1Var.f70370a.L3(b1Var.f70371b, 8192L) != -1) {
            long j12 = b1Var.f70371b.j();
            if (j12 > 0) {
                j11 += j12;
                sink.y8(b1Var.f70371b, j12);
            }
        }
        if (b1Var.f70371b.size() <= 0) {
            return j11;
        }
        long size = j11 + b1Var.f70371b.size();
        l60.k kVar = b1Var.f70371b;
        sink.y8(kVar, kVar.size());
        return size;
    }

    public static final byte l(@m80.k b1 b1Var) {
        g0.p(b1Var, "<this>");
        b1Var.F(1L);
        return b1Var.f70371b.readByte();
    }

    @m80.k
    public static final byte[] m(@m80.k b1 b1Var) {
        g0.p(b1Var, "<this>");
        b1Var.f70371b.V2(b1Var.f70370a);
        return b1Var.f70371b.w2();
    }

    @m80.k
    public static final byte[] n(@m80.k b1 b1Var, long j11) {
        g0.p(b1Var, "<this>");
        b1Var.F(j11);
        return b1Var.f70371b.P5(j11);
    }

    @m80.k
    public static final ByteString o(@m80.k b1 b1Var) {
        g0.p(b1Var, "<this>");
        b1Var.f70371b.V2(b1Var.f70370a);
        return b1Var.f70371b.q3();
    }

    @m80.k
    public static final ByteString p(@m80.k b1 b1Var, long j11) {
        g0.p(b1Var, "<this>");
        b1Var.F(j11);
        return b1Var.f70371b.h2(j11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r4 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        r0 = new java.lang.StringBuilder();
        r0.append("Expected a digit or '-' but was 0x");
        r1 = java.lang.Integer.toString(r8, kotlin.text.a.a(16));
        kotlin.jvm.internal.g0.o(r1, "toString(...)");
        r0.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        throw new java.lang.NumberFormatException(r0.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long q(@m80.k l60.b1 r10) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r10, r0)
            r0 = 1
            r10.F(r0)
            r2 = 0
            r4 = r2
        Ld:
            long r6 = r4 + r0
            boolean r8 = r10.request(r6)
            if (r8 == 0) goto L57
            l60.k r8 = r10.f70371b
            byte r8 = r8.x0(r4)
            r9 = 48
            if (r8 < r9) goto L23
            r9 = 57
            if (r8 <= r9) goto L2c
        L23:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L2e
            r5 = 45
            if (r8 == r5) goto L2c
            goto L2e
        L2c:
            r4 = r6
            goto Ld
        L2e:
            if (r4 == 0) goto L31
            goto L57
        L31:
            java.lang.NumberFormatException r10 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected a digit or '-' but was 0x"
            r0.append(r1)
            r1 = 16
            int r1 = kotlin.text.a.a(r1)
            java.lang.String r1 = java.lang.Integer.toString(r8, r1)
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L57:
            l60.k r10 = r10.f70371b
            long r0 = r10.s7()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m60.h.q(l60.b1):long");
    }

    public static final void r(@m80.k b1 b1Var, @m80.k l60.k sink, long j11) {
        g0.p(b1Var, "<this>");
        g0.p(sink, "sink");
        try {
            b1Var.F(j11);
            b1Var.f70371b.T6(sink, j11);
        } catch (EOFException e11) {
            sink.V2(b1Var.f70371b);
            throw e11;
        }
    }

    public static final void s(@m80.k b1 b1Var, @m80.k byte[] sink) {
        g0.p(b1Var, "<this>");
        g0.p(sink, "sink");
        try {
            b1Var.F(sink.length);
            b1Var.f70371b.readFully(sink);
        } catch (EOFException e11) {
            int i11 = 0;
            while (b1Var.f70371b.size() > 0) {
                l60.k kVar = b1Var.f70371b;
                int read = kVar.read(sink, i11, (int) kVar.size());
                if (read == -1) {
                    throw new AssertionError();
                }
                i11 += read;
            }
            throw e11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
    
        r0 = new java.lang.StringBuilder();
        r0.append("Expected leading [0-9a-fA-F] character but was 0x");
        r1 = java.lang.Integer.toString(r2, kotlin.text.a.a(16));
        kotlin.jvm.internal.g0.o(r1, "toString(...)");
        r0.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        throw new java.lang.NumberFormatException(r0.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long t(@m80.k l60.b1 r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 1
            r5.F(r0)
            r0 = 0
        Lb:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.request(r2)
            if (r2 == 0) goto L5f
            l60.k r2 = r5.f70371b
            long r3 = (long) r0
            byte r2 = r2.x0(r3)
            r3 = 48
            if (r2 < r3) goto L23
            r3 = 57
            if (r2 <= r3) goto L34
        L23:
            r3 = 97
            if (r2 < r3) goto L2b
            r3 = 102(0x66, float:1.43E-43)
            if (r2 <= r3) goto L34
        L2b:
            r3 = 65
            if (r2 < r3) goto L36
            r3 = 70
            if (r2 <= r3) goto L34
            goto L36
        L34:
            r0 = r1
            goto Lb
        L36:
            if (r0 == 0) goto L39
            goto L5f
        L39:
            java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.append(r1)
            r1 = 16
            int r1 = kotlin.text.a.a(r1)
            java.lang.String r1 = java.lang.Integer.toString(r2, r1)
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L5f:
            l60.k r5 = r5.f70371b
            long r0 = r5.m4()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m60.h.t(l60.b1):long");
    }

    public static final int u(@m80.k b1 b1Var) {
        g0.p(b1Var, "<this>");
        b1Var.F(4L);
        return b1Var.f70371b.readInt();
    }

    public static final int v(@m80.k b1 b1Var) {
        g0.p(b1Var, "<this>");
        b1Var.F(4L);
        return b1Var.f70371b.b8();
    }

    public static final long w(@m80.k b1 b1Var) {
        g0.p(b1Var, "<this>");
        b1Var.F(8L);
        return b1Var.f70371b.readLong();
    }

    public static final long x(@m80.k b1 b1Var) {
        g0.p(b1Var, "<this>");
        b1Var.F(8L);
        return b1Var.f70371b.B1();
    }

    public static final short y(@m80.k b1 b1Var) {
        g0.p(b1Var, "<this>");
        b1Var.F(2L);
        return b1Var.f70371b.readShort();
    }

    public static final short z(@m80.k b1 b1Var) {
        g0.p(b1Var, "<this>");
        b1Var.F(2L);
        return b1Var.f70371b.v1();
    }
}
