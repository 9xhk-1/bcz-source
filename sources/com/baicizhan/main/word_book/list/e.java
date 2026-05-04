package com.baicizhan.main.word_book.list;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class e implements PreviewParameterProvider<d> {

    /* renamed from: b, reason: collision with root package name */
    public static final int f27077b = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final q30.m<d> f27078a;

    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ int getCount() {
        return super.getCount();
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    @m80.k
    public q30.m<d> getValues() {
        return this.f27078a;
    }

    public e(@m80.k q30.m<d> values) {
        kotlin.jvm.internal.g0.p(values, "values");
        this.f27078a = values;
    }

    public /* synthetic */ e(q30.m mVar, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? q30.x.C(new d(ij.c.f60622a, "", 34, false, true, null, null, null, 224, null), new d("5月单词冲刺", "", 34, false, false, null, null, null, R.styleable.Theme_drawable_walk_sound4, null), new d("老师布置的作业", "", 34, false, false, null, null, null, R.styleable.Theme_drawable_walk_sound4, null), new d("老师布置的作业老师布置的作业老师布置的作业作业老师布置的作业", "", 34, false, false, null, null, null, R.styleable.Theme_drawable_walk_sound4, null)) : mVar);
    }
}
