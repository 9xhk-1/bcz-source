package com.baicizhan.main.home.plan.module.exam;

import com.baicizhan.client.business.util.BczJson;
import com.baicizhan.main.home.plan.module.exam.JsModel;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final String f22502a = "primary";

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final String f22503b = "secondary";

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final String f22504c = "toast";

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final String f22505d = "open";

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final String f22506e = "increase";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends bp.a<Rsp<JsModel.FinishAll>> {
    }

    public static final void a() {
        Object fromJson = BczJson.fromJson("{\n  \"state\": \"finished-all\",\n  \"data\": {\n    \"isToday\": true,\n    \"round\": 1,\n    \"progress\": {\n      \"totalWordsCount\": 3000,\n      \"remainDaysCount\": 56,\n      \"finishedWordsCount\": 2400\n    }\n  }\n}", new a().getType());
        g0.o(fromJson, "fromJson(...)");
        ((Rsp) fromJson).toString();
    }
}
