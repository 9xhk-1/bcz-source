package pm;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import pm.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class j extends k {

    /* renamed from: i, reason: collision with root package name */
    public jm.g f80901i;

    /* renamed from: j, reason: collision with root package name */
    public Paint f80902j;

    /* renamed from: k, reason: collision with root package name */
    public WeakReference<Bitmap> f80903k;

    /* renamed from: l, reason: collision with root package name */
    public Canvas f80904l;

    /* renamed from: m, reason: collision with root package name */
    public Bitmap.Config f80905m;

    /* renamed from: n, reason: collision with root package name */
    public Path f80906n;

    /* renamed from: o, reason: collision with root package name */
    public Path f80907o;

    /* renamed from: p, reason: collision with root package name */
    public float[] f80908p;

    /* renamed from: q, reason: collision with root package name */
    public Path f80909q;

    /* renamed from: r, reason: collision with root package name */
    public HashMap<km.e, b> f80910r;

    /* renamed from: s, reason: collision with root package name */
    public float[] f80911s;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f80912a;

        static {
            int[] iArr = new int[LineDataSet.Mode.values().length];
            f80912a = iArr;
            try {
                iArr[LineDataSet.Mode.LINEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f80912a[LineDataSet.Mode.STEPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f80912a[LineDataSet.Mode.CUBIC_BEZIER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f80912a[LineDataSet.Mode.HORIZONTAL_BEZIER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public j(jm.g gVar, cm.a aVar, rm.l lVar) {
        super(aVar, lVar);
        this.f80905m = Bitmap.Config.ARGB_8888;
        this.f80906n = new Path();
        this.f80907o = new Path();
        this.f80908p = new float[4];
        this.f80909q = new Path();
        this.f80910r = new HashMap<>();
        this.f80911s = new float[2];
        this.f80901i = gVar;
        Paint paint = new Paint(1);
        this.f80902j = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f80902j.setColor(-1);
    }

    public void A() {
        Canvas canvas = this.f80904l;
        if (canvas != null) {
            canvas.setBitmap(null);
            this.f80904l = null;
        }
        WeakReference<Bitmap> weakReference = this.f80903k;
        if (weakReference != null) {
            Bitmap bitmap = weakReference.get();
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f80903k.clear();
            this.f80903k = null;
        }
    }

    public void B(Bitmap.Config config) {
        this.f80905m = config;
        A();
    }

    @Override // pm.g
    public void b(Canvas canvas) {
        int o11 = (int) this.f80939a.o();
        int n11 = (int) this.f80939a.n();
        WeakReference<Bitmap> weakReference = this.f80903k;
        Bitmap bitmap = weakReference == null ? null : weakReference.get();
        if (bitmap == null || bitmap.getWidth() != o11 || bitmap.getHeight() != n11) {
            if (o11 <= 0 || n11 <= 0) {
                return;
            }
            bitmap = Bitmap.createBitmap(o11, n11, this.f80905m);
            this.f80903k = new WeakReference<>(bitmap);
            this.f80904l = new Canvas(bitmap);
        }
        bitmap.eraseColor(0);
        for (T t11 : this.f80901i.getLineData().q()) {
            if (t11.isVisible()) {
                u(canvas, t11);
            }
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f80886c);
    }

    @Override // pm.g
    public void c(Canvas canvas) {
        r(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.github.mikephil.charting.data.Entry, fm.f] */
    @Override // pm.g
    public void d(Canvas canvas, im.d[] dVarArr) {
        fm.m lineData = this.f80901i.getLineData();
        for (im.d dVar : dVarArr) {
            km.f fVar = (km.f) lineData.k(dVar.d());
            if (fVar != null && fVar.g0()) {
                ?? N0 = fVar.N0(dVar.h(), dVar.j());
                if (l(N0, fVar)) {
                    rm.f f11 = this.f80901i.d(fVar.F0()).f(N0.j(), N0.c() * this.f80885b.i());
                    dVar.n((float) f11.f84261c, (float) f11.f84262d);
                    n(canvas, (float) f11.f84261c, (float) f11.f84262d, fVar);
                }
            }
        }
    }

    @Override // pm.g
    public void e(Canvas canvas, String str, float f11, float f12, int i11) {
        this.f80889f.setColor(i11);
        canvas.drawText(str, f11, f12, this.f80889f);
    }

    @Override // pm.g
    public void f(Canvas canvas) {
        Entry entry;
        j jVar = this;
        if (jVar.k(jVar.f80901i)) {
            List<T> q11 = jVar.f80901i.getLineData().q();
            int i11 = 0;
            while (i11 < q11.size()) {
                km.f fVar = (km.f) q11.get(i11);
                if (jVar.m(fVar) && fVar.l1() >= 1) {
                    jVar.a(fVar);
                    rm.i d11 = jVar.f80901i.d(fVar.F0());
                    int V0 = (int) (fVar.V0() * 1.75f);
                    if (!fVar.f0()) {
                        V0 /= 2;
                    }
                    int i12 = V0;
                    jVar.f80866g.a(jVar.f80901i, fVar);
                    float h11 = jVar.f80885b.h();
                    float i13 = jVar.f80885b.i();
                    c.a aVar = jVar.f80866g;
                    float[] c11 = d11.c(fVar, h11, i13, aVar.f80867a, aVar.f80868b);
                    hm.l u02 = fVar.u0();
                    rm.g d12 = rm.g.d(fVar.m1());
                    d12.f84265c = rm.k.e(d12.f84265c);
                    d12.f84266d = rm.k.e(d12.f84266d);
                    int i14 = 0;
                    while (i14 < c11.length) {
                        float f11 = c11[i14];
                        float f12 = c11[i14 + 1];
                        if (!jVar.f80939a.J(f11)) {
                            break;
                        }
                        if (jVar.f80939a.I(f11) && jVar.f80939a.M(f12)) {
                            int i15 = i14 / 2;
                            Entry m11 = fVar.m(jVar.f80866g.f80867a + i15);
                            if (fVar.E0()) {
                                entry = m11;
                                jVar.e(canvas, u02.j(m11), f11, f12 - i12, fVar.r(i15));
                            } else {
                                entry = m11;
                            }
                            if (entry.b() != null && fVar.L()) {
                                Drawable b11 = entry.b();
                                rm.k.k(canvas, b11, (int) (f11 + d12.f84265c), (int) (f12 + d12.f84266d), b11.getIntrinsicWidth(), b11.getIntrinsicHeight());
                            }
                        }
                        i14 += 2;
                        jVar = this;
                    }
                    rm.g.h(d12);
                }
                i11++;
                jVar = this;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [com.github.mikephil.charting.data.Entry, fm.f] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public void r(Canvas canvas) {
        b bVar;
        Bitmap b11;
        this.f80886c.setStyle(Paint.Style.FILL);
        float i11 = this.f80885b.i();
        float[] fArr = this.f80911s;
        boolean z11 = false;
        float f11 = 0.0f;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        List q11 = this.f80901i.getLineData().q();
        int i12 = 0;
        while (i12 < q11.size()) {
            km.f fVar = (km.f) q11.get(i12);
            if (fVar.isVisible() && fVar.f0() && fVar.l1() != 0) {
                this.f80902j.setColor(fVar.j());
                rm.i d11 = this.f80901i.d(fVar.F0());
                this.f80866g.a(this.f80901i, fVar);
                float V0 = fVar.V0();
                float h02 = fVar.h0();
                boolean z12 = (!fVar.q1() || h02 >= V0 || h02 <= f11) ? z11 ? 1 : 0 : true;
                boolean z13 = (z12 && fVar.j() == 1122867) ? true : z11 ? 1 : 0;
                a aVar = null;
                if (this.f80910r.containsKey(fVar)) {
                    bVar = this.f80910r.get(fVar);
                } else {
                    bVar = new b(this, aVar);
                    this.f80910r.put(fVar, bVar);
                }
                if (bVar.c(fVar)) {
                    bVar.a(fVar, z12, z13);
                }
                c.a aVar2 = this.f80866g;
                int i13 = aVar2.f80869c;
                int i14 = aVar2.f80867a;
                int i15 = i13 + i14;
                ?? r32 = z11;
                while (i14 <= i15) {
                    ?? m11 = fVar.m(i14);
                    if (m11 == 0) {
                        break;
                    }
                    this.f80911s[r32] = m11.j();
                    this.f80911s[1] = m11.c() * i11;
                    d11.o(this.f80911s);
                    if (!this.f80939a.J(this.f80911s[r32])) {
                        break;
                    }
                    if (this.f80939a.I(this.f80911s[r32]) && this.f80939a.M(this.f80911s[1]) && (b11 = bVar.b(i14)) != null) {
                        float[] fArr2 = this.f80911s;
                        canvas.drawBitmap(b11, fArr2[r32] - V0, fArr2[1] - V0, (Paint) null);
                    }
                    i14++;
                    r32 = 0;
                }
            }
            i12++;
            z11 = false;
            f11 = 0.0f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [com.github.mikephil.charting.data.Entry, fm.f] */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.github.mikephil.charting.data.Entry, fm.f] */
    public void s(km.f fVar) {
        float i11 = this.f80885b.i();
        rm.i d11 = this.f80901i.d(fVar.F0());
        this.f80866g.a(this.f80901i, fVar);
        float s02 = fVar.s0();
        this.f80906n.reset();
        c.a aVar = this.f80866g;
        if (aVar.f80869c >= 1) {
            int i12 = aVar.f80867a;
            T m11 = fVar.m(Math.max(i12 - 1, 0));
            ?? m12 = fVar.m(Math.max(i12, 0));
            if (m12 != 0) {
                this.f80906n.moveTo(m12.j(), m12.c() * i11);
                int i13 = this.f80866g.f80867a + 1;
                int i14 = -1;
                Entry entry = m12;
                Entry entry2 = m12;
                Entry entry3 = m11;
                while (true) {
                    c.a aVar2 = this.f80866g;
                    Entry entry4 = entry2;
                    if (i13 > aVar2.f80869c + aVar2.f80867a) {
                        break;
                    }
                    if (i14 != i13) {
                        entry4 = fVar.m(i13);
                    }
                    int i15 = i13 + 1;
                    if (i15 < fVar.l1()) {
                        i13 = i15;
                    }
                    ?? m13 = fVar.m(i13);
                    this.f80906n.cubicTo(entry.j() + ((entry4.j() - entry3.j()) * s02), (entry.c() + ((entry4.c() - entry3.c()) * s02)) * i11, entry4.j() - ((m13.j() - entry.j()) * s02), (entry4.c() - ((m13.c() - entry.c()) * s02)) * i11, entry4.j(), entry4.c() * i11);
                    int i16 = i13;
                    i13 = i15;
                    i14 = i16;
                    entry3 = entry;
                    entry = entry4;
                    entry2 = m13;
                }
            } else {
                return;
            }
        }
        if (fVar.W0()) {
            this.f80907o.reset();
            this.f80907o.addPath(this.f80906n);
            t(this.f80904l, fVar, this.f80907o, d11, this.f80866g);
        }
        this.f80886c.setColor(fVar.e());
        this.f80886c.setStyle(Paint.Style.STROKE);
        d11.l(this.f80906n);
        this.f80904l.drawPath(this.f80906n, this.f80886c);
        this.f80886c.setPathEffect(null);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.github.mikephil.charting.data.Entry] */
    public void t(Canvas canvas, km.f fVar, Path path, rm.i iVar, c.a aVar) {
        float a11 = fVar.J().a(fVar, this.f80901i);
        path.lineTo(fVar.m(aVar.f80867a + aVar.f80869c).j(), a11);
        path.lineTo(fVar.m(aVar.f80867a).j(), a11);
        path.close();
        iVar.l(path);
        Drawable k11 = fVar.k();
        if (k11 != null) {
            q(canvas, path, k11);
        } else {
            p(canvas, path, fVar.G(), fVar.l0());
        }
    }

    public void u(Canvas canvas, km.f fVar) {
        if (fVar.l1() < 1) {
            return;
        }
        this.f80886c.setStrokeWidth(fVar.o0());
        this.f80886c.setPathEffect(fVar.O());
        int i11 = a.f80912a[fVar.getMode().ordinal()];
        if (i11 == 3) {
            s(fVar);
        } else if (i11 != 4) {
            w(canvas, fVar);
        } else {
            v(fVar);
        }
        this.f80886c.setPathEffect(null);
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [com.github.mikephil.charting.data.Entry, fm.f] */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.github.mikephil.charting.data.Entry, fm.f] */
    public void v(km.f fVar) {
        float i11 = this.f80885b.i();
        rm.i d11 = this.f80901i.d(fVar.F0());
        this.f80866g.a(this.f80901i, fVar);
        this.f80906n.reset();
        c.a aVar = this.f80866g;
        if (aVar.f80869c >= 1) {
            ?? m11 = fVar.m(aVar.f80867a);
            this.f80906n.moveTo(m11.j(), m11.c() * i11);
            int i12 = this.f80866g.f80867a + 1;
            Entry entry = m11;
            while (true) {
                c.a aVar2 = this.f80866g;
                if (i12 > aVar2.f80869c + aVar2.f80867a) {
                    break;
                }
                ?? m12 = fVar.m(i12);
                float j11 = entry.j() + ((m12.j() - entry.j()) / 2.0f);
                this.f80906n.cubicTo(j11, entry.c() * i11, j11, m12.c() * i11, m12.j(), m12.c() * i11);
                i12++;
                entry = m12;
            }
        }
        if (fVar.W0()) {
            this.f80907o.reset();
            this.f80907o.addPath(this.f80906n);
            t(this.f80904l, fVar, this.f80907o, d11, this.f80866g);
        }
        this.f80886c.setColor(fVar.e());
        this.f80886c.setStyle(Paint.Style.STROKE);
        d11.l(this.f80906n);
        this.f80904l.drawPath(this.f80906n, this.f80886c);
        this.f80886c.setPathEffect(null);
    }

    /* JADX WARN: Type inference failed for: r12v11, types: [com.github.mikephil.charting.data.Entry, fm.f] */
    /* JADX WARN: Type inference failed for: r13v5, types: [com.github.mikephil.charting.data.Entry, fm.f] */
    /* JADX WARN: Type inference failed for: r8v22, types: [com.github.mikephil.charting.data.Entry, fm.f] */
    /* JADX WARN: Type inference failed for: r8v4, types: [com.github.mikephil.charting.data.Entry, fm.f] */
    public void w(Canvas canvas, km.f fVar) {
        int l12 = fVar.l1();
        boolean z11 = fVar.getMode() == LineDataSet.Mode.STEPPED;
        int i11 = z11 ? 4 : 2;
        rm.i d11 = this.f80901i.d(fVar.F0());
        float i12 = this.f80885b.i();
        this.f80886c.setStyle(Paint.Style.STROKE);
        Canvas canvas2 = fVar.d() ? this.f80904l : canvas;
        this.f80866g.a(this.f80901i, fVar);
        if (fVar.W0() && l12 > 0) {
            x(canvas, fVar, d11, this.f80866g);
        }
        if (fVar.A0().size() > 1) {
            int i13 = i11 * 2;
            if (this.f80908p.length <= i13) {
                this.f80908p = new float[i11 * 4];
            }
            int i14 = this.f80866g.f80867a;
            while (true) {
                c.a aVar = this.f80866g;
                if (i14 > aVar.f80869c + aVar.f80867a) {
                    break;
                }
                ?? m11 = fVar.m(i14);
                if (m11 != 0) {
                    this.f80908p[0] = m11.j();
                    this.f80908p[1] = m11.c() * i12;
                    if (i14 < this.f80866g.f80868b) {
                        ?? m12 = fVar.m(i14 + 1);
                        if (m12 == 0) {
                            break;
                        }
                        if (z11) {
                            this.f80908p[2] = m12.j();
                            float[] fArr = this.f80908p;
                            float f11 = fArr[1];
                            fArr[3] = f11;
                            fArr[4] = fArr[2];
                            fArr[5] = f11;
                            fArr[6] = m12.j();
                            this.f80908p[7] = m12.c() * i12;
                        } else {
                            this.f80908p[2] = m12.j();
                            this.f80908p[3] = m12.c() * i12;
                        }
                    } else {
                        float[] fArr2 = this.f80908p;
                        fArr2[2] = fArr2[0];
                        fArr2[3] = fArr2[1];
                    }
                    d11.o(this.f80908p);
                    if (!this.f80939a.J(this.f80908p[0])) {
                        break;
                    }
                    if (this.f80939a.I(this.f80908p[2]) && (this.f80939a.K(this.f80908p[1]) || this.f80939a.H(this.f80908p[3]))) {
                        this.f80886c.setColor(fVar.Y0(i14));
                        canvas2.drawLines(this.f80908p, 0, i13, this.f80886c);
                    }
                }
                i14++;
            }
        } else {
            int i15 = l12 * i11;
            if (this.f80908p.length < Math.max(i15, i11) * 2) {
                this.f80908p = new float[Math.max(i15, i11) * 4];
            }
            if (fVar.m(this.f80866g.f80867a) != 0) {
                int i16 = this.f80866g.f80867a;
                int i17 = 0;
                while (true) {
                    c.a aVar2 = this.f80866g;
                    if (i16 > aVar2.f80869c + aVar2.f80867a) {
                        break;
                    }
                    ?? m13 = fVar.m(i16 == 0 ? 0 : i16 - 1);
                    ?? m14 = fVar.m(i16);
                    if (m13 != 0 && m14 != 0) {
                        this.f80908p[i17] = m13.j();
                        int i18 = i17 + 2;
                        this.f80908p[i17 + 1] = m13.c() * i12;
                        if (z11) {
                            this.f80908p[i18] = m14.j();
                            this.f80908p[i17 + 3] = m13.c() * i12;
                            this.f80908p[i17 + 4] = m14.j();
                            i18 = i17 + 6;
                            this.f80908p[i17 + 5] = m13.c() * i12;
                        }
                        this.f80908p[i18] = m14.j();
                        this.f80908p[i18 + 1] = m14.c() * i12;
                        i17 = i18 + 2;
                    }
                    i16++;
                }
                if (i17 > 0) {
                    d11.o(this.f80908p);
                    int max = Math.max((this.f80866g.f80869c + 1) * i11, i11) * 2;
                    this.f80886c.setColor(fVar.e());
                    canvas2.drawLines(this.f80908p, 0, max, this.f80886c);
                }
            }
        }
        this.f80886c.setPathEffect(null);
    }

    public void x(Canvas canvas, km.f fVar, rm.i iVar, c.a aVar) {
        int i11;
        int i12;
        Path path = this.f80909q;
        int i13 = aVar.f80867a;
        int i14 = aVar.f80869c + i13;
        int i15 = 0;
        do {
            i11 = (i15 * 128) + i13;
            i12 = i11 + 128;
            if (i12 > i14) {
                i12 = i14;
            }
            if (i11 <= i12) {
                y(fVar, i11, i12, path);
                iVar.l(path);
                Drawable k11 = fVar.k();
                if (k11 != null) {
                    q(canvas, path, k11);
                } else {
                    p(canvas, path, fVar.G(), fVar.l0());
                }
            }
            i15++;
        } while (i11 <= i12);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.github.mikephil.charting.data.Entry, fm.f] */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.github.mikephil.charting.data.Entry, fm.f] */
    public final void y(km.f fVar, int i11, int i12, Path path) {
        float a11 = fVar.J().a(fVar, this.f80901i);
        float i13 = this.f80885b.i();
        boolean z11 = fVar.getMode() == LineDataSet.Mode.STEPPED;
        path.reset();
        ?? m11 = fVar.m(i11);
        path.moveTo(m11.j(), a11);
        path.lineTo(m11.j(), m11.c() * i13);
        int i14 = i11 + 1;
        Entry entry = null;
        fm.f fVar2 = m11;
        while (i14 <= i12) {
            ?? m12 = fVar.m(i14);
            if (z11) {
                path.lineTo(m12.j(), fVar2.c() * i13);
            }
            path.lineTo(m12.j(), m12.c() * i13);
            i14++;
            fVar2 = m12;
            entry = m12;
        }
        if (entry != null) {
            path.lineTo(entry.j(), a11);
        }
        path.close();
    }

    public Bitmap.Config z() {
        return this.f80905m;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        public Path f80913a;

        /* renamed from: b, reason: collision with root package name */
        public Bitmap[] f80914b;

        public b() {
            this.f80913a = new Path();
        }

        public void a(km.f fVar, boolean z11, boolean z12) {
            int F = fVar.F();
            float V0 = fVar.V0();
            float h02 = fVar.h0();
            for (int i11 = 0; i11 < F; i11++) {
                int i12 = (int) (V0 * 2.1d);
                Bitmap createBitmap = Bitmap.createBitmap(i12, i12, Bitmap.Config.ARGB_4444);
                Canvas canvas = new Canvas(createBitmap);
                this.f80914b[i11] = createBitmap;
                j.this.f80886c.setColor(fVar.e0(i11));
                if (z12) {
                    this.f80913a.reset();
                    this.f80913a.addCircle(V0, V0, V0, Path.Direction.CW);
                    this.f80913a.addCircle(V0, V0, h02, Path.Direction.CCW);
                    canvas.drawPath(this.f80913a, j.this.f80886c);
                } else {
                    canvas.drawCircle(V0, V0, V0, j.this.f80886c);
                    if (z11) {
                        canvas.drawCircle(V0, V0, h02, j.this.f80902j);
                    }
                }
            }
        }

        public Bitmap b(int i11) {
            Bitmap[] bitmapArr = this.f80914b;
            return bitmapArr[i11 % bitmapArr.length];
        }

        public boolean c(km.f fVar) {
            int F = fVar.F();
            Bitmap[] bitmapArr = this.f80914b;
            if (bitmapArr == null) {
                this.f80914b = new Bitmap[F];
                return true;
            }
            if (bitmapArr.length == F) {
                return false;
            }
            this.f80914b = new Bitmap[F];
            return true;
        }

        public /* synthetic */ b(j jVar, a aVar) {
            this();
        }
    }

    @Override // pm.g
    public void j() {
    }
}
