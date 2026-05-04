package g20;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\npredefinedEnhancementInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 predefinedEnhancementInfo.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/PredefinedFunctionEnhancementInfo\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,315:1\n1557#2:316\n1628#2,3:317\n*S KotlinDebug\n*F\n+ 1 predefinedEnhancementInfo.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/PredefinedFunctionEnhancementInfo\n*L\n41#1:316\n41#1:317,3\n*E\n"})
/* loaded from: classes8.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final f1 f52647a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<f1> f52648b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final String f52649c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final v0 f52650d;

    public v0() {
        this(null, null, null, 7, null);
    }

    @m80.l
    public final String a() {
        return this.f52649c;
    }

    @m80.k
    public final List<f1> b() {
        return this.f52648b;
    }

    @m80.l
    public final f1 c() {
        return this.f52647a;
    }

    @m80.l
    public final v0 d() {
        return this.f52650d;
    }

    public v0(@m80.l f1 f1Var, @m80.k List<f1> parametersInfo, @m80.l String str) {
        kotlin.jvm.internal.g0.p(parametersInfo, "parametersInfo");
        this.f52647a = f1Var;
        this.f52648b = parametersInfo;
        this.f52649c = str;
        v0 v0Var = null;
        if (str != null) {
            f1 a11 = f1Var != null ? f1Var.a() : null;
            List<f1> list = parametersInfo;
            ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
            for (f1 f1Var2 : list) {
                arrayList.add(f1Var2 != null ? f1Var2.a() : null);
            }
            v0Var = new v0(a11, arrayList, null);
        }
        this.f52650d = v0Var;
    }

    public /* synthetic */ v0(f1 f1Var, List list, String str, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? null : f1Var, (i11 & 2) != 0 ? a00.h0.J() : list, (i11 & 4) != 0 ? null : str);
    }
}
