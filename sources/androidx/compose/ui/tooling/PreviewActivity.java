package androidx.compose.ui.tooling;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.FloatingActionButtonKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.navigation.compose.ComposeNavigator;
import java.util.Arrays;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import u30.k0;
import x00.a;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nPreviewActivity.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewActivity.android.kt\nandroidx/compose/ui/tooling/PreviewActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n1#2:140\n*E\n"})
/* loaded from: classes2.dex */
public final class PreviewActivity extends ComponentActivity {
    public static final int $stable = 0;

    @k
    private final String TAG = "PreviewActivity";

    private final void setComposableContent(String str) {
        Log.d(this.TAG, "PreviewActivity has composable " + str);
        final String X5 = k0.X5(str, '.', null, 2, null);
        final String P5 = k0.P5(str, '.', null, 2, null);
        String stringExtra = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra != null) {
            setParameterizedContent(X5, P5, stringExtra);
            return;
        }
        Log.d(this.TAG, "Previewing '" + P5 + "' without a parameter provider.");
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-840626948, true, new p<Composer, Integer, g2>() { // from class: androidx.compose.ui.tooling.PreviewActivity$setComposableContent$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    ComposerKt.traceEventStart(-840626948, i11, -1, "androidx.compose.ui.tooling.PreviewActivity.setComposableContent.<anonymous> (PreviewActivity.android.kt:74)");
                }
                ComposableInvoker.INSTANCE.invokeComposable(X5, P5, composer, new Object[0]);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 1, null);
    }

    private final void setParameterizedContent(final String str, final String str2, String str3) {
        Log.d(this.TAG, "Previewing '" + str2 + "' with parameter provider: '" + str3 + '\'');
        final Object[] previewProviderParameters = PreviewUtils_androidKt.getPreviewProviderParameters(PreviewUtils_androidKt.asPreviewProviderClass(str3), getIntent().getIntExtra("parameterProviderIndex", -1));
        if (previewProviderParameters.length > 1) {
            ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-861939235, true, new p<Composer, Integer, g2>() { // from class: androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        ComposerKt.traceEventStart(-861939235, i11, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous> (PreviewActivity.android.kt:103)");
                    }
                    Object rememberedValue = composer.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                        composer.updateRememberedValue(rememberedValue);
                    }
                    final MutableIntState mutableIntState = (MutableIntState) rememberedValue;
                    final Object[] objArr = previewProviderParameters;
                    ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(958604965, true, new p<Composer, Integer, g2>() { // from class: androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // x00.p
                        public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return g2.f100423a;
                        }

                        @Composable
                        public final void invoke(Composer composer2, int i12) {
                            if (!composer2.shouldExecute((i12 & 3) != 2, i12 & 1)) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(958604965, i12, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous>.<anonymous> (PreviewActivity.android.kt:117)");
                            }
                            p<Composer, Integer, g2> m5036getLambda1$ui_tooling_release = ComposableSingletons$PreviewActivity_androidKt.INSTANCE.m5036getLambda1$ui_tooling_release();
                            boolean changedInstance = composer2.changedInstance(objArr);
                            final MutableIntState mutableIntState2 = mutableIntState;
                            final Object[] objArr2 = objArr;
                            Object rememberedValue2 = composer2.rememberedValue();
                            if (changedInstance || rememberedValue2 == Composer.Companion.getEmpty()) {
                                rememberedValue2 = new a<g2>() { // from class: androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$1$1$1$1
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
                                        MutableIntState mutableIntState3 = MutableIntState.this;
                                        mutableIntState3.setIntValue((mutableIntState3.getIntValue() + 1) % objArr2.length);
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue2);
                            }
                            FloatingActionButtonKt.m1688ExtendedFloatingActionButtonwqdebIU(m5036getLambda1$ui_tooling_release, (a) rememberedValue2, null, null, null, null, 0L, 0L, null, composer2, 6, TypedValues.PositionType.TYPE_CURVE_FIT);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer, 54);
                    final String str4 = str;
                    final String str5 = str2;
                    final Object[] objArr2 = previewProviderParameters;
                    ScaffoldKt.m1751Scaffold27mzLpw(null, null, null, null, null, rememberComposableLambda, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(57310875, true, new q<PaddingValues, Composer, Integer, g2>() { // from class: androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // x00.q
                        public /* bridge */ /* synthetic */ g2 invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                            invoke(paddingValues, composer2, num.intValue());
                            return g2.f100423a;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(PaddingValues paddingValues, Composer composer2, int i12) {
                            if ((i12 & 6) == 0) {
                                i12 |= composer2.changed(paddingValues) ? 4 : 2;
                            }
                            if (!composer2.shouldExecute((i12 & 19) != 18, i12 & 1)) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(57310875, i12, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous>.<anonymous> (PreviewActivity.android.kt:107)");
                            }
                            Modifier padding = PaddingKt.padding(Modifier.Companion, paddingValues);
                            String str6 = str4;
                            String str7 = str5;
                            Object[] objArr3 = objArr2;
                            MutableIntState mutableIntState2 = mutableIntState;
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, padding);
                            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                            a<ComposeUiNode> constructor = companion.getConstructor();
                            if (composer2.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer m1951constructorimpl = Updater.m1951constructorimpl(composer2);
                            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            ComposableInvoker.INSTANCE.invokeComposable(str6, str7, composer2, objArr3[mutableIntState2.getIntValue()]);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer, 54), composer, 196608, 12582912, 131039);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 1, null);
        } else {
            ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-1901447514, true, new p<Composer, Integer, g2>() { // from class: androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        ComposerKt.traceEventStart(-1901447514, i11, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous> (PreviewActivity.android.kt:128)");
                    }
                    ComposableInvoker composableInvoker = ComposableInvoker.INSTANCE;
                    String str4 = str;
                    String str5 = str2;
                    Object[] objArr = previewProviderParameters;
                    composableInvoker.invokeComposable(str4, str5, composer, Arrays.copyOf(objArr, objArr.length));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 1, null);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@l Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        if ((getApplicationInfo().flags & 2) == 0) {
            Log.d(this.TAG, "Application is not debuggable. Compose Preview not allowed.");
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra(ComposeNavigator.NAME)) == null) {
            return;
        }
        setComposableContent(stringExtra);
    }
}
