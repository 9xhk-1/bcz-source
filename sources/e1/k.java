package e1;

import com.airbnb.lottie.o0;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class k implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f48316a;

    /* renamed from: b, reason: collision with root package name */
    public final List<c> f48317b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f48318c;

    public k(String str, List<c> list, boolean z11) {
        this.f48316a = str;
        this.f48317b = list;
        this.f48318c = z11;
    }

    @Override // e1.c
    public y0.c a(o0 o0Var, com.airbnb.lottie.model.layer.a aVar) {
        return new y0.d(o0Var, aVar, this);
    }

    public List<c> b() {
        return this.f48317b;
    }

    public String c() {
        return this.f48316a;
    }

    public boolean d() {
        return this.f48318c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f48316a + "' Shapes: " + Arrays.toString(this.f48317b.toArray()) + l50.b.f69928j;
    }
}
