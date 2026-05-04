package androidx.compose.ui.tooling.animation;

import a00.h0;
import a00.i0;
import a00.m0;
import a00.r0;
import a00.v1;
import a00.w1;
import a00.x1;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.DecayAnimation;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.TargetBasedAnimation;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.tooling.PreviewUtils_androidKt;
import androidx.compose.ui.tooling.animation.AnimationSearch;
import androidx.compose.ui.tooling.data.CallGroup;
import androidx.compose.ui.tooling.data.Group;
import h10.d;
import h10.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import m80.k;
import w00.b;
import x00.a;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,455:1\n1747#2,2:456\n1747#2,3:458\n1749#2:461\n1855#2:462\n1855#2,2:463\n1856#2:465\n1855#2,2:466\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch\n*L\n132#1:456,2\n134#1:458,3\n132#1:461\n147#1:462\n149#1:463,2\n147#1:465\n159#1:466,2\n*E\n"})
/* loaded from: classes2.dex */
public final class AnimationSearch {
    public static final int $stable = 8;

    @k
    private final AnimatedContentSearch animatedContentSearch;

    @k
    private final AnimatedVisibilitySearch animatedVisibilitySearch;

    @k
    private final a<PreviewAnimationClock> clock;

    @k
    private final a<g2> onSeek;

    @k
    private final Set<Search<? extends Object>> setToSearch;

    @k
    private final Set<Search<? extends Object>> setToTrack;

    @k
    private final Set<Search<? extends Object>> supportedSearch;

