package fn;

import androidx.annotation.RestrictTo;
import com.google.android.material.color.utilities.Variant;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f52191a;

    /* renamed from: b, reason: collision with root package name */
    public final l f52192b;

    /* renamed from: c, reason: collision with root package name */
    public final Variant f52193c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f52194d;

    /* renamed from: e, reason: collision with root package name */
    public final double f52195e;

    /* renamed from: f, reason: collision with root package name */
    public final s6 f52196f;

    /* renamed from: g, reason: collision with root package name */
    public final s6 f52197g;

    /* renamed from: h, reason: collision with root package name */
    public final s6 f52198h;

    /* renamed from: i, reason: collision with root package name */
    public final s6 f52199i;

    /* renamed from: j, reason: collision with root package name */
    public final s6 f52200j;

    /* renamed from: k, reason: collision with root package name */
    public final s6 f52201k = s6.c(25.0d, 84.0d);

    public k(l lVar, Variant variant, boolean z11, double d11, s6 s6Var, s6 s6Var2, s6 s6Var3, s6 s6Var4, s6 s6Var5) {
        this.f52191a = lVar.k();
        this.f52192b = lVar;
        this.f52193c = variant;
        this.f52194d = z11;
        this.f52195e = d11;
        this.f52196f = s6Var;
        this.f52197g = s6Var2;
        this.f52198h = s6Var3;
        this.f52199i = s6Var4;
        this.f52200j = s6Var5;
    }

    public static double a(l lVar, double[] dArr, double[] dArr2) {
        double d11 = lVar.d();
        int i11 = 0;
        if (dArr2.length == 1) {
            return v5.g(d11 + dArr2[0]);
        }
        int length = dArr.length;
        while (i11 <= length - 2) {
            double d12 = dArr[i11];
            int i12 = i11 + 1;
            double d13 = dArr[i12];
            if (d12 < d11 && d11 < d13) {
                return v5.g(d11 + dArr2[i11]);
            }
            i11 = i12;
        }
        return d11;
    }
}
