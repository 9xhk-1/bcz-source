package m60;

import androidx.collection.SieveCacheKt;
import java.io.EOFException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l60.c1;
import l60.d1;
import l60.e1;
import l60.g1;
import l60.k;
import l60.l1;
import l60.v0;
import okio.ByteString;
import okio.SegmentedByteString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "-Buffer")
@u0({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/internal/-Buffer\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1712:1\n110#1,20:1735\n110#1,20:1768\n110#1:1788\n112#1,18:1790\n110#1,20:1808\n73#2:1713\n73#2:1714\n73#2:1715\n73#2:1716\n73#2:1717\n73#2:1718\n73#2:1719\n73#2:1720\n73#2:1721\n73#2:1722\n73#2:1723\n73#2:1724\n82#2:1725\n82#2:1726\n76#2:1727\n76#2:1728\n76#2:1729\n76#2:1730\n76#2:1731\n76#2:1732\n76#2:1733\n76#2:1734\n85#2:1755\n88#2:1757\n73#2:1758\n73#2:1759\n73#2:1760\n73#2:1761\n73#2:1762\n73#2:1763\n73#2:1764\n73#2:1765\n73#2:1766\n73#2:1767\n88#2:1789\n85#2:1828\n1#3:1756\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/internal/-Buffer\n*L\n413#1:1735,20\n1262#1:1768,20\n1305#1:1788\n1305#1:1790,18\n1341#1:1808,20\n176#1:1713\n200#1:1714\n319#1:1715\n324#1:1716\n347#1:1717\n348#1:1718\n349#1:1719\n350#1:1720\n356#1:1721\n357#1:1722\n358#1:1723\n359#1:1724\n383#1:1725\n384#1:1726\n390#1:1727\n391#1:1728\n392#1:1729\n393#1:1730\n394#1:1731\n395#1:1732\n396#1:1733\n397#1:1734\n425#1:1755\n858#1:1757\n876#1:1758\n878#1:1759\n882#1:1760\n884#1:1761\n888#1:1762\n890#1:1763\n894#1:1764\n896#1:1765\n916#1:1766\n919#1:1767\n1317#1:1789\n1658#1:1828\n*E\n"})
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final int f72402b = 4096;

    /* renamed from: d, reason: collision with root package name */
    public static final long f72404d = -922337203685477580L;

    /* renamed from: e, reason: collision with root package name */
    public static final long f72405e = -7;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final byte[] f72401a = l1.a(u30.h.f91619a);

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final long[] f72403c = {-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a7, code lost:
    
        r19.g1(r19.size() - r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b0, code lost:
    
        if (r2 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b2, code lost:
    
        r14 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b5, code lost:
    
        if (r1 >= r14) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bd, code lost:
    
        if (r19.size() == r17) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bf, code lost:
    
        if (r2 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c1, code lost:
    
        r1 = "Expected a digit";
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e9, code lost:
    
        throw new java.lang.NumberFormatException(r1 + " but was 0x" + l60.h.t(r19.x0(r17)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c4, code lost:
    
        r1 = "Expected a digit or '-'";
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ef, code lost:
    
        throw new java.io.EOFException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f0, code lost:
    
        if (r2 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f2, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f4, code lost:
    
        return -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b4, code lost:
    
        r14 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long A(@m80.k l60.k r19) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m60.a.A(l60.k):long");
    }

    public static final void B(@m80.k l60.k kVar, @m80.k l60.k sink, long j11) {
        g0.p(kVar, "<this>");
        g0.p(sink, "sink");
        if (kVar.size() >= j11) {
            sink.y8(kVar, j11);
        } else {
            sink.y8(kVar, kVar.size());
            throw new EOFException();
        }
    }

    public static final void C(@m80.k l60.k kVar, @m80.k byte[] sink) {
        g0.p(kVar, "<this>");
        g0.p(sink, "sink");
        int i11 = 0;
        while (i11 < sink.length) {
            int read = kVar.read(sink, i11, sink.length - i11);
            if (read == -1) {
                throw new EOFException();
            }
            i11 += read;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac A[EDGE_INSN: B:40:0x00ac->B:37:0x00ac BREAK  A[LOOP:0: B:4:0x0012->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long D(@m80.k l60.k r14) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r14, r0)
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb6
            r0 = 0
            r1 = r0
            r4 = r2
        L12:
            l60.c1 r6 = r14.f70446a
            kotlin.jvm.internal.g0.m(r6)
            byte[] r7 = r6.f70383a
            int r8 = r6.f70384b
            int r9 = r6.f70385c
        L1d:
            if (r8 >= r9) goto L98
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L2c
            r11 = 57
            if (r10 > r11) goto L2c
            int r11 = r10 + (-48)
            goto L41
        L2c:
            r11 = 97
            if (r10 < r11) goto L37
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L37
            int r11 = r10 + (-87)
            goto L41
        L37:
            r11 = 65
            if (r10 < r11) goto L79
            r11 = 70
            if (r10 > r11) goto L79
            int r11 = r10 + (-55)
        L41:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L51
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L1d
        L51:
            l60.k r14 = new l60.k
            r14.<init>()
            l60.k r14 = r14.p3(r4)
            l60.k r14 = r14.writeByte(r10)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Number too large: "
            r1.append(r2)
            java.lang.String r14 = r14.R3()
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r0.<init>(r14)
            throw r0
        L79:
            if (r0 == 0) goto L7d
            r1 = 1
            goto L98
        L7d:
            java.lang.NumberFormatException r14 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.append(r1)
            java.lang.String r1 = l60.h.t(r10)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        L98:
            if (r8 != r9) goto La4
            l60.c1 r7 = r6.b()
            r14.f70446a = r7
            l60.d1.d(r6)
            goto La6
        La4:
            r6.f70384b = r8
        La6:
            if (r1 != 0) goto Lac
            l60.c1 r6 = r14.f70446a
            if (r6 != 0) goto L12
        Lac:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.g1(r1)
            return r4
        Lb6:
            java.io.EOFException r14 = new java.io.EOFException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: m60.a.D(l60.k):long");
    }

    public static final int E(@m80.k l60.k kVar) {
        g0.p(kVar, "<this>");
        if (kVar.size() < 4) {
            throw new EOFException();
        }
        c1 c1Var = kVar.f70446a;
        g0.m(c1Var);
        int i11 = c1Var.f70384b;
        int i12 = c1Var.f70385c;
        if (i12 - i11 < 4) {
            return (kVar.readByte() & 255) | ((kVar.readByte() & 255) << 24) | ((kVar.readByte() & 255) << 16) | ((kVar.readByte() & 255) << 8);
        }
        byte[] bArr = c1Var.f70383a;
        int i13 = i11 + 3;
        int i14 = ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11] & 255) << 24) | ((bArr[i11 + 2] & 255) << 8);
        int i15 = i11 + 4;
        int i16 = (bArr[i13] & 255) | i14;
        kVar.g1(kVar.size() - 4);
        if (i15 != i12) {
            c1Var.f70384b = i15;
            return i16;
        }
        kVar.f70446a = c1Var.b();
        d1.d(c1Var);
        return i16;
    }

    public static final long F(@m80.k l60.k kVar) {
        g0.p(kVar, "<this>");
        if (kVar.size() < 8) {
            throw new EOFException();
        }
        c1 c1Var = kVar.f70446a;
        g0.m(c1Var);
        int i11 = c1Var.f70384b;
        int i12 = c1Var.f70385c;
        if (i12 - i11 < 8) {
            return ((kVar.readInt() & 4294967295L) << 32) | (4294967295L & kVar.readInt());
        }
        byte[] bArr = c1Var.f70383a;
        int i13 = i11 + 7;
        long j11 = ((bArr[i11] & 255) << 56) | ((bArr[i11 + 1] & 255) << 48) | ((bArr[i11 + 2] & 255) << 40) | ((bArr[i11 + 3] & 255) << 32) | ((bArr[i11 + 4] & 255) << 24) | ((bArr[i11 + 5] & 255) << 16) | ((bArr[i11 + 6] & 255) << 8);
        int i14 = i11 + 8;
        long j12 = j11 | (bArr[i13] & 255);
        kVar.g1(kVar.size() - 8);
        if (i14 != i12) {
            c1Var.f70384b = i14;
            return j12;
        }
        kVar.f70446a = c1Var.b();
        d1.d(c1Var);
        return j12;
    }

    public static final short G(@m80.k l60.k kVar) {
        g0.p(kVar, "<this>");
        if (kVar.size() < 2) {
            throw new EOFException();
        }
        c1 c1Var = kVar.f70446a;
        g0.m(c1Var);
        int i11 = c1Var.f70384b;
        int i12 = c1Var.f70385c;
        if (i12 - i11 < 2) {
            return (short) ((kVar.readByte() & 255) | ((kVar.readByte() & 255) << 8));
        }
        byte[] bArr = c1Var.f70383a;
        int i13 = i11 + 1;
        int i14 = (bArr[i11] & 255) << 8;
        int i15 = i11 + 2;
        int i16 = (bArr[i13] & 255) | i14;
        kVar.g1(kVar.size() - 2);
        if (i15 == i12) {
            kVar.f70446a = c1Var.b();
            d1.d(c1Var);
        } else {
            c1Var.f70384b = i15;
        }
        return (short) i16;
    }

    @m80.k
    public static final k.a H(@m80.k l60.k kVar, @m80.k k.a unsafeCursor) {
        g0.p(kVar, "<this>");
        g0.p(unsafeCursor, "unsafeCursor");
        k.a m11 = l60.h.m(unsafeCursor);
        if (m11.f70448a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        m11.f70448a = kVar;
        m11.f70449b = false;
        return m11;
    }

    @m80.k
    public static final String I(@m80.k l60.k kVar, long j11) {
        g0.p(kVar, "<this>");
        if (j11 < 0 || j11 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException(("byteCount: " + j11).toString());
        }
        if (kVar.size() < j11) {
            throw new EOFException();
        }
        if (j11 == 0) {
            return "";
        }
        c1 c1Var = kVar.f70446a;
        g0.m(c1Var);
        int i11 = c1Var.f70384b;
        if (i11 + j11 > c1Var.f70385c) {
            return a0.c(kVar.P5(j11), 0, 0, 3, null);
        }
        int i12 = (int) j11;
        String b11 = a0.b(c1Var.f70383a, i11, i11 + i12);
        c1Var.f70384b += i12;
        kVar.g1(kVar.size() - j11);
        if (c1Var.f70384b == c1Var.f70385c) {
            kVar.f70446a = c1Var.b();
            d1.d(c1Var);
        }
        return b11;
    }

    public static final int J(@m80.k l60.k kVar) {
        int i11;
        int i12;
        int i13;
        g0.p(kVar, "<this>");
        if (kVar.size() == 0) {
            throw new EOFException();
        }
        byte x02 = kVar.x0(0L);
        if ((x02 & 128) == 0) {
            i11 = x02 & Byte.MAX_VALUE;
            i13 = 0;
            i12 = 1;
        } else if ((x02 & ws.c.f96768m) == 192) {
            i11 = x02 & 31;
            i12 = 2;
            i13 = 128;
        } else if ((x02 & 240) == 224) {
            i11 = x02 & 15;
            i12 = 3;
            i13 = 2048;
        } else {
            if ((x02 & 248) != 240) {
                kVar.skip(1L);
                return 65533;
            }
            i11 = x02 & 7;
            i12 = 4;
            i13 = 65536;
        }
        long j11 = i12;
        if (kVar.size() < j11) {
            throw new EOFException("size < " + i12 + ": " + kVar.size() + " (to read code point prefixed 0x" + l60.h.t(x02) + ')');
        }
        for (int i14 = 1; i14 < i12; i14++) {
            long j12 = i14;
            byte x03 = kVar.x0(j12);
            if ((x03 & com.baicizhan.main.vld.bonding.j.f25378c) != 128) {
                kVar.skip(j12);
                return 65533;
            }
            i11 = (i11 << 6) | (x03 & 63);
        }
        kVar.skip(j11);
        if (i11 > 1114111) {
            return 65533;
        }
        if ((55296 > i11 || i11 >= 57344) && i11 >= i13) {
            return i11;
        }
        return 65533;
    }

    @m80.l
    public static final String K(@m80.k l60.k kVar) {
        g0.p(kVar, "<this>");
        long U1 = kVar.U1((byte) 10);
        if (U1 != -1) {
            return l0(kVar, U1);
        }
        if (kVar.size() != 0) {
            return kVar.b2(kVar.size());
        }
        return null;
    }

    @m80.k
    public static final String L(@m80.k l60.k kVar, long j11) {
        g0.p(kVar, "<this>");
        if (j11 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j11).toString());
        }
        long j12 = j11 != Long.MAX_VALUE ? j11 + 1 : Long.MAX_VALUE;
        long T4 = kVar.T4((byte) 10, 0L, j12);
        if (T4 != -1) {
            return l0(kVar, T4);
        }
        if (j12 < kVar.size() && kVar.x0(j12 - 1) == 13 && kVar.x0(j12) == 10) {
            return l0(kVar, j12);
        }
        l60.k kVar2 = new l60.k();
        kVar.c0(kVar2, 0L, Math.min(32, kVar.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(kVar.size(), j11) + " content=" + kVar2.q3().hex() + (char) 8230);
    }

    public static final long M(@m80.k k.a aVar, long j11) {
        g0.p(aVar, "<this>");
        l60.k kVar = aVar.f70448a;
        if (kVar == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!aVar.f70449b) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
        }
        long size = kVar.size();
        if (j11 <= size) {
            if (j11 < 0) {
                throw new IllegalArgumentException(("newSize < 0: " + j11).toString());
            }
            long j12 = size - j11;
            while (true) {
                if (j12 <= 0) {
                    break;
                }
                c1 c1Var = kVar.f70446a;
                g0.m(c1Var);
                c1 c1Var2 = c1Var.f70389g;
                g0.m(c1Var2);
                int i11 = c1Var2.f70385c;
                long j13 = i11 - c1Var2.f70384b;
                if (j13 > j12) {
                    c1Var2.f70385c = i11 - ((int) j12);
                    break;
                }
                kVar.f70446a = c1Var2.b();
                d1.d(c1Var2);
                j12 -= j13;
            }
            aVar.j(null);
            aVar.f70451d = j11;
            aVar.f70452e = null;
            aVar.f70453f = -1;
            aVar.f70454g = -1;
        } else if (j11 > size) {
            long j14 = j11 - size;
            boolean z11 = true;
            while (j14 > 0) {
                c1 m12 = kVar.m1(1);
                int min = (int) Math.min(j14, 8192 - m12.f70385c);
                m12.f70385c += min;
                j14 -= min;
                if (z11) {
                    aVar.j(m12);
                    aVar.f70451d = size;
                    aVar.f70452e = m12.f70383a;
                    int i12 = m12.f70385c;
                    aVar.f70453f = i12 - min;
                    aVar.f70454g = i12;
                    z11 = false;
                }
            }
        }
        kVar.g1(j11);
        return size;
    }

    public static final int N(@m80.k k.a aVar, long j11) {
        c1 c1Var;
        g0.p(aVar, "<this>");
        l60.k kVar = aVar.f70448a;
        if (kVar == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (j11 < -1 || j11 > kVar.size()) {
            throw new ArrayIndexOutOfBoundsException("offset=" + j11 + " > size=" + kVar.size());
        }
        if (j11 == -1 || j11 == kVar.size()) {
            aVar.j(null);
            aVar.f70451d = j11;
            aVar.f70452e = null;
            aVar.f70453f = -1;
            aVar.f70454g = -1;
            return -1;
        }
        long size = kVar.size();
        c1 c1Var2 = kVar.f70446a;
        long j12 = 0;
        if (aVar.c() != null) {
            long j13 = aVar.f70451d;
            int i11 = aVar.f70453f;
            g0.m(aVar.c());
            long j14 = j13 - (i11 - r9.f70384b);
            if (j14 > j11) {
                c1Var = c1Var2;
                c1Var2 = aVar.c();
                size = j14;
            } else {
                c1Var = aVar.c();
                j12 = j14;
            }
        } else {
            c1Var = c1Var2;
        }
        if (size - j11 > j11 - j12) {
            while (true) {
                g0.m(c1Var);
                int i12 = c1Var.f70385c;
                int i13 = c1Var.f70384b;
                if (j11 < (i12 - i13) + j12) {
                    break;
                }
                j12 += i12 - i13;
                c1Var = c1Var.f70388f;
            }
        } else {
            while (size > j11) {
                g0.m(c1Var2);
                c1Var2 = c1Var2.f70389g;
                g0.m(c1Var2);
                size -= c1Var2.f70385c - c1Var2.f70384b;
            }
            j12 = size;
            c1Var = c1Var2;
        }
        if (aVar.f70449b) {
            g0.m(c1Var);
            if (c1Var.f70386d) {
                c1 f11 = c1Var.f();
                if (kVar.f70446a == c1Var) {
                    kVar.f70446a = f11;
                }
                c1Var = c1Var.c(f11);
                c1 c1Var3 = c1Var.f70389g;
                g0.m(c1Var3);
                c1Var3.b();
            }
        }
        aVar.j(c1Var);
        aVar.f70451d = j11;
        g0.m(c1Var);
        aVar.f70452e = c1Var.f70383a;
        int i14 = c1Var.f70384b + ((int) (j11 - j12));
        aVar.f70453f = i14;
        int i15 = c1Var.f70385c;
        aVar.f70454g = i15;
        return i15 - i14;
    }

    public static final int O(@m80.k l60.k kVar, @m80.k v0 options) {
        g0.p(kVar, "<this>");
        g0.p(options, "options");
        int o02 = o0(kVar, options, false, 2, null);
        if (o02 == -1) {
            return -1;
        }
        kVar.skip(options.g()[o02].size());
        return o02;
    }

    public static final void P(@m80.k l60.k kVar, long j11) {
        g0.p(kVar, "<this>");
        while (j11 > 0) {
            c1 c1Var = kVar.f70446a;
            if (c1Var == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j11, c1Var.f70385c - c1Var.f70384b);
            long j12 = min;
            kVar.g1(kVar.size() - j12);
            j11 -= j12;
            int i11 = c1Var.f70384b + min;
            c1Var.f70384b = i11;
            if (i11 == c1Var.f70385c) {
                kVar.f70446a = c1Var.b();
                d1.d(c1Var);
            }
        }
    }

    @m80.k
    public static final ByteString Q(@m80.k l60.k kVar) {
        g0.p(kVar, "<this>");
        if (kVar.size() <= SieveCacheKt.NodeLinkMask) {
            return kVar.l1((int) kVar.size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + kVar.size()).toString());
    }

    @m80.k
    public static final ByteString R(@m80.k l60.k kVar, int i11) {
        g0.p(kVar, "<this>");
        if (i11 == 0) {
            return ByteString.EMPTY;
        }
        l60.h.e(kVar.size(), 0L, i11);
        c1 c1Var = kVar.f70446a;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i11) {
            g0.m(c1Var);
            int i15 = c1Var.f70385c;
            int i16 = c1Var.f70384b;
            if (i15 == i16) {
                throw new AssertionError("s.limit == s.pos");
            }
            i13 += i15 - i16;
            i14++;
            c1Var = c1Var.f70388f;
        }
        byte[][] bArr = new byte[i14][];
        int[] iArr = new int[i14 * 2];
        c1 c1Var2 = kVar.f70446a;
        int i17 = 0;
        while (i12 < i11) {
            g0.m(c1Var2);
            bArr[i17] = c1Var2.f70383a;
            i12 += c1Var2.f70385c - c1Var2.f70384b;
            iArr[i17] = Math.min(i12, i11);
            iArr[i17 + i14] = c1Var2.f70384b;
            c1Var2.f70386d = true;
            i17++;
            c1Var2 = c1Var2.f70388f;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    @m80.k
    public static final c1 S(@m80.k l60.k kVar, int i11) {
        g0.p(kVar, "<this>");
        if (i11 < 1 || i11 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        c1 c1Var = kVar.f70446a;
        if (c1Var != null) {
            g0.m(c1Var);
            c1 c1Var2 = c1Var.f70389g;
            g0.m(c1Var2);
            return (c1Var2.f70385c + i11 > 8192 || !c1Var2.f70387e) ? c1Var2.c(d1.e()) : c1Var2;
        }
        c1 e11 = d1.e();
        kVar.f70446a = e11;
        e11.f70389g = e11;
        e11.f70388f = e11;
        return e11;
    }

    @m80.k
    public static final l60.k T(@m80.k l60.k kVar, @m80.k g1 source, long j11) {
        g0.p(kVar, "<this>");
        g0.p(source, "source");
        while (j11 > 0) {
            long L3 = source.L3(kVar, j11);
            if (L3 == -1) {
                throw new EOFException();
            }
            j11 -= L3;
        }
        return kVar;
    }

    @m80.k
    public static final l60.k U(@m80.k l60.k kVar, @m80.k ByteString byteString, int i11, int i12) {
        g0.p(kVar, "<this>");
        g0.p(byteString, "byteString");
        byteString.write$okio(kVar, i11, i12);
        return kVar;
    }

    @m80.k
    public static final l60.k V(@m80.k l60.k kVar, @m80.k byte[] source) {
        g0.p(kVar, "<this>");
        g0.p(source, "source");
        return kVar.write(source, 0, source.length);
    }

    @m80.k
    public static final l60.k W(@m80.k l60.k kVar, @m80.k byte[] source, int i11, int i12) {
        g0.p(kVar, "<this>");
        g0.p(source, "source");
        long j11 = i12;
        l60.h.e(source.length, i11, j11);
        int i13 = i12 + i11;
        while (i11 < i13) {
            c1 m12 = kVar.m1(1);
            int min = Math.min(i13 - i11, 8192 - m12.f70385c);
            int i14 = i11 + min;
            a00.q.v0(source, m12.f70383a, m12.f70385c, i11, i14);
            m12.f70385c += min;
            i11 = i14;
        }
        kVar.g1(kVar.size() + j11);
        return kVar;
    }

    public static final void X(@m80.k l60.k kVar, @m80.k l60.k source, long j11) {
        c1 c1Var;
        g0.p(kVar, "<this>");
        g0.p(source, "source");
        if (source == kVar) {
            throw new IllegalArgumentException("source == this");
        }
        l60.h.e(source.size(), 0L, j11);
        while (j11 > 0) {
            c1 c1Var2 = source.f70446a;
            g0.m(c1Var2);
            int i11 = c1Var2.f70385c;
            g0.m(source.f70446a);
            if (j11 < i11 - r1.f70384b) {
                c1 c1Var3 = kVar.f70446a;
                if (c1Var3 != null) {
                    g0.m(c1Var3);
                    c1Var = c1Var3.f70389g;
                } else {
                    c1Var = null;
                }
                if (c1Var != null && c1Var.f70387e) {
                    if ((c1Var.f70385c + j11) - (c1Var.f70386d ? 0 : c1Var.f70384b) <= 8192) {
                        c1 c1Var4 = source.f70446a;
                        g0.m(c1Var4);
                        c1Var4.g(c1Var, (int) j11);
                        source.g1(source.size() - j11);
                        kVar.g1(kVar.size() + j11);
                        return;
                    }
                }
                c1 c1Var5 = source.f70446a;
                g0.m(c1Var5);
                source.f70446a = c1Var5.e((int) j11);
            }
            c1 c1Var6 = source.f70446a;
            g0.m(c1Var6);
            long j12 = c1Var6.f70385c - c1Var6.f70384b;
            source.f70446a = c1Var6.b();
            c1 c1Var7 = kVar.f70446a;
            if (c1Var7 == null) {
                kVar.f70446a = c1Var6;
                c1Var6.f70389g = c1Var6;
                c1Var6.f70388f = c1Var6;
            } else {
                g0.m(c1Var7);
                c1 c1Var8 = c1Var7.f70389g;
                g0.m(c1Var8);
                c1Var8.c(c1Var6).a();
            }
            source.g1(source.size() - j12);
            kVar.g1(kVar.size() + j12);
            j11 -= j12;
        }
    }

    public static /* synthetic */ l60.k Y(l60.k kVar, ByteString byteString, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = byteString.size();
        }
        g0.p(kVar, "<this>");
        g0.p(byteString, "byteString");
        byteString.write$okio(kVar, i11, i12);
        return kVar;
    }

    public static final long Z(@m80.k l60.k kVar, @m80.k g1 source) {
        g0.p(kVar, "<this>");
        g0.p(source, "source");
        long j11 = 0;
        while (true) {
            long L3 = source.L3(kVar, 8192L);
            if (L3 == -1) {
                return j11;
            }
            j11 += L3;
        }
    }

    @m80.k
    public static final l60.k a0(@m80.k l60.k kVar, int i11) {
        g0.p(kVar, "<this>");
        c1 m12 = kVar.m1(1);
        byte[] bArr = m12.f70383a;
        int i12 = m12.f70385c;
        m12.f70385c = i12 + 1;
        bArr[i12] = (byte) i11;
        kVar.g1(kVar.size() + 1);
        return kVar;
    }

    public static final void b(@m80.k l60.k kVar) {
        g0.p(kVar, "<this>");
        kVar.skip(kVar.size());
    }

    @m80.k
    public static final l60.k b0(@m80.k l60.k kVar, long j11) {
        boolean z11;
        g0.p(kVar, "<this>");
        if (j11 == 0) {
            return kVar.writeByte(48);
        }
        if (j11 < 0) {
            j11 = -j11;
            if (j11 < 0) {
                return kVar.n5("-9223372036854775808");
            }
            z11 = true;
        } else {
            z11 = false;
        }
        int i02 = i0(j11);
        if (z11) {
            i02++;
        }
        c1 m12 = kVar.m1(i02);
        byte[] bArr = m12.f70383a;
        int i11 = m12.f70385c + i02;
        while (j11 != 0) {
            long j12 = 10;
            i11--;
            bArr[i11] = j0()[(int) (j11 % j12)];
            j11 /= j12;
        }
        if (z11) {
            bArr[i11 - 1] = kx.a0.f68904b;
        }
        m12.f70385c += i02;
        kVar.g1(kVar.size() + i02);
        return kVar;
    }

    public static final void c(@m80.k k.a aVar) {
        g0.p(aVar, "<this>");
        if (aVar.f70448a == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        aVar.f70448a = null;
        aVar.j(null);
        aVar.f70451d = -1L;
        aVar.f70452e = null;
        aVar.f70453f = -1;
        aVar.f70454g = -1;
    }

    @m80.k
    public static final l60.k c0(@m80.k l60.k kVar, long j11) {
        g0.p(kVar, "<this>");
        if (j11 == 0) {
            return kVar.writeByte(48);
        }
        long j12 = (j11 >>> 1) | j11;
        long j13 = j12 | (j12 >>> 2);
        long j14 = j13 | (j13 >>> 4);
        long j15 = j14 | (j14 >>> 8);
        long j16 = j15 | (j15 >>> 16);
        long j17 = j16 | (j16 >>> 32);
        long j18 = j17 - ((j17 >>> 1) & 6148914691236517205L);
        long j19 = ((j18 >>> 2) & 3689348814741910323L) + (j18 & 3689348814741910323L);
        long j21 = ((j19 >>> 4) + j19) & 1085102592571150095L;
        long j22 = j21 + (j21 >>> 8);
        long j23 = j22 + (j22 >>> 16);
        int i11 = (int) ((((j23 & 63) + ((j23 >>> 32) & 63)) + 3) / 4);
        c1 m12 = kVar.m1(i11);
        byte[] bArr = m12.f70383a;
        int i12 = m12.f70385c;
        for (int i13 = (i12 + i11) - 1; i13 >= i12; i13--) {
            bArr[i13] = j0()[(int) (15 & j11)];
            j11 >>>= 4;
        }
        m12.f70385c += i11;
        kVar.g1(kVar.size() + i11);
        return kVar;
    }

    public static final long d(@m80.k l60.k kVar) {
        g0.p(kVar, "<this>");
        long size = kVar.size();
        if (size == 0) {
            return 0L;
        }
        c1 c1Var = kVar.f70446a;
        g0.m(c1Var);
        c1 c1Var2 = c1Var.f70389g;
        g0.m(c1Var2);
        return (c1Var2.f70385c >= 8192 || !c1Var2.f70387e) ? size : size - (r2 - c1Var2.f70384b);
    }

    @m80.k
    public static final l60.k d0(@m80.k l60.k kVar, int i11) {
        g0.p(kVar, "<this>");
        c1 m12 = kVar.m1(4);
        byte[] bArr = m12.f70383a;
        int i12 = m12.f70385c;
        bArr[i12] = (byte) ((i11 >>> 24) & 255);
        bArr[i12 + 1] = (byte) ((i11 >>> 16) & 255);
        bArr[i12 + 2] = (byte) ((i11 >>> 8) & 255);
        bArr[i12 + 3] = (byte) (i11 & 255);
        m12.f70385c = i12 + 4;
        kVar.g1(kVar.size() + 4);
        return kVar;
    }

    @m80.k
    public static final l60.k e(@m80.k l60.k kVar) {
        g0.p(kVar, "<this>");
        l60.k kVar2 = new l60.k();
        if (kVar.size() == 0) {
            return kVar2;
        }
        c1 c1Var = kVar.f70446a;
        g0.m(c1Var);
        c1 d11 = c1Var.d();
        kVar2.f70446a = d11;
        d11.f70389g = d11;
        d11.f70388f = d11;
        for (c1 c1Var2 = c1Var.f70388f; c1Var2 != c1Var; c1Var2 = c1Var2.f70388f) {
            c1 c1Var3 = d11.f70389g;
            g0.m(c1Var3);
            g0.m(c1Var2);
            c1Var3.c(c1Var2.d());
        }
        kVar2.g1(kVar.size());
        return kVar2;
    }

    @m80.k
    public static final l60.k e0(@m80.k l60.k kVar, long j11) {
        g0.p(kVar, "<this>");
        c1 m12 = kVar.m1(8);
        byte[] bArr = m12.f70383a;
        int i11 = m12.f70385c;
        bArr[i11] = (byte) ((j11 >>> 56) & 255);
        bArr[i11 + 1] = (byte) ((j11 >>> 48) & 255);
        bArr[i11 + 2] = (byte) ((j11 >>> 40) & 255);
        bArr[i11 + 3] = (byte) ((j11 >>> 32) & 255);
        bArr[i11 + 4] = (byte) ((j11 >>> 24) & 255);
        bArr[i11 + 5] = (byte) ((j11 >>> 16) & 255);
        bArr[i11 + 6] = (byte) ((j11 >>> 8) & 255);
        bArr[i11 + 7] = (byte) (j11 & 255);
        m12.f70385c = i11 + 8;
        kVar.g1(kVar.size() + 8);
        return kVar;
    }

    @m80.k
    public static final l60.k f(@m80.k l60.k kVar, @m80.k l60.k out, long j11, long j12) {
        g0.p(kVar, "<this>");
        g0.p(out, "out");
        long j13 = j11;
        l60.h.e(kVar.size(), j13, j12);
        if (j12 != 0) {
            out.g1(out.size() + j12);
            c1 c1Var = kVar.f70446a;
            while (true) {
                g0.m(c1Var);
                int i11 = c1Var.f70385c;
                int i12 = c1Var.f70384b;
                if (j13 < i11 - i12) {
                    break;
                }
                j13 -= i11 - i12;
                c1Var = c1Var.f70388f;
            }
            c1 c1Var2 = c1Var;
            long j14 = j12;
            while (j14 > 0) {
                g0.m(c1Var2);
                c1 d11 = c1Var2.d();
                int i13 = d11.f70384b + ((int) j13);
                d11.f70384b = i13;
                d11.f70385c = Math.min(i13 + ((int) j14), d11.f70385c);
                c1 c1Var3 = out.f70446a;
                if (c1Var3 == null) {
                    d11.f70389g = d11;
                    d11.f70388f = d11;
                    out.f70446a = d11;
                } else {
                    g0.m(c1Var3);
                    c1 c1Var4 = c1Var3.f70389g;
                    g0.m(c1Var4);
                    c1Var4.c(d11);
                }
                j14 -= d11.f70385c - d11.f70384b;
                c1Var2 = c1Var2.f70388f;
                j13 = 0;
            }
        }
        return kVar;
    }

    @m80.k
    public static final l60.k f0(@m80.k l60.k kVar, int i11) {
        g0.p(kVar, "<this>");
        c1 m12 = kVar.m1(2);
        byte[] bArr = m12.f70383a;
        int i12 = m12.f70385c;
        bArr[i12] = (byte) ((i11 >>> 8) & 255);
        bArr[i12 + 1] = (byte) (i11 & 255);
        m12.f70385c = i12 + 2;
        kVar.g1(kVar.size() + 2);
        return kVar;
    }

    public static final boolean g(@m80.k l60.k kVar, @m80.l Object obj) {
        g0.p(kVar, "<this>");
        if (kVar == obj) {
            return true;
        }
        if (!(obj instanceof l60.k)) {
            return false;
        }
        l60.k kVar2 = (l60.k) obj;
        if (kVar.size() != kVar2.size()) {
            return false;
        }
        if (kVar.size() == 0) {
            return true;
        }
        c1 c1Var = kVar.f70446a;
        g0.m(c1Var);
        c1 c1Var2 = kVar2.f70446a;
        g0.m(c1Var2);
        int i11 = c1Var.f70384b;
        int i12 = c1Var2.f70384b;
        long j11 = 0;
        while (j11 < kVar.size()) {
            long min = Math.min(c1Var.f70385c - i11, c1Var2.f70385c - i12);
            long j12 = 0;
            while (j12 < min) {
                int i13 = i11 + 1;
                int i14 = i12 + 1;
                if (c1Var.f70383a[i11] != c1Var2.f70383a[i12]) {
                    return false;
                }
                j12++;
                i11 = i13;
                i12 = i14;
            }
            if (i11 == c1Var.f70385c) {
                c1Var = c1Var.f70388f;
                g0.m(c1Var);
                i11 = c1Var.f70384b;
            }
            if (i12 == c1Var2.f70385c) {
                c1Var2 = c1Var2.f70388f;
                g0.m(c1Var2);
                i12 = c1Var2.f70384b;
            }
            j11 += min;
        }
        return true;
    }

    @m80.k
    public static final l60.k g0(@m80.k l60.k kVar, @m80.k String string, int i11, int i12) {
        char charAt;
        g0.p(kVar, "<this>");
        g0.p(string, "string");
        if (i11 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i11).toString());
        }
        if (i12 < i11) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i12 + " < " + i11).toString());
        }
        if (i12 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i12 + " > " + string.length()).toString());
        }
        while (i11 < i12) {
            char charAt2 = string.charAt(i11);
            if (charAt2 < 128) {
                c1 m12 = kVar.m1(1);
                byte[] bArr = m12.f70383a;
                int i13 = m12.f70385c - i11;
                int min = Math.min(i12, 8192 - i13);
                int i14 = i11 + 1;
                bArr[i11 + i13] = (byte) charAt2;
                while (true) {
                    i11 = i14;
                    if (i11 >= min || (charAt = string.charAt(i11)) >= 128) {
                        break;
                    }
                    i14 = i11 + 1;
                    bArr[i11 + i13] = (byte) charAt;
                }
                int i15 = m12.f70385c;
                int i16 = (i13 + i11) - i15;
                m12.f70385c = i15 + i16;
                kVar.g1(kVar.size() + i16);
            } else {
                if (charAt2 < 2048) {
                    c1 m13 = kVar.m1(2);
                    byte[] bArr2 = m13.f70383a;
                    int i17 = m13.f70385c;
                    bArr2[i17] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i17 + 1] = (byte) ((charAt2 & s60.d.f88057a) | 128);
                    m13.f70385c = i17 + 2;
                    kVar.g1(kVar.size() + 2);
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    c1 m14 = kVar.m1(3);
                    byte[] bArr3 = m14.f70383a;
                    int i18 = m14.f70385c;
                    bArr3[i18] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i18 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i18 + 2] = (byte) ((charAt2 & s60.d.f88057a) | 128);
                    m14.f70385c = i18 + 3;
                    kVar.g1(kVar.size() + 3);
                } else {
                    int i19 = i11 + 1;
                    char charAt3 = i19 < i12 ? string.charAt(i19) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        kVar.writeByte(63);
                        i11 = i19;
                    } else {
                        int i21 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        c1 m15 = kVar.m1(4);
                        byte[] bArr4 = m15.f70383a;
                        int i22 = m15.f70385c;
                        bArr4[i22] = (byte) ((i21 >> 18) | 240);
                        bArr4[i22 + 1] = (byte) (((i21 >> 12) & 63) | 128);
                        bArr4[i22 + 2] = (byte) (((i21 >> 6) & 63) | 128);
                        bArr4[i22 + 3] = (byte) ((i21 & 63) | 128);
                        m15.f70385c = i22 + 4;
                        kVar.g1(kVar.size() + 4);
                        i11 += 2;
                    }
                }
                i11++;
            }
        }
        return kVar;
    }

    public static final long h(@m80.k k.a aVar, int i11) {
        g0.p(aVar, "<this>");
        if (i11 <= 0) {
            throw new IllegalArgumentException(("minByteCount <= 0: " + i11).toString());
        }
        if (i11 > 8192) {
            throw new IllegalArgumentException(("minByteCount > Segment.SIZE: " + i11).toString());
        }
        l60.k kVar = aVar.f70448a;
        if (kVar == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!aVar.f70449b) {
            throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
        }
        long size = kVar.size();
        c1 m12 = kVar.m1(i11);
        int i12 = 8192 - m12.f70385c;
        m12.f70385c = 8192;
        long j11 = i12;
        kVar.g1(size + j11);
        aVar.j(m12);
        aVar.f70451d = size;
        aVar.f70452e = m12.f70383a;
        aVar.f70453f = 8192 - i12;
        aVar.f70454g = 8192;
        return j11;
    }

    @m80.k
    public static final l60.k h0(@m80.k l60.k kVar, int i11) {
        g0.p(kVar, "<this>");
        if (i11 < 128) {
            kVar.writeByte(i11);
            return kVar;
        }
        if (i11 < 2048) {
            c1 m12 = kVar.m1(2);
            byte[] bArr = m12.f70383a;
            int i12 = m12.f70385c;
            bArr[i12] = (byte) ((i11 >> 6) | 192);
            bArr[i12 + 1] = (byte) ((i11 & 63) | 128);
            m12.f70385c = i12 + 2;
            kVar.g1(kVar.size() + 2);
            return kVar;
        }
        if (55296 <= i11 && i11 < 57344) {
            kVar.writeByte(63);
            return kVar;
        }
        if (i11 < 65536) {
            c1 m13 = kVar.m1(3);
            byte[] bArr2 = m13.f70383a;
            int i13 = m13.f70385c;
            bArr2[i13] = (byte) ((i11 >> 12) | 224);
            bArr2[i13 + 1] = (byte) (((i11 >> 6) & 63) | 128);
            bArr2[i13 + 2] = (byte) ((i11 & 63) | 128);
            m13.f70385c = i13 + 3;
            kVar.g1(kVar.size() + 3);
            return kVar;
        }
        if (i11 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + l60.h.u(i11));
        }
        c1 m14 = kVar.m1(4);
        byte[] bArr3 = m14.f70383a;
        int i14 = m14.f70385c;
        bArr3[i14] = (byte) ((i11 >> 18) | 240);
        bArr3[i14 + 1] = (byte) (((i11 >> 12) & 63) | 128);
        bArr3[i14 + 2] = (byte) (((i11 >> 6) & 63) | 128);
        bArr3[i14 + 3] = (byte) ((i11 & 63) | 128);
        m14.f70385c = i14 + 4;
        kVar.g1(kVar.size() + 4);
        return kVar;
    }

    public static final byte i(@m80.k l60.k kVar, long j11) {
        g0.p(kVar, "<this>");
        l60.h.e(kVar.size(), j11, 1L);
        c1 c1Var = kVar.f70446a;
        if (c1Var == null) {
            g0.m(null);
            throw null;
        }
        if (kVar.size() - j11 < j11) {
            long size = kVar.size();
            while (size > j11) {
                c1Var = c1Var.f70389g;
                g0.m(c1Var);
                size -= c1Var.f70385c - c1Var.f70384b;
            }
            g0.m(c1Var);
            return c1Var.f70383a[(int) ((c1Var.f70384b + j11) - size)];
        }
        long j12 = 0;
        while (true) {
            long j13 = (c1Var.f70385c - c1Var.f70384b) + j12;
            if (j13 > j11) {
                g0.m(c1Var);
                return c1Var.f70383a[(int) ((c1Var.f70384b + j11) - j12)];
            }
            c1Var = c1Var.f70388f;
            g0.m(c1Var);
            j12 = j13;
        }
    }

    public static final int i0(long j11) {
        int numberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j11)) * 10) >>> 5;
        return numberOfLeadingZeros + (j11 > f72403c[numberOfLeadingZeros] ? 1 : 0);
    }

    public static final int j(@m80.k l60.k kVar) {
        g0.p(kVar, "<this>");
        c1 c1Var = kVar.f70446a;
        if (c1Var == null) {
            return 0;
        }
        int i11 = 1;
        do {
            int i12 = c1Var.f70385c;
            for (int i13 = c1Var.f70384b; i13 < i12; i13++) {
                i11 = (i11 * 31) + c1Var.f70383a[i13];
            }
            c1Var = c1Var.f70388f;
            g0.m(c1Var);
        } while (c1Var != kVar.f70446a);
        return i11;
    }

    @m80.k
    public static final byte[] j0() {
        return f72401a;
    }

    public static final long k(@m80.k l60.k kVar, byte b11, long j11, long j12) {
        c1 c1Var;
        int i11;
        g0.p(kVar, "<this>");
        long j13 = 0;
        if (0 > j11 || j11 > j12) {
            throw new IllegalArgumentException(("size=" + kVar.size() + " fromIndex=" + j11 + " toIndex=" + j12).toString());
        }
        if (j12 > kVar.size()) {
            j12 = kVar.size();
        }
        if (j11 == j12 || (c1Var = kVar.f70446a) == null) {
            return -1L;
        }
        if (kVar.size() - j11 < j11) {
            j13 = kVar.size();
            while (j13 > j11) {
                c1Var = c1Var.f70389g;
                g0.m(c1Var);
                j13 -= c1Var.f70385c - c1Var.f70384b;
            }
            while (j13 < j12) {
                byte[] bArr = c1Var.f70383a;
                int min = (int) Math.min(c1Var.f70385c, (c1Var.f70384b + j12) - j13);
                i11 = (int) ((c1Var.f70384b + j11) - j13);
                while (i11 < min) {
                    if (bArr[i11] != b11) {
                        i11++;
                    }
                }
                j13 += c1Var.f70385c - c1Var.f70384b;
                c1Var = c1Var.f70388f;
                g0.m(c1Var);
                j11 = j13;
            }
            return -1L;
        }
        while (true) {
            long j14 = (c1Var.f70385c - c1Var.f70384b) + j13;
            if (j14 > j11) {
                break;
            }
            c1Var = c1Var.f70388f;
            g0.m(c1Var);
            j13 = j14;
        }
        while (j13 < j12) {
            byte[] bArr2 = c1Var.f70383a;
            int min2 = (int) Math.min(c1Var.f70385c, (c1Var.f70384b + j12) - j13);
            i11 = (int) ((c1Var.f70384b + j11) - j13);
            while (i11 < min2) {
                if (bArr2[i11] != b11) {
                    i11++;
                }
            }
            j13 += c1Var.f70385c - c1Var.f70384b;
            c1Var = c1Var.f70388f;
            g0.m(c1Var);
            j11 = j13;
        }
        return -1L;
        return (i11 - c1Var.f70384b) + j13;
    }

    public static final boolean k0(@m80.k c1 segment, int i11, @m80.k byte[] bytes, int i12, int i13) {
        g0.p(segment, "segment");
        g0.p(bytes, "bytes");
        int i14 = segment.f70385c;
        byte[] bArr = segment.f70383a;
        while (i12 < i13) {
            if (i11 == i14) {
                segment = segment.f70388f;
                g0.m(segment);
                byte[] bArr2 = segment.f70383a;
                bArr = bArr2;
                i11 = segment.f70384b;
                i14 = segment.f70385c;
            }
            if (bArr[i11] != bytes[i12]) {
                return false;
            }
            i11++;
            i12++;
        }
        return true;
    }

    public static final long l(@m80.k l60.k kVar, @m80.k ByteString bytes, long j11, long j12, int i11, int i12) {
        c1 c1Var;
        int i13;
        long j13 = j11;
        long j14 = j12;
        g0.p(kVar, "<this>");
        g0.p(bytes, "bytes");
        long j15 = i12;
        l60.h.e(bytes.size(), i11, j15);
        if (i12 <= 0) {
            throw new IllegalArgumentException("byteCount == 0");
        }
        long j16 = 0;
        if (j13 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j13).toString());
        }
        if (j13 > j14) {
            throw new IllegalArgumentException(("fromIndex > toIndex: " + j13 + " > " + j14).toString());
        }
        if (j14 > kVar.size()) {
            j14 = kVar.size();
        }
        long j17 = -1;
        if (j13 == j14 || (c1Var = kVar.f70446a) == null) {
            return -1L;
        }
        if (kVar.size() - j13 >= j13) {
            while (true) {
                long j18 = (c1Var.f70385c - c1Var.f70384b) + j16;
                if (j18 > j13) {
                    break;
                }
                c1Var = c1Var.f70388f;
                g0.m(c1Var);
                j16 = j18;
            }
            byte[] internalArray$okio = bytes.internalArray$okio();
            byte b11 = internalArray$okio[i11];
            long min = Math.min(j14, (kVar.size() - j15) + 1);
            while (j16 < min) {
                byte[] bArr = c1Var.f70383a;
                int min2 = (int) Math.min(c1Var.f70385c, (c1Var.f70384b + min) - j16);
                i13 = (int) ((c1Var.f70384b + j13) - j16);
                while (i13 < min2) {
                    if (bArr[i13] != b11 || !k0(c1Var, i13 + 1, internalArray$okio, i11 + 1, i12)) {
                        i13++;
                    }
                }
                j16 += c1Var.f70385c - c1Var.f70384b;
                c1Var = c1Var.f70388f;
                g0.m(c1Var);
                j13 = j16;
            }
            return -1L;
        }
        j16 = kVar.size();
        while (j16 > j13) {
            c1Var = c1Var.f70389g;
            g0.m(c1Var);
            j16 -= c1Var.f70385c - c1Var.f70384b;
            j17 = j17;
        }
        long j19 = j17;
        byte[] internalArray$okio2 = bytes.internalArray$okio();
        byte b12 = internalArray$okio2[i11];
        long min3 = Math.min(j14, (kVar.size() - j15) + 1);
        while (j16 < min3) {
            byte[] bArr2 = c1Var.f70383a;
            int min4 = (int) Math.min(c1Var.f70385c, (c1Var.f70384b + min3) - j16);
            i13 = (int) ((c1Var.f70384b + j13) - j16);
            while (i13 < min4) {
                if (bArr2[i13] != b12 || !k0(c1Var, i13 + 1, internalArray$okio2, i11 + 1, i12)) {
                    i13++;
                }
            }
            j16 += c1Var.f70385c - c1Var.f70384b;
            c1Var = c1Var.f70388f;
            g0.m(c1Var);
            j13 = j16;
        }
        return j19;
        return (i13 - c1Var.f70384b) + j16;
    }

    @m80.k
    public static final String l0(@m80.k l60.k kVar, long j11) {
        g0.p(kVar, "<this>");
        if (j11 > 0) {
            long j12 = j11 - 1;
            if (kVar.x0(j12) == 13) {
                String b22 = kVar.b2(j12);
                kVar.skip(2L);
                return b22;
            }
        }
        String b23 = kVar.b2(j11);
        kVar.skip(1L);
        return b23;
    }

    public static /* synthetic */ long m(l60.k kVar, ByteString byteString, long j11, long j12, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            j12 = Long.MAX_VALUE;
        }
        return l(kVar, byteString, j11, j12, (i13 & 8) != 0 ? 0 : i11, (i13 & 16) != 0 ? byteString.size() : i12);
    }

    public static final <T> T m0(@m80.k l60.k kVar, long j11, @m80.k x00.p<? super c1, ? super Long, ? extends T> lambda) {
        g0.p(kVar, "<this>");
        g0.p(lambda, "lambda");
        c1 c1Var = kVar.f70446a;
        if (c1Var == null) {
            return lambda.invoke(null, -1L);
        }
        if (kVar.size() - j11 < j11) {
            long size = kVar.size();
            while (size > j11) {
                c1Var = c1Var.f70389g;
                g0.m(c1Var);
                size -= c1Var.f70385c - c1Var.f70384b;
            }
            return lambda.invoke(c1Var, Long.valueOf(size));
        }
        long j12 = 0;
        while (true) {
            long j13 = (c1Var.f70385c - c1Var.f70384b) + j12;
            if (j13 > j11) {
                return lambda.invoke(c1Var, Long.valueOf(j12));
            }
            c1Var = c1Var.f70388f;
            g0.m(c1Var);
            j12 = j13;
        }
    }

    public static final long n(@m80.k l60.k kVar, @m80.k ByteString targetBytes, long j11) {
        int i11;
        int i12;
        g0.p(kVar, "<this>");
        g0.p(targetBytes, "targetBytes");
        long j12 = 0;
        if (j11 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j11).toString());
        }
        c1 c1Var = kVar.f70446a;
        if (c1Var == null) {
            return -1L;
        }
        if (kVar.size() - j11 < j11) {
            j12 = kVar.size();
            while (j12 > j11) {
                c1Var = c1Var.f70389g;
                g0.m(c1Var);
                j12 -= c1Var.f70385c - c1Var.f70384b;
            }
            if (targetBytes.size() == 2) {
                byte b11 = targetBytes.getByte(0);
                byte b12 = targetBytes.getByte(1);
                while (j12 < kVar.size()) {
                    byte[] bArr = c1Var.f70383a;
                    i11 = (int) ((c1Var.f70384b + j11) - j12);
                    int i13 = c1Var.f70385c;
                    while (i11 < i13) {
                        byte b13 = bArr[i11];
                        if (b13 != b11 && b13 != b12) {
                            i11++;
                        }
                        i12 = c1Var.f70384b;
                    }
                    j12 += c1Var.f70385c - c1Var.f70384b;
                    c1Var = c1Var.f70388f;
                    g0.m(c1Var);
                    j11 = j12;
                }
            } else {
                byte[] internalArray$okio = targetBytes.internalArray$okio();
                while (j12 < kVar.size()) {
                    byte[] bArr2 = c1Var.f70383a;
                    i11 = (int) ((c1Var.f70384b + j11) - j12);
                    int i14 = c1Var.f70385c;
                    while (i11 < i14) {
                        byte b14 = bArr2[i11];
                        for (byte b15 : internalArray$okio) {
                            if (b14 == b15) {
                                i12 = c1Var.f70384b;
                            }
                        }
                        i11++;
                    }
                    j12 += c1Var.f70385c - c1Var.f70384b;
                    c1Var = c1Var.f70388f;
                    g0.m(c1Var);
                    j11 = j12;
                }
            }
            return -1L;
        }
        while (true) {
            long j13 = (c1Var.f70385c - c1Var.f70384b) + j12;
            if (j13 > j11) {
                break;
            }
            c1Var = c1Var.f70388f;
            g0.m(c1Var);
            j12 = j13;
        }
        if (targetBytes.size() == 2) {
            byte b16 = targetBytes.getByte(0);
            byte b17 = targetBytes.getByte(1);
            while (j12 < kVar.size()) {
                byte[] bArr3 = c1Var.f70383a;
                i11 = (int) ((c1Var.f70384b + j11) - j12);
                int i15 = c1Var.f70385c;
                while (i11 < i15) {
                    byte b18 = bArr3[i11];
                    if (b18 != b16 && b18 != b17) {
                        i11++;
                    }
                    i12 = c1Var.f70384b;
                }
                j12 += c1Var.f70385c - c1Var.f70384b;
                c1Var = c1Var.f70388f;
                g0.m(c1Var);
                j11 = j12;
            }
        } else {
            byte[] internalArray$okio2 = targetBytes.internalArray$okio();
            while (j12 < kVar.size()) {
                byte[] bArr4 = c1Var.f70383a;
                i11 = (int) ((c1Var.f70384b + j11) - j12);
                int i16 = c1Var.f70385c;
                while (i11 < i16) {
                    byte b19 = bArr4[i11];
                    for (byte b21 : internalArray$okio2) {
                        if (b19 == b21) {
                            i12 = c1Var.f70384b;
                        }
                    }
                    i11++;
                }
                j12 += c1Var.f70385c - c1Var.f70384b;
                c1Var = c1Var.f70388f;
                g0.m(c1Var);
                j11 = j12;
            }
        }
        return -1L;
        return (i11 - i12) + j12;
    }

    public static final int n0(@m80.k l60.k kVar, @m80.k v0 options, boolean z11) {
        int i11;
        int i12;
        c1 c1Var;
        int i13;
        int i14;
        g0.p(kVar, "<this>");
        g0.p(options, "options");
        c1 c1Var2 = kVar.f70446a;
        if (c1Var2 == null) {
            return z11 ? -2 : -1;
        }
        byte[] bArr = c1Var2.f70383a;
        int i15 = c1Var2.f70384b;
        int i16 = c1Var2.f70385c;
        int[] h11 = options.h();
        c1 c1Var3 = c1Var2;
        int i17 = -1;
        int i18 = 0;
        loop0: while (true) {
            int i19 = i18 + 1;
            int i21 = h11[i18];
            int i22 = i18 + 2;
            int i23 = h11[i19];
            if (i23 != -1) {
                i17 = i23;
            }
            if (c1Var3 == null) {
                break;
            }
            if (i21 >= 0) {
                i11 = i15 + 1;
                int i24 = bArr[i15] & 255;
                int i25 = i22 + i21;
                while (i22 != i25) {
                    if (i24 == h11[i22]) {
                        i12 = h11[i22 + i21];
                        if (i11 == i16) {
                            c1Var3 = c1Var3.f70388f;
                            g0.m(c1Var3);
                            i11 = c1Var3.f70384b;
                            bArr = c1Var3.f70383a;
                            i16 = c1Var3.f70385c;
                            if (c1Var3 == c1Var2) {
                                c1Var3 = null;
                            }
                        }
                        if (i12 >= 0) {
                            return i12;
                        }
                        i18 = -i12;
                        i15 = i11;
                    } else {
                        i22++;
                    }
                }
                break loop0;
            }
            int i26 = i22 + (i21 * (-1));
            while (true) {
                int i27 = i15 + 1;
                int i28 = i22 + 1;
                if ((bArr[i15] & 255) != h11[i22]) {
                    break loop0;
                }
                boolean z12 = i28 == i26;
                if (i27 == i16) {
                    g0.m(c1Var3);
                    c1 c1Var4 = c1Var3.f70388f;
                    g0.m(c1Var4);
                    i14 = c1Var4.f70384b;
                    byte[] bArr2 = c1Var4.f70383a;
                    i13 = c1Var4.f70385c;
                    if (c1Var4 != c1Var2) {
                        c1Var = c1Var4;
                        bArr = bArr2;
                    } else {
                        if (!z12) {
                            break loop0;
                        }
                        bArr = bArr2;
                        c1Var = null;
                    }
                } else {
                    c1Var = c1Var3;
                    i13 = i16;
                    i14 = i27;
                }
                if (z12) {
                    i12 = h11[i28];
                    i11 = i14;
                    i16 = i13;
                    c1Var3 = c1Var;
                    break;
                }
                i15 = i14;
                i16 = i13;
                c1Var3 = c1Var;
                i22 = i28;
            }
        }
        if (z11) {
            return -2;
        }
        return i17;
    }

    public static final int o(@m80.k k.a aVar) {
        g0.p(aVar, "<this>");
        long j11 = aVar.f70451d;
        l60.k kVar = aVar.f70448a;
        g0.m(kVar);
        if (j11 == kVar.size()) {
            throw new IllegalStateException("no more bytes");
        }
        long j12 = aVar.f70451d;
        return aVar.i(j12 == -1 ? 0L : j12 + (aVar.f70454g - aVar.f70453f));
    }

    public static /* synthetic */ int o0(l60.k kVar, v0 v0Var, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return n0(kVar, v0Var, z11);
    }

    public static final boolean p(@m80.k l60.k kVar, long j11, @m80.k ByteString bytes, int i11, int i12) {
        g0.p(kVar, "<this>");
        g0.p(bytes, "bytes");
        return i12 >= 0 && j11 >= 0 && ((long) i12) + j11 <= kVar.size() && i11 >= 0 && i11 + i12 <= bytes.size() && (i12 == 0 || l(kVar, bytes, j11, j11 + 1, i11, i12) != -1);
    }

    public static final int q(@m80.k l60.k kVar, @m80.k byte[] sink) {
        g0.p(kVar, "<this>");
        g0.p(sink, "sink");
        return kVar.read(sink, 0, sink.length);
    }

    public static final int r(@m80.k l60.k kVar, @m80.k byte[] sink, int i11, int i12) {
        g0.p(kVar, "<this>");
        g0.p(sink, "sink");
        l60.h.e(sink.length, i11, i12);
        c1 c1Var = kVar.f70446a;
        if (c1Var == null) {
            return -1;
        }
        int min = Math.min(i12, c1Var.f70385c - c1Var.f70384b);
        byte[] bArr = c1Var.f70383a;
        int i13 = c1Var.f70384b;
        a00.q.v0(bArr, sink, i11, i13, i13 + min);
        c1Var.f70384b += min;
        kVar.g1(kVar.size() - min);
        if (c1Var.f70384b == c1Var.f70385c) {
            kVar.f70446a = c1Var.b();
            d1.d(c1Var);
        }
        return min;
    }

    public static final long s(@m80.k l60.k kVar, @m80.k l60.k sink, long j11) {
        g0.p(kVar, "<this>");
        g0.p(sink, "sink");
        if (j11 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j11).toString());
        }
        if (kVar.size() == 0) {
            return -1L;
        }
        if (j11 > kVar.size()) {
            j11 = kVar.size();
        }
        sink.y8(kVar, j11);
        return j11;
    }

    public static final long t(@m80.k l60.k kVar, @m80.k e1 sink) {
        g0.p(kVar, "<this>");
        g0.p(sink, "sink");
        long size = kVar.size();
        if (size > 0) {
            sink.y8(kVar, size);
        }
        return size;
    }

    @m80.k
    public static final k.a u(@m80.k l60.k kVar, @m80.k k.a unsafeCursor) {
        g0.p(kVar, "<this>");
        g0.p(unsafeCursor, "unsafeCursor");
        k.a m11 = l60.h.m(unsafeCursor);
        if (m11.f70448a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        m11.f70448a = kVar;
        m11.f70449b = true;
        return m11;
    }

    public static final byte v(@m80.k l60.k kVar) {
        g0.p(kVar, "<this>");
        if (kVar.size() == 0) {
            throw new EOFException();
        }
        c1 c1Var = kVar.f70446a;
        g0.m(c1Var);
        int i11 = c1Var.f70384b;
        int i12 = c1Var.f70385c;
        int i13 = i11 + 1;
        byte b11 = c1Var.f70383a[i11];
        kVar.g1(kVar.size() - 1);
        if (i13 != i12) {
            c1Var.f70384b = i13;
            return b11;
        }
        kVar.f70446a = c1Var.b();
        d1.d(c1Var);
        return b11;
    }

    @m80.k
    public static final byte[] w(@m80.k l60.k kVar) {
        g0.p(kVar, "<this>");
        return kVar.P5(kVar.size());
    }

    @m80.k
    public static final byte[] x(@m80.k l60.k kVar, long j11) {
        g0.p(kVar, "<this>");
        if (j11 < 0 || j11 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException(("byteCount: " + j11).toString());
        }
        if (kVar.size() < j11) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j11];
        kVar.readFully(bArr);
        return bArr;
    }

    @m80.k
    public static final ByteString y(@m80.k l60.k kVar) {
        g0.p(kVar, "<this>");
        return kVar.h2(kVar.size());
    }

    @m80.k
    public static final ByteString z(@m80.k l60.k kVar, long j11) {
        g0.p(kVar, "<this>");
        if (j11 < 0 || j11 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException(("byteCount: " + j11).toString());
        }
        if (kVar.size() < j11) {
            throw new EOFException();
        }
        if (j11 < 4096) {
            return new ByteString(kVar.P5(j11));
        }
        ByteString l12 = kVar.l1((int) j11);
        kVar.skip(j11);
        return l12;
    }
}
