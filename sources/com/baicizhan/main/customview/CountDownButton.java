package com.baicizhan.main.customview;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class CountDownButton extends AppCompatButton {

    /* renamed from: a, reason: collision with root package name */
    public String f20001a;

    /* renamed from: b, reason: collision with root package name */
    public String f20002b;

    /* renamed from: c, reason: collision with root package name */
    public a f20003c;

    /* renamed from: d, reason: collision with root package name */
    public b f20004d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends Handler {

        /* renamed from: d, reason: collision with root package name */
        public static final int f20005d = 1000;

        /* renamed from: e, reason: collision with root package name */
        public static final int f20006e = 30;

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<CountDownButton> f20007a;

        /* renamed from: b, reason: collision with root package name */
        public int f20008b;

        /* renamed from: c, reason: collision with root package name */
        public int f20009c;

        public a(CountDownButton holder) {
            this(holder, 30);
        }

        public boolean a() {
            return this.f20008b > 0;
        }

        public void b() {
            this.f20008b = this.f20009c;
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            CountDownButton countDownButton = this.f20007a.get();
            if (countDownButton == null) {
                return;
            }
            int i11 = this.f20008b;
            if (i11 < 1000) {
                countDownButton.setEnabled(true);
                countDownButton.setText(countDownButton.f20001a);
                if (countDownButton.f20004d != null) {
                    countDownButton.f20004d.a(countDownButton);
                    return;
                }
                return;
            }
            int i12 = i11 / 1000;
            countDownButton.setEnabled(false);
            countDownButton.setText(String.format(Locale.US, countDownButton.f20002b, Integer.valueOf(i12)));
            if (countDownButton.f20004d != null) {
                countDownButton.f20004d.b(countDownButton, i12);
            }
            this.f20008b -= 1000;
            sendEmptyMessageDelayed(0, 1000L);
        }

        public a(CountDownButton holder, int secondCount) {
            this.f20007a = new WeakReference<>(holder);
            int i11 = secondCount * 1000;
            this.f20009c = i11;
            this.f20008b = i11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void a(CountDownButton button);

        void b(CountDownButton button, int remainSecond);
    }

    public CountDownButton(Context context) {
        super(context);
    }

    public void d() {
        a aVar = this.f20003c;
        if (aVar != null) {
            aVar.removeMessages(0);
        }
        setEnabled(true);
        setText(this.f20001a);
    }

    public boolean e() {
        a aVar = this.f20003c;
        return aVar != null && aVar.a();
    }

    public CountDownButton f(String format) {
        this.f20002b = format;
        return this;
    }

    public CountDownButton g(String text) {
        this.f20001a = text;
        return this;
    }

    public CountDownButton h(b listener) {
        this.f20004d = listener;
        return this;
    }

    public void i() {
        j(0);
    }

    public void j(int count) {
        a aVar = this.f20003c;
        if (aVar != null) {
            aVar.removeMessages(0);
        } else {
            this.f20003c = count > 0 ? new a(this, count) : new a(this);
        }
        this.f20003c.b();
        this.f20003c.sendEmptyMessage(0);
        setEnabled(false);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
    }

    public CountDownButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CountDownButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
