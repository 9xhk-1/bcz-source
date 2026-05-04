package com.baicizhan.main.activity.schedule_v2.mutimode.data;

import a00.r0;
import java.util.List;
import kotlin.jvm.internal.g0;
import q30.k0;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class d {
    public static final ModeDetail c(com.baicizhan.online.user_study_api.ModeDetail modeDetail) {
        e a11 = e.f19301b.a(modeDetail.f28166id);
        String name = modeDetail.name;
        g0.o(name, "name");
        String iconUrl = modeDetail.iconUrl;
        g0.o(iconUrl, "iconUrl");
        String shorDesc = modeDetail.shorDesc;
        g0.o(shorDesc, "shorDesc");
        List<com.baicizhan.online.user_study_api.ModeDesc> desc = modeDetail.desc;
        g0.o(desc, "desc");
        return new ModeDetail(a11, name, iconUrl, shorDesc, k0.I3(k0.N1(r0.E1(desc), new l() { // from class: com.baicizhan.main.activity.schedule_v2.mutimode.data.c
            @Override // x00.l
            public final Object invoke(Object obj) {
                ModeDesc d11;
                d11 = d.d((com.baicizhan.online.user_study_api.ModeDesc) obj);
                return d11;
            }
        })));
    }

    public static final ModeDesc d(com.baicizhan.online.user_study_api.ModeDesc modeDesc) {
        g0.m(modeDesc);
        return e(modeDesc);
    }

    public static final ModeDesc e(com.baicizhan.online.user_study_api.ModeDesc modeDesc) {
        ContentType a11 = ContentType.Companion.a(modeDesc.type);
        String content = modeDesc.content;
        g0.o(content, "content");
        return new ModeDesc(a11, content);
    }
}
