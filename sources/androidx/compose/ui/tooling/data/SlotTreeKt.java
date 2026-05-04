package androidx.compose.ui.tooling.data;

import a00.h0;
import a00.i0;
import a00.m0;
import a00.r0;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.unit.IntRect;
import c10.d;
import com.baicizhan.client.business.widget.EmailAutoCompleteEditText;
import e00.g;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.text.Regex;
import kotlin.text.a;
import m80.k;
import m80.l;
import u30.f0;
import u30.o;
import w00.j;
import x00.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "SlotTreeKt")
@u0({"SMAP\nSlotTree.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTree.jvm.kt\nandroidx/compose/ui/tooling/data/SlotTreeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 8 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 9 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,822:1\n1#2:823\n1549#3:824\n1620#3,3:825\n2661#3,7:828\n288#3,2:852\n1045#3:857\n65#4:835\n69#4:838\n60#5:836\n70#5:839\n85#5:842\n90#5:844\n22#6:837\n22#6:840\n54#7:841\n59#7:843\n372#8,7:845\n3792#9:854\n4307#9,2:855\n1282#9,2:858\n*S KotlinDebug\n*F\n+ 1 SlotTree.jvm.kt\nandroidx/compose/ui/tooling/data/SlotTreeKt\n*L\n501#1:824\n501#1:825,3\n501#1:828,7\n747#1:852,2\n768#1:857\n539#1:835\n540#1:838\n539#1:836\n540#1:839\n541#1:842\n542#1:844\n539#1:837\n540#1:840\n541#1:841\n542#1:843\n701#1:845,7\n763#1:854\n763#1:855,2\n818#1:858,2\n*E\n"})
/* loaded from: classes2.dex */
public final class SlotTreeKt {
    private static final int BITS_PER_SLOT = 3;
    private static final int SLOT_MASK = 7;
    private static final int STABLE_BITS = 4;
    private static final int STATIC_BITS = 3;

    @k
    private static final String changedFieldName = "$$changed";

    @k
    private static final String defaultFieldName = "$$default";

    @k
    private static final String internalFieldPrefix = "$$";

    @k
    private static final String jacocoDataField = "$jacoco";

    @k
    private static final String parameterPrefix = "$";

    @k
    private static final String recomposeScopeNameSuffix = ".RecomposeScopeImpl";

    @k
    private static final IntRect emptyBox = new IntRect(0, 0, 0, 0);

    @k
    private static final Regex tokenizer = new Regex("(\\d+)|([,])|([*])|([:])|L|(P\\([^)]*\\))|(C(\\(([^)]*)\\))?)|@");

    @k
    private static final Regex parametersInformationTokenizer = new Regex("(\\d+)|,|[!P()]|:([^,!)]+)");

