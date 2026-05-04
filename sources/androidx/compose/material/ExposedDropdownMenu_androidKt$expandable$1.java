package androidx.compose.material;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.a;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.material.ExposedDropdownMenu_androidKt$expandable$1", f = "ExposedDropdownMenu.kt", i = {}, l = {446}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class ExposedDropdownMenu_androidKt$expandable$1 extends SuspendLambda implements p<PointerInputScope, c<? super g2>, Object> {
    final /* synthetic */ a<g2> $onExpandedChange;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "androidx.compose.material.ExposedDropdownMenu_androidKt$expandable$1$1", f = "ExposedDropdownMenu.kt", i = {0}, l = {450, 451}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
    /* renamed from: androidx.compose.material.ExposedDropdownMenu_androidKt$expandable$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, c<? super g2>, Object> {
        final /* synthetic */ a<g2> $onExpandedChange;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a<g2> aVar, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$onExpandedChange = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onExpandedChange, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // x00.p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, c<? super g2> cVar) {
            return ((AnonymousClass1) create(awaitPointerEventScope, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
        
            if (r11 == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r10.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                kotlin.e.n(r11)
                r7 = r10
                goto L4c
            L13:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1b:
                java.lang.Object r1 = r10.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.e.n(r11)
                r7 = r10
                goto L3e
            L24:
                kotlin.e.n(r11)
                java.lang.Object r11 = r10.L$0
                r4 = r11
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r4
                androidx.compose.ui.input.pointer.PointerEventPass r6 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                r10.L$0 = r4
                r10.label = r3
                r5 = 0
                r8 = 1
                r9 = 0
                r7 = r10
                java.lang.Object r11 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r4, r5, r6, r7, r8, r9)
                if (r11 != r0) goto L3d
                goto L4b
            L3d:
                r1 = r4
            L3e:
                androidx.compose.ui.input.pointer.PointerEventPass r11 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                r3 = 0
                r7.L$0 = r3
                r7.label = r2
                java.lang.Object r11 = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation(r1, r11, r10)
                if (r11 != r0) goto L4c
            L4b:
                return r0
            L4c:
                androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
                if (r11 == 0) goto L55
                x00.a<yz.g2> r11 = r7.$onExpandedChange
                r11.invoke()
            L55:
                yz.g2 r11 = yz.g2.f100423a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ExposedDropdownMenu_androidKt$expandable$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenu_androidKt$expandable$1(a<g2> aVar, c<? super ExposedDropdownMenu_androidKt$expandable$1> cVar) {
        super(2, cVar);
        this.$onExpandedChange = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        ExposedDropdownMenu_androidKt$expandable$1 exposedDropdownMenu_androidKt$expandable$1 = new ExposedDropdownMenu_androidKt$expandable$1(this.$onExpandedChange, cVar);
        exposedDropdownMenu_androidKt$expandable$1.L$0 = obj;
        return exposedDropdownMenu_androidKt$expandable$1;
    }

    @Override // x00.p
    public final Object invoke(PointerInputScope pointerInputScope, c<? super g2> cVar) {
        return ((ExposedDropdownMenu_androidKt$expandable$1) create(pointerInputScope, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onExpandedChange, null);
            this.label = 1;
            if (ForEachGestureKt.awaitEachGesture(pointerInputScope, anonymousClass1, this) == l11) {
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
