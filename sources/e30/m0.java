package e30;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nTypeSubstitution.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeSubstitution.kt\norg/jetbrains/kotlin/types/IndexedParametersSubstitution\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,207:1\n37#2,2:208\n*S KotlinDebug\n*F\n+ 1 TypeSubstitution.kt\norg/jetbrains/kotlin/types/IndexedParametersSubstitution\n*L\n127#1:208,2\n*E\n"})
/* loaded from: classes8.dex */
public final class m0 extends d2 {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final p10.c1[] f48621c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final a2[] f48622d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f48623e;

    public /* synthetic */ m0(p10.c1[] c1VarArr, a2[] a2VarArr, boolean z11, int i11, kotlin.jvm.internal.v vVar) {
        this(c1VarArr, a2VarArr, (i11 & 4) != 0 ? false : z11);
    }

    @Override // e30.d2
    public boolean b() {
        return this.f48623e;
    }

    @Override // e30.d2
    @m80.l
    public a2 e(@m80.k r0 key) {
        kotlin.jvm.internal.g0.p(key, "key");
        p10.d r11 = key.I0().r();
        p10.c1 c1Var = r11 instanceof p10.c1 ? (p10.c1) r11 : null;
        if (c1Var == null) {
            return null;
        }
        int index = c1Var.getIndex();
        p10.c1[] c1VarArr = this.f48621c;
        if (index >= c1VarArr.length || !kotlin.jvm.internal.g0.g(c1VarArr[index].o(), c1Var.o())) {
            return null;
        }
        return this.f48622d[index];
    }

    @Override // e30.d2
    public boolean f() {
        return this.f48622d.length == 0;
    }

    @m80.k
    public final a2[] i() {
        return this.f48622d;
    }

    @m80.k
    public final p10.c1[] j() {
        return this.f48621c;
    }

    public m0(@m80.k p10.c1[] parameters, @m80.k a2[] arguments, boolean z11) {
        kotlin.jvm.internal.g0.p(parameters, "parameters");
        kotlin.jvm.internal.g0.p(arguments, "arguments");
        this.f48621c = parameters;
        this.f48622d = arguments;
        this.f48623e = z11;
        int length = parameters.length;
        int length2 = arguments.length;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m0(@m80.k List<? extends p10.c1> parameters, @m80.k List<? extends a2> argumentsList) {
        this((p10.c1[]) parameters.toArray(new p10.c1[0]), (a2[]) argumentsList.toArray(new a2[0]), false, 4, null);
        kotlin.jvm.internal.g0.p(parameters, "parameters");
        kotlin.jvm.internal.g0.p(argumentsList, "argumentsList");
    }
}
