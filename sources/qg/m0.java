package qg;

import com.baicizhan.client.business.dataset.models.TopicLearnRecord;
import com.baicizhan.main.home.plan.module.exam.JsModel;
import java.util.List;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public interface m0 {
    void a();

    void b(@m80.l String str);

    void c(@m80.k List<? extends TopicLearnRecord> list, long j11, @m80.k List<Integer> list2, int i11, int i12, int i13, @m80.l String str, @m80.k com.baicizhan.main.activity.schedule_v2.mutimode.data.e eVar);

    @m80.l
    JsModel d();

    @m80.l
    String getConfig();

    @m80.k
    kotlinx.coroutines.flow.i<Pair<JsModel, String>> getState();

    long getVersion();
}
