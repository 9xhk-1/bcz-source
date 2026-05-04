package com.baicizhan.main.home.experiment;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.res.VectorResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.RawConstraintSet;
import com.baicizhan.main.home.experiment.WordCardKt;
import com.baicizhan.main.home.experiment.n5;
import com.baicizhan.main.home.experiment.w5;
import com.baicizhan.main.home.plan.view.WordPlanInfoView;
import com.baicizhan.platform.base.widget.ComposeUtilsKt;
import com.baicizhan.platform.base.widget.WidgetsKt;
import com.jiongji.andriod.card.R;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$contentDelegate$1\n+ 2 WordCard.kt\ncom/baicizhan/main/home/experiment/WordCardKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,2303:1\n265#2,2:2304\n269#2,3:2313\n268#2:2322\n267#2:2323\n278#2,4:2324\n285#2:2334\n286#2:2336\n290#2:2343\n277#2:2344\n276#2:2345\n293#2,6:2346\n305#2:2358\n311#2:2365\n310#2:2366\n292#2:2367\n313#2,3:2368\n322#2:2377\n323#2:2379\n328#2:2386\n333#2:2393\n337#2,3:2400\n342#2,9:2409\n357#2,3:2424\n362#2:2433\n366#2,3:2440\n1247#3,3:2306\n1250#3,3:2310\n1247#3,6:2316\n1247#3,6:2328\n1247#3,6:2337\n1247#3,6:2352\n1247#3,6:2359\n1247#3,6:2371\n1247#3,6:2380\n1247#3,6:2387\n1247#3,6:2394\n1247#3,6:2403\n1247#3,6:2418\n1247#3,6:2427\n1247#3,6:2434\n1225#3,6:2443\n1#4:2309\n113#5:2335\n113#5:2378\n*S KotlinDebug\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/experiment/WordCardKt\n+ 2 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$contentDelegate$1\n*L\n266#1:2306,3\n266#1:2310,3\n271#1:2316,6\n281#1:2328,6\n286#1:2337,6\n298#1:2352,6\n305#1:2359,6\n315#1:2371,6\n323#1:2380,6\n328#1:2387,6\n333#1:2394,6\n339#1:2403,6\n350#1:2418,6\n359#1:2427,6\n362#1:2434,6\n285#1:2335\n322#1:2378\n384#2:2443,6\n*E\n"})
/* loaded from: classes4.dex */
public final class WordCardKt$WordCard$lambda$10$2$$inlined$ConstraintLayout$1 extends Lambda implements x00.p<Composer, Integer, yz.g2> {
    final /* synthetic */ e40.o $channel;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ MutableState $contentTracker;
    final /* synthetic */ MutableState $end;
    final /* synthetic */ x3 $navigator$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ MutableState $start;
    final /* synthetic */ w5 $status$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WordCardKt$WordCard$lambda$10$2$$inlined$ConstraintLayout$1(MutableState mutableState, Ref ref, ConstraintLayoutScope constraintLayoutScope, e40.o oVar, MutableState mutableState2, MutableState mutableState3, w5 w5Var, x3 x3Var) {
        super(2);
        this.$contentTracker = mutableState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = oVar;
        this.$start = mutableState2;
        this.$end = mutableState3;
        this.$status$inlined = w5Var;
        this.$navigator$inlined = x3Var;
    }

