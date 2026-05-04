package androidx.compose.foundation;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import com.baicizhan.main.activity.SingleFragmentActivity;
import kotlin.jvm.internal.u0;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBackground.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Background.kt\nandroidx/compose/foundation/BackgroundKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,199:1\n110#2:200\n110#2:201\n*S KotlinDebug\n*F\n+ 1 Background.kt\nandroidx/compose/foundation/BackgroundKt\n*L\n55#1:200\n86#1:201\n*E\n"})
/* loaded from: classes.dex */
public final class BackgroundKt {
    @Stable
    @m80.k
    public static final Modifier background(@m80.k Modifier modifier, @m80.k final Brush brush, @m80.k final Shape shape, @FloatRange(from = 0.0d, to = 1.0d) final float f11) {
        return modifier.then(new BackgroundElement(0L, brush, f11, shape, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.BackgroundKt$background$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName(SingleFragmentActivity.f18194n);
                inspectorInfo.getProperties().set("alpha", Float.valueOf(f11));
                inspectorInfo.getProperties().set("brush", brush);
                inspectorInfo.getProperties().set("shape", shape);
            }
        } : InspectableValueKt.getNoInspectorInfo(), 1, null));
    }

    public static /* synthetic */ Modifier background$default(Modifier modifier, Brush brush, Shape shape, float f11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        if ((i11 & 4) != 0) {
            f11 = 1.0f;
        }
        return background(modifier, brush, shape, f11);
    }

    @Stable
    @m80.k
    /* renamed from: background-bw27NRU, reason: not valid java name */
    public static final Modifier m234backgroundbw27NRU(@m80.k Modifier modifier, final long j11, @m80.k final Shape shape) {
        return modifier.then(new BackgroundElement(j11, null, 1.0f, shape, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.BackgroundKt$background-bw27NRU$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName(SingleFragmentActivity.f18194n);
                inspectorInfo.setValue(Color.m2499boximpl(j11));
                inspectorInfo.getProperties().set("color", Color.m2499boximpl(j11));
                inspectorInfo.getProperties().set("shape", shape);
            }
        } : InspectableValueKt.getNoInspectorInfo(), 2, null));
    }

    /* renamed from: background-bw27NRU$default, reason: not valid java name */
    public static /* synthetic */ Modifier m235backgroundbw27NRU$default(Modifier modifier, long j11, Shape shape, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return m234backgroundbw27NRU(modifier, j11, shape);
    }
}
