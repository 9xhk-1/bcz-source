package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.customview.poolingcontainer.PoolingContainer;
import androidx.customview.poolingcontainer.PoolingContainerListener;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Ref;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface ViewCompositionStrategy {

    @m80.k
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @m80.k
        public final ViewCompositionStrategy getDefault() {
            return DisposeOnDetachedFromWindowOrReleasedFromPool.INSTANCE;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class DisposeOnDetachedFromWindow implements ViewCompositionStrategy {
        public static final int $stable = 0;

        @m80.k
        public static final DisposeOnDetachedFromWindow INSTANCE = new DisposeOnDetachedFromWindow();

        private DisposeOnDetachedFromWindow() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$OnAttachStateChangeListener, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        @m80.k
        public x00.a<g2> installFor(@m80.k final AbstractComposeView abstractComposeView) {
            final ?? r02 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    AbstractComposeView.this.disposeComposition();
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                }
            };
            abstractComposeView.addOnAttachStateChangeListener(r02);
            return new x00.a<g2>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$1
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
                    AbstractComposeView.this.removeOnAttachStateChangeListener(r02);
                }
            };
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class DisposeOnDetachedFromWindowOrReleasedFromPool implements ViewCompositionStrategy {
        public static final int $stable = 0;

        @m80.k
        public static final DisposeOnDetachedFromWindowOrReleasedFromPool INSTANCE = new DisposeOnDetachedFromWindowOrReleasedFromPool();

        private DisposeOnDetachedFromWindowOrReleasedFromPool() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$OnAttachStateChangeListener, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        @m80.k
        public x00.a<g2> installFor(@m80.k final AbstractComposeView abstractComposeView) {
            final ?? r02 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    if (PoolingContainer.isWithinPoolingContainer(AbstractComposeView.this)) {
                        return;
                    }
                    AbstractComposeView.this.disposeComposition();
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                }
            };
            abstractComposeView.addOnAttachStateChangeListener(r02);
            final PoolingContainerListener poolingContainerListener = new PoolingContainerListener() { // from class: androidx.compose.ui.platform.c1
                @Override // androidx.customview.poolingcontainer.PoolingContainerListener
                public final void onRelease() {
                    AbstractComposeView.this.disposeComposition();
                }
            };
            PoolingContainer.addPoolingContainerListener(abstractComposeView, poolingContainerListener);
            return new x00.a<g2>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1
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
                    AbstractComposeView.this.removeOnAttachStateChangeListener(r02);
                    PoolingContainer.removePoolingContainerListener(AbstractComposeView.this, poolingContainerListener);
                }
            };
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class DisposeOnLifecycleDestroyed implements ViewCompositionStrategy {
        public static final int $stable = 8;

        @m80.k
        private final Lifecycle lifecycle;

        public DisposeOnLifecycleDestroyed(@m80.k Lifecycle lifecycle) {
            this.lifecycle = lifecycle;
        }

        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        @m80.k
        public x00.a<g2> installFor(@m80.k AbstractComposeView abstractComposeView) {
            x00.a<g2> installForLifecycle;
            installForLifecycle = ViewCompositionStrategy_androidKt.installForLifecycle(abstractComposeView, this.lifecycle);
            return installForLifecycle;
        }

        public DisposeOnLifecycleDestroyed(@m80.k LifecycleOwner lifecycleOwner) {
            this(lifecycleOwner.getLifecycle());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @kotlin.jvm.internal.u0({"SMAP\nViewCompositionStrategy.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewCompositionStrategy.android.kt\nandroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,197:1\n76#2,7:198\n*S KotlinDebug\n*F\n+ 1 ViewCompositionStrategy.android.kt\nandroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed\n*L\n154#1:198,7\n*E\n"})
    public static final class DisposeOnViewTreeLifecycleDestroyed implements ViewCompositionStrategy {
        public static final int $stable = 0;

        @m80.k
        public static final DisposeOnViewTreeLifecycleDestroyed INSTANCE = new DisposeOnViewTreeLifecycleDestroyed();

        private DisposeOnViewTreeLifecycleDestroyed() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$OnAttachStateChangeListener, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1] */
        /* JADX WARN: Type inference failed for: r2v0, types: [T, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        @m80.k
        public x00.a<g2> installFor(@m80.k final AbstractComposeView abstractComposeView) {
            x00.a<g2> installForLifecycle;
            if (!abstractComposeView.isAttachedToWindow()) {
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                final ?? r12 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1
                    /* JADX WARN: Type inference failed for: r3v7, types: [T, x00.a] */
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view) {
                        ?? installForLifecycle2;
                        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(AbstractComposeView.this);
                        AbstractComposeView abstractComposeView2 = AbstractComposeView.this;
                        if (lifecycleOwner != null) {
                            Ref.ObjectRef<x00.a<g2>> objectRef2 = objectRef;
                            installForLifecycle2 = ViewCompositionStrategy_androidKt.installForLifecycle(abstractComposeView2, lifecycleOwner.getLifecycle());
                            objectRef2.element = installForLifecycle2;
                            AbstractComposeView.this.removeOnAttachStateChangeListener(this);
                            return;
                        }
                        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("View tree for " + abstractComposeView2 + " has no ViewTreeLifecycleOwner");
                        throw new KotlinNothingValueException();
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view) {
                    }
                };
                abstractComposeView.addOnAttachStateChangeListener(r12);
                objectRef.element = new x00.a<g2>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1
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
                        AbstractComposeView.this.removeOnAttachStateChangeListener(r12);
                    }
                };
                return new x00.a<g2>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$2
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
                        objectRef.element.invoke();
                    }
                };
            }
            LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(abstractComposeView);
            if (lifecycleOwner != null) {
                installForLifecycle = ViewCompositionStrategy_androidKt.installForLifecycle(abstractComposeView, lifecycleOwner.getLifecycle());
                return installForLifecycle;
            }
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner");
            throw new KotlinNothingValueException();
        }
    }

    @m80.k
    x00.a<g2> installFor(@m80.k AbstractComposeView abstractComposeView);
}
