package com.baicizhan.main.word_book.list;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes5.dex */
public final class d2 {

    /* renamed from: h, reason: collision with root package name */
    public static final int f27060h = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final MeaningType f27061a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27062b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f27063c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final x00.a<yz.g2> f27064d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final x00.l<MeaningType, yz.g2> f27065e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final x00.a<yz.g2> f27066f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final x00.a<yz.g2> f27067g;

    /* JADX WARN: Multi-variable type inference failed */
    public d2(@m80.k MeaningType selectedType, boolean z11, boolean z12, @m80.k x00.a<yz.g2> onSelectorClick, @m80.k x00.l<? super MeaningType, yz.g2> onSelect, @m80.k x00.a<yz.g2> onDismissPopup, @m80.k x00.a<yz.g2> onDismissGuide) {
        kotlin.jvm.internal.g0.p(selectedType, "selectedType");
        kotlin.jvm.internal.g0.p(onSelectorClick, "onSelectorClick");
        kotlin.jvm.internal.g0.p(onSelect, "onSelect");
        kotlin.jvm.internal.g0.p(onDismissPopup, "onDismissPopup");
        kotlin.jvm.internal.g0.p(onDismissGuide, "onDismissGuide");
        this.f27061a = selectedType;
        this.f27062b = z11;
        this.f27063c = z12;
        this.f27064d = onSelectorClick;
        this.f27065e = onSelect;
        this.f27066f = onDismissPopup;
        this.f27067g = onDismissGuide;
    }

    @m80.k
    public final x00.a<yz.g2> a() {
        return this.f27067g;
    }

    @m80.k
    public final x00.a<yz.g2> b() {
        return this.f27066f;
    }

    @m80.k
    public final x00.l<MeaningType, yz.g2> c() {
        return this.f27065e;
    }

    @m80.k
    public final x00.a<yz.g2> d() {
        return this.f27064d;
    }

    @m80.k
    public final MeaningType e() {
        return this.f27061a;
    }

    public final boolean f() {
        return this.f27062b;
    }

    public final boolean g() {
        return this.f27063c;
    }
}
