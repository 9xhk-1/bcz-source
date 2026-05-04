package androidx.room;

import java.util.Set;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public /* synthetic */ class InvalidationTracker$implementation$1 extends FunctionReferenceImpl implements x00.l<Set<? extends Integer>, g2> {
    public InvalidationTracker$implementation$1(Object obj) {
        super(1, obj, InvalidationTracker.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0);
    }

    @Override // x00.l
    public /* bridge */ /* synthetic */ g2 invoke(Set<? extends Integer> set) {
        invoke2((Set<Integer>) set);
        return g2.f100423a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Set<Integer> p02) {
        g0.p(p02, "p0");
        ((InvalidationTracker) this.receiver).notifyInvalidatedObservers(p02);
    }
}
