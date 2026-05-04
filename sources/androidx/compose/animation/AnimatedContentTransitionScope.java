package androidx.compose.animation;

import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import kotlin.jvm.internal.v;
import m80.k;
import w00.h;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface AnimatedContentTransitionScope<S> extends Transition.Segment<S> {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: slideIntoContainer-mOhB8PU$default, reason: not valid java name */
    static /* synthetic */ EnterTransition m34slideIntoContainermOhB8PU$default(AnimatedContentTransitionScope animatedContentTransitionScope, int i11, FiniteAnimationSpec finiteAnimationSpec, l lVar, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slideIntoContainer-mOhB8PU");
        }
        if ((i12 & 2) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m5234boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 3, null);
        }
        if ((i12 & 4) != 0) {
            lVar = new l<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScope$slideIntoContainer$1
                public final Integer invoke(int i13) {
                    return Integer.valueOf(i13);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return animatedContentTransitionScope.mo36slideIntoContainermOhB8PU(i11, finiteAnimationSpec, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: slideOutOfContainer-mOhB8PU$default, reason: not valid java name */
    static /* synthetic */ ExitTransition m35slideOutOfContainermOhB8PU$default(AnimatedContentTransitionScope animatedContentTransitionScope, int i11, FiniteAnimationSpec finiteAnimationSpec, l lVar, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slideOutOfContainer-mOhB8PU");
        }
        if ((i12 & 2) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m5234boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 3, null);
        }
        if ((i12 & 4) != 0) {
            lVar = new l<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScope$slideOutOfContainer$1
                public final Integer invoke(int i13) {
                    return Integer.valueOf(i13);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return animatedContentTransitionScope.mo37slideOutOfContainermOhB8PU(i11, finiteAnimationSpec, lVar);
    }

    @k
    Alignment getContentAlignment();

    @k
    default ExitTransition getKeepUntilTransitionsFinished(@k ExitTransition.Companion companion) {
        return companion.getKeepUntilTransitionsFinished$animation();
    }

    @k
    /* renamed from: slideIntoContainer-mOhB8PU, reason: not valid java name */
    EnterTransition mo36slideIntoContainermOhB8PU(int i11, @k FiniteAnimationSpec<IntOffset> finiteAnimationSpec, @k l<? super Integer, Integer> lVar);

    @k
    /* renamed from: slideOutOfContainer-mOhB8PU, reason: not valid java name */
    ExitTransition mo37slideOutOfContainermOhB8PU(int i11, @k FiniteAnimationSpec<IntOffset> finiteAnimationSpec, @k l<? super Integer, Integer> lVar);

    @k
    ContentTransform using(@k ContentTransform contentTransform, @m80.l SizeTransform sizeTransform);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @h
    @Immutable
    public static final class SlideDirection {
        private final int value;

        @k
        public static final Companion Companion = new Companion(null);
        private static final int Left = m39constructorimpl(0);
        private static final int Right = m39constructorimpl(1);
        private static final int Up = m39constructorimpl(2);
        private static final int Down = m39constructorimpl(3);
        private static final int Start = m39constructorimpl(4);
        private static final int End = m39constructorimpl(5);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Companion {
            public /* synthetic */ Companion(v vVar) {
                this();
            }

            /* renamed from: getDown-DKzdypw, reason: not valid java name */
            public final int m45getDownDKzdypw() {
                return SlideDirection.Down;
            }

            /* renamed from: getEnd-DKzdypw, reason: not valid java name */
            public final int m46getEndDKzdypw() {
                return SlideDirection.End;
            }

            /* renamed from: getLeft-DKzdypw, reason: not valid java name */
            public final int m47getLeftDKzdypw() {
                return SlideDirection.Left;
            }

            /* renamed from: getRight-DKzdypw, reason: not valid java name */
            public final int m48getRightDKzdypw() {
                return SlideDirection.Right;
            }

            /* renamed from: getStart-DKzdypw, reason: not valid java name */
            public final int m49getStartDKzdypw() {
                return SlideDirection.Start;
            }

            /* renamed from: getUp-DKzdypw, reason: not valid java name */
            public final int m50getUpDKzdypw() {
                return SlideDirection.Up;
            }

            private Companion() {
            }
        }

        private /* synthetic */ SlideDirection(int i11) {
            this.value = i11;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ SlideDirection m38boximpl(int i11) {
            return new SlideDirection(i11);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m40equalsimpl(int i11, Object obj) {
            return (obj instanceof SlideDirection) && i11 == ((SlideDirection) obj).m44unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m41equalsimpl0(int i11, int i12) {
            return i11 == i12;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m42hashCodeimpl(int i11) {
            return Integer.hashCode(i11);
        }

        @k
        /* renamed from: toString-impl, reason: not valid java name */
        public static String m43toStringimpl(int i11) {
            return m41equalsimpl0(i11, Left) ? "Left" : m41equalsimpl0(i11, Right) ? "Right" : m41equalsimpl0(i11, Up) ? "Up" : m41equalsimpl0(i11, Down) ? "Down" : m41equalsimpl0(i11, Start) ? "Start" : m41equalsimpl0(i11, End) ? "End" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m40equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m42hashCodeimpl(this.value);
        }

        @k
        public String toString() {
            return m43toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m44unboximpl() {
            return this.value;
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m39constructorimpl(int i11) {
            return i11;
        }
    }
}
