package com.baicizhan.client.business.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import com.jiongji.andriod.card.R;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class EmailAutoCompleteEditText extends AppCompatEditText {

    /* renamed from: d, reason: collision with root package name */
    public static final String f17091d = "@";

    /* renamed from: e, reason: collision with root package name */
    public static final String f17092e = "qq.com";

    /* renamed from: f, reason: collision with root package name */
    public static final String f17093f = "qq.com";

    /* renamed from: g, reason: collision with root package name */
    public static final Map<String, String> f17094g;

    /* renamed from: a, reason: collision with root package name */
    public Paint f17095a;

    /* renamed from: b, reason: collision with root package name */
    public String f17096b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17097c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean hasFocus) {
            if (hasFocus) {
                return;
            }
            EmailAutoCompleteEditText emailAutoCompleteEditText = EmailAutoCompleteEditText.this;
            emailAutoCompleteEditText.append(emailAutoCompleteEditText.f17096b);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f17094g = hashMap;
        hashMap.put(f17091d, "qq.com");
        f(hashMap, "@qq.com");
        f(hashMap, "@163.com");
        f(hashMap, "@126.com");
        f(hashMap, "@sina.com");
        f(hashMap, "@gmail.com");
        f(hashMap, "@sohu.com");
        f(hashMap, "@hotmail.com");
        f(hashMap, "@google.com");
        f(hashMap, "@googlemail.com");
        f(hashMap, "@yahoo.com");
        f(hashMap, "@yahoo.com.cn");
        f(hashMap, "@yahoo.cn");
        f(hashMap, "@aol.com");
        f(hashMap, "@me.com");
        f(hashMap, "@msn.com");
        f(hashMap, "@live.com");
        f(hashMap, "@ymail.com");
        f(hashMap, "@mac.com");
        f(hashMap, "@rocketmail.com");
        f(hashMap, "@aim.com");
        f(hashMap, "@mail.com");
        f(hashMap, "@btinternet.com");
        f(hashMap, "@naver.com");
        f(hashMap, "@rogers.com");
        f(hashMap, "@juno.com");
        f(hashMap, "@walla.com");
        f(hashMap, "@139.com");
        f(hashMap, "@189.cn");
        f(hashMap, "@roadrunner.com");
        f(hashMap, "@embarqmail.com");
        f(hashMap, "@sky.com");
        f(hashMap, "@cfl.rr.com");
        f(hashMap, "@tampabay.rr.com");
        f(hashMap, "@gmx.com");
        f(hashMap, "@insightbb.com");
        f(hashMap, "@icloud.com");
        f(hashMap, "@frontier.com");
        f(hashMap, "@mindspring.com");
        f(hashMap, "@ail.com");
        f(hashMap, "@windowslive.com");
        f(hashMap, "@netzero.com");
        f(hashMap, "@mchsi.com");
        f(hashMap, "@excite.com");
        f(hashMap, "@ntlworld.com");
        f(hashMap, "@nate.com");
        f(hashMap, "@outlook.com");
        f(hashMap, "@nc.rr.com");
        f(hashMap, "@wi.rr.com");
        f(hashMap, "@rochester.rr.com");
        f(hashMap, "@cs.com");
        f(hashMap, "@proxymail.facebook.com");
        f(hashMap, "@austin.rr.com");
        f(hashMap, "@sogou.com");
        f(hashMap, "@nycap.rr.com");
        f(hashMap, "@bigpond.com");
        f(hashMap, "@ca.rr.com");
        f(hashMap, "@inbox.com");
        f(hashMap, "@hawaii.rr.com");
        f(hashMap, "@carolina.rr.com");
        f(hashMap, "@comcast.com");
        f(hashMap, "@live.cn");
        f(hashMap, "@san.rr.com");
        f(hashMap, "@rcn.com");
        f(hashMap, "@tx.rr.com");
        f(hashMap, "@wowway.com");
        f(hashMap, "@hoteltonight.com");
        f(hashMap, "@att.com");
        f(hashMap, "@cinci.rr.com");
    }

    public EmailAutoCompleteEditText(Context context) {
        super(context);
        this.f17096b = "";
        this.f17097c = false;
        g(null, 0);
    }

    public static void f(Map<String, String> map, String domain) {
        if (TextUtils.isEmpty(domain) || !domain.startsWith(f17091d) || map == null) {
            return;
        }
        int length = domain.length();
        int i11 = 0;
        while (i11 < length - 1) {
            int i12 = i11 + 2;
            String substring = domain.substring(0, i12);
            String substring2 = i11 >= length + (-2) ? "" : domain.substring(i12, length);
            if (!map.containsKey(substring)) {
                map.put(substring, substring2);
            }
            i11++;
        }
    }

    private void g(AttributeSet attrs, int defStyleRes) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, R.styleable.EmailAutoCompleteEditText, 0, defStyleRes);
        int color = obtainStyledAttributes.getColor(0, -7829368);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f17095a = paint;
        paint.setColor(color);
        this.f17095a.setAntiAlias(true);
        this.f17095a.setFilterBitmap(true);
        this.f17095a.setTextSize(getTextSize());
        addTextChangedListener(new a());
        setOnFocusChangeListener(new b());
    }

    public final void e(String suffix) {
        if (TextUtils.isEmpty(suffix)) {
            setCompoundDrawables(null, null, null, null);
            return;
        }
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = getHeight();
        if (width > 0 || height > 0) {
            Rect rect = new Rect();
            int lineBounds = (getLineBounds(0, rect) - rect.top) + ((height - rect.height()) / 2);
            int measureText = (int) (this.f17095a.measureText(suffix) + 1.0f);
            Bitmap createBitmap = Bitmap.createBitmap(measureText, height, Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawText(suffix, 0.0f, lineBounds, this.f17095a);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), createBitmap);
            int min = width - Math.min((int) this.f17095a.measureText(getText().toString()), width);
            int i11 = min > measureText ? measureText - min : 0;
            bitmapDrawable.setBounds(i11, 0, measureText + i11, height);
            setCompoundDrawables(null, null, bitmapDrawable, null);
        }
    }

    public String getTextToComplete() {
        Editable text = getText();
        return text != null ? text.append((CharSequence) this.f17096b).toString() : this.f17096b;
    }

    public EmailAutoCompleteEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f17096b = "";
        this.f17097c = false;
        g(attrs, 0);
    }

    public EmailAutoCompleteEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f17096b = "";
        this.f17097c = false;
        g(attrs, 0);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String obj = editable.toString();
            for (Map.Entry entry : EmailAutoCompleteEditText.f17094g.entrySet()) {
                if (obj.endsWith((String) entry.getKey())) {
                    EmailAutoCompleteEditText.this.e((String) entry.getValue());
                    EmailAutoCompleteEditText.this.f17096b = (String) entry.getValue();
                    return;
                }
            }
            if (TextUtils.isEmpty(obj) || obj.charAt(obj.length() - 1) != '@') {
                EmailAutoCompleteEditText.this.e("");
                EmailAutoCompleteEditText.this.f17096b = "";
            } else {
                EmailAutoCompleteEditText.this.e("qq.com");
                EmailAutoCompleteEditText.this.f17096b = "qq.com";
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s11, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s11, int start, int before, int count) {
        }
    }
}
