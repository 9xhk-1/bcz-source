package com.badlogic.gdx.graphics.g2d;

import a3.d0;
import a3.q;
import a3.x0;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.a;
import com.badlogic.gdx.utils.m;
import com.tencent.ijk.media.player.IjkMediaMeta;
import ix.g;
import java.io.BufferedReader;
import java.util.Comparator;
import w1.l;
import w1.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e implements q {

    /* renamed from: a, reason: collision with root package name */
    public final m<Texture> f12069a;

    /* renamed from: b, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<a> f12070b;

    public e() {
        this.f12069a = new m<>(4);
        this.f12070b = new com.badlogic.gdx.utils.a<>();
    }

    public m<Texture> C0() {
        return this.f12069a;
    }

    @d0
    public l D(String str) {
        int i11 = this.f12070b.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f12070b.get(i12).f12072i.equals(str)) {
                return Q0(this.f12070b.get(i12));
            }
        }
        return null;
    }

    @d0
    public l I(String str, int i11) {
        int i12 = this.f12070b.f13179b;
        for (int i13 = 0; i13 < i12; i13++) {
            a aVar = this.f12070b.get(i13);
            if (aVar.f12071h == i11 && aVar.f12072i.equals(str)) {
                return Q0(this.f12070b.get(i13));
            }
        }
        return null;
    }

    public void J0(c cVar) {
        this.f12069a.k(cVar.f12086a.f13179b);
        a.b<c.p> it = cVar.f12086a.iterator();
        while (it.hasNext()) {
            c.p next = it.next();
            if (next.f12118c == null) {
                next.f12118c = new Texture(next.f12117b, next.f12122g, next.f12121f);
            }
            next.f12118c.a1(next.f12123h, next.f12124i);
            next.f12118c.b1(next.f12125j, next.f12126k);
            this.f12069a.add(next.f12118c);
        }
        this.f12070b.o(cVar.f12087b.f13179b);
        a.b<c.q> it2 = cVar.f12087b.iterator();
        while (it2.hasNext()) {
            c.q next2 = it2.next();
            Texture texture = next2.f12128a.f12118c;
            int i11 = next2.f12130c;
            int i12 = next2.f12131d;
            boolean z11 = next2.f12139l;
            a aVar = new a(texture, i11, i12, z11 ? next2.f12133f : next2.f12132e, z11 ? next2.f12132e : next2.f12133f);
            aVar.f12071h = next2.f12140m;
            aVar.f12072i = next2.f12129b;
            aVar.f12073j = next2.f12134g;
            aVar.f12074k = next2.f12135h;
            aVar.f12078o = next2.f12137j;
            aVar.f12077n = next2.f12136i;
            aVar.f12079p = next2.f12139l;
            aVar.f12080q = next2.f12138k;
            aVar.f12081r = next2.f12141n;
            aVar.f12082s = next2.f12142o;
            if (next2.f12143p) {
                aVar.a(false, true);
            }
            this.f12070b.a(aVar);
        }
    }

    public final l Q0(a aVar) {
        if (aVar.f12075l != aVar.f12077n || aVar.f12076m != aVar.f12078o) {
            return new b(aVar);
        }
        if (!aVar.f12079p) {
            return new l(aVar);
        }
        l lVar = new l(aVar);
        lVar.X(0.0f, 0.0f, aVar.b(), aVar.c());
        lVar.T(true);
        return lVar;
    }

    public com.badlogic.gdx.utils.a<l> R() {
        com.badlogic.gdx.utils.a<l> aVar = new com.badlogic.gdx.utils.a<>(true, this.f12070b.f13179b, l.class);
        int i11 = this.f12070b.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            aVar.a(Q0(this.f12070b.get(i12)));
        }
        return aVar;
    }

    public com.badlogic.gdx.utils.a<l> X(String str) {
        com.badlogic.gdx.utils.a<l> aVar = new com.badlogic.gdx.utils.a<>(l.class);
        int i11 = this.f12070b.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            a aVar2 = this.f12070b.get(i12);
            if (aVar2.f12072i.equals(str)) {
                aVar.a(Q0(aVar2));
            }
        }
        return aVar;
    }

    @d0
    public a Z(String str) {
        int i11 = this.f12070b.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f12070b.get(i12).f12072i.equals(str)) {
                return this.f12070b.get(i12);
            }
        }
        return null;
    }

    public a b(String str, Texture texture, int i11, int i12, int i13, int i14) {
        this.f12069a.add(texture);
        a aVar = new a(texture, i11, i12, i13, i14);
        aVar.f12072i = str;
        this.f12070b.a(aVar);
        return aVar;
    }

    @Override // a3.q
    public void dispose() {
        m.a<Texture> it = this.f12069a.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        this.f12069a.j(0);
    }

    @d0
    public a i0(String str, int i11) {
        int i12 = this.f12070b.f13179b;
        for (int i13 = 0; i13 < i12; i13++) {
            a aVar = this.f12070b.get(i13);
            if (aVar.f12072i.equals(str) && aVar.f12071h == i11) {
                return aVar;
            }
        }
        return null;
    }

    public com.badlogic.gdx.utils.a<a> n0(String str) {
        com.badlogic.gdx.utils.a<a> aVar = new com.badlogic.gdx.utils.a<>(a.class);
        int i11 = this.f12070b.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            a aVar2 = this.f12070b.get(i12);
            if (aVar2.f12072i.equals(str)) {
                aVar.a(new a(aVar2));
            }
        }
        return aVar;
    }

    public a o(String str, o oVar) {
        this.f12069a.add(oVar.f94611a);
        a aVar = new a(oVar);
        aVar.f12072i = str;
        this.f12070b.a(aVar);
        return aVar;
    }

    public com.badlogic.gdx.utils.a<a> w0() {
        return this.f12070b;
    }

    @d0
    public w1.c z(String str) {
        int i11 = this.f12070b.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            a aVar = this.f12070b.get(i12);
            if (aVar.f12072i.equals(str)) {
                int[] D = aVar.D("split");
                if (D == null) {
                    throw new IllegalArgumentException("Region does not have ninepatch splits: " + str);
                }
                w1.c cVar = new w1.c(aVar, D[0], D[1], D[2], D[3]);
                if (aVar.D("pad") != null) {
                    cVar.E(r0[0], r0[1], r0[2], r0[3]);
                }
                return cVar;
            }
        }
        return null;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final com.badlogic.gdx.utils.a<p> f12086a = new com.badlogic.gdx.utils.a<>();

        /* renamed from: b, reason: collision with root package name */
        public final com.badlogic.gdx.utils.a<q> f12087b = new com.badlogic.gdx.utils.a<>();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements o<q> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String[] f12088a;

            public a(String[] strArr) {
                this.f12088a = strArr;
            }

            @Override // com.badlogic.gdx.graphics.g2d.e.c.o
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(q qVar) {
                qVar.f12136i = Integer.parseInt(this.f12088a[1]);
                qVar.f12137j = Integer.parseInt(this.f12088a[2]);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b implements o<q> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String[] f12090a;

            public b(String[] strArr) {
                this.f12090a = strArr;
            }

            @Override // com.badlogic.gdx.graphics.g2d.e.c.o
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(q qVar) {
                qVar.f12134g = Integer.parseInt(this.f12090a[1]);
                qVar.f12135h = Integer.parseInt(this.f12090a[2]);
                qVar.f12136i = Integer.parseInt(this.f12090a[3]);
                qVar.f12137j = Integer.parseInt(this.f12090a[4]);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.badlogic.gdx.graphics.g2d.e$c$c, reason: collision with other inner class name */
        public class C0190c implements o<q> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String[] f12092a;

            public C0190c(String[] strArr) {
                this.f12092a = strArr;
            }

            @Override // com.badlogic.gdx.graphics.g2d.e.c.o
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(q qVar) {
                String str = this.f12092a[1];
                if (str.equals(n6.m.f74525c)) {
                    qVar.f12138k = 90;
                } else if (!str.equals("false")) {
                    qVar.f12138k = Integer.parseInt(str);
                }
                qVar.f12139l = qVar.f12138k == 90;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class d implements o<q> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String[] f12094a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean[] f12095b;

            public d(String[] strArr, boolean[] zArr) {
                this.f12094a = strArr;
                this.f12095b = zArr;
            }

            @Override // com.badlogic.gdx.graphics.g2d.e.c.o
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(q qVar) {
                int parseInt = Integer.parseInt(this.f12094a[1]);
                qVar.f12140m = parseInt;
                if (parseInt != -1) {
                    this.f12095b[0] = true;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.badlogic.gdx.graphics.g2d.e$c$e, reason: collision with other inner class name */
        public class C0191e implements Comparator<q> {
            public C0191e() {
            }

            @Override // java.util.Comparator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(q qVar, q qVar2) {
                int i11 = qVar.f12140m;
                if (i11 == -1) {
                    i11 = Integer.MAX_VALUE;
                }
                int i12 = qVar2.f12140m;
                return i11 - (i12 != -1 ? i12 : Integer.MAX_VALUE);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class f implements o<p> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String[] f12098a;

            public f(String[] strArr) {
                this.f12098a = strArr;
            }

            @Override // com.badlogic.gdx.graphics.g2d.e.c.o
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(p pVar) {
                pVar.f12119d = Integer.parseInt(this.f12098a[1]);
                pVar.f12120e = Integer.parseInt(this.f12098a[2]);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class g implements o<p> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String[] f12100a;

            public g(String[] strArr) {
                this.f12100a = strArr;
            }

            @Override // com.badlogic.gdx.graphics.g2d.e.c.o
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(p pVar) {
                pVar.f12122g = Pixmap.Format.valueOf(this.f12100a[1]);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class h implements o<p> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String[] f12102a;

            public h(String[] strArr) {
                this.f12102a = strArr;
            }

            @Override // com.badlogic.gdx.graphics.g2d.e.c.o
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(p pVar) {
                pVar.f12123h = Texture.TextureFilter.valueOf(this.f12102a[1]);
                pVar.f12124i = Texture.TextureFilter.valueOf(this.f12102a[2]);
                pVar.f12121f = pVar.f12123h.isMipMap();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class i implements o<p> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String[] f12104a;

            public i(String[] strArr) {
                this.f12104a = strArr;
            }

            @Override // com.badlogic.gdx.graphics.g2d.e.c.o
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(p pVar) {
                if (this.f12104a[1].indexOf(120) != -1) {
                    pVar.f12125j = Texture.TextureWrap.Repeat;
                }
                if (this.f12104a[1].indexOf(121) != -1) {
                    pVar.f12126k = Texture.TextureWrap.Repeat;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class j implements o<p> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String[] f12106a;

            public j(String[] strArr) {
                this.f12106a = strArr;
            }

            @Override // com.badlogic.gdx.graphics.g2d.e.c.o
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(p pVar) {
                pVar.f12127l = this.f12106a[1].equals(n6.m.f74525c);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class k implements o<q> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String[] f12108a;

            public k(String[] strArr) {
                this.f12108a = strArr;
            }

            @Override // com.badlogic.gdx.graphics.g2d.e.c.o
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(q qVar) {
                qVar.f12130c = Integer.parseInt(this.f12108a[1]);
                qVar.f12131d = Integer.parseInt(this.f12108a[2]);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class l implements o<q> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String[] f12110a;

            public l(String[] strArr) {
                this.f12110a = strArr;
            }

            @Override // com.badlogic.gdx.graphics.g2d.e.c.o
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(q qVar) {
                qVar.f12132e = Integer.parseInt(this.f12110a[1]);
                qVar.f12133f = Integer.parseInt(this.f12110a[2]);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class m implements o<q> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String[] f12112a;

            public m(String[] strArr) {
                this.f12112a = strArr;
            }

            @Override // com.badlogic.gdx.graphics.g2d.e.c.o
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(q qVar) {
                qVar.f12130c = Integer.parseInt(this.f12112a[1]);
                qVar.f12131d = Integer.parseInt(this.f12112a[2]);
                qVar.f12132e = Integer.parseInt(this.f12112a[3]);
                qVar.f12133f = Integer.parseInt(this.f12112a[4]);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class n implements o<q> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String[] f12114a;

            public n(String[] strArr) {
                this.f12114a = strArr;
            }

            @Override // com.badlogic.gdx.graphics.g2d.e.c.o
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(q qVar) {
                qVar.f12134g = Integer.parseInt(this.f12114a[1]);
                qVar.f12135h = Integer.parseInt(this.f12114a[2]);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public interface o<T> {
            void a(T t11);
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class p {

            /* renamed from: a, reason: collision with root package name */
            public String f12116a;

            /* renamed from: b, reason: collision with root package name */
            @d0
            public v1.a f12117b;

            /* renamed from: c, reason: collision with root package name */
            @d0
            public Texture f12118c;

            /* renamed from: d, reason: collision with root package name */
            public float f12119d;

            /* renamed from: e, reason: collision with root package name */
            public float f12120e;

            /* renamed from: f, reason: collision with root package name */
            public boolean f12121f;

            /* renamed from: g, reason: collision with root package name */
            public Pixmap.Format f12122g = Pixmap.Format.RGBA8888;

            /* renamed from: h, reason: collision with root package name */
            public Texture.TextureFilter f12123h;

            /* renamed from: i, reason: collision with root package name */
            public Texture.TextureFilter f12124i;

            /* renamed from: j, reason: collision with root package name */
            public Texture.TextureWrap f12125j;

            /* renamed from: k, reason: collision with root package name */
            public Texture.TextureWrap f12126k;

            /* renamed from: l, reason: collision with root package name */
            public boolean f12127l;

            public p() {
                Texture.TextureFilter textureFilter = Texture.TextureFilter.Nearest;
                this.f12123h = textureFilter;
                this.f12124i = textureFilter;
                Texture.TextureWrap textureWrap = Texture.TextureWrap.ClampToEdge;
                this.f12125j = textureWrap;
                this.f12126k = textureWrap;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class q {

            /* renamed from: a, reason: collision with root package name */
            public p f12128a;

            /* renamed from: b, reason: collision with root package name */
            public String f12129b;

            /* renamed from: c, reason: collision with root package name */
            public int f12130c;

            /* renamed from: d, reason: collision with root package name */
            public int f12131d;

            /* renamed from: e, reason: collision with root package name */
            public int f12132e;

            /* renamed from: f, reason: collision with root package name */
            public int f12133f;

            /* renamed from: g, reason: collision with root package name */
            public float f12134g;

            /* renamed from: h, reason: collision with root package name */
            public float f12135h;

            /* renamed from: i, reason: collision with root package name */
            public int f12136i;

            /* renamed from: j, reason: collision with root package name */
            public int f12137j;

            /* renamed from: k, reason: collision with root package name */
            public int f12138k;

            /* renamed from: l, reason: collision with root package name */
            public boolean f12139l;

            /* renamed from: m, reason: collision with root package name */
            public int f12140m = -1;

            /* renamed from: n, reason: collision with root package name */
            @d0
            public String[] f12141n;

            /* renamed from: o, reason: collision with root package name */
            @d0
            public int[][] f12142o;

            /* renamed from: p, reason: collision with root package name */
            public boolean f12143p;

            @d0
            public int[] a(String str) {
                String[] strArr = this.f12141n;
                if (strArr == null) {
                    return null;
                }
                int length = strArr.length;
                for (int i11 = 0; i11 < length; i11++) {
                    if (str.equals(this.f12141n[i11])) {
                        return this.f12142o[i11];
                    }
                }
                return null;
            }
        }

        public c() {
        }

        public static int d(String[] strArr, @d0 String str) {
            int indexOf;
            if (str == null) {
                return 0;
            }
            String trim = str.trim();
            if (trim.length() == 0 || (indexOf = trim.indexOf(58)) == -1) {
                return 0;
            }
            strArr[0] = trim.substring(0, indexOf).trim();
            int i11 = 1;
            int i12 = indexOf + 1;
            while (true) {
                int indexOf2 = trim.indexOf(44, i12);
                if (indexOf2 == -1) {
                    strArr[i11] = trim.substring(i12).trim();
                    return i11;
                }
                strArr[i11] = trim.substring(i12, indexOf2).trim();
                i12 = indexOf2 + 1;
                if (i11 == 4) {
                    return 4;
                }
                i11++;
            }
        }

        public com.badlogic.gdx.utils.a<p> a() {
            return this.f12086a;
        }

        public com.badlogic.gdx.utils.a<q> b() {
            return this.f12087b;
        }

        public void c(v1.a aVar, v1.a aVar2, boolean z11) {
            String str;
            String str2;
            String[] strArr = new String[5];
            com.badlogic.gdx.utils.l lVar = new com.badlogic.gdx.utils.l(15, 0.99f);
            lVar.r(g.b.f62794h, new f(strArr));
            lVar.r(IjkMediaMeta.IJKM_KEY_FORMAT, new g(strArr));
            lVar.r("filter", new h(strArr));
            lVar.r("repeat", new i(strArr));
            lVar.r("pma", new j(strArr));
            boolean z12 = true;
            int i11 = 0;
            boolean[] zArr = {false};
            com.badlogic.gdx.utils.l lVar2 = new com.badlogic.gdx.utils.l(127, 0.99f);
            lVar2.r("xy", new k(strArr));
            lVar2.r(g.b.f62794h, new l(strArr));
            lVar2.r("bounds", new m(strArr));
            lVar2.r("offset", new n(strArr));
            lVar2.r("orig", new a(strArr));
            lVar2.r("offsets", new b(strArr));
            lVar2.r("rotate", new C0190c(strArr));
            lVar2.r("index", new d(strArr, zArr));
            BufferedReader K = aVar.K(1024);
            try {
                try {
                    String readLine = K.readLine();
                    while (readLine != null) {
                        try {
                            if (readLine.trim().length() != 0) {
                                break;
                            } else {
                                readLine = K.readLine();
                            }
                        } catch (Exception e11) {
                            e = e11;
                            str = readLine;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Error reading texture atlas file: ");
                            sb2.append(aVar);
                            if (str == null) {
                                str2 = "";
                            } else {
                                str2 = "\nLine: " + str;
                            }
                            sb2.append(str2);
                            throw new GdxRuntimeException(sb2.toString(), e);
                        }
                    }
                    while (readLine != null && readLine.trim().length() != 0 && d(strArr, readLine) != 0) {
                        readLine = K.readLine();
                    }
                    p pVar = null;
                    com.badlogic.gdx.utils.a aVar3 = null;
                    com.badlogic.gdx.utils.a aVar4 = null;
                    while (readLine != null) {
                        if (readLine.trim().length() == 0) {
                            readLine = K.readLine();
                            pVar = null;
                        } else if (pVar == null) {
                            pVar = new p();
                            pVar.f12116a = readLine;
                            pVar.f12117b = aVar2.a(readLine);
                            while (true) {
                                readLine = K.readLine();
                                if (d(strArr, readLine) == 0) {
                                    break;
                                }
                                o oVar = (o) lVar.k(strArr[i11]);
                                if (oVar != null) {
                                    oVar.a(pVar);
                                }
                            }
                            this.f12086a.a(pVar);
                        } else {
                            q qVar = new q();
                            qVar.f12128a = pVar;
                            qVar.f12129b = readLine.trim();
                            if (z11) {
                                qVar.f12143p = z12;
                            }
                            while (true) {
                                readLine = K.readLine();
                                int d11 = d(strArr, readLine);
                                if (d11 == 0) {
                                    break;
                                }
                                o oVar2 = (o) lVar2.k(strArr[i11]);
                                if (oVar2 != null) {
                                    oVar2.a(qVar);
                                } else {
                                    if (aVar3 == null) {
                                        aVar3 = new com.badlogic.gdx.utils.a(8);
                                        aVar4 = new com.badlogic.gdx.utils.a(8);
                                    }
                                    aVar3.a(strArr[i11]);
                                    int[] iArr = new int[d11];
                                    while (i11 < d11) {
                                        int i12 = i11 + 1;
                                        try {
                                            iArr[i11] = Integer.parseInt(strArr[i12]);
                                        } catch (NumberFormatException unused) {
                                        }
                                        i11 = i12;
                                    }
                                    aVar4.a(iArr);
                                }
                                z12 = true;
                                i11 = 0;
                            }
                            if (qVar.f12136i == 0 && qVar.f12137j == 0) {
                                qVar.f12136i = qVar.f12132e;
                                qVar.f12137j = qVar.f12133f;
                            }
                            if (aVar3 != null && aVar3.f13179b > 0) {
                                qVar.f12141n = (String[]) aVar3.Q(String.class);
                                qVar.f12142o = (int[][]) aVar4.Q(int[].class);
                                aVar3.clear();
                                aVar4.clear();
                            }
                            this.f12087b.a(qVar);
                        }
                    }
                    x0.a(K);
                    if (zArr[i11]) {
                        this.f12087b.sort(new C0191e());
                    }
                } catch (Exception e12) {
                    e = e12;
                    str = null;
                }
            } catch (Throwable th2) {
                x0.a(K);
                throw th2;
            }
        }

        public c(v1.a aVar, v1.a aVar2, boolean z11) {
            c(aVar, aVar2, z11);
        }
    }

    public e(String str) {
        this(q1.g.f81382e.a(str));
    }

    public e(v1.a aVar) {
        this(aVar, aVar.B());
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends o {

        /* renamed from: h, reason: collision with root package name */
        public int f12071h;

        /* renamed from: i, reason: collision with root package name */
        public String f12072i;

        /* renamed from: j, reason: collision with root package name */
        public float f12073j;

        /* renamed from: k, reason: collision with root package name */
        public float f12074k;

        /* renamed from: l, reason: collision with root package name */
        public int f12075l;

        /* renamed from: m, reason: collision with root package name */
        public int f12076m;

        /* renamed from: n, reason: collision with root package name */
        public int f12077n;

        /* renamed from: o, reason: collision with root package name */
        public int f12078o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f12079p;

        /* renamed from: q, reason: collision with root package name */
        public int f12080q;

        /* renamed from: r, reason: collision with root package name */
        @d0
        public String[] f12081r;

        /* renamed from: s, reason: collision with root package name */
        @d0
        public int[][] f12082s;

        public a(Texture texture, int i11, int i12, int i13, int i14) {
            super(texture, i11, i12, i13, i14);
            this.f12071h = -1;
            this.f12077n = i13;
            this.f12078o = i14;
            this.f12075l = i13;
            this.f12076m = i14;
        }

        @d0
        public int[] D(String str) {
            String[] strArr = this.f12081r;
            if (strArr == null) {
                return null;
            }
            int length = strArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                if (str.equals(this.f12081r[i11])) {
                    return this.f12082s[i11];
                }
            }
            return null;
        }

        public float E() {
            return this.f12079p ? this.f12075l : this.f12076m;
        }

        public float F() {
            return this.f12079p ? this.f12076m : this.f12075l;
        }

        @Override // w1.o
        public void a(boolean z11, boolean z12) {
            super.a(z11, z12);
            if (z11) {
                this.f12073j = (this.f12077n - this.f12073j) - F();
            }
            if (z12) {
                this.f12074k = (this.f12078o - this.f12074k) - E();
            }
        }

        public String toString() {
            return this.f12072i;
        }

        public a(a aVar) {
            this.f12071h = -1;
            q(aVar);
            this.f12071h = aVar.f12071h;
            this.f12072i = aVar.f12072i;
            this.f12073j = aVar.f12073j;
            this.f12074k = aVar.f12074k;
            this.f12075l = aVar.f12075l;
            this.f12076m = aVar.f12076m;
            this.f12077n = aVar.f12077n;
            this.f12078o = aVar.f12078o;
            this.f12079p = aVar.f12079p;
            this.f12080q = aVar.f12080q;
            this.f12081r = aVar.f12081r;
            this.f12082s = aVar.f12082s;
        }

        public a(o oVar) {
            this.f12071h = -1;
            q(oVar);
            this.f12075l = oVar.c();
            int b11 = oVar.b();
            this.f12076m = b11;
            this.f12077n = this.f12075l;
            this.f12078o = b11;
        }
    }

    public e(v1.a aVar, boolean z11) {
        this(aVar, aVar.B(), z11);
    }

    public e(v1.a aVar, v1.a aVar2) {
        this(aVar, aVar2, false);
    }

    public e(v1.a aVar, v1.a aVar2, boolean z11) {
        this(new c(aVar, aVar2, z11));
    }

    public e(c cVar) {
        this.f12069a = new m<>(4);
        this.f12070b = new com.badlogic.gdx.utils.a<>();
        J0(cVar);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends l {

        /* renamed from: x, reason: collision with root package name */
        public final a f12083x;

        /* renamed from: y, reason: collision with root package name */
        public float f12084y;

        /* renamed from: z, reason: collision with root package name */
        public float f12085z;

        public b(a aVar) {
            this.f12083x = new a(aVar);
            this.f12084y = aVar.f12073j;
            this.f12085z = aVar.f12074k;
            q(aVar);
            e0(aVar.f12077n / 2.0f, aVar.f12078o / 2.0f);
            int c11 = aVar.c();
            int b11 = aVar.b();
            if (aVar.f12079p) {
                super.T(true);
                super.X(aVar.f12073j, aVar.f12074k, b11, c11);
            } else {
                super.X(aVar.f12073j, aVar.f12074k, c11, b11);
            }
            b0(1.0f, 1.0f, 1.0f, 1.0f);
        }

        @Override // w1.l
        public float H() {
            return (super.H() / this.f12083x.E()) * this.f12083x.f12078o;
        }

        @Override // w1.l
        public float I() {
            return super.I() + this.f12083x.f12073j;
        }

        @Override // w1.l
        public float J() {
            return super.J() + this.f12083x.f12074k;
        }

        @Override // w1.l
        public float P() {
            return (super.P() / this.f12083x.F()) * this.f12083x.f12077n;
        }

        @Override // w1.l
        public float Q() {
            return super.Q() - this.f12083x.f12073j;
        }

        @Override // w1.l
        public float R() {
            return super.R() - this.f12083x.f12074k;
        }

        @Override // w1.l
        public void T(boolean z11) {
            super.T(z11);
            float I = I();
            float J = J();
            a aVar = this.f12083x;
            float f11 = aVar.f12073j;
            float f12 = aVar.f12074k;
            float u02 = u0();
            float t02 = t0();
            if (z11) {
                a aVar2 = this.f12083x;
                aVar2.f12073j = f12;
                aVar2.f12074k = ((aVar2.f12078o * t02) - f11) - (aVar2.f12075l * u02);
            } else {
                a aVar3 = this.f12083x;
                aVar3.f12073j = ((aVar3.f12077n * u02) - f12) - (aVar3.f12076m * t02);
                aVar3.f12074k = f11;
            }
            a aVar4 = this.f12083x;
            p0(aVar4.f12073j - f11, aVar4.f12074k - f12);
            e0(I, J);
        }

        @Override // w1.l
        public void X(float f11, float f12, float f13, float f14) {
            a aVar = this.f12083x;
            float f15 = f13 / aVar.f12077n;
            float f16 = f14 / aVar.f12078o;
            float f17 = this.f12084y * f15;
            aVar.f12073j = f17;
            float f18 = this.f12085z * f16;
            aVar.f12074k = f18;
            boolean z11 = aVar.f12079p;
            super.X(f11 + f17, f12 + f18, (z11 ? aVar.f12076m : aVar.f12075l) * f15, (z11 ? aVar.f12075l : aVar.f12076m) * f16);
        }

        @Override // w1.l, w1.o
        public void a(boolean z11, boolean z12) {
            if (this.f12083x.f12079p) {
                super.a(z12, z11);
            } else {
                super.a(z11, z12);
            }
            float I = I();
            float J = J();
            a aVar = this.f12083x;
            float f11 = aVar.f12073j;
            float f12 = aVar.f12074k;
            float u02 = u0();
            float t02 = t0();
            a aVar2 = this.f12083x;
            aVar2.f12073j = this.f12084y;
            aVar2.f12074k = this.f12085z;
            aVar2.a(z11, z12);
            a aVar3 = this.f12083x;
            float f13 = aVar3.f12073j;
            this.f12084y = f13;
            float f14 = aVar3.f12074k;
            this.f12085z = f14;
            float f15 = f13 * u02;
            aVar3.f12073j = f15;
            float f16 = f14 * t02;
            aVar3.f12074k = f16;
            p0(f15 - f11, f16 - f12);
            e0(I, J);
        }

        @Override // w1.l
        public void e0(float f11, float f12) {
            a aVar = this.f12083x;
            super.e0(f11 - aVar.f12073j, f12 - aVar.f12074k);
        }

        @Override // w1.l
        public void g0() {
            float f11 = this.f94554m / 2.0f;
            a aVar = this.f12083x;
            super.e0(f11 - aVar.f12073j, (this.f94555n / 2.0f) - aVar.f12074k);
        }

        @Override // w1.l
        public void i0(float f11, float f12) {
            a aVar = this.f12083x;
            super.i0(f11 + aVar.f12073j, f12 + aVar.f12074k);
        }

        @Override // w1.l
        public void m0(float f11, float f12) {
            X(Q(), R(), f11, f12);
        }

        @Override // w1.l
        public void n0(float f11) {
            super.n0(f11 + this.f12083x.f12073j);
        }

        @Override // w1.l
        public void o0(float f11) {
            super.o0(f11 + this.f12083x.f12074k);
        }

        public a s0() {
            return this.f12083x;
        }

        public float t0() {
            return super.H() / this.f12083x.E();
        }

        public String toString() {
            return this.f12083x.toString();
        }

        public float u0() {
            return super.P() / this.f12083x.F();
        }

        public b(b bVar) {
            this.f12083x = bVar.f12083x;
            this.f12084y = bVar.f12084y;
            this.f12085z = bVar.f12085z;
            V(bVar);
        }
    }
}
