package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.PlatformMagnifierFactory;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.u0;
import x00.l;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTextFieldSelectionManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.android.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager_androidKt$textFieldMagnifier$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,115:1\n75#2:116\n1247#3,6:117\n1247#3,6:123\n1247#3,6:129\n85#4:135\n113#4,2:136\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.android.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager_androidKt$textFieldMagnifier$1\n*L\n51#1:116\n52#1:117,6\n54#1:123,6\n55#1:129,6\n52#1:135\n52#1:136,2\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldSelectionManager_androidKt$textFieldMagnifier$1 extends Lambda implements q<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ TextFieldSelectionManager $manager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager_androidKt$textFieldMagnifier$1(TextFieldSelectionManager textFieldSelectionManager) {
        super(3);
        this.$manager = textFieldSelectionManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long invoke$lambda$1(MutableState<IntSize> mutableState) {
        return mutableState.getValue().m5290unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2(MutableState<IntSize> mutableState, long j11) {
        mutableState.setValue(IntSize.m5278boximpl(j11));
    }

    @Override // x00.q
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    @Composable
    public final Modifier invoke(Modifier modifier, Composer composer, int i11) {
        composer.startReplaceGroup(1980580247);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1980580247, i11, -1, "androidx.compose.foundation.text.selection.textFieldMagnifier.<anonymous> (TextFieldSelectionManager.android.kt:50)");
        }
        final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m5278boximpl(IntSize.Companion.m5291getZeroYbymL2g()), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        final MutableState mutableState = (MutableState) rememberedValue;
        boolean changedInstance = composer.changedInstance(this.$manager);
        final TextFieldSelectionManager textFieldSelectionManager = this.$manager;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new x00.a<Offset>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // x00.a
                public /* bridge */ /* synthetic */ Offset invoke() {
                    return Offset.m2257boximpl(m1511invokeF1C5BW0());
                }

                /* renamed from: invoke-F1C5BW0, reason: not valid java name */
                public final long m1511invokeF1C5BW0() {
                    long invoke$lambda$1;
                    TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                    invoke$lambda$1 = TextFieldSelectionManager_androidKt$textFieldMagnifier$1.invoke$lambda$1(mutableState);
                    return TextFieldSelectionManagerKt.m1510calculateSelectionMagnifierCenterAndroidO0kMr_c(textFieldSelectionManager2, invoke$lambda$1);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        x00.a aVar = (x00.a) rememberedValue2;
        boolean changed = composer.changed(density);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed || rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new l<x00.a<? extends Offset>, Modifier>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ Modifier invoke(x00.a<? extends Offset> aVar2) {
                    return invoke2((x00.a<Offset>) aVar2);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Modifier invoke2(final x00.a<Offset> aVar2) {
                    Modifier.Companion companion2 = Modifier.Companion;
                    l<Density, Offset> lVar = new l<Density, Offset>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // x00.l
                        public /* bridge */ /* synthetic */ Offset invoke(Density density2) {
                            return Offset.m2257boximpl(m1512invoketuRUvjQ(density2));
                        }

                        /* renamed from: invoke-tuRUvjQ, reason: not valid java name */
                        public final long m1512invoketuRUvjQ(Density density2) {
                            return aVar2.invoke().m2278unboximpl();
                        }
                    };
                    final Density density2 = Density.this;
                    final MutableState<IntSize> mutableState2 = mutableState;
                    return Magnifier_androidKt.m306magnifierjPUL71Q$default(companion2, lVar, null, new l<DpSize, g2>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // x00.l
                        public /* bridge */ /* synthetic */ g2 invoke(DpSize dpSize) {
                            m1513invokeEaSLcWc(dpSize.m5221unboximpl());
                            return g2.f100423a;
                        }

                        /* renamed from: invoke-EaSLcWc, reason: not valid java name */
                        public final void m1513invokeEaSLcWc(long j11) {
                            TextFieldSelectionManager_androidKt$textFieldMagnifier$1.invoke$lambda$2(mutableState2, IntSize.m5281constructorimpl((r1.mo371roundToPx0680j_4(DpSize.m5211getHeightD9Ej5fM(j11)) & 4294967295L) | (Density.this.mo371roundToPx0680j_4(DpSize.m5213getWidthD9Ej5fM(j11)) << 32)));
                        }
                    }, 0.0f, true, 0L, 0.0f, 0.0f, false, PlatformMagnifierFactory.Companion.getForCurrentPlatform(), 490, null);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        Modifier animatedSelectionMagnifier = SelectionMagnifierKt.animatedSelectionMagnifier(modifier, aVar, (l) rememberedValue3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return animatedSelectionMagnifier;
    }
}
