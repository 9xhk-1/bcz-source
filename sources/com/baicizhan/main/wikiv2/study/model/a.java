package com.baicizhan.main.wikiv2.study.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.jiongji.andriod.card.R;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class a extends e {

    /* renamed from: e, reason: collision with root package name */
    public static final int f25876e = 0;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f25877c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f25878d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@k String enMean, @k String word) {
        super(R.string.wiki_item_title_enmean);
        g0.p(enMean, "enMean");
        g0.p(word, "word");
        this.f25877c = enMean;
        this.f25878d = word;
    }

    @k
    public final String b() {
        return this.f25877c;
    }

    @k
    public final String c() {
        return this.f25878d;
    }
}
