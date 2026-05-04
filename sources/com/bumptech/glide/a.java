package com.bumptech.glide;

import android.content.Context;
import androidx.annotation.NonNull;
import com.baicizhan.client.business.util.GlideRequests;
import yk.p;
import yk.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class a implements p.b {
    @Override // yk.p.b
    @NonNull
    public k a(@NonNull c glide, @NonNull yk.j lifecycle, @NonNull q treeNode, @NonNull Context context) {
        return new GlideRequests(glide, lifecycle, treeNode, context);
    }
}
