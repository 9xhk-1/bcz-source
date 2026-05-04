package androidx.databinding;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import androidx.databinding.CallbackRegistry;
import androidx.databinding.ObservableList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class ListChangeRegistry extends CallbackRegistry<ObservableList.OnListChangedCallback, ObservableList, ListChanges> {
    private static final int ALL = 0;
    private static final int CHANGED = 1;
    private static final int INSERTED = 2;
    private static final int MOVED = 3;
    private static final int REMOVED = 4;
    private static final Pools.SynchronizedPool<ListChanges> sListChanges = new Pools.SynchronizedPool<>(10);
    private static final CallbackRegistry.NotifierCallback<ObservableList.OnListChangedCallback, ObservableList, ListChanges> NOTIFIER_CALLBACK = new CallbackRegistry.NotifierCallback<ObservableList.OnListChangedCallback, ObservableList, ListChanges>() { // from class: androidx.databinding.ListChangeRegistry.1
        @Override // androidx.databinding.CallbackRegistry.NotifierCallback
        public void onNotifyCallback(ObservableList.OnListChangedCallback onListChangedCallback, ObservableList observableList, int i11, ListChanges listChanges) {
            if (i11 == 1) {
                onListChangedCallback.onItemRangeChanged(observableList, listChanges.start, listChanges.count);
                return;
            }
            if (i11 == 2) {
                onListChangedCallback.onItemRangeInserted(observableList, listChanges.start, listChanges.count);
                return;
            }
            if (i11 == 3) {
                onListChangedCallback.onItemRangeMoved(observableList, listChanges.start, listChanges.f4360to, listChanges.count);
            } else if (i11 != 4) {
                onListChangedCallback.onChanged(observableList);
            } else {
                onListChangedCallback.onItemRangeRemoved(observableList, listChanges.start, listChanges.count);
            }
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ListChanges {
        public int count;
        public int start;

        /* renamed from: to, reason: collision with root package name */
        public int f4360to;
    }

    public ListChangeRegistry() {
        super(NOTIFIER_CALLBACK);
    }

    private static ListChanges acquire(int i11, int i12, int i13) {
        ListChanges acquire = sListChanges.acquire();
        if (acquire == null) {
            acquire = new ListChanges();
        }
        acquire.start = i11;
        acquire.f4360to = i12;
        acquire.count = i13;
        return acquire;
    }

    public void notifyChanged(@NonNull ObservableList observableList) {
        notifyCallbacks(observableList, 0, (ListChanges) null);
    }

    public void notifyInserted(@NonNull ObservableList observableList, int i11, int i12) {
        notifyCallbacks(observableList, 2, acquire(i11, 0, i12));
    }

    public void notifyMoved(@NonNull ObservableList observableList, int i11, int i12, int i13) {
        notifyCallbacks(observableList, 3, acquire(i11, i12, i13));
    }

    public void notifyRemoved(@NonNull ObservableList observableList, int i11, int i12) {
        notifyCallbacks(observableList, 4, acquire(i11, 0, i12));
    }

    @Override // androidx.databinding.CallbackRegistry
    public synchronized void notifyCallbacks(@NonNull ObservableList observableList, int i11, ListChanges listChanges) {
        super.notifyCallbacks((ListChangeRegistry) observableList, i11, (int) listChanges);
        if (listChanges != null) {
            sListChanges.release(listChanges);
        }
    }

    public void notifyChanged(@NonNull ObservableList observableList, int i11, int i12) {
        notifyCallbacks(observableList, 1, acquire(i11, 0, i12));
    }
}
