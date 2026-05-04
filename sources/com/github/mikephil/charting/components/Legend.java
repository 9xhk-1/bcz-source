package com.github.mikephil.charting.components;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import em.b;
import java.util.ArrayList;
import java.util.List;
import rm.c;
import rm.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class Legend extends b {
    public float A;
    public boolean B;
    public List<c> C;
    public List<Boolean> D;
    public List<c> E;

    /* renamed from: g, reason: collision with root package name */
    public com.github.mikephil.charting.components.a[] f30203g;

    /* renamed from: h, reason: collision with root package name */
    public com.github.mikephil.charting.components.a[] f30204h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f30205i;

    /* renamed from: j, reason: collision with root package name */
    public LegendHorizontalAlignment f30206j;

    /* renamed from: k, reason: collision with root package name */
    public LegendVerticalAlignment f30207k;

    /* renamed from: l, reason: collision with root package name */
    public LegendOrientation f30208l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f30209m;

    /* renamed from: n, reason: collision with root package name */
    public LegendDirection f30210n;

    /* renamed from: o, reason: collision with root package name */
    public LegendForm f30211o;

    /* renamed from: p, reason: collision with root package name */
    public float f30212p;

    /* renamed from: q, reason: collision with root package name */
    public float f30213q;

    /* renamed from: r, reason: collision with root package name */
    public DashPathEffect f30214r;

    /* renamed from: s, reason: collision with root package name */
    public float f30215s;

    /* renamed from: t, reason: collision with root package name */
    public float f30216t;

    /* renamed from: u, reason: collision with root package name */
    public float f30217u;

    /* renamed from: v, reason: collision with root package name */
    public float f30218v;

    /* renamed from: w, reason: collision with root package name */
    public float f30219w;

    /* renamed from: x, reason: collision with root package name */
    public float f30220x;

    /* renamed from: y, reason: collision with root package name */
    public float f30221y;

    /* renamed from: z, reason: collision with root package name */
    public float f30222z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum LegendDirection {
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum LegendForm {
        NONE,
        EMPTY,
        DEFAULT,
        SQUARE,
        CIRCLE,
        LINE
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum LegendHorizontalAlignment {
        LEFT,
        CENTER,
        RIGHT
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum LegendOrientation {
        HORIZONTAL,
        VERTICAL
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum LegendVerticalAlignment {
        TOP,
        CENTER,
        BOTTOM
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30223a;

        static {
            int[] iArr = new int[LegendOrientation.values().length];
            f30223a = iArr;
            try {
                iArr[LegendOrientation.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30223a[LegendOrientation.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public Legend() {
        this.f30203g = new com.github.mikephil.charting.components.a[0];
        this.f30205i = false;
        this.f30206j = LegendHorizontalAlignment.LEFT;
        this.f30207k = LegendVerticalAlignment.BOTTOM;
        this.f30208l = LegendOrientation.HORIZONTAL;
        this.f30209m = false;
        this.f30210n = LegendDirection.LEFT_TO_RIGHT;
        this.f30211o = LegendForm.SQUARE;
        this.f30212p = 8.0f;
        this.f30213q = 3.0f;
        this.f30214r = null;
        this.f30215s = 6.0f;
        this.f30216t = 0.0f;
        this.f30217u = 5.0f;
        this.f30218v = 3.0f;
        this.f30219w = 0.95f;
        this.f30220x = 0.0f;
        this.f30221y = 0.0f;
        this.f30222z = 0.0f;
        this.A = 0.0f;
        this.B = false;
        this.C = new ArrayList(16);
        this.D = new ArrayList(16);
        this.E = new ArrayList(16);
        this.f49904e = k.e(10.0f);
        this.f49901b = k.e(5.0f);
        this.f49902c = k.e(3.0f);
    }

    public float A(Paint paint) {
        float f11 = 0.0f;
        for (com.github.mikephil.charting.components.a aVar : this.f30203g) {
            String str = aVar.f30234a;
            if (str != null) {
                float a11 = k.a(paint, str);
                if (a11 > f11) {
                    f11 = a11;
                }
            }
        }
        return f11;
    }

    public float B(Paint paint) {
        float e11 = k.e(this.f30217u);
        float f11 = 0.0f;
        float f12 = 0.0f;
        for (com.github.mikephil.charting.components.a aVar : this.f30203g) {
            float e12 = k.e(Float.isNaN(aVar.f30236c) ? this.f30212p : aVar.f30236c);
            if (e12 > f12) {
                f12 = e12;
            }
            String str = aVar.f30234a;
            if (str != null) {
                float d11 = k.d(paint, str);
                if (d11 > f11) {
                    f11 = d11;
                }
            }
        }
        return f11 + f12 + e11;
    }

    public LegendOrientation C() {
        return this.f30208l;
    }

    public float D() {
        return this.f30218v;
    }

    public LegendVerticalAlignment E() {
        return this.f30207k;
    }

    public float F() {
        return this.f30215s;
    }

    public float G() {
        return this.f30216t;
    }

    public boolean H() {
        return this.f30209m;
    }

    public boolean I() {
        return this.f30205i;
    }

    public boolean J() {
        return this.B;
    }

    public void K() {
        this.f30205i = false;
    }

    public void L(List<com.github.mikephil.charting.components.a> list) {
        this.f30203g = (com.github.mikephil.charting.components.a[]) list.toArray(new com.github.mikephil.charting.components.a[list.size()]);
        this.f30205i = true;
    }

    public void M(com.github.mikephil.charting.components.a[] aVarArr) {
        this.f30203g = aVarArr;
        this.f30205i = true;
    }

    public void N(LegendDirection legendDirection) {
        this.f30210n = legendDirection;
    }

    public void O(boolean z11) {
        this.f30209m = z11;
    }

    public void P(List<com.github.mikephil.charting.components.a> list) {
        this.f30203g = (com.github.mikephil.charting.components.a[]) list.toArray(new com.github.mikephil.charting.components.a[list.size()]);
    }

    public void Q(List<com.github.mikephil.charting.components.a> list) {
        this.f30204h = (com.github.mikephil.charting.components.a[]) list.toArray(new com.github.mikephil.charting.components.a[list.size()]);
    }

    public void R(int[] iArr, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < Math.min(iArr.length, strArr.length); i11++) {
            com.github.mikephil.charting.components.a aVar = new com.github.mikephil.charting.components.a();
            int i12 = iArr[i11];
            aVar.f30239f = i12;
            aVar.f30234a = strArr[i11];
            if (i12 == 1122868 || i12 == 0) {
                aVar.f30235b = LegendForm.NONE;
            } else if (i12 == 1122867) {
                aVar.f30235b = LegendForm.EMPTY;
            }
            arrayList.add(aVar);
        }
        this.f30204h = (com.github.mikephil.charting.components.a[]) arrayList.toArray(new com.github.mikephil.charting.components.a[arrayList.size()]);
    }

    public void S(com.github.mikephil.charting.components.a[] aVarArr) {
        if (aVarArr == null) {
            aVarArr = new com.github.mikephil.charting.components.a[0];
        }
        this.f30204h = aVarArr;
    }

    public void T(LegendForm legendForm) {
        this.f30211o = legendForm;
    }

    public void U(DashPathEffect dashPathEffect) {
        this.f30214r = dashPathEffect;
    }

    public void V(float f11) {
        this.f30213q = f11;
    }

    public void W(float f11) {
        this.f30212p = f11;
    }

    public void X(float f11) {
        this.f30217u = f11;
    }

    public void Y(LegendHorizontalAlignment legendHorizontalAlignment) {
        this.f30206j = legendHorizontalAlignment;
    }

    public void Z(float f11) {
        this.f30219w = f11;
    }

    public void a0(LegendOrientation legendOrientation) {
        this.f30208l = legendOrientation;
    }

    public void b0(float f11) {
        this.f30218v = f11;
    }

    public void c0(LegendVerticalAlignment legendVerticalAlignment) {
        this.f30207k = legendVerticalAlignment;
    }

    public void d0(boolean z11) {
        this.B = z11;
    }

    public void e0(float f11) {
        this.f30215s = f11;
    }

    public void f0(float f11) {
        this.f30216t = f11;
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(android.graphics.Paint r27, rm.l r28) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.components.Legend.m(android.graphics.Paint, rm.l):void");
    }

    public List<Boolean> n() {
        return this.D;
    }

    public List<c> o() {
        return this.C;
    }

    public List<c> p() {
        return this.E;
    }

    public LegendDirection q() {
        return this.f30210n;
    }

    public com.github.mikephil.charting.components.a[] r() {
        return this.f30203g;
    }

    public com.github.mikephil.charting.components.a[] s() {
        return this.f30204h;
    }

    public LegendForm t() {
        return this.f30211o;
    }

    public DashPathEffect u() {
        return this.f30214r;
    }

    public float v() {
        return this.f30213q;
    }

    public float w() {
        return this.f30212p;
    }

    public float x() {
        return this.f30217u;
    }

    public LegendHorizontalAlignment y() {
        return this.f30206j;
    }

    public float z() {
        return this.f30219w;
    }

    public Legend(com.github.mikephil.charting.components.a[] aVarArr) {
        this();
        if (aVarArr != null) {
            this.f30203g = aVarArr;
            return;
        }
        throw new IllegalArgumentException("entries array is NULL");
    }
}
