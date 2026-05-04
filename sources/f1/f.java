package f1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.k;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.o0;
import com.airbnb.lottie.t0;
import j1.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import z0.o;
import z0.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class f extends com.airbnb.lottie.model.layer.a {
    public final StringBuilder H;
    public final RectF I;
    public final Matrix J;
    public final Paint K;
    public final Paint L;
    public final Map<c1.c, List<y0.d>> M;
    public final LongSparseArray<String> N;
    public final o O;
    public final o0 P;
    public final k Q;

    @Nullable
    public z0.a<Integer, Integer> R;

    @Nullable
    public z0.a<Integer, Integer> S;

    @Nullable
    public z0.a<Integer, Integer> T;

    @Nullable
    public z0.a<Integer, Integer> U;

    @Nullable
    public z0.a<Float, Float> V;

    @Nullable
    public z0.a<Float, Float> W;

    @Nullable
    public z0.a<Float, Float> X;

    @Nullable
    public z0.a<Float, Float> Y;

    @Nullable
    public z0.a<Float, Float> Z;

    /* renamed from: a0, reason: collision with root package name */
    @Nullable
    public z0.a<Typeface, Typeface> f50346a0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends Paint {
        public a(int i11) {
            super(i11);
            setStyle(Paint.Style.FILL);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends Paint {
        public b(int i11) {
            super(i11);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f50349a;

        static {
            int[] iArr = new int[DocumentData.Justification.values().length];
            f50349a = iArr;
            try {
                iArr[DocumentData.Justification.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50349a[DocumentData.Justification.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50349a[DocumentData.Justification.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public f(o0 o0Var, Layer layer) {
        super(o0Var, layer);
        d1.b bVar;
        d1.b bVar2;
        d1.a aVar;
        d1.a aVar2;
        this.H = new StringBuilder(2);
        this.I = new RectF();
        this.J = new Matrix();
        this.K = new a(1);
        this.L = new b(1);
        this.M = new HashMap();
        this.N = new LongSparseArray<>();
        this.P = o0Var;
        this.Q = layer.b();
        o k11 = layer.s().k();
        this.O = k11;
        k11.a(this);
        i(k11);
        d1.k t11 = layer.t();
        if (t11 != null && (aVar2 = t11.f46996a) != null) {
            z0.a<Integer, Integer> k12 = aVar2.k();
            this.R = k12;
            k12.a(this);
            i(this.R);
        }
        if (t11 != null && (aVar = t11.f46997b) != null) {
            z0.a<Integer, Integer> k13 = aVar.k();
            this.T = k13;
            k13.a(this);
            i(this.T);
        }
        if (t11 != null && (bVar2 = t11.f46998c) != null) {
            z0.a<Float, Float> k14 = bVar2.k();
            this.V = k14;
            k14.a(this);
            i(this.V);
        }
        if (t11 == null || (bVar = t11.f46999d) == null) {
            return;
        }
        z0.a<Float, Float> k15 = bVar.k();
        this.X = k15;
        k15.a(this);
        i(this.X);
    }

    public final void N(DocumentData.Justification justification, Canvas canvas, float f11) {
        int i11 = c.f50349a[justification.ordinal()];
        if (i11 == 2) {
            canvas.translate(-f11, 0.0f);
        } else {
            if (i11 != 3) {
                return;
            }
            canvas.translate((-f11) / 2.0f, 0.0f);
        }
    }

    public final String O(String str, int i11) {
        int codePointAt = str.codePointAt(i11);
        int charCount = Character.charCount(codePointAt) + i11;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!b0(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j11 = codePointAt;
        if (this.N.containsKey(j11)) {
            return this.N.get(j11);
        }
        this.H.setLength(0);
        while (i11 < charCount) {
            int codePointAt3 = str.codePointAt(i11);
            this.H.appendCodePoint(codePointAt3);
            i11 += Character.charCount(codePointAt3);
        }
        String sb2 = this.H.toString();
        this.N.put(j11, sb2);
        return sb2;
    }

    public final void P(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public final void Q(c1.c cVar, Matrix matrix, float f11, DocumentData documentData, Canvas canvas) {
        List<y0.d> X = X(cVar);
        for (int i11 = 0; i11 < X.size(); i11++) {
            Path path = X.get(i11).getPath();
            path.computeBounds(this.I, false);
            this.J.set(matrix);
            this.J.preTranslate(0.0f, (-documentData.f10001g) * j.e());
            this.J.preScale(f11, f11);
            path.transform(this.J);
            if (documentData.f10005k) {
                T(path, this.K, canvas);
                T(path, this.L, canvas);
            } else {
                T(path, this.L, canvas);
                T(path, this.K, canvas);
            }
        }
    }

    public final void R(String str, DocumentData documentData, Canvas canvas) {
        if (documentData.f10005k) {
            P(str, this.K, canvas);
            P(str, this.L, canvas);
        } else {
            P(str, this.L, canvas);
            P(str, this.K, canvas);
        }
    }

    public final void S(String str, DocumentData documentData, Canvas canvas, float f11) {
        int i11 = 0;
        while (i11 < str.length()) {
            String O = O(str, i11);
            i11 += O.length();
            R(O, documentData, canvas);
            canvas.translate(this.K.measureText(O) + f11, 0.0f);
        }
    }

    public final void T(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    public final void U(String str, DocumentData documentData, Matrix matrix, c1.b bVar, Canvas canvas, float f11, float f12) {
        DocumentData documentData2;
        Matrix matrix2;
        Canvas canvas2;
        float f13;
        float floatValue;
        int i11 = 0;
        while (i11 < str.length()) {
            c1.c cVar = this.Q.c().get(c1.c.c(str.charAt(i11), bVar.b(), bVar.d()));
            if (cVar == null) {
                documentData2 = documentData;
                matrix2 = matrix;
                canvas2 = canvas;
                f13 = f12;
            } else {
                documentData2 = documentData;
                matrix2 = matrix;
                canvas2 = canvas;
                f13 = f12;
                Q(cVar, matrix2, f13, documentData2, canvas2);
                float b11 = ((float) cVar.b()) * f13 * j.e() * f11;
                float f14 = documentData2.f9999e / 10.0f;
                z0.a<Float, Float> aVar = this.Y;
                if (aVar != null) {
                    floatValue = aVar.h().floatValue();
                } else {
                    z0.a<Float, Float> aVar2 = this.X;
                    if (aVar2 != null) {
                        floatValue = aVar2.h().floatValue();
                    }
                    canvas2.translate(b11 + (f14 * f11), 0.0f);
                }
                f14 += floatValue;
                canvas2.translate(b11 + (f14 * f11), 0.0f);
            }
            i11++;
            matrix = matrix2;
            f12 = f13;
            documentData = documentData2;
            canvas = canvas2;
        }
    }

    public final void V(DocumentData documentData, Matrix matrix, c1.b bVar, Canvas canvas) {
        Canvas canvas2 = canvas;
        z0.a<Float, Float> aVar = this.Z;
        float floatValue = (aVar != null ? aVar.h().floatValue() : documentData.f9997c) / 100.0f;
        float g11 = j.g(matrix);
        String str = documentData.f9995a;
        float e11 = documentData.f10000f * j.e();
        List<String> Z = Z(str);
        int size = Z.size();
        int i11 = 0;
        while (i11 < size) {
            String str2 = Z.get(i11);
            float Y = Y(str2, bVar, floatValue, g11);
            canvas2.save();
            N(documentData.f9998d, canvas2, Y);
            canvas2.translate(0.0f, (i11 * e11) - (((size - 1) * e11) / 2.0f));
            U(str2, documentData, matrix, bVar, canvas2, g11, floatValue);
            canvas.restore();
            i11++;
            canvas2 = canvas;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0090 A[LOOP:0: B:14:0x008e->B:15:0x0090, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W(com.airbnb.lottie.model.DocumentData r8, c1.b r9, android.graphics.Canvas r10) {
        /*
            r7 = this;
            android.graphics.Typeface r9 = r7.a0(r9)
            if (r9 != 0) goto L8
            goto Lc4
        L8:
            java.lang.String r0 = r8.f9995a
            com.airbnb.lottie.o0 r1 = r7.P
            com.airbnb.lottie.a1 r1 = r1.e0()
            if (r1 == 0) goto L1a
            java.lang.String r2 = r7.getName()
            java.lang.String r0 = r1.c(r2, r0)
        L1a:
            android.graphics.Paint r1 = r7.K
            r1.setTypeface(r9)
            z0.a<java.lang.Float, java.lang.Float> r9 = r7.Z
            if (r9 == 0) goto L2e
            java.lang.Object r9 = r9.h()
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            goto L30
        L2e:
            float r9 = r8.f9997c
        L30:
            android.graphics.Paint r1 = r7.K
            float r2 = j1.j.e()
            float r2 = r2 * r9
            r1.setTextSize(r2)
            android.graphics.Paint r1 = r7.L
            android.graphics.Paint r2 = r7.K
            android.graphics.Typeface r2 = r2.getTypeface()
            r1.setTypeface(r2)
            android.graphics.Paint r1 = r7.L
            android.graphics.Paint r2 = r7.K
            float r2 = r2.getTextSize()
            r1.setTextSize(r2)
            float r1 = r8.f10000f
            float r2 = j1.j.e()
            float r1 = r1 * r2
            int r2 = r8.f9999e
            float r2 = (float) r2
            r3 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 / r3
            z0.a<java.lang.Float, java.lang.Float> r3 = r7.Y
            if (r3 == 0) goto L6d
            java.lang.Object r3 = r3.h()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
        L6b:
            float r2 = r2 + r3
            goto L7c
        L6d:
            z0.a<java.lang.Float, java.lang.Float> r3 = r7.X
            if (r3 == 0) goto L7c
            java.lang.Object r3 = r3.h()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            goto L6b
        L7c:
            float r3 = j1.j.e()
            float r2 = r2 * r3
            float r2 = r2 * r9
            r9 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r9
            java.util.List r9 = r7.Z(r0)
            int r0 = r9.size()
            r3 = 0
        L8e:
            if (r3 >= r0) goto Lc4
            java.lang.Object r4 = r9.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            android.graphics.Paint r5 = r7.L
            float r5 = r5.measureText(r4)
            int r6 = r4.length()
            int r6 = r6 + (-1)
            float r6 = (float) r6
            float r6 = r6 * r2
            float r5 = r5 + r6
            r10.save()
            com.airbnb.lottie.model.DocumentData$Justification r6 = r8.f9998d
            r7.N(r6, r10, r5)
            int r5 = r0 + (-1)
            float r5 = (float) r5
            float r5 = r5 * r1
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r6
            float r6 = (float) r3
            float r6 = r6 * r1
            float r6 = r6 - r5
            r5 = 0
            r10.translate(r5, r6)
            r7.S(r4, r8, r10, r2)
            r10.restore()
            int r3 = r3 + 1
            goto L8e
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.f.W(com.airbnb.lottie.model.DocumentData, c1.b, android.graphics.Canvas):void");
    }

    public final List<y0.d> X(c1.c cVar) {
        if (this.M.containsKey(cVar)) {
            return this.M.get(cVar);
        }
        List<e1.k> a11 = cVar.a();
        int size = a11.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new y0.d(this.P, this, a11.get(i11)));
        }
        this.M.put(cVar, arrayList);
        return arrayList;
    }

    public final float Y(String str, c1.b bVar, float f11, float f12) {
        float f13 = 0.0f;
        for (int i11 = 0; i11 < str.length(); i11++) {
            c1.c cVar = this.Q.c().get(c1.c.c(str.charAt(i11), bVar.b(), bVar.d()));
            if (cVar != null) {
                f13 = (float) (f13 + (cVar.b() * f11 * j.e() * f12));
            }
        }
        return f13;
    }

    public final List<String> Z(String str) {
        return Arrays.asList(str.replaceAll("\r\n", c1.g.f7467d).replaceAll("\n", c1.g.f7467d).split(c1.g.f7467d));
    }

    @Override // com.airbnb.lottie.model.layer.a, y0.e
    public void a(RectF rectF, Matrix matrix, boolean z11) {
        super.a(rectF, matrix, z11);
        rectF.set(0.0f, 0.0f, this.Q.b().width(), this.Q.b().height());
    }

    @Nullable
    public final Typeface a0(c1.b bVar) {
        Typeface h11;
        z0.a<Typeface, Typeface> aVar = this.f50346a0;
        if (aVar != null && (h11 = aVar.h()) != null) {
            return h11;
        }
        Typeface f02 = this.P.f0(bVar.b(), bVar.d());
        return f02 != null ? f02 : bVar.e();
    }

    @Override // com.airbnb.lottie.model.layer.a, c1.e
    public <T> void b(T t11, @Nullable k1.j<T> jVar) {
        super.b(t11, jVar);
        if (t11 == t0.f10191a) {
            z0.a<Integer, Integer> aVar = this.S;
            if (aVar != null) {
                F(aVar);
            }
            if (jVar == null) {
                this.S = null;
                return;
            }
            q qVar = new q(jVar);
            this.S = qVar;
            qVar.a(this);
            i(this.S);
            return;
        }
        if (t11 == t0.f10192b) {
            z0.a<Integer, Integer> aVar2 = this.U;
            if (aVar2 != null) {
                F(aVar2);
            }
            if (jVar == null) {
                this.U = null;
                return;
            }
            q qVar2 = new q(jVar);
            this.U = qVar2;
            qVar2.a(this);
            i(this.U);
            return;
        }
        if (t11 == t0.f10209s) {
            z0.a<Float, Float> aVar3 = this.W;
            if (aVar3 != null) {
                F(aVar3);
            }
            if (jVar == null) {
                this.W = null;
                return;
            }
            q qVar3 = new q(jVar);
            this.W = qVar3;
            qVar3.a(this);
            i(this.W);
            return;
        }
        if (t11 == t0.f10210t) {
            z0.a<Float, Float> aVar4 = this.Y;
            if (aVar4 != null) {
                F(aVar4);
            }
            if (jVar == null) {
                this.Y = null;
                return;
            }
            q qVar4 = new q(jVar);
            this.Y = qVar4;
            qVar4.a(this);
            i(this.Y);
            return;
        }
        if (t11 == t0.F) {
            z0.a<Float, Float> aVar5 = this.Z;
            if (aVar5 != null) {
                F(aVar5);
            }
            if (jVar == null) {
                this.Z = null;
                return;
            }
            q qVar5 = new q(jVar);
            this.Z = qVar5;
            qVar5.a(this);
            i(this.Z);
            return;
        }
        if (t11 != t0.M) {
            if (t11 == t0.O) {
                this.O.q(jVar);
                return;
            }
            return;
        }
        z0.a<Typeface, Typeface> aVar6 = this.f50346a0;
        if (aVar6 != null) {
            F(aVar6);
        }
        if (jVar == null) {
            this.f50346a0 = null;
            return;
        }
        q qVar6 = new q(jVar);
        this.f50346a0 = qVar6;
        qVar6.a(this);
        i(this.f50346a0);
    }

    public final boolean b0(int i11) {
        return Character.getType(i11) == 16 || Character.getType(i11) == 27 || Character.getType(i11) == 6 || Character.getType(i11) == 28 || Character.getType(i11) == 8 || Character.getType(i11) == 19;
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void t(Canvas canvas, Matrix matrix, int i11) {
        canvas.save();
        if (!this.P.f1()) {
            canvas.concat(matrix);
        }
        DocumentData h11 = this.O.h();
        c1.b bVar = this.Q.g().get(h11.f9996b);
        if (bVar == null) {
            canvas.restore();
            return;
        }
        z0.a<Integer, Integer> aVar = this.S;
        if (aVar != null) {
            this.K.setColor(aVar.h().intValue());
        } else {
            z0.a<Integer, Integer> aVar2 = this.R;
            if (aVar2 != null) {
                this.K.setColor(aVar2.h().intValue());
            } else {
                this.K.setColor(h11.f10002h);
            }
        }
        z0.a<Integer, Integer> aVar3 = this.U;
        if (aVar3 != null) {
            this.L.setColor(aVar3.h().intValue());
        } else {
            z0.a<Integer, Integer> aVar4 = this.T;
            if (aVar4 != null) {
                this.L.setColor(aVar4.h().intValue());
            } else {
                this.L.setColor(h11.f10003i);
            }
        }
        int intValue = ((this.f10102x.h() == null ? 100 : this.f10102x.h().h().intValue()) * 255) / 100;
        this.K.setAlpha(intValue);
        this.L.setAlpha(intValue);
        z0.a<Float, Float> aVar5 = this.W;
        if (aVar5 != null) {
            this.L.setStrokeWidth(aVar5.h().floatValue());
        } else {
            z0.a<Float, Float> aVar6 = this.V;
            if (aVar6 != null) {
                this.L.setStrokeWidth(aVar6.h().floatValue());
            } else {
                this.L.setStrokeWidth(h11.f10004j * j.e() * j.g(matrix));
            }
        }
        if (this.P.f1()) {
            V(h11, matrix, bVar, canvas);
        } else {
            W(h11, bVar, canvas);
        }
        canvas.restore();
    }
}
