package androidx.activity.compose;

import kotlin.jvm.internal.FunctionReferenceImpl;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public /* synthetic */ class ReportDrawnComposition$checkReporter$1 extends FunctionReferenceImpl implements l<x00.a<? extends Boolean>, g2> {
    public ReportDrawnComposition$checkReporter$1(Object obj) {
        super(1, obj, ReportDrawnComposition.class, "observeReporter", "observeReporter(Lkotlin/jvm/functions/Function0;)V", 0);
    }

    @Override // x00.l
    public /* bridge */ /* synthetic */ g2 invoke(x00.a<? extends Boolean> aVar) {
        invoke2((x00.a<Boolean>) aVar);
        return g2.f100423a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(x00.a<Boolean> aVar) {
        ((ReportDrawnComposition) this.receiver).observeReporter(aVar);
    }
}
