package androidx.compose.foundation;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.annotation.ColorInt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.u0;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/EdgeEffectWrapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1073:1\n1#2:1074\n54#3:1075\n59#3:1077\n59#3:1079\n54#3:1081\n54#3:1083\n59#3:1085\n54#3:1087\n59#3:1089\n59#3:1091\n54#3:1093\n59#3:1095\n54#3:1097\n54#3:1099\n59#3:1101\n54#3:1103\n59#3:1105\n59#3:1107\n54#3:1109\n59#3:1111\n54#3:1113\n85#4:1076\n90#4:1078\n90#4:1080\n85#4:1082\n85#4:1084\n90#4:1086\n85#4:1088\n90#4:1090\n90#4:1092\n85#4:1094\n90#4:1096\n85#4:1098\n85#4:1100\n90#4:1102\n85#4:1104\n90#4:1106\n90#4:1108\n85#4:1110\n90#4:1112\n85#4:1114\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/EdgeEffectWrapper\n*L\n1034#1:1075\n1034#1:1077\n1036#1:1079\n1036#1:1081\n1043#1:1083\n1043#1:1085\n1044#1:1087\n1044#1:1089\n1045#1:1091\n1045#1:1093\n1046#1:1095\n1046#1:1097\n1048#1:1099\n1048#1:1101\n1049#1:1103\n1049#1:1105\n1050#1:1107\n1050#1:1109\n1051#1:1111\n1051#1:1113\n1034#1:1076\n1034#1:1078\n1036#1:1080\n1036#1:1082\n1043#1:1084\n1043#1:1086\n1044#1:1088\n1044#1:1090\n1045#1:1092\n1045#1:1094\n1046#1:1096\n1046#1:1098\n1048#1:1100\n1048#1:1102\n1049#1:1104\n1049#1:1106\n1050#1:1108\n1050#1:1110\n1051#1:1112\n1051#1:1114\n*E\n"})
/* loaded from: classes.dex */
final class EdgeEffectWrapper {

    @l
    private EdgeEffect bottomEffect;

    @l
    private EdgeEffect bottomEffectNegation;

    @m80.k
    private final Context context;
    private final int glowColor;

    @l
    private EdgeEffect leftEffect;

    @l
    private EdgeEffect leftEffectNegation;

    @l
    private EdgeEffect rightEffect;

    @l
    private EdgeEffect rightEffectNegation;
    private long size = IntSize.Companion.m5291getZeroYbymL2g();

    @l
    private EdgeEffect topEffect;

    @l
    private EdgeEffect topEffectNegation;

    public EdgeEffectWrapper(@m80.k Context context, @ColorInt int i11) {
        this.context = context;
        this.glowColor = i11;
    }

    private final EdgeEffect createEdgeEffect(Orientation orientation) {
        EdgeEffect create = EdgeEffectCompat.INSTANCE.create(this.context);
        create.setColor(this.glowColor);
        if (!IntSize.m5284equalsimpl0(this.size, IntSize.Companion.m5291getZeroYbymL2g())) {
            if (orientation == Orientation.Vertical) {
                long j11 = this.size;
                create.setSize((int) (j11 >> 32), (int) (j11 & 4294967295L));
                return create;
            }
            long j12 = this.size;
            create.setSize((int) (j12 & 4294967295L), (int) (j12 >> 32));
        }
        return create;
    }

    private final boolean isAnimating(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    private final boolean isStretched(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !(EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect) == 0.0f);
    }

    public final void finishAll() {
        EdgeEffect edgeEffect = this.topEffect;
        if (edgeEffect != null) {
            edgeEffect.finish();
        }
        EdgeEffect edgeEffect2 = this.bottomEffect;
        if (edgeEffect2 != null) {
            edgeEffect2.finish();
        }
        EdgeEffect edgeEffect3 = this.leftEffect;
        if (edgeEffect3 != null) {
            edgeEffect3.finish();
        }
        EdgeEffect edgeEffect4 = this.rightEffect;
        if (edgeEffect4 != null) {
            edgeEffect4.finish();
        }
        EdgeEffect edgeEffect5 = this.topEffectNegation;
        if (edgeEffect5 != null) {
            edgeEffect5.finish();
        }
        EdgeEffect edgeEffect6 = this.bottomEffectNegation;
        if (edgeEffect6 != null) {
            edgeEffect6.finish();
        }
        EdgeEffect edgeEffect7 = this.leftEffectNegation;
        if (edgeEffect7 != null) {
            edgeEffect7.finish();
        }
        EdgeEffect edgeEffect8 = this.rightEffectNegation;
        if (edgeEffect8 != null) {
            edgeEffect8.finish();
        }
    }

    public final void forEachEffect(@m80.k x00.l<? super EdgeEffect, g2> lVar) {
        EdgeEffect edgeEffect = this.topEffect;
        if (edgeEffect != null) {
            lVar.invoke(edgeEffect);
        }
        EdgeEffect edgeEffect2 = this.bottomEffect;
        if (edgeEffect2 != null) {
            lVar.invoke(edgeEffect2);
        }
        EdgeEffect edgeEffect3 = this.leftEffect;
        if (edgeEffect3 != null) {
            lVar.invoke(edgeEffect3);
        }
        EdgeEffect edgeEffect4 = this.rightEffect;
        if (edgeEffect4 != null) {
            lVar.invoke(edgeEffect4);
        }
    }

