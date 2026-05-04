package androidx.constraintlayout.compose;

import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnPlacedModifierKt;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.core.state.WidgetFrame;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import x00.q;
import yz.g2;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@LayoutScopeMarker
@StabilityInferred(parameters = 0)
@ExperimentalMotionApi
@u0({"SMAP\nMotionLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MotionLayout.kt\nandroidx/constraintlayout/compose/MotionLayoutScope\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1651:1\n135#2:1652\n1225#3,6:1653\n169#4:1659\n169#4:1660\n*S KotlinDebug\n*F\n+ 1 MotionLayout.kt\nandroidx/constraintlayout/compose/MotionLayoutScope\n*L\n707#1:1652\n874#1:1653,6\n898#1:1659\n956#1:1660\n*E\n"})
/* loaded from: classes2.dex */
public final class MotionLayoutScope {
    public static final int $stable = 8;

    @k
    private final MotionMeasurer measurer;

    @k
    private final MutableFloatState motionProgress;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nMotionLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MotionLayout.kt\nandroidx/constraintlayout/compose/MotionLayoutScope$CustomProperties\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1651:1\n169#2:1652\n*S KotlinDebug\n*F\n+ 1 MotionLayout.kt\nandroidx/constraintlayout/compose/MotionLayoutScope$CustomProperties\n*L\n818#1:1652\n*E\n"})
    public final class CustomProperties {

        /* renamed from: id, reason: collision with root package name */
        @k
        private final String f4244id;

        public CustomProperties(@k String str) {
            this.f4244id = str;
        }

        /* renamed from: color-vNxB06k, reason: not valid java name */
        public final long m5541colorvNxB06k(@k String str) {
            return MotionLayoutScope.this.measurer.m5556getCustomColorXeAY9LY(this.f4244id, str, MotionLayoutScope.this.motionProgress.getFloatValue());
        }

        /* renamed from: distance-u2uoSUM, reason: not valid java name */
        public final float m5542distanceu2uoSUM(@k String str) {
            return Dp.m5115constructorimpl(MotionLayoutScope.this.measurer.getCustomFloat(this.f4244id, str, MotionLayoutScope.this.motionProgress.getFloatValue()));
        }

        /* renamed from: float, reason: not valid java name */
        public final float m5543float(@k String str) {
            return MotionLayoutScope.this.measurer.getCustomFloat(this.f4244id, str, MotionLayoutScope.this.motionProgress.getFloatValue());
        }

        /* renamed from: fontSize-kPz2Gy4, reason: not valid java name */
        public final long m5544fontSizekPz2Gy4(@k String str) {
            return TextUnitKt.getSp(MotionLayoutScope.this.measurer.getCustomFloat(this.f4244id, str, MotionLayoutScope.this.motionProgress.getFloatValue()));
        }

