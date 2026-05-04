package ku;

import com.typesafe.config.ConfigException;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class b0 extends a {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f68611a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<b2> f68612b;

    public b0(s0 s0Var, Collection<b2> collection) {
        this.f68611a = s0Var;
        this.f68612b = new ArrayList<>(collection);
    }

    @Override // ku.a
    public Collection<b2> a() {
        return this.f68612b;
    }

    public b0 c() {
        ArrayList arrayList = new ArrayList(this.f68612b);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (e2.o((b2) arrayList.get(i11)) && ((b2) arrayList.get(i11)).e().equals(".")) {
                return new b0(this.f68611a.n(0, 1), arrayList.subList(0, i11));
            }
        }
        return this;
    }

    public b0 d(int i11) {
        ArrayList arrayList = new ArrayList(this.f68612b);
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (e2.o((b2) arrayList.get(i13)) && ((b2) arrayList.get(i13)).e().equals(".")) {
                i12++;
            }
            if (i12 == i11) {
                return new b0(this.f68611a.m(i11), arrayList.subList(i13 + 1, arrayList.size()));
            }
        }
        throw new ConfigException.BugOrBroken("Tried to remove too many elements from a Path node");
    }

    public s0 e() {
        return this.f68611a;
    }
}
