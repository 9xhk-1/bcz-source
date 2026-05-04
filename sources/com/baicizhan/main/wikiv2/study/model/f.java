package com.baicizhan.main.wikiv2.study.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.jiongji.andriod.card.R;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class f extends e {

    /* renamed from: e, reason: collision with root package name */
    public static final int f25895e = 8;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TopicRecord f25896c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f25897d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@k TopicRecord zpk) {
        super(R.string.wiki_item_title_pictogram);
        g0.p(zpk, "zpk");
        this.f25896c = zpk;
        String deformationImagePath = zpk.deformationImagePath;
        g0.o(deformationImagePath, "deformationImagePath");
        this.f25897d = deformationImagePath;
    }

    @k
    public final String b() {
        return this.f25897d;
    }

    @k
    public final TopicRecord i() {
        return this.f25896c;
    }
}
