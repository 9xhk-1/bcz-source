package qg;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.dataset.models.TopicLearnRecord;
import com.baicizhan.client.business.webview.sdk.LearnHelper;
import com.baicizhan.main.home.plan.module.exam.JsModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Pair;
import kotlinx.coroutines.channels.BufferOverflow;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nExamStateRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExamStateRepo.kt\ncom/baicizhan/main/home/plan/module/exam/ExamStateRepoImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n1563#2:64\n1634#2,3:65\n*S KotlinDebug\n*F\n+ 1 ExamStateRepo.kt\ncom/baicizhan/main/home/plan/module/exam/ExamStateRepoImpl\n*L\n52#1:64\n52#1:65,3\n*E\n"})
/* loaded from: classes4.dex */
public final class n0 implements m0 {

    /* renamed from: g, reason: collision with root package name */
    public static final int f82137g = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.main.home.plan.module.exam.a f82138a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final nc.a f82139b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final kotlinx.coroutines.flow.x<Pair<JsModel, String>> f82140c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f82141d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final kotlinx.coroutines.flow.i<Pair<JsModel, String>> f82142e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public Pair<? extends JsModel, String> f82143f;

    @Inject
    public n0(@m80.k com.baicizhan.main.home.plan.module.exam.a bridge, @q9.y @m80.k nc.a mem) {
        kotlin.jvm.internal.g0.p(bridge, "bridge");
        kotlin.jvm.internal.g0.p(mem, "mem");
        this.f82138a = bridge;
        this.f82139b = mem;
        kotlinx.coroutines.flow.x<Pair<JsModel, String>> a11 = kotlinx.coroutines.flow.e0.a(0, 1, BufferOverflow.DROP_OLDEST);
        this.f82140c = a11;
        this.f82141d = "kv_exam_js_param";
        this.f82142e = kotlinx.coroutines.flow.k.v0(a11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qg.m0
    public void a() {
        this.f82140c.d(this.f82143f);
    }

    @Override // qg.m0
    public void b(@m80.l String str) {
        this.f82139b.p(this.f82141d, str);
        qb.c.i(p0.f82148a, "setParam " + str, new Object[0]);
    }

    @Override // qg.m0
    public void c(@m80.k List<? extends TopicLearnRecord> record, long j11, @m80.k List<Integer> roadMap, int i11, int i12, int i13, @m80.l String str, @m80.k com.baicizhan.main.activity.schedule_v2.mutimode.data.e mode) {
        kotlin.jvm.internal.g0.p(record, "record");
        kotlin.jvm.internal.g0.p(roadMap, "roadMap");
        kotlin.jvm.internal.g0.p(mode, "mode");
        com.baicizhan.main.home.plan.module.exam.a aVar = this.f82138a;
        List<? extends TopicLearnRecord> list = record;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(LearnHelper.RecordRsp.fromLocalRecords((TopicLearnRecord) it.next()));
        }
        Pair<JsModel, String> c11 = aVar.c(arrayList, roadMap, i11, i12, i13, str, mode.a());
        this.f82140c.d(c11);
        this.f82143f = c11;
    }

    @Override // qg.m0
    @m80.l
    public JsModel d() {
        Pair<? extends JsModel, String> pair = this.f82143f;
        if (pair != null) {
            return pair.getFirst();
        }
        return null;
    }

    @m80.k
    public final nc.a e() {
        return this.f82139b;
    }

    @Override // qg.m0
    @m80.l
    public String getConfig() {
        return this.f82139b.getString(this.f82141d, null);
    }

    @Override // qg.m0
    @m80.k
    public kotlinx.coroutines.flow.i<Pair<JsModel, String>> getState() {
        return this.f82142e;
    }

    @Override // qg.m0
    public long getVersion() {
        return this.f82138a.b();
    }
}
