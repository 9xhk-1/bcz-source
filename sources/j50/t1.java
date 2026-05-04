package j50;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.h
/* loaded from: classes8.dex */
public abstract class t1 extends i3<String> {
    @m80.k
    public String H(@m80.k String parentName, @m80.k String childName) {
        kotlin.jvm.internal.g0.p(parentName, "parentName");
        kotlin.jvm.internal.g0.p(childName, "childName");
        if (parentName.length() == 0) {
            return childName;
        }
        return parentName + '.' + childName;
    }

    @m80.k
    public String I(@m80.k h50.f descriptor, int i11) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        return descriptor.i(i11);
    }

    @Override // j50.i3
    @m80.k
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final String E(@m80.k h50.f fVar, int i11) {
        kotlin.jvm.internal.g0.p(fVar, "<this>");
        return K(I(fVar, i11));
    }

    @m80.k
    public final String K(@m80.k String nestedName) {
        kotlin.jvm.internal.g0.p(nestedName, "nestedName");
        String D = D();
        if (D == null) {
            D = "";
        }
        return H(D, nestedName);
    }
}
