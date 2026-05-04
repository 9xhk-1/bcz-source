package androidx.room.util;

import a00.r0;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import u30.y;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class FtsTableInfoKt {
    public static final boolean equalsCommon(@k FtsTableInfo ftsTableInfo, @l Object obj) {
        g0.p(ftsTableInfo, "<this>");
        if (ftsTableInfo == obj) {
            return true;
        }
        if (!(obj instanceof FtsTableInfo)) {
            return false;
        }
        FtsTableInfo ftsTableInfo2 = (FtsTableInfo) obj;
        if (g0.g(ftsTableInfo.name, ftsTableInfo2.name) && g0.g(ftsTableInfo.columns, ftsTableInfo2.columns)) {
            return g0.g(ftsTableInfo.options, ftsTableInfo2.options);
        }
        return false;
    }

    public static final int hashCodeCommon(@k FtsTableInfo ftsTableInfo) {
        g0.p(ftsTableInfo, "<this>");
        return (((ftsTableInfo.name.hashCode() * 31) + ftsTableInfo.columns.hashCode()) * 31) + ftsTableInfo.options.hashCode();
    }

    @k
    public static final String toStringCommon(@k FtsTableInfo ftsTableInfo) {
        g0.p(ftsTableInfo, "<this>");
        return y.x("\n            |FtsTableInfo {\n            |   name = '" + ftsTableInfo.name + "',\n            |   columns = {" + TableInfoKt.formatString(r0.v5(ftsTableInfo.columns)) + "\n            |   options = {" + TableInfoKt.formatString(r0.v5(ftsTableInfo.options)) + "\n            |}\n        ", null, 1, null);
    }
}
