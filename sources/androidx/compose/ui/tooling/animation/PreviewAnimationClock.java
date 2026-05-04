package androidx.compose.ui.tooling.animation;

import a00.h0;
import a00.r0;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.compose.animation.core.DecayAnimation;
import androidx.compose.animation.core.TargetBasedAnimation;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.animation.AnimationSearch;
import androidx.compose.ui.tooling.animation.clock.AnimateXAsStateClock;
import androidx.compose.ui.tooling.animation.clock.AnimatedVisibilityClock;
import androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock;
import androidx.compose.ui.tooling.animation.clock.InfiniteTransitionClock;
import androidx.compose.ui.tooling.animation.clock.TransitionClock;
import androidx.compose.ui.tooling.animation.clock.Utils_androidKt;
import androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import x00.a;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nPreviewAnimationClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewAnimationClock.android.kt\nandroidx/compose/ui/tooling/animation/PreviewAnimationClock\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,360:1\n1#2:361\n1855#3,2:362\n1855#3,2:366\n1855#3,2:368\n215#4,2:364\n*S KotlinDebug\n*F\n+ 1 PreviewAnimationClock.android.kt\nandroidx/compose/ui/tooling/animation/PreviewAnimationClock\n*L\n334#1:362,2\n352#1:366,2\n353#1:368,2\n344#1:364,2\n*E\n"})
/* loaded from: classes2.dex */
public class PreviewAnimationClock {
    public static final int $stable = 8;
    private final boolean DEBUG;

    @k
    private final String TAG;

    @k
    private final Map<AnimateXAsStateComposeAnimation<?, ?>, AnimateXAsStateClock<?, ?>> animateXAsStateClocks;

    @k
    private final Map<AnimatedContentComposeAnimation<?>, TransitionClock<?>> animatedContentClocks;

    @k
    private final Map<AnimatedVisibilityComposeAnimation, AnimatedVisibilityClock> animatedVisibilityClocks;

    @k
    private final Map<InfiniteTransitionComposeAnimation, InfiniteTransitionClock> infiniteTransitionClocks;

    @k
    private final Object lock;

    @k
    private final a<g2> setAnimationsTimeCallback;

    @k
    private final LinkedHashSet<Object> trackedAnimations;

    @k
    private final LinkedHashSet<UnsupportedComposeAnimation> trackedUnsupportedAnimations;

    @k
    private final Map<TransitionComposeAnimation<?>, TransitionClock<?>> transitionClocks;

    /* JADX WARN: Multi-variable type inference failed */
    public PreviewAnimationClock() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createUnsupported(String str) {
        UnsupportedComposeAnimation create = UnsupportedComposeAnimation.Companion.create(str);
        if (create != null) {
            this.trackedUnsupportedAnimations.add(create);
            notifySubscribe(create);
        }
    }

    private final ComposeAnimationClock<?, ?> findClock(ComposeAnimation composeAnimation) {
        TransitionClock<?> transitionClock = this.transitionClocks.get(composeAnimation);
        if (transitionClock != null) {
            return transitionClock;
        }
        AnimatedVisibilityClock animatedVisibilityClock = this.animatedVisibilityClocks.get(composeAnimation);
        if (animatedVisibilityClock != null) {
            return animatedVisibilityClock;
        }
        AnimateXAsStateClock<?, ?> animateXAsStateClock = this.animateXAsStateClocks.get(composeAnimation);
        if (animateXAsStateClock != null) {
            return animateXAsStateClock;
        }
        InfiniteTransitionClock infiniteTransitionClock = this.infiniteTransitionClocks.get(composeAnimation);
        return infiniteTransitionClock != null ? infiniteTransitionClock : this.animatedContentClocks.get(composeAnimation);
    }

