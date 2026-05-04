package ch;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.main.activity.schedule_v2.mutimode.data.e;
import kotlin.jvm.internal.g0;
import kotlinx.coroutines.flow.o0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final m f8648a = new m();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static com.baicizhan.main.activity.schedule_v2.mutimode.data.e f8649b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final kotlinx.coroutines.flow.y<com.baicizhan.main.activity.schedule_v2.mutimode.data.e> f8650c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final kotlinx.coroutines.flow.i<com.baicizhan.main.activity.schedule_v2.mutimode.data.e> f8651d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f8652e;

    static {
        e.d dVar = e.d.f19308d;
        f8649b = dVar;
        kotlinx.coroutines.flow.y<com.baicizhan.main.activity.schedule_v2.mutimode.data.e> a11 = o0.a(dVar);
        f8650c = a11;
        f8651d = a11;
        f8652e = 8;
    }

    @m80.k
    public final com.baicizhan.main.activity.schedule_v2.mutimode.data.e a() {
        return f8649b;
    }

    @m80.k
    public final kotlinx.coroutines.flow.i<com.baicizhan.main.activity.schedule_v2.mutimode.data.e> b() {
        return f8651d;
    }

    public final void c(@m80.k com.baicizhan.main.activity.schedule_v2.mutimode.data.e value) {
        g0.p(value, "value");
        if (com.baicizhan.base.a.a(KotlinExtKt.getGlobalApplicationContext())) {
            value = e.d.f19308d;
        }
        f8650c.d(value);
        f8649b = value;
    }
}
