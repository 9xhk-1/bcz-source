package androidx.constraintlayout.compose;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintSetForInlineDsl$observer$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2303:1\n1#2:2304\n*E\n"})
/* loaded from: classes2.dex */
public final class ConstraintSetForInlineDsl$observer$1 extends Lambda implements l<x00.a<? extends g2>, g2> {
    final /* synthetic */ ConstraintSetForInlineDsl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintSetForInlineDsl$observer$1(ConstraintSetForInlineDsl constraintSetForInlineDsl) {
        super(1);
        this.this$0 = constraintSetForInlineDsl;
    }

    @Override // x00.l
    public /* bridge */ /* synthetic */ g2 invoke(x00.a<? extends g2> aVar) {
        invoke2((x00.a<g2>) aVar);
        return g2.f100423a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final x00.a<g2> aVar) {
        Handler handler;
        if (g0.g(Looper.myLooper(), Looper.getMainLooper())) {
            aVar.invoke();
            return;
        }
        handler = this.this$0.handler;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
            this.this$0.handler = handler;
        }
        handler.post(new Runnable() { // from class: androidx.constraintlayout.compose.a
            @Override // java.lang.Runnable
            public final void run() {
                x00.a.this.invoke();
            }
        });
    }
}
