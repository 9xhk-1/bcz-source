package r;

import android.os.Bundle;
import com.huawei.hms.iap.entity.OrderStatusCode;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public String f82758a;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f82759b = new Bundle();

    /* renamed from: c, reason: collision with root package name */
    public Bundle f82760c = new Bundle();

    /* renamed from: d, reason: collision with root package name */
    public HashMap f82761d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public HashMap f82762e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public int f82763f;

    /* renamed from: g, reason: collision with root package name */
    public int f82764g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f82765a;

        /* renamed from: b, reason: collision with root package name */
        public Bundle f82766b = new Bundle();

        /* renamed from: c, reason: collision with root package name */
        public Bundle f82767c = new Bundle();

        /* renamed from: d, reason: collision with root package name */
        public HashMap f82768d = new HashMap();

        /* renamed from: e, reason: collision with root package name */
        public HashMap f82769e = new HashMap();

        /* renamed from: f, reason: collision with root package name */
        public int f82770f = 30000;

        /* renamed from: g, reason: collision with root package name */
        public int f82771g = OrderStatusCode.ORDER_STATE_CANCEL;
    }

    public c(a aVar) {
        this.f82758a = aVar.f82765a;
        this.f82759b.putAll(aVar.f82766b);
        this.f82760c.putAll(aVar.f82767c);
        this.f82761d.putAll(aVar.f82768d);
        this.f82762e.putAll(aVar.f82769e);
        this.f82763f = aVar.f82770f;
        this.f82764g = aVar.f82771g;
    }
}
