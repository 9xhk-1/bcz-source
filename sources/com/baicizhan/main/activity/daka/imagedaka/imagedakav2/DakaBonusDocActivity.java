package com.baicizhan.main.activity.daka.imagedaka.imagedakav2;

import a00.r0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import bk.d;
import com.baicizhan.base.ComposeBaseActivity;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.client.business.webview.BczWebHelperKt;
import com.baicizhan.main.activity.daka.imagedaka.imagedakav2.DakaBonusDocActivity;
import com.baicizhan.platform.base.widget.s4;
import com.jiongji.andriod.card.R;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.p;
import x00.q;
import y9.b;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nDakaBonusDocActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DakaBonusDocActivity.kt\ncom/baicizhan/main/activity/daka/imagedaka/imagedakav2/DakaBonusDocActivity\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,96:1\n1247#2,6:97\n1247#2,6:111\n1565#3:103\n1359#3,6:104\n113#4:110\n*S KotlinDebug\n*F\n+ 1 DakaBonusDocActivity.kt\ncom/baicizhan/main/activity/daka/imagedaka/imagedakav2/DakaBonusDocActivity\n*L\n46#1:97,6\n82#1:111,6\n51#1:103\n65#1:104,6\n79#1:110\n*E\n"})
/* loaded from: classes4.dex */
public final class DakaBonusDocActivity extends ComposeBaseActivity {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f18399b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f18400c = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public final void a(@k Context context) {
            g0.p(context, "context");
            context.startActivity(new Intent(context, (Class<?>) DakaBonusDocActivity.class));
        }

