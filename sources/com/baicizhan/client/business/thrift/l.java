package com.baicizhan.client.business.thrift;

import android.app.Application;
import android.text.TextUtils;
import com.baicizhan.online.advertise_api.AdvertiseApiService;
import com.baicizhan.online.bcz_report_api.BczReportApiService;
import com.baicizhan.online.bcz_system_api.BczSystemApiService;
import com.baicizhan.online.bs_fights.BSFights;
import com.baicizhan.online.bs_socials.BSSocials;
import com.baicizhan.online.bs_stats.ConanService;
import com.baicizhan.online.bs_studys.BSStudys;
import com.baicizhan.online.bs_users.BSUsers;
import com.baicizhan.online.bs_words.BSWords;
import com.baicizhan.online.course_api.CourseApiService;
import com.baicizhan.online.game_api.GameApiService;
import com.baicizhan.online.hero_api.HeroApi;
import com.baicizhan.online.notify.NotifyService;
import com.baicizhan.online.pk_api.PkApiService;
import com.baicizhan.online.resource_api.ResourceService;
import com.baicizhan.online.unified_user_service.UnifiedUserService;
import com.baicizhan.online.user_activity_api.UserActivityApiService;
import com.baicizhan.online.user_assistant_api.UserAssistantApiService;
import com.baicizhan.online.user_book.UserBookService;
import com.baicizhan.online.user_study_api.UserStudyApiService;
import java.util.HashMap;
import java.util.Map;
import org.apache.thrift.TServiceClientFactory;
import org.apache.thrift.protocol.TCompactProtocol;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class l<T> {

    /* renamed from: i, reason: collision with root package name */
    public static final Map<String, Class<? extends TServiceClientFactory>> f16650i;

    /* renamed from: a, reason: collision with root package name */
    public String f16651a;

    /* renamed from: b, reason: collision with root package name */
    public String[] f16652b;

    /* renamed from: e, reason: collision with root package name */
    public String f16655e;

    /* renamed from: c, reason: collision with root package name */
    public int f16653c = 2;

    /* renamed from: d, reason: collision with root package name */
    public i f16654d = null;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16656f = true;

    /* renamed from: g, reason: collision with root package name */
    public int f16657g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f16658h = -1;

    static {
        HashMap hashMap = new HashMap();
        f16650i = hashMap;
        hashMap.put("/rpc/users", BSUsers.Client.Factory.class);
        hashMap.put("/rpc/words", BSWords.Client.Factory.class);
        hashMap.put("/rpc/fights", BSFights.Client.Factory.class);
        hashMap.put("/rpc/studys", BSStudys.Client.Factory.class);
        hashMap.put("/rpc/socials", BSSocials.Client.Factory.class);
        hashMap.put("/rpc/stats", ConanService.Client.Factory.class);
        hashMap.put("/rpc/notify", NotifyService.Client.Factory.class);
        hashMap.put("/rpc/unified_user_service", UnifiedUserService.Client.Factory.class);
        hashMap.put("/rpc/user_study", UserStudyApiService.Client.Factory.class);
        hashMap.put("/rpc/assistant", UserAssistantApiService.Client.Factory.class);
        hashMap.put("/rpc/bcz_system", BczSystemApiService.Client.Factory.class);
        hashMap.put("/rpc/advertise", AdvertiseApiService.Client.Factory.class);
        hashMap.put("/rpc/resource_api", ResourceService.Client.Factory.class);
        hashMap.put("/rpc/pk", PkApiService.Client.Factory.class);
        hashMap.put("/rpc/hero_api", HeroApi.Client.Factory.class);
        hashMap.put("/rpc/course", CourseApiService.Client.Factory.class);
        hashMap.put("/rpc/user_book", UserBookService.Client.Factory.class);
        hashMap.put("/rpc/activity", UserActivityApiService.Client.Factory.class);
        hashMap.put("/rpc/bcz_report", BczReportApiService.Client.Factory.class);
        hashMap.put("/rpc/game", GameApiService.Client.Factory.class);
    }

    public l(String domain) {
        this.f16651a = domain;
    }

    public T a() throws Exception {
        Application a11 = pb.a.a();
        if (this.f16655e == null) {
            String d11 = i9.m.d();
            this.f16655e = d11;
            if (d11 == null && this.f16656f) {
                throw new IllegalStateException("token null :" + this.f16651a);
            }
        }
        String str = this.f16651a;
        String[] strArr = this.f16652b;
        if (strArr == null) {
            strArr = h.a().b(this.f16651a);
        }
        k kVar = new k(new a(str, strArr));
        j jVar = new j(kVar);
        b bVar = new b(a11);
        if (!TextUtils.isEmpty(this.f16655e)) {
            bVar.put("access_token", this.f16655e);
        }
        kVar.i(bVar);
        kVar.j(this.f16653c);
        int i11 = this.f16658h;
        if (i11 > 0) {
            kVar.setConnectTimeout(i11);
        }
        int i12 = this.f16657g;
        if (i12 > 0) {
            kVar.setReadTimeout(i12);
        }
        i iVar = this.f16654d;
        if (iVar != null) {
            kVar.k(iVar);
        }
        jVar.open();
        return (T) f16650i.get(this.f16651a).newInstance().getClient(new TCompactProtocol(jVar));
    }

    public l<T> b(int connectTimeout) {
        this.f16658h = connectTimeout;
        return this;
    }

    public l<T> c(int maxRetries) {
        this.f16653c = maxRetries;
        return this;
    }

    public l<T> d(int readTimeout) {
        this.f16657g = readTimeout;
        return this;
    }

    public l<T> e(boolean requireToken) {
        this.f16656f = requireToken;
        return this;
    }

    public l<T> f(i retryPolicy) {
        this.f16654d = retryPolicy;
        return this;
    }

    public l<T> g(String token) {
        this.f16655e = token;
        return this;
    }

    public l<T> h(String... urls) {
        this.f16652b = urls;
        return this;
    }
}
