package com.badlogic.gdx.graphics;

import a3.x0;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.zip.CRC32;
import java.util.zip.CheckedOutputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class m {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f12462a = 32000;

        /* renamed from: b, reason: collision with root package name */
        public static final byte[] f12463b = new byte[32000];

        /* renamed from: c, reason: collision with root package name */
        public static final byte[] f12464c = new byte[32000];

        /* JADX WARN: Not initialized variable reg: 1, insn: 0x0059: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:90), block:B:27:0x0059 */
        public static Pixmap a(v1.a aVar) {
            Exception e11;
            Closeable closeable;
            Closeable closeable2 = null;
            try {
                try {
                    DataInputStream dataInputStream = new DataInputStream(new InflaterInputStream(new BufferedInputStream(aVar.F())));
                    try {
                        Pixmap pixmap = new Pixmap(dataInputStream.readInt(), dataInputStream.readInt(), Pixmap.Format.fromGdx2DPixmapFormat(dataInputStream.readInt()));
                        ByteBuffer h12 = pixmap.h1();
                        h12.position(0);
                        h12.limit(h12.capacity());
                        synchronized (f12464c) {
                            while (true) {
                                try {
                                    byte[] bArr = f12464c;
                                    int read = dataInputStream.read(bArr);
                                    if (read > 0) {
                                        h12.put(bArr, 0, read);
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                        h12.position(0);
                        h12.limit(h12.capacity());
                        x0.a(dataInputStream);
                        return pixmap;
                    } catch (Exception e12) {
                        e11 = e12;
                        throw new GdxRuntimeException("Couldn't read Pixmap from file '" + aVar + "'", e11);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    closeable2 = closeable;
                    x0.a(closeable2);
                    throw th;
                }
            } catch (Exception e13) {
                e11 = e13;
            } catch (Throwable th4) {
                th = th4;
                x0.a(closeable2);
                throw th;
            }
        }

        public static void b(v1.a aVar, Pixmap pixmap) {
            DataOutputStream dataOutputStream;
            DataOutputStream dataOutputStream2 = null;
            try {
                try {
                    dataOutputStream = new DataOutputStream(new DeflaterOutputStream(aVar.S(false)));
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e11) {
                e = e11;
            }
            try {
                dataOutputStream.writeInt(pixmap.i1());
                dataOutputStream.writeInt(pixmap.f1());
                dataOutputStream.writeInt(Pixmap.Format.toGdx2DPixmapFormat(pixmap.b1()));
                ByteBuffer h12 = pixmap.h1();
                h12.position(0);
                h12.limit(h12.capacity());
                int capacity = h12.capacity() % 32000;
                int capacity2 = h12.capacity() / 32000;
                synchronized (f12463b) {
                    for (int i11 = 0; i11 < capacity2; i11++) {
                        try {
                            byte[] bArr = f12463b;
                            h12.get(bArr);
                            dataOutputStream.write(bArr);
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    byte[] bArr2 = f12463b;
                    h12.get(bArr2, 0, capacity);
                    dataOutputStream.write(bArr2, 0, capacity);
                }
                h12.position(0);
                h12.limit(h12.capacity());
                x0.a(dataOutputStream);
            } catch (Exception e12) {
                e = e12;
                throw new GdxRuntimeException("Couldn't write Pixmap to file '" + aVar + "'", e);
            } catch (Throwable th4) {
                th = th4;
                dataOutputStream2 = dataOutputStream;
                x0.a(dataOutputStream2);
                throw th;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements a3.q {

        /* renamed from: h, reason: collision with root package name */
        public static final byte[] f12465h = {-119, 80, 78, 71, 13, 10, ho.c.D, 10};

        /* renamed from: i, reason: collision with root package name */
        public static final int f12466i = 1229472850;

        /* renamed from: j, reason: collision with root package name */
        public static final int f12467j = 1229209940;

        /* renamed from: k, reason: collision with root package name */
        public static final int f12468k = 1229278788;

        /* renamed from: l, reason: collision with root package name */
        public static final byte f12469l = 6;

        /* renamed from: m, reason: collision with root package name */
        public static final byte f12470m = 0;

        /* renamed from: n, reason: collision with root package name */
        public static final byte f12471n = 0;

        /* renamed from: o, reason: collision with root package name */
        public static final byte f12472o = 0;

        /* renamed from: p, reason: collision with root package name */
        public static final byte f12473p = 4;

        /* renamed from: a, reason: collision with root package name */
        public final a f12474a;

        /* renamed from: b, reason: collision with root package name */
        public final Deflater f12475b;

        /* renamed from: c, reason: collision with root package name */
        public a3.h f12476c;

        /* renamed from: d, reason: collision with root package name */
        public a3.h f12477d;

        /* renamed from: e, reason: collision with root package name */
        public a3.h f12478e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f12479f;

        /* renamed from: g, reason: collision with root package name */
        public int f12480g;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a extends DataOutputStream {

            /* renamed from: a, reason: collision with root package name */
            public final ByteArrayOutputStream f12481a;

            /* renamed from: b, reason: collision with root package name */
            public final CRC32 f12482b;

            public a(int i11) {
                this(new ByteArrayOutputStream(i11), new CRC32());
            }

            public void a(DataOutputStream dataOutputStream) throws IOException {
                flush();
                dataOutputStream.writeInt(this.f12481a.size() - 4);
                this.f12481a.writeTo(dataOutputStream);
                dataOutputStream.writeInt((int) this.f12482b.getValue());
                this.f12481a.reset();
                this.f12482b.reset();
            }

            public a(ByteArrayOutputStream byteArrayOutputStream, CRC32 crc32) {
                super(new CheckedOutputStream(byteArrayOutputStream, crc32));
                this.f12481a = byteArrayOutputStream;
                this.f12482b = crc32;
            }
        }

        public b() {
            this(16384);
        }

        public void D(v1.a aVar, Pixmap pixmap) throws IOException {
            OutputStream S = aVar.S(false);
            try {
                z(S, pixmap);
            } finally {
                x0.a(S);
            }
        }

        public void b(int i11) {
            this.f12475b.setLevel(i11);
        }

        @Override // a3.q
        public void dispose() {
            this.f12475b.end();
        }

        public void o(boolean z11) {
            this.f12479f = z11;
        }

        public void z(OutputStream outputStream, Pixmap pixmap) throws IOException {
            byte[] k11;
            byte[] k12;
            byte[] k13;
            int i11;
            int i12;
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(this.f12474a, this.f12475b);
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.write(f12465h);
            this.f12474a.writeInt(f12466i);
            this.f12474a.writeInt(pixmap.i1());
            this.f12474a.writeInt(pixmap.f1());
            this.f12474a.writeByte(8);
            this.f12474a.writeByte(6);
            int i13 = 0;
            this.f12474a.writeByte(0);
            this.f12474a.writeByte(0);
            this.f12474a.writeByte(0);
            this.f12474a.a(dataOutputStream);
            this.f12474a.writeInt(f12467j);
            this.f12475b.reset();
            int i14 = 4;
            int i15 = pixmap.i1() * 4;
            a3.h hVar = this.f12476c;
            if (hVar == null) {
                a3.h hVar2 = new a3.h(i15);
                this.f12476c = hVar2;
                k11 = hVar2.f1533a;
                a3.h hVar3 = new a3.h(i15);
                this.f12477d = hVar3;
                k12 = hVar3.f1533a;
                a3.h hVar4 = new a3.h(i15);
                this.f12478e = hVar4;
                k13 = hVar4.f1533a;
            } else {
                k11 = hVar.k(i15);
                k12 = this.f12477d.k(i15);
                k13 = this.f12478e.k(i15);
                int i16 = this.f12480g;
                for (int i17 = 0; i17 < i16; i17++) {
                    k13[i17] = 0;
                }
            }
            this.f12480g = i15;
            ByteBuffer h12 = pixmap.h1();
            int position = h12.position();
            boolean z11 = pixmap.b1() == Pixmap.Format.RGBA8888;
            int f12 = pixmap.f1();
            int i18 = 0;
            while (i18 < f12) {
                int i19 = this.f12479f ? (f12 - i18) - 1 : i18;
                if (z11) {
                    h12.position(i19 * i15);
                    h12.get(k12, i13, i15);
                    i11 = i13;
                    i12 = i14;
                } else {
                    i11 = i13;
                    int i21 = i11;
                    i12 = i14;
                    while (i13 < pixmap.i1()) {
                        int g12 = pixmap.g1(i13, i19);
                        int i22 = i13;
                        k12[i21] = (byte) ((g12 >> 24) & 255);
                        k12[i21 + 1] = (byte) ((g12 >> 16) & 255);
                        int i23 = i21 + 3;
                        k12[i21 + 2] = (byte) ((g12 >> 8) & 255);
                        i21 += 4;
                        k12[i23] = (byte) (g12 & 255);
                        i13 = i22 + 1;
                    }
                }
                k11[i11] = (byte) (k12[i11] - k13[i11]);
                k11[1] = (byte) (k12[1] - k13[1]);
                k11[2] = (byte) (k12[2] - k13[2]);
                k11[3] = (byte) (k12[3] - k13[3]);
                int i24 = i12;
                while (i24 < i15) {
                    int i25 = i24 - 4;
                    int i26 = k12[i25] & 255;
                    int i27 = i24;
                    int i28 = k13[i27] & 255;
                    int i29 = k13[i25] & 255;
                    int i31 = (i26 + i28) - i29;
                    int i32 = i31 - i26;
                    if (i32 < 0) {
                        i32 = -i32;
                    }
                    int i33 = i31 - i28;
                    if (i33 < 0) {
                        i33 = -i33;
                    }
                    int i34 = i31 - i29;
                    if (i34 < 0) {
                        i34 = -i34;
                    }
                    if (i32 > i33 || i32 > i34) {
                        i26 = i33 <= i34 ? i28 : i29;
                    }
                    k11[i27] = (byte) (k12[i27] - i26);
                    i24 = i27 + 1;
                }
                int i35 = i12;
                deflaterOutputStream.write(i35);
                i13 = i11;
                deflaterOutputStream.write(k11, i13, i15);
                i18++;
                byte[] bArr = k13;
                k13 = k12;
                k12 = bArr;
                i14 = i35;
            }
            h12.position(position);
            deflaterOutputStream.finish();
            this.f12474a.a(dataOutputStream);
            this.f12474a.writeInt(f12468k);
            this.f12474a.a(dataOutputStream);
            outputStream.flush();
        }

        public b(int i11) {
            this.f12479f = true;
            this.f12474a = new a(i11);
            this.f12475b = new Deflater();
        }
    }

    public static Pixmap a(v1.a aVar) {
        return a.a(aVar);
    }

    public static void b(v1.a aVar, Pixmap pixmap) {
        a.b(aVar, pixmap);
    }

    public static void c(v1.a aVar, Pixmap pixmap) {
        d(aVar, pixmap, -1, false);
    }

    public static void d(v1.a aVar, Pixmap pixmap, int i11, boolean z11) {
        try {
            b bVar = new b((int) (pixmap.i1() * pixmap.f1() * 1.5f));
            try {
                bVar.o(z11);
                bVar.b(i11);
                bVar.D(aVar, pixmap);
            } finally {
                bVar.dispose();
            }
        } catch (IOException e11) {
            throw new GdxRuntimeException("Error writing PNG: " + aVar, e11);
        }
    }
}
