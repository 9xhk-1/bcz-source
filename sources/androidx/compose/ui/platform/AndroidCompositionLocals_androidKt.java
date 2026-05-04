package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.res.ImageVectorCache;
import androidx.compose.ui.res.ResourceIdCache;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.KotlinNothingValueException;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nAndroidCompositionLocals.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,191:1\n1247#2,6:192\n1247#2,6:198\n1247#2,6:204\n1247#2,6:210\n1247#2,6:216\n1247#2,6:222\n1247#2,6:229\n1247#2,6:235\n1247#2,6:241\n1247#2,6:247\n1247#2,3:253\n1250#2,3:257\n1247#2,6:260\n1247#2,6:266\n75#3:228\n1#4:256\n85#5:272\n113#5,2:273\n*S KotlinDebug\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt\n*L\n82#1:192,6\n84#1:198,6\n86#1:204,6\n93#1:210,6\n96#1:216,6\n98#1:222,6\n129#1:229,6\n130#1:235,6\n146#1:241,6\n159#1:247,6\n160#1:253,3\n160#1:257,3\n163#1:260,6\n181#1:266,6\n109#1:228\n82#1:272\n82#1:273,2\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidCompositionLocals_androidKt {

    @m80.k
    private static final ProvidableCompositionLocal<Configuration> LocalConfiguration = CompositionLocalKt.compositionLocalOf$default(null, new x00.a<Configuration>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalConfiguration$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final Configuration invoke() {
            AndroidCompositionLocals_androidKt.noLocalProvidedFor("LocalConfiguration");
            throw new KotlinNothingValueException();
        }
    }, 1, null);

    @m80.k
    private static final ProvidableCompositionLocal<Context> LocalContext = CompositionLocalKt.staticCompositionLocalOf(new x00.a<Context>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalContext$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final Context invoke() {
            AndroidCompositionLocals_androidKt.noLocalProvidedFor("LocalContext");
            throw new KotlinNothingValueException();
        }
    });

    @m80.k
    private static final ProvidableCompositionLocal<ImageVectorCache> LocalImageVectorCache = CompositionLocalKt.staticCompositionLocalOf(new x00.a<ImageVectorCache>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalImageVectorCache$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final ImageVectorCache invoke() {
            AndroidCompositionLocals_androidKt.noLocalProvidedFor("LocalImageVectorCache");
            throw new KotlinNothingValueException();
        }
    });

    @m80.k
    private static final ProvidableCompositionLocal<ResourceIdCache> LocalResourceIdCache = CompositionLocalKt.staticCompositionLocalOf(new x00.a<ResourceIdCache>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalResourceIdCache$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final ResourceIdCache invoke() {
            AndroidCompositionLocals_androidKt.noLocalProvidedFor("LocalResourceIdCache");
            throw new KotlinNothingValueException();
        }
    });

    @m80.k
    private static final ProvidableCompositionLocal<SavedStateRegistryOwner> LocalSavedStateRegistryOwner = CompositionLocalKt.staticCompositionLocalOf(new x00.a<SavedStateRegistryOwner>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalSavedStateRegistryOwner$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final SavedStateRegistryOwner invoke() {
            AndroidCompositionLocals_androidKt.noLocalProvidedFor("LocalSavedStateRegistryOwner");
            throw new KotlinNothingValueException();
        }
    });

    @m80.k
    private static final ProvidableCompositionLocal<View> LocalView = CompositionLocalKt.staticCompositionLocalOf(new x00.a<View>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalView$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final View invoke() {
            AndroidCompositionLocals_androidKt.noLocalProvidedFor("LocalView");
            throw new KotlinNothingValueException();
        }
    });

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void ProvideAndroidCompositionLocals(@m80.k final AndroidComposeView androidComposeView, @m80.k final x00.p<? super Composer, ? super Integer, g2> pVar, @m80.l Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(1396852028);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(androidComposeView) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(pVar) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1396852028, i12, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:76)");
            }
            Context context = androidComposeView.getContext();
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Configuration(context.getResources().getConfiguration()), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState = (MutableState) rememberedValue;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new x00.l<Configuration, g2>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public /* bridge */ /* synthetic */ g2 invoke(Configuration configuration) {
                        invoke2(configuration);
                        return g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Configuration configuration) {
                        mutableState.setValue(new Configuration(configuration));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidComposeView.setConfigurationChangeObserver((x00.l) rememberedValue2);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new AndroidUriHandler(context);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final AndroidUriHandler androidUriHandler = (AndroidUriHandler) rememberedValue3;
            AndroidComposeView.ViewTreeOwners viewTreeOwners = androidComposeView.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry(androidComposeView, viewTreeOwners.getSavedStateRegistryOwner());
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            final DisposableSaveableStateRegistry disposableSaveableStateRegistry = (DisposableSaveableStateRegistry) rememberedValue4;
            g2 g2Var = g2.f100423a;
            boolean changedInstance = startRestartGroup.changedInstance(disposableSaveableStateRegistry);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = new x00.l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$1
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        final DisposableSaveableStateRegistry disposableSaveableStateRegistry2 = DisposableSaveableStateRegistry.this;
                        return new DisposableEffectResult() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                DisposableSaveableStateRegistry.this.dispose();
                            }
                        };
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            EffectsKt.DisposableEffect(g2Var, (x00.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue5, startRestartGroup, 6);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == companion.getEmpty()) {
                rememberedValue6 = HapticDefaults.INSTANCE.isPremiumVibratorEnabled(context) ? new DefaultHapticFeedback(androidComposeView.getView()) : new NoHapticFeedback();
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{LocalConfiguration.provides(ProvideAndroidCompositionLocals$lambda$1(mutableState)), LocalContext.provides(context), LocalLifecycleOwnerKt.getLocalLifecycleOwner().provides(viewTreeOwners.getLifecycleOwner()), LocalSavedStateRegistryOwner.provides(viewTreeOwners.getSavedStateRegistryOwner()), SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(disposableSaveableStateRegistry), LocalView.provides(androidComposeView.getView()), LocalImageVectorCache.provides(obtainImageVectorCache(context, ProvideAndroidCompositionLocals$lambda$1(mutableState), startRestartGroup, 0)), LocalResourceIdCache.provides(obtainResourceIdCache(context, startRestartGroup, 0)), CompositionLocalsKt.getLocalProvidableScrollCaptureInProgress().provides(Boolean.valueOf(((Boolean) startRestartGroup.consume(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue() | androidComposeView.getScrollCaptureInProgress$ui_release())), CompositionLocalsKt.getLocalHapticFeedback().provides((HapticFeedback) rememberedValue6)}, ComposableLambdaKt.rememberComposableLambda(1471621628, true, new x00.p<Composer, Integer, g2>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$3
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
                        ComposerKt.traceEventStart(1471621628, i13, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals.<anonymous> (AndroidCompositionLocals.android.kt:121)");
                    }
                    CompositionLocalsKt.ProvideCommonCompositionLocals(AndroidComposeView.this, androidUriHandler, pVar, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p<Composer, Integer, g2>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$4
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

                public final void invoke(Composer composer2, int i13) {
                    AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals(AndroidComposeView.this, pVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    private static final Configuration ProvideAndroidCompositionLocals$lambda$1(MutableState<Configuration> mutableState) {
        return mutableState.getValue();
    }

    @m80.k
    public static final ProvidableCompositionLocal<Configuration> getLocalConfiguration() {
        return LocalConfiguration;
    }

    @m80.k
    public static final ProvidableCompositionLocal<Context> getLocalContext() {
        return LocalContext;
    }

    @m80.k
    public static final ProvidableCompositionLocal<ImageVectorCache> getLocalImageVectorCache() {
        return LocalImageVectorCache;
    }

    @m80.k
    public static final ProvidableCompositionLocal<LifecycleOwner> getLocalLifecycleOwner() {
        return LocalLifecycleOwnerKt.getLocalLifecycleOwner();
    }

    @m80.k
    public static final ProvidableCompositionLocal<ResourceIdCache> getLocalResourceIdCache() {
        return LocalResourceIdCache;
    }

    @m80.k
    public static final ProvidableCompositionLocal<SavedStateRegistryOwner> getLocalSavedStateRegistryOwner() {
        return LocalSavedStateRegistryOwner;
    }

    @m80.k
    public static final ProvidableCompositionLocal<View> getLocalView() {
        return LocalView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void noLocalProvidedFor(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    @Stable
    @Composable
    private static final ImageVectorCache obtainImageVectorCache(final Context context, Configuration configuration, Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-485908294, i11, -1, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:157)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new ImageVectorCache();
            composer.updateRememberedValue(rememberedValue);
        }
        final ImageVectorCache imageVectorCache = (ImageVectorCache) rememberedValue;
        Object rememberedValue2 = composer.rememberedValue();
        Object obj = rememberedValue2;
        if (rememberedValue2 == companion.getEmpty()) {
            Configuration configuration2 = new Configuration();
            if (configuration != null) {
                configuration2.setTo(configuration);
            }
            composer.updateRememberedValue(configuration2);
            obj = configuration2;
        }
        final Configuration configuration3 = (Configuration) obj;
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new ComponentCallbacks2() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1
                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(Configuration configuration4) {
                    imageVectorCache.prune(configuration3.updateFrom(configuration4));
                    configuration3.setTo(configuration4);
                }

                @Override // android.content.ComponentCallbacks
                @yz.n(message = "This callback is superseded by onTrimMemory")
                public void onLowMemory() {
                    imageVectorCache.clear();
                }

                @Override // android.content.ComponentCallbacks2
                public void onTrimMemory(int i12) {
                    imageVectorCache.clear();
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        final AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1 androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1 = (AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1) rememberedValue3;
        boolean changedInstance = composer.changedInstance(context);
        Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance || rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = new x00.l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    context.getApplicationContext().registerComponentCallbacks(androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1);
                    final Context context2 = context;
                    final AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1 androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$12 = androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1;
                    return new DisposableEffectResult() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            context2.getApplicationContext().unregisterComponentCallbacks(androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$12);
                        }
                    };
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        EffectsKt.DisposableEffect(imageVectorCache, (x00.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue4, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return imageVectorCache;
    }

    @Stable
    @Composable
    private static final ResourceIdCache obtainResourceIdCache(final Context context, Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1348507246, i11, -1, "androidx.compose.ui.platform.obtainResourceIdCache (AndroidCompositionLocals.android.kt:127)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new ResourceIdCache();
            composer.updateRememberedValue(rememberedValue);
        }
        final ResourceIdCache resourceIdCache = (ResourceIdCache) rememberedValue;
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new ComponentCallbacks2() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1
                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(Configuration configuration) {
                    ResourceIdCache.this.clear();
                }

                @Override // android.content.ComponentCallbacks
                @yz.n(message = "This callback is superseded by onTrimMemory")
                public void onLowMemory() {
                    ResourceIdCache.this.clear();
                }

                @Override // android.content.ComponentCallbacks2
                public void onTrimMemory(int i12) {
                    ResourceIdCache.this.clear();
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        final AndroidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1 androidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1 = (AndroidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1) rememberedValue2;
        boolean changedInstance = composer.changedInstance(context);
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance || rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new x00.l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainResourceIdCache$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    context.getApplicationContext().registerComponentCallbacks(androidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1);
                    final Context context2 = context;
                    final AndroidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1 androidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$12 = androidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1;
                    return new DisposableEffectResult() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainResourceIdCache$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            context2.getApplicationContext().unregisterComponentCallbacks(androidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$12);
                        }
                    };
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        EffectsKt.DisposableEffect(resourceIdCache, (x00.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue3, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return resourceIdCache;
    }

    @yz.n(message = "Moved to lifecycle-runtime-compose library in androidx.lifecycle.compose package.", replaceWith = @yz.w0(expression = "androidx.lifecycle.compose.LocalLifecycleOwner", imports = {}))
    public static /* synthetic */ void getLocalLifecycleOwner$annotations() {
    }
}