    private static final Field accessibleField(Class<?> cls, String str) {
        Field field;
        Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                field = null;
                break;
            }
            field = declaredFields[i11];
            if (g0.g(field.getName(), str)) {
                break;
            }
            i11++;
        }
        if (field == null) {
            return null;
        }
        field.setAccessible(true);
        return field;
    }

    @UiToolingDataApi
    @k
    public static final Group asTree(@k CompositionData compositionData) {
        Group group;
        CompositionGroup compositionGroup = (CompositionGroup) r0.J2(compositionData.getCompositionGroups());
        return (compositionGroup == null || (group = getGroup(compositionGroup, null)) == null) ? EmptyGroup.INSTANCE : group;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRect boundsOfLayoutNode(LayoutInfo layoutInfo) {
        LayoutCoordinates coordinates = layoutInfo.getCoordinates();
        if (!layoutInfo.isAttached() || !coordinates.isAttached()) {
            return new IntRect(0, 0, layoutInfo.getWidth(), layoutInfo.getHeight());
        }
        long positionInWindow = LayoutCoordinatesKt.positionInWindow(coordinates);
        long mo3865getSizeYbymL2g = coordinates.mo3865getSizeYbymL2g();
        int L0 = d.L0(Float.intBitsToFloat((int) (positionInWindow >> 32)));
        int L02 = d.L0(Float.intBitsToFloat((int) (positionInWindow & 4294967295L)));
        return new IntRect(L0, L02, ((int) (mo3865getSizeYbymL2g >> 32)) + L0, ((int) (mo3865getSizeYbymL2g & 4294967295L)) + L02);
    }

    private static final String callName(o oVar) {
        return oVar.b().get(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @UiToolingDataApi
    public static final List<ParameterInformation> extractParameterInfo(List<? extends Object> list, SourceInformationContext sourceInformationContext) {
        int i11;
        Object obj;
        Object obj2;
        int i12;
        int i13;
        List<Parameter> J;
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                i11 = 2;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (obj != null && f0.b2(obj.getClass().getName(), recomposeScopeNameSuffix, false, 2, null)) {
                    break;
                }
            }
            if (obj != null) {
                try {
                    Field accessibleField = accessibleField(obj.getClass(), "block");
                    if (accessibleField != null && (obj2 = accessibleField.get(obj)) != null) {
                        Class<?> cls = obj2.getClass();
                        Field accessibleField2 = accessibleField(cls, defaultFieldName);
                        Field accessibleField3 = accessibleField(cls, changedFieldName);
                        if (accessibleField2 != null) {
                            Object obj3 = accessibleField2.get(obj2);
                            g0.n(obj3, "null cannot be cast to non-null type kotlin.Int");
                            i12 = ((Integer) obj3).intValue();
                        } else {
                            i12 = 0;
                        }
                        if (accessibleField3 != null) {
                            Object obj4 = accessibleField3.get(obj2);
                            g0.n(obj4, "null cannot be cast to non-null type kotlin.Int");
                            i13 = ((Integer) obj4).intValue();
                        } else {
                            i13 = 0;
                        }
                        Field[] declaredFields = cls.getDeclaredFields();
                        ArrayList arrayList = new ArrayList();
                        for (Field field : declaredFields) {
                            if (f0.J2(field.getName(), parameterPrefix, false, 2, null) && !f0.J2(field.getName(), internalFieldPrefix, false, 2, null) && !f0.J2(field.getName(), jacocoDataField, false, 2, null)) {
                                arrayList.add(field);
                            }
                        }
                        List z52 = r0.z5(arrayList, new Comparator() { // from class: androidx.compose.ui.tooling.data.SlotTreeKt$extractParameterInfo$$inlined$sortedBy$1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.Comparator
                            public final int compare(T t11, T t12) {
                                return g.l(((Field) t11).getName(), ((Field) t12).getName());
                            }
                        });
                        ArrayList arrayList2 = new ArrayList();
                        if (sourceInformationContext == null || (J = sourceInformationContext.getParameters()) == null) {
                            J = h0.J();
                        }
                        int size = z52.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Parameter parameter = i14 < J.size() ? J.get(i14) : new Parameter(i14, null, i11, null);
                            if (parameter.getSortedIndex() < z52.size()) {
                                Field field2 = (Field) z52.get(parameter.getSortedIndex());
                                field2.setAccessible(true);
                                Object obj5 = field2.get(obj2);
                                boolean z11 = ((1 << i14) & i12) != 0;
                                int i15 = (i14 * 3) + 1;
                                int i16 = ((7 << i15) & i13) >> i15;
                                int i17 = i16 & 3;
                                boolean z12 = i17 == 3;
                                boolean z13 = i17 == 0;
                                boolean z14 = (i16 & 4) == 0;
                                String substring = field2.getName().substring(1);
                                g0.o(substring, "substring(...)");
                                arrayList2.add(new ParameterInformation(substring, obj5, z11, z12, z13 && !z11, parameter.getInlineClass(), z14));
                            }
                            i14++;
                            i11 = 2;
                        }
                        return arrayList2;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return h0.J();
    }

    @UiToolingDataApi
    @k
    public static final List<ParameterInformation> findParameters(@k CompositionGroup compositionGroup, @l ContextCache contextCache) {
        String sourceInfo = compositionGroup.getSourceInfo();
        if (sourceInfo == null) {
            return h0.J();
        }
        SourceInformationContext sourceInformationContext = null;
        if (contextCache == null) {
            sourceInformationContext = sourceInformationContextOf$default(sourceInfo, null, 2, null);
        } else {
            Map<String, Object> contexts$ui_tooling_data = contextCache.getContexts$ui_tooling_data();
            Object obj = contexts$ui_tooling_data.get(sourceInfo);
            if (obj == null) {
                obj = sourceInformationContextOf$default(sourceInfo, null, 2, null);
                contexts$ui_tooling_data.put(sourceInfo, obj);
            }
            if (obj instanceof SourceInformationContext) {
                sourceInformationContext = (SourceInformationContext) obj;
            }
        }
        ArrayList arrayList = new ArrayList();
        m0.s0(arrayList, compositionGroup.getData());
        return extractParameterInfo(arrayList, sourceInformationContext);
    }

    public static /* synthetic */ List findParameters$default(CompositionGroup compositionGroup, ContextCache contextCache, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            contextCache = null;
        }
        return findParameters(compositionGroup, contextCache);
    }

    @k
    public static final IntRect getEmptyBox() {
        return emptyBox;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.CharSequence] */
    @UiToolingDataApi
    private static final Group getGroup(CompositionGroup compositionGroup, SourceInformationContext sourceInformationContext) {
        SourceInformationContext sourceInformationContext2;
        SourceLocation sourceLocation;
        IntRect intRect;
        Object key = compositionGroup.getKey();
        String sourceInfo = compositionGroup.getSourceInfo();
        if (sourceInfo != null) {
            sourceInformationContext2 = sourceInformationContextOf(sourceInfo, sourceInformationContext);
            sourceLocation = null;
        } else {
            sourceInformationContext2 = null;
            sourceLocation = null;
        }
        Object node = compositionGroup.getNode();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m0.s0(arrayList, compositionGroup.getData());
        Iterator<CompositionGroup> it = compositionGroup.getCompositionGroups().iterator();
        while (it.hasNext()) {
            arrayList2.add(getGroup(it.next(), sourceInformationContext2));
        }
        boolean z11 = node instanceof LayoutInfo;
        List<ModifierInfo> modifierInfo = z11 ? ((LayoutInfo) node).getModifierInfo() : h0.J();
        if (z11) {
            intRect = boundsOfLayoutNode((LayoutInfo) node);
        } else if (arrayList2.isEmpty()) {
            intRect = emptyBox;
        } else {
            ArrayList arrayList3 = new ArrayList(i0.d0(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((Group) it2.next()).getBox());
            }
            Iterator it3 = arrayList3.iterator();
            if (!it3.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it3.next();
            while (it3.hasNext()) {
                next = union((IntRect) it3.next(), (IntRect) next);
            }
            intRect = (IntRect) next;
        }
        SourceLocation nextSourceLocation = (sourceInformationContext2 == null || !sourceInformationContext2.isCall() || sourceInformationContext == null) ? sourceLocation : sourceInformationContext.nextSourceLocation();
        if (node != null) {
            return new NodeGroup(key, node, intRect, arrayList, modifierInfo, arrayList2);
        }
        Object obj = sourceLocation;
        IntRect intRect2 = intRect;
        SourceInformationContext sourceInformationContext3 = sourceInformationContext2;
        Object name = sourceInformationContext3 != null ? sourceInformationContext3.getName() : obj;
        ?? name2 = sourceInformationContext3 != null ? sourceInformationContext3.getName() : obj;
        if (name2 != 0 && name2.length() != 0 && (intRect2.getBottom() - intRect2.getTop() > 0 || intRect2.getRight() - intRect2.getLeft() > 0)) {
            obj = compositionGroup.getIdentity();
        }
        List<ParameterInformation> extractParameterInfo = extractParameterInfo(arrayList, sourceInformationContext3);
        boolean z12 = false;
        if (sourceInformationContext3 != null && sourceInformationContext3.isInline()) {
            z12 = true;
        }
        return new CallGroup(key, name, intRect2, nextSourceLocation, obj, extractParameterInfo, arrayList, arrayList2, z12);
    }

    @l
    @UiToolingDataApi
    public static final String getPosition(@k Group group) {
        return keyPosition(group.getKey());
    }

    private static final String getText(o oVar) {
        return oVar.b().get(0);
    }

    private static final boolean isANumber(o oVar) {
        return oVar.c().get(1) != null;
    }

    private static final boolean isCallWithName(o oVar) {
        return oVar.c().get(6) != null;
    }

    private static final boolean isChar(o oVar, String str) {
        return g0.g(getText(oVar), str);
    }

    private static final boolean isClassName(o oVar) {
        return oVar.c().get(2) != null;
    }

    private static final boolean isFileName(o oVar) {
        return oVar.c().get(4) != null;
    }

    private static final boolean isNumber(o oVar) {
        return oVar.c().get(1) != null;
    }

    private static final boolean isParameterInformation(o oVar) {
        return oVar.c().get(5) != null;
    }

    @UiToolingDataApi
    private static final String keyPosition(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof JoinedKey)) {
            return null;
        }
        JoinedKey joinedKey = (JoinedKey) obj;
        String keyPosition = keyPosition(joinedKey.getLeft());
        return keyPosition == null ? keyPosition(joinedKey.getRight()) : keyPosition;
    }

    @l
    @UiToolingDataApi
    public static final <T> T mapTree(@k CompositionData compositionData, @k q<? super CompositionGroup, ? super SourceContext, ? super List<? extends T>, ? extends T> qVar, @k ContextCache contextCache) {
        CompositionGroup compositionGroup = (CompositionGroup) r0.J2(compositionData.getCompositionGroups());
        if (compositionGroup == null) {
            return null;
        }
        CompositionCallStack compositionCallStack = new CompositionCallStack(qVar, contextCache.getContexts$ui_tooling_data());
        ArrayList arrayList = new ArrayList();
        compositionCallStack.convert(compositionGroup, 0, arrayList);
        return (T) r0.L2(arrayList);
    }

    public static /* synthetic */ Object mapTree$default(CompositionData compositionData, q qVar, ContextCache contextCache, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            contextCache = new ContextCache();
        }
        return mapTree(compositionData, qVar, contextCache);
    }

    private static final int number(o oVar) {
        return parseToInt(oVar.b().get(1));
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [T, u30.o] */
    private static final List<Parameter> parseParameters(String str) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = Regex.find$default(parametersInformationTokenizer, str, 0, 2, null);
        List U = h0.U(0, 1, 2, 3);
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = U.size() - 1;
        ArrayList arrayList = new ArrayList();
        try {
            parseParameters$expect(objectRef, "P");
            parseParameters$expect(objectRef, pn.j.f81006c);
            while (!parseParameters$isChar(objectRef, pn.j.f81007d)) {
                if (parseParameters$isChar(objectRef, "!")) {
                    parseParameters$next(objectRef);
                    int parseParameters$expectNumber = parseParameters$expectNumber(objectRef);
                    parseParameters$ensureIndexes(intRef, U, arrayList.size() + parseParameters$expectNumber);
                    for (int i11 = 0; i11 < parseParameters$expectNumber; i11++) {
                        arrayList.add(new Parameter(((Number) r0.G2(U)).intValue(), null, 2, null));
                        U.remove(0);
                    }
                } else if (parseParameters$isChar(objectRef, ",")) {
                    parseParameters$next(objectRef);
                } else {
                    int parseParameters$expectNumber2 = parseParameters$expectNumber(objectRef);
                    arrayList.add(new Parameter(parseParameters$expectNumber2, parseParameters$isClassName(objectRef) ? parseParameters$expectClassName(objectRef) : null));
                    parseParameters$ensureIndexes(intRef, U, parseParameters$expectNumber2);
                    U.remove(Integer.valueOf(parseParameters$expectNumber2));
                }
            }
            parseParameters$expect(objectRef, pn.j.f81007d);
            while (U.size() > 0) {
                arrayList.add(new Parameter(((Number) r0.G2(U)).intValue(), null, 2, null));
                U.remove(0);
            }
            return arrayList;
        } catch (ParseError unused) {
            return h0.J();
        } catch (NumberFormatException unused2) {
            return h0.J();
        }
    }

    private static final void parseParameters$ensureIndexes(Ref.IntRef intRef, List<Integer> list, int i11) {
        int i12 = i11 - intRef.element;
        if (i12 > 0) {
            if (i12 < 4) {
                i12 = 4;
            }
            for (int i13 = 0; i13 < i12; i13++) {
                list.add(Integer.valueOf(intRef.element + i13 + 1));
            }
            intRef.element += i12;
        }
    }

    private static final void parseParameters$expect(Ref.ObjectRef<o> objectRef, String str) {
        o oVar = objectRef.element;
        if (oVar == null || !g0.g(getText(oVar), str)) {
            throw new ParseError();
        }
        parseParameters$next(objectRef);
    }

    private static final String parseParameters$expectClassName(Ref.ObjectRef<o> objectRef) {
        o oVar = objectRef.element;
        if (oVar == null || !isClassName(oVar)) {
            throw new ParseError();
        }
        parseParameters$next(objectRef);
        String substring = getText(oVar).substring(1);
        g0.o(substring, "substring(...)");
        return replacePrefix(substring, "c#", "androidx.compose.");
    }

    private static final int parseParameters$expectNumber(Ref.ObjectRef<o> objectRef) {
        o oVar = objectRef.element;
        if (oVar == null || !isANumber(oVar)) {
            throw new ParseError();
        }
        parseParameters$next(objectRef);
        return parseToInt(getText(oVar));
    }

    private static final boolean parseParameters$isChar(Ref.ObjectRef<o> objectRef, String str) {
        o oVar = objectRef.element;
        return oVar == null || g0.g(getText(oVar), str);
    }

    private static final boolean parseParameters$isClassName(Ref.ObjectRef<o> objectRef) {
        o oVar = objectRef.element;
        return oVar != null && isClassName(oVar);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, u30.o] */
    private static final o parseParameters$next(Ref.ObjectRef<o> objectRef) {
        o oVar = objectRef.element;
        if (oVar != null) {
            objectRef.element = oVar.next();
        }
        return objectRef.element;
    }

    private static final int parseToInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new ParseError();
        }
    }

    private static final String replacePrefix(String str, String str2, String str3) {
        if (!f0.J2(str, str2, false, 2, null)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        String substring = str.substring(str2.length());
        g0.o(substring, "substring(...)");
        sb2.append(substring);
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e3  */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, u30.o] */
    @androidx.compose.ui.tooling.data.UiToolingDataApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final androidx.compose.ui.tooling.data.SourceInformationContext sourceInformationContextOf(java.lang.String r14, androidx.compose.ui.tooling.data.SourceInformationContext r15) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.tooling.data.SlotTreeKt.sourceInformationContextOf(java.lang.String, androidx.compose.ui.tooling.data.SourceInformationContext):androidx.compose.ui.tooling.data.SourceInformationContext");
    }

    public static /* synthetic */ SourceInformationContext sourceInformationContextOf$default(String str, SourceInformationContext sourceInformationContext, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            sourceInformationContext = null;
        }
        return sourceInformationContextOf(str, sourceInformationContext);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, u30.o] */
    private static final o sourceInformationContextOf$next$4(Ref.ObjectRef<o> objectRef) {
        o oVar = objectRef.element;
        if (oVar != null) {
            objectRef.element = oVar.next();
        }
        return objectRef.element;
    }

    private static final SourceLocationInfo sourceInformationContextOf$parseLocation(Ref.ObjectRef<o> objectRef) {
        Integer num;
        Integer num2;
        Integer num3;
        try {
            o oVar = objectRef.element;
            if (oVar == null || !isNumber(oVar)) {
                num = null;
            } else {
                num = Integer.valueOf(number(oVar) + 1);
                oVar = sourceInformationContextOf$next$4(objectRef);
            }
            if (oVar != null && isChar(oVar, EmailAutoCompleteEditText.f17091d)) {
                o sourceInformationContextOf$next$4 = sourceInformationContextOf$next$4(objectRef);
                if (sourceInformationContextOf$next$4 != null && isNumber(sourceInformationContextOf$next$4)) {
                    num3 = Integer.valueOf(number(sourceInformationContextOf$next$4));
                    o sourceInformationContextOf$next$42 = sourceInformationContextOf$next$4(objectRef);
                    if (sourceInformationContextOf$next$42 != null && isChar(sourceInformationContextOf$next$42, "L")) {
                        o sourceInformationContextOf$next$43 = sourceInformationContextOf$next$4(objectRef);
                        if (sourceInformationContextOf$next$43 != null && isNumber(sourceInformationContextOf$next$43)) {
                            num2 = Integer.valueOf(number(sourceInformationContextOf$next$43));
                        }
                        return null;
                    }
                    num2 = null;
                }
                return null;
            }
            num2 = null;
            num3 = null;
            if (num != null && num3 != null && num2 != null) {
                return new SourceLocationInfo(num, num3, num2);
            }
        } catch (ParseError unused) {
        }
        return null;
    }

    @k
    public static final IntRect union(@k IntRect intRect, @k IntRect intRect2) {
        IntRect intRect3 = emptyBox;
        if (g0.g(intRect, intRect3)) {
            return intRect2;
        }
        if (g0.g(intRect2, intRect3)) {
            return intRect;
        }
        return new IntRect(Math.min(intRect.getLeft(), intRect2.getLeft()), Math.min(intRect.getTop(), intRect2.getTop()), Math.max(intRect.getRight(), intRect2.getRight()), Math.max(intRect.getBottom(), intRect2.getBottom()));
    }

    private static final int parseToInt(String str, int i11) {
        try {
            return Integer.parseInt(str, a.a(i11));
        } catch (NumberFormatException unused) {
            throw new ParseError();
        }
    }

    @UiToolingDataApi
    public static /* synthetic */ void getPosition$annotations(Group group) {
    }
}
