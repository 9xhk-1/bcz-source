package com.baicizhan.main.home.plan;

import com.baicizhan.online.user_study_api.TrainPageResources;
import com.baicizhan.online.user_study_api.UserStudyApiService;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class d {
    @m80.k
    public static final rx.c<TrainPageResources> c() {
        rx.c a11 = com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/user_study"));
        final x00.l lVar = new x00.l() { // from class: com.baicizhan.main.home.plan.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                TrainPageResources d11;
                d11 = d.d((UserStudyApiService.Client) obj);
                return d11;
            }
        };
        rx.c<TrainPageResources> c32 = a11.c3(new wb0.p() { // from class: com.baicizhan.main.home.plan.c
            @Override // wb0.p
            public final Object call(Object obj) {
                TrainPageResources e11;
                e11 = d.e(x00.l.this, obj);
                return e11;
            }
        });
        kotlin.jvm.internal.g0.o(c32, "map(...)");
        return c32;
    }

    public static final TrainPageResources d(UserStudyApiService.Client client) {
        return client.get_train_page_resource();
    }

    public static final TrainPageResources e(x00.l lVar, Object obj) {
        return (TrainPageResources) lVar.invoke(obj);
    }
}
