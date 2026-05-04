package com.ogaclejapan.smarttablayout.utils;

import android.content.Context;
import gt.b;
import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class PagerItems<T extends b> extends ArrayList<T> {
    private final Context context;

    public PagerItems(Context context) {
        this.context = context;
    }

    public Context getContext() {
        return this.context;
    }
}
