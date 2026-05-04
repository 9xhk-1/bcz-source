package y0;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.o0;
import java.util.ArrayList;
import java.util.List;
import z0.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class r implements t, a.b {

    /* renamed from: e, reason: collision with root package name */
    public static final float f98915e = 0.5519f;

    /* renamed from: a, reason: collision with root package name */
    public final o0 f98916a;

    /* renamed from: b, reason: collision with root package name */
    public final String f98917b;

    /* renamed from: c, reason: collision with root package name */
    public final z0.a<Float, Float> f98918c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public e1.i f98919d;

    public r(o0 o0Var, com.airbnb.lottie.model.layer.a aVar, e1.h hVar) {
        this.f98916a = o0Var;
        this.f98917b = hVar.c();
        z0.a<Float, Float> k11 = hVar.b().k();
        this.f98918c = k11;
        aVar.i(k11);
        k11.a(this);
    }

    public static int b(int i11, int i12) {
        int i13 = i11 / i12;
        return ((i11 ^ i12) >= 0 || i12 * i13 == i11) ? i13 : i13 - 1;
    }

    public static int c(int i11, int i12) {
        return i11 - (b(i11, i12) * i12);
    }

    @Override // z0.a.b
    public void e() {
        this.f98916a.invalidateSelf();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009e, code lost:
    
        if (r7 == (r0.size() - 1)) goto L27;
     */
    @Override // y0.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e1.i g(e1.i r19) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.r.g(e1.i):e1.i");
    }

    @Override // y0.c
    public String getName() {
        return this.f98917b;
    }

    public z0.a<Float, Float> h() {
        return this.f98918c;
    }

    @NonNull
    public final e1.i i(e1.i iVar) {
        List<c1.a> a11 = iVar.a();
        boolean d11 = iVar.d();
        int size = a11.size() - 1;
        int i11 = 0;
        while (size >= 0) {
            c1.a aVar = a11.get(size);
            c1.a aVar2 = a11.get(c(size - 1, a11.size()));
            PointF c11 = (size != 0 || d11) ? aVar2.c() : iVar.b();
            i11 = (((size != 0 || d11) ? aVar2.b() : c11).equals(c11) && aVar.a().equals(c11) && !(!iVar.d() && size == 0 && size == a11.size() - 1)) ? i11 + 2 : i11 + 1;
            size--;
        }
        e1.i iVar2 = this.f98919d;
        if (iVar2 == null || iVar2.a().size() != i11) {
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 < i11; i12++) {
                arrayList.add(new c1.a());
            }
            this.f98919d = new e1.i(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.f98919d.e(d11);
        return this.f98919d;
    }

    @Override // y0.c
    public void f(List<c> list, List<c> list2) {
    }
}
