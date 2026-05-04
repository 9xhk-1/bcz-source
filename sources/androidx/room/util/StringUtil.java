package androidx.room.util;

import a00.r0;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import u30.k0;
import w00.g;
import w00.j;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "StringUtil")
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@u0({"SMAP\nStringUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringUtil.kt\nandroidx/room/util/StringUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,83:1\n1611#2,9:84\n1863#2:93\n1864#2:95\n1620#2:96\n1#3:94\n*S KotlinDebug\n*F\n+ 1 StringUtil.kt\nandroidx/room/util/StringUtil\n*L\n64#1:84,9\n64#1:93\n64#1:95\n64#1:96\n64#1:94\n*E\n"})
/* loaded from: classes3.dex */
public final class StringUtil {

    @g
    @k
    public static final String[] EMPTY_STRING_ARRAY = new String[0];

    public static final void appendPlaceholders(@k StringBuilder builder, int i11) {
        g0.p(builder, "builder");
        for (int i12 = 0; i12 < i11; i12++) {
            builder.append("?");
            if (i12 < i11 - 1) {
                builder.append(",");
            }
        }
    }

    @l
    public static final String joinIntoString(@l List<Integer> list) {
        if (list != null) {
            return r0.r3(list, ",", null, null, 0, null, null, 62, null);
        }
        return null;
    }

    @n(message = "No longer used by generated code")
    @k
    public static final StringBuilder newStringBuilder() {
        return new StringBuilder();
    }

    @l
    public static final List<Integer> splitToIntList(@l String str) {
        List n52;
        Integer num;
        if (str == null || (n52 = k0.n5(str, new char[]{','}, false, 0, 6, null)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = n52.iterator();
        while (it.hasNext()) {
            try {
                num = Integer.valueOf(Integer.parseInt((String) it.next()));
            } catch (NumberFormatException unused) {
                num = null;
            }
            if (num != null) {
                arrayList.add(num);
            }
        }
        return arrayList;
    }

    @n(message = "No longer used by generated code")
    public static /* synthetic */ void getEMPTY_STRING_ARRAY$annotations() {
    }
}
