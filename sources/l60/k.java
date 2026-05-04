package l60;

import androidx.collection.SieveCacheKt;
import ix.g;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.DeprecationLevel;
import okio.ByteString;
import okio.SegmentedByteString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/Buffer\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 Buffer.kt\nokio/internal/-Buffer\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 BufferedSource.kt\nokio/internal/-BufferedSource\n*L\n1#1,649:1\n88#2:650\n85#2:683\n85#2:685\n73#2:745\n73#2:771\n82#2:810\n76#2:821\n88#2:1014\n73#2:1029\n85#2:1133\n242#3,32:651\n277#3,10:686\n290#3,18:696\n412#3,2:714\n110#3:716\n414#3:717\n112#3,18:718\n311#3,9:736\n320#3,15:746\n338#3,10:761\n348#3,3:772\n346#3,25:775\n374#3,10:800\n384#3:811\n382#3,9:812\n391#3,7:822\n389#3,20:829\n652#3,60:849\n715#3,56:909\n773#3:965\n776#3:966\n777#3,6:968\n787#3,7:974\n797#3,6:984\n805#3,5:990\n837#3,6:995\n847#3:1001\n848#3,11:1003\n859#3,5:1015\n868#3,9:1020\n878#3,61:1030\n603#3:1091\n606#3:1092\n607#3,5:1094\n614#3:1099\n617#3,7:1100\n626#3,20:1107\n418#3:1127\n421#3,5:1128\n426#3,10:1134\n437#3,7:1144\n442#3,2:1151\n943#3:1153\n944#3,87:1155\n1034#3,48:1242\n573#3:1290\n580#3,21:1291\n1085#3,7:1312\n1095#3,7:1319\n1105#3,4:1326\n1112#3,8:1330\n1123#3,10:1338\n1136#3,14:1348\n447#3,35:1362\n513#3,40:1397\n556#3:1437\n558#3,13:1439\n1153#3:1452\n1204#3:1453\n1205#3,39:1455\n1246#3,2:1494\n1248#3,4:1497\n1255#3,3:1501\n1259#3,4:1505\n110#3:1509\n1263#3,22:1510\n112#3,18:1532\n1338#3,2:1550\n1341#3:1553\n110#3:1554\n1342#3,50:1555\n112#3,18:1605\n1401#3,12:1623\n1416#3,32:1635\n1451#3,12:1667\n1466#3,18:1679\n1488#3:1697\n1489#3:1699\n1494#3,34:1700\n1#4:684\n1#4:967\n1#4:1002\n1#4:1093\n1#4:1154\n1#4:1438\n1#4:1454\n1#4:1496\n1#4:1504\n1#4:1552\n1#4:1698\n26#5,3:981\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/Buffer\n*L\n167#1:650\n197#1:683\n235#1:685\n261#1:745\n264#1:771\n267#1:810\n267#1:821\n337#1:1014\n340#1:1029\n376#1:1133\n181#1:651,32\n252#1:686,10\n255#1:696,18\n258#1:714,2\n258#1:716\n258#1:717\n258#1:718,18\n261#1:736,9\n261#1:746,15\n264#1:761,10\n264#1:772,3\n264#1:775,25\n267#1:800,10\n267#1:811\n267#1:812,9\n267#1:822,7\n267#1:829,20\n279#1:849,60\n282#1:909,56\n284#1:965\n287#1:966\n287#1:968,6\n289#1:974,7\n294#1:984,6\n297#1:990,5\n331#1:995,6\n337#1:1001\n337#1:1003,11\n337#1:1015,5\n340#1:1020,9\n340#1:1030,61\n342#1:1091\n345#1:1092\n345#1:1094,5\n347#1:1099\n350#1:1100,7\n353#1:1107,20\n373#1:1127\n376#1:1128,5\n376#1:1134,10\n378#1:1144,7\n381#1:1151,2\n386#1:1153\n386#1:1155,87\n389#1:1242,48\n412#1:1290\n418#1:1291,21\n439#1:1312,7\n443#1:1319,7\n445#1:1326,4\n447#1:1330,8\n451#1:1338,10\n455#1:1348,14\n459#1:1362,35\n462#1:1397,40\n465#1:1437\n465#1:1439,13\n467#1:1452\n467#1:1453\n467#1:1455,39\n469#1:1494,2\n469#1:1497,4\n480#1:1501,3\n480#1:1505,4\n480#1:1509\n480#1:1510,22\n480#1:1532,18\n496#1:1550,2\n496#1:1553\n496#1:1554\n496#1:1555,50\n496#1:1605,18\n506#1:1623,12\n576#1:1635,32\n578#1:1667,12\n586#1:1679,18\n594#1:1697\n594#1:1699\n596#1:1700,34\n287#1:967\n337#1:1002\n345#1:1093\n386#1:1154\n465#1:1438\n467#1:1454\n469#1:1496\n480#1:1504\n496#1:1552\n594#1:1698\n291#1:981,3\n*E\n"})
/* loaded from: classes8.dex */
public final class k implements m, l, Cloneable, ByteChannel {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    @w00.g
    public c1 f70446a;

    /* renamed from: b, reason: collision with root package name */
    public long f70447b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/Buffer$UnsafeCursor\n+ 2 Buffer.kt\nokio/internal/-Buffer\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,649:1\n1549#2:650\n1550#2:652\n1554#2:653\n1555#2,68:655\n1626#2:723\n1627#2,32:725\n1659#2,18:758\n1680#2:776\n1681#2,18:778\n1703#2:796\n1705#2,7:798\n1#3:651\n1#3:654\n1#3:724\n1#3:777\n1#3:797\n85#4:757\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/Buffer$UnsafeCursor\n*L\n636#1:650\n636#1:652\n638#1:653\n638#1:655,68\n640#1:723\n640#1:725,32\n640#1:758,18\n642#1:776\n642#1:778,18\n645#1:796\n645#1:798,7\n636#1:651\n638#1:654\n640#1:724\n642#1:777\n645#1:797\n640#1:757\n*E\n"})
    public static final class a implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        @w00.g
        public k f70448a;

        /* renamed from: b, reason: collision with root package name */
        @w00.g
        public boolean f70449b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public c1 f70450c;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        @w00.g
        public byte[] f70452e;

        /* renamed from: d, reason: collision with root package name */
        @w00.g
        public long f70451d = -1;

        /* renamed from: f, reason: collision with root package name */
        @w00.g
        public int f70453f = -1;

        /* renamed from: g, reason: collision with root package name */
        @w00.g
        public int f70454g = -1;

        public final long a(int i11) {
            if (i11 <= 0) {
                throw new IllegalArgumentException(("minByteCount <= 0: " + i11).toString());
            }
            if (i11 > 8192) {
                throw new IllegalArgumentException(("minByteCount > Segment.SIZE: " + i11).toString());
            }
            k kVar = this.f70448a;
            if (kVar == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.f70449b) {
                throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
            }
            long size = kVar.size();
            c1 m12 = kVar.m1(i11);
            int i12 = 8192 - m12.f70385c;
            m12.f70385c = 8192;
            long j11 = i12;
            kVar.g1(size + j11);
            j(m12);
            this.f70451d = size;
            this.f70452e = m12.f70383a;
            this.f70453f = 8192 - i12;
            this.f70454g = 8192;
            return j11;
        }

        @m80.l
        public final c1 c() {
            return this.f70450c;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f70448a == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.f70448a = null;
            j(null);
            this.f70451d = -1L;
            this.f70452e = null;
            this.f70453f = -1;
            this.f70454g = -1;
        }

