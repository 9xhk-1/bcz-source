package androidx.compose.material;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.a;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.material.ModalBottomSheetKt$Scrim$dismissModifier$1$1", f = "ModalBottomSheet.kt", i = {}, l = {497}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class ModalBottomSheetKt$Scrim$dismissModifier$1$1 extends SuspendLambda implements p<PointerInputScope, c<? super g2>, Object> {
    final /* synthetic */ a<g2> $onDismiss;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$Scrim$dismissModifier$1$1(a<g2> aVar, c<? super ModalBottomSheetKt$Scrim$dismissModifier$1$1> cVar) {
        super(2, cVar);
        this.$onDismiss = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        ModalBottomSheetKt$Scrim$dismissModifier$1$1 modalBottomSheetKt$Scrim$dismissModifier$1$1 = new ModalBottomSheetKt$Scrim$dismissModifier$1$1(this.$onDismiss, cVar);
        modalBottomSheetKt$Scrim$dismissModifier$1$1.L$0 = obj;
        return modalBottomSheetKt$Scrim$dismissModifier$1$1;
    }

    @Override // x00.p
    public final Object invoke(PointerInputScope pointerInputScope, c<? super g2> cVar) {
        return ((ModalBottomSheetKt$Scrim$dismissModifier$1$1) create(pointerInputScope, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            final a<g2> aVar = this.$onDismiss;
            l<Offset, g2> lVar = new l<Offset, g2>() { // from class: androidx.compose.material.ModalBottomSheetKt$Scrim$dismissModifier$1$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Offset offset) {
                    m1705invokek4lQ0M(offset.m2278unboximpl());
                    return g2.f100423a;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m1705invokek4lQ0M(long j11) {
                    aVar.invoke();
                }
            };
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, lVar, this, 7, null) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
        }
        return g2.f100423a;
    }
}
