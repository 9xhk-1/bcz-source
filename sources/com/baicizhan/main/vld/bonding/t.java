package com.baicizhan.main.vld.bonding;

import android.os.Build;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.baicizhan.main.vld.model.WifiFreqType;
import com.baicizhan.platform.base.widget.p3;
import com.baicizhan.platform.base.widget.q3;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDeviceBondingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceBondingActivity.kt\ncom/baicizhan/main/vld/bonding/ComposableSingletons$DeviceBondingActivityKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1103:1\n1247#2,6:1104\n1247#2,6:1110\n1247#2,6:1116\n1247#2,6:1122\n1247#2,6:1128\n*S KotlinDebug\n*F\n+ 1 DeviceBondingActivity.kt\ncom/baicizhan/main/vld/bonding/ComposableSingletons$DeviceBondingActivityKt\n*L\n879#1:1104,6\n880#1:1110,6\n1039#1:1116,6\n1057#1:1122,6\n1075#1:1128,6\n*E\n"})
/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final t f25476a = new t();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f25477b = ComposableLambdaKt.composableLambdaInstance(-268250883, false, new x00.p() { // from class: com.baicizhan.main.vld.bonding.k
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 p11;
            p11 = t.p((Composer) obj, ((Integer) obj2).intValue());
            return p11;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f25478c = ComposableLambdaKt.composableLambdaInstance(-1981794427, false, new x00.p() { // from class: com.baicizhan.main.vld.bonding.l
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 n11;
            n11 = t.n((Composer) obj, ((Integer) obj2).intValue());
            return n11;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f25479d = ComposableLambdaKt.composableLambdaInstance(-363607999, false, new x00.p() { // from class: com.baicizhan.main.vld.bonding.m
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 s11;
            s11 = t.s((Composer) obj, ((Integer) obj2).intValue());
            return s11;
        }
    });

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f25480e = ComposableLambdaKt.composableLambdaInstance(-378226484, false, new x00.p() { // from class: com.baicizhan.main.vld.bonding.n
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 u11;
            u11 = t.u((Composer) obj, ((Integer) obj2).intValue());
            return u11;
        }
    });

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 n(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1981794427, i11, -1, "com.baicizhan.main.vld.bonding.ComposableSingletons$DeviceBondingActivityKt.lambda$-1981794427.<anonymous> (DeviceBondingActivity.kt:1031)");
            }
            List l11 = a00.g0.l(new ki.a("就差一步了~\n即将开始同步首页百词斩词书及学习进度，详细同步信息请在单词机上查看~", null, 2, null));
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.vld.bonding.r
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 o11;
                        o11 = t.o();
                        return o11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            DeviceBondingActivityKt.P(0, l11, true, (x00.a) rememberedValue, composer, 3456, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 o() {
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 p(Composer composer, int i11) {
        Composer composer2;
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-268250883, i11, -1, "com.baicizhan.main.vld.bonding.ComposableSingletons$DeviceBondingActivityKt.lambda$-268250883.<anonymous> (DeviceBondingActivity.kt:865)");
            }
            if (Build.VERSION.SDK_INT >= 30) {
                composer.startReplaceGroup(1472166508);
                um.b a11 = um.c.a(a00.h0.J(), composer, 6);
                q3 q11 = p3.q(composer, 0);
                BTStatus bTStatus = BTStatus.CONNECT_SUCCEEDED;
                WifiFreqType wifiFreqType = WifiFreqType.TYPE_24G_5G;
                ki.l lVar = new ki.l("CYA-Guest", wifiFreqType, 100);
                WifiFreqType wifiFreqType2 = WifiFreqType.TYPE_5G;
                List Q = a00.h0.Q(lVar, new ki.l("CYA", wifiFreqType2, 80), new ki.l("小机灵鬼1", WifiFreqType.TYPE_24G, 70), new ki.l("小机灵鬼2", wifiFreqType2, 60), new ki.l("小机灵鬼3", wifiFreqType, 50));
                Object rememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.Companion;
                if (rememberedValue == companion.getEmpty()) {
                    rememberedValue = new x00.a() { // from class: com.baicizhan.main.vld.bonding.o
                        @Override // x00.a
                        public final Object invoke() {
                            yz.g2 q12;
                            q12 = t.q();
                            return q12;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                x00.a aVar = (x00.a) rememberedValue;
                Object rememberedValue2 = composer.rememberedValue();
                if (rememberedValue2 == companion.getEmpty()) {
                    rememberedValue2 = new x00.p() { // from class: com.baicizhan.main.vld.bonding.p
                        @Override // x00.p
                        public final Object invoke(Object obj, Object obj2) {
                            yz.g2 r11;
                            r11 = t.r((String) obj, (String) obj2);
                            return r11;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                composer2 = composer;
                DeviceBondingActivityKt.a0(a11, q11, bTStatus, false, Q, aVar, (x00.p) rememberedValue2, composer2, 1772928);
            } else {
                composer2 = composer;
                composer2.startReplaceGroup(1433939013);
            }
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 q() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 r(String str, String str2) {
        kotlin.jvm.internal.g0.p(str, "<unused var>");
        kotlin.jvm.internal.g0.p(str2, "<unused var>");
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 s(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-363607999, i11, -1, "com.baicizhan.main.vld.bonding.ComposableSingletons$DeviceBondingActivityKt.lambda$-363607999.<anonymous> (DeviceBondingActivity.kt:1048)");
            }
            List l11 = a00.g0.l(new ki.a("就差一步了~\n即将开始同步首页百词斩词书及学习进度，详细同步信息请在单词机上查看~", "https://7n.bczcdn.com/r/fwaflv5d59bd5r95dyf3yjfnt5t2gr3p.png"));
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.vld.bonding.q
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 t11;
                        t11 = t.t();
                        return t11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            DeviceBondingActivityKt.P(0, l11, true, (x00.a) rememberedValue, composer, 3456, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 t() {
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 u(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-378226484, i11, -1, "com.baicizhan.main.vld.bonding.ComposableSingletons$DeviceBondingActivityKt.lambda$-378226484.<anonymous> (DeviceBondingActivity.kt:1066)");
            }
            List l11 = a00.g0.l(new ki.a("就差一步了~\n即将开始同步首页百词斩词书及学习进度，详细同步信息请在单词机上查看~", "https://7n.bczcdn.com/adv/17826839c98a5ab563875097225711e4.png"));
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.vld.bonding.s
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 v11;
                        v11 = t.v();
                        return v11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            DeviceBondingActivityKt.P(0, l11, false, (x00.a) rememberedValue, composer, 3456, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 v() {
        return yz.g2.f100423a;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> j() {
        return f25478c;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> k() {
        return f25477b;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> l() {
        return f25479d;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> m() {
        return f25480e;
    }
}
