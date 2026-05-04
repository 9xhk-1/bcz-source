package e1;

import android.graphics.Path;
import androidx.annotation.Nullable;
import com.airbnb.lottie.o0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class j implements c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f48310a;

    /* renamed from: b, reason: collision with root package name */
    public final Path.FillType f48311b;

    /* renamed from: c, reason: collision with root package name */
    public final String f48312c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public final d1.a f48313d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public final d1.d f48314e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f48315f;

    public j(String str, boolean z11, Path.FillType fillType, @Nullable d1.a aVar, @Nullable d1.d dVar, boolean z12) {
        this.f48312c = str;
        this.f48310a = z11;
        this.f48311b = fillType;
        this.f48313d = aVar;
        this.f48314e = dVar;
        this.f48315f = z12;
    }

    @Override // e1.c
    public y0.c a(o0 o0Var, com.airbnb.lottie.model.layer.a aVar) {
        return new y0.g(o0Var, aVar, this);
    }

    @Nullable
    public d1.a b() {
        return this.f48313d;
    }

    public Path.FillType c() {
        return this.f48311b;
    }

    public String d() {
        return this.f48312c;
    }

    @Nullable
    public d1.d e() {
        return this.f48314e;
    }

    public boolean f() {
        return this.f48315f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f48310a + l50.b.f69928j;
    }
}
