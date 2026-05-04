package androidx.constraintlayout.compose;

import e40.o;
import kotlin.jvm.internal.Lambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class ConstraintLayoutKt$ConstraintLayout$3$1 extends Lambda implements x00.a<g2> {
    final /* synthetic */ o<ConstraintSet> $channel;
    final /* synthetic */ ConstraintSet $constraintSet;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutKt$ConstraintLayout$3$1(o<ConstraintSet> oVar, ConstraintSet constraintSet) {
        super(0);
        this.$channel = oVar;
        this.$constraintSet = constraintSet;
    }

    @Override // x00.a
    public /* bridge */ /* synthetic */ g2 invoke() {
        invoke2();
        return g2.f100423a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$channel.m(this.$constraintSet);
    }
}
