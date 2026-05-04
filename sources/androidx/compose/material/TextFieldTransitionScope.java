package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldTransitionScope\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,381:1\n1969#2:382\n1884#2,7:383\n1969#2:390\n1884#2,7:391\n1884#2,7:409\n1884#2,7:427\n68#3,3:398\n71#3:404\n74#3:408\n68#3,3:416\n71#3:422\n74#3:426\n1225#4,3:401\n1228#4,3:405\n1225#4,3:419\n1228#4,3:423\n85#5:434\n85#5:435\n85#5:436\n85#5:437\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldTransitionScope\n*L\n291#1:382\n291#1:383,7\n303#1:390\n303#1:391,7\n333#1:409,7\n344#1:427,7\n333#1:398,3\n333#1:404\n333#1:408\n344#1:416,3\n344#1:422\n344#1:426\n333#1:401,3\n333#1:405,3\n344#1:419,3\n344#1:423,3\n291#1:434\n303#1:435\n333#1:436\n344#1:437\n*E\n"})
/* loaded from: classes.dex */
final class TextFieldTransitionScope {

    @k
    public static final TextFieldTransitionScope INSTANCE = new TextFieldTransitionScope();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InputPhase.values().length];
            try {
                iArr[InputPhase.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputPhase.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InputPhase.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private TextFieldTransitionScope() {
    }

    private static final float Transition_DTcfvLk$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float Transition_DTcfvLk$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final long Transition_DTcfvLk$lambda$5(State<Color> state) {
        return state.getValue().m2519unboximpl();
    }

    private static final long Transition_DTcfvLk$lambda$6(State<Color> state) {
        return state.getValue().m2519unboximpl();
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x01d9, code lost:
    
        if (r32 != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x019b, code lost:
    
        if (r32 != false) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01cc  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0][0]]")
    /* renamed from: Transition-DTcfvLk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1843TransitionDTcfvLk(@m80.k final androidx.compose.material.InputPhase r26, final long r27, final long r29, @m80.k final x00.q<? super androidx.compose.material.InputPhase, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, androidx.compose.ui.graphics.Color> r31, final boolean r32, @m80.k final x00.t<? super java.lang.Float, ? super androidx.compose.ui.graphics.Color, ? super androidx.compose.ui.graphics.Color, ? super java.lang.Float, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r33, @m80.l androidx.compose.runtime.Composer r34, final int r35) {
        /*
            Method dump skipped, instructions count: 949
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldTransitionScope.m1843TransitionDTcfvLk(androidx.compose.material.InputPhase, long, long, x00.q, boolean, x00.t, androidx.compose.runtime.Composer, int):void");
    }
}
