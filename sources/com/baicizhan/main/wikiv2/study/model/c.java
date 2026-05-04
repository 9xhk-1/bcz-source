package com.baicizhan.main.wikiv2.study.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.main.wikiv2.study.model.ExtendedWordInfo;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import u30.f0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class c extends e implements aj.a {

    /* renamed from: j, reason: collision with root package name */
    public static final int f25882j = 8;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TopicRecord f25883c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f25884d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f25885e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f25886f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f25887g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public List<? extends ExtendedWordInfo.WordDeform> f25888h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final MutableLiveData<Boolean> f25889i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@k TopicRecord zpk) {
        super(0);
        String z22;
        g0.p(zpk, "zpk");
        this.f25883c = zpk;
        String word = i().word;
        g0.o(word, "word");
        this.f25884d = word;
        String phonetic = i().phonetic;
        g0.o(phonetic, "phonetic");
        this.f25885e = phonetic;
        this.f25886f = i().wordAudio;
        String str = i().wordMean;
        this.f25887g = (str == null || (z22 = f0.z2(str, "；  ", "\n", false, 4, null)) == null) ? "" : z22;
        this.f25889i = new MutableLiveData<>();
    }

    @k
    public final String b() {
        return this.f25885e;
    }

    @k
    public final String c() {
        return this.f25887g;
    }

    @l
    public final List<ExtendedWordInfo.WordDeform> d() {
        return this.f25888h;
    }

    @k
    public final String e() {
        return this.f25884d;
    }

    public final void f(@l List<? extends ExtendedWordInfo.WordDeform> list) {
        this.f25888h = list;
    }

    @Override // aj.a
    @l
    public String g() {
        return this.f25886f;
    }

    @Override // aj.a
    @k
    public MutableLiveData<Boolean> h() {
        return this.f25889i;
    }

    @Override // aj.a
    @k
    public TopicRecord i() {
        return this.f25883c;
    }
}
