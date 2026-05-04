package androidx.compose.ui.text;

import a00.l1;
import a00.r0;
import a00.v1;
import androidx.compose.ui.text.AnnotatedString;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import x00.q;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nJvmAnnotatedString.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmAnnotatedString.jvm.kt\nandroidx/compose/ui/text/JvmAnnotatedString_jvmKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,63:1\n150#2,3:64\n34#2,6:67\n153#2:73\n269#2,3:74\n34#2,6:77\n272#2:83\n*S KotlinDebug\n*F\n+ 1 JvmAnnotatedString.jvm.kt\nandroidx/compose/ui/text/JvmAnnotatedString_jvmKt\n*L\n44#1:64,3\n44#1:67,6\n44#1:73\n56#1:74,3\n56#1:77,6\n56#1:83\n*E\n"})
/* loaded from: classes2.dex */
public final class JvmAnnotatedString_jvmKt {
    private static final void collectRangeTransitions(List<? extends AnnotatedString.Range<?>> list, SortedSet<Integer> sortedSet) {
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                AnnotatedString.Range<?> range = list.get(i11);
                sortedSet.add(Integer.valueOf(range.getStart()));
                sortedSet.add(Integer.valueOf(range.getEnd()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public static final AnnotatedString transform(@k final AnnotatedString annotatedString, @k final q<? super String, ? super Integer, ? super Integer, String> qVar) {
        ArrayList arrayList;
        TreeSet h11 = v1.h(0, Integer.valueOf(annotatedString.getText().length()));
        collectRangeTransitions(annotatedString.getAnnotations$ui_text_release(), h11);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        final Map j02 = l1.j0(h1.a(0, 0));
        r0.l6(h11, 2, 0, false, new l<List<? extends Integer>, Integer>() { // from class: androidx.compose.ui.text.JvmAnnotatedString_jvmKt$transform$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.String] */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Integer invoke2(List<Integer> list) {
                int intValue = list.get(0).intValue();
                int intValue2 = list.get(1).intValue();
                objectRef.element = objectRef.element + qVar.invoke(annotatedString.getText(), Integer.valueOf(intValue), Integer.valueOf(intValue2));
                return j02.put(Integer.valueOf(intValue2), Integer.valueOf(objectRef.element.length()));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Integer invoke(List<? extends Integer> list) {
                return invoke2((List<Integer>) list);
            }
        }, 6, null);
        List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> annotations$ui_text_release = annotatedString.getAnnotations$ui_text_release();
        if (annotations$ui_text_release != null) {
            arrayList = new ArrayList(annotations$ui_text_release.size());
            int size = annotations$ui_text_release.size();
            for (int i11 = 0; i11 < size; i11++) {
                AnnotatedString.Range<? extends AnnotatedString.Annotation> range = annotations$ui_text_release.get(i11);
                AnnotatedString.Annotation item = range.getItem();
                Object obj = j02.get(Integer.valueOf(range.getStart()));
                g0.m(obj);
                int intValue = ((Number) obj).intValue();
                Object obj2 = j02.get(Integer.valueOf(range.getEnd()));
                g0.m(obj2);
                arrayList.add(new AnnotatedString.Range(item, intValue, ((Number) obj2).intValue()));
            }
        } else {
            arrayList = null;
        }
        return new AnnotatedString(arrayList, (String) objectRef.element);
    }
}
