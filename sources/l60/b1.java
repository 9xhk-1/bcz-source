package l60;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import okio.ByteString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nRealBufferedSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 2 RealBufferedSource.kt\nokio/internal/-RealBufferedSource\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 BufferedSource.kt\nokio/internal/-BufferedSource\n+ 5 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,207:1\n63#1:213\n63#1:224\n63#1:231\n63#1:237\n63#1:239\n63#1:243\n63#1:248\n63#1:266\n63#1:270\n63#1:277\n63#1:290\n63#1:299\n63#1:300\n63#1:301\n63#1:307\n63#1:315\n63#1:328\n63#1:332\n63#1:333\n63#1:334\n63#1:335\n63#1:340\n63#1:352\n63#1:368\n63#1:378\n63#1:381\n63#1:384\n63#1:387\n63#1:390\n63#1:393\n63#1:399\n63#1:416\n63#1:436\n63#1:451\n63#1:468\n63#1:495\n39#2:208\n40#2,3:210\n43#2,7:214\n53#2:221\n54#2:223\n58#2,2:225\n62#2:227\n63#2,2:229\n65#2,3:232\n71#2,2:235\n76#2:238\n77#2:240\n81#2,2:241\n86#2:244\n88#2,2:246\n90#2,13:249\n109#2:265\n110#2:267\n114#2,2:268\n119#2,6:271\n125#2,9:278\n136#2,3:287\n139#2,6:291\n145#2:298\n149#2,5:302\n154#2,5:308\n161#2,2:313\n163#2,11:316\n177#2:327\n178#2:329\n182#2,2:330\n187#2,4:336\n191#2,6:341\n201#2:347\n202#2,3:349\n205#2,8:353\n213#2,3:362\n220#2,3:365\n223#2,7:369\n233#2,2:376\n238#2,2:379\n243#2,2:382\n248#2,2:385\n253#2,2:388\n258#2,2:391\n263#2,5:394\n268#2,11:400\n282#2,5:411\n287#2,14:417\n304#2,2:431\n306#2,2:434\n308#2,7:437\n317#2,2:444\n319#2,4:447\n323#2,11:452\n421#2,2:463\n424#2,2:466\n426#2,7:469\n442#2:476\n444#2,12:478\n459#2:490\n463#2,4:491\n467#2:496\n469#2:497\n471#2:498\n1#3:209\n1#3:222\n1#3:228\n1#3:245\n1#3:348\n1#3:433\n1#3:446\n1#3:465\n1#3:477\n26#4,3:262\n88#5:297\n88#5:361\n*S KotlinDebug\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource\n*L\n67#1:213\n68#1:224\n70#1:231\n71#1:237\n72#1:239\n73#1:243\n74#1:248\n76#1:266\n77#1:270\n79#1:277\n81#1:290\n84#1:299\n85#1:300\n89#1:301\n93#1:307\n94#1:315\n95#1:328\n96#1:332\n99#1:333\n100#1:334\n105#1:335\n108#1:340\n110#1:352\n111#1:368\n112#1:378\n113#1:381\n114#1:384\n115#1:387\n116#1:390\n117#1:393\n118#1:399\n119#1:416\n120#1:436\n125#1:451\n135#1:468\n203#1:495\n67#1:208\n67#1:210,3\n67#1:214,7\n68#1:221\n68#1:223\n69#1:225,2\n70#1:227\n70#1:229,2\n70#1:232,3\n71#1:235,2\n72#1:238\n72#1:240\n73#1:241,2\n74#1:244\n74#1:246,2\n74#1:249,13\n76#1:265\n76#1:267\n77#1:268,2\n79#1:271,6\n79#1:278,9\n81#1:287,3\n81#1:291,6\n81#1:298\n93#1:302,5\n93#1:308,5\n94#1:313,2\n94#1:316,11\n95#1:327\n95#1:329\n96#1:330,2\n108#1:336,4\n108#1:341,6\n110#1:347\n110#1:349,3\n110#1:353,8\n110#1:362,3\n111#1:365,3\n111#1:369,7\n112#1:376,2\n113#1:379,2\n114#1:382,2\n115#1:385,2\n116#1:388,2\n117#1:391,2\n118#1:394,5\n118#1:400,11\n119#1:411,5\n119#1:417,14\n120#1:431,2\n120#1:434,2\n120#1:437,7\n125#1:444,2\n125#1:447,4\n125#1:452,11\n135#1:463,2\n135#1:466,2\n135#1:469,7\n149#1:476\n149#1:478,12\n151#1:490\n203#1:491,4\n203#1:496\n204#1:497\n205#1:498\n67#1:209\n68#1:222\n70#1:228\n74#1:245\n110#1:348\n120#1:433\n125#1:446\n135#1:465\n149#1:477\n75#1:262,3\n81#1:297\n110#1:361\n*E\n"})
/* loaded from: classes8.dex */
public final class b1 implements m {

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final g1 f70370a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final k f70371b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public boolean f70372c;

