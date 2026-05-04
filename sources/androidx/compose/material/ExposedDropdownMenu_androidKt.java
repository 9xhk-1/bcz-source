package androidx.compose.material;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntRect;
import kotlin.jvm.internal.u0;
import w00.j;
import x00.a;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "ExposedDropdownMenu_androidKt")
@u0({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/ExposedDropdownMenu_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,671:1\n75#2:672\n1247#3,6:673\n1247#3,6:679\n1247#3,6:686\n1247#3,6:692\n1247#3,6:698\n1247#3,6:704\n1247#3,6:710\n1247#3,6:756\n1247#3,6:762\n1#4:685\n71#5:716\n68#5,6:717\n74#5:751\n78#5:755\n79#6,6:723\n86#6,4:738\n90#6,2:748\n94#6:754\n368#7,9:729\n377#7:750\n378#7,2:752\n4034#8,6:742\n78#9:768\n107#9,2:769\n78#9:771\n107#9,2:772\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/ExposedDropdownMenu_androidKt\n*L\n96#1:672\n98#1:673,6\n99#1:679,6\n101#1:686,6\n104#1:692,6\n117#1:698,6\n121#1:704,6\n133#1:710,6\n141#1:756,6\n143#1:762,6\n119#1:716\n119#1:717,6\n119#1:751\n119#1:755\n119#1:723,6\n119#1:738,4\n119#1:748,2\n119#1:754\n119#1:729,9\n119#1:750\n119#1:752,2\n119#1:742,6\n98#1:768\n98#1:769,2\n99#1:771\n99#1:772,2\n*E\n"})
/* loaded from: classes.dex */
public final class ExposedDropdownMenu_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0061  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ExposedDropdownMenuBox(final boolean r21, @m80.k final x00.l<? super java.lang.Boolean, yz.g2> r22, @m80.l androidx.compose.ui.Modifier r23, @m80.k final x00.q<? super androidx.compose.material.ExposedDropdownMenuBoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r24, @m80.l androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox(boolean, x00.l, androidx.compose.ui.Modifier, x00.q, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final Modifier expandable(Modifier modifier, final a<g2> aVar, final String str) {
        Modifier then;
        then = modifier.then(new SuspendPointerInputElement(aVar, null, null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0(new ExposedDropdownMenu_androidKt$expandable$1(aVar, null)), 6, null));
        return SemanticsModifierKt.semantics$default(then, false, new l<SemanticsPropertyReceiver, g2>() { // from class: androidx.compose.material.ExposedDropdownMenu_androidKt$expandable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                final a<g2> aVar2 = aVar;
                SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new a<Boolean>() { // from class: androidx.compose.material.ExposedDropdownMenu_androidKt$expandable$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // x00.a
                    public final Boolean invoke() {
                        aVar2.invoke();
                        return Boolean.TRUE;
                    }
                }, 1, null);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateHeight(IntRect intRect, LayoutCoordinates layoutCoordinates, int i11, l<? super Integer, g2> lVar) {
        if (layoutCoordinates == null) {
            return;
        }
        lVar.invoke(Integer.valueOf(((int) Math.max(LayoutCoordinatesKt.boundsInWindow(layoutCoordinates).getTop() - intRect.getTop(), (intRect.getBottom() - intRect.getTop()) - LayoutCoordinatesKt.boundsInWindow(layoutCoordinates).getBottom())) - i11));
    }
}
