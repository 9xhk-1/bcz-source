package androidx.fragment.app;

import a00.i0;
import a00.m0;
import a00.r0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.BackEventCompat;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.core.os.CancellationSignal;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.FragmentAnim;
import androidx.fragment.app.SpecialEffectsController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDefaultSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1151:1\n288#2,2:1152\n533#2,6:1154\n1360#2:1160\n1446#2,5:1161\n819#2:1166\n847#2,2:1167\n766#2:1169\n857#2,2:1170\n1789#2,3:1172\n1726#2,3:1175\n1855#2,2:1178\n*S KotlinDebug\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController\n*L\n52#1:1152,2\n58#1:1154,6\n117#1:1160\n117#1:1161,5\n190#1:1166\n190#1:1167,2\n193#1:1169\n193#1:1170,2\n197#1:1172,3\n355#1:1175,3\n366#1:1178,2\n*E\n"})
/* loaded from: classes2.dex */
public final class DefaultSpecialEffectsController extends SpecialEffectsController {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class AnimationEffect extends SpecialEffectsController.Effect {

        @m80.k
        private final AnimationInfo animationInfo;

        public AnimationEffect(@m80.k AnimationInfo animationInfo) {
            g0.p(animationInfo, "animationInfo");
            this.animationInfo = animationInfo;
        }