        public a() {
        }
    }

    public static final g2 R0(AnnotatedString annotatedString, DakaBonusDocActivity dakaBonusDocActivity, int i11) {
        AnnotatedString.Range range = (AnnotatedString.Range) r0.L2(annotatedString.getStringAnnotations(b.f99687c, i11, i11));
        if (range != null) {
            BczWebHelperKt.startExchangeCenter(dakaBonusDocActivity, (String) range.getItem());
        }
        return g2.f100423a;
    }

    public static final g2 S0(DakaBonusDocActivity dakaBonusDocActivity, int i11, Composer composer, int i12) {
        dakaBonusDocActivity.Q0(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    public static final g2 U0(DakaBonusDocActivity dakaBonusDocActivity) {
        dakaBonusDocActivity.finish();
        return g2.f100423a;
    }

    public static final g2 V0(DakaBonusDocActivity dakaBonusDocActivity, int i11, Composer composer, int i12) {
        dakaBonusDocActivity.T0(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 W0(final DakaBonusDocActivity dakaBonusDocActivity, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1034634695, i11, -1, "com.baicizhan.main.activity.daka.imagedaka.imagedakav2.DakaBonusDocActivity.onCreate.<anonymous> (DakaBonusDocActivity.kt:33)");
            }
            bk.k.e(null, null, null, ComposableLambdaKt.rememberComposableLambda(-1400666907, true, new p() { // from class: sd.t
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 X0;
                    X0 = DakaBonusDocActivity.X0(DakaBonusDocActivity.this, (Composer) obj, ((Integer) obj2).intValue());
                    return X0;
                }
            }, composer, 54), composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 X0(final DakaBonusDocActivity dakaBonusDocActivity, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1400666907, i11, -1, "com.baicizhan.main.activity.daka.imagedaka.imagedakav2.DakaBonusDocActivity.onCreate.<anonymous>.<anonymous> (DakaBonusDocActivity.kt:34)");
            }
            s4.B(null, null, null, ComposableLambdaKt.rememberComposableLambda(2133564110, true, new p() { // from class: sd.p
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 Y0;
                    Y0 = DakaBonusDocActivity.Y0(DakaBonusDocActivity.this, (Composer) obj, ((Integer) obj2).intValue());
                    return Y0;
                }
            }, composer, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(-1971498538, true, new q() { // from class: sd.q
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    g2 Z0;
                    Z0 = DakaBonusDocActivity.Z0(DakaBonusDocActivity.this, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return Z0;
                }
            }, composer, 54), composer, 3072, 12582912, 131063);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 Y0(DakaBonusDocActivity dakaBonusDocActivity, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2133564110, i11, -1, "com.baicizhan.main.activity.daka.imagedaka.imagedakav2.DakaBonusDocActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (DakaBonusDocActivity.kt:35)");
            }
            dakaBonusDocActivity.T0(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 Z0(DakaBonusDocActivity dakaBonusDocActivity, PaddingValues it, Composer composer, int i11) {
        g0.p(it, "it");
        if (composer.shouldExecute((i11 & 17) != 16, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1971498538, i11, -1, "com.baicizhan.main.activity.daka.imagedaka.imagedakav2.DakaBonusDocActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (DakaBonusDocActivity.kt:37)");
            }
            dakaBonusDocActivity.Q0(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void Q0(@l Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-1167934484);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(this) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1167934484, i12, -1, "com.baicizhan.main.activity.daka.imagedaka.imagedakav2.DakaBonusDocActivity.DocContent (DakaBonusDocActivity.kt:49)");
            }
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            long x11 = bk.b.x();
            long m11 = d.m();
            FontWeight.Companion companion = FontWeight.Companion;
            builder.pushStyle(new SpanStyle(x11, m11, companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (v) null));
            builder.append("奖励规则\n");
            builder.pop();
            builder.append("1、打卡分享成功，再返回百词斩，即可获得铜板奖励，奖励铜板数随机\n2、一天通过打卡分享仅能获得一次奖励。分享多个渠道或者一个渠道分享多次，奖励均不加码\n\n");
            builder.pushStyle(new SpanStyle(bk.b.x(), d.m(), companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (v) null));
            builder.append("铜板说明\n");
            builder.pop();
            builder.append("1、铜板可在“我的铜板”查看。铜板可兑换“百词斩商城”优惠券，用于购买学习用品和书籍，也可用于补打卡等功能。快去");
            builder.pushStringAnnotation(b.f99687c, "daka_introduct");
            int pushStyle = builder.pushStyle(new SpanStyle(bk.b.t(), d.m(), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65532, (v) null));
            try {
                builder.append(" 铜板商城 ");
                g2 g2Var = g2.f100423a;
                builder.pop(pushStyle);
                builder.pop();
                builder.append("兑换更多好物～\n\n");
                builder.pushStyle(new SpanStyle(bk.b.x(), d.m(), companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (v) null));
                builder.append("写在最后\n");
                builder.pop();
                builder.append("\"每一次努力都值得被记录与见证，时间会看到你的改变\"");
                builder.toAnnotatedString();
                final AnnotatedString annotatedString = builder.toAnnotatedString();
                float f11 = 16;
                Modifier m730paddingqDBjuR0$default = PaddingKt.m730paddingqDBjuR0$default(Modifier.Companion, Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(13), Dp.m5115constructorimpl(f11), 0.0f, 8, null);
                TextStyle textStyle = new TextStyle(bk.b.x(), d.m(), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, d.q(), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646140, (v) null);
                boolean changed = startRestartGroup.changed(annotatedString) | startRestartGroup.changedInstance(this);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new x00.l() { // from class: sd.u
                        @Override // x00.l
                        public final Object invoke(Object obj) {
                            g2 R0;
                            R0 = DakaBonusDocActivity.R0(AnnotatedString.this, this, ((Integer) obj).intValue());
                            return R0;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                ClickableTextKt.m1040ClickableText4YKlhWE(annotatedString, m730paddingqDBjuR0$default, textStyle, false, 0, 0, null, (x00.l) rememberedValue, startRestartGroup, 384, 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } catch (Throwable th2) {
                builder.pop(pushStyle);
                throw th2;
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p() { // from class: sd.v
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 S0;
                    S0 = DakaBonusDocActivity.S0(DakaBonusDocActivity.this, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return S0;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void T0(@l Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(194040133);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(this) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(194040133, i12, -1, "com.baicizhan.main.activity.daka.imagedaka.imagedakav2.DakaBonusDocActivity.TopActionBar (DakaBonusDocActivity.kt:44)");
            }
            boolean changedInstance = startRestartGroup.changedInstance(this);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: sd.r
                    @Override // x00.a
                    public final Object invoke() {
                        g2 U0;
                        U0 = DakaBonusDocActivity.U0(DakaBonusDocActivity.this);
                        return U0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            s4.F(0, null, (x00.a) rememberedValue, KotlinExtKt.getToStr(R.string.daka_share_earn_bonus), null, null, startRestartGroup, 0, 51);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p() { // from class: sd.s
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 V0;
                    V0 = DakaBonusDocActivity.V0(DakaBonusDocActivity.this, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return V0;
                }
            });
        }
    }

    @Override // com.baicizhan.base.ComposeBaseActivity, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-1034634695, true, new p() { // from class: sd.w
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                g2 W0;
                W0 = DakaBonusDocActivity.W0(DakaBonusDocActivity.this, (Composer) obj, ((Integer) obj2).intValue());
                return W0;
            }
        }), 1, null);
    }
}
