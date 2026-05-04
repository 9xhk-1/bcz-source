package k1;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class g extends j<Float> {
    public g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Float e(b<Float> bVar) {
        T t11 = this.f64905c;
        if (t11 != 0) {
            return (Float) t11;
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }

    @Override // k1.j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Float a(b<Float> bVar) {
        return Float.valueOf(j1.i.k(bVar.g().floatValue(), bVar.b().floatValue(), bVar.c()) + e(bVar).floatValue());
    }

    public g(@NonNull Float f11) {
        super(f11);
    }
}
