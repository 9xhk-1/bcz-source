package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DelegatingNode;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@ExperimentalFoundationApi
/* loaded from: classes.dex */
final class LegacyDragSourceNodeWithDefaultPainter extends DelegatingNode {

    @k
    private p<? super DragAndDropSourceScope, ? super c<? super g2>, ? extends Object> dragAndDropSourceHandler;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "androidx.compose.foundation.draganddrop.LegacyDragSourceNodeWithDefaultPainter$2", f = "LegacyDragAndDropSourceWithDefaultPainter.android.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.draganddrop.LegacyDragSourceNodeWithDefaultPainter$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements p<DragAndDropSourceScope, c<? super g2>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(Object obj, c<?> cVar) {
            AnonymousClass2 anonymousClass2 = LegacyDragSourceNodeWithDefaultPainter.this.new AnonymousClass2(cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // x00.p
        public final Object invoke(DragAndDropSourceScope dragAndDropSourceScope, c<? super g2> cVar) {
            return ((AnonymousClass2) create(dragAndDropSourceScope, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = b.l();
            int i11 = this.label;
            if (i11 == 0) {
                e.n(obj);
                DragAndDropSourceScope dragAndDropSourceScope = (DragAndDropSourceScope) this.L$0;
                p<DragAndDropSourceScope, c<? super g2>, Object> dragAndDropSourceHandler = LegacyDragSourceNodeWithDefaultPainter.this.getDragAndDropSourceHandler();
                this.label = 1;
                if (dragAndDropSourceHandler.invoke(dragAndDropSourceScope, this) == l11) {
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

    public LegacyDragSourceNodeWithDefaultPainter(@k p<? super DragAndDropSourceScope, ? super c<? super g2>, ? extends Object> pVar) {
        this.dragAndDropSourceHandler = pVar;
        final CacheDrawScopeDragShadowCallback cacheDrawScopeDragShadowCallback = new CacheDrawScopeDragShadowCallback();
        delegate(DrawModifierKt.CacheDrawModifierNode(new LegacyDragSourceNodeWithDefaultPainter$cacheDrawScopeDragShadowCallback$1$1(cacheDrawScopeDragShadowCallback)));
        delegate(new LegacyDragAndDropSourceNode(new l<DrawScope, g2>() { // from class: androidx.compose.foundation.draganddrop.LegacyDragSourceNodeWithDefaultPainter.1
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope drawScope) {
                CacheDrawScopeDragShadowCallback.this.drawDragShadow(drawScope);
            }
        }, new AnonymousClass2(null)));
    }

    @k
    public final p<DragAndDropSourceScope, c<? super g2>, Object> getDragAndDropSourceHandler() {
        return this.dragAndDropSourceHandler;
    }

    public final void setDragAndDropSourceHandler(@k p<? super DragAndDropSourceScope, ? super c<? super g2>, ? extends Object> pVar) {
        this.dragAndDropSourceHandler = pVar;
    }
}
