package com.baicizhan.main.customview.compose;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.jiongji.andriod.card.R;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBusiness.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Business.kt\ncom/baicizhan/main/customview/compose/BusinessKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,147:1\n1247#2,6:148\n1247#2,6:154\n1247#2,6:160\n1247#2,6:166\n1247#2,6:172\n1247#2,6:178\n1247#2,6:299\n1247#2,6:342\n1247#2,6:397\n1247#2,6:486\n1247#2,6:550\n113#3:184\n113#3:222\n113#3:260\n113#3:298\n113#3:348\n113#3:357\n113#3:358\n113#3:396\n113#3:485\n113#3:537\n113#3:538\n113#3:549\n113#3:556\n99#4:185\n96#4,9:186\n99#4:261\n96#4,9:262\n106#4:356\n99#4:359\n96#4,9:360\n99#4:492\n96#4,9:493\n106#4:532\n106#4:536\n106#4:546\n79#5,6:195\n86#5,3:210\n89#5,2:219\n79#5,6:233\n86#5,3:248\n89#5,2:257\n79#5,6:271\n86#5,3:286\n89#5,2:295\n79#5,6:315\n86#5,3:330\n89#5,2:339\n93#5:351\n93#5:355\n79#5,6:369\n86#5,3:384\n89#5,2:393\n79#5,6:412\n86#5,3:427\n89#5,2:436\n79#5,6:450\n86#5,3:465\n89#5,2:474\n93#5:479\n93#5:483\n79#5,6:502\n86#5,3:517\n89#5,2:526\n93#5:531\n93#5:535\n93#5:541\n93#5:545\n347#6,9:201\n356#6:221\n347#6,9:239\n356#6:259\n347#6,9:277\n356#6:297\n347#6,9:321\n356#6:341\n357#6,2:349\n357#6,2:353\n347#6,9:375\n356#6:395\n347#6,9:418\n356#6:438\n347#6,9:456\n356#6,3:476\n357#6,2:481\n347#6,9:508\n356#6,3:528\n357#6,2:533\n357#6,2:539\n357#6,2:543\n4206#7,6:213\n4206#7,6:251\n4206#7,6:289\n4206#7,6:333\n4206#7,6:387\n4206#7,6:430\n4206#7,6:468\n4206#7,6:520\n87#8:223\n84#8,9:224\n87#8:439\n83#8,10:440\n94#8:480\n94#8:542\n70#9:305\n67#9,9:306\n77#9:352\n70#9:403\n68#9,8:404\n77#9:484\n85#10:547\n85#10:548\n*S KotlinDebug\n*F\n+ 1 Business.kt\ncom/baicizhan/main/customview/compose/BusinessKt\n*L\n44#1:148,6\n45#1:154,6\n46#1:160,6\n47#1:166,6\n48#1:172,6\n61#1:178,6\n91#1:299,6\n96#1:342,6\n105#1:397,6\n125#1:486,6\n72#1:550,6\n64#1:184\n79#1:222\n81#1:260\n89#1:298\n98#1:348\n103#1:357\n104#1:358\n105#1:396\n124#1:485\n141#1:537\n143#1:538\n68#1:549\n75#1:556\n59#1:185\n59#1:186,9\n81#1:261\n81#1:262,9\n81#1:356\n104#1:359\n104#1:360,9\n125#1:492\n125#1:493,9\n125#1:532\n104#1:536\n59#1:546\n59#1:195,6\n59#1:210,3\n59#1:219,2\n77#1:233,6\n77#1:248,3\n77#1:257,2\n81#1:271,6\n81#1:286,3\n81#1:295,2\n91#1:315,6\n91#1:330,3\n91#1:339,2\n91#1:351\n81#1:355\n104#1:369,6\n104#1:384,3\n104#1:393,2\n105#1:412,6\n105#1:427,3\n105#1:436,2\n118#1:450,6\n118#1:465,3\n118#1:474,2\n118#1:479\n105#1:483\n125#1:502,6\n125#1:517,3\n125#1:526,2\n125#1:531\n104#1:535\n77#1:541\n59#1:545\n59#1:201,9\n59#1:221\n77#1:239,9\n77#1:259\n81#1:277,9\n81#1:297\n91#1:321,9\n91#1:341\n91#1:349,2\n81#1:353,2\n104#1:375,9\n104#1:395\n105#1:418,9\n105#1:438\n118#1:456,9\n118#1:476,3\n105#1:481,2\n125#1:508,9\n125#1:528,3\n104#1:533,2\n77#1:539,2\n59#1:543,2\n59#1:213,6\n77#1:251,6\n81#1:289,6\n91#1:333,6\n104#1:387,6\n105#1:430,6\n118#1:468,6\n125#1:520,6\n77#1:223\n77#1:224,9\n118#1:439\n118#1:440,10\n118#1:480\n77#1:542\n91#1:305\n91#1:306,9\n91#1:352\n105#1:403\n105#1:404,8\n105#1:484\n51#1:547\n52#1:548\n*E\n"})
/* loaded from: classes4.dex */
public final class o {
    public static final g2 A(x00.l lVar, boolean z11) {
        lVar.invoke(Boolean.valueOf(z11));
        return g2.f100423a;
    }

