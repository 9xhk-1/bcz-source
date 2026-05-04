package ok;

import android.graphics.Bitmap;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.DecodeFormat;
import fl.o;
import java.util.HashMap;
import lk.e;
import mk.j;
import ok.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final j f77089a;

    /* renamed from: b, reason: collision with root package name */
    public final e f77090b;

    /* renamed from: c, reason: collision with root package name */
    public final DecodeFormat f77091c;

    /* renamed from: d, reason: collision with root package name */
    public a f77092d;

    public b(j jVar, e eVar, DecodeFormat decodeFormat) {
        this.f77089a = jVar;
        this.f77090b = eVar;
        this.f77091c = decodeFormat;
    }

    public static int b(d dVar) {
        return o.h(dVar.d(), dVar.b(), dVar.a());
    }

    @VisibleForTesting
    public c a(d... dVarArr) {
        long a11 = (this.f77089a.a() - this.f77089a.getCurrentSize()) + this.f77090b.a();
        int i11 = 0;
        for (d dVar : dVarArr) {
            i11 += dVar.c();
        }
        float f11 = a11 / i11;
        HashMap hashMap = new HashMap();
        for (d dVar2 : dVarArr) {
            hashMap.put(dVar2, Integer.valueOf(Math.round(dVar2.c() * f11) / b(dVar2)));
        }
        return new c(hashMap);
    }

    public void c(d.a... aVarArr) {
        a aVar = this.f77092d;
        if (aVar != null) {
            aVar.b();
        }
        d[] dVarArr = new d[aVarArr.length];
        for (int i11 = 0; i11 < aVarArr.length; i11++) {
            d.a aVar2 = aVarArr[i11];
            if (aVar2.b() == null) {
                aVar2.c(this.f77091c == DecodeFormat.PREFER_ARGB_8888 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            }
            dVarArr[i11] = aVar2.a();
        }
        a aVar3 = new a(this.f77090b, this.f77089a, a(dVarArr));
        this.f77092d = aVar3;
        o.z(aVar3);
    }
}
