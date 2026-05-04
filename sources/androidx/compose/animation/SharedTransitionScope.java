package androidx.compose.animation;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@ExperimentalSharedTransitionApi
@Stable
/* loaded from: classes.dex */
public interface SharedTransitionScope extends LookaheadScope {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface OverlayClip {
        @l
        Path getClipPath(@k SharedContentState sharedContentState, @k Rect rect, @k LayoutDirection layoutDirection, @k Density density);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface PlaceHolderSize {

        @k
        public static final Companion Companion = Companion.$$INSTANCE;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            @k
            private static final PlaceHolderSize animatedSize = new PlaceHolderSize() { // from class: androidx.compose.animation.SharedTransitionScope$PlaceHolderSize$Companion$animatedSize$1
                @Override // androidx.compose.animation.SharedTransitionScope.PlaceHolderSize
                /* renamed from: calculateSize-JyjRU_E */
                public final long mo108calculateSizeJyjRU_E(long j11, long j12) {
                    return j12;
                }
            };

            @k
            private static final PlaceHolderSize contentSize = new PlaceHolderSize() { // from class: androidx.compose.animation.SharedTransitionScope$PlaceHolderSize$Companion$contentSize$1
                @Override // androidx.compose.animation.SharedTransitionScope.PlaceHolderSize
                /* renamed from: calculateSize-JyjRU_E */
                public final long mo108calculateSizeJyjRU_E(long j11, long j12) {
                    return j11;
                }
            };

            private Companion() {
            }

            @k
            public final PlaceHolderSize getAnimatedSize() {
                return animatedSize;
            }

            @k
            public final PlaceHolderSize getContentSize() {
                return contentSize;
            }
        }

        /* renamed from: calculateSize-JyjRU_E, reason: not valid java name */
        long mo108calculateSizeJyjRU_E(long j11, long j12);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface ResizeMode {

        @k
        public static final Companion Companion = Companion.$$INSTANCE;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            @k
            private static final ResizeMode RemeasureToBounds = RemeasureImpl.INSTANCE;

            private Companion() {
            }

            public static /* synthetic */ ResizeMode ScaleToBounds$default(Companion companion, ContentScale contentScale, Alignment alignment, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    contentScale = ContentScale.Companion.getFillWidth();
                }
                if ((i11 & 2) != 0) {
                    alignment = Alignment.Companion.getCenter();
                }
                return companion.ScaleToBounds(contentScale, alignment);
            }

            @k
            public final ResizeMode ScaleToBounds(@k ContentScale contentScale, @k Alignment alignment) {
                ScaleToBoundsImpl ScaleToBoundsCached;
                ScaleToBoundsCached = SharedTransitionScopeKt.ScaleToBoundsCached(contentScale, alignment);
                return ScaleToBoundsCached;
            }

