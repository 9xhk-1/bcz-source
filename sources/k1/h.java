package k1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class h extends j<Integer> {
    /* JADX WARN: Multi-variable type inference failed */
    public Integer e(b<Integer> bVar) {
        T t11 = this.f64905c;
        if (t11 != 0) {
            return (Integer) t11;
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }

    @Override // k1.j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Integer a(b<Integer> bVar) {
        return Integer.valueOf(j1.i.l(bVar.g().intValue(), bVar.b().intValue(), bVar.c()) + e(bVar).intValue());
    }
}
