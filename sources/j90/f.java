package j90;

import org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class f extends n<Enum> implements m {

    /* renamed from: c, reason: collision with root package name */
    public h f63916c = new h();

    @Override // j90.n, j90.m
    public String H() {
        return "undesired " + super.H();
    }

    @Override // j90.m
    public int[] V(NormalizedString[] normalizedStringArr) {
        if (normalizedStringArr == null) {
            return null;
        }
        this.f63916c.i(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.C(e()));
        return this.f63916c.V(normalizedStringArr);
    }

    @Override // j90.m
    public int[] i0(String[] strArr) {
        return V(NormalizedString.toIdentifierGroupArray(strArr));
    }

    @Override // j90.n
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public f clone() {
        f fVar = (f) super.clone();
        fVar.f63916c = (h) this.f63916c.clone();
        return fVar;
    }
}
