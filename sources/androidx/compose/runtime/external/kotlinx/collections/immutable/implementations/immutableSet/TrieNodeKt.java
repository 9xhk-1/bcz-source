package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import a00.q;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class TrieNodeKt {
    public static final int LOG_MAX_BRANCHING_FACTOR = 5;
    public static final int MAX_BRANCHING_FACTOR = 32;
    public static final int MAX_BRANCHING_FACTOR_MINUS_ONE = 31;
    public static final int MAX_SHIFT = 30;

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> Object[] addElementAtIndex(Object[] objArr, int i11, E e11) {
        Object[] objArr2 = new Object[objArr.length + 1];
        q.K0(objArr, objArr2, 0, 0, i11, 6, null);
        q.B0(objArr, objArr2, i11 + 1, i11, objArr.length);
        objArr2[i11] = e11;
        return objArr2;
    }

    private static final int filterTo(Object[] objArr, Object[] objArr2, int i11, l<Object, Boolean> lVar) {
        int i12 = 0;
        int i13 = 0;
        while (i12 < objArr.length) {
            CommonFunctionsKt.m2064assert(i13 <= i12);
            if (lVar.invoke(objArr[i12]).booleanValue()) {
                objArr2[i11 + i13] = objArr[i12];
                i13++;
                CommonFunctionsKt.m2064assert(i11 + i13 <= objArr2.length);
            }
            i12++;
        }
        return i13;
    }

    public static /* synthetic */ int filterTo$default(Object[] objArr, Object[] objArr2, int i11, l lVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            lVar = new l<Object, Boolean>() { // from class: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt$filterTo$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.l
                public final Boolean invoke(Object obj2) {
                    return Boolean.valueOf(obj2 != TrieNode.Companion.getEMPTY$runtime_release());
                }
            };
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < objArr.length) {
            CommonFunctionsKt.m2064assert(i14 <= i13);
            if (((Boolean) lVar.invoke(objArr[i13])).booleanValue()) {
                objArr2[i11 + i14] = objArr[i13];
                i14++;
                CommonFunctionsKt.m2064assert(i11 + i14 <= objArr2.length);
            }
            i13++;
        }
        return i14;
    }

    public static final int indexSegment(int i11, int i12) {
        return (i11 >> i12) & 31;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] removeCellAtIndex(Object[] objArr, int i11) {
        Object[] objArr2 = new Object[objArr.length - 1];
        q.K0(objArr, objArr2, 0, 0, i11, 6, null);
        q.B0(objArr, objArr2, i11, i11 + 1, objArr.length);
        return objArr2;
    }
}