    @Override // x00.p
    public /* bridge */ /* synthetic */ yz.g2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i11) {
        Object obj;
        Object obj2;
        if ((i11 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-74958949, i11, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:371)");
        }
        this.$contentTracker.setValue(yz.g2.f100423a);
        if (this.$compositionSource.getValue() == CompositionSource.Unknown) {
            this.$compositionSource.setValue(CompositionSource.Content);
        }
        this.$scope.reset();
        ConstraintLayoutScope constraintLayoutScope = this.$scope;
        composer.startReplaceGroup(185703496);
        ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope.createRefs();
        ConstrainedLayoutReference component1 = createRefs.component1();
        ConstrainedLayoutReference component2 = createRefs.component2();
        ConstrainedLayoutReference component3 = createRefs.component3();
        ConstrainedLayoutReference component4 = createRefs.component4();
        ConstrainedLayoutReference component5 = createRefs.component5();
        ConstrainedLayoutReference component6 = createRefs.component6();
        ConstrainedLayoutReference component7 = createRefs.component7();
        ConstrainedLayoutReference component8 = createRefs.component8();
        ConstrainedLayoutReference component9 = createRefs.component9();
        boolean changed = composer.changed(((w5.c) this.$status$inlined).j());
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            Iterator<T> it = ((w5.c) this.$status$inlined).j().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((n5) obj) instanceof n5.a) {
                        break;
                    }
                }
            }
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(obj != null), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        long sp2 = TextUnitKt.getSp(12);
        long Color = ColorKt.Color(4289243836L);
        Modifier.Companion companion = Modifier.Companion;
        Object rememberedValue2 = composer.rememberedValue();
        Composer.Companion companion2 = Composer.Companion;
        if (rememberedValue2 == companion2.getEmpty()) {
            rememberedValue2 = WordCardKt.e.f21047a;
            composer.updateRememberedValue(rememberedValue2);
        }
        TextKt.m1845Text4IGK_g("当前在学", constraintLayoutScope.constrainAs(companion, component1, (x00.l) rememberedValue2), Color, sp2, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 3462, 0, 131056);
        long sp3 = TextUnitKt.getSp(12);
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i12 = MaterialTheme.$stable;
        long m1600getPrimary0d7_KjU = materialTheme.getColors(composer, i12).m1600getPrimary0d7_KjU();
        boolean changedInstance = composer.changedInstance(this.$navigator$inlined);
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance || rememberedValue3 == companion2.getEmpty()) {
            rememberedValue3 = new WordCardKt.j(this.$navigator$inlined);
            composer.updateRememberedValue(rememberedValue3);
        }
        Modifier k11 = ComposeUtilsKt.k(companion, 0L, false, (x00.a) rememberedValue3, 3, null);
        float f11 = 10;
        Modifier m730paddingqDBjuR0$default = PaddingKt.m730paddingqDBjuR0$default(k11, Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11), 0.0f, Dp.m5115constructorimpl(f11), 4, null);
        boolean changed2 = composer.changed(component1);
        Object rememberedValue4 = composer.rememberedValue();
        if (changed2 || rememberedValue4 == companion2.getEmpty()) {
            rememberedValue4 = new WordCardKt.k(component1);
            composer.updateRememberedValue(rememberedValue4);
        }
        TextKt.m1845Text4IGK_g("修改", ZIndexModifierKt.zIndex(constraintLayoutScope.constrainAs(m730paddingqDBjuR0$default, component5, (x00.l) rememberedValue4), 1.0f), m1600getPrimary0d7_KjU, sp3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 3078, 0, 131056);
        String j11 = ((w5.c) this.$status$inlined).a().j();
        long sp4 = TextUnitKt.getSp(20);
        FontWeight medium = FontWeight.Companion.getMedium();
        long m1599getOnSurface0d7_KjU = materialTheme.getColors(composer, i12).m1599getOnSurface0d7_KjU();
        boolean changedInstance2 = composer.changedInstance(this.$navigator$inlined) | composer.changed(mutableState) | composer.changed(this.$status$inlined);
        Object rememberedValue5 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue5 == companion2.getEmpty()) {
            rememberedValue5 = new WordCardKt.l(this.$navigator$inlined, mutableState, this.$status$inlined);
            composer.updateRememberedValue(rememberedValue5);
        }
        Modifier k12 = ComposeUtilsKt.k(companion, 0L, false, (x00.a) rememberedValue5, 3, null);
        boolean changed3 = composer.changed(component1) | composer.changed(component5);
        Object rememberedValue6 = composer.rememberedValue();
        if (changed3 || rememberedValue6 == companion2.getEmpty()) {
            rememberedValue6 = new WordCardKt.m(component1, component5);
            composer.updateRememberedValue(rememberedValue6);
        }
        TextKt.m1845Text4IGK_g(j11, constraintLayoutScope.constrainAs(k12, component2, (x00.l) rememberedValue6), m1599getOnSurface0d7_KjU, sp4, (FontStyle) null, medium, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m5029getEllipsisgIe3tQ8(), false, 1, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 199680, 3120, 120784);
        ImageVector vectorResource = VectorResources_androidKt.vectorResource(ImageVector.Companion, R.drawable.ic_word_card_arrow_right, composer, 54);
        boolean changedInstance3 = composer.changedInstance(this.$navigator$inlined) | composer.changed(mutableState) | composer.changed(this.$status$inlined);
        Object rememberedValue7 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue7 == companion2.getEmpty()) {
            rememberedValue7 = new WordCardKt.n(this.$navigator$inlined, mutableState, this.$status$inlined);
            composer.updateRememberedValue(rememberedValue7);
        }
        Modifier m773size3ABfNKs = SizeKt.m773size3ABfNKs(ComposeUtilsKt.k(companion, 0L, false, (x00.a) rememberedValue7, 3, null), Dp.m5115constructorimpl(16));
        boolean changed4 = composer.changed(component2);
        Object rememberedValue8 = composer.rememberedValue();
        if (changed4 || rememberedValue8 == companion2.getEmpty()) {
            rememberedValue8 = new WordCardKt.o(component2);
            composer.updateRememberedValue(rememberedValue8);
        }
        ImageKt.Image(vectorResource, "arrow", constraintLayoutScope.constrainAs(m773size3ABfNKs, component3, (x00.l) rememberedValue8), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 120);
        String str = ((w5.c) this.$status$inlined).a().k() + WordPlanInfoView.f22926m;
        long sp5 = TextUnitKt.getSp(12);
        long Color2 = ColorKt.Color(4289243836L);
        Object rememberedValue9 = composer.rememberedValue();
        if (rememberedValue9 == companion2.getEmpty()) {
            rememberedValue9 = WordCardKt.p.f21066a;
            composer.updateRememberedValue(rememberedValue9);
        }
        TextKt.m1845Text4IGK_g(str, constraintLayoutScope.constrainAs(companion, component8, (x00.l) rememberedValue9), Color2, sp5, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 3456, 0, 131056);
        boolean changed5 = composer.changed(component8) | composer.changed(this.$status$inlined);
        Object rememberedValue10 = composer.rememberedValue();
        if (changed5 || rememberedValue10 == companion2.getEmpty()) {
            rememberedValue10 = new WordCardKt.q(component8, this.$status$inlined);
            composer.updateRememberedValue(rememberedValue10);
        }
        WordCardKt.f0(constraintLayoutScope.constrainAs(companion, component6, (x00.l) rememberedValue10), "已掌握 " + ((w5.c) this.$status$inlined).i().f(), materialTheme.getColors(composer, i12).m1600getPrimary0d7_KjU(), composer, 0, 0);
        boolean changed6 = composer.changed(component6) | composer.changed(component8);
        Object rememberedValue11 = composer.rememberedValue();
        if (changed6 || rememberedValue11 == companion2.getEmpty()) {
            rememberedValue11 = new WordCardKt.f(component6, component8);
            composer.updateRememberedValue(rememberedValue11);
        }
        WordCardKt.f0(constraintLayoutScope.constrainAs(companion, component7, (x00.l) rememberedValue11), "已学 " + ((w5.c) this.$status$inlined).i().e(), ColorKt.Color(4292665855L), composer, 384, 0);
        float f12 = ((w5.c) this.$status$inlined).a().k() > 0 ? ((w5.c) this.$status$inlined).i().f() / ((w5.c) this.$status$inlined).a().k() : 0.0f;
        float e11 = ((w5.c) this.$status$inlined).a().k() > 0 ? ((w5.c) this.$status$inlined).i().e() / ((w5.c) this.$status$inlined).a().k() : 0.0f;
        long m1600getPrimary0d7_KjU2 = materialTheme.getColors(composer, i12).m1600getPrimary0d7_KjU();
        long Color3 = ColorKt.Color(4292665855L);
        long Color4 = ColorKt.Color(4294177535L);
        boolean changed7 = composer.changed(component8) | composer.changed(component6);
        Object rememberedValue12 = composer.rememberedValue();
        if (changed7 || rememberedValue12 == companion2.getEmpty()) {
            rememberedValue12 = new WordCardKt.g(component8, component6);
            composer.updateRememberedValue(rememberedValue12);
        }
        WidgetsKt.D(f12, e11, constraintLayoutScope.constrainAs(companion, component4, (x00.l) rememberedValue12), 0.0f, m1600getPrimary0d7_KjU2, Color3, Color4, composer, 1769472, 8);
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            composer.startReplaceGroup(-270928764);
            Iterator<T> it2 = ((w5.c) this.$status$inlined).j().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it2.next();
                    if (((n5) obj2) instanceof n5.a) {
                        break;
                    }
                }
            }
            n5 n5Var = (n5) obj2;
            if (n5Var == null) {
                composer.startReplaceGroup(191142909);
            } else {
                composer.startReplaceGroup(191142910);
                String b11 = n5Var.b();
                PointerPosition pointerPosition = PointerPosition.TOP_LEFT;
                Modifier.Companion companion3 = Modifier.Companion;
                boolean changed8 = composer.changed(component2);
                Object rememberedValue13 = composer.rememberedValue();
                if (changed8 || rememberedValue13 == Composer.Companion.getEmpty()) {
                    rememberedValue13 = new WordCardKt.h(component2);
                    composer.updateRememberedValue(rememberedValue13);
                }
                Modifier constrainAs = constraintLayoutScope.constrainAs(companion3, component9, (x00.l) rememberedValue13);
                boolean changed9 = composer.changed(mutableState) | composer.changed(n5Var);
                Object rememberedValue14 = composer.rememberedValue();
                if (changed9 || rememberedValue14 == Composer.Companion.getEmpty()) {
                    rememberedValue14 = new WordCardKt.i(mutableState, n5Var);
                    composer.updateRememberedValue(rememberedValue14);
                }
                WordCardKt.h0(b11, pointerPosition, constrainAs, (x00.a) rememberedValue14, composer, 48, 0);
                yz.g2 g2Var = yz.g2.f100423a;
            }
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(175231416);
        }
        composer.endReplaceGroup();
        composer.endReplaceGroup();
        boolean changedInstance4 = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
        final MutableState mutableState2 = this.$start;
        final MutableState mutableState3 = this.$end;
        final e40.o oVar = this.$channel;
        Object rememberedValue15 = composer.rememberedValue();
        if (changedInstance4 || rememberedValue15 == Composer.Companion.getEmpty()) {
            rememberedValue15 = new x00.a<yz.g2>() { // from class: com.baicizhan.main.home.experiment.WordCardKt$WordCard$lambda$10$2$$inlined$ConstraintLayout$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // x00.a
                public /* bridge */ /* synthetic */ yz.g2 invoke() {
                    invoke2();
                    return yz.g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    RawConstraintSet rawConstraintSet = new RawConstraintSet(ConstraintLayoutScope.this.getContainerObject().mo5597clone());
                    if (mutableState2.getValue() != null && mutableState3.getValue() != null) {
                        oVar.m(rawConstraintSet);
                    } else {
                        mutableState2.setValue(rawConstraintSet);
                        mutableState3.setValue(mutableState2.getValue());
                    }
                }
            };
            composer.updateRememberedValue(rememberedValue15);
        }
        EffectsKt.SideEffect((x00.a) rememberedValue15, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
