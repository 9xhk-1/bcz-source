package p10;

import i30.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nValueClassRepresentation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueClassRepresentation.kt\norg/jetbrains/kotlin/descriptors/ValueClassRepresentation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,50:1\n1557#2:51\n1628#2,3:52\n*S KotlinDebug\n*F\n+ 1 ValueClassRepresentation.kt\norg/jetbrains/kotlin/descriptors/ValueClassRepresentation\n*L\n22#1:51\n22#1:52,3\n*E\n"})
/* loaded from: classes8.dex */
public abstract class h1<Type extends i30.h> {
    public /* synthetic */ h1(kotlin.jvm.internal.v vVar) {
        this();
    }

    public abstract boolean a(@m80.k n20.f fVar);

    @m80.k
    public final <Other extends i30.h> h1<Other> b(@m80.k x00.l<? super Type, ? extends Other> transform) {
        kotlin.jvm.internal.g0.p(transform, "transform");
        if (this instanceof u) {
            u uVar = (u) this;
            return new u(uVar.c(), transform.invoke(uVar.d()));
        }
        if (!(this instanceof b0)) {
            throw new NoWhenBranchMatchedException();
        }
        List<Pair<n20.f, Type>> c11 = ((b0) this).c();
        ArrayList arrayList = new ArrayList(a00.i0.d0(c11, 10));
        Iterator<T> it = c11.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add(yz.h1.a((n20.f) pair.component1(), transform.invoke((i30.h) pair.component2())));
        }
        return new b0(arrayList);
    }

    public h1() {
    }
}
