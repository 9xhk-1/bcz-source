package le;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.main.activity.mytab.task.data.i;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final int f71172d = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final b f71173a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c f71174b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<i> f71175c;

    public a(@k b coinInfo, @k c exchange, @k List<i> tasks) {
        g0.p(coinInfo, "coinInfo");
        g0.p(exchange, "exchange");
        g0.p(tasks, "tasks");
        this.f71173a = coinInfo;
        this.f71174b = exchange;
        this.f71175c = tasks;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a e(a aVar, b bVar, c cVar, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bVar = aVar.f71173a;
        }
        if ((i11 & 2) != 0) {
            cVar = aVar.f71174b;
        }
        if ((i11 & 4) != 0) {
            list = aVar.f71175c;
        }
        return aVar.d(bVar, cVar, list);
    }

    @k
    public final b a() {
        return this.f71173a;
    }

    @k
    public final c b() {
        return this.f71174b;
    }

    @k
    public final List<i> c() {
        return this.f71175c;
    }

    @k
    public final a d(@k b coinInfo, @k c exchange, @k List<i> tasks) {
        g0.p(coinInfo, "coinInfo");
        g0.p(exchange, "exchange");
        g0.p(tasks, "tasks");
        return new a(coinInfo, exchange, tasks);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return g0.g(this.f71173a, aVar.f71173a) && g0.g(this.f71174b, aVar.f71174b) && g0.g(this.f71175c, aVar.f71175c);
    }

    @k
    public final b f() {
        return this.f71173a;
    }

    @k
    public final c g() {
        return this.f71174b;
    }

    @k
    public final List<i> h() {
        return this.f71175c;
    }

    public int hashCode() {
        return (((this.f71173a.hashCode() * 31) + this.f71174b.hashCode()) * 31) + this.f71175c.hashCode();
    }

    @k
    public String toString() {
        return "CreditTaskCenter(coinInfo=" + this.f71173a + ", exchange=" + this.f71174b + ", tasks=" + this.f71175c + j.f81007d;
    }
}
