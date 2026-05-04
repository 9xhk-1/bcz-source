package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionServiceKey;
import androidx.compose.runtime.CompositionServices;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.compose.ui.R;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Set;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class WrappedComposition implements Composition, LifecycleEventObserver, CompositionServices {

    @m80.l
    private Lifecycle addedToLifecycle;
    private boolean disposed;

    @m80.k
    private x00.p<? super Composer, ? super Integer, g2> lastContent = ComposableSingletons$Wrapper_androidKt.INSTANCE.m4245getLambda1$ui_release();

    @m80.k
    private final Composition original;

    @m80.k
    private final AndroidComposeView owner;

    public WrappedComposition(@m80.k AndroidComposeView androidComposeView, @m80.k Composition composition) {
        this.owner = androidComposeView;
        this.original = composition;
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        if (!this.disposed) {
            this.disposed = true;
            this.owner.getView().setTag(R.id.wrapped_composition_tag, null);
            Lifecycle lifecycle = this.addedToLifecycle;
            if (lifecycle != null) {
                lifecycle.removeObserver(this);
            }
        }
        this.original.dispose();
    }

    @Override // androidx.compose.runtime.CompositionServices
    @m80.l
    public <T> T getCompositionService(@m80.k CompositionServiceKey<T> compositionServiceKey) {
        Composition composition = this.original;
        CompositionServices compositionServices = composition instanceof CompositionServices ? (CompositionServices) composition : null;
        if (compositionServices != null) {
            return (T) compositionServices.getCompositionService(compositionServiceKey);
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        return this.original.getHasInvalidations();
    }

    @m80.k
    public final Composition getOriginal() {
        return this.original;
    }

    @m80.k
    public final AndroidComposeView getOwner() {
        return this.owner;
    }

    @Override // androidx.compose.runtime.Composition
    public boolean isDisposed() {
        return this.original.isDisposed();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@m80.k LifecycleOwner lifecycleOwner, @m80.k Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            dispose();
        } else {
            if (event != Lifecycle.Event.ON_CREATE || this.disposed) {
                return;
            }
            setContent(this.lastContent);
        }
    }

    @Override // androidx.compose.runtime.Composition
    @ComposableInferredTarget(scheme = "[0[0]]")
    public void setContent(@m80.k final x00.p<? super Composer, ? super Integer, g2> pVar) {
        this.owner.setOnViewTreeOwnersAvailable(new x00.l<AndroidComposeView.ViewTreeOwners, g2>() { // from class: androidx.compose.ui.platform.WrappedComposition$setContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(AndroidComposeView.ViewTreeOwners viewTreeOwners) {
                invoke2(viewTreeOwners);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(AndroidComposeView.ViewTreeOwners viewTreeOwners) {
                boolean z11;
                Lifecycle lifecycle;
                z11 = WrappedComposition.this.disposed;
                if (z11) {
                    return;
                }
                Lifecycle lifecycle2 = viewTreeOwners.getLifecycleOwner().getLifecycle();
                WrappedComposition.this.lastContent = pVar;
                lifecycle = WrappedComposition.this.addedToLifecycle;
                if (lifecycle == null) {
                    WrappedComposition.this.addedToLifecycle = lifecycle2;
                    lifecycle2.addObserver(WrappedComposition.this);
                } else if (lifecycle2.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                    Composition original = WrappedComposition.this.getOriginal();
                    final WrappedComposition wrappedComposition = WrappedComposition.this;
                    final x00.p<Composer, Integer, g2> pVar2 = pVar;
                    original.setContent(ComposableLambdaKt.composableLambdaInstance(-2000640158, true, new x00.p<Composer, Integer, g2>() { // from class: androidx.compose.ui.platform.WrappedComposition$setContent$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // x00.p
                        public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return g2.f100423a;
                        }

                        @Composable
                        public final void invoke(Composer composer, int i11) {
                            if (!composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2000640158, i11, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:123)");
                            }
                            AndroidComposeView owner = WrappedComposition.this.getOwner();
                            int i12 = R.id.inspection_slot_table_set;
                            Object tag = owner.getTag(i12);
                            Set<CompositionData> set = kotlin.jvm.internal.x0.J(tag) ? (Set) tag : null;
                            if (set == null) {
                                Object parent = WrappedComposition.this.getOwner().getParent();
                                View view = parent instanceof View ? (View) parent : null;
                                Object tag2 = view != null ? view.getTag(i12) : null;
                                set = kotlin.jvm.internal.x0.J(tag2) ? (Set) tag2 : null;
                            }
                            if (set != null) {
                                set.add(composer.getCompositionData());
                                composer.collectParameterInformation();
                            }
                            AndroidComposeView owner2 = WrappedComposition.this.getOwner();
                            boolean changedInstance = composer.changedInstance(WrappedComposition.this);
                            WrappedComposition wrappedComposition2 = WrappedComposition.this;
                            Object rememberedValue = composer.rememberedValue();
                            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = new WrappedComposition$setContent$1$1$1$1(wrappedComposition2, null);
                                composer.updateRememberedValue(rememberedValue);
                            }
                            EffectsKt.LaunchedEffect(owner2, (x00.p<? super c40.r0, ? super j00.c<? super g2>, ? extends Object>) rememberedValue, composer, 0);
                            AndroidComposeView owner3 = WrappedComposition.this.getOwner();
                            boolean changedInstance2 = composer.changedInstance(WrappedComposition.this);
                            WrappedComposition wrappedComposition3 = WrappedComposition.this;
                            Object rememberedValue2 = composer.rememberedValue();
                            if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                                rememberedValue2 = new WrappedComposition$setContent$1$1$2$1(wrappedComposition3, null);
                                composer.updateRememberedValue(rememberedValue2);
                            }
                            EffectsKt.LaunchedEffect(owner3, (x00.p<? super c40.r0, ? super j00.c<? super g2>, ? extends Object>) rememberedValue2, composer, 0);
                            ProvidedValue<Set<CompositionData>> provides = InspectionTablesKt.getLocalInspectionTables().provides(set);
                            final WrappedComposition wrappedComposition4 = WrappedComposition.this;
                            final x00.p<Composer, Integer, g2> pVar3 = pVar2;
                            CompositionLocalKt.CompositionLocalProvider(provides, ComposableLambdaKt.rememberComposableLambda(-1193460702, true, new x00.p<Composer, Integer, g2>() { // from class: androidx.compose.ui.platform.WrappedComposition.setContent.1.1.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // x00.p
                                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return g2.f100423a;
                                }

                                @Composable
                                public final void invoke(Composer composer2, int i13) {
                                    if (!composer2.shouldExecute((i13 & 3) != 2, i13 & 1)) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1193460702, i13, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:139)");
                                    }
                                    AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals(WrappedComposition.this.getOwner(), pVar3, composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer, 54), composer, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }));
                }
            }
        });
    }
}
