package androidx.fragment.app;

import a00.m0;
import a00.r0;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.BackEventCompat;
import androidx.annotation.CallSuper;
import androidx.fragment.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,900:1\n288#2,2:901\n288#2,2:903\n533#2,6:905\n1855#2,2:911\n1855#2:913\n1726#2,3:914\n1856#2:917\n1360#2:918\n1446#2,5:919\n1360#2:924\n1446#2,5:925\n1360#2:930\n1446#2,5:931\n1360#2:936\n1446#2,5:937\n*S KotlinDebug\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController\n*L\n67#1:901,2\n73#1:903,2\n170#1:905,6\n306#1:911,2\n316#1:913\n319#1:914,3\n316#1:917\n321#1:918\n321#1:919,5\n423#1:924\n423#1:925,5\n451#1:930\n451#1:931,5\n467#1:936\n467#1:937,5\n*E\n"})
/* loaded from: classes2.dex */
public abstract class SpecialEffectsController {

    @m80.k
    public static final Companion Companion = new Companion(null);

    @m80.k
    private final ViewGroup container;
    private boolean isContainerPostponed;
    private boolean operationDirectionIsPop;

    @m80.k
    private final List<Operation> pendingOperations;
    private boolean runningNonSeekableTransition;

    @m80.k
    private final List<Operation> runningOperations;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        @w00.o
        @m80.k
        public final SpecialEffectsController getOrCreateController(@m80.k ViewGroup container, @m80.k FragmentManager fragmentManager) {
            g0.p(container, "container");
            g0.p(fragmentManager, "fragmentManager");
            SpecialEffectsControllerFactory specialEffectsControllerFactory = fragmentManager.getSpecialEffectsControllerFactory();
            g0.o(specialEffectsControllerFactory, "fragmentManager.specialEffectsControllerFactory");
            return getOrCreateController(container, specialEffectsControllerFactory);
        }

        private Companion() {
        }

