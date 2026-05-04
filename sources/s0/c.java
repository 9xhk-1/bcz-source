package s0;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.Px;
import coil.size.Scale;
import kotlin.Pair;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import q0.c;
import q0.g;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRoundedCornersTransformation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundedCornersTransformation.kt\ncoil/transform/RoundedCornersTransformation\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dimension.kt\ncoil/size/-Dimensions\n*L\n1#1,132:1\n95#2:133\n43#2,2:134\n45#2:137\n1#3:136\n57#4:138\n57#4:139\n*S KotlinDebug\n*F\n+ 1 RoundedCornersTransformation.kt\ncoil/transform/RoundedCornersTransformation\n*L\n58#1:133\n59#1:134,2\n59#1:137\n106#1:138\n107#1:139\n*E\n"})
/* loaded from: classes3.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f87063a;

    /* renamed from: b, reason: collision with root package name */
    public final float f87064b;

    /* renamed from: c, reason: collision with root package name */
    public final float f87065c;

    /* renamed from: d, reason: collision with root package name */
    public final float f87066d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f87067e;

    public c() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    @Override // s0.d
    @l
    public Object a(@k Bitmap bitmap, @k g gVar, @k j00.c<? super Bitmap> cVar) {
        Paint paint = new Paint(3);
        Pair<Integer, Integer> b11 = b(bitmap, gVar);
        int intValue = b11.component1().intValue();
        int intValue2 = b11.component2().intValue();
        Bitmap createBitmap = Bitmap.createBitmap(intValue, intValue2, u0.a.d(bitmap));
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        Matrix matrix = new Matrix();
        float c11 = (float) f0.g.c(bitmap.getWidth(), bitmap.getHeight(), intValue, intValue2, Scale.FILL);
        float f11 = 2;
        matrix.setTranslate((intValue - (bitmap.getWidth() * c11)) / f11, (intValue2 - (bitmap.getHeight() * c11)) / f11);
        matrix.preScale(c11, c11);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        float f12 = this.f87063a;
        float f13 = this.f87064b;
        float f14 = this.f87066d;
        float f15 = this.f87065c;
        float[] fArr = {f12, f12, f13, f13, f14, f14, f15, f15};
        RectF rectF = new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paint);
        return createBitmap;
    }

    public final Pair<Integer, Integer> b(Bitmap bitmap, g gVar) {
        if (q0.b.f(gVar)) {
            return h1.a(Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
        }
        q0.c a11 = gVar.a();
        q0.c b11 = gVar.b();
        if ((a11 instanceof c.a) && (b11 instanceof c.a)) {
            return h1.a(Integer.valueOf(((c.a) a11).f81358a), Integer.valueOf(((c.a) b11).f81358a));
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        q0.c f11 = gVar.f();
        int i11 = f11 instanceof c.a ? ((c.a) f11).f81358a : Integer.MIN_VALUE;
        q0.c e11 = gVar.e();
        double c11 = f0.g.c(width, height, i11, e11 instanceof c.a ? ((c.a) e11).f81358a : Integer.MIN_VALUE, Scale.FILL);
        return h1.a(Integer.valueOf(c10.d.K0(bitmap.getWidth() * c11)), Integer.valueOf(c10.d.K0(c11 * bitmap.getHeight())));
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f87063a == cVar.f87063a && this.f87064b == cVar.f87064b && this.f87065c == cVar.f87065c && this.f87066d == cVar.f87066d;
    }

    @Override // s0.d
    @k
    public String getCacheKey() {
        return this.f87067e;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f87063a) * 31) + Float.hashCode(this.f87064b)) * 31) + Float.hashCode(this.f87065c)) * 31) + Float.hashCode(this.f87066d);
    }

    public c(@Px float f11, @Px float f12, @Px float f13, @Px float f14) {
        this.f87063a = f11;
        this.f87064b = f12;
        this.f87065c = f13;
        this.f87066d = f14;
        if (f11 < 0.0f || f12 < 0.0f || f13 < 0.0f || f14 < 0.0f) {
            throw new IllegalArgumentException("All radii must be >= 0.");
        }
        this.f87067e = c.class.getName() + '-' + f11 + ',' + f12 + ',' + f13 + ',' + f14;
    }

    public /* synthetic */ c(float f11, float f12, float f13, float f14, int i11, v vVar) {
        this((i11 & 1) != 0 ? 0.0f : f11, (i11 & 2) != 0 ? 0.0f : f12, (i11 & 4) != 0 ? 0.0f : f13, (i11 & 8) != 0 ? 0.0f : f14);
    }

    public c(@Px float f11) {
        this(f11, f11, f11, f11);
    }
}
