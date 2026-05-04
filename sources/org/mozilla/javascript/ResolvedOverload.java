package org.mozilla.javascript;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class ResolvedOverload {
    final int index;
    final Class<?>[] types;

    public ResolvedOverload(Object[] objArr, int i11) {
        this.index = i11;
        this.types = new Class[objArr.length];
        int length = objArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            Object obj = objArr[i12];
            obj = obj instanceof Wrapper ? ((Wrapper) obj).unwrap() : obj;
            this.types[i12] = obj == null ? null : obj.getClass();
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ResolvedOverload)) {
            return false;
        }
        ResolvedOverload resolvedOverload = (ResolvedOverload) obj;
        return Arrays.equals(this.types, resolvedOverload.types) && this.index == resolvedOverload.index;
    }

    public int hashCode() {
        return Arrays.hashCode(this.types);
    }

    public boolean matches(Object[] objArr) {
        if (objArr.length != this.types.length) {
            return false;
        }
        int length = objArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            Object obj = objArr[i11];
            if (obj instanceof Wrapper) {
                obj = ((Wrapper) obj).unwrap();
            }
            if (obj == null) {
                if (this.types[i11] != null) {
                    return false;
                }
            } else if (obj.getClass() != this.types[i11]) {
                return false;
            }
        }
        return true;
    }
}
