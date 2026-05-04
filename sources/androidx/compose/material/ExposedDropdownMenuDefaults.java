package androidx.compose.material;

import androidx.compose.material.internal.Icons;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.a;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@ExperimentalMaterialApi
@u0({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/ExposedDropdownMenuDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,671:1\n75#2:672\n75#2:673\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/ExposedDropdownMenuDefaults\n*L\n293#1:672\n391#1:673\n*E\n"})
/* loaded from: classes.dex */
public final class ExposedDropdownMenuDefaults {
    public static final int $stable = 0;

    @k
    public static final ExposedDropdownMenuDefaults INSTANCE = new ExposedDropdownMenuDefaults();

    private ExposedDropdownMenuDefaults() {
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalMaterialApi
    public final void TrailingIcon(final boolean z11, @l a<g2> aVar, @l Composer composer, final int i11, final int i12) {
        int i13;
        final a<g2> aVar2;
        Composer startRestartGroup = composer.startRestartGroup(876077373);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (startRestartGroup.changed(z11) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changedInstance(aVar) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i13 & 19) != 18, i13 & 1)) {
            aVar2 = i14 != 0 ? new a<g2>() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // x00.a
                public /* bridge */ /* synthetic */ g2 invoke() {
                    invoke2();
                    return g2.f100423a;
                }
            } : aVar;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(876077373, i13, -1, "androidx.compose.material.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.kt:235)");
            }
            IconButtonKt.IconButton(aVar2, SemanticsModifierKt.clearAndSetSemantics(Modifier.Companion, new x00.l<SemanticsPropertyReceiver, g2>() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return g2.f100423a;
                }
            }), false, null, ComposableLambdaKt.rememberComposableLambda(726122713, true, new p<Composer, Integer, g2>() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer2, int i15) {
                    if (!composer2.shouldExecute((i15 & 3) != 2, i15 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(726122713, i15, -1, "androidx.compose.material.ExposedDropdownMenuDefaults.TrailingIcon.<anonymous> (ExposedDropdownMenu.kt:241)");
                    }
                    IconKt.m1692Iconww6aTOc(Icons.Filled.INSTANCE.getArrowDropDown$material_release(), "Trailing icon for exposed dropdown menu", RotateKt.rotate(Modifier.Companion, z11 ? 180.0f : 360.0f), 0L, composer2, 48, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, ((i13 >> 3) & 14) | 24576, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            aVar2 = aVar;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i15) {
                    ExposedDropdownMenuDefaults.this.TrailingIcon(z11, aVar2, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
                }
            });
        }
    }

    @Composable
    @k
    /* renamed from: outlinedTextFieldColors-DlUQjxs, reason: not valid java name */
    public final TextFieldColors m1669outlinedTextFieldColorsDlUQjxs(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j31, long j32, long j33, long j34, @l Composer composer, int i11, int i12, int i13, int i14) {
        long j35;
        long j36;
        long j37;
        long j38;
        long j39;
        long j41;
        long j42;
        long j43;
        long j44;
        long m2508copywmQWz5c$default = (i14 & 1) != 0 ? Color.m2508copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2519unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long m2508copywmQWz5c$default2 = (i14 & 2) != 0 ? Color.m2508copywmQWz5c$default(m2508copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long m2544getTransparent0d7_KjU = (i14 & 4) != 0 ? Color.Companion.m2544getTransparent0d7_KjU() : j13;
        long m1600getPrimary0d7_KjU = (i14 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1600getPrimary0d7_KjU() : j14;
        long m1594getError0d7_KjU = (i14 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1594getError0d7_KjU() : j15;
        long m2508copywmQWz5c$default3 = (i14 & 32) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1600getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long m2508copywmQWz5c$default4 = (i14 & 64) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        if ((i14 & 128) != 0) {
            long j45 = m2508copywmQWz5c$default4;
            j36 = Color.m2508copywmQWz5c$default(j45, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j35 = j45;
        } else {
            j35 = m2508copywmQWz5c$default4;
            j36 = j18;
        }
        long m1594getError0d7_KjU2 = (i14 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1594getError0d7_KjU() : j19;
        long m2508copywmQWz5c$default5 = (i14 & 512) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j21;
        if ((i14 & 1024) != 0) {
            long j46 = m2508copywmQWz5c$default5;
            j38 = Color.m2508copywmQWz5c$default(j46, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j37 = j46;
        } else {
            j37 = m2508copywmQWz5c$default5;
            j38 = j22;
        }
        long j47 = (i14 & 2048) != 0 ? j37 : j23;
        long m2508copywmQWz5c$default6 = (i14 & 4096) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j24;
        long m2508copywmQWz5c$default7 = (i14 & 8192) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1600getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j25;
        if ((i14 & 16384) != 0) {
            long j48 = m2508copywmQWz5c$default6;
            j41 = Color.m2508copywmQWz5c$default(j48, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j39 = j48;
        } else {
            j39 = m2508copywmQWz5c$default6;
            j41 = j26;
        }
        long m1594getError0d7_KjU3 = (32768 & i14) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1594getError0d7_KjU() : j27;
        long m2508copywmQWz5c$default8 = (65536 & i14) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1600getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j28;
        long m2508copywmQWz5c$default9 = (131072 & i14) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j29;
        if ((262144 & i14) != 0) {
            long j49 = m2508copywmQWz5c$default9;
            j43 = Color.m2508copywmQWz5c$default(j49, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j42 = j49;
        } else {
            j42 = m2508copywmQWz5c$default9;
            j43 = j31;
        }
        long m1594getError0d7_KjU4 = (524288 & i14) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1594getError0d7_KjU() : j32;
        long m2508copywmQWz5c$default10 = (1048576 & i14) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j33;
        long m2508copywmQWz5c$default11 = (i14 & 2097152) != 0 ? Color.m2508copywmQWz5c$default(m2508copywmQWz5c$default10, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j34;
        if (ComposerKt.isTraceInProgress()) {
            j44 = m2508copywmQWz5c$default11;
            ComposerKt.traceEventStart(1162641182, i11, i12, "androidx.compose.material.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.kt:417)");
        } else {
            j44 = m2508copywmQWz5c$default11;
        }
        DefaultTextFieldForExposedDropdownMenusColors defaultTextFieldForExposedDropdownMenusColors = new DefaultTextFieldForExposedDropdownMenusColors(m2508copywmQWz5c$default, m2508copywmQWz5c$default2, m1600getPrimary0d7_KjU, m1594getError0d7_KjU, m2508copywmQWz5c$default3, j35, m1594getError0d7_KjU2, j36, j37, j38, j47, j39, m2508copywmQWz5c$default7, j41, m1594getError0d7_KjU3, m2544getTransparent0d7_KjU, m2508copywmQWz5c$default8, j42, j43, m1594getError0d7_KjU4, m2508copywmQWz5c$default10, j44, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTextFieldForExposedDropdownMenusColors;
    }

    @Composable
    @k
    /* renamed from: textFieldColors-DlUQjxs, reason: not valid java name */
    public final TextFieldColors m1670textFieldColorsDlUQjxs(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j31, long j32, long j33, long j34, @l Composer composer, int i11, int i12, int i13, int i14) {
        long j35;
        long j36;
        long j37;
        long j38;
        long j39;
        long j41;
        long j42;
        long j43;
        long j44;
        long m2508copywmQWz5c$default = (i14 & 1) != 0 ? Color.m2508copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2519unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long m2508copywmQWz5c$default2 = (i14 & 2) != 0 ? Color.m2508copywmQWz5c$default(m2508copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long m2508copywmQWz5c$default3 = (i14 & 4) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long m1600getPrimary0d7_KjU = (i14 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1600getPrimary0d7_KjU() : j14;
        long m1594getError0d7_KjU = (i14 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1594getError0d7_KjU() : j15;
        long m2508copywmQWz5c$default4 = (i14 & 32) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1600getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long m2508copywmQWz5c$default5 = (i14 & 64) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null) : j17;
        if ((i14 & 128) != 0) {
            long j45 = m2508copywmQWz5c$default5;
            j36 = Color.m2508copywmQWz5c$default(j45, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j35 = j45;
        } else {
            j35 = m2508copywmQWz5c$default5;
            j36 = j18;
        }
        long m1594getError0d7_KjU2 = (i14 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1594getError0d7_KjU() : j19;
        long m2508copywmQWz5c$default6 = (i14 & 512) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j21;
        if ((i14 & 1024) != 0) {
            long j46 = m2508copywmQWz5c$default6;
            j38 = Color.m2508copywmQWz5c$default(j46, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j37 = j46;
        } else {
            j37 = m2508copywmQWz5c$default6;
            j38 = j22;
        }
        long j47 = (i14 & 2048) != 0 ? j37 : j23;
        long m2508copywmQWz5c$default7 = (i14 & 4096) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j24;
        long m2508copywmQWz5c$default8 = (i14 & 8192) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1600getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j25;
        if ((i14 & 16384) != 0) {
            long j48 = m2508copywmQWz5c$default7;
            j41 = Color.m2508copywmQWz5c$default(j48, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j39 = j48;
        } else {
            j39 = m2508copywmQWz5c$default7;
            j41 = j26;
        }
        long m1594getError0d7_KjU3 = (32768 & i14) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1594getError0d7_KjU() : j27;
        long m2508copywmQWz5c$default9 = (65536 & i14) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1600getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j28;
        long m2508copywmQWz5c$default10 = (131072 & i14) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j29;
        if ((262144 & i14) != 0) {
            long j49 = m2508copywmQWz5c$default10;
            j43 = Color.m2508copywmQWz5c$default(j49, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j42 = j49;
        } else {
            j42 = m2508copywmQWz5c$default10;
            j43 = j31;
        }
        long m1594getError0d7_KjU4 = (524288 & i14) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1594getError0d7_KjU() : j32;
        long m2508copywmQWz5c$default11 = (1048576 & i14) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j33;
        long m2508copywmQWz5c$default12 = (i14 & 2097152) != 0 ? Color.m2508copywmQWz5c$default(m2508copywmQWz5c$default11, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j34;
        if (ComposerKt.isTraceInProgress()) {
            j44 = m2508copywmQWz5c$default12;
            ComposerKt.traceEventStart(1208167904, i11, i12, "androidx.compose.material.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.kt:322)");
        } else {
            j44 = m2508copywmQWz5c$default12;
        }
        DefaultTextFieldForExposedDropdownMenusColors defaultTextFieldForExposedDropdownMenusColors = new DefaultTextFieldForExposedDropdownMenusColors(m2508copywmQWz5c$default, m2508copywmQWz5c$default2, m1600getPrimary0d7_KjU, m1594getError0d7_KjU, m2508copywmQWz5c$default4, j35, m1594getError0d7_KjU2, j36, j37, j38, j47, j39, m2508copywmQWz5c$default8, j41, m1594getError0d7_KjU3, m2508copywmQWz5c$default3, m2508copywmQWz5c$default9, j42, j43, m1594getError0d7_KjU4, m2508copywmQWz5c$default11, j44, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTextFieldForExposedDropdownMenusColors;
    }
}