        @m80.k
        public final AnimationInfo getAnimationInfo() {
            return this.animationInfo;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCancel(@m80.k ViewGroup container) {
            g0.p(container, "container");
            SpecialEffectsController.Operation operation = this.animationInfo.getOperation();
            View view = operation.getFragment().mView;
            view.clearAnimation();
            container.endViewTransition(view);
            this.animationInfo.getOperation().completeEffect(this);
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Animation from operation " + operation + " has been cancelled.");
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCommit(@m80.k ViewGroup container) {
            g0.p(container, "container");
            if (this.animationInfo.isVisibilityUnchanged()) {
                this.animationInfo.getOperation().completeEffect(this);
                return;
            }
            Context context = container.getContext();
            SpecialEffectsController.Operation operation = this.animationInfo.getOperation();
            View view = operation.getFragment().mView;
            AnimationInfo animationInfo = this.animationInfo;
            g0.o(context, "context");
            FragmentAnim.AnimationOrAnimator animation = animationInfo.getAnimation(context);
            if (animation == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Animation animation2 = animation.animation;
            if (animation2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (operation.getFinalState() != SpecialEffectsController.Operation.State.REMOVED) {
                view.startAnimation(animation2);
                this.animationInfo.getOperation().completeEffect(this);
                return;
            }
            container.startViewTransition(view);
            FragmentAnim.EndViewTransitionAnimation endViewTransitionAnimation = new FragmentAnim.EndViewTransitionAnimation(animation2, container, view);
            endViewTransitionAnimation.setAnimationListener(new DefaultSpecialEffectsController$AnimationEffect$onCommit$1(operation, container, view, this));
            view.startAnimation(endViewTransitionAnimation);
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Animation from operation " + operation + " has started.");
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class AnimationInfo extends SpecialEffectsInfo {

        @m80.l
        private FragmentAnim.AnimationOrAnimator animation;
        private boolean isAnimLoaded;
        private final boolean isPop;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnimationInfo(@m80.k SpecialEffectsController.Operation operation, boolean z11) {
            super(operation);
            g0.p(operation, "operation");
            this.isPop = z11;
        }

        @m80.l
        public final FragmentAnim.AnimationOrAnimator getAnimation(@m80.k Context context) {
            g0.p(context, "context");
            if (this.isAnimLoaded) {
                return this.animation;
            }
            FragmentAnim.AnimationOrAnimator loadAnimation = FragmentAnim.loadAnimation(context, getOperation().getFragment(), getOperation().getFinalState() == SpecialEffectsController.Operation.State.VISIBLE, this.isPop);
            this.animation = loadAnimation;
            this.isAnimLoaded = true;
            return loadAnimation;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class AnimatorEffect extends SpecialEffectsController.Effect {

        @m80.l
        private AnimatorSet animator;

        @m80.k
        private final AnimationInfo animatorInfo;

        public AnimatorEffect(@m80.k AnimationInfo animatorInfo) {
            g0.p(animatorInfo, "animatorInfo");
            this.animatorInfo = animatorInfo;
        }

        @m80.l
        public final AnimatorSet getAnimator() {
            return this.animator;
        }

        @m80.k
        public final AnimationInfo getAnimatorInfo() {
            return this.animatorInfo;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public boolean isSeekingSupported() {
            return true;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCancel(@m80.k ViewGroup container) {
            g0.p(container, "container");
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().completeEffect(this);
                return;
            }
            SpecialEffectsController.Operation operation = this.animatorInfo.getOperation();
            if (!operation.isSeeking()) {
                animatorSet.end();
            } else if (Build.VERSION.SDK_INT >= 26) {
                Api26Impl.INSTANCE.reverse(animatorSet);
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Animator from operation ");
                sb2.append(operation);
                sb2.append(" has been canceled");
                sb2.append(operation.isSeeking() ? " with seeking." : ".");
                sb2.append(' ');
                Log.v(FragmentManager.TAG, sb2.toString());
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCommit(@m80.k ViewGroup container) {
            g0.p(container, "container");
            SpecialEffectsController.Operation operation = this.animatorInfo.getOperation();
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().completeEffect(this);
                return;
            }
            animatorSet.start();
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Animator from operation " + operation + " has started.");
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onProgress(@m80.k BackEventCompat backEvent, @m80.k ViewGroup container) {
            g0.p(backEvent, "backEvent");
            g0.p(container, "container");
            SpecialEffectsController.Operation operation = this.animatorInfo.getOperation();
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().completeEffect(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !operation.getFragment().mTransitioning) {
                return;
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Adding BackProgressCallbacks for Animators to operation " + operation);
            }
            long j11 = Api24Impl.INSTANCE.totalDuration(animatorSet);
            long progress = (long) (backEvent.getProgress() * j11);
            if (progress == 0) {
                progress = 1;
            }
            if (progress == j11) {
                progress = j11 - 1;
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Setting currentPlayTime to " + progress + " for Animator " + animatorSet + " on operation " + operation);
            }
            Api26Impl.INSTANCE.setCurrentPlayTime(animatorSet, progress);
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onStart(@m80.k final ViewGroup container) {
            final AnimatorEffect animatorEffect;
            g0.p(container, "container");
            if (this.animatorInfo.isVisibilityUnchanged()) {
                return;
            }
            Context context = container.getContext();
            AnimationInfo animationInfo = this.animatorInfo;
            g0.o(context, "context");
            FragmentAnim.AnimationOrAnimator animation = animationInfo.getAnimation(context);
            this.animator = animation != null ? animation.animator : null;
            final SpecialEffectsController.Operation operation = this.animatorInfo.getOperation();
            Fragment fragment = operation.getFragment();
            final boolean z11 = operation.getFinalState() == SpecialEffectsController.Operation.State.GONE;
            final View view = fragment.mView;
            container.startViewTransition(view);
            AnimatorSet animatorSet = this.animator;
            if (animatorSet != null) {
                animatorEffect = this;
                animatorSet.addListener(new AnimatorListenerAdapter() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$AnimatorEffect$onStart$1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(@m80.k Animator anim) {
                        g0.p(anim, "anim");
                        container.endViewTransition(view);
                        if (z11) {
                            SpecialEffectsController.Operation.State finalState = operation.getFinalState();
                            View viewToAnimate = view;
                            g0.o(viewToAnimate, "viewToAnimate");
                            finalState.applyState(viewToAnimate, container);
                        }
                        animatorEffect.getAnimatorInfo().getOperation().completeEffect(animatorEffect);
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "Animator from operation " + operation + " has ended.");
                        }
                    }
                });
            } else {
                animatorEffect = this;
            }
            AnimatorSet animatorSet2 = animatorEffect.animator;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }

        public final void setAnimator(@m80.l AnimatorSet animatorSet) {
            this.animator = animatorSet;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(24)
    public static final class Api24Impl {

        @m80.k
        public static final Api24Impl INSTANCE = new Api24Impl();

        private Api24Impl() {
        }

        @DoNotInline
        public final long totalDuration(@m80.k AnimatorSet animatorSet) {
            g0.p(animatorSet, "animatorSet");
            return animatorSet.getTotalDuration();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(26)
    public static final class Api26Impl {

        @m80.k
        public static final Api26Impl INSTANCE = new Api26Impl();

        private Api26Impl() {
        }

        @DoNotInline
        public final void reverse(@m80.k AnimatorSet animatorSet) {
            g0.p(animatorSet, "animatorSet");
            animatorSet.reverse();
        }

        @DoNotInline
        public final void setCurrentPlayTime(@m80.k AnimatorSet animatorSet, long j11) {
            g0.p(animatorSet, "animatorSet");
            animatorSet.setCurrentPlayTime(j11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SpecialEffectsInfo {

        @m80.k
        private final SpecialEffectsController.Operation operation;

        public SpecialEffectsInfo(@m80.k SpecialEffectsController.Operation operation) {
            g0.p(operation, "operation");
            this.operation = operation;
        }

        @m80.k
        public final SpecialEffectsController.Operation getOperation() {
            return this.operation;
        }

        public final boolean isVisibilityUnchanged() {
            View view = this.operation.getFragment().mView;
            SpecialEffectsController.Operation.State asOperationState = view != null ? SpecialEffectsController.Operation.State.Companion.asOperationState(view) : null;
            SpecialEffectsController.Operation.State finalState = this.operation.getFinalState();
            if (asOperationState == finalState) {
                return true;
            }
            SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
            return (asOperationState == state || finalState == state) ? false : true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSpecialEffectsController(@m80.k ViewGroup container) {
        super(container);
        g0.p(container, "container");
    }

    @SuppressLint({"NewApi", "PrereleaseSdkCoreDependency"})
    private final void collectAnimEffects(List<AnimationInfo> list) {
        ArrayList<AnimationInfo> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            m0.s0(arrayList2, ((AnimationInfo) it.next()).getOperation().getEffects$fragment_release());
        }
        boolean isEmpty = arrayList2.isEmpty();
        boolean z11 = false;
        for (AnimationInfo animationInfo : list) {
            Context context = getContainer().getContext();
            SpecialEffectsController.Operation operation = animationInfo.getOperation();
            g0.o(context, "context");
            FragmentAnim.AnimationOrAnimator animation = animationInfo.getAnimation(context);
            if (animation != null) {
                if (animation.animator == null) {
                    arrayList.add(animationInfo);
                } else {
                    Fragment fragment = operation.getFragment();
                    if (operation.getEffects$fragment_release().isEmpty()) {
                        if (operation.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                            operation.setAwaitingContainerChanges(false);
                        }
                        operation.addEffect(new AnimatorEffect(animationInfo));
                        z11 = true;
                    } else if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "Ignoring Animator set on " + fragment + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        for (AnimationInfo animationInfo2 : arrayList) {
            SpecialEffectsController.Operation operation2 = animationInfo2.getOperation();
            Fragment fragment2 = operation2.getFragment();
            if (isEmpty) {
                if (!z11) {
                    operation2.addEffect(new AnimationEffect(animationInfo2));
                } else if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Animators.");
                }
            } else if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Transitions.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void collectEffects$lambda$2(DefaultSpecialEffectsController this$0, SpecialEffectsController.Operation operation) {
        g0.p(this$0, "this$0");
        g0.p(operation, "$operation");
        this$0.applyContainerChangesToOperation$fragment_release(operation);
    }

    private final void createTransitionEffect(List<TransitionInfo> list, boolean z11, SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2) {
        ArrayList arrayList;
        Iterator it;
        FragmentTransitionImpl fragmentTransitionImpl;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Object obj;
        int i11;
        String findKeyForValue;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list) {
            if (!((TransitionInfo) obj2).isVisibilityUnchanged()) {
                arrayList4.add(obj2);
            }
        }
        ArrayList<TransitionInfo> arrayList5 = new ArrayList();
        for (Object obj3 : arrayList4) {
            if (((TransitionInfo) obj3).getHandlingImpl() != null) {
                arrayList5.add(obj3);
            }
        }
        FragmentTransitionImpl fragmentTransitionImpl2 = null;
        Object obj4 = null;
        for (TransitionInfo transitionInfo : arrayList5) {
            FragmentTransitionImpl handlingImpl = transitionInfo.getHandlingImpl();
            if (fragmentTransitionImpl2 != null && handlingImpl != fragmentTransitionImpl2) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + transitionInfo.getOperation().getFragment() + " returned Transition " + transitionInfo.getTransition() + " which uses a different Transition type than other Fragments.").toString());
            }
            fragmentTransitionImpl2 = handlingImpl;
        }
        if (fragmentTransitionImpl2 == null) {
            return;
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayMap arrayMap = new ArrayMap();
        ArrayList<String> arrayList8 = new ArrayList<>();
        ArrayList<String> arrayList9 = new ArrayList<>();
        ArrayMap<String, View> arrayMap2 = new ArrayMap<>();
        ArrayMap<String, View> arrayMap3 = new ArrayMap<>();
        ArrayList<String> arrayList10 = arrayList8;
        Iterator it2 = arrayList5.iterator();
        ArrayList<String> arrayList11 = arrayList9;
        while (it2.hasNext()) {
            TransitionInfo transitionInfo2 = (TransitionInfo) it2.next();
            if (!transitionInfo2.hasSharedElementTransition() || operation == null || operation2 == null) {
                arrayList = arrayList5;
                it = it2;
                fragmentTransitionImpl = fragmentTransitionImpl2;
                arrayList2 = arrayList6;
                arrayList3 = arrayList7;
            } else {
                Object wrapTransitionInSet = fragmentTransitionImpl2.wrapTransitionInSet(fragmentTransitionImpl2.cloneTransition(transitionInfo2.getSharedElementTransition()));
                arrayList11 = operation2.getFragment().getSharedElementSourceNames();
                g0.o(arrayList11, "lastIn.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementSourceNames = operation.getFragment().getSharedElementSourceNames();
                g0.o(sharedElementSourceNames, "firstOut.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementTargetNames = operation.getFragment().getSharedElementTargetNames();
                g0.o(sharedElementTargetNames, "firstOut.fragment.sharedElementTargetNames");
                int size = sharedElementTargetNames.size();
                arrayList = arrayList5;
                it = it2;
                int i12 = 0;
                while (i12 < size) {
                    FragmentTransitionImpl fragmentTransitionImpl3 = fragmentTransitionImpl2;
                    int indexOf = arrayList11.indexOf(sharedElementTargetNames.get(i12));
                    if (indexOf != -1) {
                        arrayList11.set(indexOf, sharedElementSourceNames.get(i12));
                    }
                    i12++;
                    fragmentTransitionImpl2 = fragmentTransitionImpl3;
                }
                fragmentTransitionImpl = fragmentTransitionImpl2;
                arrayList10 = operation2.getFragment().getSharedElementTargetNames();
                g0.o(arrayList10, "lastIn.fragment.sharedElementTargetNames");
                Pair a11 = !z11 ? h1.a(operation.getFragment().getExitTransitionCallback(), operation2.getFragment().getEnterTransitionCallback()) : h1.a(operation.getFragment().getEnterTransitionCallback(), operation2.getFragment().getExitTransitionCallback());
                SharedElementCallback sharedElementCallback = (SharedElementCallback) a11.component1();
                SharedElementCallback sharedElementCallback2 = (SharedElementCallback) a11.component2();
                int size2 = arrayList11.size();
                int i13 = 0;
                while (true) {
                    arrayList2 = arrayList6;
                    if (i13 >= size2) {
                        break;
                    }
                    ArrayList arrayList12 = arrayList7;
                    String str = arrayList11.get(i13);
                    g0.o(str, "exitingNames[i]");
                    String str2 = arrayList10.get(i13);
                    g0.o(str2, "enteringNames[i]");
                    arrayMap.put(str, str2);
                    i13++;
                    arrayList6 = arrayList2;
                    arrayList7 = arrayList12;
                }
                arrayList3 = arrayList7;
                int i14 = 2;
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, ">>> entering view names <<<");
                    Iterator<String> it3 = arrayList10.iterator();
                    while (true) {
                        i11 = i14;
                        if (!it3.hasNext()) {
                            break;
                        }
                        Iterator<String> it4 = it3;
                        Log.v(FragmentManager.TAG, "Name: " + it3.next());
                        wrapTransitionInSet = wrapTransitionInSet;
                        i14 = i11;
                        it3 = it4;
                    }
                    obj = wrapTransitionInSet;
                    Log.v(FragmentManager.TAG, ">>> exiting view names <<<");
                    for (Iterator<String> it5 = arrayList11.iterator(); it5.hasNext(); it5 = it5) {
                        Log.v(FragmentManager.TAG, "Name: " + it5.next());
                    }
                } else {
                    obj = wrapTransitionInSet;
                    i11 = 2;
                }
                View view = operation.getFragment().mView;
                g0.o(view, "firstOut.fragment.mView");
                findNamedViews(arrayMap2, view);
                arrayMap2.retainAll(arrayList11);
                if (sharedElementCallback != null) {
                    if (FragmentManager.isLoggingEnabled(i11)) {
                        Log.v(FragmentManager.TAG, "Executing exit callback for operation " + operation);
                    }
                    sharedElementCallback.onMapSharedElements(arrayList11, arrayMap2);
                    int size3 = arrayList11.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i15 = size3 - 1;
                            String str3 = arrayList11.get(size3);
                            g0.o(str3, "exitingNames[i]");
                            String str4 = str3;
                            View view2 = arrayMap2.get(str4);
                            if (view2 == null) {
                                arrayMap.remove(str4);
                            } else if (!g0.g(str4, ViewCompat.getTransitionName(view2))) {
                                arrayMap.put(ViewCompat.getTransitionName(view2), (String) arrayMap.remove(str4));
                            }
                            if (i15 < 0) {
                                break;
                            } else {
                                size3 = i15;
                            }
                        }
                    }
                } else {
                    arrayMap.retainAll(arrayMap2.keySet());
                }
                View view3 = operation2.getFragment().mView;
                g0.o(view3, "lastIn.fragment.mView");
                findNamedViews(arrayMap3, view3);
                arrayMap3.retainAll(arrayList10);
                arrayMap3.retainAll(arrayMap.values());
                if (sharedElementCallback2 != null) {
                    if (FragmentManager.isLoggingEnabled(i11)) {
                        Log.v(FragmentManager.TAG, "Executing enter callback for operation " + operation2);
                    }
                    sharedElementCallback2.onMapSharedElements(arrayList10, arrayMap3);
                    int size4 = arrayList10.size() - 1;
                    if (size4 >= 0) {
                        while (true) {
                            int i16 = size4 - 1;
                            String str5 = arrayList10.get(size4);
                            g0.o(str5, "enteringNames[i]");
                            String str6 = str5;
                            View view4 = arrayMap3.get(str6);
                            if (view4 == null) {
                                String findKeyForValue2 = FragmentTransition.findKeyForValue(arrayMap, str6);
                                if (findKeyForValue2 != null) {
                                    arrayMap.remove(findKeyForValue2);
                                }
                            } else if (!g0.g(str6, ViewCompat.getTransitionName(view4)) && (findKeyForValue = FragmentTransition.findKeyForValue(arrayMap, str6)) != null) {
                                arrayMap.put(findKeyForValue, ViewCompat.getTransitionName(view4));
                            }
                            if (i16 < 0) {
                                break;
                            } else {
                                size4 = i16;
                            }
                        }
                    }
                } else {
                    FragmentTransition.retainValues(arrayMap, arrayMap3);
                }
                Collection<String> keySet = arrayMap.keySet();
                g0.o(keySet, "sharedElementNameMapping.keys");
                retainMatchingViews(arrayMap2, keySet);
                Collection<String> values = arrayMap.values();
                g0.o(values, "sharedElementNameMapping.values");
                retainMatchingViews(arrayMap3, values);
                if (arrayMap.isEmpty()) {
                    Log.i(FragmentManager.TAG, "Ignoring shared elements transition " + obj + " between " + operation + " and " + operation2 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
                    arrayList2.clear();
                    arrayList3.clear();
                    arrayList5 = arrayList;
                    it2 = it;
                    fragmentTransitionImpl2 = fragmentTransitionImpl;
                    arrayList6 = arrayList2;
                    arrayList7 = arrayList3;
                    obj4 = null;
                } else {
                    obj4 = obj;
                }
            }
            arrayList5 = arrayList;
            it2 = it;
            fragmentTransitionImpl2 = fragmentTransitionImpl;
            arrayList6 = arrayList2;
            arrayList7 = arrayList3;
        }
        ArrayList arrayList13 = arrayList5;
        FragmentTransitionImpl fragmentTransitionImpl4 = fragmentTransitionImpl2;
        ArrayList arrayList14 = arrayList6;
        ArrayList arrayList15 = arrayList7;
        if (obj4 == null) {
            if (arrayList13.isEmpty()) {
                return;
            }
            Iterator it6 = arrayList13.iterator();
            while (it6.hasNext()) {
                if (((TransitionInfo) it6.next()).getTransition() == null) {
                }
            }
            return;
        }
        TransitionEffect transitionEffect = new TransitionEffect(arrayList13, operation, operation2, fragmentTransitionImpl4, obj4, arrayList14, arrayList15, arrayMap, arrayList10, arrayList11, arrayMap2, arrayMap3, z11);
        Iterator it7 = arrayList13.iterator();
        while (it7.hasNext()) {
            ((TransitionInfo) it7.next()).getOperation().addEffect(transitionEffect);
        }
    }

    private final void findNamedViews(Map<String, View> map, View view) {
        String transitionName = ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            map.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View child = viewGroup.getChildAt(i11);
                if (child.getVisibility() == 0) {
                    g0.o(child, "child");
                    findNamedViews(map, child);
                }
            }
        }
    }

    private final void retainMatchingViews(ArrayMap<String, View> arrayMap, final Collection<String> collection) {
        Set<Map.Entry<String, View>> entries = arrayMap.entrySet();
        g0.o(entries, "entries");
        m0.S0(entries, new x00.l<Map.Entry<String, View>, Boolean>() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$retainMatchingViews$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            @m80.k
            public final Boolean invoke(@m80.k Map.Entry<String, View> entry) {
                g0.p(entry, "entry");
                return Boolean.valueOf(r0.a2(collection, ViewCompat.getTransitionName(entry.getValue())));
            }
        });
    }

    private final void syncAnimations(List<? extends SpecialEffectsController.Operation> list) {
        Fragment fragment = ((SpecialEffectsController.Operation) r0.u3(list)).getFragment();
        for (SpecialEffectsController.Operation operation : list) {
            operation.getFragment().mAnimationInfo.mEnterAnim = fragment.mAnimationInfo.mEnterAnim;
            operation.getFragment().mAnimationInfo.mExitAnim = fragment.mAnimationInfo.mExitAnim;
            operation.getFragment().mAnimationInfo.mPopEnterAnim = fragment.mAnimationInfo.mPopEnterAnim;
            operation.getFragment().mAnimationInfo.mPopExitAnim = fragment.mAnimationInfo.mPopExitAnim;
        }
    }

    @Override // androidx.fragment.app.SpecialEffectsController
    public void collectEffects(@m80.k List<? extends SpecialEffectsController.Operation> operations, boolean z11) {
        SpecialEffectsController.Operation operation;
        Object obj;
        g0.p(operations, "operations");
        Iterator<T> it = operations.iterator();
        while (true) {
            operation = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            SpecialEffectsController.Operation operation2 = (SpecialEffectsController.Operation) obj;
            SpecialEffectsController.Operation.State.Companion companion = SpecialEffectsController.Operation.State.Companion;
            View view = operation2.getFragment().mView;
            g0.o(view, "operation.fragment.mView");
            SpecialEffectsController.Operation.State asOperationState = companion.asOperationState(view);
            SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
            if (asOperationState == state && operation2.getFinalState() != state) {
                break;
            }
        }
        SpecialEffectsController.Operation operation3 = (SpecialEffectsController.Operation) obj;
        ListIterator<? extends SpecialEffectsController.Operation> listIterator = operations.listIterator(operations.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            SpecialEffectsController.Operation previous = listIterator.previous();
            SpecialEffectsController.Operation operation4 = previous;
            SpecialEffectsController.Operation.State.Companion companion2 = SpecialEffectsController.Operation.State.Companion;
            View view2 = operation4.getFragment().mView;
            g0.o(view2, "operation.fragment.mView");
            SpecialEffectsController.Operation.State asOperationState2 = companion2.asOperationState(view2);
            SpecialEffectsController.Operation.State state2 = SpecialEffectsController.Operation.State.VISIBLE;
            if (asOperationState2 != state2 && operation4.getFinalState() == state2) {
                operation = previous;
                break;
            }
        }
        SpecialEffectsController.Operation operation5 = operation;
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Executing operations from " + operation3 + " to " + operation5);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        syncAnimations(operations);
        for (final SpecialEffectsController.Operation operation6 : operations) {
            arrayList.add(new AnimationInfo(operation6, z11));
            boolean z12 = false;
            if (z11) {
                if (operation6 != operation3) {
                    arrayList2.add(new TransitionInfo(operation6, z11, z12));
                    operation6.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.collectEffects$lambda$2(DefaultSpecialEffectsController.this, operation6);
                        }
                    });
                }
                z12 = true;
                arrayList2.add(new TransitionInfo(operation6, z11, z12));
                operation6.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultSpecialEffectsController.collectEffects$lambda$2(DefaultSpecialEffectsController.this, operation6);
                    }
                });
            } else {
                if (operation6 != operation5) {
                    arrayList2.add(new TransitionInfo(operation6, z11, z12));
                    operation6.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.collectEffects$lambda$2(DefaultSpecialEffectsController.this, operation6);
                        }
                    });
                }
                z12 = true;
                arrayList2.add(new TransitionInfo(operation6, z11, z12));
                operation6.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultSpecialEffectsController.collectEffects$lambda$2(DefaultSpecialEffectsController.this, operation6);
                    }
                });
            }
        }
        createTransitionEffect(arrayList2, z11, operation3, operation5);
        collectAnimEffects(arrayList);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class TransitionInfo extends SpecialEffectsInfo {
        private final boolean isOverlapAllowed;

        @m80.l
        private final Object sharedElementTransition;

        @m80.l
        private final Object transition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransitionInfo(@m80.k SpecialEffectsController.Operation operation, boolean z11, boolean z12) {
            super(operation);
            Object returnTransition;
            g0.p(operation, "operation");
            SpecialEffectsController.Operation.State finalState = operation.getFinalState();
            SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
            if (finalState == state) {
                Fragment fragment = operation.getFragment();
                returnTransition = z11 ? fragment.getReenterTransition() : fragment.getEnterTransition();
            } else {
                Fragment fragment2 = operation.getFragment();
                returnTransition = z11 ? fragment2.getReturnTransition() : fragment2.getExitTransition();
            }
            this.transition = returnTransition;
            this.isOverlapAllowed = operation.getFinalState() == state ? z11 ? operation.getFragment().getAllowReturnTransitionOverlap() : operation.getFragment().getAllowEnterTransitionOverlap() : true;
            this.sharedElementTransition = z12 ? z11 ? operation.getFragment().getSharedElementReturnTransition() : operation.getFragment().getSharedElementEnterTransition() : null;
        }

        @m80.l
        public final FragmentTransitionImpl getHandlingImpl() {
            FragmentTransitionImpl handlingImpl = getHandlingImpl(this.transition);
            FragmentTransitionImpl handlingImpl2 = getHandlingImpl(this.sharedElementTransition);
            if (handlingImpl == null || handlingImpl2 == null || handlingImpl == handlingImpl2) {
                return handlingImpl == null ? handlingImpl2 : handlingImpl;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + getOperation().getFragment() + " returned Transition " + this.transition + " which uses a different Transition  type than its shared element transition " + this.sharedElementTransition).toString());
        }

        @m80.l
        public final Object getSharedElementTransition() {
            return this.sharedElementTransition;
        }

        @m80.l
        public final Object getTransition() {
            return this.transition;
        }

        public final boolean hasSharedElementTransition() {
            return this.sharedElementTransition != null;
        }

        public final boolean isOverlapAllowed() {
            return this.isOverlapAllowed;
        }

        private final FragmentTransitionImpl getHandlingImpl(Object obj) {
            if (obj == null) {
                return null;
            }
            FragmentTransitionImpl fragmentTransitionImpl = FragmentTransition.PLATFORM_IMPL;
            if (fragmentTransitionImpl != null && fragmentTransitionImpl.canHandle(obj)) {
                return fragmentTransitionImpl;
            }
            FragmentTransitionImpl fragmentTransitionImpl2 = FragmentTransition.SUPPORT_IMPL;
            if (fragmentTransitionImpl2 != null && fragmentTransitionImpl2.canHandle(obj)) {
                return fragmentTransitionImpl2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + getOperation().getFragment() + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nDefaultSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1151:1\n1726#2,3:1152\n1726#2,3:1155\n1855#2,2:1158\n1549#2:1160\n1620#2,3:1161\n1855#2,2:1164\n1855#2,2:1167\n1549#2:1169\n1620#2,3:1170\n1855#2,2:1173\n1#3:1166\n*S KotlinDebug\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect\n*L\n722#1:1152,3\n731#1:1155,3\n739#1:1158,2\n768#1:1160\n768#1:1161,3\n768#1:1164,2\n846#1:1167,2\n867#1:1169\n867#1:1170,3\n867#1:1173,2\n*E\n"})
    public static final class TransitionEffect extends SpecialEffectsController.Effect {

        @m80.l
        private Object controller;

        @m80.k
        private final ArrayList<String> enteringNames;

        @m80.k
        private final ArrayList<String> exitingNames;

        @m80.l
        private final SpecialEffectsController.Operation firstOut;

        @m80.k
        private final ArrayMap<String, View> firstOutViews;
        private final boolean isPop;

        @m80.l
        private final SpecialEffectsController.Operation lastIn;

        @m80.k
        private final ArrayMap<String, View> lastInViews;

        @m80.k
        private final ArrayList<View> sharedElementFirstOutViews;

        @m80.k
        private final ArrayList<View> sharedElementLastInViews;

        @m80.k
        private final ArrayMap<String, String> sharedElementNameMapping;

        @m80.l
        private final Object sharedElementTransition;

        @m80.k
        private final FragmentTransitionImpl transitionImpl;

        @m80.k
        private final List<TransitionInfo> transitionInfos;

        @m80.k
        private final CancellationSignal transitionSignal;

        public TransitionEffect(@m80.k List<TransitionInfo> transitionInfos, @m80.l SpecialEffectsController.Operation operation, @m80.l SpecialEffectsController.Operation operation2, @m80.k FragmentTransitionImpl transitionImpl, @m80.l Object obj, @m80.k ArrayList<View> sharedElementFirstOutViews, @m80.k ArrayList<View> sharedElementLastInViews, @m80.k ArrayMap<String, String> sharedElementNameMapping, @m80.k ArrayList<String> enteringNames, @m80.k ArrayList<String> exitingNames, @m80.k ArrayMap<String, View> firstOutViews, @m80.k ArrayMap<String, View> lastInViews, boolean z11) {
            g0.p(transitionInfos, "transitionInfos");
            g0.p(transitionImpl, "transitionImpl");
            g0.p(sharedElementFirstOutViews, "sharedElementFirstOutViews");
            g0.p(sharedElementLastInViews, "sharedElementLastInViews");
            g0.p(sharedElementNameMapping, "sharedElementNameMapping");
            g0.p(enteringNames, "enteringNames");
            g0.p(exitingNames, "exitingNames");
            g0.p(firstOutViews, "firstOutViews");
            g0.p(lastInViews, "lastInViews");
            this.transitionInfos = transitionInfos;
            this.firstOut = operation;
            this.lastIn = operation2;
            this.transitionImpl = transitionImpl;
            this.sharedElementTransition = obj;
            this.sharedElementFirstOutViews = sharedElementFirstOutViews;
            this.sharedElementLastInViews = sharedElementLastInViews;
            this.sharedElementNameMapping = sharedElementNameMapping;
            this.enteringNames = enteringNames;
            this.exitingNames = exitingNames;
            this.firstOutViews = firstOutViews;
            this.lastInViews = lastInViews;
            this.isPop = z11;
            this.transitionSignal = new CancellationSignal();
        }

        private final void captureTransitioningViews(ArrayList<View> arrayList, View view) {
            if (!(view instanceof ViewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (ViewGroupCompat.isTransitionGroup(viewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View child = viewGroup.getChildAt(i11);
                if (child.getVisibility() == 0) {
                    g0.o(child, "child");
                    captureTransitioningViews(arrayList, child);
                }
            }
        }

        private final Pair<ArrayList<View>, Object> createMergedTransition(ViewGroup viewGroup, SpecialEffectsController.Operation operation, final SpecialEffectsController.Operation operation2) {
            final SpecialEffectsController.Operation operation3 = operation;
            View view = new View(viewGroup.getContext());
            final Rect rect = new Rect();
            Iterator<TransitionInfo> it = this.transitionInfos.iterator();
            boolean z11 = false;
            View view2 = null;
            while (it.hasNext()) {
                if (it.next().hasSharedElementTransition() && operation2 != null && operation3 != null && !this.sharedElementNameMapping.isEmpty() && this.sharedElementTransition != null) {
                    FragmentTransition.callSharedElementStartEnd(operation3.getFragment(), operation2.getFragment(), this.isPop, this.firstOutViews, true);
                    OneShotPreDrawListener.add(viewGroup, new Runnable() { // from class: androidx.fragment.app.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.TransitionEffect.createMergedTransition$lambda$12(SpecialEffectsController.Operation.this, operation2, this);
                        }
                    });
                    this.sharedElementFirstOutViews.addAll(this.firstOutViews.values());
                    if (!this.exitingNames.isEmpty()) {
                        String str = this.exitingNames.get(0);
                        g0.o(str, "exitingNames[0]");
                        view2 = this.firstOutViews.get(str);
                        this.transitionImpl.setEpicenter(this.sharedElementTransition, view2);
                    }
                    this.sharedElementLastInViews.addAll(this.lastInViews.values());
                    if (!this.enteringNames.isEmpty()) {
                        String str2 = this.enteringNames.get(0);
                        g0.o(str2, "enteringNames[0]");
                        final View view3 = this.lastInViews.get(str2);
                        if (view3 != null) {
                            final FragmentTransitionImpl fragmentTransitionImpl = this.transitionImpl;
                            OneShotPreDrawListener.add(viewGroup, new Runnable() { // from class: androidx.fragment.app.d
                                @Override // java.lang.Runnable
                                public final void run() {
                                    DefaultSpecialEffectsController.TransitionEffect.createMergedTransition$lambda$13(FragmentTransitionImpl.this, view3, rect);
                                }
                            });
                            z11 = true;
                        }
                    }
                    this.transitionImpl.setSharedElementTargets(this.sharedElementTransition, view, this.sharedElementFirstOutViews);
                    FragmentTransitionImpl fragmentTransitionImpl2 = this.transitionImpl;
                    Object obj = this.sharedElementTransition;
                    fragmentTransitionImpl2.scheduleRemoveTargets(obj, null, null, null, null, obj, this.sharedElementLastInViews);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator<TransitionInfo> it2 = this.transitionInfos.iterator();
            Object obj2 = null;
            Object obj3 = null;
            while (it2.hasNext()) {
                TransitionInfo next = it2.next();
                SpecialEffectsController.Operation operation4 = next.getOperation();
                boolean z12 = z11;
                Object cloneTransition = this.transitionImpl.cloneTransition(next.getTransition());
                if (cloneTransition != null) {
                    final ArrayList<View> arrayList2 = new ArrayList<>();
                    Iterator<TransitionInfo> it3 = it2;
                    View view4 = operation4.getFragment().mView;
                    g0.o(view4, "operation.fragment.mView");
                    captureTransitioningViews(arrayList2, view4);
                    if (this.sharedElementTransition != null && (operation4 == operation2 || operation4 == operation3)) {
                        if (operation4 == operation2) {
                            arrayList2.removeAll(r0.f6(this.sharedElementFirstOutViews));
                        } else {
                            arrayList2.removeAll(r0.f6(this.sharedElementLastInViews));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        this.transitionImpl.addTarget(cloneTransition, view);
                    } else {
                        this.transitionImpl.addTargets(cloneTransition, arrayList2);
                        this.transitionImpl.scheduleRemoveTargets(cloneTransition, cloneTransition, arrayList2, null, null, null, null);
                        if (operation4.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                            operation4.setAwaitingContainerChanges(false);
                            ArrayList<View> arrayList3 = new ArrayList<>(arrayList2);
                            arrayList3.remove(operation4.getFragment().mView);
                            this.transitionImpl.scheduleHideFragmentView(cloneTransition, operation4.getFragment().mView, arrayList3);
                            OneShotPreDrawListener.add(viewGroup, new Runnable() { // from class: androidx.fragment.app.e
                                @Override // java.lang.Runnable
                                public final void run() {
                                    DefaultSpecialEffectsController.TransitionEffect.createMergedTransition$lambda$14(arrayList2);
                                }
                            });
                        }
                    }
                    if (operation4.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                        arrayList.addAll(arrayList2);
                        if (z12) {
                            this.transitionImpl.setEpicenter(cloneTransition, rect);
                        }
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "Entering Transition: " + cloneTransition);
                            Log.v(FragmentManager.TAG, ">>>>> EnteringViews <<<<<");
                            Iterator<View> it4 = arrayList2.iterator();
                            while (it4.hasNext()) {
                                View transitioningViews = it4.next();
                                g0.o(transitioningViews, "transitioningViews");
                                Log.v(FragmentManager.TAG, "View: " + transitioningViews);
                            }
                        }
                    } else {
                        this.transitionImpl.setEpicenter(cloneTransition, view2);
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "Exiting Transition: " + cloneTransition);
                            Log.v(FragmentManager.TAG, ">>>>> ExitingViews <<<<<");
                            Iterator<View> it5 = arrayList2.iterator();
                            while (it5.hasNext()) {
                                View transitioningViews2 = it5.next();
                                g0.o(transitioningViews2, "transitioningViews");
                                Log.v(FragmentManager.TAG, "View: " + transitioningViews2);
                            }
                        }
                    }
                    if (next.isOverlapAllowed()) {
                        obj2 = this.transitionImpl.mergeTransitionsTogether(obj2, cloneTransition, null);
                    } else {
                        obj3 = this.transitionImpl.mergeTransitionsTogether(obj3, cloneTransition, null);
                    }
                    operation3 = operation;
                    z11 = z12;
                    it2 = it3;
                } else {
                    operation3 = operation;
                    z11 = z12;
                }
            }
            Object mergeTransitionsInSequence = this.transitionImpl.mergeTransitionsInSequence(obj2, obj3, this.sharedElementTransition);
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Final merged transition: " + mergeTransitionsInSequence);
            }
            return new Pair<>(arrayList, mergeTransitionsInSequence);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void createMergedTransition$lambda$12(SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, TransitionEffect this$0) {
            g0.p(this$0, "this$0");
            FragmentTransition.callSharedElementStartEnd(operation.getFragment(), operation2.getFragment(), this$0.isPop, this$0.lastInViews, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void createMergedTransition$lambda$13(FragmentTransitionImpl impl, View view, Rect lastInEpicenterRect) {
            g0.p(impl, "$impl");
            g0.p(lastInEpicenterRect, "$lastInEpicenterRect");
            impl.getBoundsOnScreen(view, lastInEpicenterRect);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void createMergedTransition$lambda$14(ArrayList transitioningViews) {
            g0.p(transitioningViews, "$transitioningViews");
            FragmentTransition.setViewVisibility(transitioningViews, 4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onCommit$lambda$11$lambda$10(SpecialEffectsController.Operation operation, TransitionEffect this$0) {
            g0.p(operation, "$operation");
            g0.p(this$0, "this$0");
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Transition for operation " + operation + " has completed");
            }
            operation.completeEffect(this$0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onStart$lambda$6$lambda$4(Ref.ObjectRef seekCancelLambda) {
            g0.p(seekCancelLambda, "$seekCancelLambda");
            x00.a aVar = (x00.a) seekCancelLambda.element;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onStart$lambda$6$lambda$5(SpecialEffectsController.Operation operation, TransitionEffect this$0) {
            g0.p(operation, "$operation");
            g0.p(this$0, "this$0");
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Transition for operation " + operation + " has completed");
            }
            operation.completeEffect(this$0);
        }

        private final void runTransition(ArrayList<View> arrayList, ViewGroup viewGroup, x00.a<g2> aVar) {
            FragmentTransition.setViewVisibility(arrayList, 4);
            ArrayList<String> prepareSetNameOverridesReordered = this.transitionImpl.prepareSetNameOverridesReordered(this.sharedElementLastInViews);
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, ">>>>> Beginning transition <<<<<");
                Log.v(FragmentManager.TAG, ">>>>> SharedElementFirstOutViews <<<<<");
                Iterator<View> it = this.sharedElementFirstOutViews.iterator();
                while (it.hasNext()) {
                    View sharedElementFirstOutViews = it.next();
                    g0.o(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                    View view = sharedElementFirstOutViews;
                    Log.v(FragmentManager.TAG, "View: " + view + " Name: " + ViewCompat.getTransitionName(view));
                }
                Log.v(FragmentManager.TAG, ">>>>> SharedElementLastInViews <<<<<");
                Iterator<View> it2 = this.sharedElementLastInViews.iterator();
                while (it2.hasNext()) {
                    View sharedElementLastInViews = it2.next();
                    g0.o(sharedElementLastInViews, "sharedElementLastInViews");
                    View view2 = sharedElementLastInViews;
                    Log.v(FragmentManager.TAG, "View: " + view2 + " Name: " + ViewCompat.getTransitionName(view2));
                }
            }
            aVar.invoke();
            this.transitionImpl.setNameOverridesReordered(viewGroup, this.sharedElementFirstOutViews, this.sharedElementLastInViews, prepareSetNameOverridesReordered, this.sharedElementNameMapping);
            FragmentTransition.setViewVisibility(arrayList, 0);
            this.transitionImpl.swapSharedElementTargets(this.sharedElementTransition, this.sharedElementFirstOutViews, this.sharedElementLastInViews);
        }

        @m80.l
        public final Object getController() {
            return this.controller;
        }

        @m80.k
        public final ArrayList<String> getEnteringNames() {
            return this.enteringNames;
        }

        @m80.k
        public final ArrayList<String> getExitingNames() {
            return this.exitingNames;
        }

        @m80.l
        public final SpecialEffectsController.Operation getFirstOut() {
            return this.firstOut;
        }

        @m80.k
        public final ArrayMap<String, View> getFirstOutViews() {
            return this.firstOutViews;
        }

        @m80.l
        public final SpecialEffectsController.Operation getLastIn() {
            return this.lastIn;
        }

        @m80.k
        public final ArrayMap<String, View> getLastInViews() {
            return this.lastInViews;
        }

        @m80.k
        public final ArrayList<View> getSharedElementFirstOutViews() {
            return this.sharedElementFirstOutViews;
        }

        @m80.k
        public final ArrayList<View> getSharedElementLastInViews() {
            return this.sharedElementLastInViews;
        }

        @m80.k
        public final ArrayMap<String, String> getSharedElementNameMapping() {
            return this.sharedElementNameMapping;
        }

        @m80.l
        public final Object getSharedElementTransition() {
            return this.sharedElementTransition;
        }

        @m80.k
        public final FragmentTransitionImpl getTransitionImpl() {
            return this.transitionImpl;
        }

        @m80.k
        public final List<TransitionInfo> getTransitionInfos() {
            return this.transitionInfos;
        }

        @m80.k
        public final CancellationSignal getTransitionSignal() {
            return this.transitionSignal;
        }

        public final boolean getTransitioning() {
            List<TransitionInfo> list = this.transitionInfos;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((TransitionInfo) it.next()).getOperation().getFragment().mTransitioning) {
                    return false;
                }
            }
            return true;
        }

        public final boolean isPop() {
            return this.isPop;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public boolean isSeekingSupported() {
            if (!this.transitionImpl.isSeekingSupported()) {
                return false;
            }
            List<TransitionInfo> list = this.transitionInfos;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (TransitionInfo transitionInfo : list) {
                    if (Build.VERSION.SDK_INT < 34 || transitionInfo.getTransition() == null || !this.transitionImpl.isSeekingSupported(transitionInfo.getTransition())) {
                        return false;
                    }
                }
            }
            Object obj = this.sharedElementTransition;
            return obj == null || this.transitionImpl.isSeekingSupported(obj);
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCancel(@m80.k ViewGroup container) {
            g0.p(container, "container");
            this.transitionSignal.cancel();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCommit(@m80.k final ViewGroup container) {
            g0.p(container, "container");
            if (!container.isLaidOut()) {
                for (TransitionInfo transitionInfo : this.transitionInfos) {
                    SpecialEffectsController.Operation operation = transitionInfo.getOperation();
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: Container " + container + " has not been laid out. Completing operation " + operation);
                    }
                    transitionInfo.getOperation().completeEffect(this);
                }
                return;
            }
            Object obj = this.controller;
            if (obj != null) {
                FragmentTransitionImpl fragmentTransitionImpl = this.transitionImpl;
                g0.m(obj);
                fragmentTransitionImpl.animateToEnd(obj);
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "Ending execution of operations from " + this.firstOut + " to " + this.lastIn);
                    return;
                }
                return;
            }
            Pair<ArrayList<View>, Object> createMergedTransition = createMergedTransition(container, this.lastIn, this.firstOut);
            ArrayList<View> component1 = createMergedTransition.component1();
            final Object component2 = createMergedTransition.component2();
            List<TransitionInfo> list = this.transitionInfos;
            ArrayList<SpecialEffectsController.Operation> arrayList = new ArrayList(i0.d0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((TransitionInfo) it.next()).getOperation());
            }
            for (final SpecialEffectsController.Operation operation2 : arrayList) {
                this.transitionImpl.setListenerForTransitionEnd(operation2.getFragment(), component2, this.transitionSignal, new Runnable() { // from class: androidx.fragment.app.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultSpecialEffectsController.TransitionEffect.onCommit$lambda$11$lambda$10(SpecialEffectsController.Operation.this, this);
                    }
                });
            }
            runTransition(component1, container, new x00.a<g2>() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onCommit$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // x00.a
                public /* bridge */ /* synthetic */ g2 invoke() {
                    invoke2();
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    DefaultSpecialEffectsController.TransitionEffect.this.getTransitionImpl().beginDelayedTransition(container, component2);
                }
            });
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Completed executing operations from " + this.firstOut + " to " + this.lastIn);
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onProgress(@m80.k BackEventCompat backEvent, @m80.k ViewGroup container) {
            g0.p(backEvent, "backEvent");
            g0.p(container, "container");
            Object obj = this.controller;
            if (obj != null) {
                this.transitionImpl.setCurrentPlayTime(obj, backEvent.getProgress());
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onStart(@m80.k final ViewGroup container) {
            g0.p(container, "container");
            if (!container.isLaidOut()) {
                Iterator<T> it = this.transitionInfos.iterator();
                while (it.hasNext()) {
                    SpecialEffectsController.Operation operation = ((TransitionInfo) it.next()).getOperation();
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: Container " + container + " has not been laid out. Skipping onStart for operation " + operation);
                    }
                }
                return;
            }
            if (getTransitioning() && this.sharedElementTransition != null && !isSeekingSupported()) {
                Log.i(FragmentManager.TAG, "Ignoring shared elements transition " + this.sharedElementTransition + " between " + this.firstOut + " and " + this.lastIn + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (isSeekingSupported() && getTransitioning()) {
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Pair<ArrayList<View>, Object> createMergedTransition = createMergedTransition(container, this.lastIn, this.firstOut);
                ArrayList<View> component1 = createMergedTransition.component1();
                final Object component2 = createMergedTransition.component2();
                List<TransitionInfo> list = this.transitionInfos;
                ArrayList<SpecialEffectsController.Operation> arrayList = new ArrayList(i0.d0(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((TransitionInfo) it2.next()).getOperation());
                }
                for (final SpecialEffectsController.Operation operation2 : arrayList) {
                    this.transitionImpl.setListenerForTransitionEnd(operation2.getFragment(), component2, this.transitionSignal, new Runnable() { // from class: androidx.fragment.app.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.TransitionEffect.onStart$lambda$6$lambda$4(Ref.ObjectRef.this);
                        }
                    }, new Runnable() { // from class: androidx.fragment.app.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.TransitionEffect.onStart$lambda$6$lambda$5(SpecialEffectsController.Operation.this, this);
                        }
                    });
                }
                runTransition(component1, container, new x00.a<g2>() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4

                    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                    @u0({"SMAP\nDefaultSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect$onStart$4$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1151:1\n1726#2,3:1152\n1855#2,2:1155\n1855#2,2:1157\n*S KotlinDebug\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect$onStart$4$2\n*L\n795#1:1152,3\n800#1:1155,2\n825#1:1157,2\n*E\n"})
                    /* renamed from: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4$2, reason: invalid class name */
                    public static final class AnonymousClass2 extends Lambda implements x00.a<g2> {
                        final /* synthetic */ ViewGroup $container;
                        final /* synthetic */ Object $mergedTransition;
                        final /* synthetic */ DefaultSpecialEffectsController.TransitionEffect this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass2(DefaultSpecialEffectsController.TransitionEffect transitionEffect, Object obj, ViewGroup viewGroup) {
                            super(0);
                            this.this$0 = transitionEffect;
                            this.$mergedTransition = obj;
                            this.$container = viewGroup;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final void invoke$lambda$2(DefaultSpecialEffectsController.TransitionEffect this$0, ViewGroup container) {
                            g0.p(this$0, "this$0");
                            g0.p(container, "$container");
                            Iterator<T> it = this$0.getTransitionInfos().iterator();
                            while (it.hasNext()) {
                                SpecialEffectsController.Operation operation = ((DefaultSpecialEffectsController.TransitionInfo) it.next()).getOperation();
                                View view = operation.getFragment().getView();
                                if (view != null) {
                                    operation.getFinalState().applyState(view, container);
                                }
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final void invoke$lambda$4(DefaultSpecialEffectsController.TransitionEffect this$0) {
                            g0.p(this$0, "this$0");
                            if (FragmentManager.isLoggingEnabled(2)) {
                                Log.v(FragmentManager.TAG, "Transition for all operations has completed");
                            }
                            Iterator<T> it = this$0.getTransitionInfos().iterator();
                            while (it.hasNext()) {
                                ((DefaultSpecialEffectsController.TransitionInfo) it.next()).getOperation().completeEffect(this$0);
                            }
                        }

                        @Override // x00.a
                        public /* bridge */ /* synthetic */ g2 invoke() {
                            invoke2();
                            return g2.f100423a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            List<DefaultSpecialEffectsController.TransitionInfo> transitionInfos = this.this$0.getTransitionInfos();
                            if (!(transitionInfos instanceof Collection) || !transitionInfos.isEmpty()) {
                                Iterator<T> it = transitionInfos.iterator();
                                while (it.hasNext()) {
                                    if (!((DefaultSpecialEffectsController.TransitionInfo) it.next()).getOperation().isSeeking()) {
                                        if (FragmentManager.isLoggingEnabled(2)) {
                                            Log.v(FragmentManager.TAG, "Completing animating immediately");
                                        }
                                        CancellationSignal cancellationSignal = new CancellationSignal();
                                        FragmentTransitionImpl transitionImpl = this.this$0.getTransitionImpl();
                                        Fragment fragment = this.this$0.getTransitionInfos().get(0).getOperation().getFragment();
                                        Object obj = this.$mergedTransition;
                                        final DefaultSpecialEffectsController.TransitionEffect transitionEffect = this.this$0;
                                        transitionImpl.setListenerForTransitionEnd(fragment, obj, cancellationSignal, 
                                        /*  JADX ERROR: Method code generation error
                                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0067: INVOKE 
                                              (r1v7 'transitionImpl' androidx.fragment.app.FragmentTransitionImpl)
                                              (r2v6 'fragment' androidx.fragment.app.Fragment)
                                              (r3v2 'obj' java.lang.Object)
                                              (r0v5 'cancellationSignal' androidx.core.os.CancellationSignal)
                                              (wrap:java.lang.Runnable:0x0064: CONSTRUCTOR (r4v0 'transitionEffect' androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect A[DONT_INLINE]) A[MD:(androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect):void (m), WRAPPED] call: androidx.fragment.app.j.<init>(androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect):void type: CONSTRUCTOR)
                                             VIRTUAL call: androidx.fragment.app.FragmentTransitionImpl.setListenerForTransitionEnd(androidx.fragment.app.Fragment, java.lang.Object, androidx.core.os.CancellationSignal, java.lang.Runnable):void A[MD:(androidx.fragment.app.Fragment, java.lang.Object, androidx.core.os.CancellationSignal, java.lang.Runnable):void (m)] in method: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4.2.invoke():void, file: classes2.dex
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:226)
                                            	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.fragment.app.j, state: NOT_LOADED
                                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                            	... 35 more
                                            */
                                        /*
                                            this = this;
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r0 = r6.this$0
                                            java.util.List r0 = r0.getTransitionInfos()
                                            java.lang.Iterable r0 = (java.lang.Iterable) r0
                                            boolean r1 = r0 instanceof java.util.Collection
                                            java.lang.String r2 = "FragmentManager"
                                            r3 = 2
                                            if (r1 == 0) goto L19
                                            r1 = r0
                                            java.util.Collection r1 = (java.util.Collection) r1
                                            boolean r1 = r1.isEmpty()
                                            if (r1 == 0) goto L19
                                            goto L6e
                                        L19:
                                            java.util.Iterator r0 = r0.iterator()
                                        L1d:
                                            boolean r1 = r0.hasNext()
                                            if (r1 == 0) goto L6e
                                            java.lang.Object r1 = r0.next()
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r1 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r1
                                            androidx.fragment.app.SpecialEffectsController$Operation r1 = r1.getOperation()
                                            boolean r1 = r1.isSeeking()
                                            if (r1 != 0) goto L1d
                                            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
                                            if (r0 == 0) goto L3e
                                            java.lang.String r0 = "Completing animating immediately"
                                            android.util.Log.v(r2, r0)
                                        L3e:
                                            androidx.core.os.CancellationSignal r0 = new androidx.core.os.CancellationSignal
                                            r0.<init>()
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r1 = r6.this$0
                                            androidx.fragment.app.FragmentTransitionImpl r1 = r1.getTransitionImpl()
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r2 = r6.this$0
                                            java.util.List r2 = r2.getTransitionInfos()
                                            r3 = 0
                                            java.lang.Object r2 = r2.get(r3)
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r2 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r2
                                            androidx.fragment.app.SpecialEffectsController$Operation r2 = r2.getOperation()
                                            androidx.fragment.app.Fragment r2 = r2.getFragment()
                                            java.lang.Object r3 = r6.$mergedTransition
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r4 = r6.this$0
                                            androidx.fragment.app.j r5 = new androidx.fragment.app.j
                                            r5.<init>(r4)
                                            r1.setListenerForTransitionEnd(r2, r3, r0, r5)
                                            r0.cancel()
                                            return
                                        L6e:
                                            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
                                            if (r0 == 0) goto L79
                                            java.lang.String r0 = "Animating to start"
                                            android.util.Log.v(r2, r0)
                                        L79:
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r0 = r6.this$0
                                            androidx.fragment.app.FragmentTransitionImpl r0 = r0.getTransitionImpl()
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r1 = r6.this$0
                                            java.lang.Object r1 = r1.getController()
                                            kotlin.jvm.internal.g0.m(r1)
                                            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r2 = r6.this$0
                                            android.view.ViewGroup r3 = r6.$container
                                            androidx.fragment.app.i r4 = new androidx.fragment.app.i
                                            r4.<init>(r2, r3)
                                            r0.animateToStart(r1, r4)
                                            return
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4.AnonymousClass2.invoke2():void");
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // x00.a
                                public /* bridge */ /* synthetic */ g2 invoke() {
                                    invoke2();
                                    return g2.f100423a;
                                }

                                /* JADX WARN: Type inference failed for: r3v2, types: [T, androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4$2] */
                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    DefaultSpecialEffectsController.TransitionEffect transitionEffect = DefaultSpecialEffectsController.TransitionEffect.this;
                                    transitionEffect.setController(transitionEffect.getTransitionImpl().controlDelayedTransition(container, component2));
                                    boolean z11 = DefaultSpecialEffectsController.TransitionEffect.this.getController() != null;
                                    Object obj = component2;
                                    ViewGroup viewGroup = container;
                                    if (!z11) {
                                        throw new IllegalStateException(("Unable to start transition " + obj + " for container " + viewGroup + '.').toString());
                                    }
                                    objectRef.element = new AnonymousClass2(DefaultSpecialEffectsController.TransitionEffect.this, obj, viewGroup);
                                    if (FragmentManager.isLoggingEnabled(2)) {
                                        Log.v(FragmentManager.TAG, "Started executing operations from " + DefaultSpecialEffectsController.TransitionEffect.this.getFirstOut() + " to " + DefaultSpecialEffectsController.TransitionEffect.this.getLastIn());
                                    }
                                }
                            });
                        }
                    }

                    public final void setController(@m80.l Object obj) {
                        this.controller = obj;
                    }

                    public static /* synthetic */ void getTransitionSignal$annotations() {
                    }
                }
            }
