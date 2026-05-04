package androidx.compose.runtime.internal;

import androidx.collection.MutableIntList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class RememberEventDispatcherKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> void swap(List<T> list, int i11, int i12) {
        T t11 = list.get(i11);
        list.set(i11, list.get(i12));
        list.set(i12, t11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void swap(MutableIntList mutableIntList, int i11, int i12) {
        int i13 = mutableIntList.get(i11);
        mutableIntList.set(i11, mutableIntList.get(i12));
        mutableIntList.set(i12, i13);
    }
}