    public b1(@m80.k g1 source) {
        kotlin.jvm.internal.g0.p(source, "source");
        this.f70370a = source;
        this.f70371b = new k();
    }

    @Override // l60.m
    public long B1() {
        F(8L);
        return this.f70371b.B1();
    }

    @Override // l60.g1
    @m80.k
    public i1 D() {
        return this.f70370a.D();
    }

    @Override // l60.m
    public void F(long j11) {
        if (!request(j11)) {
            throw new EOFException();
        }
    }

    @Override // l60.m
    public boolean J() {
        if (this.f70372c) {
            throw new IllegalStateException("closed");
        }
        return this.f70371b.J() && this.f70370a.L3(this.f70371b, 8192L) == -1;
    }

    @Override // l60.m
    public boolean J0(long j11, @m80.k ByteString bytes) {
        kotlin.jvm.internal.g0.p(bytes, "bytes");
        return O5(j11, bytes, 0, bytes.size());
    }

    @Override // l60.g1
    public long L3(@m80.k k sink, long j11) {
        kotlin.jvm.internal.g0.p(sink, "sink");
        if (j11 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j11).toString());
        }
        if (this.f70372c) {
            throw new IllegalStateException("closed");
        }
        if (this.f70371b.size() == 0) {
            if (j11 == 0) {
                return 0L;
            }
            if (this.f70370a.L3(this.f70371b, 8192L) == -1) {
                return -1L;
            }
        }
        return this.f70371b.L3(sink, Math.min(j11, this.f70371b.size()));
    }

    @Override // l60.m
    @m80.k
    public String L5() {
        return b5(Long.MAX_VALUE);
    }

    @Override // l60.m
    public long O1(@m80.k ByteString targetBytes, long j11) {
        kotlin.jvm.internal.g0.p(targetBytes, "targetBytes");
        if (this.f70372c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long O1 = this.f70371b.O1(targetBytes, j11);
            if (O1 != -1) {
                return O1;
            }
            long size = this.f70371b.size();
            if (this.f70370a.L3(this.f70371b, 8192L) == -1) {
                return -1L;
            }
            j11 = Math.max(j11, size);
        }
    }

    @Override // l60.m
    public boolean O5(long j11, @m80.k ByteString bytes, int i11, int i12) {
        kotlin.jvm.internal.g0.p(bytes, "bytes");
        if (this.f70372c) {
            throw new IllegalStateException("closed");
        }
        return i12 >= 0 && j11 >= 0 && i11 >= 0 && i11 + i12 <= bytes.size() && (i12 == 0 || m60.h.d(this, bytes, i11, i12, j11, j11 + 1) != -1);
    }

    @Override // l60.m
    @m80.l
    public <T> T P(@m80.k j1<T> options) {
        kotlin.jvm.internal.g0.p(options, "options");
        int X2 = X2(options.f());
        if (X2 == -1) {
            return null;
        }
        return options.get(X2);
    }

    @Override // l60.m
    @m80.k
    public byte[] P5(long j11) {
        F(j11);
        return this.f70371b.P5(j11);
    }

    @Override // l60.m
    public long R(@m80.k ByteString bytes, long j11) {
        kotlin.jvm.internal.g0.p(bytes, "bytes");
        return X6(bytes, j11, Long.MAX_VALUE);
    }

    @Override // l60.m
    @m80.k
    public String R3() {
        this.f70371b.V2(this.f70370a);
        return this.f70371b.R3();
    }

    @Override // l60.m
    @m80.k
    public InputStream R8() {
        return new a();
    }

    @Override // l60.m
    public long T4(byte b11, long j11, long j12) {
        if (this.f70372c) {
            throw new IllegalStateException("closed");
        }
        if (0 > j11 || j11 > j12) {
            throw new IllegalArgumentException(("fromIndex=" + j11 + " toIndex=" + j12).toString());
        }
        long j13 = j11;
        while (j13 < j12) {
            byte b12 = b11;
            long j14 = j12;
            long T4 = this.f70371b.T4(b12, j13, j14);
            if (T4 == -1) {
                long size = this.f70371b.size();
                if (size >= j14 || this.f70370a.L3(this.f70371b, 8192L) == -1) {
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

    @Override // l60.m
    public void T6(@m80.k k sink, long j11) {
        kotlin.jvm.internal.g0.p(sink, "sink");
        try {
            F(j11);
            this.f70371b.T6(sink, j11);
        } catch (EOFException e11) {
            sink.V2(this.f70371b);
            throw e11;
        }
    }

    @Override // l60.m
    public long U1(byte b11) {
        return T4(b11, 0L, Long.MAX_VALUE);
    }

    @Override // l60.m
    @m80.k
    public String V3(long j11, @m80.k Charset charset) {
        kotlin.jvm.internal.g0.p(charset, "charset");
        F(j11);
        return this.f70371b.V3(j11, charset);
    }

    @Override // l60.m
    public int X2(@m80.k v0 options) {
        kotlin.jvm.internal.g0.p(options, "options");
        if (this.f70372c) {
            throw new IllegalStateException("closed");
        }
        do {
            int n02 = m60.a.n0(this.f70371b, options, true);
            if (n02 != -2) {
                if (n02 == -1) {
                    return -1;
                }
                this.f70371b.skip(options.g()[n02].size());
                return n02;
            }
        } while (this.f70370a.L3(this.f70371b, 8192L) != -1);
        return -1;
    }

    @Override // l60.m
    public long X6(@m80.k ByteString bytes, long j11, long j12) {
        kotlin.jvm.internal.g0.p(bytes, "bytes");
        return m60.h.e(this, bytes, 0, 0, j11, j12, 6, null);
    }

    @Override // l60.m
    public long b0(@m80.k ByteString bytes) {
        kotlin.jvm.internal.g0.p(bytes, "bytes");
        return R(bytes, 0L);
    }

    @Override // l60.m
    @m80.k
    public String b2(long j11) {
        F(j11);
        return this.f70371b.b2(j11);
    }

    @Override // l60.m
    @m80.k
    public String b5(long j11) {
        if (j11 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j11).toString());
        }
        long j12 = j11 == Long.MAX_VALUE ? Long.MAX_VALUE : j11 + 1;
        long T4 = T4((byte) 10, 0L, j12);
        if (T4 != -1) {
            return m60.a.l0(this.f70371b, T4);
        }
        if (j12 < Long.MAX_VALUE && request(j12) && this.f70371b.x0(j12 - 1) == 13 && request(j12 + 1) && this.f70371b.x0(j12) == 10) {
            return m60.a.l0(this.f70371b, j12);
        }
        k kVar = new k();
        k kVar2 = this.f70371b;
        kVar2.c0(kVar, 0L, Math.min(32, kVar2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f70371b.size(), j11) + " content=" + kVar.q3().hex() + (char) 8230);
    }

    @Override // l60.m
    public int b8() {
        F(4L);
        return this.f70371b.b8();
    }

    @Override // l60.g1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f70372c) {
            return;
        }
        this.f70372c = true;
        this.f70370a.close();
        this.f70371b.e();
    }

    @Override // l60.m
    @m80.k
    public k getBuffer() {
        return this.f70371b;
    }

    @Override // l60.m
    @m80.k
    public ByteString h2(long j11) {
        F(j11);
        return this.f70371b.h2(j11);
    }

    @Override // l60.m
    @m80.k
    public String h3(@m80.k Charset charset) {
        kotlin.jvm.internal.g0.p(charset, "charset");
        this.f70371b.V2(this.f70370a);
        return this.f70371b.h3(charset);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f70372c;
    }

    @Override // l60.m
    public int k3() {
        F(1L);
        byte x02 = this.f70371b.x0(0L);
        if ((x02 & ws.c.f96768m) == 192) {
            F(2L);
        } else if ((x02 & 240) == 224) {
            F(3L);
        } else if ((x02 & 248) == 240) {
            F(4L);
        }
        return this.f70371b.k3();
    }

    @Override // l60.m
    public long l0(byte b11, long j11) {
        return T4(b11, j11, Long.MAX_VALUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append("Expected leading [0-9a-fA-F] character but was 0x");
        r2 = java.lang.Integer.toString(r2, kotlin.text.a.a(16));
        kotlin.jvm.internal.g0.o(r2, "toString(...)");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    @Override // l60.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long m4() {
        /*
            r5 = this;
            r0 = 1
            r5.F(r0)
            r0 = 0
        L6:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.request(r2)
            if (r2 == 0) goto L5a
            l60.k r2 = r5.f70371b
            long r3 = (long) r0
            byte r2 = r2.x0(r3)
            r3 = 48
            if (r2 < r3) goto L1e
            r3 = 57
            if (r2 <= r3) goto L2f
        L1e:
            r3 = 97
            if (r2 < r3) goto L26
            r3 = 102(0x66, float:1.43E-43)
            if (r2 <= r3) goto L2f
        L26:
            r3 = 65
            if (r2 < r3) goto L31
            r3 = 70
            if (r2 <= r3) goto L2f
            goto L31
        L2f:
            r0 = r1
            goto L6
        L31:
            if (r0 == 0) goto L34
            goto L5a
        L34:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r3)
            r3 = 16
            int r3 = kotlin.text.a.a(r3)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.String r3 = "toString(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L5a:
            l60.k r0 = r5.f70371b
            long r0 = r0.m4()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l60.b1.m4():long");
    }

    @Override // l60.m
    public long p0(@m80.k ByteString targetBytes) {
        kotlin.jvm.internal.g0.p(targetBytes, "targetBytes");
        return O1(targetBytes, 0L);
    }

    @Override // l60.m
    @m80.k
    public m peek() {
        return r0.e(new x0(this));
    }

    @Override // l60.m
    @m80.l
    public String q0() {
        long U1 = U1((byte) 10);
        if (U1 != -1) {
            return m60.a.l0(this.f70371b, U1);
        }
        if (this.f70371b.size() != 0) {
            return b2(this.f70371b.size());
        }
        return null;
    }

    @Override // l60.m
    @m80.k
    public ByteString q3() {
        this.f70371b.V2(this.f70370a);
        return this.f70371b.q3();
    }

    @Override // l60.m
    public int read(@m80.k byte[] sink) {
        kotlin.jvm.internal.g0.p(sink, "sink");
        return read(sink, 0, sink.length);
    }

    @Override // l60.m
    public byte readByte() {
        F(1L);
        return this.f70371b.readByte();
    }

    @Override // l60.m
    public void readFully(@m80.k byte[] sink) {
        kotlin.jvm.internal.g0.p(sink, "sink");
        try {
            F(sink.length);
            this.f70371b.readFully(sink);
        } catch (EOFException e11) {
            int i11 = 0;
            while (this.f70371b.size() > 0) {
                k kVar = this.f70371b;
                int read = kVar.read(sink, i11, (int) kVar.size());
                if (read == -1) {
                    throw new AssertionError();
                }
                i11 += read;
            }
            throw e11;
        }
    }

    @Override // l60.m
    public int readInt() {
        F(4L);
        return this.f70371b.readInt();
    }

    @Override // l60.m
    public long readLong() {
        F(8L);
        return this.f70371b.readLong();
    }

    @Override // l60.m
    public short readShort() {
        F(2L);
        return this.f70371b.readShort();
    }

    @Override // l60.m
    public boolean request(long j11) {
        if (j11 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j11).toString());
        }
        if (this.f70372c) {
            throw new IllegalStateException("closed");
        }
        while (this.f70371b.size() < j11) {
            if (this.f70370a.L3(this.f70371b, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (r4 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append("Expected a digit or '-' but was 0x");
        r2 = java.lang.Integer.toString(r8, kotlin.text.a.a(16));
        kotlin.jvm.internal.g0.o(r2, "toString(...)");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    @Override // l60.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long s7() {
        /*
            r10 = this;
            r0 = 1
            r10.F(r0)
            r2 = 0
            r4 = r2
        L8:
            long r6 = r4 + r0
            boolean r8 = r10.request(r6)
            if (r8 == 0) goto L52
            l60.k r8 = r10.f70371b
            byte r8 = r8.x0(r4)
            r9 = 48
            if (r8 < r9) goto L1e
            r9 = 57
            if (r8 <= r9) goto L27
        L1e:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L29
            r5 = 45
            if (r8 == r5) goto L27
            goto L29
        L27:
            r4 = r6
            goto L8
        L29:
            if (r4 == 0) goto L2c
            goto L52
        L2c:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected a digit or '-' but was 0x"
            r1.append(r2)
            r2 = 16
            int r2 = kotlin.text.a.a(r2)
            java.lang.String r2 = java.lang.Integer.toString(r8, r2)
            java.lang.String r3 = "toString(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L52:
            l60.k r0 = r10.f70371b
            long r0 = r0.s7()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l60.b1.s7():long");
    }

    @Override // l60.m
    public void skip(long j11) {
        if (this.f70372c) {
            throw new IllegalStateException("closed");
        }
        while (j11 > 0) {
            if (this.f70371b.size() == 0 && this.f70370a.L3(this.f70371b, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j11, this.f70371b.size());
            this.f70371b.skip(min);
            j11 -= min;
        }
    }

    @m80.k
    public String toString() {
        return "buffer(" + this.f70370a + ')';
    }

    @Override // l60.m
    public short v1() {
        F(2L);
        return this.f70371b.v1();
    }

    @Override // l60.m
    @m80.k
    public byte[] w2() {
        this.f70371b.V2(this.f70370a);
        return this.f70371b.w2();
    }

    @Override // l60.m
    @m80.k
    public k z() {
        return this.f70371b;
    }

    @Override // l60.m
    public long z7(@m80.k e1 sink) {
        kotlin.jvm.internal.g0.p(sink, "sink");
        long j11 = 0;
        while (this.f70370a.L3(this.f70371b, 8192L) != -1) {
            long j12 = this.f70371b.j();
            if (j12 > 0) {
                j11 += j12;
                sink.y8(this.f70371b, j12);
            }
        }
        if (this.f70371b.size() <= 0) {
            return j11;
        }
        long size = j11 + this.f70371b.size();
        k kVar = this.f70371b;
        sink.y8(kVar, kVar.size());
        return size;
    }

    @Override // l60.m
    public int read(@m80.k byte[] sink, int i11, int i12) {
        kotlin.jvm.internal.g0.p(sink, "sink");
        long j11 = i12;
        h.e(sink.length, i11, j11);
        if (this.f70371b.size() == 0) {
            if (i12 == 0) {
                return 0;
            }
            if (this.f70370a.L3(this.f70371b, 8192L) == -1) {
                return -1;
            }
        }
        return this.f70371b.read(sink, i11, (int) Math.min(j11, this.f70371b.size()));
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nRealBufferedSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource$inputStream$1\n+ 2 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,207:1\n63#2:208\n63#2:209\n63#2:210\n63#2:212\n63#2:213\n63#2:214\n63#2:215\n63#2:217\n63#2:218\n63#2:219\n63#2:220\n73#3:211\n85#3:216\n*S KotlinDebug\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource$inputStream$1\n*L\n157#1:208\n158#1:209\n161#1:210\n168#1:212\n169#1:213\n173#1:214\n178#1:215\n189#1:217\n190#1:218\n193#1:219\n194#1:220\n161#1:211\n178#1:216\n*E\n"})
    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() {
            b1 b1Var = b1.this;
            if (b1Var.f70372c) {
                throw new IOException("closed");
            }
            return (int) Math.min(b1Var.f70371b.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            b1.this.close();
        }

        @Override // java.io.InputStream
        public int read() {
            b1 b1Var = b1.this;
            if (b1Var.f70372c) {
                throw new IOException("closed");
            }
            if (b1Var.f70371b.size() == 0) {
                b1 b1Var2 = b1.this;
                if (b1Var2.f70370a.L3(b1Var2.f70371b, 8192L) == -1) {
                    return -1;
                }
            }
            return b1.this.f70371b.readByte() & 255;
        }

        public String toString() {
            return b1.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public long transferTo(OutputStream out) {
            kotlin.jvm.internal.g0.p(out, "out");
            if (b1.this.f70372c) {
                throw new IOException("closed");
            }
            long j11 = 0;
            while (true) {
                if (b1.this.f70371b.size() == 0) {
                    b1 b1Var = b1.this;
                    if (b1Var.f70370a.L3(b1Var.f70371b, 8192L) == -1) {
                        return j11;
                    }
                }
                j11 += b1.this.f70371b.size();
                k.L1(b1.this.f70371b, out, 0L, 2, null);
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int i11, int i12) {
            kotlin.jvm.internal.g0.p(data, "data");
            if (!b1.this.f70372c) {
                h.e(data.length, i11, i12);
                if (b1.this.f70371b.size() == 0) {
                    b1 b1Var = b1.this;
                    if (b1Var.f70370a.L3(b1Var.f70371b, 8192L) == -1) {
                        return -1;
                    }
                }
                return b1.this.f70371b.read(data, i11, i12);
            }
            throw new IOException("closed");
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@m80.k ByteBuffer sink) {
        kotlin.jvm.internal.g0.p(sink, "sink");
        if (this.f70371b.size() == 0 && this.f70370a.L3(this.f70371b, 8192L) == -1) {
            return -1;
        }
        return this.f70371b.read(sink);
    }

    public static /* synthetic */ void N() {
    }
}
