package c60;

import a00.q;
import com.jiongji.andriod.card.R;
import java.io.IOException;
import kotlin.jvm.internal.g0;
import l60.l;
import l60.m;
import m80.k;
import okio.ByteString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final e f8208a = new e();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final int[] f8209b = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, R.styleable.Theme_drawable_walk_sound4, 2042, 1018, 1019, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, R.styleable.Theme_drawable_wiki_sound, f2.a.M, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, R.styleable.Theme_drawable_wiki_sound1, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final byte[] f8210c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f8211d;

    static {
        byte[] bArr = {13, ho.c.A, 28, 28, 28, 28, 28, 28, 28, ho.c.B, ho.c.H, 28, 28, ho.c.H, 28, 28, 28, 28, 28, 28, 28, 28, ho.c.H, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, ho.c.f59561z, 20, 20, ho.c.f59561z, ho.c.f59561z, ho.c.f59561z, ho.c.A, ho.c.f59561z, ho.c.A, ho.c.A, ho.c.A, ho.c.A, ho.c.A, ho.c.B, ho.c.A, ho.c.B, ho.c.B, ho.c.f59561z, ho.c.A, ho.c.B, ho.c.A, ho.c.A, ho.c.A, ho.c.A, ho.c.f59560y, ho.c.f59561z, ho.c.A, ho.c.f59561z, ho.c.A, ho.c.A, ho.c.B, ho.c.f59561z, ho.c.f59560y, 20, ho.c.f59561z, ho.c.f59561z, ho.c.A, ho.c.A, ho.c.f59560y, ho.c.A, ho.c.f59561z, ho.c.f59561z, ho.c.B, ho.c.f59560y, ho.c.f59561z, ho.c.A, ho.c.A, ho.c.f59560y, ho.c.f59560y, ho.c.f59561z, ho.c.f59560y, ho.c.A, ho.c.f59561z, ho.c.A, ho.c.A, 20, ho.c.f59561z, ho.c.f59561z, ho.c.f59561z, ho.c.A, ho.c.f59561z, ho.c.f59561z, ho.c.A, ho.c.D, ho.c.D, 20, 19, ho.c.f59561z, ho.c.A, ho.c.f59561z, ho.c.C, ho.c.D, ho.c.D, ho.c.D, ho.c.E, ho.c.E, ho.c.D, ho.c.B, ho.c.C, 19, ho.c.f59560y, ho.c.D, ho.c.E, ho.c.E, ho.c.D, ho.c.E, ho.c.B, ho.c.f59560y, ho.c.f59560y, ho.c.D, ho.c.D, 28, ho.c.E, ho.c.E, ho.c.E, 20, ho.c.B, 20, ho.c.f59560y, ho.c.f59561z, ho.c.f59560y, ho.c.f59560y, ho.c.A, ho.c.f59561z, ho.c.f59561z, ho.c.C, ho.c.C, ho.c.B, ho.c.B, ho.c.D, ho.c.A, ho.c.D, ho.c.E, ho.c.D, ho.c.D, ho.c.E, ho.c.E, ho.c.E, ho.c.E, ho.c.E, 28, ho.c.E, ho.c.E, ho.c.E, ho.c.E, ho.c.E, ho.c.D};
        f8210c = bArr;
        f8211d = new a();
        int length = bArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            f8208a.a(i11, f8209b[i11], f8210c[i11]);
        }
    }

    public final void a(int i11, int i12, int i13) {
        a aVar = new a(i11, i13);
        a aVar2 = f8211d;
        while (i13 > 8) {
            i13 -= 8;
            int i14 = (i12 >>> i13) & 255;
            a[] a11 = aVar2.a();
            g0.m(a11);
            a aVar3 = a11[i14];
            if (aVar3 == null) {
                aVar3 = new a();
                a11[i14] = aVar3;
            }
            aVar2 = aVar3;
        }
        int i15 = 8 - i13;
        int i16 = (i12 << i15) & 255;
        a[] a12 = aVar2.a();
        g0.m(a12);
        q.M1(a12, aVar, i16, (1 << i15) + i16);
    }

    public final void b(@k m source, long j11, @k l sink) {
        g0.p(source, "source");
        g0.p(sink, "sink");
        a aVar = f8211d;
        int i11 = 0;
        int i12 = 0;
        for (long j12 = 0; j12 < j11; j12++) {
            i11 = (i11 << 8) | u50.f.d(source.readByte(), 255);
            i12 += 8;
            while (i12 >= 8) {
                a[] a11 = aVar.a();
                g0.m(a11);
                aVar = a11[(i11 >>> (i12 - 8)) & 255];
                g0.m(aVar);
                if (aVar.a() == null) {
                    sink.writeByte(aVar.b());
                    i12 -= aVar.c();
                    aVar = f8211d;
                } else {
                    i12 -= 8;
                }
            }
        }
        while (i12 > 0) {
            a[] a12 = aVar.a();
            g0.m(a12);
            a aVar2 = a12[(i11 << (8 - i12)) & 255];
            g0.m(aVar2);
            if (aVar2.a() != null || aVar2.c() > i12) {
                return;
            }
            sink.writeByte(aVar2.b());
            i12 -= aVar2.c();
            aVar = f8211d;
        }
    }

    public final void c(@k ByteString source, @k l sink) throws IOException {
        g0.p(source, "source");
        g0.p(sink, "sink");
        int size = source.size();
        long j11 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            int d11 = u50.f.d(source.getByte(i12), 255);
            int i13 = f8209b[d11];
            byte b11 = f8210c[d11];
            j11 = (j11 << b11) | i13;
            i11 += b11;
            while (i11 >= 8) {
                i11 -= 8;
                sink.writeByte((int) (j11 >> i11));
            }
        }
        if (i11 > 0) {
            sink.writeByte((int) ((j11 << (8 - i11)) | (255 >>> i11)));
        }
    }

    public final int d(@k ByteString bytes) {
        g0.p(bytes, "bytes");
        long j11 = 0;
        for (int i11 = 0; i11 < bytes.size(); i11++) {
            j11 += f8210c[u50.f.d(bytes.getByte(i11), 255)];
        }
        return (int) ((j11 + 7) >> 3);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public final a[] f8212a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8213b;

        /* renamed from: c, reason: collision with root package name */
        public final int f8214c;

        public a() {
            this.f8212a = new a[256];
            this.f8213b = 0;
            this.f8214c = 0;
        }

        @m80.l
        public final a[] a() {
            return this.f8212a;
        }

        public final int b() {
            return this.f8213b;
        }

        public final int c() {
            return this.f8214c;
        }

        public a(int i11, int i12) {
            this.f8212a = null;
            this.f8213b = i11;
            int i13 = i12 & 7;
            this.f8214c = i13 == 0 ? 8 : i13;
        }
    }
}
