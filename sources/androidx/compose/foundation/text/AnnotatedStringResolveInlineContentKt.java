package androidx.compose.foundation.text;

import a00.h0;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAnnotatedStringResolveInlineContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedStringResolveInlineContent.kt\nandroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,81:1\n34#2,6:82\n34#2,4:88\n39#2:125\n79#3:92\n77#3,8:93\n86#3,3:110\n89#3,2:119\n93#3:124\n347#4,9:101\n356#4,3:121\n4206#5,6:113\n*S KotlinDebug\n*F\n+ 1 AnnotatedStringResolveInlineContent.kt\nandroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt\n*L\n47#1:82,6\n69#1:88,4\n69#1:125\n70#1:92\n70#1:93,8\n70#1:110,3\n70#1:119,2\n70#1:124\n70#1:101,9\n70#1:121,3\n70#1:113,6\n*E\n"})
/* loaded from: classes.dex */
public final class AnnotatedStringResolveInlineContentKt {

    @k
    private static final Pair<List<AnnotatedString.Range<Placeholder>>, List<AnnotatedString.Range<q<String, Composer, Integer, g2>>>> EmptyInlineContent = new Pair<>(h0.J(), h0.J());

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void InlineChildren(@k final AnnotatedString annotatedString, @k final List<AnnotatedString.Range<q<String, Composer, Integer, g2>>> list, @l Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-1794596951);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(annotatedString) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(list) ? 32 : 16;
        }
        int i13 = 0;
        if (startRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1794596951, i12, -1, "androidx.compose.foundation.text.InlineChildren (AnnotatedStringResolveInlineContent.kt:67)");
            }
            int size = list.size();
            int i14 = 0;
            while (i14 < size) {
                AnnotatedString.Range<q<String, Composer, Integer, g2>> range = list.get(i14);
                q<String, Composer, Integer, g2> component1 = range.component1();
                int component2 = range.component2();
                int component3 = range.component3();
                AnnotatedStringResolveInlineContentKt$InlineChildren$1$2 annotatedStringResolveInlineContentKt$InlineChildren$1$2 = new MeasurePolicy() { // from class: androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt$InlineChildren$1$2
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo33measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list2, long j11) {
                        final ArrayList arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i15 = 0; i15 < size2; i15++) {
                            arrayList.add(list2.get(i15).mo3857measureBRTryo0(j11));
                        }
                        return MeasureScope.layout$default(measureScope, Constraints.m5068getMaxWidthimpl(j11), Constraints.m5067getMaxHeightimpl(j11), null, new x00.l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt$InlineChildren$1$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // x00.l
                            public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return g2.f100423a;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                List<Placeable> list3 = arrayList;
                                int size3 = list3.size();
                                for (int i16 = 0; i16 < size3; i16++) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, list3.get(i16), 0, 0, 0.0f, 4, null);
                                }
                            }
                        }, 4, null);
                    }
                };
                Modifier.Companion companion = Modifier.Companion;
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, i13);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                x00.a<ComposeUiNode> constructor = companion2.getConstructor();
                if (startRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m1951constructorimpl = Updater.m1951constructorimpl(startRestartGroup);
                int i15 = i13;
                Updater.m1958setimpl(m1951constructorimpl, annotatedStringResolveInlineContentKt$InlineChildren$1$2, companion2.getSetMeasurePolicy());
                Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
                component1.invoke(annotatedString.subSequence(component2, component3).getText(), startRestartGroup, Integer.valueOf(i15));
                startRestartGroup.endNode();
                i14++;
                i13 = i15;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt$InlineChildren$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i16) {
                    AnnotatedStringResolveInlineContentKt.InlineChildren(AnnotatedString.this, list, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    public static final boolean hasInlineContent(@k AnnotatedString annotatedString) {
        return annotatedString.hasStringAnnotations(InlineTextContentKt.INLINE_CONTENT_TAG, 0, annotatedString.getText().length());
    }

    @k
    public static final Pair<List<AnnotatedString.Range<Placeholder>>, List<AnnotatedString.Range<q<String, Composer, Integer, g2>>>> resolveInlineContent(@k AnnotatedString annotatedString, @l Map<String, InlineTextContent> map) {
        if (map == null || map.isEmpty()) {
            return EmptyInlineContent;
        }
        List<AnnotatedString.Range<String>> stringAnnotations = annotatedString.getStringAnnotations(InlineTextContentKt.INLINE_CONTENT_TAG, 0, annotatedString.getText().length());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = stringAnnotations.size();
        for (int i11 = 0; i11 < size; i11++) {
            AnnotatedString.Range<String> range = stringAnnotations.get(i11);
            InlineTextContent inlineTextContent = map.get(range.getItem());
            if (inlineTextContent != null) {
                arrayList.add(new AnnotatedString.Range(inlineTextContent.getPlaceholder(), range.getStart(), range.getEnd()));
                arrayList2.add(new AnnotatedString.Range(inlineTextContent.getChildren(), range.getStart(), range.getEnd()));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }
}
