package com.baicizhan.main.home.player;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import com.baicizhan.main.home.player.t6;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class r6 implements PreviewParameterProvider<s6> {

    /* renamed from: b, reason: collision with root package name */
    public static final int f23958b = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final q30.m<s6> f23959a;

    /* JADX WARN: Multi-variable type inference failed */
    public r6() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ int getCount() {
        return super.getCount();
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    @m80.k
    public q30.m<s6> getValues() {
        return this.f23959a;
    }

    public r6(@m80.k q30.m<s6> values) {
        kotlin.jvm.internal.g0.p(values, "values");
        this.f23959a = values;
    }

    public /* synthetic */ r6(q30.m mVar, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? q30.x.C(new s6("词书", R.drawable.bg_home_layer_button_book, null, 4, null), new s6("词书", R.drawable.bg_home_layer_button_review, new t6.b("99999天")), new s6("词书", R.drawable.bg_home_layer_button_book, new t6.a(R.drawable.ic_home_layer_entry_clock, "999天"))) : mVar);
    }
}
