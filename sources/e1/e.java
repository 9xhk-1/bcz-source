package e1;

import android.graphics.Path;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.o0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e implements c {

    /* renamed from: a, reason: collision with root package name */
    public final GradientType f48285a;

    /* renamed from: b, reason: collision with root package name */
    public final Path.FillType f48286b;

    /* renamed from: c, reason: collision with root package name */
    public final d1.c f48287c;

    /* renamed from: d, reason: collision with root package name */
    public final d1.d f48288d;

    /* renamed from: e, reason: collision with root package name */
    public final d1.f f48289e;

    /* renamed from: f, reason: collision with root package name */
    public final d1.f f48290f;

    /* renamed from: g, reason: collision with root package name */
    public final String f48291g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public final d1.b f48292h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public final d1.b f48293i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f48294j;

    public e(String str, GradientType gradientType, Path.FillType fillType, d1.c cVar, d1.d dVar, d1.f fVar, d1.f fVar2, d1.b bVar, d1.b bVar2, boolean z11) {
        this.f48285a = gradientType;
        this.f48286b = fillType;
        this.f48287c = cVar;
        this.f48288d = dVar;
        this.f48289e = fVar;
        this.f48290f = fVar2;
        this.f48291g = str;
        this.f48292h = bVar;
        this.f48293i = bVar2;
        this.f48294j = z11;
    }

    @Override // e1.c
    public y0.c a(o0 o0Var, com.airbnb.lottie.model.layer.a aVar) {
        return new y0.h(o0Var, aVar, this);
    }

    public d1.f b() {
        return this.f48290f;
    }

    public Path.FillType c() {
        return this.f48286b;
    }

    public d1.c d() {
        return this.f48287c;
    }

    public GradientType e() {
        return this.f48285a;
    }

    public String f() {
        return this.f48291g;
    }

    public d1.d g() {
        return this.f48288d;
    }

    public d1.f h() {
        return this.f48289e;
    }

    public boolean i() {
        return this.f48294j;
    }
}