            @k
            public final ResizeMode getRemeasureToBounds() {
                return RemeasureToBounds;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    @u0({"SMAP\nSharedTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScope$SharedContentState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1221:1\n85#2:1222\n113#2,2:1223\n*S KotlinDebug\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScope$SharedContentState\n*L\n650#1:1222\n650#1:1223,2\n*E\n"})
    public static final class SharedContentState {
        public static final int $stable = 8;

        @k
        private final MutableState internalState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

        @k
        private final Object key;

        public SharedContentState(@k Object obj) {
            this.key = obj;
        }

        private final SharedElementInternalState getNonNullInternalState() {
            SharedElementInternalState internalState$animation = getInternalState$animation();
            if (internalState$animation != null) {
                return internalState$animation;
            }
            throw new IllegalArgumentException("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not bee initialized.");
        }

        @l
        public final Path getClipPathInOverlay() {
            return getNonNullInternalState().getClipPathInOverlay$animation();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @l
        public final SharedElementInternalState getInternalState$animation() {
            return (SharedElementInternalState) this.internalState$delegate.getValue();
        }

        @k
        public final Object getKey() {
            return this.key;
        }

        @l
        public final SharedContentState getParentSharedContentState() {
            SharedElementInternalState parentState = getNonNullInternalState().getParentState();
            if (parentState != null) {
                return parentState.getUserState();
            }
            return null;
        }

        public final boolean isMatchFound() {
            SharedElement sharedElement;
            SharedElementInternalState internalState$animation = getInternalState$animation();
            if (internalState$animation == null || (sharedElement = internalState$animation.getSharedElement()) == null) {
                return false;
            }
            return sharedElement.getFoundMatch();
        }

        public final void setInternalState$animation(@l SharedElementInternalState sharedElementInternalState) {
            this.internalState$delegate.setValue(sharedElementInternalState);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Modifier renderInSharedTransitionScopeOverlay$default(final SharedTransitionScope sharedTransitionScope, Modifier modifier, x00.a aVar, float f11, p pVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderInSharedTransitionScopeOverlay");
        }
        if ((i11 & 1) != 0) {
            aVar = new x00.a<Boolean>() { // from class: androidx.compose.animation.SharedTransitionScope$renderInSharedTransitionScopeOverlay$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final Boolean invoke() {
                    return Boolean.valueOf(SharedTransitionScope.this.isTransitionActive());
                }
            };
        }
        if ((i11 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            pVar = SharedTransitionScopeKt.DefaultClipInOverlayDuringTransition;
        }
        return sharedTransitionScope.renderInSharedTransitionScopeOverlay(modifier, aVar, f11, pVar);
    }

    static /* synthetic */ EnterTransition scaleInSharedContentToBounds$default(SharedTransitionScope sharedTransitionScope, ContentScale contentScale, Alignment alignment, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scaleInSharedContentToBounds");
        }
        if ((i11 & 1) != 0) {
            contentScale = ContentScale.Companion.getFit();
        }
        if ((i11 & 2) != 0) {
            alignment = Alignment.Companion.getCenter();
        }
        return sharedTransitionScope.scaleInSharedContentToBounds(contentScale, alignment);
    }

    static /* synthetic */ ExitTransition scaleOutSharedContentToBounds$default(SharedTransitionScope sharedTransitionScope, ContentScale contentScale, Alignment alignment, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scaleOutSharedContentToBounds");
        }
        if ((i11 & 1) != 0) {
            contentScale = ContentScale.Companion.getFit();
        }
        if ((i11 & 2) != 0) {
            alignment = Alignment.Companion.getCenter();
        }
        return sharedTransitionScope.scaleOutSharedContentToBounds(contentScale, alignment);
    }

    static /* synthetic */ Modifier sharedBounds$default(SharedTransitionScope sharedTransitionScope, Modifier modifier, SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, EnterTransition enterTransition, ExitTransition exitTransition, BoundsTransform boundsTransform, ResizeMode resizeMode, PlaceHolderSize placeHolderSize, boolean z11, float f11, OverlayClip overlayClip, int i11, Object obj) {
        BoundsTransform boundsTransform2;
        OverlayClip overlayClip2;
        OverlayClip overlayClip3;
        BoundsTransform boundsTransform3;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sharedBounds");
        }
        EnterTransition fadeIn$default = (i11 & 4) != 0 ? EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null) : enterTransition;
        ExitTransition fadeOut$default = (i11 & 8) != 0 ? EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null) : exitTransition;
        if ((i11 & 16) != 0) {
            boundsTransform3 = SharedTransitionScopeKt.DefaultBoundsTransform;
            boundsTransform2 = boundsTransform3;
        } else {
            boundsTransform2 = boundsTransform;
        }
        ResizeMode ScaleToBounds = (i11 & 32) != 0 ? ResizeMode.Companion.ScaleToBounds(ContentScale.Companion.getFillWidth(), Alignment.Companion.getCenter()) : resizeMode;
        PlaceHolderSize contentSize = (i11 & 64) != 0 ? PlaceHolderSize.Companion.getContentSize() : placeHolderSize;
        boolean z12 = (i11 & 128) != 0 ? true : z11;
        float f12 = (i11 & 256) != 0 ? 0.0f : f11;
        if ((i11 & 512) != 0) {
            overlayClip3 = SharedTransitionScopeKt.ParentClip;
            overlayClip2 = overlayClip3;
        } else {
            overlayClip2 = overlayClip;
        }
        return sharedTransitionScope.sharedBounds(modifier, sharedContentState, animatedVisibilityScope, fadeIn$default, fadeOut$default, boundsTransform2, ScaleToBounds, contentSize, z12, f12, overlayClip2);
    }

    static /* synthetic */ Modifier sharedElement$default(SharedTransitionScope sharedTransitionScope, Modifier modifier, SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, BoundsTransform boundsTransform, PlaceHolderSize placeHolderSize, boolean z11, float f11, OverlayClip overlayClip, int i11, Object obj) {
        OverlayClip overlayClip2;
        OverlayClip overlayClip3;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sharedElement");
        }
        if ((i11 & 4) != 0) {
            boundsTransform = SharedTransitionScopeKt.DefaultBoundsTransform;
        }
        BoundsTransform boundsTransform2 = boundsTransform;
        if ((i11 & 8) != 0) {
            placeHolderSize = PlaceHolderSize.Companion.getContentSize();
        }
        PlaceHolderSize placeHolderSize2 = placeHolderSize;
        boolean z12 = (i11 & 16) != 0 ? true : z11;
        float f12 = (i11 & 32) != 0 ? 0.0f : f11;
        if ((i11 & 64) != 0) {
            overlayClip3 = SharedTransitionScopeKt.ParentClip;
            overlayClip2 = overlayClip3;
        } else {
            overlayClip2 = overlayClip;
        }
        return sharedTransitionScope.sharedElement(modifier, sharedContentState, animatedVisibilityScope, boundsTransform2, placeHolderSize2, z12, f12, overlayClip2);
    }

    static /* synthetic */ Modifier sharedElementWithCallerManagedVisibility$default(SharedTransitionScope sharedTransitionScope, Modifier modifier, SharedContentState sharedContentState, boolean z11, BoundsTransform boundsTransform, PlaceHolderSize placeHolderSize, boolean z12, float f11, OverlayClip overlayClip, int i11, Object obj) {
        OverlayClip overlayClip2;
        OverlayClip overlayClip3;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sharedElementWithCallerManagedVisibility");
        }
        if ((i11 & 4) != 0) {
            boundsTransform = SharedTransitionScopeKt.DefaultBoundsTransform;
        }
        BoundsTransform boundsTransform2 = boundsTransform;
        if ((i11 & 8) != 0) {
            placeHolderSize = PlaceHolderSize.Companion.getContentSize();
        }
        PlaceHolderSize placeHolderSize2 = placeHolderSize;
        boolean z13 = (i11 & 16) != 0 ? true : z12;
        float f12 = (i11 & 32) != 0 ? 0.0f : f11;
        if ((i11 & 64) != 0) {
            overlayClip3 = SharedTransitionScopeKt.ParentClip;
            overlayClip2 = overlayClip3;
        } else {
            overlayClip2 = overlayClip;
        }
        return sharedTransitionScope.sharedElementWithCallerManagedVisibility(modifier, sharedContentState, z11, boundsTransform2, placeHolderSize2, z13, f12, overlayClip2);
    }

    @k
    OverlayClip OverlayClip(@k Shape shape);

    boolean isTransitionActive();

    @Composable
    @k
    SharedContentState rememberSharedContentState(@k Object obj, @l Composer composer, int i11);

    @k
    Modifier renderInSharedTransitionScopeOverlay(@k Modifier modifier, @k x00.a<Boolean> aVar, float f11, @k p<? super LayoutDirection, ? super Density, ? extends Path> pVar);

    @n(message = "This EnterTransition has been deprecated. Please replace the usage with resizeMode = ScaleToBounds(...) in sharedBounds to achieve the scale-to-bounds effect.")
    @k
    default EnterTransition scaleInSharedContentToBounds(@k ContentScale contentScale, @k Alignment alignment) {
        return EnterExitTransitionKt.withEffect(EnterTransition.Companion.getNone(), new ContentScaleTransitionEffect(contentScale, alignment));
    }

    @n(message = "This ExitTransition has been deprecated.  Please replace the usage with resizeMode = ScaleToBounds(...) in sharedBounds to achieve the scale-to-bounds effect.")
    @k
    default ExitTransition scaleOutSharedContentToBounds(@k ContentScale contentScale, @k Alignment alignment) {
        return EnterExitTransitionKt.withEffect(ExitTransition.Companion.getNone(), new ContentScaleTransitionEffect(contentScale, alignment));
    }

    @k
    Modifier sharedBounds(@k Modifier modifier, @k SharedContentState sharedContentState, @k AnimatedVisibilityScope animatedVisibilityScope, @k EnterTransition enterTransition, @k ExitTransition exitTransition, @k BoundsTransform boundsTransform, @k ResizeMode resizeMode, @k PlaceHolderSize placeHolderSize, boolean z11, float f11, @k OverlayClip overlayClip);

    @k
    Modifier sharedElement(@k Modifier modifier, @k SharedContentState sharedContentState, @k AnimatedVisibilityScope animatedVisibilityScope, @k BoundsTransform boundsTransform, @k PlaceHolderSize placeHolderSize, boolean z11, float f11, @k OverlayClip overlayClip);

    @k
    Modifier sharedElementWithCallerManagedVisibility(@k Modifier modifier, @k SharedContentState sharedContentState, boolean z11, @k BoundsTransform boundsTransform, @k PlaceHolderSize placeHolderSize, boolean z12, float f11, @k OverlayClip overlayClip);

    @k
    Modifier skipToLookaheadSize(@k Modifier modifier);
}
