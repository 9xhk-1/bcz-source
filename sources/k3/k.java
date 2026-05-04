package k3;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l f65393a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final l[] f65394b;

    public k(@m80.k l currentItem, @m80.k l[] bindItems) {
        kotlin.jvm.internal.g0.p(currentItem, "currentItem");
        kotlin.jvm.internal.g0.p(bindItems, "bindItems");
        this.f65393a = currentItem;
        this.f65394b = bindItems;
    }

    public static /* synthetic */ k d(k kVar, l lVar, l[] lVarArr, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = kVar.f65393a;
        }
        if ((i11 & 2) != 0) {
            lVarArr = kVar.f65394b;
        }
        return kVar.c(lVar, lVarArr);
    }

    @m80.k
    public final l a() {
        return this.f65393a;
    }

    @m80.k
    public final l[] b() {
        return this.f65394b;
    }

    @m80.k
    public final k c(@m80.k l currentItem, @m80.k l[] bindItems) {
        kotlin.jvm.internal.g0.p(currentItem, "currentItem");
        kotlin.jvm.internal.g0.p(bindItems, "bindItems");
        return new k(currentItem, bindItems);
    }

    @m80.k
    public final l[] e() {
        return this.f65394b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.g0.g(this.f65393a, kVar.f65393a) && Arrays.equals(this.f65394b, kVar.f65394b);
    }

    @m80.k
    public final l f() {
        return this.f65393a;
    }

    public int hashCode() {
        return (this.f65393a.hashCode() * 31) + Arrays.hashCode(this.f65394b);
    }

    @m80.k
    public String toString() {
        return "BindInfo(currentItem=" + this.f65393a + ", bindItems=" + Arrays.toString(this.f65394b) + ')';
    }
}
