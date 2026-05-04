package com.baicizhan.main.wikiv2.study.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.jiongji.andriod.card.R;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class g extends e {

    /* renamed from: d, reason: collision with root package name */
    public static final int f25898d = 0;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f25899c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@k String root) {
        super(R.string.wiki_item_title_root);
        g0.p(root, "root");
        this.f25899c = root;
    }

    @k
    public final String b() {
        return this.f25899c;
    }
}