    @m80.k
    public final EdgeEffect getOrCreateBottomEffect() {
        EdgeEffect edgeEffect = this.bottomEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect createEdgeEffect = createEdgeEffect(Orientation.Vertical);
        this.bottomEffect = createEdgeEffect;
        return createEdgeEffect;
    }

    @m80.k
    public final EdgeEffect getOrCreateBottomEffectNegation() {
        EdgeEffect edgeEffect = this.bottomEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect createEdgeEffect = createEdgeEffect(Orientation.Vertical);
        this.bottomEffectNegation = createEdgeEffect;
        return createEdgeEffect;
    }

    @m80.k
    public final EdgeEffect getOrCreateLeftEffect() {
        EdgeEffect edgeEffect = this.leftEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect createEdgeEffect = createEdgeEffect(Orientation.Horizontal);
        this.leftEffect = createEdgeEffect;
        return createEdgeEffect;
    }

    @m80.k
    public final EdgeEffect getOrCreateLeftEffectNegation() {
        EdgeEffect edgeEffect = this.leftEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect createEdgeEffect = createEdgeEffect(Orientation.Horizontal);
        this.leftEffectNegation = createEdgeEffect;
        return createEdgeEffect;
    }

    @m80.k
    public final EdgeEffect getOrCreateRightEffect() {
        EdgeEffect edgeEffect = this.rightEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect createEdgeEffect = createEdgeEffect(Orientation.Horizontal);
        this.rightEffect = createEdgeEffect;
        return createEdgeEffect;
    }

    @m80.k
    public final EdgeEffect getOrCreateRightEffectNegation() {
        EdgeEffect edgeEffect = this.rightEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect createEdgeEffect = createEdgeEffect(Orientation.Horizontal);
        this.rightEffectNegation = createEdgeEffect;
        return createEdgeEffect;
    }

    @m80.k
    public final EdgeEffect getOrCreateTopEffect() {
        EdgeEffect edgeEffect = this.topEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect createEdgeEffect = createEdgeEffect(Orientation.Vertical);
        this.topEffect = createEdgeEffect;
        return createEdgeEffect;
    }

    @m80.k
    public final EdgeEffect getOrCreateTopEffectNegation() {
        EdgeEffect edgeEffect = this.topEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect createEdgeEffect = createEdgeEffect(Orientation.Vertical);
        this.topEffectNegation = createEdgeEffect;
        return createEdgeEffect;
    }

    public final boolean isBottomAnimating() {
        return isAnimating(this.bottomEffect);
    }

    public final boolean isBottomNegationStretched() {
        return isStretched(this.bottomEffectNegation);
    }

    public final boolean isBottomStretched() {
        return isStretched(this.bottomEffect);
    }

    public final boolean isLeftAnimating() {
        return isAnimating(this.leftEffect);
    }

    public final boolean isLeftNegationStretched() {
        return isStretched(this.leftEffectNegation);
    }

    public final boolean isLeftStretched() {
        return isStretched(this.leftEffect);
    }

    public final boolean isRightAnimating() {
        return isAnimating(this.rightEffect);
    }

    public final boolean isRightNegationStretched() {
        return isStretched(this.rightEffectNegation);
    }

    public final boolean isRightStretched() {
        return isStretched(this.rightEffect);
    }

    public final boolean isTopAnimating() {
        return isAnimating(this.topEffect);
    }

    public final boolean isTopNegationStretched() {
        return isStretched(this.topEffectNegation);
    }

    public final boolean isTopStretched() {
        return isStretched(this.topEffect);
    }

    /* renamed from: updateSize-ozmzZPI, reason: not valid java name */
    public final void m289updateSizeozmzZPI(long j11) {
        this.size = j11;
        EdgeEffect edgeEffect = this.topEffect;
        if (edgeEffect != null) {
            edgeEffect.setSize((int) (j11 >> 32), (int) (j11 & 4294967295L));
        }
        EdgeEffect edgeEffect2 = this.bottomEffect;
        if (edgeEffect2 != null) {
            edgeEffect2.setSize((int) (j11 >> 32), (int) (j11 & 4294967295L));
        }
        EdgeEffect edgeEffect3 = this.leftEffect;
        if (edgeEffect3 != null) {
            edgeEffect3.setSize((int) (j11 & 4294967295L), (int) (j11 >> 32));
        }
        EdgeEffect edgeEffect4 = this.rightEffect;
        if (edgeEffect4 != null) {
            edgeEffect4.setSize((int) (j11 & 4294967295L), (int) (j11 >> 32));
        }
        EdgeEffect edgeEffect5 = this.topEffectNegation;
        if (edgeEffect5 != null) {
            edgeEffect5.setSize((int) (j11 >> 32), (int) (j11 & 4294967295L));
        }
        EdgeEffect edgeEffect6 = this.bottomEffectNegation;
        if (edgeEffect6 != null) {
            edgeEffect6.setSize((int) (j11 >> 32), (int) (j11 & 4294967295L));
        }
        EdgeEffect edgeEffect7 = this.leftEffectNegation;
        if (edgeEffect7 != null) {
            edgeEffect7.setSize((int) (j11 & 4294967295L), (int) (j11 >> 32));
        }
        EdgeEffect edgeEffect8 = this.rightEffectNegation;
        if (edgeEffect8 != null) {
            edgeEffect8.setSize((int) (4294967295L & j11), (int) (j11 >> 32));
        }
    }
}
