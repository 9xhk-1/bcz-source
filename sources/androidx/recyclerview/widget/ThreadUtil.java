package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.TileList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
interface ThreadUtil<T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface BackgroundCallback<T> {
        void loadTile(int i11, int i12);

        @SuppressLint({"UnknownNullness"})
        void recycleTile(TileList.Tile<T> tile);

        void refresh(int i11);

        void updateRange(int i11, int i12, int i13, int i14, int i15);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface MainThreadCallback<T> {
        @SuppressLint({"UnknownNullness"})
        void addTile(int i11, TileList.Tile<T> tile);

        void removeTile(int i11, int i12);

        void updateItemCount(int i11, int i12);
    }

    BackgroundCallback<T> getBackgroundProxy(BackgroundCallback<T> backgroundCallback);

    MainThreadCallback<T> getMainThreadProxy(MainThreadCallback<T> mainThreadCallback);
}
