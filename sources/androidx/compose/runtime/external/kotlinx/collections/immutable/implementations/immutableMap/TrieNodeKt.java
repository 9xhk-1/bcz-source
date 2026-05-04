package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import a00.q;
import java.util.Arrays;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class TrieNodeKt {
    public static final int ENTRY_SIZE = 2;
    public static final int LOG_MAX_BRANCHING_FACTOR = 5;
    public static final int MAX_BRANCHING_FACTOR = 32;
    public static final int MAX_BRANCHING_FACTOR_MINUS_ONE = 31;
    public static final int MAX_SHIFT = 30;

    public static final int indexSegment(int i11, int i12) {
        return (i11 >> i12) & 31;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> Object[] insertEntryAtIndex(Object[] objArr, int i11, K k11, V v11) {
        Object[] objArr2 = new Object[objArr.length + 2];
        q.K0(objArr, objArr2, 0, 0, i11, 6, null);
        q.B0(objArr, objArr2, i11 + 2, i11, objArr.length);
        objArr2[i11] = k11;
        objArr2[i11 + 1] = v11;
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] removeEntryAtIndex(Object[] objArr, int i11) {
        Object[] objArr2 = new Object[objArr.length - 2];
        q.K0(objArr, objArr2, 0, 0, i11, 6, null);
        q.B0(objArr, objArr2, i11, i11 + 2, objArr.length);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] removeNodeAtIndex(Object[] objArr, int i11) {
        Object[] objArr2 = new Object[objArr.length - 1];
        q.K0(objArr, objArr2, 0, 0, i11, 6, null);
        q.B0(objArr, objArr2, i11, i11 + 1, objArr.length);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] replaceEntryWithNode(Object[] objArr, int i11, int i12, TrieNode<?, ?> trieNode) {
        Object[] objArr2 = new Object[objArr.length - 1];
        q.K0(objArr, objArr2, 0, 0, i11, 6, null);
        q.B0(objArr, objArr2, i11, i11 + 2, i12);
        objArr2[i12 - 2] = trieNode;
        q.B0(objArr, objArr2, i12 - 1, i12, objArr.length);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> Object[] replaceNodeWithEntry(Object[] objArr, int i11, int i12, K k11, V v11) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
        g0.o(copyOf, "copyOf(...)");
        q.B0(copyOf, copyOf, i11 + 2, i11 + 1, objArr.length);
        q.B0(copyOf, copyOf, i12 + 2, i12, i11);
        copyOf[i12] = k11;
        copyOf[i12 + 1] = v11;
        return copyOf;
    }
}
