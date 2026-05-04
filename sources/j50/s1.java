package j50;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.h
/* loaded from: classes8.dex */
public abstract class s1 extends h3<String> {
    @m80.k
    public String N(@m80.k String parentName, @m80.k String childName) {
        kotlin.jvm.internal.g0.p(parentName, "parentName");
        kotlin.jvm.internal.g0.p(childName, "childName");
        if (parentName.length() == 0) {
            return childName;
        }
        return parentName + '.' + childName;
    }

    @m80.k
    public String O(@m80.k h50.f descriptor, int i11) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        return descriptor.i(i11);
    }

    @Override // j50.h3
    @m80.k
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final String I(@m80.k h50.f fVar, int i11) {
        kotlin.jvm.internal.g0.p(fVar, "<this>");
        return Q(O(fVar, i11));
    }

    @m80.k
    public final String Q(@m80.k String nestedName) {
        kotlin.jvm.internal.g0.p(nestedName, "nestedName");
        String H = H();
        if (H == null) {
            H = "";
        }
        return N(H, nestedName);
    }

    @m80.k
    public final String R() {
        return J().isEmpty() ? "$" : a00.r0.r3(J(), ".", "$.", null, 0, null, null, 60, null);
    }
}