    private final List<ComposeAnimationClock<?, ?>> getAllClocks() {
        return r0.I4(getAllClocksExceptInfinite(), this.infiniteTransitionClocks.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ComposeAnimationClock<?, ?>> getAllClocksExceptInfinite() {
        return r0.I4(r0.I4(r0.I4(this.transitionClocks.values(), this.animatedVisibilityClocks.values()), this.animateXAsStateClocks.values()), this.animatedContentClocks.values());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackAnimatedVisibility$default(PreviewAnimationClock previewAnimationClock, Transition transition, a aVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackAnimatedVisibility");
        }
        if ((i11 & 2) != 0) {
            aVar = new a<g2>() { // from class: androidx.compose.ui.tooling.animation.PreviewAnimationClock$trackAnimatedVisibility$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // x00.a
                public /* bridge */ /* synthetic */ g2 invoke() {
                    invoke2();
                    return g2.f100423a;
                }
            };
        }
        previewAnimationClock.trackAnimatedVisibility(transition, aVar);
    }

    private final boolean trackAnimation(Object obj, l<Object, g2> lVar) {
        synchronized (this.lock) {
            if (this.trackedAnimations.contains(obj)) {
                if (this.DEBUG) {
                    Log.d(this.TAG, "Animation " + obj + " is already being tracked");
                }
                return false;
            }
            this.trackedAnimations.add(obj);
            lVar.invoke(obj);
            if (!this.DEBUG) {
                return true;
            }
            Log.d(this.TAG, "Animation " + obj + " is now tracked");
            return true;
        }
    }

    private final void trackUnsupported(Object obj, final String str) {
        trackAnimation(obj, new l<Object, g2>() { // from class: androidx.compose.ui.tooling.animation.PreviewAnimationClock$trackUnsupported$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Object obj2) {
                invoke2(obj2);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj2) {
                PreviewAnimationClock.this.createUnsupported(str);
            }
        });
    }

    public final void dispose() {
        Iterator<T> it = getAllClocks().iterator();
        while (it.hasNext()) {
            notifyUnsubscribe(((ComposeAnimationClock) it.next()).getAnimation());
        }
        Iterator<T> it2 = this.trackedUnsupportedAnimations.iterator();
        while (it2.hasNext()) {
            notifyUnsubscribe((UnsupportedComposeAnimation) it2.next());
        }
        this.trackedUnsupportedAnimations.clear();
        this.transitionClocks.clear();
        this.animatedVisibilityClocks.clear();
        this.trackedAnimations.clear();
    }

    @k
    public final Map<AnimateXAsStateComposeAnimation<?, ?>, AnimateXAsStateClock<?, ?>> getAnimateXAsStateClocks$ui_tooling_release() {
        return this.animateXAsStateClocks;
    }

    @k
    public final Map<AnimatedContentComposeAnimation<?>, TransitionClock<?>> getAnimatedContentClocks$ui_tooling_release() {
        return this.animatedContentClocks;
    }

    @k
    public final List<ComposeAnimatedProperty> getAnimatedProperties(@k ComposeAnimation composeAnimation) {
        List<ComposeAnimatedProperty> animatedProperties;
        ComposeAnimationClock<?, ?> findClock = findClock(composeAnimation);
        return (findClock == null || (animatedProperties = findClock.getAnimatedProperties()) == null) ? h0.J() : animatedProperties;
    }

    @k
    public final Map<AnimatedVisibilityComposeAnimation, AnimatedVisibilityClock> getAnimatedVisibilityClocks$ui_tooling_release() {
        return this.animatedVisibilityClocks;
    }

    @k
    /* renamed from: getAnimatedVisibilityState-cc2g1to, reason: not valid java name */
    public final String m5041getAnimatedVisibilityStatecc2g1to(@k ComposeAnimation composeAnimation) {
        AnimatedVisibilityClock animatedVisibilityClock = this.animatedVisibilityClocks.get(composeAnimation);
        return animatedVisibilityClock != null ? animatedVisibilityClock.m5044getStatejXw82LU() : AnimatedVisibilityState.Companion.m5053getEnterjXw82LU();
    }

    @k
    public final Map<InfiniteTransitionComposeAnimation, InfiniteTransitionClock> getInfiniteTransitionClocks$ui_tooling_release() {
        return this.infiniteTransitionClocks;
    }

    public final long getMaxDuration() {
        Long l11;
        Iterator<T> it = getAllClocks().iterator();
        if (it.hasNext()) {
            Long valueOf = Long.valueOf(((ComposeAnimationClock) it.next()).getMaxDuration());
            while (it.hasNext()) {
                Long valueOf2 = Long.valueOf(((ComposeAnimationClock) it.next()).getMaxDuration());
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            l11 = valueOf;
        } else {
            l11 = null;
        }
        if (l11 != null) {
            return l11.longValue();
        }
        return 0L;
    }

    public final long getMaxDurationPerIteration() {
        Long l11;
        Iterator<T> it = getAllClocks().iterator();
        if (it.hasNext()) {
            Long valueOf = Long.valueOf(((ComposeAnimationClock) it.next()).getMaxDurationPerIteration());
            while (it.hasNext()) {
                Long valueOf2 = Long.valueOf(((ComposeAnimationClock) it.next()).getMaxDurationPerIteration());
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            l11 = valueOf;
        } else {
            l11 = null;
        }
        if (l11 != null) {
            return l11.longValue();
        }
        return 0L;
    }

    @k
    public final LinkedHashSet<UnsupportedComposeAnimation> getTrackedUnsupportedAnimations() {
        return this.trackedUnsupportedAnimations;
    }

    @k
    public final Map<TransitionComposeAnimation<?>, TransitionClock<?>> getTransitionClocks$ui_tooling_release() {
        return this.transitionClocks;
    }

    @k
    public final List<TransitionInfo> getTransitions(@k ComposeAnimation composeAnimation, long j11) {
        List<TransitionInfo> transitions;
        ComposeAnimationClock<?, ?> findClock = findClock(composeAnimation);
        return (findClock == null || (transitions = findClock.getTransitions(j11)) == null) ? h0.J() : transitions;
    }

    public final void setClockTime(long j11) {
        long millisToNanos = Utils_androidKt.millisToNanos(j11);
        Iterator<T> it = getAllClocks().iterator();
        while (it.hasNext()) {
            ((ComposeAnimationClock) it.next()).setClockTime(millisToNanos);
        }
        this.setAnimationsTimeCallback.invoke();
    }

    public final void setClockTimes(@k Map<ComposeAnimation, Long> map) {
        for (Map.Entry<ComposeAnimation, Long> entry : map.entrySet()) {
            ComposeAnimation key = entry.getKey();
            long longValue = entry.getValue().longValue();
            ComposeAnimationClock<?, ?> findClock = findClock(key);
            if (findClock != null) {
                findClock.setClockTime(Utils_androidKt.millisToNanos(longValue));
            }
        }
        this.setAnimationsTimeCallback.invoke();
    }

    public final void trackAnimateContentSize(@k Object obj) {
        trackUnsupported(obj, "animateContentSize");
    }

    public final void trackAnimateXAsState(@k final AnimationSearch.AnimateXAsStateSearchInfo<?, ?> animateXAsStateSearchInfo) {
        trackAnimation(animateXAsStateSearchInfo.getAnimatable(), new l<Object, g2>() { // from class: androidx.compose.ui.tooling.animation.PreviewAnimationClock$trackAnimateXAsState$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Object obj) {
                invoke2(obj);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                AnimateXAsStateComposeAnimation<?, ?> parse$ui_tooling_release = AnimateXAsStateComposeAnimation.Companion.parse$ui_tooling_release(animateXAsStateSearchInfo);
                if (parse$ui_tooling_release == null) {
                    this.createUnsupported(animateXAsStateSearchInfo.getAnimatable().getLabel());
                    return;
                }
                PreviewAnimationClock previewAnimationClock = this;
                previewAnimationClock.getAnimateXAsStateClocks$ui_tooling_release().put(parse$ui_tooling_release, new AnimateXAsStateClock<>(parse$ui_tooling_release));
                previewAnimationClock.notifySubscribe(parse$ui_tooling_release);
            }
        });
    }

    public final void trackAnimatedContent(@k final Transition<?> transition) {
        trackAnimation(transition, new l<Object, g2>() { // from class: androidx.compose.ui.tooling.animation.PreviewAnimationClock$trackAnimatedContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Object obj) {
                invoke2(obj);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                AnimatedContentComposeAnimation<?> parseAnimatedContent = AnimatedContentComposeAnimation.Companion.parseAnimatedContent(transition);
                if (parseAnimatedContent == null) {
                    this.createUnsupported(transition.getLabel());
                    return;
                }
                PreviewAnimationClock previewAnimationClock = this;
                previewAnimationClock.getAnimatedContentClocks$ui_tooling_release().put(parseAnimatedContent, new TransitionClock<>(parseAnimatedContent));
                previewAnimationClock.notifySubscribe(parseAnimatedContent);
            }
        });
    }

    public final void trackAnimatedVisibility(@k final Transition<?> transition, @k final a<g2> aVar) {
        if (transition.getCurrentState() instanceof Boolean) {
            trackAnimation(transition, new l<Object, g2>() { // from class: androidx.compose.ui.tooling.animation.PreviewAnimationClock$trackAnimatedVisibility$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Object obj) {
                    invoke2(obj);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object obj) {
                    g0.n(transition, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Boolean>");
                    AnimatedVisibilityComposeAnimation parseAnimatedVisibility = AnimatedVisibilityComposeAnimation_androidKt.parseAnimatedVisibility(transition);
                    aVar.invoke();
                    Map<AnimatedVisibilityComposeAnimation, AnimatedVisibilityClock> animatedVisibilityClocks$ui_tooling_release = this.getAnimatedVisibilityClocks$ui_tooling_release();
                    AnimatedVisibilityClock animatedVisibilityClock = new AnimatedVisibilityClock(parseAnimatedVisibility);
                    animatedVisibilityClock.setClockTime(0L);
                    animatedVisibilityClocks$ui_tooling_release.put(parseAnimatedVisibility, animatedVisibilityClock);
                    this.notifySubscribe(parseAnimatedVisibility);
                }
            });
        }
    }

    public final void trackDecayAnimations(@k DecayAnimation<?, ?> decayAnimation) {
        trackUnsupported(decayAnimation, "DecayAnimation");
    }

    public final void trackInfiniteTransition(@k final AnimationSearch.InfiniteTransitionSearchInfo infiniteTransitionSearchInfo) {
        trackAnimation(infiniteTransitionSearchInfo.getInfiniteTransition(), new l<Object, g2>() { // from class: androidx.compose.ui.tooling.animation.PreviewAnimationClock$trackInfiniteTransition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Object obj) {
                invoke2(obj);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                InfiniteTransitionComposeAnimation parse$ui_tooling_release = InfiniteTransitionComposeAnimation.Companion.parse$ui_tooling_release(AnimationSearch.InfiniteTransitionSearchInfo.this);
                if (parse$ui_tooling_release != null) {
                    final PreviewAnimationClock previewAnimationClock = this;
                    previewAnimationClock.getInfiniteTransitionClocks$ui_tooling_release().put(parse$ui_tooling_release, new InfiniteTransitionClock(parse$ui_tooling_release, new a<Long>() { // from class: androidx.compose.ui.tooling.animation.PreviewAnimationClock$trackInfiniteTransition$1$1$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // x00.a
                        public final Long invoke() {
                            List allClocksExceptInfinite;
                            Long valueOf;
                            allClocksExceptInfinite = PreviewAnimationClock.this.getAllClocksExceptInfinite();
                            Iterator it = allClocksExceptInfinite.iterator();
                            Long l11 = null;
                            if (it.hasNext()) {
                                valueOf = Long.valueOf(((ComposeAnimationClock) it.next()).getMaxDuration());
                                while (it.hasNext()) {
                                    Long valueOf2 = Long.valueOf(((ComposeAnimationClock) it.next()).getMaxDuration());
                                    if (valueOf.compareTo(valueOf2) < 0) {
                                        valueOf = valueOf2;
                                    }
                                }
                            } else {
                                valueOf = null;
                            }
                            long longValue = valueOf != null ? valueOf.longValue() : 0L;
                            Iterator<T> it2 = PreviewAnimationClock.this.getInfiniteTransitionClocks$ui_tooling_release().values().iterator();
                            if (it2.hasNext()) {
                                l11 = Long.valueOf(((InfiniteTransitionClock) it2.next()).getMaxDurationPerIteration());
                                while (it2.hasNext()) {
                                    Long valueOf3 = Long.valueOf(((InfiniteTransitionClock) it2.next()).getMaxDurationPerIteration());
                                    if (l11.compareTo(valueOf3) < 0) {
                                        l11 = valueOf3;
                                    }
                                }
                            }
                            return Long.valueOf(Math.max(longValue, l11 != null ? l11.longValue() : 0L));
                        }
                    }));
                    previewAnimationClock.notifySubscribe(parse$ui_tooling_release);
                }
            }
        });
    }