    public static final g2 B(x00.a aVar) {
        aVar.invoke();
        return g2.f100423a;
    }

    public static final g2 C(String str, String str2, int i11, String str3, boolean z11, boolean z12, boolean z13, boolean z14, x00.l lVar, x00.l lVar2, x00.a aVar, x00.a aVar2, x00.a aVar3, int i12, int i13, int i14, Composer composer, int i15) {
        n(str, str2, i11, str3, z11, z12, z13, z14, lVar, lVar2, aVar, aVar2, aVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), RecomposeScopeImplKt.updateChangedFlags(i13), i14);
        return g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:223:0x0b33  */
    /* JADX WARN: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0b1c  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0192  */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v32 */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(@m80.k final java.lang.String r76, @m80.k final java.lang.String r77, final int r78, @m80.k final java.lang.String r79, boolean r80, boolean r81, boolean r82, boolean r83, @m80.l x00.l<? super java.lang.Boolean, yz.g2> r84, @m80.l x00.l<? super java.lang.Boolean, yz.g2> r85, @m80.l x00.a<yz.g2> r86, @m80.l x00.a<yz.g2> r87, @m80.l x00.a<yz.g2> r88, @m80.l androidx.compose.runtime.Composer r89, final int r90, final int r91, final int r92) {
        /*
            Method dump skipped, instructions count: 2895
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.customview.compose.o.n(java.lang.String, java.lang.String, int, java.lang.String, boolean, boolean, boolean, boolean, x00.l, x00.l, x00.a, x00.a, x00.a, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final g2 o(boolean z11) {
        return g2.f100423a;
    }

    public static final g2 p(boolean z11) {
        return g2.f100423a;
    }

    public static final g2 q() {
        return g2.f100423a;
    }

    public static final g2 r() {
        return g2.f100423a;
    }

    public static final g2 s() {
        return g2.f100423a;
    }

    public static final com.airbnb.lottie.k t(a1.i iVar) {
        return iVar.getValue();
    }

    public static final float u(a1.g gVar) {
        return gVar.getValue().floatValue();
    }

    public static final g2 v(x00.a aVar) {
        aVar.invoke();
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 w(boolean z11, final x00.l lVar, AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i11) {
        g0.p(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(784176800, i11, -1, "com.baicizhan.main.customview.compose.WordInfoItem.<anonymous>.<anonymous> (Business.kt:66)");
        }
        Modifier.Companion companion = Modifier.Companion;
        Modifier m773size3ABfNKs = SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(24));
        boolean changed = composer.changed(lVar);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new x00.l() { // from class: com.baicizhan.main.customview.compose.b
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 x11;
                    x11 = o.x(x00.l.this, ((Boolean) obj).booleanValue());
                    return x11;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        a0.l(m773size3ABfNKs, R.drawable.ic_word_book_checked, R.drawable.ic_word_book_unchecked, z11, (x00.l) rememberedValue, composer, 438, 0);
        SpacerKt.Spacer(SizeKt.m778width3ABfNKs(companion, Dp.m5115constructorimpl(8)), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return g2.f100423a;
    }

    public static final g2 x(x00.l lVar, boolean z11) {
        lVar.invoke(Boolean.valueOf(z11));
        return g2.f100423a;
    }

    public static final g2 y(x00.a aVar) {
        aVar.invoke();
        return g2.f100423a;
    }

    public static final float z(a1.g gVar) {
        return u(gVar);
    }
}
