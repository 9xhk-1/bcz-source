package com.baicizhan.main.word_book.list;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class k9 implements PreviewParameterProvider<Pair<? extends MutableState<TextFieldValue>, ? extends Integer>> {

    /* renamed from: b, reason: collision with root package name */
    public static final int f27263b = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final q30.m<Pair<MutableState<TextFieldValue>, Integer>> f27264a;

    /* JADX WARN: Multi-variable type inference failed */
    public k9() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ int getCount() {
        return super.getCount();
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    @m80.k
    public q30.m<Pair<? extends MutableState<TextFieldValue>, ? extends Integer>> getValues() {
        return this.f27264a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k9(@m80.k q30.m<? extends Pair<? extends MutableState<TextFieldValue>, Integer>> values) {
        kotlin.jvm.internal.g0.p(values, "values");
        this.f27264a = values;
    }

    public /* synthetic */ k9(q30.m mVar, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? q30.x.C(new Pair(SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue("sour，ethereal，infuential，important，love，same，exchange", 0L, (TextRange) null, 6, (kotlin.jvm.internal.v) null), null, 2, null), 490), new Pair(SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue("", 0L, (TextRange) null, 6, (kotlin.jvm.internal.v) null), null, 2, null), 490), new Pair(SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue("", 0L, (TextRange) null, 6, (kotlin.jvm.internal.v) null), null, 2, null), 0)) : mVar);
    }
}
