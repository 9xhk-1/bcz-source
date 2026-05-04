package com.baicizhan.main.home.plan.module.exam;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.util.BczJson;
import com.baicizhan.client.business.webview.sdk.LearnHelper;
import com.baicizhan.main.home.plan.module.exam.JsModel;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ScriptableObject;
import qg.g;
import qg.w0;
import r60.e;
import u30.e0;
import u30.f0;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nExamJsBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExamJsBridge.kt\ncom/baicizhan/main/home/plan/module/exam/ExamJsBridge\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1#2:65\n*E\n"})
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final int f22499c = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ScriptableObject f22500a;

    /* renamed from: b, reason: collision with root package name */
    public long f22501b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.main.home.plan.module.exam.a$a, reason: collision with other inner class name */
    public static final class C0311a extends bp.a<Rsp<JsModel.FinishAll>> {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends bp.a<Rsp<JsModel.Learning>> {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends bp.a<Rsp<JsModel.AllRemoved>> {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends bp.a<Rsp<JsModel.Reviewing>> {
    }

    public a(@k ScriptableObject scope) {
        g0.p(scope, "scope");
        this.f22500a = scope;
    }

    public final Context a() {
        Context enter = Context.enter();
        enter.setOptimizationLevel(-1);
        return enter;
    }

    public final long b() {
        return this.f22501b;
    }

    @k
    public final synchronized Pair<JsModel, String> c(@k List<? extends LearnHelper.RecordRsp> records, @k List<Integer> roadMap, int i11, int i12, int i13, @l String str, int i14) {
        Rsp rsp;
        Pair<JsModel, String> pair;
        String str2 = str;
        synchronized (this) {
            try {
                g0.p(records, "records");
                g0.p(roadMap, "roadMap");
                Context a11 = a();
                qb.c.i(g.f82119a, "homeState START " + records.size() + " " + roadMap.size() + " " + i11 + " " + i12 + " " + i13 + " " + str2, new Object[0]);
                ScriptableObject scriptableObject = this.f22500a;
                String json = BczJson.toJson(records);
                g0.o(json, "toJson(...)");
                String json2 = BczJson.toJson(roadMap);
                g0.o(json2, "toJson(...)");
                if (str2 == null) {
                    str2 = "{}";
                }
                Object evaluateString = a11.evaluateString(scriptableObject, e(json, json2, i11, i12, i13, str2, i14), "", 0, null);
                g0.n(evaluateString, "null cannot be cast to non-null type kotlin.String");
                String str3 = (String) evaluateString;
                qb.c.i(g.f82119a, str3, new Object[0]);
                w0 w0Var = w0.f82170a;
                if (k0.n3(str3, w0Var.a(), false, 2, null)) {
                    rsp = (Rsp) BczJson.fromJson(str3, new C0311a().getType());
                } else if (k0.n3(str3, w0Var.c(), false, 2, null)) {
                    rsp = (Rsp) BczJson.fromJson(str3, new b().getType());
                } else if (k0.n3(str3, w0Var.b(), false, 2, null)) {
                    rsp = (Rsp) BczJson.fromJson(str3, new c().getType());
                } else {
                    if (!k0.n3(str3, w0Var.d(), false, 2, null)) {
                        throw new RuntimeException("nothing match");
                    }
                    rsp = (Rsp) BczJson.fromJson(str3, new d().getType());
                }
                g0.n(rsp, "null cannot be cast to non-null type com.baicizhan.main.home.plan.module.exam.Rsp<*>");
                pair = new Pair<>(rsp.getData(), str3);
                qb.c.i(g.f82119a, "homeState End", new Object[0]);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pair;
    }

    public final synchronized void d(@k String jsCode) {
        try {
            g0.p(jsCode, "jsCode");
            Long r12 = e0.r1(f0.z2(k0.e4(jsCode).get(0), e.f83301a, "", false, 4, null));
            long longValue = r12 != null ? r12.longValue() : 0L;
            this.f22501b = longValue;
            qb.c.i(g.f82119a, "init bridge version " + longValue, new Object[0]);
            a().evaluateString(this.f22500a, jsCode, null, 0, null);
            qb.c.i(g.f82119a, "init bridge end", new Object[0]);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final String e(String str, String str2, int i11, int i12, int i13, String str3, int i14) {
        return "BczBridge.getHomeStateData({\"records\":" + str + ",\"road\":" + str2 + ",\"learnPlanCount\":" + i11 + ",\"reviewPlanCount\":" + i12 + ",\"increasedCount\":" + i13 + ", \"settingOptions\":" + str3 + ", \"mode\":" + i14 + "})";
    }
}
