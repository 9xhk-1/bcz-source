package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAndroidView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidView.android.kt\nandroidx/compose/ui/viewinterop/AndroidView_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,392:1\n75#2:393\n75#2:394\n75#2:395\n75#2:396\n75#2:419\n75#2:420\n75#2:421\n272#3,11:397\n238#3,11:408\n1247#4,6:422\n4206#5,6:428\n89#6,7:434\n*S KotlinDebug\n*F\n+ 1 AndroidView.android.kt\nandroidx/compose/ui/viewinterop/AndroidView_androidKt\n*L\n203#1:393\n204#1:394\n211#1:395\n212#1:396\n255#1:419\n257#1:420\n258#1:421\n215#1:397,11\n233#1:408,11\n260#1:422,6\n294#1:428,6\n300#1:434,7\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidView_androidKt {

    @k
    private static final l<View, g2> NoOpUpdate = new l<View, g2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$NoOpUpdate$1
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View view) {
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(View view) {
            invoke2(view);
            return g2.f100423a;
        }
    };

    @Composable
    @UiComposable
    public static final <T extends View> void AndroidView(@k final l<? super Context, ? extends T> lVar, @m80.l Modifier modifier, @m80.l l<? super T, g2> lVar2, @m80.l Composer composer, final int i11, final int i12) {
        int i13;
        final Modifier modifier2;
        final l<? super T, g2> lVar3;
        Composer startRestartGroup = composer.startRestartGroup(-1783766393);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (startRestartGroup.changedInstance(lVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i15 = i12 & 4;
        if (i15 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changedInstance(lVar2) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i13 & 147) != 146, i13 & 1)) {
            if (i14 != 0) {
                modifier = Modifier.Companion;
            }
            Modifier modifier3 = modifier;
            l<? super T, g2> lVar4 = i15 != 0 ? NoOpUpdate : lVar2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1783766393, i13, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:104)");
            }
            AndroidView(lVar, modifier3, null, NoOpUpdate, lVar4, startRestartGroup, (i13 & 14) | 3072 | (i13 & 112) | (57344 & (i13 << 6)), 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            lVar3 = lVar4;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            lVar3 = lVar2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$1
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

                public final void invoke(Composer composer2, int i16) {
                    AndroidView_androidKt.AndroidView(lVar, modifier2, lVar3, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
                }
            });
        }
    }

    @Composable
    private static final <T extends View> x00.a<LayoutNode> createAndroidViewNodeFactory(final l<? super Context, ? extends T> lVar, Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2030558801, i11, -1, "androidx.compose.ui.viewinterop.createAndroidViewNodeFactory (AndroidView.android.kt:252)");
        }
        final int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        final Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        final CompositionContext rememberCompositionContext = ComposablesKt.rememberCompositionContext(composer, 0);
        final SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) composer.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
        final View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        boolean changedInstance = composer.changedInstance(context) | ((((i11 & 14) ^ 6) > 4 && composer.changed(lVar)) || (i11 & 6) == 4) | composer.changedInstance(rememberCompositionContext) | composer.changedInstance(saveableStateRegistry) | composer.changed(currentCompositeKeyHash) | composer.changedInstance(view);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
            Object obj = new x00.a<LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$createAndroidViewNodeFactory$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final LayoutNode invoke() {
                    Context context2 = context;
                    l<Context, T> lVar2 = lVar;
                    CompositionContext compositionContext = rememberCompositionContext;
                    SaveableStateRegistry saveableStateRegistry2 = saveableStateRegistry;
                    int i12 = currentCompositeKeyHash;
                    KeyEvent.Callback callback = view;
                    g0.n(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
                    return new ViewFactoryHolder(context2, lVar2, compositionContext, saveableStateRegistry2, i12, (Owner) callback).getLayoutNode();
                }
            };
            composer.updateRememberedValue(obj);
            rememberedValue = obj;
        }
        x00.a<LayoutNode> aVar = (x00.a) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return aVar;
    }

    @k
    public static final l<View, g2> getNoOpUpdate() {
        return NoOpUpdate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends View> ViewFactoryHolder<T> requireViewFactoryHolder(LayoutNode layoutNode) {
        AndroidViewHolder interopViewFactoryHolder$ui_release = layoutNode.getInteropViewFactoryHolder$ui_release();
        if (interopViewFactoryHolder$ui_release != null) {
            return (ViewFactoryHolder) interopViewFactoryHolder$ui_release;
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Required value was null.");
        throw new KotlinNothingValueException();
    }

    /* renamed from: updateViewHolderParams-6NefGtU, reason: not valid java name */
    private static final <T extends View> void m5365updateViewHolderParams6NefGtU(Composer composer, Modifier modifier, int i11, Density density, LifecycleOwner lifecycleOwner, SavedStateRegistryOwner savedStateRegistryOwner, LayoutDirection layoutDirection, CompositionLocalMap compositionLocalMap) {
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Updater.m1958setimpl(composer, compositionLocalMap, companion.getSetResolvedCompositionLocals());
        Updater.m1958setimpl(composer, modifier, new p<LayoutNode, Modifier, g2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$1
            @Override // x00.p
            public /* bridge */ /* synthetic */ g2 invoke(LayoutNode layoutNode, Modifier modifier2) {
                invoke2(layoutNode, modifier2);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutNode layoutNode, Modifier modifier2) {
                ViewFactoryHolder requireViewFactoryHolder;
                requireViewFactoryHolder = AndroidView_androidKt.requireViewFactoryHolder(layoutNode);
                requireViewFactoryHolder.setModifier(modifier2);
            }
        });
        Updater.m1958setimpl(composer, density, new p<LayoutNode, Density, g2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$2
            @Override // x00.p
            public /* bridge */ /* synthetic */ g2 invoke(LayoutNode layoutNode, Density density2) {
                invoke2(layoutNode, density2);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutNode layoutNode, Density density2) {
                ViewFactoryHolder requireViewFactoryHolder;
                requireViewFactoryHolder = AndroidView_androidKt.requireViewFactoryHolder(layoutNode);
                requireViewFactoryHolder.setDensity(density2);
            }
        });
        Updater.m1958setimpl(composer, lifecycleOwner, new p<LayoutNode, LifecycleOwner, g2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$3
            @Override // x00.p
            public /* bridge */ /* synthetic */ g2 invoke(LayoutNode layoutNode, LifecycleOwner lifecycleOwner2) {
                invoke2(layoutNode, lifecycleOwner2);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutNode layoutNode, LifecycleOwner lifecycleOwner2) {
                ViewFactoryHolder requireViewFactoryHolder;
                requireViewFactoryHolder = AndroidView_androidKt.requireViewFactoryHolder(layoutNode);
                requireViewFactoryHolder.setLifecycleOwner(lifecycleOwner2);
            }
        });
        Updater.m1958setimpl(composer, savedStateRegistryOwner, new p<LayoutNode, SavedStateRegistryOwner, g2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$4
            @Override // x00.p
            public /* bridge */ /* synthetic */ g2 invoke(LayoutNode layoutNode, SavedStateRegistryOwner savedStateRegistryOwner2) {
                invoke2(layoutNode, savedStateRegistryOwner2);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutNode layoutNode, SavedStateRegistryOwner savedStateRegistryOwner2) {
                ViewFactoryHolder requireViewFactoryHolder;
                requireViewFactoryHolder = AndroidView_androidKt.requireViewFactoryHolder(layoutNode);
                requireViewFactoryHolder.setSavedStateRegistryOwner(savedStateRegistryOwner2);
            }
        });
        Updater.m1958setimpl(composer, layoutDirection, new p<LayoutNode, LayoutDirection, g2>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$5

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LayoutDirection.values().length];
                    try {
                        iArr[LayoutDirection.Ltr.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[LayoutDirection.Rtl.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ g2 invoke(LayoutNode layoutNode, LayoutDirection layoutDirection2) {
                invoke2(layoutNode, layoutDirection2);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutNode layoutNode, LayoutDirection layoutDirection2) {
                ViewFactoryHolder requireViewFactoryHolder;
                requireViewFactoryHolder = AndroidView_androidKt.requireViewFactoryHolder(layoutNode);
                int i12 = WhenMappings.$EnumSwitchMapping$0[layoutDirection2.ordinal()];
                int i13 = 1;
                if (i12 == 1) {
                    i13 = 0;
                } else if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                requireViewFactoryHolder.setLayoutDirection(i13);
            }
        });
        p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composer.getInserting() || !g0.g(composer.rememberedValue(), Integer.valueOf(i11))) {
            composer.updateRememberedValue(Integer.valueOf(i11));
            composer.apply(Integer.valueOf(i11), setCompositeKeyHash);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0048  */
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.UiComposable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends android.view.View> void AndroidView(@m80.k final x00.l<? super android.content.Context, ? extends T> r24, @m80.l androidx.compose.ui.Modifier r25, @m80.l x00.l<? super T, yz.g2> r26, @m80.l x00.l<? super T, yz.g2> r27, @m80.l x00.l<? super T, yz.g2> r28, @m80.l androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView(x00.l, androidx.compose.ui.Modifier, x00.l, x00.l, x00.l, androidx.compose.runtime.Composer, int, int):void");
    }
}
