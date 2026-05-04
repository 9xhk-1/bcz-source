package com.baicizhan.main.wikiv2.study.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.jiongji.andriod.card.R;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class d extends e implements aj.a {

    /* renamed from: e, reason: collision with root package name */
    public static final int f25890e = 8;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TopicRecord f25891c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final MutableLiveData<Boolean> f25892d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@k TopicRecord zpk) {
        super(R.string.wiki_item_title_sentence);
        g0.p(zpk, "zpk");
        this.f25891c = zpk;
        this.f25892d = new MutableLiveData<>();
    }

    @l
    public final String b() {
        return i().imagePath;
    }

    @l
    public final String c() {
        return i().sentenceTrans;
    }

    @l
    public final String d() {
        return i().sentence;
    }

    @l
    public final String e() {
        return i().sentencePhrase;
    }

    @l
    public final String f() {
        return i().sentenceTrans;
    }

    @Override // aj.a
    @l
    public String g() {
        return i().sentenceAudio;
    }

    @Override // aj.a
    @k
    public MutableLiveData<Boolean> h() {
        return this.f25892d;
    }

    @Override // aj.a
    @k
    public TopicRecord i() {
        return this.f25891c;
    }

    @l
    public final String j() {
        return i().word;
    }
}
