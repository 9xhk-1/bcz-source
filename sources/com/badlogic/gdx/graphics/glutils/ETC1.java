package com.badlogic.gdx.graphics.glutils;

import a3.q;
import a3.x0;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.f;
import com.badlogic.gdx.math.n;
import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.nio.ByteBuffer;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class ETC1 {

    /* renamed from: a, reason: collision with root package name */
    public static int f12206a = 16;

    /* renamed from: b, reason: collision with root package name */
    public static int f12207b = 36196;

    public static Pixmap a(a aVar, Pixmap.Format format) {
        int i11;
        int i12;
        int i13;
        if (aVar.o()) {
            i11 = getWidthPKM(aVar.f12210c, 0);
            i13 = getHeightPKM(aVar.f12210c, 0);
            i12 = 16;
        } else {
            i11 = aVar.f12208a;
            i12 = 0;
            i13 = aVar.f12209b;
        }
        int i14 = i11;
        int d11 = d(format);
        Pixmap pixmap = new Pixmap(i14, i13, format);
        decodeImage(aVar.f12210c, i12, pixmap.h1(), 0, i14, i13, d11);
        return pixmap;
    }

    public static a b(Pixmap pixmap) {
        ByteBuffer encodeImage = encodeImage(pixmap.h1(), 0, pixmap.i1(), pixmap.f1(), d(pixmap.b1()));
        BufferUtils.K(encodeImage);
        return new a(pixmap.i1(), pixmap.f1(), encodeImage, 0);
    }

    public static a c(Pixmap pixmap) {
        ByteBuffer encodeImagePKM = encodeImagePKM(pixmap.h1(), 0, pixmap.i1(), pixmap.f1(), d(pixmap.b1()));
        BufferUtils.K(encodeImagePKM);
        return new a(pixmap.i1(), pixmap.f1(), encodeImagePKM, 16);
    }

    public static int d(Pixmap.Format format) {
        if (format == Pixmap.Format.RGB565) {
            return 2;
        }
        if (format == Pixmap.Format.RGB888) {
            return 3;
        }
        throw new GdxRuntimeException("Can only handle RGB565 or RGB888 images");
    }

    private static native void decodeImage(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, int i13, int i14, int i15);

    private static native ByteBuffer encodeImage(ByteBuffer byteBuffer, int i11, int i12, int i13, int i14);

    private static native ByteBuffer encodeImagePKM(ByteBuffer byteBuffer, int i11, int i12, int i13, int i14);

    public static native void formatHeader(ByteBuffer byteBuffer, int i11, int i12, int i13);

    public static native int getCompressedDataSize(int i11, int i12);

    public static native int getHeightPKM(ByteBuffer byteBuffer, int i11);

    public static native int getWidthPKM(ByteBuffer byteBuffer, int i11);

    public static native boolean isValidPKM(ByteBuffer byteBuffer, int i11);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        public final int f12208a;

        /* renamed from: b, reason: collision with root package name */
        public final int f12209b;

        /* renamed from: c, reason: collision with root package name */
        public final ByteBuffer f12210c;

        /* renamed from: d, reason: collision with root package name */
        public final int f12211d;

        public a(int i11, int i12, ByteBuffer byteBuffer, int i13) {
            this.f12208a = i11;
            this.f12209b = i12;
            this.f12210c = byteBuffer;
            this.f12211d = i13;
            b();
        }

        public final void b() {
            if (n.y(this.f12208a) && n.y(this.f12209b)) {
                return;
            }
            System.out.println("ETC1Data warning: non-power-of-two ETC1 textures may crash the driver of PowerVR GPUs");
        }

        @Override // a3.q
        public void dispose() {
            BufferUtils.p(this.f12210c);
        }

        public boolean o() {
            return this.f12211d == 16;
        }

        public String toString() {
            if (!o()) {
                return "raw [" + this.f12208a + "x" + this.f12209b + "], compressed: " + (this.f12210c.capacity() - ETC1.f12206a);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ETC1.isValidPKM(this.f12210c, 0) ? "valid" : "invalid");
            sb2.append(" pkm [");
            sb2.append(ETC1.getWidthPKM(this.f12210c, 0));
            sb2.append("x");
            sb2.append(ETC1.getHeightPKM(this.f12210c, 0));
            sb2.append("], compressed: ");
            sb2.append(this.f12210c.capacity() - ETC1.f12206a);
            return sb2.toString();
        }

        public void z(v1.a aVar) {
            DataOutputStream dataOutputStream;
            byte[] bArr = new byte[f.D2];
            this.f12210c.position(0);
            ByteBuffer byteBuffer = this.f12210c;
            byteBuffer.limit(byteBuffer.capacity());
            DataOutputStream dataOutputStream2 = null;
            try {
                try {
                    dataOutputStream = new DataOutputStream(new GZIPOutputStream(aVar.S(false)));
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e11) {
                e = e11;
            }
            try {
                dataOutputStream.writeInt(this.f12210c.capacity());
                int i11 = 0;
                while (i11 != this.f12210c.capacity()) {
                    int min = Math.min(this.f12210c.remaining(), f.D2);
                    this.f12210c.get(bArr, 0, min);
                    dataOutputStream.write(bArr, 0, min);
                    i11 += min;
                }
                x0.a(dataOutputStream);
                this.f12210c.position(this.f12211d);
                ByteBuffer byteBuffer2 = this.f12210c;
                byteBuffer2.limit(byteBuffer2.capacity());
            } catch (Exception e12) {
                e = e12;
                throw new GdxRuntimeException("Couldn't write PKM file to '" + aVar + "'", e);
            } catch (Throwable th3) {
                th = th3;
                dataOutputStream2 = dataOutputStream;
                x0.a(dataOutputStream2);
                throw th;
            }
        }

        public a(v1.a aVar) {
            DataInputStream dataInputStream;
            byte[] bArr = new byte[f.D2];
            DataInputStream dataInputStream2 = null;
            try {
                try {
                    dataInputStream = new DataInputStream(new BufferedInputStream(new GZIPInputStream(aVar.F())));
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f12210c = BufferUtils.J(dataInputStream.readInt());
                while (true) {
                    int read = dataInputStream.read(bArr);
                    if (read != -1) {
                        this.f12210c.put(bArr, 0, read);
                    } else {
                        this.f12210c.position(0);
                        ByteBuffer byteBuffer = this.f12210c;
                        byteBuffer.limit(byteBuffer.capacity());
                        x0.a(dataInputStream);
                        this.f12208a = ETC1.getWidthPKM(this.f12210c, 0);
                        this.f12209b = ETC1.getHeightPKM(this.f12210c, 0);
                        int i11 = ETC1.f12206a;
                        this.f12211d = i11;
                        this.f12210c.position(i11);
                        b();
                        return;
                    }
                }
            } catch (Exception e12) {
                e = e12;
                dataInputStream2 = dataInputStream;
                throw new GdxRuntimeException("Couldn't load pkm file '" + aVar + "'", e);
            } catch (Throwable th3) {
                th = th3;
                dataInputStream2 = dataInputStream;
                x0.a(dataInputStream2);
                throw th;
            }
        }
    }
}
