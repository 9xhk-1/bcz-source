package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.os.CancellationSignal;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransitionImpl;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public class FragmentTransitionSupport extends FragmentTransitionImpl {
    public static /* synthetic */ void a(Runnable runnable, Transition transition, Runnable runnable2) {
        if (runnable != null) {
            runnable.run();
        } else {
            transition.cancel();
            runnable2.run();
        }
    }

    private static boolean hasSimpleTarget(Transition transition) {
        return (FragmentTransitionImpl.isNullOrEmpty(transition.getTargetIds()) && FragmentTransitionImpl.isNullOrEmpty(transition.getTargetNames()) && FragmentTransitionImpl.isNullOrEmpty(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void addTarget(@NonNull Object obj, @NonNull View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void addTargets(@NonNull Object obj, @NonNull ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i11 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i11 < transitionCount) {
                addTargets(transitionSet.getTransitionAt(i11), arrayList);
                i11++;
            }
            return;
        }
        if (hasSimpleTarget(transition) || !FragmentTransitionImpl.isNullOrEmpty(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i11 < size) {
            transition.addTarget(arrayList.get(i11));
            i11++;
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void animateToEnd(@NonNull Object obj) {
        ((TransitionSeekController) obj).animateToEnd();
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void animateToStart(@NonNull Object obj, @NonNull Runnable runnable) {
        ((TransitionSeekController) obj).animateToStart(runnable);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void beginDelayedTransition(@NonNull ViewGroup viewGroup, @Nullable Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public boolean canHandle(@NonNull Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    @Nullable
    public Object cloneTransition(@Nullable Object obj) {
        if (obj != null) {
            return ((Transition) obj).mo5627clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    @Nullable
    public Object controlDelayedTransition(@NonNull ViewGroup viewGroup, @NonNull Object obj) {
        return TransitionManager.controlDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public boolean isSeekingSupported() {
        return true;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    @Nullable
    public Object mergeTransitionsInSequence(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    @NonNull
    public Object mergeTransitionsTogether(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void removeTarget(@NonNull Object obj, @NonNull View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void replaceTargets(@NonNull Object obj, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList2) {
        Transition transition = (Transition) obj;
        int i11 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i11 < transitionCount) {
                replaceTargets(transitionSet.getTransitionAt(i11), arrayList, arrayList2);
                i11++;
            }
            return;
        }
        if (hasSimpleTarget(transition)) {
            return;
        }
        List<View> targets = transition.getTargets();
        if (targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i11 < size) {
                transition.addTarget(arrayList2.get(i11));
                i11++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void scheduleHideFragmentView(@NonNull Object obj, @NonNull final View view, @NonNull final ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new Transition.TransitionListener() { // from class: androidx.transition.FragmentTransitionSupport.2
            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(@NonNull Transition transition) {
                transition.removeListener(this);
                view.setVisibility(8);
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((View) arrayList.get(i11)).setVisibility(0);
                }
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionStart(@NonNull Transition transition) {
                transition.removeListener(this);
                transition.addListener(this);
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionCancel(@NonNull Transition transition) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionPause(@NonNull Transition transition) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionResume(@NonNull Transition transition) {
            }
        });
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void scheduleRemoveTargets(@NonNull Object obj, @Nullable final Object obj2, @Nullable final ArrayList<View> arrayList, @Nullable final Object obj3, @Nullable final ArrayList<View> arrayList2, @Nullable final Object obj4, @Nullable final ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new TransitionListenerAdapter() { // from class: androidx.transition.FragmentTransitionSupport.3
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(@NonNull Transition transition) {
                transition.removeListener(this);
            }

            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionStart(@NonNull Transition transition) {
                Object obj5 = obj2;
                if (obj5 != null) {
                    FragmentTransitionSupport.this.replaceTargets(obj5, arrayList, null);
                }
                Object obj6 = obj3;
                if (obj6 != null) {
                    FragmentTransitionSupport.this.replaceTargets(obj6, arrayList2, null);
                }
                Object obj7 = obj4;
                if (obj7 != null) {
                    FragmentTransitionSupport.this.replaceTargets(obj7, arrayList3, null);
                }
            }
        });
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void setCurrentPlayTime(@NonNull Object obj, float f11) {
        TransitionSeekController transitionSeekController = (TransitionSeekController) obj;
        if (transitionSeekController.isReady()) {
            long durationMillis = (long) (f11 * transitionSeekController.getDurationMillis());
            if (durationMillis == 0) {
                durationMillis = 1;
            }
            if (durationMillis == transitionSeekController.getDurationMillis()) {
                durationMillis = transitionSeekController.getDurationMillis() - 1;
            }
            transitionSeekController.setCurrentPlayTimeMillis(durationMillis);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void setEpicenter(@NonNull Object obj, @Nullable View view) {
        if (view != null) {
            final Rect rect = new Rect();
            getBoundsOnScreen(view, rect);
            ((Transition) obj).setEpicenterCallback(new Transition.EpicenterCallback() { // from class: androidx.transition.FragmentTransitionSupport.1
                @Override // androidx.transition.Transition.EpicenterCallback
                public Rect onGetEpicenter(@NonNull Transition transition) {
                    return rect;
                }
            });
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void setListenerForTransitionEnd(@NonNull Fragment fragment, @NonNull Object obj, @NonNull CancellationSignal cancellationSignal, @NonNull Runnable runnable) {
        setListenerForTransitionEnd(fragment, obj, cancellationSignal, null, runnable);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void setSharedElementTargets(@NonNull Object obj, @NonNull View view, @NonNull ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            FragmentTransitionImpl.bfsAddViewChildren(targets, arrayList.get(i11));
        }
        targets.add(view);
        arrayList.add(view);
        addTargets(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void swapSharedElementTargets(@Nullable Object obj, @Nullable ArrayList<View> arrayList, @Nullable ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            replaceTargets(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    @Nullable
    public Object wrapTransitionInSet(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public boolean isSeekingSupported(@NonNull Object obj) {
        boolean isSeekingSupported = ((Transition) obj).isSeekingSupported();
        if (!isSeekingSupported) {
            Log.v(FragmentManager.TAG, "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return isSeekingSupported;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void setListenerForTransitionEnd(@NonNull Fragment fragment, @NonNull Object obj, @NonNull CancellationSignal cancellationSignal, @Nullable final Runnable runnable, @NonNull final Runnable runnable2) {
        final Transition transition = (Transition) obj;
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.transition.a
            @Override // androidx.core.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                FragmentTransitionSupport.a(runnable, transition, runnable2);
            }
        });
        transition.addListener(new Transition.TransitionListener() { // from class: androidx.transition.FragmentTransitionSupport.4
            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(@NonNull Transition transition2) {
                runnable2.run();
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionCancel(@NonNull Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionPause(@NonNull Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionResume(@NonNull Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionStart(@NonNull Transition transition2) {
            }
        });
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void setEpicenter(@NonNull Object obj, @NonNull final Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new Transition.EpicenterCallback() { // from class: androidx.transition.FragmentTransitionSupport.5
                @Override // androidx.transition.Transition.EpicenterCallback
                public Rect onGetEpicenter(@NonNull Transition transition) {
                    Rect rect2 = rect;
                    if (rect2 == null || rect2.isEmpty()) {
                        return null;
                    }
                    return rect;
                }
            });
        }
    }
}