        public final int e() {
            long j11 = this.f70451d;
            k kVar = this.f70448a;
            kotlin.jvm.internal.g0.m(kVar);
            if (j11 == kVar.size()) {
                throw new IllegalStateException("no more bytes");
            }
            long j12 = this.f70451d;
            return i(j12 == -1 ? 0L : j12 + (this.f70454g - this.f70453f));
        }

        public final long f(long j11) {
            k kVar = this.f70448a;
            if (kVar == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.f70449b) {
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
                    kotlin.jvm.internal.g0.m(c1Var);
                    c1 c1Var2 = c1Var.f70389g;
                    kotlin.jvm.internal.g0.m(c1Var2);
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
                j(null);
                this.f70451d = j11;
                this.f70452e = null;
                this.f70453f = -1;
                this.f70454g = -1;
            } else if (j11 > size) {
                long j14 = j11 - size;
                boolean z11 = true;
                while (j14 > 0) {
                    c1 m12 = kVar.m1(1);
                    int min = (int) Math.min(j14, 8192 - m12.f70385c);
                    m12.f70385c += min;
                    j14 -= min;
                    if (z11) {
                        j(m12);
                        this.f70451d = size;
                        this.f70452e = m12.f70383a;
                        int i12 = m12.f70385c;
                        this.f70453f = i12 - min;
                        this.f70454g = i12;
                        z11 = false;
                    }
                }
            }
            kVar.g1(j11);
            return size;
        }

        public final int i(long j11) {
            c1 c1Var;
            k kVar = this.f70448a;
            if (kVar == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (j11 < -1 || j11 > kVar.size()) {
                throw new ArrayIndexOutOfBoundsException("offset=" + j11 + " > size=" + kVar.size());
            }
            if (j11 == -1 || j11 == kVar.size()) {
                j(null);
                this.f70451d = j11;
                this.f70452e = null;
                this.f70453f = -1;
                this.f70454g = -1;
                return -1;
            }
            long size = kVar.size();
            c1 c1Var2 = kVar.f70446a;
            long j12 = 0;
            if (c() != null) {
                long j13 = this.f70451d;
                int i11 = this.f70453f;
                kotlin.jvm.internal.g0.m(c());
                long j14 = j13 - (i11 - r9.f70384b);
                if (j14 > j11) {
                    c1Var = c1Var2;
                    c1Var2 = c();
                    size = j14;
                } else {
                    c1Var = c();
                    j12 = j14;
                }
            } else {
                c1Var = c1Var2;
            }
            if (size - j11 > j11 - j12) {
                while (true) {
                    kotlin.jvm.internal.g0.m(c1Var);
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
                    kotlin.jvm.internal.g0.m(c1Var2);
                    c1Var2 = c1Var2.f70389g;
                    kotlin.jvm.internal.g0.m(c1Var2);
                    size -= c1Var2.f70385c - c1Var2.f70384b;
                }
                j12 = size;
                c1Var = c1Var2;
            }
            if (this.f70449b) {
                kotlin.jvm.internal.g0.m(c1Var);
                if (c1Var.f70386d) {
                    c1 f11 = c1Var.f();
                    if (kVar.f70446a == c1Var) {
                        kVar.f70446a = f11;
                    }
                    c1Var = c1Var.c(f11);
                    c1 c1Var3 = c1Var.f70389g;
                    kotlin.jvm.internal.g0.m(c1Var3);
                    c1Var3.b();
                }
            }
            j(c1Var);
            this.f70451d = j11;
            kotlin.jvm.internal.g0.m(c1Var);
            this.f70452e = c1Var.f70383a;
            int i14 = c1Var.f70384b + ((int) (j11 - j12));
            this.f70453f = i14;
            int i15 = c1Var.f70385c;
            this.f70454g = i15;
            return i15 - i14;
        }

        public final void j(@m80.l c1 c1Var) {
            this.f70450c = c1Var;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends OutputStream {
        public c() {
        }

        public String toString() {
            return k.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i11) {
            k.this.writeByte(i11);
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i11, int i12) {
            kotlin.jvm.internal.g0.p(data, "data");
            k.this.write(data, i11, i12);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }
    }

    public static /* synthetic */ k L1(k kVar, OutputStream outputStream, long j11, int i11, Object obj) throws IOException {
        if ((i11 & 2) != 0) {
            j11 = kVar.f70447b;
        }
        return kVar.J1(outputStream, j11);
    }

    public static /* synthetic */ a W0(k kVar, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = h.g();
        }
        return kVar.P0(aVar);
    }

    public static /* synthetic */ k f0(k kVar, OutputStream outputStream, long j11, long j12, int i11, Object obj) throws IOException {
        if ((i11 & 2) != 0) {
            j11 = 0;
        }
        long j13 = j11;
        if ((i11 & 4) != 0) {
            j12 = kVar.f70447b - j13;
        }
        return kVar.Z(outputStream, j13, j12);
    }

    public static /* synthetic */ a f1(k kVar, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = h.g();
        }
        return kVar.e1(aVar);
    }

