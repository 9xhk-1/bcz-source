package com.baicizhan.main.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.databinding.DataBindingUtil;
import com.aigestudio.wheelpicker.WheelPicker;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.client.business.thrift.ThriftRequest;
import com.baicizhan.online.notify.NotifyService;
import com.baicizhan.online.notify.UserRemindInfo;
import com.jiongji.andriod.card.R;
import gi.a0;
import gs.f0;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import q9.x;
import qb0.g;
import qb0.h;
import wb0.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class EverydayNoticeSettingActivity extends BaseAppCompatActivity implements WheelPicker.a {

    /* renamed from: g, reason: collision with root package name */
    public static final String f17870g = "EverydayNoticeSettingActivity_TAG";

    /* renamed from: a, reason: collision with root package name */
    public f0 f17871a;

    /* renamed from: b, reason: collision with root package name */
    public va.f f17872b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17873c = false;

    /* renamed from: d, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f17874d = new f();

    /* renamed from: e, reason: collision with root package name */
    public ThriftRequest<NotifyService.Client, Integer> f17875e;

    /* renamed from: f, reason: collision with root package name */
    public h f17876f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            EverydayNoticeSettingActivity.this.finish();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            int visibility = EverydayNoticeSettingActivity.this.f17871a.f54846c.getVisibility();
            EverydayNoticeSettingActivity.this.f17871a.f54846c.setVisibility(visibility == 8 ? 0 : 8);
            EverydayNoticeSettingActivity.this.f17871a.f54849f.setSelected(visibility != 0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends g<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f17879a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f17880b;

        public c(final long val$timeMillis, final boolean val$enable) {
            this.f17879a = val$timeMillis;
            this.f17880b = val$enable;
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.c(EverydayNoticeSettingActivity.f17870g, "", e11);
            va.g.i(va.g.d(e11), 0);
            if (EverydayNoticeSettingActivity.this.f17872b != null) {
                EverydayNoticeSettingActivity.this.f17872b.dismiss();
            }
            EverydayNoticeSettingActivity.this.f17871a.f54851h.r(false, false);
        }

        @Override // qb0.c
        public void onNext(Boolean aBoolean) {
            if (this.f17879a > System.currentTimeMillis()) {
                a0.h(false);
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM月dd日 HH:mm", Locale.CHINA);
            if (EverydayNoticeSettingActivity.this.f17872b != null) {
                EverydayNoticeSettingActivity.this.f17872b.dismiss();
            }
            if (this.f17880b && !ai.d.c(EverydayNoticeSettingActivity.this)) {
                va.g.i("单词提醒开启，下次提醒时间是" + simpleDateFormat.format(new Date(this.f17879a)), 1);
            }
            if (EverydayNoticeSettingActivity.this.f17873c) {
                EverydayNoticeSettingActivity.this.f17873c = false;
                ai.d.f(EverydayNoticeSettingActivity.this);
            }
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements p<NotifyService.Client, rx.c<Boolean>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f17882a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f17883b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f17884c;

        public d(final boolean val$enable, final int val$minute, final int val$hour) {
            this.f17882a = val$enable;
            this.f17883b = val$minute;
            this.f17884c = val$hour;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<Boolean> call(NotifyService.Client client) {
            try {
                UserRemindInfo userRemindInfo = new UserRemindInfo();
                userRemindInfo.setEnable(this.f17882a);
                userRemindInfo.setMinute(this.f17883b);
                userRemindInfo.setHour(this.f17884c);
                client.set_remind_info(userRemindInfo);
                a0.g().k(EverydayNoticeSettingActivity.this.getApplicationContext(), this.f17882a);
                qb.c.i(EverydayNoticeSettingActivity.f17870g, "set Time %d, %d, %b", Integer.valueOf(this.f17884c), Integer.valueOf(this.f17883b), Boolean.valueOf(this.f17882a));
                return rx.c.M2(Boolean.TRUE);
            } catch (Throwable th2) {
                return rx.c.T1(th2);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends ThriftRequest<NotifyService.Client, Integer> {
        public e(String domain) {
            super(domain);
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(NotifyService.Client client) throws Exception {
            UserRemindInfo userRemindInfo = new UserRemindInfo();
            userRemindInfo.setEnable(false);
            client.set_remind_info(userRemindInfo);
            int currentItemPosition = EverydayNoticeSettingActivity.this.f17871a.f54845b.getCurrentItemPosition();
            int currentItemPosition2 = EverydayNoticeSettingActivity.this.f17871a.f54847d.getCurrentItemPosition() + 1;
            int currentItemPosition3 = EverydayNoticeSettingActivity.this.f17871a.f54848e.getCurrentItemPosition();
            int i11 = currentItemPosition2 + (currentItemPosition * 12);
            if (i11 >= 24) {
                i11 -= 24;
            }
            userRemindInfo.setHour(i11);
            userRemindInfo.setMinute(currentItemPosition3);
            return 0;
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(Integer result) {
            EverydayNoticeSettingActivity.this.f17872b.dismiss();
            a0.g().k(EverydayNoticeSettingActivity.this.getApplicationContext(), false);
            va.g.i("单词提醒已关闭", 0);
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        public void onError(Exception exception) {
            EverydayNoticeSettingActivity.this.f17872b.dismiss();
            EverydayNoticeSettingActivity.this.f17871a.f54851h.r(true, false);
            gi.e.v(EverydayNoticeSettingActivity.this, exception);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<EverydayNoticeSettingActivity> f17887a;

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            qb.c.b(EverydayNoticeSettingActivity.f17870g, "onCheckedChanged: " + isChecked, new Object[0]);
            EverydayNoticeSettingActivity everydayNoticeSettingActivity = this.f17887a.get();
            if (everydayNoticeSettingActivity == null) {
                return;
            }
            if (!isChecked) {
                everydayNoticeSettingActivity.P0();
                return;
            }
            if (everydayNoticeSettingActivity.f17872b == null) {
                everydayNoticeSettingActivity.f17872b = gi.e.c(everydayNoticeSettingActivity);
            }
            everydayNoticeSettingActivity.f17872b.show();
            everydayNoticeSettingActivity.f17873c = true;
            everydayNoticeSettingActivity.V0();
        }

        public f(EverydayNoticeSettingActivity activity) {
            this.f17887a = new WeakReference<>(activity);
        }
    }

    public static void U0(Context context) {
        context.startActivity(new Intent(context, (Class<?>) EverydayNoticeSettingActivity.class));
    }

    public final void P0() {
        this.f17872b.show();
        this.f17875e = new e("/rpc/notify");
        com.baicizhan.client.business.thrift.c.b().a(this.f17875e);
    }

    public final String Q0(int am_pm, int hour, int minute) {
        Object valueOf;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getString(am_pm == 0 ? R.string.setting_everyday_notice_am : R.string.setting_everyday_notice_pm));
        sb2.append(" ");
        sb2.append(hour);
        sb2.append(":");
        if (minute < 10) {
            valueOf = "0" + minute;
        } else {
            valueOf = Integer.valueOf(minute);
        }
        sb2.append(valueOf);
        return sb2.toString();
    }

    public final void R0() {
        this.f17871a.f54845b.setOnItemSelectedListener(this);
        ArrayList arrayList = new ArrayList(12);
        for (int i11 = 1; i11 <= 12; i11++) {
            arrayList.add(String.format(Locale.CHINA, "%d时", Integer.valueOf(i11)));
        }
        this.f17871a.f54847d.setData(arrayList);
        this.f17871a.f54847d.setOnItemSelectedListener(this);
        ArrayList arrayList2 = new ArrayList(60);
        for (int i12 = 0; i12 < 60; i12++) {
            arrayList2.add(String.format(Locale.CHINA, "%d分", Integer.valueOf(i12)));
        }
        this.f17871a.f54848e.setData(arrayList2);
        this.f17871a.f54848e.setOnItemSelectedListener(this);
        T0(a0.g().f());
        boolean e11 = a0.g().e();
        this.f17871a.f54851h.setChecked(e11);
        if (e11) {
            return;
        }
        qb.c.b(f17870g, "notice not set ", new Object[0]);
    }

    public final void S0(final int hour, final int minute) {
        long m11 = a0.m(hour, minute);
        h hVar = this.f17876f;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f17876f.unsubscribe();
        }
        a0.g().l(this, a0.m(hour, minute));
        boolean isChecked = this.f17871a.f54851h.isChecked();
        this.f17876f = com.baicizhan.client.business.thrift.p.b("/rpc/notify").s1(500L, TimeUnit.MILLISECONDS).b2(new d(isChecked, minute, hour)).w5(bc0.c.e()).I3(tb0.a.a()).r5(new c(m11, isChecked));
    }

    public final void T0(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        int i11 = calendar.get(11);
        if (i11 == 0) {
            i11 = 24;
        }
        int i12 = i11 > 12 ? 1 : 0;
        int i13 = i11 - (i12 * 12);
        int i14 = calendar.get(12);
        this.f17871a.f54847d.s(i13 - 1, false);
        this.f17871a.f54848e.s(i14, false);
        this.f17871a.f54845b.s(i12, false);
        this.f17871a.f54850g.setText(Q0(i12, i13, i14));
    }

    public final void V0() {
        int currentItemPosition = this.f17871a.f54845b.getCurrentItemPosition();
        int currentItemPosition2 = this.f17871a.f54847d.getCurrentItemPosition() + 1;
        int currentItemPosition3 = this.f17871a.f54848e.getCurrentItemPosition();
        this.f17871a.f54850g.setText(Q0(currentItemPosition, currentItemPosition2, currentItemPosition3));
        int i11 = currentItemPosition2 + (currentItemPosition * 12);
        if (i11 >= 24) {
            i11 -= 24;
        }
        S0(i11, currentItemPosition3);
    }

    @Override // com.aigestudio.wheelpicker.WheelPicker.a
    public void W(WheelPicker picker, Object data, int position) {
        qb.c.i(f17870g, "onItemSelected: %s [%d]", picker, Integer.valueOf(position));
        V0();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (x.r().c(this)) {
            return;
        }
        this.f17872b = gi.e.c(this);
        f0 f0Var = (f0) DataBindingUtil.setContentView(this, R.layout.activity_everyday_notice_setting);
        this.f17871a = f0Var;
        f0Var.j(new a());
        this.f17871a.f54849f.setOnClickListener(new b());
        R0();
        this.f17871a.f54851h.setOnCheckedChangeListener(this.f17874d);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
