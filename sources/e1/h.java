package e1;

import androidx.annotation.Nullable;
import com.airbnb.lottie.o0;
import y0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class h implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f48305a;

    /* renamed from: b, reason: collision with root package name */
    public final d1.m<Float, Float> f48306b;

    public h(String str, d1.m<Float, Float> mVar) {
        this.f48305a = str;
        this.f48306b = mVar;
    }

    @Override // e1.c
    @Nullable
    public y0.c a(o0 o0Var, com.airbnb.lottie.model.layer.a aVar) {
        return new r(o0Var, aVar, this);
    }

    public d1.m<Float, Float> b() {
        return this.f48306b;
    }

    public String c() {
        return this.f48305a;
    }
}
