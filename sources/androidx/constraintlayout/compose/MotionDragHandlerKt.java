package androidx.constraintlayout.compose;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.constraintlayout.motion.widget.Key;
import c40.r0;
import com.baicizhan.client.business.dataset.provider.a;
import e40.o;
import e40.r;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMotionDragHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MotionDragHandler.kt\nandroidx/constraintlayout/compose/MotionDragHandlerKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,195:1\n135#2:196\n*S KotlinDebug\n*F\n+ 1 MotionDragHandler.kt\nandroidx/constraintlayout/compose/MotionDragHandlerKt\n*L\n55#1:196\n*E\n"})
/* loaded from: classes2.dex */
public final class MotionDragHandlerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Object detectDragGesturesWhenNeeded(PointerInputScope pointerInputScope, l<? super Offset, Boolean> lVar, l<? super Offset, g2> lVar2, x00.a<g2> aVar, x00.a<g2> aVar2, p<? super PointerInputChange, ? super Offset, g2> pVar, j00.c<? super g2> cVar) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new MotionDragHandlerKt$detectDragGesturesWhenNeeded$2(lVar, lVar2, pVar, aVar2, aVar, null), cVar);
        return awaitEachGesture == kotlin.coroutines.intrinsics.b.l() ? awaitEachGesture : g2.f100423a;
    }

    @ExperimentalMotionApi
    @k
    public static final Modifier motionPointerInput(@k Modifier modifier, @k final Object obj, @k final MutableFloatState mutableFloatState, @k final MotionMeasurer motionMeasurer) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$$inlined$debugInspectorInfo$1
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
            public final void invoke2(@k InspectorInfo inspectorInfo) {
                inspectorInfo.setName("motionPointerInput");
                inspectorInfo.getProperties().set(a.d.C0245a.f16161a, obj);
                inspectorInfo.getProperties().set(Key.MOTIONPROGRESS, mutableFloatState);
                inspectorInfo.getProperties().set("measurer", motionMeasurer);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i11) {
                Modifier then;
                composer.startReplaceGroup(146198586);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(146198586, i11, -1, "androidx.constraintlayout.compose.motionPointerInput.<anonymous> (MotionDragHandler.kt:61)");
                }
                if (!MotionMeasurer.this.getTransition().hasOnSwipe()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return modifier2;
                }
                boolean changed = composer.changed(obj);
                MotionMeasurer motionMeasurer2 = MotionMeasurer.this;
                MutableFloatState mutableFloatState2 = mutableFloatState;
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new TransitionHandler(motionMeasurer2, mutableFloatState2);
                    composer.updateRememberedValue(rememberedValue);
                }
                TransitionHandler transitionHandler = (TransitionHandler) rememberedValue;
                boolean changed2 = composer.changed(obj);
                Object rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = r.d(-1, null, null, 6, null);
                    composer.updateRememberedValue(rememberedValue2);
                }
                o oVar = (o) rememberedValue2;
                Object obj2 = obj;
                boolean changedInstance = composer.changedInstance(transitionHandler) | composer.changedInstance(oVar);
                Object rememberedValue3 = composer.rememberedValue();
                if (changedInstance || rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = new MotionDragHandlerKt$motionPointerInput$2$1$1(transitionHandler, oVar, null);
                    composer.updateRememberedValue(rememberedValue3);
                }
                EffectsKt.LaunchedEffect(obj2, (p<? super r0, ? super j00.c<? super g2>, ? extends Object>) rememberedValue3, composer, 0);
                Object obj3 = obj;
                boolean changedInstance2 = composer.changedInstance(transitionHandler) | composer.changedInstance(oVar);
                Object rememberedValue4 = composer.rememberedValue();
                if (changedInstance2 || rememberedValue4 == Composer.Companion.getEmpty()) {
                    rememberedValue4 = new MotionDragHandlerKt$motionPointerInput$2$2$1(transitionHandler, oVar, null);
                    composer.updateRememberedValue(rememberedValue4);
                }
                then = modifier2.then(new SuspendPointerInputElement(obj3, null, null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0((p) rememberedValue4), 6, null));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return then;
            }
        });
    }
}
