package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.p;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 10 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,958:1\n75#2:959\n1247#3,6:960\n1247#3,6:966\n1247#3,6:972\n1247#3,6:991\n1247#3,6:997\n350#4,7:978\n34#5,6:985\n34#5,6:1030\n79#6,6:1003\n86#6,3:1018\n89#6,2:1027\n93#6:1038\n347#7,9:1009\n356#7:1029\n357#7,2:1036\n4206#8,6:1021\n30#9:1039\n80#10:1040\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt\n*L\n774#1:959\n776#1:960,6\n780#1:966,6\n781#1:972,6\n867#1:991,6\n874#1:997,6\n807#1:978,7\n816#1:985,6\n872#1:1030,6\n869#1:1003,6\n869#1:1018,3\n869#1:1027,2\n869#1:1038\n869#1:1009,9\n869#1:1029\n869#1:1036,2\n869#1:1021,6\n702#1:1039\n702#1:1040\n*E\n"})
/* loaded from: classes.dex */
public final class AnimatedContentKt {
    private static final long UnspecifiedSize;

    static {
        long j11 = Integer.MIN_VALUE;
        UnspecifiedSize = IntSize.m5281constructorimpl((j11 & 4294967295L) | (j11 << 32));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0051  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <S> void AnimatedContent(final S r19, @m80.l androidx.compose.ui.Modifier r20, @m80.l x00.l<? super androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.ContentTransform> r21, @m80.l androidx.compose.ui.Alignment r22, @m80.l java.lang.String r23, @m80.l x00.l<? super S, ? extends java.lang.Object> r24, @m80.k final x00.r<? super androidx.compose.animation.AnimatedContentScope, ? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r25, @m80.l androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentKt.AnimatedContent(java.lang.Object, androidx.compose.ui.Modifier, x00.l, androidx.compose.ui.Alignment, java.lang.String, x00.l, x00.r, androidx.compose.runtime.Composer, int, int):void");
    }

    @k
    public static final SizeTransform SizeTransform(boolean z11, @k p<? super IntSize, ? super IntSize, ? extends FiniteAnimationSpec<IntSize>> pVar) {
        return new SizeTransformImpl(z11, pVar);
    }

    public static /* synthetic */ SizeTransform SizeTransform$default(boolean z11, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            pVar = new p<IntSize, IntSize, SpringSpec<IntSize>>() { // from class: androidx.compose.animation.AnimatedContentKt$SizeTransform$1
                @Override // x00.p
                public /* bridge */ /* synthetic */ SpringSpec<IntSize> invoke(IntSize intSize, IntSize intSize2) {
                    return m32invokeTemP2vQ(intSize.m5290unboximpl(), intSize2.m5290unboximpl());
                }

                /* renamed from: invoke-TemP2vQ, reason: not valid java name */
                public final SpringSpec<IntSize> m32invokeTemP2vQ(long j11, long j12) {
                    return AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5278boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
                }
            };
        }
        return SizeTransform(z11, pVar);
    }

    @k
    public static final ContentTransform togetherWith(@k EnterTransition enterTransition, @k ExitTransition exitTransition) {
        return new ContentTransform(enterTransition, exitTransition, 0.0f, null, 12, null);
    }

    @n(message = "Infix fun EnterTransition.with(ExitTransition) has been renamed to togetherWith", replaceWith = @w0(expression = "togetherWith(exit)", imports = {}))
    @ExperimentalAnimationApi
    @k
    public static final ContentTransform with(@k EnterTransition enterTransition, @k ExitTransition exitTransition) {
        return new ContentTransform(enterTransition, exitTransition, 0.0f, null, 12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <S> void AnimatedContent(@m80.k final androidx.compose.animation.core.Transition<S> r17, @m80.l androidx.compose.ui.Modifier r18, @m80.l x00.l<? super androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.ContentTransform> r19, @m80.l androidx.compose.ui.Alignment r20, @m80.l x00.l<? super S, ? extends java.lang.Object> r21, @m80.k final x00.r<? super androidx.compose.animation.AnimatedContentScope, ? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r22, @m80.l androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentKt.AnimatedContent(androidx.compose.animation.core.Transition, androidx.compose.ui.Modifier, x00.l, androidx.compose.ui.Alignment, x00.l, x00.r, androidx.compose.runtime.Composer, int, int):void");
    }
}
