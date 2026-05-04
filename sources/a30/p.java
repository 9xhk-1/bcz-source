package a30;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDeserializedClassDataFinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedClassDataFinder.kt\norg/jetbrains/kotlin/serialization/deserialization/DeserializedClassDataFinder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"})
/* loaded from: classes8.dex */
public final class p implements i {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final p10.h0 f1845a;

    public p(@m80.k p10.h0 packageFragmentProvider) {
        kotlin.jvm.internal.g0.p(packageFragmentProvider, "packageFragmentProvider");
        this.f1845a = packageFragmentProvider;
    }

    @Override // a30.i
    @m80.l
    public h a(@m80.k n20.b classId) {
        h a11;
        kotlin.jvm.internal.g0.p(classId, "classId");
        for (p10.g0 g0Var : p10.l0.c(this.f1845a, classId.f())) {
            if ((g0Var instanceof q) && (a11 = ((q) g0Var).E0().a(classId)) != null) {
                return a11;
            }
        }
        return null;
    }
}