        @w00.o
        @m80.k
        public final SpecialEffectsController getOrCreateController(@m80.k ViewGroup container, @m80.k SpecialEffectsControllerFactory factory) {
            g0.p(container, "container");
            g0.p(factory, "factory");
            int i11 = R.id.special_effects_controller_view_tag;
            Object tag = container.getTag(i11);
            if (tag instanceof SpecialEffectsController) {
                return (SpecialEffectsController) tag;
            }
            SpecialEffectsController createController = factory.createController(container);
            g0.o(createController, "factory.createController(container)");
            container.setTag(i11, createController);
            return createController;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Effect {
        private boolean isCancelled;
        private final boolean isSeekingSupported;
        private boolean isStarted;

        public final void cancel(@m80.k ViewGroup container) {
            g0.p(container, "container");
            if (!this.isCancelled) {
                onCancel(container);
            }
            this.isCancelled = true;
        }

        public boolean isSeekingSupported() {
            return this.isSeekingSupported;
        }

        public void onCancel(@m80.k ViewGroup container) {
            g0.p(container, "container");
        }

        public void onCommit(@m80.k ViewGroup container) {
            g0.p(container, "container");
        }

        public void onProgress(@m80.k BackEventCompat backEvent, @m80.k ViewGroup container) {
            g0.p(backEvent, "backEvent");
            g0.p(container, "container");
        }

        public void onStart(@m80.k ViewGroup container) {
            g0.p(container, "container");
        }

        public final void performStart(@m80.k ViewGroup container) {
            g0.p(container, "container");
            if (!this.isStarted) {
                onStart(container);
            }
            this.isStarted = true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class FragmentStateManagerOperation extends Operation {

        @m80.k
        private final FragmentStateManager fragmentStateManager;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public FragmentStateManagerOperation(@m80.k androidx.fragment.app.SpecialEffectsController.Operation.State r3, @m80.k androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact r4, @m80.k androidx.fragment.app.FragmentStateManager r5) {
            /*
                r2 = this;
                java.lang.String r0 = "finalState"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "lifecycleImpact"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.String r0 = "fragmentStateManager"
                kotlin.jvm.internal.g0.p(r5, r0)
                androidx.fragment.app.Fragment r0 = r5.getFragment()
                java.lang.String r1 = "fragmentStateManager.fragment"
                kotlin.jvm.internal.g0.o(r0, r1)
                r2.<init>(r3, r4, r0)
                r2.fragmentStateManager = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.SpecialEffectsController.FragmentStateManagerOperation.<init>(androidx.fragment.app.SpecialEffectsController$Operation$State, androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact, androidx.fragment.app.FragmentStateManager):void");
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void complete$fragment_release() {
            super.complete$fragment_release();
            getFragment().mTransitioning = false;
            this.fragmentStateManager.moveToExpectedState();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void onStart() {
            if (isStarted()) {
                return;
            }
            super.onStart();
            if (getLifecycleImpact() != Operation.LifecycleImpact.ADDING) {
                if (getLifecycleImpact() == Operation.LifecycleImpact.REMOVING) {
                    Fragment fragment = this.fragmentStateManager.getFragment();
                    g0.o(fragment, "fragmentStateManager.fragment");
                    View requireView = fragment.requireView();
                    g0.o(requireView, "fragment.requireView()");
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "Clearing focus " + requireView.findFocus() + " on view " + requireView + " for Fragment " + fragment);
                    }
                    requireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment fragment2 = this.fragmentStateManager.getFragment();
            g0.o(fragment2, "fragmentStateManager.fragment");
            View findFocus = fragment2.mView.findFocus();
            if (findFocus != null) {
                fragment2.setFocusedView(findFocus);
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "requestFocus: Saved focused view " + findFocus + " for Fragment " + fragment2);
                }
            }
            View requireView2 = getFragment().requireView();
            g0.o(requireView2, "this.fragment.requireView()");
            if (requireView2.getParent() == null) {
                this.fragmentStateManager.addViewToContainer();
                requireView2.setAlpha(0.0f);
            }
            if (requireView2.getAlpha() == 0.0f && requireView2.getVisibility() == 0) {
                requireView2.setVisibility(4);
            }
            requireView2.setAlpha(fragment2.getPostOnViewCreatedAlpha());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController$Operation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,900:1\n1855#2,2:901\n1855#2,2:903\n*S KotlinDebug\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController$Operation\n*L\n671#1:901,2\n761#1:903,2\n*E\n"})
    public static class Operation {

        @m80.k
        private final List<Effect> _effects;

        @m80.k
        private final List<Runnable> completionListeners;

        @m80.k
        private final List<Effect> effects;

        @m80.k
        private State finalState;

        @m80.k
        private final Fragment fragment;
        private boolean isAwaitingContainerChanges;
        private boolean isCanceled;
        private boolean isComplete;
        private boolean isSeeking;
        private boolean isStarted;

        @m80.k
        private LifecycleImpact lifecycleImpact;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum LifecycleImpact {
            NONE,
            ADDING,
            REMOVING
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum State {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;


            @m80.k
            public static final Companion Companion = new Companion(null);

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
                    this();
                }

                @m80.k
                public final State asOperationState(@m80.k View view) {
                    g0.p(view, "<this>");
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? State.INVISIBLE : from(view.getVisibility());
                }

                @w00.o
                @m80.k
                public final State from(int i11) {
                    if (i11 == 0) {
                        return State.VISIBLE;
                    }
                    if (i11 == 4) {
                        return State.INVISIBLE;
                    }
                    if (i11 == 8) {
                        return State.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + i11);
                }

                private Companion() {
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[State.values().length];
                    try {
                        iArr[State.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[State.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[State.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[State.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @w00.o
            @m80.k
            public static final State from(int i11) {
                return Companion.from(i11);
            }

            public final void applyState(@m80.k View view, @m80.k ViewGroup container) {
                g0.p(view, "view");
                g0.p(container, "container");
                int i11 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
                if (i11 == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i11 == 2) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    ViewParent parent2 = view.getParent();
                    if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "SpecialEffectsController: Adding view " + view + " to Container " + container);
                        }
                        container.addView(view);
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i11 == 3) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i11 != 4) {
                    return;
                }
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LifecycleImpact.values().length];
                try {
                    iArr[LifecycleImpact.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LifecycleImpact.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LifecycleImpact.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Operation(@m80.k State finalState, @m80.k LifecycleImpact lifecycleImpact, @m80.k Fragment fragment) {
            g0.p(finalState, "finalState");
            g0.p(lifecycleImpact, "lifecycleImpact");
            g0.p(fragment, "fragment");
            this.finalState = finalState;
            this.lifecycleImpact = lifecycleImpact;
            this.fragment = fragment;
            this.completionListeners = new ArrayList();
            this.isAwaitingContainerChanges = true;
            ArrayList arrayList = new ArrayList();
            this._effects = arrayList;
            this.effects = arrayList;
        }

        public final void addCompletionListener(@m80.k Runnable listener) {
            g0.p(listener, "listener");
            this.completionListeners.add(listener);
        }

        public final void addEffect(@m80.k Effect effect) {
            g0.p(effect, "effect");
            this._effects.add(effect);
        }

        public final void cancel(@m80.k ViewGroup container) {
            g0.p(container, "container");
            this.isStarted = false;
            if (this.isCanceled) {
                return;
            }
            this.isCanceled = true;
            if (this._effects.isEmpty()) {
                complete$fragment_release();
                return;
            }
            Iterator it = r0.a6(this.effects).iterator();
            while (it.hasNext()) {
                ((Effect) it.next()).cancel(container);
            }
        }

        @CallSuper
        public void complete$fragment_release() {
            this.isStarted = false;
            if (this.isComplete) {
                return;
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "SpecialEffectsController: " + this + " has called complete.");
            }
            this.isComplete = true;
            Iterator<T> it = this.completionListeners.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void completeEffect(@m80.k Effect effect) {
            g0.p(effect, "effect");
            if (this._effects.remove(effect) && this._effects.isEmpty()) {
                complete$fragment_release();
            }
        }

        @m80.k
        public final List<Effect> getEffects$fragment_release() {
            return this.effects;
        }

        @m80.k
        public final State getFinalState() {
            return this.finalState;
        }

        @m80.k
        public final Fragment getFragment() {
            return this.fragment;
        }

        @m80.k
        public final LifecycleImpact getLifecycleImpact() {
            return this.lifecycleImpact;
        }

        public final boolean isAwaitingContainerChanges() {
            return this.isAwaitingContainerChanges;
        }

        public final boolean isCanceled() {
            return this.isCanceled;
        }

        public final boolean isComplete() {
            return this.isComplete;
        }

        public final boolean isSeeking() {
            return this.isSeeking;
        }

        public final boolean isStarted() {
            return this.isStarted;
        }

        public final void mergeWith(@m80.k State finalState, @m80.k LifecycleImpact lifecycleImpact) {
            g0.p(finalState, "finalState");
            g0.p(lifecycleImpact, "lifecycleImpact");
            int i11 = WhenMappings.$EnumSwitchMapping$0[lifecycleImpact.ordinal()];
            if (i11 == 1) {
                if (this.finalState == State.REMOVED) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.lifecycleImpact + " to ADDING.");
                    }
                    this.finalState = State.VISIBLE;
                    this.lifecycleImpact = LifecycleImpact.ADDING;
                    this.isAwaitingContainerChanges = true;
                    return;
                }
                return;
            }
            if (i11 == 2) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = " + this.finalState + " -> REMOVED. mLifecycleImpact  = " + this.lifecycleImpact + " to REMOVING.");
                }
                this.finalState = State.REMOVED;
                this.lifecycleImpact = LifecycleImpact.REMOVING;
                this.isAwaitingContainerChanges = true;
                return;
            }
            if (i11 == 3 && this.finalState != State.REMOVED) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = " + this.finalState + " -> " + finalState + '.');
                }
                this.finalState = finalState;
            }
        }

        @CallSuper
        public void onStart() {
            this.isStarted = true;
        }

        public final void setAwaitingContainerChanges(boolean z11) {
            this.isAwaitingContainerChanges = z11;
        }

        public final void setFinalState(@m80.k State state) {
            g0.p(state, "<set-?>");
            this.finalState = state;
        }

        public final void setLifecycleImpact(@m80.k LifecycleImpact lifecycleImpact) {
            g0.p(lifecycleImpact, "<set-?>");
            this.lifecycleImpact = lifecycleImpact;
        }

        public final void setSeeking$fragment_release(boolean z11) {
            this.isSeeking = z11;
        }

        @m80.k
        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.finalState + " lifecycleImpact = " + this.lifecycleImpact + " fragment = " + this.fragment + l50.b.f69928j;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Operation.LifecycleImpact.values().length];
            try {
                iArr[Operation.LifecycleImpact.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SpecialEffectsController(@m80.k ViewGroup container) {
        g0.p(container, "container");
        this.container = container;
        this.pendingOperations = new ArrayList();
        this.runningOperations = new ArrayList();
    }

    private final void enqueue(Operation.State state, Operation.LifecycleImpact lifecycleImpact, FragmentStateManager fragmentStateManager) {
        synchronized (this.pendingOperations) {
            try {
                Fragment fragment = fragmentStateManager.getFragment();
                g0.o(fragment, "fragmentStateManager.fragment");
                Operation findPendingOperation = findPendingOperation(fragment);
                if (findPendingOperation == null) {
                    if (fragmentStateManager.getFragment().mTransitioning) {
                        Fragment fragment2 = fragmentStateManager.getFragment();
                        g0.o(fragment2, "fragmentStateManager.fragment");
                        findPendingOperation = findRunningOperation(fragment2);
                    } else {
                        findPendingOperation = null;
                    }
                }
                if (findPendingOperation != null) {
                    findPendingOperation.mergeWith(state, lifecycleImpact);
                    return;
                }
                final FragmentStateManagerOperation fragmentStateManagerOperation = new FragmentStateManagerOperation(state, lifecycleImpact, fragmentStateManager);
                this.pendingOperations.add(fragmentStateManagerOperation);
                fragmentStateManagerOperation.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        SpecialEffectsController.enqueue$lambda$4$lambda$2(SpecialEffectsController.this, fragmentStateManagerOperation);
                    }
                });
                fragmentStateManagerOperation.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        SpecialEffectsController.enqueue$lambda$4$lambda$3(SpecialEffectsController.this, fragmentStateManagerOperation);
                    }
                });
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$4$lambda$2(SpecialEffectsController this$0, FragmentStateManagerOperation operation) {
        g0.p(this$0, "this$0");
        g0.p(operation, "$operation");
        if (this$0.pendingOperations.contains(operation)) {
            Operation.State finalState = operation.getFinalState();
            View view = operation.getFragment().mView;
            g0.o(view, "operation.fragment.mView");
            finalState.applyState(view, this$0.container);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$4$lambda$3(SpecialEffectsController this$0, FragmentStateManagerOperation operation) {
        g0.p(this$0, "this$0");
        g0.p(operation, "$operation");
        this$0.pendingOperations.remove(operation);
        this$0.runningOperations.remove(operation);
    }

    private final Operation findPendingOperation(Fragment fragment) {
        Object obj;
        Iterator<T> it = this.pendingOperations.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Operation operation = (Operation) obj;
            if (g0.g(operation.getFragment(), fragment) && !operation.isCanceled()) {
                break;
            }
        }
        return (Operation) obj;
    }

    private final Operation findRunningOperation(Fragment fragment) {
        Object obj;
        Iterator<T> it = this.runningOperations.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Operation operation = (Operation) obj;
            if (g0.g(operation.getFragment(), fragment) && !operation.isCanceled()) {
                break;
            }
        }
        return (Operation) obj;
    }

    @w00.o
    @m80.k
    public static final SpecialEffectsController getOrCreateController(@m80.k ViewGroup viewGroup, @m80.k FragmentManager fragmentManager) {
        return Companion.getOrCreateController(viewGroup, fragmentManager);
    }

    private final boolean isOperationSeekable(List<Operation> list) {
        boolean z11;
        List<Operation> list2 = list;
        loop0: while (true) {
            z11 = true;
            for (Operation operation : list2) {
                if (!operation.getEffects$fragment_release().isEmpty()) {
                    List<Effect> effects$fragment_release = operation.getEffects$fragment_release();
                    if (!(effects$fragment_release instanceof Collection) || !effects$fragment_release.isEmpty()) {
                        Iterator<T> it = effects$fragment_release.iterator();
                        while (it.hasNext()) {
                            if (!((Effect) it.next()).isSeekingSupported()) {
                                break;
                            }
                        }
                    }
                }
                z11 = false;
            }
            break loop0;
        }
        if (z11) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                m0.s0(arrayList, ((Operation) it2.next()).getEffects$fragment_release());
            }
            if (!arrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private final boolean isOperationTransitioning(List<Operation> list) {
        Iterator<T> it = list.iterator();
        boolean z11 = true;
        while (it.hasNext()) {
            if (!((Operation) it.next()).getFragment().mTransitioning) {
                z11 = false;
            }
        }
        return z11;
    }

    private final void processStart(List<Operation> list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            list.get(i11).onStart();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            m0.s0(arrayList, ((Operation) it.next()).getEffects$fragment_release());
        }
        List a62 = r0.a6(r0.f6(arrayList));
        int size2 = a62.size();
        for (int i12 = 0; i12 < size2; i12++) {
            ((Effect) a62.get(i12)).performStart(this.container);
        }
    }

    private final void updateFinalState() {
        for (Operation operation : this.pendingOperations) {
            if (operation.getLifecycleImpact() == Operation.LifecycleImpact.ADDING) {
                View requireView = operation.getFragment().requireView();
                g0.o(requireView, "fragment.requireView()");
                operation.mergeWith(Operation.State.Companion.from(requireView.getVisibility()), Operation.LifecycleImpact.NONE);
            }
        }
    }

    public final void applyContainerChangesToOperation$fragment_release(@m80.k Operation operation) {
        g0.p(operation, "operation");
        if (operation.isAwaitingContainerChanges()) {
            Operation.State finalState = operation.getFinalState();
            View requireView = operation.getFragment().requireView();
            g0.o(requireView, "operation.fragment.requireView()");
            finalState.applyState(requireView, this.container);
            operation.setAwaitingContainerChanges(false);
        }
    }

    public abstract void collectEffects(@m80.k List<Operation> list, boolean z11);

    public void commitEffects$fragment_release(@m80.k List<Operation> operations) {
        g0.p(operations, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = operations.iterator();
        while (it.hasNext()) {
            m0.s0(arrayList, ((Operation) it.next()).getEffects$fragment_release());
        }
        List a62 = r0.a6(r0.f6(arrayList));
        int size = a62.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((Effect) a62.get(i11)).onCommit(this.container);
        }
        int size2 = operations.size();
        for (int i12 = 0; i12 < size2; i12++) {
            applyContainerChangesToOperation$fragment_release(operations.get(i12));
        }
        List a63 = r0.a6(operations);
        int size3 = a63.size();
        for (int i13 = 0; i13 < size3; i13++) {
            Operation operation = (Operation) a63.get(i13);
            if (operation.getEffects$fragment_release().isEmpty()) {
                operation.complete$fragment_release();
            }
        }
    }

    public final void completeBack() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d(FragmentManager.TAG, "SpecialEffectsController: Completing Back ");
        }
        processStart(this.runningOperations);
        commitEffects$fragment_release(this.runningOperations);
    }

    public final void enqueueAdd(@m80.k Operation.State finalState, @m80.k FragmentStateManager fragmentStateManager) {
        g0.p(finalState, "finalState");
        g0.p(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.getFragment());
        }
        enqueue(finalState, Operation.LifecycleImpact.ADDING, fragmentStateManager);
    }

    public final void enqueueHide(@m80.k FragmentStateManager fragmentStateManager) {
        g0.p(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager.getFragment());
        }
        enqueue(Operation.State.GONE, Operation.LifecycleImpact.NONE, fragmentStateManager);
    }

    public final void enqueueRemove(@m80.k FragmentStateManager fragmentStateManager) {
        g0.p(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager.getFragment());
        }
        enqueue(Operation.State.REMOVED, Operation.LifecycleImpact.REMOVING, fragmentStateManager);
    }

    public final void enqueueShow(@m80.k FragmentStateManager fragmentStateManager) {
        g0.p(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager.getFragment());
        }
        enqueue(Operation.State.VISIBLE, Operation.LifecycleImpact.NONE, fragmentStateManager);
    }

    public final void executePendingOperations() {
        boolean z11;
        if (this.isContainerPostponed) {
            return;
        }
        if (!this.container.isAttachedToWindow()) {
            forceCompleteAllOperations();
            this.operationDirectionIsPop = false;
            return;
        }
        synchronized (this.pendingOperations) {
            try {
                List<Operation> d62 = r0.d6(this.runningOperations);
                this.runningOperations.clear();
                Iterator it = d62.iterator();
                while (true) {
                    z11 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    Operation operation = (Operation) it.next();
                    if (this.pendingOperations.isEmpty() || !operation.getFragment().mTransitioning) {
                        z11 = false;
                    }
                    operation.setSeeking$fragment_release(z11);
                }
                for (Operation operation2 : d62) {
                    if (this.runningNonSeekableTransition) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "SpecialEffectsController: Completing non-seekable operation " + operation2);
                        }
                        operation2.complete$fragment_release();
                    } else {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "SpecialEffectsController: Cancelling operation " + operation2);
                        }
                        operation2.cancel(this.container);
                    }
                    this.runningNonSeekableTransition = false;
                    if (!operation2.isComplete()) {
                        this.runningOperations.add(operation2);
                    }
                }
                if (!this.pendingOperations.isEmpty()) {
                    updateFinalState();
                    List<Operation> d63 = r0.d6(this.pendingOperations);
                    if (d63.isEmpty()) {
                        return;
                    }
                    this.pendingOperations.clear();
                    this.runningOperations.addAll(d63);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: Executing pending operations");
                    }
                    collectEffects(d63, this.operationDirectionIsPop);
                    boolean isOperationSeekable = isOperationSeekable(d63);
                    boolean isOperationTransitioning = isOperationTransitioning(d63);
                    if (!isOperationTransitioning || isOperationSeekable) {
                        z11 = false;
                    }
                    this.runningNonSeekableTransition = z11;
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: Operation seekable = " + isOperationSeekable + " \ntransition = " + isOperationTransitioning);
                    }
                    if (!isOperationTransitioning) {
                        processStart(d63);
                        commitEffects$fragment_release(d63);
                    } else if (isOperationSeekable) {
                        processStart(d63);
                        int size = d63.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            applyContainerChangesToOperation$fragment_release(d63.get(i11));
                        }
                    }
                    this.operationDirectionIsPop = false;
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void forceCompleteAllOperations() {
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = this.container.isAttachedToWindow();
        synchronized (this.pendingOperations) {
            try {
                updateFinalState();
                processStart(this.pendingOperations);
                List<Operation> d62 = r0.d6(this.runningOperations);
                Iterator it = d62.iterator();
                while (it.hasNext()) {
                    ((Operation) it.next()).setSeeking$fragment_release(false);
                }
                for (Operation operation : d62) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: " + (isAttachedToWindow ? "" : "Container " + this.container + " is not attached to window. ") + "Cancelling running operation " + operation);
                    }
                    operation.cancel(this.container);
                }
                List<Operation> d63 = r0.d6(this.pendingOperations);
                Iterator it2 = d63.iterator();
                while (it2.hasNext()) {
                    ((Operation) it2.next()).setSeeking$fragment_release(false);
                }
                for (Operation operation2 : d63) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: " + (isAttachedToWindow ? "" : "Container " + this.container + " is not attached to window. ") + "Cancelling pending operation " + operation2);
                    }
                    operation2.cancel(this.container);
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void forcePostponedExecutePendingOperations() {
        if (this.isContainerPostponed) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "SpecialEffectsController: Forcing postponed operations");
            }
            this.isContainerPostponed = false;
            executePendingOperations();
        }
    }

    @m80.l
    public final Operation.LifecycleImpact getAwaitingCompletionLifecycleImpact(@m80.k FragmentStateManager fragmentStateManager) {
        g0.p(fragmentStateManager, "fragmentStateManager");
        Fragment fragment = fragmentStateManager.getFragment();
        g0.o(fragment, "fragmentStateManager.fragment");
        Operation findPendingOperation = findPendingOperation(fragment);
        Operation.LifecycleImpact lifecycleImpact = findPendingOperation != null ? findPendingOperation.getLifecycleImpact() : null;
        Operation findRunningOperation = findRunningOperation(fragment);
        Operation.LifecycleImpact lifecycleImpact2 = findRunningOperation != null ? findRunningOperation.getLifecycleImpact() : null;
        int i11 = lifecycleImpact == null ? -1 : WhenMappings.$EnumSwitchMapping$0[lifecycleImpact.ordinal()];
        return (i11 == -1 || i11 == 1) ? lifecycleImpact2 : lifecycleImpact;
    }

    @m80.k
    public final ViewGroup getContainer() {
        return this.container;
    }

    public final boolean isPendingExecute() {
        return !this.pendingOperations.isEmpty();
    }

    public final void markPostponedState() {
        Operation operation;
        synchronized (this.pendingOperations) {
            try {
                updateFinalState();
                List<Operation> list = this.pendingOperations;
                ListIterator<Operation> listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        operation = null;
                        break;
                    }
                    operation = listIterator.previous();
                    Operation operation2 = operation;
                    Operation.State.Companion companion = Operation.State.Companion;
                    View view = operation2.getFragment().mView;
                    g0.o(view, "operation.fragment.mView");
                    Operation.State asOperationState = companion.asOperationState(view);
                    Operation.State finalState = operation2.getFinalState();
                    Operation.State state = Operation.State.VISIBLE;
                    if (finalState == state && asOperationState != state) {
                        break;
                    }
                }
                Operation operation3 = operation;
                Fragment fragment = operation3 != null ? operation3.getFragment() : null;
                this.isContainerPostponed = fragment != null ? fragment.isPostponed() : false;
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void processProgress(@m80.k BackEventCompat backEvent) {
        g0.p(backEvent, "backEvent");
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Processing Progress " + backEvent.getProgress());
        }
        List<Operation> list = this.runningOperations;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            m0.s0(arrayList, ((Operation) it.next()).getEffects$fragment_release());
        }
        List a62 = r0.a6(r0.f6(arrayList));
        int size = a62.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((Effect) a62.get(i11)).onProgress(backEvent, this.container);
        }
    }

    public final void updateOperationDirection(boolean z11) {
        this.operationDirectionIsPop = z11;
    }

    @w00.o
    @m80.k
    public static final SpecialEffectsController getOrCreateController(@m80.k ViewGroup viewGroup, @m80.k SpecialEffectsControllerFactory specialEffectsControllerFactory) {
        return Companion.getOrCreateController(viewGroup, specialEffectsControllerFactory);
    }
}
