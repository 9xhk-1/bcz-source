package com.github.mikephil.charting.charts;

import android.animation.ValueAnimator;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.RequiresApi;
import androidx.media3.common.MimeTypes;
import cm.b;
import com.baicizhan.main.activity.GuideActivity;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.jiongji.andriod.card.R;
import em.c;
import fm.k;
import im.d;
import im.f;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import km.e;
import pm.g;
import pm.i;
import rm.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class Chart<T extends k<? extends e<? extends Entry>>> extends ViewGroup implements jm.e {
    public static final String G = "MPAndroidChart";
    public static final int H = 4;
    public static final int I = 7;
    public static final int J = 11;
    public static final int K = 13;
    public static final int L = 14;
    public static final int M = 18;
    public d[] A;
    public float B;
    public boolean C;
    public em.d D;
    public ArrayList<Runnable> E;
    public boolean F;

    /* renamed from: a, reason: collision with root package name */
    public boolean f30157a;

    /* renamed from: b, reason: collision with root package name */
    public T f30158b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f30159c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f30160d;

    /* renamed from: e, reason: collision with root package name */
    public float f30161e;

    /* renamed from: f, reason: collision with root package name */
    public hm.d f30162f;

    /* renamed from: g, reason: collision with root package name */
    public Paint f30163g;

    /* renamed from: h, reason: collision with root package name */
    public Paint f30164h;

    /* renamed from: i, reason: collision with root package name */
    public XAxis f30165i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f30166j;

    /* renamed from: k, reason: collision with root package name */
    public c f30167k;

    /* renamed from: l, reason: collision with root package name */
    public Legend f30168l;

    /* renamed from: m, reason: collision with root package name */
    public mm.a f30169m;

    /* renamed from: n, reason: collision with root package name */
    public ChartTouchListener f30170n;

    /* renamed from: o, reason: collision with root package name */
    public String f30171o;

    /* renamed from: p, reason: collision with root package name */
    public com.github.mikephil.charting.listener.b f30172p;

    /* renamed from: q, reason: collision with root package name */
    public i f30173q;

    /* renamed from: r, reason: collision with root package name */
    public g f30174r;

    /* renamed from: s, reason: collision with root package name */
    public f f30175s;

    /* renamed from: t, reason: collision with root package name */
    public l f30176t;

    /* renamed from: u, reason: collision with root package name */
    public cm.a f30177u;

    /* renamed from: v, reason: collision with root package name */
    public float f30178v;

    /* renamed from: w, reason: collision with root package name */
    public float f30179w;

    /* renamed from: x, reason: collision with root package name */
    public float f30180x;

    /* renamed from: y, reason: collision with root package name */
    public float f30181y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f30182z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            Chart.this.postInvalidate();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30184a;

        static {
            int[] iArr = new int[Bitmap.CompressFormat.values().length];
            f30184a = iArr;
            try {
                iArr[Bitmap.CompressFormat.PNG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30184a[Bitmap.CompressFormat.WEBP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30184a[Bitmap.CompressFormat.JPEG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public Chart(Context context) {
        super(context);
        this.f30157a = false;
        this.f30158b = null;
        this.f30159c = true;
        this.f30160d = true;
        this.f30161e = 0.9f;
        this.f30162f = new hm.d(0);
        this.f30166j = true;
        this.f30171o = "No chart data available.";
        this.f30176t = new l();
        this.f30178v = 0.0f;
        this.f30179w = 0.0f;
        this.f30180x = 0.0f;
        this.f30181y = 0.0f;
        this.f30182z = false;
        this.B = 0.0f;
        this.C = true;
        this.E = new ArrayList<>();
        this.F = false;
        H();
    }

    public void A(float f11, float f12, int i11) {
        B(f11, f12, i11, true);
    }

    public void B(float f11, float f12, int i11, boolean z11) {
        if (i11 < 0 || i11 >= this.f30158b.m()) {
            F(null, z11);
        } else {
            F(new d(f11, f12, i11), z11);
        }
    }

    public void C(float f11, int i11) {
        D(f11, i11, true);
    }

    public void D(float f11, int i11, boolean z11) {
        B(f11, Float.NaN, i11, z11);
    }

    public void E(d dVar) {
        F(dVar, false);
    }

    public void F(d dVar, boolean z11) {
        Entry entry = null;
        if (dVar == null) {
            this.A = null;
        } else {
            if (this.f30157a) {
                Log.i(G, "Highlighted: " + dVar.toString());
            }
            Entry s11 = this.f30158b.s(dVar);
            if (s11 == null) {
                this.A = null;
                dVar = null;
            } else {
                this.A = new d[]{dVar};
            }
            entry = s11;
        }
        setLastHighlighted(this.A);
        if (z11 && this.f30169m != null) {
            if (Y()) {
                this.f30169m.b(entry, dVar);
            } else {
                this.f30169m.a();
            }
        }
        invalidate();
    }

    public void G(d[] dVarArr) {
        this.A = dVarArr;
        setLastHighlighted(dVarArr);
        invalidate();
    }

    public void H() {
        setWillNotDraw(false);
        this.f30177u = new cm.a(new a());
        rm.k.H(getContext());
        this.B = rm.k.e(500.0f);
        this.f30167k = new c();
        Legend legend = new Legend();
        this.f30168l = legend;
        this.f30173q = new i(this.f30176t, legend);
        this.f30165i = new XAxis();
        this.f30163g = new Paint(1);
        Paint paint = new Paint(1);
        this.f30164h = paint;
        paint.setColor(Color.rgb(R.styleable.Theme_drawable_walk_sound3, 189, 51));
        this.f30164h.setTextAlign(Paint.Align.CENTER);
        this.f30164h.setTextSize(rm.k.e(12.0f));
        if (this.f30157a) {
            Log.i("", "Chart.init()");
        }
    }

    public boolean I() {
        return this.f30160d;
    }

    @Deprecated
    public boolean J() {
        return K();
    }

    public boolean K() {
        return this.C;
    }

    public boolean L() {
        T t11 = this.f30158b;
        return t11 == null || t11.r() <= 0;
    }

    public boolean M() {
        return this.f30159c;
    }

    public boolean N() {
        return this.f30157a;
    }

    public abstract void O();

    public void P(Runnable runnable) {
        this.E.remove(runnable);
    }

    public boolean Q(String str) {
        return S(str, "", "MPAndroidChart-Library Save", Bitmap.CompressFormat.PNG, 40);
    }

    public boolean R(String str, int i11) {
        return S(str, "", "MPAndroidChart-Library Save", Bitmap.CompressFormat.PNG, i11);
    }

    public boolean S(String str, String str2, String str3, Bitmap.CompressFormat compressFormat, int i11) {
        String str4;
        if (i11 < 0 || i11 > 100) {
            i11 = 50;
        }
        long currentTimeMillis = System.currentTimeMillis();
        File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/DCIM/" + str2);
        if (!file.exists() && !file.mkdirs()) {
            return false;
        }
        int i12 = b.f30184a[compressFormat.ordinal()];
        if (i12 == 1) {
            boolean endsWith = str.endsWith(GuideActivity.f17949k);
            str4 = MimeTypes.IMAGE_PNG;
            if (!endsWith) {
                str = str + GuideActivity.f17949k;
            }
        } else if (i12 != 2) {
            str4 = "image/jpeg";
            if (!str.endsWith(".jpg") && !str.endsWith(".jpeg")) {
                str = str + ".jpg";
            }
        } else {
            str4 = "image/webp";
            if (!str.endsWith(".webp")) {
                str = str + ".webp";
            }
        }
        String str5 = file.getAbsolutePath() + "/" + str;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str5);
            getChartBitmap().compress(compressFormat, i11, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            long length = new File(str5).length();
            ContentValues contentValues = new ContentValues(8);
            contentValues.put("title", str);
            contentValues.put("_display_name", str);
            contentValues.put("date_added", Long.valueOf(currentTimeMillis));
            contentValues.put("mime_type", str4);
            contentValues.put("description", str3);
            contentValues.put("orientation", (Integer) 0);
            contentValues.put("_data", str5);
            contentValues.put("_size", Long.valueOf(length));
            return getContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues) != null;
        } catch (IOException e11) {
            e11.printStackTrace();
            return false;
        }
    }

    public boolean T(String str, String str2) {
        Bitmap chartBitmap = getChartBitmap();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(Environment.getExternalStorageDirectory().getPath() + str2 + "/" + str + GuideActivity.f17949k);
            chartBitmap.compress(Bitmap.CompressFormat.PNG, 40, fileOutputStream);
            fileOutputStream.close();
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    public void U(float f11, float f12, float f13, float f14) {
        setExtraLeftOffset(f11);
        setExtraTopOffset(f12);
        setExtraRightOffset(f13);
        setExtraBottomOffset(f14);
    }

    public void V(Paint paint, int i11) {
        if (i11 == 7) {
            this.f30164h = paint;
        } else {
            if (i11 != 11) {
                return;
            }
            this.f30163g = paint;
        }
    }

    public void W(float f11, float f12) {
        T t11 = this.f30158b;
        this.f30162f.m(rm.k.r((t11 == null || t11.r() < 2) ? Math.max(Math.abs(f11), Math.abs(f12)) : Math.abs(f12 - f11)));
    }

    public final void X(View view) {
        if (view.getBackground() != null) {
            view.getBackground().setCallback(null);
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        int i11 = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i11 >= viewGroup.getChildCount()) {
                viewGroup.removeAllViews();
                return;
            } else {
                X(viewGroup.getChildAt(i11));
                i11++;
            }
        }
    }

    public boolean Y() {
        d[] dVarArr = this.A;
        return (dVarArr == null || dVarArr.length <= 0 || dVarArr[0] == null) ? false : true;
    }

    public void g(Runnable runnable) {
        if (this.f30176t.B()) {
            post(runnable);
        } else {
            this.E.add(runnable);
        }
    }

    public cm.a getAnimator() {
        return this.f30177u;
    }

    public rm.g getCenter() {
        return rm.g.c(getWidth() / 2.0f, getHeight() / 2.0f);
    }

    @Override // jm.e
    public rm.g getCenterOfView() {
        return getCenter();
    }

    @Override // jm.e
    public rm.g getCenterOffsets() {
        return this.f30176t.p();
    }

    public Bitmap getChartBitmap() {
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        Drawable background = getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        draw(canvas);
        return createBitmap;
    }

    @Override // jm.e
    public RectF getContentRect() {
        return this.f30176t.q();
    }

    public T getData() {
        return this.f30158b;
    }

    @Override // jm.e
    public hm.l getDefaultValueFormatter() {
        return this.f30162f;
    }

    public c getDescription() {
        return this.f30167k;
    }

    public float getDragDecelerationFrictionCoef() {
        return this.f30161e;
    }

    public float getExtraBottomOffset() {
        return this.f30180x;
    }

    public float getExtraLeftOffset() {
        return this.f30181y;
    }

    public float getExtraRightOffset() {
        return this.f30179w;
    }

    public float getExtraTopOffset() {
        return this.f30178v;
    }

    public d[] getHighlighted() {
        return this.A;
    }

    public f getHighlighter() {
        return this.f30175s;
    }

    public ArrayList<Runnable> getJobs() {
        return this.E;
    }

    public Legend getLegend() {
        return this.f30168l;
    }

    public i getLegendRenderer() {
        return this.f30173q;
    }

    public em.d getMarker() {
        return this.D;
    }

    @Deprecated
    public em.d getMarkerView() {
        return getMarker();
    }

    @Override // jm.e
    public float getMaxHighlightDistance() {
        return this.B;
    }

    public com.github.mikephil.charting.listener.b getOnChartGestureListener() {
        return this.f30172p;
    }

    public ChartTouchListener getOnTouchListener() {
        return this.f30170n;
    }

    public g getRenderer() {
        return this.f30174r;
    }

    public l getViewPortHandler() {
        return this.f30176t;
    }

    public XAxis getXAxis() {
        return this.f30165i;
    }

    @Override // jm.e
    public float getXChartMax() {
        return this.f30165i.G;
    }

    @Override // jm.e
    public float getXChartMin() {
        return this.f30165i.H;
    }

    @Override // jm.e
    public float getXRange() {
        return this.f30165i.I;
    }

    public float getYMax() {
        return this.f30158b.z();
    }

    public float getYMin() {
        return this.f30158b.B();
    }

    @RequiresApi(11)
    public void h(int i11) {
        this.f30177u.a(i11);
    }

    @RequiresApi(11)
    public void i(int i11, b.c0 c0Var) {
        this.f30177u.b(i11, c0Var);
    }

    @RequiresApi(11)
    public void j(int i11, int i12) {
        this.f30177u.c(i11, i12);
    }

    @RequiresApi(11)
    public void k(int i11, int i12, b.c0 c0Var) {
        this.f30177u.d(i11, i12, c0Var);
    }

    @RequiresApi(11)
    public void l(int i11, int i12, b.c0 c0Var, b.c0 c0Var2) {
        this.f30177u.e(i11, i12, c0Var, c0Var2);
    }

    @RequiresApi(11)
    public void m(int i11) {
        this.f30177u.f(i11);
    }

    @RequiresApi(11)
    public void n(int i11, b.c0 c0Var) {
        this.f30177u.g(i11, c0Var);
    }

    public abstract void o();

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.F) {
            X(this);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f30158b == null) {
            if (TextUtils.isEmpty(this.f30171o)) {
                return;
            }
            rm.g center = getCenter();
            canvas.drawText(this.f30171o, center.f84265c, center.f84266d, this.f30164h);
            return;
        }
        if (this.f30182z) {
            return;
        }
        p();
        this.f30182z = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            getChildAt(i15).layout(i11, i12, i13, i14);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int e11 = (int) rm.k.e(50.0f);
        setMeasuredDimension(Math.max(getSuggestedMinimumWidth(), View.resolveSize(e11, i11)), Math.max(getSuggestedMinimumHeight(), View.resolveSize(e11, i12)));
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        if (this.f30157a) {
            Log.i(G, "OnSizeChanged()");
        }
        if (i11 > 0 && i12 > 0 && i11 < 10000 && i12 < 10000) {
            if (this.f30157a) {
                Log.i(G, "Setting chart dimens, width: " + i11 + ", height: " + i12);
            }
            this.f30176t.V(i11, i12);
        } else if (this.f30157a) {
            Log.w(G, "*Avoiding* setting chart dimens! width: " + i11 + ", height: " + i12);
        }
        O();
        Iterator<Runnable> it = this.E.iterator();
        while (it.hasNext()) {
            post(it.next());
        }
        this.E.clear();
        super.onSizeChanged(i11, i12, i13, i14);
    }

    public abstract void p();

    public void q() {
        this.f30158b = null;
        this.f30182z = false;
        this.A = null;
        this.f30170n.f(null);
        invalidate();
    }

    public void r() {
        this.E.clear();
    }

    public void s() {
        this.f30158b.h();
        invalidate();
    }

    public void setData(T t11) {
        this.f30158b = t11;
        this.f30182z = false;
        if (t11 == null) {
            return;
        }
        W(t11.B(), t11.z());
        for (e eVar : this.f30158b.q()) {
            if (eVar.b1() || eVar.u0() == this.f30162f) {
                eVar.W(this.f30162f);
            }
        }
        O();
        if (this.f30157a) {
            Log.i(G, "Data is set.");
        }
    }

    public void setDescription(c cVar) {
        this.f30167k = cVar;
    }

    public void setDragDecelerationEnabled(boolean z11) {
        this.f30160d = z11;
    }

    public void setDragDecelerationFrictionCoef(float f11) {
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (f11 >= 1.0f) {
            f11 = 0.999f;
        }
        this.f30161e = f11;
    }

    @Deprecated
    public void setDrawMarkerViews(boolean z11) {
        setDrawMarkers(z11);
    }

    public void setDrawMarkers(boolean z11) {
        this.C = z11;
    }

    public void setExtraBottomOffset(float f11) {
        this.f30180x = rm.k.e(f11);
    }

    public void setExtraLeftOffset(float f11) {
        this.f30181y = rm.k.e(f11);
    }

    public void setExtraRightOffset(float f11) {
        this.f30179w = rm.k.e(f11);
    }

    public void setExtraTopOffset(float f11) {
        this.f30178v = rm.k.e(f11);
    }

    public void setHardwareAccelerationEnabled(boolean z11) {
        if (z11) {
            setLayerType(2, null);
        } else {
            setLayerType(1, null);
        }
    }

    public void setHighlightPerTapEnabled(boolean z11) {
        this.f30159c = z11;
    }

    public void setHighlighter(im.b bVar) {
        this.f30175s = bVar;
    }

    public void setLastHighlighted(d[] dVarArr) {
        d dVar;
        if (dVarArr == null || dVarArr.length <= 0 || (dVar = dVarArr[0]) == null) {
            this.f30170n.f(null);
        } else {
            this.f30170n.f(dVar);
        }
    }

    public void setLogEnabled(boolean z11) {
        this.f30157a = z11;
    }

    public void setMarker(em.d dVar) {
        this.D = dVar;
    }

    @Deprecated
    public void setMarkerView(em.d dVar) {
        setMarker(dVar);
    }

    public void setMaxHighlightDistance(float f11) {
        this.B = rm.k.e(f11);
    }

    public void setNoDataText(String str) {
        this.f30171o = str;
    }

    public void setNoDataTextColor(int i11) {
        this.f30164h.setColor(i11);
    }

    public void setNoDataTextTypeface(Typeface typeface) {
        this.f30164h.setTypeface(typeface);
    }

    public void setOnChartGestureListener(com.github.mikephil.charting.listener.b bVar) {
        this.f30172p = bVar;
    }

    public void setOnChartValueSelectedListener(mm.a aVar) {
        this.f30169m = aVar;
    }

    public void setOnTouchListener(ChartTouchListener chartTouchListener) {
        this.f30170n = chartTouchListener;
    }

    public void setRenderer(g gVar) {
        if (gVar != null) {
            this.f30174r = gVar;
        }
    }

    public void setTouchEnabled(boolean z11) {
        this.f30166j = z11;
    }

    public void setUnbindEnabled(boolean z11) {
        this.F = z11;
    }

    public void t() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public void u(Canvas canvas) {
        float f11;
        float f12;
        c cVar = this.f30167k;
        if (cVar == null || !cVar.f()) {
            return;
        }
        rm.g m11 = this.f30167k.m();
        this.f30163g.setTypeface(this.f30167k.c());
        this.f30163g.setTextSize(this.f30167k.b());
        this.f30163g.setColor(this.f30167k.a());
        this.f30163g.setTextAlign(this.f30167k.o());
        if (m11 == null) {
            f12 = (getWidth() - this.f30176t.Q()) - this.f30167k.d();
            f11 = (getHeight() - this.f30176t.O()) - this.f30167k.e();
        } else {
            float f13 = m11.f84265c;
            f11 = m11.f84266d;
            f12 = f13;
        }
        canvas.drawText(this.f30167k.n(), f12, f11, this.f30163g);
    }

    public void v(Canvas canvas) {
        if (this.D == null || !K() || !Y()) {
            return;
        }
        int i11 = 0;
        while (true) {
            d[] dVarArr = this.A;
            if (i11 >= dVarArr.length) {
                return;
            }
            d dVar = dVarArr[i11];
            e k11 = this.f30158b.k(dVar.d());
            Entry s11 = this.f30158b.s(this.A[i11]);
            int h11 = k11.h(s11);
            if (s11 != null && h11 <= k11.l1() * this.f30177u.h()) {
                float[] y11 = y(dVar);
                if (this.f30176t.G(y11[0], y11[1])) {
                    this.D.b(s11, dVar);
                    this.D.a(canvas, y11[0], y11[1]);
                }
            }
            i11++;
        }
    }

    public void w() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    public d x(float f11, float f12) {
        if (this.f30158b != null) {
            return getHighlighter().a(f11, f12);
        }
        Log.e(G, "Can't select by touch. No data set.");
        return null;
    }

    public float[] y(d dVar) {
        return new float[]{dVar.e(), dVar.f()};
    }

    public Paint z(int i11) {
        if (i11 == 7) {
            return this.f30164h;
        }
        if (i11 != 11) {
            return null;
        }
        return this.f30163g;
    }

    public Chart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30157a = false;
        this.f30158b = null;
        this.f30159c = true;
        this.f30160d = true;
        this.f30161e = 0.9f;
        this.f30162f = new hm.d(0);
        this.f30166j = true;
        this.f30171o = "No chart data available.";
        this.f30176t = new l();
        this.f30178v = 0.0f;
        this.f30179w = 0.0f;
        this.f30180x = 0.0f;
        this.f30181y = 0.0f;
        this.f30182z = false;
        this.B = 0.0f;
        this.C = true;
        this.E = new ArrayList<>();
        this.F = false;
        H();
    }

    public Chart(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f30157a = false;
        this.f30158b = null;
        this.f30159c = true;
        this.f30160d = true;
        this.f30161e = 0.9f;
        this.f30162f = new hm.d(0);
        this.f30166j = true;
        this.f30171o = "No chart data available.";
        this.f30176t = new l();
        this.f30178v = 0.0f;
        this.f30179w = 0.0f;
        this.f30180x = 0.0f;
        this.f30181y = 0.0f;
        this.f30182z = false;
        this.B = 0.0f;
        this.C = true;
        this.E = new ArrayList<>();
        this.F = false;
        H();
    }
}