    public final void trackTargetBasedAnimations(@k TargetBasedAnimation<?, ?> targetBasedAnimation) {
        trackUnsupported(targetBasedAnimation, "TargetBasedAnimation");
    }

    public final void trackTransition(@k final Transition<?> transition) {
        trackAnimation(transition, new l<Object, g2>() { // from class: androidx.compose.ui.tooling.animation.PreviewAnimationClock$trackTransition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Object obj) {
                invoke2(obj);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                TransitionComposeAnimation<?> parse = TransitionComposeAnimation_androidKt.parse(transition);
                if (parse == null) {
                    this.createUnsupported(transition.getLabel());
                    return;
                }
                PreviewAnimationClock previewAnimationClock = this;
                previewAnimationClock.getTransitionClocks$ui_tooling_release().put(parse, new TransitionClock<>(parse));
                previewAnimationClock.notifySubscribe(parse);
            }
        });
    }

    public final void updateAnimatedVisibilityState(@k ComposeAnimation composeAnimation, @k Object obj) {
        AnimatedVisibilityClock animatedVisibilityClock = this.animatedVisibilityClocks.get(composeAnimation);
        if (animatedVisibilityClock != null) {
            ComposeAnimationClock.setStateParameters$default(animatedVisibilityClock, obj, null, 2, null);
        }
    }

    public final void updateFromAndToStates(@k ComposeAnimation composeAnimation, @k Object obj, @k Object obj2) {
        ComposeAnimationClock<?, ?> findClock = findClock(composeAnimation);
        if (findClock != null) {
            findClock.setStateParameters(obj, obj2);
        }
    }

    public PreviewAnimationClock(@k a<g2> aVar) {
        this.setAnimationsTimeCallback = aVar;
        this.TAG = "PreviewAnimationClock";
        this.transitionClocks = new LinkedHashMap();
        this.animatedVisibilityClocks = new LinkedHashMap();
        this.animateXAsStateClocks = new LinkedHashMap();
        this.infiniteTransitionClocks = new LinkedHashMap();
        this.animatedContentClocks = new LinkedHashMap();
        this.trackedUnsupportedAnimations = new LinkedHashSet<>();
        this.trackedAnimations = new LinkedHashSet<>();
        this.lock = new Object();
    }

    public /* synthetic */ PreviewAnimationClock(a aVar, int i11, v vVar) {
        this((i11 & 1) != 0 ? new a<g2>() { // from class: androidx.compose.ui.tooling.animation.PreviewAnimationClock.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ g2 invoke() {
                invoke2();
                return g2.f100423a;
            }
        } : aVar);
    }

    @VisibleForTesting
    public static /* synthetic */ void getAnimateXAsStateClocks$ui_tooling_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getAnimatedContentClocks$ui_tooling_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getAnimatedVisibilityClocks$ui_tooling_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getInfiniteTransitionClocks$ui_tooling_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTrackedUnsupportedAnimations$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTransitionClocks$ui_tooling_release$annotations() {
    }

    @VisibleForTesting
    public void notifySubscribe(@k ComposeAnimation composeAnimation) {
    }

    @VisibleForTesting
    public void notifyUnsubscribe(@k ComposeAnimation composeAnimation) {
    }
}
