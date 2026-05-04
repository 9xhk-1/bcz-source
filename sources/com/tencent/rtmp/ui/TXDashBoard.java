package com.tencent.rtmp.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.rtmp.TXLiveConstants;
import java.text.SimpleDateFormat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class TXDashBoard extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    protected TextView f44697a;

    /* renamed from: b, reason: collision with root package name */
    protected TextView f44698b;

    /* renamed from: c, reason: collision with root package name */
    protected ScrollView f44699c;

    /* renamed from: d, reason: collision with root package name */
    protected StringBuffer f44700d;

    /* renamed from: e, reason: collision with root package name */
    protected int f44701e;

    /* renamed from: f, reason: collision with root package name */
    private final SimpleDateFormat f44702f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f44703g;

    public TXDashBoard(Context context) {
        this(context, null);
    }

    private void b() {
        if (this.f44697a != null) {
            return;
        }
        this.f44697a = new TextView(getContext());
        this.f44698b = new TextView(getContext());
        this.f44699c = new ScrollView(getContext());
        this.f44697a.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f44697a.setTextColor(-49023);
        this.f44697a.setTypeface(Typeface.MONOSPACE);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        this.f44699c.setPadding(0, 10, 0, 0);
        this.f44699c.setLayoutParams(layoutParams);
        this.f44699c.setVerticalScrollBarEnabled(true);
        this.f44699c.setScrollbarFadingEnabled(true);
        this.f44698b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f44698b.setTextColor(-49023);
        this.f44699c.addView(this.f44698b);
        addView(this.f44697a);
        addView(this.f44699c);
        if (this.f44700d.length() <= 0) {
            this.f44700d.append("liteav sdk version:" + TXCCommonUtil.getSDKVersionStr() + "\n");
        }
        this.f44698b.setText(this.f44700d.toString());
    }

    public void a(int i11, int i12, int i13, int i14) {
        TextView textView = this.f44697a;
        if (textView != null) {
            textView.setPadding(i11, i12, i13, 0);
        }
        ScrollView scrollView = this.f44699c;
        if (scrollView != null) {
            scrollView.setPadding(i11, 0, i13, i14);
        }
    }

    public void setEventTextSize(float f11) {
        TextView textView = this.f44698b;
        if (textView != null) {
            textView.setTextSize(f11);
        }
    }

    public void setLogMsgLenLimit(int i11) {
        this.f44701e = i11;
    }

    public void setShowLevel(int i11) {
        if (i11 == 0) {
            TextView textView = this.f44697a;
            if (textView != null) {
                textView.setVisibility(4);
            }
            ScrollView scrollView = this.f44699c;
            if (scrollView != null) {
                scrollView.setVisibility(4);
            }
            setVisibility(4);
            return;
        }
        if (i11 != 1) {
            b();
            this.f44697a.setVisibility(0);
            this.f44699c.setVisibility(0);
            setVisibility(0);
            return;
        }
        b();
        this.f44697a.setVisibility(0);
        this.f44699c.setVisibility(4);
        setVisibility(0);
    }

    public void setStatusTextSize(float f11) {
        TextView textView = this.f44697a;
        if (textView != null) {
            textView.setTextSize(f11);
        }
    }

    public TXDashBoard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44700d = new StringBuffer("");
        this.f44701e = 3000;
        this.f44702f = new SimpleDateFormat("HH:mm:ss.SSS");
        this.f44703g = false;
        setOrientation(1);
        setVisibility(4);
    }

    public void a(CharSequence charSequence) {
        TextView textView = this.f44697a;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = "[" + this.f44702f.format(Long.valueOf(System.currentTimeMillis())) + "]" + str + "\n";
        if (this.f44700d.length() <= 0) {
            this.f44700d.append("liteav sdk version:" + TXCCommonUtil.getSDKVersionStr() + "\n");
        }
        while (this.f44700d.length() > this.f44701e) {
            int indexOf = this.f44700d.indexOf("\n");
            if (indexOf == 0) {
                indexOf = 1;
            }
            this.f44700d = this.f44700d.delete(0, indexOf);
        }
        StringBuffer stringBuffer = this.f44700d;
        stringBuffer.append(str2);
        this.f44700d = stringBuffer;
        TextView textView = this.f44698b;
        if (textView != null) {
            textView.setText(stringBuffer.toString());
        }
    }

    public void a(boolean z11) {
        this.f44703g = z11;
    }

    public void a() {
        this.f44700d.setLength(0);
        TextView textView = this.f44697a;
        if (textView != null) {
            textView.setText("");
        }
        TextView textView2 = this.f44698b;
        if (textView2 != null) {
            textView2.setText("");
        }
    }

    public void a(Bundle bundle, Bundle bundle2, int i11) {
        String string;
        ScrollView scrollView;
        TextView textView;
        TextView textView2;
        if (this.f44703g || i11 == 2011 || i11 == 2012) {
            return;
        }
        if (bundle != null && (textView2 = this.f44697a) != null) {
            textView2.setText(a(bundle));
        }
        if (this.f44700d.length() <= 0) {
            this.f44700d.append("liteav sdk version:" + TXCCommonUtil.getSDKVersionStr() + "\n");
        }
        if (bundle2 == null || (string = bundle2.getString(TXLiveConstants.EVT_DESCRIPTION)) == null || string.isEmpty()) {
            return;
        }
        a(i11, string);
        TextView textView3 = this.f44698b;
        if (textView3 != null) {
            textView3.setText(this.f44700d.toString());
        }
        if (getVisibility() != 0 || (scrollView = this.f44699c) == null || (textView = this.f44698b) == null) {
            return;
        }
        a(scrollView, textView);
    }

    public void a(int i11, String str) {
        if (i11 == 1020) {
            return;
        }
        String format = new SimpleDateFormat("HH:mm:ss.SSS").format(Long.valueOf(System.currentTimeMillis()));
        while (this.f44700d.length() > this.f44701e) {
            int indexOf = this.f44700d.indexOf("\n");
            if (indexOf == 0) {
                indexOf = 1;
            }
            this.f44700d = this.f44700d.delete(0, indexOf);
        }
        StringBuffer stringBuffer = this.f44700d;
        stringBuffer.append("\n[" + format + "]" + str);
        this.f44700d = stringBuffer;
    }

    public String a(Bundle bundle) {
        return String.format("%-16s %-16s %-16s\n%-12s %-12s %-12s %-12s\n%-14s %-14s %-14s\n%-16s %-16s", "CPU:" + bundle.getString(TXLiveConstants.NET_STATUS_CPU_USAGE), "RES:" + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_WIDTH) + "*" + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_HEIGHT), "SPD:" + bundle.getInt(TXLiveConstants.NET_STATUS_NET_SPEED) + "Kbps", "JIT:" + bundle.getInt(TXLiveConstants.NET_STATUS_NET_JITTER), "FPS:" + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_FPS), "GOP:" + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_GOP) + "s", "ARA:" + bundle.getInt(TXLiveConstants.NET_STATUS_AUDIO_BITRATE) + "Kbps", "QUE:" + bundle.getInt(TXLiveConstants.NET_STATUS_AUDIO_CACHE) + " | " + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_CACHE) + "," + bundle.getInt(TXLiveConstants.NET_STATUS_V_SUM_CACHE_SIZE) + "," + bundle.getInt(TXLiveConstants.NET_STATUS_V_DEC_CACHE_SIZE) + " | " + bundle.getInt(TXLiveConstants.NET_STATUS_AV_RECV_INTERVAL) + "," + bundle.getInt(TXLiveConstants.NET_STATUS_AV_PLAY_INTERVAL) + "," + String.format("%.1f", Float.valueOf(bundle.getFloat(TXLiveConstants.NET_STATUS_AUDIO_CACHE_THRESHOLD))).toString(), "VRA:" + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_BITRATE) + "Kbps", "DRP:" + bundle.getInt(TXLiveConstants.NET_STATUS_AUDIO_DROP) + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_DROP), "SVR:" + bundle.getString(TXLiveConstants.NET_STATUS_SERVER_IP), "AUDIO:" + bundle.getString(TXLiveConstants.NET_STATUS_AUDIO_INFO));
    }

    private void a(ScrollView scrollView, View view) {
        if (scrollView == null || view == null) {
            return;
        }
        int measuredHeight = view.getMeasuredHeight() - scrollView.getMeasuredHeight();
        if (measuredHeight < 0) {
            measuredHeight = 0;
        }
        scrollView.scrollTo(0, measuredHeight);
    }
}
