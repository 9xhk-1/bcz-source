package com.badlogic.gdx.graphics.g2d;

import a3.q;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.TextureData;
import com.badlogic.gdx.graphics.g2d.e;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.a;
import com.badlogic.gdx.utils.n;
import com.bumptech.glide.load.engine.GlideException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n2.v;
import w1.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class PixmapPacker implements q {

    /* renamed from: o, reason: collision with root package name */
    public static Pattern f11953o = Pattern.compile("(.+)_(\\d+)$");

    /* renamed from: a, reason: collision with root package name */
    public boolean f11954a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11955b;

    /* renamed from: c, reason: collision with root package name */
    public int f11956c;

    /* renamed from: d, reason: collision with root package name */
    public int f11957d;

    /* renamed from: e, reason: collision with root package name */
    public Pixmap.Format f11958e;

    /* renamed from: f, reason: collision with root package name */
    public int f11959f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11960g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11961h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11962i;

    /* renamed from: j, reason: collision with root package name */
    public int f11963j;

    /* renamed from: k, reason: collision with root package name */
    public com.badlogic.gdx.graphics.b f11964k;

    /* renamed from: l, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<c> f11965l;

    /* renamed from: m, reason: collision with root package name */
    public b f11966m;

    /* renamed from: n, reason: collision with root package name */
    public com.badlogic.gdx.graphics.b f11967n;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public Comparator<Pixmap> f11968a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.badlogic.gdx.graphics.g2d.PixmapPacker$a$a, reason: collision with other inner class name */
        public class C0188a implements Comparator<Pixmap> {
            public C0188a() {
            }

            @Override // java.util.Comparator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(Pixmap pixmap, Pixmap pixmap2) {
                return Math.max(pixmap.i1(), pixmap.f1()) - Math.max(pixmap2.i1(), pixmap2.f1());
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class b extends c {

            /* renamed from: f, reason: collision with root package name */
            public c f11970f;

            public b(PixmapPacker pixmapPacker) {
                super(pixmapPacker);
                c cVar = new c();
                this.f11970f = cVar;
                Rectangle rectangle = cVar.f11973c;
                int i11 = pixmapPacker.f11959f;
                rectangle.f12533x = i11;
                rectangle.f12534y = i11;
                rectangle.width = pixmapPacker.f11956c - (i11 * 2);
                rectangle.height = pixmapPacker.f11957d - (i11 * 2);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class c {

            /* renamed from: a, reason: collision with root package name */
            public c f11971a;

            /* renamed from: b, reason: collision with root package name */
            public c f11972b;

            /* renamed from: c, reason: collision with root package name */
            public final Rectangle f11973c = new Rectangle();

            /* renamed from: d, reason: collision with root package name */
            public boolean f11974d;
        }

        @Override // com.badlogic.gdx.graphics.g2d.PixmapPacker.b
        public c a(PixmapPacker pixmapPacker, String str, Rectangle rectangle) {
            b bVar;
            com.badlogic.gdx.utils.a<c> aVar = pixmapPacker.f11965l;
            if (aVar.f13179b == 0) {
                bVar = new b(pixmapPacker);
                pixmapPacker.f11965l.a(bVar);
            } else {
                bVar = (b) aVar.peek();
            }
            float f11 = pixmapPacker.f11959f;
            rectangle.width += f11;
            rectangle.height += f11;
            c c11 = c(bVar.f11970f, rectangle);
            if (c11 == null) {
                bVar = new b(pixmapPacker);
                pixmapPacker.f11965l.a(bVar);
                c11 = c(bVar.f11970f, rectangle);
            }
            c11.f11974d = true;
            Rectangle rectangle2 = c11.f11973c;
            rectangle.set(rectangle2.f12533x, rectangle2.f12534y, rectangle2.width - f11, rectangle2.height - f11);
            return bVar;
        }

        @Override // com.badlogic.gdx.graphics.g2d.PixmapPacker.b
        public void b(com.badlogic.gdx.utils.a<Pixmap> aVar) {
            if (this.f11968a == null) {
                this.f11968a = new C0188a();
            }
            aVar.sort(this.f11968a);
        }

        public final c c(c cVar, Rectangle rectangle) {
            c cVar2;
            boolean z11 = cVar.f11974d;
            if (!z11 && (cVar2 = cVar.f11971a) != null && cVar.f11972b != null) {
                c c11 = c(cVar2, rectangle);
                return c11 == null ? c(cVar.f11972b, rectangle) : c11;
            }
            if (z11) {
                return null;
            }
            Rectangle rectangle2 = cVar.f11973c;
            float f11 = rectangle2.width;
            float f12 = rectangle.width;
            if (f11 == f12 && rectangle2.height == rectangle.height) {
                return cVar;
            }
            if (f11 < f12 || rectangle2.height < rectangle.height) {
                return null;
            }
            cVar.f11971a = new c();
            c cVar3 = new c();
            cVar.f11972b = cVar3;
            Rectangle rectangle3 = cVar.f11973c;
            float f13 = rectangle3.width;
            float f14 = rectangle.width;
            int i11 = ((int) f13) - ((int) f14);
            float f15 = rectangle3.height;
            float f16 = rectangle.height;
            if (i11 > ((int) f15) - ((int) f16)) {
                Rectangle rectangle4 = cVar.f11971a.f11973c;
                rectangle4.f12533x = rectangle3.f12533x;
                rectangle4.f12534y = rectangle3.f12534y;
                rectangle4.width = f14;
                rectangle4.height = f15;
                Rectangle rectangle5 = cVar3.f11973c;
                float f17 = rectangle3.f12533x;
                float f18 = rectangle.width;
                rectangle5.f12533x = f17 + f18;
                rectangle5.f12534y = rectangle3.f12534y;
                rectangle5.width = rectangle3.width - f18;
                rectangle5.height = rectangle3.height;
            } else {
                Rectangle rectangle6 = cVar.f11971a.f11973c;
                rectangle6.f12533x = rectangle3.f12533x;
                rectangle6.f12534y = rectangle3.f12534y;
                rectangle6.width = f13;
                rectangle6.height = f16;
                Rectangle rectangle7 = cVar3.f11973c;
                rectangle7.f12533x = rectangle3.f12533x;
                float f19 = rectangle3.f12534y;
                float f21 = rectangle.height;
                rectangle7.f12534y = f19 + f21;
                rectangle7.width = rectangle3.width;
                rectangle7.height = rectangle3.height - f21;
            }
            return c(cVar.f11971a, rectangle);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        c a(PixmapPacker pixmapPacker, String str, Rectangle rectangle);

        void b(com.badlogic.gdx.utils.a<Pixmap> aVar);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {

        /* renamed from: b, reason: collision with root package name */
        public Pixmap f11976b;

        /* renamed from: c, reason: collision with root package name */
        public Texture f11977c;

        /* renamed from: e, reason: collision with root package name */
        public boolean f11979e;

        /* renamed from: a, reason: collision with root package name */
        public n<String, PixmapPackerRectangle> f11975a = new n<>();

        /* renamed from: d, reason: collision with root package name */
        public final com.badlogic.gdx.utils.a<String> f11978d = new com.badlogic.gdx.utils.a<>();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends Texture {
            public a(TextureData textureData) {
                super(textureData);
            }

            @Override // com.badlogic.gdx.graphics.Texture, com.badlogic.gdx.graphics.j, a3.q
            public void dispose() {
                super.dispose();
                c.this.f11976b.dispose();
            }
        }

        public c(PixmapPacker pixmapPacker) {
            Pixmap pixmap = new Pixmap(pixmapPacker.f11956c, pixmapPacker.f11957d, pixmapPacker.f11958e);
            this.f11976b = pixmap;
            pixmap.k1(Pixmap.Blending.None);
            this.f11976b.h(pixmapPacker.V0());
            this.f11976b.w0();
        }

        public Pixmap a() {
            return this.f11976b;
        }

        public n<String, PixmapPackerRectangle> b() {
            return this.f11975a;
        }

        public Texture c() {
            return this.f11977c;
        }

        public boolean d(Texture.TextureFilter textureFilter, Texture.TextureFilter textureFilter2, boolean z11) {
            Texture texture = this.f11977c;
            if (texture == null) {
                Pixmap pixmap = this.f11976b;
                a aVar = new a(new v(pixmap, pixmap.b1(), z11, false, true));
                this.f11977c = aVar;
                aVar.a1(textureFilter, textureFilter2);
            } else {
                if (!this.f11979e) {
                    return false;
                }
                texture.r1(texture.p1());
            }
            this.f11979e = false;
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d implements b {

        /* renamed from: a, reason: collision with root package name */
        public Comparator<Pixmap> f11981a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Comparator<Pixmap> {
            public a() {
            }

            @Override // java.util.Comparator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(Pixmap pixmap, Pixmap pixmap2) {
                return pixmap.f1() - pixmap2.f1();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class b extends c {

            /* renamed from: f, reason: collision with root package name */
            public com.badlogic.gdx.utils.a<a> f11983f;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static class a {

                /* renamed from: a, reason: collision with root package name */
                public int f11984a;

                /* renamed from: b, reason: collision with root package name */
                public int f11985b;

                /* renamed from: c, reason: collision with root package name */
                public int f11986c;
            }

            public b(PixmapPacker pixmapPacker) {
                super(pixmapPacker);
                this.f11983f = new com.badlogic.gdx.utils.a<>();
            }
        }

        @Override // com.badlogic.gdx.graphics.g2d.PixmapPacker.b
        public c a(PixmapPacker pixmapPacker, String str, Rectangle rectangle) {
            int i11;
            int i12 = pixmapPacker.f11959f;
            int i13 = i12 * 2;
            int i14 = pixmapPacker.f11956c - i13;
            int i15 = pixmapPacker.f11957d - i13;
            int i16 = ((int) rectangle.width) + i12;
            int i17 = ((int) rectangle.height) + i12;
            int i18 = pixmapPacker.f11965l.f13179b;
            for (int i19 = 0; i19 < i18; i19++) {
                b bVar = (b) pixmapPacker.f11965l.get(i19);
                int i21 = bVar.f11983f.f13179b - 1;
                b.a aVar = null;
                for (int i22 = 0; i22 < i21; i22++) {
                    b.a aVar2 = bVar.f11983f.get(i22);
                    if (aVar2.f11984a + i16 < i14 && aVar2.f11985b + i17 < i15 && i17 <= (i11 = aVar2.f11986c) && (aVar == null || i11 < aVar.f11986c)) {
                        aVar = aVar2;
                    }
                }
                if (aVar == null) {
                    b.a peek = bVar.f11983f.peek();
                    int i23 = peek.f11985b;
                    if (i23 + i17 >= i15) {
                        continue;
                    } else if (peek.f11984a + i16 < i14) {
                        peek.f11986c = Math.max(peek.f11986c, i17);
                        aVar = peek;
                    } else if (i23 + peek.f11986c + i17 < i15) {
                        aVar = new b.a();
                        aVar.f11985b = peek.f11985b + peek.f11986c;
                        aVar.f11986c = i17;
                        bVar.f11983f.a(aVar);
                    }
                }
                if (aVar != null) {
                    int i24 = aVar.f11984a;
                    rectangle.f12533x = i24;
                    rectangle.f12534y = aVar.f11985b;
                    aVar.f11984a = i24 + i16;
                    return bVar;
                }
            }
            b bVar2 = new b(pixmapPacker);
            pixmapPacker.f11965l.a(bVar2);
            b.a aVar3 = new b.a();
            aVar3.f11984a = i16 + i12;
            aVar3.f11985b = i12;
            aVar3.f11986c = i17;
            bVar2.f11983f.a(aVar3);
            float f11 = i12;
            rectangle.f12533x = f11;
            rectangle.f12534y = f11;
            return bVar2;
        }

        @Override // com.badlogic.gdx.graphics.g2d.PixmapPacker.b
        public void b(com.badlogic.gdx.utils.a<Pixmap> aVar) {
            if (this.f11981a == null) {
                this.f11981a = new a();
            }
            aVar.sort(this.f11981a);
        }
    }

    public PixmapPacker(int i11, int i12, Pixmap.Format format, int i13, boolean z11) {
        this(i11, i12, format, i13, z11, false, false, new a());
    }

    public synchronized Rectangle C0(String str) {
        a.b<c> it = this.f11965l.iterator();
        while (it.hasNext()) {
            PixmapPackerRectangle k11 = it.next().f11975a.k(str);
            if (k11 != null) {
                return k11;
            }
        }
        return null;
    }

    public int D() {
        return this.f11959f;
    }

    public final int[] I(Pixmap pixmap, int[] iArr) {
        int i12;
        int f12 = pixmap.f1() - 1;
        int i13 = pixmap.i1() - 1;
        int J0 = J0(pixmap, 1, f12, true, true);
        int J02 = J0(pixmap, i13, 1, true, false);
        int J03 = J0 != 0 ? J0(pixmap, J0 + 1, f12, false, true) : 0;
        int J04 = J02 != 0 ? J0(pixmap, i13, J02 + 1, false, false) : 0;
        J0(pixmap, J03 + 1, f12, true, true);
        J0(pixmap, i13, J04 + 1, true, false);
        if (J0 == 0 && J03 == 0 && J02 == 0 && J04 == 0) {
            return null;
        }
        int i11 = -1;
        if (J0 == 0 && J03 == 0) {
            J0 = -1;
            i12 = -1;
        } else if (J0 > 0) {
            J0--;
            i12 = (pixmap.i1() - 2) - (J03 - 1);
        } else {
            i12 = pixmap.i1() - 2;
        }
        if (J02 == 0 && J04 == 0) {
            J02 = -1;
        } else if (J02 > 0) {
            J02--;
            i11 = (pixmap.f1() - 2) - (J04 - 1);
        } else {
            i11 = pixmap.f1() - 2;
        }
        int[] iArr2 = {J0, i12, J02, i11};
        if (iArr == null || !Arrays.equals(iArr2, iArr)) {
            return iArr2;
        }
        return null;
    }

    public final int J0(Pixmap pixmap, int i11, int i12, boolean z11, boolean z12) {
        int i13 = z12 ? pixmap.i1() : pixmap.f1();
        int i14 = z11 ? 255 : 0;
        for (int i15 = z12 ? i11 : i12; i15 != i13; i15++) {
            if (z12) {
                i11 = i15;
            } else {
                i12 = i15;
            }
            this.f11967n.G(pixmap.g1(i11, i12));
            com.badlogic.gdx.graphics.b bVar = this.f11967n;
            int[] iArr = {(int) (bVar.f11544a * 255.0f), (int) (bVar.f11545b * 255.0f), (int) (bVar.f11546c * 255.0f), (int) (bVar.f11547d * 255.0f)};
            int i16 = iArr[3];
            if (i16 == i14) {
                return i15;
            }
            if (!z11 && (iArr[0] != 0 || iArr[1] != 0 || iArr[2] != 0 || i16 != 255)) {
                System.out.println(i11 + GlideException.a.f28776d + i12 + " " + iArr + " ");
            }
        }
        return 0;
    }

    public final int[] Q0(Pixmap pixmap) {
        int i12;
        int f12;
        int i11;
        int J0 = J0(pixmap, 1, 0, true, true);
        int J02 = J0(pixmap, J0, 0, false, true);
        int J03 = J0(pixmap, 0, 1, true, false);
        int J04 = J0(pixmap, 0, J03, false, false);
        J0(pixmap, J02 + 1, 0, true, true);
        J0(pixmap, 0, J04 + 1, true, false);
        if (J0 == 0 && J02 == 0 && J03 == 0 && J04 == 0) {
            return null;
        }
        if (J0 != 0) {
            J0--;
            i12 = (pixmap.i1() - 2) - (J02 - 1);
        } else {
            i12 = pixmap.i1() - 2;
        }
        if (J03 != 0) {
            i11 = J03 - 1;
            f12 = (pixmap.f1() - 2) - (J04 - 1);
        } else {
            f12 = pixmap.f1() - 2;
            i11 = J03;
        }
        return new int[]{J0, i12, i11, f12};
    }

    public synchronized c R(String str) {
        a.b<c> it = this.f11965l.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.f11975a.k(str) != null) {
                return next;
            }
        }
        return null;
    }

    public com.badlogic.gdx.graphics.b V0() {
        return this.f11964k;
    }

    public Pixmap.Format X() {
        return this.f11958e;
    }

    public int Z() {
        return this.f11957d;
    }

    public synchronized PixmapPackerRectangle a1(Pixmap pixmap) {
        return b1(null, pixmap);
    }

    public synchronized e b(Texture.TextureFilter textureFilter, Texture.TextureFilter textureFilter2, boolean z11) {
        e eVar;
        eVar = new e();
        l1(eVar, textureFilter, textureFilter2, z11);
        return eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x028f, code lost:
    
        throw new com.badlogic.gdx.utils.GdxRuntimeException("Page size too small for pixmap.");
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0189 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x0007, B:11:0x0010, B:14:0x0017, B:15:0x002d, B:18:0x0035, B:20:0x003d, B:22:0x0169, B:24:0x0174, B:27:0x0181, B:29:0x0189, B:30:0x0193, B:32:0x01a3, B:34:0x01a7, B:36:0x01ab, B:38:0x01af, B:39:0x01d4, B:41:0x01dd, B:43:0x027f, B:44:0x0282, B:47:0x01d2, B:49:0x0288, B:50:0x028f, B:51:0x0290, B:52:0x02a6, B:53:0x0094, B:55:0x0098, B:58:0x009d, B:59:0x00ac, B:62:0x00bf, B:65:0x00c6, B:67:0x00cc, B:69:0x00d7, B:118:0x00da, B:72:0x00df, B:73:0x00e3, B:76:0x00e8, B:78:0x00ee, B:80:0x00f9, B:115:0x00fc, B:84:0x0102, B:87:0x010b, B:91:0x0114, B:93:0x011f, B:111:0x0122, B:96:0x0127, B:97:0x012b, B:101:0x0132, B:103:0x013d, B:108:0x0140, B:106:0x0144), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01dd A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x0007, B:11:0x0010, B:14:0x0017, B:15:0x002d, B:18:0x0035, B:20:0x003d, B:22:0x0169, B:24:0x0174, B:27:0x0181, B:29:0x0189, B:30:0x0193, B:32:0x01a3, B:34:0x01a7, B:36:0x01ab, B:38:0x01af, B:39:0x01d4, B:41:0x01dd, B:43:0x027f, B:44:0x0282, B:47:0x01d2, B:49:0x0288, B:50:0x028f, B:51:0x0290, B:52:0x02a6, B:53:0x0094, B:55:0x0098, B:58:0x009d, B:59:0x00ac, B:62:0x00bf, B:65:0x00c6, B:67:0x00cc, B:69:0x00d7, B:118:0x00da, B:72:0x00df, B:73:0x00e3, B:76:0x00e8, B:78:0x00ee, B:80:0x00f9, B:115:0x00fc, B:84:0x0102, B:87:0x010b, B:91:0x0114, B:93:0x011f, B:111:0x0122, B:96:0x0127, B:97:0x012b, B:101:0x0132, B:103:0x013d, B:108:0x0140, B:106:0x0144), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x027f A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x0007, B:11:0x0010, B:14:0x0017, B:15:0x002d, B:18:0x0035, B:20:0x003d, B:22:0x0169, B:24:0x0174, B:27:0x0181, B:29:0x0189, B:30:0x0193, B:32:0x01a3, B:34:0x01a7, B:36:0x01ab, B:38:0x01af, B:39:0x01d4, B:41:0x01dd, B:43:0x027f, B:44:0x0282, B:47:0x01d2, B:49:0x0288, B:50:0x028f, B:51:0x0290, B:52:0x02a6, B:53:0x0094, B:55:0x0098, B:58:0x009d, B:59:0x00ac, B:62:0x00bf, B:65:0x00c6, B:67:0x00cc, B:69:0x00d7, B:118:0x00da, B:72:0x00df, B:73:0x00e3, B:76:0x00e8, B:78:0x00ee, B:80:0x00f9, B:115:0x00fc, B:84:0x0102, B:87:0x010b, B:91:0x0114, B:93:0x011f, B:111:0x0122, B:96:0x0127, B:97:0x012b, B:101:0x0132, B:103:0x013d, B:108:0x0140, B:106:0x0144), top: B:3:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized com.badlogic.gdx.graphics.g2d.PixmapPacker.PixmapPackerRectangle b1(java.lang.String r27, com.badlogic.gdx.graphics.Pixmap r28) {
        /*
            Method dump skipped, instructions count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.graphics.g2d.PixmapPacker.b1(java.lang.String, com.badlogic.gdx.graphics.Pixmap):com.badlogic.gdx.graphics.g2d.PixmapPacker$PixmapPackerRectangle");
    }

    public void c1(boolean z11) {
        this.f11960g = z11;
    }

    public void d1(boolean z11) {
        this.f11954a = z11;
    }

    @Override // a3.q
    public synchronized void dispose() {
        try {
            a.b<c> it = this.f11965l.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (next.f11977c == null) {
                    next.f11976b.dispose();
                }
            }
            this.f11955b = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void e1(int i11) {
        this.f11959f = i11;
    }

    public void f1(Pixmap.Format format) {
        this.f11958e = format;
    }

    public void g1(int i11) {
        this.f11957d = i11;
    }

    public void h1(int i11) {
        this.f11956c = i11;
    }

    public synchronized int i0(String str) {
        int i11 = 0;
        while (true) {
            com.badlogic.gdx.utils.a<c> aVar = this.f11965l;
            if (i11 >= aVar.f13179b) {
                return -1;
            }
            if (aVar.get(i11).f11975a.k(str) != null) {
                return i11;
            }
            i11++;
        }
    }

    public void i1(com.badlogic.gdx.graphics.b bVar) {
        this.f11964k.H(bVar);
    }

    public void j1(com.badlogic.gdx.utils.a<Pixmap> aVar) {
        this.f11966m.b(aVar);
    }

    public synchronized void k1(Texture.TextureFilter textureFilter, Texture.TextureFilter textureFilter2, boolean z11) {
        a.b<c> it = this.f11965l.iterator();
        while (it.hasNext()) {
            it.next().d(textureFilter, textureFilter2, z11);
        }
    }

    public synchronized void l1(e eVar, Texture.TextureFilter textureFilter, Texture.TextureFilter textureFilter2, boolean z11) {
        m1(eVar, textureFilter, textureFilter2, z11, true);
    }

    public synchronized void m1(e eVar, Texture.TextureFilter textureFilter, Texture.TextureFilter textureFilter2, boolean z11, boolean z12) {
        int i11;
        try {
            k1(textureFilter, textureFilter2, z11);
            a.b<c> it = this.f11965l.iterator();
            while (it.hasNext()) {
                c next = it.next();
                com.badlogic.gdx.utils.a<String> aVar = next.f11978d;
                if (aVar.f13179b > 0) {
                    a.b<String> it2 = aVar.iterator();
                    while (it2.hasNext()) {
                        String next2 = it2.next();
                        PixmapPackerRectangle k11 = next.f11975a.k(next2);
                        e.a aVar2 = new e.a(next.f11977c, (int) k11.f12533x, (int) k11.f12534y, (int) k11.width, (int) k11.height);
                        int[] iArr = k11.splits;
                        if (iArr != null) {
                            aVar2.f12081r = new String[]{"split", "pad"};
                            aVar2.f12082s = new int[][]{iArr, k11.pads};
                        }
                        if (z12) {
                            Matcher matcher = f11953o.matcher(next2);
                            if (matcher.matches()) {
                                next2 = matcher.group(1);
                                i11 = Integer.parseInt(matcher.group(2));
                                aVar2.f12072i = next2;
                                aVar2.f12071h = i11;
                                aVar2.f12073j = k11.offsetX;
                                int i12 = k11.originalHeight;
                                aVar2.f12074k = (int) ((i12 - k11.height) - k11.offsetY);
                                aVar2.f12077n = k11.originalWidth;
                                aVar2.f12078o = i12;
                                eVar.w0().a(aVar2);
                            }
                        }
                        i11 = -1;
                        aVar2.f12072i = next2;
                        aVar2.f12071h = i11;
                        aVar2.f12073j = k11.offsetX;
                        int i122 = k11.originalHeight;
                        aVar2.f12074k = (int) ((i122 - k11.height) - k11.offsetY);
                        aVar2.f12077n = k11.originalWidth;
                        aVar2.f12078o = i122;
                        eVar.w0().a(aVar2);
                    }
                    next.f11978d.clear();
                    eVar.C0().add(next.f11977c);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public int n0() {
        return this.f11956c;
    }

    public synchronized void n1(com.badlogic.gdx.utils.a<o> aVar, Texture.TextureFilter textureFilter, Texture.TextureFilter textureFilter2, boolean z11) {
        k1(textureFilter, textureFilter2, z11);
        while (true) {
            int i11 = aVar.f13179b;
            com.badlogic.gdx.utils.a<c> aVar2 = this.f11965l;
            if (i11 < aVar2.f13179b) {
                aVar.a(new o(aVar2.get(i11).f11977c));
            }
        }
    }

    public boolean o() {
        return this.f11960g;
    }

    public com.badlogic.gdx.utils.a<c> w0() {
        return this.f11965l;
    }

    public boolean z() {
        return this.f11954a;
    }

    public PixmapPacker(int i11, int i12, Pixmap.Format format, int i13, boolean z11, b bVar) {
        this(i11, i12, format, i13, z11, false, false, bVar);
    }

    public PixmapPacker(int i11, int i12, Pixmap.Format format, int i13, boolean z11, boolean z12, boolean z13, b bVar) {
        this.f11964k = new com.badlogic.gdx.graphics.b(0.0f, 0.0f, 0.0f, 0.0f);
        this.f11965l = new com.badlogic.gdx.utils.a<>();
        this.f11967n = new com.badlogic.gdx.graphics.b();
        this.f11956c = i11;
        this.f11957d = i12;
        this.f11958e = format;
        this.f11959f = i13;
        this.f11960g = z11;
        this.f11961h = z12;
        this.f11962i = z13;
        this.f11966m = bVar;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PixmapPackerRectangle extends Rectangle {
        public int offsetX;
        public int offsetY;
        public int originalHeight;
        public int originalWidth;
        public int[] pads;
        public c page;
        public int[] splits;

        public PixmapPackerRectangle(int i11, int i12, int i13, int i14) {
            super(i11, i12, i13, i14);
            this.offsetX = 0;
            this.offsetY = 0;
            this.originalWidth = i13;
            this.originalHeight = i14;
        }

        public PixmapPackerRectangle(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            super(i11, i12, i13, i14);
            this.offsetX = i15;
            this.offsetY = i16;
            this.originalWidth = i17;
            this.originalHeight = i18;
        }
    }
}
