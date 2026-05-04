package md;

import android.app.Application;
import android.text.format.DateFormat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.baicizhan.online.user_study_api.CalendarResignInfo;
import com.baicizhan.online.user_study_api.DakaRescueInfo;
import com.baicizhan.online.user_study_api.UserStudyApiService;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import org.apache.thrift.transport.TTransportException;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nRepairViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairViewModel.kt\ncom/baicizhan/main/activity/calendar/repair/RepairViewModel\n+ 2 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n*L\n1#1,91:1\n35#2:92\n*S KotlinDebug\n*F\n+ 1 RepairViewModel.kt\ncom/baicizhan/main/activity/calendar/repair/RepairViewModel\n*L\n48#1:92\n*E\n"})
/* loaded from: classes4.dex */
public final class q extends AndroidViewModel {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final a f73136g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f73137h = 8;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final String f73138i = "RepairViewModel";

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<CalendarResignInfo> f73139a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final LiveData<CalendarResignInfo> f73140b;

    /* renamed from: c, reason: collision with root package name */
    public long f73141c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public String f73142d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<DakaRescueInfo> f73143e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public MutableLiveData<String> f73144f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(@m80.k Application application) {
        super(application);
        g0.p(application, "application");
        MutableLiveData<CalendarResignInfo> mutableLiveData = new MutableLiveData<>();
        this.f73139a = mutableLiveData;
        this.f73140b = mutableLiveData;
        this.f73142d = "";
        this.f73143e = new MutableLiveData<>();
        this.f73144f = new MutableLiveData<>();
    }

    public static final DakaRescueInfo m(q qVar, UserStudyApiService.Client client) {
        return client.daka_rescue_by_str(qVar.f73142d, qVar.f73141c);
    }

    public static final DakaRescueInfo n(x00.l lVar, Object obj) {
        return (DakaRescueInfo) lVar.invoke(obj);
    }

    public static final g2 o(q qVar, DakaRescueInfo dakaRescueInfo) {
        qVar.f73143e.postValue(dakaRescueInfo);
        return g2.f100423a;
    }

    public static final void p(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void q(q qVar, Throwable th2) {
        if (th2 instanceof TTransportException) {
            qVar.f73143e.postValue(new DakaRescueInfo(-1, "网络错误"));
        } else {
            qVar.f73143e.postValue(new DakaRescueInfo(-1, th2.getMessage()));
        }
    }

    @m80.k
    public final LiveData<CalendarResignInfo> g() {
        return this.f73140b;
    }

    @m80.k
    public final String h() {
        return this.f73142d;
    }

    @m80.k
    public final MutableLiveData<String> i() {
        return this.f73144f;
    }

    @m80.k
    public final MutableLiveData<DakaRescueInfo> j() {
        return this.f73143e;
    }

    public final long k() {
        return this.f73141c;
    }

    public final void l() {
        rx.c a11 = com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/user_study"));
        final x00.l lVar = new x00.l() { // from class: md.l
            @Override // x00.l
            public final Object invoke(Object obj) {
                DakaRescueInfo m11;
                m11 = q.m(q.this, (UserStudyApiService.Client) obj);
                return m11;
            }
        };
        rx.c I3 = a11.c3(new wb0.p() { // from class: md.m
            @Override // wb0.p
            public final Object call(Object obj) {
                DakaRescueInfo n11;
                n11 = q.n(x00.l.this, obj);
                return n11;
            }
        }).w5(bc0.c.e()).I3(tb0.a.a());
        final x00.l lVar2 = new x00.l() { // from class: md.n
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 o11;
                o11 = q.o(q.this, (DakaRescueInfo) obj);
                return o11;
            }
        };
        I3.u5(new wb0.b() { // from class: md.o
            @Override // wb0.b
            public final void call(Object obj) {
                q.p(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: md.p
            @Override // wb0.b
            public final void call(Object obj) {
                q.q(q.this, (Throwable) obj);
            }
        });
    }

    public final void r(@m80.k String str) {
        g0.p(str, "<set-?>");
        this.f73142d = str;
    }

    public final void s(@m80.k MutableLiveData<String> mutableLiveData) {
        g0.p(mutableLiveData, "<set-?>");
        this.f73144f = mutableLiveData;
    }

    public final void t(long j11) {
        this.f73141c = j11;
    }

    public final void u(@m80.k CalendarResignInfo info, @m80.k Calendar currentCalendar) {
        g0.p(info, "info");
        g0.p(currentCalendar, "currentCalendar");
        this.f73139a.setValue(info);
        CalendarResignInfo value = this.f73140b.getValue();
        if (value != null) {
            CalendarResignInfo calendarResignInfo = value;
            int i11 = calendarResignInfo.copper_hold;
            if (i11 >= 10000) {
                DecimalFormat decimalFormat = new DecimalFormat("#.00");
                int i12 = calendarResignInfo.copper_hold / 100;
                this.f73144f.setValue(decimalFormat.format(Float.valueOf(i12 / 100)) + "w");
            } else {
                this.f73144f.setValue(String.valueOf(i11));
            }
        }
        this.f73142d = DateFormat.format("yyyyMMdd", currentCalendar).toString();
        this.f73141c = (new GregorianCalendar().getTimeZone().getOffset(currentCalendar.getTimeInMillis()) / 60) / 1000;
        qb.c.i(f73138i, "select date is " + this.f73142d, new Object[0]);
        qb.c.i(f73138i, "current time zone is " + this.f73141c, new Object[0]);
    }
}
