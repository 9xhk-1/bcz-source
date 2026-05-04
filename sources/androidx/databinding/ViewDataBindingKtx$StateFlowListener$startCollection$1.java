package androidx.databinding;

import androidx.databinding.ViewDataBindingKtx;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1", f = "ViewDataBindingKtx.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class ViewDataBindingKtx$StateFlowListener$startCollection$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ i<Object> $flow;
    final /* synthetic */ LifecycleOwner $owner;
    int label;
    final /* synthetic */ ViewDataBindingKtx.StateFlowListener this$0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1$1", f = "ViewDataBindingKtx.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
        final /* synthetic */ i<Object> $flow;
        int label;
        final /* synthetic */ ViewDataBindingKtx.StateFlowListener this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(i<? extends Object> iVar, ViewDataBindingKtx.StateFlowListener stateFlowListener, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$flow = iVar;
            this.this$0 = stateFlowListener;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.$flow, this.this$0, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, c<? super g2> cVar) {
            return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = b.l();
            int i11 = this.label;
            if (i11 == 0) {
                e.n(obj);
                i<Object> iVar = this.$flow;
                final ViewDataBindingKtx.StateFlowListener stateFlowListener = this.this$0;
                j<? super Object> jVar = new j() { // from class: androidx.databinding.ViewDataBindingKtx.StateFlowListener.startCollection.1.1.1
                    @Override // kotlinx.coroutines.flow.j
                    public final Object emit(Object obj2, c<? super g2> cVar) {
                        WeakListener weakListener;
                        WeakListener weakListener2;
                        WeakListener weakListener3;
                        weakListener = ViewDataBindingKtx.StateFlowListener.this.listener;
                        ViewDataBinding binder = weakListener.getBinder();
                        if (binder != null) {
                            weakListener2 = ViewDataBindingKtx.StateFlowListener.this.listener;
                            int i12 = weakListener2.mLocalFieldId;
                            weakListener3 = ViewDataBindingKtx.StateFlowListener.this.listener;
                            binder.handleFieldChange(i12, weakListener3.getTarget(), 0);
                        }
                        return g2.f100423a;
                    }
                };
                this.label = 1;
                if (iVar.collect(jVar, this) == l11) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewDataBindingKtx$StateFlowListener$startCollection$1(LifecycleOwner lifecycleOwner, i<? extends Object> iVar, ViewDataBindingKtx.StateFlowListener stateFlowListener, c<? super ViewDataBindingKtx$StateFlowListener$startCollection$1> cVar) {
        super(2, cVar);
        this.$owner = lifecycleOwner;
        this.$flow = iVar;
        this.this$0 = stateFlowListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new ViewDataBindingKtx$StateFlowListener$startCollection$1(this.$owner, this.$flow, this.this$0, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((ViewDataBindingKtx$StateFlowListener$startCollection$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            Lifecycle lifecycle = this.$owner.getLifecycle();
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$flow, this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, anonymousClass1, this) == l11) {
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
