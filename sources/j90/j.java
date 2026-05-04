package j90;

import org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class j extends n<Enum> implements m {

    /* renamed from: c, reason: collision with root package name */
    public l f63930c = new l();

    @Override // j90.m
    public int[] V(NormalizedString[] normalizedStringArr) {
        if (normalizedStringArr == null) {
            return null;
        }
        this.f63930c.i(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.C(e()));
        return this.f63930c.V(normalizedStringArr);
    }

    @Override // j90.m
    public int[] i0(String[] strArr) {
        return V(NormalizedString.toIdentifierGroupArray(strArr));
    }

    @Override // j90.n
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public j clone() {
        j jVar = (j) super.clone();
        jVar.f63930c = (l) this.f63930c.clone();
        return jVar;
    }

    public int l(Enum r22) {
        return this.f63930c.j(r22.toString());
    }
}
