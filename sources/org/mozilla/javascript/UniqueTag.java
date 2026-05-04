package org.mozilla.javascript;

import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class UniqueTag implements Serializable {
    private static final int ID_DOUBLE_MARK = 3;
    private static final int ID_NOT_FOUND = 1;
    private static final int ID_NULL_VALUE = 2;
    static final long serialVersionUID = -4320556826714577259L;
    private final int tagId;
    public static final UniqueTag NOT_FOUND = new UniqueTag(1);
    public static final UniqueTag NULL_VALUE = new UniqueTag(2);
    public static final UniqueTag DOUBLE_MARK = new UniqueTag(3);

    private UniqueTag(int i11) {
        this.tagId = i11;
    }

    public Object readResolve() {
        int i11 = this.tagId;
        if (i11 == 1) {
            return NOT_FOUND;
        }
        if (i11 == 2) {
            return NULL_VALUE;
        }
        if (i11 == 3) {
            return DOUBLE_MARK;
        }
        throw new IllegalStateException(String.valueOf(this.tagId));
    }

    public String toString() {
        String str;
        int i11 = this.tagId;
        if (i11 == 1) {
            str = "NOT_FOUND";
        } else if (i11 == 2) {
            str = "NULL_VALUE";
        } else {
            if (i11 != 3) {
                throw Kit.codeBug();
            }
            str = "DOUBLE_MARK";
        }
        return super.toString() + ": " + str;
    }
}
