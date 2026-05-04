package oe;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.main.activity.schedule_v2.ScheduleType;
import javax.inject.Inject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@dv.a
/* loaded from: classes4.dex */
public final class b1 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f76848e = 8;

    /* renamed from: a, reason: collision with root package name */
    public ScheduleType f76849a;

    /* renamed from: b, reason: collision with root package name */
    public int f76850b = -1;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public String f76851c = "";

    /* renamed from: d, reason: collision with root package name */
    public boolean f76852d;

    @Inject
    public b1() {
    }

    public final boolean a() {
        return this.f76852d;
    }

    public final int b() {
        return this.f76850b;
    }

    @m80.k
    public final String c() {
        return this.f76851c;
    }

    @m80.k
    public final ScheduleType d() {
        ScheduleType scheduleType = this.f76849a;
        if (scheduleType != null) {
            return scheduleType;
        }
        kotlin.jvm.internal.g0.S("type");
        return null;
    }

    public final void e(boolean z11) {
        this.f76852d = z11;
    }

    public final void f(int i11) {
        this.f76850b = i11;
    }

    public final void g(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<set-?>");
        this.f76851c = str;
    }

    public final void h(@m80.k ScheduleType scheduleType) {
        kotlin.jvm.internal.g0.p(scheduleType, "<set-?>");
        this.f76849a = scheduleType;
    }
}
