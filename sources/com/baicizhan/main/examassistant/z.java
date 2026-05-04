package com.baicizhan.main.examassistant;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import com.baicizhan.main.examassistant.data.MarkedWord;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class z implements PreviewParameterProvider<MarkedWord> {

    /* renamed from: b, reason: collision with root package name */
    public static final int f20715b = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final q30.m<MarkedWord> f20716a;

    /* JADX WARN: Multi-variable type inference failed */
    public z() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ int getCount() {
        return super.getCount();
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    @m80.k
    public q30.m<MarkedWord> getValues() {
        return this.f20716a;
    }

    public z(@m80.k q30.m<MarkedWord> values) {
        kotlin.jvm.internal.g0.p(values, "values");
        this.f20716a = values;
    }

    public /* synthetic */ z(q30.m mVar, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? q30.x.l() : mVar);
    }
}
