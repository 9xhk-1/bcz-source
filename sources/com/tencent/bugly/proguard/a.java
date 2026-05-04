package com.tencent.bugly.proguard;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a {
    public static String a(ArrayList<String> arrayList) {
        StringBuffer stringBuffer = new StringBuffer();
        int i11 = 0;
        while (true) {
            String str = "map";
            if (i11 >= arrayList.size()) {
                Collections.reverse(arrayList);
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    String str2 = arrayList.get(i12);
                    if (str2.equals("list")) {
                        int i13 = i12 - 1;
                        arrayList.set(i13, "<" + arrayList.get(i13));
                        arrayList.set(0, arrayList.get(0) + ">");
                    } else if (str2.equals("map")) {
                        int i14 = i12 - 1;
                        arrayList.set(i14, "<" + arrayList.get(i14) + ",");
                        arrayList.set(0, arrayList.get(0) + ">");
                    } else if (str2.equals("Array")) {
                        int i15 = i12 - 1;
                        arrayList.set(i15, "<" + arrayList.get(i15));
                        arrayList.set(0, arrayList.get(0) + ">");
                    }
                }
                Collections.reverse(arrayList);
                Iterator<String> it = arrayList.iterator();
                while (it.hasNext()) {
                    stringBuffer.append(it.next());
                }
                return stringBuffer.toString();
            }
            String str3 = arrayList.get(i11);
            if (str3.equals("java.lang.Integer") || str3.equals("int")) {
                str = "int32";
            } else if (str3.equals("java.lang.Boolean") || str3.equals(TypedValues.Custom.S_BOOLEAN)) {
                str = "bool";
            } else if (str3.equals("java.lang.Byte") || str3.equals("byte")) {
                str = "char";
            } else {
                String str4 = "double";
                if (!str3.equals("java.lang.Double") && !str3.equals("double")) {
                    boolean equals = str3.equals("java.lang.Float");
                    str4 = TypedValues.Custom.S_FLOAT;
                    if (!equals && !str3.equals(TypedValues.Custom.S_FLOAT)) {
                        if (str3.equals("java.lang.Long") || str3.equals("long")) {
                            str = "int64";
                        } else {
                            str4 = "short";
                            if (!str3.equals("java.lang.Short") && !str3.equals("short")) {
                                if (str3.equals("java.lang.Character")) {
                                    throw new IllegalArgumentException("can not support java.lang.Character");
                                }
                                if (str3.equals("java.lang.String")) {
                                    str = TypedValues.Custom.S_STRING;
                                } else if (str3.equals("java.util.List")) {
                                    str = "list";
                                } else if (!str3.equals("java.util.Map")) {
                                    str = str3;
                                }
                            }
                        }
                    }
                }
                str = str4;
            }
            arrayList.set(i11, str);
            i11++;
        }
    }
}
