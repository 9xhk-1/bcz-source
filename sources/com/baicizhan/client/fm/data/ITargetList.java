package com.baicizhan.client.fm.data;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public interface ITargetList<E> {
    void clear();

    void extractOfflines();

    E get(int index);

    String getLocalPath(int index);

    String getPath(int index, boolean high);

    String getSavedPath(int index, boolean high);

    boolean isEmpty();

    int size();
}
