package b5;

import com.baicizhan.app.api.service.model.game.RewardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nSubmitGameCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubmitGameCommand.kt\ncom/baicizhan/app/biz/game/impl/unity/command/SubmitGameCommandKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,115:1\n1563#2:116\n1634#2,3:117\n1563#2:120\n1634#2,3:121\n*S KotlinDebug\n*F\n+ 1 SubmitGameCommand.kt\ncom/baicizhan/app/biz/game/impl/unity/command/SubmitGameCommandKt\n*L\n98#1:116\n98#1:117,3\n105#1:120\n105#1:121,3\n*E\n"})
/* loaded from: classes3.dex */
public final class w1 {
    @m80.k
    public static final m3.v0 a(@m80.k p8.d dVar) {
        kotlin.jvm.internal.g0.p(dVar, "<this>");
        return new m3.v0(RewardType.Companion.a(dVar.f79732a), dVar.f79733b, (String) null, 4, (kotlin.jvm.internal.v) null);
    }

    @m80.k
    public static final m3.k b(@m80.k p8.c cVar) {
        kotlin.jvm.internal.g0.p(cVar, "<this>");
        int i11 = cVar.f79706a;
        List<p8.d> list = cVar.f79707b;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a((p8.d) it.next()));
        }
        return new m3.k(i11, arrayList);
    }

    @m80.k
    public static final m3.z c(@m80.k p8.y yVar) {
        kotlin.jvm.internal.g0.p(yVar, "<this>");
        return new m3.z(yVar.f80254a, yVar.f80255b, yVar.f80256c, yVar.f80257d, yVar.f80258e, yVar.f80260g, yVar.f80261h, yVar.f80262i, yVar.f80259f);
    }

    @m80.k
    public static final m3.z0 d(@m80.k p8.g0 g0Var) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        int i11 = g0Var.f79826a;
        int i12 = g0Var.f79827b;
        List<p8.c> list = g0Var.f79828c;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b((p8.c) it.next()));
        }
        return new m3.z0(i11, i12, arrayList);
    }
}