    public static /* synthetic */ k h0(k kVar, k kVar2, long j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 0;
        }
        return kVar.a0(kVar2, j11);
    }

    public static /* synthetic */ k m0(k kVar, k kVar2, long j11, long j12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 0;
        }
        return kVar.c0(kVar2, j11, j12);
    }

    @m80.k
    public final ByteString A0(@m80.k ByteString key) {
        kotlin.jvm.internal.g0.p(key, "key");
        return z0("HmacSHA1", key);
    }

    @Override // l60.l
    @m80.k
    /* renamed from: A1, reason: merged with bridge method [inline-methods] */
    public k writeLong(long j11) {
        c1 m12 = m1(8);
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
        g1(size() + 8);
        return this;
    }

    @Override // l60.m
    public long B1() throws EOFException {
        return h.o(readLong());
    }

    @Override // l60.l
    @m80.k
    /* renamed from: C1, reason: merged with bridge method [inline-methods] */
    public k W(long j11) {
        return writeLong(h.o(j11));
    }

    @Override // l60.g1
    @m80.k
    public i1 D() {
        return i1.f70438f;
    }

    @Override // l60.l
    @m80.k
    /* renamed from: D1, reason: merged with bridge method [inline-methods] */
    public k writeShort(int i11) {
        c1 m12 = m1(2);
        byte[] bArr = m12.f70383a;
        int i12 = m12.f70385c;
        bArr[i12] = (byte) ((i11 >>> 8) & 255);
        bArr[i12 + 1] = (byte) (i11 & 255);
        m12.f70385c = i12 + 2;
        g1(size() + 2);
        return this;
    }

    @w00.k
    @m80.k
    public final k E(@m80.k OutputStream out, long j11) throws IOException {
        kotlin.jvm.internal.g0.p(out, "out");
        return f0(this, out, j11, 0L, 4, null);
    }

    @m80.k
    public final ByteString E0(@m80.k ByteString key) {
        kotlin.jvm.internal.g0.p(key, "key");
        return z0(qr.b.f82657b, key);
    }

    @Override // l60.l
    @m80.k
    /* renamed from: E1, reason: merged with bridge method [inline-methods] */
    public k W2(int i11) {
        return writeShort(h.p((short) i11));
    }

    @Override // l60.m
    public void F(long j11) throws EOFException {
        if (this.f70447b < j11) {
            throw new EOFException();
        }
    }

    @m80.k
    public final ByteString F0(@m80.k ByteString key) {
        kotlin.jvm.internal.g0.p(key, "key");
        return z0("HmacSHA512", key);
    }

    @m80.k
    public final ByteString G0() {
        return o0("MD5");
    }

    @Override // l60.l
    @m80.k
    /* renamed from: G1, reason: merged with bridge method [inline-methods] */
    public k N1(@m80.k String string, int i11, int i12, @m80.k Charset charset) {
        kotlin.jvm.internal.g0.p(string, "string");
        kotlin.jvm.internal.g0.p(charset, "charset");
        if (i11 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i11).toString());
        }
        if (i12 < i11) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i12 + " < " + i11).toString());
        }
        if (i12 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i12 + " > " + string.length()).toString());
        }
        if (kotlin.jvm.internal.g0.g(charset, u30.d.f91599b)) {
            return M0(string, i11, i12);
        }
        String substring = string.substring(i11, i12);
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        byte[] bytes = substring.getBytes(charset);
        kotlin.jvm.internal.g0.o(bytes, "getBytes(...)");
        return write(bytes, 0, bytes.length);
    }

    @Override // l60.l
    @m80.k
    /* renamed from: H1, reason: merged with bridge method [inline-methods] */
    public k R7(@m80.k String string, @m80.k Charset charset) {
        kotlin.jvm.internal.g0.p(string, "string");
        kotlin.jvm.internal.g0.p(charset, "charset");
        return N1(string, 0, string.length(), charset);
    }

    @w00.k
    @m80.k
    public final k I1(@m80.k OutputStream out) throws IOException {
        kotlin.jvm.internal.g0.p(out, "out");
        return L1(this, out, 0L, 2, null);
    }

    @Override // l60.m
    public boolean J() {
        return this.f70447b == 0;
    }

    @Override // l60.m
    public boolean J0(long j11, @m80.k ByteString bytes) {
        kotlin.jvm.internal.g0.p(bytes, "bytes");
        return O5(j11, bytes, 0, bytes.size());
    }

    @w00.k
    @m80.k
    public final k J1(@m80.k OutputStream out, long j11) throws IOException {
        kotlin.jvm.internal.g0.p(out, "out");
        h.e(this.f70447b, 0L, j11);
        c1 c1Var = this.f70446a;
        long j12 = j11;
        while (j12 > 0) {
            kotlin.jvm.internal.g0.m(c1Var);
            int min = (int) Math.min(j12, c1Var.f70385c - c1Var.f70384b);
            out.write(c1Var.f70383a, c1Var.f70384b, min);
            int i11 = c1Var.f70384b + min;
            c1Var.f70384b = i11;
            long j13 = min;
            this.f70447b -= j13;
            j12 -= j13;
            if (i11 == c1Var.f70385c) {
                c1 b11 = c1Var.b();
                this.f70446a = b11;
                d1.d(c1Var);
                c1Var = b11;
            }
        }
        return this;
    }

    @Override // l60.g1
    public long L3(@m80.k k sink, long j11) {
        kotlin.jvm.internal.g0.p(sink, "sink");
        if (j11 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j11).toString());
        }
        if (size() == 0) {
            return -1L;
        }
        if (j11 > size()) {
            j11 = size();
        }
        sink.y8(this, j11);
        return j11;
    }

    @Override // l60.m
    @m80.k
    public String L5() throws EOFException {
        return b5(Long.MAX_VALUE);
    }

    @Override // l60.l
    @m80.k
    /* renamed from: M1, reason: merged with bridge method [inline-methods] */
    public k n5(@m80.k String string) {
        kotlin.jvm.internal.g0.p(string, "string");
        return M0(string, 0, string.length());
    }

    @w00.k
    @m80.k
    public final a N0() {
        return W0(this, null, 1, null);
    }

    @Override // l60.m
    public long O1(@m80.k ByteString targetBytes, long j11) {
        int i11;
        int i12;
        kotlin.jvm.internal.g0.p(targetBytes, "targetBytes");
        long j12 = 0;
        if (j11 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j11).toString());
        }
        c1 c1Var = this.f70446a;
        if (c1Var == null) {
            return -1L;
        }
        if (size() - j11 < j11) {
            j12 = size();
            while (j12 > j11) {
                c1Var = c1Var.f70389g;
                kotlin.jvm.internal.g0.m(c1Var);
                j12 -= c1Var.f70385c - c1Var.f70384b;
            }
            if (targetBytes.size() == 2) {
                byte b11 = targetBytes.getByte(0);
                byte b12 = targetBytes.getByte(1);
                while (j12 < size()) {
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
                    kotlin.jvm.internal.g0.m(c1Var);
                    j11 = j12;
                }
            } else {
                byte[] internalArray$okio = targetBytes.internalArray$okio();
                while (j12 < size()) {
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
                    kotlin.jvm.internal.g0.m(c1Var);
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
            kotlin.jvm.internal.g0.m(c1Var);
            j12 = j13;
        }
        if (targetBytes.size() == 2) {
            byte b16 = targetBytes.getByte(0);
            byte b17 = targetBytes.getByte(1);
            while (j12 < size()) {
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
                kotlin.jvm.internal.g0.m(c1Var);
                j11 = j12;
            }
        } else {
            byte[] internalArray$okio2 = targetBytes.internalArray$okio();
            while (j12 < size()) {
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
                kotlin.jvm.internal.g0.m(c1Var);
                j11 = j12;
            }
        }
        return -1L;
        return (i11 - i12) + j12;
    }

    @Override // l60.m
    public boolean O5(long j11, @m80.k ByteString bytes, int i11, int i12) {
        kotlin.jvm.internal.g0.p(bytes, "bytes");
        return i12 >= 0 && j11 >= 0 && ((long) i12) + j11 <= size() && i11 >= 0 && i11 + i12 <= bytes.size() && (i12 == 0 || m60.a.l(this, bytes, j11, j11 + 1, i11, i12) != -1);
    }

    @Override // l60.l
    @m80.k
    public OutputStream O8() {
        return new c();
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

    @w00.k
    @m80.k
    public final a P0(@m80.k a unsafeCursor) {
        kotlin.jvm.internal.g0.p(unsafeCursor, "unsafeCursor");
        return m60.a.u(this, unsafeCursor);
    }

    @Override // l60.l
    @m80.k
    /* renamed from: P1, reason: merged with bridge method [inline-methods] */
    public k M0(@m80.k String string, int i11, int i12) {
        char charAt;
        kotlin.jvm.internal.g0.p(string, "string");
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
                c1 m12 = m1(1);
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
                g1(size() + i16);
            } else {
                if (charAt2 < 2048) {
                    c1 m13 = m1(2);
                    byte[] bArr2 = m13.f70383a;
                    int i17 = m13.f70385c;
                    bArr2[i17] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i17 + 1] = (byte) ((charAt2 & s60.d.f88057a) | 128);
                    m13.f70385c = i17 + 2;
                    g1(size() + 2);
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    c1 m14 = m1(3);
                    byte[] bArr3 = m14.f70383a;
                    int i18 = m14.f70385c;
                    bArr3[i18] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i18 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i18 + 2] = (byte) ((charAt2 & s60.d.f88057a) | 128);
                    m14.f70385c = i18 + 3;
                    g1(size() + 3);
                } else {
                    int i19 = i11 + 1;
                    char charAt3 = i19 < i12 ? string.charAt(i19) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        writeByte(63);
                        i11 = i19;
                    } else {
                        int i21 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        c1 m15 = m1(4);
                        byte[] bArr4 = m15.f70383a;
                        int i22 = m15.f70385c;
                        bArr4[i22] = (byte) ((i21 >> 18) | 240);
                        bArr4[i22 + 1] = (byte) (((i21 >> 12) & 63) | 128);
                        bArr4[i22 + 2] = (byte) (((i21 >> 6) & 63) | 128);
                        bArr4[i22 + 3] = (byte) ((i21 & 63) | 128);
                        m15.f70385c = i22 + 4;
                        g1(size() + 4);
                        i11 += 2;
                    }
                }
                i11++;
            }
        }
        return this;
    }

    @Override // l60.m
    @m80.k
    public byte[] P5(long j11) throws EOFException {
        if (j11 < 0 || j11 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException(("byteCount: " + j11).toString());
        }
        if (size() < j11) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j11];
        readFully(bArr);
        return bArr;
    }

    @Override // l60.m
    public long R(@m80.k ByteString bytes, long j11) throws IOException {
        kotlin.jvm.internal.g0.p(bytes, "bytes");
        return X6(bytes, j11, Long.MAX_VALUE);
    }

    @Override // l60.l
    @m80.k
    /* renamed from: R1, reason: merged with bridge method [inline-methods] */
    public k x4(int i11) {
        if (i11 < 128) {
            writeByte(i11);
            return this;
        }
        if (i11 < 2048) {
            c1 m12 = m1(2);
            byte[] bArr = m12.f70383a;
            int i12 = m12.f70385c;
            bArr[i12] = (byte) ((i11 >> 6) | 192);
            bArr[i12 + 1] = (byte) ((i11 & 63) | 128);
            m12.f70385c = i12 + 2;
            g1(size() + 2);
            return this;
        }
        if (55296 <= i11 && i11 < 57344) {
            writeByte(63);
            return this;
        }
        if (i11 < 65536) {
            c1 m13 = m1(3);
            byte[] bArr2 = m13.f70383a;
            int i13 = m13.f70385c;
            bArr2[i13] = (byte) ((i11 >> 12) | 224);
            bArr2[i13 + 1] = (byte) (((i11 >> 6) & 63) | 128);
            bArr2[i13 + 2] = (byte) ((i11 & 63) | 128);
            m13.f70385c = i13 + 3;
            g1(size() + 3);
            return this;
        }
        if (i11 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + h.u(i11));
        }
        c1 m14 = m1(4);
        byte[] bArr3 = m14.f70383a;
        int i14 = m14.f70385c;
        bArr3[i14] = (byte) ((i11 >> 18) | 240);
        bArr3[i14 + 1] = (byte) (((i11 >> 12) & 63) | 128);
        bArr3[i14 + 2] = (byte) (((i11 >> 6) & 63) | 128);
        bArr3[i14 + 3] = (byte) ((i11 & 63) | 128);
        m14.f70385c = i14 + 4;
        g1(size() + 4);
        return this;
    }

    @Override // l60.m
    @m80.k
    public String R3() {
        return V3(this.f70447b, u30.d.f91599b);
    }

    @Override // l60.m
    @m80.k
    public InputStream R8() {
        return new b();
    }

    @Override // l60.m
    public long T4(byte b11, long j11, long j12) {
        c1 c1Var;
        int i11;
        long j13 = 0;
        if (0 > j11 || j11 > j12) {
            throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j11 + " toIndex=" + j12).toString());
        }
        if (j12 > size()) {
            j12 = size();
        }
        if (j11 == j12 || (c1Var = this.f70446a) == null) {
            return -1L;
        }
        if (size() - j11 < j11) {
            j13 = size();
            while (j13 > j11) {
                c1Var = c1Var.f70389g;
                kotlin.jvm.internal.g0.m(c1Var);
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
                kotlin.jvm.internal.g0.m(c1Var);
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
            kotlin.jvm.internal.g0.m(c1Var);
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
            kotlin.jvm.internal.g0.m(c1Var);
            j11 = j13;
        }
        return -1L;
        return (i11 - c1Var.f70384b) + j13;
    }

    @Override // l60.m
    public void T6(@m80.k k sink, long j11) throws EOFException {
        kotlin.jvm.internal.g0.p(sink, "sink");
        if (size() >= j11) {
            sink.y8(this, j11);
        } else {
            sink.y8(this, size());
            throw new EOFException();
        }
    }

    @Override // l60.m
    public long U1(byte b11) {
        return T4(b11, 0L, Long.MAX_VALUE);
    }

    @Override // l60.l
    public long V2(@m80.k g1 source) throws IOException {
        kotlin.jvm.internal.g0.p(source, "source");
        long j11 = 0;
        while (true) {
            long L3 = source.L3(this, 8192L);
            if (L3 == -1) {
                return j11;
            }
            j11 += L3;
        }
    }

    @Override // l60.m
    @m80.k
    public String V3(long j11, @m80.k Charset charset) throws EOFException {
        kotlin.jvm.internal.g0.p(charset, "charset");
        if (j11 < 0 || j11 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException(("byteCount: " + j11).toString());
        }
        if (this.f70447b < j11) {
            throw new EOFException();
        }
        if (j11 == 0) {
            return "";
        }
        c1 c1Var = this.f70446a;
        kotlin.jvm.internal.g0.m(c1Var);
        int i11 = c1Var.f70384b;
        if (i11 + j11 > c1Var.f70385c) {
            return new String(P5(j11), charset);
        }
        int i12 = (int) j11;
        String str = new String(c1Var.f70383a, i11, i12, charset);
        int i13 = c1Var.f70384b + i12;
        c1Var.f70384b = i13;
        this.f70447b -= j11;
        if (i13 == c1Var.f70385c) {
            this.f70446a = c1Var.b();
            d1.d(c1Var);
        }
        return str;
    }

    @Override // l60.m
    public int X2(@m80.k v0 options) {
        kotlin.jvm.internal.g0.p(options, "options");
        int o02 = m60.a.o0(this, options, false, 2, null);
        if (o02 == -1) {
            return -1;
        }
        skip(options.g()[o02].size());
        return o02;
    }

    @Override // l60.m
    public long X6(@m80.k ByteString bytes, long j11, long j12) throws IOException {
        kotlin.jvm.internal.g0.p(bytes, "bytes");
        return m60.a.m(this, bytes, j11, j12, 0, 0, 24, null);
    }

    @m80.k
    public final k Y0(@m80.k InputStream input) throws IOException {
        kotlin.jvm.internal.g0.p(input, "input");
        a1(input, Long.MAX_VALUE, true);
        return this;
    }

    @w00.k
    @m80.k
    public final k Z(@m80.k OutputStream out, long j11, long j12) throws IOException {
        kotlin.jvm.internal.g0.p(out, "out");
        long j13 = j11;
        h.e(this.f70447b, j13, j12);
        if (j12 != 0) {
            c1 c1Var = this.f70446a;
            while (true) {
                kotlin.jvm.internal.g0.m(c1Var);
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
                kotlin.jvm.internal.g0.m(c1Var2);
                int min = (int) Math.min(c1Var2.f70385c - r1, j14);
                out.write(c1Var2.f70383a, (int) (c1Var2.f70384b + j13), min);
                j14 -= min;
                c1Var2 = c1Var2.f70388f;
                j13 = 0;
            }
        }
        return this;
    }

    @m80.k
    public final k Z0(@m80.k InputStream input, long j11) throws IOException {
        kotlin.jvm.internal.g0.p(input, "input");
        if (j11 >= 0) {
            a1(input, j11, false);
            return this;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j11).toString());
    }

    @w00.j(name = "-deprecated_getByte")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to operator function", replaceWith = @yz.w0(expression = "this[index]", imports = {}))
    public final byte a(long j11) {
        return x0(j11);
    }

    @m80.k
    public final k a0(@m80.k k out, long j11) {
        kotlin.jvm.internal.g0.p(out, "out");
        return c0(out, j11, this.f70447b - j11);
    }

    public final void a1(InputStream inputStream, long j11, boolean z11) throws IOException {
        while (true) {
            if (j11 <= 0 && !z11) {
                return;
            }
            c1 m12 = m1(1);
            int read = inputStream.read(m12.f70383a, m12.f70385c, (int) Math.min(j11, 8192 - m12.f70385c));
            if (read == -1) {
                if (m12.f70384b == m12.f70385c) {
                    this.f70446a = m12.b();
                    d1.d(m12);
                }
                if (!z11) {
                    throw new EOFException();
                }
                return;
            }
            m12.f70385c += read;
            long j12 = read;
            this.f70447b += j12;
            j11 -= j12;
        }
    }

    @Override // l60.m
    public long b0(@m80.k ByteString bytes) throws IOException {
        kotlin.jvm.internal.g0.p(bytes, "bytes");
        return R(bytes, 0L);
    }

    @Override // l60.m
    @m80.k
    public String b2(long j11) throws EOFException {
        return V3(j11, u30.d.f91599b);
    }

    @Override // l60.m
    @m80.k
    public String b5(long j11) throws EOFException {
        if (j11 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j11).toString());
        }
        long j12 = j11 != Long.MAX_VALUE ? j11 + 1 : Long.MAX_VALUE;
        long T4 = T4((byte) 10, 0L, j12);
        if (T4 != -1) {
            return m60.a.l0(this, T4);
        }
        if (j12 < size() && x0(j12 - 1) == 13 && x0(j12) == 10) {
            return m60.a.l0(this, j12);
        }
        k kVar = new k();
        c0(kVar, 0L, Math.min(32, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j11) + " content=" + kVar.q3().hex() + (char) 8230);
    }

    @Override // l60.m
    public int b8() throws EOFException {
        return h.n(readInt());
    }

    @w00.j(name = "-deprecated_size")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @yz.w0(expression = g.b.f62794h, imports = {}))
    public final long c() {
        return this.f70447b;
    }

    @m80.k
    public final k c0(@m80.k k out, long j11, long j12) {
        kotlin.jvm.internal.g0.p(out, "out");
        long j13 = j11;
        h.e(size(), j13, j12);
        if (j12 != 0) {
            out.g1(out.size() + j12);
            c1 c1Var = this.f70446a;
            while (true) {
                kotlin.jvm.internal.g0.m(c1Var);
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
                kotlin.jvm.internal.g0.m(c1Var2);
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
                    kotlin.jvm.internal.g0.m(c1Var3);
                    c1 c1Var4 = c1Var3.f70389g;
                    kotlin.jvm.internal.g0.m(c1Var4);
                    c1Var4.c(d11);
                }
                j14 -= d11.f70385c - d11.f70384b;
                c1Var2 = c1Var2.f70388f;
                j13 = 0;
            }
        }
        return this;
    }

    @w00.k
    @m80.k
    public final a d1() {
        return f1(this, null, 1, null);
    }

    public final void e() {
        skip(size());
    }

    @w00.k
    @m80.k
    public final a e1(@m80.k a unsafeCursor) {
        kotlin.jvm.internal.g0.p(unsafeCursor, "unsafeCursor");
        return m60.a.H(this, unsafeCursor);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (size() != kVar.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        c1 c1Var = this.f70446a;
        kotlin.jvm.internal.g0.m(c1Var);
        c1 c1Var2 = kVar.f70446a;
        kotlin.jvm.internal.g0.m(c1Var2);
        int i11 = c1Var.f70384b;
        int i12 = c1Var2.f70384b;
        long j11 = 0;
        while (j11 < size()) {
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
                kotlin.jvm.internal.g0.m(c1Var);
                i11 = c1Var.f70384b;
            }
            if (i12 == c1Var2.f70385c) {
                c1Var2 = c1Var2.f70388f;
                kotlin.jvm.internal.g0.m(c1Var2);
                i12 = c1Var2.f70384b;
            }
            j11 += min;
        }
        return true;
    }

    @m80.k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public k clone() {
        return q();
    }

    public final void g1(long j11) {
        this.f70447b = j11;
    }

    @m80.k
    public final ByteString h1() {
        return o0("SHA-1");
    }

    @Override // l60.m
    @m80.k
    public ByteString h2(long j11) throws EOFException {
        if (j11 < 0 || j11 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException(("byteCount: " + j11).toString());
        }
        if (size() < j11) {
            throw new EOFException();
        }
        if (j11 < 4096) {
            return new ByteString(P5(j11));
        }
        ByteString l12 = l1((int) j11);
        skip(j11);
        return l12;
    }

    @Override // l60.m
    @m80.k
    public String h3(@m80.k Charset charset) {
        kotlin.jvm.internal.g0.p(charset, "charset");
        return V3(this.f70447b, charset);
    }

    public int hashCode() {
        c1 c1Var = this.f70446a;
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
            kotlin.jvm.internal.g0.m(c1Var);
        } while (c1Var != this.f70446a);
        return i11;
    }

    @m80.k
    public final ByteString i1() {
        return o0("SHA-256");
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final long j() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        c1 c1Var = this.f70446a;
        kotlin.jvm.internal.g0.m(c1Var);
        c1 c1Var2 = c1Var.f70389g;
        kotlin.jvm.internal.g0.m(c1Var2);
        return (c1Var2.f70385c >= 8192 || !c1Var2.f70387e) ? size : size - (r3 - c1Var2.f70384b);
    }

    @m80.k
    public final ByteString j1() {
        return o0("SHA-512");
    }

    @m80.k
    public final ByteString k1() {
        if (size() <= SieveCacheKt.NodeLinkMask) {
            return l1((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    @Override // l60.m
    public int k3() throws EOFException {
        int i11;
        int i12;
        int i13;
        if (size() == 0) {
            throw new EOFException();
        }
        byte x02 = x0(0L);
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
                skip(1L);
                return 65533;
            }
            i11 = x02 & 7;
            i12 = 4;
            i13 = 65536;
        }
        long j11 = i12;
        if (size() < j11) {
            throw new EOFException("size < " + i12 + ": " + size() + " (to read code point prefixed 0x" + h.t(x02) + ')');
        }
        for (int i14 = 1; i14 < i12; i14++) {
            long j12 = i14;
            byte x03 = x0(j12);
            if ((x03 & com.baicizhan.main.vld.bonding.j.f25378c) != 128) {
                skip(j12);
                return 65533;
            }
            i11 = (i11 << 6) | (x03 & 63);
        }
        skip(j11);
        if (i11 > 1114111) {
            return 65533;
        }
        if ((55296 > i11 || i11 >= 57344) && i11 >= i13) {
            return i11;
        }
        return 65533;
    }

    @Override // l60.m
    public long l0(byte b11, long j11) {
        return T4(b11, j11, Long.MAX_VALUE);
    }

    @m80.k
    public final ByteString l1(int i11) {
        if (i11 == 0) {
            return ByteString.EMPTY;
        }
        h.e(size(), 0L, i11);
        c1 c1Var = this.f70446a;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i11) {
            kotlin.jvm.internal.g0.m(c1Var);
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
        c1 c1Var2 = this.f70446a;
        int i17 = 0;
        while (i12 < i11) {
            kotlin.jvm.internal.g0.m(c1Var2);
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
    public final c1 m1(int i11) {
        if (i11 < 1 || i11 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        c1 c1Var = this.f70446a;
        if (c1Var != null) {
            kotlin.jvm.internal.g0.m(c1Var);
            c1 c1Var2 = c1Var.f70389g;
            kotlin.jvm.internal.g0.m(c1Var2);
            return (c1Var2.f70385c + i11 > 8192 || !c1Var2.f70387e) ? c1Var2.c(d1.e()) : c1Var2;
        }
        c1 e11 = d1.e();
        this.f70446a = e11;
        e11.f70389g = e11;
        e11.f70388f = e11;
        return e11;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7 A[EDGE_INSN: B:40:0x00a7->B:37:0x00a7 BREAK  A[LOOP:0: B:4:0x000d->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
    @Override // l60.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long m4() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb1
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            l60.c1 r6 = r14.f70446a
            kotlin.jvm.internal.g0.m(r6)
            byte[] r7 = r6.f70383a
            int r8 = r6.f70384b
            int r9 = r6.f70385c
        L18:
            if (r8 >= r9) goto L93
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L27
            r11 = 57
            if (r10 > r11) goto L27
            int r11 = r10 + (-48)
            goto L3c
        L27:
            r11 = 97
            if (r10 < r11) goto L32
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L32
            int r11 = r10 + (-87)
            goto L3c
        L32:
            r11 = 65
            if (r10 < r11) goto L74
            r11 = 70
            if (r10 > r11) goto L74
            int r11 = r10 + (-55)
        L3c:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4c
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L4c:
            l60.k r0 = new l60.k
            r0.<init>()
            l60.k r0 = r0.p3(r4)
            l60.k r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.R3()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L74:
            if (r0 == 0) goto L78
            r1 = 1
            goto L93
        L78:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = l60.h.t(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L93:
            if (r8 != r9) goto L9f
            l60.c1 r7 = r6.b()
            r14.f70446a = r7
            l60.d1.d(r6)
            goto La1
        L9f:
            r6.f70384b = r8
        La1:
            if (r1 != 0) goto La7
            l60.c1 r6 = r14.f70446a
            if (r6 != 0) goto Ld
        La7:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.g1(r1)
            return r4
        Lb1:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l60.k.m4():long");
    }

    @Override // l60.l
    @m80.k
    /* renamed from: n1, reason: merged with bridge method [inline-methods] */
    public k d8(@m80.k g1 source, long j11) throws IOException {
        kotlin.jvm.internal.g0.p(source, "source");
        while (j11 > 0) {
            long L3 = source.L3(this, j11);
            if (L3 == -1) {
                throw new EOFException();
            }
            j11 -= L3;
        }
        return this;
    }

    public final ByteString o0(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        c1 c1Var = this.f70446a;
        if (c1Var != null) {
            byte[] bArr = c1Var.f70383a;
            int i11 = c1Var.f70384b;
            messageDigest.update(bArr, i11, c1Var.f70385c - i11);
            c1 c1Var2 = c1Var.f70388f;
            kotlin.jvm.internal.g0.m(c1Var2);
            while (c1Var2 != c1Var) {
                byte[] bArr2 = c1Var2.f70383a;
                int i12 = c1Var2.f70384b;
                messageDigest.update(bArr2, i12, c1Var2.f70385c - i12);
                c1Var2 = c1Var2.f70388f;
                kotlin.jvm.internal.g0.m(c1Var2);
            }
        }
        byte[] digest = messageDigest.digest();
        kotlin.jvm.internal.g0.o(digest, "digest(...)");
        return new ByteString(digest);
    }

    @Override // l60.l
    @m80.k
    /* renamed from: o1, reason: merged with bridge method [inline-methods] */
    public k X3(@m80.k ByteString byteString) {
        kotlin.jvm.internal.g0.p(byteString, "byteString");
        byteString.write$okio(this, 0, byteString.size());
        return this;
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

    @m80.k
    public final k q() {
        k kVar = new k();
        if (size() == 0) {
            return kVar;
        }
        c1 c1Var = this.f70446a;
        kotlin.jvm.internal.g0.m(c1Var);
        c1 d11 = c1Var.d();
        kVar.f70446a = d11;
        d11.f70389g = d11;
        d11.f70388f = d11;
        for (c1 c1Var2 = c1Var.f70388f; c1Var2 != c1Var; c1Var2 = c1Var2.f70388f) {
            c1 c1Var3 = d11.f70389g;
            kotlin.jvm.internal.g0.m(c1Var3);
            kotlin.jvm.internal.g0.m(c1Var2);
            c1Var3.c(c1Var2.d());
        }
        kVar.g1(size());
        return kVar;
    }

    @Override // l60.m
    @m80.l
    public String q0() throws EOFException {
        long U1 = U1((byte) 10);
        if (U1 != -1) {
            return m60.a.l0(this, U1);
        }
        if (size() != 0) {
            return b2(size());
        }
        return null;
    }

    @Override // l60.l
    @m80.k
    /* renamed from: q1, reason: merged with bridge method [inline-methods] */
    public k o2(@m80.k ByteString byteString, int i11, int i12) {
        kotlin.jvm.internal.g0.p(byteString, "byteString");
        byteString.write$okio(this, i11, i12);
        return this;
    }

    @Override // l60.m
    @m80.k
    public ByteString q3() {
        return h2(size());
    }

    @Override // l60.l
    @m80.k
    /* renamed from: r1, reason: merged with bridge method [inline-methods] */
    public k write(@m80.k byte[] source) {
        kotlin.jvm.internal.g0.p(source, "source");
        return write(source, 0, source.length);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@m80.k ByteBuffer sink) throws IOException {
        kotlin.jvm.internal.g0.p(sink, "sink");
        c1 c1Var = this.f70446a;
        if (c1Var == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), c1Var.f70385c - c1Var.f70384b);
        sink.put(c1Var.f70383a, c1Var.f70384b, min);
        int i11 = c1Var.f70384b + min;
        c1Var.f70384b = i11;
        this.f70447b -= min;
        if (i11 == c1Var.f70385c) {
            this.f70446a = c1Var.b();
            d1.d(c1Var);
        }
        return min;
    }

    @Override // l60.m
    public byte readByte() throws EOFException {
        if (size() == 0) {
            throw new EOFException();
        }
        c1 c1Var = this.f70446a;
        kotlin.jvm.internal.g0.m(c1Var);
        int i11 = c1Var.f70384b;
        int i12 = c1Var.f70385c;
        int i13 = i11 + 1;
        byte b11 = c1Var.f70383a[i11];
        g1(size() - 1);
        if (i13 != i12) {
            c1Var.f70384b = i13;
            return b11;
        }
        this.f70446a = c1Var.b();
        d1.d(c1Var);
        return b11;
    }

    @Override // l60.m
    public void readFully(@m80.k byte[] sink) throws EOFException {
        kotlin.jvm.internal.g0.p(sink, "sink");
        int i11 = 0;
        while (i11 < sink.length) {
            int read = read(sink, i11, sink.length - i11);
            if (read == -1) {
                throw new EOFException();
            }
            i11 += read;
        }
    }

    @Override // l60.m
    public int readInt() throws EOFException {
        if (size() < 4) {
            throw new EOFException();
        }
        c1 c1Var = this.f70446a;
        kotlin.jvm.internal.g0.m(c1Var);
        int i11 = c1Var.f70384b;
        int i12 = c1Var.f70385c;
        if (i12 - i11 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = c1Var.f70383a;
        int i13 = i11 + 3;
        int i14 = ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11] & 255) << 24) | ((bArr[i11 + 2] & 255) << 8);
        int i15 = i11 + 4;
        int i16 = (bArr[i13] & 255) | i14;
        g1(size() - 4);
        if (i15 != i12) {
            c1Var.f70384b = i15;
            return i16;
        }
        this.f70446a = c1Var.b();
        d1.d(c1Var);
        return i16;
    }

    @Override // l60.m
    public long readLong() throws EOFException {
        if (size() < 8) {
            throw new EOFException();
        }
        c1 c1Var = this.f70446a;
        kotlin.jvm.internal.g0.m(c1Var);
        int i11 = c1Var.f70384b;
        int i12 = c1Var.f70385c;
        if (i12 - i11 < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = c1Var.f70383a;
        int i13 = i11 + 7;
        long j11 = ((bArr[i11] & 255) << 56) | ((bArr[i11 + 1] & 255) << 48) | ((bArr[i11 + 2] & 255) << 40) | ((bArr[i11 + 3] & 255) << 32) | ((bArr[i11 + 4] & 255) << 24) | ((bArr[i11 + 5] & 255) << 16) | ((bArr[i11 + 6] & 255) << 8);
        int i14 = i11 + 8;
        long j12 = j11 | (bArr[i13] & 255);
        g1(size() - 8);
        if (i14 != i12) {
            c1Var.f70384b = i14;
            return j12;
        }
        this.f70446a = c1Var.b();
        d1.d(c1Var);
        return j12;
    }

    @Override // l60.m
    public short readShort() throws EOFException {
        if (size() < 2) {
            throw new EOFException();
        }
        c1 c1Var = this.f70446a;
        kotlin.jvm.internal.g0.m(c1Var);
        int i11 = c1Var.f70384b;
        int i12 = c1Var.f70385c;
        if (i12 - i11 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = c1Var.f70383a;
        int i13 = i11 + 1;
        int i14 = (bArr[i11] & 255) << 8;
        int i15 = i11 + 2;
        int i16 = (bArr[i13] & 255) | i14;
        g1(size() - 2);
        if (i15 == i12) {
            this.f70446a = c1Var.b();
            d1.d(c1Var);
        } else {
            c1Var.f70384b = i15;
        }
        return (short) i16;
    }

    @Override // l60.m
    public boolean request(long j11) {
        return this.f70447b >= j11;
    }

    @Override // l60.l
    @m80.k
    /* renamed from: s1, reason: merged with bridge method [inline-methods] */
    public k write(@m80.k byte[] source, int i11, int i12) {
        kotlin.jvm.internal.g0.p(source, "source");
        long j11 = i12;
        h.e(source.length, i11, j11);
        int i13 = i12 + i11;
        while (i11 < i13) {
            c1 m12 = m1(1);
            int min = Math.min(i13 - i11, 8192 - m12.f70385c);
            int i14 = i11 + min;
            a00.q.v0(source, m12.f70383a, m12.f70385c, i11, i14);
            m12.f70385c += min;
            i11 = i14;
        }
        g1(size() + j11);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a2, code lost:
    
        g1(size() - r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ab, code lost:
    
        if (r2 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ad, code lost:
    
        r14 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b0, code lost:
    
        if (r1 >= r14) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b8, code lost:
    
        if (size() == r17) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ba, code lost:
    
        if (r2 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bc, code lost:
    
        r1 = "Expected a digit";
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e4, code lost:
    
        throw new java.lang.NumberFormatException(r1 + " but was 0x" + l60.h.t(x0(r17)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bf, code lost:
    
        r1 = "Expected a digit or '-'";
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ea, code lost:
    
        throw new java.io.EOFException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00eb, code lost:
    
        if (r2 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ed, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ef, code lost:
    
        return -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00af, code lost:
    
        r14 = 1;
     */
    @Override // l60.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long s7() throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l60.k.s7():long");
    }

    @w00.j(name = g.b.f62794h)
    public final long size() {
        return this.f70447b;
    }

    @Override // l60.m
    public void skip(long j11) throws EOFException {
        while (j11 > 0) {
            c1 c1Var = this.f70446a;
            if (c1Var == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j11, c1Var.f70385c - c1Var.f70384b);
            long j12 = min;
            g1(size() - j12);
            j11 -= j12;
            int i11 = c1Var.f70384b + min;
            c1Var.f70384b = i11;
            if (i11 == c1Var.f70385c) {
                this.f70446a = c1Var.b();
                d1.d(c1Var);
            }
        }
    }

    @Override // l60.l
    @m80.k
    /* renamed from: t1, reason: merged with bridge method [inline-methods] */
    public k writeByte(int i11) {
        c1 m12 = m1(1);
        byte[] bArr = m12.f70383a;
        int i12 = m12.f70385c;
        m12.f70385c = i12 + 1;
        bArr[i12] = (byte) i11;
        g1(size() + 1);
        return this;
    }

    @m80.k
    public String toString() {
        return k1().toString();
    }

    @Override // l60.l
    @m80.k
    /* renamed from: u1, reason: merged with bridge method [inline-methods] */
    public k Q1(long j11) {
        boolean z11;
        if (j11 == 0) {
            return writeByte(48);
        }
        if (j11 < 0) {
            j11 = -j11;
            if (j11 < 0) {
                return n5("-9223372036854775808");
            }
            z11 = true;
        } else {
            z11 = false;
        }
        int i02 = m60.a.i0(j11);
        if (z11) {
            i02++;
        }
        c1 m12 = m1(i02);
        byte[] bArr = m12.f70383a;
        int i11 = m12.f70385c + i02;
        while (j11 != 0) {
            long j12 = 10;
            i11--;
            bArr[i11] = m60.a.j0()[(int) (j11 % j12)];
            j11 /= j12;
        }
        if (z11) {
            bArr[i11 - 1] = kx.a0.f68904b;
        }
        m12.f70385c += i02;
        g1(size() + i02);
        return this;
    }

    @Override // l60.m
    public short v1() throws EOFException {
        return h.p(readShort());
    }

    @w00.k
    @m80.k
    public final k w(@m80.k OutputStream out) throws IOException {
        kotlin.jvm.internal.g0.p(out, "out");
        return f0(this, out, 0L, 0L, 6, null);
    }

    @Override // l60.l
    @m80.k
    /* renamed from: w1, reason: merged with bridge method [inline-methods] */
    public k p3(long j11) {
        if (j11 == 0) {
            return writeByte(48);
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
        c1 m12 = m1(i11);
        byte[] bArr = m12.f70383a;
        int i12 = m12.f70385c;
        for (int i13 = (i12 + i11) - 1; i13 >= i12; i13--) {
            bArr[i13] = m60.a.j0()[(int) (15 & j11)];
            j11 >>>= 4;
        }
        m12.f70385c += i11;
        g1(size() + i11);
        return this;
    }

    @Override // l60.m
    @m80.k
    public byte[] w2() {
        return P5(size());
    }

    @w00.j(name = "getByte")
    public final byte x0(long j11) {
        h.e(size(), j11, 1L);
        c1 c1Var = this.f70446a;
        if (c1Var == null) {
            kotlin.jvm.internal.g0.m(null);
            throw null;
        }
        if (size() - j11 < j11) {
            long size = size();
            while (size > j11) {
                c1Var = c1Var.f70389g;
                kotlin.jvm.internal.g0.m(c1Var);
                size -= c1Var.f70385c - c1Var.f70384b;
            }
            kotlin.jvm.internal.g0.m(c1Var);
            return c1Var.f70383a[(int) ((c1Var.f70384b + j11) - size)];
        }
        long j12 = 0;
        while (true) {
            long j13 = (c1Var.f70385c - c1Var.f70384b) + j12;
            if (j13 > j11) {
                kotlin.jvm.internal.g0.m(c1Var);
                return c1Var.f70383a[(int) ((c1Var.f70384b + j11) - j12)];
            }
            c1Var = c1Var.f70388f;
            kotlin.jvm.internal.g0.m(c1Var);
            j12 = j13;
        }
    }

    @Override // l60.l
    @m80.k
    /* renamed from: x1, reason: merged with bridge method [inline-methods] */
    public k writeInt(int i11) {
        c1 m12 = m1(4);
        byte[] bArr = m12.f70383a;
        int i12 = m12.f70385c;
        bArr[i12] = (byte) ((i11 >>> 24) & 255);
        bArr[i12 + 1] = (byte) ((i11 >>> 16) & 255);
        bArr[i12 + 2] = (byte) ((i11 >>> 8) & 255);
        bArr[i12 + 3] = (byte) (i11 & 255);
        m12.f70385c = i12 + 4;
        g1(size() + 4);
        return this;
    }

    @Override // l60.l
    @m80.k
    /* renamed from: y1, reason: merged with bridge method [inline-methods] */
    public k z2(int i11) {
        return writeInt(h.n(i11));
    }

    @Override // l60.e1
    public void y8(@m80.k k source, long j11) {
        c1 c1Var;
        kotlin.jvm.internal.g0.p(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        h.e(source.size(), 0L, j11);
        while (j11 > 0) {
            c1 c1Var2 = source.f70446a;
            kotlin.jvm.internal.g0.m(c1Var2);
            int i11 = c1Var2.f70385c;
            kotlin.jvm.internal.g0.m(source.f70446a);
            if (j11 < i11 - r1.f70384b) {
                c1 c1Var3 = this.f70446a;
                if (c1Var3 != null) {
                    kotlin.jvm.internal.g0.m(c1Var3);
                    c1Var = c1Var3.f70389g;
                } else {
                    c1Var = null;
                }
                if (c1Var != null && c1Var.f70387e) {
                    if ((c1Var.f70385c + j11) - (c1Var.f70386d ? 0 : c1Var.f70384b) <= 8192) {
                        c1 c1Var4 = source.f70446a;
                        kotlin.jvm.internal.g0.m(c1Var4);
                        c1Var4.g(c1Var, (int) j11);
                        source.g1(source.size() - j11);
                        g1(size() + j11);
                        return;
                    }
                }
                c1 c1Var5 = source.f70446a;
                kotlin.jvm.internal.g0.m(c1Var5);
                source.f70446a = c1Var5.e((int) j11);
            }
            c1 c1Var6 = source.f70446a;
            kotlin.jvm.internal.g0.m(c1Var6);
            long j12 = c1Var6.f70385c - c1Var6.f70384b;
            source.f70446a = c1Var6.b();
            c1 c1Var7 = this.f70446a;
            if (c1Var7 == null) {
                this.f70446a = c1Var6;
                c1Var6.f70389g = c1Var6;
                c1Var6.f70388f = c1Var6;
            } else {
                kotlin.jvm.internal.g0.m(c1Var7);
                c1 c1Var8 = c1Var7.f70389g;
                kotlin.jvm.internal.g0.m(c1Var8);
                c1Var8.c(c1Var6).a();
            }
            source.g1(source.size() - j12);
            g1(size() + j12);
            j11 -= j12;
        }
    }

    public final ByteString z0(String str, ByteString byteString) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.internalArray$okio(), str));
            c1 c1Var = this.f70446a;
            if (c1Var != null) {
                byte[] bArr = c1Var.f70383a;
                int i11 = c1Var.f70384b;
                mac.update(bArr, i11, c1Var.f70385c - i11);
                c1 c1Var2 = c1Var.f70388f;
                kotlin.jvm.internal.g0.m(c1Var2);
                while (c1Var2 != c1Var) {
                    byte[] bArr2 = c1Var2.f70383a;
                    int i12 = c1Var2.f70384b;
                    mac.update(bArr2, i12, c1Var2.f70385c - i12);
                    c1Var2 = c1Var2.f70388f;
                    kotlin.jvm.internal.g0.m(c1Var2);
                }
            }
            byte[] doFinal = mac.doFinal();
            kotlin.jvm.internal.g0.o(doFinal, "doFinal(...)");
            return new ByteString(doFinal);
        } catch (InvalidKeyException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    @Override // l60.m
    public long z7(@m80.k e1 sink) throws IOException {
        kotlin.jvm.internal.g0.p(sink, "sink");
        long size = size();
        if (size > 0) {
            sink.y8(this, size);
        }
        return size;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/Buffer$inputStream$1\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,649:1\n73#2:650\n85#2:651\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/Buffer$inputStream$1\n*L\n126#1:650\n136#1:651\n*E\n"})
    public static final class b extends InputStream {
        public b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(k.this.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream
        public int read() {
            if (k.this.size() > 0) {
                return k.this.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return k.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int i11, int i12) {
            kotlin.jvm.internal.g0.p(sink, "sink");
            return k.this.read(sink, i11, i12);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@m80.k ByteBuffer source) throws IOException {
        kotlin.jvm.internal.g0.p(source, "source");
        int remaining = source.remaining();
        int i11 = remaining;
        while (i11 > 0) {
            c1 m12 = m1(1);
            int min = Math.min(i11, 8192 - m12.f70385c);
            source.get(m12.f70383a, m12.f70385c, min);
            i11 -= min;
            m12.f70385c += min;
        }
        this.f70447b += remaining;
        return remaining;
    }

    @Override // l60.m
    public int read(@m80.k byte[] sink) {
        kotlin.jvm.internal.g0.p(sink, "sink");
        return read(sink, 0, sink.length);
    }

    @Override // l60.m
    public int read(@m80.k byte[] sink, int i11, int i12) {
        kotlin.jvm.internal.g0.p(sink, "sink");
        h.e(sink.length, i11, i12);
        c1 c1Var = this.f70446a;
        if (c1Var == null) {
            return -1;
        }
        int min = Math.min(i12, c1Var.f70385c - c1Var.f70384b);
        byte[] bArr = c1Var.f70383a;
        int i13 = c1Var.f70384b;
        a00.q.v0(bArr, sink, i11, i13, i13 + min);
        c1Var.f70384b += min;
        g1(size() - min);
        if (c1Var.f70384b == c1Var.f70385c) {
            this.f70446a = c1Var.b();
            d1.d(c1Var);
        }
        return min;
    }

    @Override // l60.g1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // l60.l, l60.e1, java.io.Flushable
    public void flush() {
    }

    @Override // l60.m
    @m80.k
    public k getBuffer() {
        return this;
    }

    @Override // l60.l
    @m80.k
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public k A() {
        return this;
    }

    @Override // l60.l
    @m80.k
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public k X4() {
        return this;
    }

    @Override // l60.m
    @m80.k
    public k z() {
        return this;
    }
}
