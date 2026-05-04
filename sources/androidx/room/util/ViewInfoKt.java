package androidx.room.util;

import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import u30.y;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class ViewInfoKt {
    public static final boolean equalsCommon(@k ViewInfo viewInfo, @l Object obj) {
        g0.p(viewInfo, "<this>");
        if (viewInfo == obj) {
            return true;
        }
        if (!(obj instanceof ViewInfo)) {
            return false;
        }
        ViewInfo viewInfo2 = (ViewInfo) obj;
        if (g0.g(viewInfo.name, viewInfo2.name)) {
            String str = viewInfo.sql;
            if (str != null ? g0.g(str, viewInfo2.sql) : viewInfo2.sql == null) {
                return true;
            }
        }
        return false;
    }

    public static final int hashCodeCommon(@k ViewInfo viewInfo) {
        g0.p(viewInfo, "<this>");
        int hashCode = viewInfo.name.hashCode() * 31;
        String str = viewInfo.sql;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @k
    public static final String toStringCommon(@k ViewInfo viewInfo) {
        g0.p(viewInfo, "<this>");
        return y.x("\n            |ViewInfo {\n            |   name = '" + viewInfo.name + "',\n            |   sql = '" + viewInfo.sql + "'\n            |}\n        ", null, 1, null);
    }
}
