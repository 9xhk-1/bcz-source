package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import fl.m;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {
    public static final int A = 16;
    public static final int B = 8;
    public static final int C = 1718909296;
    public static final int D = 1635150182;
    public static final int E = 1635150195;

    /* renamed from: b, reason: collision with root package name */
    public static final String f28779b = "DfltImageHeaderParser";

    /* renamed from: c, reason: collision with root package name */
    public static final int f28780c = 4671814;

    /* renamed from: d, reason: collision with root package name */
    public static final int f28781d = -1991225785;

    /* renamed from: e, reason: collision with root package name */
    public static final int f28782e = 65496;

    /* renamed from: f, reason: collision with root package name */
    public static final int f28783f = 19789;

    /* renamed from: g, reason: collision with root package name */
    public static final int f28784g = 18761;

    /* renamed from: l, reason: collision with root package name */
    public static final int f28789l = 218;

    /* renamed from: m, reason: collision with root package name */
    public static final int f28790m = 217;

    /* renamed from: n, reason: collision with root package name */
    public static final int f28791n = 255;

    /* renamed from: o, reason: collision with root package name */
    public static final int f28792o = 225;

    /* renamed from: p, reason: collision with root package name */
    public static final int f28793p = 226;

    /* renamed from: q, reason: collision with root package name */
    public static final int f28794q = 274;

    /* renamed from: s, reason: collision with root package name */
    public static final int f28796s = 1380533830;

    /* renamed from: t, reason: collision with root package name */
    public static final int f28797t = 1464156752;

    /* renamed from: u, reason: collision with root package name */
    public static final int f28798u = 1448097792;

    /* renamed from: v, reason: collision with root package name */
    public static final int f28799v = -256;

    /* renamed from: w, reason: collision with root package name */
    public static final int f28800w = 255;

    /* renamed from: x, reason: collision with root package name */
    public static final int f28801x = 88;

    /* renamed from: y, reason: collision with root package name */
    public static final int f28802y = 76;

    /* renamed from: z, reason: collision with root package name */
    public static final int f28803z = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final String f28785h = "Exif\u0000\u0000";

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f28786i = f28785h.getBytes(Charset.forName("UTF-8"));

    /* renamed from: j, reason: collision with root package name */
    public static final String f28787j = "MPF";

    /* renamed from: k, reason: collision with root package name */
    public static final byte[] f28788k = f28787j.getBytes(Charset.forName("UTF-8"));

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f28795r = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Reader {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class EndOfFileException extends IOException {
            private static final long serialVersionUID = 1;

            public EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a() throws IOException;

        short b() throws IOException;

        int read(byte[] bArr, int i11) throws IOException;

        long skip(long j11) throws IOException;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Reader {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f28804a;

        public a(ByteBuffer byteBuffer) {
            this.f28804a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int a() throws Reader.EndOfFileException {
            return (b() << 8) | b();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short b() throws Reader.EndOfFileException {
            if (this.f28804a.remaining() >= 1) {
                return (short) (this.f28804a.get() & 255);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int read(byte[] bArr, int i11) {
            int min = Math.min(i11, this.f28804a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f28804a.get(bArr, 0, min);
            return min;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j11) {
            int min = (int) Math.min(this.f28804a.remaining(), j11);
            ByteBuffer byteBuffer = this.f28804a;
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f28805a;

        public b(byte[] bArr, int i11) {
            this.f28805a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i11);
        }

        public short a(int i11) {
            if (c(i11, 2)) {
                return this.f28805a.getShort(i11);
            }
            return (short) -1;
        }

        public int b(int i11) {
            if (c(i11, 4)) {
                return this.f28805a.getInt(i11);
            }
            return -1;
        }

        public final boolean c(int i11, int i12) {
            return this.f28805a.remaining() - i11 >= i12;
        }

        public int d() {
            return this.f28805a.remaining();
        }

        public void e(ByteOrder byteOrder) {
            this.f28805a.order(byteOrder);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements Reader {

        /* renamed from: a, reason: collision with root package name */
        public final InputStream f28806a;

        public c(InputStream inputStream) {
            this.f28806a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int a() throws IOException {
            return (b() << 8) | b();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short b() throws IOException {
            int read = this.f28806a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int read(byte[] bArr, int i11) throws IOException {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i11 && (i13 = this.f28806a.read(bArr, i12, i11 - i12)) != -1) {
                i12 += i13;
            }
            if (i12 == 0 && i13 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i12;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j11) throws IOException {
            if (j11 < 0) {
                return 0L;
            }
            long j12 = j11;
            while (j12 > 0) {
                long skip = this.f28806a.skip(j12);
                if (skip <= 0) {
                    if (this.f28806a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j12 -= skip;
            }
            return j11 - j12;
        }
    }

    public static int g(int i11, int i12) {
        return i11 + 2 + (i12 * 12);
    }

    public static boolean j(int i11) {
        return (i11 & f28782e) == 65496 || i11 == 19789 || i11 == 18761;
    }

    public static int r(b bVar) {
        ByteOrder byteOrder;
        short a11 = bVar.a(6);
        if (a11 == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (a11 != 19789) {
            if (Log.isLoggable(f28779b, 3)) {
                Log.d(f28779b, "Unknown endianness = " + ((int) a11));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        bVar.e(byteOrder);
        int b11 = bVar.b(10) + 6;
        short a12 = bVar.a(b11);
        for (int i11 = 0; i11 < a12; i11++) {
            int g11 = g(b11, i11);
            short a13 = bVar.a(g11);
            if (a13 == 274) {
                short a14 = bVar.a(g11 + 2);
                if (a14 >= 1 && a14 <= 12) {
                    int b12 = bVar.b(g11 + 4);
                    if (b12 >= 0) {
                        if (Log.isLoggable(f28779b, 3)) {
                            Log.d(f28779b, "Got tagIndex=" + i11 + " tagType=" + ((int) a13) + " formatCode=" + ((int) a14) + " componentCount=" + b12);
                        }
                        int i12 = b12 + f28795r[a14];
                        if (i12 <= 4) {
                            int i13 = g11 + 8;
                            if (i13 >= 0 && i13 <= bVar.d()) {
                                if (i12 >= 0 && i12 + i13 <= bVar.d()) {
                                    return bVar.a(i13);
                                }
                                if (Log.isLoggable(f28779b, 3)) {
                                    Log.d(f28779b, "Illegal number of bytes for TI tag data tagType=" + ((int) a13));
                                }
                            } else if (Log.isLoggable(f28779b, 3)) {
                                Log.d(f28779b, "Illegal tagValueOffset=" + i13 + " tagType=" + ((int) a13));
                            }
                        } else if (Log.isLoggable(f28779b, 3)) {
                            Log.d(f28779b, "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) a14));
                        }
                    } else if (Log.isLoggable(f28779b, 3)) {
                        Log.d(f28779b, "Negative tiff component count");
                    }
                } else if (Log.isLoggable(f28779b, 3)) {
                    Log.d(f28779b, "Got invalid format code = " + ((int) a14));
                }
            }
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public boolean a(@NonNull ByteBuffer byteBuffer, @NonNull lk.b bVar) throws IOException {
        return l(new a((ByteBuffer) m.e(byteBuffer)), (lk.b) m.e(bVar));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int b(@NonNull ByteBuffer byteBuffer, @NonNull lk.b bVar) throws IOException {
        return h(new a((ByteBuffer) m.e(byteBuffer)), (lk.b) m.e(bVar));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public ImageHeaderParser.ImageType c(@NonNull InputStream inputStream) throws IOException {
        return i(new c((InputStream) m.e(inputStream)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int d(@NonNull InputStream inputStream, @NonNull lk.b bVar) throws IOException {
        return h(new c((InputStream) m.e(inputStream)), (lk.b) m.e(bVar));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public ImageHeaderParser.ImageType e(@NonNull ByteBuffer byteBuffer) throws IOException {
        return i(new a((ByteBuffer) m.e(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public boolean f(@NonNull InputStream inputStream, @NonNull lk.b bVar) throws IOException {
        return l(new c((InputStream) m.e(inputStream)), (lk.b) m.e(bVar));
    }

    public final int h(Reader reader, lk.b bVar) throws IOException {
        try {
            int a11 = reader.a();
            if (!j(a11)) {
                if (Log.isLoggable(f28779b, 3)) {
                    Log.d(f28779b, "Parser doesn't handle magic number: " + a11);
                }
                return -1;
            }
            int p11 = p(reader);
            if (p11 == -1) {
                if (Log.isLoggable(f28779b, 3)) {
                    Log.d(f28779b, "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) bVar.a(p11, byte[].class);
            try {
                return s(reader, bArr, p11);
            } finally {
                bVar.put(bArr);
            }
        } catch (Reader.EndOfFileException unused) {
            return -1;
        }
    }

    @NonNull
    public final ImageHeaderParser.ImageType i(Reader reader) throws IOException {
        try {
            int a11 = reader.a();
            if (a11 == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int b11 = (a11 << 8) | reader.b();
            if (b11 == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int b12 = (b11 << 8) | reader.b();
            if (b12 == -1991225785) {
                reader.skip(21L);
                try {
                    return reader.b() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (b12 != 1380533830) {
                return t(reader, b12);
            }
            reader.skip(4L);
            if (((reader.a() << 16) | reader.a()) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int a12 = (reader.a() << 16) | reader.a();
            if ((a12 & (-256)) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i11 = a12 & 255;
            if (i11 == 88) {
                reader.skip(4L);
                short b13 = reader.b();
                return (b13 & 2) != 0 ? ImageHeaderParser.ImageType.ANIMATED_WEBP : (b13 & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (i11 != 76) {
                return ImageHeaderParser.ImageType.WEBP;
            }
            reader.skip(4L);
            return (reader.b() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    public final boolean k(byte[] bArr, int i11) {
        return n(bArr, i11, f28786i);
    }

    public final boolean l(@NonNull Reader reader, @NonNull lk.b bVar) throws IOException {
        if (i(reader) != ImageHeaderParser.ImageType.JPEG) {
            return false;
        }
        int o11 = o(reader);
        while (o11 > 0) {
            byte[] bArr = (byte[]) bVar.a(o11, byte[].class);
            try {
                if (m(reader, bArr, o11)) {
                    bVar.put(bArr);
                    return true;
                }
                bVar.put(bArr);
                o11 = o(reader);
            } catch (Throwable th2) {
                bVar.put(bArr);
                throw th2;
            }
        }
        if (Log.isLoggable(f28779b, 2)) {
            Log.v(f28779b, "hasMpf: Failed to parse APP2 segment length, or no APP2 segment with MPF metadata not found");
        }
        return false;
    }

    public final boolean m(Reader reader, byte[] bArr, int i11) throws IOException {
        int read = reader.read(bArr, i11);
        if (read == i11) {
            return n(bArr, i11, f28788k);
        }
        if (!Log.isLoggable(f28779b, 3)) {
            return false;
        }
        Log.d(f28779b, "Unable to read APP2 segment data, length: " + i11 + ", actually read: " + read);
        return false;
    }

    public final boolean n(byte[] bArr, int i11, byte[] bArr2) {
        boolean z11 = (bArr == null || bArr2 == null || i11 <= bArr2.length) ? false : true;
        if (z11) {
            for (int i12 = 0; i12 < bArr2.length; i12++) {
                if (bArr[i12] != bArr2[i12]) {
                    return false;
                }
            }
        }
        return z11;
    }

    public final int o(Reader reader) throws IOException {
        return q(reader, 226);
    }

    public final int p(Reader reader) throws IOException {
        return q(reader, 225);
    }

    public final int q(Reader reader, int i11) throws IOException {
        short b11;
        int a11;
        long j11;
        long skip;
        do {
            short b12 = reader.b();
            if (b12 != 255) {
                if (Log.isLoggable(f28779b, 3)) {
                    Log.d(f28779b, "Unknown segmentId=" + ((int) b12));
                }
                return -1;
            }
            b11 = reader.b();
            if (b11 == 218) {
                return -1;
            }
            if (b11 == 217) {
                if (Log.isLoggable(f28779b, 3)) {
                    Log.d(f28779b, "Found MARKER_EOI in " + i11 + " segment");
                }
                return -1;
            }
            a11 = reader.a() - 2;
            if (b11 == i11) {
                return a11;
            }
            j11 = a11;
            skip = reader.skip(j11);
        } while (skip == j11);
        if (Log.isLoggable(f28779b, 3)) {
            Log.d(f28779b, "Unable to skip enough data, type: " + ((int) b11) + ", wanted to skip: " + a11 + ", but actually skipped: " + skip);
        }
        return -1;
    }

    public final int s(Reader reader, byte[] bArr, int i11) throws IOException {
        int read = reader.read(bArr, i11);
        if (read == i11) {
            if (k(bArr, i11)) {
                return r(new b(bArr, i11));
            }
            if (Log.isLoggable(f28779b, 3)) {
                Log.d(f28779b, "Missing jpeg exif preamble");
            }
            return -1;
        }
        if (Log.isLoggable(f28779b, 3)) {
            Log.d(f28779b, "Unable to read exif segment data, length: " + i11 + ", actually read: " + read);
        }
        return -1;
    }

    public final ImageHeaderParser.ImageType t(Reader reader, int i11) throws IOException {
        if (((reader.a() << 16) | reader.a()) != 1718909296) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int a11 = (reader.a() << 16) | reader.a();
        if (a11 == 1635150195) {
            return ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        int i12 = 0;
        boolean z11 = a11 == 1635150182;
        reader.skip(4L);
        int i13 = i11 - 16;
        if (i13 % 4 == 0) {
            while (i12 < 5 && i13 > 0) {
                int a12 = (reader.a() << 16) | reader.a();
                if (a12 == 1635150195) {
                    return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                }
                if (a12 == 1635150182) {
                    z11 = true;
                }
                i12++;
                i13 -= 4;
            }
        }
        return z11 ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
    }
}
