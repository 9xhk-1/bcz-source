package com.aigestudio.wheelpicker.widgets;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.aigestudio.wheelpicker.WheelPicker;
import com.aigestudio.wheelpicker.model.City;
import com.aigestudio.wheelpicker.model.Province;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class WheelAreaPicker extends LinearLayout implements w0.a {

    /* renamed from: k, reason: collision with root package name */
    public static final float f9853k = 18.0f;

    /* renamed from: l, reason: collision with root package name */
    public static final String f9854l = "#353535";

    /* renamed from: m, reason: collision with root package name */
    public static final int f9855m = 0;

    /* renamed from: a, reason: collision with root package name */
    public Context f9856a;

    /* renamed from: b, reason: collision with root package name */
    public List<Province> f9857b;

    /* renamed from: c, reason: collision with root package name */
    public List<City> f9858c;

    /* renamed from: d, reason: collision with root package name */
    public List<String> f9859d;

    /* renamed from: e, reason: collision with root package name */
    public List<String> f9860e;

    /* renamed from: f, reason: collision with root package name */
    public AssetManager f9861f;

    /* renamed from: g, reason: collision with root package name */
    public LinearLayout.LayoutParams f9862g;

    /* renamed from: h, reason: collision with root package name */
    public WheelPicker f9863h;

    /* renamed from: i, reason: collision with root package name */
    public WheelPicker f9864i;

    /* renamed from: j, reason: collision with root package name */
    public WheelPicker f9865j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements WheelPicker.a {
        public a() {
        }

        @Override // com.aigestudio.wheelpicker.WheelPicker.a
        public void W(WheelPicker picker, Object data, int position) {
            WheelAreaPicker wheelAreaPicker = WheelAreaPicker.this;
            wheelAreaPicker.f9858c = ((Province) wheelAreaPicker.f9857b.get(position)).getCity();
            WheelAreaPicker.this.setCityAndAreaData(position);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements WheelPicker.a {
        public b() {
        }

        @Override // com.aigestudio.wheelpicker.WheelPicker.a
        public void W(WheelPicker picker, Object data, int position) {
            WheelAreaPicker.this.f9865j.setData(((City) WheelAreaPicker.this.f9858c.get(position)).getArea());
        }
    }

    public WheelAreaPicker(Context context, AttributeSet attrs) {
        super(context, attrs);
        j();
        k(context);
        this.f9857b = i(this.f9861f);
        m();
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCityAndAreaData(int position) {
        this.f9858c = this.f9857b.get(position).getCity();
        this.f9860e.clear();
        Iterator<City> it = this.f9858c.iterator();
        while (it.hasNext()) {
            this.f9860e.add(it.next().getName());
        }
        this.f9864i.setData(this.f9860e);
        this.f9864i.setSelectedItemPosition(0);
        this.f9865j.setData(this.f9858c.get(0).getArea());
        this.f9865j.setSelectedItemPosition(0);
    }

    @Override // w0.a
    public void a() {
        removeViewAt(2);
    }

    public final void g() {
        this.f9863h.setOnItemSelectedListener(new a());
        this.f9864i.setOnItemSelectedListener(new b());
    }

    @Override // w0.a
    public String getArea() {
        return this.f9858c.get(this.f9864i.getCurrentItemPosition()).getArea().get(this.f9865j.getCurrentItemPosition());
    }

    @Override // w0.a
    public String getCity() {
        return this.f9858c.get(this.f9864i.getCurrentItemPosition()).getName();
    }

    @Override // w0.a
    public String getProvince() {
        return this.f9857b.get(this.f9863h.getCurrentItemPosition()).getName();
    }

    public final int h(Context context, float dpValue) {
        return (int) ((dpValue * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final List<Province> i(AssetManager assetManager) {
        Exception e11;
        List<Province> list;
        ObjectInputStream objectInputStream;
        try {
            objectInputStream = new ObjectInputStream(assetManager.open("RegionJsonData.dat"));
            list = (List) objectInputStream.readObject();
        } catch (Exception e12) {
            e11 = e12;
            list = null;
        }
        try {
            objectInputStream.close();
            return list;
        } catch (Exception e13) {
            e11 = e13;
            e11.printStackTrace();
            return list;
        }
    }

    public final void j() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.f9862g = layoutParams;
        layoutParams.setMargins(5, 5, 5, 5);
        this.f9862g.width = 0;
    }

    public final void k(Context context) {
        setOrientation(0);
        this.f9856a = context;
        this.f9861f = context.getAssets();
        this.f9859d = new ArrayList();
        this.f9860e = new ArrayList();
        this.f9863h = new WheelPicker(context);
        this.f9864i = new WheelPicker(context);
        this.f9865j = new WheelPicker(context);
        l(this.f9863h, 1.0f);
        l(this.f9864i, 1.5f);
        l(this.f9865j, 1.5f);
    }

    public final void l(WheelPicker wheelPicker, float weight) {
        this.f9862g.weight = weight;
        wheelPicker.setItemTextSize(h(this.f9856a, 18.0f));
        wheelPicker.setSelectedItemTextColor(Color.parseColor(f9854l));
        wheelPicker.setCurved(true);
        wheelPicker.setLayoutParams(this.f9862g);
        addView(wheelPicker);
    }

    public final void m() {
        Iterator<Province> it = this.f9857b.iterator();
        while (it.hasNext()) {
            this.f9859d.add(it.next().getName());
        }
        this.f9863h.setData(this.f9859d);
        setCityAndAreaData(0);
    }
}
