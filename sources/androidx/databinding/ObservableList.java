package androidx.databinding;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface ObservableList<T> extends List<T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class OnListChangedCallback<T extends ObservableList> {
        public abstract void onChanged(T sender);

        public abstract void onItemRangeChanged(T sender, int positionStart, int itemCount);

        public abstract void onItemRangeInserted(T sender, int positionStart, int itemCount);

        public abstract void onItemRangeMoved(T sender, int fromPosition, int toPosition, int itemCount);

        public abstract void onItemRangeRemoved(T sender, int positionStart, int itemCount);
    }

    void addOnListChangedCallback(OnListChangedCallback<? extends ObservableList<T>> callback);

    void removeOnListChangedCallback(OnListChangedCallback<? extends ObservableList<T>> callback);
}
