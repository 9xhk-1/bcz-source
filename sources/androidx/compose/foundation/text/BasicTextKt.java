package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.SelectionController;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBasicText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/BasicTextKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,701:1\n75#2:702\n75#2:703\n75#2:716\n75#2:717\n75#2:747\n75#2:748\n75#2:761\n75#2:797\n1247#3,6:704\n1247#3,6:710\n1247#3,6:749\n1247#3,6:755\n1247#3,6:791\n1247#3,6:798\n1247#3,6:815\n1247#3,6:821\n1247#3,6:827\n1247#3,6:833\n1247#3,6:839\n1247#3,6:845\n1247#3,6:851\n1247#3,6:857\n1247#3,6:863\n121#4,6:718\n128#4,4:733\n132#4:743\n134#4:746\n121#4,6:762\n128#4,4:777\n132#4:787\n134#4:790\n79#4,6:869\n86#4,3:884\n89#4,2:893\n93#4:898\n272#5,9:724\n281#5,2:744\n272#5,9:768\n281#5,2:788\n347#5,9:875\n356#5,3:895\n4206#6,6:737\n4206#6,6:781\n4206#6,6:887\n303#7,3:804\n70#7,4:807\n75#7:813\n306#7:814\n1#8:811\n1#8:812\n85#9:899\n113#9,2:900\n*S KotlinDebug\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/BasicTextKt\n*L\n104#1:702\n107#1:703\n128#1:716\n141#1:717\n197#1:747\n200#1:748\n225#1:761\n251#1:797\n109#1:704,6\n112#1:710,6\n202#1:749,6\n205#1:755,6\n238#1:791,6\n254#1:798,6\n635#1:815,6\n642#1:821,6\n644#1:827,6\n655#1:833,6\n660#1:839,6\n672#1:845,6\n691#1:851,6\n695#1:857,6\n696#1:863,6\n149#1:718,6\n149#1:733,4\n149#1:743\n149#1:746\n215#1:762,6\n215#1:777,4\n215#1:787\n215#1:790\n663#1:869,6\n663#1:884,3\n663#1:893,2\n663#1:898\n149#1:724,9\n149#1:744,2\n215#1:768,9\n215#1:788,2\n663#1:875,9\n663#1:895,3\n149#1:737,6\n215#1:781,6\n663#1:887,6\n537#1:804,3\n537#1:807,4\n537#1:813\n537#1:814\n537#1:812\n238#1:899\n238#1:900,2\n*E\n"})
/* loaded from: classes.dex */
public final class BasicTextKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0082  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @yz.n(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: BasicText-4YKlhWE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m1029BasicText4YKlhWE(final androidx.compose.ui.text.AnnotatedString r27, androidx.compose.ui.Modifier r28, androidx.compose.ui.text.TextStyle r29, x00.l r30, int r31, boolean r32, int r33, java.util.Map r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m1029BasicText4YKlhWE(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, x00.l, int, boolean, int, java.util.Map, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x004a  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @yz.n(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: BasicText-BpD7jsM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m1031BasicTextBpD7jsM(final java.lang.String r23, androidx.compose.ui.Modifier r24, androidx.compose.ui.text.TextStyle r25, x00.l r26, int r27, boolean r28, int r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m1031BasicTextBpD7jsM(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, x00.l, int, boolean, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x021e, code lost:
    
        if (r1 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L174;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017d  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: BasicText-CL7eQgs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1032BasicTextCL7eQgs(@m80.k androidx.compose.ui.text.AnnotatedString r37, @m80.l androidx.compose.ui.Modifier r38, @m80.l androidx.compose.ui.text.TextStyle r39, @m80.l x00.l<? super androidx.compose.ui.text.TextLayoutResult, yz.g2> r40, int r41, boolean r42, int r43, int r44, @m80.l java.util.Map<java.lang.String, androidx.compose.foundation.text.InlineTextContent> r45, @m80.l androidx.compose.ui.graphics.ColorProducer r46, @m80.l androidx.compose.foundation.text.TextAutoSize r47, @m80.l androidx.compose.runtime.Composer r48, final int r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 1094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m1032BasicTextCL7eQgs(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, x00.l, int, boolean, int, int, java.util.Map, androidx.compose.ui.graphics.ColorProducer, androidx.compose.foundation.text.TextAutoSize, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: BasicText-RWo7tUw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1034BasicTextRWo7tUw(@m80.k java.lang.String r38, @m80.l androidx.compose.ui.Modifier r39, @m80.l androidx.compose.ui.text.TextStyle r40, @m80.l x00.l<? super androidx.compose.ui.text.TextLayoutResult, yz.g2> r41, int r42, boolean r43, int r44, int r45, @m80.l androidx.compose.ui.graphics.ColorProducer r46, @m80.l androidx.compose.foundation.text.TextAutoSize r47, @m80.l androidx.compose.runtime.Composer r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 895
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m1034BasicTextRWo7tUw(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, x00.l, int, boolean, int, int, androidx.compose.ui.graphics.ColorProducer, androidx.compose.foundation.text.TextAutoSize, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00bb  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @yz.n(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: BasicText-VhcvRP8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m1036BasicTextVhcvRP8(final java.lang.String r26, androidx.compose.ui.Modifier r27, androidx.compose.ui.text.TextStyle r28, x00.l r29, int r30, boolean r31, int r32, int r33, androidx.compose.ui.graphics.ColorProducer r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m1036BasicTextVhcvRP8(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, x00.l, int, boolean, int, int, androidx.compose.ui.graphics.ColorProducer, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final AnnotatedString BasicText_CL7eQgs$lambda$5(MutableState<AnnotatedString> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ea  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: LayoutWithLinksAndInlineContent-11Od_4g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1037LayoutWithLinksAndInlineContent11Od_4g(final androidx.compose.ui.Modifier r29, androidx.compose.ui.text.AnnotatedString r30, final x00.l<? super androidx.compose.ui.text.TextLayoutResult, yz.g2> r31, final boolean r32, java.util.Map<java.lang.String, androidx.compose.foundation.text.InlineTextContent> r33, final androidx.compose.ui.text.TextStyle r34, final int r35, final boolean r36, final int r37, final int r38, final androidx.compose.ui.text.font.FontFamily.Resolver r39, final androidx.compose.foundation.text.modifiers.SelectionController r40, final androidx.compose.ui.graphics.ColorProducer r41, final x00.l<? super androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.TextSubstitutionValue, yz.g2> r42, final androidx.compose.foundation.text.TextAutoSize r43, androidx.compose.runtime.Composer r44, final int r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 1231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m1037LayoutWithLinksAndInlineContent11Od_4g(androidx.compose.ui.Modifier, androidx.compose.ui.text.AnnotatedString, x00.l, boolean, java.util.Map, androidx.compose.ui.text.TextStyle, int, boolean, int, int, androidx.compose.ui.text.font.FontFamily$Resolver, androidx.compose.foundation.text.modifiers.SelectionController, androidx.compose.ui.graphics.ColorProducer, x00.l, androidx.compose.foundation.text.TextAutoSize, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Pair<Placeable, x00.a<IntOffset>>> measureWithTextRangeMeasureConstraints(List<? extends Measurable> list, x00.a<Boolean> aVar) {
        if (!aVar.invoke().booleanValue()) {
            return null;
        }
        TextRangeLayoutMeasureScope textRangeLayoutMeasureScope = new TextRangeLayoutMeasureScope();
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Measurable measurable = list.get(i11);
            Object parentData = measurable.getParentData();
            g0.n(parentData, "null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier");
            TextRangeLayoutMeasureResult measure = ((TextRangeLayoutModifier) parentData).getMeasurePolicy().measure(textRangeLayoutMeasureScope);
            arrayList.add(new Pair(measurable.mo3857measureBRTryo0(Constraints.Companion.m5077fitPrioritizingWidthZbe2FdA(measure.getWidth(), measure.getWidth(), measure.getHeight(), measure.getHeight())), measure.getPlace()));
        }
        return arrayList;
    }

    private static final Saver<Long, Long> selectionIdSaver(final SelectionRegistrar selectionRegistrar) {
        return SaverKt.Saver(new p<SaverScope, Long, Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$selectionIdSaver$1
            {
                super(2);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ Long invoke(SaverScope saverScope, Long l11) {
                return invoke(saverScope, l11.longValue());
            }

            public final Long invoke(SaverScope saverScope, long j11) {
                if (SelectionRegistrarKt.hasSelection(SelectionRegistrar.this, j11)) {
                    return Long.valueOf(j11);
                }
                return null;
            }
        }, new l<Long, Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$selectionIdSaver$2
            @Override // x00.l
            public /* bridge */ /* synthetic */ Long invoke(Long l11) {
                return invoke(l11.longValue());
            }

            public final Long invoke(long j11) {
                return Long.valueOf(j11);
            }
        });
    }

    /* renamed from: textModifier-CL7eQgs, reason: not valid java name */
    private static final Modifier m1039textModifierCL7eQgs(Modifier modifier, AnnotatedString annotatedString, TextStyle textStyle, l<? super TextLayoutResult, g2> lVar, int i11, boolean z11, int i12, int i13, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, l<? super List<Rect>, g2> lVar2, SelectionController selectionController, ColorProducer colorProducer, l<? super TextAnnotatedStringNode.TextSubstitutionValue, g2> lVar3, TextAutoSize textAutoSize) {
        if (selectionController == null) {
            return modifier.then(Modifier.Companion).then(new TextAnnotatedStringElement(annotatedString, textStyle, resolver, lVar, i11, z11, i12, i13, list, lVar2, null, colorProducer, textAutoSize, lVar3, null));
        }
        return modifier.then(selectionController.getModifier()).then(new SelectableTextAnnotatedStringElement(annotatedString, textStyle, resolver, lVar, i11, z11, i12, i13, list, lVar2, selectionController, colorProducer, textAutoSize, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0082  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @yz.n(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compat")
    /* renamed from: BasicText-4YKlhWE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m1030BasicText4YKlhWE(final java.lang.String r25, androidx.compose.ui.Modifier r26, androidx.compose.ui.text.TextStyle r27, x00.l r28, int r29, boolean r30, int r31, int r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m1030BasicText4YKlhWE(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, x00.l, int, boolean, int, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00bb  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @yz.n(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compat")
    /* renamed from: BasicText-VhcvRP8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m1035BasicTextVhcvRP8(final androidx.compose.ui.text.AnnotatedString r28, androidx.compose.ui.Modifier r29, androidx.compose.ui.text.TextStyle r30, x00.l r31, int r32, boolean r33, int r34, int r35, java.util.Map r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m1035BasicTextVhcvRP8(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, x00.l, int, boolean, int, int, java.util.Map, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00fd  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @yz.n(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: BasicText-RWo7tUw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m1033BasicTextRWo7tUw(final androidx.compose.ui.text.AnnotatedString r29, androidx.compose.ui.Modifier r30, androidx.compose.ui.text.TextStyle r31, x00.l r32, int r33, boolean r34, int r35, int r36, java.util.Map r37, androidx.compose.ui.graphics.ColorProducer r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m1033BasicTextRWo7tUw(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, x00.l, int, boolean, int, int, java.util.Map, androidx.compose.ui.graphics.ColorProducer, androidx.compose.runtime.Composer, int, int):void");
    }
}
