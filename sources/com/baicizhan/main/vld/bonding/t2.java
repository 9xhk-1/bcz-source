package com.baicizhan.main.vld.bonding;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class t2 implements PreviewParameterProvider<s2> {

    /* renamed from: b, reason: collision with root package name */
    public static final int f25488b = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final q30.m<s2> f25489a;

    /* JADX WARN: Multi-variable type inference failed */
    public t2() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ int getCount() {
        return super.getCount();
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    @m80.k
    public q30.m<s2> getValues() {
        return this.f25489a;
    }

    public t2(@m80.k q30.m<s2> values) {
        kotlin.jvm.internal.g0.p(values, "values");
        this.f25489a = values;
    }

    public /* synthetic */ t2(q30.m mVar, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? q30.x.C(new s2("设备开机，打开手机蓝牙、网络", "确保单词机开机，手机蓝牙、网络打开"), new s2("设备开机，打开手机蓝牙、网络设备开机，打开手机蓝牙、网络", "确保单词机开机，手机蓝牙、网络打开"), new s2("设备开机，打开手机蓝牙、网络", "确保单词机开机，手机蓝牙、网络打开确保单词机开机，手机蓝牙、网络打开"), new s2("设备开机，打开手机蓝牙、网络设备开机，打开手机蓝牙、网络", "确保单词机开机，手机蓝牙、网络打开确保单词机开机，手机蓝牙、网络打开")) : mVar);
    }
}
