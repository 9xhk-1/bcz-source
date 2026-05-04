package a1;

import a1.o;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.Typeface;
import androidx.compose.runtime.internal.StabilityInferred;
import com.airbnb.lottie.o0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class n {

    /* renamed from: j, reason: collision with root package name */
    public static final int f1349j = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<p<Integer>> f1350a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<p<PointF>> f1351b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<p<Float>> f1352c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final List<p<k1.k>> f1353d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final List<p<ColorFilter>> f1354e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final List<p<Object[]>> f1355f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final List<p<Typeface>> f1356g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final List<p<Bitmap>> f1357h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final List<p<CharSequence>> f1358i;

    public n(@m80.k List<p<Integer>> intProperties, @m80.k List<p<PointF>> pointFProperties, @m80.k List<p<Float>> floatProperties, @m80.k List<p<k1.k>> scaleProperties, @m80.k List<p<ColorFilter>> colorFilterProperties, @m80.k List<p<Object[]>> intArrayProperties, @m80.k List<p<Typeface>> typefaceProperties, @m80.k List<p<Bitmap>> bitmapProperties, @m80.k List<p<CharSequence>> charSequenceProperties) {
        g0.p(intProperties, "intProperties");
        g0.p(pointFProperties, "pointFProperties");
        g0.p(floatProperties, "floatProperties");
        g0.p(scaleProperties, "scaleProperties");
        g0.p(colorFilterProperties, "colorFilterProperties");
        g0.p(intArrayProperties, "intArrayProperties");
        g0.p(typefaceProperties, "typefaceProperties");
        g0.p(bitmapProperties, "bitmapProperties");
        g0.p(charSequenceProperties, "charSequenceProperties");
        this.f1350a = intProperties;
        this.f1351b = pointFProperties;
        this.f1352c = floatProperties;
        this.f1353d = scaleProperties;
        this.f1354e = colorFilterProperties;
        this.f1355f = intArrayProperties;
        this.f1356g = typefaceProperties;
        this.f1357h = bitmapProperties;
        this.f1358i = charSequenceProperties;
    }

    public final void a(@m80.k o0 drawable) {
        o.b g11;
        o.b g12;
        o.b g13;
        o.b g14;
        o.b g15;
        o.b g16;
        o.b g17;
        o.b g18;
        o.b g19;
        g0.p(drawable, "drawable");
        Iterator<T> it = this.f1350a.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            c1.d b11 = pVar.b();
            Object c11 = pVar.c();
            g19 = o.g(pVar.a());
            drawable.u(b11, c11, g19);
        }
        Iterator<T> it2 = this.f1351b.iterator();
        while (it2.hasNext()) {
            p pVar2 = (p) it2.next();
            c1.d b12 = pVar2.b();
            Object c12 = pVar2.c();
            g18 = o.g(pVar2.a());
            drawable.u(b12, c12, g18);
        }
        Iterator<T> it3 = this.f1352c.iterator();
        while (it3.hasNext()) {
            p pVar3 = (p) it3.next();
            c1.d b13 = pVar3.b();
            Object c13 = pVar3.c();
            g17 = o.g(pVar3.a());
            drawable.u(b13, c13, g17);
        }
        Iterator<T> it4 = this.f1353d.iterator();
        while (it4.hasNext()) {
            p pVar4 = (p) it4.next();
            c1.d b14 = pVar4.b();
            Object c14 = pVar4.c();
            g16 = o.g(pVar4.a());
            drawable.u(b14, c14, g16);
        }
        Iterator<T> it5 = this.f1354e.iterator();
        while (it5.hasNext()) {
            p pVar5 = (p) it5.next();
            c1.d b15 = pVar5.b();
            Object c15 = pVar5.c();
            g15 = o.g(pVar5.a());
            drawable.u(b15, c15, g15);
        }
        Iterator<T> it6 = this.f1355f.iterator();
        while (it6.hasNext()) {
            p pVar6 = (p) it6.next();
            c1.d b16 = pVar6.b();
            Object c16 = pVar6.c();
            g14 = o.g(pVar6.a());
            drawable.u(b16, c16, g14);
        }
        Iterator<T> it7 = this.f1356g.iterator();
        while (it7.hasNext()) {
            p pVar7 = (p) it7.next();
            c1.d b17 = pVar7.b();
            Object c17 = pVar7.c();
            g13 = o.g(pVar7.a());
            drawable.u(b17, c17, g13);
        }
        Iterator<T> it8 = this.f1357h.iterator();
        while (it8.hasNext()) {
            p pVar8 = (p) it8.next();
            c1.d b18 = pVar8.b();
            Object c18 = pVar8.c();
            g12 = o.g(pVar8.a());
            drawable.u(b18, c18, g12);
        }
        Iterator<T> it9 = this.f1358i.iterator();
        while (it9.hasNext()) {
            p pVar9 = (p) it9.next();
            c1.d b19 = pVar9.b();
            Object c19 = pVar9.c();
            g11 = o.g(pVar9.a());
            drawable.u(b19, c19, g11);
        }
    }

    public final void b(@m80.k o0 drawable) {
        g0.p(drawable, "drawable");
        Iterator<T> it = this.f1350a.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            drawable.u(pVar.b(), pVar.c(), null);
        }
        Iterator<T> it2 = this.f1351b.iterator();
        while (it2.hasNext()) {
            p pVar2 = (p) it2.next();
            drawable.u(pVar2.b(), pVar2.c(), null);
        }
        Iterator<T> it3 = this.f1352c.iterator();
        while (it3.hasNext()) {
            p pVar3 = (p) it3.next();
            drawable.u(pVar3.b(), pVar3.c(), null);
        }
        Iterator<T> it4 = this.f1353d.iterator();
        while (it4.hasNext()) {
            p pVar4 = (p) it4.next();
            drawable.u(pVar4.b(), pVar4.c(), null);
        }
        Iterator<T> it5 = this.f1354e.iterator();
        while (it5.hasNext()) {
            p pVar5 = (p) it5.next();
            drawable.u(pVar5.b(), pVar5.c(), null);
        }
        Iterator<T> it6 = this.f1355f.iterator();
        while (it6.hasNext()) {
            p pVar6 = (p) it6.next();
            drawable.u(pVar6.b(), pVar6.c(), null);
        }
        Iterator<T> it7 = this.f1356g.iterator();
        while (it7.hasNext()) {
            p pVar7 = (p) it7.next();
            drawable.u(pVar7.b(), pVar7.c(), null);
        }
        Iterator<T> it8 = this.f1357h.iterator();
        while (it8.hasNext()) {
            p pVar8 = (p) it8.next();
            drawable.u(pVar8.b(), pVar8.c(), null);
        }
        Iterator<T> it9 = this.f1358i.iterator();
        while (it9.hasNext()) {
            p pVar9 = (p) it9.next();
            drawable.u(pVar9.b(), pVar9.c(), null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n(@m80.k java.util.List<? extends a1.p<?>> r12) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.n.<init>(java.util.List):void");
    }
}