        /* renamed from: int, reason: not valid java name */
        public final int m5545int(@k String str) {
            return (int) MotionLayoutScope.this.measurer.getCustomFloat(this.f4244id, str, MotionLayoutScope.this.motionProgress.getFloatValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nMotionLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MotionLayout.kt\nandroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1651:1\n169#2:1652\n*S KotlinDebug\n*F\n+ 1 MotionLayout.kt\nandroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties\n*L\n858#1:1652\n*E\n"})
    public final class MotionProperties {

        @k
        private String myId;

        @l
        private String myTag;

        public MotionProperties(@k String str, @l String str2) {
            this.myId = str;
            this.myTag = str2;
        }

        /* renamed from: color-vNxB06k, reason: not valid java name */
        public final long m5546colorvNxB06k(@k String str) {
            return MotionLayoutScope.this.measurer.m5556getCustomColorXeAY9LY(this.myId, str, MotionLayoutScope.this.motionProgress.getFloatValue());
        }

        /* renamed from: distance-u2uoSUM, reason: not valid java name */
        public final float m5547distanceu2uoSUM(@k String str) {
            return Dp.m5115constructorimpl(MotionLayoutScope.this.measurer.getCustomFloat(this.myId, str, MotionLayoutScope.this.motionProgress.getFloatValue()));
        }

        /* renamed from: float, reason: not valid java name */
        public final float m5548float(@k String str) {
            return MotionLayoutScope.this.measurer.getCustomFloat(this.myId, str, MotionLayoutScope.this.motionProgress.getFloatValue());
        }

        /* renamed from: fontSize-kPz2Gy4, reason: not valid java name */
        public final long m5549fontSizekPz2Gy4(@k String str) {
            return TextUnitKt.getSp(MotionLayoutScope.this.measurer.getCustomFloat(this.myId, str, MotionLayoutScope.this.motionProgress.getFloatValue()));
        }

        @k
        public final String id() {
            return this.myId;
        }

        /* renamed from: int, reason: not valid java name */
        public final int m5550int(@k String str) {
            return (int) MotionLayoutScope.this.measurer.getCustomFloat(this.myId, str, MotionLayoutScope.this.motionProgress.getFloatValue());
        }

        @l
        public final String tag() {
            return this.myTag;
        }
    }

    public MotionLayoutScope(@k MotionMeasurer motionMeasurer, @k MutableFloatState mutableFloatState) {
        this.measurer = motionMeasurer;
        this.motionProgress = mutableFloatState;
    }

    /* renamed from: customColor-WaAFU9c, reason: not valid java name */
    public final long m5535customColorWaAFU9c(@k String str, @k String str2) {
        return this.measurer.m5556getCustomColorXeAY9LY(str, str2, this.motionProgress.getFloatValue());
    }

    /* renamed from: customDistance-chRvn1I, reason: not valid java name */
    public final float m5536customDistancechRvn1I(@k String str, @k String str2) {
        return Dp.m5115constructorimpl(this.measurer.getCustomFloat(str, str2, this.motionProgress.getFloatValue()));
    }

    public final float customFloat(@k String str, @k String str2) {
        return this.measurer.getCustomFloat(str, str2, this.motionProgress.getFloatValue());
    }

    /* renamed from: customFontSize-5XXgJZs, reason: not valid java name */
    public final long m5537customFontSize5XXgJZs(@k String str, @k String str2) {
        return TextUnitKt.getSp(this.measurer.getCustomFloat(str, str2, this.motionProgress.getFloatValue()));
    }

    public final int customInt(@k String str, @k String str2) {
        return (int) this.measurer.getCustomFloat(str, str2, this.motionProgress.getFloatValue());
    }

    @k
    public final CustomProperties customProperties(@k String str) {
        return new CustomProperties(str);
    }

    @n(message = "Deprecated for naming consistency", replaceWith = @w0(expression = "customColor(id, name)", imports = {}))
    /* renamed from: motionColor-WaAFU9c, reason: not valid java name */
    public final long m5538motionColorWaAFU9c(@k String str, @k String str2) {
        return this.measurer.m5556getCustomColorXeAY9LY(str, str2, this.motionProgress.getFloatValue());
    }

    @n(message = "Deprecated for naming consistency", replaceWith = @w0(expression = "customDistance(id, name)", imports = {}))
    /* renamed from: motionDistance-chRvn1I, reason: not valid java name */
    public final float m5539motionDistancechRvn1I(@k String str, @k String str2) {
        return Dp.m5115constructorimpl(this.measurer.getCustomFloat(str, str2, this.motionProgress.getFloatValue()));
    }

    @n(message = "Deprecated for naming consistency", replaceWith = @w0(expression = "customFloat(id, name)", imports = {}))
    public final float motionFloat(@k String str, @k String str2) {
        return this.measurer.getCustomFloat(str, str2, this.motionProgress.getFloatValue());
    }

    @n(message = "Deprecated for naming consistency", replaceWith = @w0(expression = "customFontSize(id, name)", imports = {}))
    /* renamed from: motionFontSize-5XXgJZs, reason: not valid java name */
    public final long m5540motionFontSize5XXgJZs(@k String str, @k String str2) {
        return TextUnitKt.getSp(this.measurer.getCustomFloat(str, str2, this.motionProgress.getFloatValue()));
    }

    @n(message = "Deprecated for naming consistency", replaceWith = @w0(expression = "customInt(id, name)", imports = {}))
    public final int motionInt(@k String str, @k String str2) {
        return (int) this.measurer.getCustomFloat(str, str2, this.motionProgress.getFloatValue());
    }

    @Composable
    @n(message = "Unnecessary composable, name is also inconsistent for custom properties", replaceWith = @w0(expression = "customProperties(id)", imports = {}))
    @k
    public final androidx.compose.runtime.State<MotionProperties> motionProperties(@k String str, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1417298021, i11, -1, "androidx.constraintlayout.compose.MotionLayoutScope.motionProperties (MotionLayout.kt:873)");
        }
        boolean z11 = (((i11 & 14) ^ 6) > 4 && composer.changed(str)) || (i11 & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new MotionProperties(str, null), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }

    @k
    public final Modifier onStartEndBoundsChanged(@k Modifier modifier, @k final Object obj, @k final p<? super Rect, ? super Rect, g2> pVar) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new x00.l<InspectorInfo, g2>() { // from class: androidx.constraintlayout.compose.MotionLayoutScope$onStartEndBoundsChanged$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("onStartEndBoundsChanged");
                inspectorInfo.getProperties().set("layoutId", obj);
                inspectorInfo.getProperties().set("onBoundsChanged", pVar);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.constraintlayout.compose.MotionLayoutScope$onStartEndBoundsChanged$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i11) {
                composer.startReplaceGroup(-1096247907);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1096247907, i11, -1, "androidx.constraintlayout.compose.MotionLayoutScope.onStartEndBoundsChanged.<anonymous> (MotionLayout.kt:714)");
                }
                boolean changed = composer.changed(obj);
                Object obj2 = obj;
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = obj2.toString();
                    composer.updateRememberedValue(rememberedValue);
                }
                final String str = (String) rememberedValue;
                Object rememberedValue2 = composer.rememberedValue();
                Object obj3 = rememberedValue2;
                if (rememberedValue2 == Composer.Companion.getEmpty()) {
                    int[] iArr = new int[4];
                    for (int i12 = 0; i12 < 4; i12++) {
                        iArr[i12] = 0;
                    }
                    composer.updateRememberedValue(iArr);
                    obj3 = iArr;
                }
                final int[] iArr2 = (int[]) obj3;
                Object rememberedValue3 = composer.rememberedValue();
                Composer.Companion companion = Composer.Companion;
                Object obj4 = rememberedValue3;
                if (rememberedValue3 == companion.getEmpty()) {
                    Ref ref = new Ref();
                    ref.setValue(Rect.Companion.getZero());
                    composer.updateRememberedValue(ref);
                    obj4 = ref;
                }
                final Ref ref2 = (Ref) obj4;
                Object rememberedValue4 = composer.rememberedValue();
                Object obj5 = rememberedValue4;
                if (rememberedValue4 == companion.getEmpty()) {
                    int[] iArr3 = new int[4];
                    for (int i13 = 0; i13 < 4; i13++) {
                        iArr3[i13] = 0;
                    }
                    composer.updateRememberedValue(iArr3);
                    obj5 = iArr3;
                }
                final int[] iArr4 = (int[]) obj5;
                Object rememberedValue5 = composer.rememberedValue();
                Composer.Companion companion2 = Composer.Companion;
                Object obj6 = rememberedValue5;
                if (rememberedValue5 == companion2.getEmpty()) {
                    Ref ref3 = new Ref();
                    ref3.setValue(Rect.Companion.getZero());
                    composer.updateRememberedValue(ref3);
                    obj6 = ref3;
                }
                final Ref ref4 = (Ref) obj6;
                boolean changedInstance = composer.changedInstance(this) | composer.changed(str) | composer.changedInstance(iArr2) | composer.changedInstance(ref2) | composer.changedInstance(iArr4) | composer.changedInstance(ref4) | composer.changed(pVar);
                final MotionLayoutScope motionLayoutScope = this;
                final p<Rect, Rect, g2> pVar2 = pVar;
                Object rememberedValue6 = composer.rememberedValue();
                if (changedInstance || rememberedValue6 == companion2.getEmpty()) {
                    Object obj7 = new x00.l<LayoutCoordinates, g2>() { // from class: androidx.constraintlayout.compose.MotionLayoutScope$onStartEndBoundsChanged$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // x00.l
                        public /* bridge */ /* synthetic */ g2 invoke(LayoutCoordinates layoutCoordinates) {
                            invoke2(layoutCoordinates);
                            return g2.f100423a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(LayoutCoordinates layoutCoordinates) {
                            boolean z11;
                            WidgetFrame start = MotionLayoutScope.this.measurer.getTransition().getStart(str);
                            int i14 = start.left;
                            int[] iArr5 = iArr2;
                            boolean z12 = true;
                            if (i14 == iArr5[0] && start.top == iArr5[1] && start.right == iArr5[2] && start.bottom == iArr5[3]) {
                                z11 = false;
                            } else {
                                iArr5[0] = i14;
                                iArr5[1] = start.top;
                                iArr5[2] = start.right;
                                iArr5[3] = start.bottom;
                                Ref<Rect> ref5 = ref2;
                                int[] iArr6 = iArr2;
                                ref5.setValue(new Rect(iArr6[0], iArr6[1], iArr6[2], iArr6[3]));
                                z11 = true;
                            }
                            WidgetFrame end = MotionLayoutScope.this.measurer.getTransition().getEnd(str);
                            int i15 = end.left;
                            int[] iArr7 = iArr4;
                            if (i15 == iArr7[0] && end.top == iArr7[1] && end.right == iArr7[2] && end.bottom == iArr7[3]) {
                                z12 = z11;
                            } else {
                                iArr7[0] = i15;
                                iArr7[1] = end.top;
                                iArr7[2] = end.right;
                                iArr7[3] = end.bottom;
                                Ref<Rect> ref6 = ref4;
                                int[] iArr8 = iArr4;
                                ref6.setValue(new Rect(iArr8[0], iArr8[1], iArr8[2], iArr8[3]));
                            }
                            if (z12) {
                                p<Rect, Rect, g2> pVar3 = pVar2;
                                Rect value = ref2.getValue();
                                if (value == null) {
                                    value = Rect.Companion.getZero();
                                }
                                Rect value2 = ref4.getValue();
                                if (value2 == null) {
                                    value2 = Rect.Companion.getZero();
                                }
                                pVar3.invoke(value, value2);
                            }
                        }
                    };
                    composer.updateRememberedValue(obj7);
                    rememberedValue6 = obj7;
                }
                Modifier onPlaced = OnPlacedModifierKt.onPlaced(modifier2, (x00.l) rememberedValue6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return onPlaced;
            }
        });
    }

    @n(message = "Deprecated for naming consistency", replaceWith = @w0(expression = "customProperties(id)", imports = {}))
    @k
    public final MotionProperties motionProperties(@k String str, @k String str2) {
        return new MotionProperties(str, str2);
    }
}
