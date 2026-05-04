package com.baicizhan.platform.base.widget;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ButtonColors;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ContentAlphaKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Dp;
import com.jiongji.andriod.card.R;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\ncom/baicizhan/platform/base/widget/ButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 12 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,346:1\n1247#2,6:347\n1247#2,6:353\n1247#2,3:366\n1250#2,3:370\n1247#2,6:373\n1247#2,6:380\n1247#2,6:386\n1247#2,6:433\n557#3:359\n554#3,6:360\n555#4:369\n113#5:379\n113#5:481\n113#5:482\n113#5:483\n113#5:484\n70#6:392\n68#6,8:393\n77#6:432\n79#7,6:401\n86#7,3:416\n89#7,2:425\n93#7:431\n79#7,6:449\n86#7,3:464\n89#7,2:473\n93#7:478\n347#8,9:407\n356#8:427\n357#8,2:429\n347#8,9:455\n356#8,3:475\n4206#9,6:419\n4206#9,6:467\n75#10:428\n85#11:439\n85#11:440\n113#11,2:441\n85#11:480\n99#12,6:443\n106#12:479\n*S KotlinDebug\n*F\n+ 1 Button.kt\ncom/baicizhan/platform/base/widget/ButtonKt\n*L\n58#1:347,6\n66#1:353,6\n67#1:366,3\n67#1:370,3\n69#1:373,6\n124#1:380,6\n224#1:386,6\n345#1:433,6\n67#1:359\n67#1:360,6\n67#1:369\n86#1:379\n143#1:481\n34#1:482\n35#1:483\n212#1:484\n226#1:392\n226#1:393,8\n226#1:432\n226#1:401,6\n226#1:416,3\n226#1:425,2\n226#1:431\n93#1:449,6\n93#1:464,3\n93#1:473,2\n93#1:478\n226#1:407,9\n226#1:427\n226#1:429,2\n93#1:455,9\n93#1:475,3\n226#1:419,6\n93#1:467,6\n238#1:428\n65#1:439\n66#1:440\n66#1:441,2\n125#1:480\n93#1:443,6\n93#1:479\n*E\n"})
/* loaded from: classes6.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final PaddingValues f28492a = PaddingKt.m720PaddingValuesYgX7TsA(bk.d.c(), Dp.m5115constructorimpl(14));

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final PaddingValues f28493b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f28494c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final Modifier f28495d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.platform.base.widget.ButtonKt$CustomButton$2$1$1", f = "Button.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f28496a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f28497b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MutableState<Boolean> mutableState, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f28497b = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new a(this.f28497b, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f28496a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                this.f28496a = 1;
                if (c40.a1.b(500L, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            r.q(this.f28497b, false);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28498a;

        static {
            int[] iArr = new int[ButtonType.values().length];
            try {
                iArr[ButtonType.PRIMARY_VARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonType.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonType.SECONDARY_VARIANT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonType.GRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ButtonType.GRAY_VARIANT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f28498a = iArr;
        }
    }

    static {
        float f11 = 0;
        f28493b = PaddingKt.m720PaddingValuesYgX7TsA(Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11));
        float m5115constructorimpl = Dp.m5115constructorimpl(40);
        f28494c = m5115constructorimpl;
        f28495d = SizeKt.m773size3ABfNKs(Modifier.Companion, m5115constructorimpl);
    }

    public static final yz.g2 A() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 B(int i11, Composer composer, int i12) {
        z(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0216  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void C(@m80.l androidx.compose.ui.Modifier r33, @m80.k final x00.a<yz.g2> r34, @m80.k final java.lang.String r35, long r36, @m80.l androidx.compose.ui.text.font.FontWeight r38, @androidx.annotation.DrawableRes int r39, boolean r40, boolean r41, @m80.l androidx.compose.ui.graphics.Shape r42, @m80.l bk.e r43, @m80.l androidx.compose.foundation.layout.PaddingValues r44, @m80.l androidx.compose.runtime.Composer r45, final int r46, final int r47, final int r48) {
        /*
            Method dump skipped, instructions count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.platform.base.widget.r.C(androidx.compose.ui.Modifier, x00.a, java.lang.String, long, androidx.compose.ui.text.font.FontWeight, int, boolean, boolean, androidx.compose.ui.graphics.Shape, bk.e, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final boolean D(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 E(int i11, long j11, String str, long j12, FontWeight fontWeight, RowScope CustomButton, Composer composer, int i12) {
        kotlin.jvm.internal.g0.p(CustomButton, "$this$CustomButton");
        if (composer.shouldExecute((i12 & 17) != 16, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-371798011, i12, -1, "com.baicizhan.platform.base.widget.MagicButton.<anonymous> (Button.kt:141)");
            }
            if (i11 != 0) {
                composer.startReplaceGroup(486141158);
                ImageKt.Image(PainterResources_androidKt.painterResource(i11, composer, 0), "icon", PaddingKt.m730paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, Dp.m5115constructorimpl(8), 0.0f, 11, null), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m2550tintxETnrds$default(ColorFilter.Companion, j11, 0, 2, null), composer, 432, 56);
            } else {
                composer.startReplaceGroup(481371901);
            }
            composer.endReplaceGroup();
            TextKt.m1845Text4IGK_g(str, (Modifier) null, j11, j12, (FontStyle) null, fontWeight, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 0, 0, 131026);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 F(Modifier modifier, x00.a aVar, String str, long j11, FontWeight fontWeight, int i11, boolean z11, boolean z12, Shape shape, bk.e eVar, PaddingValues paddingValues, int i12, int i13, int i14, Composer composer, int i15) {
        C(modifier, aVar, str, j11, fontWeight, i11, z11, z12, shape, eVar, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), RecomposeScopeImplKt.updateChangedFlags(i13), i14);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void G(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-1741413916);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1741413916, i11, -1, "com.baicizhan.platform.base.widget.MagicButtons (Button.kt:246)");
            }
            bk.k.e(null, null, null, s0.f28504a.u(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.platform.base.widget.j
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 H;
                    H = r.H(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return H;
                }
            });
        }
    }

    public static final yz.g2 H(int i11, Composer composer, int i12) {
        G(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void I(@m80.l androidx.compose.ui.Modifier r30, @m80.k final x00.a<yz.g2> r31, @m80.k final java.lang.String r32, long r33, @m80.l androidx.compose.ui.text.font.FontWeight r35, @androidx.annotation.DrawableRes int r36, boolean r37, boolean r38, @m80.l androidx.compose.ui.graphics.Shape r39, @m80.l com.baicizhan.platform.base.widget.ButtonType r40, @m80.l androidx.compose.foundation.layout.PaddingValues r41, @m80.l androidx.compose.runtime.Composer r42, final int r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 1115
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.platform.base.widget.r.I(androidx.compose.ui.Modifier, x00.a, java.lang.String, long, androidx.compose.ui.text.font.FontWeight, int, boolean, boolean, androidx.compose.ui.graphics.Shape, com.baicizhan.platform.base.widget.ButtonType, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final yz.g2 J(Modifier modifier, x00.a aVar, String str, long j11, FontWeight fontWeight, int i11, boolean z11, boolean z12, Shape shape, ButtonType buttonType, PaddingValues paddingValues, int i12, int i13, int i14, Composer composer, int i15) {
        I(modifier, aVar, str, j11, fontWeight, i11, z11, z12, shape, buttonType, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), RecomposeScopeImplKt.updateChangedFlags(i13), i14);
        return yz.g2.f100423a;
    }

    @m80.k
    public static final PaddingValues L() {
        return f28493b;
    }

    @m80.k
    public static final PaddingValues M() {
        return f28492a;
    }

    public static final float N() {
        return f28494c;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void n(x00.a<yz.g2> r32, androidx.compose.ui.Modifier r33, boolean r34, androidx.compose.foundation.interaction.MutableInteractionSource r35, androidx.compose.ui.graphics.Shape r36, androidx.compose.foundation.BorderStroke r37, androidx.compose.material.ButtonColors r38, androidx.compose.foundation.layout.PaddingValues r39, x00.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r40, androidx.compose.runtime.Composer r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.platform.base.widget.r.n(x00.a, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.foundation.BorderStroke, androidx.compose.material.ButtonColors, androidx.compose.foundation.layout.PaddingValues, x00.q, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final long o(State<Color> state) {
        return state.getValue().m2519unboximpl();
    }

    public static final boolean p(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void q(MutableState<Boolean> mutableState, boolean z11) {
        mutableState.setValue(Boolean.valueOf(z11));
    }

    public static final yz.g2 r(x00.a aVar, c40.r0 r0Var, MutableState mutableState) {
        if (p(mutableState)) {
            return yz.g2.f100423a;
        }
        q(mutableState, true);
        aVar.invoke();
        c40.k.f(r0Var, null, null, new a(mutableState, null), 3, null);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 s(State state, final PaddingValues paddingValues, final x00.q qVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(824785396, i11, -1, "com.baicizhan.platform.base.widget.CustomButton.<anonymous> (Button.kt:88)");
            }
            CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2511getAlphaimpl(o(state)))), ComposableLambdaKt.rememberComposableLambda(1490115892, true, new x00.p() { // from class: com.baicizhan.platform.base.widget.o
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 t11;
                    t11 = r.t(PaddingValues.this, qVar, (Composer) obj, ((Integer) obj2).intValue());
                    return t11;
                }
            }, composer, 54), composer, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 t(final PaddingValues paddingValues, final x00.q qVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1490115892, i11, -1, "com.baicizhan.platform.base.widget.CustomButton.<anonymous>.<anonymous> (Button.kt:89)");
            }
            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getButton(), ComposableLambdaKt.rememberComposableLambda(1662065699, true, new x00.p() { // from class: com.baicizhan.platform.base.widget.p
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 u11;
                    u11 = r.u(PaddingValues.this, qVar, (Composer) obj, ((Integer) obj2).intValue());
                    return u11;
                }
            }, composer, 54), composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 u(PaddingValues paddingValues, x00.q qVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1662065699, i11, -1, "com.baicizhan.platform.base.widget.CustomButton.<anonymous>.<anonymous>.<anonymous> (Button.kt:92)");
            }
            Modifier.Companion companion = Modifier.Companion;
            ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
            Modifier padding = PaddingKt.padding(SizeKt.m757defaultMinSizeVpY3zN4(companion, buttonDefaults.m1572getMinWidthD9Ej5fM(), buttonDefaults.m1571getMinHeightD9Ej5fM()), paddingValues);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getCenterVertically(), composer, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, padding);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m1951constructorimpl = Updater.m1951constructorimpl(composer);
            Updater.m1958setimpl(m1951constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            qVar.invoke(RowScopeInstance.INSTANCE, composer, 6);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 v(x00.a aVar, Modifier modifier, boolean z11, MutableInteractionSource mutableInteractionSource, Shape shape, BorderStroke borderStroke, ButtonColors buttonColors, PaddingValues paddingValues, x00.q qVar, int i11, int i12, Composer composer, int i13) {
        n(aVar, modifier, z11, mutableInteractionSource, shape, borderStroke, buttonColors, paddingValues, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0092  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void w(@m80.l androidx.compose.ui.Modifier r17, @m80.k final x00.a<yz.g2> r18, @androidx.annotation.DrawableRes final int r19, @m80.l androidx.compose.ui.graphics.ColorFilter r20, boolean r21, @m80.l androidx.compose.ui.Alignment r22, @m80.l androidx.compose.foundation.interaction.MutableInteractionSource r23, @m80.l androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.platform.base.widget.r.w(androidx.compose.ui.Modifier, x00.a, int, androidx.compose.ui.graphics.ColorFilter, boolean, androidx.compose.ui.Alignment, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 x(int i11, ColorFilter colorFilter, Composer composer, int i12) {
        if (composer.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1972753634, i12, -1, "com.baicizhan.platform.base.widget.ImageButton.<anonymous>.<anonymous> (Button.kt:239)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(i11, composer, 0), "", (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, colorFilter, composer, 48, 60);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 y(Modifier modifier, x00.a aVar, int i11, ColorFilter colorFilter, boolean z11, Alignment alignment, MutableInteractionSource mutableInteractionSource, int i12, int i13, Composer composer, int i14) {
        w(modifier, aVar, i11, colorFilter, z11, alignment, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), i13);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void z(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(1268044392);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1268044392, i11, -1, "com.baicizhan.platform.base.widget.ImageButtonAlign (Button.kt:343)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.platform.base.widget.g
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 A;
                        A = r.A();
                        return A;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            w(null, (x00.a) rememberedValue, R.drawable.ic_close, null, false, Alignment.Companion.getCenterEnd(), null, startRestartGroup, 197040, 89);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.platform.base.widget.h
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 B;
                    B = r.B(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return B;
                }
            });
        }
    }
}
