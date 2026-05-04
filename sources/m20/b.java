package m20;

import a00.h0;
import a00.r0;
import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g0;
import m80.k;
import o00.o;
import u30.f0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f71795a = new b();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final String f71796b = r0.r3(h0.Q('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, null, 62, null);

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final Map<String, String> f71797c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List Q = h0.Q("Boolean", "Z", "Char", "C", "Byte", "B", "Short", ExifInterface.LATITUDE_SOUTH, "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int c11 = o.c(0, Q.size() - 1, 2);
        if (c11 >= 0) {
            int i11 = 0;
            while (true) {
                StringBuilder sb2 = new StringBuilder();
                String str = f71796b;
                sb2.append(str);
                sb2.append('/');
                sb2.append((String) Q.get(i11));
                int i12 = i11 + 1;
                linkedHashMap.put(sb2.toString(), Q.get(i12));
                linkedHashMap.put(str + '/' + ((String) Q.get(i11)) + "Array", '[' + ((String) Q.get(i12)));
                if (i11 == c11) {
                    break;
                } else {
                    i11 += 2;
                }
            }
        }
        linkedHashMap.put(f71796b + "/Unit", ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : h0.Q("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : h0.Q("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(linkedHashMap, "collections/" + str3, "java/util/" + str3);
            a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i13 = 0; i13 < 23; i13++) {
            StringBuilder sb3 = new StringBuilder();
            String str4 = f71796b;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i13);
            a(linkedHashMap, "Function" + i13, sb3.toString());
            a(linkedHashMap, "reflect/KFunction" + i13, str4 + "/reflect/KFunction");
        }
        for (String str5 : h0.Q("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(linkedHashMap, str5 + ".Companion", f71796b + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f71797c = linkedHashMap;
    }

    public static final void a(Map<String, String> map, String str, String str2) {
        map.put(f71796b + '/' + str, 'L' + str2 + l70.f.f70689d);
    }

    @w00.o
    @k
    public static final String b(@k String classId) {
        g0.p(classId, "classId");
        String str = f71797c.get(classId);
        if (str != null) {
            return str;
        }
        return 'L' + f0.y2(classId, '.', '$', false, 4, null) + l70.f.f70689d;
    }
}
