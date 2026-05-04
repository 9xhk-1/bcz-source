package androidx.databinding;

import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import c40.l2;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.g0;
import kotlinx.coroutines.flow.i;
import m80.k;
import m80.l;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class ViewDataBindingKtx {

    @k
    public static final ViewDataBindingKtx INSTANCE = new ViewDataBindingKtx();

    @k
    private static final CreateWeakListener CREATE_STATE_FLOW_LISTENER = new CreateWeakListener() { // from class: androidx.databinding.a
        @Override // androidx.databinding.CreateWeakListener
        public final WeakListener create(ViewDataBinding viewDataBinding, int i11, ReferenceQueue referenceQueue) {
            WeakListener CREATE_STATE_FLOW_LISTENER$lambda$0;
            CREATE_STATE_FLOW_LISTENER$lambda$0 = ViewDataBindingKtx.CREATE_STATE_FLOW_LISTENER$lambda$0(viewDataBinding, i11, referenceQueue);
            return CREATE_STATE_FLOW_LISTENER$lambda$0;
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class StateFlowListener implements ObservableReference<i<? extends Object>> {

        @l
        private WeakReference<LifecycleOwner> _lifecycleOwnerRef;

        @k
        private final WeakListener<i<Object>> listener;

        @l
        private l2 observerJob;

        public StateFlowListener(@l ViewDataBinding viewDataBinding, int i11, @k ReferenceQueue<ViewDataBinding> referenceQueue) {
            g0.p(referenceQueue, "referenceQueue");
            this.listener = new WeakListener<>(viewDataBinding, i11, this, referenceQueue);
        }

        private final void startCollection(LifecycleOwner lifecycleOwner, i<? extends Object> iVar) {
            l2 f11;
            l2 l2Var = this.observerJob;
            if (l2Var != null) {
                l2.a.b(l2Var, null, 1, null);
            }
            f11 = c40.k.f(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new ViewDataBindingKtx$StateFlowListener$startCollection$1(lifecycleOwner, iVar, this, null), 3, null);
            this.observerJob = f11;
        }

        @Override // androidx.databinding.ObservableReference
        @k
        public WeakListener<i<? extends Object>> getListener() {
            return this.listener;
        }

        @Override // androidx.databinding.ObservableReference
        public void setLifecycleOwner(@l LifecycleOwner lifecycleOwner) {
            WeakReference<LifecycleOwner> weakReference = this._lifecycleOwnerRef;
            if ((weakReference != null ? weakReference.get() : null) == lifecycleOwner) {
                return;
            }
            l2 l2Var = this.observerJob;
            if (l2Var != null) {
                l2.a.b(l2Var, null, 1, null);
            }
            if (lifecycleOwner == null) {
                this._lifecycleOwnerRef = null;
                return;
            }
            this._lifecycleOwnerRef = new WeakReference<>(lifecycleOwner);
            i<? extends Object> iVar = (i) this.listener.getTarget();
            if (iVar != null) {
                startCollection(lifecycleOwner, iVar);
            }
        }

        @Override // androidx.databinding.ObservableReference
        public void addListener(@l i<? extends Object> iVar) {
            LifecycleOwner lifecycleOwner;
            WeakReference<LifecycleOwner> weakReference = this._lifecycleOwnerRef;
            if (weakReference == null || (lifecycleOwner = weakReference.get()) == null || iVar == null) {
                return;
            }
            startCollection(lifecycleOwner, iVar);
        }

        @Override // androidx.databinding.ObservableReference
        public void removeListener(@l i<? extends Object> iVar) {
            l2 l2Var = this.observerJob;
            if (l2Var != null) {
                l2.a.b(l2Var, null, 1, null);
            }
            this.observerJob = null;
        }
    }

    private ViewDataBindingKtx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WeakListener CREATE_STATE_FLOW_LISTENER$lambda$0(ViewDataBinding viewDataBinding, int i11, ReferenceQueue referenceQueue) {
        g0.m(referenceQueue);
        return new StateFlowListener(viewDataBinding, i11, referenceQueue).getListener();
    }

    @o
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final boolean updateStateFlowRegistration(@k ViewDataBinding viewDataBinding, int i11, @l i<?> iVar) {
        g0.p(viewDataBinding, "viewDataBinding");
        viewDataBinding.mInStateFlowRegisterObserver = true;
        try {
            return viewDataBinding.updateRegistration(i11, iVar, CREATE_STATE_FLOW_LISTENER);
        } finally {
            viewDataBinding.mInStateFlowRegisterObserver = false;
        }
    }
}