    @k
    private final TransitionSearch transitionSearch = new TransitionSearch(new l<Transition<?>, g2>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$transitionSearch$1
        {
            super(1);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(Transition<?> transition) {
            invoke2(transition);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Transition<?> transition) {
            a aVar;
            aVar = AnimationSearch.this.clock;
            ((PreviewAnimationClock) aVar.invoke()).trackTransition(transition);
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimateContentSizeSearch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,455:1\n1747#2,3:456\n766#2:459\n857#2,2:460\n1855#2:462\n1855#2,2:463\n1856#2:465\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimateContentSizeSearch\n*L\n363#1:456,3\n372#1:459\n372#1:460,2\n373#1:462\n374#1:463,2\n373#1:465\n*E\n"})
    public static final class AnimateContentSizeSearch extends Search<Object> {
        public static final int $stable = 0;

        public AnimateContentSizeSearch(@k l<Object, g2> lVar) {
            super(lVar);
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(@k Collection<? extends Group> collection) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : collection) {
                if (!((Group) obj).getModifierInfo().isEmpty()) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Iterator<T> it2 = ((Group) it.next()).getModifierInfo().iterator();
                while (it2.hasNext()) {
                    ((ModifierInfo) it2.next()).getModifier().any(new l<Modifier.Element, Boolean>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$AnimateContentSizeSearch$addAnimations$2$1$1
                        {
                            super(1);
                        }

                        @Override // x00.l
                        public final Boolean invoke(Modifier.Element element) {
                            boolean z11;
                            if (g0.g(element.getClass().getName(), "androidx.compose.animation.SizeAnimationModifierElement")) {
                                AnimationSearch.AnimateContentSizeSearch.this.getAnimations().add(element);
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            return Boolean.valueOf(z11);
                        }
                    });
                }
            }
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean hasAnimation(@k Group group) {
            if (group.getModifierInfo().isEmpty()) {
                return false;
            }
            List<ModifierInfo> modifierInfo = group.getModifierInfo();
            if ((modifierInfo instanceof Collection) && modifierInfo.isEmpty()) {
                return false;
            }
            Iterator<T> it = modifierInfo.iterator();
            while (it.hasNext()) {
                if (((ModifierInfo) it.next()).getModifier().any(new l<Modifier.Element, Boolean>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$AnimateContentSizeSearch$hasAnimation$1$1
                    @Override // x00.l
                    public final Boolean invoke(Modifier.Element element) {
                        return Boolean.valueOf(g0.g(element.getClass().getName(), "androidx.compose.animation.SizeAnimationModifierElement"));
                    }
                })) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearch\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch_androidKt\n*L\n1#1,455:1\n1#2:456\n1#2:467\n1#2:480\n1#2:487\n1#2:572\n1603#3,9:457\n1855#3:466\n1856#3:468\n1612#3:469\n1603#3,9:470\n1855#3:479\n1856#3:481\n1612#3:482\n288#3,2:484\n1603#3,9:489\n1855#3,2:498\n1612#3:500\n1603#3,9:502\n1855#3,2:511\n1612#3:513\n1603#3,9:515\n1855#3,2:524\n1612#3:526\n766#3:527\n857#3,2:528\n1360#3:530\n1446#3,5:531\n1360#3:536\n1446#3,5:537\n800#3,11:542\n1549#3:553\n1620#3,3:554\n800#3,11:557\n288#3,2:569\n1603#3,9:574\n1855#3,2:583\n1612#3:585\n1603#3,9:587\n1855#3,2:596\n1612#3:598\n1603#3,9:600\n1855#3,2:609\n1612#3:611\n56#4:483\n57#4:486\n49#4:488\n50#4:501\n51#4:514\n56#4:568\n57#4:571\n49#4:573\n50#4:586\n51#4:599\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearch\n*L\n313#1:467\n314#1:480\n339#1:487\n354#1:572\n313#1:457,9\n313#1:466\n313#1:468\n313#1:469\n314#1:470,9\n314#1:479\n314#1:481\n314#1:482\n339#1:484,2\n339#1:489,9\n339#1:498,2\n339#1:500\n339#1:502,9\n339#1:511,2\n339#1:513\n339#1:515,9\n339#1:524,2\n339#1:526\n344#1:527\n344#1:528,2\n345#1:530\n345#1:531,5\n346#1:536\n346#1:537,5\n347#1:542,11\n348#1:553\n348#1:554,3\n349#1:557,11\n354#1:569,2\n354#1:574,9\n354#1:583,2\n354#1:585\n354#1:587,9\n354#1:596,2\n354#1:598\n354#1:600,9\n354#1:609,2\n354#1:611\n339#1:483\n339#1:486\n339#1:488\n339#1:501\n339#1:514\n354#1:568\n354#1:571\n354#1:573\n354#1:586\n354#1:599\n*E\n"})
    public static final class AnimateXAsStateSearch extends Search<AnimateXAsStateSearchInfo<?, ?>> {
        public static final int $stable = 0;

        public AnimateXAsStateSearch(@k l<? super AnimateXAsStateSearchInfo<?, ?>, g2> lVar) {
            super(lVar);
        }

        private final <T> Animatable<T, AnimationVector> findAnimatable(CallGroup callGroup) {
            T t11;
            List J;
            T t12;
            T t13;
            Iterator<T> it = callGroup.getData().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t11 = (T) null;
                    break;
                }
                t11 = it.next();
                if (t11 instanceof Animatable) {
                    break;
                }
            }
            if (!(t11 instanceof Animatable)) {
                t11 = null;
            }
            Animatable animatable = t11;
            if (animatable == null || (J = a00.g0.l(animatable)) == null) {
                J = h0.J();
            }
            List list = J;
            Collection<Group> children = callGroup.getChildren();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = children.iterator();
            while (it2.hasNext()) {
                Iterator<T> it3 = ((Group) it2.next()).getData().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        t13 = (T) null;
                        break;
                    }
                    t13 = it3.next();
                    if (t13 instanceof Animatable) {
                        break;
                    }
                }
                if (!(t13 instanceof Animatable)) {
                    t13 = null;
                }
                Animatable animatable2 = t13;
                if (animatable2 != null) {
                    arrayList.add(animatable2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it4 = children.iterator();
            while (it4.hasNext()) {
                Group firstOrNull = PreviewUtils_androidKt.firstOrNull((Group) it4.next(), AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.INSTANCE);
                if (firstOrNull != null) {
                    arrayList2.add(firstOrNull);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                Iterator<T> it6 = ((Group) it5.next()).getData().iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        t12 = (T) null;
                        break;
                    }
                    t12 = it6.next();
                    if (t12 instanceof Animatable) {
                        break;
                    }
                }
                if (!(t12 instanceof Animatable)) {
                    t12 = null;
                }
                Animatable animatable3 = t12;
                if (animatable3 != null) {
                    arrayList3.add(animatable3);
                }
            }
            return (Animatable) r0.L2(r0.I4(list, r0.I4(arrayList, arrayList3)));
        }

        private final <T> AnimationSpec<T> findAnimationSpec(CallGroup callGroup) {
            Collection<Group> children = callGroup.getChildren();
            ArrayList arrayList = new ArrayList();
            for (T t11 : children) {
                if (g0.g(((Group) t11).getName(), "rememberUpdatedState")) {
                    arrayList.add(t11);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                m0.s0(arrayList2, ((Group) it.next()).getChildren());
            }
            List I4 = r0.I4(arrayList, arrayList2);
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it2 = I4.iterator();
            while (it2.hasNext()) {
                m0.s0(arrayList3, ((Group) it2.next()).getData());
            }
            ArrayList arrayList4 = new ArrayList();
            for (T t12 : arrayList3) {
                if (t12 instanceof State) {
                    arrayList4.add(t12);
                }
            }
            ArrayList arrayList5 = new ArrayList(i0.d0(arrayList4, 10));
            Iterator<T> it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                arrayList5.add(((State) it3.next()).getValue());
            }
            ArrayList arrayList6 = new ArrayList();
            for (T t13 : arrayList5) {
                if (t13 instanceof AnimationSpec) {
                    arrayList6.add(t13);
                }
            }
            return (AnimationSpec) r0.L2(arrayList6);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.tooling.animation.AnimationSearch$AnimateXAsStateSearchInfo] */
        private final <T> List<AnimateXAsStateSearchInfo<T, AnimationVector>> findAnimations(Collection<? extends Group> collection) {
            ArrayList<CallGroup> arrayList = new ArrayList();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                CallGroup animationGroup = toAnimationGroup((Group) it.next());
                if (animationGroup != null) {
                    arrayList.add(animationGroup);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (CallGroup callGroup : arrayList) {
                Animatable<T, AnimationVector> findAnimatable = findAnimatable(callGroup);
                AnimationSpec<T> findAnimationSpec = findAnimationSpec(callGroup);
                MutableState<State<T>> findToolingOverride = findToolingOverride(callGroup);
                if (findAnimatable != null && findAnimationSpec != null && findToolingOverride != null) {
                    if (findToolingOverride.getValue() == null) {
                        findToolingOverride.setValue(new ToolingState(findAnimatable.getValue()));
                    }
                    State<T> value = findToolingOverride.getValue();
                    r4 = value instanceof ToolingState ? (ToolingState) value : null;
                    if (r4 == null) {
                        r4 = new ToolingState(findAnimatable.getValue());
                    }
                    r4 = new AnimateXAsStateSearchInfo(findAnimatable, findAnimationSpec, r4);
                }
                if (r4 != null) {
                    arrayList2.add(r4);
                }
            }
            return arrayList2;
        }

        private final <T> MutableState<State<T>> findToolingOverride(Group group) {
            T t11;
            List J;
            T t12;
            T t13;
            Iterator<T> it = group.getData().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t11 = null;
                    break;
                }
                t11 = it.next();
                if (t11 instanceof MutableState) {
                    break;
                }
            }
            if (!(t11 instanceof MutableState)) {
                t11 = null;
            }
            MutableState mutableState = (MutableState) t11;
            if (mutableState == null || (J = a00.g0.l(mutableState)) == null) {
                J = h0.J();
            }
            List list = J;
            Collection<Group> children = group.getChildren();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = children.iterator();
            while (it2.hasNext()) {
                Iterator<T> it3 = ((Group) it2.next()).getData().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        t13 = null;
                        break;
                    }
                    t13 = it3.next();
                    if (t13 instanceof MutableState) {
                        break;
                    }
                }
                if (!(t13 instanceof MutableState)) {
                    t13 = null;
                }
                MutableState mutableState2 = (MutableState) t13;
                if (mutableState2 != null) {
                    arrayList.add(mutableState2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it4 = children.iterator();
            while (it4.hasNext()) {
                Group firstOrNull = PreviewUtils_androidKt.firstOrNull((Group) it4.next(), AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.INSTANCE);
                if (firstOrNull != null) {
                    arrayList2.add(firstOrNull);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                Iterator<T> it6 = ((Group) it5.next()).getData().iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        t12 = null;
                        break;
                    }
                    t12 = it6.next();
                    if (t12 instanceof MutableState) {
                        break;
                    }
                }
                if (!(t12 instanceof MutableState)) {
                    t12 = null;
                }
                MutableState mutableState3 = (MutableState) t12;
                if (mutableState3 != null) {
                    arrayList3.add(mutableState3);
                }
            }
            return (MutableState) r0.L2(r0.I4(list, r0.I4(arrayList, arrayList3)));
        }

        private final CallGroup toAnimationGroup(Group group) {
            if (group.getLocation() == null || !g0.g(group.getName(), "animateValueAsState")) {
                group = null;
            }
            if (group == null || !(group instanceof CallGroup)) {
                return null;
            }
            return (CallGroup) group;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(@k Collection<? extends Group> collection) {
            getAnimations().addAll(findAnimations(collection));
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean hasAnimation(@k Group group) {
            CallGroup animationGroup = toAnimationGroup(group);
            return (animationGroup == null || findAnimatable(animationGroup) == null || findAnimationSpec(animationGroup) == null || findToolingOverride(animationGroup) == null) ? false : true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class AnimateXAsStateSearchInfo<T, V extends AnimationVector> {
        public static final int $stable = 8;

        @k
        private final Animatable<T, V> animatable;

        @k
        private final AnimationSpec<T> animationSpec;

        @k
        private final ToolingState<T> toolingState;

        public AnimateXAsStateSearchInfo(@k Animatable<T, V> animatable, @k AnimationSpec<T> animationSpec, @k ToolingState<T> toolingState) {
            this.animatable = animatable;
            this.animationSpec = animationSpec;
            this.toolingState = toolingState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AnimateXAsStateSearchInfo copy$default(AnimateXAsStateSearchInfo animateXAsStateSearchInfo, Animatable animatable, AnimationSpec animationSpec, ToolingState toolingState, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                animatable = animateXAsStateSearchInfo.animatable;
            }
            if ((i11 & 2) != 0) {
                animationSpec = animateXAsStateSearchInfo.animationSpec;
            }
            if ((i11 & 4) != 0) {
                toolingState = animateXAsStateSearchInfo.toolingState;
            }
            return animateXAsStateSearchInfo.copy(animatable, animationSpec, toolingState);
        }

        @k
        public final Animatable<T, V> component1() {
            return this.animatable;
        }

        @k
        public final AnimationSpec<T> component2() {
            return this.animationSpec;
        }

        @k
        public final ToolingState<T> component3() {
            return this.toolingState;
        }

        @k
        public final AnimateXAsStateSearchInfo<T, V> copy(@k Animatable<T, V> animatable, @k AnimationSpec<T> animationSpec, @k ToolingState<T> toolingState) {
            return new AnimateXAsStateSearchInfo<>(animatable, animationSpec, toolingState);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnimateXAsStateSearchInfo)) {
                return false;
            }
            AnimateXAsStateSearchInfo animateXAsStateSearchInfo = (AnimateXAsStateSearchInfo) obj;
            return g0.g(this.animatable, animateXAsStateSearchInfo.animatable) && g0.g(this.animationSpec, animateXAsStateSearchInfo.animationSpec) && g0.g(this.toolingState, animateXAsStateSearchInfo.toolingState);
        }

        @k
        public final Animatable<T, V> getAnimatable() {
            return this.animatable;
        }

        @k
        public final AnimationSpec<T> getAnimationSpec() {
            return this.animationSpec;
        }

        @k
        public final ToolingState<T> getToolingState() {
            return this.toolingState;
        }

        public int hashCode() {
            return (((this.animatable.hashCode() * 31) + this.animationSpec.hashCode()) * 31) + this.toolingState.hashCode();
        }

        @k
        public String toString() {
            return "AnimateXAsStateSearchInfo(animatable=" + this.animatable + ", animationSpec=" + this.animationSpec + ", toolingState=" + this.toolingState + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedContentSearch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch_androidKt\n*L\n1#1,455:1\n1603#2,9:456\n1855#2:465\n1856#2:467\n1612#2:468\n1855#2:470\n288#2,2:471\n1856#2:473\n1612#2:474\n1855#2,2:476\n1612#2:478\n1855#2:480\n288#2,2:481\n1856#2:483\n1612#2:484\n288#2,2:486\n1#3:466\n1#3:485\n49#4:469\n50#4:475\n51#4:479\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedContentSearch\n*L\n440#1:456,9\n440#1:465\n440#1:467\n440#1:468\n440#1:470\n440#1:471,2\n440#1:473\n440#1:474\n440#1:476,2\n440#1:478\n440#1:480\n440#1:481,2\n440#1:483\n440#1:484\n448#1:486,2\n440#1:466\n440#1:469\n440#1:475\n440#1:479\n*E\n"})
    public static final class AnimatedContentSearch extends Search<Transition<?>> {
        public static final int $stable = 0;

        public AnimatedContentSearch(@k l<? super Transition<?>, g2> lVar) {
            super(lVar);
        }

        private final Group toAnimationGroup(Group group) {
            Object obj = null;
            if (group.getLocation() == null || !g0.g(group.getName(), "AnimatedContent")) {
                group = null;
            }
            if (group == null) {
                return null;
            }
            Iterator<T> it = group.getChildren().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (g0.g(((Group) next).getName(), "updateTransition")) {
                    obj = next;
                    break;
                }
            }
            return (Group) obj;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(@k Collection<? extends Group> collection) {
            Object obj;
            Object obj2;
            Set<Transition<?>> animations = getAnimations();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                Group animationGroup = toAnimationGroup((Group) it.next());
                if (animationGroup != null) {
                    arrayList.add(animationGroup);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Iterator<T> it3 = ((Group) it2.next()).getData().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it3.next();
                        if (obj2 instanceof Transition) {
                            break;
                        }
                    }
                }
                Transition transition = (Transition) (obj2 instanceof Transition ? obj2 : null);
                if (transition != null) {
                    arrayList2.add(transition);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                Group firstOrNull = PreviewUtils_androidKt.firstOrNull((Group) it4.next(), AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.INSTANCE);
                if (firstOrNull != null) {
                    arrayList3.add(firstOrNull);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                Iterator<T> it6 = ((Group) it5.next()).getData().iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it6.next();
                        if (obj instanceof Transition) {
                            break;
                        }
                    }
                }
                if (!(obj instanceof Transition)) {
                    obj = null;
                }
                Transition transition2 = (Transition) obj;
                if (transition2 != null) {
                    arrayList4.add(transition2);
                }
            }
            animations.addAll(r0.I4(arrayList2, arrayList4));
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean hasAnimation(@k Group group) {
            return toAnimationGroup(group) != null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedVisibilitySearch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch_androidKt\n*L\n1#1,455:1\n1603#2,9:456\n1855#2:465\n1856#2:467\n1612#2:468\n1855#2:470\n288#2,2:471\n1856#2:473\n1612#2:474\n1855#2,2:476\n1612#2:478\n1855#2:480\n288#2,2:481\n1856#2:483\n1612#2:484\n288#2,2:486\n1#3:466\n1#3:485\n49#4:469\n50#4:475\n51#4:479\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedVisibilitySearch\n*L\n414#1:456,9\n414#1:465\n414#1:467\n414#1:468\n414#1:470\n414#1:471,2\n414#1:473\n414#1:474\n414#1:476,2\n414#1:478\n414#1:480\n414#1:481,2\n414#1:483\n414#1:484\n424#1:486,2\n414#1:466\n414#1:469\n414#1:475\n414#1:479\n*E\n"})
    public static final class AnimatedVisibilitySearch extends Search<Transition<?>> {
        public static final int $stable = 0;

        public AnimatedVisibilitySearch(@k l<? super Transition<?>, g2> lVar) {
            super(lVar);
        }

        private final Group toAnimationGroup(Group group) {
            Object obj = null;
            if (group.getLocation() == null || !g0.g(group.getName(), "AnimatedVisibility")) {
                group = null;
            }
            if (group == null) {
                return null;
            }
            Iterator<T> it = group.getChildren().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (g0.g(((Group) next).getName(), "updateTransition")) {
                    obj = next;
                    break;
                }
            }
            return (Group) obj;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(@k Collection<? extends Group> collection) {
            Object obj;
            Object obj2;
            Set<Transition<?>> animations = getAnimations();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                Group animationGroup = toAnimationGroup((Group) it.next());
                if (animationGroup != null) {
                    arrayList.add(animationGroup);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Iterator<T> it3 = ((Group) it2.next()).getData().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it3.next();
                        if (obj2 instanceof Transition) {
                            break;
                        }
                    }
                }
                Transition transition = (Transition) (obj2 instanceof Transition ? obj2 : null);
                if (transition != null) {
                    arrayList2.add(transition);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                Group firstOrNull = PreviewUtils_androidKt.firstOrNull((Group) it4.next(), AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.INSTANCE);
                if (firstOrNull != null) {
                    arrayList3.add(firstOrNull);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                Iterator<T> it6 = ((Group) it5.next()).getData().iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it6.next();
                        if (obj instanceof Transition) {
                            break;
                        }
                    }
                }
                if (!(obj instanceof Transition)) {
                    obj = null;
                }
                Transition transition2 = (Transition) obj;
                if (transition2 != null) {
                    arrayList4.add(transition2);
                }
            }
            animations.addAll(r0.I4(arrayList2, arrayList4));
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean hasAnimation(@k Group group) {
            return toAnimationGroup(group) != null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class DecaySearch extends RememberSearch<DecayAnimation<?, ?>> {
        public static final int $stable = 0;

        public DecaySearch(@k l<? super DecayAnimation<?, ?>, g2> lVar) {
            super(o0.d(DecayAnimation.class), lVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearch\n+ 2 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch_androidKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,455:1\n61#2,7:456\n69#2,2:469\n61#2,7:497\n69#2:510\n63#2,8:511\n64#2,4:524\n69#2:534\n63#2,8:535\n1360#3:463\n1446#3,5:464\n288#3,2:471\n1603#3,9:474\n1855#3:483\n1856#3:485\n1612#3:486\n1603#3,9:487\n1855#3:496\n1360#3:504\n1446#3,5:505\n288#3,2:519\n1856#3:522\n1612#3:523\n1360#3:528\n1446#3,5:529\n288#3,2:543\n1#4:473\n1#4:484\n1#4:521\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearch\n*L\n227#1:456,7\n227#1:469,2\n246#1:497,7\n246#1:510\n246#1:511,8\n267#1:524,4\n267#1:534\n267#1:535,8\n227#1:463\n227#1:464,5\n227#1:471,2\n244#1:474,9\n244#1:483\n244#1:485\n244#1:486\n245#1:487,9\n245#1:496\n246#1:504\n246#1:505,5\n246#1:519,2\n245#1:522\n245#1:523\n267#1:528\n267#1:529,5\n267#1:543,2\n244#1:484\n245#1:521\n*E\n"})
    public static final class InfiniteTransitionSearch extends Search<InfiniteTransitionSearchInfo> {
        public static final int $stable = 0;

        public InfiniteTransitionSearch(@k l<? super InfiniteTransitionSearchInfo, g2> lVar) {
            super(lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v6, types: [androidx.compose.ui.tooling.animation.AnimationSearch$InfiniteTransitionSearchInfo] */
        private final List<InfiniteTransitionSearchInfo> findAnimations(Collection<? extends Group> collection) {
            ToolingState toolingState;
            Object obj;
            ArrayList<CallGroup> arrayList = new ArrayList();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                CallGroup animationGroup = toAnimationGroup((Group) it.next());
                if (animationGroup != null) {
                    arrayList.add(animationGroup);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (CallGroup callGroup : arrayList) {
                Collection<Object> data = callGroup.getData();
                Collection<Group> children = callGroup.getChildren();
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = children.iterator();
                while (it2.hasNext()) {
                    m0.s0(arrayList3, ((Group) it2.next()).getData());
                }
                Iterator it3 = r0.I4(data, arrayList3).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it3.next();
                    if (obj instanceof InfiniteTransition) {
                        break;
                    }
                }
                if (!(obj instanceof InfiniteTransition)) {
                    obj = null;
                }
                InfiniteTransition infiniteTransition = (InfiniteTransition) obj;
                MutableState<State<Long>> findToolingOverride = findToolingOverride(callGroup);
                if (infiniteTransition != null && findToolingOverride != null) {
                    if (findToolingOverride.getValue() == null) {
                        findToolingOverride.setValue(new ToolingState(0L));
                    }
                    State<Long> value = findToolingOverride.getValue();
                    toolingState = value instanceof ToolingState ? (ToolingState) value : null;
                    if (toolingState == null) {
                        toolingState = new ToolingState(0L);
                    }
                    toolingState = new InfiniteTransitionSearchInfo(infiniteTransition, toolingState);
                }
                if (toolingState != null) {
                    arrayList2.add(toolingState);
                }
            }
            return arrayList2;
        }

        private final MutableState<State<Long>> findToolingOverride(Group group) {
            Object obj;
            Collection<Object> data = group.getData();
            Collection<Group> children = group.getChildren();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = children.iterator();
            while (it.hasNext()) {
                m0.s0(arrayList, ((Group) it.next()).getChildren());
            }
            List I4 = r0.I4(children, arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = I4.iterator();
            while (it2.hasNext()) {
                m0.s0(arrayList2, ((Group) it2.next()).getData());
            }
            Iterator it3 = r0.I4(data, arrayList2).iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it3.next();
                if (obj instanceof MutableState) {
                    break;
                }
            }
            return (MutableState) (obj instanceof MutableState ? obj : null);
        }

        private final CallGroup toAnimationGroup(Group group) {
            if (group.getLocation() == null || !g0.g(group.getName(), "rememberInfiniteTransition")) {
                group = null;
            }
            if (group == null || !(group instanceof CallGroup)) {
                return null;
            }
            return (CallGroup) group;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(@k Collection<? extends Group> collection) {
            getAnimations().addAll(findAnimations(collection));
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean hasAnimation(@k Group group) {
            Object obj;
            if (toAnimationGroup(group) != null) {
                Collection<Object> data = group.getData();
                Collection<Group> children = group.getChildren();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = children.iterator();
                while (it.hasNext()) {
                    m0.s0(arrayList, ((Group) it.next()).getData());
                }
                Iterator it2 = r0.I4(data, arrayList).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (obj instanceof InfiniteTransition) {
                        break;
                    }
                }
                if (((InfiniteTransition) (obj instanceof InfiniteTransition ? obj : null)) != null && findToolingOverride(group) != null) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class InfiniteTransitionSearchInfo {
        public static final int $stable = InfiniteTransition.$stable;

        @k
        private final InfiniteTransition infiniteTransition;

        @k
        private final ToolingState<Long> toolingState;

        public InfiniteTransitionSearchInfo(@k InfiniteTransition infiniteTransition, @k ToolingState<Long> toolingState) {
            this.infiniteTransition = infiniteTransition;
            this.toolingState = toolingState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InfiniteTransitionSearchInfo copy$default(InfiniteTransitionSearchInfo infiniteTransitionSearchInfo, InfiniteTransition infiniteTransition, ToolingState toolingState, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                infiniteTransition = infiniteTransitionSearchInfo.infiniteTransition;
            }
            if ((i11 & 2) != 0) {
                toolingState = infiniteTransitionSearchInfo.toolingState;
            }
            return infiniteTransitionSearchInfo.copy(infiniteTransition, toolingState);
        }

        @k
        public final InfiniteTransition component1() {
            return this.infiniteTransition;
        }

        @k
        public final ToolingState<Long> component2() {
            return this.toolingState;
        }

        @k
        public final InfiniteTransitionSearchInfo copy(@k InfiniteTransition infiniteTransition, @k ToolingState<Long> toolingState) {
            return new InfiniteTransitionSearchInfo(infiniteTransition, toolingState);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InfiniteTransitionSearchInfo)) {
                return false;
            }
            InfiniteTransitionSearchInfo infiniteTransitionSearchInfo = (InfiniteTransitionSearchInfo) obj;
            return g0.g(this.infiniteTransition, infiniteTransitionSearchInfo.infiniteTransition) && g0.g(this.toolingState, infiniteTransitionSearchInfo.toolingState);
        }

        @k
        public final InfiniteTransition getInfiniteTransition() {
            return this.infiniteTransition;
        }

        @k
        public final ToolingState<Long> getToolingState() {
            return this.toolingState;
        }

        public int hashCode() {
            return (this.infiniteTransition.hashCode() * 31) + this.toolingState.hashCode();
        }

        @k
        public String toString() {
            return "InfiniteTransitionSearchInfo(infiniteTransition=" + this.infiniteTransition + ", toolingState=" + this.toolingState + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class TargetBasedSearch extends RememberSearch<TargetBasedAnimation<?, ?>> {
        public static final int $stable = 0;

        public TargetBasedSearch(@k l<? super TargetBasedAnimation<?, ?>, g2> lVar) {
            super(o0.d(TargetBasedAnimation.class), lVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$TransitionSearch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch_androidKt\n*L\n1#1,455:1\n1603#2,9:456\n1855#2:465\n1856#2:467\n1612#2:468\n1855#2:470\n288#2,2:471\n1856#2:473\n1612#2:474\n1855#2,2:476\n1612#2:478\n1855#2:480\n288#2,2:481\n1856#2:483\n1612#2:484\n1#3:466\n1#3:485\n49#4:469\n50#4:475\n51#4:479\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$TransitionSearch\n*L\n395#1:456,9\n395#1:465\n395#1:467\n395#1:468\n395#1:470\n395#1:471,2\n395#1:473\n395#1:474\n395#1:476,2\n395#1:478\n395#1:480\n395#1:481,2\n395#1:483\n395#1:484\n395#1:466\n395#1:469\n395#1:475\n395#1:479\n*E\n"})
    public static final class TransitionSearch extends Search<Transition<?>> {
        public static final int $stable = 0;

        public TransitionSearch(@k l<? super Transition<?>, g2> lVar) {
            super(lVar);
        }

        private final Group toAnimationGroup(Group group) {
            if (group.getLocation() == null || !g0.g(group.getName(), "updateTransition")) {
                return null;
            }
            return group;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(@k Collection<? extends Group> collection) {
            Object obj;
            Object obj2;
            Set<Transition<?>> animations = getAnimations();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                Group animationGroup = toAnimationGroup((Group) it.next());
                if (animationGroup != null) {
                    arrayList.add(animationGroup);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Iterator<T> it3 = ((Group) it2.next()).getData().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it3.next();
                        if (obj2 instanceof Transition) {
                            break;
                        }
                    }
                }
                Transition transition = (Transition) (obj2 instanceof Transition ? obj2 : null);
                if (transition != null) {
                    arrayList2.add(transition);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                Group firstOrNull = PreviewUtils_androidKt.firstOrNull((Group) it4.next(), AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1.INSTANCE);
                if (firstOrNull != null) {
                    arrayList3.add(firstOrNull);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                Iterator<T> it6 = ((Group) it5.next()).getData().iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it6.next();
                        if (obj instanceof Transition) {
                            break;
                        }
                    }
                }
                if (!(obj instanceof Transition)) {
                    obj = null;
                }
                Transition transition2 = (Transition) obj;
                if (transition2 != null) {
                    arrayList4.add(transition2);
                }
            }
            animations.addAll(r0.I4(arrayList2, arrayList4));
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean hasAnimation(@k Group group) {
            return toAnimationGroup(group) != null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnimationSearch(@k a<? extends PreviewAnimationClock> aVar, @k a<g2> aVar2) {
        this.clock = aVar;
        this.onSeek = aVar2;
        AnimatedContentSearch animatedContentSearch = new AnimatedContentSearch(new l<Transition<?>, g2>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$animatedContentSearch$1
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Transition<?> transition) {
                invoke2(transition);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Transition<?> transition) {
                a aVar3;
                aVar3 = AnimationSearch.this.clock;
                ((PreviewAnimationClock) aVar3.invoke()).trackAnimatedContent(transition);
            }
        });
        this.animatedContentSearch = animatedContentSearch;
        this.animatedVisibilitySearch = new AnimatedVisibilitySearch(new l<Transition<?>, g2>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$animatedVisibilitySearch$1
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Transition<?> transition) {
                invoke2(transition);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Transition<?> transition) {
                a aVar3;
                a<g2> aVar4;
                aVar3 = AnimationSearch.this.clock;
                PreviewAnimationClock previewAnimationClock = (PreviewAnimationClock) aVar3.invoke();
                aVar4 = AnimationSearch.this.onSeek;
                previewAnimationClock.trackAnimatedVisibility(transition, aVar4);
            }
        });
        Set<Search<? extends Object>> supportedSearch = supportedSearch();
        this.supportedSearch = supportedSearch;
        Set<Search<? extends Object>> C = x1.C(supportedSearch, unsupportedSearch());
        this.setToTrack = C;
        this.setToSearch = x1.C(C, v1.f(animatedContentSearch));
    }

    private final Collection<AnimateXAsStateSearch> animateXAsStateSearch() {
        return AnimateXAsStateComposeAnimation.Companion.getApiAvailable() ? v1.f(new AnimateXAsStateSearch(new l<AnimateXAsStateSearchInfo<?, ?>, g2>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$animateXAsStateSearch$1
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(AnimationSearch.AnimateXAsStateSearchInfo<?, ?> animateXAsStateSearchInfo) {
                invoke2(animateXAsStateSearchInfo);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(AnimationSearch.AnimateXAsStateSearchInfo<?, ?> animateXAsStateSearchInfo) {
                a aVar;
                aVar = AnimationSearch.this.clock;
                ((PreviewAnimationClock) aVar.invoke()).trackAnimateXAsState(animateXAsStateSearchInfo);
            }
        })) : h0.J();
    }

    private final Set<InfiniteTransitionSearch> infiniteTransitionSearch() {
        return InfiniteTransitionComposeAnimation.Companion.getApiAvailable() ? v1.f(new InfiniteTransitionSearch(new l<InfiniteTransitionSearchInfo, g2>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$infiniteTransitionSearch$1
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(AnimationSearch.InfiniteTransitionSearchInfo infiniteTransitionSearchInfo) {
                invoke2(infiniteTransitionSearchInfo);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(AnimationSearch.InfiniteTransitionSearchInfo infiniteTransitionSearchInfo) {
                a aVar;
                aVar = AnimationSearch.this.clock;
                ((PreviewAnimationClock) aVar.invoke()).trackInfiniteTransition(infiniteTransitionSearchInfo);
            }
        })) : w1.k();
    }

    private final Set<Search<? extends Object>> supportedSearch() {
        return x1.C(x1.C(x1.C(w1.u(this.transitionSearch, this.animatedVisibilitySearch), animateXAsStateSearch()), infiniteTransitionSearch()), AnimatedContentComposeAnimation.Companion.getApiAvailable() ? v1.f(this.animatedContentSearch) : w1.k());
    }

    private final Collection<Search<? extends Object>> unsupportedSearch() {
        return UnsupportedComposeAnimation.Companion.getApiAvailable() ? w1.u(new AnimateContentSizeSearch(new l<Object, g2>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$unsupportedSearch$1
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
                a aVar;
                aVar = AnimationSearch.this.clock;
                ((PreviewAnimationClock) aVar.invoke()).trackAnimateContentSize(obj);
            }
        }), new TargetBasedSearch(new l<TargetBasedAnimation<?, ?>, g2>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$unsupportedSearch$2
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(TargetBasedAnimation<?, ?> targetBasedAnimation) {
                invoke2(targetBasedAnimation);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TargetBasedAnimation<?, ?> targetBasedAnimation) {
                a aVar;
                aVar = AnimationSearch.this.clock;
                ((PreviewAnimationClock) aVar.invoke()).trackTargetBasedAnimations(targetBasedAnimation);
            }
        }), new DecaySearch(new l<DecayAnimation<?, ?>, g2>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$unsupportedSearch$3
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(DecayAnimation<?, ?> decayAnimation) {
                invoke2(decayAnimation);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DecayAnimation<?, ?> decayAnimation) {
                a aVar;
                aVar = AnimationSearch.this.clock;
                ((PreviewAnimationClock) aVar.invoke()).trackDecayAnimations(decayAnimation);
            }
        })) : h0.J();
    }

    public final void attachAllAnimations(@k Collection<? extends Group> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            List<Group> findAll = PreviewUtils_androidKt.findAll((Group) it.next(), new l<Group, Boolean>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$attachAllAnimations$1$groups$1
                @Override // x00.l
                public final Boolean invoke(Group group) {
                    return Boolean.TRUE;
                }
            });
            Iterator<T> it2 = this.setToSearch.iterator();
            while (it2.hasNext()) {
                ((Search) it2.next()).addAnimations(findAll);
            }
            this.transitionSearch.getAnimations().removeAll(this.animatedVisibilitySearch.getAnimations());
            this.transitionSearch.getAnimations().removeAll(this.animatedContentSearch.getAnimations());
        }
        Iterator<T> it3 = this.setToTrack.iterator();
        while (it3.hasNext()) {
            ((Search) it3.next()).track();
        }
    }

    public final boolean searchAny(@k Collection<? extends Group> collection) {
        Collection<? extends Group> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return false;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            List<Group> findAll = PreviewUtils_androidKt.findAll((Group) it.next(), new l<Group, Boolean>() { // from class: androidx.compose.ui.tooling.animation.AnimationSearch$searchAny$1$groups$1
                @Override // x00.l
                public final Boolean invoke(Group group) {
                    return Boolean.TRUE;
                }
            });
            Set<Search<? extends Object>> set = this.supportedSearch;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it2 = set.iterator();
                while (it2.hasNext()) {
                    if (((Search) it2.next()).hasAnimations(findAll)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    @u0({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$RememberSearch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,455:1\n766#2:456\n857#2,2:457\n1603#2,9:459\n1855#2:468\n1856#2:470\n1612#2:471\n288#2,2:472\n1#3:469\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$RememberSearch\n*L\n191#1:456\n191#1:457,2\n200#1:459,9\n200#1:468\n200#1:470\n200#1:471\n206#1:472,2\n200#1:469\n*E\n"})
    public static class RememberSearch<T> extends Search<T> {
        public static final int $stable = 8;

        @k
        private final d<T> clazz;

        public RememberSearch(@k d<T> dVar, @k l<? super T, g2> lVar) {
            super(lVar);
            this.clazz = dVar;
        }

        private final <T> List<T> findRememberCallWithType(Collection<? extends Group> collection, d<T> dVar) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                T findRememberCallWithType = findRememberCallWithType((Group) it.next(), dVar);
                if (findRememberCallWithType != null) {
                    arrayList.add(findRememberCallWithType);
                }
            }
            return arrayList;
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(@k Collection<? extends Group> collection) {
            ArrayList arrayList = new ArrayList();
            for (T t11 : collection) {
                if (((Group) t11).getLocation() != null) {
                    arrayList.add(t11);
                }
            }
            getAnimations().addAll(r0.f6(findRememberCallWithType(arrayList, this.clazz)));
        }

        @Override // androidx.compose.ui.tooling.animation.AnimationSearch.Search
        public boolean hasAnimation(@k Group group) {
            return (group.getLocation() == null || findRememberCallWithType(group, this.clazz) == null) ? false : true;
        }

        private final <T> T findRememberCallWithType(Group group, d<T> dVar) {
            Object obj;
            Iterator<T> it = group.getData().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (g0.g(next != null ? b.i(next.getClass()) : null, dVar)) {
                    obj = next;
                    break;
                }
            }
            return (T) e.b(dVar, obj);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    @u0({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$Search\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,455:1\n1747#2,3:456\n1855#2,2:459\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$Search\n*L\n166#1:456,3\n183#1:459,2\n*E\n"})
    public static abstract class Search<T> {
        public static final int $stable = 8;

        @k
        private final Set<T> animations = new LinkedHashSet();

        @k
        private final l<T, g2> trackAnimation;

        /* JADX WARN: Multi-variable type inference failed */
        public Search(@k l<? super T, g2> lVar) {
            this.trackAnimation = lVar;
        }

        @k
        public final Set<T> getAnimations() {
            return this.animations;
        }

        public abstract boolean hasAnimation(@k Group group);

        public final boolean hasAnimations(@k Collection<? extends Group> collection) {
            Collection<? extends Group> collection2 = collection;
            if ((collection2 instanceof Collection) && collection2.isEmpty()) {
                return false;
            }
            Iterator<T> it = collection2.iterator();
            while (it.hasNext()) {
                if (hasAnimation((Group) it.next())) {
                    return true;
                }
            }
            return false;
        }

        public final void track() {
            List c52 = r0.c5(this.animations);
            l<T, g2> lVar = this.trackAnimation;
            Iterator<T> it = c52.iterator();
            while (it.hasNext()) {
                lVar.invoke(it.next());
            }
        }

        public void addAnimations(@k Collection<? extends Group> collection) {
        }
    }
}
